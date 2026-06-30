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

public class ScoreResp_setLevel_30523247816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52613;
     Object term52629;

    public ScoreResp_setLevel_30523247816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52613 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp"));
        setIntField(term52613, term52613.getClass(), "musicId", -1583672247);
        setIntField(term52613, term52613.getClass(), "level", 1150713854);
        setIntField(term52613, term52613.getClass(), "playCount", 999843869);
        setIntField(term52613, term52613.getClass(), "scoreMax", 1047162942);
        setIntField(term52613, term52613.getClass(), "resRequestCount", 555668629);
        setIntField(term52613, term52613.getClass(), "resAcceptCount", -704789127);
        setIntField(term52613, term52613.getClass(), "resSuccessCount", 2018335018);
        setIntField(term52613, term52613.getClass(), "missCount", 524629103);
        setIntField(term52613, term52613.getClass(), "maxComboCount", 601775827);
        setBooleanField(term52613, term52613.getClass(), "isFullCombo", true);
        setBooleanField(term52613, term52613.getClass(), "isAllJustice", true);
        setBooleanField(term52613, term52613.getClass(), "isSuccess", true);
        setIntField(term52613, term52613.getClass(), "fullChain", 1713144877);
        setIntField(term52613, term52613.getClass(), "maxChain", -513074841);
        setIntField(term52613, term52613.getClass(), "scoreRank", -1384079183);
        term52629 = new Integer(-1401413822);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term52629;
        callMethod(klass, "setLevel", argTypes, term52613, args);
    }

};


