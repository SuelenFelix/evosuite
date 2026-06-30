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

public class ProfileResp_setCardId_457959831100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100246;
     Object term100273;

    public ProfileResp_setCardId_457959831100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100246 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp"));
        setField(term100246, term100246.getClass(), "userName", null);
        setIntField(term100246, term100246.getClass(), "level", 0);
        setLongField(term100246, term100246.getClass(), "exp", 0L);
        setLongField(term100246, term100246.getClass(), "point", 0L);
        setLongField(term100246, term100246.getClass(), "totalPoint", 0L);
        setIntField(term100246, term100246.getClass(), "playCount", 0);
        setIntField(term100246, term100246.getClass(), "jewelCount", 0);
        setIntField(term100246, term100246.getClass(), "totalJewelCount", 0);
        setIntField(term100246, term100246.getClass(), "playerRating", 0);
        setIntField(term100246, term100246.getClass(), "highestRating", 0);
        setIntField(term100246, term100246.getClass(), "battlePoint", 0);
        setIntField(term100246, term100246.getClass(), "nameplateId", 0);
        setIntField(term100246, term100246.getClass(), "trophyId", 0);
        setIntField(term100246, term100246.getClass(), "cardId", 0);
        setIntField(term100246, term100246.getClass(), "characterId", 0);
        setLongField(term100246, term100246.getClass(), "sumTechHighScore", 0L);
        setLongField(term100246, term100246.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term100246, term100246.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term100246, term100246.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term100246, term100246.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term100246, term100246.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term100246, term100246.getClass(), "sumBattleHighScore", 0L);
        setLongField(term100246, term100246.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term100246, term100246.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term100246, term100246.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term100246, term100246.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term100246, term100246.getClass(), "sumBattleLunaticHighScore", 0L);
        term100273 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term100273;
        callMethod(klass, "setCardId", argTypes, term100246, args);
    }

};


