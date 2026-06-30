package icu.samnyan.aqua.api.model.resp.sega.ongeki;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static icu.samnyan.aqua.api.model.resp.sega.ongeki.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class ProfileResp_setSumBattleBasicHighScore_209358366149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98615;
     Object term98654;

    public ProfileResp_setSumBattleBasicHighScore_209358366149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98615 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp"));
        setField(term98615, term98615.getClass(), "userName", "OKqVtEfDVA");
        setIntField(term98615, term98615.getClass(), "level", -547162550);
        setLongField(term98615, term98615.getClass(), "exp", -5293032168048712263L);
        setLongField(term98615, term98615.getClass(), "point", 6550457563175408252L);
        setLongField(term98615, term98615.getClass(), "totalPoint", 7939212619192592869L);
        setIntField(term98615, term98615.getClass(), "playCount", -1885733949);
        setIntField(term98615, term98615.getClass(), "jewelCount", -456319819);
        setIntField(term98615, term98615.getClass(), "totalJewelCount", 955574517);
        setIntField(term98615, term98615.getClass(), "playerRating", -1265037091);
        setIntField(term98615, term98615.getClass(), "highestRating", 1471259557);
        setIntField(term98615, term98615.getClass(), "battlePoint", -1948903841);
        setIntField(term98615, term98615.getClass(), "nameplateId", -2028574022);
        setIntField(term98615, term98615.getClass(), "trophyId", 190019992);
        setIntField(term98615, term98615.getClass(), "cardId", -117461604);
        setIntField(term98615, term98615.getClass(), "characterId", 281612155);
        setLongField(term98615, term98615.getClass(), "sumTechHighScore", -828507344599670563L);
        setLongField(term98615, term98615.getClass(), "sumTechBasicHighScore", 9075490098762397901L);
        setLongField(term98615, term98615.getClass(), "sumTechAdvancedHighScore", -195280124140253882L);
        setLongField(term98615, term98615.getClass(), "sumTechExpertHighScore", -2530481208397282198L);
        setLongField(term98615, term98615.getClass(), "sumTechMasterHighScore", 926348940376066688L);
        setLongField(term98615, term98615.getClass(), "sumTechLunaticHighScore", -82027138281358505L);
        setLongField(term98615, term98615.getClass(), "sumBattleHighScore", 4296996141366018145L);
        setLongField(term98615, term98615.getClass(), "sumBattleBasicHighScore", 1300791613152413877L);
        setLongField(term98615, term98615.getClass(), "sumBattleAdvancedHighScore", -6161864456143230897L);
        setLongField(term98615, term98615.getClass(), "sumBattleExpertHighScore", 923880641429581390L);
        setLongField(term98615, term98615.getClass(), "sumBattleMasterHighScore", 8778993846795546114L);
        setLongField(term98615, term98615.getClass(), "sumBattleLunaticHighScore", -4303931238037988100L);
        term98654 = new Long(4077536699822200973L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term98654;
        callMethod(klass, "setSumBattleBasicHighScore", argTypes, term98615, args);
    }

};


