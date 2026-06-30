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

public class ScoreResp_setSuccess_38174864262 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58569;
     Object term58585;

    public ScoreResp_setSuccess_38174864262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58569 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp"));
        setIntField(term58569, term58569.getClass(), "musicId", 0);
        setIntField(term58569, term58569.getClass(), "level", 0);
        setIntField(term58569, term58569.getClass(), "playCount", 0);
        setIntField(term58569, term58569.getClass(), "scoreMax", 0);
        setIntField(term58569, term58569.getClass(), "resRequestCount", 0);
        setIntField(term58569, term58569.getClass(), "resAcceptCount", 0);
        setIntField(term58569, term58569.getClass(), "resSuccessCount", 0);
        setIntField(term58569, term58569.getClass(), "missCount", 0);
        setIntField(term58569, term58569.getClass(), "maxComboCount", 0);
        setBooleanField(term58569, term58569.getClass(), "isFullCombo", false);
        setBooleanField(term58569, term58569.getClass(), "isAllJustice", false);
        setBooleanField(term58569, term58569.getClass(), "isSuccess", false);
        setIntField(term58569, term58569.getClass(), "fullChain", 0);
        setIntField(term58569, term58569.getClass(), "maxChain", 0);
        setIntField(term58569, term58569.getClass(), "scoreRank", 0);
        term58585 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term58585;
        callMethod(klass, "setSuccess", argTypes, term58569, args);
    }

};


