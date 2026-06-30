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

public class ScoreResp_setFullCombo_104981056760 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53363;
     Object term53379;

    public ScoreResp_setFullCombo_104981056760() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53363 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp"));
        setIntField(term53363, term53363.getClass(), "musicId", 0);
        setIntField(term53363, term53363.getClass(), "level", 0);
        setIntField(term53363, term53363.getClass(), "playCount", 0);
        setIntField(term53363, term53363.getClass(), "scoreMax", 0);
        setIntField(term53363, term53363.getClass(), "resRequestCount", 0);
        setIntField(term53363, term53363.getClass(), "resAcceptCount", 0);
        setIntField(term53363, term53363.getClass(), "resSuccessCount", 0);
        setIntField(term53363, term53363.getClass(), "missCount", 0);
        setIntField(term53363, term53363.getClass(), "maxComboCount", 0);
        setBooleanField(term53363, term53363.getClass(), "isFullCombo", false);
        setBooleanField(term53363, term53363.getClass(), "isAllJustice", false);
        setBooleanField(term53363, term53363.getClass(), "isSuccess", false);
        setIntField(term53363, term53363.getClass(), "fullChain", 0);
        setIntField(term53363, term53363.getClass(), "maxChain", 0);
        setIntField(term53363, term53363.getClass(), "scoreRank", 0);
        term53379 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term53379;
        callMethod(klass, "setFullCombo", argTypes, term53363, args);
    }

};


