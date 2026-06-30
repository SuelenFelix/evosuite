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
import java.lang.Integer;

public class BannerDataResponse_init_1937756880 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37;
     Object term71;

    public BannerDataResponse_init_1937756880() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term38 = newInstance(Class.forName("java.time.LocalDate"));
        Object term42 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term38, term38.getClass(), "year", 2012);
        setShortField(term38, term38.getClass(), "month", (short) 8);
        setShortField(term38, term38.getClass(), "day", (short) 25);
        setField(term37, term37.getClass(), "date", term38);
        setByteField(term42, term42.getClass(), "hour", (byte) 5);
        setByteField(term42, term42.getClass(), "minute", (byte) 20);
        setByteField(term42, term42.getClass(), "second", (byte) 50);
        setIntField(term42, term42.getClass(), "nano", 345595912);
        setField(term37, term37.getClass(), "time", term42);
        term71 = new Integer(568599855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.BannerDataResponse");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.time.LocalDateTime");
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = Class.forName("java.lang.String");
        argTypes[6] = int.class;
        Object[] args = new Object[7];
        args[0] = "PAEBtnZtTD";
        args[1] = "sjlJAEtRrb";
        args[2] = "MuLcgQHgqz";
        args[3] = term37;
        args[4] = "xxtlPwDYFs";
        args[5] = "jJCZpVmanW";
        args[6] = term71;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


