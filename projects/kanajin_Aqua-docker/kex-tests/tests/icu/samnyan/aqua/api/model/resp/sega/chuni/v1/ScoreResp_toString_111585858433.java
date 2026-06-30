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

public class ScoreResp_toString_111585858433 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58085;

    public ScoreResp_toString_111585858433() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58085 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp"));
        setIntField(term58085, term58085.getClass(), "musicId", 863863650);
        setIntField(term58085, term58085.getClass(), "level", 326665488);
        setIntField(term58085, term58085.getClass(), "playCount", -556521634);
        setIntField(term58085, term58085.getClass(), "scoreMax", -904069976);
        setIntField(term58085, term58085.getClass(), "resRequestCount", 1492540298);
        setIntField(term58085, term58085.getClass(), "resAcceptCount", 751340602);
        setIntField(term58085, term58085.getClass(), "resSuccessCount", 123770182);
        setIntField(term58085, term58085.getClass(), "missCount", -813178856);
        setIntField(term58085, term58085.getClass(), "maxComboCount", 1591732055);
        setBooleanField(term58085, term58085.getClass(), "isFullCombo", true);
        setBooleanField(term58085, term58085.getClass(), "isAllJustice", true);
        setBooleanField(term58085, term58085.getClass(), "isSuccess", false);
        setIntField(term58085, term58085.getClass(), "fullChain", -1580446775);
        setIntField(term58085, term58085.getClass(), "maxChain", -1008507790);
        setIntField(term58085, term58085.getClass(), "scoreRank", -1382203900);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term58085, args);
    }

};


