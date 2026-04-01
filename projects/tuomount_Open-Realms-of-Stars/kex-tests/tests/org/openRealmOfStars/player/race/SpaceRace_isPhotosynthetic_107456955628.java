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

public class SpaceRace_isPhotosynthetic_107456955628 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term286754;

    public SpaceRace_isPhotosynthetic_107456955628() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term287084 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term287083 = ((Class) term287084).getDeclaredField((String) "EXPANSIONIST");
        ((Field) term287083).setAccessible(true);
        Object enum879 = ((Field) term287083).get((Object) null);
        Class<? extends Object> term287387 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term287386 = ((Class) term287387).getDeclaredField((String) "PATRIARCHY");
        ((Field) term287386).setAccessible(true);
        Object enum880 = ((Field) term287386).get((Object) null);
        Class<? extends Object> term287649 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term287648 = ((Class) term287649).getDeclaredField((String) "FEMALE");
        ((Field) term287648).setAccessible(true);
        Object enum881 =  ((Field) term287648).get((Object) null);
        Class<? extends Object> term287879 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term287878 = ((Class) term287879).getDeclaredField((String) "NONE");
        ((Field) term287878).setAccessible(true);
        Object enum882 =  ((Field) term287878).get((Object) null);
        Class<? extends Object> term288103 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term288102 = ((Class) term288103).getDeclaredField((String) "MALE");
        ((Field) term288102).setAccessible(true);
        Object enum883 =  ((Field) term288102).get((Object) null);
        ArrayList term286857 = new ArrayList();
        ((ArrayList) term286857).add(enum881);
        ((ArrayList) term286857).add(enum882);
        ((ArrayList) term286857).add(enum883);
        Class<? extends Object> term288337 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term288336 = ((Class) term288337).getDeclaredField((String) "JUNGLE");
        ((Field) term288336).setAccessible(true);
        Object enum884 = ((Field) term288336).get((Object) null);
        ArrayList term286941 = new ArrayList();
        ((ArrayList) term286941).add((Object)null);
        ((ArrayList) term286941).add((Object)null);
        ((ArrayList) term286941).add((Object)null);
        ((ArrayList) term286941).add((Object)null);
        ((ArrayList) term286941).add((Object)null);
        ((ArrayList) term286941).add((Object)null);
        ((ArrayList) term286941).add((Object)null);
        Object term286936 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term286936, term286936.getClass(), "traitId", "");
        setField(term286936, term286936.getClass(), "traitName", "");
        setField(term286936, term286936.getClass(), "description", "");
        setField(term286936, term286936.getClass(), "group", "");
        setField(term286936, term286936.getClass(), "conflictsWithIds", term286941);
        setByteField(term286936, term286936.getClass(), "traitPoints", (byte) 13);
        ArrayList term286950 = new ArrayList();
        ((ArrayList) term286950).add((Object)null);
        Object term286945 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term286945, term286945.getClass(), "traitId", "");
        setField(term286945, term286945.getClass(), "traitName", "");
        setField(term286945, term286945.getClass(), "description", "");
        setField(term286945, term286945.getClass(), "group", "");
        setField(term286945, term286945.getClass(), "conflictsWithIds", term286950);
        setByteField(term286945, term286945.getClass(), "traitPoints", (byte) 87);
        ArrayList term286959 = new ArrayList();
        ((ArrayList) term286959).add((Object)null);
        ((ArrayList) term286959).add((Object)null);
        ((ArrayList) term286959).add((Object)null);
        Object term286954 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term286954, term286954.getClass(), "traitId", "");
        setField(term286954, term286954.getClass(), "traitName", "");
        setField(term286954, term286954.getClass(), "description", "");
        setField(term286954, term286954.getClass(), "group", "");
        setField(term286954, term286954.getClass(), "conflictsWithIds", term286959);
        setByteField(term286954, term286954.getClass(), "traitPoints", (byte) 46);
        ArrayList term286968 = new ArrayList();
        ((ArrayList) term286968).add((Object)null);
        Object term286963 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term286963, term286963.getClass(), "traitId", "");
        setField(term286963, term286963.getClass(), "traitName", "");
        setField(term286963, term286963.getClass(), "description", "");
        setField(term286963, term286963.getClass(), "group", "");
        setField(term286963, term286963.getClass(), "conflictsWithIds", term286968);
        setByteField(term286963, term286963.getClass(), "traitPoints", (byte) 90);
        ArrayList term286977 = new ArrayList();
        ((ArrayList) term286977).add((Object)null);
        ((ArrayList) term286977).add((Object)null);
        Object term286972 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term286972, term286972.getClass(), "traitId", "");
        setField(term286972, term286972.getClass(), "traitName", "");
        setField(term286972, term286972.getClass(), "description", "");
        setField(term286972, term286972.getClass(), "group", "");
        setField(term286972, term286972.getClass(), "conflictsWithIds", term286977);
        setByteField(term286972, term286972.getClass(), "traitPoints", (byte) -79);
        ArrayList term286986 = new ArrayList();
        ((ArrayList) term286986).add((Object)null);
        ((ArrayList) term286986).add((Object)null);
        ((ArrayList) term286986).add((Object)null);
        ((ArrayList) term286986).add((Object)null);
        ((ArrayList) term286986).add((Object)null);
        ((ArrayList) term286986).add((Object)null);
        ((ArrayList) term286986).add((Object)null);
        ((ArrayList) term286986).add((Object)null);
        ((ArrayList) term286986).add((Object)null);
        Object term286981 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term286981, term286981.getClass(), "traitId", "");
        setField(term286981, term286981.getClass(), "traitName", "");
        setField(term286981, term286981.getClass(), "description", "");
        setField(term286981, term286981.getClass(), "group", "");
        setField(term286981, term286981.getClass(), "conflictsWithIds", term286986);
        setByteField(term286981, term286981.getClass(), "traitPoints", (byte) -86);
        ArrayList term286995 = new ArrayList();
        ((ArrayList) term286995).add((Object)null);
        ((ArrayList) term286995).add((Object)null);
        Object term286990 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term286990, term286990.getClass(), "traitId", "");
        setField(term286990, term286990.getClass(), "traitName", "");
        setField(term286990, term286990.getClass(), "description", "");
        setField(term286990, term286990.getClass(), "group", "");
        setField(term286990, term286990.getClass(), "conflictsWithIds", term286995);
        setByteField(term286990, term286990.getClass(), "traitPoints", (byte) 103);
        ArrayList term286934 = new ArrayList();
        ((ArrayList) term286934).add(term286936);
        ((ArrayList) term286934).add(term286945);
        ((ArrayList) term286934).add(term286954);
        ((ArrayList) term286934).add(term286963);
        ((ArrayList) term286934).add(term286972);
        ((ArrayList) term286934).add(term286981);
        ((ArrayList) term286934).add(term286990);
        Class<? extends Object> term288622 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term288621 = ((Class) term288622).getDeclaredField((String) "DEEP_ANCIENT_MONSTER");
        ((Field) term288621).setAccessible(true);
        Object enum885 = ((Field) term288621).get((Object) null);
        Class<? extends Object> term288959 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term288958 = ((Class) term288959).getDeclaredField((String) "SPACE_PIRATE");
        ((Field) term288958).setAccessible(true);
        Object enum886 = ((Field) term288958).get((Object) null);
        term286754 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term286895 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term286754, term286754.getClass(), "id", "oaPePvATgc");
        setField(term286754, term286754.getClass(), "name", "JIjGGcVKJH");
        setField(term286754, term286754.getClass(), "nameSingle", "iasdYjtSEx");
        setField(term286754, term286754.getClass(), "attitude", enum879);
        setField(term286754, term286754.getClass(), "imagePath", "QFfeXcsDUe");
        setField(term286754, term286754.getClass(), "bridgeId", "RuTPzciBfn");
        setField(term286754, term286754.getClass(), "spaceShipId", "osTjagfbhA");
        setField(term286754, term286754.getClass(), "socialSystem", enum880);
        setField(term286754, term286754.getClass(), "genderList", term286857);
        setField(term286754, term286754.getClass(), "speechSetId", "KVJHdKBMKb");
        setField(term286754, term286754.getClass(), "bridgeEffect", enum884);
        setField(term286895, term286895.getClass(), "songName", "hrhwpRIDFJ");
        setField(term286895, term286895.getClass(), "author", "eanYvfnxqY");
        setField(term286895, term286895.getClass(), "fileName", "WHYzVTgpKa");
        setBooleanField(term286895, term286895.getClass(), "custom", true);
        setIntField(term286895, term286895.getClass(), "fadingLimit", 1297362786);
        setField(term286754, term286754.getClass(), "diplomacyMusic", term286895);
        setField(term286754, term286754.getClass(), "traits", term286934);
        setField(term286754, term286754.getClass(), "leaderNameGenerator", enum885);
        setField(term286754, term286754.getClass(), "description", "cNAlXBcuBR");
        setField(term286754, term286754.getClass(), "spaceRaceType", enum886);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.race.SpaceRace");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isPhotosynthetic", argTypes, term286754, args);
    }

};


