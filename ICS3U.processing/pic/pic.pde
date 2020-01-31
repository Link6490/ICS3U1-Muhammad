void setup() {
   size(600, 400);
   int x = width/2;
   int y = height/2;
   int diam = 200;
   boolean red = true;
   boolean blue = false;
   boolean green = false;
  frameRate(30);
  background(0,255,255);
 fill(255,0,0);
  stroke(0);
  strokeWeight(5);
  ellipse(x, y, diam, diam); 
   
  noStroke();
  fill(255);
  strokeWeight(5);
  arc(x,y,diam,diam,0,PI); 
   fill(0);
   rect(200,200,200,20);
   ellipse(300,210, 50, 50); 
   fill(255);
   ellipse(300,210, 20, 20); 
   fill(146,49,24);
   stroke(1);
   rect(75,100,50,500);
   fill(0,255,0);
   ellipse(100,100,150,150);
   fill(255,255,0);
   ellipse(575,25,150,150);
   fill(0,255,0);
   rect(0,350,600,50);
 
  }
