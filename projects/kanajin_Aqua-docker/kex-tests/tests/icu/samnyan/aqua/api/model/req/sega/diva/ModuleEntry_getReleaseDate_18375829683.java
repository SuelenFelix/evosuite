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

public class ModuleEntry_getReleaseDate_18375829683 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4228108;

    public ModuleEntry_getReleaseDate_18375829683() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4228108 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.ModuleEntry"));
        Object term4228123 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4228124 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4228128 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4228133 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4228134 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4228138 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term4228108, term4228108.getClass(), "ID", 1489823171);
        setField(term4228108, term4228108.getClass(), "Name", "DlPxDByOzm");
        setIntField(term4228108, term4228108.getClass(), "Price", 918825026);
        setIntField(term4228124, term4228124.getClass(), "year", 2018);
        setShortField(term4228124, term4228124.getClass(), "month", (short) 8);
        setShortField(term4228124, term4228124.getClass(), "day", (short) 25);
        setField(term4228123, term4228123.getClass(), "date", term4228124);
        setByteField(term4228128, term4228128.getClass(), "hour", (byte) 12);
        setByteField(term4228128, term4228128.getClass(), "minute", (byte) 48);
        setByteField(term4228128, term4228128.getClass(), "second", (byte) 21);
        setIntField(term4228128, term4228128.getClass(), "nano", 43170151);
        setField(term4228123, term4228123.getClass(), "time", term4228128);
        setField(term4228108, term4228108.getClass(), "ReleaseDate", term4228123);
        setIntField(term4228134, term4228134.getClass(), "year", 2014);
        setShortField(term4228134, term4228134.getClass(), "month", (short) 1);
        setShortField(term4228134, term4228134.getClass(), "day", (short) 7);
        setField(term4228133, term4228133.getClass(), "date", term4228134);
        setByteField(term4228138, term4228138.getClass(), "hour", (byte) 15);
        setByteField(term4228138, term4228138.getClass(), "minute", (byte) 4);
        setByteField(term4228138, term4228138.getClass(), "second", (byte) 30);
        setIntField(term4228138, term4228138.getClass(), "nano", 409368382);
        setField(term4228133, term4228133.getClass(), "time", term4228138);
        setField(term4228108, term4228108.getClass(), "EndDate", term4228133);
        setIntField(term4228108, term4228108.getClass(), "SortOrder", -782804655);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.ModuleEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReleaseDate", argTypes, term4228108, args);
    }

};


