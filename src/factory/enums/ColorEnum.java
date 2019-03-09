package factory.enums;


import factory.entity.color.Blue;
import factory.entity.color.Color;
import factory.entity.color.Green;
import factory.entity.color.Red;

public enum ColorEnum {
    RED(new Red(),"RED"),
    BLUE(new Blue(),"BLUE"),
    GREEN(new Green(),"GREEN");

    // 成员变量
    private Color color;
    private String name;

    // 普通方法
    public static Color getColor(String name) {
        for (ColorEnum c : ColorEnum.values()) {
            if (c.name == name) {
                return c.color;
            }
        }
        return null;
    }

    private ColorEnum(Color color, String name){
        this.color = color;
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
