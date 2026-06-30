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

public class TitleCommandBuilder_underlined_6522836578 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1803;

    public TitleCommandBuilder_underlined_6522836578() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1803 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.title.TitleCommandBuilder"));
        Object term1804 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term1804, term1804.getClass(), "targetString", "OWDIEULEFu");
        setField(term1803, term1803.getClass(), "target", term1804);
        setField(term1803, term1803.getClass(), "position", "dWRymuLBtr");
        setField(term1803, term1803.getClass(), "text", "AijpHYOFuy");
        setBooleanField(term1803, term1803.getClass(), "bold", true);
        setBooleanField(term1803, term1803.getClass(), "italic", true);
        setBooleanField(term1803, term1803.getClass(), "underlined", true);
        setBooleanField(term1803, term1803.getClass(), "striketrough", true);
        setBooleanField(term1803, term1803.getClass(), "obfuscated", false);
        setField(term1803, term1803.getClass(), "color", "SbAoxhfrkn");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.title.TitleCommandBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "underlined", argTypes, term1803, args);
    }

};


