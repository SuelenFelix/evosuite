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

public class GiveCommand_getCount_16361824153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8769;

    public GiveCommand_getCount_16361824153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8769 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.GiveCommand"));
        Object term8770 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Item"));
        Object term8808 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term8770, term8770.getClass(), "namespace", "lgQkrXANyI");
        setField(term8770, term8770.getClass(), "item", "MeTmRZXErV");
        setField(term8769, term8769.getClass(), "item", term8770);
        setField(term8769, term8769.getClass(), "nbt", "jNxbVmoZgq");
        setIntField(term8769, term8769.getClass(), "count", -1955890973);
        setField(term8808, term8808.getClass(), "targetString", "PvmBHIXaMY");
        setField(term8769, term8769.getClass(), "target", term8808);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.GiveCommand");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCount", argTypes, term8769, args);
    }

};


