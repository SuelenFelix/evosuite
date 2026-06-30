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

public class ModuleEntry_equals_86703165812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4228570;
     Object term4228606;

    public ModuleEntry_equals_86703165812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4228570 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.ModuleEntry"));
        Object term4228585 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4228586 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4228590 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4228595 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4228596 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4228600 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term4228570, term4228570.getClass(), "ID", -383280401);
        setField(term4228570, term4228570.getClass(), "Name", "xwUOUhVRPX");
        setIntField(term4228570, term4228570.getClass(), "Price", -911186312);
        setIntField(term4228586, term4228586.getClass(), "year", 2010);
        setShortField(term4228586, term4228586.getClass(), "month", (short) 2);
        setShortField(term4228586, term4228586.getClass(), "day", (short) 21);
        setField(term4228585, term4228585.getClass(), "date", term4228586);
        setByteField(term4228590, term4228590.getClass(), "hour", (byte) 23);
        setByteField(term4228590, term4228590.getClass(), "minute", (byte) 22);
        setByteField(term4228590, term4228590.getClass(), "second", (byte) 57);
        setIntField(term4228590, term4228590.getClass(), "nano", 219545267);
        setField(term4228585, term4228585.getClass(), "time", term4228590);
        setField(term4228570, term4228570.getClass(), "ReleaseDate", term4228585);
        setIntField(term4228596, term4228596.getClass(), "year", 2016);
        setShortField(term4228596, term4228596.getClass(), "month", (short) 10);
        setShortField(term4228596, term4228596.getClass(), "day", (short) 26);
        setField(term4228595, term4228595.getClass(), "date", term4228596);
        setByteField(term4228600, term4228600.getClass(), "hour", (byte) 11);
        setByteField(term4228600, term4228600.getClass(), "minute", (byte) 21);
        setByteField(term4228600, term4228600.getClass(), "second", (byte) 5);
        setIntField(term4228600, term4228600.getClass(), "nano", 68768601);
        setField(term4228595, term4228595.getClass(), "time", term4228600);
        setField(term4228570, term4228570.getClass(), "EndDate", term4228595);
        setIntField(term4228570, term4228570.getClass(), "SortOrder", 829304934);
        term4228606 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.ModuleEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term4228606;
        callMethod(klass, "equals", argTypes, term4228570, args);
    }

};


