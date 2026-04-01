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

public class ShipDesign_getFreeCargoSpace_22638793640 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143534;

    public ShipDesign_getFreeCargoSpace_22638793640() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term143791 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipHullType");
        Field term143790 = ((Class) term143791).getDeclaredField((String) "FREIGHTER");
        ((Field) term143790).setAccessible(true);
        Object enum458 = ((Field) term143790).get((Object) null);
        Class<? extends Object> term144050 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipSize");
        Field term144049 = ((Class) term144050).getDeclaredField((String) "HUGE");
        ((Field) term144049).setAccessible(true);
        Object enum459 = ((Field) term144049).get((Object) null);
        Class<? extends Object> term144304 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term144303 = ((Class) term144304).getDeclaredField((String) "BACKSTABBING");
        ((Field) term144303).setAccessible(true);
        Object enum460 = ((Field) term144303).get((Object) null);
        Class<? extends Object> term144607 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term144606 = ((Class) term144607).getDeclaredField((String) "EQUAL");
        ((Field) term144606).setAccessible(true);
        Object enum461 = ((Field) term144606).get((Object) null);
        ArrayList term143667 = new ArrayList();
        ((ArrayList) term143667).add((Object)null);
        ((ArrayList) term143667).add((Object)null);
        ((ArrayList) term143667).add((Object)null);
        ((ArrayList) term143667).add((Object)null);
        Class<? extends Object> term144864 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term144863 = ((Class) term144864).getDeclaredField((String) "ORANGE_BLUE");
        ((Field) term144863).setAccessible(true);
        Object enum462 = ((Field) term144863).get((Object) null);
        ArrayList term143692 = new ArrayList();
        ((ArrayList) term143692).add((Object)null);
        ((ArrayList) term143692).add((Object)null);
        ((ArrayList) term143692).add((Object)null);
        ((ArrayList) term143692).add((Object)null);
        Class<? extends Object> term145134 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term145133 = ((Class) term145134).getDeclaredField((String) "LONG_NAMES");
        ((Field) term145133).setAccessible(true);
        Object enum463 = ((Field) term145133).get((Object) null);
        Class<? extends Object> term145441 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term145440 = ((Class) term145441).getDeclaredField((String) "SPACE_PIRATE");
        ((Field) term145440).setAccessible(true);
        Object enum464 = ((Field) term145440).get((Object) null);
        Class<? extends Object> term145714 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipComponentType");
        Field term145713 = ((Class) term145714).getDeclaredField((String) "PRIVATEERING_MODULE");
        ((Field) term145713).setAccessible(true);
        Object enum465 = ((Field) term145713).get((Object) null);
        Object term143716 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term143716, term143716.getClass(), "index", -1728872282);
        setField(term143716, term143716.getClass(), "type", enum465);
        setIntField(term143716, term143716.getClass(), "cost", -537646987);
        setIntField(term143716, term143716.getClass(), "metalCost", -558527010);
        setField(term143716, term143716.getClass(), "name", "");
        setIntField(term143716, term143716.getClass(), "energyRequirement", -271207664);
        setIntField(term143716, term143716.getClass(), "energyResource", -1452529928);
        setIntField(term143716, term143716.getClass(), "ftlSpeed", -467618426);
        setIntField(term143716, term143716.getClass(), "speed", 1728446971);
        setIntField(term143716, term143716.getClass(), "tacticSpeed", 871757481);
        setIntField(term143716, term143716.getClass(), "scannerRange", -866223414);
        setIntField(term143716, term143716.getClass(), "cloakDetection", -914821646);
        setIntField(term143716, term143716.getClass(), "cloaking", -1420229744);
        setIntField(term143716, term143716.getClass(), "defenseValue", -2026011046);
        setIntField(term143716, term143716.getClass(), "baySize", -930966430);
        setIntField(term143716, term143716.getClass(), "damage", -1137340653);
        setIntField(term143716, term143716.getClass(), "weaponRange", -520048649);
        setIntField(term143716, term143716.getClass(), "initiativeBoost", -39379486);
        setIntField(term143716, term143716.getClass(), "cultureBonus", 92637602);
        setIntField(term143716, term143716.getClass(), "creditBonus", -702644184);
        setIntField(term143716, term143716.getClass(), "researchBonus", 873158899);
        setIntField(term143716, term143716.getClass(), "espionageBonus", -939494687);
        setIntField(term143716, term143716.getClass(), "fleetCapacityBonus", 1818886574);
        setIntField(term143716, term143716.getClass(), "hitBonus", -1082194143);
        Class<? extends Object> term146028 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipComponentType");
        Field term146027 = ((Class) term146028).getDeclaredField((String) "SHADOW_SHIELD");
        ((Field) term146027).setAccessible(true);
        Object enum466 = ((Field) term146027).get((Object) null);
        Object term143742 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term143742, term143742.getClass(), "index", 1109687027);
        setField(term143742, term143742.getClass(), "type", enum466);
        setIntField(term143742, term143742.getClass(), "cost", -1583077425);
        setIntField(term143742, term143742.getClass(), "metalCost", -1058283823);
        setField(term143742, term143742.getClass(), "name", "");
        setIntField(term143742, term143742.getClass(), "energyRequirement", -1620576583);
        setIntField(term143742, term143742.getClass(), "energyResource", -1365748841);
        setIntField(term143742, term143742.getClass(), "ftlSpeed", 1223391792);
        setIntField(term143742, term143742.getClass(), "speed", -1134943583);
        setIntField(term143742, term143742.getClass(), "tacticSpeed", -694277686);
        setIntField(term143742, term143742.getClass(), "scannerRange", -2044994445);
        setIntField(term143742, term143742.getClass(), "cloakDetection", -883941371);
        setIntField(term143742, term143742.getClass(), "cloaking", -1545047968);
        setIntField(term143742, term143742.getClass(), "defenseValue", 665116636);
        setIntField(term143742, term143742.getClass(), "baySize", 1255353874);
        setIntField(term143742, term143742.getClass(), "damage", 550111365);
        setIntField(term143742, term143742.getClass(), "weaponRange", 1756090789);
        setIntField(term143742, term143742.getClass(), "initiativeBoost", -315044098);
        setIntField(term143742, term143742.getClass(), "cultureBonus", 2920253);
        setIntField(term143742, term143742.getClass(), "creditBonus", 310113293);
        setIntField(term143742, term143742.getClass(), "researchBonus", -1668505285);
        setIntField(term143742, term143742.getClass(), "espionageBonus", 9043673);
        setIntField(term143742, term143742.getClass(), "fleetCapacityBonus", 2059842684);
        setIntField(term143742, term143742.getClass(), "hitBonus", 578623316);
        ArrayList term143714 = new ArrayList();
        ((ArrayList) term143714).add(term143716);
        ((ArrayList) term143714).add(term143742);
        term143534 = newInstance(Class.forName("org.openRealmOfStars.player.ship.shipdesign.ShipDesign"));
        Object term143547 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipHull"));
        Object term143588 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term143686 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term143534, term143534.getClass(), "name", "BvcBilSFZf");
        setIntField(term143547, term143547.getClass(), "index", -7331803);
        setField(term143547, term143547.getClass(), "name", "ppUmoMssug");
        setIntField(term143547, term143547.getClass(), "maxSlot", 1725012686);
        setIntField(term143547, term143547.getClass(), "slotHull", -309653587);
        setField(term143547, term143547.getClass(), "hullType", enum458);
        setField(term143547, term143547.getClass(), "size", enum459);
        setIntField(term143547, term143547.getClass(), "cost", 1988824012);
        setIntField(term143547, term143547.getClass(), "metalCost", 365061041);
        setIntField(term143547, term143547.getClass(), "imageIndex", 205907008);
        setDoubleField(term143547, term143547.getClass(), "fleetCapacity", 0.22651340641904605);
        setField(term143588, term143588.getClass(), "id", "FcponInvBb");
        setField(term143588, term143588.getClass(), "name", "IFOOxmFxbX");
        setField(term143588, term143588.getClass(), "nameSingle", "aDEuPKrSZt");
        setField(term143588, term143588.getClass(), "attitude", enum460);
        setField(term143588, term143588.getClass(), "imagePath", "aDhkmoCCUK");
        setField(term143588, term143588.getClass(), "bridgeId", "ibnuoVVkVm");
        setField(term143588, term143588.getClass(), "spaceShipId", "mXVgkxjTjD");
        setField(term143588, term143588.getClass(), "socialSystem", enum461);
        setField(term143588, term143588.getClass(), "genderList", term143667);
        setField(term143588, term143588.getClass(), "speechSetId", "qodBmKUkev");
        setField(term143588, term143588.getClass(), "bridgeEffect", enum462);
        setField(term143686, term143686.getClass(), "songName", "");
        setField(term143686, term143686.getClass(), "author", "");
        setField(term143686, term143686.getClass(), "fileName", "");
        setBooleanField(term143686, term143686.getClass(), "custom", true);
        setIntField(term143686, term143686.getClass(), "fadingLimit", -1281782269);
        setField(term143588, term143588.getClass(), "diplomacyMusic", term143686);
        setField(term143588, term143588.getClass(), "traits", term143692);
        setField(term143588, term143588.getClass(), "leaderNameGenerator", enum463);
        setField(term143588, term143588.getClass(), "description", "YZNLZnNFNI");
        setField(term143588, term143588.getClass(), "spaceRaceType", enum464);
        setField(term143547, term143547.getClass(), "originalBuilder", term143588);
        setField(term143534, term143534.getClass(), "hull", term143547);
        setField(term143534, term143534.getClass(), "components", term143714);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.shipdesign.ShipDesign");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFreeCargoSpace", argTypes, term143534, args);
    }

};


