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

public class PlayerContest_setPdId_59801553933 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55957;

    public PlayerContest_setPdId_59801553933() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55957 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerContest"));
        setLongField(term55957, term55957.getClass(), "id", 0L);
        setField(term55957, term55957.getClass(), "pdId", null);
        setIntField(term55957, term55957.getClass(), "contestId", 0);
        setIntField(term55957, term55957.getClass(), "startCount", 0);
        setField(term55957, term55957.getClass(), "resultRank", null);
        setIntField(term55957, term55957.getClass(), "bestValue", 0);
        setIntField(term55957, term55957.getClass(), "flag", 0);
        setField(term55957, term55957.getClass(), "lastUpdateTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerContest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPdId", argTypes, term55957, args);
    }

};


