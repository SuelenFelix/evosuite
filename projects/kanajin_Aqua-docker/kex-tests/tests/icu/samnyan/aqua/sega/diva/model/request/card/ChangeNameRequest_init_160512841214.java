package icu.samnyan.aqua.sega.diva.model.request.card;

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
import static icu.samnyan.aqua.sega.diva.model.request.card.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class ChangeNameRequest_init_160512841214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30617;
     Object term30631;
     Object term30633;
     Object term30647;

    public ChangeNameRequest_init_160512841214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30617 = new Integer(9726679);
        term30631 = new Integer(-25637976);
        term30633 = new Integer(1555897383);
        term30647 = new Integer(202001407);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.ChangeNameRequest");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = Class.forName("java.lang.String");
        argTypes[6] = int.class;
        Object[] args = new Object[7];
        args[0] = "MCMCjxXzjw";
        args[1] = term30617;
        args[2] = "pZbbwCURge";
        args[3] = term30631;
        args[4] = term30633;
        args[5] = "RsOfgdMCMv";
        args[6] = term30647;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


