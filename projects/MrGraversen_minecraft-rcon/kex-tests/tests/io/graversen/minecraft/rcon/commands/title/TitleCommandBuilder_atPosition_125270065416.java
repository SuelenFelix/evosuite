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

public class TitleCommandBuilder_atPosition_125270065416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2290;

    public TitleCommandBuilder_atPosition_125270065416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2290 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.title.TitleCommandBuilder"));
        setField(term2290, term2290.getClass(), "target", null);
        setField(term2290, term2290.getClass(), "position", null);
        setField(term2290, term2290.getClass(), "text", null);
        setBooleanField(term2290, term2290.getClass(), "bold", false);
        setBooleanField(term2290, term2290.getClass(), "italic", false);
        setBooleanField(term2290, term2290.getClass(), "underlined", false);
        setBooleanField(term2290, term2290.getClass(), "striketrough", false);
        setBooleanField(term2290, term2290.getClass(), "obfuscated", false);
        setField(term2290, term2290.getClass(), "color", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.title.TitleCommandBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.graversen.minecraft.rcon.util.TitlePositions");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "atPosition", argTypes, term2290, args);
    }

};


