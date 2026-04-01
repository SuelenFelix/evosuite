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

public class ShipDesign_isBomberShip_136754258323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81442;

    public ShipDesign_isBomberShip_136754258323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term81700 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipHullType");
        Field term81699 = ((Class) term81700).getDeclaredField((String) "PRIVATEER");
        ((Field) term81699).setAccessible(true);
        Object enum258 = ((Field) term81699).get((Object) null);
        Class<? extends Object> term81959 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipSize");
        Field term81958 = ((Class) term81959).getDeclaredField((String) "SMALL");
        ((Field) term81958).setAccessible(true);
        Object enum259 = ((Field) term81958).get((Object) null);
        Class<? extends Object> term82216 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term82215 = ((Class) term82216).getDeclaredField((String) "LOGICAL");
        ((Field) term82215).setAccessible(true);
        Object enum260 = ((Field) term82215).get((Object) null);
        Class<? extends Object> term82504 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term82503 = ((Class) term82504).getDeclaredField((String) "PATRIARCHY");
        ((Field) term82503).setAccessible(true);
        Object enum261 = ((Field) term82503).get((Object) null);
        ArrayList term81576 = new ArrayList();
        ((ArrayList) term81576).add((Object)null);
        ((ArrayList) term81576).add((Object)null);
        ((ArrayList) term81576).add((Object)null);
        Class<? extends Object> term82776 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term82775 = ((Class) term82776).getDeclaredField((String) "ORANGE_BLUE");
        ((Field) term82775).setAccessible(true);
        Object enum262 = ((Field) term82775).get((Object) null);
        ArrayList term81601 = new ArrayList();
        ((ArrayList) term81601).add((Object)null);
        ((ArrayList) term81601).add((Object)null);
        ((ArrayList) term81601).add((Object)null);
        ((ArrayList) term81601).add((Object)null);
        ((ArrayList) term81601).add((Object)null);
        ((ArrayList) term81601).add((Object)null);
        Class<? extends Object> term83046 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term83045 = ((Class) term83046).getDeclaredField((String) "PIRATE");
        ((Field) term83045).setAccessible(true);
        Object enum263 = ((Field) term83045).get((Object) null);
        Class<? extends Object> term83341 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term83340 = ((Class) term83341).getDeclaredField((String) "SPACE_PIRATE");
        ((Field) term83340).setAccessible(true);
        Object enum264 = ((Field) term83340).get((Object) null);
        Class<? extends Object> term83614 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipComponentType");
        Field term83613 = ((Class) term83614).getDeclaredField((String) "HEART");
        ((Field) term83613).setAccessible(true);
        Object enum265 = ((Field) term83613).get((Object) null);
        Object term81625 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term81625, term81625.getClass(), "index", 141434141);
        setField(term81625, term81625.getClass(), "type", enum265);
        setIntField(term81625, term81625.getClass(), "cost", -288619829);
        setIntField(term81625, term81625.getClass(), "metalCost", -505635206);
        setField(term81625, term81625.getClass(), "name", "");
        setIntField(term81625, term81625.getClass(), "energyRequirement", 932246615);
        setIntField(term81625, term81625.getClass(), "energyResource", 261281668);
        setIntField(term81625, term81625.getClass(), "ftlSpeed", 1712273163);
        setIntField(term81625, term81625.getClass(), "speed", 234306621);
        setIntField(term81625, term81625.getClass(), "tacticSpeed", 1025525602);
        setIntField(term81625, term81625.getClass(), "scannerRange", 1669406334);
        setIntField(term81625, term81625.getClass(), "cloakDetection", -780862464);
        setIntField(term81625, term81625.getClass(), "cloaking", 2014099129);
        setIntField(term81625, term81625.getClass(), "defenseValue", -1024382698);
        setIntField(term81625, term81625.getClass(), "baySize", -168406824);
        setIntField(term81625, term81625.getClass(), "damage", 2063577636);
        setIntField(term81625, term81625.getClass(), "weaponRange", 1680632578);
        setIntField(term81625, term81625.getClass(), "initiativeBoost", 511399994);
        setIntField(term81625, term81625.getClass(), "cultureBonus", 2094923086);
        setIntField(term81625, term81625.getClass(), "creditBonus", 1532355365);
        setIntField(term81625, term81625.getClass(), "researchBonus", -156316508);
        setIntField(term81625, term81625.getClass(), "espionageBonus", -1304449497);
        setIntField(term81625, term81625.getClass(), "fleetCapacityBonus", -80320412);
        setIntField(term81625, term81625.getClass(), "hitBonus", -356797136);
        Class<? extends Object> term83886 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipComponentType");
        Field term83885 = ((Class) term83886).getDeclaredField((String) "GRAVITY_RIPPER");
        ((Field) term83885).setAccessible(true);
        Object enum266 = ((Field) term83885).get((Object) null);
        Object term81651 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term81651, term81651.getClass(), "index", -2035641970);
        setField(term81651, term81651.getClass(), "type", enum266);
        setIntField(term81651, term81651.getClass(), "cost", 1813581230);
        setIntField(term81651, term81651.getClass(), "metalCost", 844569461);
        setField(term81651, term81651.getClass(), "name", "");
        setIntField(term81651, term81651.getClass(), "energyRequirement", -15085966);
        setIntField(term81651, term81651.getClass(), "energyResource", -1929631412);
        setIntField(term81651, term81651.getClass(), "ftlSpeed", 1014160441);
        setIntField(term81651, term81651.getClass(), "speed", 975753484);
        setIntField(term81651, term81651.getClass(), "tacticSpeed", -1886360357);
        setIntField(term81651, term81651.getClass(), "scannerRange", -235867268);
        setIntField(term81651, term81651.getClass(), "cloakDetection", -972330704);
        setIntField(term81651, term81651.getClass(), "cloaking", 134173297);
        setIntField(term81651, term81651.getClass(), "defenseValue", 2025698852);
        setIntField(term81651, term81651.getClass(), "baySize", 113961338);
        setIntField(term81651, term81651.getClass(), "damage", 1869277085);
        setIntField(term81651, term81651.getClass(), "weaponRange", 498801287);
        setIntField(term81651, term81651.getClass(), "initiativeBoost", 969573395);
        setIntField(term81651, term81651.getClass(), "cultureBonus", -899109027);
        setIntField(term81651, term81651.getClass(), "creditBonus", -694297070);
        setIntField(term81651, term81651.getClass(), "researchBonus", 786551253);
        setIntField(term81651, term81651.getClass(), "espionageBonus", -104779523);
        setIntField(term81651, term81651.getClass(), "fleetCapacityBonus", 749289511);
        setIntField(term81651, term81651.getClass(), "hitBonus", -414437174);
        ArrayList term81623 = new ArrayList();
        ((ArrayList) term81623).add(term81625);
        ((ArrayList) term81623).add(term81651);
        term81442 = newInstance(Class.forName("org.openRealmOfStars.player.ship.shipdesign.ShipDesign"));
        Object term81455 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipHull"));
        Object term81497 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term81595 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term81442, term81442.getClass(), "name", "sRzUJLYMmB");
        setIntField(term81455, term81455.getClass(), "index", -748022064);
        setField(term81455, term81455.getClass(), "name", "XxILklSDwz");
        setIntField(term81455, term81455.getClass(), "maxSlot", -1745708025);
        setIntField(term81455, term81455.getClass(), "slotHull", 790614624);
        setField(term81455, term81455.getClass(), "hullType", enum258);
        setField(term81455, term81455.getClass(), "size", enum259);
        setIntField(term81455, term81455.getClass(), "cost", 117387225);
        setIntField(term81455, term81455.getClass(), "metalCost", 948347134);
        setIntField(term81455, term81455.getClass(), "imageIndex", -1552842218);
        setDoubleField(term81455, term81455.getClass(), "fleetCapacity", 0.7633268466829064);
        setField(term81497, term81497.getClass(), "id", "TLjhFZbwKO");
        setField(term81497, term81497.getClass(), "name", "nxEbLIApFc");
        setField(term81497, term81497.getClass(), "nameSingle", "zzsdNZhejE");
        setField(term81497, term81497.getClass(), "attitude", enum260);
        setField(term81497, term81497.getClass(), "imagePath", "ILoodMZrgR");
        setField(term81497, term81497.getClass(), "bridgeId", "XQiKmsCacK");
        setField(term81497, term81497.getClass(), "spaceShipId", "cTCixEbHYT");
        setField(term81497, term81497.getClass(), "socialSystem", enum261);
        setField(term81497, term81497.getClass(), "genderList", term81576);
        setField(term81497, term81497.getClass(), "speechSetId", "bqKksqtAdT");
        setField(term81497, term81497.getClass(), "bridgeEffect", enum262);
        setField(term81595, term81595.getClass(), "songName", "");
        setField(term81595, term81595.getClass(), "author", "");
        setField(term81595, term81595.getClass(), "fileName", "");
        setBooleanField(term81595, term81595.getClass(), "custom", false);
        setIntField(term81595, term81595.getClass(), "fadingLimit", -157220068);
        setField(term81497, term81497.getClass(), "diplomacyMusic", term81595);
        setField(term81497, term81497.getClass(), "traits", term81601);
        setField(term81497, term81497.getClass(), "leaderNameGenerator", enum263);
        setField(term81497, term81497.getClass(), "description", "kbjWxMAIhY");
        setField(term81497, term81497.getClass(), "spaceRaceType", enum264);
        setField(term81455, term81455.getClass(), "originalBuilder", term81497);
        setField(term81442, term81442.getClass(), "hull", term81455);
        setField(term81442, term81442.getClass(), "components", term81623);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.shipdesign.ShipDesign");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isBomberShip", argTypes, term81442, args);
    }

};


