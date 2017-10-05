package main.controller.tipoftheday;

import main.domain.tipofday.TipOfTheDay;
import main.service.tipoftheday.TipOfTheDayService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by maybra01 on 10/5/2017.
 */
@RestController
public class TipOfTheDayController {

    TipOfTheDayService tipOfTheDayService = new TipOfTheDayService();

    @RequestMapping(path = "/dailyTips")
    public List<TipOfTheDay> getTipsOfTheDay(){

        return tipOfTheDayService.getAllDailyTips();
    }

}
