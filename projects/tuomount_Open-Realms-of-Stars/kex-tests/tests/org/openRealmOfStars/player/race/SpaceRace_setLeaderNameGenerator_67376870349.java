package org.openRealmOfStars.player.race;

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
import static org.openRealmOfStars.player.race.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class SpaceRace_setLeaderNameGenerator_67376870349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term336502;
     Object enum1047;

    public SpaceRace_setLeaderNameGenerator_67376870349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term336793 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term336792 = ((Class) term336793).getDeclaredField((String) "PEACEFUL");
        ((Field) term336792).setAccessible(true);
        Object enum1040 = ((Field) term336792).get((Object) null);
        Class<? extends Object> term337084 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term337083 = ((Class) term337084).getDeclaredField((String) "PATRIARCHY");
        ((Field) term337083).setAccessible(true);
        Object enum1041 = ((Field) term337083).get((Object) null);
        Class<? extends Object> term337346 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term337345 = ((Class) term337346).getDeclaredField((String) "MALE");
        ((Field) term337345).setAccessible(true);
        Object enum1042 =  ((Field) term337345).get((Object) null);
        Class<? extends Object> term337570 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term337569 = ((Class) term337570).getDeclaredField((String) "MALE");
        ((Field) term337569).setAccessible(true);
        Object enum1043 =  ((Field) term337569).get((Object) null);
        ArrayList term336601 = new ArrayList();
        ((ArrayList) term336601).add(enum1042);
        ((ArrayList) term336601).add(enum1043);
        ((ArrayList) term336601).add(enum1043);
        ((ArrayList) term336601).add(enum1042);
        Class<? extends Object> term337804 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term337803 = ((Class) term337804).getDeclaredField((String) "BLUEISH_WHITE");
        ((Field) term337803).setAccessible(true);
        Object enum1044 = ((Field) term337803).get((Object) null);
        ArrayList term336688 = new ArrayList();
        ((ArrayList) term336688).add((Object)null);
        ((ArrayList) term336688).add((Object)null);
        ((ArrayList) term336688).add((Object)null);
        ((ArrayList) term336688).add((Object)null);
        ((ArrayList) term336688).add((Object)null);
        ((ArrayList) term336688).add((Object)null);
        ((ArrayList) term336688).add((Object)null);
        ((ArrayList) term336688).add((Object)null);
        ((ArrayList) term336688).add((Object)null);
        Object term336683 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term336683, term336683.getClass(), "traitId", "");
        setField(term336683, term336683.getClass(), "traitName", "");
        setField(term336683, term336683.getClass(), "description", "");
        setField(term336683, term336683.getClass(), "group", "");
        setField(term336683, term336683.getClass(), "conflictsWithIds", term336688);
        setByteField(term336683, term336683.getClass(), "traitPoints", (byte) 88);
        ArrayList term336697 = new ArrayList();
        ((ArrayList) term336697).add((Object)null);
        ((ArrayList) term336697).add((Object)null);
        ((ArrayList) term336697).add((Object)null);
        ((ArrayList) term336697).add((Object)null);
        ((ArrayList) term336697).add((Object)null);
        ((ArrayList) term336697).add((Object)null);
        Object term336692 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term336692, term336692.getClass(), "traitId", "");
        setField(term336692, term336692.getClass(), "traitName", "");
        setField(term336692, term336692.getClass(), "description", "");
        setField(term336692, term336692.getClass(), "group", "");
        setField(term336692, term336692.getClass(), "conflictsWithIds", term336697);
        setByteField(term336692, term336692.getClass(), "traitPoints", (byte) -109);
        ArrayList term336706 = new ArrayList();
        Object term336701 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term336701, term336701.getClass(), "traitId", "");
        setField(term336701, term336701.getClass(), "traitName", "");
        setField(term336701, term336701.getClass(), "description", "");
        setField(term336701, term336701.getClass(), "group", "");
        setField(term336701, term336701.getClass(), "conflictsWithIds", term336706);
        setByteField(term336701, term336701.getClass(), "traitPoints", (byte) -125);
        ArrayList term336681 = new ArrayList();
        ((ArrayList) term336681).add(term336683);
        ((ArrayList) term336681).add(term336692);
        ((ArrayList) term336681).add(term336701);
        Class<? extends Object> term338110 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term338109 = ((Class) term338110).getDeclaredField((String) "ROBOT");
        ((Field) term338109).setAccessible(true);
        Object enum1045 = ((Field) term338109).get((Object) null);
        Class<? extends Object> term338402 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term338401 = ((Class) term338402).getDeclaredField((String) "REGULAR");
        ((Field) term338401).setAccessible(true);
        Object enum1046 = ((Field) term338401).get((Object) null);
        term336502 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term336642 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term336502, term336502.getClass(), "id", "hoYSPkUlUz");
        setField(term336502, term336502.getClass(), "name", "IcvbaPtHCI");
        setField(term336502, term336502.getClass(), "nameSingle", "TpLdjLzfnM");
        setField(term336502, term336502.getClass(), "attitude", enum1040);
        setField(term336502, term336502.getClass(), "imagePath", "bhoYUUtgsQ");
        setField(term336502, term336502.getClass(), "bridgeId", "XcBhxrFdvV");
        setField(term336502, term336502.getClass(), "spaceShipId", "wtDJOIcmRf");
        setField(term336502, term336502.getClass(), "socialSystem", enum1041);
        setField(term336502, term336502.getClass(), "genderList", term336601);
        setField(term336502, term336502.getClass(), "speechSetId", "BMrbKMgdYV");
        setField(term336502, term336502.getClass(), "bridgeEffect", enum1044);
        setField(term336642, term336642.getClass(), "songName", "kXDyYBqBoz");
        setField(term336642, term336642.getClass(), "author", "JhMXaownHd");
        setField(term336642, term336642.getClass(), "fileName", "iExZeOzVen");
        setBooleanField(term336642, term336642.getClass(), "custom", false);
        setIntField(term336642, term336642.getClass(), "fadingLimit", 156680957);
        setField(term336502, term336502.getClass(), "diplomacyMusic", term336642);
        setField(term336502, term336502.getClass(), "traits", term336681);
        setField(term336502, term336502.getClass(), "leaderNameGenerator", enum1045);
        setField(term336502, term336502.getClass(), "description", "BehfSbxgxB");
        setField(term336502, term336502.getClass(), "spaceRaceType", enum1046);
        Class<? extends Object> term338660 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term338659 = ((Class) term338660).getDeclaredField((String) "ANCIENT_NORDIC");
        ((Field) term338659).setAccessible(true);
        enum1047 = ((Field) term338659).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.race.SpaceRace");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.leader.NameGeneratorType");
        Object[] args = new Object[1];
        args[0] = enum1047;
        callMethod(klass, "setLeaderNameGenerator", argTypes, term336502, args);
    }

};


