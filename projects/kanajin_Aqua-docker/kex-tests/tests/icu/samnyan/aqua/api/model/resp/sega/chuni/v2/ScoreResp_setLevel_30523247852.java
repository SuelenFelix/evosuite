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
import java.lang.Integer;

public class ScoreResp_setLevel_30523247852 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53219;
     Object term53235;

    public ScoreResp_setLevel_30523247852() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53219 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp"));
        setIntField(term53219, term53219.getClass(), "musicId", 0);
        setIntField(term53219, term53219.getClass(), "level", 0);
        setIntField(term53219, term53219.getClass(), "playCount", 0);
        setIntField(term53219, term53219.getClass(), "scoreMax", 0);
        setIntField(term53219, term53219.getClass(), "resRequestCount", 0);
        setIntField(term53219, term53219.getClass(), "resAcceptCount", 0);
        setIntField(term53219, term53219.getClass(), "resSuccessCount", 0);
        setIntField(term53219, term53219.getClass(), "missCount", 0);
        setIntField(term53219, term53219.getClass(), "maxComboCount", 0);
        setBooleanField(term53219, term53219.getClass(), "isFullCombo", false);
        setBooleanField(term53219, term53219.getClass(), "isAllJustice", false);
        setBooleanField(term53219, term53219.getClass(), "isSuccess", false);
        setIntField(term53219, term53219.getClass(), "fullChain", 0);
        setIntField(term53219, term53219.getClass(), "maxChain", 0);
        setIntField(term53219, term53219.getClass(), "scoreRank", 0);
        term53235 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term53235;
        callMethod(klass, "setLevel", argTypes, term53219, args);
    }

};


