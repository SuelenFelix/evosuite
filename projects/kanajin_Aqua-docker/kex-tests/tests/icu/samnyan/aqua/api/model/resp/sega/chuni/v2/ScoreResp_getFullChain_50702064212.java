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

public class ScoreResp_getFullChain_50702064212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52547;

    public ScoreResp_getFullChain_50702064212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52547 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp"));
        setIntField(term52547, term52547.getClass(), "musicId", -1633292626);
        setIntField(term52547, term52547.getClass(), "level", 689769597);
        setIntField(term52547, term52547.getClass(), "playCount", -1219602723);
        setIntField(term52547, term52547.getClass(), "scoreMax", 1668201364);
        setIntField(term52547, term52547.getClass(), "resRequestCount", -548343635);
        setIntField(term52547, term52547.getClass(), "resAcceptCount", -590979324);
        setIntField(term52547, term52547.getClass(), "resSuccessCount", -1745427158);
        setIntField(term52547, term52547.getClass(), "missCount", 1516032954);
        setIntField(term52547, term52547.getClass(), "maxComboCount", -1945165354);
        setBooleanField(term52547, term52547.getClass(), "isFullCombo", true);
        setBooleanField(term52547, term52547.getClass(), "isAllJustice", false);
        setBooleanField(term52547, term52547.getClass(), "isSuccess", false);
        setIntField(term52547, term52547.getClass(), "fullChain", 14341670);
        setIntField(term52547, term52547.getClass(), "maxChain", -144022361);
        setIntField(term52547, term52547.getClass(), "scoreRank", -1419212893);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFullChain", argTypes, term52547, args);
    }

};


