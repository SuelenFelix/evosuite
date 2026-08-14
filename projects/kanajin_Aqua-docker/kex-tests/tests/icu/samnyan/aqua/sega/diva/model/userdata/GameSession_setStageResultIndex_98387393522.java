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

public class GameSession_setStageResultIndex_98387393522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term419930;
     Object term420583;

    public GameSession_setStageResultIndex_98387393522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term420592 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term420591 = ((Class) term420592).getDeclaredField((String) "MISS");
        ((Field) term420591).setAccessible(true);
        Object enum945 = ((Field) term420591).get((Object) null);
        Class<? extends Object> term420969 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term420968 = ((Class) term420969).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term420968).setAccessible(true);
        Object enum946 = ((Field) term420968).get((Object) null);
        Class<? extends Object> term421252 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term421251 = ((Class) term421252).getDeclaredField((String) "NORMAL");
        ((Field) term421251).setAccessible(true);
        Object enum947 = ((Field) term421251).get((Object) null);
        Class<? extends Object> term421527 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term421526 = ((Class) term421527).getDeclaredField((String) "ORIGINAL");
        ((Field) term421526).setAccessible(true);
        Object enum948 = ((Field) term421526).get((Object) null);
        Class<? extends Object> term421793 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term421792 = ((Class) term421793).getDeclaredField((String) "NONE");
        ((Field) term421792).setAccessible(true);
        Object enum949 = ((Field) term421792).get((Object) null);
        Class<? extends Object> term422434 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.StartMode");
        Field term422433 = ((Class) term422434).getDeclaredField((String) "START");
        ((Field) term422433).setAccessible(true);
        Object enum950 = ((Field) term422433).get((Object) null);
        Integer term420567 = new Integer(-1731761810);
        Integer term420569 = new Integer(197109649);
        Integer term420571 = new Integer(-1239406390);
        Integer term420573 = new Integer(1557431527);
        Integer term420575 = new Integer(-1504890659);
        Integer term420577 = new Integer(1358829571);
        Integer term420579 = new Integer(991356662);
        Integer term420581 = new Integer(-506958186);
        term419930 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession"));
        Object term419933 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term420056 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term420057 = newInstance(Class.forName("java.time.LocalDate"));
        Object term420061 = newInstance(Class.forName("java.time.LocalTime"));
        Object term420547 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term420548 = newInstance(Class.forName("java.time.LocalDate"));
        Object term420552 = newInstance(Class.forName("java.time.LocalTime"));
        Object term420557 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term420558 = newInstance(Class.forName("java.time.LocalDate"));
        Object term420562 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term419930, term419930.getClass(), "id", -2187638136407967948L);
        setIntField(term419930, term419930.getClass(), "acceptId", -1605518502);
        setLongField(term419933, term419933.getClass(), "id", 8708846223293804408L);
        setIntField(term419933, term419933.getClass(), "pdId", -499081946);
        setField(term419933, term419933.getClass(), "playerName", "xxx");
        setIntField(term419933, term419933.getClass(), "vocaloidPoints", 300);
        setIntField(term419933, term419933.getClass(), "level", 1);
        setIntField(term419933, term419933.getClass(), "levelExp", 1834067063);
        setField(term419933, term419933.getClass(), "levelTitle", "xxx");
        setIntField(term419933, term419933.getClass(), "plateId", -1);
        setIntField(term419933, term419933.getClass(), "plateEffectId", -1);
        setField(term419933, term419933.getClass(), "passwordStatus", enum945);
        setField(term419933, term419933.getClass(), "password", "**********");
        setBooleanField(term419933, term419933.getClass(), "preferPerPvModule", true);
        setBooleanField(term419933, term419933.getClass(), "preferCommonModule", false);
        setBooleanField(term419933, term419933.getClass(), "usePerPvSkin", false);
        setBooleanField(term419933, term419933.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term419933, term419933.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term419933, term419933.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term419933, term419933.getClass(), "usePerPvTouchSliderSe", false);
        setField(term419933, term419933.getClass(), "commonModule", "-999,-999,-999");
        setField(term419933, term419933.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term420057, term420057.getClass(), "year", 2026);
        setShortField(term420057, term420057.getClass(), "month", (short) 8);
        setShortField(term420057, term420057.getClass(), "day", (short) 12);
        setField(term420056, term420056.getClass(), "date", term420057);
        setByteField(term420061, term420061.getClass(), "hour", (byte) 2);
        setByteField(term420061, term420061.getClass(), "minute", (byte) 3);
        setByteField(term420061, term420061.getClass(), "second", (byte) 27);
        setIntField(term420061, term420061.getClass(), "nano", 251462000);
        setField(term420056, term420056.getClass(), "time", term420061);
        setField(term419933, term419933.getClass(), "commonModuleSetTime", term420056);
        setField(term419933, term419933.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term419933, term419933.getClass(), "commonSkin", -1);
        setIntField(term419933, term419933.getClass(), "headphoneVolume", 100);
        setBooleanField(term419933, term419933.getClass(), "buttonSeOn", true);
        setIntField(term419933, term419933.getClass(), "buttonSeVolume", 100);
        setIntField(term419933, term419933.getClass(), "sliderSeVolume", 100);
        setIntField(term419933, term419933.getClass(), "buttonSe", -1);
        setIntField(term419933, term419933.getClass(), "chainSlideSe", -1);
        setIntField(term419933, term419933.getClass(), "slideSe", -1);
        setIntField(term419933, term419933.getClass(), "sliderTouchSe", -1);
        setField(term419933, term419933.getClass(), "sortMode", enum946);
        setIntField(term419933, term419933.getClass(), "nextPvId", -1);
        setField(term419933, term419933.getClass(), "nextDifficulty", enum947);
        setField(term419933, term419933.getClass(), "nextEdition", enum948);
        setBooleanField(term419933, term419933.getClass(), "showInterimRanking", true);
        setBooleanField(term419933, term419933.getClass(), "showClearStatus", true);
        setBooleanField(term419933, term419933.getClass(), "showGreatBorder", true);
        setBooleanField(term419933, term419933.getClass(), "showExcellentBorder", true);
        setBooleanField(term419933, term419933.getClass(), "showRivalBorder", true);
        setBooleanField(term419933, term419933.getClass(), "showRgoSetting", true);
        setBooleanField(term419933, term419933.getClass(), "contestNowPlayingEnable", true);
        setIntField(term419933, term419933.getClass(), "contestNowPlayingId", -1);
        setIntField(term419933, term419933.getClass(), "contestNowPlayingValue", -1);
        setField(term419933, term419933.getClass(), "contestNowPlayingResultRank", enum949);
        setField(term419933, term419933.getClass(), "contestNowPlayingSpecifier", "");
        setField(term419933, term419933.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term419933, term419933.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term419933, term419933.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term419933, term419933.getClass(), "rivalPdId", -1);
        setField(term419930, term419930.getClass(), "pdId", term419933);
        setField(term419930, term419930.getClass(), "startMode", enum950);
        setIntField(term420548, term420548.getClass(), "year", 2029);
        setShortField(term420548, term420548.getClass(), "month", (short) 11);
        setShortField(term420548, term420548.getClass(), "day", (short) 18);
        setField(term420547, term420547.getClass(), "date", term420548);
        setByteField(term420552, term420552.getClass(), "hour", (byte) 5);
        setByteField(term420552, term420552.getClass(), "minute", (byte) 36);
        setByteField(term420552, term420552.getClass(), "second", (byte) 57);
        setIntField(term420552, term420552.getClass(), "nano", 394167804);
        setField(term420547, term420547.getClass(), "time", term420552);
        setField(term419930, term419930.getClass(), "startTime", term420547);
        setIntField(term420558, term420558.getClass(), "year", 2020);
        setShortField(term420558, term420558.getClass(), "month", (short) 10);
        setShortField(term420558, term420558.getClass(), "day", (short) 8);
        setField(term420557, term420557.getClass(), "date", term420558);
        setByteField(term420562, term420562.getClass(), "hour", (byte) 15);
        setByteField(term420562, term420562.getClass(), "minute", (byte) 57);
        setByteField(term420562, term420562.getClass(), "second", (byte) 17);
        setIntField(term420562, term420562.getClass(), "nano", 288139529);
        setField(term420557, term420557.getClass(), "time", term420562);
        setField(term419930, term419930.getClass(), "lastUpdateTime", term420557);
        setField(term419930, term419930.getClass(), "stageIndex", term420567);
        setField(term419930, term419930.getClass(), "stageResultIndex", term420569);
        setField(term419930, term419930.getClass(), "lastPvId", term420571);
        setField(term419930, term419930.getClass(), "levelNumber", term420573);
        setField(term419930, term419930.getClass(), "levelExp", term420575);
        setField(term419930, term419930.getClass(), "oldLevelNumber", term420577);
        setField(term419930, term419930.getClass(), "oldLevelExp", term420579);
        setField(term419930, term419930.getClass(), "vp", term420581);
        term420583 = new Integer(-507387516);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term420583;
        callMethod(klass, "setStageResultIndex", argTypes, term419930, args);
    }

};


