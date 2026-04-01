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

public class SpaceRace_setSocialSystem_72176086434 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term300265;
     Object enum930;

    public SpaceRace_setSocialSystem_72176086434() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term300542 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term300541 = ((Class) term300542).getDeclaredField((String) "DIPLOMATIC");
        ((Field) term300541).setAccessible(true);
        Object enum922 = ((Field) term300541).get((Object) null);
        Class<? extends Object> term300839 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term300838 = ((Class) term300839).getDeclaredField((String) "PATRIARCHY");
        ((Field) term300838).setAccessible(true);
        Object enum923 = ((Field) term300838).get((Object) null);
        Class<? extends Object> term301101 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term301100 = ((Class) term301101).getDeclaredField((String) "FEMALE");
        ((Field) term301100).setAccessible(true);
        Object enum924 =  ((Field) term301100).get((Object) null);
        Class<? extends Object> term301331 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term301330 = ((Class) term301331).getDeclaredField((String) "NONE");
        ((Field) term301330).setAccessible(true);
        Object enum925 =  ((Field) term301330).get((Object) null);
        Class<? extends Object> term301555 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term301554 = ((Class) term301555).getDeclaredField((String) "FEMALE");
        ((Field) term301554).setAccessible(true);
        Object enum926 =  ((Field) term301554).get((Object) null);
        ArrayList term300366 = new ArrayList();
        ((ArrayList) term300366).add(enum924);
        ((ArrayList) term300366).add(enum925);
        ((ArrayList) term300366).add(enum924);
        ((ArrayList) term300366).add(enum926);
        ((ArrayList) term300366).add(enum925);
        ((ArrayList) term300366).add(enum926);
        ((ArrayList) term300366).add(enum924);
        ((ArrayList) term300366).add(enum926);
        ((ArrayList) term300366).add(enum924);
        Class<? extends Object> term301795 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term301794 = ((Class) term301795).getDeclaredField((String) "JUNGLE");
        ((Field) term301794).setAccessible(true);
        Object enum927 = ((Field) term301794).get((Object) null);
        ArrayList term300450 = new ArrayList();
        ((ArrayList) term300450).add((Object)null);
        ((ArrayList) term300450).add((Object)null);
        ((ArrayList) term300450).add((Object)null);
        ((ArrayList) term300450).add((Object)null);
        ((ArrayList) term300450).add((Object)null);
        ((ArrayList) term300450).add((Object)null);
        Object term300445 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term300445, term300445.getClass(), "traitId", "");
        setField(term300445, term300445.getClass(), "traitName", "");
        setField(term300445, term300445.getClass(), "description", "");
        setField(term300445, term300445.getClass(), "group", "");
        setField(term300445, term300445.getClass(), "conflictsWithIds", term300450);
        setByteField(term300445, term300445.getClass(), "traitPoints", (byte) 79);
        ArrayList term300459 = new ArrayList();
        ((ArrayList) term300459).add((Object)null);
        ((ArrayList) term300459).add((Object)null);
        ((ArrayList) term300459).add((Object)null);
        ((ArrayList) term300459).add((Object)null);
        ((ArrayList) term300459).add((Object)null);
        ((ArrayList) term300459).add((Object)null);
        ((ArrayList) term300459).add((Object)null);
        ((ArrayList) term300459).add((Object)null);
        ((ArrayList) term300459).add((Object)null);
        Object term300454 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term300454, term300454.getClass(), "traitId", "");
        setField(term300454, term300454.getClass(), "traitName", "");
        setField(term300454, term300454.getClass(), "description", "");
        setField(term300454, term300454.getClass(), "group", "");
        setField(term300454, term300454.getClass(), "conflictsWithIds", term300459);
        setByteField(term300454, term300454.getClass(), "traitPoints", (byte) 30);
        ArrayList term300443 = new ArrayList();
        ((ArrayList) term300443).add(term300445);
        ((ArrayList) term300443).add(term300454);
        Class<? extends Object> term302080 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term302079 = ((Class) term302080).getDeclaredField((String) "DWARF");
        ((Field) term302079).setAccessible(true);
        Object enum928 = ((Field) term302079).get((Object) null);
        Class<? extends Object> term302372 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term302371 = ((Class) term302372).getDeclaredField((String) "SPACE_PIRATE");
        ((Field) term302371).setAccessible(true);
        Object enum929 = ((Field) term302371).get((Object) null);
        term300265 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term300404 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term300265, term300265.getClass(), "id", "ClJWxuFhvY");
        setField(term300265, term300265.getClass(), "name", "owPqnSCjlr");
        setField(term300265, term300265.getClass(), "nameSingle", "bstKSThCsH");
        setField(term300265, term300265.getClass(), "attitude", enum922);
        setField(term300265, term300265.getClass(), "imagePath", "QuJUFXGoAL");
        setField(term300265, term300265.getClass(), "bridgeId", "NHyvoceYPA");
        setField(term300265, term300265.getClass(), "spaceShipId", "zvfYpTBhsN");
        setField(term300265, term300265.getClass(), "socialSystem", enum923);
        setField(term300265, term300265.getClass(), "genderList", term300366);
        setField(term300265, term300265.getClass(), "speechSetId", "SInylFGlyL");
        setField(term300265, term300265.getClass(), "bridgeEffect", enum927);
        setField(term300404, term300404.getClass(), "songName", "vTqdPzKttw");
        setField(term300404, term300404.getClass(), "author", "UaULhxzYkE");
        setField(term300404, term300404.getClass(), "fileName", "DkwiMryAQU");
        setBooleanField(term300404, term300404.getClass(), "custom", false);
        setIntField(term300404, term300404.getClass(), "fadingLimit", 2091907097);
        setField(term300265, term300265.getClass(), "diplomacyMusic", term300404);
        setField(term300265, term300265.getClass(), "traits", term300443);
        setField(term300265, term300265.getClass(), "leaderNameGenerator", enum928);
        setField(term300265, term300265.getClass(), "description", "OzqbIrAqJB");
        setField(term300265, term300265.getClass(), "spaceRaceType", enum929);
        Class<? extends Object> term302645 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term302644 = ((Class) term302645).getDeclaredField((String) "EQUAL");
        ((Field) term302644).setAccessible(true);
        enum930 = ((Field) term302644).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.race.SpaceRace");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.race.SocialSystem");
        Object[] args = new Object[1];
        args[0] = enum930;
        callMethod(klass, "setSocialSystem", argTypes, term300265, args);
    }

};


