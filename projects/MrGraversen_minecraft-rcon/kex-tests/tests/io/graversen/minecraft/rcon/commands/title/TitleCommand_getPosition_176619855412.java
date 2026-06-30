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

public class TitleCommand_getPosition_176619855412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3320;

    public TitleCommand_getPosition_176619855412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3320 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.title.TitleCommand"));
        setField(term3320, term3320.getClass(), "position", null);
        setField(term3320, term3320.getClass(), "text", null);
        setBooleanField(term3320, term3320.getClass(), "bold", false);
        setBooleanField(term3320, term3320.getClass(), "italic", false);
        setBooleanField(term3320, term3320.getClass(), "underlined", false);
        setBooleanField(term3320, term3320.getClass(), "striketrough", false);
        setBooleanField(term3320, term3320.getClass(), "obfuscated", false);
        setField(term3320, term3320.getClass(), "color", null);
        setField(term3320, term3320.getClass(), "target", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.title.TitleCommand");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPosition", argTypes, term3320, args);
    }

};


