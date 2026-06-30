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

public class SummonCommand_getNbt_18407411612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28512;

    public SummonCommand_getNbt_18407411612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28512 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.SummonCommand"));
        Object term28537 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Position"));
        Object term28538 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term28551 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term28564 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        setField(term28512, term28512.getClass(), "entityName", "yLnzGqyHGL");
        setField(term28512, term28512.getClass(), "nbt", "IjprPXBDuY");
        setField(term28538, term28538.getClass(), "coordinate", "wkqPmmFDAa");
        setField(term28537, term28537.getClass(), "x", term28538);
        setField(term28551, term28551.getClass(), "coordinate", "rLTDtNqLyW");
        setField(term28537, term28537.getClass(), "y", term28551);
        setField(term28564, term28564.getClass(), "coordinate", "CLsbWobdgS");
        setField(term28537, term28537.getClass(), "z", term28564);
        setField(term28512, term28512.getClass(), "position", term28537);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.SummonCommand");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNbt", argTypes, term28512, args);
    }

};


