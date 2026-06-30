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

public class ScoreResp_getFullChain_50702064248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53153;

    public ScoreResp_getFullChain_50702064248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53153 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp"));
        setIntField(term53153, term53153.getClass(), "musicId", 0);
        setIntField(term53153, term53153.getClass(), "level", 0);
        setIntField(term53153, term53153.getClass(), "playCount", 0);
        setIntField(term53153, term53153.getClass(), "scoreMax", 0);
        setIntField(term53153, term53153.getClass(), "resRequestCount", 0);
        setIntField(term53153, term53153.getClass(), "resAcceptCount", 0);
        setIntField(term53153, term53153.getClass(), "resSuccessCount", 0);
        setIntField(term53153, term53153.getClass(), "missCount", 0);
        setIntField(term53153, term53153.getClass(), "maxComboCount", 0);
        setBooleanField(term53153, term53153.getClass(), "isFullCombo", false);
        setBooleanField(term53153, term53153.getClass(), "isAllJustice", false);
        setBooleanField(term53153, term53153.getClass(), "isSuccess", false);
        setIntField(term53153, term53153.getClass(), "fullChain", 0);
        setIntField(term53153, term53153.getClass(), "maxChain", 0);
        setIntField(term53153, term53153.getClass(), "scoreRank", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFullChain", argTypes, term53153, args);
    }

};


