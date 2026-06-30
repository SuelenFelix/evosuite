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

public class ScoreResp_canEqual_141549971867 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58657;

    public ScoreResp_canEqual_141549971867() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58657 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp"));
        setIntField(term58657, term58657.getClass(), "musicId", 0);
        setIntField(term58657, term58657.getClass(), "level", 0);
        setIntField(term58657, term58657.getClass(), "playCount", 0);
        setIntField(term58657, term58657.getClass(), "scoreMax", 0);
        setIntField(term58657, term58657.getClass(), "resRequestCount", 0);
        setIntField(term58657, term58657.getClass(), "resAcceptCount", 0);
        setIntField(term58657, term58657.getClass(), "resSuccessCount", 0);
        setIntField(term58657, term58657.getClass(), "missCount", 0);
        setIntField(term58657, term58657.getClass(), "maxComboCount", 0);
        setBooleanField(term58657, term58657.getClass(), "isFullCombo", false);
        setBooleanField(term58657, term58657.getClass(), "isAllJustice", false);
        setBooleanField(term58657, term58657.getClass(), "isSuccess", false);
        setIntField(term58657, term58657.getClass(), "fullChain", 0);
        setIntField(term58657, term58657.getClass(), "maxChain", 0);
        setIntField(term58657, term58657.getClass(), "scoreRank", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "canEqual", argTypes, term58657, args);
    }

};


