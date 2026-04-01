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

public class SpaceRace_getExtraPopulation_191335037031 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term293653;

    public SpaceRace_getExtraPopulation_191335037031() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term293987 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term293986 = ((Class) term293987).getDeclaredField((String) "MERCHANTICAL");
        ((Field) term293986).setAccessible(true);
        Object enum901 = ((Field) term293986).get((Object) null);
        Class<? extends Object> term294290 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term294289 = ((Class) term294290).getDeclaredField((String) "EQUAL");
        ((Field) term294289).setAccessible(true);
        Object enum902 = ((Field) term294289).get((Object) null);
        Class<? extends Object> term294537 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term294536 = ((Class) term294537).getDeclaredField((String) "NONE");
        ((Field) term294536).setAccessible(true);
        Object enum903 =  ((Field) term294536).get((Object) null);
        ArrayList term293751 = new ArrayList();
        ((ArrayList) term293751).add(enum903);
        Class<? extends Object> term294771 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term294770 = ((Class) term294771).getDeclaredField((String) "EXIT");
        ((Field) term294770).setAccessible(true);
        Object enum904 = ((Field) term294770).get((Object) null);
        ArrayList term293825 = new ArrayList();
        ((ArrayList) term293825).add((Object)null);
        ((ArrayList) term293825).add((Object)null);
        ((ArrayList) term293825).add((Object)null);
        Object term293820 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term293820, term293820.getClass(), "traitId", "");
        setField(term293820, term293820.getClass(), "traitName", "");
        setField(term293820, term293820.getClass(), "description", "");
        setField(term293820, term293820.getClass(), "group", "");
        setField(term293820, term293820.getClass(), "conflictsWithIds", term293825);
        setByteField(term293820, term293820.getClass(), "traitPoints", (byte) 105);
        ArrayList term293834 = new ArrayList();
        ((ArrayList) term293834).add((Object)null);
        Object term293829 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term293829, term293829.getClass(), "traitId", "");
        setField(term293829, term293829.getClass(), "traitName", "");
        setField(term293829, term293829.getClass(), "description", "");
        setField(term293829, term293829.getClass(), "group", "");
        setField(term293829, term293829.getClass(), "conflictsWithIds", term293834);
        setByteField(term293829, term293829.getClass(), "traitPoints", (byte) -60);
        ArrayList term293843 = new ArrayList();
        Object term293838 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term293838, term293838.getClass(), "traitId", "");
        setField(term293838, term293838.getClass(), "traitName", "");
        setField(term293838, term293838.getClass(), "description", "");
        setField(term293838, term293838.getClass(), "group", "");
        setField(term293838, term293838.getClass(), "conflictsWithIds", term293843);
        setByteField(term293838, term293838.getClass(), "traitPoints", (byte) 53);
        ArrayList term293852 = new ArrayList();
        ((ArrayList) term293852).add((Object)null);
        ((ArrayList) term293852).add((Object)null);
        ((ArrayList) term293852).add((Object)null);
        Object term293847 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term293847, term293847.getClass(), "traitId", "");
        setField(term293847, term293847.getClass(), "traitName", "");
        setField(term293847, term293847.getClass(), "description", "");
        setField(term293847, term293847.getClass(), "group", "");
        setField(term293847, term293847.getClass(), "conflictsWithIds", term293852);
        setByteField(term293847, term293847.getClass(), "traitPoints", (byte) 82);
        ArrayList term293861 = new ArrayList();
        ((ArrayList) term293861).add((Object)null);
        Object term293856 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term293856, term293856.getClass(), "traitId", "");
        setField(term293856, term293856.getClass(), "traitName", "");
        setField(term293856, term293856.getClass(), "description", "");
        setField(term293856, term293856.getClass(), "group", "");
        setField(term293856, term293856.getClass(), "conflictsWithIds", term293861);
        setByteField(term293856, term293856.getClass(), "traitPoints", (byte) -35);
        ArrayList term293870 = new ArrayList();
        ((ArrayList) term293870).add((Object)null);
        ((ArrayList) term293870).add((Object)null);
        ((ArrayList) term293870).add((Object)null);
        ((ArrayList) term293870).add((Object)null);
        ((ArrayList) term293870).add((Object)null);
        ((ArrayList) term293870).add((Object)null);
        ((ArrayList) term293870).add((Object)null);
        ((ArrayList) term293870).add((Object)null);
        Object term293865 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term293865, term293865.getClass(), "traitId", "");
        setField(term293865, term293865.getClass(), "traitName", "");
        setField(term293865, term293865.getClass(), "description", "");
        setField(term293865, term293865.getClass(), "group", "");
        setField(term293865, term293865.getClass(), "conflictsWithIds", term293870);
        setByteField(term293865, term293865.getClass(), "traitPoints", (byte) 55);
        ArrayList term293879 = new ArrayList();
        ((ArrayList) term293879).add((Object)null);
        ((ArrayList) term293879).add((Object)null);
        Object term293874 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term293874, term293874.getClass(), "traitId", "");
        setField(term293874, term293874.getClass(), "traitName", "");
        setField(term293874, term293874.getClass(), "description", "");
        setField(term293874, term293874.getClass(), "group", "");
        setField(term293874, term293874.getClass(), "conflictsWithIds", term293879);
        setByteField(term293874, term293874.getClass(), "traitPoints", (byte) -102);
        ArrayList term293888 = new ArrayList();
        ((ArrayList) term293888).add((Object)null);
        ((ArrayList) term293888).add((Object)null);
        ((ArrayList) term293888).add((Object)null);
        ((ArrayList) term293888).add((Object)null);
        Object term293883 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term293883, term293883.getClass(), "traitId", "");
        setField(term293883, term293883.getClass(), "traitName", "");
        setField(term293883, term293883.getClass(), "description", "");
        setField(term293883, term293883.getClass(), "group", "");
        setField(term293883, term293883.getClass(), "conflictsWithIds", term293888);
        setByteField(term293883, term293883.getClass(), "traitPoints", (byte) -100);
        ArrayList term293897 = new ArrayList();
        ((ArrayList) term293897).add((Object)null);
        ((ArrayList) term293897).add((Object)null);
        ((ArrayList) term293897).add((Object)null);
        ((ArrayList) term293897).add((Object)null);
        ((ArrayList) term293897).add((Object)null);
        Object term293892 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term293892, term293892.getClass(), "traitId", "");
        setField(term293892, term293892.getClass(), "traitName", "");
        setField(term293892, term293892.getClass(), "description", "");
        setField(term293892, term293892.getClass(), "group", "");
        setField(term293892, term293892.getClass(), "conflictsWithIds", term293897);
        setByteField(term293892, term293892.getClass(), "traitPoints", (byte) -114);
        ArrayList term293818 = new ArrayList();
        ((ArrayList) term293818).add(term293820);
        ((ArrayList) term293818).add(term293829);
        ((ArrayList) term293818).add(term293838);
        ((ArrayList) term293818).add(term293847);
        ((ArrayList) term293818).add(term293856);
        ((ArrayList) term293818).add(term293865);
        ((ArrayList) term293818).add(term293874);
        ((ArrayList) term293818).add(term293883);
        ((ArrayList) term293818).add(term293892);
        Class<? extends Object> term295050 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term295049 = ((Class) term295050).getDeclaredField((String) "DEEP_ANCIENT_MONSTER");
        ((Field) term295049).setAccessible(true);
        Object enum905 = ((Field) term295049).get((Object) null);
        Class<? extends Object> term295387 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term295386 = ((Class) term295387).getDeclaredField((String) "SPACE_MONSTER");
        ((Field) term295386).setAccessible(true);
        Object enum906 = ((Field) term295386).get((Object) null);
        term293653 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term293779 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term293653, term293653.getClass(), "id", "PduAQEEVJs");
        setField(term293653, term293653.getClass(), "name", "DEzXMDcBeO");
        setField(term293653, term293653.getClass(), "nameSingle", "omCAhxkVhc");
        setField(term293653, term293653.getClass(), "attitude", enum901);
        setField(term293653, term293653.getClass(), "imagePath", "BYmfYmCPCO");
        setField(term293653, term293653.getClass(), "bridgeId", "czTcTFSZaH");
        setField(term293653, term293653.getClass(), "spaceShipId", "xoGaXvlJPi");
        setField(term293653, term293653.getClass(), "socialSystem", enum902);
        setField(term293653, term293653.getClass(), "genderList", term293751);
        setField(term293653, term293653.getClass(), "speechSetId", "YTuxwCMRBA");
        setField(term293653, term293653.getClass(), "bridgeEffect", enum904);
        setField(term293779, term293779.getClass(), "songName", "sETkaSuzDp");
        setField(term293779, term293779.getClass(), "author", "lZBpPKYhfN");
        setField(term293779, term293779.getClass(), "fileName", "QurcwJtnIZ");
        setBooleanField(term293779, term293779.getClass(), "custom", true);
        setIntField(term293779, term293779.getClass(), "fadingLimit", 1321016655);
        setField(term293653, term293653.getClass(), "diplomacyMusic", term293779);
        setField(term293653, term293653.getClass(), "traits", term293818);
        setField(term293653, term293653.getClass(), "leaderNameGenerator", enum905);
        setField(term293653, term293653.getClass(), "description", "rQvktJLyNp");
        setField(term293653, term293653.getClass(), "spaceRaceType", enum906);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.race.SpaceRace");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExtraPopulation", argTypes, term293653, args);
    }

};


