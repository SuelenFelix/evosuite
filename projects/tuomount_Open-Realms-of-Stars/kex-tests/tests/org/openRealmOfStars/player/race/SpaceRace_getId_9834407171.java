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

public class SpaceRace_getId_9834407171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term224878;

    public SpaceRace_getId_9834407171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term225132 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term225131 = ((Class) term225132).getDeclaredField((String) "SCIENTIFIC");
        ((Field) term225131).setAccessible(true);
        Object enum680 = ((Field) term225131).get((Object) null);
        Class<? extends Object> term225429 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term225428 = ((Class) term225429).getDeclaredField((String) "PATRIARCHY");
        ((Field) term225428).setAccessible(true);
        Object enum681 = ((Field) term225428).get((Object) null);
        Class<? extends Object> term225691 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term225690 = ((Class) term225691).getDeclaredField((String) "NONE");
        ((Field) term225690).setAccessible(true);
        Object enum682 =  ((Field) term225690).get((Object) null);
        Class<? extends Object> term225915 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term225914 = ((Class) term225915).getDeclaredField((String) "MALE");
        ((Field) term225914).setAccessible(true);
        Object enum683 =  ((Field) term225914).get((Object) null);
        Class<? extends Object> term226139 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term226138 = ((Class) term226139).getDeclaredField((String) "MALE");
        ((Field) term226138).setAccessible(true);
        Object enum684 =  ((Field) term226138).get((Object) null);
        ArrayList term224979 = new ArrayList();
        ((ArrayList) term224979).add(enum682);
        ((ArrayList) term224979).add(enum683);
        ((ArrayList) term224979).add(enum684);
        Class<? extends Object> term226373 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term226372 = ((Class) term226373).getDeclaredField((String) "TEST");
        ((Field) term226372).setAccessible(true);
        Object enum685 = ((Field) term226372).get((Object) null);
        ArrayList term225054 = new ArrayList();
        Class<? extends Object> term226652 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term226651 = ((Class) term226652).getDeclaredField((String) "SCIFI_HUMAN");
        ((Field) term226651).setAccessible(true);
        Object enum686 = ((Field) term226651).get((Object) null);
        Class<? extends Object> term226962 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term226961 = ((Class) term226962).getDeclaredField((String) "SPACE_PIRATE");
        ((Field) term226961).setAccessible(true);
        Object enum687 = ((Field) term226961).get((Object) null);
        term224878 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term225015 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term224878, term224878.getClass(), "id", "CrwhMcTxfa");
        setField(term224878, term224878.getClass(), "name", "HqjOaRqVoo");
        setField(term224878, term224878.getClass(), "nameSingle", "HouDaCvEOJ");
        setField(term224878, term224878.getClass(), "attitude", enum680);
        setField(term224878, term224878.getClass(), "imagePath", "OkSXzntFXp");
        setField(term224878, term224878.getClass(), "bridgeId", "krvvLzcVhh");
        setField(term224878, term224878.getClass(), "spaceShipId", "rUsEwvlLpO");
        setField(term224878, term224878.getClass(), "socialSystem", enum681);
        setField(term224878, term224878.getClass(), "genderList", term224979);
        setField(term224878, term224878.getClass(), "speechSetId", "UWZEdfWFvS");
        setField(term224878, term224878.getClass(), "bridgeEffect", enum685);
        setField(term225015, term225015.getClass(), "songName", "AOOxoUEqxT");
        setField(term225015, term225015.getClass(), "author", "sbHglfuJyn");
        setField(term225015, term225015.getClass(), "fileName", "hjKMxDKUku");
        setBooleanField(term225015, term225015.getClass(), "custom", false);
        setIntField(term225015, term225015.getClass(), "fadingLimit", 61264180);
        setField(term224878, term224878.getClass(), "diplomacyMusic", term225015);
        setField(term224878, term224878.getClass(), "traits", term225054);
        setField(term224878, term224878.getClass(), "leaderNameGenerator", enum686);
        setField(term224878, term224878.getClass(), "description", "bAkWQIpVFz");
        setField(term224878, term224878.getClass(), "spaceRaceType", enum687);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.race.SpaceRace");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term224878, args);
    }

};


