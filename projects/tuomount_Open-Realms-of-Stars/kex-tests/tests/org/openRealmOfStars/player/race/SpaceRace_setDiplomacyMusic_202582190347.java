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

public class SpaceRace_setDiplomacyMusic_202582190347 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term331568;
     Object term331803;

    public SpaceRace_setDiplomacyMusic_202582190347() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term331873 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term331872 = ((Class) term331873).getDeclaredField((String) "MILITARISTIC");
        ((Field) term331872).setAccessible(true);
        Object enum1024 = ((Field) term331872).get((Object) null);
        Class<? extends Object> term332176 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term332175 = ((Class) term332176).getDeclaredField((String) "PATRIARCHY");
        ((Field) term332175).setAccessible(true);
        Object enum1025 = ((Field) term332175).get((Object) null);
        Class<? extends Object> term332438 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term332437 = ((Class) term332438).getDeclaredField((String) "FEMALE");
        ((Field) term332437).setAccessible(true);
        Object enum1026 =  ((Field) term332437).get((Object) null);
        Class<? extends Object> term332668 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term332667 = ((Class) term332668).getDeclaredField((String) "NONE");
        ((Field) term332667).setAccessible(true);
        Object enum1027 =  ((Field) term332667).get((Object) null);
        Class<? extends Object> term332892 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term332891 = ((Class) term332892).getDeclaredField((String) "FEMALE");
        ((Field) term332891).setAccessible(true);
        Object enum1028 =  ((Field) term332891).get((Object) null);
        ArrayList term331671 = new ArrayList();
        ((ArrayList) term331671).add(enum1026);
        ((ArrayList) term331671).add(enum1027);
        ((ArrayList) term331671).add(enum1028);
        ((ArrayList) term331671).add(enum1026);
        ((ArrayList) term331671).add(enum1026);
        Class<? extends Object> term333132 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term333131 = ((Class) term333132).getDeclaredField((String) "WARM_WHITE");
        ((Field) term333131).setAccessible(true);
        Object enum1029 = ((Field) term333131).get((Object) null);
        ArrayList term331759 = new ArrayList();
        Object term331754 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term331754, term331754.getClass(), "traitId", "");
        setField(term331754, term331754.getClass(), "traitName", "");
        setField(term331754, term331754.getClass(), "description", "");
        setField(term331754, term331754.getClass(), "group", "");
        setField(term331754, term331754.getClass(), "conflictsWithIds", term331759);
        setByteField(term331754, term331754.getClass(), "traitPoints", (byte) -5);
        ArrayList term331752 = new ArrayList();
        ((ArrayList) term331752).add(term331754);
        Class<? extends Object> term333429 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term333428 = ((Class) term333429).getDeclaredField((String) "CYBORG");
        ((Field) term333428).setAccessible(true);
        Object enum1030 = ((Field) term333428).get((Object) null);
        Class<? extends Object> term333724 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term333723 = ((Class) term333724).getDeclaredField((String) "SPACE_PIRATE");
        ((Field) term333723).setAccessible(true);
        Object enum1031 = ((Field) term333723).get((Object) null);
        term331568 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term331713 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term331568, term331568.getClass(), "id", "lNObKuUwLW");
        setField(term331568, term331568.getClass(), "name", "YiMvbxuceI");
        setField(term331568, term331568.getClass(), "nameSingle", "itdajcOwPM");
        setField(term331568, term331568.getClass(), "attitude", enum1024);
        setField(term331568, term331568.getClass(), "imagePath", "iNatfbDqSr");
        setField(term331568, term331568.getClass(), "bridgeId", "nvFBEPJXDP");
        setField(term331568, term331568.getClass(), "spaceShipId", "mUquGBKYgP");
        setField(term331568, term331568.getClass(), "socialSystem", enum1025);
        setField(term331568, term331568.getClass(), "genderList", term331671);
        setField(term331568, term331568.getClass(), "speechSetId", "kWvUnnYkTB");
        setField(term331568, term331568.getClass(), "bridgeEffect", enum1029);
        setField(term331713, term331713.getClass(), "songName", "xUdwyFAEKn");
        setField(term331713, term331713.getClass(), "author", "SKPObQHnYm");
        setField(term331713, term331713.getClass(), "fileName", "ZcUGgeWFzY");
        setBooleanField(term331713, term331713.getClass(), "custom", false);
        setIntField(term331713, term331713.getClass(), "fadingLimit", 542685338);
        setField(term331568, term331568.getClass(), "diplomacyMusic", term331713);
        setField(term331568, term331568.getClass(), "traits", term331752);
        setField(term331568, term331568.getClass(), "leaderNameGenerator", enum1030);
        setField(term331568, term331568.getClass(), "description", "JKrIhwugSB");
        setField(term331568, term331568.getClass(), "spaceRaceType", enum1031);
        term331803 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term331803, term331803.getClass(), "songName", "xfIshpKhxl");
        setField(term331803, term331803.getClass(), "author", "JwAMbyDsCd");
        setField(term331803, term331803.getClass(), "fileName", "jjiEzphWfP");
        setBooleanField(term331803, term331803.getClass(), "custom", true);
        setIntField(term331803, term331803.getClass(), "fadingLimit", 593280113);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.race.SpaceRace");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo");
        Object[] args = new Object[1];
        args[0] = term331803;
        callMethod(klass, "setDiplomacyMusic", argTypes, term331568, args);
    }

};


