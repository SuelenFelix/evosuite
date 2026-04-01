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

public class Diplomacy_getDiplomaticRelation_186003080225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70762;
     Object term70785;

    public Diplomacy_getDiplomaticRelation_186003080225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term70766 = new ArrayList();
        ((ArrayList) term70766).add((Object)null);
        ((ArrayList) term70766).add((Object)null);
        ((ArrayList) term70766).add((Object)null);
        ((ArrayList) term70766).add((Object)null);
        ((ArrayList) term70766).add((Object)null);
        ((ArrayList) term70766).add((Object)null);
        ((ArrayList) term70766).add((Object)null);
        ArrayList term70773 = new ArrayList();
        ((ArrayList) term70773).add((Object)null);
        ((ArrayList) term70773).add((Object)null);
        ((ArrayList) term70773).add((Object)null);
        ((ArrayList) term70773).add((Object)null);
        ((ArrayList) term70773).add((Object)null);
        ArrayList term70780 = new ArrayList();
        ((ArrayList) term70780).add((Object)null);
        ((ArrayList) term70780).add((Object)null);
        ((ArrayList) term70780).add((Object)null);
        term70762 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.Diplomacy"));
        Object[] term70763 = (Object[]) newArray("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList", 3);
        Object term70764 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70771 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70778 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        setIntField(term70764, term70764.getClass(), "playerIndex", -1858425735);
        setField(term70764, term70764.getClass(), "list", term70766);
        setIntField(term70764, term70764.getClass(), "numberOfMeetings", -859726380);
        setElement(term70763, 0, term70764);
        setIntField(term70771, term70771.getClass(), "playerIndex", -1498422654);
        setField(term70771, term70771.getClass(), "list", term70773);
        setIntField(term70771, term70771.getClass(), "numberOfMeetings", -21429773);
        setElement(term70763, 1, term70771);
        setIntField(term70778, term70778.getClass(), "playerIndex", 1774728742);
        setField(term70778, term70778.getClass(), "list", term70780);
        setIntField(term70778, term70778.getClass(), "numberOfMeetings", -1822211508);
        setElement(term70763, 2, term70778);
        setField(term70762, term70762.getClass(), "diplomacyList", term70763);
        term70785 = new Integer(-177243872);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.Diplomacy");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term70785;
        callMethod(klass, "getDiplomaticRelation", argTypes, term70762, args);
    }

};


