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

public class ScoreResp_setLevel_17614975952 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58389;
     Object term58405;

    public ScoreResp_setLevel_17614975952() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58389 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp"));
        setIntField(term58389, term58389.getClass(), "musicId", 0);
        setIntField(term58389, term58389.getClass(), "level", 0);
        setIntField(term58389, term58389.getClass(), "playCount", 0);
        setIntField(term58389, term58389.getClass(), "scoreMax", 0);
        setIntField(term58389, term58389.getClass(), "resRequestCount", 0);
        setIntField(term58389, term58389.getClass(), "resAcceptCount", 0);
        setIntField(term58389, term58389.getClass(), "resSuccessCount", 0);
        setIntField(term58389, term58389.getClass(), "missCount", 0);
        setIntField(term58389, term58389.getClass(), "maxComboCount", 0);
        setBooleanField(term58389, term58389.getClass(), "isFullCombo", false);
        setBooleanField(term58389, term58389.getClass(), "isAllJustice", false);
        setBooleanField(term58389, term58389.getClass(), "isSuccess", false);
        setIntField(term58389, term58389.getClass(), "fullChain", 0);
        setIntField(term58389, term58389.getClass(), "maxChain", 0);
        setIntField(term58389, term58389.getClass(), "scoreRank", 0);
        term58405 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term58405;
        callMethod(klass, "setLevel", argTypes, term58389, args);
    }

};


