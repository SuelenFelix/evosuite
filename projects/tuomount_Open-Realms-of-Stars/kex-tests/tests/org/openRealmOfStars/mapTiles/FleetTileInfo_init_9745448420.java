package org.openRealmOfStars.mapTiles;

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
import static org.openRealmOfStars.mapTiles.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Integer;

public class FleetTileInfo_init_9745448420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77706;
     Object term77986;
     Object term77988;
     Object term77990;

    public FleetTileInfo_init_9745448420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term78023 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term78022 = ((Class) term78023).getDeclaredField((String) "PEACEFUL");
        ((Field) term78022).setAccessible(true);
        Object enum200 = ((Field) term78022).get((Object) null);
        Class<? extends Object> term78314 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term78313 = ((Class) term78314).getDeclaredField((String) "MATRIARCHY");
        ((Field) term78313).setAccessible(true);
        Object enum201 = ((Field) term78313).get((Object) null);
        Class<? extends Object> term78576 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term78575 = ((Class) term78576).getDeclaredField((String) "MALE");
        ((Field) term78575).setAccessible(true);
        Object enum202 =  ((Field) term78575).get((Object) null);
        Class<? extends Object> term78800 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term78799 = ((Class) term78800).getDeclaredField((String) "FEMALE");
        ((Field) term78799).setAccessible(true);
        Object enum203 =  ((Field) term78799).get((Object) null);
        Class<? extends Object> term79030 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term79029 = ((Class) term79030).getDeclaredField((String) "MALE");
        ((Field) term79029).setAccessible(true);
        Object enum204 =  ((Field) term79029).get((Object) null);
        ArrayList term77805 = new ArrayList();
        ((ArrayList) term77805).add(enum202);
        ((ArrayList) term77805).add(enum203);
        ((ArrayList) term77805).add(enum202);
        ((ArrayList) term77805).add(enum204);
        ((ArrayList) term77805).add(enum203);
        ((ArrayList) term77805).add(enum203);
        Class<? extends Object> term79264 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term79263 = ((Class) term79264).getDeclaredField((String) "RED_ALERT");
        ((Field) term79263).setAccessible(true);
        Object enum205 = ((Field) term79263).get((Object) null);
        ArrayList term77892 = new ArrayList();
        ((ArrayList) term77892).add((Object)null);
        ((ArrayList) term77892).add((Object)null);
        ((ArrayList) term77892).add((Object)null);
        Object term77887 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term77887, term77887.getClass(), "traitId", "");
        setField(term77887, term77887.getClass(), "traitName", "");
        setField(term77887, term77887.getClass(), "description", "");
        setField(term77887, term77887.getClass(), "group", "");
        setField(term77887, term77887.getClass(), "conflictsWithIds", term77892);
        setByteField(term77887, term77887.getClass(), "traitPoints", (byte) -54);
        ArrayList term77901 = new ArrayList();
        ((ArrayList) term77901).add((Object)null);
        ((ArrayList) term77901).add((Object)null);
        ((ArrayList) term77901).add((Object)null);
        ((ArrayList) term77901).add((Object)null);
        ((ArrayList) term77901).add((Object)null);
        ((ArrayList) term77901).add((Object)null);
        Object term77896 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term77896, term77896.getClass(), "traitId", "");
        setField(term77896, term77896.getClass(), "traitName", "");
        setField(term77896, term77896.getClass(), "description", "");
        setField(term77896, term77896.getClass(), "group", "");
        setField(term77896, term77896.getClass(), "conflictsWithIds", term77901);
        setByteField(term77896, term77896.getClass(), "traitPoints", (byte) -51);
        ArrayList term77910 = new ArrayList();
        ((ArrayList) term77910).add((Object)null);
        Object term77905 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term77905, term77905.getClass(), "traitId", "");
        setField(term77905, term77905.getClass(), "traitName", "");
        setField(term77905, term77905.getClass(), "description", "");
        setField(term77905, term77905.getClass(), "group", "");
        setField(term77905, term77905.getClass(), "conflictsWithIds", term77910);
        setByteField(term77905, term77905.getClass(), "traitPoints", (byte) 101);
        ArrayList term77919 = new ArrayList();
        ((ArrayList) term77919).add((Object)null);
        ((ArrayList) term77919).add((Object)null);
        Object term77914 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term77914, term77914.getClass(), "traitId", "");
        setField(term77914, term77914.getClass(), "traitName", "");
        setField(term77914, term77914.getClass(), "description", "");
        setField(term77914, term77914.getClass(), "group", "");
        setField(term77914, term77914.getClass(), "conflictsWithIds", term77919);
        setByteField(term77914, term77914.getClass(), "traitPoints", (byte) 40);
        ArrayList term77928 = new ArrayList();
        ((ArrayList) term77928).add((Object)null);
        ((ArrayList) term77928).add((Object)null);
        ((ArrayList) term77928).add((Object)null);
        ((ArrayList) term77928).add((Object)null);
        ((ArrayList) term77928).add((Object)null);
        ((ArrayList) term77928).add((Object)null);
        Object term77923 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term77923, term77923.getClass(), "traitId", "");
        setField(term77923, term77923.getClass(), "traitName", "");
        setField(term77923, term77923.getClass(), "description", "");
        setField(term77923, term77923.getClass(), "group", "");
        setField(term77923, term77923.getClass(), "conflictsWithIds", term77928);
        setByteField(term77923, term77923.getClass(), "traitPoints", (byte) 83);
        ArrayList term77937 = new ArrayList();
        ((ArrayList) term77937).add((Object)null);
        ((ArrayList) term77937).add((Object)null);
        ((ArrayList) term77937).add((Object)null);
        ((ArrayList) term77937).add((Object)null);
        ((ArrayList) term77937).add((Object)null);
        ((ArrayList) term77937).add((Object)null);
        ((ArrayList) term77937).add((Object)null);
        ((ArrayList) term77937).add((Object)null);
        Object term77932 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term77932, term77932.getClass(), "traitId", "");
        setField(term77932, term77932.getClass(), "traitName", "");
        setField(term77932, term77932.getClass(), "description", "");
        setField(term77932, term77932.getClass(), "group", "");
        setField(term77932, term77932.getClass(), "conflictsWithIds", term77937);
        setByteField(term77932, term77932.getClass(), "traitPoints", (byte) -41);
        ArrayList term77885 = new ArrayList();
        ((ArrayList) term77885).add(term77887);
        ((ArrayList) term77885).add(term77896);
        ((ArrayList) term77885).add(term77905);
        ((ArrayList) term77885).add(term77914);
        ((ArrayList) term77885).add(term77923);
        ((ArrayList) term77885).add(term77932);
        Class<? extends Object> term79558 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term79557 = ((Class) term79558).getDeclaredField((String) "GASEOUS_CREATURE");
        ((Field) term79557).setAccessible(true);
        Object enum206 = ((Field) term79557).get((Object) null);
        Class<? extends Object> term79883 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term79882 = ((Class) term79883).getDeclaredField((String) "REGULAR");
        ((Field) term79882).setAccessible(true);
        Object enum207 = ((Field) term79882).get((Object) null);
        term77706 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term77846 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term77706, term77706.getClass(), "id", "CPZCLJxTuA");
        setField(term77706, term77706.getClass(), "name", "ivAOXnVjmg");
        setField(term77706, term77706.getClass(), "nameSingle", "FivesaUeHG");
        setField(term77706, term77706.getClass(), "attitude", enum200);
        setField(term77706, term77706.getClass(), "imagePath", "TnpXhZmCRY");
        setField(term77706, term77706.getClass(), "bridgeId", "ECVAXFhrTP");
        setField(term77706, term77706.getClass(), "spaceShipId", "ypytdNbrBc");
        setField(term77706, term77706.getClass(), "socialSystem", enum201);
        setField(term77706, term77706.getClass(), "genderList", term77805);
        setField(term77706, term77706.getClass(), "speechSetId", "XvrJCOSYei");
        setField(term77706, term77706.getClass(), "bridgeEffect", enum205);
        setField(term77846, term77846.getClass(), "songName", "QdRcxOxNSl");
        setField(term77846, term77846.getClass(), "author", "lvdsucnNvR");
        setField(term77846, term77846.getClass(), "fileName", "mSjSKfeMUn");
        setBooleanField(term77846, term77846.getClass(), "custom", true);
        setIntField(term77846, term77846.getClass(), "fadingLimit", 476903736);
        setField(term77706, term77706.getClass(), "diplomacyMusic", term77846);
        setField(term77706, term77706.getClass(), "traits", term77885);
        setField(term77706, term77706.getClass(), "leaderNameGenerator", enum206);
        setField(term77706, term77706.getClass(), "description", "eKCrPCkedw");
        setField(term77706, term77706.getClass(), "spaceRaceType", enum207);
        term77986 = new Integer(-832801133);
        term77988 = new Integer(658732890);
        term77990 = new Integer(888621409);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.mapTiles.FleetTileInfo");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.race.SpaceRace");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term77706;
        args[1] = term77986;
        args[2] = term77988;
        args[3] = term77990;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


