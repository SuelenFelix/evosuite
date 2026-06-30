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

public class ProfileResp_hashCode_1323832849116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100706;

    public ProfileResp_hashCode_1323832849116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100706 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp"));
        setField(term100706, term100706.getClass(), "userName", null);
        setIntField(term100706, term100706.getClass(), "level", 0);
        setLongField(term100706, term100706.getClass(), "exp", 0L);
        setLongField(term100706, term100706.getClass(), "point", 0L);
        setLongField(term100706, term100706.getClass(), "totalPoint", 0L);
        setIntField(term100706, term100706.getClass(), "playCount", 0);
        setIntField(term100706, term100706.getClass(), "jewelCount", 0);
        setIntField(term100706, term100706.getClass(), "totalJewelCount", 0);
        setIntField(term100706, term100706.getClass(), "playerRating", 0);
        setIntField(term100706, term100706.getClass(), "highestRating", 0);
        setIntField(term100706, term100706.getClass(), "battlePoint", 0);
        setIntField(term100706, term100706.getClass(), "nameplateId", 0);
        setIntField(term100706, term100706.getClass(), "trophyId", 0);
        setIntField(term100706, term100706.getClass(), "cardId", 0);
        setIntField(term100706, term100706.getClass(), "characterId", 0);
        setLongField(term100706, term100706.getClass(), "sumTechHighScore", 0L);
        setLongField(term100706, term100706.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term100706, term100706.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term100706, term100706.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term100706, term100706.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term100706, term100706.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term100706, term100706.getClass(), "sumBattleHighScore", 0L);
        setLongField(term100706, term100706.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term100706, term100706.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term100706, term100706.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term100706, term100706.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term100706, term100706.getClass(), "sumBattleLunaticHighScore", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term100706, args);
    }

};


