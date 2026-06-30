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

public class ScoreResp_canEqual_141549971831 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58052;
     Object term58068;

    public ScoreResp_canEqual_141549971831() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58052 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp"));
        setIntField(term58052, term58052.getClass(), "musicId", -888494532);
        setIntField(term58052, term58052.getClass(), "level", 284122377);
        setIntField(term58052, term58052.getClass(), "playCount", 1577003230);
        setIntField(term58052, term58052.getClass(), "scoreMax", -2042495274);
        setIntField(term58052, term58052.getClass(), "resRequestCount", 35579148);
        setIntField(term58052, term58052.getClass(), "resAcceptCount", -77377900);
        setIntField(term58052, term58052.getClass(), "resSuccessCount", 199979610);
        setIntField(term58052, term58052.getClass(), "missCount", -605796164);
        setIntField(term58052, term58052.getClass(), "maxComboCount", -931072478);
        setBooleanField(term58052, term58052.getClass(), "isFullCombo", false);
        setBooleanField(term58052, term58052.getClass(), "isAllJustice", false);
        setBooleanField(term58052, term58052.getClass(), "isSuccess", true);
        setIntField(term58052, term58052.getClass(), "fullChain", 2032311568);
        setIntField(term58052, term58052.getClass(), "maxChain", 92598850);
        setIntField(term58052, term58052.getClass(), "scoreRank", 1856498878);
        term58068 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term58068;
        callMethod(klass, "canEqual", argTypes, term58052, args);
    }

};


