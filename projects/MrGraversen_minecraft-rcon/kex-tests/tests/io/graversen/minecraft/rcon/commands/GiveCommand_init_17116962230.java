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
import java.lang.Integer;

public class GiveCommand_init_17116962230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8493;
     Object term8506;
     Object term8543;

    public GiveCommand_init_17116962230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8493 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term8493, term8493.getClass(), "targetString", "RxbhrFBjkO");
        term8506 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Item"));
        setField(term8506, term8506.getClass(), "namespace", "aanyiAOJCl");
        setField(term8506, term8506.getClass(), "item", "VDokbsCuqq");
        term8543 = new Integer(391863371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.GiveCommand");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("io.graversen.minecraft.rcon.util.Target");
        argTypes[1] = Class.forName("io.graversen.minecraft.rcon.util.Item");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term8493;
        args[1] = term8506;
        args[2] = "xClUIcPECX";
        args[3] = term8543;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


