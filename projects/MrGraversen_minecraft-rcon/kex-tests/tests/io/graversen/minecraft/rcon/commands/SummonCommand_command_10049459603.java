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

public class SummonCommand_command_10049459603 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28627;

    public SummonCommand_command_10049459603() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28627 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.SummonCommand"));
        Object term28652 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Position"));
        Object term28653 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term28666 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term28679 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        setField(term28627, term28627.getClass(), "entityName", "TbYrjEyFPc");
        setField(term28627, term28627.getClass(), "nbt", "muefchpJiZ");
        setField(term28653, term28653.getClass(), "coordinate", "tuYaAqvYrh");
        setField(term28652, term28652.getClass(), "x", term28653);
        setField(term28666, term28666.getClass(), "coordinate", "CIbhheukbR");
        setField(term28652, term28652.getClass(), "y", term28666);
        setField(term28679, term28679.getClass(), "coordinate", "VOHPpErtan");
        setField(term28652, term28652.getClass(), "z", term28679);
        setField(term28627, term28627.getClass(), "position", term28652);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.SummonCommand");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "command", argTypes, term28627, args);
    }

};


