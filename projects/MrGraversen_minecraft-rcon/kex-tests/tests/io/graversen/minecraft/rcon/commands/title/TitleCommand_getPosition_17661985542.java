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

public class TitleCommand_getPosition_17661985542 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2544;

    public TitleCommand_getPosition_17661985542() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2544 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.title.TitleCommand"));
        Object term2586 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term2544, term2544.getClass(), "position", "ytSBIKXogI");
        setField(term2544, term2544.getClass(), "text", "nHXjMycHlU");
        setBooleanField(term2544, term2544.getClass(), "bold", false);
        setBooleanField(term2544, term2544.getClass(), "italic", false);
        setBooleanField(term2544, term2544.getClass(), "underlined", false);
        setBooleanField(term2544, term2544.getClass(), "striketrough", false);
        setBooleanField(term2544, term2544.getClass(), "obfuscated", false);
        setField(term2544, term2544.getClass(), "color", "ieCtQFdkii");
        setField(term2586, term2586.getClass(), "targetString", "dEnhdmILtU");
        setField(term2544, term2544.getClass(), "target", term2586);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.title.TitleCommand");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPosition", argTypes, term2544, args);
    }

};


