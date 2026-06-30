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

public class ScoreResp_toString_124494130333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52915;

    public ScoreResp_toString_124494130333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52915 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp"));
        setIntField(term52915, term52915.getClass(), "musicId", 1247519674);
        setIntField(term52915, term52915.getClass(), "level", -460205484);
        setIntField(term52915, term52915.getClass(), "playCount", -1144163240);
        setIntField(term52915, term52915.getClass(), "scoreMax", 2135238175);
        setIntField(term52915, term52915.getClass(), "resRequestCount", -407365393);
        setIntField(term52915, term52915.getClass(), "resAcceptCount", 1408195458);
        setIntField(term52915, term52915.getClass(), "resSuccessCount", 1129173756);
        setIntField(term52915, term52915.getClass(), "missCount", 267573446);
        setIntField(term52915, term52915.getClass(), "maxComboCount", -1319954987);
        setBooleanField(term52915, term52915.getClass(), "isFullCombo", true);
        setBooleanField(term52915, term52915.getClass(), "isAllJustice", true);
        setBooleanField(term52915, term52915.getClass(), "isSuccess", false);
        setIntField(term52915, term52915.getClass(), "fullChain", 701324276);
        setIntField(term52915, term52915.getClass(), "maxChain", -2141408767);
        setIntField(term52915, term52915.getClass(), "scoreRank", 2033366485);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term52915, args);
    }

};


