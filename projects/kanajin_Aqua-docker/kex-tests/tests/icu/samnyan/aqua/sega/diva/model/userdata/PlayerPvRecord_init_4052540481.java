package icu.samnyan.aqua.sega.diva.model.userdata;

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
import static icu.samnyan.aqua.sega.diva.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;

public class PlayerPvRecord_init_4052540481 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term564386;
     Object term564991;
     Object enum1238;
     Object enum1239;

    public PlayerPvRecord_init_4052540481() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term565019 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term565018 = ((Class) term565019).getDeclaredField((String) "MISS");
        ((Field) term565018).setAccessible(true);
        Object enum1233 = ((Field) term565018).get((Object) null);
        Class<? extends Object> term565396 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term565395 = ((Class) term565396).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term565395).setAccessible(true);
        Object enum1234 = ((Field) term565395).get((Object) null);
        Class<? extends Object> term565679 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term565678 = ((Class) term565679).getDeclaredField((String) "NORMAL");
        ((Field) term565678).setAccessible(true);
        Object enum1235 = ((Field) term565678).get((Object) null);
        Class<? extends Object> term565954 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term565953 = ((Class) term565954).getDeclaredField((String) "ORIGINAL");
        ((Field) term565953).setAccessible(true);
        Object enum1236 = ((Field) term565953).get((Object) null);
        Class<? extends Object> term566220 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term566219 = ((Class) term566220).getDeclaredField((String) "NONE");
        ((Field) term566219).setAccessible(true);
        Object enum1237 = ((Field) term566219).get((Object) null);
        term564386 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term564509 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term564510 = newInstance(Class.forName("java.time.LocalDate"));
        Object term564514 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term564386, term564386.getClass(), "id", 1740732617708040141L);
        setIntField(term564386, term564386.getClass(), "pdId", -109584269);
        setField(term564386, term564386.getClass(), "playerName", "xxx");
        setIntField(term564386, term564386.getClass(), "vocaloidPoints", 300);
        setIntField(term564386, term564386.getClass(), "level", 1);
        setIntField(term564386, term564386.getClass(), "levelExp", -682334474);
        setField(term564386, term564386.getClass(), "levelTitle", "xxx");
        setIntField(term564386, term564386.getClass(), "plateId", -1);
        setIntField(term564386, term564386.getClass(), "plateEffectId", -1);
        setField(term564386, term564386.getClass(), "passwordStatus", enum1233);
        setField(term564386, term564386.getClass(), "password", "**********");
        setBooleanField(term564386, term564386.getClass(), "preferPerPvModule", true);
        setBooleanField(term564386, term564386.getClass(), "preferCommonModule", true);
        setBooleanField(term564386, term564386.getClass(), "usePerPvSkin", true);
        setBooleanField(term564386, term564386.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term564386, term564386.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term564386, term564386.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term564386, term564386.getClass(), "usePerPvTouchSliderSe", true);
        setField(term564386, term564386.getClass(), "commonModule", "-999,-999,-999");
        setField(term564386, term564386.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term564510, term564510.getClass(), "year", 2026);
        setShortField(term564510, term564510.getClass(), "month", (short) 8);
        setShortField(term564510, term564510.getClass(), "day", (short) 12);
        setField(term564509, term564509.getClass(), "date", term564510);
        setByteField(term564514, term564514.getClass(), "hour", (byte) 2);
        setByteField(term564514, term564514.getClass(), "minute", (byte) 4);
        setByteField(term564514, term564514.getClass(), "second", (byte) 1);
        setIntField(term564514, term564514.getClass(), "nano", 691065000);
        setField(term564509, term564509.getClass(), "time", term564514);
        setField(term564386, term564386.getClass(), "commonModuleSetTime", term564509);
        setField(term564386, term564386.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term564386, term564386.getClass(), "commonSkin", -1);
        setIntField(term564386, term564386.getClass(), "headphoneVolume", 100);
        setBooleanField(term564386, term564386.getClass(), "buttonSeOn", true);
        setIntField(term564386, term564386.getClass(), "buttonSeVolume", 100);
        setIntField(term564386, term564386.getClass(), "sliderSeVolume", 100);
        setIntField(term564386, term564386.getClass(), "buttonSe", -1);
        setIntField(term564386, term564386.getClass(), "chainSlideSe", -1);
        setIntField(term564386, term564386.getClass(), "slideSe", -1);
        setIntField(term564386, term564386.getClass(), "sliderTouchSe", -1);
        setField(term564386, term564386.getClass(), "sortMode", enum1234);
        setIntField(term564386, term564386.getClass(), "nextPvId", -1);
        setField(term564386, term564386.getClass(), "nextDifficulty", enum1235);
        setField(term564386, term564386.getClass(), "nextEdition", enum1236);
        setBooleanField(term564386, term564386.getClass(), "showInterimRanking", true);
        setBooleanField(term564386, term564386.getClass(), "showClearStatus", true);
        setBooleanField(term564386, term564386.getClass(), "showGreatBorder", true);
        setBooleanField(term564386, term564386.getClass(), "showExcellentBorder", true);
        setBooleanField(term564386, term564386.getClass(), "showRivalBorder", true);
        setBooleanField(term564386, term564386.getClass(), "showRgoSetting", true);
        setBooleanField(term564386, term564386.getClass(), "contestNowPlayingEnable", true);
        setIntField(term564386, term564386.getClass(), "contestNowPlayingId", -1);
        setIntField(term564386, term564386.getClass(), "contestNowPlayingValue", -1);
        setField(term564386, term564386.getClass(), "contestNowPlayingResultRank", enum1237);
        setField(term564386, term564386.getClass(), "contestNowPlayingSpecifier", "");
        setField(term564386, term564386.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term564386, term564386.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term564386, term564386.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term564386, term564386.getClass(), "rivalPdId", -1);
        term564991 = new Integer(-666332937);
        Class<? extends Object> term566861 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term566860 = ((Class) term566861).getDeclaredField((String) "EXTRA");
        ((Field) term566860).setAccessible(true);
        enum1238 = ((Field) term566860).get((Object) null);
        Class<? extends Object> term567118 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term567117 = ((Class) term567118).getDeclaredField((String) "HARD");
        ((Field) term567117).setAccessible(true);
        enum1239 = ((Field) term567117).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvRecord");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.Edition");
        argTypes[3] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Object[] args = new Object[4];
        args[0] = term564386;
        args[1] = term564991;
        args[2] = enum1238;
        args[3] = enum1239;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


