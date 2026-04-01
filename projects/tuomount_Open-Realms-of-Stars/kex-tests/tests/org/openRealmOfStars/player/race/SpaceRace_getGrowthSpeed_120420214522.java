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

public class SpaceRace_getGrowthSpeed_120420214522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term272796;

    public SpaceRace_getGrowthSpeed_120420214522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term273062 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term273061 = ((Class) term273062).getDeclaredField((String) "LOGICAL");
        ((Field) term273061).setAccessible(true);
        Object enum834 = ((Field) term273061).get((Object) null);
        Class<? extends Object> term273350 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term273349 = ((Class) term273350).getDeclaredField((String) "PATRIARCHY");
        ((Field) term273349).setAccessible(true);
        Object enum835 = ((Field) term273349).get((Object) null);
        Class<? extends Object> term273612 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term273611 = ((Class) term273612).getDeclaredField((String) "NONE");
        ((Field) term273611).setAccessible(true);
        Object enum836 =  ((Field) term273611).get((Object) null);
        Class<? extends Object> term273836 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term273835 = ((Class) term273836).getDeclaredField((String) "FEMALE");
        ((Field) term273835).setAccessible(true);
        Object enum837 =  ((Field) term273835).get((Object) null);
        Class<? extends Object> term274066 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term274065 = ((Class) term274066).getDeclaredField((String) "FEMALE");
        ((Field) term274065).setAccessible(true);
        Object enum838 =  ((Field) term274065).get((Object) null);
        ArrayList term272894 = new ArrayList();
        ((ArrayList) term272894).add(enum836);
        ((ArrayList) term272894).add(enum837);
        ((ArrayList) term272894).add(enum838);
        Class<? extends Object> term274306 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term274305 = ((Class) term274306).getDeclaredField((String) "ORANGE_BLINK");
        ((Field) term274305).setAccessible(true);
        Object enum839 = ((Field) term274305).get((Object) null);
        ArrayList term272984 = new ArrayList();
        ((ArrayList) term272984).add((Object)null);
        ((ArrayList) term272984).add((Object)null);
        ((ArrayList) term272984).add((Object)null);
        ((ArrayList) term272984).add((Object)null);
        ((ArrayList) term272984).add((Object)null);
        ((ArrayList) term272984).add((Object)null);
        ((ArrayList) term272984).add((Object)null);
        Object term272979 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term272979, term272979.getClass(), "traitId", "");
        setField(term272979, term272979.getClass(), "traitName", "");
        setField(term272979, term272979.getClass(), "description", "");
        setField(term272979, term272979.getClass(), "group", "");
        setField(term272979, term272979.getClass(), "conflictsWithIds", term272984);
        setByteField(term272979, term272979.getClass(), "traitPoints", (byte) 86);
        ArrayList term272977 = new ArrayList();
        ((ArrayList) term272977).add(term272979);
        Class<? extends Object> term274609 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term274608 = ((Class) term274609).getDeclaredField((String) "SPACE_ORC");
        ((Field) term274608).setAccessible(true);
        Object enum840 = ((Field) term274608).get((Object) null);
        Class<? extends Object> term274913 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term274912 = ((Class) term274913).getDeclaredField((String) "SPACE_PIRATE");
        ((Field) term274912).setAccessible(true);
        Object enum841 = ((Field) term274912).get((Object) null);
        term272796 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term272938 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term272796, term272796.getClass(), "id", "xGZegFGFwp");
        setField(term272796, term272796.getClass(), "name", "mcyLkkYdqH");
        setField(term272796, term272796.getClass(), "nameSingle", "NgPHLrUVTl");
        setField(term272796, term272796.getClass(), "attitude", enum834);
        setField(term272796, term272796.getClass(), "imagePath", "cGSjeMMyEG");
        setField(term272796, term272796.getClass(), "bridgeId", "zDxtwCfvRN");
        setField(term272796, term272796.getClass(), "spaceShipId", "cBntwyxQws");
        setField(term272796, term272796.getClass(), "socialSystem", enum835);
        setField(term272796, term272796.getClass(), "genderList", term272894);
        setField(term272796, term272796.getClass(), "speechSetId", "ctJmoieYHE");
        setField(term272796, term272796.getClass(), "bridgeEffect", enum839);
        setField(term272938, term272938.getClass(), "songName", "MGvYGOoYyh");
        setField(term272938, term272938.getClass(), "author", "akolIywpGZ");
        setField(term272938, term272938.getClass(), "fileName", "GnPGHkkqXj");
        setBooleanField(term272938, term272938.getClass(), "custom", false);
        setIntField(term272938, term272938.getClass(), "fadingLimit", 558898048);
        setField(term272796, term272796.getClass(), "diplomacyMusic", term272938);
        setField(term272796, term272796.getClass(), "traits", term272977);
        setField(term272796, term272796.getClass(), "leaderNameGenerator", enum840);
        setField(term272796, term272796.getClass(), "description", "guXghgolSm");
        setField(term272796, term272796.getClass(), "spaceRaceType", enum841);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.race.SpaceRace");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGrowthSpeed", argTypes, term272796, args);
    }

};


