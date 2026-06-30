package io.graversen.minecraft.rcon.commands;

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
import static io.graversen.minecraft.rcon.commands.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class GiveCommand_getItem_10788644291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8585;

    public GiveCommand_getItem_10788644291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8585 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.GiveCommand"));
        Object term8586 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Item"));
        Object term8624 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term8586, term8586.getClass(), "namespace", "avhRaGZaBF");
        setField(term8586, term8586.getClass(), "item", "JkgoRtImdE");
        setField(term8585, term8585.getClass(), "item", term8586);
        setField(term8585, term8585.getClass(), "nbt", "qFGKIJjlmV");
        setIntField(term8585, term8585.getClass(), "count", -1922583790);
        setField(term8624, term8624.getClass(), "targetString", "IHqvyhMtuM");
        setField(term8585, term8585.getClass(), "target", term8624);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.GiveCommand");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getItem", argTypes, term8585, args);
    }

};


