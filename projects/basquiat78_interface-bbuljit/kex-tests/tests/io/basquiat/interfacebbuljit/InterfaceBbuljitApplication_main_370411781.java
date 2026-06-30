package io.basquiat.interfacebbuljit;

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
import static io.basquiat.interfacebbuljit.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class InterfaceBbuljitApplication_main_370411781 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12813;

    public InterfaceBbuljitApplication_main_370411781() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12813 = (Object[]) newArray("java.lang.String", 4);
        setElement(term12813, 0, "HyxfbSQYBe");
        setElement(term12813, 1, "pCTimMblYc");
        setElement(term12813, 2, "hNxWaHcfhY");
        setElement(term12813, 3, "RkybSrpybU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.basquiat.interfacebbuljit.InterfaceBbuljitApplication");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term12813;
        callMethod(klass, "main", argTypes, null, args);
    }

};


