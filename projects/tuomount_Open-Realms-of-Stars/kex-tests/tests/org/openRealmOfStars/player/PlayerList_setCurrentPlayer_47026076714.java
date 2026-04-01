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

public class PlayerList_setCurrentPlayer_47026076714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2767669;
     Object term2767675;

    public PlayerList_setCurrentPlayer_47026076714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2767670 = new ArrayList();
        term2767669 = newInstance(Class.forName("org.openRealmOfStars.player.PlayerList"));
        setField(term2767669, term2767669.getClass(), "list", term2767670);
        setIntField(term2767669, term2767669.getClass(), "currentPlayer", 2077891723);
        term2767675 = new Integer(439981178);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.PlayerList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2767675;
        callMethod(klass, "setCurrentPlayer", argTypes, term2767669, args);
    }

};


