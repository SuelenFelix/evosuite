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

public class ScoreResp_equals_207530494930 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58035;
     Object term58051;

    public ScoreResp_equals_207530494930() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58035 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp"));
        setIntField(term58035, term58035.getClass(), "musicId", 472692952);
        setIntField(term58035, term58035.getClass(), "level", 140138500);
        setIntField(term58035, term58035.getClass(), "playCount", -244584643);
        setIntField(term58035, term58035.getClass(), "scoreMax", 1557955716);
        setIntField(term58035, term58035.getClass(), "resRequestCount", -1628863633);
        setIntField(term58035, term58035.getClass(), "resAcceptCount", -450265927);
        setIntField(term58035, term58035.getClass(), "resSuccessCount", 914533606);
        setIntField(term58035, term58035.getClass(), "missCount", 1857214977);
        setIntField(term58035, term58035.getClass(), "maxComboCount", 756946672);
        setBooleanField(term58035, term58035.getClass(), "isFullCombo", false);
        setBooleanField(term58035, term58035.getClass(), "isAllJustice", false);
        setBooleanField(term58035, term58035.getClass(), "isSuccess", false);
        setIntField(term58035, term58035.getClass(), "fullChain", 1363323545);
        setIntField(term58035, term58035.getClass(), "maxChain", -1090735178);
        setIntField(term58035, term58035.getClass(), "scoreRank", -651624649);
        term58051 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term58051;
        callMethod(klass, "equals", argTypes, term58035, args);
    }

};


