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

public class PostUsecase_following_190693669011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1067;
     Object term1068;
     Object term1070;
     Object term1072;
     Object term1074;

    public PostUsecase_following_190693669011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1067 = newInstance(Class.forName("net.jaggerwang.sbip.usecase.PostUsecase"));
        setField(term1067, term1067.getClass(), "postDAO", null);
        term1068 = new Long(4784595517102746672L);
        term1070 = new Long(-7612550318181586304L);
        term1072 = new Long(-2170847986967241072L);
        term1074 = new Long(4044358158040652353L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.usecase.PostUsecase");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("java.lang.Long");
        argTypes[2] = Class.forName("java.lang.Long");
        argTypes[3] = Class.forName("java.lang.Long");
        Object[] args = new Object[4];
        args[0] = term1068;
        args[1] = term1070;
        args[2] = term1072;
        args[3] = term1074;
        callMethod(klass, "following", argTypes, term1067, args);
    }

};


