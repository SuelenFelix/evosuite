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

public class ScoreResp_getResRequestCount_20422980004 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52419;

    public ScoreResp_getResRequestCount_20422980004() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52419 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp"));
        setIntField(term52419, term52419.getClass(), "musicId", -2045566233);
        setIntField(term52419, term52419.getClass(), "level", 102632361);
        setIntField(term52419, term52419.getClass(), "playCount", -871963633);
        setIntField(term52419, term52419.getClass(), "scoreMax", -572352492);
        setIntField(term52419, term52419.getClass(), "resRequestCount", -583361854);
        setIntField(term52419, term52419.getClass(), "resAcceptCount", 717140857);
        setIntField(term52419, term52419.getClass(), "resSuccessCount", 891889211);
        setIntField(term52419, term52419.getClass(), "missCount", 265502816);
        setIntField(term52419, term52419.getClass(), "maxComboCount", -1730476579);
        setBooleanField(term52419, term52419.getClass(), "isFullCombo", false);
        setBooleanField(term52419, term52419.getClass(), "isAllJustice", true);
        setBooleanField(term52419, term52419.getClass(), "isSuccess", true);
        setIntField(term52419, term52419.getClass(), "fullChain", -1501333599);
        setIntField(term52419, term52419.getClass(), "maxChain", 1525193088);
        setIntField(term52419, term52419.getClass(), "scoreRank", 1734906845);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getResRequestCount", argTypes, term52419, args);
    }

};


