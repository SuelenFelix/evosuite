package space.gavinklfong.demo.streamapi;

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
import static space.gavinklfong.demo.streamapi.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class DemoApplication_main_20258147931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4212;

    public DemoApplication_main_20258147931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4212 = (Object[]) newArray("java.lang.String", 9);
        setElement(term4212, 0, "tPiZMhJIXj");
        setElement(term4212, 1, "lrEkNimddJ");
        setElement(term4212, 2, "fkeYGEUxMA");
        setElement(term4212, 3, "aJUGPodUIW");
        setElement(term4212, 4, "NpjPDfnDRd");
        setElement(term4212, 5, "SWMYovqYdk");
        setElement(term4212, 6, "TQuvAoQcBe");
        setElement(term4212, 7, "nGYLfZrtWO");
        setElement(term4212, 8, "DBufEhhBCQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.demo.streamapi.DemoApplication");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term4212;
        callMethod(klass, "main", argTypes, null, args);
    }

};


