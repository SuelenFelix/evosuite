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

public class SavedGame_getPlayerRace_12693806521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term229344;

    public SavedGame_getPlayerRace_12693806521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term229655 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term229654 = ((Class) term229655).getDeclaredField((String) "SCIENTIFIC");
        ((Field) term229654).setAccessible(true);
        Object enum359 = ((Field) term229654).get((Object) null);
        Class<? extends Object> term229952 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term229951 = ((Class) term229952).getDeclaredField((String) "EQUAL");
        ((Field) term229951).setAccessible(true);
        Object enum360 = ((Field) term229951).get((Object) null);
        Class<? extends Object> term230199 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term230198 = ((Class) term230199).getDeclaredField((String) "NONE");
        ((Field) term230198).setAccessible(true);
        Object enum361 =  ((Field) term230198).get((Object) null);
        Class<? extends Object> term230423 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term230422 = ((Class) term230423).getDeclaredField((String) "NONE");
        ((Field) term230422).setAccessible(true);
        Object enum362 =  ((Field) term230422).get((Object) null);
        Class<? extends Object> term230647 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term230646 = ((Class) term230647).getDeclaredField((String) "MALE");
        ((Field) term230646).setAccessible(true);
        Object enum363 =  ((Field) term230646).get((Object) null);
        ArrayList term229441 = new ArrayList();
        ((ArrayList) term229441).add(enum361);
        ((ArrayList) term229441).add(enum362);
        ((ArrayList) term229441).add(enum363);
        ((ArrayList) term229441).add(enum363);
        ((ArrayList) term229441).add(enum362);
        ((ArrayList) term229441).add(enum361);
        ((ArrayList) term229441).add(enum362);
        Class<? extends Object> term230881 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term230880 = ((Class) term230881).getDeclaredField((String) "FUNGUS");
        ((Field) term230880).setAccessible(true);
        Object enum364 = ((Field) term230880).get((Object) null);
        Object term229517 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term229517, term229517.getClass(), "traitId", null);
        setField(term229517, term229517.getClass(), "traitName", null);
        setField(term229517, term229517.getClass(), "description", null);
        setField(term229517, term229517.getClass(), "group", null);
        setField(term229517, term229517.getClass(), "conflictsWithIds", null);
        setByteField(term229517, term229517.getClass(), "traitPoints", (byte) 84);
        Object term229519 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term229519, term229519.getClass(), "traitId", null);
        setField(term229519, term229519.getClass(), "traitName", null);
        setField(term229519, term229519.getClass(), "description", null);
        setField(term229519, term229519.getClass(), "group", null);
        setField(term229519, term229519.getClass(), "conflictsWithIds", null);
        setByteField(term229519, term229519.getClass(), "traitPoints", (byte) 38);
        Object term229521 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term229521, term229521.getClass(), "traitId", null);
        setField(term229521, term229521.getClass(), "traitName", null);
        setField(term229521, term229521.getClass(), "description", null);
        setField(term229521, term229521.getClass(), "group", null);
        setField(term229521, term229521.getClass(), "conflictsWithIds", null);
        setByteField(term229521, term229521.getClass(), "traitPoints", (byte) 126);
        Object term229523 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term229523, term229523.getClass(), "traitId", null);
        setField(term229523, term229523.getClass(), "traitName", null);
        setField(term229523, term229523.getClass(), "description", null);
        setField(term229523, term229523.getClass(), "group", null);
        setField(term229523, term229523.getClass(), "conflictsWithIds", null);
        setByteField(term229523, term229523.getClass(), "traitPoints", (byte) -47);
        Object term229525 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term229525, term229525.getClass(), "traitId", null);
        setField(term229525, term229525.getClass(), "traitName", null);
        setField(term229525, term229525.getClass(), "description", null);
        setField(term229525, term229525.getClass(), "group", null);
        setField(term229525, term229525.getClass(), "conflictsWithIds", null);
        setByteField(term229525, term229525.getClass(), "traitPoints", (byte) 63);
        Object term229527 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term229527, term229527.getClass(), "traitId", null);
        setField(term229527, term229527.getClass(), "traitName", null);
        setField(term229527, term229527.getClass(), "description", null);
        setField(term229527, term229527.getClass(), "group", null);
        setField(term229527, term229527.getClass(), "conflictsWithIds", null);
        setByteField(term229527, term229527.getClass(), "traitPoints", (byte) 10);
        Object term229529 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term229529, term229529.getClass(), "traitId", null);
        setField(term229529, term229529.getClass(), "traitName", null);
        setField(term229529, term229529.getClass(), "description", null);
        setField(term229529, term229529.getClass(), "group", null);
        setField(term229529, term229529.getClass(), "conflictsWithIds", null);
        setByteField(term229529, term229529.getClass(), "traitPoints", (byte) 62);
        Object term229531 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term229531, term229531.getClass(), "traitId", null);
        setField(term229531, term229531.getClass(), "traitName", null);
        setField(term229531, term229531.getClass(), "description", null);
        setField(term229531, term229531.getClass(), "group", null);
        setField(term229531, term229531.getClass(), "conflictsWithIds", null);
        setByteField(term229531, term229531.getClass(), "traitPoints", (byte) 115);
        ArrayList term229515 = new ArrayList();
        ((ArrayList) term229515).add(term229517);
        ((ArrayList) term229515).add(term229519);
        ((ArrayList) term229515).add(term229521);
        ((ArrayList) term229515).add(term229523);
        ((ArrayList) term229515).add(term229525);
        ((ArrayList) term229515).add(term229527);
        ((ArrayList) term229515).add(term229529);
        ((ArrayList) term229515).add(term229531);
        Class<? extends Object> term231166 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term231165 = ((Class) term231166).getDeclaredField((String) "ROBOT");
        ((Field) term231165).setAccessible(true);
        Object enum365 = ((Field) term231165).get((Object) null);
        Class<? extends Object> term231458 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term231457 = ((Class) term231458).getDeclaredField((String) "SPACE_MONSTER");
        ((Field) term231457).setAccessible(true);
        Object enum366 = ((Field) term231457).get((Object) null);
        term229344 = newInstance(Class.forName("org.openRealmOfStars.game.SavedGame"));
        Object term229345 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term229476 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term229345, term229345.getClass(), "id", "nyZemBzxeX");
        setField(term229345, term229345.getClass(), "name", "mYUsMDfwJF");
        setField(term229345, term229345.getClass(), "nameSingle", "IYNumeLuJm");
        setField(term229345, term229345.getClass(), "attitude", enum359);
        setField(term229345, term229345.getClass(), "imagePath", "baWqGUwddd");
        setField(term229345, term229345.getClass(), "bridgeId", "ytUYpWefdA");
        setField(term229345, term229345.getClass(), "spaceShipId", "fdBtFIcFIQ");
        setField(term229345, term229345.getClass(), "socialSystem", enum360);
        setField(term229345, term229345.getClass(), "genderList", term229441);
        setField(term229345, term229345.getClass(), "speechSetId", "XixxNbivtN");
        setField(term229345, term229345.getClass(), "bridgeEffect", enum364);
        setField(term229476, term229476.getClass(), "songName", "wOXNBqWiix");
        setField(term229476, term229476.getClass(), "author", "inGpCNlqqu");
        setField(term229476, term229476.getClass(), "fileName", "PzAzTtIUoU");
        setBooleanField(term229476, term229476.getClass(), "custom", false);
        setIntField(term229476, term229476.getClass(), "fadingLimit", 304959828);
        setField(term229345, term229345.getClass(), "diplomacyMusic", term229476);
        setField(term229345, term229345.getClass(), "traits", term229515);
        setField(term229345, term229345.getClass(), "leaderNameGenerator", enum365);
        setField(term229345, term229345.getClass(), "description", "RmHGsfbaBq");
        setField(term229345, term229345.getClass(), "spaceRaceType", enum366);
        setField(term229344, term229344.getClass(), "playerRace", term229345);
        setIntField(term229344, term229344.getClass(), "starYear", -398737037);
        setIntField(term229344, term229344.getClass(), "realms", 108801223);
        setField(term229344, term229344.getClass(), "galaxySize", "RSDlfIpFkY");
        setField(term229344, term229344.getClass(), "filename", "ZaTowywgws");
        setField(term229344, term229344.getClass(), "empireName", "XPrRiBUedX");
        setField(term229344, term229344.getClass(), "creationTime", "kultXgiMsw");
        setLongField(term229344, term229344.getClass(), "creationTimeMillis", 8428634514691209827L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.SavedGame");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayerRace", argTypes, term229344, args);
    }

};


