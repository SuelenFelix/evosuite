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

public class ProfileResp_equals_875146174114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100652;

    public ProfileResp_equals_875146174114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100652 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp"));
        setField(term100652, term100652.getClass(), "userName", null);
        setIntField(term100652, term100652.getClass(), "level", 0);
        setLongField(term100652, term100652.getClass(), "exp", 0L);
        setLongField(term100652, term100652.getClass(), "point", 0L);
        setLongField(term100652, term100652.getClass(), "totalPoint", 0L);
        setIntField(term100652, term100652.getClass(), "playCount", 0);
        setIntField(term100652, term100652.getClass(), "jewelCount", 0);
        setIntField(term100652, term100652.getClass(), "totalJewelCount", 0);
        setIntField(term100652, term100652.getClass(), "playerRating", 0);
        setIntField(term100652, term100652.getClass(), "highestRating", 0);
        setIntField(term100652, term100652.getClass(), "battlePoint", 0);
        setIntField(term100652, term100652.getClass(), "nameplateId", 0);
        setIntField(term100652, term100652.getClass(), "trophyId", 0);
        setIntField(term100652, term100652.getClass(), "cardId", 0);
        setIntField(term100652, term100652.getClass(), "characterId", 0);
        setLongField(term100652, term100652.getClass(), "sumTechHighScore", 0L);
        setLongField(term100652, term100652.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term100652, term100652.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term100652, term100652.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term100652, term100652.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term100652, term100652.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term100652, term100652.getClass(), "sumBattleHighScore", 0L);
        setLongField(term100652, term100652.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term100652, term100652.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term100652, term100652.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term100652, term100652.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term100652, term100652.getClass(), "sumBattleLunaticHighScore", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term100652, args);
    }

};


