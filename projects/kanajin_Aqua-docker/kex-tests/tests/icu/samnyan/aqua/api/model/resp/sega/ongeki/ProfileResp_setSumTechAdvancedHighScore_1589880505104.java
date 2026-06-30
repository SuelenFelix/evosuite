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

public class ProfileResp_setSumTechAdvancedHighScore_1589880505104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100362;
     Object term100389;

    public ProfileResp_setSumTechAdvancedHighScore_1589880505104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100362 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp"));
        setField(term100362, term100362.getClass(), "userName", null);
        setIntField(term100362, term100362.getClass(), "level", 0);
        setLongField(term100362, term100362.getClass(), "exp", 0L);
        setLongField(term100362, term100362.getClass(), "point", 0L);
        setLongField(term100362, term100362.getClass(), "totalPoint", 0L);
        setIntField(term100362, term100362.getClass(), "playCount", 0);
        setIntField(term100362, term100362.getClass(), "jewelCount", 0);
        setIntField(term100362, term100362.getClass(), "totalJewelCount", 0);
        setIntField(term100362, term100362.getClass(), "playerRating", 0);
        setIntField(term100362, term100362.getClass(), "highestRating", 0);
        setIntField(term100362, term100362.getClass(), "battlePoint", 0);
        setIntField(term100362, term100362.getClass(), "nameplateId", 0);
        setIntField(term100362, term100362.getClass(), "trophyId", 0);
        setIntField(term100362, term100362.getClass(), "cardId", 0);
        setIntField(term100362, term100362.getClass(), "characterId", 0);
        setLongField(term100362, term100362.getClass(), "sumTechHighScore", 0L);
        setLongField(term100362, term100362.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term100362, term100362.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term100362, term100362.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term100362, term100362.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term100362, term100362.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term100362, term100362.getClass(), "sumBattleHighScore", 0L);
        setLongField(term100362, term100362.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term100362, term100362.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term100362, term100362.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term100362, term100362.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term100362, term100362.getClass(), "sumBattleLunaticHighScore", 0L);
        term100389 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term100389;
        callMethod(klass, "setSumTechAdvancedHighScore", argTypes, term100362, args);
    }

};


