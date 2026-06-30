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

public class ProfileResp_toString_1834592539117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100733;

    public ProfileResp_toString_1834592539117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100733 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp"));
        setField(term100733, term100733.getClass(), "userName", null);
        setIntField(term100733, term100733.getClass(), "level", 0);
        setLongField(term100733, term100733.getClass(), "exp", 0L);
        setLongField(term100733, term100733.getClass(), "point", 0L);
        setLongField(term100733, term100733.getClass(), "totalPoint", 0L);
        setIntField(term100733, term100733.getClass(), "playCount", 0);
        setIntField(term100733, term100733.getClass(), "jewelCount", 0);
        setIntField(term100733, term100733.getClass(), "totalJewelCount", 0);
        setIntField(term100733, term100733.getClass(), "playerRating", 0);
        setIntField(term100733, term100733.getClass(), "highestRating", 0);
        setIntField(term100733, term100733.getClass(), "battlePoint", 0);
        setIntField(term100733, term100733.getClass(), "nameplateId", 0);
        setIntField(term100733, term100733.getClass(), "trophyId", 0);
        setIntField(term100733, term100733.getClass(), "cardId", 0);
        setIntField(term100733, term100733.getClass(), "characterId", 0);
        setLongField(term100733, term100733.getClass(), "sumTechHighScore", 0L);
        setLongField(term100733, term100733.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term100733, term100733.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term100733, term100733.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term100733, term100733.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term100733, term100733.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term100733, term100733.getClass(), "sumBattleHighScore", 0L);
        setLongField(term100733, term100733.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term100733, term100733.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term100733, term100733.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term100733, term100733.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term100733, term100733.getClass(), "sumBattleLunaticHighScore", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term100733, args);
    }

};


