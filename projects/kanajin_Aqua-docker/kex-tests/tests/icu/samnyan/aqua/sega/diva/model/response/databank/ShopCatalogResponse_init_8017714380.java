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

public class ShopCatalogResponse_init_8017714380 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12391;

    public ShopCatalogResponse_init_8017714380() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12391 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12392 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12396 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term12392, term12392.getClass(), "year", 2019);
        setShortField(term12392, term12392.getClass(), "month", (short) 2);
        setShortField(term12392, term12392.getClass(), "day", (short) 21);
        setField(term12391, term12391.getClass(), "date", term12392);
        setByteField(term12396, term12396.getClass(), "hour", (byte) 5);
        setByteField(term12396, term12396.getClass(), "minute", (byte) 41);
        setByteField(term12396, term12396.getClass(), "second", (byte) 11);
        setIntField(term12396, term12396.getClass(), "nano", 859829782);
        setField(term12391, term12391.getClass(), "time", term12396);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.ShopCatalogResponse");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.time.LocalDateTime");
        argTypes[4] = Class.forName("java.lang.String");
        Object[] args = new Object[5];
        args[0] = "QZBHZqZope";
        args[1] = "VBUahCvyxC";
        args[2] = "MlzTkzKMCX";
        args[3] = term12391;
        args[4] = "UqKUbMyPMJ";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


