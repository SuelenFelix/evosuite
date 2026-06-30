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

public class ModuleEntry_getName_13367315341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4228016;

    public ModuleEntry_getName_13367315341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4228016 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.ModuleEntry"));
        Object term4228031 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4228032 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4228036 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4228041 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4228042 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4228046 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term4228016, term4228016.getClass(), "ID", -488071512);
        setField(term4228016, term4228016.getClass(), "Name", "YYsJYNnOXa");
        setIntField(term4228016, term4228016.getClass(), "Price", -653249068);
        setIntField(term4228032, term4228032.getClass(), "year", 2027);
        setShortField(term4228032, term4228032.getClass(), "month", (short) 1);
        setShortField(term4228032, term4228032.getClass(), "day", (short) 13);
        setField(term4228031, term4228031.getClass(), "date", term4228032);
        setByteField(term4228036, term4228036.getClass(), "hour", (byte) 16);
        setByteField(term4228036, term4228036.getClass(), "minute", (byte) 52);
        setByteField(term4228036, term4228036.getClass(), "second", (byte) 1);
        setIntField(term4228036, term4228036.getClass(), "nano", 630016174);
        setField(term4228031, term4228031.getClass(), "time", term4228036);
        setField(term4228016, term4228016.getClass(), "ReleaseDate", term4228031);
        setIntField(term4228042, term4228042.getClass(), "year", 2026);
        setShortField(term4228042, term4228042.getClass(), "month", (short) 10);
        setShortField(term4228042, term4228042.getClass(), "day", (short) 6);
        setField(term4228041, term4228041.getClass(), "date", term4228042);
        setByteField(term4228046, term4228046.getClass(), "hour", (byte) 4);
        setByteField(term4228046, term4228046.getClass(), "minute", (byte) 5);
        setByteField(term4228046, term4228046.getClass(), "second", (byte) 3);
        setIntField(term4228046, term4228046.getClass(), "nano", 313041794);
        setField(term4228041, term4228041.getClass(), "time", term4228046);
        setField(term4228016, term4228016.getClass(), "EndDate", term4228041);
        setIntField(term4228016, term4228016.getClass(), "SortOrder", -1653588102);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.ModuleEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term4228016, args);
    }

};


