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
import java.lang.Integer;

public class ShipHull_setImageIndex_12436810251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term485072;
     Object term485352;

    public ShipHull_setImageIndex_12436810251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term485365 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipHullType");
        Field term485364 = ((Class) term485365).getDeclaredField((String) "STARBASE");
        ((Field) term485364).setAccessible(true);
        Object enum1533 = ((Field) term485364).get((Object) null);
        Class<? extends Object> term485621 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipSize");
        Field term485620 = ((Class) term485621).getDeclaredField((String) "LARGE");
        ((Field) term485620).setAccessible(true);
        Object enum1534 = ((Field) term485620).get((Object) null);
        Class<? extends Object> term485878 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term485877 = ((Class) term485878).getDeclaredField((String) "EXPANSIONIST");
        ((Field) term485877).setAccessible(true);
        Object enum1535 = ((Field) term485877).get((Object) null);
        Class<? extends Object> term486181 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term486180 = ((Class) term486181).getDeclaredField((String) "PATRIARCHY");
        ((Field) term486180).setAccessible(true);
        Object enum1536 = ((Field) term486180).get((Object) null);
        Class<? extends Object> term486443 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term486442 = ((Class) term486443).getDeclaredField((String) "MALE");
        ((Field) term486442).setAccessible(true);
        Object enum1537 =  ((Field) term486442).get((Object) null);
        ArrayList term485216 = new ArrayList();
        ((ArrayList) term485216).add(enum1537);
        Class<? extends Object> term486677 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term486676 = ((Class) term486677).getDeclaredField((String) "PURPLE_DREAM");
        ((Field) term486676).setAccessible(true);
        Object enum1538 = ((Field) term486676).get((Object) null);
        Object term485292 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term485292, term485292.getClass(), "traitId", null);
        setField(term485292, term485292.getClass(), "traitName", null);
        setField(term485292, term485292.getClass(), "description", null);
        setField(term485292, term485292.getClass(), "group", null);
        setField(term485292, term485292.getClass(), "conflictsWithIds", null);
        setByteField(term485292, term485292.getClass(), "traitPoints", (byte) -7);
        Object term485294 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term485294, term485294.getClass(), "traitId", null);
        setField(term485294, term485294.getClass(), "traitName", null);
        setField(term485294, term485294.getClass(), "description", null);
        setField(term485294, term485294.getClass(), "group", null);
        setField(term485294, term485294.getClass(), "conflictsWithIds", null);
        setByteField(term485294, term485294.getClass(), "traitPoints", (byte) 120);
        Object term485296 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term485296, term485296.getClass(), "traitId", null);
        setField(term485296, term485296.getClass(), "traitName", null);
        setField(term485296, term485296.getClass(), "description", null);
        setField(term485296, term485296.getClass(), "group", null);
        setField(term485296, term485296.getClass(), "conflictsWithIds", null);
        setByteField(term485296, term485296.getClass(), "traitPoints", (byte) 33);
        Object term485298 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term485298, term485298.getClass(), "traitId", null);
        setField(term485298, term485298.getClass(), "traitName", null);
        setField(term485298, term485298.getClass(), "description", null);
        setField(term485298, term485298.getClass(), "group", null);
        setField(term485298, term485298.getClass(), "conflictsWithIds", null);
        setByteField(term485298, term485298.getClass(), "traitPoints", (byte) -66);
        Object term485300 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term485300, term485300.getClass(), "traitId", null);
        setField(term485300, term485300.getClass(), "traitName", null);
        setField(term485300, term485300.getClass(), "description", null);
        setField(term485300, term485300.getClass(), "group", null);
        setField(term485300, term485300.getClass(), "conflictsWithIds", null);
        setByteField(term485300, term485300.getClass(), "traitPoints", (byte) 100);
        Object term485302 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term485302, term485302.getClass(), "traitId", null);
        setField(term485302, term485302.getClass(), "traitName", null);
        setField(term485302, term485302.getClass(), "description", null);
        setField(term485302, term485302.getClass(), "group", null);
        setField(term485302, term485302.getClass(), "conflictsWithIds", null);
        setByteField(term485302, term485302.getClass(), "traitPoints", (byte) -121);
        Object term485304 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term485304, term485304.getClass(), "traitId", null);
        setField(term485304, term485304.getClass(), "traitName", null);
        setField(term485304, term485304.getClass(), "description", null);
        setField(term485304, term485304.getClass(), "group", null);
        setField(term485304, term485304.getClass(), "conflictsWithIds", null);
        setByteField(term485304, term485304.getClass(), "traitPoints", (byte) 115);
        Object term485306 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term485306, term485306.getClass(), "traitId", null);
        setField(term485306, term485306.getClass(), "traitName", null);
        setField(term485306, term485306.getClass(), "description", null);
        setField(term485306, term485306.getClass(), "group", null);
        setField(term485306, term485306.getClass(), "conflictsWithIds", null);
        setByteField(term485306, term485306.getClass(), "traitPoints", (byte) -30);
        Object term485308 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term485308, term485308.getClass(), "traitId", null);
        setField(term485308, term485308.getClass(), "traitName", null);
        setField(term485308, term485308.getClass(), "description", null);
        setField(term485308, term485308.getClass(), "group", null);
        setField(term485308, term485308.getClass(), "conflictsWithIds", null);
        setByteField(term485308, term485308.getClass(), "traitPoints", (byte) -27);
        ArrayList term485290 = new ArrayList();
        ((ArrayList) term485290).add(term485292);
        ((ArrayList) term485290).add(term485294);
        ((ArrayList) term485290).add(term485296);
        ((ArrayList) term485290).add(term485298);
        ((ArrayList) term485290).add(term485300);
        ((ArrayList) term485290).add(term485302);
        ((ArrayList) term485290).add(term485304);
        ((ArrayList) term485290).add(term485306);
        ((ArrayList) term485290).add(term485308);
        Class<? extends Object> term486980 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term486979 = ((Class) term486980).getDeclaredField((String) "MUSHROOM");
        ((Field) term486979).setAccessible(true);
        Object enum1539 = ((Field) term486979).get((Object) null);
        Class<? extends Object> term487281 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term487280 = ((Class) term487281).getDeclaredField((String) "SPACE_PIRATE");
        ((Field) term487280).setAccessible(true);
        Object enum1540 = ((Field) term487280).get((Object) null);
        term485072 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipHull"));
        Object term485113 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term485251 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setIntField(term485072, term485072.getClass(), "index", -1642984440);
        setField(term485072, term485072.getClass(), "name", "ZZYgsvgmuf");
        setIntField(term485072, term485072.getClass(), "maxSlot", 2122217114);
        setIntField(term485072, term485072.getClass(), "slotHull", 2099495995);
        setField(term485072, term485072.getClass(), "hullType", enum1533);
        setField(term485072, term485072.getClass(), "size", enum1534);
        setIntField(term485072, term485072.getClass(), "cost", -1203582659);
        setIntField(term485072, term485072.getClass(), "metalCost", 435281259);
        setIntField(term485072, term485072.getClass(), "imageIndex", 2040851544);
        setDoubleField(term485072, term485072.getClass(), "fleetCapacity", 0.6773553630262286);
        setField(term485113, term485113.getClass(), "id", "ngxVuADmIY");
        setField(term485113, term485113.getClass(), "name", "ssUuyeeEoq");
        setField(term485113, term485113.getClass(), "nameSingle", "pBCPwmxjLn");
        setField(term485113, term485113.getClass(), "attitude", enum1535);
        setField(term485113, term485113.getClass(), "imagePath", "vzFSOLYWWO");
        setField(term485113, term485113.getClass(), "bridgeId", "hJMNLMicvd");
        setField(term485113, term485113.getClass(), "spaceShipId", "yFWwQWfrwb");
        setField(term485113, term485113.getClass(), "socialSystem", enum1536);
        setField(term485113, term485113.getClass(), "genderList", term485216);
        setField(term485113, term485113.getClass(), "speechSetId", "rfYZjjaWWA");
        setField(term485113, term485113.getClass(), "bridgeEffect", enum1538);
        setField(term485251, term485251.getClass(), "songName", "uYAcQFqUxd");
        setField(term485251, term485251.getClass(), "author", "jVBYJmsMWY");
        setField(term485251, term485251.getClass(), "fileName", "ZAigNbKlUO");
        setBooleanField(term485251, term485251.getClass(), "custom", true);
        setIntField(term485251, term485251.getClass(), "fadingLimit", -471289728);
        setField(term485113, term485113.getClass(), "diplomacyMusic", term485251);
        setField(term485113, term485113.getClass(), "traits", term485290);
        setField(term485113, term485113.getClass(), "leaderNameGenerator", enum1539);
        setField(term485113, term485113.getClass(), "description", "LsdyjdaZPl");
        setField(term485113, term485113.getClass(), "spaceRaceType", enum1540);
        setField(term485072, term485072.getClass(), "originalBuilder", term485113);
        term485352 = new Integer(1093833463);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipHull");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term485352;
        callMethod(klass, "setImageIndex", argTypes, term485072, args);
    }

};


