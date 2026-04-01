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

public class SpaceRace_setSpaceRaceType_65850170251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term341162;
     Object enum1062;

    public SpaceRace_setSpaceRaceType_65850170251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term341431 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term341430 = ((Class) term341431).getDeclaredField((String) "BACKSTABBING");
        ((Field) term341430).setAccessible(true);
        Object enum1055 = ((Field) term341430).get((Object) null);
        Class<? extends Object> term341734 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term341733 = ((Class) term341734).getDeclaredField((String) "PATRIARCHY");
        ((Field) term341733).setAccessible(true);
        Object enum1056 = ((Field) term341733).get((Object) null);
        Class<? extends Object> term341996 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term341995 = ((Class) term341996).getDeclaredField((String) "NONE");
        ((Field) term341995).setAccessible(true);
        Object enum1057 =  ((Field) term341995).get((Object) null);
        Class<? extends Object> term342220 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term342219 = ((Class) term342220).getDeclaredField((String) "MALE");
        ((Field) term342219).setAccessible(true);
        Object enum1058 =  ((Field) term342219).get((Object) null);
        Class<? extends Object> term342444 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term342443 = ((Class) term342444).getDeclaredField((String) "MALE");
        ((Field) term342443).setAccessible(true);
        Object enum1059 =  ((Field) term342443).get((Object) null);
        ArrayList term341265 = new ArrayList();
        ((ArrayList) term341265).add(enum1057);
        ((ArrayList) term341265).add(enum1057);
        ((ArrayList) term341265).add(enum1058);
        ((ArrayList) term341265).add(enum1059);
        Class<? extends Object> term342678 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term342677 = ((Class) term342678).getDeclaredField((String) "FLOAT_IN_SPACE");
        ((Field) term342677).setAccessible(true);
        Object enum1060 = ((Field) term342677).get((Object) null);
        ArrayList term341357 = new ArrayList();
        ((ArrayList) term341357).add((Object)null);
        ((ArrayList) term341357).add((Object)null);
        ((ArrayList) term341357).add((Object)null);
        ((ArrayList) term341357).add((Object)null);
        ((ArrayList) term341357).add((Object)null);
        ((ArrayList) term341357).add((Object)null);
        Object term341352 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term341352, term341352.getClass(), "traitId", "");
        setField(term341352, term341352.getClass(), "traitName", "");
        setField(term341352, term341352.getClass(), "description", "");
        setField(term341352, term341352.getClass(), "group", "");
        setField(term341352, term341352.getClass(), "conflictsWithIds", term341357);
        setByteField(term341352, term341352.getClass(), "traitPoints", (byte) 55);
        ArrayList term341350 = new ArrayList();
        ((ArrayList) term341350).add(term341352);
        Class<? extends Object> term342987 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term342986 = ((Class) term342987).getDeclaredField((String) "DWARF");
        ((Field) term342986).setAccessible(true);
        Object enum1061 = ((Field) term342986).get((Object) null);
        Class<? extends Object> term343279 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term343278 = ((Class) term343279).getDeclaredField((String) "SPACE_PIRATE");
        ((Field) term343278).setAccessible(true);
        enum1062 = ((Field) term343278).get((Object) null);
        term341162 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term341311 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term341162, term341162.getClass(), "id", "eajfQtluiX");
        setField(term341162, term341162.getClass(), "name", "wbTCLFBQCF");
        setField(term341162, term341162.getClass(), "nameSingle", "YdrFzLJmBL");
        setField(term341162, term341162.getClass(), "attitude", enum1055);
        setField(term341162, term341162.getClass(), "imagePath", "oJxwTUrGoA");
        setField(term341162, term341162.getClass(), "bridgeId", "DZyWRMZKkh");
        setField(term341162, term341162.getClass(), "spaceShipId", "FfDRlqapMv");
        setField(term341162, term341162.getClass(), "socialSystem", enum1056);
        setField(term341162, term341162.getClass(), "genderList", term341265);
        setField(term341162, term341162.getClass(), "speechSetId", "REXiUGDUvP");
        setField(term341162, term341162.getClass(), "bridgeEffect", enum1060);
        setField(term341311, term341311.getClass(), "songName", "kxhtDyZCFj");
        setField(term341311, term341311.getClass(), "author", "ksqLSkOdPn");
        setField(term341311, term341311.getClass(), "fileName", "OjuNeqiAeo");
        setBooleanField(term341311, term341311.getClass(), "custom", false);
        setIntField(term341311, term341311.getClass(), "fadingLimit", 973270477);
        setField(term341162, term341162.getClass(), "diplomacyMusic", term341311);
        setField(term341162, term341162.getClass(), "traits", term341350);
        setField(term341162, term341162.getClass(), "leaderNameGenerator", enum1061);
        setField(term341162, term341162.getClass(), "description", "KRnwDMPCbm");
        setField(term341162, term341162.getClass(), "spaceRaceType", enum1062);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.race.SpaceRace");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.race.SpaceRaceType");
        Object[] args = new Object[1];
        args[0] = enum1062;
        callMethod(klass, "setSpaceRaceType", argTypes, term341162, args);
    }

};


