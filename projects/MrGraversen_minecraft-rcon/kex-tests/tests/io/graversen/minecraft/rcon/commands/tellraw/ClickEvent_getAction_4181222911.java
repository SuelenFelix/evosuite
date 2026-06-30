package io.graversen.minecraft.rcon.commands.tellraw;

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
import static io.graversen.minecraft.rcon.commands.tellraw.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ClickEvent_getAction_4181222911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term960;

    public ClickEvent_getAction_4181222911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term960 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.ClickEvent"));
        setField(term960, term960.getClass(), "action", "gUvcueTURF");
        setField(term960, term960.getClass(), "value", "EwQBhZjCIT");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.tellraw.ClickEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAction", argTypes, term960, args);
    }

};


