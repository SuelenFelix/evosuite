package org.openRealmOfStars.utilities.repository;

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
import static org.openRealmOfStars.utilities.repository.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class DiplomacyRepository_saveDiplomacy_3032354545 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1609;
     Object term1618;

    public DiplomacyRepository_saveDiplomacy_3032354545() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1609 = newInstance(Class.forName("java.io.DataOutputStream"));
        byte[] term1611 = (byte[]) newByteArray(1);
        byte[] term1613 = (byte[]) newByteArray(2);
        Object term1617 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term1609, term1609.getClass(), "written", -1179120542);
        setByteElement(term1611, 0, (byte) -123);
        setField(term1609, term1609.getClass(), "bytearr", term1611);
        setByteElement(term1613, 0, (byte) -23);
        setByteElement(term1613, 1, (byte) 100);
        setField(term1609, term1609.getClass(), "writeBuffer", term1613);
        setField(term1609, term1609.getClass(), "out", null);
        setBooleanField(term1609, term1609.getClass(), "closed", true);
        setField(term1609, term1609.getClass(), "closeLock", term1617);
        ArrayList term1622 = new ArrayList();
        ((ArrayList) term1622).add((Object)null);
        ArrayList term1629 = new ArrayList();
        ((ArrayList) term1629).add((Object)null);
        ArrayList term1636 = new ArrayList();
        ((ArrayList) term1636).add((Object)null);
        ((ArrayList) term1636).add((Object)null);
        ArrayList term1643 = new ArrayList();
        ((ArrayList) term1643).add((Object)null);
        ((ArrayList) term1643).add((Object)null);
        ((ArrayList) term1643).add((Object)null);
        ArrayList term1650 = new ArrayList();
        ((ArrayList) term1650).add((Object)null);
        ((ArrayList) term1650).add((Object)null);
        ((ArrayList) term1650).add((Object)null);
        ((ArrayList) term1650).add((Object)null);
        ArrayList term1657 = new ArrayList();
        ((ArrayList) term1657).add((Object)null);
        ((ArrayList) term1657).add((Object)null);
        ((ArrayList) term1657).add((Object)null);
        ((ArrayList) term1657).add((Object)null);
        ((ArrayList) term1657).add((Object)null);
        ((ArrayList) term1657).add((Object)null);
        ((ArrayList) term1657).add((Object)null);
        ((ArrayList) term1657).add((Object)null);
        ((ArrayList) term1657).add((Object)null);
        term1618 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.Diplomacy"));
        Object[] term1619 = (Object[]) newArray("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList", 6);
        Object term1620 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term1627 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term1634 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term1641 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term1648 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term1655 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        setIntField(term1620, term1620.getClass(), "playerIndex", 1193880199);
        setField(term1620, term1620.getClass(), "list", term1622);
        setIntField(term1620, term1620.getClass(), "numberOfMeetings", -469968304);
        setElement(term1619, 0, term1620);
        setIntField(term1627, term1627.getClass(), "playerIndex", -1145578966);
        setField(term1627, term1627.getClass(), "list", term1629);
        setIntField(term1627, term1627.getClass(), "numberOfMeetings", 767834723);
        setElement(term1619, 1, term1627);
        setIntField(term1634, term1634.getClass(), "playerIndex", -602026508);
        setField(term1634, term1634.getClass(), "list", term1636);
        setIntField(term1634, term1634.getClass(), "numberOfMeetings", -1968847291);
        setElement(term1619, 2, term1634);
        setIntField(term1641, term1641.getClass(), "playerIndex", 579005622);
        setField(term1641, term1641.getClass(), "list", term1643);
        setIntField(term1641, term1641.getClass(), "numberOfMeetings", 292681826);
        setElement(term1619, 3, term1641);
        setIntField(term1648, term1648.getClass(), "playerIndex", 458147407);
        setField(term1648, term1648.getClass(), "list", term1650);
        setIntField(term1648, term1648.getClass(), "numberOfMeetings", -2095575670);
        setElement(term1619, 4, term1648);
        setIntField(term1655, term1655.getClass(), "playerIndex", 1225272962);
        setField(term1655, term1655.getClass(), "list", term1657);
        setIntField(term1655, term1655.getClass(), "numberOfMeetings", 1324040357);
        setElement(term1619, 5, term1655);
        setField(term1618, term1618.getClass(), "diplomacyList", term1619);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.utilities.repository.DiplomacyRepository");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.DataOutputStream");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.diplomacy.Diplomacy");
        Object[] args = new Object[2];
        args[0] = term1609;
        args[1] = term1618;
        callMethod(klass, "saveDiplomacy", argTypes, null, args);
    }

};


