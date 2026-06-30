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
import java.lang.Integer;

public class ProfileResp_setJewelCount_149822295233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97799;
     Object term97838;

    public ProfileResp_setJewelCount_149822295233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97799 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp"));
        setField(term97799, term97799.getClass(), "userName", "usqBzmmwqY");
        setIntField(term97799, term97799.getClass(), "level", 146986539);
        setLongField(term97799, term97799.getClass(), "exp", 3233362963106306685L);
        setLongField(term97799, term97799.getClass(), "point", 8819129988249637928L);
        setLongField(term97799, term97799.getClass(), "totalPoint", -649375634918728295L);
        setIntField(term97799, term97799.getClass(), "playCount", 665822400);
        setIntField(term97799, term97799.getClass(), "jewelCount", 1688717302);
        setIntField(term97799, term97799.getClass(), "totalJewelCount", 646973755);
        setIntField(term97799, term97799.getClass(), "playerRating", 1760957573);
        setIntField(term97799, term97799.getClass(), "highestRating", 632854025);
        setIntField(term97799, term97799.getClass(), "battlePoint", 99725677);
        setIntField(term97799, term97799.getClass(), "nameplateId", 1907879934);
        setIntField(term97799, term97799.getClass(), "trophyId", 408699081);
        setIntField(term97799, term97799.getClass(), "cardId", -13211887);
        setIntField(term97799, term97799.getClass(), "characterId", 289670402);
        setLongField(term97799, term97799.getClass(), "sumTechHighScore", 7591162060290192571L);
        setLongField(term97799, term97799.getClass(), "sumTechBasicHighScore", 7933556287518447241L);
        setLongField(term97799, term97799.getClass(), "sumTechAdvancedHighScore", -8470126707013662687L);
        setLongField(term97799, term97799.getClass(), "sumTechExpertHighScore", 6918389485665287999L);
        setLongField(term97799, term97799.getClass(), "sumTechMasterHighScore", -5804321305224591674L);
        setLongField(term97799, term97799.getClass(), "sumTechLunaticHighScore", 4415872891600302153L);
        setLongField(term97799, term97799.getClass(), "sumBattleHighScore", -3414371718554283604L);
        setLongField(term97799, term97799.getClass(), "sumBattleBasicHighScore", 9129195907367634518L);
        setLongField(term97799, term97799.getClass(), "sumBattleAdvancedHighScore", -3768337518626488946L);
        setLongField(term97799, term97799.getClass(), "sumBattleExpertHighScore", 5164043233066425336L);
        setLongField(term97799, term97799.getClass(), "sumBattleMasterHighScore", -6713909315583136696L);
        setLongField(term97799, term97799.getClass(), "sumBattleLunaticHighScore", -1811224642316051541L);
        term97838 = new Integer(412113929);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term97838;
        callMethod(klass, "setJewelCount", argTypes, term97799, args);
    }

};


