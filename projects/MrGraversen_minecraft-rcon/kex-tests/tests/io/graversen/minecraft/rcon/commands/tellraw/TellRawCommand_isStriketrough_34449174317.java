package io.graversen.minecraft.rcon.commands.tellraw;

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
import static io.graversen.minecraft.rcon.commands.tellraw.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TellRawCommand_isStriketrough_34449174317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7285;

    public TellRawCommand_isStriketrough_34449174317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7285 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TellRawCommand"));
        setField(term7285, term7285.getClass(), "text", null);
        setBooleanField(term7285, term7285.getClass(), "bold", false);
        setBooleanField(term7285, term7285.getClass(), "italic", false);
        setBooleanField(term7285, term7285.getClass(), "underlined", false);
        setBooleanField(term7285, term7285.getClass(), "striketrough", false);
        setBooleanField(term7285, term7285.getClass(), "obfuscated", false);
        setField(term7285, term7285.getClass(), "color", null);
        setField(term7285, term7285.getClass(), "clickEvent", null);
        setField(term7285, term7285.getClass(), "hoverEvent", null);
        setField(term7285, term7285.getClass(), "target", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.tellraw.TellRawCommand");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isStriketrough", argTypes, term7285, args);
    }

};


