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

public class PlayerContest_setStartCount_88967981035 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55971;
     Object term55977;

    public PlayerContest_setStartCount_88967981035() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55971 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerContest"));
        setLongField(term55971, term55971.getClass(), "id", 0L);
        setField(term55971, term55971.getClass(), "pdId", null);
        setIntField(term55971, term55971.getClass(), "contestId", 0);
        setIntField(term55971, term55971.getClass(), "startCount", 0);
        setField(term55971, term55971.getClass(), "resultRank", null);
        setIntField(term55971, term55971.getClass(), "bestValue", 0);
        setIntField(term55971, term55971.getClass(), "flag", 0);
        setField(term55971, term55971.getClass(), "lastUpdateTime", null);
        term55977 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerContest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term55977;
        callMethod(klass, "setStartCount", argTypes, term55971, args);
    }

};


