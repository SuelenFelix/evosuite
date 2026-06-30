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
import java.lang.Integer;

public class ModuleEntry_setPrice_11439347578 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4228362;
     Object term4228398;

    public ModuleEntry_setPrice_11439347578() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4228362 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.ModuleEntry"));
        Object term4228377 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4228378 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4228382 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4228387 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4228388 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4228392 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term4228362, term4228362.getClass(), "ID", -1355640754);
        setField(term4228362, term4228362.getClass(), "Name", "rZgQSdncNj");
        setIntField(term4228362, term4228362.getClass(), "Price", -2026000057);
        setIntField(term4228378, term4228378.getClass(), "year", 2017);
        setShortField(term4228378, term4228378.getClass(), "month", (short) 4);
        setShortField(term4228378, term4228378.getClass(), "day", (short) 29);
        setField(term4228377, term4228377.getClass(), "date", term4228378);
        setByteField(term4228382, term4228382.getClass(), "hour", (byte) 16);
        setByteField(term4228382, term4228382.getClass(), "minute", (byte) 1);
        setByteField(term4228382, term4228382.getClass(), "second", (byte) 22);
        setIntField(term4228382, term4228382.getClass(), "nano", 793483540);
        setField(term4228377, term4228377.getClass(), "time", term4228382);
        setField(term4228362, term4228362.getClass(), "ReleaseDate", term4228377);
        setIntField(term4228388, term4228388.getClass(), "year", 2020);
        setShortField(term4228388, term4228388.getClass(), "month", (short) 8);
        setShortField(term4228388, term4228388.getClass(), "day", (short) 7);
        setField(term4228387, term4228387.getClass(), "date", term4228388);
        setByteField(term4228392, term4228392.getClass(), "hour", (byte) 0);
        setByteField(term4228392, term4228392.getClass(), "minute", (byte) 49);
        setByteField(term4228392, term4228392.getClass(), "second", (byte) 38);
        setIntField(term4228392, term4228392.getClass(), "nano", 331464699);
        setField(term4228387, term4228387.getClass(), "time", term4228392);
        setField(term4228362, term4228362.getClass(), "EndDate", term4228387);
        setIntField(term4228362, term4228362.getClass(), "SortOrder", 1337678557);
        term4228398 = new Integer(1872035758);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.ModuleEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4228398;
        callMethod(klass, "setPrice", argTypes, term4228362, args);
    }

};


