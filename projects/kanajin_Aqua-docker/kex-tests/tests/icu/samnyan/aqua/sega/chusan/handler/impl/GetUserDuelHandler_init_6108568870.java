package icu.samnyan.aqua.sega.chusan.handler.impl;

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
import static icu.samnyan.aqua.sega.chusan.handler.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GetUserDuelHandler_init_6108568870 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public GetUserDuelHandler_init_6108568870() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.handler.impl.GetUserDuelHandler");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.util.jackson.StringMapper");
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.chusan.service.UserDuelService");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


