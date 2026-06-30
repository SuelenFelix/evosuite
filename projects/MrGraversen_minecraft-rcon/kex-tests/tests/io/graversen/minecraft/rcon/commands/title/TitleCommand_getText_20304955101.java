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

public class TitleCommand_getText_20304955101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2449;

    public TitleCommand_getText_20304955101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2449 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.title.TitleCommand"));
        Object term2491 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term2449, term2449.getClass(), "position", "onpbIeEKoi");
        setField(term2449, term2449.getClass(), "text", "YRHGsAkhxb");
        setBooleanField(term2449, term2449.getClass(), "bold", false);
        setBooleanField(term2449, term2449.getClass(), "italic", true);
        setBooleanField(term2449, term2449.getClass(), "underlined", true);
        setBooleanField(term2449, term2449.getClass(), "striketrough", true);
        setBooleanField(term2449, term2449.getClass(), "obfuscated", false);
        setField(term2449, term2449.getClass(), "color", "ffYhPOzlUs");
        setField(term2491, term2491.getClass(), "targetString", "MLqYREekMl");
        setField(term2449, term2449.getClass(), "target", term2491);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.title.TitleCommand");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getText", argTypes, term2449, args);
    }

};


