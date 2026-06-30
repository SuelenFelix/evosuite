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

public class ModuleEntry_setName_12383591947 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4228294;

    public ModuleEntry_setName_12383591947() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4228294 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.ModuleEntry"));
        Object term4228309 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4228310 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4228314 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4228319 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4228320 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4228324 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term4228294, term4228294.getClass(), "ID", -38462415);
        setField(term4228294, term4228294.getClass(), "Name", "QrMZIwUORF");
        setIntField(term4228294, term4228294.getClass(), "Price", -1154083926);
        setIntField(term4228310, term4228310.getClass(), "year", 2029);
        setShortField(term4228310, term4228310.getClass(), "month", (short) 5);
        setShortField(term4228310, term4228310.getClass(), "day", (short) 29);
        setField(term4228309, term4228309.getClass(), "date", term4228310);
        setByteField(term4228314, term4228314.getClass(), "hour", (byte) 8);
        setByteField(term4228314, term4228314.getClass(), "minute", (byte) 26);
        setByteField(term4228314, term4228314.getClass(), "second", (byte) 56);
        setIntField(term4228314, term4228314.getClass(), "nano", 828454905);
        setField(term4228309, term4228309.getClass(), "time", term4228314);
        setField(term4228294, term4228294.getClass(), "ReleaseDate", term4228309);
        setIntField(term4228320, term4228320.getClass(), "year", 2012);
        setShortField(term4228320, term4228320.getClass(), "month", (short) 9);
        setShortField(term4228320, term4228320.getClass(), "day", (short) 30);
        setField(term4228319, term4228319.getClass(), "date", term4228320);
        setByteField(term4228324, term4228324.getClass(), "hour", (byte) 0);
        setByteField(term4228324, term4228324.getClass(), "minute", (byte) 49);
        setByteField(term4228324, term4228324.getClass(), "second", (byte) 34);
        setIntField(term4228324, term4228324.getClass(), "nano", 943868125);
        setField(term4228319, term4228319.getClass(), "time", term4228324);
        setField(term4228294, term4228294.getClass(), "EndDate", term4228319);
        setIntField(term4228294, term4228294.getClass(), "SortOrder", -49386932);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.ModuleEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MGlqIYVQQT";
        callMethod(klass, "setName", argTypes, term4228294, args);
    }

};


