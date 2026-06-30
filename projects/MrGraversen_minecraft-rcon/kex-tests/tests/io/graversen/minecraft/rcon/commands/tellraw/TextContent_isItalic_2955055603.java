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

public class TextContent_isItalic_2955055603 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term560;

    public TextContent_isItalic_2955055603() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term560 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        setField(term560, term560.getClass(), "text", "tlQSNgTkQX");
        setBooleanField(term560, term560.getClass(), "bold", false);
        setBooleanField(term560, term560.getClass(), "italic", true);
        setBooleanField(term560, term560.getClass(), "underlined", false);
        setBooleanField(term560, term560.getClass(), "striketrough", false);
        setBooleanField(term560, term560.getClass(), "obfuscated", true);
        setField(term560, term560.getClass(), "color", "PCipZnmBOF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isItalic", argTypes, term560, args);
    }

};


