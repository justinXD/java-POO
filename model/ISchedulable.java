package model;

import java.sql.Date;

public interface ISchedulable {
    void schedule(Date date, String time);
}
