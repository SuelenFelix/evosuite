package icu.samnyan.aqua.api.model.req.sega.diva;

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
import static icu.samnyan.aqua.api.model.req.sega.diva.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class DatePair_hashCode_13937497636 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term959;

    public DatePair_hashCode_13937497636() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term959 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term960 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term961 = newInstance(Class.forName("java.time.LocalDate"));
        Object term965 = newInstance(Class.forName("java.time.LocalTime"));
        Object term970 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term971 = newInstance(Class.forName("java.time.LocalDate"));
        Object term975 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term961, term961.getClass(), "year", 2020);
        setShortField(term961, term961.getClass(), "month", (short) 8);
        setShortField(term961, term961.getClass(), "day", (short) 16);
        setField(term960, term960.getClass(), "date", term961);
        setByteField(term965, term965.getClass(), "hour", (byte) 4);
        setByteField(term965, term965.getClass(), "minute", (byte) 37);
        setByteField(term965, term965.getClass(), "second", (byte) 19);
        setIntField(term965, term965.getClass(), "nano", 605410923);
        setField(term960, term960.getClass(), "time", term965);
        setField(term959, term959.getClass(), "Start", term960);
        setIntField(term971, term971.getClass(), "year", 2028);
        setShortField(term971, term971.getClass(), "month", (short) 5);
        setShortField(term971, term971.getClass(), "day", (short) 2);
        setField(term970, term970.getClass(), "date", term971);
        setByteField(term975, term975.getClass(), "hour", (byte) 2);
        setByteField(term975, term975.getClass(), "minute", (byte) 59);
        setByteField(term975, term975.getClass(), "second", (byte) 30);
        setIntField(term975, term975.getClass(), "nano", 222274238);
        setField(term970, term970.getClass(), "time", term975);
        setField(term959, term959.getClass(), "End", term970);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term959, args);
    }

};


