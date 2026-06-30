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

public class PlaySoundCommand_getVolume_14704673365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14201;

    public PlaySoundCommand_getVolume_14704673365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14201 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.PlaySoundCommand"));
        Object term14202 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Sound"));
        Object term14227 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Position"));
        Object term14228 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term14241 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term14254 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term14269 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term14202, term14202.getClass(), "namespace", "oKhVzOKUFW");
        setField(term14202, term14202.getClass(), "sound", "mNHyqmOAFy");
        setField(term14201, term14201.getClass(), "sound", term14202);
        setField(term14228, term14228.getClass(), "coordinate", "UxgSdhxPCH");
        setField(term14227, term14227.getClass(), "x", term14228);
        setField(term14241, term14241.getClass(), "coordinate", "DAujxZPHJC");
        setField(term14227, term14227.getClass(), "y", term14241);
        setField(term14254, term14254.getClass(), "coordinate", "IlBhdrCvHq");
        setField(term14227, term14227.getClass(), "z", term14254);
        setField(term14201, term14201.getClass(), "position", term14227);
        setFloatField(term14201, term14201.getClass(), "volume", 0.3692338F);
        setFloatField(term14201, term14201.getClass(), "pitch", 0.13906479F);
        setField(term14269, term14269.getClass(), "targetString", "OirVUQhauU");
        setField(term14201, term14201.getClass(), "target", term14269);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.PlaySoundCommand");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVolume", argTypes, term14201, args);
    }

};


