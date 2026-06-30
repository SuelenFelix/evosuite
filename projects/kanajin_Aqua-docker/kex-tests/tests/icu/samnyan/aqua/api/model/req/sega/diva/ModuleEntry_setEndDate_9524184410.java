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

public class ModuleEntry_setEndDate_9524184410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4228466;
     Object term4228502;

    public ModuleEntry_setEndDate_9524184410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4228466 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.ModuleEntry"));
        Object term4228481 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4228482 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4228486 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4228491 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4228492 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4228496 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term4228466, term4228466.getClass(), "ID", 1167373587);
        setField(term4228466, term4228466.getClass(), "Name", "jfYdEXnJlB");
        setIntField(term4228466, term4228466.getClass(), "Price", 96365997);
        setIntField(term4228482, term4228482.getClass(), "year", 2019);
        setShortField(term4228482, term4228482.getClass(), "month", (short) 5);
        setShortField(term4228482, term4228482.getClass(), "day", (short) 26);
        setField(term4228481, term4228481.getClass(), "date", term4228482);
        setByteField(term4228486, term4228486.getClass(), "hour", (byte) 6);
        setByteField(term4228486, term4228486.getClass(), "minute", (byte) 41);
        setByteField(term4228486, term4228486.getClass(), "second", (byte) 0);
        setIntField(term4228486, term4228486.getClass(), "nano", 858013234);
        setField(term4228481, term4228481.getClass(), "time", term4228486);
        setField(term4228466, term4228466.getClass(), "ReleaseDate", term4228481);
        setIntField(term4228492, term4228492.getClass(), "year", 2024);
        setShortField(term4228492, term4228492.getClass(), "month", (short) 7);
        setShortField(term4228492, term4228492.getClass(), "day", (short) 7);
        setField(term4228491, term4228491.getClass(), "date", term4228492);
        setByteField(term4228496, term4228496.getClass(), "hour", (byte) 12);
        setByteField(term4228496, term4228496.getClass(), "minute", (byte) 34);
        setByteField(term4228496, term4228496.getClass(), "second", (byte) 14);
        setIntField(term4228496, term4228496.getClass(), "nano", 120775006);
        setField(term4228491, term4228491.getClass(), "time", term4228496);
        setField(term4228466, term4228466.getClass(), "EndDate", term4228491);
        setIntField(term4228466, term4228466.getClass(), "SortOrder", -477732358);
        term4228502 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4228503 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4228507 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term4228503, term4228503.getClass(), "year", 2022);
        setShortField(term4228503, term4228503.getClass(), "month", (short) 5);
        setShortField(term4228503, term4228503.getClass(), "day", (short) 24);
        setField(term4228502, term4228502.getClass(), "date", term4228503);
        setByteField(term4228507, term4228507.getClass(), "hour", (byte) 6);
        setByteField(term4228507, term4228507.getClass(), "minute", (byte) 37);
        setByteField(term4228507, term4228507.getClass(), "second", (byte) 34);
        setIntField(term4228507, term4228507.getClass(), "nano", 555789131);
        setField(term4228502, term4228502.getClass(), "time", term4228507);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.ModuleEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term4228502;
        callMethod(klass, "setEndDate", argTypes, term4228466, args);
    }

};


