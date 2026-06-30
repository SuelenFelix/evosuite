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
import java.util.ArrayList;

public class PlayerUuids_getPlayerUuids_5088783321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term296;

    public PlayerUuids_getPlayerUuids_5088783321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term297 = new ArrayList();
        ((ArrayList) term297).add("aJlieCFVtF");
        ((ArrayList) term297).add("ZiaGIbnzTs");
        ((ArrayList) term297).add("tbcdzjIfER");
        term296 = newInstance(Class.forName("io.graversen.minecraft.rcon.query.playerlist.PlayerUuids"));
        setField(term296, term296.getClass(), "playerUuids", term297);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.query.playerlist.PlayerUuids");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayerUuids", argTypes, term296, args);
    }

};


