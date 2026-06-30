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

public class ScoreResp_canEqual_128641699931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52882;
     Object term52898;

    public ScoreResp_canEqual_128641699931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52882 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp"));
        setIntField(term52882, term52882.getClass(), "musicId", 2136820914);
        setIntField(term52882, term52882.getClass(), "level", -1698291583);
        setIntField(term52882, term52882.getClass(), "playCount", -246710651);
        setIntField(term52882, term52882.getClass(), "scoreMax", -374626618);
        setIntField(term52882, term52882.getClass(), "resRequestCount", 1449690385);
        setIntField(term52882, term52882.getClass(), "resAcceptCount", -1063098623);
        setIntField(term52882, term52882.getClass(), "resSuccessCount", 1519335351);
        setIntField(term52882, term52882.getClass(), "missCount", 1995841517);
        setIntField(term52882, term52882.getClass(), "maxComboCount", -1865261069);
        setBooleanField(term52882, term52882.getClass(), "isFullCombo", false);
        setBooleanField(term52882, term52882.getClass(), "isAllJustice", false);
        setBooleanField(term52882, term52882.getClass(), "isSuccess", true);
        setIntField(term52882, term52882.getClass(), "fullChain", 159666228);
        setIntField(term52882, term52882.getClass(), "maxChain", -1706840691);
        setIntField(term52882, term52882.getClass(), "scoreRank", -722277466);
        term52898 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term52898;
        callMethod(klass, "canEqual", argTypes, term52882, args);
    }

};


