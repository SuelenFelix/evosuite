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

public class ProfileResp_setSumBattleLunaticHighScore_891556727113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100623;
     Object term100650;

    public ProfileResp_setSumBattleLunaticHighScore_891556727113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100623 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp"));
        setField(term100623, term100623.getClass(), "userName", null);
        setIntField(term100623, term100623.getClass(), "level", 0);
        setLongField(term100623, term100623.getClass(), "exp", 0L);
        setLongField(term100623, term100623.getClass(), "point", 0L);
        setLongField(term100623, term100623.getClass(), "totalPoint", 0L);
        setIntField(term100623, term100623.getClass(), "playCount", 0);
        setIntField(term100623, term100623.getClass(), "jewelCount", 0);
        setIntField(term100623, term100623.getClass(), "totalJewelCount", 0);
        setIntField(term100623, term100623.getClass(), "playerRating", 0);
        setIntField(term100623, term100623.getClass(), "highestRating", 0);
        setIntField(term100623, term100623.getClass(), "battlePoint", 0);
        setIntField(term100623, term100623.getClass(), "nameplateId", 0);
        setIntField(term100623, term100623.getClass(), "trophyId", 0);
        setIntField(term100623, term100623.getClass(), "cardId", 0);
        setIntField(term100623, term100623.getClass(), "characterId", 0);
        setLongField(term100623, term100623.getClass(), "sumTechHighScore", 0L);
        setLongField(term100623, term100623.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term100623, term100623.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term100623, term100623.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term100623, term100623.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term100623, term100623.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term100623, term100623.getClass(), "sumBattleHighScore", 0L);
        setLongField(term100623, term100623.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term100623, term100623.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term100623, term100623.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term100623, term100623.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term100623, term100623.getClass(), "sumBattleLunaticHighScore", 0L);
        term100650 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term100650;
        callMethod(klass, "setSumBattleLunaticHighScore", argTypes, term100623, args);
    }

};


