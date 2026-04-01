package org.openRealmOfStars.gui.util;

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
import static org.openRealmOfStars.gui.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class GuiStatics_getRaceImg_12360620532 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2885;

    public GuiStatics_getRaceImg_12360620532() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3315 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term3314 = ((Class) term3315).getDeclaredField((String) "PEACEFUL");
        ((Field) term3314).setAccessible(true);
        Object enum0 = ((Field) term3314).get((Object) null);
        Class<? extends Object> term3643 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term3642 = ((Class) term3643).getDeclaredField((String) "PATRIARCHY");
        ((Field) term3642).setAccessible(true);
        Object enum1 = ((Field) term3642).get((Object) null);
        Class<? extends Object> term3934 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term3933 = ((Class) term3934).getDeclaredField((String) "NONE");
        ((Field) term3933).setAccessible(true);
        Object enum2 =  ((Field) term3933).get((Object) null);
        Class<? extends Object> term4158 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term4157 = ((Class) term4158).getDeclaredField((String) "MALE");
        ((Field) term4157).setAccessible(true);
        Object enum3 =  ((Field) term4157).get((Object) null);
        Class<? extends Object> term4382 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term4381 = ((Class) term4382).getDeclaredField((String) "NONE");
        ((Field) term4381).setAccessible(true);
        Object enum4 =  ((Field) term4381).get((Object) null);
        ArrayList term2984 = new ArrayList();
        ((ArrayList) term2984).add(enum2);
        ((ArrayList) term2984).add(enum3);
        ((ArrayList) term2984).add(enum2);
        ((ArrayList) term2984).add(enum3);
        ((ArrayList) term2984).add(enum4);
        ((ArrayList) term2984).add(enum2);
        Class<? extends Object> term4995 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term4994 = ((Class) term4995).getDeclaredField((String) "JUNGLE");
        ((Field) term4994).setAccessible(true);
        Object enum5 = ((Field) term4994).get((Object) null);
        ArrayList term3068 = new ArrayList();
        ((ArrayList) term3068).add((Object)null);
        ((ArrayList) term3068).add((Object)null);
        ((ArrayList) term3068).add((Object)null);
        ((ArrayList) term3068).add((Object)null);
        ((ArrayList) term3068).add((Object)null);
        Object term3063 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term3063, term3063.getClass(), "traitId", "");
        setField(term3063, term3063.getClass(), "traitName", "");
        setField(term3063, term3063.getClass(), "description", "");
        setField(term3063, term3063.getClass(), "group", "");
        setField(term3063, term3063.getClass(), "conflictsWithIds", term3068);
        setByteField(term3063, term3063.getClass(), "traitPoints", (byte) 47);
        ArrayList term3077 = new ArrayList();
        ((ArrayList) term3077).add((Object)null);
        ((ArrayList) term3077).add((Object)null);
        Object term3072 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term3072, term3072.getClass(), "traitId", "");
        setField(term3072, term3072.getClass(), "traitName", "");
        setField(term3072, term3072.getClass(), "description", "");
        setField(term3072, term3072.getClass(), "group", "");
        setField(term3072, term3072.getClass(), "conflictsWithIds", term3077);
        setByteField(term3072, term3072.getClass(), "traitPoints", (byte) 48);
        ArrayList term3086 = new ArrayList();
        ((ArrayList) term3086).add((Object)null);
        ((ArrayList) term3086).add((Object)null);
        ((ArrayList) term3086).add((Object)null);
        Object term3081 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term3081, term3081.getClass(), "traitId", "");
        setField(term3081, term3081.getClass(), "traitName", "");
        setField(term3081, term3081.getClass(), "description", "");
        setField(term3081, term3081.getClass(), "group", "");
        setField(term3081, term3081.getClass(), "conflictsWithIds", term3086);
        setByteField(term3081, term3081.getClass(), "traitPoints", (byte) 89);
        ArrayList term3095 = new ArrayList();
        ((ArrayList) term3095).add((Object)null);
        Object term3090 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term3090, term3090.getClass(), "traitId", "");
        setField(term3090, term3090.getClass(), "traitName", "");
        setField(term3090, term3090.getClass(), "description", "");
        setField(term3090, term3090.getClass(), "group", "");
        setField(term3090, term3090.getClass(), "conflictsWithIds", term3095);
        setByteField(term3090, term3090.getClass(), "traitPoints", (byte) 75);
        ArrayList term3104 = new ArrayList();
        Object term3099 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term3099, term3099.getClass(), "traitId", "");
        setField(term3099, term3099.getClass(), "traitName", "");
        setField(term3099, term3099.getClass(), "description", "");
        setField(term3099, term3099.getClass(), "group", "");
        setField(term3099, term3099.getClass(), "conflictsWithIds", term3104);
        setByteField(term3099, term3099.getClass(), "traitPoints", (byte) 18);
        ArrayList term3061 = new ArrayList();
        ((ArrayList) term3061).add(term3063);
        ((ArrayList) term3061).add(term3072);
        ((ArrayList) term3061).add(term3081);
        ((ArrayList) term3061).add(term3090);
        ((ArrayList) term3061).add(term3099);
        Class<? extends Object> term5547 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term5546 = ((Class) term5547).getDeclaredField((String) "EVIL_CREATURE");
        ((Field) term5546).setAccessible(true);
        Object enum6 = ((Field) term5546).get((Object) null);
        Class<? extends Object> term5907 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term5906 = ((Class) term5907).getDeclaredField((String) "SPACE_PIRATE");
        ((Field) term5906).setAccessible(true);
        Object enum7 = ((Field) term5906).get((Object) null);
        term2885 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term3022 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term2885, term2885.getClass(), "id", "tbcdzjIfER");
        setField(term2885, term2885.getClass(), "name", "HyxfbSQYBe");
        setField(term2885, term2885.getClass(), "nameSingle", "pCTimMblYc");
        setField(term2885, term2885.getClass(), "attitude", enum0);
        setField(term2885, term2885.getClass(), "imagePath", "hNxWaHcfhY");
        setField(term2885, term2885.getClass(), "bridgeId", "RkybSrpybU");
        setField(term2885, term2885.getClass(), "spaceShipId", "xOEqzGAmDU");
        setField(term2885, term2885.getClass(), "socialSystem", enum1);
        setField(term2885, term2885.getClass(), "genderList", term2984);
        setField(term2885, term2885.getClass(), "speechSetId", "eZFUvlxvGV");
        setField(term2885, term2885.getClass(), "bridgeEffect", enum5);
        setField(term3022, term3022.getClass(), "songName", "BYqFIqCKAV");
        setField(term3022, term3022.getClass(), "author", "vrQLuWIDJX");
        setField(term3022, term3022.getClass(), "fileName", "flxyYxBRtu");
        setBooleanField(term3022, term3022.getClass(), "custom", true);
        setIntField(term3022, term3022.getClass(), "fadingLimit", -1694747156);
        setField(term2885, term2885.getClass(), "diplomacyMusic", term3022);
        setField(term2885, term2885.getClass(), "traits", term3061);
        setField(term2885, term2885.getClass(), "leaderNameGenerator", enum6);
        setField(term2885, term2885.getClass(), "description", "ytSBIKXogI");
        setField(term2885, term2885.getClass(), "spaceRaceType", enum7);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.util.GuiStatics");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.race.SpaceRace");
        Object[] args = new Object[1];
        args[0] = term2885;
        callMethod(klass, "getRaceImg", argTypes, null, args);
    }

};


