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

public class SavedGame_toString_13440145079 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term249690;

    public SavedGame_toString_13440145079() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term249997 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term249996 = ((Class) term249997).getDeclaredField((String) "DIPLOMATIC");
        ((Field) term249996).setAccessible(true);
        Object enum423 = ((Field) term249996).get((Object) null);
        Class<? extends Object> term250294 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term250293 = ((Class) term250294).getDeclaredField((String) "MATRIARCHY");
        ((Field) term250293).setAccessible(true);
        Object enum424 = ((Field) term250293).get((Object) null);
        Class<? extends Object> term250556 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term250555 = ((Class) term250556).getDeclaredField((String) "NONE");
        ((Field) term250555).setAccessible(true);
        Object enum425 =  ((Field) term250555).get((Object) null);
        Class<? extends Object> term250780 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term250779 = ((Class) term250780).getDeclaredField((String) "NONE");
        ((Field) term250779).setAccessible(true);
        Object enum426 =  ((Field) term250779).get((Object) null);
        ArrayList term249792 = new ArrayList();
        ((ArrayList) term249792).add(enum425);
        ((ArrayList) term249792).add(enum426);
        Class<? extends Object> term251014 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term251013 = ((Class) term251014).getDeclaredField((String) "RED_ALERT");
        ((Field) term251013).setAccessible(true);
        Object enum427 = ((Field) term251013).get((Object) null);
        Object term249868 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term249868, term249868.getClass(), "traitId", null);
        setField(term249868, term249868.getClass(), "traitName", null);
        setField(term249868, term249868.getClass(), "description", null);
        setField(term249868, term249868.getClass(), "group", null);
        setField(term249868, term249868.getClass(), "conflictsWithIds", null);
        setByteField(term249868, term249868.getClass(), "traitPoints", (byte) -84);
        Object term249870 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term249870, term249870.getClass(), "traitId", null);
        setField(term249870, term249870.getClass(), "traitName", null);
        setField(term249870, term249870.getClass(), "description", null);
        setField(term249870, term249870.getClass(), "group", null);
        setField(term249870, term249870.getClass(), "conflictsWithIds", null);
        setByteField(term249870, term249870.getClass(), "traitPoints", (byte) 69);
        Object term249872 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term249872, term249872.getClass(), "traitId", null);
        setField(term249872, term249872.getClass(), "traitName", null);
        setField(term249872, term249872.getClass(), "description", null);
        setField(term249872, term249872.getClass(), "group", null);
        setField(term249872, term249872.getClass(), "conflictsWithIds", null);
        setByteField(term249872, term249872.getClass(), "traitPoints", (byte) -101);
        ArrayList term249866 = new ArrayList();
        ((ArrayList) term249866).add(term249868);
        ((ArrayList) term249866).add(term249870);
        ((ArrayList) term249866).add(term249872);
        Class<? extends Object> term251308 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term251307 = ((Class) term251308).getDeclaredField((String) "STONE_PEOPLE");
        ((Field) term251307).setAccessible(true);
        Object enum428 = ((Field) term251307).get((Object) null);
        Class<? extends Object> term251621 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term251620 = ((Class) term251621).getDeclaredField((String) "REGULAR");
        ((Field) term251620).setAccessible(true);
        Object enum429 = ((Field) term251620).get((Object) null);
        term249690 = newInstance(Class.forName("org.openRealmOfStars.game.SavedGame"));
        Object term249691 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term249827 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term249691, term249691.getClass(), "id", "jDgLTvGduh");
        setField(term249691, term249691.getClass(), "name", "HfgMTpkgaK");
        setField(term249691, term249691.getClass(), "nameSingle", "QUAzjGTSxv");
        setField(term249691, term249691.getClass(), "attitude", enum423);
        setField(term249691, term249691.getClass(), "imagePath", "cIWnHZgAhI");
        setField(term249691, term249691.getClass(), "bridgeId", "vEHRRwNajA");
        setField(term249691, term249691.getClass(), "spaceShipId", "JePWfnKmqE");
        setField(term249691, term249691.getClass(), "socialSystem", enum424);
        setField(term249691, term249691.getClass(), "genderList", term249792);
        setField(term249691, term249691.getClass(), "speechSetId", "eoNrxoHMqo");
        setField(term249691, term249691.getClass(), "bridgeEffect", enum427);
        setField(term249827, term249827.getClass(), "songName", "klaJiaCEJi");
        setField(term249827, term249827.getClass(), "author", "gcfVossSeW");
        setField(term249827, term249827.getClass(), "fileName", "xBlXstmAsQ");
        setBooleanField(term249827, term249827.getClass(), "custom", false);
        setIntField(term249827, term249827.getClass(), "fadingLimit", 1864285170);
        setField(term249691, term249691.getClass(), "diplomacyMusic", term249827);
        setField(term249691, term249691.getClass(), "traits", term249866);
        setField(term249691, term249691.getClass(), "leaderNameGenerator", enum428);
        setField(term249691, term249691.getClass(), "description", "zqGoMwjPjA");
        setField(term249691, term249691.getClass(), "spaceRaceType", enum429);
        setField(term249690, term249690.getClass(), "playerRace", term249691);
        setIntField(term249690, term249690.getClass(), "starYear", -1621410076);
        setIntField(term249690, term249690.getClass(), "realms", -239419301);
        setField(term249690, term249690.getClass(), "galaxySize", "qvrLYIqpRM");
        setField(term249690, term249690.getClass(), "filename", "IoPixEbkAS");
        setField(term249690, term249690.getClass(), "empireName", "aUBGFyjAFZ");
        setField(term249690, term249690.getClass(), "creationTime", "hLGRczvgrI");
        setLongField(term249690, term249690.getClass(), "creationTimeMillis", 2120084523938730454L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.SavedGame");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term249690, args);
    }

};


