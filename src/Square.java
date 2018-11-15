public class Square
{

    private Square previous;
    private int type;
    // 0 = open, 1 = wall, 2 = entrance, 3 = exit,
    private int row;
    private int col;
    private int explored;
    // -1 = DNE, 0 = blank, 1 = on list, 2 = explored, 3 = on path

    //constructor
    public Square(int row, int col, int type)
    {
        this.previous = null;
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

    public void setPrevious(Square s){this.previous = s;}

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



    //returns string
    public String toString()
    {
        if (this.type == 0)
        {
            if(this.explored == 1)
            {
                return "0";
            }
            if(this.explored == 2)
            {
                return ".";
            }
            else if(this.explored == 3)
            {
                return "x";
            }
            else
            {
                return "_";
            }

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

    @Override
    public boolean equals(Object o)
    {

        Square s = (Square)o;
        boolean r = this.row == s.getRow();
        boolean c = this.col == s.getCol();
        boolean t = this.type == s.getType();
        if(r && c && r)
        {
            if(r == false)
            {
                return false;
            }
            else
            {
                return true;
            }

        }
        else
        {
            return false;
        }
    }

    public int getExplored() {
        return explored;
    }

    public void setExplored(int explored) {
        this.explored = explored;
    }

    public Square getPrevious() {
        return previous;
    }
}
