package com.example.physicsenginev_0_1;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class World {
    //Define la región visible en la ventana, definido por las coordenadas de la
    //esquina izquierda superior (xMin/yMax) y un factor de escala
    private final double xMin = -5.0; //metros
    private final double yMax = 8.0; //metros
    private final double scale =  50.0; //pixel/metro

    public static final double g = 9.81;

    private static World world = null;
    public static World getInstance() {
        if (world == null)
            world = new World();
        return world;
    }


    //Agrega objetos al mundo de simulación
    public void create() {


    }

    private GraphicsContext gc = null;

    public void setGraphicsContext(GraphicsContext gc) {
        this.gc = gc;
    }

    public void drawCircle(double xCenter, double yCenter, double r, Color color) {
        double xPixel = toPixelX(xCenter);
        double yPixel = toPixelY(yCenter);
        double rPixel = scale*r;
        gc.setFill(color);
        gc.fillOval(xPixel-rPixel, yPixel-rPixel, 2*rPixel, 2*rPixel);
    }

    public void drawRectangle(double xCenter, double yCenter, double w, double h, Color color) {
        double xPixel = toPixelX(xCenter);
        double yPixel = toPixelY(yCenter);
        double wPixel = 50 * w;
        double hPixel = 50 * h;
        gc.setFill(color);
        gc.fillRoundRect(xPixel - wPixel, yPixel- wPixel, wPixel, hPixel, 10, 10);
    }

    private double toPixelX(double x) {
        return scale*(x-xMin);
    }

    private double toPixelY(double y) {
        return scale*(yMax-y);
    }

    //simulación de un periodo de tiempo, avanza el tiempo deltaT
    public void run(double t, double deltaT) {
        drawRectangle((t-(int)t), 1, 0.5, 0.5, Color.CADETBLUE);

        drawCircle((t-(int)t),2, 0.5, Color.CADETBLUE);
    }


    //projectile motion, with and without air resistance;




}
