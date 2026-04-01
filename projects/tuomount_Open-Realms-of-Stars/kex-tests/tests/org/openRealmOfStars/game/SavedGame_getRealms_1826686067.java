package org.openRealmOfStars.game;

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
import static org.openRealmOfStars.game.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;

public class SavedGame_getRealms_1826686067 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term243694;

    public SavedGame_getRealms_1826686067() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term244018 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term244017 = ((Class) term244018).getDeclaredField((String) "BACKSTABBING");
        ((Field) term244017).setAccessible(true);
        Object enum405 = ((Field) term244017).get((Object) null);
        Class<? extends Object> term244321 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term244320 = ((Class) term244321).getDeclaredField((String) "MATRIARCHY");
        ((Field) term244320).setAccessible(true);
        Object enum406 = ((Field) term244320).get((Object) null);
        Class<? extends Object> term244583 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term244582 = ((Class) term244583).getDeclaredField((String) "FEMALE");
        ((Field) term244582).setAccessible(true);
        Object enum407 =  ((Field) term244582).get((Object) null);
        Class<? extends Object> term244813 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term244812 = ((Class) term244813).getDeclaredField((String) "FEMALE");
        ((Field) term244812).setAccessible(true);
        Object enum408 =  ((Field) term244812).get((Object) null);
        Class<? extends Object> term245043 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term245042 = ((Class) term245043).getDeclaredField((String) "MALE");
        ((Field) term245042).setAccessible(true);
        Object enum409 =  ((Field) term245042).get((Object) null);
        ArrayList term243798 = new ArrayList();
        ((ArrayList) term243798).add(enum407);
        ((ArrayList) term243798).add(enum408);
        ((ArrayList) term243798).add(enum408);
        ((ArrayList) term243798).add(enum407);
        ((ArrayList) term243798).add(enum407);
        ((ArrayList) term243798).add(enum409);
        ((ArrayList) term243798).add(enum407);
        ((ArrayList) term243798).add(enum407);
        Class<? extends Object> term245277 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term245276 = ((Class) term245277).getDeclaredField((String) "SPACE_CONSOLE");
        ((Field) term245276).setAccessible(true);
        Object enum410 = ((Field) term245276).get((Object) null);
        Object term243881 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term243881, term243881.getClass(), "traitId", null);
        setField(term243881, term243881.getClass(), "traitName", null);
        setField(term243881, term243881.getClass(), "description", null);
        setField(term243881, term243881.getClass(), "group", null);
        setField(term243881, term243881.getClass(), "conflictsWithIds", null);
        setByteField(term243881, term243881.getClass(), "traitPoints", (byte) 65);
        Object term243883 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term243883, term243883.getClass(), "traitId", null);
        setField(term243883, term243883.getClass(), "traitName", null);
        setField(term243883, term243883.getClass(), "description", null);
        setField(term243883, term243883.getClass(), "group", null);
        setField(term243883, term243883.getClass(), "conflictsWithIds", null);
        setByteField(term243883, term243883.getClass(), "traitPoints", (byte) -125);
        Object term243885 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term243885, term243885.getClass(), "traitId", null);
        setField(term243885, term243885.getClass(), "traitName", null);
        setField(term243885, term243885.getClass(), "description", null);
        setField(term243885, term243885.getClass(), "group", null);
        setField(term243885, term243885.getClass(), "conflictsWithIds", null);
        setByteField(term243885, term243885.getClass(), "traitPoints", (byte) -126);
        Object term243887 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term243887, term243887.getClass(), "traitId", null);
        setField(term243887, term243887.getClass(), "traitName", null);
        setField(term243887, term243887.getClass(), "description", null);
        setField(term243887, term243887.getClass(), "group", null);
        setField(term243887, term243887.getClass(), "conflictsWithIds", null);
        setByteField(term243887, term243887.getClass(), "traitPoints", (byte) 80);
        Object term243889 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term243889, term243889.getClass(), "traitId", null);
        setField(term243889, term243889.getClass(), "traitName", null);
        setField(term243889, term243889.getClass(), "description", null);
        setField(term243889, term243889.getClass(), "group", null);
        setField(term243889, term243889.getClass(), "conflictsWithIds", null);
        setByteField(term243889, term243889.getClass(), "traitPoints", (byte) 118);
        Object term243891 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term243891, term243891.getClass(), "traitId", null);
        setField(term243891, term243891.getClass(), "traitName", null);
        setField(term243891, term243891.getClass(), "description", null);
        setField(term243891, term243891.getClass(), "group", null);
        setField(term243891, term243891.getClass(), "conflictsWithIds", null);
        setByteField(term243891, term243891.getClass(), "traitPoints", (byte) -116);
        ArrayList term243879 = new ArrayList();
        ((ArrayList) term243879).add(term243881);
        ((ArrayList) term243879).add(term243883);
        ((ArrayList) term243879).add(term243885);
        ((ArrayList) term243879).add(term243887);
        ((ArrayList) term243879).add(term243889);
        ((ArrayList) term243879).add(term243891);
        Class<? extends Object> term245583 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term245582 = ((Class) term245583).getDeclaredField((String) "ANCIENT_NORDIC");
        ((Field) term245582).setAccessible(true);
        Object enum411 = ((Field) term245582).get((Object) null);
        Class<? extends Object> term245902 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term245901 = ((Class) term245902).getDeclaredField((String) "REGULAR");
        ((Field) term245901).setAccessible(true);
        Object enum412 = ((Field) term245901).get((Object) null);
        term243694 = newInstance(Class.forName("org.openRealmOfStars.game.SavedGame"));
        Object term243695 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term243840 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term243695, term243695.getClass(), "id", "gHCWHtrKMj");
        setField(term243695, term243695.getClass(), "name", "sRhnTEwrac");
        setField(term243695, term243695.getClass(), "nameSingle", "JHOBLjcqST");
        setField(term243695, term243695.getClass(), "attitude", enum405);
        setField(term243695, term243695.getClass(), "imagePath", "SMOeUyvURd");
        setField(term243695, term243695.getClass(), "bridgeId", "FdqAMXxgBA");
        setField(term243695, term243695.getClass(), "spaceShipId", "amjxvUlDTF");
        setField(term243695, term243695.getClass(), "socialSystem", enum406);
        setField(term243695, term243695.getClass(), "genderList", term243798);
        setField(term243695, term243695.getClass(), "speechSetId", "homzrGHfwX");
        setField(term243695, term243695.getClass(), "bridgeEffect", enum410);
        setField(term243840, term243840.getClass(), "songName", "fIeNSTsisH");
        setField(term243840, term243840.getClass(), "author", "rsKcNOWfZH");
        setField(term243840, term243840.getClass(), "fileName", "NwcJhozXMr");
        setBooleanField(term243840, term243840.getClass(), "custom", true);
        setIntField(term243840, term243840.getClass(), "fadingLimit", 700386109);
        setField(term243695, term243695.getClass(), "diplomacyMusic", term243840);
        setField(term243695, term243695.getClass(), "traits", term243879);
        setField(term243695, term243695.getClass(), "leaderNameGenerator", enum411);
        setField(term243695, term243695.getClass(), "description", "fcmWxpNhDp");
        setField(term243695, term243695.getClass(), "spaceRaceType", enum412);
        setField(term243694, term243694.getClass(), "playerRace", term243695);
        setIntField(term243694, term243694.getClass(), "starYear", -2030563792);
        setIntField(term243694, term243694.getClass(), "realms", 659265799);
        setField(term243694, term243694.getClass(), "galaxySize", "eAuqPLqmIz");
        setField(term243694, term243694.getClass(), "filename", "jttexnFOYa");
        setField(term243694, term243694.getClass(), "empireName", "VTcNUeCrHP");
        setField(term243694, term243694.getClass(), "creationTime", "dRGHrevrGk");
        setLongField(term243694, term243694.getClass(), "creationTimeMillis", -7672528020740371001L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.SavedGame");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRealms", argTypes, term243694, args);
    }

};


