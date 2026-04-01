package org.openRealmOfStars.player;

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
import static org.openRealmOfStars.player.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Integer;

public class PlayerList_getPlayerInfoByIndex_203663263311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2767649;
     Object term2767655;

    public PlayerList_getPlayerInfoByIndex_203663263311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2767650 = new ArrayList();
        term2767649 = newInstance(Class.forName("org.openRealmOfStars.player.PlayerList"));
        setField(term2767649, term2767649.getClass(), "list", term2767650);
        setIntField(term2767649, term2767649.getClass(), "currentPlayer", 1981200590);
        term2767655 = new Integer(1323951876);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.PlayerList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2767655;
        callMethod(klass, "getPlayerInfoByIndex", argTypes, term2767649, args);
    }

};


