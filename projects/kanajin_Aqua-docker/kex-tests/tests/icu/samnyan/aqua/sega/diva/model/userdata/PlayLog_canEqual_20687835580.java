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

public class PlayLog_canEqual_20687835580 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term340854;
     Object term341564;

    public PlayLog_canEqual_20687835580() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term341572 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term341571 = ((Class) term341572).getDeclaredField((String) "MISS");
        ((Field) term341571).setAccessible(true);
        Object enum780 = ((Field) term341571).get((Object) null);
        Class<? extends Object> term341949 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term341948 = ((Class) term341949).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term341948).setAccessible(true);
        Object enum781 = ((Field) term341948).get((Object) null);
        Class<? extends Object> term342232 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term342231 = ((Class) term342232).getDeclaredField((String) "NORMAL");
        ((Field) term342231).setAccessible(true);
        Object enum782 = ((Field) term342231).get((Object) null);
        Class<? extends Object> term342507 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term342506 = ((Class) term342507).getDeclaredField((String) "ORIGINAL");
        ((Field) term342506).setAccessible(true);
        Object enum783 = ((Field) term342506).get((Object) null);
        Class<? extends Object> term342773 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term342772 = ((Class) term342773).getDeclaredField((String) "NONE");
        ((Field) term342772).setAccessible(true);
        Object enum784 = ((Field) term342772).get((Object) null);
        Class<? extends Object> term343414 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term343413 = ((Class) term343414).getDeclaredField((String) "COMPLETED");
        ((Field) term343413).setAccessible(true);
        Object enum785 = ((Field) term343413).get((Object) null);
        Class<? extends Object> term343713 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term343712 = ((Class) term343713).getDeclaredField((String) "EXCELLENT");
        ((Field) term343712).setAccessible(true);
        Object enum786 = ((Field) term343712).get((Object) null);
        term340854 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        Object term340856 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term340979 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term340980 = newInstance(Class.forName("java.time.LocalDate"));
        Object term340984 = newInstance(Class.forName("java.time.LocalTime"));
        Object term341554 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term341555 = newInstance(Class.forName("java.time.LocalDate"));
        Object term341559 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term340854, term340854.getClass(), "id", -3954795081650780841L);
        setLongField(term340856, term340856.getClass(), "id", 3288791194263207397L);
        setIntField(term340856, term340856.getClass(), "pdId", 2027049805);
        setField(term340856, term340856.getClass(), "playerName", "xxx");
        setIntField(term340856, term340856.getClass(), "vocaloidPoints", 300);
        setIntField(term340856, term340856.getClass(), "level", 1);
        setIntField(term340856, term340856.getClass(), "levelExp", 1777210338);
        setField(term340856, term340856.getClass(), "levelTitle", "xxx");
        setIntField(term340856, term340856.getClass(), "plateId", -1);
        setIntField(term340856, term340856.getClass(), "plateEffectId", -1);
        setField(term340856, term340856.getClass(), "passwordStatus", enum780);
        setField(term340856, term340856.getClass(), "password", "**********");
        setBooleanField(term340856, term340856.getClass(), "preferPerPvModule", true);
        setBooleanField(term340856, term340856.getClass(), "preferCommonModule", true);
        setBooleanField(term340856, term340856.getClass(), "usePerPvSkin", false);
        setBooleanField(term340856, term340856.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term340856, term340856.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term340856, term340856.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term340856, term340856.getClass(), "usePerPvTouchSliderSe", true);
        setField(term340856, term340856.getClass(), "commonModule", "-999,-999,-999");
        setField(term340856, term340856.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term340980, term340980.getClass(), "year", 2026);
        setShortField(term340980, term340980.getClass(), "month", (short) 8);
        setShortField(term340980, term340980.getClass(), "day", (short) 12);
        setField(term340979, term340979.getClass(), "date", term340980);
        setByteField(term340984, term340984.getClass(), "hour", (byte) 2);
        setByteField(term340984, term340984.getClass(), "minute", (byte) 3);
        setByteField(term340984, term340984.getClass(), "second", (byte) 0);
        setIntField(term340984, term340984.getClass(), "nano", 243285000);
        setField(term340979, term340979.getClass(), "time", term340984);
        setField(term340856, term340856.getClass(), "commonModuleSetTime", term340979);
        setField(term340856, term340856.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term340856, term340856.getClass(), "commonSkin", -1);
        setIntField(term340856, term340856.getClass(), "headphoneVolume", 100);
        setBooleanField(term340856, term340856.getClass(), "buttonSeOn", true);
        setIntField(term340856, term340856.getClass(), "buttonSeVolume", 100);
        setIntField(term340856, term340856.getClass(), "sliderSeVolume", 100);
        setIntField(term340856, term340856.getClass(), "buttonSe", -1);
        setIntField(term340856, term340856.getClass(), "chainSlideSe", -1);
        setIntField(term340856, term340856.getClass(), "slideSe", -1);
        setIntField(term340856, term340856.getClass(), "sliderTouchSe", -1);
        setField(term340856, term340856.getClass(), "sortMode", enum781);
        setIntField(term340856, term340856.getClass(), "nextPvId", -1);
        setField(term340856, term340856.getClass(), "nextDifficulty", enum782);
        setField(term340856, term340856.getClass(), "nextEdition", enum783);
        setBooleanField(term340856, term340856.getClass(), "showInterimRanking", true);
        setBooleanField(term340856, term340856.getClass(), "showClearStatus", true);
        setBooleanField(term340856, term340856.getClass(), "showGreatBorder", true);
        setBooleanField(term340856, term340856.getClass(), "showExcellentBorder", true);
        setBooleanField(term340856, term340856.getClass(), "showRivalBorder", true);
        setBooleanField(term340856, term340856.getClass(), "showRgoSetting", true);
        setBooleanField(term340856, term340856.getClass(), "contestNowPlayingEnable", true);
        setIntField(term340856, term340856.getClass(), "contestNowPlayingId", -1);
        setIntField(term340856, term340856.getClass(), "contestNowPlayingValue", -1);
        setField(term340856, term340856.getClass(), "contestNowPlayingResultRank", enum784);
        setField(term340856, term340856.getClass(), "contestNowPlayingSpecifier", "");
        setField(term340856, term340856.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term340856, term340856.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term340856, term340856.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term340856, term340856.getClass(), "rivalPdId", -1);
        setField(term340854, term340854.getClass(), "pdId", term340856);
        setIntField(term340854, term340854.getClass(), "pvId", 1406833110);
        setField(term340854, term340854.getClass(), "difficulty", enum782);
        setField(term340854, term340854.getClass(), "edition", enum783);
        setIntField(term340854, term340854.getClass(), "scriptVer", 971309393);
        setIntField(term340854, term340854.getClass(), "score", 1506905403);
        setField(term340854, term340854.getClass(), "challengeKind", enum785);
        setIntField(term340854, term340854.getClass(), "challengeResult", 1022586170);
        setField(term340854, term340854.getClass(), "clearResult", enum786);
        setIntField(term340854, term340854.getClass(), "vp", -175612916);
        setIntField(term340854, term340854.getClass(), "coolCount", -1966814722);
        setIntField(term340854, term340854.getClass(), "coolPercent", -2040048430);
        setIntField(term340854, term340854.getClass(), "fineCount", 795243460);
        setIntField(term340854, term340854.getClass(), "finePercent", 1116550927);
        setIntField(term340854, term340854.getClass(), "safeCount", -1500511650);
        setIntField(term340854, term340854.getClass(), "safePercent", 1722619795);
        setIntField(term340854, term340854.getClass(), "sadCount", 558598813);
        setIntField(term340854, term340854.getClass(), "sadPercent", -282356982);
        setIntField(term340854, term340854.getClass(), "wrongCount", 1060240374);
        setIntField(term340854, term340854.getClass(), "wrongPercent", 2119043046);
        setIntField(term340854, term340854.getClass(), "maxCombo", 375507053);
        setIntField(term340854, term340854.getClass(), "chanceTime", 1803067672);
        setIntField(term340854, term340854.getClass(), "holdScore", -844822506);
        setIntField(term340854, term340854.getClass(), "attainPoint", -586687174);
        setIntField(term340854, term340854.getClass(), "skinId", 583343799);
        setIntField(term340854, term340854.getClass(), "buttonSe", 1831635466);
        setIntField(term340854, term340854.getClass(), "buttonSeVol", -981606069);
        setIntField(term340854, term340854.getClass(), "sliderSe", 548729456);
        setIntField(term340854, term340854.getClass(), "ChainSlideSe", 482026097);
        setIntField(term340854, term340854.getClass(), "SliderTouchSe", -528954009);
        setField(term340854, term340854.getClass(), "modules", "PqtVXXZMqK");
        setIntField(term340854, term340854.getClass(), "stageCompletion", -918570985);
        setIntField(term340854, term340854.getClass(), "slideScore", 242181753);
        setIntField(term340854, term340854.getClass(), "isVocalChange", -1356117545);
        setField(term340854, term340854.getClass(), "customizeItems", "rYbtIDVdnd");
        setField(term340854, term340854.getClass(), "rhythmGameOptions", "UKAReurpHG");
        setIntField(term340854, term340854.getClass(), "screenShotCount", -1);
        setIntField(term341555, term341555.getClass(), "year", 2020);
        setShortField(term341555, term341555.getClass(), "month", (short) 10);
        setShortField(term341555, term341555.getClass(), "day", (short) 25);
        setField(term341554, term341554.getClass(), "date", term341555);
        setByteField(term341559, term341559.getClass(), "hour", (byte) 18);
        setByteField(term341559, term341559.getClass(), "minute", (byte) 22);
        setByteField(term341559, term341559.getClass(), "second", (byte) 30);
        setIntField(term341559, term341559.getClass(), "nano", 948592965);
        setField(term341554, term341554.getClass(), "time", term341559);
        setField(term340854, term340854.getClass(), "dateTime", term341554);
        term341564 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term341564;
        callMethod(klass, "canEqual", argTypes, term340854, args);
    }

};


