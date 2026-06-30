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

public class ScoreResp_setFullChain_139017102763 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58587;
     Object term58603;

    public ScoreResp_setFullChain_139017102763() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58587 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp"));
        setIntField(term58587, term58587.getClass(), "musicId", 0);
        setIntField(term58587, term58587.getClass(), "level", 0);
        setIntField(term58587, term58587.getClass(), "playCount", 0);
        setIntField(term58587, term58587.getClass(), "scoreMax", 0);
        setIntField(term58587, term58587.getClass(), "resRequestCount", 0);
        setIntField(term58587, term58587.getClass(), "resAcceptCount", 0);
        setIntField(term58587, term58587.getClass(), "resSuccessCount", 0);
        setIntField(term58587, term58587.getClass(), "missCount", 0);
        setIntField(term58587, term58587.getClass(), "maxComboCount", 0);
        setBooleanField(term58587, term58587.getClass(), "isFullCombo", false);
        setBooleanField(term58587, term58587.getClass(), "isAllJustice", false);
        setBooleanField(term58587, term58587.getClass(), "isSuccess", false);
        setIntField(term58587, term58587.getClass(), "fullChain", 0);
        setIntField(term58587, term58587.getClass(), "maxChain", 0);
        setIntField(term58587, term58587.getClass(), "scoreRank", 0);
        term58603 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term58603;
        callMethod(klass, "setFullChain", argTypes, term58587, args);
    }

};


