package io.graversen.minecraft.rcon.commands;

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
import static io.graversen.minecraft.rcon.commands.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PlaySoundCommand_getPosition_199103776312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14641;

    public PlaySoundCommand_getPosition_199103776312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14641 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.PlaySoundCommand"));
        setField(term14641, term14641.getClass(), "sound", null);
        setField(term14641, term14641.getClass(), "position", null);
        setFloatField(term14641, term14641.getClass(), "volume", 0.0F);
        setFloatField(term14641, term14641.getClass(), "pitch", 0.0F);
        setField(term14641, term14641.getClass(), "target", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.PlaySoundCommand");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPosition", argTypes, term14641, args);
    }

};


