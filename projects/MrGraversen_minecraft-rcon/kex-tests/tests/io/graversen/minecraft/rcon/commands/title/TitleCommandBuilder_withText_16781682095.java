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

public class TitleCommandBuilder_withText_16781682095 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1496;

    public TitleCommandBuilder_withText_16781682095() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1496 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.title.TitleCommandBuilder"));
        Object term1497 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term1497, term1497.getClass(), "targetString", "tbcdzjIfER");
        setField(term1496, term1496.getClass(), "target", term1497);
        setField(term1496, term1496.getClass(), "position", "HyxfbSQYBe");
        setField(term1496, term1496.getClass(), "text", "pCTimMblYc");
        setBooleanField(term1496, term1496.getClass(), "bold", true);
        setBooleanField(term1496, term1496.getClass(), "italic", true);
        setBooleanField(term1496, term1496.getClass(), "underlined", true);
        setBooleanField(term1496, term1496.getClass(), "striketrough", true);
        setBooleanField(term1496, term1496.getClass(), "obfuscated", true);
        setField(term1496, term1496.getClass(), "color", "hNxWaHcfhY");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.title.TitleCommandBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "RkybSrpybU";
        callMethod(klass, "withText", argTypes, term1496, args);
    }

};


