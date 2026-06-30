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

public class ScoreResp_setPlayCount_60330420253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58407;
     Object term58423;

    public ScoreResp_setPlayCount_60330420253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58407 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp"));
        setIntField(term58407, term58407.getClass(), "musicId", 0);
        setIntField(term58407, term58407.getClass(), "level", 0);
        setIntField(term58407, term58407.getClass(), "playCount", 0);
        setIntField(term58407, term58407.getClass(), "scoreMax", 0);
        setIntField(term58407, term58407.getClass(), "resRequestCount", 0);
        setIntField(term58407, term58407.getClass(), "resAcceptCount", 0);
        setIntField(term58407, term58407.getClass(), "resSuccessCount", 0);
        setIntField(term58407, term58407.getClass(), "missCount", 0);
        setIntField(term58407, term58407.getClass(), "maxComboCount", 0);
        setBooleanField(term58407, term58407.getClass(), "isFullCombo", false);
        setBooleanField(term58407, term58407.getClass(), "isAllJustice", false);
        setBooleanField(term58407, term58407.getClass(), "isSuccess", false);
        setIntField(term58407, term58407.getClass(), "fullChain", 0);
        setIntField(term58407, term58407.getClass(), "maxChain", 0);
        setIntField(term58407, term58407.getClass(), "scoreRank", 0);
        term58423 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term58423;
        callMethod(klass, "setPlayCount", argTypes, term58407, args);
    }

};


