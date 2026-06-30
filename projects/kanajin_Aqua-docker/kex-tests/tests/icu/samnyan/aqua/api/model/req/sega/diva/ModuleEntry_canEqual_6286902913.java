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

public class ModuleEntry_canEqual_6286902913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4228617;
     Object term4228653;

    public ModuleEntry_canEqual_6286902913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4228617 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.ModuleEntry"));
        Object term4228632 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4228633 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4228637 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4228642 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4228643 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4228647 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term4228617, term4228617.getClass(), "ID", -1295733321);
        setField(term4228617, term4228617.getClass(), "Name", "RrUlXReJIw");
        setIntField(term4228617, term4228617.getClass(), "Price", 1302072562);
        setIntField(term4228633, term4228633.getClass(), "year", 2010);
        setShortField(term4228633, term4228633.getClass(), "month", (short) 11);
        setShortField(term4228633, term4228633.getClass(), "day", (short) 19);
        setField(term4228632, term4228632.getClass(), "date", term4228633);
        setByteField(term4228637, term4228637.getClass(), "hour", (byte) 23);
        setByteField(term4228637, term4228637.getClass(), "minute", (byte) 59);
        setByteField(term4228637, term4228637.getClass(), "second", (byte) 24);
        setIntField(term4228637, term4228637.getClass(), "nano", 909424028);
        setField(term4228632, term4228632.getClass(), "time", term4228637);
        setField(term4228617, term4228617.getClass(), "ReleaseDate", term4228632);
        setIntField(term4228643, term4228643.getClass(), "year", 2028);
        setShortField(term4228643, term4228643.getClass(), "month", (short) 1);
        setShortField(term4228643, term4228643.getClass(), "day", (short) 16);
        setField(term4228642, term4228642.getClass(), "date", term4228643);
        setByteField(term4228647, term4228647.getClass(), "hour", (byte) 18);
        setByteField(term4228647, term4228647.getClass(), "minute", (byte) 7);
        setByteField(term4228647, term4228647.getClass(), "second", (byte) 21);
        setIntField(term4228647, term4228647.getClass(), "nano", 54434785);
        setField(term4228642, term4228642.getClass(), "time", term4228647);
        setField(term4228617, term4228617.getClass(), "EndDate", term4228642);
        setIntField(term4228617, term4228617.getClass(), "SortOrder", -635524377);
        term4228653 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.ModuleEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term4228653;
        callMethod(klass, "canEqual", argTypes, term4228617, args);
    }

};


