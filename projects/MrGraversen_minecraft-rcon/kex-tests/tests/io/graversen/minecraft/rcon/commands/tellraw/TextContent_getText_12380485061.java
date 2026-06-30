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

public class TextContent_getText_12380485061 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term460;

    public TextContent_getText_12380485061() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term460 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent"));
        setField(term460, term460.getClass(), "text", "hOncybyCAH");
        setBooleanField(term460, term460.getClass(), "bold", true);
        setBooleanField(term460, term460.getClass(), "italic", false);
        setBooleanField(term460, term460.getClass(), "underlined", false);
        setBooleanField(term460, term460.getClass(), "striketrough", true);
        setBooleanField(term460, term460.getClass(), "obfuscated", true);
        setField(term460, term460.getClass(), "color", "QduALnDSVo");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TextContent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getText", argTypes, term460, args);
    }

};


