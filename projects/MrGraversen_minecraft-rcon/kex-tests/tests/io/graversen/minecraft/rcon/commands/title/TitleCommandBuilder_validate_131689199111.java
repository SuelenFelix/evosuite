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

public class TitleCommandBuilder_validate_131689199111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2088;

    public TitleCommandBuilder_validate_131689199111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2088 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.title.TitleCommandBuilder"));
        Object term2089 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term2089, term2089.getClass(), "targetString", "gGSMzuGICf");
        setField(term2088, term2088.getClass(), "target", term2089);
        setField(term2088, term2088.getClass(), "position", "hxCBltsObl");
        setField(term2088, term2088.getClass(), "text", "BndsHwAFMv");
        setBooleanField(term2088, term2088.getClass(), "bold", false);
        setBooleanField(term2088, term2088.getClass(), "italic", false);
        setBooleanField(term2088, term2088.getClass(), "underlined", true);
        setBooleanField(term2088, term2088.getClass(), "striketrough", false);
        setBooleanField(term2088, term2088.getClass(), "obfuscated", true);
        setField(term2088, term2088.getClass(), "color", "GzFkzHGYFt");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.title.TitleCommandBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "validate", argTypes, term2088, args);
    }

};


