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

public class Tech_getNextTechLevel_170719602820 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111735;

    public Tech_getNextTechLevel_170719602820() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term112102 = Class.forName((String) "org.openRealmOfStars.player.tech.TechType");
        Field term112101 = ((Class) term112102).getDeclaredField((String) "Propulsion");
        ((Field) term112101).setAccessible(true);
        Object enum331 = ((Field) term112101).get((Object) null);
        Class<? extends Object> term112414 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term112413 = ((Class) term112414).getDeclaredField((String) "AGGRESSIVE");
        ((Field) term112413).setAccessible(true);
        Object enum332 = ((Field) term112413).get((Object) null);
        Class<? extends Object> term112711 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term112710 = ((Class) term112711).getDeclaredField((String) "MATRIARCHY");
        ((Field) term112710).setAccessible(true);
        Object enum333 = ((Field) term112710).get((Object) null);
        ArrayList term111924 = new ArrayList();
        Class<? extends Object> term112983 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term112982 = ((Class) term112983).getDeclaredField((String) "ORANGE_BLINK");
        ((Field) term112982).setAccessible(true);
        Object enum334 = ((Field) term112982).get((Object) null);
        ArrayList term111949 = new ArrayList();
        ((ArrayList) term111949).add((Object)null);
        ((ArrayList) term111949).add((Object)null);
        ((ArrayList) term111949).add((Object)null);
        ((ArrayList) term111949).add((Object)null);
        ((ArrayList) term111949).add((Object)null);
        ((ArrayList) term111949).add((Object)null);
        ((ArrayList) term111949).add((Object)null);
        Class<? extends Object> term113256 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term113255 = ((Class) term113256).getDeclaredField((String) "EVIL_CREATURE");
        ((Field) term113255).setAccessible(true);
        Object enum335 = ((Field) term113255).get((Object) null);
        Class<? extends Object> term113572 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term113571 = ((Class) term113572).getDeclaredField((String) "REGULAR");
        ((Field) term113571).setAccessible(true);
        Object enum336 = ((Field) term113571).get((Object) null);
        Class<? extends Object> term113860 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term113859 = ((Class) term113860).getDeclaredField((String) "PEACEFUL");
        ((Field) term113859).setAccessible(true);
        Object enum337 = ((Field) term113859).get((Object) null);
        ArrayList term112047 = new ArrayList();
        ((ArrayList) term112047).add((Object)null);
        ((ArrayList) term112047).add((Object)null);
        ((ArrayList) term112047).add((Object)null);
        ((ArrayList) term112047).add((Object)null);
        Class<? extends Object> term114161 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term114160 = ((Class) term114161).getDeclaredField((String) "REGISTER");
        ((Field) term114160).setAccessible(true);
        Object enum338 = ((Field) term114160).get((Object) null);
        ArrayList term112072 = new ArrayList();
        Class<? extends Object> term114422 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term114421 = ((Class) term114422).getDeclaredField((String) "FEMALE_ROBOT");
        ((Field) term114421).setAccessible(true);
        Object enum339 = ((Field) term114421).get((Object) null);
        term111735 = newInstance(Class.forName("org.openRealmOfStars.player.tech.Tech"));
        Object term111801 = newInstance(Class.forName("org.openRealmOfStars.gui.icons.Icon16x16"));
        Object term111802 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        Object term111804 = newInstance(Class.forName("java.awt.image.WritableRaster"));
        Object term111813 = newInstance(Class.forName("java.awt.image.Raster"));
        Object term111822 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term111823 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term111844 = (Object[]) newArray("org.openRealmOfStars.player.race.SpaceRace", 2);
        Object term111845 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term111943 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        Object term111971 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term112066 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term111735, term111735.getClass(), "name", "RfDgUkIYjW");
        setField(term111735, term111735.getClass(), "type", enum331);
        setIntField(term111735, term111735.getClass(), "level", 1639448749);
        setField(term111735, term111735.getClass(), "component", "QnZKCwkmMh");
        setField(term111735, term111735.getClass(), "improvement", "RVQbteztJx");
        setField(term111735, term111735.getClass(), "hull", "yjmUdvwSdd");
        setBooleanField(term111735, term111735.getClass(), "rareTech", false);
        setIntField(term111735, term111735.getClass(), "nextTechLevel", 873659088);
        setIntField(term111802, term111802.getClass(), "imageType", -975748721);
        setField(term111802, term111802.getClass(), "colorModel", null);
        setField(term111804, term111804.getClass(), "sampleModel", null);
        setField(term111804, term111804.getClass(), "dataBuffer", null);
        setIntField(term111804, term111804.getClass(), "minX", 433248783);
        setIntField(term111804, term111804.getClass(), "minY", -507944154);
        setIntField(term111804, term111804.getClass(), "width", -1736183862);
        setIntField(term111804, term111804.getClass(), "height", 897010381);
        setIntField(term111804, term111804.getClass(), "sampleModelTranslateX", -15712667);
        setIntField(term111804, term111804.getClass(), "sampleModelTranslateY", 1964967720);
        setIntField(term111804, term111804.getClass(), "numBands", 1351900243);
        setIntField(term111804, term111804.getClass(), "numDataElements", -330897705);
        setField(term111813, term111813.getClass(), "sampleModel", null);
        setField(term111813, term111813.getClass(), "dataBuffer", null);
        setIntField(term111813, term111813.getClass(), "minX", 1065595802);
        setIntField(term111813, term111813.getClass(), "minY", 21031843);
        setIntField(term111813, term111813.getClass(), "width", -380787857);
        setIntField(term111813, term111813.getClass(), "height", 319853052);
        setIntField(term111813, term111813.getClass(), "sampleModelTranslateX", -1097563716);
        setIntField(term111813, term111813.getClass(), "sampleModelTranslateY", 1572907769);
        setIntField(term111813, term111813.getClass(), "numBands", 1608016787);
        setIntField(term111813, term111813.getClass(), "numDataElements", -516303035);
        setField(term111813, term111813.getClass(), "parent", null);
        setField(term111804, term111804.getClass(), "parent", term111813);
        setField(term111802, term111802.getClass(), "raster", term111804);
        setField(term111802, term111802.getClass(), "osis", null);
        setField(term111822, term111822.getClass(), "table", term111823);
        setIntField(term111822, term111822.getClass(), "count", 1);
        setIntField(term111822, term111822.getClass(), "threshold", 8);
        setFloatField(term111822, term111822.getClass(), "loadFactor", 0.75F);
        setIntField(term111822, term111822.getClass(), "modCount", 1);
        setField(term111822, term111822.getClass(), "keySet", null);
        setField(term111822, term111822.getClass(), "entrySet", null);
        setField(term111822, term111822.getClass(), "values", null);
        setField(term111802, term111802.getClass(), "properties", term111822);
        setFloatField(term111802, term111802.getClass(), "accelerationPriority", 0.24413109F);
        setField(term111802, term111802.getClass(), "surfaceManager", null);
        setField(term111801, term111801.getClass(), "img", term111802);
        setField(term111801, term111801.getClass(), "name", "ebUWnoVDmk");
        setIntField(term111801, term111801.getClass(), "index", -2138825831);
        setField(term111735, term111735.getClass(), "icon", term111801);
        setBooleanField(term111735, term111735.getClass(), "tradeable", false);
        setBooleanField(term111735, term111735.getClass(), "excludeList", true);
        setField(term111845, term111845.getClass(), "id", "wCcojFgWKb");
        setField(term111845, term111845.getClass(), "name", "iHtqLPNWTt");
        setField(term111845, term111845.getClass(), "nameSingle", "TQgECVDMEf");
        setField(term111845, term111845.getClass(), "attitude", enum332);
        setField(term111845, term111845.getClass(), "imagePath", "KIBOVYItqe");
        setField(term111845, term111845.getClass(), "bridgeId", "GUztJeVeCc");
        setField(term111845, term111845.getClass(), "spaceShipId", "YNXFGgstqj");
        setField(term111845, term111845.getClass(), "socialSystem", enum333);
        setField(term111845, term111845.getClass(), "genderList", term111924);
        setField(term111845, term111845.getClass(), "speechSetId", "xZTWqxWsAc");
        setField(term111845, term111845.getClass(), "bridgeEffect", enum334);
        setField(term111943, term111943.getClass(), "songName", "");
        setField(term111943, term111943.getClass(), "author", "");
        setField(term111943, term111943.getClass(), "fileName", "");
        setBooleanField(term111943, term111943.getClass(), "custom", false);
        setIntField(term111943, term111943.getClass(), "fadingLimit", 1454781562);
        setField(term111845, term111845.getClass(), "diplomacyMusic", term111943);
        setField(term111845, term111845.getClass(), "traits", term111949);
        setField(term111845, term111845.getClass(), "leaderNameGenerator", enum335);
        setField(term111845, term111845.getClass(), "description", "XhnCbWwpIr");
        setField(term111845, term111845.getClass(), "spaceRaceType", enum336);
        setElement(term111844, 0, term111845);
        setField(term111971, term111971.getClass(), "id", "BVMUadSiyU");
        setField(term111971, term111971.getClass(), "name", "OhWrgFwvJi");
        setField(term111971, term111971.getClass(), "nameSingle", "DfKWXfTINQ");
        setField(term111971, term111971.getClass(), "attitude", enum337);
        setField(term111971, term111971.getClass(), "imagePath", "KqusFIxuyo");
        setField(term111971, term111971.getClass(), "bridgeId", "CDpvEYMuDg");
        setField(term111971, term111971.getClass(), "spaceShipId", "YaZCAiIUPe");
        setField(term111971, term111971.getClass(), "socialSystem", enum333);
        setField(term111971, term111971.getClass(), "genderList", term112047);
        setField(term111971, term111971.getClass(), "speechSetId", "KsCWHUcJDd");
        setField(term111971, term111971.getClass(), "bridgeEffect", enum338);
        setField(term112066, term112066.getClass(), "songName", "");
        setField(term112066, term112066.getClass(), "author", "");
        setField(term112066, term112066.getClass(), "fileName", "");
        setBooleanField(term112066, term112066.getClass(), "custom", false);
        setIntField(term112066, term112066.getClass(), "fadingLimit", -27944011);
        setField(term111971, term111971.getClass(), "diplomacyMusic", term112066);
        setField(term111971, term111971.getClass(), "traits", term112072);
        setField(term111971, term111971.getClass(), "leaderNameGenerator", enum339);
        setField(term111971, term111971.getClass(), "description", "YTnlgdIqfA");
        setField(term111971, term111971.getClass(), "spaceRaceType", enum336);
        setElement(term111844, 1, term111971);
        setField(term111735, term111735.getClass(), "spaceRaces", term111844);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.tech.Tech");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNextTechLevel", argTypes, term111735, args);
    }

};


