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

public class Diplomacy_countBorderCrossing_179477566832 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71010;
     Object term71054;

    public Diplomacy_countBorderCrossing_179477566832() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term71014 = new ArrayList();
        ((ArrayList) term71014).add((Object)null);
        ((ArrayList) term71014).add((Object)null);
        ((ArrayList) term71014).add((Object)null);
        ArrayList term71021 = new ArrayList();
        ((ArrayList) term71021).add((Object)null);
        ArrayList term71028 = new ArrayList();
        ((ArrayList) term71028).add((Object)null);
        ((ArrayList) term71028).add((Object)null);
        ((ArrayList) term71028).add((Object)null);
        ((ArrayList) term71028).add((Object)null);
        ((ArrayList) term71028).add((Object)null);
        ((ArrayList) term71028).add((Object)null);
        ArrayList term71035 = new ArrayList();
        ((ArrayList) term71035).add((Object)null);
        ((ArrayList) term71035).add((Object)null);
        ((ArrayList) term71035).add((Object)null);
        ArrayList term71042 = new ArrayList();
        ((ArrayList) term71042).add((Object)null);
        ((ArrayList) term71042).add((Object)null);
        ((ArrayList) term71042).add((Object)null);
        ((ArrayList) term71042).add((Object)null);
        ((ArrayList) term71042).add((Object)null);
        ArrayList term71049 = new ArrayList();
        term71010 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.Diplomacy"));
        Object[] term71011 = (Object[]) newArray("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList", 6);
        Object term71012 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term71019 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term71026 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term71033 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term71040 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term71047 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        setIntField(term71012, term71012.getClass(), "playerIndex", 491497994);
        setField(term71012, term71012.getClass(), "list", term71014);
        setIntField(term71012, term71012.getClass(), "numberOfMeetings", 395074450);
        setElement(term71011, 0, term71012);
        setIntField(term71019, term71019.getClass(), "playerIndex", -2028511200);
        setField(term71019, term71019.getClass(), "list", term71021);
        setIntField(term71019, term71019.getClass(), "numberOfMeetings", 466010);
        setElement(term71011, 1, term71019);
        setIntField(term71026, term71026.getClass(), "playerIndex", -169463842);
        setField(term71026, term71026.getClass(), "list", term71028);
        setIntField(term71026, term71026.getClass(), "numberOfMeetings", 1798831879);
        setElement(term71011, 2, term71026);
        setIntField(term71033, term71033.getClass(), "playerIndex", 1393855580);
        setField(term71033, term71033.getClass(), "list", term71035);
        setIntField(term71033, term71033.getClass(), "numberOfMeetings", -849064032);
        setElement(term71011, 3, term71033);
        setIntField(term71040, term71040.getClass(), "playerIndex", -184659375);
        setField(term71040, term71040.getClass(), "list", term71042);
        setIntField(term71040, term71040.getClass(), "numberOfMeetings", 629005618);
        setElement(term71011, 4, term71040);
        setIntField(term71047, term71047.getClass(), "playerIndex", -2006508013);
        setField(term71047, term71047.getClass(), "list", term71049);
        setIntField(term71047, term71047.getClass(), "numberOfMeetings", 974951631);
        setElement(term71011, 5, term71047);
        setField(term71010, term71010.getClass(), "diplomacyList", term71011);
        term71054 = new Integer(-942202284);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.Diplomacy");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term71054;
        callMethod(klass, "countBorderCrossing", argTypes, term71010, args);
    }

};


