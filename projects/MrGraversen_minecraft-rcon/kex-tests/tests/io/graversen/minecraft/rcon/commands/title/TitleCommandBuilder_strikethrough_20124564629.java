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

public class TitleCommandBuilder_strikethrough_20124564629 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1898;

    public TitleCommandBuilder_strikethrough_20124564629() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1898 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.title.TitleCommandBuilder"));
        Object term1899 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term1899, term1899.getClass(), "targetString", "kuTXqwMtDB");
        setField(term1898, term1898.getClass(), "target", term1899);
        setField(term1898, term1898.getClass(), "position", "Ghbwtircqb");
        setField(term1898, term1898.getClass(), "text", "xrwlQZdwCp");
        setBooleanField(term1898, term1898.getClass(), "bold", false);
        setBooleanField(term1898, term1898.getClass(), "italic", false);
        setBooleanField(term1898, term1898.getClass(), "underlined", true);
        setBooleanField(term1898, term1898.getClass(), "striketrough", true);
        setBooleanField(term1898, term1898.getClass(), "obfuscated", false);
        setField(term1898, term1898.getClass(), "color", "IDCWpPLRkE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.title.TitleCommandBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "strikethrough", argTypes, term1898, args);
    }

};


