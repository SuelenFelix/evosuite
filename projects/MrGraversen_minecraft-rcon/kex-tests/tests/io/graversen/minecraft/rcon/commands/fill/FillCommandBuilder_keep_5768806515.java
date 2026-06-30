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

public class FillCommandBuilder_keep_5768806515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1940;
     Object term2082;

    public FillCommandBuilder_keep_5768806515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2208 = Class.forName((String) "io.graversen.minecraft.rcon.util.FillModes");
        Field term2207 = ((Class) term2208).getDeclaredField((String) "DESTROY");
        ((Field) term2207).setAccessible(true);
        Object enum3 = ((Field) term2207).get((Object) null);
        term1940 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.fill.FillCommandBuilder"));
        Object term1941 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Position"));
        Object term1942 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term1955 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term1968 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term1981 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Position"));
        Object term1982 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term1995 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term2008 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term2021 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Block"));
        Object term2046 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Block"));
        setField(term1942, term1942.getClass(), "coordinate", "nGKItKLYNC");
        setField(term1941, term1941.getClass(), "x", term1942);
        setField(term1955, term1955.getClass(), "coordinate", "UiUYnPrcCi");
        setField(term1941, term1941.getClass(), "y", term1955);
        setField(term1968, term1968.getClass(), "coordinate", "UoYtihxVaS");
        setField(term1941, term1941.getClass(), "z", term1968);
        setField(term1940, term1940.getClass(), "position1", term1941);
        setField(term1982, term1982.getClass(), "coordinate", "JDswTTCZHV");
        setField(term1981, term1981.getClass(), "x", term1982);
        setField(term1995, term1995.getClass(), "coordinate", "onpbIeEKoi");
        setField(term1981, term1981.getClass(), "y", term1995);
        setField(term2008, term2008.getClass(), "coordinate", "YRHGsAkhxb");
        setField(term1981, term1981.getClass(), "z", term2008);
        setField(term1940, term1940.getClass(), "position2", term1981);
        setField(term2021, term2021.getClass(), "namespace", "ffYhPOzlUs");
        setField(term2021, term2021.getClass(), "block", "MLqYREekMl");
        setField(term1940, term1940.getClass(), "block", term2021);
        setField(term2046, term2046.getClass(), "namespace", "ytSBIKXogI");
        setField(term2046, term2046.getClass(), "block", "nHXjMycHlU");
        setField(term1940, term1940.getClass(), "replaceBlock", term2046);
        setField(term1940, term1940.getClass(), "fillMode", enum3);
        term2082 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Block"));
        setField(term2082, term2082.getClass(), "namespace", "ieCtQFdkii");
        setField(term2082, term2082.getClass(), "block", "dEnhdmILtU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.fill.FillCommandBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.graversen.minecraft.rcon.util.Block");
        Object[] args = new Object[1];
        args[0] = term2082;
        callMethod(klass, "keep", argTypes, term1940, args);
    }

};


