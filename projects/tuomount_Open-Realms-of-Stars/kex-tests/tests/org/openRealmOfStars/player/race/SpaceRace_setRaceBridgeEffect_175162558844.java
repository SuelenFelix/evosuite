package org.openRealmOfStars.player.race;

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
import static org.openRealmOfStars.player.race.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class SpaceRace_setRaceBridgeEffect_175162558844 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term323924;
     Object enum1007;

    public SpaceRace_setRaceBridgeEffect_175162558844() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term324248 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term324247 = ((Class) term324248).getDeclaredField((String) "SCIENTIFIC");
        ((Field) term324247).setAccessible(true);
        Object enum999 = ((Field) term324247).get((Object) null);
        Class<? extends Object> term324545 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term324544 = ((Class) term324545).getDeclaredField((String) "MATRIARCHY");
        ((Field) term324544).setAccessible(true);
        Object enum1000 = ((Field) term324544).get((Object) null);
        Class<? extends Object> term324807 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term324806 = ((Class) term324807).getDeclaredField((String) "MALE");
        ((Field) term324806).setAccessible(true);
        Object enum1001 =  ((Field) term324806).get((Object) null);
        Class<? extends Object> term325031 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term325030 = ((Class) term325031).getDeclaredField((String) "MALE");
        ((Field) term325030).setAccessible(true);
        Object enum1002 =  ((Field) term325030).get((Object) null);
        Class<? extends Object> term325255 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term325254 = ((Class) term325255).getDeclaredField((String) "MALE");
        ((Field) term325254).setAccessible(true);
        Object enum1003 =  ((Field) term325254).get((Object) null);
        ArrayList term324025 = new ArrayList();
        ((ArrayList) term324025).add(enum1001);
        ((ArrayList) term324025).add(enum1002);
        ((ArrayList) term324025).add(enum1003);
        ((ArrayList) term324025).add(enum1003);
        ((ArrayList) term324025).add(enum1001);
        ((ArrayList) term324025).add(enum1001);
        ((ArrayList) term324025).add(enum1001);
        Class<? extends Object> term325489 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term325488 = ((Class) term325489).getDeclaredField((String) "FUNGUS");
        ((Field) term325488).setAccessible(true);
        Object enum1004 = ((Field) term325488).get((Object) null);
        ArrayList term324109 = new ArrayList();
        ((ArrayList) term324109).add((Object)null);
        ((ArrayList) term324109).add((Object)null);
        ((ArrayList) term324109).add((Object)null);
        ((ArrayList) term324109).add((Object)null);
        ((ArrayList) term324109).add((Object)null);
        Object term324104 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term324104, term324104.getClass(), "traitId", "");
        setField(term324104, term324104.getClass(), "traitName", "");
        setField(term324104, term324104.getClass(), "description", "");
        setField(term324104, term324104.getClass(), "group", "");
        setField(term324104, term324104.getClass(), "conflictsWithIds", term324109);
        setByteField(term324104, term324104.getClass(), "traitPoints", (byte) -75);
        ArrayList term324118 = new ArrayList();
        ((ArrayList) term324118).add((Object)null);
        ((ArrayList) term324118).add((Object)null);
        ((ArrayList) term324118).add((Object)null);
        ((ArrayList) term324118).add((Object)null);
        ((ArrayList) term324118).add((Object)null);
        ((ArrayList) term324118).add((Object)null);
        Object term324113 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term324113, term324113.getClass(), "traitId", "");
        setField(term324113, term324113.getClass(), "traitName", "");
        setField(term324113, term324113.getClass(), "description", "");
        setField(term324113, term324113.getClass(), "group", "");
        setField(term324113, term324113.getClass(), "conflictsWithIds", term324118);
        setByteField(term324113, term324113.getClass(), "traitPoints", (byte) 33);
        ArrayList term324127 = new ArrayList();
        ((ArrayList) term324127).add((Object)null);
        ((ArrayList) term324127).add((Object)null);
        ((ArrayList) term324127).add((Object)null);
        ((ArrayList) term324127).add((Object)null);
        ((ArrayList) term324127).add((Object)null);
        Object term324122 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term324122, term324122.getClass(), "traitId", "");
        setField(term324122, term324122.getClass(), "traitName", "");
        setField(term324122, term324122.getClass(), "description", "");
        setField(term324122, term324122.getClass(), "group", "");
        setField(term324122, term324122.getClass(), "conflictsWithIds", term324127);
        setByteField(term324122, term324122.getClass(), "traitPoints", (byte) 116);
        ArrayList term324136 = new ArrayList();
        ((ArrayList) term324136).add((Object)null);
        ((ArrayList) term324136).add((Object)null);
        ((ArrayList) term324136).add((Object)null);
        ((ArrayList) term324136).add((Object)null);
        ((ArrayList) term324136).add((Object)null);
        ((ArrayList) term324136).add((Object)null);
        ((ArrayList) term324136).add((Object)null);
        Object term324131 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term324131, term324131.getClass(), "traitId", "");
        setField(term324131, term324131.getClass(), "traitName", "");
        setField(term324131, term324131.getClass(), "description", "");
        setField(term324131, term324131.getClass(), "group", "");
        setField(term324131, term324131.getClass(), "conflictsWithIds", term324136);
        setByteField(term324131, term324131.getClass(), "traitPoints", (byte) 45);
        ArrayList term324145 = new ArrayList();
        Object term324140 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term324140, term324140.getClass(), "traitId", "");
        setField(term324140, term324140.getClass(), "traitName", "");
        setField(term324140, term324140.getClass(), "description", "");
        setField(term324140, term324140.getClass(), "group", "");
        setField(term324140, term324140.getClass(), "conflictsWithIds", term324145);
        setByteField(term324140, term324140.getClass(), "traitPoints", (byte) 18);
        ArrayList term324102 = new ArrayList();
        ((ArrayList) term324102).add(term324104);
        ((ArrayList) term324102).add(term324113);
        ((ArrayList) term324102).add(term324122);
        ((ArrayList) term324102).add(term324131);
        ((ArrayList) term324102).add(term324140);
        Class<? extends Object> term325774 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term325773 = ((Class) term325774).getDeclaredField((String) "DEEP_ANCIENT_MONSTER");
        ((Field) term325773).setAccessible(true);
        Object enum1005 = ((Field) term325773).get((Object) null);
        Class<? extends Object> term326111 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term326110 = ((Class) term326111).getDeclaredField((String) "SPACE_MONSTER");
        ((Field) term326110).setAccessible(true);
        Object enum1006 = ((Field) term326110).get((Object) null);
        term323924 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term324063 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term323924, term323924.getClass(), "id", "vrYaIwwcMN");
        setField(term323924, term323924.getClass(), "name", "LcVLocUBWS");
        setField(term323924, term323924.getClass(), "nameSingle", "joSmLtjBvB");
        setField(term323924, term323924.getClass(), "attitude", enum999);
        setField(term323924, term323924.getClass(), "imagePath", "wyNmzyMLQI");
        setField(term323924, term323924.getClass(), "bridgeId", "wiZrzOpgQw");
        setField(term323924, term323924.getClass(), "spaceShipId", "WQqnouSTpD");
        setField(term323924, term323924.getClass(), "socialSystem", enum1000);
        setField(term323924, term323924.getClass(), "genderList", term324025);
        setField(term323924, term323924.getClass(), "speechSetId", "ytoXodivzA");
        setField(term323924, term323924.getClass(), "bridgeEffect", enum1004);
        setField(term324063, term324063.getClass(), "songName", "sEcSjAkjSq");
        setField(term324063, term324063.getClass(), "author", "mSmFFGfsFJ");
        setField(term324063, term324063.getClass(), "fileName", "OIzsTPqaal");
        setBooleanField(term324063, term324063.getClass(), "custom", false);
        setIntField(term324063, term324063.getClass(), "fadingLimit", -240870307);
        setField(term323924, term323924.getClass(), "diplomacyMusic", term324063);
        setField(term323924, term323924.getClass(), "traits", term324102);
        setField(term323924, term323924.getClass(), "leaderNameGenerator", enum1005);
        setField(term323924, term323924.getClass(), "description", "CZZYeaxqjs");
        setField(term323924, term323924.getClass(), "spaceRaceType", enum1006);
        Class<? extends Object> term326387 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term326386 = ((Class) term326387).getDeclaredField((String) "RED_ALERT");
        ((Field) term326386).setAccessible(true);
        enum1007 = ((Field) term326386).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.race.SpaceRace");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.ambient.BridgeCommandType");
        Object[] args = new Object[1];
        args[0] = enum1007;
        callMethod(klass, "setRaceBridgeEffect", argTypes, term323924, args);
    }

};


