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

public class ScoreResp_isSuccess_74634307247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58307;

    public ScoreResp_isSuccess_74634307247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58307 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp"));
        setIntField(term58307, term58307.getClass(), "musicId", 0);
        setIntField(term58307, term58307.getClass(), "level", 0);
        setIntField(term58307, term58307.getClass(), "playCount", 0);
        setIntField(term58307, term58307.getClass(), "scoreMax", 0);
        setIntField(term58307, term58307.getClass(), "resRequestCount", 0);
        setIntField(term58307, term58307.getClass(), "resAcceptCount", 0);
        setIntField(term58307, term58307.getClass(), "resSuccessCount", 0);
        setIntField(term58307, term58307.getClass(), "missCount", 0);
        setIntField(term58307, term58307.getClass(), "maxComboCount", 0);
        setBooleanField(term58307, term58307.getClass(), "isFullCombo", false);
        setBooleanField(term58307, term58307.getClass(), "isAllJustice", false);
        setBooleanField(term58307, term58307.getClass(), "isSuccess", false);
        setIntField(term58307, term58307.getClass(), "fullChain", 0);
        setIntField(term58307, term58307.getClass(), "maxChain", 0);
        setIntField(term58307, term58307.getClass(), "scoreRank", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isSuccess", argTypes, term58307, args);
    }

};


