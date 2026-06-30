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
import java.lang.Long;

public class PlayerContest_setId_48631054432 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55949;
     Object term55955;

    public PlayerContest_setId_48631054432() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55949 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerContest"));
        setLongField(term55949, term55949.getClass(), "id", 0L);
        setField(term55949, term55949.getClass(), "pdId", null);
        setIntField(term55949, term55949.getClass(), "contestId", 0);
        setIntField(term55949, term55949.getClass(), "startCount", 0);
        setField(term55949, term55949.getClass(), "resultRank", null);
        setIntField(term55949, term55949.getClass(), "bestValue", 0);
        setIntField(term55949, term55949.getClass(), "flag", 0);
        setField(term55949, term55949.getClass(), "lastUpdateTime", null);
        term55955 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerContest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term55955;
        callMethod(klass, "setId", argTypes, term55949, args);
    }

};


