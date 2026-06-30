package icu.samnyan.aqua.sega.ongeki.model.gamedata;

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
import static icu.samnyan.aqua.sega.ongeki.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class GameReward_setItemKind_3072716595 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9311;
     Object enum6;

    public GameReward_setItemKind_3072716595() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9330 = Class.forName((String) "icu.samnyan.aqua.sega.ongeki.model.common.ItemType");
        Field term9329 = ((Class) term9330).getDeclaredField((String) "None");
        ((Field) term9329).setAccessible(true);
        Object enum5 = ((Field) term9329).get((Object) null);
        term9311 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameReward"));
        setLongField(term9311, term9311.getClass(), "rewardId", 3892018155439224435L);
        setField(term9311, term9311.getClass(), "itemKind", enum5);
        setIntField(term9311, term9311.getClass(), "itemId", 683666002);
        Class<? extends Object> term9599 = Class.forName((String) "icu.samnyan.aqua.sega.ongeki.model.common.ItemType");
        Field term9598 = ((Class) term9599).getDeclaredField((String) "Max");
        ((Field) term9598).setAccessible(true);
        enum6 = ((Field) term9598).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameReward");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.ongeki.model.common.ItemType");
        Object[] args = new Object[1];
        args[0] = enum6;
        callMethod(klass, "setItemKind", argTypes, term9311, args);
    }

};


