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

public class TellRawCommandBuilder_italic_205971604720 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5093;

    public TellRawCommandBuilder_italic_205971604720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5093 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TellRawCommandBuilder"));
        setField(term5093, term5093.getClass(), "target", null);
        setField(term5093, term5093.getClass(), "text", null);
        setBooleanField(term5093, term5093.getClass(), "bold", false);
        setBooleanField(term5093, term5093.getClass(), "italic", false);
        setBooleanField(term5093, term5093.getClass(), "underlined", false);
        setBooleanField(term5093, term5093.getClass(), "striketrough", false);
        setBooleanField(term5093, term5093.getClass(), "obfuscated", false);
        setField(term5093, term5093.getClass(), "color", null);
        setField(term5093, term5093.getClass(), "clickEvent", null);
        setField(term5093, term5093.getClass(), "hoverEvent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TellRawCommandBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "italic", argTypes, term5093, args);
    }

};


