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

public class RaceTrait_getDescription_15065689894 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term569;

    public RaceTrait_getDescription_15065689894() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term618 = new ArrayList();
        ((ArrayList) term618).add("AijpHYOFuy");
        ((ArrayList) term618).add("SbAoxhfrkn");
        ((ArrayList) term618).add("kuTXqwMtDB");
        ((ArrayList) term618).add("Ghbwtircqb");
        term569 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term569, term569.getClass(), "traitId", "IoAlmYsBwc");
        setField(term569, term569.getClass(), "traitName", "TEParAifyi");
        setField(term569, term569.getClass(), "description", "OWDIEULEFu");
        setField(term569, term569.getClass(), "group", "dWRymuLBtr");
        setField(term569, term569.getClass(), "conflictsWithIds", term618);
        setByteField(term569, term569.getClass(), "traitPoints", (byte) 18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDescription", argTypes, term569, args);
    }

};


