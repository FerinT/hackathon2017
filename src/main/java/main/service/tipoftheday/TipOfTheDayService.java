package main.service.tipoftheday;

import main.dataaccess.tipoftheday.TipOfTheDayDao;
import main.domain.tipofday.TipOfTheDay;

import java.util.List;

/**
 * Created by maybra01 on 10/5/2017.
 */
public class TipOfTheDayService {
    TipOfTheDayDao dayDao = new TipOfTheDayDao();

    public List<TipOfTheDay> getAllDailyTips() {
        return dayDao.findAllTips();
    }

    public void insertDailyTip(TipOfTheDay tipOfTheDay) {
        dayDao.insertTipOfTheDay(tipOfTheDay);

    }
}
