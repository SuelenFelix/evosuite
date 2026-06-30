package icu.samnyan.aqua.sega.chunithm.model.gamedata;

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
import static icu.samnyan.aqua.sega.chunithm.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class GameMessage_getMessage_1414852882 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13661;

    public GameMessage_getMessage_1414852882() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13661 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameMessage"));
        Object term13676 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13677 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13681 = newInstance(Class.forName("java.time.LocalTime"));
        Object term13686 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13687 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13691 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term13661, term13661.getClass(), "id", 1065595802);
        setIntField(term13661, term13661.getClass(), "type", 21031843);
        setField(term13661, term13661.getClass(), "message", "VUkRVwROTl");
        setIntField(term13677, term13677.getClass(), "year", 2012);
        setShortField(term13677, term13677.getClass(), "month", (short) 5);
        setShortField(term13677, term13677.getClass(), "day", (short) 25);
        setField(term13676, term13676.getClass(), "date", term13677);
        setByteField(term13681, term13681.getClass(), "hour", (byte) 5);
        setByteField(term13681, term13681.getClass(), "minute", (byte) 8);
        setByteField(term13681, term13681.getClass(), "second", (byte) 47);
        setIntField(term13681, term13681.getClass(), "nano", 455554221);
        setField(term13676, term13676.getClass(), "time", term13681);
        setField(term13661, term13661.getClass(), "startDate", term13676);
        setIntField(term13687, term13687.getClass(), "year", 2029);
        setShortField(term13687, term13687.getClass(), "month", (short) 11);
        setShortField(term13687, term13687.getClass(), "day", (short) 18);
        setField(term13686, term13686.getClass(), "date", term13687);
        setByteField(term13691, term13691.getClass(), "hour", (byte) 5);
        setByteField(term13691, term13691.getClass(), "minute", (byte) 36);
        setByteField(term13691, term13691.getClass(), "second", (byte) 57);
        setIntField(term13691, term13691.getClass(), "nano", 394167804);
        setField(term13686, term13686.getClass(), "time", term13691);
        setField(term13661, term13661.getClass(), "endDate", term13686);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameMessage");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMessage", argTypes, term13661, args);
    }

};


