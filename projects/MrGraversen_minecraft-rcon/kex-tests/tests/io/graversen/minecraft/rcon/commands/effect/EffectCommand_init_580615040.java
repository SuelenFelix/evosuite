package io.graversen.minecraft.rcon.commands.effect;

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
import static io.graversen.minecraft.rcon.commands.effect.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Boolean;

public class EffectCommand_init_580615040 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1829;
     Object term1866;
     Object term1868;
     Object term1870;

    public EffectCommand_init_580615040() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1829 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term1829, term1829.getClass(), "targetString", "xOEqzGAmDU");
        term1866 = new Integer(391863371);
        term1868 = new Integer(-1922583790);
        term1870 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.effect.EffectCommand");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("io.graversen.minecraft.rcon.util.Target");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = boolean.class;
        Object[] args = new Object[6];
        args[0] = term1829;
        args[1] = "eZFUvlxvGV";
        args[2] = "BYqFIqCKAV";
        args[3] = term1866;
        args[4] = term1868;
        args[5] = term1870;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


