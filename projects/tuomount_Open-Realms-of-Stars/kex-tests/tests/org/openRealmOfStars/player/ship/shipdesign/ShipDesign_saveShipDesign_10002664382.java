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

public class ShipDesign_saveShipDesign_10002664382 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3977;
     Object term4210;

    public ShipDesign_saveShipDesign_10002664382() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4245 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipHullType");
        Field term4244 = ((Class) term4245).getDeclaredField((String) "PROBE");
        ((Field) term4244).setAccessible(true);
        Object enum10 = ((Field) term4244).get((Object) null);
        Class<? extends Object> term4492 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipSize");
        Field term4491 = ((Class) term4492).getDeclaredField((String) "LARGE");
        ((Field) term4491).setAccessible(true);
        Object enum11 = ((Field) term4491).get((Object) null);
        Class<? extends Object> term4749 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term4748 = ((Class) term4749).getDeclaredField((String) "DIPLOMATIC");
        ((Field) term4748).setAccessible(true);
        Object enum12 = ((Field) term4748).get((Object) null);
        Class<? extends Object> term5046 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term5045 = ((Class) term5046).getDeclaredField((String) "MATRIARCHY");
        ((Field) term5045).setAccessible(true);
        Object enum13 = ((Field) term5045).get((Object) null);
        ArrayList term4107 = new ArrayList();
        Class<? extends Object> term5318 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term5317 = ((Class) term5318).getDeclaredField((String) "DARK_RED");
        ((Field) term5317).setAccessible(true);
        Object enum14 = ((Field) term5317).get((Object) null);
        ArrayList term4132 = new ArrayList();
        ((ArrayList) term4132).add((Object)null);
        Class<? extends Object> term5579 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term5578 = ((Class) term5579).getDeclaredField((String) "LONG_NAMES");
        ((Field) term5578).setAccessible(true);
        Object enum15 = ((Field) term5578).get((Object) null);
        Class<? extends Object> term5886 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term5885 = ((Class) term5886).getDeclaredField((String) "REGULAR");
        ((Field) term5885).setAccessible(true);
        Object enum16 = ((Field) term5885).get((Object) null);
        Class<? extends Object> term6865 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipComponentType");
        Field term6864 = ((Class) term6865).getDeclaredField((String) "PLASMA_BEAM");
        ((Field) term6864).setAccessible(true);
        Object enum17 = ((Field) term6864).get((Object) null);
        Object term4156 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term4156, term4156.getClass(), "index", 1585847225);
        setField(term4156, term4156.getClass(), "type", enum17);
        setIntField(term4156, term4156.getClass(), "cost", 597278769);
        setIntField(term4156, term4156.getClass(), "metalCost", -1685132342);
        setField(term4156, term4156.getClass(), "name", "");
        setIntField(term4156, term4156.getClass(), "energyRequirement", -1456670397);
        setIntField(term4156, term4156.getClass(), "energyResource", 1622346318);
        setIntField(term4156, term4156.getClass(), "ftlSpeed", 1048535127);
        setIntField(term4156, term4156.getClass(), "speed", -655067527);
        setIntField(term4156, term4156.getClass(), "tacticSpeed", -6029667);
        setIntField(term4156, term4156.getClass(), "scannerRange", -2068769794);
        setIntField(term4156, term4156.getClass(), "cloakDetection", -117576464);
        setIntField(term4156, term4156.getClass(), "cloaking", -1007160944);
        setIntField(term4156, term4156.getClass(), "defenseValue", 1135664017);
        setIntField(term4156, term4156.getClass(), "baySize", 590364439);
        setIntField(term4156, term4156.getClass(), "damage", 865208305);
        setIntField(term4156, term4156.getClass(), "weaponRange", -1275173084);
        setIntField(term4156, term4156.getClass(), "initiativeBoost", -244121226);
        setIntField(term4156, term4156.getClass(), "cultureBonus", -203030934);
        setIntField(term4156, term4156.getClass(), "creditBonus", -1179120542);
        setIntField(term4156, term4156.getClass(), "researchBonus", -73683645);
        setIntField(term4156, term4156.getClass(), "espionageBonus", -226514366);
        setIntField(term4156, term4156.getClass(), "fleetCapacityBonus", 1193880199);
        setIntField(term4156, term4156.getClass(), "hitBonus", -1087774327);
        Class<? extends Object> term7155 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipComponentType");
        Field term7154 = ((Class) term7155).getDeclaredField((String) "SOLAR_ARMOR");
        ((Field) term7154).setAccessible(true);
        Object enum18 = ((Field) term7154).get((Object) null);
        Object term4182 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term4182, term4182.getClass(), "index", -1530420153);
        setField(term4182, term4182.getClass(), "type", enum18);
        setIntField(term4182, term4182.getClass(), "cost", -469968304);
        setIntField(term4182, term4182.getClass(), "metalCost", -1145578966);
        setField(term4182, term4182.getClass(), "name", "");
        setIntField(term4182, term4182.getClass(), "energyRequirement", 679763016);
        setIntField(term4182, term4182.getClass(), "energyResource", 1962444399);
        setIntField(term4182, term4182.getClass(), "ftlSpeed", 767834723);
        setIntField(term4182, term4182.getClass(), "speed", -602026508);
        setIntField(term4182, term4182.getClass(), "tacticSpeed", -157887805);
        setIntField(term4182, term4182.getClass(), "scannerRange", 1876565163);
        setIntField(term4182, term4182.getClass(), "cloakDetection", -817164822);
        setIntField(term4182, term4182.getClass(), "cloaking", -1016503459);
        setIntField(term4182, term4182.getClass(), "defenseValue", -1968847291);
        setIntField(term4182, term4182.getClass(), "baySize", 579005622);
        setIntField(term4182, term4182.getClass(), "damage", -14890619);
        setIntField(term4182, term4182.getClass(), "weaponRange", 1632125673);
        setIntField(term4182, term4182.getClass(), "initiativeBoost", 454281060);
        setIntField(term4182, term4182.getClass(), "cultureBonus", -1786399638);
        setIntField(term4182, term4182.getClass(), "creditBonus", 2055867847);
        setIntField(term4182, term4182.getClass(), "researchBonus", -1048298087);
        setIntField(term4182, term4182.getClass(), "espionageBonus", 292681826);
        setIntField(term4182, term4182.getClass(), "fleetCapacityBonus", 458147407);
        setIntField(term4182, term4182.getClass(), "hitBonus", -184153539);
        ArrayList term4154 = new ArrayList();
        ((ArrayList) term4154).add(term4156);
        ((ArrayList) term4154).add(term4182);
        term3977 = newInstance(Class.forName("org.openRealmOfStars.player.ship.shipdesign.ShipDesign"));
        Object term3990 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipHull"));
        Object term4028 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term4126 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term3977, term3977.getClass(), "name", "gGSMzuGICf");
        setIntField(term3990, term3990.getClass(), "index", -2038273078);
        setField(term3990, term3990.getClass(), "name", "hxCBltsObl");
        setIntField(term3990, term3990.getClass(), "maxSlot", 1227103734);
        setIntField(term3990, term3990.getClass(), "slotHull", -1339778481);
        setField(term3990, term3990.getClass(), "hullType", enum10);
        setField(term3990, term3990.getClass(), "size", enum11);
        setIntField(term3990, term3990.getClass(), "cost", 1725571209);
        setIntField(term3990, term3990.getClass(), "metalCost", -522618178);
        setIntField(term3990, term3990.getClass(), "imageIndex", 1134449235);
        setDoubleField(term3990, term3990.getClass(), "fleetCapacity", 0.3455959125047594);
        setField(term4028, term4028.getClass(), "id", "BndsHwAFMv");
        setField(term4028, term4028.getClass(), "name", "GzFkzHGYFt");
        setField(term4028, term4028.getClass(), "nameSingle", "tShwQLRGNe");
        setField(term4028, term4028.getClass(), "attitude", enum12);
        setField(term4028, term4028.getClass(), "imagePath", "LvtrsXUliU");
        setField(term4028, term4028.getClass(), "bridgeId", "xLbjWUgOIL");
        setField(term4028, term4028.getClass(), "spaceShipId", "jDtqGUpnZN");
        setField(term4028, term4028.getClass(), "socialSystem", enum13);
        setField(term4028, term4028.getClass(), "genderList", term4107);
        setField(term4028, term4028.getClass(), "speechSetId", "nGKItKLYNC");
        setField(term4028, term4028.getClass(), "bridgeEffect", enum14);
        setField(term4126, term4126.getClass(), "songName", "");
        setField(term4126, term4126.getClass(), "author", "");
        setField(term4126, term4126.getClass(), "fileName", "");
        setBooleanField(term4126, term4126.getClass(), "custom", false);
        setIntField(term4126, term4126.getClass(), "fadingLimit", -883034806);
        setField(term4028, term4028.getClass(), "diplomacyMusic", term4126);
        setField(term4028, term4028.getClass(), "traits", term4132);
        setField(term4028, term4028.getClass(), "leaderNameGenerator", enum15);
        setField(term4028, term4028.getClass(), "description", "ytSBIKXogI");
        setField(term4028, term4028.getClass(), "spaceRaceType", enum16);
        setField(term3990, term3990.getClass(), "originalBuilder", term4028);
        setField(term3977, term3977.getClass(), "hull", term3990);
        setField(term3977, term3977.getClass(), "components", term4154);
        term4210 = newInstance(Class.forName("java.io.DataOutputStream"));
        byte[] term4212 = (byte[]) newByteArray(7);
        byte[] term4220 = (byte[]) newByteArray(1);
        Object term4223 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term4210, term4210.getClass(), "written", 493620644);
        setByteElement(term4212, 0, (byte) 67);
        setByteElement(term4212, 1, (byte) 78);
        setByteElement(term4212, 2, (byte) 87);
        setByteElement(term4212, 3, (byte) 121);
        setByteElement(term4212, 4, (byte) -99);
        setByteElement(term4212, 5, (byte) -2);
        setByteElement(term4212, 6, (byte) -16);
        setField(term4210, term4210.getClass(), "bytearr", term4212);
        setByteElement(term4220, 0, (byte) -112);
        setField(term4210, term4210.getClass(), "writeBuffer", term4220);
        setField(term4210, term4210.getClass(), "out", null);
        setBooleanField(term4210, term4210.getClass(), "closed", false);
        setField(term4210, term4210.getClass(), "closeLock", term4223);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.shipdesign.ShipDesign");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.DataOutputStream");
        Object[] args = new Object[1];
        args[0] = term4210;
        callMethod(klass, "saveShipDesign", argTypes, term3977, args);
    }

};


