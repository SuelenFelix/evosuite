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

public class TextContent_isObfuscated_2276744126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term710;

    public TextContent_isObfuscated_2276744126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term710 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        setField(term710, term710.getClass(), "text", "GZdcJyZntS");
        setBooleanField(term710, term710.getClass(), "bold", false);
        setBooleanField(term710, term710.getClass(), "italic", true);
        setBooleanField(term710, term710.getClass(), "underlined", true);
        setBooleanField(term710, term710.getClass(), "striketrough", false);
        setBooleanField(term710, term710.getClass(), "obfuscated", true);
        setField(term710, term710.getClass(), "color", "OIHoJeysUi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isObfuscated", argTypes, term710, args);
    }

};


