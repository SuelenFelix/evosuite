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

public class StatUsecase_postStatInfoByPostId_13157961032 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1566;
     Object term1567;

    public StatUsecase_postStatInfoByPostId_13157961032() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1566 = newInstance(Class.forName("net.jaggerwang.sbip.usecase.StatUsecase"));
        setField(term1566, term1566.getClass(), "userStatDAO", null);
        setField(term1566, term1566.getClass(), "postStatDAO", null);
        term1567 = new Long(-1468719814009985452L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.usecase.StatUsecase");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term1567;
        callMethod(klass, "postStatInfoByPostId", argTypes, term1566, args);
    }

};


