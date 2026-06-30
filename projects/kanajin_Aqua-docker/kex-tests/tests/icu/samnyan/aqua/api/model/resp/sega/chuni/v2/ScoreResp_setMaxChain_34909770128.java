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

public class ScoreResp_setMaxChain_34909770128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52829;
     Object term52845;

    public ScoreResp_setMaxChain_34909770128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52829 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp"));
        setIntField(term52829, term52829.getClass(), "musicId", 319658723);
        setIntField(term52829, term52829.getClass(), "level", 1315068409);
        setIntField(term52829, term52829.getClass(), "playCount", 1002887761);
        setIntField(term52829, term52829.getClass(), "scoreMax", 38995637);
        setIntField(term52829, term52829.getClass(), "resRequestCount", -2106212589);
        setIntField(term52829, term52829.getClass(), "resAcceptCount", 1881486751);
        setIntField(term52829, term52829.getClass(), "resSuccessCount", -92679624);
        setIntField(term52829, term52829.getClass(), "missCount", 935287448);
        setIntField(term52829, term52829.getClass(), "maxComboCount", -315809486);
        setBooleanField(term52829, term52829.getClass(), "isFullCombo", true);
        setBooleanField(term52829, term52829.getClass(), "isAllJustice", false);
        setBooleanField(term52829, term52829.getClass(), "isSuccess", true);
        setIntField(term52829, term52829.getClass(), "fullChain", -1846398473);
        setIntField(term52829, term52829.getClass(), "maxChain", -11976264);
        setIntField(term52829, term52829.getClass(), "scoreRank", 1655201167);
        term52845 = new Integer(-613873747);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term52845;
        callMethod(klass, "setMaxChain", argTypes, term52829, args);
    }

};


