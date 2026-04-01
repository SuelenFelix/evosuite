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

public class Diplomacy_getDiplomaticRelations_118335920426 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70787;
     Object term70845;

    public Diplomacy_getDiplomaticRelations_118335920426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term70791 = new ArrayList();
        ((ArrayList) term70791).add((Object)null);
        ((ArrayList) term70791).add((Object)null);
        ((ArrayList) term70791).add((Object)null);
        ((ArrayList) term70791).add((Object)null);
        ((ArrayList) term70791).add((Object)null);
        ((ArrayList) term70791).add((Object)null);
        ArrayList term70798 = new ArrayList();
        ((ArrayList) term70798).add((Object)null);
        ((ArrayList) term70798).add((Object)null);
        ((ArrayList) term70798).add((Object)null);
        ArrayList term70805 = new ArrayList();
        ((ArrayList) term70805).add((Object)null);
        ((ArrayList) term70805).add((Object)null);
        ((ArrayList) term70805).add((Object)null);
        ((ArrayList) term70805).add((Object)null);
        ((ArrayList) term70805).add((Object)null);
        ((ArrayList) term70805).add((Object)null);
        ((ArrayList) term70805).add((Object)null);
        ArrayList term70812 = new ArrayList();
        ((ArrayList) term70812).add((Object)null);
        ((ArrayList) term70812).add((Object)null);
        ((ArrayList) term70812).add((Object)null);
        ((ArrayList) term70812).add((Object)null);
        ((ArrayList) term70812).add((Object)null);
        ((ArrayList) term70812).add((Object)null);
        ((ArrayList) term70812).add((Object)null);
        ArrayList term70819 = new ArrayList();
        ((ArrayList) term70819).add((Object)null);
        ((ArrayList) term70819).add((Object)null);
        ((ArrayList) term70819).add((Object)null);
        ((ArrayList) term70819).add((Object)null);
        ((ArrayList) term70819).add((Object)null);
        ((ArrayList) term70819).add((Object)null);
        ArrayList term70826 = new ArrayList();
        ((ArrayList) term70826).add((Object)null);
        ((ArrayList) term70826).add((Object)null);
        ((ArrayList) term70826).add((Object)null);
        ((ArrayList) term70826).add((Object)null);
        ((ArrayList) term70826).add((Object)null);
        ((ArrayList) term70826).add((Object)null);
        ((ArrayList) term70826).add((Object)null);
        ((ArrayList) term70826).add((Object)null);
        ((ArrayList) term70826).add((Object)null);
        ArrayList term70833 = new ArrayList();
        ((ArrayList) term70833).add((Object)null);
        ((ArrayList) term70833).add((Object)null);
        ((ArrayList) term70833).add((Object)null);
        ((ArrayList) term70833).add((Object)null);
        ((ArrayList) term70833).add((Object)null);
        ((ArrayList) term70833).add((Object)null);
        ((ArrayList) term70833).add((Object)null);
        ((ArrayList) term70833).add((Object)null);
        ArrayList term70840 = new ArrayList();
        ((ArrayList) term70840).add((Object)null);
        ((ArrayList) term70840).add((Object)null);
        ((ArrayList) term70840).add((Object)null);
        ((ArrayList) term70840).add((Object)null);
        ((ArrayList) term70840).add((Object)null);
        ((ArrayList) term70840).add((Object)null);
        term70787 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.Diplomacy"));
        Object[] term70788 = (Object[]) newArray("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList", 8);
        Object term70789 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70796 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70803 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70810 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70817 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70824 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70831 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70838 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        setIntField(term70789, term70789.getClass(), "playerIndex", -773608881);
        setField(term70789, term70789.getClass(), "list", term70791);
        setIntField(term70789, term70789.getClass(), "numberOfMeetings", -985577036);
        setElement(term70788, 0, term70789);
        setIntField(term70796, term70796.getClass(), "playerIndex", 802539130);
        setField(term70796, term70796.getClass(), "list", term70798);
        setIntField(term70796, term70796.getClass(), "numberOfMeetings", -571931590);
        setElement(term70788, 1, term70796);
        setIntField(term70803, term70803.getClass(), "playerIndex", 37757400);
        setField(term70803, term70803.getClass(), "list", term70805);
        setIntField(term70803, term70803.getClass(), "numberOfMeetings", 437959151);
        setElement(term70788, 2, term70803);
        setIntField(term70810, term70810.getClass(), "playerIndex", 27780241);
        setField(term70810, term70810.getClass(), "list", term70812);
        setIntField(term70810, term70810.getClass(), "numberOfMeetings", -683868408);
        setElement(term70788, 3, term70810);
        setIntField(term70817, term70817.getClass(), "playerIndex", -381130069);
        setField(term70817, term70817.getClass(), "list", term70819);
        setIntField(term70817, term70817.getClass(), "numberOfMeetings", 885769749);
        setElement(term70788, 4, term70817);
        setIntField(term70824, term70824.getClass(), "playerIndex", -1021168716);
        setField(term70824, term70824.getClass(), "list", term70826);
        setIntField(term70824, term70824.getClass(), "numberOfMeetings", -1238055654);
        setElement(term70788, 5, term70824);
        setIntField(term70831, term70831.getClass(), "playerIndex", 1561513428);
        setField(term70831, term70831.getClass(), "list", term70833);
        setIntField(term70831, term70831.getClass(), "numberOfMeetings", 778959809);
        setElement(term70788, 6, term70831);
        setIntField(term70838, term70838.getClass(), "playerIndex", -7504064);
        setField(term70838, term70838.getClass(), "list", term70840);
        setIntField(term70838, term70838.getClass(), "numberOfMeetings", -1464364418);
        setElement(term70788, 7, term70838);
        setField(term70787, term70787.getClass(), "diplomacyList", term70788);
        term70845 = new Integer(1050420173);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.Diplomacy");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term70845;
        callMethod(klass, "getDiplomaticRelations", argTypes, term70787, args);
    }

};


