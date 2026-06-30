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

public class FillCommand_getBlock_17956171151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4943;

    public FillCommand_getBlock_17956171151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5123 = Class.forName((String) "io.graversen.minecraft.rcon.util.FillModes");
        Field term5122 = ((Class) term5123).getDeclaredField((String) "KEEP");
        ((Field) term5122).setAccessible(true);
        Object enum9 = ((Field) term5122).get((Object) null);
        term4943 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.fill.FillCommand"));
        Object term4944 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Block"));
        Object term4969 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Block"));
        Object term5002 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Position"));
        Object term5003 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term5016 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term5029 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term5042 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Position"));
        Object term5043 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term5056 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term5069 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        setField(term4944, term4944.getClass(), "namespace", "iNwOJRBEjp");
        setField(term4944, term4944.getClass(), "block", "XylxrMBraH");
        setField(term4943, term4943.getClass(), "block", term4944);
        setField(term4969, term4969.getClass(), "namespace", "pORebkoRdD");
        setField(term4969, term4969.getClass(), "block", "mXGCWJDOqA");
        setField(term4943, term4943.getClass(), "replaceBlock", term4969);
        setField(term4943, term4943.getClass(), "fillMode", enum9);
        setField(term5003, term5003.getClass(), "coordinate", "dpNsDgfPso");
        setField(term5002, term5002.getClass(), "x", term5003);
        setField(term5016, term5016.getClass(), "coordinate", "hCWPJQKpdc");
        setField(term5002, term5002.getClass(), "y", term5016);
        setField(term5029, term5029.getClass(), "coordinate", "WzMEhMXkKx");
        setField(term5002, term5002.getClass(), "z", term5029);
        setField(term4943, term4943.getClass(), "position1", term5002);
        setField(term5043, term5043.getClass(), "coordinate", "XOiDvlDhdc");
        setField(term5042, term5042.getClass(), "x", term5043);
        setField(term5056, term5056.getClass(), "coordinate", "AdxvLJhNLe");
        setField(term5042, term5042.getClass(), "y", term5056);
        setField(term5069, term5069.getClass(), "coordinate", "lHfTrWKMPk");
        setField(term5042, term5042.getClass(), "z", term5069);
        setField(term4943, term4943.getClass(), "position2", term5042);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.fill.FillCommand");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBlock", argTypes, term4943, args);
    }

};


