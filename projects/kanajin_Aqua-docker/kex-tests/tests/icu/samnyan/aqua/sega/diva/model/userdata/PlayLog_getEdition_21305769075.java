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

public class PlayLog_getEdition_21305769075 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73447;

    public PlayLog_getEdition_21305769075() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term74178 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term74177 = ((Class) term74178).getDeclaredField((String) "MISS");
        ((Field) term74177).setAccessible(true);
        Object enum151 = ((Field) term74177).get((Object) null);
        Class<? extends Object> term74555 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term74554 = ((Class) term74555).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term74554).setAccessible(true);
        Object enum152 = ((Field) term74554).get((Object) null);
        Class<? extends Object> term74838 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term74837 = ((Class) term74838).getDeclaredField((String) "NORMAL");
        ((Field) term74837).setAccessible(true);
        Object enum153 = ((Field) term74837).get((Object) null);
        Class<? extends Object> term75113 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term75112 = ((Class) term75113).getDeclaredField((String) "ORIGINAL");
        ((Field) term75112).setAccessible(true);
        Object enum154 = ((Field) term75112).get((Object) null);
        Class<? extends Object> term75379 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term75378 = ((Class) term75379).getDeclaredField((String) "NONE");
        ((Field) term75378).setAccessible(true);
        Object enum155 = ((Field) term75378).get((Object) null);
        Class<? extends Object> term76020 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term76019 = ((Class) term76020).getDeclaredField((String) "EASY");
        ((Field) term76019).setAccessible(true);
        Object enum156 = ((Field) term76019).get((Object) null);
        Class<? extends Object> term76289 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term76288 = ((Class) term76289).getDeclaredField((String) "EXTRA");
        ((Field) term76288).setAccessible(true);
        Object enum157 = ((Field) term76288).get((Object) null);
        Class<? extends Object> term76546 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term76545 = ((Class) term76546).getDeclaredField((String) "CLEAR");
        ((Field) term76545).setAccessible(true);
        Object enum158 = ((Field) term76545).get((Object) null);
        Class<? extends Object> term76833 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term76832 = ((Class) term76833).getDeclaredField((String) "STANDARD");
        ((Field) term76832).setAccessible(true);
        Object enum159 = ((Field) term76832).get((Object) null);
        term73447 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        Object term73449 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term73572 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term73573 = newInstance(Class.forName("java.time.LocalDate"));
        Object term73577 = newInstance(Class.forName("java.time.LocalTime"));
        Object term74161 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term74162 = newInstance(Class.forName("java.time.LocalDate"));
        Object term74166 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term73447, term73447.getClass(), "id", -2644215923136513282L);
        setLongField(term73449, term73449.getClass(), "id", -1468719814009985452L);
        setIntField(term73449, term73449.getClass(), "pdId", 252575029);
        setField(term73449, term73449.getClass(), "playerName", "xxx");
        setIntField(term73449, term73449.getClass(), "vocaloidPoints", 300);
        setIntField(term73449, term73449.getClass(), "level", 1);
        setIntField(term73449, term73449.getClass(), "levelExp", 57189932);
        setField(term73449, term73449.getClass(), "levelTitle", "xxx");
        setIntField(term73449, term73449.getClass(), "plateId", -1);
        setIntField(term73449, term73449.getClass(), "plateEffectId", -1);
        setField(term73449, term73449.getClass(), "passwordStatus", enum151);
        setField(term73449, term73449.getClass(), "password", "**********");
        setBooleanField(term73449, term73449.getClass(), "preferPerPvModule", true);
        setBooleanField(term73449, term73449.getClass(), "preferCommonModule", false);
        setBooleanField(term73449, term73449.getClass(), "usePerPvSkin", true);
        setBooleanField(term73449, term73449.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term73449, term73449.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term73449, term73449.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term73449, term73449.getClass(), "usePerPvTouchSliderSe", false);
        setField(term73449, term73449.getClass(), "commonModule", "-999,-999,-999");
        setField(term73449, term73449.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term73573, term73573.getClass(), "year", 2026);
        setShortField(term73573, term73573.getClass(), "month", (short) 8);
        setShortField(term73573, term73573.getClass(), "day", (short) 12);
        setField(term73572, term73572.getClass(), "date", term73573);
        setByteField(term73577, term73577.getClass(), "hour", (byte) 2);
        setByteField(term73577, term73577.getClass(), "minute", (byte) 2);
        setByteField(term73577, term73577.getClass(), "second", (byte) 41);
        setIntField(term73577, term73577.getClass(), "nano", 283501000);
        setField(term73572, term73572.getClass(), "time", term73577);
        setField(term73449, term73449.getClass(), "commonModuleSetTime", term73572);
        setField(term73449, term73449.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term73449, term73449.getClass(), "commonSkin", -1);
        setIntField(term73449, term73449.getClass(), "headphoneVolume", 100);
        setBooleanField(term73449, term73449.getClass(), "buttonSeOn", true);
        setIntField(term73449, term73449.getClass(), "buttonSeVolume", 100);
        setIntField(term73449, term73449.getClass(), "sliderSeVolume", 100);
        setIntField(term73449, term73449.getClass(), "buttonSe", -1);
        setIntField(term73449, term73449.getClass(), "chainSlideSe", -1);
        setIntField(term73449, term73449.getClass(), "slideSe", -1);
        setIntField(term73449, term73449.getClass(), "sliderTouchSe", -1);
        setField(term73449, term73449.getClass(), "sortMode", enum152);
        setIntField(term73449, term73449.getClass(), "nextPvId", -1);
        setField(term73449, term73449.getClass(), "nextDifficulty", enum153);
        setField(term73449, term73449.getClass(), "nextEdition", enum154);
        setBooleanField(term73449, term73449.getClass(), "showInterimRanking", true);
        setBooleanField(term73449, term73449.getClass(), "showClearStatus", true);
        setBooleanField(term73449, term73449.getClass(), "showGreatBorder", true);
        setBooleanField(term73449, term73449.getClass(), "showExcellentBorder", true);
        setBooleanField(term73449, term73449.getClass(), "showRivalBorder", true);
        setBooleanField(term73449, term73449.getClass(), "showRgoSetting", true);
        setBooleanField(term73449, term73449.getClass(), "contestNowPlayingEnable", true);
        setIntField(term73449, term73449.getClass(), "contestNowPlayingId", -1);
        setIntField(term73449, term73449.getClass(), "contestNowPlayingValue", -1);
        setField(term73449, term73449.getClass(), "contestNowPlayingResultRank", enum155);
        setField(term73449, term73449.getClass(), "contestNowPlayingSpecifier", "");
        setField(term73449, term73449.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term73449, term73449.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term73449, term73449.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term73449, term73449.getClass(), "rivalPdId", -1);
        setField(term73447, term73447.getClass(), "pdId", term73449);
        setIntField(term73447, term73447.getClass(), "pvId", 1460722225);
        setField(term73447, term73447.getClass(), "difficulty", enum156);
        setField(term73447, term73447.getClass(), "edition", enum157);
        setIntField(term73447, term73447.getClass(), "scriptVer", 1743224434);
        setIntField(term73447, term73447.getClass(), "score", 842904495);
        setField(term73447, term73447.getClass(), "challengeKind", enum158);
        setIntField(term73447, term73447.getClass(), "challengeResult", 1008080511);
        setField(term73447, term73447.getClass(), "clearResult", enum159);
        setIntField(term73447, term73447.getClass(), "vp", 1935707624);
        setIntField(term73447, term73447.getClass(), "coolCount", 1507074215);
        setIntField(term73447, term73447.getClass(), "coolPercent", -282881827);
        setIntField(term73447, term73447.getClass(), "fineCount", -1183353915);
        setIntField(term73447, term73447.getClass(), "finePercent", -420030135);
        setIntField(term73447, term73447.getClass(), "safeCount", 267763294);
        setIntField(term73447, term73447.getClass(), "safePercent", -1497710478);
        setIntField(term73447, term73447.getClass(), "sadCount", 49950830);
        setIntField(term73447, term73447.getClass(), "sadPercent", -525257914);
        setIntField(term73447, term73447.getClass(), "wrongCount", 147209682);
        setIntField(term73447, term73447.getClass(), "wrongPercent", 34470066);
        setIntField(term73447, term73447.getClass(), "maxCombo", 2058711405);
        setIntField(term73447, term73447.getClass(), "chanceTime", 1743683601);
        setIntField(term73447, term73447.getClass(), "holdScore", -945116798);
        setIntField(term73447, term73447.getClass(), "attainPoint", 1593461795);
        setIntField(term73447, term73447.getClass(), "skinId", 515182546);
        setIntField(term73447, term73447.getClass(), "buttonSe", -936895502);
        setIntField(term73447, term73447.getClass(), "buttonSeVol", -129547140);
        setIntField(term73447, term73447.getClass(), "sliderSe", 199287428);
        setIntField(term73447, term73447.getClass(), "ChainSlideSe", -1195339592);
        setIntField(term73447, term73447.getClass(), "SliderTouchSe", -376422566);
        setField(term73447, term73447.getClass(), "modules", "aJlieCFVtF");
        setIntField(term73447, term73447.getClass(), "stageCompletion", 306847454);
        setIntField(term73447, term73447.getClass(), "slideScore", 1745276158);
        setIntField(term73447, term73447.getClass(), "isVocalChange", 2009020256);
        setField(term73447, term73447.getClass(), "customizeItems", "ZiaGIbnzTs");
        setField(term73447, term73447.getClass(), "rhythmGameOptions", "tbcdzjIfER");
        setIntField(term73447, term73447.getClass(), "screenShotCount", -1);
        setIntField(term74162, term74162.getClass(), "year", 2024);
        setShortField(term74162, term74162.getClass(), "month", (short) 1);
        setShortField(term74162, term74162.getClass(), "day", (short) 24);
        setField(term74161, term74161.getClass(), "date", term74162);
        setByteField(term74166, term74166.getClass(), "hour", (byte) 20);
        setByteField(term74166, term74166.getClass(), "minute", (byte) 28);
        setByteField(term74166, term74166.getClass(), "second", (byte) 39);
        setIntField(term74166, term74166.getClass(), "nano", 952728177);
        setField(term74161, term74161.getClass(), "time", term74166);
        setField(term73447, term73447.getClass(), "dateTime", term74161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEdition", argTypes, term73447, args);
    }

};


