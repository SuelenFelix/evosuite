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

public class SpaceRace_getName_170207878117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term260695;

    public SpaceRace_getName_170207878117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term260962 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term260961 = ((Class) term260962).getDeclaredField((String) "BACKSTABBING");
        ((Field) term260961).setAccessible(true);
        Object enum795 = ((Field) term260961).get((Object) null);
        Class<? extends Object> term261265 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term261264 = ((Class) term261265).getDeclaredField((String) "PATRIARCHY");
        ((Field) term261264).setAccessible(true);
        Object enum796 = ((Field) term261264).get((Object) null);
        Class<? extends Object> term261527 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term261526 = ((Class) term261527).getDeclaredField((String) "FEMALE");
        ((Field) term261526).setAccessible(true);
        Object enum797 =  ((Field) term261526).get((Object) null);
        Class<? extends Object> term261757 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term261756 = ((Class) term261757).getDeclaredField((String) "NONE");
        ((Field) term261756).setAccessible(true);
        Object enum798 =  ((Field) term261756).get((Object) null);
        Class<? extends Object> term261981 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term261980 = ((Class) term261981).getDeclaredField((String) "MALE");
        ((Field) term261980).setAccessible(true);
        Object enum799 =  ((Field) term261980).get((Object) null);
        ArrayList term260798 = new ArrayList();
        ((ArrayList) term260798).add(enum797);
        ((ArrayList) term260798).add(enum798);
        ((ArrayList) term260798).add(enum799);
        ((ArrayList) term260798).add(enum797);
        ((ArrayList) term260798).add(enum797);
        ((ArrayList) term260798).add(enum799);
        ((ArrayList) term260798).add(enum797);
        Class<? extends Object> term262215 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term262214 = ((Class) term262215).getDeclaredField((String) "JUNGLE");
        ((Field) term262214).setAccessible(true);
        Object enum800 = ((Field) term262214).get((Object) null);
        ArrayList term260875 = new ArrayList();
        Class<? extends Object> term262500 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term262499 = ((Class) term262500).getDeclaredField((String) "DEEP_ANCIENT_MONSTER");
        ((Field) term262499).setAccessible(true);
        Object enum801 = ((Field) term262499).get((Object) null);
        Class<? extends Object> term262837 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term262836 = ((Class) term262837).getDeclaredField((String) "SPACE_PIRATE");
        ((Field) term262836).setAccessible(true);
        Object enum802 = ((Field) term262836).get((Object) null);
        term260695 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term260836 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term260695, term260695.getClass(), "id", "FMSzTGVPul");
        setField(term260695, term260695.getClass(), "name", "qSFkTIyPfh");
        setField(term260695, term260695.getClass(), "nameSingle", "tbYTpFYzqZ");
        setField(term260695, term260695.getClass(), "attitude", enum795);
        setField(term260695, term260695.getClass(), "imagePath", "BNLfzlakIC");
        setField(term260695, term260695.getClass(), "bridgeId", "nzqaGEtJND");
        setField(term260695, term260695.getClass(), "spaceShipId", "XXuiaNeQqM");
        setField(term260695, term260695.getClass(), "socialSystem", enum796);
        setField(term260695, term260695.getClass(), "genderList", term260798);
        setField(term260695, term260695.getClass(), "speechSetId", "zuNZswjwvh");
        setField(term260695, term260695.getClass(), "bridgeEffect", enum800);
        setField(term260836, term260836.getClass(), "songName", "CUwtHZSXXF");
        setField(term260836, term260836.getClass(), "author", "KnZpIapfph");
        setField(term260836, term260836.getClass(), "fileName", "OKSBlBxAMS");
        setBooleanField(term260836, term260836.getClass(), "custom", false);
        setIntField(term260836, term260836.getClass(), "fadingLimit", 1802709528);
        setField(term260695, term260695.getClass(), "diplomacyMusic", term260836);
        setField(term260695, term260695.getClass(), "traits", term260875);
        setField(term260695, term260695.getClass(), "leaderNameGenerator", enum801);
        setField(term260695, term260695.getClass(), "description", "TVSQWqAGgr");
        setField(term260695, term260695.getClass(), "spaceRaceType", enum802);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.race.SpaceRace");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term260695, args);
    }

};


