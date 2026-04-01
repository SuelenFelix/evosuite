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

public class Diplomacy_generateRelationText_206893959833 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71056;
     Object term71079;

    public Diplomacy_generateRelationText_206893959833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term71060 = new ArrayList();
        ((ArrayList) term71060).add((Object)null);
        ((ArrayList) term71060).add((Object)null);
        ((ArrayList) term71060).add((Object)null);
        ((ArrayList) term71060).add((Object)null);
        ArrayList term71067 = new ArrayList();
        ((ArrayList) term71067).add((Object)null);
        ((ArrayList) term71067).add((Object)null);
        ((ArrayList) term71067).add((Object)null);
        ((ArrayList) term71067).add((Object)null);
        ((ArrayList) term71067).add((Object)null);
        ((ArrayList) term71067).add((Object)null);
        ((ArrayList) term71067).add((Object)null);
        ((ArrayList) term71067).add((Object)null);
        ((ArrayList) term71067).add((Object)null);
        ArrayList term71074 = new ArrayList();
        ((ArrayList) term71074).add((Object)null);
        ((ArrayList) term71074).add((Object)null);
        ((ArrayList) term71074).add((Object)null);
        ((ArrayList) term71074).add((Object)null);
        ((ArrayList) term71074).add((Object)null);
        ((ArrayList) term71074).add((Object)null);
        ((ArrayList) term71074).add((Object)null);
        ((ArrayList) term71074).add((Object)null);
        term71056 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.Diplomacy"));
        Object[] term71057 = (Object[]) newArray("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList", 3);
        Object term71058 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term71065 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term71072 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        setIntField(term71058, term71058.getClass(), "playerIndex", -548776693);
        setField(term71058, term71058.getClass(), "list", term71060);
        setIntField(term71058, term71058.getClass(), "numberOfMeetings", -1949346221);
        setElement(term71057, 0, term71058);
        setIntField(term71065, term71065.getClass(), "playerIndex", 831638391);
        setField(term71065, term71065.getClass(), "list", term71067);
        setIntField(term71065, term71065.getClass(), "numberOfMeetings", -1067876039);
        setElement(term71057, 1, term71065);
        setIntField(term71072, term71072.getClass(), "playerIndex", -1143749623);
        setField(term71072, term71072.getClass(), "list", term71074);
        setIntField(term71072, term71072.getClass(), "numberOfMeetings", 1961561878);
        setElement(term71057, 2, term71072);
        setField(term71056, term71056.getClass(), "diplomacyList", term71057);
        term71079 = new Integer(1235809050);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.Diplomacy");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term71079;
        callMethod(klass, "generateRelationText", argTypes, term71056, args);
    }

};


