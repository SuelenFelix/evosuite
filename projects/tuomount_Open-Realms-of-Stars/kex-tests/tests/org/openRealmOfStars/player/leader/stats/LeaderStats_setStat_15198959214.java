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

public class LeaderStats_setStat_15198959214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13476;
     Object enum47;
     Object term13669;

    public LeaderStats_setStat_15198959214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13478 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Class<? extends Object> term13819 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Field term13818 = ((Class) term13819).getDeclaredField((String) "KILLED_ANOTHER_LEADER");
        ((Field) term13818).setAccessible(true);
        Object enum40 = ((Field) term13818).get((Object) null);
        Class<? extends Object> term14134 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Field term14133 = ((Class) term14134).getDeclaredField((String) "NUMBER_OF_ESPIONAGE");
        ((Field) term14133).setAccessible(true);
        Object enum41 = ((Field) term14133).get((Object) null);
        Class<? extends Object> term14443 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Field term14442 = ((Class) term14443).getDeclaredField((String) "NUMBER_OF_ANOMALY");
        ((Field) term14442).setAccessible(true);
        Object enum42 = ((Field) term14442).get((Object) null);
        Class<? extends Object> term14746 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Field term14745 = ((Class) term14746).getDeclaredField((String) "NUMBER_OF_SHIPS_BUILT");
        ((Field) term14745).setAccessible(true);
        Object enum43 = ((Field) term14745).get((Object) null);
        Class<? extends Object> term15061 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Field term15060 = ((Class) term15061).getDeclaredField((String) "NUMBER_OF_ESPIONAGE");
        ((Field) term15060).setAccessible(true);
        Object enum44 = ((Field) term15060).get((Object) null);
        Class<? extends Object> term15370 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Field term15369 = ((Class) term15370).getDeclaredField((String) "RESEARCH_ARTIFACTS");
        ((Field) term15369).setAccessible(true);
        Object enum45 = ((Field) term15369).get((Object) null);
        Class<? extends Object> term15676 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Field term15675 = ((Class) term15676).getDeclaredField((String) "NUMBER_OF_BATTLES");
        ((Field) term15675).setAccessible(true);
        Object enum46 = ((Field) term15675).get((Object) null);
        Class<? extends Object> term15979 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Field term15978 = ((Class) term15979).getDeclaredField((String) "POPULATION_GROWTH");
        ((Field) term15978).setAccessible(true);
        enum47 = ((Field) term15978).get((Object) null);
        Class<? extends Object> term16282 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Field term16281 = ((Class) term16282).getDeclaredField((String) "GOVERNOR_LENGTH");
        ((Field) term16281).setAccessible(true);
        Object enum48 = ((Field) term16281).get((Object) null);
        Class<? extends Object> term16579 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Field term16578 = ((Class) term16579).getDeclaredField((String) "NUMBER_OF_JAIL_TIME");
        ((Field) term16578).setAccessible(true);
        Object enum49 = ((Field) term16578).get((Object) null);
        Class<? extends Object> term16888 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Field term16887 = ((Class) term16888).getDeclaredField((String) "NUMBER_OF_PRIVATEERING");
        ((Field) term16887).setAccessible(true);
        Object enum50 = ((Field) term16887).get((Object) null);
        Class<? extends Object> term17206 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Field term17205 = ((Class) term17206).getDeclaredField((String) "NUMBER_OF_SHIPS_BUILT");
        ((Field) term17205).setAccessible(true);
        Object enum51 = ((Field) term17205).get((Object) null);
        Class<? extends Object> term17521 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Field term17520 = ((Class) term17521).getDeclaredField((String) "NUMBER_OF_RULER");
        ((Field) term17520).setAccessible(true);
        Object enum52 = ((Field) term17520).get((Object) null);
        Class<? extends Object> term17818 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Field term17817 = ((Class) term17818).getDeclaredField((String) "RESEARCH_ARTIFACTS");
        ((Field) term17817).setAccessible(true);
        Object enum53 = ((Field) term17817).get((Object) null);
        Class<? extends Object> term18124 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Field term18123 = ((Class) term18124).getDeclaredField((String) "NUMBER_OF_ANOMALY");
        ((Field) term18123).setAccessible(true);
        Object enum54 = ((Field) term18123).get((Object) null);
        Class<? extends Object> term18427 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Field term18426 = ((Class) term18427).getDeclaredField((String) "NUMBER_OF_JAIL_TIME");
        ((Field) term18426).setAccessible(true);
        Object enum55 = ((Field) term18426).get((Object) null);
        Class<? extends Object> term18736 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Field term18735 = ((Class) term18736).getDeclaredField((String) "NUMBER_OF_BUILDINGS_BUILT");
        ((Field) term18735).setAccessible(true);
        Object enum56 = ((Field) term18735).get((Object) null);
        Class<? extends Object> term19063 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Field term19062 = ((Class) term19063).getDeclaredField((String) "GOVERNOR_LENGTH");
        ((Field) term19062).setAccessible(true);
        Object enum57 = ((Field) term19062).get((Object) null);
        Class<? extends Object> term19360 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Field term19359 = ((Class) term19360).getDeclaredField((String) "DIPLOMATIC_TRADE");
        ((Field) term19359).setAccessible(true);
        Object enum58 = ((Field) term19359).get((Object) null);
        Class<? extends Object> term19660 = Class.forName((String) "org.openRealmOfStars.player.leader.stats.StatType");
        Field term19659 = ((Class) term19660).getDeclaredField((String) "NUMBER_OF_PLANETS_EXPLORED");
        ((Field) term19659).setAccessible(true);
        Object enum59 = ((Field) term19659).get((Object) null);
        Integer term13628 = new Integer(0);
        Integer term13630 = new Integer(0);
        Integer term13632 = new Integer(0);
        Integer term13634 = new Integer(0);
        Integer term13636 = new Integer(0);
        Integer term13638 = new Integer(0);
        Integer term13640 = new Integer(0);
        Integer term13642 = new Integer(0);
        Integer term13644 = new Integer(0);
        Integer term13646 = new Integer(0);
        Integer term13648 = new Integer(0);
        Integer term13650 = new Integer(0);
        Integer term13652 = new Integer(0);
        Integer term13654 = new Integer(0);
        Integer term13656 = new Integer(0);
        Integer term13658 = new Integer(0);
        Integer term13660 = new Integer(0);
        Integer term13662 = new Integer(0);
        Integer term13664 = new Integer(0);
        Integer term13666 = new Integer(0);
        term13476 = newInstance(Class.forName("org.openRealmOfStars.player.leader.stats.LeaderStats"));
        Object term13477 = newInstance(Class.forName("java.util.EnumMap"));
        Object[] term13626 = (Object[]) newArray("org.openRealmOfStars.player.leader.stats.StatType", 20);
        Object[] term13627 = (Object[]) newArray("java.lang.Object", 20);
        setField(term13477, term13477.getClass(), "keyType", term13478);
        setElement(term13626, 0, enum40);
        setElement(term13626, 1, enum41);
        setElement(term13626, 2, enum42);
        setElement(term13626, 3, enum43);
        setElement(term13626, 4, enum44);
        setElement(term13626, 5, enum45);
        setElement(term13626, 6, enum46);
        setElement(term13626, 7, enum47);
        setElement(term13626, 8, enum48);
        setElement(term13626, 9, enum49);
        setElement(term13626, 10, enum50);
        setElement(term13626, 11, enum51);
        setElement(term13626, 12, enum52);
        setElement(term13626, 13, enum53);
        setElement(term13626, 14, enum54);
        setElement(term13626, 15, enum55);
        setElement(term13626, 16, enum56);
        setElement(term13626, 17, enum57);
        setElement(term13626, 18, enum58);
        setElement(term13626, 19, enum59);
        setField(term13477, term13477.getClass(), "keyUniverse", term13626);
        setElement(term13627, 0, term13628);
        setElement(term13627, 1, term13630);
        setElement(term13627, 2, term13632);
        setElement(term13627, 3, term13634);
        setElement(term13627, 4, term13636);
        setElement(term13627, 5, term13638);
        setElement(term13627, 6, term13640);
        setElement(term13627, 7, term13642);
        setElement(term13627, 8, term13644);
        setElement(term13627, 9, term13646);
        setElement(term13627, 10, term13648);
        setElement(term13627, 11, term13650);
        setElement(term13627, 12, term13652);
        setElement(term13627, 13, term13654);
        setElement(term13627, 14, term13656);
        setElement(term13627, 15, term13658);
        setElement(term13627, 16, term13660);
        setElement(term13627, 17, term13662);
        setElement(term13627, 18, term13664);
        setElement(term13627, 19, term13666);
        setField(term13477, term13477.getClass(), "vals", term13627);
        setIntField(term13477, term13477.getClass(), "size", 20);
        setField(term13477, term13477.getClass(), "entrySet", null);
        setField(term13477, term13477.getClass(), "keySet", null);
        setField(term13477, term13477.getClass(), "values", null);
        setField(term13476, term13476.getClass(), "statsMap", term13477);
        term13669 = new Integer(1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.leader.stats.LeaderStats");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.leader.stats.StatType");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = enum47;
        args[1] = term13669;
        callMethod(klass, "setStat", argTypes, term13476, args);
    }

};


