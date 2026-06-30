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

public class TitleCommandBuilder_build_128958756412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2183;

    public TitleCommandBuilder_build_128958756412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2183 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.title.TitleCommandBuilder"));
        Object term2184 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term2184, term2184.getClass(), "targetString", "tShwQLRGNe");
        setField(term2183, term2183.getClass(), "target", term2184);
        setField(term2183, term2183.getClass(), "position", "LvtrsXUliU");
        setField(term2183, term2183.getClass(), "text", "xLbjWUgOIL");
        setBooleanField(term2183, term2183.getClass(), "bold", false);
        setBooleanField(term2183, term2183.getClass(), "italic", false);
        setBooleanField(term2183, term2183.getClass(), "underlined", true);
        setBooleanField(term2183, term2183.getClass(), "striketrough", false);
        setBooleanField(term2183, term2183.getClass(), "obfuscated", false);
        setField(term2183, term2183.getClass(), "color", "jDtqGUpnZN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.title.TitleCommandBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term2183, args);
    }

};


