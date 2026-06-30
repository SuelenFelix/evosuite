package io.graversen.minecraft.rcon.commands.title;

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
import static io.graversen.minecraft.rcon.commands.title.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TitleCommand_isBold_14758174553 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2639;

    public TitleCommand_isBold_14758174553() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2639 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.title.TitleCommand"));
        Object term2681 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term2639, term2639.getClass(), "position", "hoicvmsovO");
        setField(term2639, term2639.getClass(), "text", "eqJfYWRaEL");
        setBooleanField(term2639, term2639.getClass(), "bold", false);
        setBooleanField(term2639, term2639.getClass(), "italic", true);
        setBooleanField(term2639, term2639.getClass(), "underlined", false);
        setBooleanField(term2639, term2639.getClass(), "striketrough", false);
        setBooleanField(term2639, term2639.getClass(), "obfuscated", true);
        setField(term2639, term2639.getClass(), "color", "fhkbdRViHi");
        setField(term2681, term2681.getClass(), "targetString", "uWHnvSvaPl");
        setField(term2639, term2639.getClass(), "target", term2681);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.title.TitleCommand");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isBold", argTypes, term2639, args);
    }

};


