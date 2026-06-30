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

public class TitleCommandBuilder_underlined_65228365721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2320;

    public TitleCommandBuilder_underlined_65228365721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2320 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.title.TitleCommandBuilder"));
        setField(term2320, term2320.getClass(), "target", null);
        setField(term2320, term2320.getClass(), "position", null);
        setField(term2320, term2320.getClass(), "text", null);
        setBooleanField(term2320, term2320.getClass(), "bold", false);
        setBooleanField(term2320, term2320.getClass(), "italic", false);
        setBooleanField(term2320, term2320.getClass(), "underlined", false);
        setBooleanField(term2320, term2320.getClass(), "striketrough", false);
        setBooleanField(term2320, term2320.getClass(), "obfuscated", false);
        setField(term2320, term2320.getClass(), "color", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.title.TitleCommandBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "underlined", argTypes, term2320, args);
    }

};


