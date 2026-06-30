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

public class ScoreResp_setMaxChain_34909770164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53435;
     Object term53451;

    public ScoreResp_setMaxChain_34909770164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53435 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp"));
        setIntField(term53435, term53435.getClass(), "musicId", 0);
        setIntField(term53435, term53435.getClass(), "level", 0);
        setIntField(term53435, term53435.getClass(), "playCount", 0);
        setIntField(term53435, term53435.getClass(), "scoreMax", 0);
        setIntField(term53435, term53435.getClass(), "resRequestCount", 0);
        setIntField(term53435, term53435.getClass(), "resAcceptCount", 0);
        setIntField(term53435, term53435.getClass(), "resSuccessCount", 0);
        setIntField(term53435, term53435.getClass(), "missCount", 0);
        setIntField(term53435, term53435.getClass(), "maxComboCount", 0);
        setBooleanField(term53435, term53435.getClass(), "isFullCombo", false);
        setBooleanField(term53435, term53435.getClass(), "isAllJustice", false);
        setBooleanField(term53435, term53435.getClass(), "isSuccess", false);
        setIntField(term53435, term53435.getClass(), "fullChain", 0);
        setIntField(term53435, term53435.getClass(), "maxChain", 0);
        setIntField(term53435, term53435.getClass(), "scoreRank", 0);
        term53451 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term53451;
        callMethod(klass, "setMaxChain", argTypes, term53435, args);
    }

};


