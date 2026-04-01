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

public class LeaderStats_addOne_15642181666 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26404;
     Object enum80;

    public LeaderStats_addOne_15642181666() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term26406 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Class<? extends Object> term26745 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Field term26744 = ((Class) term26745).getDeclaredField((String) "NUMBER_OF_RULER");
        ((Field) term26744).setAccessible(true);
        enum80 = ((Field) term26744).get((Object) null);
        Class<? extends Object> term27042 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Field term27041 = ((Class) term27042).getDeclaredField((String) "NUMBER_OF_ANOMALY");
        ((Field) term27041).setAccessible(true);
        Object enum81 = ((Field) term27041).get((Object) null);
        Class<? extends Object> term27345 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Field term27344 = ((Class) term27345).getDeclaredField((String) "DIPLOMATIC_TRADE");
        ((Field) term27344).setAccessible(true);
        Object enum82 = ((Field) term27344).get((Object) null);
        Class<? extends Object> term27645 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Field term27644 = ((Class) term27645).getDeclaredField((String) "NUMBER_OF_TRADES");
        ((Field) term27644).setAccessible(true);
        Object enum83 = ((Field) term27644).get((Object) null);
        Class<? extends Object> term27945 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Field term27944 = ((Class) term27945).getDeclaredField((String) "NUMBER_OF_BUILDINGS_BUILT");
        ((Field) term27944).setAccessible(true);
        Object enum84 = ((Field) term27944).get((Object) null);
        Class<? extends Object> term28272 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Field term28271 = ((Class) term28272).getDeclaredField((String) "JAIL_TIME");
        ((Field) term28271).setAccessible(true);
        Object enum85 = ((Field) term28271).get((Object) null);
        Class<? extends Object> term28551 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Field term28550 = ((Class) term28551).getDeclaredField((String) "POPULATION_GROWTH");
        ((Field) term28550).setAccessible(true);
        Object enum86 = ((Field) term28550).get((Object) null);
        Class<? extends Object> term28854 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Field term28853 = ((Class) term28854).getDeclaredField((String) "RESEARCH_ARTIFACTS");
        ((Field) term28853).setAccessible(true);
        Object enum87 = ((Field) term28853).get((Object) null);
        Class<? extends Object> term29160 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Field term29159 = ((Class) term29160).getDeclaredField((String) "KILLED_ANOTHER_LEADER");
        ((Field) term29159).setAccessible(true);
        Object enum88 = ((Field) term29159).get((Object) null);
        Class<? extends Object> term29475 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Field term29474 = ((Class) term29475).getDeclaredField((String) "NUMBER_OF_SHIPS_BUILT");
        ((Field) term29474).setAccessible(true);
        Object enum89 = ((Field) term29474).get((Object) null);
        Class<? extends Object> term29790 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Field term29789 = ((Class) term29790).getDeclaredField((String) "NUMBER_OF_RULER");
        ((Field) term29789).setAccessible(true);
        Object enum90 = ((Field) term29789).get((Object) null);
        Class<? extends Object> term30087 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Field term30086 = ((Class) term30087).getDeclaredField((String) "NUMBER_OF_JAIL_TIME");
        ((Field) term30086).setAccessible(true);
        Object enum91 = ((Field) term30086).get((Object) null);
        Class<? extends Object> term30396 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Field term30395 = ((Class) term30396).getDeclaredField((String) "RULER_REIGN_LENGTH");
        ((Field) term30395).setAccessible(true);
        Object enum92 = ((Field) term30395).get((Object) null);
        Class<? extends Object> term30702 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Field term30701 = ((Class) term30702).getDeclaredField((String) "NUMBER_OF_SHIPS_BUILT");
        ((Field) term30701).setAccessible(true);
        Object enum93 = ((Field) term30701).get((Object) null);
        Class<? extends Object> term31017 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Field term31016 = ((Class) term31017).getDeclaredField((String) "COMMANDER_LENGTH");
        ((Field) term31016).setAccessible(true);
        Object enum94 = ((Field) term31016).get((Object) null);
        Class<? extends Object> term31317 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Field term31316 = ((Class) term31317).getDeclaredField((String) "COMMANDER_LENGTH");
        ((Field) term31316).setAccessible(true);
        Object enum95 = ((Field) term31316).get((Object) null);
        Class<? extends Object> term31617 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Field term31616 = ((Class) term31617).getDeclaredField((String) "RULER_REIGN_LENGTH");
        ((Field) term31616).setAccessible(true);
        Object enum96 = ((Field) term31616).get((Object) null);
        Class<? extends Object> term31923 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Field term31922 = ((Class) term31923).getDeclaredField((String) "NUMBER_OF_JAIL_TIME");
        ((Field) term31922).setAccessible(true);
        Object enum97 = ((Field) term31922).get((Object) null);
        Class<? extends Object> term32232 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Field term32231 = ((Class) term32232).getDeclaredField((String) "RESEARCH_ARTIFACTS");
        ((Field) term32231).setAccessible(true);
        Object enum98 = ((Field) term32231).get((Object) null);
        Class<? extends Object> term32538 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Field term32537 = ((Class) term32538).getDeclaredField((String) "NUMBER_OF_BUILDINGS_BUILT");
        ((Field) term32537).setAccessible(true);
        Object enum99 = ((Field) term32537).get((Object) null);
        Integer term26556 = new Integer(0);
        Integer term26558 = new Integer(0);
        Integer term26560 = new Integer(0);
        Integer term26562 = new Integer(0);
        Integer term26564 = new Integer(0);
        Integer term26566 = new Integer(0);
        Integer term26568 = new Integer(0);
        Integer term26570 = new Integer(0);
        Integer term26572 = new Integer(0);
        Integer term26574 = new Integer(0);
        Integer term26576 = new Integer(0);
        Integer term26578 = new Integer(0);
        Integer term26580 = new Integer(0);
        Integer term26582 = new Integer(0);
        Integer term26584 = new Integer(0);
        Integer term26586 = new Integer(0);
        Integer term26588 = new Integer(0);
        Integer term26590 = new Integer(0);
        Integer term26592 = new Integer(0);
        Integer term26594 = new Integer(0);
        term26404 = newInstance(Class.forName("org.openRealmOfStars.player.leader.stats.LeaderStats"));
        Object term26405 = newInstance(Class.forName("java.util.EnumMap"));
        Object[] term26554 = (Object[]) newArray("org.openRealmOfStars.player.leader.stats.StatType", 20);
        Object[] term26555 = (Object[]) newArray("java.lang.Object", 20);
        setField(term26405, term26405.getClass(), "keyType", term26406);
        setElement(term26554, 0, enum80);
        setElement(term26554, 1, enum81);
        setElement(term26554, 2, enum82);
        setElement(term26554, 3, enum83);
        setElement(term26554, 4, enum84);
        setElement(term26554, 5, enum85);
        setElement(term26554, 6, enum86);
        setElement(term26554, 7, enum87);
        setElement(term26554, 8, enum88);
        setElement(term26554, 9, enum89);
        setElement(term26554, 10, enum90);
        setElement(term26554, 11, enum91);
        setElement(term26554, 12, enum92);
        setElement(term26554, 13, enum93);
        setElement(term26554, 14, enum94);
        setElement(term26554, 15, enum95);
        setElement(term26554, 16, enum96);
        setElement(term26554, 17, enum97);
        setElement(term26554, 18, enum98);
        setElement(term26554, 19, enum99);
        setField(term26405, term26405.getClass(), "keyUniverse", term26554);
        setElement(term26555, 0, term26556);
        setElement(term26555, 1, term26558);
        setElement(term26555, 2, term26560);
        setElement(term26555, 3, term26562);
        setElement(term26555, 4, term26564);
        setElement(term26555, 5, term26566);
        setElement(term26555, 6, term26568);
        setElement(term26555, 7, term26570);
        setElement(term26555, 8, term26572);
        setElement(term26555, 9, term26574);
        setElement(term26555, 10, term26576);
        setElement(term26555, 11, term26578);
        setElement(term26555, 12, term26580);
        setElement(term26555, 13, term26582);
        setElement(term26555, 14, term26584);
        setElement(term26555, 15, term26586);
        setElement(term26555, 16, term26588);
        setElement(term26555, 17, term26590);
        setElement(term26555, 18, term26592);
        setElement(term26555, 19, term26594);
        setField(term26405, term26405.getClass(), "vals", term26555);
        setIntField(term26405, term26405.getClass(), "size", 20);
        setField(term26405, term26405.getClass(), "entrySet", null);
        setField(term26405, term26405.getClass(), "keySet", null);
        setField(term26405, term26405.getClass(), "values", null);
        setField(term26404, term26404.getClass(), "statsMap", term26405);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.leader.stats.LeaderStats");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.leader.stats.StatType");
        Object[] args = new Object[1];
        args[0] = enum80;
        callMethod(klass, "addOne", argTypes, term26404, args);
    }

};


