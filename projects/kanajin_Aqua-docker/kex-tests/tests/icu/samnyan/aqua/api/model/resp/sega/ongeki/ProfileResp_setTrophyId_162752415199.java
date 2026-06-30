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

public class ProfileResp_setTrophyId_162752415199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100217;
     Object term100244;

    public ProfileResp_setTrophyId_162752415199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100217 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp"));
        setField(term100217, term100217.getClass(), "userName", null);
        setIntField(term100217, term100217.getClass(), "level", 0);
        setLongField(term100217, term100217.getClass(), "exp", 0L);
        setLongField(term100217, term100217.getClass(), "point", 0L);
        setLongField(term100217, term100217.getClass(), "totalPoint", 0L);
        setIntField(term100217, term100217.getClass(), "playCount", 0);
        setIntField(term100217, term100217.getClass(), "jewelCount", 0);
        setIntField(term100217, term100217.getClass(), "totalJewelCount", 0);
        setIntField(term100217, term100217.getClass(), "playerRating", 0);
        setIntField(term100217, term100217.getClass(), "highestRating", 0);
        setIntField(term100217, term100217.getClass(), "battlePoint", 0);
        setIntField(term100217, term100217.getClass(), "nameplateId", 0);
        setIntField(term100217, term100217.getClass(), "trophyId", 0);
        setIntField(term100217, term100217.getClass(), "cardId", 0);
        setIntField(term100217, term100217.getClass(), "characterId", 0);
        setLongField(term100217, term100217.getClass(), "sumTechHighScore", 0L);
        setLongField(term100217, term100217.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term100217, term100217.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term100217, term100217.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term100217, term100217.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term100217, term100217.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term100217, term100217.getClass(), "sumBattleHighScore", 0L);
        setLongField(term100217, term100217.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term100217, term100217.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term100217, term100217.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term100217, term100217.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term100217, term100217.getClass(), "sumBattleLunaticHighScore", 0L);
        term100244 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term100244;
        callMethod(klass, "setTrophyId", argTypes, term100217, args);
    }

};


