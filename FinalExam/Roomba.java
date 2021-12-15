
   enum Direction {
    UP,
    DOWN,
    LEFT,
    RIGHT
}
public class Roomba implements iRobot {
    private  int [][] room;
    int curRow;
    int curCol;
    Direction dir;

    public Roomba( int [][] room) {

        this.room = room;
        this.dir=Direction.DOWN;
        this.curRow=0;
        this.curCol=0;
    }

    @Override
    public boolean move() {
        int oriRow=curRow;
        int oriCol=curCol;
        switch (this.dir) {
            case  UP:
                curRow--;
                break;
            case  DOWN:
                curRow++;
                break;
            case  LEFT:
                curCol--;
                break;
            case RIGHT:
                curCol++;
                break;
        }
        if (curRow<0 || curCol<0 || curRow >=room.length ||curCol >=room[0].length || room[curRow][curCol]==-1) {
            curRow=oriRow;
            curCol=oriCol;
            return false;
        }
        return true;
  }

    @Override
    public void turnLeft() {
        switch (this.dir) {
            case  UP:
                 dir=Direction.LEFT;
                break;
            case  DOWN:
                dir=Direction.RIGHT;
                break;
            case  LEFT:
                dir=Direction.DOWN;
                break;
            case RIGHT:
                dir=Direction.UP;
                break;
        }
    }

    @Override
    public void turnRight() {
        switch (this.dir) {
            case  UP:
                dir=Direction.RIGHT;
                break;
            case  DOWN:
                dir=Direction.LEFT;
                break;
            case  LEFT:
                dir=Direction.UP;
                break;
            case RIGHT:
                dir=Direction.DOWN;
                break;
        }
    }

    @Override
    public void clean() {
        if (room[curRow][curCol]==-1)
            return;
        else if (room[curRow][curCol]==0)
            room[curRow][curCol]=1;
    }

}
