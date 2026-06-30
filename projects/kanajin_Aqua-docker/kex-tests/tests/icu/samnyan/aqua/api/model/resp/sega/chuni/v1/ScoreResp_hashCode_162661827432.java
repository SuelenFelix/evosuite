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

public class ScoreResp_hashCode_162661827432 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58069;

    public ScoreResp_hashCode_162661827432() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58069 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp"));
        setIntField(term58069, term58069.getClass(), "musicId", 274237632);
        setIntField(term58069, term58069.getClass(), "level", -1033663489);
        setIntField(term58069, term58069.getClass(), "playCount", 476488543);
        setIntField(term58069, term58069.getClass(), "scoreMax", -1626915417);
        setIntField(term58069, term58069.getClass(), "resRequestCount", 665442653);
        setIntField(term58069, term58069.getClass(), "resAcceptCount", 803178808);
        setIntField(term58069, term58069.getClass(), "resSuccessCount", 1767729920);
        setIntField(term58069, term58069.getClass(), "missCount", -154656640);
        setIntField(term58069, term58069.getClass(), "maxComboCount", 638814614);
        setBooleanField(term58069, term58069.getClass(), "isFullCombo", false);
        setBooleanField(term58069, term58069.getClass(), "isAllJustice", true);
        setBooleanField(term58069, term58069.getClass(), "isSuccess", false);
        setIntField(term58069, term58069.getClass(), "fullChain", 832395207);
        setIntField(term58069, term58069.getClass(), "maxChain", 1161114638);
        setIntField(term58069, term58069.getClass(), "scoreRank", -1391162351);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term58069, args);
    }

};


