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

public class Diplomacy_isTradeEmbargo_122743408814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70317;
     Object term70382;

    public Diplomacy_isTradeEmbargo_122743408814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term70321 = new ArrayList();
        ((ArrayList) term70321).add((Object)null);
        ((ArrayList) term70321).add((Object)null);
        ((ArrayList) term70321).add((Object)null);
        ((ArrayList) term70321).add((Object)null);
        ((ArrayList) term70321).add((Object)null);
        ((ArrayList) term70321).add((Object)null);
        ((ArrayList) term70321).add((Object)null);
        ((ArrayList) term70321).add((Object)null);
        ArrayList term70328 = new ArrayList();
        ((ArrayList) term70328).add((Object)null);
        ((ArrayList) term70328).add((Object)null);
        ((ArrayList) term70328).add((Object)null);
        ((ArrayList) term70328).add((Object)null);
        ((ArrayList) term70328).add((Object)null);
        ((ArrayList) term70328).add((Object)null);
        ((ArrayList) term70328).add((Object)null);
        ((ArrayList) term70328).add((Object)null);
        ArrayList term70335 = new ArrayList();
        ((ArrayList) term70335).add((Object)null);
        ArrayList term70342 = new ArrayList();
        ((ArrayList) term70342).add((Object)null);
        ArrayList term70349 = new ArrayList();
        ((ArrayList) term70349).add((Object)null);
        ((ArrayList) term70349).add((Object)null);
        ((ArrayList) term70349).add((Object)null);
        ((ArrayList) term70349).add((Object)null);
        ((ArrayList) term70349).add((Object)null);
        ((ArrayList) term70349).add((Object)null);
        ((ArrayList) term70349).add((Object)null);
        ((ArrayList) term70349).add((Object)null);
        ((ArrayList) term70349).add((Object)null);
        ArrayList term70356 = new ArrayList();
        ((ArrayList) term70356).add((Object)null);
        ArrayList term70363 = new ArrayList();
        ((ArrayList) term70363).add((Object)null);
        ((ArrayList) term70363).add((Object)null);
        ((ArrayList) term70363).add((Object)null);
        ((ArrayList) term70363).add((Object)null);
        ArrayList term70370 = new ArrayList();
        ArrayList term70377 = new ArrayList();
        ((ArrayList) term70377).add((Object)null);
        ((ArrayList) term70377).add((Object)null);
        term70317 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.Diplomacy"));
        Object[] term70318 = (Object[]) newArray("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList", 9);
        Object term70319 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70326 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70333 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70340 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70347 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70354 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70361 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70368 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70375 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        setIntField(term70319, term70319.getClass(), "playerIndex", 1370246522);
        setField(term70319, term70319.getClass(), "list", term70321);
        setIntField(term70319, term70319.getClass(), "numberOfMeetings", 1588058685);
        setElement(term70318, 0, term70319);
        setIntField(term70326, term70326.getClass(), "playerIndex", 1677707412);
        setField(term70326, term70326.getClass(), "list", term70328);
        setIntField(term70326, term70326.getClass(), "numberOfMeetings", 1971485144);
        setElement(term70318, 1, term70326);
        setIntField(term70333, term70333.getClass(), "playerIndex", 2059603512);
        setField(term70333, term70333.getClass(), "list", term70335);
        setIntField(term70333, term70333.getClass(), "numberOfMeetings", -1308902065);
        setElement(term70318, 2, term70333);
        setIntField(term70340, term70340.getClass(), "playerIndex", 605255795);
        setField(term70340, term70340.getClass(), "list", term70342);
        setIntField(term70340, term70340.getClass(), "numberOfMeetings", 1743438307);
        setElement(term70318, 3, term70340);
        setIntField(term70347, term70347.getClass(), "playerIndex", -1122596893);
        setField(term70347, term70347.getClass(), "list", term70349);
        setIntField(term70347, term70347.getClass(), "numberOfMeetings", -2147297900);
        setElement(term70318, 4, term70347);
        setIntField(term70354, term70354.getClass(), "playerIndex", 539095138);
        setField(term70354, term70354.getClass(), "list", term70356);
        setIntField(term70354, term70354.getClass(), "numberOfMeetings", 1462297654);
        setElement(term70318, 5, term70354);
        setIntField(term70361, term70361.getClass(), "playerIndex", 1009915858);
        setField(term70361, term70361.getClass(), "list", term70363);
        setIntField(term70361, term70361.getClass(), "numberOfMeetings", 500127209);
        setElement(term70318, 6, term70361);
        setIntField(term70368, term70368.getClass(), "playerIndex", -1482530168);
        setField(term70368, term70368.getClass(), "list", term70370);
        setIntField(term70368, term70368.getClass(), "numberOfMeetings", -432987116);
        setElement(term70318, 7, term70368);
        setIntField(term70375, term70375.getClass(), "playerIndex", 1483499310);
        setField(term70375, term70375.getClass(), "list", term70377);
        setIntField(term70375, term70375.getClass(), "numberOfMeetings", -1516568587);
        setElement(term70318, 8, term70375);
        setField(term70317, term70317.getClass(), "diplomacyList", term70318);
        term70382 = new Integer(1537690170);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.Diplomacy");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term70382;
        callMethod(klass, "isTradeEmbargo", argTypes, term70317, args);
    }

};


