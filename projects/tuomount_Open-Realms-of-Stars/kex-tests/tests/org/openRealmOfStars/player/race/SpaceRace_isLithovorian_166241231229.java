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

public class SpaceRace_isLithovorian_166241231229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289231;

    public SpaceRace_isLithovorian_166241231229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term289507 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term289506 = ((Class) term289507).getDeclaredField((String) "LOGICAL");
        ((Field) term289506).setAccessible(true);
        Object enum887 = ((Field) term289506).get((Object) null);
        Class<? extends Object> term289795 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term289794 = ((Class) term289795).getDeclaredField((String) "MATRIARCHY");
        ((Field) term289794).setAccessible(true);
        Object enum888 = ((Field) term289794).get((Object) null);
        Class<? extends Object> term290057 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term290056 = ((Class) term290057).getDeclaredField((String) "FEMALE");
        ((Field) term290056).setAccessible(true);
        Object enum889 =  ((Field) term290056).get((Object) null);
        Class<? extends Object> term290287 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term290286 = ((Class) term290287).getDeclaredField((String) "FEMALE");
        ((Field) term290286).setAccessible(true);
        Object enum890 =  ((Field) term290286).get((Object) null);
        ArrayList term289329 = new ArrayList();
        ((ArrayList) term289329).add(enum889);
        ((ArrayList) term289329).add(enum890);
        Class<? extends Object> term290527 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term290526 = ((Class) term290527).getDeclaredField((String) "GREYBLUE");
        ((Field) term290526).setAccessible(true);
        Object enum891 = ((Field) term290526).get((Object) null);
        ArrayList term289411 = new ArrayList();
        ((ArrayList) term289411).add((Object)null);
        ((ArrayList) term289411).add((Object)null);
        ((ArrayList) term289411).add((Object)null);
        ((ArrayList) term289411).add((Object)null);
        ((ArrayList) term289411).add((Object)null);
        Object term289406 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term289406, term289406.getClass(), "traitId", "");
        setField(term289406, term289406.getClass(), "traitName", "");
        setField(term289406, term289406.getClass(), "description", "");
        setField(term289406, term289406.getClass(), "group", "");
        setField(term289406, term289406.getClass(), "conflictsWithIds", term289411);
        setByteField(term289406, term289406.getClass(), "traitPoints", (byte) 70);
        ArrayList term289420 = new ArrayList();
        ((ArrayList) term289420).add((Object)null);
        Object term289415 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term289415, term289415.getClass(), "traitId", "");
        setField(term289415, term289415.getClass(), "traitName", "");
        setField(term289415, term289415.getClass(), "description", "");
        setField(term289415, term289415.getClass(), "group", "");
        setField(term289415, term289415.getClass(), "conflictsWithIds", term289420);
        setByteField(term289415, term289415.getClass(), "traitPoints", (byte) 42);
        ArrayList term289429 = new ArrayList();
        Object term289424 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term289424, term289424.getClass(), "traitId", "");
        setField(term289424, term289424.getClass(), "traitName", "");
        setField(term289424, term289424.getClass(), "description", "");
        setField(term289424, term289424.getClass(), "group", "");
        setField(term289424, term289424.getClass(), "conflictsWithIds", term289429);
        setByteField(term289424, term289424.getClass(), "traitPoints", (byte) 28);
        ArrayList term289404 = new ArrayList();
        ((ArrayList) term289404).add(term289406);
        ((ArrayList) term289404).add(term289415);
        ((ArrayList) term289404).add(term289424);
        Class<? extends Object> term290818 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term290817 = ((Class) term290818).getDeclaredField((String) "ANCIENT_NORDIC");
        ((Field) term290817).setAccessible(true);
        Object enum892 = ((Field) term290817).get((Object) null);
        Class<? extends Object> term291137 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term291136 = ((Class) term291137).getDeclaredField((String) "REGULAR");
        ((Field) term291136).setAccessible(true);
        Object enum893 = ((Field) term291136).get((Object) null);
        term289231 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term289365 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term289231, term289231.getClass(), "id", "zhTrQcOfmZ");
        setField(term289231, term289231.getClass(), "name", "QPQvZYsKyp");
        setField(term289231, term289231.getClass(), "nameSingle", "DcKnNHFkHB");
        setField(term289231, term289231.getClass(), "attitude", enum887);
        setField(term289231, term289231.getClass(), "imagePath", "ItJTfGujtZ");
        setField(term289231, term289231.getClass(), "bridgeId", "qkPcNUMMFU");
        setField(term289231, term289231.getClass(), "spaceShipId", "ZXmgWZeTRn");
        setField(term289231, term289231.getClass(), "socialSystem", enum888);
        setField(term289231, term289231.getClass(), "genderList", term289329);
        setField(term289231, term289231.getClass(), "speechSetId", "GoLHmDBAJB");
        setField(term289231, term289231.getClass(), "bridgeEffect", enum891);
        setField(term289365, term289365.getClass(), "songName", "AZqmZETlNN");
        setField(term289365, term289365.getClass(), "author", "bToiDutxBd");
        setField(term289365, term289365.getClass(), "fileName", "iIhNOWZSiI");
        setBooleanField(term289365, term289365.getClass(), "custom", true);
        setIntField(term289365, term289365.getClass(), "fadingLimit", -1701558271);
        setField(term289231, term289231.getClass(), "diplomacyMusic", term289365);
        setField(term289231, term289231.getClass(), "traits", term289404);
        setField(term289231, term289231.getClass(), "leaderNameGenerator", enum892);
        setField(term289231, term289231.getClass(), "description", "IhgSPsiEAp");
        setField(term289231, term289231.getClass(), "spaceRaceType", enum893);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.race.SpaceRace");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isLithovorian", argTypes, term289231, args);
    }

};


