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

public class SavedGame_getStarYear_6202354972 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term231773;

    public SavedGame_getStarYear_6202354972() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term232075 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term232074 = ((Class) term232075).getDeclaredField((String) "SCIENTIFIC");
        ((Field) term232074).setAccessible(true);
        Object enum367 = ((Field) term232074).get((Object) null);
        Class<? extends Object> term232372 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term232371 = ((Class) term232372).getDeclaredField((String) "PATRIARCHY");
        ((Field) term232371).setAccessible(true);
        Object enum368 = ((Field) term232371).get((Object) null);
        Class<? extends Object> term232634 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term232633 = ((Class) term232634).getDeclaredField((String) "MALE");
        ((Field) term232633).setAccessible(true);
        Object enum369 =  ((Field) term232633).get((Object) null);
        Class<? extends Object> term232858 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term232857 = ((Class) term232858).getDeclaredField((String) "NONE");
        ((Field) term232857).setAccessible(true);
        Object enum370 =  ((Field) term232857).get((Object) null);
        ArrayList term231875 = new ArrayList();
        ((ArrayList) term231875).add(enum369);
        ((ArrayList) term231875).add(enum370);
        ((ArrayList) term231875).add(enum370);
        Class<? extends Object> term233092 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term233091 = ((Class) term233092).getDeclaredField((String) "PURPLE_DREAM");
        ((Field) term233091).setAccessible(true);
        Object enum371 = ((Field) term233091).get((Object) null);
        ArrayList term231952 = new ArrayList();
        Class<? extends Object> term233395 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term233394 = ((Class) term233395).getDeclaredField((String) "ROBOT");
        ((Field) term233394).setAccessible(true);
        Object enum372 = ((Field) term233394).get((Object) null);
        Class<? extends Object> term233687 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term233686 = ((Class) term233687).getDeclaredField((String) "SPACE_PIRATE");
        ((Field) term233686).setAccessible(true);
        Object enum373 = ((Field) term233686).get((Object) null);
        term231773 = newInstance(Class.forName("org.openRealmOfStars.game.SavedGame"));
        Object term231774 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term231913 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term231774, term231774.getClass(), "id", "invWIgTrSn");
        setField(term231774, term231774.getClass(), "name", "tdDWYXQBpB");
        setField(term231774, term231774.getClass(), "nameSingle", "yLbSZvdjZX");
        setField(term231774, term231774.getClass(), "attitude", enum367);
        setField(term231774, term231774.getClass(), "imagePath", "FhCGxrukXm");
        setField(term231774, term231774.getClass(), "bridgeId", "KAmjFnlvKU");
        setField(term231774, term231774.getClass(), "spaceShipId", "VKpNTpPbui");
        setField(term231774, term231774.getClass(), "socialSystem", enum368);
        setField(term231774, term231774.getClass(), "genderList", term231875);
        setField(term231774, term231774.getClass(), "speechSetId", "TuzuoEoycc");
        setField(term231774, term231774.getClass(), "bridgeEffect", enum371);
        setField(term231913, term231913.getClass(), "songName", "LXWldHIZNy");
        setField(term231913, term231913.getClass(), "author", "BATrPAXgpa");
        setField(term231913, term231913.getClass(), "fileName", "vgwMeHgaql");
        setBooleanField(term231913, term231913.getClass(), "custom", true);
        setIntField(term231913, term231913.getClass(), "fadingLimit", 1181798962);
        setField(term231774, term231774.getClass(), "diplomacyMusic", term231913);
        setField(term231774, term231774.getClass(), "traits", term231952);
        setField(term231774, term231774.getClass(), "leaderNameGenerator", enum372);
        setField(term231774, term231774.getClass(), "description", "apRNMfAeJs");
        setField(term231774, term231774.getClass(), "spaceRaceType", enum373);
        setField(term231773, term231773.getClass(), "playerRace", term231774);
        setIntField(term231773, term231773.getClass(), "starYear", 1950935768);
        setIntField(term231773, term231773.getClass(), "realms", -733715380);
        setField(term231773, term231773.getClass(), "galaxySize", "xXjFLOrnwn");
        setField(term231773, term231773.getClass(), "filename", "EwHXheApdJ");
        setField(term231773, term231773.getClass(), "empireName", "FSxGuVZthC");
        setField(term231773, term231773.getClass(), "creationTime", "vZxqxBKdGD");
        setLongField(term231773, term231773.getClass(), "creationTimeMillis", -2585684163342970173L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.SavedGame");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStarYear", argTypes, term231773, args);
    }

};


