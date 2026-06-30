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
import java.lang.Object;

public class PlaySoundCommand_getPitch_17366359066 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14342;

    public PlaySoundCommand_getPitch_17366359066() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14342 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.PlaySoundCommand"));
        Object term14343 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Sound"));
        Object term14368 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Position"));
        Object term14369 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term14382 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term14395 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term14410 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term14343, term14343.getClass(), "namespace", "GLbyDfbNZI");
        setField(term14343, term14343.getClass(), "sound", "oNLcCYDAsO");
        setField(term14342, term14342.getClass(), "sound", term14343);
        setField(term14369, term14369.getClass(), "coordinate", "CNqMxLvtcJ");
        setField(term14368, term14368.getClass(), "x", term14369);
        setField(term14382, term14382.getClass(), "coordinate", "ktbqerIaKW");
        setField(term14368, term14368.getClass(), "y", term14382);
        setField(term14395, term14395.getClass(), "coordinate", "VoghngXfsK");
        setField(term14368, term14368.getClass(), "z", term14395);
        setField(term14342, term14342.getClass(), "position", term14368);
        setFloatField(term14342, term14342.getClass(), "volume", 0.37773192F);
        setFloatField(term14342, term14342.getClass(), "pitch", 0.24413109F);
        setField(term14410, term14410.getClass(), "targetString", "GbahCBMvct");
        setField(term14342, term14342.getClass(), "target", term14410);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.PlaySoundCommand");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPitch", argTypes, term14342, args);
    }

};


