package io.graversen.minecraft.rcon.commands.tellraw;

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
import static io.graversen.minecraft.rcon.commands.tellraw.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TellRawCommandBuilder_withColor_78563748317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5075;

    public TellRawCommandBuilder_withColor_78563748317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5075 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TellRawCommandBuilder"));
        setField(term5075, term5075.getClass(), "target", null);
        setField(term5075, term5075.getClass(), "text", null);
        setBooleanField(term5075, term5075.getClass(), "bold", false);
        setBooleanField(term5075, term5075.getClass(), "italic", false);
        setBooleanField(term5075, term5075.getClass(), "underlined", false);
        setBooleanField(term5075, term5075.getClass(), "striketrough", false);
        setBooleanField(term5075, term5075.getClass(), "obfuscated", false);
        setField(term5075, term5075.getClass(), "color", null);
        setField(term5075, term5075.getClass(), "clickEvent", null);
        setField(term5075, term5075.getClass(), "hoverEvent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TellRawCommandBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.graversen.minecraft.rcon.util.Colors");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "withColor", argTypes, term5075, args);
    }

};


