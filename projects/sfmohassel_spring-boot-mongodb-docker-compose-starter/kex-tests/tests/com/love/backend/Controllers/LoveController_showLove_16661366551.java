package com.love.backend.Controllers;

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
import static com.love.backend.Controllers.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class LoveController_showLove_16661366551 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;

    public LoveController_showLove_16661366551() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.love.backend.Controllers.LoveController"));
        setField(term1, term1.getClass(), "loveService", null);
        term2 = newInstance(Class.forName("com.love.backend.Models.GetLoveInput"));
        setField(term2, term2.getClass(), "message", "PAEBtnZtTD");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.love.backend.Controllers.LoveController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.love.backend.Models.GetLoveInput");
        Object[] args = new Object[1];
        args[0] = term2;
        callMethod(klass, "showLove", argTypes, term1, args);
    }

};


