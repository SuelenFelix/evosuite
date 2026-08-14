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

public class PlayLog_getChallengeResult_19049205029 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87778;

    public PlayLog_getChallengeResult_19049205029() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term88501 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term88500 = ((Class) term88501).getDeclaredField((String) "MISS");
        ((Field) term88500).setAccessible(true);
        Object enum185 = ((Field) term88500).get((Object) null);
        Class<? extends Object> term88878 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term88877 = ((Class) term88878).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term88877).setAccessible(true);
        Object enum186 = ((Field) term88877).get((Object) null);
        Class<? extends Object> term89161 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term89160 = ((Class) term89161).getDeclaredField((String) "NORMAL");
        ((Field) term89160).setAccessible(true);
        Object enum187 = ((Field) term89160).get((Object) null);
        Class<? extends Object> term89436 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term89435 = ((Class) term89436).getDeclaredField((String) "ORIGINAL");
        ((Field) term89435).setAccessible(true);
        Object enum188 = ((Field) term89435).get((Object) null);
        Class<? extends Object> term89702 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term89701 = ((Class) term89702).getDeclaredField((String) "NONE");
        ((Field) term89701).setAccessible(true);
        Object enum189 = ((Field) term89701).get((Object) null);
        Class<? extends Object> term90343 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term90342 = ((Class) term90343).getDeclaredField((String) "EXTRA");
        ((Field) term90342).setAccessible(true);
        Object enum190 = ((Field) term90342).get((Object) null);
        Class<? extends Object> term90600 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term90599 = ((Class) term90600).getDeclaredField((String) "EXCELLENT");
        ((Field) term90599).setAccessible(true);
        Object enum191 = ((Field) term90599).get((Object) null);
        Class<? extends Object> term90899 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term90898 = ((Class) term90899).getDeclaredField((String) "CHEAP");
        ((Field) term90898).setAccessible(true);
        Object enum192 = ((Field) term90898).get((Object) null);
        term87778 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        Object term87780 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term87903 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term87904 = newInstance(Class.forName("java.time.LocalDate"));
        Object term87908 = newInstance(Class.forName("java.time.LocalTime"));
        Object term88484 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term88485 = newInstance(Class.forName("java.time.LocalDate"));
        Object term88489 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term87778, term87778.getClass(), "id", 2443640364875054177L);
        setLongField(term87780, term87780.getClass(), "id", -1610676979013636850L);
        setIntField(term87780, term87780.getClass(), "pdId", -938508470);
        setField(term87780, term87780.getClass(), "playerName", "xxx");
        setIntField(term87780, term87780.getClass(), "vocaloidPoints", 300);
        setIntField(term87780, term87780.getClass(), "level", 1);
        setIntField(term87780, term87780.getClass(), "levelExp", 1242676024);
        setField(term87780, term87780.getClass(), "levelTitle", "xxx");
        setIntField(term87780, term87780.getClass(), "plateId", -1);
        setIntField(term87780, term87780.getClass(), "plateEffectId", -1);
        setField(term87780, term87780.getClass(), "passwordStatus", enum185);
        setField(term87780, term87780.getClass(), "password", "**********");
        setBooleanField(term87780, term87780.getClass(), "preferPerPvModule", true);
        setBooleanField(term87780, term87780.getClass(), "preferCommonModule", true);
        setBooleanField(term87780, term87780.getClass(), "usePerPvSkin", true);
        setBooleanField(term87780, term87780.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term87780, term87780.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term87780, term87780.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term87780, term87780.getClass(), "usePerPvTouchSliderSe", false);
        setField(term87780, term87780.getClass(), "commonModule", "-999,-999,-999");
        setField(term87780, term87780.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term87904, term87904.getClass(), "year", 2026);
        setShortField(term87904, term87904.getClass(), "month", (short) 8);
        setShortField(term87904, term87904.getClass(), "day", (short) 12);
        setField(term87903, term87903.getClass(), "date", term87904);
        setByteField(term87908, term87908.getClass(), "hour", (byte) 2);
        setByteField(term87908, term87908.getClass(), "minute", (byte) 2);
        setByteField(term87908, term87908.getClass(), "second", (byte) 42);
        setIntField(term87908, term87908.getClass(), "nano", 321531000);
        setField(term87903, term87903.getClass(), "time", term87908);
        setField(term87780, term87780.getClass(), "commonModuleSetTime", term87903);
        setField(term87780, term87780.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term87780, term87780.getClass(), "commonSkin", -1);
        setIntField(term87780, term87780.getClass(), "headphoneVolume", 100);
        setBooleanField(term87780, term87780.getClass(), "buttonSeOn", true);
        setIntField(term87780, term87780.getClass(), "buttonSeVolume", 100);
        setIntField(term87780, term87780.getClass(), "sliderSeVolume", 100);
        setIntField(term87780, term87780.getClass(), "buttonSe", -1);
        setIntField(term87780, term87780.getClass(), "chainSlideSe", -1);
        setIntField(term87780, term87780.getClass(), "slideSe", -1);
        setIntField(term87780, term87780.getClass(), "sliderTouchSe", -1);
        setField(term87780, term87780.getClass(), "sortMode", enum186);
        setIntField(term87780, term87780.getClass(), "nextPvId", -1);
        setField(term87780, term87780.getClass(), "nextDifficulty", enum187);
        setField(term87780, term87780.getClass(), "nextEdition", enum188);
        setBooleanField(term87780, term87780.getClass(), "showInterimRanking", true);
        setBooleanField(term87780, term87780.getClass(), "showClearStatus", true);
        setBooleanField(term87780, term87780.getClass(), "showGreatBorder", true);
        setBooleanField(term87780, term87780.getClass(), "showExcellentBorder", true);
        setBooleanField(term87780, term87780.getClass(), "showRivalBorder", true);
        setBooleanField(term87780, term87780.getClass(), "showRgoSetting", true);
        setBooleanField(term87780, term87780.getClass(), "contestNowPlayingEnable", true);
        setIntField(term87780, term87780.getClass(), "contestNowPlayingId", -1);
        setIntField(term87780, term87780.getClass(), "contestNowPlayingValue", -1);
        setField(term87780, term87780.getClass(), "contestNowPlayingResultRank", enum189);
        setField(term87780, term87780.getClass(), "contestNowPlayingSpecifier", "");
        setField(term87780, term87780.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term87780, term87780.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term87780, term87780.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term87780, term87780.getClass(), "rivalPdId", -1);
        setField(term87778, term87778.getClass(), "pdId", term87780);
        setIntField(term87778, term87778.getClass(), "pvId", -1865023308);
        setField(term87778, term87778.getClass(), "difficulty", enum187);
        setField(term87778, term87778.getClass(), "edition", enum190);
        setIntField(term87778, term87778.getClass(), "scriptVer", 1698510819);
        setIntField(term87778, term87778.getClass(), "score", -1553893255);
        setField(term87778, term87778.getClass(), "challengeKind", enum191);
        setIntField(term87778, term87778.getClass(), "challengeResult", 1303442927);
        setField(term87778, term87778.getClass(), "clearResult", enum192);
        setIntField(term87778, term87778.getClass(), "vp", 794568325);
        setIntField(term87778, term87778.getClass(), "coolCount", -434468428);
        setIntField(term87778, term87778.getClass(), "coolPercent", 1559605714);
        setIntField(term87778, term87778.getClass(), "fineCount", 1146601902);
        setIntField(term87778, term87778.getClass(), "finePercent", -1938881385);
        setIntField(term87778, term87778.getClass(), "safeCount", -1629418973);
        setIntField(term87778, term87778.getClass(), "safePercent", -100825168);
        setIntField(term87778, term87778.getClass(), "sadCount", 768407648);
        setIntField(term87778, term87778.getClass(), "sadPercent", -350454594);
        setIntField(term87778, term87778.getClass(), "wrongCount", -1148142995);
        setIntField(term87778, term87778.getClass(), "wrongPercent", -233024044);
        setIntField(term87778, term87778.getClass(), "maxCombo", 1820784228);
        setIntField(term87778, term87778.getClass(), "chanceTime", 1390820006);
        setIntField(term87778, term87778.getClass(), "holdScore", -828982065);
        setIntField(term87778, term87778.getClass(), "attainPoint", 1221443226);
        setIntField(term87778, term87778.getClass(), "skinId", 908108726);
        setIntField(term87778, term87778.getClass(), "buttonSe", 1023209512);
        setIntField(term87778, term87778.getClass(), "buttonSeVol", 1084849225);
        setIntField(term87778, term87778.getClass(), "sliderSe", -1702055571);
        setIntField(term87778, term87778.getClass(), "ChainSlideSe", -944542900);
        setIntField(term87778, term87778.getClass(), "SliderTouchSe", 2063762142);
        setField(term87778, term87778.getClass(), "modules", "OclPbYPkcH");
        setIntField(term87778, term87778.getClass(), "stageCompletion", 1658391716);
        setIntField(term87778, term87778.getClass(), "slideScore", 2143282300);
        setIntField(term87778, term87778.getClass(), "isVocalChange", 1137624258);
        setField(term87778, term87778.getClass(), "customizeItems", "IoAlmYsBwc");
        setField(term87778, term87778.getClass(), "rhythmGameOptions", "TEParAifyi");
        setIntField(term87778, term87778.getClass(), "screenShotCount", -1);
        setIntField(term88485, term88485.getClass(), "year", 2018);
        setShortField(term88485, term88485.getClass(), "month", (short) 9);
        setShortField(term88485, term88485.getClass(), "day", (short) 28);
        setField(term88484, term88484.getClass(), "date", term88485);
        setByteField(term88489, term88489.getClass(), "hour", (byte) 3);
        setByteField(term88489, term88489.getClass(), "minute", (byte) 37);
        setByteField(term88489, term88489.getClass(), "second", (byte) 46);
        setIntField(term88489, term88489.getClass(), "nano", 763326845);
        setField(term88484, term88484.getClass(), "time", term88489);
        setField(term87778, term87778.getClass(), "dateTime", term88484);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getChallengeResult", argTypes, term87778, args);
    }

};


