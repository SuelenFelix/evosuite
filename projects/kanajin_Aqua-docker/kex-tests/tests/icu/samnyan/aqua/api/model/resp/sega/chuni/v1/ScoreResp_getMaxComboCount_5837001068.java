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

public class ScoreResp_getMaxComboCount_5837001068 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57653;

    public ScoreResp_getMaxComboCount_5837001068() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57653 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp"));
        setIntField(term57653, term57653.getClass(), "musicId", -1374118535);
        setIntField(term57653, term57653.getClass(), "level", 2009032714);
        setIntField(term57653, term57653.getClass(), "playCount", -1630891015);
        setIntField(term57653, term57653.getClass(), "scoreMax", 904551854);
        setIntField(term57653, term57653.getClass(), "resRequestCount", -49272576);
        setIntField(term57653, term57653.getClass(), "resAcceptCount", 246585268);
        setIntField(term57653, term57653.getClass(), "resSuccessCount", 1163312144);
        setIntField(term57653, term57653.getClass(), "missCount", 1010014762);
        setIntField(term57653, term57653.getClass(), "maxComboCount", -416886439);
        setBooleanField(term57653, term57653.getClass(), "isFullCombo", false);
        setBooleanField(term57653, term57653.getClass(), "isAllJustice", true);
        setBooleanField(term57653, term57653.getClass(), "isSuccess", true);
        setIntField(term57653, term57653.getClass(), "fullChain", -1632599980);
        setIntField(term57653, term57653.getClass(), "maxChain", -445306395);
        setIntField(term57653, term57653.getClass(), "scoreRank", -1543037055);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxComboCount", argTypes, term57653, args);
    }

};


