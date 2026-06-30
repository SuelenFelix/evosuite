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

public class ScoreResp_getLevel_163520001237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52977;

    public ScoreResp_getLevel_163520001237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52977 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp"));
        setIntField(term52977, term52977.getClass(), "musicId", 0);
        setIntField(term52977, term52977.getClass(), "level", 0);
        setIntField(term52977, term52977.getClass(), "playCount", 0);
        setIntField(term52977, term52977.getClass(), "scoreMax", 0);
        setIntField(term52977, term52977.getClass(), "resRequestCount", 0);
        setIntField(term52977, term52977.getClass(), "resAcceptCount", 0);
        setIntField(term52977, term52977.getClass(), "resSuccessCount", 0);
        setIntField(term52977, term52977.getClass(), "missCount", 0);
        setIntField(term52977, term52977.getClass(), "maxComboCount", 0);
        setBooleanField(term52977, term52977.getClass(), "isFullCombo", false);
        setBooleanField(term52977, term52977.getClass(), "isAllJustice", false);
        setBooleanField(term52977, term52977.getClass(), "isSuccess", false);
        setIntField(term52977, term52977.getClass(), "fullChain", 0);
        setIntField(term52977, term52977.getClass(), "maxChain", 0);
        setIntField(term52977, term52977.getClass(), "scoreRank", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLevel", argTypes, term52977, args);
    }

};


