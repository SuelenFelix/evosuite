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

public class SpaceRace_getNameSingle_447746832 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term227234;

    public SpaceRace_getNameSingle_447746832() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term227514 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term227513 = ((Class) term227514).getDeclaredField((String) "MERCHANTICAL");
        ((Field) term227513).setAccessible(true);
        Object enum688 = ((Field) term227513).get((Object) null);
        Class<? extends Object> term227817 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term227816 = ((Class) term227817).getDeclaredField((String) "MATRIARCHY");
        ((Field) term227816).setAccessible(true);
        Object enum689 = ((Field) term227816).get((Object) null);
        ArrayList term227337 = new ArrayList();
        Class<? extends Object> term228089 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term228088 = ((Class) term228089).getDeclaredField((String) "REGISTER");
        ((Field) term228088).setAccessible(true);
        Object enum690 = ((Field) term228088).get((Object) null);
        ArrayList term227411 = new ArrayList();
        ((ArrayList) term227411).add((Object)null);
        ((ArrayList) term227411).add((Object)null);
        Object term227406 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term227406, term227406.getClass(), "traitId", "");
        setField(term227406, term227406.getClass(), "traitName", "");
        setField(term227406, term227406.getClass(), "description", "");
        setField(term227406, term227406.getClass(), "group", "");
        setField(term227406, term227406.getClass(), "conflictsWithIds", term227411);
        setByteField(term227406, term227406.getClass(), "traitPoints", (byte) -101);
        ArrayList term227420 = new ArrayList();
        ((ArrayList) term227420).add((Object)null);
        ((ArrayList) term227420).add((Object)null);
        ((ArrayList) term227420).add((Object)null);
        ((ArrayList) term227420).add((Object)null);
        Object term227415 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term227415, term227415.getClass(), "traitId", "");
        setField(term227415, term227415.getClass(), "traitName", "");
        setField(term227415, term227415.getClass(), "description", "");
        setField(term227415, term227415.getClass(), "group", "");
        setField(term227415, term227415.getClass(), "conflictsWithIds", term227420);
        setByteField(term227415, term227415.getClass(), "traitPoints", (byte) -116);
        ArrayList term227429 = new ArrayList();
        ((ArrayList) term227429).add((Object)null);
        Object term227424 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term227424, term227424.getClass(), "traitId", "");
        setField(term227424, term227424.getClass(), "traitName", "");
        setField(term227424, term227424.getClass(), "description", "");
        setField(term227424, term227424.getClass(), "group", "");
        setField(term227424, term227424.getClass(), "conflictsWithIds", term227429);
        setByteField(term227424, term227424.getClass(), "traitPoints", (byte) -32);
        ArrayList term227438 = new ArrayList();
        ((ArrayList) term227438).add((Object)null);
        ((ArrayList) term227438).add((Object)null);
        ((ArrayList) term227438).add((Object)null);
        ((ArrayList) term227438).add((Object)null);
        ((ArrayList) term227438).add((Object)null);
        ((ArrayList) term227438).add((Object)null);
        ((ArrayList) term227438).add((Object)null);
        ((ArrayList) term227438).add((Object)null);
        ((ArrayList) term227438).add((Object)null);
        Object term227433 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term227433, term227433.getClass(), "traitId", "");
        setField(term227433, term227433.getClass(), "traitName", "");
        setField(term227433, term227433.getClass(), "description", "");
        setField(term227433, term227433.getClass(), "group", "");
        setField(term227433, term227433.getClass(), "conflictsWithIds", term227438);
        setByteField(term227433, term227433.getClass(), "traitPoints", (byte) 113);
        ArrayList term227404 = new ArrayList();
        ((ArrayList) term227404).add(term227406);
        ((ArrayList) term227404).add(term227415);
        ((ArrayList) term227404).add(term227424);
        ((ArrayList) term227404).add(term227433);
        Class<? extends Object> term228380 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term228379 = ((Class) term228380).getDeclaredField((String) "STONE_PEOPLE");
        ((Field) term228379).setAccessible(true);
        Object enum691 = ((Field) term228379).get((Object) null);
        Class<? extends Object> term228693 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term228692 = ((Class) term228693).getDeclaredField((String) "REGULAR");
        ((Field) term228692).setAccessible(true);
        Object enum692 = ((Field) term228692).get((Object) null);
        term227234 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term227365 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term227234, term227234.getClass(), "id", "lMVrMjVtkh");
        setField(term227234, term227234.getClass(), "name", "pCYeiJyEzg");
        setField(term227234, term227234.getClass(), "nameSingle", "trtedumQuD");
        setField(term227234, term227234.getClass(), "attitude", enum688);
        setField(term227234, term227234.getClass(), "imagePath", "sxkHztjOJZ");
        setField(term227234, term227234.getClass(), "bridgeId", "GyvoRsilst");
        setField(term227234, term227234.getClass(), "spaceShipId", "IYeSURgmgZ");
        setField(term227234, term227234.getClass(), "socialSystem", enum689);
        setField(term227234, term227234.getClass(), "genderList", term227337);
        setField(term227234, term227234.getClass(), "speechSetId", "AtaJCOLMjf");
        setField(term227234, term227234.getClass(), "bridgeEffect", enum690);
        setField(term227365, term227365.getClass(), "songName", "MkLxfBFQqR");
        setField(term227365, term227365.getClass(), "author", "rgbJzxJVFu");
        setField(term227365, term227365.getClass(), "fileName", "KPaseiPrvu");
        setBooleanField(term227365, term227365.getClass(), "custom", false);
        setIntField(term227365, term227365.getClass(), "fadingLimit", -1036194324);
        setField(term227234, term227234.getClass(), "diplomacyMusic", term227365);
        setField(term227234, term227234.getClass(), "traits", term227404);
        setField(term227234, term227234.getClass(), "leaderNameGenerator", enum691);
        setField(term227234, term227234.getClass(), "description", "JARYYetgvz");
        setField(term227234, term227234.getClass(), "spaceRaceType", enum692);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.race.SpaceRace");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNameSingle", argTypes, term227234, args);
    }

};


