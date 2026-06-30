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

public class PlayerContest_setResultRank_125984581736 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55979;

    public PlayerContest_setResultRank_125984581736() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55979 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerContest"));
        setLongField(term55979, term55979.getClass(), "id", 0L);
        setField(term55979, term55979.getClass(), "pdId", null);
        setIntField(term55979, term55979.getClass(), "contestId", 0);
        setIntField(term55979, term55979.getClass(), "startCount", 0);
        setField(term55979, term55979.getClass(), "resultRank", null);
        setIntField(term55979, term55979.getClass(), "bestValue", 0);
        setIntField(term55979, term55979.getClass(), "flag", 0);
        setField(term55979, term55979.getClass(), "lastUpdateTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerContest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setResultRank", argTypes, term55979, args);
    }

};


