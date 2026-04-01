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
import java.lang.Integer;

public class NegotiationOffer_setMapValue_73257852513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15210;
     Object term15236;

    public NegotiationOffer_setMapValue_73257852513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term15239 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.negotiation.NegotiationType");
        Field term15238 = ((Class) term15239).getDeclaredField((String) "DISCOVERED_ARTIFACT");
        ((Field) term15238).setAccessible(true);
        Object enum39 = ((Field) term15238).get((Object) null);
        term15210 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.negotiation.NegotiationOffer"));
        Object term15234 = newInstance(Class.forName("java.lang.Object"));
        setField(term15210, term15210.getClass(), "negotiationType", enum39);
        setField(term15210, term15210.getClass(), "offerObject", term15234);
        setIntField(term15210, term15210.getClass(), "mapValue", 1384592638);
        term15236 = new Integer(-1002370457);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.negotiation.NegotiationOffer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term15236;
        callMethod(klass, "setMapValue", argTypes, term15210, args);
    }

};


