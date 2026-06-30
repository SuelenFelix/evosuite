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

public class TitleCommandBuilder_italic_16357586077 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1708;

    public TitleCommandBuilder_italic_16357586077() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1708 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.title.TitleCommandBuilder"));
        Object term1709 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term1709, term1709.getClass(), "targetString", "flxyYxBRtu");
        setField(term1708, term1708.getClass(), "target", term1709);
        setField(term1708, term1708.getClass(), "position", "OclPbYPkcH");
        setField(term1708, term1708.getClass(), "text", "IoAlmYsBwc");
        setBooleanField(term1708, term1708.getClass(), "bold", true);
        setBooleanField(term1708, term1708.getClass(), "italic", true);
        setBooleanField(term1708, term1708.getClass(), "underlined", true);
        setBooleanField(term1708, term1708.getClass(), "striketrough", true);
        setBooleanField(term1708, term1708.getClass(), "obfuscated", false);
        setField(term1708, term1708.getClass(), "color", "TEParAifyi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.title.TitleCommandBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "italic", argTypes, term1708, args);
    }

};


