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

public class ProfileResp_setJewelCount_149822295293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100043;
     Object term100070;

    public ProfileResp_setJewelCount_149822295293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100043 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp"));
        setField(term100043, term100043.getClass(), "userName", null);
        setIntField(term100043, term100043.getClass(), "level", 0);
        setLongField(term100043, term100043.getClass(), "exp", 0L);
        setLongField(term100043, term100043.getClass(), "point", 0L);
        setLongField(term100043, term100043.getClass(), "totalPoint", 0L);
        setIntField(term100043, term100043.getClass(), "playCount", 0);
        setIntField(term100043, term100043.getClass(), "jewelCount", 0);
        setIntField(term100043, term100043.getClass(), "totalJewelCount", 0);
        setIntField(term100043, term100043.getClass(), "playerRating", 0);
        setIntField(term100043, term100043.getClass(), "highestRating", 0);
        setIntField(term100043, term100043.getClass(), "battlePoint", 0);
        setIntField(term100043, term100043.getClass(), "nameplateId", 0);
        setIntField(term100043, term100043.getClass(), "trophyId", 0);
        setIntField(term100043, term100043.getClass(), "cardId", 0);
        setIntField(term100043, term100043.getClass(), "characterId", 0);
        setLongField(term100043, term100043.getClass(), "sumTechHighScore", 0L);
        setLongField(term100043, term100043.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term100043, term100043.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term100043, term100043.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term100043, term100043.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term100043, term100043.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term100043, term100043.getClass(), "sumBattleHighScore", 0L);
        setLongField(term100043, term100043.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term100043, term100043.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term100043, term100043.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term100043, term100043.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term100043, term100043.getClass(), "sumBattleLunaticHighScore", 0L);
        term100070 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term100070;
        callMethod(klass, "setJewelCount", argTypes, term100043, args);
    }

};


