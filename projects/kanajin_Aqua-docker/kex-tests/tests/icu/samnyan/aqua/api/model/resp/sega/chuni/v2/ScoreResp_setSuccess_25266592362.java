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
import java.lang.Boolean;

public class ScoreResp_setSuccess_25266592362 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53399;
     Object term53415;

    public ScoreResp_setSuccess_25266592362() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53399 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp"));
        setIntField(term53399, term53399.getClass(), "musicId", 0);
        setIntField(term53399, term53399.getClass(), "level", 0);
        setIntField(term53399, term53399.getClass(), "playCount", 0);
        setIntField(term53399, term53399.getClass(), "scoreMax", 0);
        setIntField(term53399, term53399.getClass(), "resRequestCount", 0);
        setIntField(term53399, term53399.getClass(), "resAcceptCount", 0);
        setIntField(term53399, term53399.getClass(), "resSuccessCount", 0);
        setIntField(term53399, term53399.getClass(), "missCount", 0);
        setIntField(term53399, term53399.getClass(), "maxComboCount", 0);
        setBooleanField(term53399, term53399.getClass(), "isFullCombo", false);
        setBooleanField(term53399, term53399.getClass(), "isAllJustice", false);
        setBooleanField(term53399, term53399.getClass(), "isSuccess", false);
        setIntField(term53399, term53399.getClass(), "fullChain", 0);
        setIntField(term53399, term53399.getClass(), "maxChain", 0);
        setIntField(term53399, term53399.getClass(), "scoreRank", 0);
        term53415 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term53415;
        callMethod(klass, "setSuccess", argTypes, term53399, args);
    }

};


