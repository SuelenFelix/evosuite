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

public class ModuleEntry_getPrice_7964977332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4228062;

    public ModuleEntry_getPrice_7964977332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4228062 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.ModuleEntry"));
        Object term4228077 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4228078 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4228082 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4228087 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4228088 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4228092 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term4228062, term4228062.getClass(), "ID", 1174620907);
        setField(term4228062, term4228062.getClass(), "Name", "MFGjPQkIqh");
        setIntField(term4228062, term4228062.getClass(), "Price", -126047296);
        setIntField(term4228078, term4228078.getClass(), "year", 2023);
        setShortField(term4228078, term4228078.getClass(), "month", (short) 2);
        setShortField(term4228078, term4228078.getClass(), "day", (short) 20);
        setField(term4228077, term4228077.getClass(), "date", term4228078);
        setByteField(term4228082, term4228082.getClass(), "hour", (byte) 17);
        setByteField(term4228082, term4228082.getClass(), "minute", (byte) 6);
        setByteField(term4228082, term4228082.getClass(), "second", (byte) 8);
        setIntField(term4228082, term4228082.getClass(), "nano", 426497749);
        setField(term4228077, term4228077.getClass(), "time", term4228082);
        setField(term4228062, term4228062.getClass(), "ReleaseDate", term4228077);
        setIntField(term4228088, term4228088.getClass(), "year", 2021);
        setShortField(term4228088, term4228088.getClass(), "month", (short) 3);
        setShortField(term4228088, term4228088.getClass(), "day", (short) 19);
        setField(term4228087, term4228087.getClass(), "date", term4228088);
        setByteField(term4228092, term4228092.getClass(), "hour", (byte) 15);
        setByteField(term4228092, term4228092.getClass(), "minute", (byte) 5);
        setByteField(term4228092, term4228092.getClass(), "second", (byte) 31);
        setIntField(term4228092, term4228092.getClass(), "nano", 82651101);
        setField(term4228087, term4228087.getClass(), "time", term4228092);
        setField(term4228062, term4228062.getClass(), "EndDate", term4228087);
        setIntField(term4228062, term4228062.getClass(), "SortOrder", 1773728332);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.ModuleEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPrice", argTypes, term4228062, args);
    }

};


