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

public class PlayerUuidsMapper_apply_5005356891 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term422;
     Object term423;

    public PlayerUuidsMapper_apply_5005356891() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term422 = newInstance(Class.forName("io.graversen.minecraft.rcon.query.playerlist.PlayerUuidsMapper"));
        term423 = newInstance(Class.forName("io.graversen.minecraft.rcon.RconResponse"));
        setLongField(term423, term423.getClass(), "requestStart", -8400487765614892086L);
        setLongField(term423, term423.getClass(), "requestEnd", 5270370404989704783L);
        setLongField(term423, term423.getClass(), "requestDuration", 7411271909051562686L);
        setIntField(term423, term423.getClass(), "requestCounter", 1484323161);
        setIntField(term423, term423.getClass(), "responseId", 391863371);
        setField(term423, term423.getClass(), "responseString", "hNxWaHcfhY");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.query.playerlist.PlayerUuidsMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.graversen.minecraft.rcon.RconResponse");
        Object[] args = new Object[1];
        args[0] = term423;
        callMethod(klass, "apply", argTypes, term422, args);
    }

};


