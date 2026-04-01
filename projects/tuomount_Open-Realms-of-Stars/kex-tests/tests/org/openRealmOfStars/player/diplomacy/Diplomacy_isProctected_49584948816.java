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

public class Diplomacy_isProctected_49584948816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70393;
     Object term70451;

    public Diplomacy_isProctected_49584948816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term70397 = new ArrayList();
        ((ArrayList) term70397).add((Object)null);
        ((ArrayList) term70397).add((Object)null);
        ((ArrayList) term70397).add((Object)null);
        ((ArrayList) term70397).add((Object)null);
        ((ArrayList) term70397).add((Object)null);
        ArrayList term70404 = new ArrayList();
        ArrayList term70411 = new ArrayList();
        ((ArrayList) term70411).add((Object)null);
        ((ArrayList) term70411).add((Object)null);
        ArrayList term70418 = new ArrayList();
        ((ArrayList) term70418).add((Object)null);
        ((ArrayList) term70418).add((Object)null);
        ((ArrayList) term70418).add((Object)null);
        ((ArrayList) term70418).add((Object)null);
        ((ArrayList) term70418).add((Object)null);
        ((ArrayList) term70418).add((Object)null);
        ArrayList term70425 = new ArrayList();
        ((ArrayList) term70425).add((Object)null);
        ((ArrayList) term70425).add((Object)null);
        ((ArrayList) term70425).add((Object)null);
        ArrayList term70432 = new ArrayList();
        ((ArrayList) term70432).add((Object)null);
        ((ArrayList) term70432).add((Object)null);
        ((ArrayList) term70432).add((Object)null);
        ((ArrayList) term70432).add((Object)null);
        ((ArrayList) term70432).add((Object)null);
        ((ArrayList) term70432).add((Object)null);
        ((ArrayList) term70432).add((Object)null);
        ArrayList term70439 = new ArrayList();
        ((ArrayList) term70439).add((Object)null);
        ((ArrayList) term70439).add((Object)null);
        ((ArrayList) term70439).add((Object)null);
        ((ArrayList) term70439).add((Object)null);
        ((ArrayList) term70439).add((Object)null);
        ((ArrayList) term70439).add((Object)null);
        ((ArrayList) term70439).add((Object)null);
        ((ArrayList) term70439).add((Object)null);
        ArrayList term70446 = new ArrayList();
        ((ArrayList) term70446).add((Object)null);
        ((ArrayList) term70446).add((Object)null);
        ((ArrayList) term70446).add((Object)null);
        term70393 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.Diplomacy"));
        Object[] term70394 = (Object[]) newArray("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList", 8);
        Object term70395 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70402 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70409 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70416 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70423 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70430 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70437 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70444 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        setIntField(term70395, term70395.getClass(), "playerIndex", 159279866);
        setField(term70395, term70395.getClass(), "list", term70397);
        setIntField(term70395, term70395.getClass(), "numberOfMeetings", 468974358);
        setElement(term70394, 0, term70395);
        setIntField(term70402, term70402.getClass(), "playerIndex", 346282818);
        setField(term70402, term70402.getClass(), "list", term70404);
        setIntField(term70402, term70402.getClass(), "numberOfMeetings", -857876056);
        setElement(term70394, 1, term70402);
        setIntField(term70409, term70409.getClass(), "playerIndex", 1392910876);
        setField(term70409, term70409.getClass(), "list", term70411);
        setIntField(term70409, term70409.getClass(), "numberOfMeetings", -1664328399);
        setElement(term70394, 2, term70409);
        setIntField(term70416, term70416.getClass(), "playerIndex", 1422430512);
        setField(term70416, term70416.getClass(), "list", term70418);
        setIntField(term70416, term70416.getClass(), "numberOfMeetings", -217226756);
        setElement(term70394, 3, term70416);
        setIntField(term70423, term70423.getClass(), "playerIndex", 1608000247);
        setField(term70423, term70423.getClass(), "list", term70425);
        setIntField(term70423, term70423.getClass(), "numberOfMeetings", 1354560887);
        setElement(term70394, 4, term70423);
        setIntField(term70430, term70430.getClass(), "playerIndex", -749474542);
        setField(term70430, term70430.getClass(), "list", term70432);
        setIntField(term70430, term70430.getClass(), "numberOfMeetings", -47907780);
        setElement(term70394, 5, term70430);
        setIntField(term70437, term70437.getClass(), "playerIndex", 1131462369);
        setField(term70437, term70437.getClass(), "list", term70439);
        setIntField(term70437, term70437.getClass(), "numberOfMeetings", -1161206731);
        setElement(term70394, 6, term70437);
        setIntField(term70444, term70444.getClass(), "playerIndex", -992847709);
        setField(term70444, term70444.getClass(), "list", term70446);
        setIntField(term70444, term70444.getClass(), "numberOfMeetings", 1125156671);
        setElement(term70394, 7, term70444);
        setField(term70393, term70393.getClass(), "diplomacyList", term70394);
        term70451 = new Integer(1203107925);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.Diplomacy");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term70451;
        callMethod(klass, "isProctected", argTypes, term70393, args);
    }

};


