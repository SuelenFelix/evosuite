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

public class SpaceRace_getRacialDescription_10383523441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term316868;

    public SpaceRace_getRacialDescription_10383523441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term317171 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term317170 = ((Class) term317171).getDeclaredField((String) "BACKSTABBING");
        ((Field) term317170).setAccessible(true);
        Object enum976 = ((Field) term317170).get((Object) null);
        Class<? extends Object> term317474 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term317473 = ((Class) term317474).getDeclaredField((String) "PATRIARCHY");
        ((Field) term317473).setAccessible(true);
        Object enum977 = ((Field) term317473).get((Object) null);
        Class<? extends Object> term317736 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term317735 = ((Class) term317736).getDeclaredField((String) "MALE");
        ((Field) term317735).setAccessible(true);
        Object enum978 =  ((Field) term317735).get((Object) null);
        Class<? extends Object> term317960 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term317959 = ((Class) term317960).getDeclaredField((String) "FEMALE");
        ((Field) term317959).setAccessible(true);
        Object enum979 =  ((Field) term317959).get((Object) null);
        Class<? extends Object> term318190 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term318189 = ((Class) term318190).getDeclaredField((String) "MALE");
        ((Field) term318189).setAccessible(true);
        Object enum980 =  ((Field) term318189).get((Object) null);
        ArrayList term316971 = new ArrayList();
        ((ArrayList) term316971).add(enum978);
        ((ArrayList) term316971).add(enum979);
        ((ArrayList) term316971).add(enum978);
        ((ArrayList) term316971).add(enum980);
        ((ArrayList) term316971).add(enum980);
        ((ArrayList) term316971).add(enum978);
        ((ArrayList) term316971).add(enum978);
        ((ArrayList) term316971).add(enum980);
        ((ArrayList) term316971).add(enum978);
        Class<? extends Object> term318424 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term318423 = ((Class) term318424).getDeclaredField((String) "YELLOW_ALERT");
        ((Field) term318423).setAccessible(true);
        Object enum981 = ((Field) term318423).get((Object) null);
        ArrayList term317061 = new ArrayList();
        ((ArrayList) term317061).add((Object)null);
        Object term317056 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term317056, term317056.getClass(), "traitId", "");
        setField(term317056, term317056.getClass(), "traitName", "");
        setField(term317056, term317056.getClass(), "description", "");
        setField(term317056, term317056.getClass(), "group", "");
        setField(term317056, term317056.getClass(), "conflictsWithIds", term317061);
        setByteField(term317056, term317056.getClass(), "traitPoints", (byte) -105);
        ArrayList term317070 = new ArrayList();
        ((ArrayList) term317070).add((Object)null);
        ((ArrayList) term317070).add((Object)null);
        ((ArrayList) term317070).add((Object)null);
        ((ArrayList) term317070).add((Object)null);
        Object term317065 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term317065, term317065.getClass(), "traitId", "");
        setField(term317065, term317065.getClass(), "traitName", "");
        setField(term317065, term317065.getClass(), "description", "");
        setField(term317065, term317065.getClass(), "group", "");
        setField(term317065, term317065.getClass(), "conflictsWithIds", term317070);
        setByteField(term317065, term317065.getClass(), "traitPoints", (byte) -27);
        ArrayList term317079 = new ArrayList();
        ((ArrayList) term317079).add((Object)null);
        Object term317074 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term317074, term317074.getClass(), "traitId", "");
        setField(term317074, term317074.getClass(), "traitName", "");
        setField(term317074, term317074.getClass(), "description", "");
        setField(term317074, term317074.getClass(), "group", "");
        setField(term317074, term317074.getClass(), "conflictsWithIds", term317079);
        setByteField(term317074, term317074.getClass(), "traitPoints", (byte) 0);
        ArrayList term317088 = new ArrayList();
        Object term317083 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term317083, term317083.getClass(), "traitId", "");
        setField(term317083, term317083.getClass(), "traitName", "");
        setField(term317083, term317083.getClass(), "description", "");
        setField(term317083, term317083.getClass(), "group", "");
        setField(term317083, term317083.getClass(), "conflictsWithIds", term317088);
        setByteField(term317083, term317083.getClass(), "traitPoints", (byte) -126);
        ArrayList term317097 = new ArrayList();
        ((ArrayList) term317097).add((Object)null);
        ((ArrayList) term317097).add((Object)null);
        ((ArrayList) term317097).add((Object)null);
        ((ArrayList) term317097).add((Object)null);
        ((ArrayList) term317097).add((Object)null);
        ((ArrayList) term317097).add((Object)null);
        Object term317092 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term317092, term317092.getClass(), "traitId", "");
        setField(term317092, term317092.getClass(), "traitName", "");
        setField(term317092, term317092.getClass(), "description", "");
        setField(term317092, term317092.getClass(), "group", "");
        setField(term317092, term317092.getClass(), "conflictsWithIds", term317097);
        setByteField(term317092, term317092.getClass(), "traitPoints", (byte) 22);
        ArrayList term317054 = new ArrayList();
        ((ArrayList) term317054).add(term317056);
        ((ArrayList) term317054).add(term317065);
        ((ArrayList) term317054).add(term317074);
        ((ArrayList) term317054).add(term317083);
        ((ArrayList) term317054).add(term317092);
        Class<? extends Object> term318727 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term318726 = ((Class) term318727).getDeclaredField((String) "DWARF");
        ((Field) term318726).setAccessible(true);
        Object enum982 = ((Field) term318726).get((Object) null);
        Class<? extends Object> term319019 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term319018 = ((Class) term319019).getDeclaredField((String) "SPACE_PIRATE");
        ((Field) term319018).setAccessible(true);
        Object enum983 = ((Field) term319018).get((Object) null);
        term316868 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term317015 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term316868, term316868.getClass(), "id", "vqgXCbtNCu");
        setField(term316868, term316868.getClass(), "name", "kpkWNprGhK");
        setField(term316868, term316868.getClass(), "nameSingle", "AJmMrhkCkE");
        setField(term316868, term316868.getClass(), "attitude", enum976);
        setField(term316868, term316868.getClass(), "imagePath", "aaAOXoTImC");
        setField(term316868, term316868.getClass(), "bridgeId", "utpjeiiGQI");
        setField(term316868, term316868.getClass(), "spaceShipId", "pssWvXujgp");
        setField(term316868, term316868.getClass(), "socialSystem", enum977);
        setField(term316868, term316868.getClass(), "genderList", term316971);
        setField(term316868, term316868.getClass(), "speechSetId", "EdNwugyvnG");
        setField(term316868, term316868.getClass(), "bridgeEffect", enum981);
        setField(term317015, term317015.getClass(), "songName", "SzBvOdpmGj");
        setField(term317015, term317015.getClass(), "author", "hyIqGTzCGV");
        setField(term317015, term317015.getClass(), "fileName", "neTMUkKvtF");
        setBooleanField(term317015, term317015.getClass(), "custom", true);
        setIntField(term317015, term317015.getClass(), "fadingLimit", 1957563972);
        setField(term316868, term316868.getClass(), "diplomacyMusic", term317015);
        setField(term316868, term316868.getClass(), "traits", term317054);
        setField(term316868, term316868.getClass(), "leaderNameGenerator", enum982);
        setField(term316868, term316868.getClass(), "description", "iCVAQxiyxL");
        setField(term316868, term316868.getClass(), "spaceRaceType", enum983);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.race.SpaceRace");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRacialDescription", argTypes, term316868, args);
    }

};


