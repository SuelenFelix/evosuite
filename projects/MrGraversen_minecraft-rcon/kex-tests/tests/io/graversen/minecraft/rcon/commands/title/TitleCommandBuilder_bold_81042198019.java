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

public class TitleCommandBuilder_bold_81042198019 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2308;

    public TitleCommandBuilder_bold_81042198019() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2308 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.title.TitleCommandBuilder"));
        setField(term2308, term2308.getClass(), "target", null);
        setField(term2308, term2308.getClass(), "position", null);
        setField(term2308, term2308.getClass(), "text", null);
        setBooleanField(term2308, term2308.getClass(), "bold", false);
        setBooleanField(term2308, term2308.getClass(), "italic", false);
        setBooleanField(term2308, term2308.getClass(), "underlined", false);
        setBooleanField(term2308, term2308.getClass(), "striketrough", false);
        setBooleanField(term2308, term2308.getClass(), "obfuscated", false);
        setField(term2308, term2308.getClass(), "color", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.title.TitleCommandBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "bold", argTypes, term2308, args);
    }

};


