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

public class RaceTrait_getPoints_19070278536 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term867;

    public RaceTrait_getPoints_19070278536() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term916 = new ArrayList();
        ((ArrayList) term916).add("GzFkzHGYFt");
        ((ArrayList) term916).add("tShwQLRGNe");
        ((ArrayList) term916).add("LvtrsXUliU");
        ((ArrayList) term916).add("xLbjWUgOIL");
        ((ArrayList) term916).add("jDtqGUpnZN");
        ((ArrayList) term916).add("nGKItKLYNC");
        term867 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term867, term867.getClass(), "traitId", "UlajhuVLaP");
        setField(term867, term867.getClass(), "traitName", "gGSMzuGICf");
        setField(term867, term867.getClass(), "description", "hxCBltsObl");
        setField(term867, term867.getClass(), "group", "BndsHwAFMv");
        setField(term867, term867.getClass(), "conflictsWithIds", term916);
        setByteField(term867, term867.getClass(), "traitPoints", (byte) -29);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPoints", argTypes, term867, args);
    }

};


