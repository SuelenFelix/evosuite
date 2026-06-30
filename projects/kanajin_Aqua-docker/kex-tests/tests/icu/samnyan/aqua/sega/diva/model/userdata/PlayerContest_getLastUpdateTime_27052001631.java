package icu.samnyan.aqua.sega.diva.model.userdata;

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
import static icu.samnyan.aqua.sega.diva.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PlayerContest_getLastUpdateTime_27052001631 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55943;

    public PlayerContest_getLastUpdateTime_27052001631() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55943 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerContest"));
        setLongField(term55943, term55943.getClass(), "id", 0L);
        setField(term55943, term55943.getClass(), "pdId", null);
        setIntField(term55943, term55943.getClass(), "contestId", 0);
        setIntField(term55943, term55943.getClass(), "startCount", 0);
        setField(term55943, term55943.getClass(), "resultRank", null);
        setIntField(term55943, term55943.getClass(), "bestValue", 0);
        setIntField(term55943, term55943.getClass(), "flag", 0);
        setField(term55943, term55943.getClass(), "lastUpdateTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerContest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastUpdateTime", argTypes, term55943, args);
    }

};


