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
import java.lang.String;

public class TitleCommandBuilder_atPosition_12527006543 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term576;
     Object enum1;

    public TitleCommandBuilder_atPosition_12527006543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term576 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.title.TitleCommandBuilder"));
        Object term577 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term577, term577.getClass(), "targetString", "RMFIsYGgne");
        setField(term576, term576.getClass(), "target", term577);
        setField(term576, term576.getClass(), "position", "NRdvgJlhkX");
        setField(term576, term576.getClass(), "text", "uuaPigETmJ");
        setBooleanField(term576, term576.getClass(), "bold", false);
        setBooleanField(term576, term576.getClass(), "italic", true);
        setBooleanField(term576, term576.getClass(), "underlined", false);
        setBooleanField(term576, term576.getClass(), "striketrough", true);
        setBooleanField(term576, term576.getClass(), "obfuscated", false);
        setField(term576, term576.getClass(), "color", "MxlszYVzRf");
        Class<? extends Object> term718 = Class.forName((String) "io.graversen.minecraft.rcon.util.TitlePositions");
        Field term717 = ((Class) term718).getDeclaredField((String) "SUBTITLE");
        ((Field) term717).setAccessible(true);
        enum1 = ((Field) term717).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.title.TitleCommandBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.graversen.minecraft.rcon.util.TitlePositions");
        Object[] args = new Object[1];
        args[0] = enum1;
        callMethod(klass, "atPosition", argTypes, term576, args);
    }

};


