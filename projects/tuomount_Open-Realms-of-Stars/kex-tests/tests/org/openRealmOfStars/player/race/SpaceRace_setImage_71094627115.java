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

public class SpaceRace_setImage_71094627115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term256087;

    public SpaceRace_setImage_71094627115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term256382 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term256381 = ((Class) term256382).getDeclaredField((String) "SCIENTIFIC");
        ((Field) term256381).setAccessible(true);
        Object enum780 = ((Field) term256381).get((Object) null);
        Class<? extends Object> term256679 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term256678 = ((Class) term256679).getDeclaredField((String) "PATRIARCHY");
        ((Field) term256678).setAccessible(true);
        Object enum781 = ((Field) term256678).get((Object) null);
        Class<? extends Object> term256941 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term256940 = ((Class) term256941).getDeclaredField((String) "MALE");
        ((Field) term256940).setAccessible(true);
        Object enum782 =  ((Field) term256940).get((Object) null);
        Class<? extends Object> term257165 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term257164 = ((Class) term257165).getDeclaredField((String) "NONE");
        ((Field) term257164).setAccessible(true);
        Object enum783 =  ((Field) term257164).get((Object) null);
        Class<? extends Object> term257389 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term257388 = ((Class) term257389).getDeclaredField((String) "MALE");
        ((Field) term257388).setAccessible(true);
        Object enum784 =  ((Field) term257388).get((Object) null);
        ArrayList term256188 = new ArrayList();
        ((ArrayList) term256188).add(enum782);
        ((ArrayList) term256188).add(enum782);
        ((ArrayList) term256188).add(enum783);
        ((ArrayList) term256188).add(enum784);
        ((ArrayList) term256188).add(enum782);
        ((ArrayList) term256188).add(enum783);
        ((ArrayList) term256188).add(enum783);
        ((ArrayList) term256188).add(enum784);
        ((ArrayList) term256188).add(enum783);
        Class<? extends Object> term257623 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term257622 = ((Class) term257623).getDeclaredField((String) "PURPLE_DREAM");
        ((Field) term257622).setAccessible(true);
        Object enum785 = ((Field) term257622).get((Object) null);
        ArrayList term256278 = new ArrayList();
        ((ArrayList) term256278).add((Object)null);
        ((ArrayList) term256278).add((Object)null);
        ((ArrayList) term256278).add((Object)null);
        ((ArrayList) term256278).add((Object)null);
        ((ArrayList) term256278).add((Object)null);
        Object term256273 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term256273, term256273.getClass(), "traitId", "");
        setField(term256273, term256273.getClass(), "traitName", "");
        setField(term256273, term256273.getClass(), "description", "");
        setField(term256273, term256273.getClass(), "group", "");
        setField(term256273, term256273.getClass(), "conflictsWithIds", term256278);
        setByteField(term256273, term256273.getClass(), "traitPoints", (byte) 119);
        ArrayList term256287 = new ArrayList();
        ((ArrayList) term256287).add((Object)null);
        ((ArrayList) term256287).add((Object)null);
        ((ArrayList) term256287).add((Object)null);
        ((ArrayList) term256287).add((Object)null);
        ((ArrayList) term256287).add((Object)null);
        ((ArrayList) term256287).add((Object)null);
        ((ArrayList) term256287).add((Object)null);
        ((ArrayList) term256287).add((Object)null);
        Object term256282 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term256282, term256282.getClass(), "traitId", "");
        setField(term256282, term256282.getClass(), "traitName", "");
        setField(term256282, term256282.getClass(), "description", "");
        setField(term256282, term256282.getClass(), "group", "");
        setField(term256282, term256282.getClass(), "conflictsWithIds", term256287);
        setByteField(term256282, term256282.getClass(), "traitPoints", (byte) -20);
        ArrayList term256271 = new ArrayList();
        ((ArrayList) term256271).add(term256273);
        ((ArrayList) term256271).add(term256282);
        Class<? extends Object> term257926 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term257925 = ((Class) term257926).getDeclaredField((String) "ANCIENT_NORDIC");
        ((Field) term257925).setAccessible(true);
        Object enum786 = ((Field) term257925).get((Object) null);
        Class<? extends Object> term258245 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term258244 = ((Class) term258245).getDeclaredField((String) "SPACE_PIRATE");
        ((Field) term258244).setAccessible(true);
        Object enum787 = ((Field) term258244).get((Object) null);
        term256087 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term256232 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term256087, term256087.getClass(), "id", "uBqCFlJFKn");
        setField(term256087, term256087.getClass(), "name", "CdWGcgAUBN");
        setField(term256087, term256087.getClass(), "nameSingle", "yShXFHBMjq");
        setField(term256087, term256087.getClass(), "attitude", enum780);
        setField(term256087, term256087.getClass(), "imagePath", "PvSoEnEttM");
        setField(term256087, term256087.getClass(), "bridgeId", "uMrJeSSvdc");
        setField(term256087, term256087.getClass(), "spaceShipId", "pRVgwFARqj");
        setField(term256087, term256087.getClass(), "socialSystem", enum781);
        setField(term256087, term256087.getClass(), "genderList", term256188);
        setField(term256087, term256087.getClass(), "speechSetId", "mpLqtxGrAU");
        setField(term256087, term256087.getClass(), "bridgeEffect", enum785);
        setField(term256232, term256232.getClass(), "songName", "JKBkexwJQQ");
        setField(term256232, term256232.getClass(), "author", "GPXGjAdtoJ");
        setField(term256232, term256232.getClass(), "fileName", "rpotsMWMJb");
        setBooleanField(term256232, term256232.getClass(), "custom", true);
        setIntField(term256232, term256232.getClass(), "fadingLimit", 100573346);
        setField(term256087, term256087.getClass(), "diplomacyMusic", term256232);
        setField(term256087, term256087.getClass(), "traits", term256271);
        setField(term256087, term256087.getClass(), "leaderNameGenerator", enum786);
        setField(term256087, term256087.getClass(), "description", "vgahNbDKFu");
        setField(term256087, term256087.getClass(), "spaceRaceType", enum787);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.race.SpaceRace");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jwGtShAOZR";
        callMethod(klass, "setImage", argTypes, term256087, args);
    }

};


