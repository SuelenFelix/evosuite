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
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class DiplomacyBonus_init_9585305510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum0;
     Object term19;

    public DiplomacyBonus_init_9585305510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term969 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.DiplomacyBonusType");
        Field term968 = ((Class) term969).getDeclaredField((String) "WAR_DECLARTION");
        ((Field) term968).setAccessible(true);
        enum0 = ((Field) term968).get((Object) null);
        Class<? extends Object> term1457 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term1456 = ((Class) term1457).getDeclaredField((String) "PEACEFUL");
        ((Field) term1456).setAccessible(true);
        Object enum1 = ((Field) term1456).get((Object) null);
        Class<? extends Object> term1785 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term1784 = ((Class) term1785).getDeclaredField((String) "PATRIARCHY");
        ((Field) term1784).setAccessible(true);
        Object enum2 = ((Field) term1784).get((Object) null);
        Class<? extends Object> term2076 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term2075 = ((Class) term2076).getDeclaredField((String) "MALE");
        ((Field) term2075).setAccessible(true);
        Object enum3 =  ((Field) term2075).get((Object) null);
        Class<? extends Object> term2300 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term2299 = ((Class) term2300).getDeclaredField((String) "NONE");
        ((Field) term2299).setAccessible(true);
        Object enum4 =  ((Field) term2299).get((Object) null);
        Class<? extends Object> term2524 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term2523 = ((Class) term2524).getDeclaredField((String) "FEMALE");
        ((Field) term2523).setAccessible(true);
        Object enum5 =  ((Field) term2523).get((Object) null);
        ArrayList term118 = new ArrayList();
        ((ArrayList) term118).add(enum3);
        ((ArrayList) term118).add(enum4);
        ((ArrayList) term118).add(enum3);
        ((ArrayList) term118).add(enum4);
        ((ArrayList) term118).add(enum5);
        Class<? extends Object> term3143 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term3142 = ((Class) term3143).getDeclaredField((String) "JUNGLE");
        ((Field) term3142).setAccessible(true);
        Object enum6 = ((Field) term3142).get((Object) null);
        ArrayList term202 = new ArrayList();
        ((ArrayList) term202).add((Object)null);
        ((ArrayList) term202).add((Object)null);
        ((ArrayList) term202).add((Object)null);
        Object term197 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term197, term197.getClass(), "traitId", "");
        setField(term197, term197.getClass(), "traitName", "");
        setField(term197, term197.getClass(), "description", "");
        setField(term197, term197.getClass(), "group", "");
        setField(term197, term197.getClass(), "conflictsWithIds", term202);
        setByteField(term197, term197.getClass(), "traitPoints", (byte) 47);
        ArrayList term211 = new ArrayList();
        ((ArrayList) term211).add((Object)null);
        ((ArrayList) term211).add((Object)null);
        ((ArrayList) term211).add((Object)null);
        ((ArrayList) term211).add((Object)null);
        Object term206 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term206, term206.getClass(), "traitId", "");
        setField(term206, term206.getClass(), "traitName", "");
        setField(term206, term206.getClass(), "description", "");
        setField(term206, term206.getClass(), "group", "");
        setField(term206, term206.getClass(), "conflictsWithIds", term211);
        setByteField(term206, term206.getClass(), "traitPoints", (byte) 48);
        ArrayList term220 = new ArrayList();
        ((ArrayList) term220).add((Object)null);
        Object term215 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term215, term215.getClass(), "traitId", "");
        setField(term215, term215.getClass(), "traitName", "");
        setField(term215, term215.getClass(), "description", "");
        setField(term215, term215.getClass(), "group", "");
        setField(term215, term215.getClass(), "conflictsWithIds", term220);
        setByteField(term215, term215.getClass(), "traitPoints", (byte) 89);
        ArrayList term229 = new ArrayList();
        ((ArrayList) term229).add((Object)null);
        ((ArrayList) term229).add((Object)null);
        ((ArrayList) term229).add((Object)null);
        ((ArrayList) term229).add((Object)null);
        ((ArrayList) term229).add((Object)null);
        ((ArrayList) term229).add((Object)null);
        Object term224 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term224, term224.getClass(), "traitId", "");
        setField(term224, term224.getClass(), "traitName", "");
        setField(term224, term224.getClass(), "description", "");
        setField(term224, term224.getClass(), "group", "");
        setField(term224, term224.getClass(), "conflictsWithIds", term229);
        setByteField(term224, term224.getClass(), "traitPoints", (byte) 75);
        ArrayList term195 = new ArrayList();
        ((ArrayList) term195).add(term197);
        ((ArrayList) term195).add(term206);
        ((ArrayList) term195).add(term215);
        ((ArrayList) term195).add(term224);
        Class<? extends Object> term3695 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term3694 = ((Class) term3695).getDeclaredField((String) "EVIL_CREATURE");
        ((Field) term3694).setAccessible(true);
        Object enum7 = ((Field) term3694).get((Object) null);
        Class<? extends Object> term4055 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term4054 = ((Class) term4055).getDeclaredField((String) "SPACE_PIRATE");
        ((Field) term4054).setAccessible(true);
        Object enum8 = ((Field) term4054).get((Object) null);
        term19 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term156 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term19, term19.getClass(), "id", "PAEBtnZtTD");
        setField(term19, term19.getClass(), "name", "sjlJAEtRrb");
        setField(term19, term19.getClass(), "nameSingle", "MuLcgQHgqz");
        setField(term19, term19.getClass(), "attitude", enum1);
        setField(term19, term19.getClass(), "imagePath", "xxtlPwDYFs");
        setField(term19, term19.getClass(), "bridgeId", "jJCZpVmanW");
        setField(term19, term19.getClass(), "spaceShipId", "EGtDIRbSSb");
        setField(term19, term19.getClass(), "socialSystem", enum2);
        setField(term19, term19.getClass(), "genderList", term118);
        setField(term19, term19.getClass(), "speechSetId", "SzjVpOQTyS");
        setField(term19, term19.getClass(), "bridgeEffect", enum6);
        setField(term156, term156.getClass(), "songName", "MjGYSRKTNF");
        setField(term156, term156.getClass(), "author", "hRNSzYYIrc");
        setField(term156, term156.getClass(), "fileName", "RMFIsYGgne");
        setBooleanField(term156, term156.getClass(), "custom", false);
        setIntField(term156, term156.getClass(), "fadingLimit", 568599855);
        setField(term19, term19.getClass(), "diplomacyMusic", term156);
        setField(term19, term19.getClass(), "traits", term195);
        setField(term19, term19.getClass(), "leaderNameGenerator", enum7);
        setField(term19, term19.getClass(), "description", "wSQxaModmm");
        setField(term19, term19.getClass(), "spaceRaceType", enum8);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonus");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusType");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.race.SpaceRace");
        Object[] args = new Object[2];
        args[0] = enum0;
        args[1] = term19;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


