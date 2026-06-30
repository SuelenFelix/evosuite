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
import java.lang.Boolean;

public class ScoreResp_setFullCombo_117889328660 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58533;
     Object term58549;

    public ScoreResp_setFullCombo_117889328660() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58533 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp"));
        setIntField(term58533, term58533.getClass(), "musicId", 0);
        setIntField(term58533, term58533.getClass(), "level", 0);
        setIntField(term58533, term58533.getClass(), "playCount", 0);
        setIntField(term58533, term58533.getClass(), "scoreMax", 0);
        setIntField(term58533, term58533.getClass(), "resRequestCount", 0);
        setIntField(term58533, term58533.getClass(), "resAcceptCount", 0);
        setIntField(term58533, term58533.getClass(), "resSuccessCount", 0);
        setIntField(term58533, term58533.getClass(), "missCount", 0);
        setIntField(term58533, term58533.getClass(), "maxComboCount", 0);
        setBooleanField(term58533, term58533.getClass(), "isFullCombo", false);
        setBooleanField(term58533, term58533.getClass(), "isAllJustice", false);
        setBooleanField(term58533, term58533.getClass(), "isSuccess", false);
        setIntField(term58533, term58533.getClass(), "fullChain", 0);
        setIntField(term58533, term58533.getClass(), "maxChain", 0);
        setIntField(term58533, term58533.getClass(), "scoreRank", 0);
        term58549 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term58549;
        callMethod(klass, "setFullCombo", argTypes, term58533, args);
    }

};


