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

public class ShipHull_toString_14802390718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term529067;

    public ShipHull_toString_14802390718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term529348 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipHullType");
        Field term529347 = ((Class) term529348).getDeclaredField((String) "NORMAL");
        ((Field) term529347).setAccessible(true);
        Object enum1679 = ((Field) term529347).get((Object) null);
        Class<? extends Object> term529598 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipSize");
        Field term529597 = ((Class) term529598).getDeclaredField((String) "MINOR");
        ((Field) term529597).setAccessible(true);
        Object enum1680 = ((Field) term529597).get((Object) null);
        Class<? extends Object> term529855 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term529854 = ((Class) term529855).getDeclaredField((String) "DIPLOMATIC");
        ((Field) term529854).setAccessible(true);
        Object enum1681 = ((Field) term529854).get((Object) null);
        Class<? extends Object> term530152 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term530151 = ((Class) term530152).getDeclaredField((String) "MATRIARCHY");
        ((Field) term530151).setAccessible(true);
        Object enum1682 = ((Field) term530151).get((Object) null);
        Class<? extends Object> term530414 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term530413 = ((Class) term530414).getDeclaredField((String) "MALE");
        ((Field) term530413).setAccessible(true);
        Object enum1683 =  ((Field) term530413).get((Object) null);
        Class<? extends Object> term530638 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term530637 = ((Class) term530638).getDeclaredField((String) "FEMALE");
        ((Field) term530637).setAccessible(true);
        Object enum1684 =  ((Field) term530637).get((Object) null);
        Class<? extends Object> term530868 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term530867 = ((Class) term530868).getDeclaredField((String) "FEMALE");
        ((Field) term530867).setAccessible(true);
        Object enum1685 =  ((Field) term530867).get((Object) null);
        ArrayList term529207 = new ArrayList();
        ((ArrayList) term529207).add(enum1683);
        ((ArrayList) term529207).add(enum1684);
        ((ArrayList) term529207).add(enum1684);
        ((ArrayList) term529207).add(enum1684);
        ((ArrayList) term529207).add(enum1685);
        ((ArrayList) term529207).add(enum1683);
        ((ArrayList) term529207).add(enum1683);
        ((ArrayList) term529207).add(enum1683);
        Class<? extends Object> term531108 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term531107 = ((Class) term531108).getDeclaredField((String) "BRIGHT_CYAN");
        ((Field) term531107).setAccessible(true);
        Object enum1686 = ((Field) term531107).get((Object) null);
        ArrayList term529286 = new ArrayList();
        Class<? extends Object> term531408 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term531407 = ((Class) term531408).getDeclaredField((String) "DEEP_ANCIENT_MONSTER");
        ((Field) term531407).setAccessible(true);
        Object enum1687 = ((Field) term531407).get((Object) null);
        Class<? extends Object> term531745 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term531744 = ((Class) term531745).getDeclaredField((String) "REGULAR");
        ((Field) term531744).setAccessible(true);
        Object enum1688 = ((Field) term531744).get((Object) null);
        term529067 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipHull"));
        Object term529106 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term529247 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setIntField(term529067, term529067.getClass(), "index", -640616441);
        setField(term529067, term529067.getClass(), "name", "HazapXoNId");
        setIntField(term529067, term529067.getClass(), "maxSlot", 209081740);
        setIntField(term529067, term529067.getClass(), "slotHull", -845599480);
        setField(term529067, term529067.getClass(), "hullType", enum1679);
        setField(term529067, term529067.getClass(), "size", enum1680);
        setIntField(term529067, term529067.getClass(), "cost", -997394743);
        setIntField(term529067, term529067.getClass(), "metalCost", -2121530653);
        setIntField(term529067, term529067.getClass(), "imageIndex", 1319282638);
        setDoubleField(term529067, term529067.getClass(), "fleetCapacity", 0.5862272565267508);
        setField(term529106, term529106.getClass(), "id", "ERhwSOTVzn");
        setField(term529106, term529106.getClass(), "name", "SrVsELySVP");
        setField(term529106, term529106.getClass(), "nameSingle", "kRChHgWzWK");
        setField(term529106, term529106.getClass(), "attitude", enum1681);
        setField(term529106, term529106.getClass(), "imagePath", "YwWtbYwjco");
        setField(term529106, term529106.getClass(), "bridgeId", "taSDkxxipF");
        setField(term529106, term529106.getClass(), "spaceShipId", "xzyquOPahp");
        setField(term529106, term529106.getClass(), "socialSystem", enum1682);
        setField(term529106, term529106.getClass(), "genderList", term529207);
        setField(term529106, term529106.getClass(), "speechSetId", "fEistPaGxy");
        setField(term529106, term529106.getClass(), "bridgeEffect", enum1686);
        setField(term529247, term529247.getClass(), "songName", "nblUmIwMZt");
        setField(term529247, term529247.getClass(), "author", "jrbsNrloog");
        setField(term529247, term529247.getClass(), "fileName", "HgvnIvqOcq");
        setBooleanField(term529247, term529247.getClass(), "custom", true);
        setIntField(term529247, term529247.getClass(), "fadingLimit", -949477062);
        setField(term529106, term529106.getClass(), "diplomacyMusic", term529247);
        setField(term529106, term529106.getClass(), "traits", term529286);
        setField(term529106, term529106.getClass(), "leaderNameGenerator", enum1687);
        setField(term529106, term529106.getClass(), "description", "zaYpkkfbRP");
        setField(term529106, term529106.getClass(), "spaceRaceType", enum1688);
        setField(term529067, term529067.getClass(), "originalBuilder", term529106);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipHull");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term529067, args);
    }

};


