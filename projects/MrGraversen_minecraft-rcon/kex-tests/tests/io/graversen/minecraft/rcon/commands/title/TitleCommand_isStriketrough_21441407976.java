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

public class TitleCommand_isStriketrough_21441407976 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2924;

    public TitleCommand_isStriketrough_21441407976() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2924 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.title.TitleCommand"));
        Object term2966 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term2924, term2924.getClass(), "position", "HqBOwkVqjD");
        setField(term2924, term2924.getClass(), "text", "MAcUBcBckh");
        setBooleanField(term2924, term2924.getClass(), "bold", true);
        setBooleanField(term2924, term2924.getClass(), "italic", true);
        setBooleanField(term2924, term2924.getClass(), "underlined", true);
        setBooleanField(term2924, term2924.getClass(), "striketrough", true);
        setBooleanField(term2924, term2924.getClass(), "obfuscated", false);
        setField(term2924, term2924.getClass(), "color", "oVgzLbrsFr");
        setField(term2966, term2966.getClass(), "targetString", "vQVyKLdtaz");
        setField(term2924, term2924.getClass(), "target", term2966);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.title.TitleCommand");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isStriketrough", argTypes, term2924, args);
    }

};


