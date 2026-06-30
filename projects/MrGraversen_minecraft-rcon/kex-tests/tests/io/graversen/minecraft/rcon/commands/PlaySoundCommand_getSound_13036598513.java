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

public class PlaySoundCommand_getSound_13036598513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13919;

    public PlaySoundCommand_getSound_13036598513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13919 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.PlaySoundCommand"));
        Object term13920 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Sound"));
        Object term13945 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Position"));
        Object term13946 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term13959 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term13972 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term13987 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term13920, term13920.getClass(), "namespace", "mwmFMNEzkK");
        setField(term13920, term13920.getClass(), "sound", "kVAmKknVln");
        setField(term13919, term13919.getClass(), "sound", term13920);
        setField(term13946, term13946.getClass(), "coordinate", "MRFLbEGYKG");
        setField(term13945, term13945.getClass(), "x", term13946);
        setField(term13959, term13959.getClass(), "coordinate", "BYrGukTyof");
        setField(term13945, term13945.getClass(), "y", term13959);
        setField(term13972, term13972.getClass(), "coordinate", "jiCGTTzKGB");
        setField(term13945, term13945.getClass(), "z", term13972);
        setField(term13919, term13919.getClass(), "position", term13945);
        setFloatField(term13919, term13919.getClass(), "volume", 0.5446086F);
        setFloatField(term13919, term13919.getClass(), "pitch", 0.5254275F);
        setField(term13987, term13987.getClass(), "targetString", "MqICFYzDJj");
        setField(term13919, term13919.getClass(), "target", term13987);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.PlaySoundCommand");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSound", argTypes, term13919, args);
    }

};


