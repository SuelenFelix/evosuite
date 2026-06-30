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

public class ProfileResp_getSumTechExpertHighScore_213782583978 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99628;

    public ProfileResp_getSumTechExpertHighScore_213782583978() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99628 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp"));
        setField(term99628, term99628.getClass(), "userName", null);
        setIntField(term99628, term99628.getClass(), "level", 0);
        setLongField(term99628, term99628.getClass(), "exp", 0L);
        setLongField(term99628, term99628.getClass(), "point", 0L);
        setLongField(term99628, term99628.getClass(), "totalPoint", 0L);
        setIntField(term99628, term99628.getClass(), "playCount", 0);
        setIntField(term99628, term99628.getClass(), "jewelCount", 0);
        setIntField(term99628, term99628.getClass(), "totalJewelCount", 0);
        setIntField(term99628, term99628.getClass(), "playerRating", 0);
        setIntField(term99628, term99628.getClass(), "highestRating", 0);
        setIntField(term99628, term99628.getClass(), "battlePoint", 0);
        setIntField(term99628, term99628.getClass(), "nameplateId", 0);
        setIntField(term99628, term99628.getClass(), "trophyId", 0);
        setIntField(term99628, term99628.getClass(), "cardId", 0);
        setIntField(term99628, term99628.getClass(), "characterId", 0);
        setLongField(term99628, term99628.getClass(), "sumTechHighScore", 0L);
        setLongField(term99628, term99628.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term99628, term99628.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term99628, term99628.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term99628, term99628.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term99628, term99628.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term99628, term99628.getClass(), "sumBattleHighScore", 0L);
        setLongField(term99628, term99628.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term99628, term99628.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term99628, term99628.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term99628, term99628.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term99628, term99628.getClass(), "sumBattleLunaticHighScore", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSumTechExpertHighScore", argTypes, term99628, args);
    }

};


