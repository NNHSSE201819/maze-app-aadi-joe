public class Square
{


    private int type;
    // 0 = open, 1 = wall, 2 = entrance, 3 = exit
    private int row;
    private int col;
    private int explored;
    // -1 = DNE, 0 = blank, 1 = on list, 2 = explored, 3 = on path

    //constructor
    public Square(int row, int col, int type)
    {
        this.row = row;
        this.col = col;
        this.type = type;
        if (this.type == 0)
        {
            this.explored = 0;
        }
        else
        {
            this.explored = -1;
        }
    }

    public void setType(int type)
    {
        this.type = type;
    }

    public void setRow(int row)
    {
        this.row = row;
    }

    public void setCol(int col)
    {
        this.col = col;
    }

    //returns row
    public int getRow()
    {
        return this.row;
    }

    //returns column
    public int getCol()
    {
        return this.col;
    }

    //returns type
    public int getType()
    {
        return this.type;
    }

    public void reset()
    {
        if (this.type == 0)
        {
            this.explored = 0;
        }
        else
        {
            this.explored = -1;
        }
    }

    public int getExplored()
    {
        return this.explored;
    }

    //returns string
    public String toString()
    {
        if (this.type == 0)
        {
            return "_";
        }
        else if (this.type == 1)
        {
            return "#";
        }
        else if (this.type == 2)
        {
            return "S";
        }
        else if (this.type == 3)
        {
            return "E";
        }
        else return "Incorrect Type, not in range";
    }
}
