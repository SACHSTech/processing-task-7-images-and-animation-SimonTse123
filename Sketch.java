import processing.core.PApplet;
import processing.core.PImage;


public class Sketch extends PApplet {

  PImage imgBackground;
  PImage imgPegasus;
  PImage imgPeter;

  float fltBackgroundX = 0;
  float fltBackgroundY = 0;

  float fltPegasusX = 0;
  float fltPegasusY = 0;

  float fltCircleX = width / 2;
  float fltCircleY = height / 2;

  float fltPeterX = 0;
  float fltPeterY = 0;

  float fltSpeedXP = 4;
  float fltSpeedYP = 2;

  float fltSpeedXC = 2;
  float fltSpeedYC = 4;


 

  float fltAngle = 0;
  

 

  public void settings() {
    // put your size call here
    size(512, 512);
  }

  public void setup() {
    imgBackground = loadImage("Background.jpg");
    imgBackground.resize(width, height);

    imgPegasus = loadImage("Pegasus.png");
    imgPegasus.resize(width / 10,height / 10);

    imgPeter = loadImage("Peterpan.png");
    imgPeter.resize(width / 8, height / 8);

    background(imgBackground);
  }


  public void draw() {
    background(imgBackground);

    image(imgPegasus, fltPegasusX, fltPegasusY);
    fltPegasusX += fltSpeedXP;
    fltPegasusY += fltSpeedYP;

    if(fltPegasusX < 0 || fltPegasusX > width - 50){
      fltSpeedXP *= -1;
    }
    if(fltPegasusY < 0 || fltPegasusY > height - 50){
      fltSpeedYP *= -1;
    }
    fill(245, 66, 138);
    ellipse(fltCircleX, fltCircleY, 50, 50);
    fltCircleX += fltSpeedXC;
    fltCircleY += fltSpeedYC;

    if(fltCircleX < 25 || fltCircleX > width - 25){
      fltSpeedXC *= -1;
    }
    if(fltCircleY < 25 || fltCircleY > height - 25){
      fltSpeedYC *= -1;
    }
    
    image(imgPeter, fltPeterX, fltPeterY);
    fltPeterX = cos(fltAngle) * 50 + 256;
    fltPeterY = sin(fltAngle) * 50 + 200;
    fltAngle -= 0.05f;


  }
}