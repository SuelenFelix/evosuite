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

public class GiveCommand_getNbt_5414194632 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8677;

    public GiveCommand_getNbt_5414194632() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8677 = newInstance(Class.forName("io.graversen.minecraft.rcon.commands.GiveCommand"));
        Object term8678 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Item"));
        Object term8716 = newInstance(Class.forName("io.graversen.minecraft.rcon.util.Target"));
        setField(term8678, term8678.getClass(), "namespace", "dAldIGYAXV");
        setField(term8678, term8678.getClass(), "item", "mLwibAPEsa");
        setField(term8677, term8677.getClass(), "item", term8678);
        setField(term8677, term8677.getClass(), "nbt", "zsWKWiTFuo");
        setIntField(term8677, term8677.getClass(), "count", -616727354);
        setField(term8716, term8716.getClass(), "targetString", "UPUbwyHQKN");
        setField(term8677, term8677.getClass(), "target", term8716);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.commands.GiveCommand");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNbt", argTypes, term8677, args);
    }

};


