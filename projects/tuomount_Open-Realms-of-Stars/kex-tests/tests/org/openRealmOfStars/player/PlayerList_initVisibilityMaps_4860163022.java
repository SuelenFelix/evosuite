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

public class PlayerList_initVisibilityMaps_4860163022 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2775220;
     Object term2775226;
     Object term2775228;

    public PlayerList_initVisibilityMaps_4860163022() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2775221 = new ArrayList();
        term2775220 = newInstance(Class.forName("org.openRealmOfStars.player.PlayerList"));
        setField(term2775220, term2775220.getClass(), "list", term2775221);
        setIntField(term2775220, term2775220.getClass(), "currentPlayer", -1934654805);
        term2775226 = new Integer(523531776);
        term2775228 = new Integer(-905291443);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.PlayerList");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term2775226;
        args[1] = term2775228;
        callMethod(klass, "initVisibilityMaps", argTypes, term2775220, args);
    }

};


