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

public class ModuleEntry_getEndDate_14002711804 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4228154;

    public ModuleEntry_getEndDate_14002711804() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4228154 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.ModuleEntry"));
        Object term4228169 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4228170 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4228174 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4228179 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4228180 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4228184 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term4228154, term4228154.getClass(), "ID", -852537242);
        setField(term4228154, term4228154.getClass(), "Name", "EYdyehYjGl");
        setIntField(term4228154, term4228154.getClass(), "Price", -1477736135);
        setIntField(term4228170, term4228170.getClass(), "year", 2017);
        setShortField(term4228170, term4228170.getClass(), "month", (short) 9);
        setShortField(term4228170, term4228170.getClass(), "day", (short) 20);
        setField(term4228169, term4228169.getClass(), "date", term4228170);
        setByteField(term4228174, term4228174.getClass(), "hour", (byte) 22);
        setByteField(term4228174, term4228174.getClass(), "minute", (byte) 55);
        setByteField(term4228174, term4228174.getClass(), "second", (byte) 56);
        setIntField(term4228174, term4228174.getClass(), "nano", 940695490);
        setField(term4228169, term4228169.getClass(), "time", term4228174);
        setField(term4228154, term4228154.getClass(), "ReleaseDate", term4228169);
        setIntField(term4228180, term4228180.getClass(), "year", 2012);
        setShortField(term4228180, term4228180.getClass(), "month", (short) 10);
        setShortField(term4228180, term4228180.getClass(), "day", (short) 21);
        setField(term4228179, term4228179.getClass(), "date", term4228180);
        setByteField(term4228184, term4228184.getClass(), "hour", (byte) 8);
        setByteField(term4228184, term4228184.getClass(), "minute", (byte) 13);
        setByteField(term4228184, term4228184.getClass(), "second", (byte) 40);
        setIntField(term4228184, term4228184.getClass(), "nano", 703523659);
        setField(term4228179, term4228179.getClass(), "time", term4228184);
        setField(term4228154, term4228154.getClass(), "EndDate", term4228179);
        setIntField(term4228154, term4228154.getClass(), "SortOrder", 768651690);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.ModuleEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEndDate", argTypes, term4228154, args);
    }

};


