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

public class TitleCommand_getColor_8630828928 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3114;

    public TitleCommand_getColor_8630828928() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3114 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.title.TitleCommand"));
        Object term3156 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term3114, term3114.getClass(), "position", "jUbSRrkrYZ");
        setField(term3114, term3114.getClass(), "text", "bWWfajKbEX");
        setBooleanField(term3114, term3114.getClass(), "bold", true);
        setBooleanField(term3114, term3114.getClass(), "italic", true);
        setBooleanField(term3114, term3114.getClass(), "underlined", false);
        setBooleanField(term3114, term3114.getClass(), "striketrough", false);
        setBooleanField(term3114, term3114.getClass(), "obfuscated", true);
        setField(term3114, term3114.getClass(), "color", "cAPeiZHKGJ");
        setField(term3156, term3156.getClass(), "targetString", "LvJFtLBaxj");
        setField(term3114, term3114.getClass(), "target", term3156);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.title.TitleCommand");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getColor", argTypes, term3114, args);
    }

};


