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
import java.lang.Integer;

public class ScoreResp_setMissCount_104075371058 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58497;
     Object term58513;

    public ScoreResp_setMissCount_104075371058() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58497 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp"));
        setIntField(term58497, term58497.getClass(), "musicId", 0);
        setIntField(term58497, term58497.getClass(), "level", 0);
        setIntField(term58497, term58497.getClass(), "playCount", 0);
        setIntField(term58497, term58497.getClass(), "scoreMax", 0);
        setIntField(term58497, term58497.getClass(), "resRequestCount", 0);
        setIntField(term58497, term58497.getClass(), "resAcceptCount", 0);
        setIntField(term58497, term58497.getClass(), "resSuccessCount", 0);
        setIntField(term58497, term58497.getClass(), "missCount", 0);
        setIntField(term58497, term58497.getClass(), "maxComboCount", 0);
        setBooleanField(term58497, term58497.getClass(), "isFullCombo", false);
        setBooleanField(term58497, term58497.getClass(), "isAllJustice", false);
        setBooleanField(term58497, term58497.getClass(), "isSuccess", false);
        setIntField(term58497, term58497.getClass(), "fullChain", 0);
        setIntField(term58497, term58497.getClass(), "maxChain", 0);
        setIntField(term58497, term58497.getClass(), "scoreRank", 0);
        term58513 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term58513;
        callMethod(klass, "setMissCount", argTypes, term58497, args);
    }

};


