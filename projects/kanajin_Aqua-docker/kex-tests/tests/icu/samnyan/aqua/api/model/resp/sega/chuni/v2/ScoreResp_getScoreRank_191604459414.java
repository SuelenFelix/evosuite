package icu.samnyan.aqua.api.model.resp.sega.chuni.v2;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ScoreResp_getScoreRank_191604459414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52579;

    public ScoreResp_getScoreRank_191604459414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52579 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp"));
        setIntField(term52579, term52579.getClass(), "musicId", 1494109106);
        setIntField(term52579, term52579.getClass(), "level", 1902576230);
        setIntField(term52579, term52579.getClass(), "playCount", -1040460528);
        setIntField(term52579, term52579.getClass(), "scoreMax", 990725836);
        setIntField(term52579, term52579.getClass(), "resRequestCount", -1231785501);
        setIntField(term52579, term52579.getClass(), "resAcceptCount", -2112346885);
        setIntField(term52579, term52579.getClass(), "resSuccessCount", -26311618);
        setIntField(term52579, term52579.getClass(), "missCount", -671595545);
        setIntField(term52579, term52579.getClass(), "maxComboCount", -143541686);
        setBooleanField(term52579, term52579.getClass(), "isFullCombo", false);
        setBooleanField(term52579, term52579.getClass(), "isAllJustice", true);
        setBooleanField(term52579, term52579.getClass(), "isSuccess", true);
        setIntField(term52579, term52579.getClass(), "fullChain", -1201234880);
        setIntField(term52579, term52579.getClass(), "maxChain", 1402881126);
        setIntField(term52579, term52579.getClass(), "scoreRank", 786987666);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getScoreRank", argTypes, term52579, args);
    }

};


