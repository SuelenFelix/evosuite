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

public class ShipHull_getIndex_8586106427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term499836;

    public ShipHull_getIndex_8586106427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term500116 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipHullType");
        Field term500115 = ((Class) term500116).getDeclaredField((String) "FREIGHTER");
        ((Field) term500115).setAccessible(true);
        Object enum1581 = ((Field) term500115).get((Object) null);
        Class<? extends Object> term500375 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipSize");
        Field term500374 = ((Class) term500375).getDeclaredField((String) "MINOR");
        ((Field) term500374).setAccessible(true);
        Object enum1582 = ((Field) term500374).get((Object) null);
        Class<? extends Object> term500632 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term500631 = ((Class) term500632).getDeclaredField((String) "PEACEFUL");
        ((Field) term500631).setAccessible(true);
        Object enum1583 = ((Field) term500631).get((Object) null);
        Class<? extends Object> term500923 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term500922 = ((Class) term500923).getDeclaredField((String) "MATRIARCHY");
        ((Field) term500922).setAccessible(true);
        Object enum1584 = ((Field) term500922).get((Object) null);
        Class<? extends Object> term501185 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term501184 = ((Class) term501185).getDeclaredField((String) "MALE");
        ((Field) term501184).setAccessible(true);
        Object enum1585 =  ((Field) term501184).get((Object) null);
        ArrayList term499977 = new ArrayList();
        ((ArrayList) term499977).add(enum1585);
        ((ArrayList) term499977).add(enum1585);
        ((ArrayList) term499977).add(enum1585);
        Class<? extends Object> term501419 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term501418 = ((Class) term501419).getDeclaredField((String) "FETCH_LIGHTS");
        ((Field) term501418).setAccessible(true);
        Object enum1586 = ((Field) term501418).get((Object) null);
        Object term500053 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term500053, term500053.getClass(), "traitId", null);
        setField(term500053, term500053.getClass(), "traitName", null);
        setField(term500053, term500053.getClass(), "description", null);
        setField(term500053, term500053.getClass(), "group", null);
        setField(term500053, term500053.getClass(), "conflictsWithIds", null);
        setByteField(term500053, term500053.getClass(), "traitPoints", (byte) 92);
        Object term500055 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term500055, term500055.getClass(), "traitId", null);
        setField(term500055, term500055.getClass(), "traitName", null);
        setField(term500055, term500055.getClass(), "description", null);
        setField(term500055, term500055.getClass(), "group", null);
        setField(term500055, term500055.getClass(), "conflictsWithIds", null);
        setByteField(term500055, term500055.getClass(), "traitPoints", (byte) 47);
        Object term500057 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term500057, term500057.getClass(), "traitId", null);
        setField(term500057, term500057.getClass(), "traitName", null);
        setField(term500057, term500057.getClass(), "description", null);
        setField(term500057, term500057.getClass(), "group", null);
        setField(term500057, term500057.getClass(), "conflictsWithIds", null);
        setByteField(term500057, term500057.getClass(), "traitPoints", (byte) -46);
        Object term500059 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term500059, term500059.getClass(), "traitId", null);
        setField(term500059, term500059.getClass(), "traitName", null);
        setField(term500059, term500059.getClass(), "description", null);
        setField(term500059, term500059.getClass(), "group", null);
        setField(term500059, term500059.getClass(), "conflictsWithIds", null);
        setByteField(term500059, term500059.getClass(), "traitPoints", (byte) 97);
        Object term500061 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term500061, term500061.getClass(), "traitId", null);
        setField(term500061, term500061.getClass(), "traitName", null);
        setField(term500061, term500061.getClass(), "description", null);
        setField(term500061, term500061.getClass(), "group", null);
        setField(term500061, term500061.getClass(), "conflictsWithIds", null);
        setByteField(term500061, term500061.getClass(), "traitPoints", (byte) -109);
        ArrayList term500051 = new ArrayList();
        ((ArrayList) term500051).add(term500053);
        ((ArrayList) term500051).add(term500055);
        ((ArrayList) term500051).add(term500057);
        ((ArrayList) term500051).add(term500059);
        ((ArrayList) term500051).add(term500061);
        Class<? extends Object> term501722 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term501721 = ((Class) term501722).getDeclaredField((String) "DEEP_CREATURE");
        ((Field) term501721).setAccessible(true);
        Object enum1587 = ((Field) term501721).get((Object) null);
        Class<? extends Object> term502038 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term502037 = ((Class) term502038).getDeclaredField((String) "REGULAR");
        ((Field) term502037).setAccessible(true);
        Object enum1588 = ((Field) term502037).get((Object) null);
        term499836 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipHull"));
        Object term499878 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term500012 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setIntField(term499836, term499836.getClass(), "index", -1942467893);
        setField(term499836, term499836.getClass(), "name", "bosMmYJOnM");
        setIntField(term499836, term499836.getClass(), "maxSlot", -2091761161);
        setIntField(term499836, term499836.getClass(), "slotHull", 1574487544);
        setField(term499836, term499836.getClass(), "hullType", enum1581);
        setField(term499836, term499836.getClass(), "size", enum1582);
        setIntField(term499836, term499836.getClass(), "cost", -1423903830);
        setIntField(term499836, term499836.getClass(), "metalCost", -1232834591);
        setIntField(term499836, term499836.getClass(), "imageIndex", 2034477054);
        setDoubleField(term499836, term499836.getClass(), "fleetCapacity", 0.16734523112870836);
        setField(term499878, term499878.getClass(), "id", "KFFAbKJkIZ");
        setField(term499878, term499878.getClass(), "name", "HsBwPvBQYq");
        setField(term499878, term499878.getClass(), "nameSingle", "mbQVAHLnYZ");
        setField(term499878, term499878.getClass(), "attitude", enum1583);
        setField(term499878, term499878.getClass(), "imagePath", "gzXCSzfLRw");
        setField(term499878, term499878.getClass(), "bridgeId", "STbIzhKYbc");
        setField(term499878, term499878.getClass(), "spaceShipId", "GiNgzUhphY");
        setField(term499878, term499878.getClass(), "socialSystem", enum1584);
        setField(term499878, term499878.getClass(), "genderList", term499977);
        setField(term499878, term499878.getClass(), "speechSetId", "umZbyHuBhr");
        setField(term499878, term499878.getClass(), "bridgeEffect", enum1586);
        setField(term500012, term500012.getClass(), "songName", "tOrFBrfbWp");
        setField(term500012, term500012.getClass(), "author", "lmFPylVjXc");
        setField(term500012, term500012.getClass(), "fileName", "JWkqmdEawJ");
        setBooleanField(term500012, term500012.getClass(), "custom", false);
        setIntField(term500012, term500012.getClass(), "fadingLimit", -1805354048);
        setField(term499878, term499878.getClass(), "diplomacyMusic", term500012);
        setField(term499878, term499878.getClass(), "traits", term500051);
        setField(term499878, term499878.getClass(), "leaderNameGenerator", enum1587);
        setField(term499878, term499878.getClass(), "description", "qWPcKUbGGx");
        setField(term499878, term499878.getClass(), "spaceRaceType", enum1588);
        setField(term499836, term499836.getClass(), "originalBuilder", term499878);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipHull");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIndex", argTypes, term499836, args);
    }

};


