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

public class NegotiationOffer_getDiscoveredArtifacts_18550274054 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11847;

    public NegotiationOffer_getDiscoveredArtifacts_18550274054() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11869 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.negotiation.NegotiationType");
        Field term11868 = ((Class) term11869).getDeclaredField((String) "TRADE_ALLIANCE");
        ((Field) term11868).setAccessible(true);
        Object enum30 = ((Field) term11868).get((Object) null);
        term11847 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.negotiation.NegotiationOffer"));
        Object term11866 = newInstance(Class.forName("java.lang.Object"));
        setField(term11847, term11847.getClass(), "negotiationType", enum30);
        setField(term11847, term11847.getClass(), "offerObject", term11866);
        setIntField(term11847, term11847.getClass(), "mapValue", -227365013);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.negotiation.NegotiationOffer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDiscoveredArtifacts", argTypes, term11847, args);
    }

};


