package org.openRealmOfStars.player.race.trait;

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
import static org.openRealmOfStars.player.race.trait.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;

public class RaceTrait_setGroup_13326014408 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1231;

    public RaceTrait_setGroup_13326014408() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1280 = new ArrayList();
        ((ArrayList) term1280).add("dEnhdmILtU");
        ((ArrayList) term1280).add("hoicvmsovO");
        ((ArrayList) term1280).add("eqJfYWRaEL");
        ((ArrayList) term1280).add("fhkbdRViHi");
        ((ArrayList) term1280).add("uWHnvSvaPl");
        ((ArrayList) term1280).add("kBdSllIBVz");
        term1231 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term1231, term1231.getClass(), "traitId", "MLqYREekMl");
        setField(term1231, term1231.getClass(), "traitName", "ytSBIKXogI");
        setField(term1231, term1231.getClass(), "description", "nHXjMycHlU");
        setField(term1231, term1231.getClass(), "group", "ieCtQFdkii");
        setField(term1231, term1231.getClass(), "conflictsWithIds", term1280);
        setByteField(term1231, term1231.getClass(), "traitPoints", (byte) -10);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "TJmVBGfTML";
        callMethod(klass, "setGroup", argTypes, term1231, args);
    }

};


