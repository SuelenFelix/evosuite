package com.leosam.tvbox.mv.data;

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
import static com.leosam.tvbox.mv.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class MvContent_setSongUser_9727927708 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term677;

    public MvContent_setSongUser_9727927708() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term677 = newInstance(Class.forName("com.leosam.tvbox.mv.data.MvContent"));
        setField(term677, term677.getClass(), "name", "OWDIEULEFu");
        setField(term677, term677.getClass(), "songName", "dWRymuLBtr");
        setField(term677, term677.getClass(), "songUser", "AijpHYOFuy");
        setField(term677, term677.getClass(), "url", "SbAoxhfrkn");
        setFloatField(term677, term677.getClass(), "score", 0.2857073F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leosam.tvbox.mv.data.MvContent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "kuTXqwMtDB";
        callMethod(klass, "setSongUser", argTypes, term677, args);
    }

};


