package icu.samnyan.aqua.sega.diva.model.request.user;

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
import static icu.samnyan.aqua.sega.diva.model.request.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class SpendCreditRequest_init_165406725026 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5851;
     Object term5853;

    public SpendCreditRequest_init_165406725026() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5851 = new Integer(0);
        term5853 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.SpendCreditRequest");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = int.class;
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        argTypes[2] = Array.newInstance(int.class, 0).getClass();
        argTypes[3] = int.class;
        argTypes[4] = Array.newInstance(int.class, 0).getClass();
        argTypes[5] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[6];
        args[0] = term5851;
        args[1] = null;
        args[2] = null;
        args[3] = term5853;
        args[4] = null;
        args[5] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


