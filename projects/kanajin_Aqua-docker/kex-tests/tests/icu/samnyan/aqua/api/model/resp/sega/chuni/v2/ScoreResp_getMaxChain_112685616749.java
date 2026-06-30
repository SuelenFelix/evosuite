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

public class ScoreResp_getMaxChain_112685616749 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53169;

    public ScoreResp_getMaxChain_112685616749() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53169 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp"));
        setIntField(term53169, term53169.getClass(), "musicId", 0);
        setIntField(term53169, term53169.getClass(), "level", 0);
        setIntField(term53169, term53169.getClass(), "playCount", 0);
        setIntField(term53169, term53169.getClass(), "scoreMax", 0);
        setIntField(term53169, term53169.getClass(), "resRequestCount", 0);
        setIntField(term53169, term53169.getClass(), "resAcceptCount", 0);
        setIntField(term53169, term53169.getClass(), "resSuccessCount", 0);
        setIntField(term53169, term53169.getClass(), "missCount", 0);
        setIntField(term53169, term53169.getClass(), "maxComboCount", 0);
        setBooleanField(term53169, term53169.getClass(), "isFullCombo", false);
        setBooleanField(term53169, term53169.getClass(), "isAllJustice", false);
        setBooleanField(term53169, term53169.getClass(), "isSuccess", false);
        setIntField(term53169, term53169.getClass(), "fullChain", 0);
        setIntField(term53169, term53169.getClass(), "maxChain", 0);
        setIntField(term53169, term53169.getClass(), "scoreRank", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxChain", argTypes, term53169, args);
    }

};


