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

public class ShipHull_getRace_34760623915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term521320;

    public ShipHull_getRace_34760623915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term521582 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipHullType");
        Field term521581 = ((Class) term521582).getDeclaredField((String) "ORBITAL");
        ((Field) term521581).setAccessible(true);
        Object enum1653 = ((Field) term521581).get((Object) null);
        Class<? extends Object> term521835 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipSize");
        Field term521834 = ((Class) term521835).getDeclaredField((String) "LARGE");
        ((Field) term521834).setAccessible(true);
        Object enum1654 = ((Field) term521834).get((Object) null);
        Class<? extends Object> term522092 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term522091 = ((Class) term522092).getDeclaredField((String) "LOGICAL");
        ((Field) term522091).setAccessible(true);
        Object enum1655 = ((Field) term522091).get((Object) null);
        Class<? extends Object> term522380 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term522379 = ((Class) term522380).getDeclaredField((String) "MATRIARCHY");
        ((Field) term522379).setAccessible(true);
        Object enum1656 = ((Field) term522379).get((Object) null);
        Class<? extends Object> term522642 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term522641 = ((Class) term522642).getDeclaredField((String) "MALE");
        ((Field) term522641).setAccessible(true);
        Object enum1657 =  ((Field) term522641).get((Object) null);
        Class<? extends Object> term522866 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term522865 = ((Class) term522866).getDeclaredField((String) "MALE");
        ((Field) term522865).setAccessible(true);
        Object enum1658 =  ((Field) term522865).get((Object) null);
        Class<? extends Object> term523090 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term523089 = ((Class) term523090).getDeclaredField((String) "NONE");
        ((Field) term523089).setAccessible(true);
        Object enum1659 =  ((Field) term523089).get((Object) null);
        ArrayList term521458 = new ArrayList();
        ((ArrayList) term521458).add(enum1657);
        ((ArrayList) term521458).add(enum1658);
        ((ArrayList) term521458).add(enum1659);
        ((ArrayList) term521458).add(enum1658);
        ((ArrayList) term521458).add(enum1657);
        ((ArrayList) term521458).add(enum1658);
        ((ArrayList) term521458).add(enum1659);
        ((ArrayList) term521458).add(enum1657);
        ((ArrayList) term521458).add(enum1659);
        Class<? extends Object> term523324 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term523323 = ((Class) term523324).getDeclaredField((String) "BRIGHT_CYAN");
        ((Field) term523323).setAccessible(true);
        Object enum1660 = ((Field) term523323).get((Object) null);
        ArrayList term521537 = new ArrayList();
        Class<? extends Object> term523624 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term523623 = ((Class) term523624).getDeclaredField((String) "ALL");
        ((Field) term523623).setAccessible(true);
        Object enum1661 = ((Field) term523623).get((Object) null);
        Class<? extends Object> term523910 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term523909 = ((Class) term523910).getDeclaredField((String) "REGULAR");
        ((Field) term523909).setAccessible(true);
        Object enum1662 = ((Field) term523909).get((Object) null);
        term521320 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipHull"));
        Object term521360 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term521498 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setIntField(term521320, term521320.getClass(), "index", 2145303715);
        setField(term521320, term521320.getClass(), "name", "SCPDqOiMOH");
        setIntField(term521320, term521320.getClass(), "maxSlot", -307543677);
        setIntField(term521320, term521320.getClass(), "slotHull", -2034844354);
        setField(term521320, term521320.getClass(), "hullType", enum1653);
        setField(term521320, term521320.getClass(), "size", enum1654);
        setIntField(term521320, term521320.getClass(), "cost", 1068979901);
        setIntField(term521320, term521320.getClass(), "metalCost", 2060073727);
        setIntField(term521320, term521320.getClass(), "imageIndex", -1770044035);
        setDoubleField(term521320, term521320.getClass(), "fleetCapacity", 0.3142783864669928);
        setField(term521360, term521360.getClass(), "id", "ZsOhwsLqsz");
        setField(term521360, term521360.getClass(), "name", "QvvuikDCBY");
        setField(term521360, term521360.getClass(), "nameSingle", "lUGEEUfnbz");
        setField(term521360, term521360.getClass(), "attitude", enum1655);
        setField(term521360, term521360.getClass(), "imagePath", "VXgiKvMoSE");
        setField(term521360, term521360.getClass(), "bridgeId", "DNozFODZvK");
        setField(term521360, term521360.getClass(), "spaceShipId", "KOXamjIQuv");
        setField(term521360, term521360.getClass(), "socialSystem", enum1656);
        setField(term521360, term521360.getClass(), "genderList", term521458);
        setField(term521360, term521360.getClass(), "speechSetId", "tJhtGgdRFR");
        setField(term521360, term521360.getClass(), "bridgeEffect", enum1660);
        setField(term521498, term521498.getClass(), "songName", "jyMMsjYUTG");
        setField(term521498, term521498.getClass(), "author", "AvIoUKtZBL");
        setField(term521498, term521498.getClass(), "fileName", "YIwjuHHTbl");
        setBooleanField(term521498, term521498.getClass(), "custom", true);
        setIntField(term521498, term521498.getClass(), "fadingLimit", -2104780176);
        setField(term521360, term521360.getClass(), "diplomacyMusic", term521498);
        setField(term521360, term521360.getClass(), "traits", term521537);
        setField(term521360, term521360.getClass(), "leaderNameGenerator", enum1661);
        setField(term521360, term521360.getClass(), "description", "gzugwoEXDr");
        setField(term521360, term521360.getClass(), "spaceRaceType", enum1662);
        setField(term521320, term521320.getClass(), "originalBuilder", term521360);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipHull");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRace", argTypes, term521320, args);
    }

};


