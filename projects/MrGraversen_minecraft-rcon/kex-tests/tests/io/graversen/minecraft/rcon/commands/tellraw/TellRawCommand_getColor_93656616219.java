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

public class TellRawCommand_getColor_93656616219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7297;

    public TellRawCommand_getColor_93656616219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7297 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TellRawCommand"));
        setField(term7297, term7297.getClass(), "text", null);
        setBooleanField(term7297, term7297.getClass(), "bold", false);
        setBooleanField(term7297, term7297.getClass(), "italic", false);
        setBooleanField(term7297, term7297.getClass(), "underlined", false);
        setBooleanField(term7297, term7297.getClass(), "striketrough", false);
        setBooleanField(term7297, term7297.getClass(), "obfuscated", false);
        setField(term7297, term7297.getClass(), "color", null);
        setField(term7297, term7297.getClass(), "clickEvent", null);
        setField(term7297, term7297.getClass(), "hoverEvent", null);
        setField(term7297, term7297.getClass(), "target", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TellRawCommand");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getColor", argTypes, term7297, args);
    }

};


