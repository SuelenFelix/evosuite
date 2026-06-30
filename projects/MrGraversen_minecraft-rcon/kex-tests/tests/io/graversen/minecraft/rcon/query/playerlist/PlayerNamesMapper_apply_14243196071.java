package io.graversen.minecraft.rcon.query.playerlist;

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
import static io.graversen.minecraft.rcon.query.playerlist.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PlayerNamesMapper_apply_14243196071 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term368;
     Object term369;

    public PlayerNamesMapper_apply_14243196071() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term368 = newInstance(Class.forName("io.graversen.minecraft.rcon.query.playerlist.PlayerNamesMapper"));
        term369 = newInstance(Class.forName("io.graversen.minecraft.rcon.RconResponse"));
        setLongField(term369, term369.getClass(), "requestStart", 2442117782898005296L);
        setLongField(term369, term369.getClass(), "requestEnd", 6375119433582206027L);
        setLongField(term369, term369.getClass(), "requestDuration", -8257434502486459194L);
        setIntField(term369, term369.getClass(), "requestCounter", 568599855);
        setIntField(term369, term369.getClass(), "responseId", 1162663216);
        setField(term369, term369.getClass(), "responseString", "HyxfbSQYBe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.query.playerlist.PlayerNamesMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.graversen.minecraft.rcon.RconResponse");
        Object[] args = new Object[1];
        args[0] = term369;
        callMethod(klass, "apply", argTypes, term368, args);
    }

};


