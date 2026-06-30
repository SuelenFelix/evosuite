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

public class SummonCommand_getEntityName_16009652951 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28397;

    public SummonCommand_getEntityName_16009652951() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28397 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.SummonCommand"));
        Object term28422 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Position"));
        Object term28423 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term28436 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        Object term28449 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Coordinate"));
        setField(term28397, term28397.getClass(), "entityName", "rgZSPplPSs");
        setField(term28397, term28397.getClass(), "nbt", "NPUSTXlEKx");
        setField(term28423, term28423.getClass(), "coordinate", "KKFprGoNpl");
        setField(term28422, term28422.getClass(), "x", term28423);
        setField(term28436, term28436.getClass(), "coordinate", "tWVISJlxKZ");
        setField(term28422, term28422.getClass(), "y", term28436);
        setField(term28449, term28449.getClass(), "coordinate", "rOZkUKEoaf");
        setField(term28422, term28422.getClass(), "z", term28449);
        setField(term28397, term28397.getClass(), "position", term28422);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.SummonCommand");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEntityName", argTypes, term28397, args);
    }

};


