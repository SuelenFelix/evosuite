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

public class ModuleEntry_toString_182647802315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4228710;

    public ModuleEntry_toString_182647802315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4228710 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.ModuleEntry"));
        Object term4228725 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4228726 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4228730 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4228735 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4228736 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4228740 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term4228710, term4228710.getClass(), "ID", -1897700735);
        setField(term4228710, term4228710.getClass(), "Name", "lFyoHDLrGU");
        setIntField(term4228710, term4228710.getClass(), "Price", 1103091266);
        setIntField(term4228726, term4228726.getClass(), "year", 2012);
        setShortField(term4228726, term4228726.getClass(), "month", (short) 2);
        setShortField(term4228726, term4228726.getClass(), "day", (short) 8);
        setField(term4228725, term4228725.getClass(), "date", term4228726);
        setByteField(term4228730, term4228730.getClass(), "hour", (byte) 19);
        setByteField(term4228730, term4228730.getClass(), "minute", (byte) 59);
        setByteField(term4228730, term4228730.getClass(), "second", (byte) 34);
        setIntField(term4228730, term4228730.getClass(), "nano", 632683824);
        setField(term4228725, term4228725.getClass(), "time", term4228730);
        setField(term4228710, term4228710.getClass(), "ReleaseDate", term4228725);
        setIntField(term4228736, term4228736.getClass(), "year", 2023);
        setShortField(term4228736, term4228736.getClass(), "month", (short) 7);
        setShortField(term4228736, term4228736.getClass(), "day", (short) 7);
        setField(term4228735, term4228735.getClass(), "date", term4228736);
        setByteField(term4228740, term4228740.getClass(), "hour", (byte) 4);
        setByteField(term4228740, term4228740.getClass(), "minute", (byte) 35);
        setByteField(term4228740, term4228740.getClass(), "second", (byte) 40);
        setIntField(term4228740, term4228740.getClass(), "nano", 467553907);
        setField(term4228735, term4228735.getClass(), "time", term4228740);
        setField(term4228710, term4228710.getClass(), "EndDate", term4228735);
        setIntField(term4228710, term4228710.getClass(), "SortOrder", -816618839);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.ModuleEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term4228710, args);
    }

};


