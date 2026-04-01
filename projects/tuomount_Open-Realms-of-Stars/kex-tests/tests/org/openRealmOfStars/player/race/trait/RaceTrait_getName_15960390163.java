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

public class RaceTrait_getName_15960390163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term409;

    public RaceTrait_getName_15960390163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term458 = new ArrayList();
        ((ArrayList) term458).add("vrQLuWIDJX");
        ((ArrayList) term458).add("flxyYxBRtu");
        ((ArrayList) term458).add("OclPbYPkcH");
        term409 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term409, term409.getClass(), "traitId", "RkybSrpybU");
        setField(term409, term409.getClass(), "traitName", "xOEqzGAmDU");
        setField(term409, term409.getClass(), "description", "eZFUvlxvGV");
        setField(term409, term409.getClass(), "group", "BYqFIqCKAV");
        setField(term409, term409.getClass(), "conflictsWithIds", term458);
        setByteField(term409, term409.getClass(), "traitPoints", (byte) 75);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term409, args);
    }

};


