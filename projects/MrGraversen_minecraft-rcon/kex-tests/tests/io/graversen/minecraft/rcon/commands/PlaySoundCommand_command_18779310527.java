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

public class PlaySoundCommand_command_18779310527 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14483;

    public PlaySoundCommand_command_18779310527() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14483 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.PlaySoundCommand"));
        Object term14484 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Sound"));
        Object term14509 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Position"));
        Object term14510 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term14523 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term14536 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term14551 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term14484, term14484.getClass(), "namespace", "iiHBhsNFgk");
        setField(term14484, term14484.getClass(), "sound", "HknsTajwxJ");
        setField(term14483, term14483.getClass(), "sound", term14484);
        setField(term14510, term14510.getClass(), "coordinate", "XtiurrVYKw");
        setField(term14509, term14509.getClass(), "x", term14510);
        setField(term14523, term14523.getClass(), "coordinate", "rsumfoDNHa");
        setField(term14509, term14509.getClass(), "y", term14523);
        setField(term14536, term14536.getClass(), "coordinate", "ceCWHUTQUM");
        setField(term14509, term14509.getClass(), "z", term14536);
        setField(term14483, term14483.getClass(), "position", term14509);
        setFloatField(term14483, term14483.getClass(), "volume", 0.51832694F);
        setFloatField(term14483, term14483.getClass(), "pitch", 0.97262454F);
        setField(term14551, term14551.getClass(), "targetString", "LrqwfrKKtS");
        setField(term14483, term14483.getClass(), "target", term14551);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.PlaySoundCommand");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "command", argTypes, term14483, args);
    }

};


