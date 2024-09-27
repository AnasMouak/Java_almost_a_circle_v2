package models;

import java.util.HashMap;
import java.util.Map;

public class Rectangle extends Base {
    private double width;
    private double height;
    private int x;
    private int y;

    public Rectangle(double width, double height, int x , int y, Integer id) {
        super(id);
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
    }

    public Rectangle(double width, double height) {
        this(width, height, 0, 0, null);
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double value) {
        if (value < 0) {
            throw new IllegalArgumentException("Width must be positive");
        }
        this.width = value;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double value) {
        if (value < 0) {
            throw new IllegalArgumentException("Height must be positive");
        }
        this.height = value;
    }
    
    public int getX() {
        return this.x;
    }

    public void setX(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("X must be positive");
        }
        this.x = value;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Y must be positive");
        }
        this.y = value;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public void Display() {
        if (this.width == 0 || this.height == 0) {
            System.out.println();
        }

        for (int i = 0; i < this.y; i++) {
            System.out.println();
        }
        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.x; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < this.width; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return "Rectangle: width=" + this.width + ", height=" + this.height + ", x=" + this.x + ", y=" + this.y + ", id=" + this.getId();
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
                    case "width":
                        if (value instanceof Double) {
                            this.width = (Double) value;
                        } else {
                            throw new IllegalArgumentException("Invalid type for 'width'. Expected Double.");
                        }
                        break;
                    case "height":
                        if (value instanceof Double) {
                            this.height = (Double) value;
                        } else {
                            throw new IllegalArgumentException("Invalid type for 'height'. Expected Double.");
                        }
                        break;
                    case "x":
                        if (value instanceof Integer) {
                            this.x = (Integer) value;
                        } else {
                            throw new IllegalArgumentException("Invalid type for 'x'. Expected Integer.");
                        }
                        break;
                    case "y":
                        if (value instanceof Integer) {
                            this.y = (Integer) value;
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
                this.width = (Double) args[1];
            }
            if (args.length >= 3) {
                this.height = (Double) args[2];
            }
            if (args.length >= 4) {
                this.x = (Integer) args[3];
            }
            if (args.length >= 5) {
                this.y = (Integer) args[4];
            }
        }
    }

    public Map<String, Object> toDict() {
        Map<String, Object> dict = new HashMap<>();
        dict.put("id", this.id);
        dict.put("width", this.width);
        dict.put("height", this.height);
        dict.put("x", this.x);
        dict.put("y", this.y);
        return dict;
    }
}
