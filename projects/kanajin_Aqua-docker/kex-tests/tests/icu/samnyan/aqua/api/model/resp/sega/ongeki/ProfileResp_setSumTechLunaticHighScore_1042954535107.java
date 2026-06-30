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

public class ProfileResp_setSumTechLunaticHighScore_1042954535107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100449;
     Object term100476;

    public ProfileResp_setSumTechLunaticHighScore_1042954535107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100449 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp"));
        setField(term100449, term100449.getClass(), "userName", null);
        setIntField(term100449, term100449.getClass(), "level", 0);
        setLongField(term100449, term100449.getClass(), "exp", 0L);
        setLongField(term100449, term100449.getClass(), "point", 0L);
        setLongField(term100449, term100449.getClass(), "totalPoint", 0L);
        setIntField(term100449, term100449.getClass(), "playCount", 0);
        setIntField(term100449, term100449.getClass(), "jewelCount", 0);
        setIntField(term100449, term100449.getClass(), "totalJewelCount", 0);
        setIntField(term100449, term100449.getClass(), "playerRating", 0);
        setIntField(term100449, term100449.getClass(), "highestRating", 0);
        setIntField(term100449, term100449.getClass(), "battlePoint", 0);
        setIntField(term100449, term100449.getClass(), "nameplateId", 0);
        setIntField(term100449, term100449.getClass(), "trophyId", 0);
        setIntField(term100449, term100449.getClass(), "cardId", 0);
        setIntField(term100449, term100449.getClass(), "characterId", 0);
        setLongField(term100449, term100449.getClass(), "sumTechHighScore", 0L);
        setLongField(term100449, term100449.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term100449, term100449.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term100449, term100449.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term100449, term100449.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term100449, term100449.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term100449, term100449.getClass(), "sumBattleHighScore", 0L);
        setLongField(term100449, term100449.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term100449, term100449.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term100449, term100449.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term100449, term100449.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term100449, term100449.getClass(), "sumBattleLunaticHighScore", 0L);
        term100476 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term100476;
        callMethod(klass, "setSumTechLunaticHighScore", argTypes, term100449, args);
    }

};


