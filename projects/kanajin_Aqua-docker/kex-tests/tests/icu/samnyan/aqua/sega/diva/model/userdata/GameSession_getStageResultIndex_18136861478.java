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

public class GameSession_getStageResultIndex_18136861478 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term379685;

    public GameSession_getStageResultIndex_18136861478() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term380349 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term380348 = ((Class) term380349).getDeclaredField((String) "MISS");
        ((Field) term380348).setAccessible(true);
        Object enum860 = ((Field) term380348).get((Object) null);
        Class<? extends Object> term380726 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term380725 = ((Class) term380726).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term380725).setAccessible(true);
        Object enum861 = ((Field) term380725).get((Object) null);
        Class<? extends Object> term381009 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term381008 = ((Class) term381009).getDeclaredField((String) "NORMAL");
        ((Field) term381008).setAccessible(true);
        Object enum862 = ((Field) term381008).get((Object) null);
        Class<? extends Object> term381284 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term381283 = ((Class) term381284).getDeclaredField((String) "ORIGINAL");
        ((Field) term381283).setAccessible(true);
        Object enum863 = ((Field) term381283).get((Object) null);
        Class<? extends Object> term381550 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term381549 = ((Class) term381550).getDeclaredField((String) "NONE");
        ((Field) term381549).setAccessible(true);
        Object enum864 = ((Field) term381549).get((Object) null);
        Class<? extends Object> term382191 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.StartMode");
        Field term382190 = ((Class) term382191).getDeclaredField((String) "PRE_START");
        ((Field) term382190).setAccessible(true);
        Object enum865 = ((Field) term382190).get((Object) null);
        Integer term380326 = new Integer(1225272962);
        Integer term380328 = new Integer(1324040357);
        Integer term380330 = new Integer(-1588772968);
        Integer term380332 = new Integer(-93135961);
        Integer term380334 = new Integer(-112921587);
        Integer term380336 = new Integer(933028652);
        Integer term380338 = new Integer(287287233);
        Integer term380340 = new Integer(962840079);
        term379685 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession"));
        Object term379688 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term379811 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term379812 = newInstance(Class.forName("java.time.LocalDate"));
        Object term379816 = newInstance(Class.forName("java.time.LocalTime"));
        Object term380306 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term380307 = newInstance(Class.forName("java.time.LocalDate"));
        Object term380311 = newInstance(Class.forName("java.time.LocalTime"));
        Object term380316 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term380317 = newInstance(Class.forName("java.time.LocalDate"));
        Object term380321 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term379685, term379685.getClass(), "id", 329213208496958131L);
        setIntField(term379685, term379685.getClass(), "acceptId", -1419515823);
        setLongField(term379688, term379688.getClass(), "id", 8107921244631636572L);
        setIntField(term379688, term379688.getClass(), "pdId", 1749999469);
        setField(term379688, term379688.getClass(), "playerName", "xxx");
        setIntField(term379688, term379688.getClass(), "vocaloidPoints", 300);
        setIntField(term379688, term379688.getClass(), "level", 1);
        setIntField(term379688, term379688.getClass(), "levelExp", -1508018812);
        setField(term379688, term379688.getClass(), "levelTitle", "xxx");
        setIntField(term379688, term379688.getClass(), "plateId", -1);
        setIntField(term379688, term379688.getClass(), "plateEffectId", -1);
        setField(term379688, term379688.getClass(), "passwordStatus", enum860);
        setField(term379688, term379688.getClass(), "password", "**********");
        setBooleanField(term379688, term379688.getClass(), "preferPerPvModule", true);
        setBooleanField(term379688, term379688.getClass(), "preferCommonModule", true);
        setBooleanField(term379688, term379688.getClass(), "usePerPvSkin", false);
        setBooleanField(term379688, term379688.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term379688, term379688.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term379688, term379688.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term379688, term379688.getClass(), "usePerPvTouchSliderSe", false);
        setField(term379688, term379688.getClass(), "commonModule", "-999,-999,-999");
        setField(term379688, term379688.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term379812, term379812.getClass(), "year", 2026);
        setShortField(term379812, term379812.getClass(), "month", (short) 8);
        setShortField(term379812, term379812.getClass(), "day", (short) 12);
        setField(term379811, term379811.getClass(), "date", term379812);
        setByteField(term379816, term379816.getClass(), "hour", (byte) 2);
        setByteField(term379816, term379816.getClass(), "minute", (byte) 3);
        setByteField(term379816, term379816.getClass(), "second", (byte) 23);
        setIntField(term379816, term379816.getClass(), "nano", 810918000);
        setField(term379811, term379811.getClass(), "time", term379816);
        setField(term379688, term379688.getClass(), "commonModuleSetTime", term379811);
        setField(term379688, term379688.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term379688, term379688.getClass(), "commonSkin", -1);
        setIntField(term379688, term379688.getClass(), "headphoneVolume", 100);
        setBooleanField(term379688, term379688.getClass(), "buttonSeOn", true);
        setIntField(term379688, term379688.getClass(), "buttonSeVolume", 100);
        setIntField(term379688, term379688.getClass(), "sliderSeVolume", 100);
        setIntField(term379688, term379688.getClass(), "buttonSe", -1);
        setIntField(term379688, term379688.getClass(), "chainSlideSe", -1);
        setIntField(term379688, term379688.getClass(), "slideSe", -1);
        setIntField(term379688, term379688.getClass(), "sliderTouchSe", -1);
        setField(term379688, term379688.getClass(), "sortMode", enum861);
        setIntField(term379688, term379688.getClass(), "nextPvId", -1);
        setField(term379688, term379688.getClass(), "nextDifficulty", enum862);
        setField(term379688, term379688.getClass(), "nextEdition", enum863);
        setBooleanField(term379688, term379688.getClass(), "showInterimRanking", true);
        setBooleanField(term379688, term379688.getClass(), "showClearStatus", true);
        setBooleanField(term379688, term379688.getClass(), "showGreatBorder", true);
        setBooleanField(term379688, term379688.getClass(), "showExcellentBorder", true);
        setBooleanField(term379688, term379688.getClass(), "showRivalBorder", true);
        setBooleanField(term379688, term379688.getClass(), "showRgoSetting", true);
        setBooleanField(term379688, term379688.getClass(), "contestNowPlayingEnable", true);
        setIntField(term379688, term379688.getClass(), "contestNowPlayingId", -1);
        setIntField(term379688, term379688.getClass(), "contestNowPlayingValue", -1);
        setField(term379688, term379688.getClass(), "contestNowPlayingResultRank", enum864);
        setField(term379688, term379688.getClass(), "contestNowPlayingSpecifier", "");
        setField(term379688, term379688.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term379688, term379688.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term379688, term379688.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term379688, term379688.getClass(), "rivalPdId", -1);
        setField(term379685, term379685.getClass(), "pdId", term379688);
        setField(term379685, term379685.getClass(), "startMode", enum865);
        setIntField(term380307, term380307.getClass(), "year", 2025);
        setShortField(term380307, term380307.getClass(), "month", (short) 9);
        setShortField(term380307, term380307.getClass(), "day", (short) 18);
        setField(term380306, term380306.getClass(), "date", term380307);
        setByteField(term380311, term380311.getClass(), "hour", (byte) 16);
        setByteField(term380311, term380311.getClass(), "minute", (byte) 1);
        setByteField(term380311, term380311.getClass(), "second", (byte) 23);
        setIntField(term380311, term380311.getClass(), "nano", 178285726);
        setField(term380306, term380306.getClass(), "time", term380311);
        setField(term379685, term379685.getClass(), "startTime", term380306);
        setIntField(term380317, term380317.getClass(), "year", 2013);
        setShortField(term380317, term380317.getClass(), "month", (short) 7);
        setShortField(term380317, term380317.getClass(), "day", (short) 26);
        setField(term380316, term380316.getClass(), "date", term380317);
        setByteField(term380321, term380321.getClass(), "hour", (byte) 14);
        setByteField(term380321, term380321.getClass(), "minute", (byte) 45);
        setByteField(term380321, term380321.getClass(), "second", (byte) 33);
        setIntField(term380321, term380321.getClass(), "nano", 547995853);
        setField(term380316, term380316.getClass(), "time", term380321);
        setField(term379685, term379685.getClass(), "lastUpdateTime", term380316);
        setField(term379685, term379685.getClass(), "stageIndex", term380326);
        setField(term379685, term379685.getClass(), "stageResultIndex", term380328);
        setField(term379685, term379685.getClass(), "lastPvId", term380330);
        setField(term379685, term379685.getClass(), "levelNumber", term380332);
        setField(term379685, term379685.getClass(), "levelExp", term380334);
        setField(term379685, term379685.getClass(), "oldLevelNumber", term380336);
        setField(term379685, term379685.getClass(), "oldLevelExp", term380338);
        setField(term379685, term379685.getClass(), "vp", term380340);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStageResultIndex", argTypes, term379685, args);
    }

};


