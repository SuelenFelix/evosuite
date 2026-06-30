package ru.yandex.practicum.filmorate;

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
import static ru.yandex.practicum.filmorate.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FilmorateApplication_main_16113605771 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6153;

    public FilmorateApplication_main_16113605771() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6153 = (Object[]) newArray("java.lang.String", 8);
        setElement(term6153, 0, "JkgoRtImdE");
        setElement(term6153, 1, "qFGKIJjlmV");
        setElement(term6153, 2, "IHqvyhMtuM");
        setElement(term6153, 3, "dAldIGYAXV");
        setElement(term6153, 4, "mLwibAPEsa");
        setElement(term6153, 5, "zsWKWiTFuo");
        setElement(term6153, 6, "UPUbwyHQKN");
        setElement(term6153, 7, "lgQkrXANyI");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.FilmorateApplication");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term6153;
        callMethod(klass, "main", argTypes, null, args);
    }

};


