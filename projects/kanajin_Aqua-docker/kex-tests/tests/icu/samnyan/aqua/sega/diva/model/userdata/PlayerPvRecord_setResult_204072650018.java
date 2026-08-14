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
import java.lang.Object;
import java.lang.String;

public class PlayerPvRecord_setResult_204072650018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term618211;
     Object enum1360;

    public PlayerPvRecord_setResult_204072650018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term618882 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term618881 = ((Class) term618882).getDeclaredField((String) "MISS");
        ((Field) term618881).setAccessible(true);
        Object enum1353 = ((Field) term618881).get((Object) null);
        Class<? extends Object> term619259 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term619258 = ((Class) term619259).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term619258).setAccessible(true);
        Object enum1354 = ((Field) term619258).get((Object) null);
        Class<? extends Object> term619542 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term619541 = ((Class) term619542).getDeclaredField((String) "NORMAL");
        ((Field) term619541).setAccessible(true);
        Object enum1355 = ((Field) term619541).get((Object) null);
        Class<? extends Object> term619817 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term619816 = ((Class) term619817).getDeclaredField((String) "ORIGINAL");
        ((Field) term619816).setAccessible(true);
        Object enum1356 = ((Field) term619816).get((Object) null);
        Class<? extends Object> term620083 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term620082 = ((Class) term620083).getDeclaredField((String) "NONE");
        ((Field) term620082).setAccessible(true);
        Object enum1357 = ((Field) term620082).get((Object) null);
        Class<? extends Object> term620724 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term620723 = ((Class) term620724).getDeclaredField((String) "NO_CLEAR");
        ((Field) term620723).setAccessible(true);
        Object enum1358 = ((Field) term620723).get((Object) null);
        Class<? extends Object> term621010 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term621009 = ((Class) term621010).getDeclaredField((String) "UNDEFINED");
        ((Field) term621009).setAccessible(true);
        Object enum1359 = ((Field) term621009).get((Object) null);
        term618211 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvRecord"));
        Object term618213 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term618336 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term618337 = newInstance(Class.forName("java.time.LocalDate"));
        Object term618341 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term618211, term618211.getClass(), "id", -4776514981294468834L);
        setLongField(term618213, term618213.getClass(), "id", -7273680182770718108L);
        setIntField(term618213, term618213.getClass(), "pdId", -634536248);
        setField(term618213, term618213.getClass(), "playerName", "xxx");
        setIntField(term618213, term618213.getClass(), "vocaloidPoints", 300);
        setIntField(term618213, term618213.getClass(), "level", 1);
        setIntField(term618213, term618213.getClass(), "levelExp", 1090329667);
        setField(term618213, term618213.getClass(), "levelTitle", "xxx");
        setIntField(term618213, term618213.getClass(), "plateId", -1);
        setIntField(term618213, term618213.getClass(), "plateEffectId", -1);
        setField(term618213, term618213.getClass(), "passwordStatus", enum1353);
        setField(term618213, term618213.getClass(), "password", "**********");
        setBooleanField(term618213, term618213.getClass(), "preferPerPvModule", true);
        setBooleanField(term618213, term618213.getClass(), "preferCommonModule", false);
        setBooleanField(term618213, term618213.getClass(), "usePerPvSkin", true);
        setBooleanField(term618213, term618213.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term618213, term618213.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term618213, term618213.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term618213, term618213.getClass(), "usePerPvTouchSliderSe", false);
        setField(term618213, term618213.getClass(), "commonModule", "-999,-999,-999");
        setField(term618213, term618213.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term618337, term618337.getClass(), "year", 2026);
        setShortField(term618337, term618337.getClass(), "month", (short) 8);
        setShortField(term618337, term618337.getClass(), "day", (short) 12);
        setField(term618336, term618336.getClass(), "date", term618337);
        setByteField(term618341, term618341.getClass(), "hour", (byte) 2);
        setByteField(term618341, term618341.getClass(), "minute", (byte) 4);
        setByteField(term618341, term618341.getClass(), "second", (byte) 5);
        setIntField(term618341, term618341.getClass(), "nano", 936265000);
        setField(term618336, term618336.getClass(), "time", term618341);
        setField(term618213, term618213.getClass(), "commonModuleSetTime", term618336);
        setField(term618213, term618213.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term618213, term618213.getClass(), "commonSkin", -1);
        setIntField(term618213, term618213.getClass(), "headphoneVolume", 100);
        setBooleanField(term618213, term618213.getClass(), "buttonSeOn", true);
        setIntField(term618213, term618213.getClass(), "buttonSeVolume", 100);
        setIntField(term618213, term618213.getClass(), "sliderSeVolume", 100);
        setIntField(term618213, term618213.getClass(), "buttonSe", -1);
        setIntField(term618213, term618213.getClass(), "chainSlideSe", -1);
        setIntField(term618213, term618213.getClass(), "slideSe", -1);
        setIntField(term618213, term618213.getClass(), "sliderTouchSe", -1);
        setField(term618213, term618213.getClass(), "sortMode", enum1354);
        setIntField(term618213, term618213.getClass(), "nextPvId", -1);
        setField(term618213, term618213.getClass(), "nextDifficulty", enum1355);
        setField(term618213, term618213.getClass(), "nextEdition", enum1356);
        setBooleanField(term618213, term618213.getClass(), "showInterimRanking", true);
        setBooleanField(term618213, term618213.getClass(), "showClearStatus", true);
        setBooleanField(term618213, term618213.getClass(), "showGreatBorder", true);
        setBooleanField(term618213, term618213.getClass(), "showExcellentBorder", true);
        setBooleanField(term618213, term618213.getClass(), "showRivalBorder", true);
        setBooleanField(term618213, term618213.getClass(), "showRgoSetting", true);
        setBooleanField(term618213, term618213.getClass(), "contestNowPlayingEnable", false);
        setIntField(term618213, term618213.getClass(), "contestNowPlayingId", -1);
        setIntField(term618213, term618213.getClass(), "contestNowPlayingValue", -1);
        setField(term618213, term618213.getClass(), "contestNowPlayingResultRank", enum1357);
        setField(term618213, term618213.getClass(), "contestNowPlayingSpecifier", "");
        setField(term618213, term618213.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term618213, term618213.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term618213, term618213.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term618213, term618213.getClass(), "rivalPdId", -1);
        setField(term618211, term618211.getClass(), "pdId", term618213);
        setIntField(term618211, term618211.getClass(), "pvId", -1);
        setField(term618211, term618211.getClass(), "edition", enum1356);
        setField(term618211, term618211.getClass(), "difficulty", enum1355);
        setField(term618211, term618211.getClass(), "result", enum1358);
        setIntField(term618211, term618211.getClass(), "maxScore", -1);
        setIntField(term618211, term618211.getClass(), "maxAttain", -1);
        setField(term618211, term618211.getClass(), "challengeKind", enum1359);
        setField(term618211, term618211.getClass(), "rgoPurchased", "0,0,0");
        setField(term618211, term618211.getClass(), "rgoPlayed", "0,0,0");
        Class<? extends Object> term621319 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term621318 = ((Class) term621319).getDeclaredField((String) "STANDARD");
        ((Field) term621318).setAccessible(true);
        enum1360 = ((Field) term621318).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Object[] args = new Object[1];
        args[0] = enum1360;
        callMethod(klass, "setResult", argTypes, term618211, args);
    }

};


