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

public class ProfileResp_setHighestRating_100721973596 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100130;
     Object term100157;

    public ProfileResp_setHighestRating_100721973596() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100130 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp"));
        setField(term100130, term100130.getClass(), "userName", null);
        setIntField(term100130, term100130.getClass(), "level", 0);
        setLongField(term100130, term100130.getClass(), "exp", 0L);
        setLongField(term100130, term100130.getClass(), "point", 0L);
        setLongField(term100130, term100130.getClass(), "totalPoint", 0L);
        setIntField(term100130, term100130.getClass(), "playCount", 0);
        setIntField(term100130, term100130.getClass(), "jewelCount", 0);
        setIntField(term100130, term100130.getClass(), "totalJewelCount", 0);
        setIntField(term100130, term100130.getClass(), "playerRating", 0);
        setIntField(term100130, term100130.getClass(), "highestRating", 0);
        setIntField(term100130, term100130.getClass(), "battlePoint", 0);
        setIntField(term100130, term100130.getClass(), "nameplateId", 0);
        setIntField(term100130, term100130.getClass(), "trophyId", 0);
        setIntField(term100130, term100130.getClass(), "cardId", 0);
        setIntField(term100130, term100130.getClass(), "characterId", 0);
        setLongField(term100130, term100130.getClass(), "sumTechHighScore", 0L);
        setLongField(term100130, term100130.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term100130, term100130.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term100130, term100130.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term100130, term100130.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term100130, term100130.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term100130, term100130.getClass(), "sumBattleHighScore", 0L);
        setLongField(term100130, term100130.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term100130, term100130.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term100130, term100130.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term100130, term100130.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term100130, term100130.getClass(), "sumBattleLunaticHighScore", 0L);
        term100157 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term100157;
        callMethod(klass, "setHighestRating", argTypes, term100130, args);
    }

};


