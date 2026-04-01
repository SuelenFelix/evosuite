package org.openRealmOfStars.player.diplomacy;

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
import static org.openRealmOfStars.player.diplomacy.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Integer;

public class Diplomacy_getLikingAsColor_194294853922 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70652;
     Object term70703;

    public Diplomacy_getLikingAsColor_194294853922() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term70656 = new ArrayList();
        ((ArrayList) term70656).add((Object)null);
        ((ArrayList) term70656).add((Object)null);
        ArrayList term70663 = new ArrayList();
        ((ArrayList) term70663).add((Object)null);
        ((ArrayList) term70663).add((Object)null);
        ArrayList term70670 = new ArrayList();
        ArrayList term70677 = new ArrayList();
        ((ArrayList) term70677).add((Object)null);
        ((ArrayList) term70677).add((Object)null);
        ((ArrayList) term70677).add((Object)null);
        ((ArrayList) term70677).add((Object)null);
        ArrayList term70684 = new ArrayList();
        ((ArrayList) term70684).add((Object)null);
        ((ArrayList) term70684).add((Object)null);
        ((ArrayList) term70684).add((Object)null);
        ((ArrayList) term70684).add((Object)null);
        ((ArrayList) term70684).add((Object)null);
        ((ArrayList) term70684).add((Object)null);
        ((ArrayList) term70684).add((Object)null);
        ((ArrayList) term70684).add((Object)null);
        ((ArrayList) term70684).add((Object)null);
        ArrayList term70691 = new ArrayList();
        ((ArrayList) term70691).add((Object)null);
        ((ArrayList) term70691).add((Object)null);
        ((ArrayList) term70691).add((Object)null);
        ((ArrayList) term70691).add((Object)null);
        ((ArrayList) term70691).add((Object)null);
        ((ArrayList) term70691).add((Object)null);
        ArrayList term70698 = new ArrayList();
        ((ArrayList) term70698).add((Object)null);
        ((ArrayList) term70698).add((Object)null);
        ((ArrayList) term70698).add((Object)null);
        ((ArrayList) term70698).add((Object)null);
        ((ArrayList) term70698).add((Object)null);
        ((ArrayList) term70698).add((Object)null);
        ((ArrayList) term70698).add((Object)null);
        term70652 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.Diplomacy"));
        Object[] term70653 = (Object[]) newArray("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList", 7);
        Object term70654 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70661 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70668 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70675 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70682 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70689 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70696 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        setIntField(term70654, term70654.getClass(), "playerIndex", 1342884142);
        setField(term70654, term70654.getClass(), "list", term70656);
        setIntField(term70654, term70654.getClass(), "numberOfMeetings", 522501050);
        setElement(term70653, 0, term70654);
        setIntField(term70661, term70661.getClass(), "playerIndex", 125432890);
        setField(term70661, term70661.getClass(), "list", term70663);
        setIntField(term70661, term70661.getClass(), "numberOfMeetings", -1322797287);
        setElement(term70653, 1, term70661);
        setIntField(term70668, term70668.getClass(), "playerIndex", -615198242);
        setField(term70668, term70668.getClass(), "list", term70670);
        setIntField(term70668, term70668.getClass(), "numberOfMeetings", -491132382);
        setElement(term70653, 2, term70668);
        setIntField(term70675, term70675.getClass(), "playerIndex", 918882916);
        setField(term70675, term70675.getClass(), "list", term70677);
        setIntField(term70675, term70675.getClass(), "numberOfMeetings", 1445291866);
        setElement(term70653, 3, term70675);
        setIntField(term70682, term70682.getClass(), "playerIndex", -139927812);
        setField(term70682, term70682.getClass(), "list", term70684);
        setIntField(term70682, term70682.getClass(), "numberOfMeetings", -1236696275);
        setElement(term70653, 4, term70682);
        setIntField(term70689, term70689.getClass(), "playerIndex", 575249858);
        setField(term70689, term70689.getClass(), "list", term70691);
        setIntField(term70689, term70689.getClass(), "numberOfMeetings", -297957951);
        setElement(term70653, 5, term70689);
        setIntField(term70696, term70696.getClass(), "playerIndex", -1816920588);
        setField(term70696, term70696.getClass(), "list", term70698);
        setIntField(term70696, term70696.getClass(), "numberOfMeetings", 1674165862);
        setElement(term70653, 6, term70696);
        setField(term70652, term70652.getClass(), "diplomacyList", term70653);
        term70703 = new Integer(1875252647);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.Diplomacy");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term70703;
        callMethod(klass, "getLikingAsColor", argTypes, term70652, args);
    }

};


