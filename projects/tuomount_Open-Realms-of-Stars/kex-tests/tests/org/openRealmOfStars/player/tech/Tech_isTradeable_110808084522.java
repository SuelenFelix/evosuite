package org.openRealmOfStars.player.tech;

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
import static org.openRealmOfStars.player.tech.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class Tech_isTradeable_110808084522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117734;

    public Tech_isTradeable_110808084522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term117983 = Class.forName((String) "org.openRealmOfStars.player.tech.TechType");
        Field term117982 = ((Class) term117983).getDeclaredField((String) "Improvements");
        ((Field) term117982).setAccessible(true);
        Object enum349 = ((Field) term117982).get((Object) null);
        Class<? extends Object> term118301 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term118300 = ((Class) term118301).getDeclaredField((String) "BACKSTABBING");
        ((Field) term118300).setAccessible(true);
        Object enum350 = ((Field) term118300).get((Object) null);
        Class<? extends Object> term118604 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term118603 = ((Class) term118604).getDeclaredField((String) "MATRIARCHY");
        ((Field) term118603).setAccessible(true);
        Object enum351 = ((Field) term118603).get((Object) null);
        ArrayList term117925 = new ArrayList();
        Class<? extends Object> term118876 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term118875 = ((Class) term118876).getDeclaredField((String) "FUNGUS");
        ((Field) term118875).setAccessible(true);
        Object enum352 = ((Field) term118875).get((Object) null);
        ArrayList term117950 = new ArrayList();
        ((ArrayList) term117950).add((Object)null);
        ((ArrayList) term117950).add((Object)null);
        ((ArrayList) term117950).add((Object)null);
        ((ArrayList) term117950).add((Object)null);
        Class<? extends Object> term119131 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term119130 = ((Class) term119131).getDeclaredField((String) "STONE_PEOPLE");
        ((Field) term119130).setAccessible(true);
        Object enum353 = ((Field) term119130).get((Object) null);
        Class<? extends Object> term119444 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term119443 = ((Class) term119444).getDeclaredField((String) "SPACE_PIRATE");
        ((Field) term119443).setAccessible(true);
        Object enum354 = ((Field) term119443).get((Object) null);
        term117734 = newInstance(Class.forName("org.openRealmOfStars.player.tech.Tech"));
        Object term117802 = newInstance(Class.forName("org.openRealmOfStars.gui.icons.Icon16x16"));
        Object term117803 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term117805 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term117814 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term117823 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term117824 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term117845 = (Object[]) newArray("org.openRealmOfStars.player.race.SpaceRace", 1);
        Object term117846 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term117944 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term117734, term117734.getClass(), "name", "UHxidCtatV");
        setField(term117734, term117734.getClass(), "type", enum349);
        setIntField(term117734, term117734.getClass(), "level", 1692937831);
        setField(term117734, term117734.getClass(), "component", "LRzADDSjVT");
        setField(term117734, term117734.getClass(), "improvement", "lpFCMaAYxj");
        setField(term117734, term117734.getClass(), "hull", "fzHVMNSLii");
        setBooleanField(term117734, term117734.getClass(), "rareTech", true);
        setIntField(term117734, term117734.getClass(), "nextTechLevel", -1539747985);
        setIntField(term117803, term117803.getClass(), "imageType", -1982489643);
        setField(term117803, term117803.getClass(), "colorModel", null);
        setField(term117805, term117805.getClass(), "sampleModel", null);
        setField(term117805, term117805.getClass(), "dataBuffer", null);
        setIntField(term117805, term117805.getClass(), "minX", 550892835);
        setIntField(term117805, term117805.getClass(), "minY", 1237549886);
        setIntField(term117805, term117805.getClass(), "width", -1945635750);
        setIntField(term117805, term117805.getClass(), "height", -1622760744);
        setIntField(term117805, term117805.getClass(), "sampleModelTranslateX", 2068435279);
        setIntField(term117805, term117805.getClass(), "sampleModelTranslateY", -1556527718);
        setIntField(term117805, term117805.getClass(), "numBands", 895255351);
        setIntField(term117805, term117805.getClass(), "numDataElements", -1317044799);
        setField(term117814, term117814.getClass(), "sampleModel", null);
        setField(term117814, term117814.getClass(), "dataBuffer", null);
        setIntField(term117814, term117814.getClass(), "minX", -1428063820);
        setIntField(term117814, term117814.getClass(), "minY", -1271375703);
        setIntField(term117814, term117814.getClass(), "width", 1136208236);
        setIntField(term117814, term117814.getClass(), "height", -1220630391);
        setIntField(term117814, term117814.getClass(), "sampleModelTranslateX", -995822131);
        setIntField(term117814, term117814.getClass(), "sampleModelTranslateY", -687282231);
        setIntField(term117814, term117814.getClass(), "numBands", 1200440315);
        setIntField(term117814, term117814.getClass(), "numDataElements", 40571662);
        setField(term117814, term117814.getClass(), "parent", null);
        setField(term117805, term117805.getClass(), "parent", term117814);
        setField(term117803, term117803.getClass(), "raster", term117805);
        setField(term117803, term117803.getClass(), "osis", null);
        setField(term117823, term117823.getClass(), "table", term117824);
        setIntField(term117823, term117823.getClass(), "count", 1);
        setIntField(term117823, term117823.getClass(), "threshold", 8);
        setFloatField(term117823, term117823.getClass(), "loadFactor", 0.75F);
        setIntField(term117823, term117823.getClass(), "modCount", 1);
        setField(term117823, term117823.getClass(), "keySet", null);
        setField(term117823, term117823.getClass(), "entrySet", null);
        setField(term117823, term117823.getClass(), "values", null);
        setField(term117803, term117803.getClass(), "properties", term117823);
        setFloatField(term117803, term117803.getClass(), "accelerationPriority", 0.9985961F);
        setField(term117803, term117803.getClass(), "surfaceManager", null);
        setField(term117802, term117802.getClass(), "img", term117803);
        setField(term117802, term117802.getClass(), "name", "fkBfmixBEh");
        setIntField(term117802, term117802.getClass(), "index", 864645689);
        setField(term117734, term117734.getClass(), "icon", term117802);
        setBooleanField(term117734, term117734.getClass(), "tradeable", false);
        setBooleanField(term117734, term117734.getClass(), "excludeList", false);
        setField(term117846, term117846.getClass(), "id", "SWbairdDKL");
        setField(term117846, term117846.getClass(), "name", "AibUFEALwF");
        setField(term117846, term117846.getClass(), "nameSingle", "eXOUrXTrdW");
        setField(term117846, term117846.getClass(), "attitude", enum350);
        setField(term117846, term117846.getClass(), "imagePath", "aomDEETHep");
        setField(term117846, term117846.getClass(), "bridgeId", "GTMrlIYfIM");
        setField(term117846, term117846.getClass(), "spaceShipId", "eiDqCOWbLE");
        setField(term117846, term117846.getClass(), "socialSystem", enum351);
        setField(term117846, term117846.getClass(), "genderList", term117925);
        setField(term117846, term117846.getClass(), "speechSetId", "OBbbsrFNxC");
        setField(term117846, term117846.getClass(), "bridgeEffect", enum352);
        setField(term117944, term117944.getClass(), "songName", "");
        setField(term117944, term117944.getClass(), "author", "");
        setField(term117944, term117944.getClass(), "fileName", "");
        setBooleanField(term117944, term117944.getClass(), "custom", false);
        setIntField(term117944, term117944.getClass(), "fadingLimit", 279384872);
        setField(term117846, term117846.getClass(), "diplomacyMusic", term117944);
        setField(term117846, term117846.getClass(), "traits", term117950);
        setField(term117846, term117846.getClass(), "leaderNameGenerator", enum353);
        setField(term117846, term117846.getClass(), "description", "IvxbsFCczM");
        setField(term117846, term117846.getClass(), "spaceRaceType", enum354);
        setElement(term117845, 0, term117846);
        setField(term117734, term117734.getClass(), "spaceRaces", term117845);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.tech.Tech");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isTradeable", argTypes, term117734, args);
    }

};


