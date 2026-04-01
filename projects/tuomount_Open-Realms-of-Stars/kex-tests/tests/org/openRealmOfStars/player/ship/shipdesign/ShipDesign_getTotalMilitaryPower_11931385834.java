package org.openRealmOfStars.player.ship.shipdesign;

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
import static org.openRealmOfStars.player.ship.shipdesign.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;

public class ShipDesign_getTotalMilitaryPower_11931385834 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122408;

    public ShipDesign_getTotalMilitaryPower_11931385834() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term122638 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipHullType");
        Field term122637 = ((Class) term122638).getDeclaredField((String) "STARBASE");
        ((Field) term122637).setAccessible(true);
        Object enum390 = ((Field) term122637).get((Object) null);
        Class<? extends Object> term122894 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipSize");
        Field term122893 = ((Class) term122894).getDeclaredField((String) "HUGE");
        ((Field) term122893).setAccessible(true);
        Object enum391 = ((Field) term122893).get((Object) null);
        Class<? extends Object> term123148 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term123147 = ((Class) term123148).getDeclaredField((String) "MERCHANTICAL");
        ((Field) term123147).setAccessible(true);
        Object enum392 = ((Field) term123147).get((Object) null);
        Class<? extends Object> term123451 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term123450 = ((Class) term123451).getDeclaredField((String) "MATRIARCHY");
        ((Field) term123450).setAccessible(true);
        Object enum393 = ((Field) term123450).get((Object) null);
        ArrayList term122540 = new ArrayList();
        ((ArrayList) term122540).add((Object)null);
        ((ArrayList) term122540).add((Object)null);
        ((ArrayList) term122540).add((Object)null);
        ((ArrayList) term122540).add((Object)null);
        ((ArrayList) term122540).add((Object)null);
        ((ArrayList) term122540).add((Object)null);
        Class<? extends Object> term123723 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term123722 = ((Class) term123723).getDeclaredField((String) "FUNGUS");
        ((Field) term123722).setAccessible(true);
        Object enum394 = ((Field) term123722).get((Object) null);
        ArrayList term122565 = new ArrayList();
        Class<? extends Object> term123978 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term123977 = ((Class) term123978).getDeclaredField((String) "GASEOUS_CREATURE");
        ((Field) term123977).setAccessible(true);
        Object enum395 = ((Field) term123977).get((Object) null);
        Class<? extends Object> term124303 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term124302 = ((Class) term124303).getDeclaredField((String) "SPACE_PIRATE");
        ((Field) term124302).setAccessible(true);
        Object enum396 = ((Field) term124302).get((Object) null);
        Class<? extends Object> term124576 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipComponentType");
        Field term124575 = ((Class) term124576).getDeclaredField((String) "ORBITAL_BOMBS");
        ((Field) term124575).setAccessible(true);
        Object enum397 = ((Field) term124575).get((Object) null);
        Object term122589 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term122589, term122589.getClass(), "index", 96582503);
        setField(term122589, term122589.getClass(), "type", enum397);
        setIntField(term122589, term122589.getClass(), "cost", -2078044123);
        setIntField(term122589, term122589.getClass(), "metalCost", -888123997);
        setField(term122589, term122589.getClass(), "name", "");
        setIntField(term122589, term122589.getClass(), "energyRequirement", 1348905505);
        setIntField(term122589, term122589.getClass(), "energyResource", 670473947);
        setIntField(term122589, term122589.getClass(), "ftlSpeed", 24416797);
        setIntField(term122589, term122589.getClass(), "speed", 1333624993);
        setIntField(term122589, term122589.getClass(), "tacticSpeed", -1351263253);
        setIntField(term122589, term122589.getClass(), "scannerRange", -2032135607);
        setIntField(term122589, term122589.getClass(), "cloakDetection", -1160239470);
        setIntField(term122589, term122589.getClass(), "cloaking", 601515362);
        setIntField(term122589, term122589.getClass(), "defenseValue", 361169760);
        setIntField(term122589, term122589.getClass(), "baySize", 1796450668);
        setIntField(term122589, term122589.getClass(), "damage", -1052517959);
        setIntField(term122589, term122589.getClass(), "weaponRange", -646227135);
        setIntField(term122589, term122589.getClass(), "initiativeBoost", 445886422);
        setIntField(term122589, term122589.getClass(), "cultureBonus", -52982078);
        setIntField(term122589, term122589.getClass(), "creditBonus", -1176310275);
        setIntField(term122589, term122589.getClass(), "researchBonus", -992072250);
        setIntField(term122589, term122589.getClass(), "espionageBonus", -21937920);
        setIntField(term122589, term122589.getClass(), "fleetCapacityBonus", -1136589460);
        setIntField(term122589, term122589.getClass(), "hitBonus", -503938545);
        ArrayList term122587 = new ArrayList();
        ((ArrayList) term122587).add(term122589);
        term122408 = newInstance(Class.forName("org.openRealmOfStars.player.ship.shipdesign.ShipDesign"));
        Object term122421 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipHull"));
        Object term122461 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term122559 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term122408, term122408.getClass(), "name", "BuNQAVaNCe");
        setIntField(term122421, term122421.getClass(), "index", 1979972143);
        setField(term122421, term122421.getClass(), "name", "iaYiUQnOLD");
        setIntField(term122421, term122421.getClass(), "maxSlot", -1445141749);
        setIntField(term122421, term122421.getClass(), "slotHull", 231866725);
        setField(term122421, term122421.getClass(), "hullType", enum390);
        setField(term122421, term122421.getClass(), "size", enum391);
        setIntField(term122421, term122421.getClass(), "cost", 264142674);
        setIntField(term122421, term122421.getClass(), "metalCost", 318938584);
        setIntField(term122421, term122421.getClass(), "imageIndex", 804113142);
        setDoubleField(term122421, term122421.getClass(), "fleetCapacity", 0.9737083944266686);
        setField(term122461, term122461.getClass(), "id", "upnleTLVdf");
        setField(term122461, term122461.getClass(), "name", "pvjlKAnxzJ");
        setField(term122461, term122461.getClass(), "nameSingle", "ejxUBDQQKB");
        setField(term122461, term122461.getClass(), "attitude", enum392);
        setField(term122461, term122461.getClass(), "imagePath", "IbOvZLmtSE");
        setField(term122461, term122461.getClass(), "bridgeId", "AOsIglRFcp");
        setField(term122461, term122461.getClass(), "spaceShipId", "bdONLhBZoA");
        setField(term122461, term122461.getClass(), "socialSystem", enum393);
        setField(term122461, term122461.getClass(), "genderList", term122540);
        setField(term122461, term122461.getClass(), "speechSetId", "qPVeRcolUe");
        setField(term122461, term122461.getClass(), "bridgeEffect", enum394);
        setField(term122559, term122559.getClass(), "songName", "");
        setField(term122559, term122559.getClass(), "author", "");
        setField(term122559, term122559.getClass(), "fileName", "");
        setBooleanField(term122559, term122559.getClass(), "custom", true);
        setIntField(term122559, term122559.getClass(), "fadingLimit", 1426555916);
        setField(term122461, term122461.getClass(), "diplomacyMusic", term122559);
        setField(term122461, term122461.getClass(), "traits", term122565);
        setField(term122461, term122461.getClass(), "leaderNameGenerator", enum395);
        setField(term122461, term122461.getClass(), "description", "nOqmldTbXj");
        setField(term122461, term122461.getClass(), "spaceRaceType", enum396);
        setField(term122421, term122421.getClass(), "originalBuilder", term122461);
        setField(term122408, term122408.getClass(), "hull", term122421);
        setField(term122408, term122408.getClass(), "components", term122587);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.shipdesign.ShipDesign");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalMilitaryPower", argTypes, term122408, args);
    }

};


