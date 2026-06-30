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

public class TitleCommand_isItalic_4969414444 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2734;

    public TitleCommand_isItalic_4969414444() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2734 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.title.TitleCommand"));
        Object term2776 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term2734, term2734.getClass(), "position", "kBdSllIBVz");
        setField(term2734, term2734.getClass(), "text", "TJmVBGfTML");
        setBooleanField(term2734, term2734.getClass(), "bold", false);
        setBooleanField(term2734, term2734.getClass(), "italic", false);
        setBooleanField(term2734, term2734.getClass(), "underlined", true);
        setBooleanField(term2734, term2734.getClass(), "striketrough", false);
        setBooleanField(term2734, term2734.getClass(), "obfuscated", true);
        setField(term2734, term2734.getClass(), "color", "tPlsykYBqO");
        setField(term2776, term2776.getClass(), "targetString", "bLPjGVBhlX");
        setField(term2734, term2734.getClass(), "target", term2776);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.title.TitleCommand");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isItalic", argTypes, term2734, args);
    }

};


