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

public class Diplomacy_isWar_466668357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69990;
     Object term70034;

    public Diplomacy_isWar_466668357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term69994 = new ArrayList();
        ((ArrayList) term69994).add((Object)null);
        ((ArrayList) term69994).add((Object)null);
        ((ArrayList) term69994).add((Object)null);
        ((ArrayList) term69994).add((Object)null);
        ArrayList term70001 = new ArrayList();
        ((ArrayList) term70001).add((Object)null);
        ((ArrayList) term70001).add((Object)null);
        ((ArrayList) term70001).add((Object)null);
        ((ArrayList) term70001).add((Object)null);
        ((ArrayList) term70001).add((Object)null);
        ArrayList term70008 = new ArrayList();
        ArrayList term70015 = new ArrayList();
        ((ArrayList) term70015).add((Object)null);
        ((ArrayList) term70015).add((Object)null);
        ((ArrayList) term70015).add((Object)null);
        ((ArrayList) term70015).add((Object)null);
        ((ArrayList) term70015).add((Object)null);
        ((ArrayList) term70015).add((Object)null);
        ArrayList term70022 = new ArrayList();
        ArrayList term70029 = new ArrayList();
        ((ArrayList) term70029).add((Object)null);
        ((ArrayList) term70029).add((Object)null);
        term69990 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.Diplomacy"));
        Object[] term69991 = (Object[]) newArray("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList", 6);
        Object term69992 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term69999 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70006 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70013 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70020 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70027 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        setIntField(term69992, term69992.getClass(), "playerIndex", 444514470);
        setField(term69992, term69992.getClass(), "list", term69994);
        setIntField(term69992, term69992.getClass(), "numberOfMeetings", -1652091834);
        setElement(term69991, 0, term69992);
        setIntField(term69999, term69999.getClass(), "playerIndex", -282021579);
        setField(term69999, term69999.getClass(), "list", term70001);
        setIntField(term69999, term69999.getClass(), "numberOfMeetings", -758778797);
        setElement(term69991, 1, term69999);
        setIntField(term70006, term70006.getClass(), "playerIndex", 765680355);
        setField(term70006, term70006.getClass(), "list", term70008);
        setIntField(term70006, term70006.getClass(), "numberOfMeetings", -1012090049);
        setElement(term69991, 2, term70006);
        setIntField(term70013, term70013.getClass(), "playerIndex", -2025214553);
        setField(term70013, term70013.getClass(), "list", term70015);
        setIntField(term70013, term70013.getClass(), "numberOfMeetings", 44908093);
        setElement(term69991, 3, term70013);
        setIntField(term70020, term70020.getClass(), "playerIndex", 887198203);
        setField(term70020, term70020.getClass(), "list", term70022);
        setIntField(term70020, term70020.getClass(), "numberOfMeetings", 12581312);
        setElement(term69991, 4, term70020);
        setIntField(term70027, term70027.getClass(), "playerIndex", 2087383644);
        setField(term70027, term70027.getClass(), "list", term70029);
        setIntField(term70027, term70027.getClass(), "numberOfMeetings", 405527523);
        setElement(term69991, 5, term70027);
        setField(term69990, term69990.getClass(), "diplomacyList", term69991);
        term70034 = new Integer(-1123526433);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.Diplomacy");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term70034;
        callMethod(klass, "isWar", argTypes, term69990, args);
    }

};


