package org.openRealmOfStars.player.leader.stats;

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
import static org.openRealmOfStars.player.leader.stats.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.lang.Integer;

public class LeaderStats_getStat_6800575295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19989;
     Object enum68;

    public LeaderStats_getStat_6800575295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term19991 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Class<? extends Object> term20330 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Field term20329 = ((Class) term20330).getDeclaredField((String) "NUMBER_OF_PIRATE_BATTLES");
        ((Field) term20329).setAccessible(true);
        Object enum60 = ((Field) term20329).get((Object) null);
        Class<? extends Object> term20654 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Field term20653 = ((Class) term20654).getDeclaredField((String) "RULER_REIGN_LENGTH");
        ((Field) term20653).setAccessible(true);
        Object enum61 = ((Field) term20653).get((Object) null);
        Class<? extends Object> term20960 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Field term20959 = ((Class) term20960).getDeclaredField((String) "NUMBER_OF_BATTLES");
        ((Field) term20959).setAccessible(true);
        Object enum62 = ((Field) term20959).get((Object) null);
        Class<? extends Object> term21263 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Field term21262 = ((Class) term21263).getDeclaredField((String) "NUMBER_OF_RULER");
        ((Field) term21262).setAccessible(true);
        Object enum63 = ((Field) term21262).get((Object) null);
        Class<? extends Object> term21560 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Field term21559 = ((Class) term21560).getDeclaredField((String) "GOVERNOR_LENGTH");
        ((Field) term21559).setAccessible(true);
        Object enum64 = ((Field) term21559).get((Object) null);
        Class<? extends Object> term21857 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Field term21856 = ((Class) term21857).getDeclaredField((String) "NUMBER_OF_PRIVATEERING");
        ((Field) term21856).setAccessible(true);
        Object enum65 = ((Field) term21856).get((Object) null);
        Class<? extends Object> term22175 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Field term22174 = ((Class) term22175).getDeclaredField((String) "COMMANDER_LENGTH");
        ((Field) term22174).setAccessible(true);
        Object enum66 = ((Field) term22174).get((Object) null);
        Class<? extends Object> term22475 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Field term22474 = ((Class) term22475).getDeclaredField((String) "KILLED_ANOTHER_LEADER");
        ((Field) term22474).setAccessible(true);
        Object enum67 = ((Field) term22474).get((Object) null);
        Class<? extends Object> term22790 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Field term22789 = ((Class) term22790).getDeclaredField((String) "COMMANDER_LENGTH");
        ((Field) term22789).setAccessible(true);
        enum68 = ((Field) term22789).get((Object) null);
        Class<? extends Object> term23090 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Field term23089 = ((Class) term23090).getDeclaredField((String) "WAR_DECLARATIONS");
        ((Field) term23089).setAccessible(true);
        Object enum69 = ((Field) term23089).get((Object) null);
        Class<? extends Object> term23390 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Field term23389 = ((Class) term23390).getDeclaredField((String) "KILLED_ANOTHER_LEADER");
        ((Field) term23389).setAccessible(true);
        Object enum70 = ((Field) term23389).get((Object) null);
        Class<? extends Object> term23705 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Field term23704 = ((Class) term23705).getDeclaredField((String) "RESEARCH_ARTIFACTS");
        ((Field) term23704).setAccessible(true);
        Object enum71 = ((Field) term23704).get((Object) null);
        Class<? extends Object> term24011 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Field term24010 = ((Class) term24011).getDeclaredField((String) "NUMBER_OF_JAIL_TIME");
        ((Field) term24010).setAccessible(true);
        Object enum72 = ((Field) term24010).get((Object) null);
        Class<? extends Object> term24320 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Field term24319 = ((Class) term24320).getDeclaredField((String) "JAIL_TIME");
        ((Field) term24319).setAccessible(true);
        Object enum73 = ((Field) term24319).get((Object) null);
        Class<? extends Object> term24599 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Field term24598 = ((Class) term24599).getDeclaredField((String) "NUMBER_OF_ANOMALY");
        ((Field) term24598).setAccessible(true);
        Object enum74 = ((Field) term24598).get((Object) null);
        Class<? extends Object> term24902 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Field term24901 = ((Class) term24902).getDeclaredField((String) "JAIL_TIME");
        ((Field) term24901).setAccessible(true);
        Object enum75 = ((Field) term24901).get((Object) null);
        Class<? extends Object> term25181 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Field term25180 = ((Class) term25181).getDeclaredField((String) "NUMBER_OF_JAIL_TIME");
        ((Field) term25180).setAccessible(true);
        Object enum76 = ((Field) term25180).get((Object) null);
        Class<? extends Object> term25490 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Field term25489 = ((Class) term25490).getDeclaredField((String) "NUMBER_OF_TRADES");
        ((Field) term25489).setAccessible(true);
        Object enum77 = ((Field) term25489).get((Object) null);
        Class<? extends Object> term25790 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Field term25789 = ((Class) term25790).getDeclaredField((String) "NUMBER_OF_SHIPS_BUILT");
        ((Field) term25789).setAccessible(true);
        Object enum78 = ((Field) term25789).get((Object) null);
        Class<? extends Object> term26105 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Field term26104 = ((Class) term26105).getDeclaredField((String) "DIPLOMATIC_TRADE");
        ((Field) term26104).setAccessible(true);
        Object enum79 = ((Field) term26104).get((Object) null);
        Integer term20141 = new Integer(0);
        Integer term20143 = new Integer(0);
        Integer term20145 = new Integer(0);
        Integer term20147 = new Integer(0);
        Integer term20149 = new Integer(0);
        Integer term20151 = new Integer(0);
        Integer term20153 = new Integer(0);
        Integer term20155 = new Integer(0);
        Integer term20157 = new Integer(0);
        Integer term20159 = new Integer(0);
        Integer term20161 = new Integer(0);
        Integer term20163 = new Integer(0);
        Integer term20165 = new Integer(0);
        Integer term20167 = new Integer(0);
        Integer term20169 = new Integer(0);
        Integer term20171 = new Integer(0);
        Integer term20173 = new Integer(0);
        Integer term20175 = new Integer(0);
        Integer term20177 = new Integer(0);
        Integer term20179 = new Integer(0);
        term19989 = newInstance(Class.forName("org.openRealmOfStars.player.leader.stats.LeaderStats"));
        Object term19990 = newInstance(Class.forName("java.util.EnumMap"));
        Object[] term20139 = (Object[]) newArray("org.openRealmOfStars.player.leader.stats.StatType", 20);
        Object[] term20140 = (Object[]) newArray("java.lang.Object", 20);
        setField(term19990, term19990.getClass(), "keyType", term19991);
        setElement(term20139, 0, enum60);
        setElement(term20139, 1, enum61);
        setElement(term20139, 2, enum62);
        setElement(term20139, 3, enum63);
        setElement(term20139, 4, enum64);
        setElement(term20139, 5, enum65);
        setElement(term20139, 6, enum66);
        setElement(term20139, 7, enum67);
        setElement(term20139, 8, enum68);
        setElement(term20139, 9, enum69);
        setElement(term20139, 10, enum70);
        setElement(term20139, 11, enum71);
        setElement(term20139, 12, enum72);
        setElement(term20139, 13, enum73);
        setElement(term20139, 14, enum74);
        setElement(term20139, 15, enum75);
        setElement(term20139, 16, enum76);
        setElement(term20139, 17, enum77);
        setElement(term20139, 18, enum78);
        setElement(term20139, 19, enum79);
        setField(term19990, term19990.getClass(), "keyUniverse", term20139);
        setElement(term20140, 0, term20141);
        setElement(term20140, 1, term20143);
        setElement(term20140, 2, term20145);
        setElement(term20140, 3, term20147);
        setElement(term20140, 4, term20149);
        setElement(term20140, 5, term20151);
        setElement(term20140, 6, term20153);
        setElement(term20140, 7, term20155);
        setElement(term20140, 8, term20157);
        setElement(term20140, 9, term20159);
        setElement(term20140, 10, term20161);
        setElement(term20140, 11, term20163);
        setElement(term20140, 12, term20165);
        setElement(term20140, 13, term20167);
        setElement(term20140, 14, term20169);
        setElement(term20140, 15, term20171);
        setElement(term20140, 16, term20173);
        setElement(term20140, 17, term20175);
        setElement(term20140, 18, term20177);
        setElement(term20140, 19, term20179);
        setField(term19990, term19990.getClass(), "vals", term20140);
        setIntField(term19990, term19990.getClass(), "size", 20);
        setField(term19990, term19990.getClass(), "entrySet", null);
        setField(term19990, term19990.getClass(), "keySet", null);
        setField(term19990, term19990.getClass(), "values", null);
        setField(term19989, term19989.getClass(), "statsMap", term19990);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.leader.stats.LeaderStats");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.leader.stats.StatType");
        Object[] args = new Object[1];
        args[0] = enum68;
        callMethod(klass, "getStat", argTypes, term19989, args);
    }

};


