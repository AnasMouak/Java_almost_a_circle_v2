package anas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FiftheenMain {
    public static void main(String[] args) {
        // Create the input list of dictionaries (maps in Java)
        List<Map<String, Object>> listInput = new ArrayList<>();

        // Add dictionaries to the list
        Map<String, Object> rect1 = new HashMap<>();
        rect1.put("id", 89);
        rect1.put("width", 10);
        rect1.put("height", 4);

        Map<String, Object> rect2 = new HashMap<>();
        rect2.put("id", 7);
        rect2.put("width", 1);
        rect2.put("height", 7);

        listInput.add(rect1);
        listInput.add(rect2);

        ObjectMapper mapper = new ObjectMapper();

        try {
            // Convert the list of maps to JSON string
            String jsonListInput = mapper.writeValueAsString(listInput);

            // Convert the JSON string back to a list of maps
            List<Map<String, Object>> listOutput = mapper.readValue(jsonListInput, new TypeReference<List<Map<String, Object>>>() {});

            // Print the results
            System.out.println("[" + listInput.getClass().getSimpleName() + "] " + listInput);
            System.out.println("[" + jsonListInput.getClass().getSimpleName() + "] " + jsonListInput);
            System.out.println("[" + listOutput.getClass().getSimpleName() + "] " + listOutput);

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
