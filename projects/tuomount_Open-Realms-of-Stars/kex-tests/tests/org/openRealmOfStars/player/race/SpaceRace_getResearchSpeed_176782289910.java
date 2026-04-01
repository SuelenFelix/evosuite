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

public class SpaceRace_getResearchSpeed_176782289910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term244885;

    public SpaceRace_getResearchSpeed_176782289910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term245147 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term245146 = ((Class) term245147).getDeclaredField((String) "BACKSTABBING");
        ((Field) term245146).setAccessible(true);
        Object enum744 = ((Field) term245146).get((Object) null);
        Class<? extends Object> term245450 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term245449 = ((Class) term245450).getDeclaredField((String) "PATRIARCHY");
        ((Field) term245449).setAccessible(true);
        Object enum745 = ((Field) term245449).get((Object) null);
        Class<? extends Object> term245712 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term245711 = ((Class) term245712).getDeclaredField((String) "MALE");
        ((Field) term245711).setAccessible(true);
        Object enum746 =  ((Field) term245711).get((Object) null);
        ArrayList term244988 = new ArrayList();
        ((ArrayList) term244988).add(enum746);
        Class<? extends Object> term245946 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term245945 = ((Class) term245946).getDeclaredField((String) "YELLOW_ALERT");
        ((Field) term245945).setAccessible(true);
        Object enum747 = ((Field) term245945).get((Object) null);
        ArrayList term245070 = new ArrayList();
        ((ArrayList) term245070).add((Object)null);
        ((ArrayList) term245070).add((Object)null);
        ((ArrayList) term245070).add((Object)null);
        Object term245065 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term245065, term245065.getClass(), "traitId", "");
        setField(term245065, term245065.getClass(), "traitName", "");
        setField(term245065, term245065.getClass(), "description", "");
        setField(term245065, term245065.getClass(), "group", "");
        setField(term245065, term245065.getClass(), "conflictsWithIds", term245070);
        setByteField(term245065, term245065.getClass(), "traitPoints", (byte) 110);
        ArrayList term245063 = new ArrayList();
        ((ArrayList) term245063).add(term245065);
        Class<? extends Object> term246249 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term246248 = ((Class) term246249).getDeclaredField((String) "MUSHROOM");
        ((Field) term246248).setAccessible(true);
        Object enum748 = ((Field) term246248).get((Object) null);
        Class<? extends Object> term246550 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term246549 = ((Class) term246550).getDeclaredField((String) "SPACE_PIRATE");
        ((Field) term246549).setAccessible(true);
        Object enum749 = ((Field) term246549).get((Object) null);
        term244885 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term245024 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term244885, term244885.getClass(), "id", "zKlUOJCYXr");
        setField(term244885, term244885.getClass(), "name", "DhHThLSjdW");
        setField(term244885, term244885.getClass(), "nameSingle", "vpzIYawZaD");
        setField(term244885, term244885.getClass(), "attitude", enum744);
        setField(term244885, term244885.getClass(), "imagePath", "AhXnqIEoTQ");
        setField(term244885, term244885.getClass(), "bridgeId", "LZalYBRxIH");
        setField(term244885, term244885.getClass(), "spaceShipId", "pgGxvxMUkz");
        setField(term244885, term244885.getClass(), "socialSystem", enum745);
        setField(term244885, term244885.getClass(), "genderList", term244988);
        setField(term244885, term244885.getClass(), "speechSetId", "VCLZbXOFle");
        setField(term244885, term244885.getClass(), "bridgeEffect", enum747);
        setField(term245024, term245024.getClass(), "songName", "zRssYePLvB");
        setField(term245024, term245024.getClass(), "author", "nYIQozpOPk");
        setField(term245024, term245024.getClass(), "fileName", "xlJAMBnfDy");
        setBooleanField(term245024, term245024.getClass(), "custom", false);
        setIntField(term245024, term245024.getClass(), "fadingLimit", -974929860);
        setField(term244885, term244885.getClass(), "diplomacyMusic", term245024);
        setField(term244885, term244885.getClass(), "traits", term245063);
        setField(term244885, term244885.getClass(), "leaderNameGenerator", enum748);
        setField(term244885, term244885.getClass(), "description", "uXVRWrCQNA");
        setField(term244885, term244885.getClass(), "spaceRaceType", enum749);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.race.SpaceRace");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getResearchSpeed", argTypes, term244885, args);
    }

};


