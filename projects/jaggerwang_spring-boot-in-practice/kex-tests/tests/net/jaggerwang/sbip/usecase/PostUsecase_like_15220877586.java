package net.jaggerwang.sbip.usecase;

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
import static net.jaggerwang.sbip.usecase.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class PostUsecase_like_15220877586 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1042;
     Object term1043;
     Object term1045;

    public PostUsecase_like_15220877586() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1042 = newInstance(Class.forName("net.jaggerwang.sbip.usecase.PostUsecase"));
        setField(term1042, term1042.getClass(), "postDAO", null);
        term1043 = new Long(-484994522244390100L);
        term1045 = new Long(1233889271256172047L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.usecase.PostUsecase");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("java.lang.Long");
        Object[] args = new Object[2];
        args[0] = term1043;
        args[1] = term1045;
        callMethod(klass, "like", argTypes, term1042, args);
    }

};


