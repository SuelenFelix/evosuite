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

public class SpaceRace_getSpaceRaceType_79348049250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term338968;

    public SpaceRace_getSpaceRaceType_79348049250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term339260 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term339259 = ((Class) term339260).getDeclaredField((String) "LOGICAL");
        ((Field) term339259).setAccessible(true);
        Object enum1048 = ((Field) term339259).get((Object) null);
        Class<? extends Object> term339548 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term339547 = ((Class) term339548).getDeclaredField((String) "PATRIARCHY");
        ((Field) term339547).setAccessible(true);
        Object enum1049 = ((Field) term339547).get((Object) null);
        Class<? extends Object> term339810 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term339809 = ((Class) term339810).getDeclaredField((String) "FEMALE");
        ((Field) term339809).setAccessible(true);
        Object enum1050 =  ((Field) term339809).get((Object) null);
        Class<? extends Object> term340040 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term340039 = ((Class) term340040).getDeclaredField((String) "NONE");
        ((Field) term340039).setAccessible(true);
        Object enum1051 =  ((Field) term340039).get((Object) null);
        ArrayList term339066 = new ArrayList();
        ((ArrayList) term339066).add(enum1050);
        ((ArrayList) term339066).add(enum1050);
        ((ArrayList) term339066).add(enum1050);
        ((ArrayList) term339066).add(enum1050);
        ((ArrayList) term339066).add(enum1050);
        ((ArrayList) term339066).add(enum1051);
        ((ArrayList) term339066).add(enum1050);
        Class<? extends Object> term340274 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term340273 = ((Class) term340274).getDeclaredField((String) "PURPLE_DREAM");
        ((Field) term340273).setAccessible(true);
        Object enum1052 = ((Field) term340273).get((Object) null);
        ArrayList term339152 = new ArrayList();
        ((ArrayList) term339152).add((Object)null);
        Object term339147 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term339147, term339147.getClass(), "traitId", "");
        setField(term339147, term339147.getClass(), "traitName", "");
        setField(term339147, term339147.getClass(), "description", "");
        setField(term339147, term339147.getClass(), "group", "");
        setField(term339147, term339147.getClass(), "conflictsWithIds", term339152);
        setByteField(term339147, term339147.getClass(), "traitPoints", (byte) 12);
        ArrayList term339161 = new ArrayList();
        ((ArrayList) term339161).add((Object)null);
        ((ArrayList) term339161).add((Object)null);
        ((ArrayList) term339161).add((Object)null);
        ((ArrayList) term339161).add((Object)null);
        ((ArrayList) term339161).add((Object)null);
        Object term339156 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term339156, term339156.getClass(), "traitId", "");
        setField(term339156, term339156.getClass(), "traitName", "");
        setField(term339156, term339156.getClass(), "description", "");
        setField(term339156, term339156.getClass(), "group", "");
        setField(term339156, term339156.getClass(), "conflictsWithIds", term339161);
        setByteField(term339156, term339156.getClass(), "traitPoints", (byte) 21);
        ArrayList term339170 = new ArrayList();
        ((ArrayList) term339170).add((Object)null);
        ((ArrayList) term339170).add((Object)null);
        ((ArrayList) term339170).add((Object)null);
        ((ArrayList) term339170).add((Object)null);
        ((ArrayList) term339170).add((Object)null);
        ((ArrayList) term339170).add((Object)null);
        ((ArrayList) term339170).add((Object)null);
        Object term339165 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term339165, term339165.getClass(), "traitId", "");
        setField(term339165, term339165.getClass(), "traitName", "");
        setField(term339165, term339165.getClass(), "description", "");
        setField(term339165, term339165.getClass(), "group", "");
        setField(term339165, term339165.getClass(), "conflictsWithIds", term339170);
        setByteField(term339165, term339165.getClass(), "traitPoints", (byte) -45);
        ArrayList term339179 = new ArrayList();
        ((ArrayList) term339179).add((Object)null);
        ((ArrayList) term339179).add((Object)null);
        ((ArrayList) term339179).add((Object)null);
        ((ArrayList) term339179).add((Object)null);
        ((ArrayList) term339179).add((Object)null);
        ((ArrayList) term339179).add((Object)null);
        ((ArrayList) term339179).add((Object)null);
        Object term339174 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term339174, term339174.getClass(), "traitId", "");
        setField(term339174, term339174.getClass(), "traitName", "");
        setField(term339174, term339174.getClass(), "description", "");
        setField(term339174, term339174.getClass(), "group", "");
        setField(term339174, term339174.getClass(), "conflictsWithIds", term339179);
        setByteField(term339174, term339174.getClass(), "traitPoints", (byte) 55);
        ArrayList term339145 = new ArrayList();
        ((ArrayList) term339145).add(term339147);
        ((ArrayList) term339145).add(term339156);
        ((ArrayList) term339145).add(term339165);
        ((ArrayList) term339145).add(term339174);
        Class<? extends Object> term340577 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term340576 = ((Class) term340577).getDeclaredField((String) "STONE_PEOPLE");
        ((Field) term340576).setAccessible(true);
        Object enum1053 = ((Field) term340576).get((Object) null);
        Class<? extends Object> term340890 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term340889 = ((Class) term340890).getDeclaredField((String) "SPACE_PIRATE");
        ((Field) term340889).setAccessible(true);
        Object enum1054 = ((Field) term340889).get((Object) null);
        term338968 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term339106 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term338968, term338968.getClass(), "id", "wjLowxXqMV");
        setField(term338968, term338968.getClass(), "name", "ZKmgqtnyWl");
        setField(term338968, term338968.getClass(), "nameSingle", "jbKfSPsbrl");
        setField(term338968, term338968.getClass(), "attitude", enum1048);
        setField(term338968, term338968.getClass(), "imagePath", "cgnSRPOCMZ");
        setField(term338968, term338968.getClass(), "bridgeId", "rsZIFmJCSV");
        setField(term338968, term338968.getClass(), "spaceShipId", "tGfCBlTvvA");
        setField(term338968, term338968.getClass(), "socialSystem", enum1049);
        setField(term338968, term338968.getClass(), "genderList", term339066);
        setField(term338968, term338968.getClass(), "speechSetId", "XRvQvyRaeI");
        setField(term338968, term338968.getClass(), "bridgeEffect", enum1052);
        setField(term339106, term339106.getClass(), "songName", "PiiAJlvOam");
        setField(term339106, term339106.getClass(), "author", "siXyhYgybV");
        setField(term339106, term339106.getClass(), "fileName", "ZyNlPlXuvg");
        setBooleanField(term339106, term339106.getClass(), "custom", false);
        setIntField(term339106, term339106.getClass(), "fadingLimit", -181324663);
        setField(term338968, term338968.getClass(), "diplomacyMusic", term339106);
        setField(term338968, term338968.getClass(), "traits", term339145);
        setField(term338968, term338968.getClass(), "leaderNameGenerator", enum1053);
        setField(term338968, term338968.getClass(), "description", "aGSTcHytvT");
        setField(term338968, term338968.getClass(), "spaceRaceType", enum1054);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.race.SpaceRace");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSpaceRaceType", argTypes, term338968, args);
    }

};


