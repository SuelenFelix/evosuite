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

public class DatePair_toString_8829900737 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term980;

    public DatePair_toString_8829900737() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term980 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term981 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term982 = newInstance(Class.forName("java.time.LocalDate"));
        Object term986 = newInstance(Class.forName("java.time.LocalTime"));
        Object term991 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term992 = newInstance(Class.forName("java.time.LocalDate"));
        Object term996 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term982, term982.getClass(), "year", 2011);
        setShortField(term982, term982.getClass(), "month", (short) 4);
        setShortField(term982, term982.getClass(), "day", (short) 19);
        setField(term981, term981.getClass(), "date", term982);
        setByteField(term986, term986.getClass(), "hour", (byte) 12);
        setByteField(term986, term986.getClass(), "minute", (byte) 0);
        setByteField(term986, term986.getClass(), "second", (byte) 14);
        setIntField(term986, term986.getClass(), "nano", 849079063);
        setField(term981, term981.getClass(), "time", term986);
        setField(term980, term980.getClass(), "Start", term981);
        setIntField(term992, term992.getClass(), "year", 2014);
        setShortField(term992, term992.getClass(), "month", (short) 8);
        setShortField(term992, term992.getClass(), "day", (short) 17);
        setField(term991, term991.getClass(), "date", term992);
        setByteField(term996, term996.getClass(), "hour", (byte) 19);
        setByteField(term996, term996.getClass(), "minute", (byte) 32);
        setByteField(term996, term996.getClass(), "second", (byte) 5);
        setIntField(term996, term996.getClass(), "nano", 604713831);
        setField(term991, term991.getClass(), "time", term996);
        setField(term980, term980.getClass(), "End", term991);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term980, args);
    }

};


