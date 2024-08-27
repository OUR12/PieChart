package com.chart3;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Base64;

@Controller
public class DashboardController {

    @Autowired
    private ChartService chartService;

    @GetMapping("/dashboard")
    public String getDashboard(Model model) throws IOException {
        BufferedImage chartImage = chartService.generatePieChart();

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ImageIO.write(chartImage, "png", baos);
        String base64Image = Base64.getEncoder().encodeToString(baos.toByteArray());

        model.addAttribute("chart", base64Image);
        return "dashboard";
    }
}
