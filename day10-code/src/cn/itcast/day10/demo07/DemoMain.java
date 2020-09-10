package cn.itcast.day10.demo07;

public class DemoMain {

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.powerOff();
        computer.powerOn();


        USB usbMouse = new Mouse();
        computer.useDevice(usbMouse);

        Keyboard keyboard = new Keyboard();
        computer.useDevice(keyboard);

        method(10.0);

        method(10);
    }

    public static void method(double num) {
        System.out.println(num);
    }
}
