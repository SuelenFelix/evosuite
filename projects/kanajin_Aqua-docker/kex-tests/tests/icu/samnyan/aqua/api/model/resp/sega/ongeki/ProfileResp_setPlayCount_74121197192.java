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

public class ProfileResp_setPlayCount_74121197192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100014;
     Object term100041;

    public ProfileResp_setPlayCount_74121197192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100014 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp"));
        setField(term100014, term100014.getClass(), "userName", null);
        setIntField(term100014, term100014.getClass(), "level", 0);
        setLongField(term100014, term100014.getClass(), "exp", 0L);
        setLongField(term100014, term100014.getClass(), "point", 0L);
        setLongField(term100014, term100014.getClass(), "totalPoint", 0L);
        setIntField(term100014, term100014.getClass(), "playCount", 0);
        setIntField(term100014, term100014.getClass(), "jewelCount", 0);
        setIntField(term100014, term100014.getClass(), "totalJewelCount", 0);
        setIntField(term100014, term100014.getClass(), "playerRating", 0);
        setIntField(term100014, term100014.getClass(), "highestRating", 0);
        setIntField(term100014, term100014.getClass(), "battlePoint", 0);
        setIntField(term100014, term100014.getClass(), "nameplateId", 0);
        setIntField(term100014, term100014.getClass(), "trophyId", 0);
        setIntField(term100014, term100014.getClass(), "cardId", 0);
        setIntField(term100014, term100014.getClass(), "characterId", 0);
        setLongField(term100014, term100014.getClass(), "sumTechHighScore", 0L);
        setLongField(term100014, term100014.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term100014, term100014.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term100014, term100014.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term100014, term100014.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term100014, term100014.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term100014, term100014.getClass(), "sumBattleHighScore", 0L);
        setLongField(term100014, term100014.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term100014, term100014.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term100014, term100014.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term100014, term100014.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term100014, term100014.getClass(), "sumBattleLunaticHighScore", 0L);
        term100041 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term100041;
        callMethod(klass, "setPlayCount", argTypes, term100014, args);
    }

};


