package io.graversen.minecraft.rcon.commands.fill;

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
import static io.graversen.minecraft.rcon.commands.fill.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class FillCommand_getFillMode_18075545283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5891;

    public FillCommand_getFillMode_18075545283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6074 = Class.forName((String) "io.graversen.minecraft.rcon.util.FillModes");
        Field term6073 = ((Class) term6074).getDeclaredField((String) "REPLACE");
        ((Field) term6073).setAccessible(true);
        Object enum11 = ((Field) term6073).get((Object) null);
        term5891 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.fill.FillCommand"));
        Object term5892 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Block"));
        Object term5917 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Block"));
        Object term5953 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Position"));
        Object term5954 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term5967 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term5980 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term5993 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Position"));
        Object term5994 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term6007 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term6020 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        setField(term5892, term5892.getClass(), "namespace", "wfaXBpWAUH");
        setField(term5892, term5892.getClass(), "block", "VMeAzAHwZj");
        setField(term5891, term5891.getClass(), "block", term5892);
        setField(term5917, term5917.getClass(), "namespace", "PznxWXsZME");
        setField(term5917, term5917.getClass(), "block", "ZzIujlwVsw");
        setField(term5891, term5891.getClass(), "replaceBlock", term5917);
        setField(term5891, term5891.getClass(), "fillMode", enum11);
        setField(term5954, term5954.getClass(), "coordinate", "LWyEaeIyAo");
        setField(term5953, term5953.getClass(), "x", term5954);
        setField(term5967, term5967.getClass(), "coordinate", "yVMkkQhvmN");
        setField(term5953, term5953.getClass(), "y", term5967);
        setField(term5980, term5980.getClass(), "coordinate", "mvrkADEgpp");
        setField(term5953, term5953.getClass(), "z", term5980);
        setField(term5891, term5891.getClass(), "position1", term5953);
        setField(term5994, term5994.getClass(), "coordinate", "pXOkjyeIRb");
        setField(term5993, term5993.getClass(), "x", term5994);
        setField(term6007, term6007.getClass(), "coordinate", "GgZWSjxjyE");
        setField(term5993, term5993.getClass(), "y", term6007);
        setField(term6020, term6020.getClass(), "coordinate", "EeBVbzjcCI");
        setField(term5993, term5993.getClass(), "z", term6020);
        setField(term5891, term5891.getClass(), "position2", term5993);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.fill.FillCommand");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFillMode", argTypes, term5891, args);
    }

};


