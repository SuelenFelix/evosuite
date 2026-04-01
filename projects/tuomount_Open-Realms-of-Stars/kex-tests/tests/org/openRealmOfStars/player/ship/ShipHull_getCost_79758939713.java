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

public class ShipHull_getCost_79758939713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term515984;

    public ShipHull_getCost_79758939713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term516265 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipHullType");
        Field term516264 = ((Class) term516265).getDeclaredField((String) "NORMAL");
        ((Field) term516264).setAccessible(true);
        Object enum1635 = ((Field) term516264).get((Object) null);
        Class<? extends Object> term516515 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipSize");
        Field term516514 = ((Class) term516515).getDeclaredField((String) "MINOR");
        ((Field) term516514).setAccessible(true);
        Object enum1636 = ((Field) term516514).get((Object) null);
        Class<? extends Object> term516772 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term516771 = ((Class) term516772).getDeclaredField((String) "EXPANSIONIST");
        ((Field) term516771).setAccessible(true);
        Object enum1637 = ((Field) term516771).get((Object) null);
        Class<? extends Object> term517075 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term517074 = ((Class) term517075).getDeclaredField((String) "MATRIARCHY");
        ((Field) term517074).setAccessible(true);
        Object enum1638 = ((Field) term517074).get((Object) null);
        Class<? extends Object> term517337 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term517336 = ((Class) term517337).getDeclaredField((String) "NONE");
        ((Field) term517336).setAccessible(true);
        Object enum1639 =  ((Field) term517336).get((Object) null);
        ArrayList term516126 = new ArrayList();
        ((ArrayList) term516126).add(enum1639);
        ((ArrayList) term516126).add(enum1639);
        ((ArrayList) term516126).add(enum1639);
        Class<? extends Object> term517571 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term517570 = ((Class) term517571).getDeclaredField((String) "REGISTER");
        ((Field) term517570).setAccessible(true);
        Object enum1640 = ((Field) term517570).get((Object) null);
        Object term516198 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term516198, term516198.getClass(), "traitId", null);
        setField(term516198, term516198.getClass(), "traitName", null);
        setField(term516198, term516198.getClass(), "description", null);
        setField(term516198, term516198.getClass(), "group", null);
        setField(term516198, term516198.getClass(), "conflictsWithIds", null);
        setByteField(term516198, term516198.getClass(), "traitPoints", (byte) -14);
        Object term516200 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term516200, term516200.getClass(), "traitId", null);
        setField(term516200, term516200.getClass(), "traitName", null);
        setField(term516200, term516200.getClass(), "description", null);
        setField(term516200, term516200.getClass(), "group", null);
        setField(term516200, term516200.getClass(), "conflictsWithIds", null);
        setByteField(term516200, term516200.getClass(), "traitPoints", (byte) -57);
        Object term516202 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term516202, term516202.getClass(), "traitId", null);
        setField(term516202, term516202.getClass(), "traitName", null);
        setField(term516202, term516202.getClass(), "description", null);
        setField(term516202, term516202.getClass(), "group", null);
        setField(term516202, term516202.getClass(), "conflictsWithIds", null);
        setByteField(term516202, term516202.getClass(), "traitPoints", (byte) 117);
        Object term516204 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term516204, term516204.getClass(), "traitId", null);
        setField(term516204, term516204.getClass(), "traitName", null);
        setField(term516204, term516204.getClass(), "description", null);
        setField(term516204, term516204.getClass(), "group", null);
        setField(term516204, term516204.getClass(), "conflictsWithIds", null);
        setByteField(term516204, term516204.getClass(), "traitPoints", (byte) -96);
        Object term516206 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term516206, term516206.getClass(), "traitId", null);
        setField(term516206, term516206.getClass(), "traitName", null);
        setField(term516206, term516206.getClass(), "description", null);
        setField(term516206, term516206.getClass(), "group", null);
        setField(term516206, term516206.getClass(), "conflictsWithIds", null);
        setByteField(term516206, term516206.getClass(), "traitPoints", (byte) -97);
        Object term516208 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term516208, term516208.getClass(), "traitId", null);
        setField(term516208, term516208.getClass(), "traitName", null);
        setField(term516208, term516208.getClass(), "description", null);
        setField(term516208, term516208.getClass(), "group", null);
        setField(term516208, term516208.getClass(), "conflictsWithIds", null);
        setByteField(term516208, term516208.getClass(), "traitPoints", (byte) 52);
        Object term516210 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term516210, term516210.getClass(), "traitId", null);
        setField(term516210, term516210.getClass(), "traitName", null);
        setField(term516210, term516210.getClass(), "description", null);
        setField(term516210, term516210.getClass(), "group", null);
        setField(term516210, term516210.getClass(), "conflictsWithIds", null);
        setByteField(term516210, term516210.getClass(), "traitPoints", (byte) 4);
        Object term516212 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term516212, term516212.getClass(), "traitId", null);
        setField(term516212, term516212.getClass(), "traitName", null);
        setField(term516212, term516212.getClass(), "description", null);
        setField(term516212, term516212.getClass(), "group", null);
        setField(term516212, term516212.getClass(), "conflictsWithIds", null);
        setByteField(term516212, term516212.getClass(), "traitPoints", (byte) 48);
        ArrayList term516196 = new ArrayList();
        ((ArrayList) term516196).add(term516198);
        ((ArrayList) term516196).add(term516200);
        ((ArrayList) term516196).add(term516202);
        ((ArrayList) term516196).add(term516204);
        ((ArrayList) term516196).add(term516206);
        ((ArrayList) term516196).add(term516208);
        ((ArrayList) term516196).add(term516210);
        ((ArrayList) term516196).add(term516212);
        Class<? extends Object> term517862 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term517861 = ((Class) term517862).getDeclaredField((String) "SCIFI_HUMAN");
        ((Field) term517861).setAccessible(true);
        Object enum1641 = ((Field) term517861).get((Object) null);
        Class<? extends Object> term518172 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term518171 = ((Class) term518172).getDeclaredField((String) "REGULAR");
        ((Field) term518171).setAccessible(true);
        Object enum1642 = ((Field) term518171).get((Object) null);
        term515984 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipHull"));
        Object term516023 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term516157 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setIntField(term515984, term515984.getClass(), "index", -298980528);
        setField(term515984, term515984.getClass(), "name", "iZhMqQtcWR");
        setIntField(term515984, term515984.getClass(), "maxSlot", -5656680);
        setIntField(term515984, term515984.getClass(), "slotHull", 1091964304);
        setField(term515984, term515984.getClass(), "hullType", enum1635);
        setField(term515984, term515984.getClass(), "size", enum1636);
        setIntField(term515984, term515984.getClass(), "cost", -613681108);
        setIntField(term515984, term515984.getClass(), "metalCost", 1352625518);
        setIntField(term515984, term515984.getClass(), "imageIndex", 668348121);
        setDoubleField(term515984, term515984.getClass(), "fleetCapacity", 0.025396748287270232);
        setField(term516023, term516023.getClass(), "id", "WgBQHbBTuD");
        setField(term516023, term516023.getClass(), "name", "hANCldNyWz");
        setField(term516023, term516023.getClass(), "nameSingle", "YgEldiuZiB");
        setField(term516023, term516023.getClass(), "attitude", enum1637);
        setField(term516023, term516023.getClass(), "imagePath", "iJOleDJkLD");
        setField(term516023, term516023.getClass(), "bridgeId", "BmwTjEHWHB");
        setField(term516023, term516023.getClass(), "spaceShipId", "oOEmfborlo");
        setField(term516023, term516023.getClass(), "socialSystem", enum1638);
        setField(term516023, term516023.getClass(), "genderList", term516126);
        setField(term516023, term516023.getClass(), "speechSetId", "NdzcSnXjkl");
        setField(term516023, term516023.getClass(), "bridgeEffect", enum1640);
        setField(term516157, term516157.getClass(), "songName", "fkhTkrPkEw");
        setField(term516157, term516157.getClass(), "author", "lGcmobyrdD");
        setField(term516157, term516157.getClass(), "fileName", "TFExgmYITF");
        setBooleanField(term516157, term516157.getClass(), "custom", true);
        setIntField(term516157, term516157.getClass(), "fadingLimit", 430885685);
        setField(term516023, term516023.getClass(), "diplomacyMusic", term516157);
        setField(term516023, term516023.getClass(), "traits", term516196);
        setField(term516023, term516023.getClass(), "leaderNameGenerator", enum1641);
        setField(term516023, term516023.getClass(), "description", "NsZqgKfECY");
        setField(term516023, term516023.getClass(), "spaceRaceType", enum1642);
        setField(term515984, term515984.getClass(), "originalBuilder", term516023);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipHull");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCost", argTypes, term515984, args);
    }

};


