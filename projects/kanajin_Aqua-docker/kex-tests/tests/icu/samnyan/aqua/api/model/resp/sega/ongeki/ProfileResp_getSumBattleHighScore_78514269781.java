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

public class ProfileResp_getSumBattleHighScore_78514269781 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99709;

    public ProfileResp_getSumBattleHighScore_78514269781() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99709 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp"));
        setField(term99709, term99709.getClass(), "userName", null);
        setIntField(term99709, term99709.getClass(), "level", 0);
        setLongField(term99709, term99709.getClass(), "exp", 0L);
        setLongField(term99709, term99709.getClass(), "point", 0L);
        setLongField(term99709, term99709.getClass(), "totalPoint", 0L);
        setIntField(term99709, term99709.getClass(), "playCount", 0);
        setIntField(term99709, term99709.getClass(), "jewelCount", 0);
        setIntField(term99709, term99709.getClass(), "totalJewelCount", 0);
        setIntField(term99709, term99709.getClass(), "playerRating", 0);
        setIntField(term99709, term99709.getClass(), "highestRating", 0);
        setIntField(term99709, term99709.getClass(), "battlePoint", 0);
        setIntField(term99709, term99709.getClass(), "nameplateId", 0);
        setIntField(term99709, term99709.getClass(), "trophyId", 0);
        setIntField(term99709, term99709.getClass(), "cardId", 0);
        setIntField(term99709, term99709.getClass(), "characterId", 0);
        setLongField(term99709, term99709.getClass(), "sumTechHighScore", 0L);
        setLongField(term99709, term99709.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term99709, term99709.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term99709, term99709.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term99709, term99709.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term99709, term99709.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term99709, term99709.getClass(), "sumBattleHighScore", 0L);
        setLongField(term99709, term99709.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term99709, term99709.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term99709, term99709.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term99709, term99709.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term99709, term99709.getClass(), "sumBattleLunaticHighScore", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSumBattleHighScore", argTypes, term99709, args);
    }

};


