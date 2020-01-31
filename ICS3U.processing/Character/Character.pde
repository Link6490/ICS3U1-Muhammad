final int SIZE_FACTOR = 100;
final int STEP_SIZE = 15;
boolean isOpening = true;
boolean colour = false;
float mouthAngle = 0;
float mouthChange = TWO_PI/10000;
float minY;
float maxY;
float minX;
float maxX;
int xLoc;
int yLoc;
int xDirection = 1;
int yDirection = 0;
void setup() {
  size (1200, 800);
  frameRate(60);
  xLoc= width/2;
  yLoc = height/2;
}
void draw() { //Drawing character, hat , teleporter etc
  stroke(1);
  drawBackground();
  misc();
  drawHat();
  rotator();
  teleporter();
}


void drawBackground() { //Draws background
  background(0);
}
void keyPressed() { //When "keypressed" it moves the character
  switch (keyCode) {
  case UP:
    moveUp();
    xDirection = 0;
    yDirection = -1;
    break;
  case DOWN:
    moveDown();
    xDirection = 0;
    yDirection = 1;
    break;
  case LEFT:
    moveLeft();
    xDirection = -1;
    yDirection = 0;
    break;
  case RIGHT:
    moveRight();
    xDirection = 1;
    yDirection = 0;
    break;
  }
}
void drawHat() { //Drawing the hat
  noStroke();
  fill(255, 0, 255);
  rect(xLoc - SIZE_FACTOR, yLoc - SIZE_FACTOR*0.6, SIZE_FACTOR *2, SIZE_FACTOR*0.15);
  rect(xLoc-SIZE_FACTOR*0.5, yLoc - SIZE_FACTOR, SIZE_FACTOR, SIZE_FACTOR*0.5);
}
void rotator() { //Method for rotating pacman whichever way he moves
  fill(255, 255, 0);
  for ( int a=-1; a < 10; a++) {
    for ( int b=-1; b < 10; b++) {
      pushMatrix();
      translate(xLoc + (a * width), yLoc + (b * height));
      if ( xDirection == -1) { 
        rotate(PI);
      }
      if ( yDirection == 1) { 
        rotate(HALF_PI);
      }
      if ( yDirection == -1) { 
        rotate( PI + HALF_PI );
      }
      if (isOpening == true) { //Code for opening and closing pacmans mouth
        mouthAngle += mouthChange;
      } else {
        mouthAngle -= mouthChange;
      }
      if (mouthAngle >= TWO_PI/8 || mouthAngle <= 0) isOpening = !isOpening;
      arc(0, 0, SIZE_FACTOR, SIZE_FACTOR, 0+mouthAngle, TWO_PI-mouthAngle);
      popMatrix();
    }
  }
}



void moveRight() { //Move right method; Only moves when maxY is smaller than 1200
  maxX = xLoc + SIZE_FACTOR;
  if (maxX < 1200) {
    xLoc = xLoc + STEP_SIZE;
  }
}

void moveLeft() { //Move left method; Only moves when maxY is more than 0
  minX = xLoc - SIZE_FACTOR;
  if (minX > 0) {
    xLoc = xLoc - STEP_SIZE;
  }
} 

void moveUp() { //Move up method; Only moves when maxY is more than 0
  minY = yLoc - SIZE_FACTOR;
  if (minY > 0) {
    yLoc = yLoc - STEP_SIZE;
  }
}

void moveDown() { //Move doawn method; Only moves when maxY is smaller than 800
  maxY = yLoc + SIZE_FACTOR*0.55;
  if (maxY < 800) {
    yLoc = yLoc + STEP_SIZE;
  }
}
void misc() { //Just adding in some background detail
  fill(255, 0, 0);
  quad(width/4, height/2, width/4, 800, height/2, 800, 400, 200);
  fill(0, 255, 0);
  quad(width/2, height/2, width/4, 800, height/2, 800, 400, 200);
  fill(0, 0, 255);
  quad(600, 400, 600, 800, height/2, 800, 400, 600);
  fill(155, 156, 134);
  rect(1000, 600, 900, 600);
  fill(0, 255, 0);
  ellipse(0, 0, 150, 150);
  fill(0, 0, 255);
  ellipse(1200, 0, 150, 150);
}
void teleporter() { //Adding the teleporting code
  if (xLoc > 900 && yLoc > 600) {
    xLoc = width/2;
    yLoc = height/2;
  }
}
