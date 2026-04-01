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

public class Diplomacy_getLeastLikingWithLowEspionage_147800793920 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70538;
     Object term70554;

    public Diplomacy_getLeastLikingWithLowEspionage_147800793920() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term70542 = new ArrayList();
        ((ArrayList) term70542).add((Object)null);
        ((ArrayList) term70542).add((Object)null);
        ((ArrayList) term70542).add((Object)null);
        ((ArrayList) term70542).add((Object)null);
        ((ArrayList) term70542).add((Object)null);
        ((ArrayList) term70542).add((Object)null);
        ArrayList term70549 = new ArrayList();
        ((ArrayList) term70549).add((Object)null);
        ((ArrayList) term70549).add((Object)null);
        ((ArrayList) term70549).add((Object)null);
        term70538 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.Diplomacy"));
        Object[] term70539 = (Object[]) newArray("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList", 2);
        Object term70540 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70547 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        setIntField(term70540, term70540.getClass(), "playerIndex", -575810668);
        setField(term70540, term70540.getClass(), "list", term70542);
        setIntField(term70540, term70540.getClass(), "numberOfMeetings", 1641117123);
        setElement(term70539, 0, term70540);
        setIntField(term70547, term70547.getClass(), "playerIndex", -1084408453);
        setField(term70547, term70547.getClass(), "list", term70549);
        setIntField(term70547, term70547.getClass(), "numberOfMeetings", -720037395);
        setElement(term70539, 1, term70547);
        setField(term70538, term70538.getClass(), "diplomacyList", term70539);
        ArrayList term70562 = new ArrayList();
        ((ArrayList) term70562).add((Object)null);
        ((ArrayList) term70562).add((Object)null);
        ((ArrayList) term70562).add((Object)null);
        ((ArrayList) term70562).add((Object)null);
        ((ArrayList) term70562).add((Object)null);
        ((ArrayList) term70562).add((Object)null);
        ((ArrayList) term70562).add((Object)null);
        ((ArrayList) term70562).add((Object)null);
        ((ArrayList) term70562).add((Object)null);
        ArrayList term70572 = new ArrayList();
        ((ArrayList) term70572).add((Object)null);
        ((ArrayList) term70572).add((Object)null);
        ((ArrayList) term70572).add((Object)null);
        ((ArrayList) term70572).add((Object)null);
        ((ArrayList) term70572).add((Object)null);
        ((ArrayList) term70572).add((Object)null);
        ((ArrayList) term70572).add((Object)null);
        ArrayList term70582 = new ArrayList();
        ((ArrayList) term70582).add((Object)null);
        ((ArrayList) term70582).add((Object)null);
        ((ArrayList) term70582).add((Object)null);
        ((ArrayList) term70582).add((Object)null);
        ((ArrayList) term70582).add((Object)null);
        ((ArrayList) term70582).add((Object)null);
        ((ArrayList) term70582).add((Object)null);
        ArrayList term70592 = new ArrayList();
        ((ArrayList) term70592).add((Object)null);
        ((ArrayList) term70592).add((Object)null);
        ((ArrayList) term70592).add((Object)null);
        ((ArrayList) term70592).add((Object)null);
        ((ArrayList) term70592).add((Object)null);
        ((ArrayList) term70592).add((Object)null);
        ((ArrayList) term70592).add((Object)null);
        ArrayList term70602 = new ArrayList();
        ((ArrayList) term70602).add((Object)null);
        ((ArrayList) term70602).add((Object)null);
        ((ArrayList) term70602).add((Object)null);
        ((ArrayList) term70602).add((Object)null);
        term70554 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.Intelligence"));
        Object[] term70555 = (Object[]) newArray("org.openRealmOfStars.player.espionage.IntelligenceList", 5);
        Object term70556 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceList"));
        Object term70566 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceList"));
        Object term70576 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceList"));
        Object term70586 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceList"));
        Object term70596 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceList"));
        setIntField(term70556, term70556.getClass(), "playerIndex", 1232105469);
        setIntField(term70556, term70556.getClass(), "intelligenceLevel1Estimate", -1547322575);
        setIntField(term70556, term70556.getClass(), "intelligenceLevel3Estimate", -61444233);
        setIntField(term70556, term70556.getClass(), "intelligenceLevel5Estimate", -400720912);
        setIntField(term70556, term70556.getClass(), "intelligenceLevel7Estimate", 1266192397);
        setField(term70556, term70556.getClass(), "list", term70562);
        setElement(term70555, 0, term70556);
        setIntField(term70566, term70566.getClass(), "playerIndex", -1510967747);
        setIntField(term70566, term70566.getClass(), "intelligenceLevel1Estimate", -2014792457);
        setIntField(term70566, term70566.getClass(), "intelligenceLevel3Estimate", 1957633116);
        setIntField(term70566, term70566.getClass(), "intelligenceLevel5Estimate", 1428598210);
        setIntField(term70566, term70566.getClass(), "intelligenceLevel7Estimate", 1071776561);
        setField(term70566, term70566.getClass(), "list", term70572);
        setElement(term70555, 1, term70566);
        setIntField(term70576, term70576.getClass(), "playerIndex", 35388821);
        setIntField(term70576, term70576.getClass(), "intelligenceLevel1Estimate", -598803400);
        setIntField(term70576, term70576.getClass(), "intelligenceLevel3Estimate", 25560022);
        setIntField(term70576, term70576.getClass(), "intelligenceLevel5Estimate", -1090136985);
        setIntField(term70576, term70576.getClass(), "intelligenceLevel7Estimate", -355574894);
        setField(term70576, term70576.getClass(), "list", term70582);
        setElement(term70555, 2, term70576);
        setIntField(term70586, term70586.getClass(), "playerIndex", 1866941633);
        setIntField(term70586, term70586.getClass(), "intelligenceLevel1Estimate", 1697296048);
        setIntField(term70586, term70586.getClass(), "intelligenceLevel3Estimate", 1302075623);
        setIntField(term70586, term70586.getClass(), "intelligenceLevel5Estimate", 1238707613);
        setIntField(term70586, term70586.getClass(), "intelligenceLevel7Estimate", 1961351136);
        setField(term70586, term70586.getClass(), "list", term70592);
        setElement(term70555, 3, term70586);
        setIntField(term70596, term70596.getClass(), "playerIndex", -1546528470);
        setIntField(term70596, term70596.getClass(), "intelligenceLevel1Estimate", -1518971561);
        setIntField(term70596, term70596.getClass(), "intelligenceLevel3Estimate", 1513663171);
        setIntField(term70596, term70596.getClass(), "intelligenceLevel5Estimate", 1527034193);
        setIntField(term70596, term70596.getClass(), "intelligenceLevel7Estimate", 1309545946);
        setField(term70596, term70596.getClass(), "list", term70602);
        setElement(term70555, 4, term70596);
        setField(term70554, term70554.getClass(), "intelligenceLists", term70555);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.Diplomacy");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.espionage.Intelligence");
        Object[] args = new Object[1];
        args[0] = term70554;
        callMethod(klass, "getLeastLikingWithLowEspionage", argTypes, term70538, args);
    }

};


