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

public class Diplomacy_isSpyTrade_62142012710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70114;
     Object term70144;

    public Diplomacy_isSpyTrade_62142012710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term70118 = new ArrayList();
        ((ArrayList) term70118).add((Object)null);
        ((ArrayList) term70118).add((Object)null);
        ArrayList term70125 = new ArrayList();
        ((ArrayList) term70125).add((Object)null);
        ((ArrayList) term70125).add((Object)null);
        ((ArrayList) term70125).add((Object)null);
        ((ArrayList) term70125).add((Object)null);
        ArrayList term70132 = new ArrayList();
        ((ArrayList) term70132).add((Object)null);
        ArrayList term70139 = new ArrayList();
        ((ArrayList) term70139).add((Object)null);
        ((ArrayList) term70139).add((Object)null);
        ((ArrayList) term70139).add((Object)null);
        ((ArrayList) term70139).add((Object)null);
        ((ArrayList) term70139).add((Object)null);
        ((ArrayList) term70139).add((Object)null);
        term70114 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.Diplomacy"));
        Object[] term70115 = (Object[]) newArray("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList", 4);
        Object term70116 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70123 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70130 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70137 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        setIntField(term70116, term70116.getClass(), "playerIndex", -1443680397);
        setField(term70116, term70116.getClass(), "list", term70118);
        setIntField(term70116, term70116.getClass(), "numberOfMeetings", -1005498887);
        setElement(term70115, 0, term70116);
        setIntField(term70123, term70123.getClass(), "playerIndex", 1329150584);
        setField(term70123, term70123.getClass(), "list", term70125);
        setIntField(term70123, term70123.getClass(), "numberOfMeetings", -742710703);
        setElement(term70115, 1, term70123);
        setIntField(term70130, term70130.getClass(), "playerIndex", -355505521);
        setField(term70130, term70130.getClass(), "list", term70132);
        setIntField(term70130, term70130.getClass(), "numberOfMeetings", 448061908);
        setElement(term70115, 2, term70130);
        setIntField(term70137, term70137.getClass(), "playerIndex", -1268483887);
        setField(term70137, term70137.getClass(), "list", term70139);
        setIntField(term70137, term70137.getClass(), "numberOfMeetings", 693500318);
        setElement(term70115, 3, term70137);
        setField(term70114, term70114.getClass(), "diplomacyList", term70115);
        term70144 = new Integer(1702404702);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.Diplomacy");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term70144;
        callMethod(klass, "isSpyTrade", argTypes, term70114, args);
    }

};


