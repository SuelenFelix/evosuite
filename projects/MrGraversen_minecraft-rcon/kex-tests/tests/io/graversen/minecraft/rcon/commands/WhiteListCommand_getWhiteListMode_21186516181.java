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
import java.lang.String;
import java.lang.Object;

public class WhiteListCommand_getWhiteListMode_21186516181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7915;

    public WhiteListCommand_getWhiteListMode_21186516181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7937 = Class.forName((String) "io.graversen.minecraft.rcon.util.WhiteListModes");
        Field term7936 = ((Class) term7937).getDeclaredField((String) "OFF");
        ((Field) term7936).setAccessible(true);
        Object enum13 = ((Field) term7936).get((Object) null);
        term7915 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.WhiteListCommand"));
        Object term7923 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term7915, term7915.getClass(), "whiteListMode", enum13);
        setField(term7923, term7923.getClass(), "targetString", "vOVuNSCCLe");
        setField(term7915, term7915.getClass(), "target", term7923);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.WhiteListCommand");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWhiteListMode", argTypes, term7915, args);
    }

};


