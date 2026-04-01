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

public class NegotiationOffer_getFleet_11724784265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12242;

    public NegotiationOffer_getFleet_11724784265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12263 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.negotiation.NegotiationType");
        Field term12262 = ((Class) term12263).getDeclaredField((String) "TRADE_EMBARGO");
        ((Field) term12262).setAccessible(true);
        Object enum31 = ((Field) term12262).get((Object) null);
        term12242 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.negotiation.NegotiationOffer"));
        Object term12260 = newInstance(Class.forName("java.lang.Object"));
        setField(term12242, term12242.getClass(), "negotiationType", enum31);
        setField(term12242, term12242.getClass(), "offerObject", term12260);
        setIntField(term12242, term12242.getClass(), "mapValue", 11724947);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.negotiation.NegotiationOffer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFleet", argTypes, term12242, args);
    }

};


