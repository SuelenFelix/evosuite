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

public class TitleCommand_isObfuscated_5647725927 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3019;

    public TitleCommand_isObfuscated_5647725927() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3019 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.title.TitleCommand"));
        Object term3061 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term3019, term3019.getClass(), "position", "OWKQODBLzb");
        setField(term3019, term3019.getClass(), "text", "wGmYcqUkgE");
        setBooleanField(term3019, term3019.getClass(), "bold", false);
        setBooleanField(term3019, term3019.getClass(), "italic", true);
        setBooleanField(term3019, term3019.getClass(), "underlined", true);
        setBooleanField(term3019, term3019.getClass(), "striketrough", true);
        setBooleanField(term3019, term3019.getClass(), "obfuscated", false);
        setField(term3019, term3019.getClass(), "color", "idgaQsnJpQ");
        setField(term3061, term3061.getClass(), "targetString", "VgZnGoIFwQ");
        setField(term3019, term3019.getClass(), "target", term3061);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.title.TitleCommand");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isObfuscated", argTypes, term3019, args);
    }

};


