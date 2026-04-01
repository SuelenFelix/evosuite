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

public class SpaceRace_getMinimumPopulationForLeader_161481312435 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term302891;

    public SpaceRace_getMinimumPopulationForLeader_161481312435() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term303157 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term303156 = ((Class) term303157).getDeclaredField((String) "DIPLOMATIC");
        ((Field) term303156).setAccessible(true);
        Object enum931 = ((Field) term303156).get((Object) null);
        Class<? extends Object> term303454 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term303453 = ((Class) term303454).getDeclaredField((String) "PATRIARCHY");
        ((Field) term303453).setAccessible(true);
        Object enum932 = ((Field) term303453).get((Object) null);
        Class<? extends Object> term303716 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term303715 = ((Class) term303716).getDeclaredField((String) "FEMALE");
        ((Field) term303715).setAccessible(true);
        Object enum933 =  ((Field) term303715).get((Object) null);
        Class<? extends Object> term303946 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term303945 = ((Class) term303946).getDeclaredField((String) "MALE");
        ((Field) term303945).setAccessible(true);
        Object enum934 =  ((Field) term303945).get((Object) null);
        Class<? extends Object> term304170 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term304169 = ((Class) term304170).getDeclaredField((String) "MALE");
        ((Field) term304169).setAccessible(true);
        Object enum935 =  ((Field) term304169).get((Object) null);
        ArrayList term302992 = new ArrayList();
        ((ArrayList) term302992).add(enum933);
        ((ArrayList) term302992).add(enum933);
        ((ArrayList) term302992).add(enum933);
        ((ArrayList) term302992).add(enum934);
        ((ArrayList) term302992).add(enum933);
        ((ArrayList) term302992).add(enum933);
        ((ArrayList) term302992).add(enum935);
        ((ArrayList) term302992).add(enum934);
        ((ArrayList) term302992).add(enum933);
        Class<? extends Object> term304404 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term304403 = ((Class) term304404).getDeclaredField((String) "GREEN_CONSOLE");
        ((Field) term304403).setAccessible(true);
        Object enum936 = ((Field) term304403).get((Object) null);
        ArrayList term303076 = new ArrayList();
        Class<? extends Object> term304710 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term304709 = ((Class) term304710).getDeclaredField((String) "DEEP_CREATURE");
        ((Field) term304709).setAccessible(true);
        Object enum937 = ((Field) term304709).get((Object) null);
        Class<? extends Object> term305026 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term305025 = ((Class) term305026).getDeclaredField((String) "SPACE_MONSTER");
        ((Field) term305025).setAccessible(true);
        Object enum938 = ((Field) term305025).get((Object) null);
        term302891 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term303037 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term302891, term302891.getClass(), "id", "oHBNAywdjX");
        setField(term302891, term302891.getClass(), "name", "LtXEvmsGft");
        setField(term302891, term302891.getClass(), "nameSingle", "lQlNRkcQRY");
        setField(term302891, term302891.getClass(), "attitude", enum931);
        setField(term302891, term302891.getClass(), "imagePath", "tGFJhbkqHf");
        setField(term302891, term302891.getClass(), "bridgeId", "IPPRLZGZBn");
        setField(term302891, term302891.getClass(), "spaceShipId", "FvDAlgSUBA");
        setField(term302891, term302891.getClass(), "socialSystem", enum932);
        setField(term302891, term302891.getClass(), "genderList", term302992);
        setField(term302891, term302891.getClass(), "speechSetId", "RSpTPOOWxv");
        setField(term302891, term302891.getClass(), "bridgeEffect", enum936);
        setField(term303037, term303037.getClass(), "songName", "mJAIaSwRTZ");
        setField(term303037, term303037.getClass(), "author", "SHSHsYUaOc");
        setField(term303037, term303037.getClass(), "fileName", "jXMTXHvttw");
        setBooleanField(term303037, term303037.getClass(), "custom", false);
        setIntField(term303037, term303037.getClass(), "fadingLimit", 589633036);
        setField(term302891, term302891.getClass(), "diplomacyMusic", term303037);
        setField(term302891, term302891.getClass(), "traits", term303076);
        setField(term302891, term302891.getClass(), "leaderNameGenerator", enum937);
        setField(term302891, term302891.getClass(), "description", "WOqkLnLgei");
        setField(term302891, term302891.getClass(), "spaceRaceType", enum938);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.race.SpaceRace");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMinimumPopulationForLeader", argTypes, term302891, args);
    }

};


