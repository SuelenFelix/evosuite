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

public class GiveCommand_command_13772146644 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8861;

    public GiveCommand_command_13772146644() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8861 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.GiveCommand"));
        Object term8862 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Item"));
        Object term8900 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term8862, term8862.getClass(), "namespace", "hulYxtowxw");
        setField(term8862, term8862.getClass(), "item", "GNEmuHPNcU");
        setField(term8861, term8861.getClass(), "item", term8862);
        setField(term8861, term8861.getClass(), "nbt", "IoSfuKDFRe");
        setIntField(term8861, term8861.getClass(), "count", -2038273078);
        setField(term8900, term8900.getClass(), "targetString", "AWYyZiNfsm");
        setField(term8861, term8861.getClass(), "target", term8900);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.GiveCommand");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "command", argTypes, term8861, args);
    }

};


