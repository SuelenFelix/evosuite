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
import java.lang.Integer;

public class PlayerContest_setFlag_203333712138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55993;
     Object term55999;

    public PlayerContest_setFlag_203333712138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55993 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerContest"));
        setLongField(term55993, term55993.getClass(), "id", 0L);
        setField(term55993, term55993.getClass(), "pdId", null);
        setIntField(term55993, term55993.getClass(), "contestId", 0);
        setIntField(term55993, term55993.getClass(), "startCount", 0);
        setField(term55993, term55993.getClass(), "resultRank", null);
        setIntField(term55993, term55993.getClass(), "bestValue", 0);
        setIntField(term55993, term55993.getClass(), "flag", 0);
        setField(term55993, term55993.getClass(), "lastUpdateTime", null);
        term55999 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerContest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term55999;
        callMethod(klass, "setFlag", argTypes, term55993, args);
    }

};


