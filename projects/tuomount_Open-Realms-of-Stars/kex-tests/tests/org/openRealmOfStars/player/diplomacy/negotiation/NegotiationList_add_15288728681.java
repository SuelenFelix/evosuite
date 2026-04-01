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
import java.util.ArrayList;
import java.lang.String;
import java.lang.Object;

public class NegotiationList_add_15288728681 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16427;
     Object term16432;

    public NegotiationList_add_15288728681() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term16428 = new ArrayList();
        term16427 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.negotiation.NegotiationList"));
        setField(term16427, term16427.getClass(), "list", term16428);
        Class<? extends Object> term16454 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.negotiation.NegotiationType");
        Field term16453 = ((Class) term16454).getDeclaredField((String) "TRADE_ALLIANCE");
        ((Field) term16453).setAccessible(true);
        Object enum42 = ((Field) term16453).get((Object) null);
        term16432 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.negotiation.NegotiationOffer"));
        Object term16451 = newInstance(Class.forName("java.lang.Object"));
        setField(term16432, term16432.getClass(), "negotiationType", enum42);
        setField(term16432, term16432.getClass(), "offerObject", term16451);
        setIntField(term16432, term16432.getClass(), "mapValue", -2014576105);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.negotiation.NegotiationList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.diplomacy.negotiation.NegotiationOffer");
        Object[] args = new Object[1];
        args[0] = term16432;
        callMethod(klass, "add", argTypes, term16427, args);
    }

};


