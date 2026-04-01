package org.openRealmOfStars.player.ship;

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
import static org.openRealmOfStars.player.ship.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class ShipHullFactory_createByName_6605361821 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13;

    public ShipHullFactory_createByName_6605361821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term444 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term443 = ((Class) term444).getDeclaredField((String) "PEACEFUL");
        ((Field) term443).setAccessible(true);
        Object enum0 = ((Field) term443).get((Object) null);
        Class<? extends Object> term772 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term771 = ((Class) term772).getDeclaredField((String) "PATRIARCHY");
        ((Field) term771).setAccessible(true);
        Object enum1 = ((Field) term771).get((Object) null);
        Class<? extends Object> term1063 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term1062 = ((Class) term1063).getDeclaredField((String) "MALE");
        ((Field) term1062).setAccessible(true);
        Object enum2 =  ((Field) term1062).get((Object) null);
        Class<? extends Object> term1287 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term1286 = ((Class) term1287).getDeclaredField((String) "NONE");
        ((Field) term1286).setAccessible(true);
        Object enum3 =  ((Field) term1286).get((Object) null);
        Class<? extends Object> term1511 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term1510 = ((Class) term1511).getDeclaredField((String) "FEMALE");
        ((Field) term1510).setAccessible(true);
        Object enum4 =  ((Field) term1510).get((Object) null);
        ArrayList term112 = new ArrayList();
        ((ArrayList) term112).add(enum2);
        ((ArrayList) term112).add(enum3);
        ((ArrayList) term112).add(enum2);
        ((ArrayList) term112).add(enum3);
        ((ArrayList) term112).add(enum4);
        Class<? extends Object> term2130 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term2129 = ((Class) term2130).getDeclaredField((String) "JUNGLE");
        ((Field) term2129).setAccessible(true);
        Object enum5 = ((Field) term2129).get((Object) null);
        ArrayList term196 = new ArrayList();
        ((ArrayList) term196).add((Object)null);
        ((ArrayList) term196).add((Object)null);
        ((ArrayList) term196).add((Object)null);
        Object term191 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term191, term191.getClass(), "traitId", "");
        setField(term191, term191.getClass(), "traitName", "");
        setField(term191, term191.getClass(), "description", "");
        setField(term191, term191.getClass(), "group", "");
        setField(term191, term191.getClass(), "conflictsWithIds", term196);
        setByteField(term191, term191.getClass(), "traitPoints", (byte) 47);
        ArrayList term205 = new ArrayList();
        ((ArrayList) term205).add((Object)null);
        ((ArrayList) term205).add((Object)null);
        ((ArrayList) term205).add((Object)null);
        ((ArrayList) term205).add((Object)null);
        Object term200 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term200, term200.getClass(), "traitId", "");
        setField(term200, term200.getClass(), "traitName", "");
        setField(term200, term200.getClass(), "description", "");
        setField(term200, term200.getClass(), "group", "");
        setField(term200, term200.getClass(), "conflictsWithIds", term205);
        setByteField(term200, term200.getClass(), "traitPoints", (byte) 48);
        ArrayList term214 = new ArrayList();
        ((ArrayList) term214).add((Object)null);
        Object term209 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term209, term209.getClass(), "traitId", "");
        setField(term209, term209.getClass(), "traitName", "");
        setField(term209, term209.getClass(), "description", "");
        setField(term209, term209.getClass(), "group", "");
        setField(term209, term209.getClass(), "conflictsWithIds", term214);
        setByteField(term209, term209.getClass(), "traitPoints", (byte) 89);
        ArrayList term223 = new ArrayList();
        ((ArrayList) term223).add((Object)null);
        ((ArrayList) term223).add((Object)null);
        ((ArrayList) term223).add((Object)null);
        ((ArrayList) term223).add((Object)null);
        ((ArrayList) term223).add((Object)null);
        ((ArrayList) term223).add((Object)null);
        Object term218 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term218, term218.getClass(), "traitId", "");
        setField(term218, term218.getClass(), "traitName", "");
        setField(term218, term218.getClass(), "description", "");
        setField(term218, term218.getClass(), "group", "");
        setField(term218, term218.getClass(), "conflictsWithIds", term223);
        setByteField(term218, term218.getClass(), "traitPoints", (byte) 75);
        ArrayList term189 = new ArrayList();
        ((ArrayList) term189).add(term191);
        ((ArrayList) term189).add(term200);
        ((ArrayList) term189).add(term209);
        ((ArrayList) term189).add(term218);
        Class<? extends Object> term2682 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term2681 = ((Class) term2682).getDeclaredField((String) "EVIL_CREATURE");
        ((Field) term2681).setAccessible(true);
        Object enum6 = ((Field) term2681).get((Object) null);
        Class<? extends Object> term3042 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term3041 = ((Class) term3042).getDeclaredField((String) "SPACE_PIRATE");
        ((Field) term3041).setAccessible(true);
        Object enum7 = ((Field) term3041).get((Object) null);
        term13 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term150 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term13, term13.getClass(), "id", "sjlJAEtRrb");
        setField(term13, term13.getClass(), "name", "MuLcgQHgqz");
        setField(term13, term13.getClass(), "nameSingle", "xxtlPwDYFs");
        setField(term13, term13.getClass(), "attitude", enum0);
        setField(term13, term13.getClass(), "imagePath", "jJCZpVmanW");
        setField(term13, term13.getClass(), "bridgeId", "EGtDIRbSSb");
        setField(term13, term13.getClass(), "spaceShipId", "SzjVpOQTyS");
        setField(term13, term13.getClass(), "socialSystem", enum1);
        setField(term13, term13.getClass(), "genderList", term112);
        setField(term13, term13.getClass(), "speechSetId", "MjGYSRKTNF");
        setField(term13, term13.getClass(), "bridgeEffect", enum5);
        setField(term150, term150.getClass(), "songName", "hRNSzYYIrc");
        setField(term150, term150.getClass(), "author", "RMFIsYGgne");
        setField(term150, term150.getClass(), "fileName", "NRdvgJlhkX");
        setBooleanField(term150, term150.getClass(), "custom", false);
        setIntField(term150, term150.getClass(), "fadingLimit", 568599855);
        setField(term13, term13.getClass(), "diplomacyMusic", term150);
        setField(term13, term13.getClass(), "traits", term189);
        setField(term13, term13.getClass(), "leaderNameGenerator", enum6);
        setField(term13, term13.getClass(), "description", "UlajhuVLaP");
        setField(term13, term13.getClass(), "spaceRaceType", enum7);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipHullFactory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.race.SpaceRace");
        Object[] args = new Object[2];
        args[0] = "PAEBtnZtTD";
        args[1] = term13;
        callMethod(klass, "createByName", argTypes, null, args);
    }

};


