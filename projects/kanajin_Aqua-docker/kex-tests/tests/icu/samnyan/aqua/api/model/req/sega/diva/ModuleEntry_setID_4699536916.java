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

public class ModuleEntry_setID_4699536916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4228246;
     Object term4228282;

    public ModuleEntry_setID_4699536916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4228246 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.ModuleEntry"));
        Object term4228261 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4228262 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4228266 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4228271 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4228272 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4228276 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term4228246, term4228246.getClass(), "ID", 1238852182);
        setField(term4228246, term4228246.getClass(), "Name", "exGUsAigPI");
        setIntField(term4228246, term4228246.getClass(), "Price", 375688393);
        setIntField(term4228262, term4228262.getClass(), "year", 2027);
        setShortField(term4228262, term4228262.getClass(), "month", (short) 8);
        setShortField(term4228262, term4228262.getClass(), "day", (short) 24);
        setField(term4228261, term4228261.getClass(), "date", term4228262);
        setByteField(term4228266, term4228266.getClass(), "hour", (byte) 16);
        setByteField(term4228266, term4228266.getClass(), "minute", (byte) 30);
        setByteField(term4228266, term4228266.getClass(), "second", (byte) 8);
        setIntField(term4228266, term4228266.getClass(), "nano", 195416144);
        setField(term4228261, term4228261.getClass(), "time", term4228266);
        setField(term4228246, term4228246.getClass(), "ReleaseDate", term4228261);
        setIntField(term4228272, term4228272.getClass(), "year", 2011);
        setShortField(term4228272, term4228272.getClass(), "month", (short) 7);
        setShortField(term4228272, term4228272.getClass(), "day", (short) 20);
        setField(term4228271, term4228271.getClass(), "date", term4228272);
        setByteField(term4228276, term4228276.getClass(), "hour", (byte) 2);
        setByteField(term4228276, term4228276.getClass(), "minute", (byte) 11);
        setByteField(term4228276, term4228276.getClass(), "second", (byte) 55);
        setIntField(term4228276, term4228276.getClass(), "nano", 526301739);
        setField(term4228271, term4228271.getClass(), "time", term4228276);
        setField(term4228246, term4228246.getClass(), "EndDate", term4228271);
        setIntField(term4228246, term4228246.getClass(), "SortOrder", -2138940011);
        term4228282 = new Integer(1042959441);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.ModuleEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4228282;
        callMethod(klass, "setID", argTypes, term4228246, args);
    }

};


