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

public class ScoreResp_setResSuccessCount_65836402557 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58479;
     Object term58495;

    public ScoreResp_setResSuccessCount_65836402557() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58479 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp"));
        setIntField(term58479, term58479.getClass(), "musicId", 0);
        setIntField(term58479, term58479.getClass(), "level", 0);
        setIntField(term58479, term58479.getClass(), "playCount", 0);
        setIntField(term58479, term58479.getClass(), "scoreMax", 0);
        setIntField(term58479, term58479.getClass(), "resRequestCount", 0);
        setIntField(term58479, term58479.getClass(), "resAcceptCount", 0);
        setIntField(term58479, term58479.getClass(), "resSuccessCount", 0);
        setIntField(term58479, term58479.getClass(), "missCount", 0);
        setIntField(term58479, term58479.getClass(), "maxComboCount", 0);
        setBooleanField(term58479, term58479.getClass(), "isFullCombo", false);
        setBooleanField(term58479, term58479.getClass(), "isAllJustice", false);
        setBooleanField(term58479, term58479.getClass(), "isSuccess", false);
        setIntField(term58479, term58479.getClass(), "fullChain", 0);
        setIntField(term58479, term58479.getClass(), "maxChain", 0);
        setIntField(term58479, term58479.getClass(), "scoreRank", 0);
        term58495 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term58495;
        callMethod(klass, "setResSuccessCount", argTypes, term58479, args);
    }

};


