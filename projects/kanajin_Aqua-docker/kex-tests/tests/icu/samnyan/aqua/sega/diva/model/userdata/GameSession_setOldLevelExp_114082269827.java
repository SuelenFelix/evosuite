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
import java.lang.Integer;

public class GameSession_setOldLevelExp_114082269827 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term433828;
     Object term434481;

    public GameSession_setOldLevelExp_114082269827() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term434490 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term434489 = ((Class) term434490).getDeclaredField((String) "MISS");
        ((Field) term434489).setAccessible(true);
        Object enum975 = ((Field) term434489).get((Object) null);
        Class<? extends Object> term434867 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term434866 = ((Class) term434867).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term434866).setAccessible(true);
        Object enum976 = ((Field) term434866).get((Object) null);
        Class<? extends Object> term435150 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term435149 = ((Class) term435150).getDeclaredField((String) "NORMAL");
        ((Field) term435149).setAccessible(true);
        Object enum977 = ((Field) term435149).get((Object) null);
        Class<? extends Object> term435425 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term435424 = ((Class) term435425).getDeclaredField((String) "ORIGINAL");
        ((Field) term435424).setAccessible(true);
        Object enum978 = ((Field) term435424).get((Object) null);
        Class<? extends Object> term435691 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term435690 = ((Class) term435691).getDeclaredField((String) "NONE");
        ((Field) term435690).setAccessible(true);
        Object enum979 = ((Field) term435690).get((Object) null);
        Class<? extends Object> term436332 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.StartMode");
        Field term436331 = ((Class) term436332).getDeclaredField((String) "START");
        ((Field) term436331).setAccessible(true);
        Object enum980 = ((Field) term436331).get((Object) null);
        Integer term434465 = new Integer(-159494544);
        Integer term434467 = new Integer(-75206835);
        Integer term434469 = new Integer(-1618206977);
        Integer term434471 = new Integer(-1747406163);
        Integer term434473 = new Integer(388157121);
        Integer term434475 = new Integer(1684998508);
        Integer term434477 = new Integer(-1476644457);
        Integer term434479 = new Integer(1270666529);
        term433828 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession"));
        Object term433831 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term433954 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term433955 = newInstance(Class.forName("java.time.LocalDate"));
        Object term433959 = newInstance(Class.forName("java.time.LocalTime"));
        Object term434445 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term434446 = newInstance(Class.forName("java.time.LocalDate"));
        Object term434450 = newInstance(Class.forName("java.time.LocalTime"));
        Object term434455 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term434456 = newInstance(Class.forName("java.time.LocalDate"));
        Object term434460 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term433828, term433828.getClass(), "id", 5315236285592892506L);
        setIntField(term433828, term433828.getClass(), "acceptId", -91129577);
        setLongField(term433831, term433831.getClass(), "id", -6969704322644192945L);
        setIntField(term433831, term433831.getClass(), "pdId", 1629059877);
        setField(term433831, term433831.getClass(), "playerName", "xxx");
        setIntField(term433831, term433831.getClass(), "vocaloidPoints", 300);
        setIntField(term433831, term433831.getClass(), "level", 1);
        setIntField(term433831, term433831.getClass(), "levelExp", -649940550);
        setField(term433831, term433831.getClass(), "levelTitle", "xxx");
        setIntField(term433831, term433831.getClass(), "plateId", -1);
        setIntField(term433831, term433831.getClass(), "plateEffectId", -1);
        setField(term433831, term433831.getClass(), "passwordStatus", enum975);
        setField(term433831, term433831.getClass(), "password", "**********");
        setBooleanField(term433831, term433831.getClass(), "preferPerPvModule", true);
        setBooleanField(term433831, term433831.getClass(), "preferCommonModule", true);
        setBooleanField(term433831, term433831.getClass(), "usePerPvSkin", true);
        setBooleanField(term433831, term433831.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term433831, term433831.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term433831, term433831.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term433831, term433831.getClass(), "usePerPvTouchSliderSe", true);
        setField(term433831, term433831.getClass(), "commonModule", "-999,-999,-999");
        setField(term433831, term433831.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term433955, term433955.getClass(), "year", 2026);
        setShortField(term433955, term433955.getClass(), "month", (short) 6);
        setShortField(term433955, term433955.getClass(), "day", (short) 29);
        setField(term433954, term433954.getClass(), "date", term433955);
        setByteField(term433959, term433959.getClass(), "hour", (byte) 4);
        setByteField(term433959, term433959.getClass(), "minute", (byte) 28);
        setByteField(term433959, term433959.getClass(), "second", (byte) 13);
        setIntField(term433959, term433959.getClass(), "nano", 643812000);
        setField(term433954, term433954.getClass(), "time", term433959);
        setField(term433831, term433831.getClass(), "commonModuleSetTime", term433954);
        setField(term433831, term433831.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term433831, term433831.getClass(), "commonSkin", -1);
        setIntField(term433831, term433831.getClass(), "headphoneVolume", 100);
        setBooleanField(term433831, term433831.getClass(), "buttonSeOn", true);
        setIntField(term433831, term433831.getClass(), "buttonSeVolume", 100);
        setIntField(term433831, term433831.getClass(), "sliderSeVolume", 100);
        setIntField(term433831, term433831.getClass(), "buttonSe", -1);
        setIntField(term433831, term433831.getClass(), "chainSlideSe", -1);
        setIntField(term433831, term433831.getClass(), "slideSe", -1);
        setIntField(term433831, term433831.getClass(), "sliderTouchSe", -1);
        setField(term433831, term433831.getClass(), "sortMode", enum976);
        setIntField(term433831, term433831.getClass(), "nextPvId", -1);
        setField(term433831, term433831.getClass(), "nextDifficulty", enum977);
        setField(term433831, term433831.getClass(), "nextEdition", enum978);
        setBooleanField(term433831, term433831.getClass(), "showInterimRanking", true);
        setBooleanField(term433831, term433831.getClass(), "showClearStatus", true);
        setBooleanField(term433831, term433831.getClass(), "showGreatBorder", true);
        setBooleanField(term433831, term433831.getClass(), "showExcellentBorder", true);
        setBooleanField(term433831, term433831.getClass(), "showRivalBorder", true);
        setBooleanField(term433831, term433831.getClass(), "showRgoSetting", true);
        setBooleanField(term433831, term433831.getClass(), "contestNowPlayingEnable", true);
        setIntField(term433831, term433831.getClass(), "contestNowPlayingId", -1);
        setIntField(term433831, term433831.getClass(), "contestNowPlayingValue", -1);
        setField(term433831, term433831.getClass(), "contestNowPlayingResultRank", enum979);
        setField(term433831, term433831.getClass(), "contestNowPlayingSpecifier", "");
        setField(term433831, term433831.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term433831, term433831.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term433831, term433831.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term433831, term433831.getClass(), "rivalPdId", -1);
        setField(term433828, term433828.getClass(), "pdId", term433831);
        setField(term433828, term433828.getClass(), "startMode", enum980);
        setIntField(term434446, term434446.getClass(), "year", 2028);
        setShortField(term434446, term434446.getClass(), "month", (short) 5);
        setShortField(term434446, term434446.getClass(), "day", (short) 7);
        setField(term434445, term434445.getClass(), "date", term434446);
        setByteField(term434450, term434450.getClass(), "hour", (byte) 7);
        setByteField(term434450, term434450.getClass(), "minute", (byte) 48);
        setByteField(term434450, term434450.getClass(), "second", (byte) 4);
        setIntField(term434450, term434450.getClass(), "nano", 380425174);
        setField(term434445, term434445.getClass(), "time", term434450);
        setField(term433828, term433828.getClass(), "startTime", term434445);
        setIntField(term434456, term434456.getClass(), "year", 2023);
        setShortField(term434456, term434456.getClass(), "month", (short) 5);
        setShortField(term434456, term434456.getClass(), "day", (short) 31);
        setField(term434455, term434455.getClass(), "date", term434456);
        setByteField(term434460, term434460.getClass(), "hour", (byte) 13);
        setByteField(term434460, term434460.getClass(), "minute", (byte) 29);
        setByteField(term434460, term434460.getClass(), "second", (byte) 29);
        setIntField(term434460, term434460.getClass(), "nano", 621312201);
        setField(term434455, term434455.getClass(), "time", term434460);
        setField(term433828, term433828.getClass(), "lastUpdateTime", term434455);
        setField(term433828, term433828.getClass(), "stageIndex", term434465);
        setField(term433828, term433828.getClass(), "stageResultIndex", term434467);
        setField(term433828, term433828.getClass(), "lastPvId", term434469);
        setField(term433828, term433828.getClass(), "levelNumber", term434471);
        setField(term433828, term433828.getClass(), "levelExp", term434473);
        setField(term433828, term433828.getClass(), "oldLevelNumber", term434475);
        setField(term433828, term433828.getClass(), "oldLevelExp", term434477);
        setField(term433828, term433828.getClass(), "vp", term434479);
        term434481 = new Integer(-1146679443);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term434481;
        callMethod(klass, "setOldLevelExp", argTypes, term433828, args);
    }

};


