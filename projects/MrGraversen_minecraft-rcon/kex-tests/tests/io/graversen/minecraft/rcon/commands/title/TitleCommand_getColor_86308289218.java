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

public class TitleCommand_getColor_86308289218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3356;

    public TitleCommand_getColor_86308289218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3356 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.title.TitleCommand"));
        setField(term3356, term3356.getClass(), "position", null);
        setField(term3356, term3356.getClass(), "text", null);
        setBooleanField(term3356, term3356.getClass(), "bold", false);
        setBooleanField(term3356, term3356.getClass(), "italic", false);
        setBooleanField(term3356, term3356.getClass(), "underlined", false);
        setBooleanField(term3356, term3356.getClass(), "striketrough", false);
        setBooleanField(term3356, term3356.getClass(), "obfuscated", false);
        setField(term3356, term3356.getClass(), "color", null);
        setField(term3356, term3356.getClass(), "target", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.title.TitleCommand");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getColor", argTypes, term3356, args);
    }

};


