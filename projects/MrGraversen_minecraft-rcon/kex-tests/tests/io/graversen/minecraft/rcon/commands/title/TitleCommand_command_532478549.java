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

public class TitleCommand_command_532478549 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3209;

    public TitleCommand_command_532478549() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3209 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.title.TitleCommand"));
        Object term3251 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term3209, term3209.getClass(), "position", "PHvxnGHptP");
        setField(term3209, term3209.getClass(), "text", "TimdotUuNC");
        setBooleanField(term3209, term3209.getClass(), "bold", true);
        setBooleanField(term3209, term3209.getClass(), "italic", true);
        setBooleanField(term3209, term3209.getClass(), "underlined", false);
        setBooleanField(term3209, term3209.getClass(), "striketrough", true);
        setBooleanField(term3209, term3209.getClass(), "obfuscated", true);
        setField(term3209, term3209.getClass(), "color", "PkWMRdJcBb");
        setField(term3251, term3251.getClass(), "targetString", "jSpAteRute");
        setField(term3209, term3209.getClass(), "target", term3251);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.title.TitleCommand");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "command", argTypes, term3209, args);
    }

};


