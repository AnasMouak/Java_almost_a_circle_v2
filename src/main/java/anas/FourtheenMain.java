package anas;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import models.Rectangle;

public class FourtheenMain {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10.0, 7.0, 2, 8, null);
        Rectangle r2 = new Rectangle(2, 4);
        
        List<Rectangle> rectangles = Arrays.asList(r1, r2);
        Rectangle.saveToFile(rectangles);

        // Print the contents of the saved file
        try {
            String json = new String(Files.readAllBytes(Paths.get("Rectangle.json")), StandardCharsets.UTF_8);
            System.out.println(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
