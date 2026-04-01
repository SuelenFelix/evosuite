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

public class Diplomacy_getLikingAsString_86931868921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70606;
     Object term70650;

    public Diplomacy_getLikingAsString_86931868921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term70610 = new ArrayList();
        ((ArrayList) term70610).add((Object)null);
        ((ArrayList) term70610).add((Object)null);
        ((ArrayList) term70610).add((Object)null);
        ((ArrayList) term70610).add((Object)null);
        ((ArrayList) term70610).add((Object)null);
        ((ArrayList) term70610).add((Object)null);
        ((ArrayList) term70610).add((Object)null);
        ((ArrayList) term70610).add((Object)null);
        ((ArrayList) term70610).add((Object)null);
        ArrayList term70617 = new ArrayList();
        ((ArrayList) term70617).add((Object)null);
        ((ArrayList) term70617).add((Object)null);
        ((ArrayList) term70617).add((Object)null);
        ((ArrayList) term70617).add((Object)null);
        ArrayList term70624 = new ArrayList();
        ArrayList term70631 = new ArrayList();
        ((ArrayList) term70631).add((Object)null);
        ((ArrayList) term70631).add((Object)null);
        ((ArrayList) term70631).add((Object)null);
        ((ArrayList) term70631).add((Object)null);
        ((ArrayList) term70631).add((Object)null);
        ArrayList term70638 = new ArrayList();
        ((ArrayList) term70638).add((Object)null);
        ((ArrayList) term70638).add((Object)null);
        ((ArrayList) term70638).add((Object)null);
        ArrayList term70645 = new ArrayList();
        ((ArrayList) term70645).add((Object)null);
        ((ArrayList) term70645).add((Object)null);
        ((ArrayList) term70645).add((Object)null);
        term70606 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.Diplomacy"));
        Object[] term70607 = (Object[]) newArray("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList", 6);
        Object term70608 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70615 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70622 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70629 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70636 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70643 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        setIntField(term70608, term70608.getClass(), "playerIndex", 1486351894);
        setField(term70608, term70608.getClass(), "list", term70610);
        setIntField(term70608, term70608.getClass(), "numberOfMeetings", -1667787735);
        setElement(term70607, 0, term70608);
        setIntField(term70615, term70615.getClass(), "playerIndex", 1841765799);
        setField(term70615, term70615.getClass(), "list", term70617);
        setIntField(term70615, term70615.getClass(), "numberOfMeetings", -1442923471);
        setElement(term70607, 1, term70615);
        setIntField(term70622, term70622.getClass(), "playerIndex", -434247549);
        setField(term70622, term70622.getClass(), "list", term70624);
        setIntField(term70622, term70622.getClass(), "numberOfMeetings", 1246505552);
        setElement(term70607, 2, term70622);
        setIntField(term70629, term70629.getClass(), "playerIndex", -1456497810);
        setField(term70629, term70629.getClass(), "list", term70631);
        setIntField(term70629, term70629.getClass(), "numberOfMeetings", 61954667);
        setElement(term70607, 3, term70629);
        setIntField(term70636, term70636.getClass(), "playerIndex", -919022885);
        setField(term70636, term70636.getClass(), "list", term70638);
        setIntField(term70636, term70636.getClass(), "numberOfMeetings", -1836286878);
        setElement(term70607, 4, term70636);
        setIntField(term70643, term70643.getClass(), "playerIndex", 276336694);
        setField(term70643, term70643.getClass(), "list", term70645);
        setIntField(term70643, term70643.getClass(), "numberOfMeetings", 1627938506);
        setElement(term70607, 5, term70643);
        setField(term70606, term70606.getClass(), "diplomacyList", term70607);
        term70650 = new Integer(386284750);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.Diplomacy");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term70650;
        callMethod(klass, "getLikingAsString", argTypes, term70606, args);
    }

};


