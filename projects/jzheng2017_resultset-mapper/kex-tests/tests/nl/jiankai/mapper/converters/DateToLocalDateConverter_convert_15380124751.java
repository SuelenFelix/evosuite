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

public class DateToLocalDateConverter_convert_15380124751 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;

    public DateToLocalDateConverter_convert_15380124751() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("nl.jiankai.mapper.converters.DateToLocalDateConverter"));
        term2 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term2, term2.getClass(), "fastTime", 1345871412244L);
        setField(term2, term2.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nl.jiankai.mapper.converters.DateToLocalDateConverter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.sql.Date");
        Object[] args = new Object[1];
        args[0] = term2;
        callMethod(klass, "convert", argTypes, term1, args);
    }

};


