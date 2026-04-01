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

public class SpaceRace_toString_146113077654 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term348359;

    public SpaceRace_toString_146113077654() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term348675 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term348674 = ((Class) term348675).getDeclaredField((String) "MILITARISTIC");
        ((Field) term348674).setAccessible(true);
        Object enum1079 = ((Field) term348674).get((Object) null);
        Class<? extends Object> term348978 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term348977 = ((Class) term348978).getDeclaredField((String) "PATRIARCHY");
        ((Field) term348977).setAccessible(true);
        Object enum1080 = ((Field) term348977).get((Object) null);
        Class<? extends Object> term349240 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term349239 = ((Class) term349240).getDeclaredField((String) "NONE");
        ((Field) term349239).setAccessible(true);
        Object enum1081 =  ((Field) term349239).get((Object) null);
        Class<? extends Object> term349464 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term349463 = ((Class) term349464).getDeclaredField((String) "MALE");
        ((Field) term349463).setAccessible(true);
        Object enum1082 =  ((Field) term349463).get((Object) null);
        ArrayList term348462 = new ArrayList();
        ((ArrayList) term348462).add(enum1081);
        ((ArrayList) term348462).add(enum1082);
        ((ArrayList) term348462).add(enum1082);
        ((ArrayList) term348462).add(enum1082);
        ((ArrayList) term348462).add(enum1082);
        Class<? extends Object> term349698 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term349697 = ((Class) term349698).getDeclaredField((String) "YELLOW_ALERT");
        ((Field) term349697).setAccessible(true);
        Object enum1083 = ((Field) term349697).get((Object) null);
        ArrayList term348548 = new ArrayList();
        ((ArrayList) term348548).add((Object)null);
        ((ArrayList) term348548).add((Object)null);
        ((ArrayList) term348548).add((Object)null);
        ((ArrayList) term348548).add((Object)null);
        ((ArrayList) term348548).add((Object)null);
        ((ArrayList) term348548).add((Object)null);
        ((ArrayList) term348548).add((Object)null);
        ((ArrayList) term348548).add((Object)null);
        ((ArrayList) term348548).add((Object)null);
        Object term348543 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term348543, term348543.getClass(), "traitId", "");
        setField(term348543, term348543.getClass(), "traitName", "");
        setField(term348543, term348543.getClass(), "description", "");
        setField(term348543, term348543.getClass(), "group", "");
        setField(term348543, term348543.getClass(), "conflictsWithIds", term348548);
        setByteField(term348543, term348543.getClass(), "traitPoints", (byte) 88);
        ArrayList term348557 = new ArrayList();
        Object term348552 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term348552, term348552.getClass(), "traitId", "");
        setField(term348552, term348552.getClass(), "traitName", "");
        setField(term348552, term348552.getClass(), "description", "");
        setField(term348552, term348552.getClass(), "group", "");
        setField(term348552, term348552.getClass(), "conflictsWithIds", term348557);
        setByteField(term348552, term348552.getClass(), "traitPoints", (byte) 10);
        ArrayList term348566 = new ArrayList();
        ((ArrayList) term348566).add((Object)null);
        ((ArrayList) term348566).add((Object)null);
        ((ArrayList) term348566).add((Object)null);
        ((ArrayList) term348566).add((Object)null);
        ((ArrayList) term348566).add((Object)null);
        ((ArrayList) term348566).add((Object)null);
        Object term348561 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term348561, term348561.getClass(), "traitId", "");
        setField(term348561, term348561.getClass(), "traitName", "");
        setField(term348561, term348561.getClass(), "description", "");
        setField(term348561, term348561.getClass(), "group", "");
        setField(term348561, term348561.getClass(), "conflictsWithIds", term348566);
        setByteField(term348561, term348561.getClass(), "traitPoints", (byte) 77);
        ArrayList term348575 = new ArrayList();
        ((ArrayList) term348575).add((Object)null);
        ((ArrayList) term348575).add((Object)null);
        ((ArrayList) term348575).add((Object)null);
        ((ArrayList) term348575).add((Object)null);
        Object term348570 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term348570, term348570.getClass(), "traitId", "");
        setField(term348570, term348570.getClass(), "traitName", "");
        setField(term348570, term348570.getClass(), "description", "");
        setField(term348570, term348570.getClass(), "group", "");
        setField(term348570, term348570.getClass(), "conflictsWithIds", term348575);
        setByteField(term348570, term348570.getClass(), "traitPoints", (byte) 91);
        ArrayList term348584 = new ArrayList();
        ((ArrayList) term348584).add((Object)null);
        ((ArrayList) term348584).add((Object)null);
        ((ArrayList) term348584).add((Object)null);
        ((ArrayList) term348584).add((Object)null);
        ((ArrayList) term348584).add((Object)null);
        Object term348579 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term348579, term348579.getClass(), "traitId", "");
        setField(term348579, term348579.getClass(), "traitName", "");
        setField(term348579, term348579.getClass(), "description", "");
        setField(term348579, term348579.getClass(), "group", "");
        setField(term348579, term348579.getClass(), "conflictsWithIds", term348584);
        setByteField(term348579, term348579.getClass(), "traitPoints", (byte) 75);
        ArrayList term348593 = new ArrayList();
        ((ArrayList) term348593).add((Object)null);
        ((ArrayList) term348593).add((Object)null);
        ((ArrayList) term348593).add((Object)null);
        ((ArrayList) term348593).add((Object)null);
        ((ArrayList) term348593).add((Object)null);
        Object term348588 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term348588, term348588.getClass(), "traitId", "");
        setField(term348588, term348588.getClass(), "traitName", "");
        setField(term348588, term348588.getClass(), "description", "");
        setField(term348588, term348588.getClass(), "group", "");
        setField(term348588, term348588.getClass(), "conflictsWithIds", term348593);
        setByteField(term348588, term348588.getClass(), "traitPoints", (byte) 96);
        ArrayList term348541 = new ArrayList();
        ((ArrayList) term348541).add(term348543);
        ((ArrayList) term348541).add(term348552);
        ((ArrayList) term348541).add(term348561);
        ((ArrayList) term348541).add(term348570);
        ((ArrayList) term348541).add(term348579);
        ((ArrayList) term348541).add(term348588);
        Class<? extends Object> term350001 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term350000 = ((Class) term350001).getDeclaredField((String) "EVIL_CREATURE");
        ((Field) term350000).setAccessible(true);
        Object enum1084 = ((Field) term350000).get((Object) null);
        Class<? extends Object> term350317 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term350316 = ((Class) term350317).getDeclaredField((String) "SPACE_PIRATE");
        ((Field) term350316).setAccessible(true);
        Object enum1085 = ((Field) term350316).get((Object) null);
        term348359 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term348502 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term348359, term348359.getClass(), "id", "FiFXJqBXdC");
        setField(term348359, term348359.getClass(), "name", "yxWimtmvkl");
        setField(term348359, term348359.getClass(), "nameSingle", "PUzanajQSP");
        setField(term348359, term348359.getClass(), "attitude", enum1079);
        setField(term348359, term348359.getClass(), "imagePath", "yxepsSOVzF");
        setField(term348359, term348359.getClass(), "bridgeId", "ZUOjNutasW");
        setField(term348359, term348359.getClass(), "spaceShipId", "iLnavpwPVW");
        setField(term348359, term348359.getClass(), "socialSystem", enum1080);
        setField(term348359, term348359.getClass(), "genderList", term348462);
        setField(term348359, term348359.getClass(), "speechSetId", "uzOLHHrsVY");
        setField(term348359, term348359.getClass(), "bridgeEffect", enum1083);
        setField(term348502, term348502.getClass(), "songName", "AaWWwZcnLu");
        setField(term348502, term348502.getClass(), "author", "ZVIGMbBKbL");
        setField(term348502, term348502.getClass(), "fileName", "gVMFMkMhbp");
        setBooleanField(term348502, term348502.getClass(), "custom", true);
        setIntField(term348502, term348502.getClass(), "fadingLimit", -1252248921);
        setField(term348359, term348359.getClass(), "diplomacyMusic", term348502);
        setField(term348359, term348359.getClass(), "traits", term348541);
        setField(term348359, term348359.getClass(), "leaderNameGenerator", enum1084);
        setField(term348359, term348359.getClass(), "description", "DDmdhVOVfJ");
        setField(term348359, term348359.getClass(), "spaceRaceType", enum1085);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.race.SpaceRace");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term348359, args);
    }

};


