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

public class ShipHull_getMaxSlot_1378902109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term505182;

    public ShipHull_getMaxSlot_1378902109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term505473 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipHullType");
        Field term505472 = ((Class) term505473).getDeclaredField((String) "STARBASE");
        ((Field) term505472).setAccessible(true);
        Object enum1599 = ((Field) term505472).get((Object) null);
        Class<? extends Object> term505729 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipSize");
        Field term505728 = ((Class) term505729).getDeclaredField((String) "HUGE");
        ((Field) term505728).setAccessible(true);
        Object enum1600 = ((Field) term505728).get((Object) null);
        Class<? extends Object> term505983 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term505982 = ((Class) term505983).getDeclaredField((String) "EXPANSIONIST");
        ((Field) term505982).setAccessible(true);
        Object enum1601 = ((Field) term505982).get((Object) null);
        Class<? extends Object> term506286 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term506285 = ((Class) term506286).getDeclaredField((String) "EQUAL");
        ((Field) term506285).setAccessible(true);
        Object enum1602 = ((Field) term506285).get((Object) null);
        Class<? extends Object> term506533 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term506532 = ((Class) term506533).getDeclaredField((String) "MALE");
        ((Field) term506532).setAccessible(true);
        Object enum1603 =  ((Field) term506532).get((Object) null);
        Class<? extends Object> term506757 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term506756 = ((Class) term506757).getDeclaredField((String) "NONE");
        ((Field) term506756).setAccessible(true);
        Object enum1604 =  ((Field) term506756).get((Object) null);
        ArrayList term505320 = new ArrayList();
        ((ArrayList) term505320).add(enum1603);
        ((ArrayList) term505320).add(enum1603);
        ((ArrayList) term505320).add(enum1604);
        Class<? extends Object> term506991 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term506990 = ((Class) term506991).getDeclaredField((String) "ORANGE_BLUE");
        ((Field) term506990).setAccessible(true);
        Object enum1605 = ((Field) term506990).get((Object) null);
        Object term505398 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term505398, term505398.getClass(), "traitId", null);
        setField(term505398, term505398.getClass(), "traitName", null);
        setField(term505398, term505398.getClass(), "description", null);
        setField(term505398, term505398.getClass(), "group", null);
        setField(term505398, term505398.getClass(), "conflictsWithIds", null);
        setByteField(term505398, term505398.getClass(), "traitPoints", (byte) -59);
        Object term505400 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term505400, term505400.getClass(), "traitId", null);
        setField(term505400, term505400.getClass(), "traitName", null);
        setField(term505400, term505400.getClass(), "description", null);
        setField(term505400, term505400.getClass(), "group", null);
        setField(term505400, term505400.getClass(), "conflictsWithIds", null);
        setByteField(term505400, term505400.getClass(), "traitPoints", (byte) -31);
        Object term505402 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term505402, term505402.getClass(), "traitId", null);
        setField(term505402, term505402.getClass(), "traitName", null);
        setField(term505402, term505402.getClass(), "description", null);
        setField(term505402, term505402.getClass(), "group", null);
        setField(term505402, term505402.getClass(), "conflictsWithIds", null);
        setByteField(term505402, term505402.getClass(), "traitPoints", (byte) 36);
        Object term505404 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term505404, term505404.getClass(), "traitId", null);
        setField(term505404, term505404.getClass(), "traitName", null);
        setField(term505404, term505404.getClass(), "description", null);
        setField(term505404, term505404.getClass(), "group", null);
        setField(term505404, term505404.getClass(), "conflictsWithIds", null);
        setByteField(term505404, term505404.getClass(), "traitPoints", (byte) 0);
        Object term505406 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term505406, term505406.getClass(), "traitId", null);
        setField(term505406, term505406.getClass(), "traitName", null);
        setField(term505406, term505406.getClass(), "description", null);
        setField(term505406, term505406.getClass(), "group", null);
        setField(term505406, term505406.getClass(), "conflictsWithIds", null);
        setByteField(term505406, term505406.getClass(), "traitPoints", (byte) -71);
        Object term505408 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term505408, term505408.getClass(), "traitId", null);
        setField(term505408, term505408.getClass(), "traitName", null);
        setField(term505408, term505408.getClass(), "description", null);
        setField(term505408, term505408.getClass(), "group", null);
        setField(term505408, term505408.getClass(), "conflictsWithIds", null);
        setByteField(term505408, term505408.getClass(), "traitPoints", (byte) 108);
        Object term505410 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term505410, term505410.getClass(), "traitId", null);
        setField(term505410, term505410.getClass(), "traitName", null);
        setField(term505410, term505410.getClass(), "description", null);
        setField(term505410, term505410.getClass(), "group", null);
        setField(term505410, term505410.getClass(), "conflictsWithIds", null);
        setByteField(term505410, term505410.getClass(), "traitPoints", (byte) -14);
        Object term505412 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term505412, term505412.getClass(), "traitId", null);
        setField(term505412, term505412.getClass(), "traitName", null);
        setField(term505412, term505412.getClass(), "description", null);
        setField(term505412, term505412.getClass(), "group", null);
        setField(term505412, term505412.getClass(), "conflictsWithIds", null);
        setByteField(term505412, term505412.getClass(), "traitPoints", (byte) -23);
        ArrayList term505396 = new ArrayList();
        ((ArrayList) term505396).add(term505398);
        ((ArrayList) term505396).add(term505400);
        ((ArrayList) term505396).add(term505402);
        ((ArrayList) term505396).add(term505404);
        ((ArrayList) term505396).add(term505406);
        ((ArrayList) term505396).add(term505408);
        ((ArrayList) term505396).add(term505410);
        ((ArrayList) term505396).add(term505412);
        Class<? extends Object> term507291 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term507290 = ((Class) term507291).getDeclaredField((String) "EVIL_CREATURE");
        ((Field) term507290).setAccessible(true);
        Object enum1606 = ((Field) term507290).get((Object) null);
        Class<? extends Object> term507607 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term507606 = ((Class) term507607).getDeclaredField((String) "SPACE_MONSTER");
        ((Field) term507606).setAccessible(true);
        Object enum1607 = ((Field) term507606).get((Object) null);
        term505182 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipHull"));
        Object term505222 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term505357 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setIntField(term505182, term505182.getClass(), "index", 1476229754);
        setField(term505182, term505182.getClass(), "name", "WRabHwyEOz");
        setIntField(term505182, term505182.getClass(), "maxSlot", 286501564);
        setIntField(term505182, term505182.getClass(), "slotHull", -1175270067);
        setField(term505182, term505182.getClass(), "hullType", enum1599);
        setField(term505182, term505182.getClass(), "size", enum1600);
        setIntField(term505182, term505182.getClass(), "cost", 157082130);
        setIntField(term505182, term505182.getClass(), "metalCost", -772180404);
        setIntField(term505182, term505182.getClass(), "imageIndex", -1972172179);
        setDoubleField(term505182, term505182.getClass(), "fleetCapacity", 0.329228491476264);
        setField(term505222, term505222.getClass(), "id", "KQKXgucNwu");
        setField(term505222, term505222.getClass(), "name", "WXVAvampgb");
        setField(term505222, term505222.getClass(), "nameSingle", "oYTnZefdoa");
        setField(term505222, term505222.getClass(), "attitude", enum1601);
        setField(term505222, term505222.getClass(), "imagePath", "NURhqfzHKI");
        setField(term505222, term505222.getClass(), "bridgeId", "LnZYsJlUsQ");
        setField(term505222, term505222.getClass(), "spaceShipId", "HSusXQYBHP");
        setField(term505222, term505222.getClass(), "socialSystem", enum1602);
        setField(term505222, term505222.getClass(), "genderList", term505320);
        setField(term505222, term505222.getClass(), "speechSetId", "FLPhtvtLOq");
        setField(term505222, term505222.getClass(), "bridgeEffect", enum1605);
        setField(term505357, term505357.getClass(), "songName", "cxAGzDzZQN");
        setField(term505357, term505357.getClass(), "author", "kLSNOkINAm");
        setField(term505357, term505357.getClass(), "fileName", "zBRdYuXoYN");
        setBooleanField(term505357, term505357.getClass(), "custom", false);
        setIntField(term505357, term505357.getClass(), "fadingLimit", 2021461040);
        setField(term505222, term505222.getClass(), "diplomacyMusic", term505357);
        setField(term505222, term505222.getClass(), "traits", term505396);
        setField(term505222, term505222.getClass(), "leaderNameGenerator", enum1606);
        setField(term505222, term505222.getClass(), "description", "NqNhMkhwDY");
        setField(term505222, term505222.getClass(), "spaceRaceType", enum1607);
        setField(term505182, term505182.getClass(), "originalBuilder", term505222);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipHull");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxSlot", argTypes, term505182, args);
    }

};


