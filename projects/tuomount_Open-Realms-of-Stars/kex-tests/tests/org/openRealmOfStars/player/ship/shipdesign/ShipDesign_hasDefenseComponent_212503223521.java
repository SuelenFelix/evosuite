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

public class ShipDesign_hasDefenseComponent_212503223521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74943;

    public ShipDesign_hasDefenseComponent_212503223521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term75171 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipHullType");
        Field term75170 = ((Class) term75171).getDeclaredField((String) "NORMAL");
        ((Field) term75170).setAccessible(true);
        Object enum237 = ((Field) term75170).get((Object) null);
        Class<? extends Object> term75421 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipSize");
        Field term75420 = ((Class) term75421).getDeclaredField((String) "HUGE");
        ((Field) term75420).setAccessible(true);
        Object enum238 = ((Field) term75420).get((Object) null);
        Class<? extends Object> term75675 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term75674 = ((Class) term75675).getDeclaredField((String) "DIPLOMATIC");
        ((Field) term75674).setAccessible(true);
        Object enum239 = ((Field) term75674).get((Object) null);
        Class<? extends Object> term75972 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term75971 = ((Class) term75972).getDeclaredField((String) "MATRIARCHY");
        ((Field) term75971).setAccessible(true);
        Object enum240 = ((Field) term75971).get((Object) null);
        ArrayList term75073 = new ArrayList();
        ((ArrayList) term75073).add((Object)null);
        ((ArrayList) term75073).add((Object)null);
        ((ArrayList) term75073).add((Object)null);
        ((ArrayList) term75073).add((Object)null);
        ((ArrayList) term75073).add((Object)null);
        Class<? extends Object> term76244 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term76243 = ((Class) term76244).getDeclaredField((String) "FADE_IN");
        ((Field) term76243).setAccessible(true);
        Object enum241 = ((Field) term76243).get((Object) null);
        ArrayList term75098 = new ArrayList();
        ((ArrayList) term75098).add((Object)null);
        ((ArrayList) term75098).add((Object)null);
        ((ArrayList) term75098).add((Object)null);
        ((ArrayList) term75098).add((Object)null);
        ((ArrayList) term75098).add((Object)null);
        Class<? extends Object> term76502 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term76501 = ((Class) term76502).getDeclaredField((String) "EVIL_CREATURE");
        ((Field) term76501).setAccessible(true);
        Object enum242 = ((Field) term76501).get((Object) null);
        Class<? extends Object> term76818 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term76817 = ((Class) term76818).getDeclaredField((String) "SPACE_PIRATE");
        ((Field) term76817).setAccessible(true);
        Object enum243 = ((Field) term76817).get((Object) null);
        Class<? extends Object> term77091 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipComponentType");
        Field term77090 = ((Class) term77091).getDeclaredField((String) "TRACTOR_BEAM");
        ((Field) term77090).setAccessible(true);
        Object enum244 = ((Field) term77090).get((Object) null);
        Object term75122 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term75122, term75122.getClass(), "index", 1364414277);
        setField(term75122, term75122.getClass(), "type", enum244);
        setIntField(term75122, term75122.getClass(), "cost", -961137606);
        setIntField(term75122, term75122.getClass(), "metalCost", 795205527);
        setField(term75122, term75122.getClass(), "name", "");
        setIntField(term75122, term75122.getClass(), "energyRequirement", 600958607);
        setIntField(term75122, term75122.getClass(), "energyResource", 897159778);
        setIntField(term75122, term75122.getClass(), "ftlSpeed", -1934934961);
        setIntField(term75122, term75122.getClass(), "speed", 2120054887);
        setIntField(term75122, term75122.getClass(), "tacticSpeed", 2145648967);
        setIntField(term75122, term75122.getClass(), "scannerRange", 2060624021);
        setIntField(term75122, term75122.getClass(), "cloakDetection", -1853309523);
        setIntField(term75122, term75122.getClass(), "cloaking", 241741655);
        setIntField(term75122, term75122.getClass(), "defenseValue", -1062022366);
        setIntField(term75122, term75122.getClass(), "baySize", -1347618079);
        setIntField(term75122, term75122.getClass(), "damage", 1510246255);
        setIntField(term75122, term75122.getClass(), "weaponRange", -515631808);
        setIntField(term75122, term75122.getClass(), "initiativeBoost", 1546701347);
        setIntField(term75122, term75122.getClass(), "cultureBonus", -111931851);
        setIntField(term75122, term75122.getClass(), "creditBonus", -251696516);
        setIntField(term75122, term75122.getClass(), "researchBonus", 1075321384);
        setIntField(term75122, term75122.getClass(), "espionageBonus", -1726073541);
        setIntField(term75122, term75122.getClass(), "fleetCapacityBonus", 406945977);
        setIntField(term75122, term75122.getClass(), "hitBonus", 493657684);
        ArrayList term75120 = new ArrayList();
        ((ArrayList) term75120).add(term75122);
        term74943 = newInstance(Class.forName("org.openRealmOfStars.player.ship.shipdesign.ShipDesign"));
        Object term74956 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipHull"));
        Object term74994 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term75092 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term74943, term74943.getClass(), "name", "FiqETbKjpv");
        setIntField(term74956, term74956.getClass(), "index", 4086209);
        setField(term74956, term74956.getClass(), "name", "FxXtdhhXyS");
        setIntField(term74956, term74956.getClass(), "maxSlot", 300964556);
        setIntField(term74956, term74956.getClass(), "slotHull", -958207893);
        setField(term74956, term74956.getClass(), "hullType", enum237);
        setField(term74956, term74956.getClass(), "size", enum238);
        setIntField(term74956, term74956.getClass(), "cost", 674390543);
        setIntField(term74956, term74956.getClass(), "metalCost", 1472100258);
        setIntField(term74956, term74956.getClass(), "imageIndex", 12681987);
        setDoubleField(term74956, term74956.getClass(), "fleetCapacity", 0.8598297828918529);
        setField(term74994, term74994.getClass(), "id", "HxCEzaCcgj");
        setField(term74994, term74994.getClass(), "name", "PDYPOQncAB");
        setField(term74994, term74994.getClass(), "nameSingle", "cHqLMqZSmc");
        setField(term74994, term74994.getClass(), "attitude", enum239);
        setField(term74994, term74994.getClass(), "imagePath", "hkWmAkXSOW");
        setField(term74994, term74994.getClass(), "bridgeId", "DwQmZEKeOp");
        setField(term74994, term74994.getClass(), "spaceShipId", "DbxrFiyttv");
        setField(term74994, term74994.getClass(), "socialSystem", enum240);
        setField(term74994, term74994.getClass(), "genderList", term75073);
        setField(term74994, term74994.getClass(), "speechSetId", "iVIrSxTsaM");
        setField(term74994, term74994.getClass(), "bridgeEffect", enum241);
        setField(term75092, term75092.getClass(), "songName", "");
        setField(term75092, term75092.getClass(), "author", "");
        setField(term75092, term75092.getClass(), "fileName", "");
        setBooleanField(term75092, term75092.getClass(), "custom", true);
        setIntField(term75092, term75092.getClass(), "fadingLimit", -1987364934);
        setField(term74994, term74994.getClass(), "diplomacyMusic", term75092);
        setField(term74994, term74994.getClass(), "traits", term75098);
        setField(term74994, term74994.getClass(), "leaderNameGenerator", enum242);
        setField(term74994, term74994.getClass(), "description", "yjqoDeLBLg");
        setField(term74994, term74994.getClass(), "spaceRaceType", enum243);
        setField(term74956, term74956.getClass(), "originalBuilder", term74994);
        setField(term74943, term74943.getClass(), "hull", term74956);
        setField(term74943, term74943.getClass(), "components", term75120);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.shipdesign.ShipDesign");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasDefenseComponent", argTypes, term74943, args);
    }

};


