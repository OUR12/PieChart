package com.chart3;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.awt.image.BufferedImage;

@Service
public class ChartService {

    public BufferedImage generatePieChart() {
        // Creating the dataset
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Category 1", 70);
        dataset.setValue("Category B", 10);
        dataset.setValue("Category C", 5);

        // Creating the pie chart with a 3D effect
        JFreeChart pieChart = ChartFactory.createPieChart3D(
                "Summary",
                dataset,
                true,
                true,
                false);

        // Customizing the pie chart
        PiePlot3D plot = (PiePlot3D) pieChart.getPlot();
        plot.setStartAngle(0);
        plot.setForegroundAlpha(0.6f);
        plot.setBackgroundPaint(null);
        plot.setInteriorGap(0.04);

        // You can add your fav colors(rgb)
        plot.setSectionPaint("Category 1", new Color(255, 215, 0));
        plot.setSectionPaint("Category B", new Color(255, 69, 96));
        plot.setSectionPaint("Category C", new Color(0, 227, 150));
        plot.setSectionPaint("Category D", new Color(244, 67, 54));

        // Label settings
        plot.setLabelFont(new Font("Product Sans", Font.BOLD, 12));
        plot.setLabelLinkPaint(Color.green);
        plot.setLabelOutlinePaint(null);
        plot.setOutlinePaint(null);
        plot.setLabelShadowPaint(null);
        plot.setLabelBackgroundPaint(null);
        plot.setLabelPaint(Color.green);
        plot.setLabelGenerator(new org.jfree.chart.labels.StandardPieSectionLabelGenerator("{0} ({2})"));

        pieChart.getTitle().setFont(new Font("Product Sans", Font.BOLD, 18));
        pieChart.getTitle().setMargin(10, 0, 0, 0);

        pieChart.setBackgroundPaint(null);
        pieChart.getTitle().setPaint(Color.green);

        pieChart.getLegend().setItemFont(new Font("Product Sans", Font.BOLD, 14));
        pieChart.getLegend().setBorder(0, 0, 0, 0);
        pieChart.getLegend().setPadding(new org.jfree.ui.RectangleInsets(10, 10, 10, 10));

        return pieChart.createBufferedImage(700, 500);
    }
}
