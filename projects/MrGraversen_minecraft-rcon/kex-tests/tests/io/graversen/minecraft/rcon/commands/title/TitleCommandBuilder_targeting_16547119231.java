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

public class TitleCommandBuilder_targeting_16547119231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public TitleCommandBuilder_targeting_16547119231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.title.TitleCommandBuilder"));
        Object term2 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term2, term2.getClass(), "targetString", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "target", term2);
        setField(term1, term1.getClass(), "position", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "text", "MuLcgQHgqz");
        setBooleanField(term1, term1.getClass(), "bold", false);
        setBooleanField(term1, term1.getClass(), "italic", false);
        setBooleanField(term1, term1.getClass(), "underlined", false);
        setBooleanField(term1, term1.getClass(), "striketrough", false);
        setBooleanField(term1, term1.getClass(), "obfuscated", true);
        setField(term1, term1.getClass(), "color", "xxtlPwDYFs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.title.TitleCommandBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jJCZpVmanW";
        callMethod(klass, "targeting", argTypes, term1, args);
    }

};


