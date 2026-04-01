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

public class LeaderStats_countStats_2823278402 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38;

    public LeaderStats_countStats_2823278402() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term40 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Class<? extends Object> term823 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Field term822 = ((Class) term823).getDeclaredField((String) "NUMBER_OF_JAIL_TIME");
        ((Field) term822).setAccessible(true);
        Object enum0 = ((Field) term822).get((Object) null);
        Class<? extends Object> term1132 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Field term1131 = ((Class) term1132).getDeclaredField((String) "NUMBER_OF_JAIL_TIME");
        ((Field) term1131).setAccessible(true);
        Object enum1 = ((Field) term1131).get((Object) null);
        Class<? extends Object> term1441 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Field term1440 = ((Class) term1441).getDeclaredField((String) "NUMBER_OF_ANOMALY");
        ((Field) term1440).setAccessible(true);
        Object enum2 = ((Field) term1440).get((Object) null);
        Class<? extends Object> term1744 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Field term1743 = ((Class) term1744).getDeclaredField((String) "NUMBER_OF_PLANETS_EXPLORED");
        ((Field) term1743).setAccessible(true);
        Object enum3 = ((Field) term1743).get((Object) null);
        Class<? extends Object> term2074 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Field term2073 = ((Class) term2074).getDeclaredField((String) "WAR_DECLARATIONS");
        ((Field) term2073).setAccessible(true);
        Object enum4 = ((Field) term2073).get((Object) null);
        Class<? extends Object> term2374 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Field term2373 = ((Class) term2374).getDeclaredField((String) "COMMANDER_LENGTH");
        ((Field) term2373).setAccessible(true);
        Object enum5 = ((Field) term2373).get((Object) null);
        Class<? extends Object> term2674 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Field term2673 = ((Class) term2674).getDeclaredField((String) "NUMBER_OF_TRADES");
        ((Field) term2673).setAccessible(true);
        Object enum6 = ((Field) term2673).get((Object) null);
        Class<? extends Object> term2974 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Field term2973 = ((Class) term2974).getDeclaredField((String) "NUMBER_OF_ANOMALY");
        ((Field) term2973).setAccessible(true);
        Object enum7 = ((Field) term2973).get((Object) null);
        Class<? extends Object> term3277 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Field term3276 = ((Class) term3277).getDeclaredField((String) "WAR_DECLARATIONS");
        ((Field) term3276).setAccessible(true);
        Object enum8 = ((Field) term3276).get((Object) null);
        Class<? extends Object> term3577 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Field term3576 = ((Class) term3577).getDeclaredField((String) "KILLED_ANOTHER_LEADER");
        ((Field) term3576).setAccessible(true);
        Object enum9 = ((Field) term3576).get((Object) null);
        Class<? extends Object> term3892 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Field term3891 = ((Class) term3892).getDeclaredField((String) "NUMBER_OF_PLANETS_EXPLORED");
        ((Field) term3891).setAccessible(true);
        Object enum10 = ((Field) term3891).get((Object) null);
        Class<? extends Object> term4222 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Field term4221 = ((Class) term4222).getDeclaredField((String) "NUMBER_OF_ESPIONAGE");
        ((Field) term4221).setAccessible(true);
        Object enum11 = ((Field) term4221).get((Object) null);
        Class<? extends Object> term4531 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Field term4530 = ((Class) term4531).getDeclaredField((String) "NUMBER_OF_ANOMALY");
        ((Field) term4530).setAccessible(true);
        Object enum12 = ((Field) term4530).get((Object) null);
        Class<? extends Object> term4834 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Field term4833 = ((Class) term4834).getDeclaredField((String) "NUMBER_OF_BUILDINGS_BUILT");
        ((Field) term4833).setAccessible(true);
        Object enum13 = ((Field) term4833).get((Object) null);
        Class<? extends Object> term5161 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Field term5160 = ((Class) term5161).getDeclaredField((String) "NUMBER_OF_PRIVATEERING");
        ((Field) term5160).setAccessible(true);
        Object enum14 = ((Field) term5160).get((Object) null);
        Class<? extends Object> term5479 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Field term5478 = ((Class) term5479).getDeclaredField((String) "DIPLOMATIC_TRADE");
        ((Field) term5478).setAccessible(true);
        Object enum15 = ((Field) term5478).get((Object) null);
        Class<? extends Object> term5779 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Field term5778 = ((Class) term5779).getDeclaredField((String) "DIPLOMATIC_TRADE");
        ((Field) term5778).setAccessible(true);
        Object enum16 = ((Field) term5778).get((Object) null);
        Class<? extends Object> term6079 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Field term6078 = ((Class) term6079).getDeclaredField((String) "JAIL_TIME");
        ((Field) term6078).setAccessible(true);
        Object enum17 = ((Field) term6078).get((Object) null);
        Class<? extends Object> term6358 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Field term6357 = ((Class) term6358).getDeclaredField((String) "NUMBER_OF_PLANETS_EXPLORED");
        ((Field) term6357).setAccessible(true);
        Object enum18 = ((Field) term6357).get((Object) null);
        Class<? extends Object> term6688 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Field term6687 = ((Class) term6688).getDeclaredField((String) "NUMBER_OF_TRADES");
        ((Field) term6687).setAccessible(true);
        Object enum19 = ((Field) term6687).get((Object) null);
        Integer term187 = new Integer(0);
        Integer term189 = new Integer(0);
        Integer term191 = new Integer(0);
        Integer term193 = new Integer(0);
        Integer term195 = new Integer(0);
        Integer term197 = new Integer(0);
        Integer term199 = new Integer(0);
        Integer term201 = new Integer(0);
        Integer term203 = new Integer(0);
        Integer term205 = new Integer(0);
        Integer term207 = new Integer(0);
        Integer term209 = new Integer(0);
        Integer term211 = new Integer(0);
        Integer term213 = new Integer(0);
        Integer term215 = new Integer(0);
        Integer term217 = new Integer(0);
        Integer term219 = new Integer(0);
        Integer term221 = new Integer(0);
        Integer term223 = new Integer(0);
        Integer term225 = new Integer(0);
        term38 = newInstance(Class.forName("org.openRealmOfStars.player.leader.stats.LeaderStats"));
        Object term39 = newInstance(Class.forName("java.util.EnumMap"));
        Object[] term185 = (Object[]) newArray("org.openRealmOfStars.player.leader.stats.StatType", 20);
        Object[] term186 = (Object[]) newArray("java.lang.Object", 20);
        setField(term39, term39.getClass(), "keyType", term40);
        setElement(term185, 0, enum0);
        setElement(term185, 1, enum1);
        setElement(term185, 2, enum2);
        setElement(term185, 3, enum3);
        setElement(term185, 4, enum4);
        setElement(term185, 5, enum5);
        setElement(term185, 6, enum6);
        setElement(term185, 7, enum7);
        setElement(term185, 8, enum8);
        setElement(term185, 9, enum9);
        setElement(term185, 10, enum10);
        setElement(term185, 11, enum11);
        setElement(term185, 12, enum12);
        setElement(term185, 13, enum13);
        setElement(term185, 14, enum14);
        setElement(term185, 15, enum15);
        setElement(term185, 16, enum16);
        setElement(term185, 17, enum17);
        setElement(term185, 18, enum18);
        setElement(term185, 19, enum19);
        setField(term39, term39.getClass(), "keyUniverse", term185);
        setElement(term186, 0, term187);
        setElement(term186, 1, term189);
        setElement(term186, 2, term191);
        setElement(term186, 3, term193);
        setElement(term186, 4, term195);
        setElement(term186, 5, term197);
        setElement(term186, 6, term199);
        setElement(term186, 7, term201);
        setElement(term186, 8, term203);
        setElement(term186, 9, term205);
        setElement(term186, 10, term207);
        setElement(term186, 11, term209);
        setElement(term186, 12, term211);
        setElement(term186, 13, term213);
        setElement(term186, 14, term215);
        setElement(term186, 15, term217);
        setElement(term186, 16, term219);
        setElement(term186, 17, term221);
        setElement(term186, 18, term223);
        setElement(term186, 19, term225);
        setField(term39, term39.getClass(), "vals", term186);
        setIntField(term39, term39.getClass(), "size", 20);
        setField(term39, term39.getClass(), "entrySet", null);
        setField(term39, term39.getClass(), "keySet", null);
        setField(term39, term39.getClass(), "values", null);
        setField(term38, term38.getClass(), "statsMap", term39);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.leader.stats.LeaderStats");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "countStats", argTypes, term38, args);
    }

};


