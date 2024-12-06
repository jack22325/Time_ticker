public class Time
{
    //Instance variables for each portion of time//
    private int hour;
    private int minute;
    private int second;

    //Constructor that initializes each instance variable to the parameters//
    public Time(int hour, int minute, int second)
    {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    //Adds a second to the time and resets whenever an entire minute or hour passes//
    public void tick()
    {
        if(second==59)
        {
            second=0;
            if(minute==59)
            {
                minute=0;
                if(hour==23)
                {
                    hour=0;
                }
                else
                {
                    hour++;
                }
            }
            else
            {
                minute++;
            }
        }
        else
        {
            second++;
        }
    }

    //Prints the time as a string with colons and a 0 in front if it is a single digit//
    public String toString()
    {
        String hourString;
        if((hour-10)<0)
        {
            hourString = "0" + hour;
        }
        else
        {
            hourString = "" + hour;
        }
        String minuteString;
        if((minute-10)<0)
        {
            minuteString = "0" + minute;
        }
        else
        {
            minuteString = "" + minute;
        }
        String secondString;
        if((second-10)<0)
        {
            secondString = "0" + second;
        }
        else
        {
            secondString = "" + second;
        }
        return hourString + ":" + minuteString + ":" + secondString;
    }

    //Hour getter//
    public int getHour() {
        return hour;
    }

    //Minute getter//
    public int getMinute() {
        return minute;
    }

    //Second getter//
    public int getSecond() {
        return second;
    }

    //Adds two times together with another object as the parameter//
    public void add(Time object)
    {
        int newSecond = object.getSecond() + second;
        if((newSecond)>=60)
        {
            newSecond-=60;
            minute++;
        }
        int newMinute = object.getMinute() + minute;
        if((newMinute)>=60)
        {
            newMinute-=60;
            hour++;
        }
        int newHour = object.getHour() + hour;
        if((newHour)>=24)
        {
            newHour-=24;
        }
        hour = newHour;
        minute = newMinute;
        second = newSecond;
    }
}
