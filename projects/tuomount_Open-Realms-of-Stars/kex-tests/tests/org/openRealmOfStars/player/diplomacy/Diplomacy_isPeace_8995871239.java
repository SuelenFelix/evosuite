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

public class Diplomacy_isPeace_8995871239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70082;
     Object term70112;

    public Diplomacy_isPeace_8995871239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term70086 = new ArrayList();
        ((ArrayList) term70086).add((Object)null);
        ((ArrayList) term70086).add((Object)null);
        ((ArrayList) term70086).add((Object)null);
        ((ArrayList) term70086).add((Object)null);
        ((ArrayList) term70086).add((Object)null);
        ((ArrayList) term70086).add((Object)null);
        ((ArrayList) term70086).add((Object)null);
        ((ArrayList) term70086).add((Object)null);
        ((ArrayList) term70086).add((Object)null);
        ArrayList term70093 = new ArrayList();
        ((ArrayList) term70093).add((Object)null);
        ((ArrayList) term70093).add((Object)null);
        ((ArrayList) term70093).add((Object)null);
        ((ArrayList) term70093).add((Object)null);
        ((ArrayList) term70093).add((Object)null);
        ((ArrayList) term70093).add((Object)null);
        ArrayList term70100 = new ArrayList();
        ((ArrayList) term70100).add((Object)null);
        ((ArrayList) term70100).add((Object)null);
        ((ArrayList) term70100).add((Object)null);
        ArrayList term70107 = new ArrayList();
        ((ArrayList) term70107).add((Object)null);
        ((ArrayList) term70107).add((Object)null);
        ((ArrayList) term70107).add((Object)null);
        term70082 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.Diplomacy"));
        Object[] term70083 = (Object[]) newArray("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList", 4);
        Object term70084 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70091 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70098 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70105 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        setIntField(term70084, term70084.getClass(), "playerIndex", -298939768);
        setField(term70084, term70084.getClass(), "list", term70086);
        setIntField(term70084, term70084.getClass(), "numberOfMeetings", 298082829);
        setElement(term70083, 0, term70084);
        setIntField(term70091, term70091.getClass(), "playerIndex", -1494372780);
        setField(term70091, term70091.getClass(), "list", term70093);
        setIntField(term70091, term70091.getClass(), "numberOfMeetings", 140501130);
        setElement(term70083, 1, term70091);
        setIntField(term70098, term70098.getClass(), "playerIndex", -1458890291);
        setField(term70098, term70098.getClass(), "list", term70100);
        setIntField(term70098, term70098.getClass(), "numberOfMeetings", 1016087323);
        setElement(term70083, 2, term70098);
        setIntField(term70105, term70105.getClass(), "playerIndex", 1957748979);
        setField(term70105, term70105.getClass(), "list", term70107);
        setIntField(term70105, term70105.getClass(), "numberOfMeetings", -1290093259);
        setElement(term70083, 3, term70105);
        setField(term70082, term70082.getClass(), "diplomacyList", term70083);
        term70112 = new Integer(-1200934890);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.Diplomacy");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term70112;
        callMethod(klass, "isPeace", argTypes, term70082, args);
    }

};


