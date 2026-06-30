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

public class ProfileResp_setUserName_23262534187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99871;

    public ProfileResp_setUserName_23262534187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99871 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp"));
        setField(term99871, term99871.getClass(), "userName", null);
        setIntField(term99871, term99871.getClass(), "level", 0);
        setLongField(term99871, term99871.getClass(), "exp", 0L);
        setLongField(term99871, term99871.getClass(), "point", 0L);
        setLongField(term99871, term99871.getClass(), "totalPoint", 0L);
        setIntField(term99871, term99871.getClass(), "playCount", 0);
        setIntField(term99871, term99871.getClass(), "jewelCount", 0);
        setIntField(term99871, term99871.getClass(), "totalJewelCount", 0);
        setIntField(term99871, term99871.getClass(), "playerRating", 0);
        setIntField(term99871, term99871.getClass(), "highestRating", 0);
        setIntField(term99871, term99871.getClass(), "battlePoint", 0);
        setIntField(term99871, term99871.getClass(), "nameplateId", 0);
        setIntField(term99871, term99871.getClass(), "trophyId", 0);
        setIntField(term99871, term99871.getClass(), "cardId", 0);
        setIntField(term99871, term99871.getClass(), "characterId", 0);
        setLongField(term99871, term99871.getClass(), "sumTechHighScore", 0L);
        setLongField(term99871, term99871.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term99871, term99871.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term99871, term99871.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term99871, term99871.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term99871, term99871.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term99871, term99871.getClass(), "sumBattleHighScore", 0L);
        setLongField(term99871, term99871.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term99871, term99871.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term99871, term99871.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term99871, term99871.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term99871, term99871.getClass(), "sumBattleLunaticHighScore", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserName", argTypes, term99871, args);
    }

};


