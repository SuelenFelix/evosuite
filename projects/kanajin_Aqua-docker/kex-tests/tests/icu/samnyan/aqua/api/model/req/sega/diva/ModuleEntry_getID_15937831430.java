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

public class ModuleEntry_getID_15937831430 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4227970;

    public ModuleEntry_getID_15937831430() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4227970 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.ModuleEntry"));
        Object term4227985 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4227986 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4227990 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4227995 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4227996 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4228000 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term4227970, term4227970.getClass(), "ID", 1465616730);
        setField(term4227970, term4227970.getClass(), "Name", "iYOkcxWRaP");
        setIntField(term4227970, term4227970.getClass(), "Price", -997763895);
        setIntField(term4227986, term4227986.getClass(), "year", 2028);
        setShortField(term4227986, term4227986.getClass(), "month", (short) 12);
        setShortField(term4227986, term4227986.getClass(), "day", (short) 12);
        setField(term4227985, term4227985.getClass(), "date", term4227986);
        setByteField(term4227990, term4227990.getClass(), "hour", (byte) 9);
        setByteField(term4227990, term4227990.getClass(), "minute", (byte) 8);
        setByteField(term4227990, term4227990.getClass(), "second", (byte) 3);
        setIntField(term4227990, term4227990.getClass(), "nano", 684312875);
        setField(term4227985, term4227985.getClass(), "time", term4227990);
        setField(term4227970, term4227970.getClass(), "ReleaseDate", term4227985);
        setIntField(term4227996, term4227996.getClass(), "year", 2026);
        setShortField(term4227996, term4227996.getClass(), "month", (short) 12);
        setShortField(term4227996, term4227996.getClass(), "day", (short) 1);
        setField(term4227995, term4227995.getClass(), "date", term4227996);
        setByteField(term4228000, term4228000.getClass(), "hour", (byte) 0);
        setByteField(term4228000, term4228000.getClass(), "minute", (byte) 45);
        setByteField(term4228000, term4228000.getClass(), "second", (byte) 5);
        setIntField(term4228000, term4228000.getClass(), "nano", 986191440);
        setField(term4227995, term4227995.getClass(), "time", term4228000);
        setField(term4227970, term4227970.getClass(), "EndDate", term4227995);
        setIntField(term4227970, term4227970.getClass(), "SortOrder", -2146465269);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.ModuleEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getID", argTypes, term4227970, args);
    }

};


