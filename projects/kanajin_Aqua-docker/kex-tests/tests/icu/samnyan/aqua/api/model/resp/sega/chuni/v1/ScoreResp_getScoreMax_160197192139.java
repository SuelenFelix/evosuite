package icu.samnyan.aqua.api.model.resp.sega.chuni.v1;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ScoreResp_getScoreMax_160197192139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58179;

    public ScoreResp_getScoreMax_160197192139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58179 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp"));
        setIntField(term58179, term58179.getClass(), "musicId", 0);
        setIntField(term58179, term58179.getClass(), "level", 0);
        setIntField(term58179, term58179.getClass(), "playCount", 0);
        setIntField(term58179, term58179.getClass(), "scoreMax", 0);
        setIntField(term58179, term58179.getClass(), "resRequestCount", 0);
        setIntField(term58179, term58179.getClass(), "resAcceptCount", 0);
        setIntField(term58179, term58179.getClass(), "resSuccessCount", 0);
        setIntField(term58179, term58179.getClass(), "missCount", 0);
        setIntField(term58179, term58179.getClass(), "maxComboCount", 0);
        setBooleanField(term58179, term58179.getClass(), "isFullCombo", false);
        setBooleanField(term58179, term58179.getClass(), "isAllJustice", false);
        setBooleanField(term58179, term58179.getClass(), "isSuccess", false);
        setIntField(term58179, term58179.getClass(), "fullChain", 0);
        setIntField(term58179, term58179.getClass(), "maxChain", 0);
        setIntField(term58179, term58179.getClass(), "scoreRank", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getScoreMax", argTypes, term58179, args);
    }

};


