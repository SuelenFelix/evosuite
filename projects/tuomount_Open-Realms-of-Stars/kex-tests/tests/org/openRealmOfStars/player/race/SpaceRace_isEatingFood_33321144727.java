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

public class SpaceRace_isEatingFood_33321144727 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term284580;

    public SpaceRace_isEatingFood_33321144727() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term284855 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term284854 = ((Class) term284855).getDeclaredField((String) "MILITARISTIC");
        ((Field) term284854).setAccessible(true);
        Object enum872 = ((Field) term284854).get((Object) null);
        Class<? extends Object> term285158 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term285157 = ((Class) term285158).getDeclaredField((String) "EQUAL");
        ((Field) term285157).setAccessible(true);
        Object enum873 = ((Field) term285157).get((Object) null);
        Class<? extends Object> term285405 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term285404 = ((Class) term285405).getDeclaredField((String) "NONE");
        ((Field) term285404).setAccessible(true);
        Object enum874 =  ((Field) term285404).get((Object) null);
        Class<? extends Object> term285629 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term285628 = ((Class) term285629).getDeclaredField((String) "MALE");
        ((Field) term285628).setAccessible(true);
        Object enum875 =  ((Field) term285628).get((Object) null);
        ArrayList term284678 = new ArrayList();
        ((ArrayList) term284678).add(enum874);
        ((ArrayList) term284678).add(enum875);
        Class<? extends Object> term285863 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term285862 = ((Class) term285863).getDeclaredField((String) "DARK_ORANGE");
        ((Field) term285862).setAccessible(true);
        Object enum876 = ((Field) term285862).get((Object) null);
        ArrayList term284763 = new ArrayList();
        ((ArrayList) term284763).add((Object)null);
        ((ArrayList) term284763).add((Object)null);
        ((ArrayList) term284763).add((Object)null);
        Object term284758 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term284758, term284758.getClass(), "traitId", "");
        setField(term284758, term284758.getClass(), "traitName", "");
        setField(term284758, term284758.getClass(), "description", "");
        setField(term284758, term284758.getClass(), "group", "");
        setField(term284758, term284758.getClass(), "conflictsWithIds", term284763);
        setByteField(term284758, term284758.getClass(), "traitPoints", (byte) 48);
        ArrayList term284772 = new ArrayList();
        ((ArrayList) term284772).add((Object)null);
        ((ArrayList) term284772).add((Object)null);
        ((ArrayList) term284772).add((Object)null);
        ((ArrayList) term284772).add((Object)null);
        ((ArrayList) term284772).add((Object)null);
        ((ArrayList) term284772).add((Object)null);
        ((ArrayList) term284772).add((Object)null);
        ((ArrayList) term284772).add((Object)null);
        ((ArrayList) term284772).add((Object)null);
        Object term284767 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term284767, term284767.getClass(), "traitId", "");
        setField(term284767, term284767.getClass(), "traitName", "");
        setField(term284767, term284767.getClass(), "description", "");
        setField(term284767, term284767.getClass(), "group", "");
        setField(term284767, term284767.getClass(), "conflictsWithIds", term284772);
        setByteField(term284767, term284767.getClass(), "traitPoints", (byte) 91);
        ArrayList term284756 = new ArrayList();
        ((ArrayList) term284756).add(term284758);
        ((ArrayList) term284756).add(term284767);
        Class<? extends Object> term286163 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term286162 = ((Class) term286163).getDeclaredField((String) "ANCIENT_ROMAN");
        ((Field) term286162).setAccessible(true);
        Object enum877 = ((Field) term286162).get((Object) null);
        Class<? extends Object> term286479 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term286478 = ((Class) term286479).getDeclaredField((String) "SPACE_MONSTER");
        ((Field) term286478).setAccessible(true);
        Object enum878 = ((Field) term286478).get((Object) null);
        term284580 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term284717 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term284580, term284580.getClass(), "id", "eDVTORBely");
        setField(term284580, term284580.getClass(), "name", "AoncmgwbVO");
        setField(term284580, term284580.getClass(), "nameSingle", "RDNNYsIlUn");
        setField(term284580, term284580.getClass(), "attitude", enum872);
        setField(term284580, term284580.getClass(), "imagePath", "bLadkkAEee");
        setField(term284580, term284580.getClass(), "bridgeId", "wYWbALYzmk");
        setField(term284580, term284580.getClass(), "spaceShipId", "OlbnRaLyPO");
        setField(term284580, term284580.getClass(), "socialSystem", enum873);
        setField(term284580, term284580.getClass(), "genderList", term284678);
        setField(term284580, term284580.getClass(), "speechSetId", "goQZKOBhTr");
        setField(term284580, term284580.getClass(), "bridgeEffect", enum876);
        setField(term284717, term284717.getClass(), "songName", "eaDGkLMDMl");
        setField(term284717, term284717.getClass(), "author", "dfvKtdkmjZ");
        setField(term284717, term284717.getClass(), "fileName", "XOFlovlfIj");
        setBooleanField(term284717, term284717.getClass(), "custom", true);
        setIntField(term284717, term284717.getClass(), "fadingLimit", 981222791);
        setField(term284580, term284580.getClass(), "diplomacyMusic", term284717);
        setField(term284580, term284580.getClass(), "traits", term284756);
        setField(term284580, term284580.getClass(), "leaderNameGenerator", enum877);
        setField(term284580, term284580.getClass(), "description", "lbTGbReUrp");
        setField(term284580, term284580.getClass(), "spaceRaceType", enum878);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.race.SpaceRace");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isEatingFood", argTypes, term284580, args);
    }

};


