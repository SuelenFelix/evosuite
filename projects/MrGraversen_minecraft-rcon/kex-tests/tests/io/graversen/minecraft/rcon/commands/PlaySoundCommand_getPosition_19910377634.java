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

public class PlaySoundCommand_getPosition_19910377634 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14060;

    public PlaySoundCommand_getPosition_19910377634() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14060 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.PlaySoundCommand"));
        Object term14061 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Sound"));
        Object term14086 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Position"));
        Object term14087 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term14100 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term14113 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term14128 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term14061, term14061.getClass(), "namespace", "YgQvdcBQKw");
        setField(term14061, term14061.getClass(), "sound", "FiYYLuailz");
        setField(term14060, term14060.getClass(), "sound", term14061);
        setField(term14087, term14087.getClass(), "coordinate", "XebAeSnCKZ");
        setField(term14086, term14086.getClass(), "x", term14087);
        setField(term14100, term14100.getClass(), "coordinate", "GeddnXjHGy");
        setField(term14086, term14086.getClass(), "y", term14100);
        setField(term14113, term14113.getClass(), "coordinate", "vLTbaoAxBm");
        setField(term14086, term14086.getClass(), "z", term14113);
        setField(term14060, term14060.getClass(), "position", term14086);
        setFloatField(term14060, term14060.getClass(), "volume", 0.40176582F);
        setFloatField(term14060, term14060.getClass(), "pitch", 0.8783184F);
        setField(term14128, term14128.getClass(), "targetString", "BXTjEyEZxD");
        setField(term14060, term14060.getClass(), "target", term14128);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.PlaySoundCommand");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPosition", argTypes, term14060, args);
    }

};


