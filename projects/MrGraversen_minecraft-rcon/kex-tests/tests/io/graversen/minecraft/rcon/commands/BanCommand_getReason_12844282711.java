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

public class BanCommand_getReason_12844282711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7488;

    public BanCommand_getReason_12844282711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7488 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.BanCommand"));
        Object term7501 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term7488, term7488.getClass(), "reason", "iuCxnHGMoW");
        setField(term7501, term7501.getClass(), "targetString", "GPSEWEDSTo");
        setField(term7488, term7488.getClass(), "target", term7501);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.BanCommand");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReason", argTypes, term7488, args);
    }

};


