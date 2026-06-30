package icu.samnyan.aqua.sega.diva.model.response.databank;

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
import static icu.samnyan.aqua.sega.diva.model.response.databank.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PvListResponse_init_675248590 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16119;

    public PvListResponse_init_675248590() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16119 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16120 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16124 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term16120, term16120.getClass(), "year", 2015);
        setShortField(term16120, term16120.getClass(), "month", (short) 3);
        setShortField(term16120, term16120.getClass(), "day", (short) 10);
        setField(term16119, term16119.getClass(), "date", term16120);
        setByteField(term16124, term16124.getClass(), "hour", (byte) 23);
        setByteField(term16124, term16124.getClass(), "minute", (byte) 34);
        setByteField(term16124, term16124.getClass(), "second", (byte) 44);
        setIntField(term16124, term16124.getClass(), "nano", 587322824);
        setField(term16119, term16119.getClass(), "time", term16124);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PvListResponse");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.time.LocalDateTime");
        argTypes[4] = Class.forName("java.lang.String");
        Object[] args = new Object[5];
        args[0] = "ZEXFoMSKeG";
        args[1] = "HvxahUfZcJ";
        args[2] = "WkLpmqoQxy";
        args[3] = term16119;
        args[4] = "XiNoscmYhd";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


