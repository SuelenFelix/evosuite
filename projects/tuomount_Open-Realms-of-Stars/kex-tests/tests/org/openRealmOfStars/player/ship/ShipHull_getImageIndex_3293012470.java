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

public class ShipHull_getImageIndex_3293012470 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term482155;

    public ShipHull_getImageIndex_3293012470() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term482442 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipHullType");
        Field term482441 = ((Class) term482442).getDeclaredField((String) "PROBE");
        ((Field) term482441).setAccessible(true);
        Object enum1523 = ((Field) term482441).get((Object) null);
        Class<? extends Object> term482689 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipSize");
        Field term482688 = ((Class) term482689).getDeclaredField((String) "SMALL");
        ((Field) term482688).setAccessible(true);
        Object enum1524 = ((Field) term482688).get((Object) null);
        Class<? extends Object> term482946 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term482945 = ((Class) term482946).getDeclaredField((String) "SCIENTIFIC");
        ((Field) term482945).setAccessible(true);
        Object enum1525 = ((Field) term482945).get((Object) null);
        Class<? extends Object> term483243 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term483242 = ((Class) term483243).getDeclaredField((String) "EQUAL");
        ((Field) term483242).setAccessible(true);
        Object enum1526 = ((Field) term483242).get((Object) null);
        Class<? extends Object> term483490 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term483489 = ((Class) term483490).getDeclaredField((String) "FEMALE");
        ((Field) term483489).setAccessible(true);
        Object enum1527 =  ((Field) term483489).get((Object) null);
        Class<? extends Object> term483720 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term483719 = ((Class) term483720).getDeclaredField((String) "FEMALE");
        ((Field) term483719).setAccessible(true);
        Object enum1528 =  ((Field) term483719).get((Object) null);
        Class<? extends Object> term483950 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term483949 = ((Class) term483950).getDeclaredField((String) "NONE");
        ((Field) term483949).setAccessible(true);
        Object enum1529 =  ((Field) term483949).get((Object) null);
        ArrayList term482289 = new ArrayList();
        ((ArrayList) term482289).add(enum1527);
        ((ArrayList) term482289).add(enum1527);
        ((ArrayList) term482289).add(enum1527);
        ((ArrayList) term482289).add(enum1528);
        ((ArrayList) term482289).add(enum1527);
        ((ArrayList) term482289).add(enum1528);
        ((ArrayList) term482289).add(enum1529);
        ((ArrayList) term482289).add(enum1529);
        Class<? extends Object> term484184 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term484183 = ((Class) term484184).getDeclaredField((String) "ORANGE_BLUE");
        ((Field) term484183).setAccessible(true);
        Object enum1530 = ((Field) term484183).get((Object) null);
        Object term482370 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term482370, term482370.getClass(), "traitId", null);
        setField(term482370, term482370.getClass(), "traitName", null);
        setField(term482370, term482370.getClass(), "description", null);
        setField(term482370, term482370.getClass(), "group", null);
        setField(term482370, term482370.getClass(), "conflictsWithIds", null);
        setByteField(term482370, term482370.getClass(), "traitPoints", (byte) 84);
        Object term482372 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term482372, term482372.getClass(), "traitId", null);
        setField(term482372, term482372.getClass(), "traitName", null);
        setField(term482372, term482372.getClass(), "description", null);
        setField(term482372, term482372.getClass(), "group", null);
        setField(term482372, term482372.getClass(), "conflictsWithIds", null);
        setByteField(term482372, term482372.getClass(), "traitPoints", (byte) -91);
        Object term482374 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term482374, term482374.getClass(), "traitId", null);
        setField(term482374, term482374.getClass(), "traitName", null);
        setField(term482374, term482374.getClass(), "description", null);
        setField(term482374, term482374.getClass(), "group", null);
        setField(term482374, term482374.getClass(), "conflictsWithIds", null);
        setByteField(term482374, term482374.getClass(), "traitPoints", (byte) 115);
        Object term482376 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term482376, term482376.getClass(), "traitId", null);
        setField(term482376, term482376.getClass(), "traitName", null);
        setField(term482376, term482376.getClass(), "description", null);
        setField(term482376, term482376.getClass(), "group", null);
        setField(term482376, term482376.getClass(), "conflictsWithIds", null);
        setByteField(term482376, term482376.getClass(), "traitPoints", (byte) -55);
        Object term482378 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term482378, term482378.getClass(), "traitId", null);
        setField(term482378, term482378.getClass(), "traitName", null);
        setField(term482378, term482378.getClass(), "description", null);
        setField(term482378, term482378.getClass(), "group", null);
        setField(term482378, term482378.getClass(), "conflictsWithIds", null);
        setByteField(term482378, term482378.getClass(), "traitPoints", (byte) -44);
        Object term482380 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term482380, term482380.getClass(), "traitId", null);
        setField(term482380, term482380.getClass(), "traitName", null);
        setField(term482380, term482380.getClass(), "description", null);
        setField(term482380, term482380.getClass(), "group", null);
        setField(term482380, term482380.getClass(), "conflictsWithIds", null);
        setByteField(term482380, term482380.getClass(), "traitPoints", (byte) 104);
        Object term482382 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term482382, term482382.getClass(), "traitId", null);
        setField(term482382, term482382.getClass(), "traitName", null);
        setField(term482382, term482382.getClass(), "description", null);
        setField(term482382, term482382.getClass(), "group", null);
        setField(term482382, term482382.getClass(), "conflictsWithIds", null);
        setByteField(term482382, term482382.getClass(), "traitPoints", (byte) 117);
        ArrayList term482368 = new ArrayList();
        ((ArrayList) term482368).add(term482370);
        ((ArrayList) term482368).add(term482372);
        ((ArrayList) term482368).add(term482374);
        ((ArrayList) term482368).add(term482376);
        ((ArrayList) term482368).add(term482378);
        ((ArrayList) term482368).add(term482380);
        ((ArrayList) term482368).add(term482382);
        Class<? extends Object> term484484 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term484483 = ((Class) term484484).getDeclaredField((String) "STONE_PEOPLE");
        ((Field) term484483).setAccessible(true);
        Object enum1531 = ((Field) term484483).get((Object) null);
        Class<? extends Object> term484797 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term484796 = ((Class) term484797).getDeclaredField((String) "SPACE_MONSTER");
        ((Field) term484796).setAccessible(true);
        Object enum1532 = ((Field) term484796).get((Object) null);
        term482155 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipHull"));
        Object term482193 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term482329 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setIntField(term482155, term482155.getClass(), "index", 943997229);
        setField(term482155, term482155.getClass(), "name", "ENibxYkprw");
        setIntField(term482155, term482155.getClass(), "maxSlot", -550430861);
        setIntField(term482155, term482155.getClass(), "slotHull", 401578910);
        setField(term482155, term482155.getClass(), "hullType", enum1523);
        setField(term482155, term482155.getClass(), "size", enum1524);
        setIntField(term482155, term482155.getClass(), "cost", 1911986107);
        setIntField(term482155, term482155.getClass(), "metalCost", -1549506145);
        setIntField(term482155, term482155.getClass(), "imageIndex", -970724016);
        setDoubleField(term482155, term482155.getClass(), "fleetCapacity", 0.5180566811475131);
        setField(term482193, term482193.getClass(), "id", "VwSaITUZrJ");
        setField(term482193, term482193.getClass(), "name", "xzNSawcumw");
        setField(term482193, term482193.getClass(), "nameSingle", "dtdyzmBjNG");
        setField(term482193, term482193.getClass(), "attitude", enum1525);
        setField(term482193, term482193.getClass(), "imagePath", "RNjghwhKMv");
        setField(term482193, term482193.getClass(), "bridgeId", "AHKPWwPudC");
        setField(term482193, term482193.getClass(), "spaceShipId", "tfHdGSpPoN");
        setField(term482193, term482193.getClass(), "socialSystem", enum1526);
        setField(term482193, term482193.getClass(), "genderList", term482289);
        setField(term482193, term482193.getClass(), "speechSetId", "iRCkgboOiY");
        setField(term482193, term482193.getClass(), "bridgeEffect", enum1530);
        setField(term482329, term482329.getClass(), "songName", "oFoQZwlVBE");
        setField(term482329, term482329.getClass(), "author", "yZCodaNzNC");
        setField(term482329, term482329.getClass(), "fileName", "TlcqCjHxcj");
        setBooleanField(term482329, term482329.getClass(), "custom", false);
        setIntField(term482329, term482329.getClass(), "fadingLimit", -854340858);
        setField(term482193, term482193.getClass(), "diplomacyMusic", term482329);
        setField(term482193, term482193.getClass(), "traits", term482368);
        setField(term482193, term482193.getClass(), "leaderNameGenerator", enum1531);
        setField(term482193, term482193.getClass(), "description", "FCcLfFnOVg");
        setField(term482193, term482193.getClass(), "spaceRaceType", enum1532);
        setField(term482155, term482155.getClass(), "originalBuilder", term482193);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipHull");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getImageIndex", argTypes, term482155, args);
    }

};


