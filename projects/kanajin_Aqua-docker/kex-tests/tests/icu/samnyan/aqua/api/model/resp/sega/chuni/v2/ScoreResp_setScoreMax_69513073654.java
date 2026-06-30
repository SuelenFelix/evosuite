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

public class ScoreResp_setScoreMax_69513073654 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53255;
     Object term53271;

    public ScoreResp_setScoreMax_69513073654() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53255 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp"));
        setIntField(term53255, term53255.getClass(), "musicId", 0);
        setIntField(term53255, term53255.getClass(), "level", 0);
        setIntField(term53255, term53255.getClass(), "playCount", 0);
        setIntField(term53255, term53255.getClass(), "scoreMax", 0);
        setIntField(term53255, term53255.getClass(), "resRequestCount", 0);
        setIntField(term53255, term53255.getClass(), "resAcceptCount", 0);
        setIntField(term53255, term53255.getClass(), "resSuccessCount", 0);
        setIntField(term53255, term53255.getClass(), "missCount", 0);
        setIntField(term53255, term53255.getClass(), "maxComboCount", 0);
        setBooleanField(term53255, term53255.getClass(), "isFullCombo", false);
        setBooleanField(term53255, term53255.getClass(), "isAllJustice", false);
        setBooleanField(term53255, term53255.getClass(), "isSuccess", false);
        setIntField(term53255, term53255.getClass(), "fullChain", 0);
        setIntField(term53255, term53255.getClass(), "maxChain", 0);
        setIntField(term53255, term53255.getClass(), "scoreRank", 0);
        term53271 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term53271;
        callMethod(klass, "setScoreMax", argTypes, term53255, args);
    }

};


