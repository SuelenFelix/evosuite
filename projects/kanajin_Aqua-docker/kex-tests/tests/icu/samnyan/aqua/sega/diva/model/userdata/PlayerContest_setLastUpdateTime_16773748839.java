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

public class PlayerContest_setLastUpdateTime_16773748839 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56001;

    public PlayerContest_setLastUpdateTime_16773748839() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56001 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerContest"));
        setLongField(term56001, term56001.getClass(), "id", 0L);
        setField(term56001, term56001.getClass(), "pdId", null);
        setIntField(term56001, term56001.getClass(), "contestId", 0);
        setIntField(term56001, term56001.getClass(), "startCount", 0);
        setField(term56001, term56001.getClass(), "resultRank", null);
        setIntField(term56001, term56001.getClass(), "bestValue", 0);
        setIntField(term56001, term56001.getClass(), "flag", 0);
        setField(term56001, term56001.getClass(), "lastUpdateTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerContest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLastUpdateTime", argTypes, term56001, args);
    }

};


