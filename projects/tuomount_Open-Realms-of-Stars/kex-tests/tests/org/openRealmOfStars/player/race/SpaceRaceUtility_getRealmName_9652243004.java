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

public class SpaceRaceUtility_getRealmName_9652243004 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term200;
     Object term448;

    public SpaceRaceUtility_getRealmName_9652243004() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term697 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term696 = ((Class) term697).getDeclaredField((String) "PEACEFUL");
        ((Field) term696).setAccessible(true);
        Object enum0 = ((Field) term696).get((Object) null);
        Class<? extends Object> term1025 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term1024 = ((Class) term1025).getDeclaredField((String) "PATRIARCHY");
        ((Field) term1024).setAccessible(true);
        Object enum1 = ((Field) term1024).get((Object) null);
        Class<? extends Object> term1316 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term1315 = ((Class) term1316).getDeclaredField((String) "NONE");
        ((Field) term1315).setAccessible(true);
        Object enum2 =  ((Field) term1315).get((Object) null);
        Class<? extends Object> term1540 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term1539 = ((Class) term1540).getDeclaredField((String) "MALE");
        ((Field) term1539).setAccessible(true);
        Object enum3 =  ((Field) term1539).get((Object) null);
        ArrayList term299 = new ArrayList();
        ((ArrayList) term299).add(enum2);
        ((ArrayList) term299).add(enum3);
        ((ArrayList) term299).add(enum2);
        ((ArrayList) term299).add(enum3);
        Class<? extends Object> term2153 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term2152 = ((Class) term2153).getDeclaredField((String) "JUNGLE");
        ((Field) term2152).setAccessible(true);
        Object enum4 = ((Field) term2152).get((Object) null);
        ArrayList term379 = new ArrayList();
        ((ArrayList) term379).add((Object)null);
        ((ArrayList) term379).add((Object)null);
        ((ArrayList) term379).add((Object)null);
        ((ArrayList) term379).add((Object)null);
        Object term374 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term374, term374.getClass(), "traitId", "");
        setField(term374, term374.getClass(), "traitName", "");
        setField(term374, term374.getClass(), "description", "");
        setField(term374, term374.getClass(), "group", "");
        setField(term374, term374.getClass(), "conflictsWithIds", term379);
        setByteField(term374, term374.getClass(), "traitPoints", (byte) 47);
        ArrayList term388 = new ArrayList();
        ((ArrayList) term388).add((Object)null);
        Object term383 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term383, term383.getClass(), "traitId", "");
        setField(term383, term383.getClass(), "traitName", "");
        setField(term383, term383.getClass(), "description", "");
        setField(term383, term383.getClass(), "group", "");
        setField(term383, term383.getClass(), "conflictsWithIds", term388);
        setByteField(term383, term383.getClass(), "traitPoints", (byte) 48);
        ArrayList term397 = new ArrayList();
        ((ArrayList) term397).add((Object)null);
        ((ArrayList) term397).add((Object)null);
        ((ArrayList) term397).add((Object)null);
        ((ArrayList) term397).add((Object)null);
        ((ArrayList) term397).add((Object)null);
        ((ArrayList) term397).add((Object)null);
        Object term392 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term392, term392.getClass(), "traitId", "");
        setField(term392, term392.getClass(), "traitName", "");
        setField(term392, term392.getClass(), "description", "");
        setField(term392, term392.getClass(), "group", "");
        setField(term392, term392.getClass(), "conflictsWithIds", term397);
        setByteField(term392, term392.getClass(), "traitPoints", (byte) 89);
        ArrayList term372 = new ArrayList();
        ((ArrayList) term372).add(term374);
        ((ArrayList) term372).add(term383);
        ((ArrayList) term372).add(term392);
        Class<? extends Object> term2705 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term2704 = ((Class) term2705).getDeclaredField((String) "EVIL_CREATURE");
        ((Field) term2704).setAccessible(true);
        Object enum5 = ((Field) term2704).get((Object) null);
        Class<? extends Object> term3065 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term3064 = ((Class) term3065).getDeclaredField((String) "SPACE_PIRATE");
        ((Field) term3064).setAccessible(true);
        Object enum6 = ((Field) term3064).get((Object) null);
        term200 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term333 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term200, term200.getClass(), "id", "RMFIsYGgne");
        setField(term200, term200.getClass(), "name", "NRdvgJlhkX");
        setField(term200, term200.getClass(), "nameSingle", "uuaPigETmJ");
        setField(term200, term200.getClass(), "attitude", enum0);
        setField(term200, term200.getClass(), "imagePath", "MxlszYVzRf");
        setField(term200, term200.getClass(), "bridgeId", "LQFpaHEwXR");
        setField(term200, term200.getClass(), "spaceShipId", "oVcInYnLWB");
        setField(term200, term200.getClass(), "socialSystem", enum1);
        setField(term200, term200.getClass(), "genderList", term299);
        setField(term200, term200.getClass(), "speechSetId", "aJlieCFVtF");
        setField(term200, term200.getClass(), "bridgeEffect", enum4);
        setField(term333, term333.getClass(), "songName", "ZiaGIbnzTs");
        setField(term333, term333.getClass(), "author", "tbcdzjIfER");
        setField(term333, term333.getClass(), "fileName", "HyxfbSQYBe");
        setBooleanField(term333, term333.getClass(), "custom", false);
        setIntField(term333, term333.getClass(), "fadingLimit", 568599855);
        setField(term200, term200.getClass(), "diplomacyMusic", term333);
        setField(term200, term200.getClass(), "traits", term372);
        setField(term200, term200.getClass(), "leaderNameGenerator", enum5);
        setField(term200, term200.getClass(), "description", "gGSMzuGICf");
        setField(term200, term200.getClass(), "spaceRaceType", enum6);
        Class<? extends Object> term3477 = Class.forName((String) "org.openRealmOfStars.player.government.RulerSelection");
        Field term3476 = ((Class) term3477).getDeclaredField((String) "CEO_AS_A_RULER");
        ((Field) term3476).setAccessible(true);
        Object enum7 = ((Field) term3476).get((Object) null);
        ArrayList term522 = new ArrayList();
        ((ArrayList) term522).add((Object)null);
        ((ArrayList) term522).add((Object)null);
        ((ArrayList) term522).add((Object)null);
        ((ArrayList) term522).add((Object)null);
        ((ArrayList) term522).add((Object)null);
        ((ArrayList) term522).add((Object)null);
        Object term517 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term517, term517.getClass(), "traitId", "");
        setField(term517, term517.getClass(), "traitName", "");
        setField(term517, term517.getClass(), "description", "");
        setField(term517, term517.getClass(), "group", "");
        setField(term517, term517.getClass(), "conflictsWithIds", term522);
        setByteField(term517, term517.getClass(), "traitPoints", (byte) 75);
        ArrayList term531 = new ArrayList();
        ((ArrayList) term531).add((Object)null);
        ((ArrayList) term531).add((Object)null);
        ((ArrayList) term531).add((Object)null);
        ((ArrayList) term531).add((Object)null);
        ((ArrayList) term531).add((Object)null);
        ((ArrayList) term531).add((Object)null);
        ((ArrayList) term531).add((Object)null);
        Object term526 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term526, term526.getClass(), "traitId", "");
        setField(term526, term526.getClass(), "traitName", "");
        setField(term526, term526.getClass(), "description", "");
        setField(term526, term526.getClass(), "group", "");
        setField(term526, term526.getClass(), "conflictsWithIds", term531);
        setByteField(term526, term526.getClass(), "traitPoints", (byte) 18);
        ArrayList term515 = new ArrayList();
        ((ArrayList) term515).add(term517);
        ((ArrayList) term515).add(term526);
        term448 = newInstance(Class.forName("org.openRealmOfStars.player.government.Government"));
        setField(term448, term448.getClass(), "id", "hxCBltsObl");
        setField(term448, term448.getClass(), "name", "BndsHwAFMv");
        setField(term448, term448.getClass(), "rulerSelection", enum7);
        setField(term448, term448.getClass(), "rulerTitleMale", "GzFkzHGYFt");
        setField(term448, term448.getClass(), "rulerTitleFemale", "tShwQLRGNe");
        setField(term448, term448.getClass(), "traits", term515);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.race.SpaceRaceUtility");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.race.SpaceRace");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.government.Government");
        Object[] args = new Object[2];
        args[0] = term200;
        args[1] = term448;
        callMethod(klass, "getRealmName", argTypes, null, args);
    }

};


