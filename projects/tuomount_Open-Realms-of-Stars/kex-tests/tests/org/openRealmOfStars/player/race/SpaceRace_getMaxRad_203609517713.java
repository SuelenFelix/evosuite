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

public class SpaceRace_getMaxRad_203609517713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term251429;

    public SpaceRace_getMaxRad_203609517713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term251724 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term251723 = ((Class) term251724).getDeclaredField((String) "LOGICAL");
        ((Field) term251723).setAccessible(true);
        Object enum765 = ((Field) term251723).get((Object) null);
        Class<? extends Object> term252012 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term252011 = ((Class) term252012).getDeclaredField((String) "EQUAL");
        ((Field) term252011).setAccessible(true);
        Object enum766 = ((Field) term252011).get((Object) null);
        Class<? extends Object> term252259 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term252258 = ((Class) term252259).getDeclaredField((String) "FEMALE");
        ((Field) term252258).setAccessible(true);
        Object enum767 =  ((Field) term252258).get((Object) null);
        Class<? extends Object> term252489 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term252488 = ((Class) term252489).getDeclaredField((String) "NONE");
        ((Field) term252488).setAccessible(true);
        Object enum768 =  ((Field) term252488).get((Object) null);
        ArrayList term251522 = new ArrayList();
        ((ArrayList) term251522).add(enum767);
        ((ArrayList) term251522).add(enum768);
        ((ArrayList) term251522).add(enum767);
        ((ArrayList) term251522).add(enum768);
        Class<? extends Object> term252723 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term252722 = ((Class) term252723).getDeclaredField((String) "FADE_IN_START");
        ((Field) term252722).setAccessible(true);
        Object enum769 = ((Field) term252722).get((Object) null);
        ArrayList term251609 = new ArrayList();
        ((ArrayList) term251609).add((Object)null);
        ((ArrayList) term251609).add((Object)null);
        ((ArrayList) term251609).add((Object)null);
        ((ArrayList) term251609).add((Object)null);
        ((ArrayList) term251609).add((Object)null);
        ((ArrayList) term251609).add((Object)null);
        ((ArrayList) term251609).add((Object)null);
        ((ArrayList) term251609).add((Object)null);
        ((ArrayList) term251609).add((Object)null);
        Object term251604 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term251604, term251604.getClass(), "traitId", "");
        setField(term251604, term251604.getClass(), "traitName", "");
        setField(term251604, term251604.getClass(), "description", "");
        setField(term251604, term251604.getClass(), "group", "");
        setField(term251604, term251604.getClass(), "conflictsWithIds", term251609);
        setByteField(term251604, term251604.getClass(), "traitPoints", (byte) -57);
        ArrayList term251618 = new ArrayList();
        ((ArrayList) term251618).add((Object)null);
        ((ArrayList) term251618).add((Object)null);
        ((ArrayList) term251618).add((Object)null);
        ((ArrayList) term251618).add((Object)null);
        ((ArrayList) term251618).add((Object)null);
        ((ArrayList) term251618).add((Object)null);
        ((ArrayList) term251618).add((Object)null);
        ((ArrayList) term251618).add((Object)null);
        ((ArrayList) term251618).add((Object)null);
        Object term251613 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term251613, term251613.getClass(), "traitId", "");
        setField(term251613, term251613.getClass(), "traitName", "");
        setField(term251613, term251613.getClass(), "description", "");
        setField(term251613, term251613.getClass(), "group", "");
        setField(term251613, term251613.getClass(), "conflictsWithIds", term251618);
        setByteField(term251613, term251613.getClass(), "traitPoints", (byte) -35);
        ArrayList term251627 = new ArrayList();
        ((ArrayList) term251627).add((Object)null);
        ((ArrayList) term251627).add((Object)null);
        ((ArrayList) term251627).add((Object)null);
        ((ArrayList) term251627).add((Object)null);
        ((ArrayList) term251627).add((Object)null);
        Object term251622 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term251622, term251622.getClass(), "traitId", "");
        setField(term251622, term251622.getClass(), "traitName", "");
        setField(term251622, term251622.getClass(), "description", "");
        setField(term251622, term251622.getClass(), "group", "");
        setField(term251622, term251622.getClass(), "conflictsWithIds", term251627);
        setByteField(term251622, term251622.getClass(), "traitPoints", (byte) -127);
        ArrayList term251636 = new ArrayList();
        ((ArrayList) term251636).add((Object)null);
        ((ArrayList) term251636).add((Object)null);
        ((ArrayList) term251636).add((Object)null);
        ((ArrayList) term251636).add((Object)null);
        ((ArrayList) term251636).add((Object)null);
        Object term251631 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term251631, term251631.getClass(), "traitId", "");
        setField(term251631, term251631.getClass(), "traitName", "");
        setField(term251631, term251631.getClass(), "description", "");
        setField(term251631, term251631.getClass(), "group", "");
        setField(term251631, term251631.getClass(), "conflictsWithIds", term251636);
        setByteField(term251631, term251631.getClass(), "traitPoints", (byte) 85);
        ArrayList term251645 = new ArrayList();
        ((ArrayList) term251645).add((Object)null);
        ((ArrayList) term251645).add((Object)null);
        ((ArrayList) term251645).add((Object)null);
        ((ArrayList) term251645).add((Object)null);
        ((ArrayList) term251645).add((Object)null);
        ((ArrayList) term251645).add((Object)null);
        Object term251640 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term251640, term251640.getClass(), "traitId", "");
        setField(term251640, term251640.getClass(), "traitName", "");
        setField(term251640, term251640.getClass(), "description", "");
        setField(term251640, term251640.getClass(), "group", "");
        setField(term251640, term251640.getClass(), "conflictsWithIds", term251645);
        setByteField(term251640, term251640.getClass(), "traitPoints", (byte) -49);
        ArrayList term251602 = new ArrayList();
        ((ArrayList) term251602).add(term251604);
        ((ArrayList) term251602).add(term251613);
        ((ArrayList) term251602).add(term251622);
        ((ArrayList) term251602).add(term251631);
        ((ArrayList) term251602).add(term251640);
        Class<? extends Object> term253029 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term253028 = ((Class) term253029).getDeclaredField((String) "SPACE_ORC");
        ((Field) term253028).setAccessible(true);
        Object enum770 = ((Field) term253028).get((Object) null);
        Class<? extends Object> term253333 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term253332 = ((Class) term253333).getDeclaredField((String) "SPACE_MONSTER");
        ((Field) term253332).setAccessible(true);
        Object enum771 = ((Field) term253332).get((Object) null);
        term251429 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term251563 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term251429, term251429.getClass(), "id", "meUVYWhBFo");
        setField(term251429, term251429.getClass(), "name", "JjmysiVNEh");
        setField(term251429, term251429.getClass(), "nameSingle", "xsRfZCAubi");
        setField(term251429, term251429.getClass(), "attitude", enum765);
        setField(term251429, term251429.getClass(), "imagePath", "vRtHDpAuWX");
        setField(term251429, term251429.getClass(), "bridgeId", "KzggKElOWW");
        setField(term251429, term251429.getClass(), "spaceShipId", "rOJFLnnriK");
        setField(term251429, term251429.getClass(), "socialSystem", enum766);
        setField(term251429, term251429.getClass(), "genderList", term251522);
        setField(term251429, term251429.getClass(), "speechSetId", "uxPZLhUnKh");
        setField(term251429, term251429.getClass(), "bridgeEffect", enum769);
        setField(term251563, term251563.getClass(), "songName", "BuOyamVtMR");
        setField(term251563, term251563.getClass(), "author", "xWMVBrrOyw");
        setField(term251563, term251563.getClass(), "fileName", "SLOZSlbZhc");
        setBooleanField(term251563, term251563.getClass(), "custom", true);
        setIntField(term251563, term251563.getClass(), "fadingLimit", 521784908);
        setField(term251429, term251429.getClass(), "diplomacyMusic", term251563);
        setField(term251429, term251429.getClass(), "traits", term251602);
        setField(term251429, term251429.getClass(), "leaderNameGenerator", enum770);
        setField(term251429, term251429.getClass(), "description", "SvZVhBPcjK");
        setField(term251429, term251429.getClass(), "spaceRaceType", enum771);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.race.SpaceRace");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxRad", argTypes, term251429, args);
    }

};


