final int SIZE_FACTOR = 100;
int x;
int y;
int value;
int sum;
int sum2;
int totalSum;
void setup() {
  size (800,600); //Size is 800 by 600
  x = width/2;
  y = height/2;
  value = (int) (Math.random() * 6) + 1;
  background(0);
}

void draw() { //Calls Rectangle method
  drawRect();
  rectMode(CENTER);
  fill(255);

}  
void drawRect() { //Drawing button
  rect(x,y + 300, 300,100);
}
void mouseClicked() { //MouseClicked for only in the specific area where the "Button" is
  if (mouseX < x + 150  && mouseX > x -150 && mouseY < y + 300 + 50 && mouseY > y + 300 - 50 ) {
    drawDie1(x - SIZE_FACTOR * 2, y, (int) (Math.random() * 6) + 1);
    drawDie2(x + SIZE_FACTOR * 2, y, (int) (Math.random() * 6) + 1);
    totalSum = sum + sum2;
    System.out.println(totalSum);
}
}
void drawDie1(int x, int y, int value) { //int x is x location of die circle, int y is y location of circle
  rectMode(CENTER);
  fill(0,0,255);
  rect(x,y,200,200);
  fill(255);
  value = (int) (Math.random() * 6) + 1; //Setting value to be from 1-6

switch(value) { //Switch case for drawing random die face from 1-6
case 1:
  ellipse (x,y,40,40);
  sum = 1;
  break;  
case 2:
  ellipse (x+50,y+50,35,35);
  ellipse (x-50,y-50,35,35);
  sum = 2;
  break;
case 3:
  ellipse (x+50,y+50,35,35);
  ellipse (x-50,y-50,35,35);
  ellipse (x,y,35,35);
  sum = 3;
  break;
case 4:
  ellipse (x+50,y+50,35,35);
  ellipse (x-50,y-50,35,35);
  ellipse (x+50,y-50,35,35);
  ellipse (x-50,y+50,35,35);
  sum = 4;
  break;
case 5:
  ellipse (x+50,y+50,35,35);
  ellipse (x-50,y-50,35,35);
  ellipse (x+50,y-50,35,35);
  ellipse (x-50,y+50,35,35);
  ellipse (x,y,35,35);
  sum = 5;
  break;
case 6:
  ellipse (x+50,y+50,35,35);
  ellipse (x-50,y-50,35,35);
  ellipse (x-50,y+50,35,35);
  ellipse (x+50,y-50,35,35);
  ellipse (x+50,y,35,35);
  ellipse (x-50,y,35,35);
  sum = 6;
  break; 
}
}
void drawDie2(int x, int y, int value) { //int x is x location of die circle, int y is y location of circle
  rectMode(CENTER);
  fill(0,0,255);
  rect(x,y,200,200);
  fill(255);
  value = (int) (Math.random() * 6) + 1; //Setting value to be from 1-6

switch(value) { //Switch case for drawing random die face from 1-6
case 1:
  ellipse (x,y,40,40);
  sum2 = 1;
  break;  
case 2:
  ellipse (x+50,y+50,35,35);
  ellipse (x-50,y-50,35,35);
  sum2 = 2;
  break;
case 3:
  ellipse (x+50,y+50,35,35);
  ellipse (x-50,y-50,35,35);
  ellipse (x,y,35,35);
  sum2 = 3;
  break;
case 4:
  ellipse (x+50,y+50,35,35);
  ellipse (x-50,y-50,35,35);
  ellipse (x+50,y-50,35,35);
  ellipse (x-50,y+50,35,35);
  sum2 = 4;
  break;
case 5:
  ellipse (x+50,y+50,35,35);
  ellipse (x-50,y-50,35,35);
  ellipse (x+50,y-50,35,35);
  ellipse (x-50,y+50,35,35);
  ellipse (x,y,35,35);
  sum2 = 5;
  break;
case 6:
  ellipse (x+50,y+50,35,35);
  ellipse (x-50,y-50,35,35);
  ellipse (x-50,y+50,35,35);
  ellipse (x+50,y-50,35,35);
  ellipse (x+50,y,35,35);
  ellipse (x-50,y,35,35);
  sum2 = 6;
  break; 
}
}
