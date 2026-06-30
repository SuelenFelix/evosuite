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

public class ModuleEntry_getSortOrder_21190039025 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4228200;

    public ModuleEntry_getSortOrder_21190039025() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4228200 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.ModuleEntry"));
        Object term4228215 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4228216 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4228220 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4228225 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4228226 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4228230 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term4228200, term4228200.getClass(), "ID", 655675896);
        setField(term4228200, term4228200.getClass(), "Name", "dpRCDlNMcC");
        setIntField(term4228200, term4228200.getClass(), "Price", -978990242);
        setIntField(term4228216, term4228216.getClass(), "year", 2014);
        setShortField(term4228216, term4228216.getClass(), "month", (short) 12);
        setShortField(term4228216, term4228216.getClass(), "day", (short) 13);
        setField(term4228215, term4228215.getClass(), "date", term4228216);
        setByteField(term4228220, term4228220.getClass(), "hour", (byte) 2);
        setByteField(term4228220, term4228220.getClass(), "minute", (byte) 43);
        setByteField(term4228220, term4228220.getClass(), "second", (byte) 4);
        setIntField(term4228220, term4228220.getClass(), "nano", 743050489);
        setField(term4228215, term4228215.getClass(), "time", term4228220);
        setField(term4228200, term4228200.getClass(), "ReleaseDate", term4228215);
        setIntField(term4228226, term4228226.getClass(), "year", 2028);
        setShortField(term4228226, term4228226.getClass(), "month", (short) 11);
        setShortField(term4228226, term4228226.getClass(), "day", (short) 21);
        setField(term4228225, term4228225.getClass(), "date", term4228226);
        setByteField(term4228230, term4228230.getClass(), "hour", (byte) 18);
        setByteField(term4228230, term4228230.getClass(), "minute", (byte) 42);
        setByteField(term4228230, term4228230.getClass(), "second", (byte) 40);
        setIntField(term4228230, term4228230.getClass(), "nano", 895321648);
        setField(term4228225, term4228225.getClass(), "time", term4228230);
        setField(term4228200, term4228200.getClass(), "EndDate", term4228225);
        setIntField(term4228200, term4228200.getClass(), "SortOrder", -2057091978);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.ModuleEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSortOrder", argTypes, term4228200, args);
    }

};


