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
import java.lang.Long;

public class ProfileResp_setSumBattleExpertHighScore_236314545111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100565;
     Object term100592;

    public ProfileResp_setSumBattleExpertHighScore_236314545111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100565 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp"));
        setField(term100565, term100565.getClass(), "userName", null);
        setIntField(term100565, term100565.getClass(), "level", 0);
        setLongField(term100565, term100565.getClass(), "exp", 0L);
        setLongField(term100565, term100565.getClass(), "point", 0L);
        setLongField(term100565, term100565.getClass(), "totalPoint", 0L);
        setIntField(term100565, term100565.getClass(), "playCount", 0);
        setIntField(term100565, term100565.getClass(), "jewelCount", 0);
        setIntField(term100565, term100565.getClass(), "totalJewelCount", 0);
        setIntField(term100565, term100565.getClass(), "playerRating", 0);
        setIntField(term100565, term100565.getClass(), "highestRating", 0);
        setIntField(term100565, term100565.getClass(), "battlePoint", 0);
        setIntField(term100565, term100565.getClass(), "nameplateId", 0);
        setIntField(term100565, term100565.getClass(), "trophyId", 0);
        setIntField(term100565, term100565.getClass(), "cardId", 0);
        setIntField(term100565, term100565.getClass(), "characterId", 0);
        setLongField(term100565, term100565.getClass(), "sumTechHighScore", 0L);
        setLongField(term100565, term100565.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term100565, term100565.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term100565, term100565.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term100565, term100565.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term100565, term100565.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term100565, term100565.getClass(), "sumBattleHighScore", 0L);
        setLongField(term100565, term100565.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term100565, term100565.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term100565, term100565.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term100565, term100565.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term100565, term100565.getClass(), "sumBattleLunaticHighScore", 0L);
        term100592 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term100592;
        callMethod(klass, "setSumBattleExpertHighScore", argTypes, term100565, args);
    }

};


