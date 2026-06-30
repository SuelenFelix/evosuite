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

public class ProfileResp_setSumTechBasicHighScore_505517749103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100333;
     Object term100360;

    public ProfileResp_setSumTechBasicHighScore_505517749103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100333 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp"));
        setField(term100333, term100333.getClass(), "userName", null);
        setIntField(term100333, term100333.getClass(), "level", 0);
        setLongField(term100333, term100333.getClass(), "exp", 0L);
        setLongField(term100333, term100333.getClass(), "point", 0L);
        setLongField(term100333, term100333.getClass(), "totalPoint", 0L);
        setIntField(term100333, term100333.getClass(), "playCount", 0);
        setIntField(term100333, term100333.getClass(), "jewelCount", 0);
        setIntField(term100333, term100333.getClass(), "totalJewelCount", 0);
        setIntField(term100333, term100333.getClass(), "playerRating", 0);
        setIntField(term100333, term100333.getClass(), "highestRating", 0);
        setIntField(term100333, term100333.getClass(), "battlePoint", 0);
        setIntField(term100333, term100333.getClass(), "nameplateId", 0);
        setIntField(term100333, term100333.getClass(), "trophyId", 0);
        setIntField(term100333, term100333.getClass(), "cardId", 0);
        setIntField(term100333, term100333.getClass(), "characterId", 0);
        setLongField(term100333, term100333.getClass(), "sumTechHighScore", 0L);
        setLongField(term100333, term100333.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term100333, term100333.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term100333, term100333.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term100333, term100333.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term100333, term100333.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term100333, term100333.getClass(), "sumBattleHighScore", 0L);
        setLongField(term100333, term100333.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term100333, term100333.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term100333, term100333.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term100333, term100333.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term100333, term100333.getClass(), "sumBattleLunaticHighScore", 0L);
        term100360 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term100360;
        callMethod(klass, "setSumTechBasicHighScore", argTypes, term100333, args);
    }

};


