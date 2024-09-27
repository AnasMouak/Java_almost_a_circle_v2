package models;

import java.util.HashMap;
import java.util.Map;

public  class Square extends Rectangle {


    
    public Square(double side, int x, int y, Integer id) {
        super(side, side, x, y, id);
    }

    public Square(double side) {
        this(side, 0, 0, null);
    }

    public double getSide() {
        return this.getWidth();
    }

    public void setSide(double value) {
        this.setWidth(value);
        this.setHeight(value);
    }

    @Override
    public String toString() {
        return String.format("Square [id=%d, side=%.2f, x=%d, y=%d]", this.getId(), this.getSide(), this.getX(), this.getY());
    }

    public void update(Object ...args) {
        if (args.length == 1 && args[0] instanceof Map<?, ?>) {
            Map<?, ?> map = (Map<?, ?>) args[0];
    
            // Safely iterate through the map and verify key-value types
            for (Map.Entry<?, ?> entry : map.entrySet()) {
                if (!(entry.getKey() instanceof String)) {
                    throw new IllegalArgumentException("Invalid map key. All keys must be strings.");
                }
    
                String key = (String) entry.getKey();
                Object value = entry.getValue();
    
                switch (key) {
                    case "id":
                        if (value instanceof Integer) {
                            this.id = (Integer) value;
                        } else {
                            throw new IllegalArgumentException("Invalid type for 'id'. Expected Integer.");
                        }
                        break;
                    case "side":
                        if (value instanceof Double) {
                            this.setSide((Double) value);
                        } else {
                            throw new IllegalArgumentException("Invalid type for 'width'. Expected Double.");
                        }
                        break;
                    case "x":
                        if (value instanceof Integer) {
                            this.setX((Integer) value);
                        } else {
                            throw new IllegalArgumentException("Invalid type for 'x'. Expected Integer.");
                        }
                        break;
                    case "y":
                        if (value instanceof Integer) {
                            this.setY((Integer) value);
                        } else {
                            throw new IllegalArgumentException("Invalid type for 'y'. Expected Integer.");
                        }
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown attribute: " + key);
                }
            }
        } else {
            // Handle positional arguments as before
            if (args.length >= 1) {
                this.id = (Integer) args[0];
            }
            if (args.length >= 2) {
                this.setSide((Double) args[1]);
            }
            if (args.length >= 3) {
                this.setX((Integer) args[2]);
            }
            if (args.length >= 4) {
                this.setY((Integer) args[3]);
            }
        }
    }

    public Map<String, Object> toDict() {
        Map<String, Object> dict = new HashMap<>();
        dict.put("id", this.id);
        dict.put("side", this.getSide());
        dict.put("x", this.getX());
        dict.put("y", this.getY());
        return dict;
    }
    
}
