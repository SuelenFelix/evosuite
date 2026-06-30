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

public class TitleCommandBuilder_withColor_12095949234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term983;
     Object enum2;

    public TitleCommandBuilder_withColor_12095949234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term983 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.title.TitleCommandBuilder"));
        Object term984 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term984, term984.getClass(), "targetString", "LQFpaHEwXR");
        setField(term983, term983.getClass(), "target", term984);
        setField(term983, term983.getClass(), "position", "oVcInYnLWB");
        setField(term983, term983.getClass(), "text", "aJlieCFVtF");
        setBooleanField(term983, term983.getClass(), "bold", false);
        setBooleanField(term983, term983.getClass(), "italic", true);
        setBooleanField(term983, term983.getClass(), "underlined", true);
        setBooleanField(term983, term983.getClass(), "striketrough", false);
        setBooleanField(term983, term983.getClass(), "obfuscated", false);
        setField(term983, term983.getClass(), "color", "ZiaGIbnzTs");
        Class<? extends Object> term1265 = Class.forName((String) "io.graversen.minecraft.rcon.util.Colors");
        Field term1264 = ((Class) term1265).getDeclaredField((String) "DARK_GREEN");
        ((Field) term1264).setAccessible(true);
        enum2 = ((Field) term1264).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.title.TitleCommandBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.graversen.minecraft.rcon.util.Colors");
        Object[] args = new Object[1];
        args[0] = enum2;
        callMethod(klass, "withColor", argTypes, term983, args);
    }

};


