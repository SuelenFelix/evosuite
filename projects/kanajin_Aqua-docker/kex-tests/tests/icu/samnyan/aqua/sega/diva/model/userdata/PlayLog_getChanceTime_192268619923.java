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

public class PlayLog_getChanceTime_192268619923 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137078;

    public PlayLog_getChanceTime_192268619923() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term137811 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term137810 = ((Class) term137811).getDeclaredField((String) "MISS");
        ((Field) term137810).setAccessible(true);
        Object enum301 = ((Field) term137810).get((Object) null);
        Class<? extends Object> term138188 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term138187 = ((Class) term138188).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term138187).setAccessible(true);
        Object enum302 = ((Field) term138187).get((Object) null);
        Class<? extends Object> term138471 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term138470 = ((Class) term138471).getDeclaredField((String) "NORMAL");
        ((Field) term138470).setAccessible(true);
        Object enum303 = ((Field) term138470).get((Object) null);
        Class<? extends Object> term138746 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term138745 = ((Class) term138746).getDeclaredField((String) "ORIGINAL");
        ((Field) term138745).setAccessible(true);
        Object enum304 = ((Field) term138745).get((Object) null);
        Class<? extends Object> term139012 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term139011 = ((Class) term139012).getDeclaredField((String) "NONE");
        ((Field) term139011).setAccessible(true);
        Object enum305 = ((Field) term139011).get((Object) null);
        Class<? extends Object> term139653 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term139652 = ((Class) term139653).getDeclaredField((String) "EASY");
        ((Field) term139652).setAccessible(true);
        Object enum306 = ((Field) term139652).get((Object) null);
        Class<? extends Object> term139922 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term139921 = ((Class) term139922).getDeclaredField((String) "EXTRA");
        ((Field) term139921).setAccessible(true);
        Object enum307 = ((Field) term139921).get((Object) null);
        Class<? extends Object> term140179 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term140178 = ((Class) term140179).getDeclaredField((String) "PERFECT");
        ((Field) term140178).setAccessible(true);
        Object enum308 = ((Field) term140178).get((Object) null);
        Class<? extends Object> term140472 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term140471 = ((Class) term140472).getDeclaredField((String) "STANDARD");
        ((Field) term140471).setAccessible(true);
        Object enum309 = ((Field) term140471).get((Object) null);
        term137078 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        Object term137080 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term137203 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term137204 = newInstance(Class.forName("java.time.LocalDate"));
        Object term137208 = newInstance(Class.forName("java.time.LocalTime"));
        Object term137794 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term137795 = newInstance(Class.forName("java.time.LocalDate"));
        Object term137799 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term137078, term137078.getClass(), "id", 6689117472719450333L);
        setLongField(term137080, term137080.getClass(), "id", 5836128569274066678L);
        setIntField(term137080, term137080.getClass(), "pdId", 1460702778);
        setField(term137080, term137080.getClass(), "playerName", "xxx");
        setIntField(term137080, term137080.getClass(), "vocaloidPoints", 300);
        setIntField(term137080, term137080.getClass(), "level", 1);
        setIntField(term137080, term137080.getClass(), "levelExp", -1398142433);
        setField(term137080, term137080.getClass(), "levelTitle", "xxx");
        setIntField(term137080, term137080.getClass(), "plateId", -1);
        setIntField(term137080, term137080.getClass(), "plateEffectId", -1);
        setField(term137080, term137080.getClass(), "passwordStatus", enum301);
        setField(term137080, term137080.getClass(), "password", "**********");
        setBooleanField(term137080, term137080.getClass(), "preferPerPvModule", true);
        setBooleanField(term137080, term137080.getClass(), "preferCommonModule", true);
        setBooleanField(term137080, term137080.getClass(), "usePerPvSkin", false);
        setBooleanField(term137080, term137080.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term137080, term137080.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term137080, term137080.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term137080, term137080.getClass(), "usePerPvTouchSliderSe", false);
        setField(term137080, term137080.getClass(), "commonModule", "-999,-999,-999");
        setField(term137080, term137080.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term137204, term137204.getClass(), "year", 2026);
        setShortField(term137204, term137204.getClass(), "month", (short) 6);
        setShortField(term137204, term137204.getClass(), "day", (short) 29);
        setField(term137203, term137203.getClass(), "date", term137204);
        setByteField(term137208, term137208.getClass(), "hour", (byte) 4);
        setByteField(term137208, term137208.getClass(), "minute", (byte) 27);
        setByteField(term137208, term137208.getClass(), "second", (byte) 29);
        setIntField(term137208, term137208.getClass(), "nano", 455462000);
        setField(term137203, term137203.getClass(), "time", term137208);
        setField(term137080, term137080.getClass(), "commonModuleSetTime", term137203);
        setField(term137080, term137080.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term137080, term137080.getClass(), "commonSkin", -1);
        setIntField(term137080, term137080.getClass(), "headphoneVolume", 100);
        setBooleanField(term137080, term137080.getClass(), "buttonSeOn", true);
        setIntField(term137080, term137080.getClass(), "buttonSeVolume", 100);
        setIntField(term137080, term137080.getClass(), "sliderSeVolume", 100);
        setIntField(term137080, term137080.getClass(), "buttonSe", -1);
        setIntField(term137080, term137080.getClass(), "chainSlideSe", -1);
        setIntField(term137080, term137080.getClass(), "slideSe", -1);
        setIntField(term137080, term137080.getClass(), "sliderTouchSe", -1);
        setField(term137080, term137080.getClass(), "sortMode", enum302);
        setIntField(term137080, term137080.getClass(), "nextPvId", -1);
        setField(term137080, term137080.getClass(), "nextDifficulty", enum303);
        setField(term137080, term137080.getClass(), "nextEdition", enum304);
        setBooleanField(term137080, term137080.getClass(), "showInterimRanking", true);
        setBooleanField(term137080, term137080.getClass(), "showClearStatus", true);
        setBooleanField(term137080, term137080.getClass(), "showGreatBorder", true);
        setBooleanField(term137080, term137080.getClass(), "showExcellentBorder", true);
        setBooleanField(term137080, term137080.getClass(), "showRivalBorder", true);
        setBooleanField(term137080, term137080.getClass(), "showRgoSetting", true);
        setBooleanField(term137080, term137080.getClass(), "contestNowPlayingEnable", true);
        setIntField(term137080, term137080.getClass(), "contestNowPlayingId", -1);
        setIntField(term137080, term137080.getClass(), "contestNowPlayingValue", -1);
        setField(term137080, term137080.getClass(), "contestNowPlayingResultRank", enum305);
        setField(term137080, term137080.getClass(), "contestNowPlayingSpecifier", "");
        setField(term137080, term137080.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term137080, term137080.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term137080, term137080.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term137080, term137080.getClass(), "rivalPdId", -1);
        setField(term137078, term137078.getClass(), "pdId", term137080);
        setIntField(term137078, term137078.getClass(), "pvId", -1112119058);
        setField(term137078, term137078.getClass(), "difficulty", enum306);
        setField(term137078, term137078.getClass(), "edition", enum307);
        setIntField(term137078, term137078.getClass(), "scriptVer", 2073858334);
        setIntField(term137078, term137078.getClass(), "score", -1693535639);
        setField(term137078, term137078.getClass(), "challengeKind", enum308);
        setIntField(term137078, term137078.getClass(), "challengeResult", 1344744036);
        setField(term137078, term137078.getClass(), "clearResult", enum309);
        setIntField(term137078, term137078.getClass(), "vp", -98060427);
        setIntField(term137078, term137078.getClass(), "coolCount", -1272268399);
        setIntField(term137078, term137078.getClass(), "coolPercent", 1120271104);
        setIntField(term137078, term137078.getClass(), "fineCount", -128435804);
        setIntField(term137078, term137078.getClass(), "finePercent", 2136158480);
        setIntField(term137078, term137078.getClass(), "safeCount", 2118747457);
        setIntField(term137078, term137078.getClass(), "safePercent", 1868344256);
        setIntField(term137078, term137078.getClass(), "sadCount", 1857693976);
        setIntField(term137078, term137078.getClass(), "sadPercent", 1631305277);
        setIntField(term137078, term137078.getClass(), "wrongCount", 162113491);
        setIntField(term137078, term137078.getClass(), "wrongPercent", -932147928);
        setIntField(term137078, term137078.getClass(), "maxCombo", 487369012);
        setIntField(term137078, term137078.getClass(), "chanceTime", -179238712);
        setIntField(term137078, term137078.getClass(), "holdScore", -2018735535);
        setIntField(term137078, term137078.getClass(), "attainPoint", -658524954);
        setIntField(term137078, term137078.getClass(), "skinId", -2009613557);
        setIntField(term137078, term137078.getClass(), "buttonSe", 654195547);
        setIntField(term137078, term137078.getClass(), "buttonSeVol", 1622857008);
        setIntField(term137078, term137078.getClass(), "sliderSe", 934338954);
        setIntField(term137078, term137078.getClass(), "ChainSlideSe", 598635505);
        setIntField(term137078, term137078.getClass(), "SliderTouchSe", -944986533);
        setField(term137078, term137078.getClass(), "modules", "bLPjGVBhlX");
        setIntField(term137078, term137078.getClass(), "stageCompletion", 1894454926);
        setIntField(term137078, term137078.getClass(), "slideScore", 1415142780);
        setIntField(term137078, term137078.getClass(), "isVocalChange", -574105759);
        setField(term137078, term137078.getClass(), "customizeItems", "whBvTVIIlC");
        setField(term137078, term137078.getClass(), "rhythmGameOptions", "IgRJUzaCwW");
        setIntField(term137078, term137078.getClass(), "screenShotCount", -1);
        setIntField(term137795, term137795.getClass(), "year", 2023);
        setShortField(term137795, term137795.getClass(), "month", (short) 9);
        setShortField(term137795, term137795.getClass(), "day", (short) 23);
        setField(term137794, term137794.getClass(), "date", term137795);
        setByteField(term137799, term137799.getClass(), "hour", (byte) 12);
        setByteField(term137799, term137799.getClass(), "minute", (byte) 55);
        setByteField(term137799, term137799.getClass(), "second", (byte) 58);
        setIntField(term137799, term137799.getClass(), "nano", 159178396);
        setField(term137794, term137794.getClass(), "time", term137799);
        setField(term137078, term137078.getClass(), "dateTime", term137794);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getChanceTime", argTypes, term137078, args);
    }

};


