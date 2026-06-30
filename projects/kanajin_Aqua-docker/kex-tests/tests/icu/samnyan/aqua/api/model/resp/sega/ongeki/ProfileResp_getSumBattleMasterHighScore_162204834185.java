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

public class ProfileResp_getSumBattleMasterHighScore_162204834185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99817;

    public ProfileResp_getSumBattleMasterHighScore_162204834185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99817 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp"));
        setField(term99817, term99817.getClass(), "userName", null);
        setIntField(term99817, term99817.getClass(), "level", 0);
        setLongField(term99817, term99817.getClass(), "exp", 0L);
        setLongField(term99817, term99817.getClass(), "point", 0L);
        setLongField(term99817, term99817.getClass(), "totalPoint", 0L);
        setIntField(term99817, term99817.getClass(), "playCount", 0);
        setIntField(term99817, term99817.getClass(), "jewelCount", 0);
        setIntField(term99817, term99817.getClass(), "totalJewelCount", 0);
        setIntField(term99817, term99817.getClass(), "playerRating", 0);
        setIntField(term99817, term99817.getClass(), "highestRating", 0);
        setIntField(term99817, term99817.getClass(), "battlePoint", 0);
        setIntField(term99817, term99817.getClass(), "nameplateId", 0);
        setIntField(term99817, term99817.getClass(), "trophyId", 0);
        setIntField(term99817, term99817.getClass(), "cardId", 0);
        setIntField(term99817, term99817.getClass(), "characterId", 0);
        setLongField(term99817, term99817.getClass(), "sumTechHighScore", 0L);
        setLongField(term99817, term99817.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term99817, term99817.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term99817, term99817.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term99817, term99817.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term99817, term99817.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term99817, term99817.getClass(), "sumBattleHighScore", 0L);
        setLongField(term99817, term99817.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term99817, term99817.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term99817, term99817.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term99817, term99817.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term99817, term99817.getClass(), "sumBattleLunaticHighScore", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSumBattleMasterHighScore", argTypes, term99817, args);
    }

};


