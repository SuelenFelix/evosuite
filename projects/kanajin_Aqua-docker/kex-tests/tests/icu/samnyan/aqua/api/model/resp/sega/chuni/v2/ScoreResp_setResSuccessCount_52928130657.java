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
import java.lang.Integer;

public class ScoreResp_setResSuccessCount_52928130657 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53309;
     Object term53325;

    public ScoreResp_setResSuccessCount_52928130657() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53309 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp"));
        setIntField(term53309, term53309.getClass(), "musicId", 0);
        setIntField(term53309, term53309.getClass(), "level", 0);
        setIntField(term53309, term53309.getClass(), "playCount", 0);
        setIntField(term53309, term53309.getClass(), "scoreMax", 0);
        setIntField(term53309, term53309.getClass(), "resRequestCount", 0);
        setIntField(term53309, term53309.getClass(), "resAcceptCount", 0);
        setIntField(term53309, term53309.getClass(), "resSuccessCount", 0);
        setIntField(term53309, term53309.getClass(), "missCount", 0);
        setIntField(term53309, term53309.getClass(), "maxComboCount", 0);
        setBooleanField(term53309, term53309.getClass(), "isFullCombo", false);
        setBooleanField(term53309, term53309.getClass(), "isAllJustice", false);
        setBooleanField(term53309, term53309.getClass(), "isSuccess", false);
        setIntField(term53309, term53309.getClass(), "fullChain", 0);
        setIntField(term53309, term53309.getClass(), "maxChain", 0);
        setIntField(term53309, term53309.getClass(), "scoreRank", 0);
        term53325 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term53325;
        callMethod(klass, "setResSuccessCount", argTypes, term53309, args);
    }

};


