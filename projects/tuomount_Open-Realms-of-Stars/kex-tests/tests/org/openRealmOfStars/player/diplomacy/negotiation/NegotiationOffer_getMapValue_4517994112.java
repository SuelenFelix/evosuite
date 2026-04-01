package org.openRealmOfStars.player.diplomacy.negotiation;

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
import static org.openRealmOfStars.player.diplomacy.negotiation.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class NegotiationOffer_getMapValue_4517994112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14803;

    public NegotiationOffer_getMapValue_4517994112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term14828 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.negotiation.NegotiationType");
        Field term14827 = ((Class) term14828).getDeclaredField((String) "MAP_ENEMY_PLANETS");
        ((Field) term14827).setAccessible(true);
        Object enum38 = ((Field) term14827).get((Object) null);
        term14803 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.negotiation.NegotiationOffer"));
        Object term14825 = newInstance(Class.forName("java.lang.Object"));
        setField(term14803, term14803.getClass(), "negotiationType", enum38);
        setField(term14803, term14803.getClass(), "offerObject", term14825);
        setIntField(term14803, term14803.getClass(), "mapValue", -243422082);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.negotiation.NegotiationOffer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMapValue", argTypes, term14803, args);
    }

};


