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

public class TitleCommandBuilder_obfuscated_153599222710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1993;

    public TitleCommandBuilder_obfuscated_153599222710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1993 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.title.TitleCommandBuilder"));
        Object term1994 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term1994, term1994.getClass(), "targetString", "nyiiPDVjAc");
        setField(term1993, term1993.getClass(), "target", term1994);
        setField(term1993, term1993.getClass(), "position", "aKnKipADSo");
        setField(term1993, term1993.getClass(), "text", "wSQxaModmm");
        setBooleanField(term1993, term1993.getClass(), "bold", true);
        setBooleanField(term1993, term1993.getClass(), "italic", true);
        setBooleanField(term1993, term1993.getClass(), "underlined", true);
        setBooleanField(term1993, term1993.getClass(), "striketrough", false);
        setBooleanField(term1993, term1993.getClass(), "obfuscated", true);
        setField(term1993, term1993.getClass(), "color", "UlajhuVLaP");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.title.TitleCommandBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "obfuscated", argTypes, term1993, args);
    }

};


