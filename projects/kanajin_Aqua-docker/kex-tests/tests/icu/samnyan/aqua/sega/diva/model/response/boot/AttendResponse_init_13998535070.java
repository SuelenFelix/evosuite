package icu.samnyan.aqua.sega.diva.model.response.boot;

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
import static icu.samnyan.aqua.sega.diva.model.response.boot.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class AttendResponse_init_13998535070 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73;

    public AttendResponse_init_13998535070() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term74 = newInstance(Class.forName("java.time.LocalDate"));
        Object term78 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term74, term74.getClass(), "year", 2012);
        setShortField(term74, term74.getClass(), "month", (short) 8);
        setShortField(term74, term74.getClass(), "day", (short) 25);
        setField(term73, term73.getClass(), "date", term74);
        setByteField(term78, term78.getClass(), "hour", (byte) 5);
        setByteField(term78, term78.getClass(), "minute", (byte) 20);
        setByteField(term78, term78.getClass(), "second", (byte) 50);
        setIntField(term78, term78.getClass(), "nano", 345595912);
        setField(term73, term73.getClass(), "time", term78);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.boot.AttendResponse");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = Class.forName("java.lang.String");
        argTypes[6] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[7];
        args[0] = "PAEBtnZtTD";
        args[1] = "sjlJAEtRrb";
        args[2] = "MuLcgQHgqz";
        args[3] = "xxtlPwDYFs";
        args[4] = "jJCZpVmanW";
        args[5] = "EGtDIRbSSb";
        args[6] = term73;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


