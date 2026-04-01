package org.openRealmOfStars.player.tech;

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
import static org.openRealmOfStars.player.tech.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class TechList_init_1612106230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term200489;

    public TechList_init_1612106230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term200802 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term200801 = ((Class) term200802).getDeclaredField((String) "BACKSTABBING");
        ((Field) term200801).setAccessible(true);
        Object enum607 = ((Field) term200801).get((Object) null);
        Class<? extends Object> term201105 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term201104 = ((Class) term201105).getDeclaredField((String) "PATRIARCHY");
        ((Field) term201104).setAccessible(true);
        Object enum608 = ((Field) term201104).get((Object) null);
        Class<? extends Object> term201367 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term201366 = ((Class) term201367).getDeclaredField((String) "MALE");
        ((Field) term201366).setAccessible(true);
        Object enum609 =  ((Field) term201366).get((Object) null);
        ArrayList term200592 = new ArrayList();
        ((ArrayList) term200592).add(enum609);
        Class<? extends Object> term201601 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term201600 = ((Class) term201601).getDeclaredField((String) "SPACE_CONSOLE2");
        ((Field) term201600).setAccessible(true);
        Object enum610 = ((Field) term201600).get((Object) null);
        ArrayList term200676 = new ArrayList();
        ((ArrayList) term200676).add((Object)null);
        ((ArrayList) term200676).add((Object)null);
        ((ArrayList) term200676).add((Object)null);
        ((ArrayList) term200676).add((Object)null);
        ((ArrayList) term200676).add((Object)null);
        ((ArrayList) term200676).add((Object)null);
        ((ArrayList) term200676).add((Object)null);
        ((ArrayList) term200676).add((Object)null);
        ((ArrayList) term200676).add((Object)null);
        Object term200671 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term200671, term200671.getClass(), "traitId", "");
        setField(term200671, term200671.getClass(), "traitName", "");
        setField(term200671, term200671.getClass(), "description", "");
        setField(term200671, term200671.getClass(), "group", "");
        setField(term200671, term200671.getClass(), "conflictsWithIds", term200676);
        setByteField(term200671, term200671.getClass(), "traitPoints", (byte) -105);
        ArrayList term200685 = new ArrayList();
        ((ArrayList) term200685).add((Object)null);
        ((ArrayList) term200685).add((Object)null);
        ((ArrayList) term200685).add((Object)null);
        ((ArrayList) term200685).add((Object)null);
        ((ArrayList) term200685).add((Object)null);
        ((ArrayList) term200685).add((Object)null);
        Object term200680 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term200680, term200680.getClass(), "traitId", "");
        setField(term200680, term200680.getClass(), "traitName", "");
        setField(term200680, term200680.getClass(), "description", "");
        setField(term200680, term200680.getClass(), "group", "");
        setField(term200680, term200680.getClass(), "conflictsWithIds", term200685);
        setByteField(term200680, term200680.getClass(), "traitPoints", (byte) 35);
        ArrayList term200694 = new ArrayList();
        ((ArrayList) term200694).add((Object)null);
        ((ArrayList) term200694).add((Object)null);
        ((ArrayList) term200694).add((Object)null);
        ((ArrayList) term200694).add((Object)null);
        ((ArrayList) term200694).add((Object)null);
        ((ArrayList) term200694).add((Object)null);
        Object term200689 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term200689, term200689.getClass(), "traitId", "");
        setField(term200689, term200689.getClass(), "traitName", "");
        setField(term200689, term200689.getClass(), "description", "");
        setField(term200689, term200689.getClass(), "group", "");
        setField(term200689, term200689.getClass(), "conflictsWithIds", term200694);
        setByteField(term200689, term200689.getClass(), "traitPoints", (byte) -80);
        ArrayList term200703 = new ArrayList();
        Object term200698 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term200698, term200698.getClass(), "traitId", "");
        setField(term200698, term200698.getClass(), "traitName", "");
        setField(term200698, term200698.getClass(), "description", "");
        setField(term200698, term200698.getClass(), "group", "");
        setField(term200698, term200698.getClass(), "conflictsWithIds", term200703);
        setByteField(term200698, term200698.getClass(), "traitPoints", (byte) 96);
        ArrayList term200712 = new ArrayList();
        ((ArrayList) term200712).add((Object)null);
        ((ArrayList) term200712).add((Object)null);
        ((ArrayList) term200712).add((Object)null);
        ((ArrayList) term200712).add((Object)null);
        Object term200707 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term200707, term200707.getClass(), "traitId", "");
        setField(term200707, term200707.getClass(), "traitName", "");
        setField(term200707, term200707.getClass(), "description", "");
        setField(term200707, term200707.getClass(), "group", "");
        setField(term200707, term200707.getClass(), "conflictsWithIds", term200712);
        setByteField(term200707, term200707.getClass(), "traitPoints", (byte) -66);
        ArrayList term200721 = new ArrayList();
        ((ArrayList) term200721).add((Object)null);
        ((ArrayList) term200721).add((Object)null);
        ((ArrayList) term200721).add((Object)null);
        ((ArrayList) term200721).add((Object)null);
        ((ArrayList) term200721).add((Object)null);
        Object term200716 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term200716, term200716.getClass(), "traitId", "");
        setField(term200716, term200716.getClass(), "traitName", "");
        setField(term200716, term200716.getClass(), "description", "");
        setField(term200716, term200716.getClass(), "group", "");
        setField(term200716, term200716.getClass(), "conflictsWithIds", term200721);
        setByteField(term200716, term200716.getClass(), "traitPoints", (byte) 109);
        ArrayList term200730 = new ArrayList();
        ((ArrayList) term200730).add((Object)null);
        ((ArrayList) term200730).add((Object)null);
        ((ArrayList) term200730).add((Object)null);
        ((ArrayList) term200730).add((Object)null);
        ((ArrayList) term200730).add((Object)null);
        Object term200725 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term200725, term200725.getClass(), "traitId", "");
        setField(term200725, term200725.getClass(), "traitName", "");
        setField(term200725, term200725.getClass(), "description", "");
        setField(term200725, term200725.getClass(), "group", "");
        setField(term200725, term200725.getClass(), "conflictsWithIds", term200730);
        setByteField(term200725, term200725.getClass(), "traitPoints", (byte) -44);
        ArrayList term200669 = new ArrayList();
        ((ArrayList) term200669).add(term200671);
        ((ArrayList) term200669).add(term200680);
        ((ArrayList) term200669).add(term200689);
        ((ArrayList) term200669).add(term200698);
        ((ArrayList) term200669).add(term200707);
        ((ArrayList) term200669).add(term200716);
        ((ArrayList) term200669).add(term200725);
        Class<? extends Object> term201910 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term201909 = ((Class) term201910).getDeclaredField((String) "ALL");
        ((Field) term201909).setAccessible(true);
        Object enum611 = ((Field) term201909).get((Object) null);
        Class<? extends Object> term202196 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term202195 = ((Class) term202196).getDeclaredField((String) "SPACE_PIRATE");
        ((Field) term202195).setAccessible(true);
        Object enum612 = ((Field) term202195).get((Object) null);
        term200489 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term200630 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term200489, term200489.getClass(), "id", "eOSkqEXcaE");
        setField(term200489, term200489.getClass(), "name", "MAHSuEBjDv");
        setField(term200489, term200489.getClass(), "nameSingle", "FJPRnSrJmK");
        setField(term200489, term200489.getClass(), "attitude", enum607);
        setField(term200489, term200489.getClass(), "imagePath", "fYRcUEKErh");
        setField(term200489, term200489.getClass(), "bridgeId", "ObBNcwkdKb");
        setField(term200489, term200489.getClass(), "spaceShipId", "bbKtLbiXSm");
        setField(term200489, term200489.getClass(), "socialSystem", enum608);
        setField(term200489, term200489.getClass(), "genderList", term200592);
        setField(term200489, term200489.getClass(), "speechSetId", "AYcehuoFwZ");
        setField(term200489, term200489.getClass(), "bridgeEffect", enum610);
        setField(term200630, term200630.getClass(), "songName", "MkKeGpajFk");
        setField(term200630, term200630.getClass(), "author", "JhIjEseRRP");
        setField(term200630, term200630.getClass(), "fileName", "qlzeNoUsis");
        setBooleanField(term200630, term200630.getClass(), "custom", false);
        setIntField(term200630, term200630.getClass(), "fadingLimit", 1485731037);
        setField(term200489, term200489.getClass(), "diplomacyMusic", term200630);
        setField(term200489, term200489.getClass(), "traits", term200669);
        setField(term200489, term200489.getClass(), "leaderNameGenerator", enum611);
        setField(term200489, term200489.getClass(), "description", "sOlEVEhJBz");
        setField(term200489, term200489.getClass(), "spaceRaceType", enum612);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.tech.TechList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.race.SpaceRace");
        Object[] args = new Object[1];
        args[0] = term200489;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


