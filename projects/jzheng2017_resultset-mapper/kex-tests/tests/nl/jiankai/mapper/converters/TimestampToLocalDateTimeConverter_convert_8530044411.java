package nl.jiankai.mapper.converters;

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
import static nl.jiankai.mapper.converters.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TimestampToLocalDateTimeConverter_convert_8530044411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17;
     Object term18;

    public TimestampToLocalDateTimeConverter_convert_8530044411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17 = newInstance(Class.forName("nl.jiankai.mapper.converters.TimestampToLocalDateTimeConverter"));
        term18 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term18, term18.getClass(), "nanos", 244000000);
        setLongField(term18, term18.getClass(), "fastTime", 1345860612000L);
        setField(term18, term18.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nl.jiankai.mapper.converters.TimestampToLocalDateTimeConverter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.sql.Timestamp");
        Object[] args = new Object[1];
        args[0] = term18;
        callMethod(klass, "convert", argTypes, term17, args);
    }

};


