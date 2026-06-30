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

public class PlayLog_getWrongPercent_1524721421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129640;

    public PlayLog_getWrongPercent_1524721421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term130379 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term130378 = ((Class) term130379).getDeclaredField((String) "MISS");
        ((Field) term130378).setAccessible(true);
        Object enum283 = ((Field) term130378).get((Object) null);
        Class<? extends Object> term130756 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term130755 = ((Class) term130756).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term130755).setAccessible(true);
        Object enum284 = ((Field) term130755).get((Object) null);
        Class<? extends Object> term131039 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term131038 = ((Class) term131039).getDeclaredField((String) "NORMAL");
        ((Field) term131038).setAccessible(true);
        Object enum285 = ((Field) term131038).get((Object) null);
        Class<? extends Object> term131314 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term131313 = ((Class) term131314).getDeclaredField((String) "ORIGINAL");
        ((Field) term131313).setAccessible(true);
        Object enum286 = ((Field) term131313).get((Object) null);
        Class<? extends Object> term131580 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term131579 = ((Class) term131580).getDeclaredField((String) "NONE");
        ((Field) term131579).setAccessible(true);
        Object enum287 = ((Field) term131579).get((Object) null);
        Class<? extends Object> term132221 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term132220 = ((Class) term132221).getDeclaredField((String) "EXTREME");
        ((Field) term132220).setAccessible(true);
        Object enum288 = ((Field) term132220).get((Object) null);
        Class<? extends Object> term132499 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term132498 = ((Class) term132499).getDeclaredField((String) "EXTRA");
        ((Field) term132498).setAccessible(true);
        Object enum289 = ((Field) term132498).get((Object) null);
        Class<? extends Object> term132756 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term132755 = ((Class) term132756).getDeclaredField((String) "UNDEFINED");
        ((Field) term132755).setAccessible(true);
        Object enum290 = ((Field) term132755).get((Object) null);
        Class<? extends Object> term133055 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term133054 = ((Class) term133055).getDeclaredField((String) "EXCELLENT");
        ((Field) term133054).setAccessible(true);
        Object enum291 = ((Field) term133054).get((Object) null);
        term129640 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        Object term129642 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term129765 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term129766 = newInstance(Class.forName("java.time.LocalDate"));
        Object term129770 = newInstance(Class.forName("java.time.LocalTime"));
        Object term130362 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term130363 = newInstance(Class.forName("java.time.LocalDate"));
        Object term130367 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term129640, term129640.getClass(), "id", 4474998035090263139L);
        setLongField(term129642, term129642.getClass(), "id", 2848819812340321742L);
        setIntField(term129642, term129642.getClass(), "pdId", 852806940);
        setField(term129642, term129642.getClass(), "playerName", "xxx");
        setIntField(term129642, term129642.getClass(), "vocaloidPoints", 300);
        setIntField(term129642, term129642.getClass(), "level", 1);
        setIntField(term129642, term129642.getClass(), "levelExp", 698551724);
        setField(term129642, term129642.getClass(), "levelTitle", "xxx");
        setIntField(term129642, term129642.getClass(), "plateId", -1);
        setIntField(term129642, term129642.getClass(), "plateEffectId", -1);
        setField(term129642, term129642.getClass(), "passwordStatus", enum283);
        setField(term129642, term129642.getClass(), "password", "**********");
        setBooleanField(term129642, term129642.getClass(), "preferPerPvModule", true);
        setBooleanField(term129642, term129642.getClass(), "preferCommonModule", true);
        setBooleanField(term129642, term129642.getClass(), "usePerPvSkin", true);
        setBooleanField(term129642, term129642.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term129642, term129642.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term129642, term129642.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term129642, term129642.getClass(), "usePerPvTouchSliderSe", false);
        setField(term129642, term129642.getClass(), "commonModule", "-999,-999,-999");
        setField(term129642, term129642.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term129766, term129766.getClass(), "year", 2026);
        setShortField(term129766, term129766.getClass(), "month", (short) 6);
        setShortField(term129766, term129766.getClass(), "day", (short) 29);
        setField(term129765, term129765.getClass(), "date", term129766);
        setByteField(term129770, term129770.getClass(), "hour", (byte) 4);
        setByteField(term129770, term129770.getClass(), "minute", (byte) 27);
        setByteField(term129770, term129770.getClass(), "second", (byte) 28);
        setIntField(term129770, term129770.getClass(), "nano", 944990000);
        setField(term129765, term129765.getClass(), "time", term129770);
        setField(term129642, term129642.getClass(), "commonModuleSetTime", term129765);
        setField(term129642, term129642.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term129642, term129642.getClass(), "commonSkin", -1);
        setIntField(term129642, term129642.getClass(), "headphoneVolume", 100);
        setBooleanField(term129642, term129642.getClass(), "buttonSeOn", true);
        setIntField(term129642, term129642.getClass(), "buttonSeVolume", 100);
        setIntField(term129642, term129642.getClass(), "sliderSeVolume", 100);
        setIntField(term129642, term129642.getClass(), "buttonSe", -1);
        setIntField(term129642, term129642.getClass(), "chainSlideSe", -1);
        setIntField(term129642, term129642.getClass(), "slideSe", -1);
        setIntField(term129642, term129642.getClass(), "sliderTouchSe", -1);
        setField(term129642, term129642.getClass(), "sortMode", enum284);
        setIntField(term129642, term129642.getClass(), "nextPvId", -1);
        setField(term129642, term129642.getClass(), "nextDifficulty", enum285);
        setField(term129642, term129642.getClass(), "nextEdition", enum286);
        setBooleanField(term129642, term129642.getClass(), "showInterimRanking", true);
        setBooleanField(term129642, term129642.getClass(), "showClearStatus", true);
        setBooleanField(term129642, term129642.getClass(), "showGreatBorder", true);
        setBooleanField(term129642, term129642.getClass(), "showExcellentBorder", true);
        setBooleanField(term129642, term129642.getClass(), "showRivalBorder", true);
        setBooleanField(term129642, term129642.getClass(), "showRgoSetting", true);
        setBooleanField(term129642, term129642.getClass(), "contestNowPlayingEnable", true);
        setIntField(term129642, term129642.getClass(), "contestNowPlayingId", -1);
        setIntField(term129642, term129642.getClass(), "contestNowPlayingValue", -1);
        setField(term129642, term129642.getClass(), "contestNowPlayingResultRank", enum287);
        setField(term129642, term129642.getClass(), "contestNowPlayingSpecifier", "");
        setField(term129642, term129642.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term129642, term129642.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term129642, term129642.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term129642, term129642.getClass(), "rivalPdId", -1);
        setField(term129640, term129640.getClass(), "pdId", term129642);
        setIntField(term129640, term129640.getClass(), "pvId", -1631048635);
        setField(term129640, term129640.getClass(), "difficulty", enum288);
        setField(term129640, term129640.getClass(), "edition", enum289);
        setIntField(term129640, term129640.getClass(), "scriptVer", 1342808731);
        setIntField(term129640, term129640.getClass(), "score", -64893740);
        setField(term129640, term129640.getClass(), "challengeKind", enum290);
        setIntField(term129640, term129640.getClass(), "challengeResult", -222012928);
        setField(term129640, term129640.getClass(), "clearResult", enum291);
        setIntField(term129640, term129640.getClass(), "vp", -146564963);
        setIntField(term129640, term129640.getClass(), "coolCount", -83178716);
        setIntField(term129640, term129640.getClass(), "coolPercent", -1292704466);
        setIntField(term129640, term129640.getClass(), "fineCount", 1991858584);
        setIntField(term129640, term129640.getClass(), "finePercent", -1300947782);
        setIntField(term129640, term129640.getClass(), "safeCount", 188512644);
        setIntField(term129640, term129640.getClass(), "safePercent", 1851127634);
        setIntField(term129640, term129640.getClass(), "sadCount", 783730213);
        setIntField(term129640, term129640.getClass(), "sadPercent", 1815951606);
        setIntField(term129640, term129640.getClass(), "wrongCount", 1105016932);
        setIntField(term129640, term129640.getClass(), "wrongPercent", -365784998);
        setIntField(term129640, term129640.getClass(), "maxCombo", -1893236300);
        setIntField(term129640, term129640.getClass(), "chanceTime", -1858909368);
        setIntField(term129640, term129640.getClass(), "holdScore", -280113263);
        setIntField(term129640, term129640.getClass(), "attainPoint", 529625347);
        setIntField(term129640, term129640.getClass(), "skinId", 1409095253);
        setIntField(term129640, term129640.getClass(), "buttonSe", 315179039);
        setIntField(term129640, term129640.getClass(), "buttonSeVol", -1835923897);
        setIntField(term129640, term129640.getClass(), "sliderSe", -341287775);
        setIntField(term129640, term129640.getClass(), "ChainSlideSe", -1651110911);
        setIntField(term129640, term129640.getClass(), "SliderTouchSe", -1934033808);
        setField(term129640, term129640.getClass(), "modules", "eqJfYWRaEL");
        setIntField(term129640, term129640.getClass(), "stageCompletion", 950322609);
        setIntField(term129640, term129640.getClass(), "slideScore", -2023791789);
        setIntField(term129640, term129640.getClass(), "isVocalChange", 353974456);
        setField(term129640, term129640.getClass(), "customizeItems", "fhkbdRViHi");
        setField(term129640, term129640.getClass(), "rhythmGameOptions", "uWHnvSvaPl");
        setIntField(term129640, term129640.getClass(), "screenShotCount", -1);
        setIntField(term130363, term130363.getClass(), "year", 2027);
        setShortField(term130363, term130363.getClass(), "month", (short) 8);
        setShortField(term130363, term130363.getClass(), "day", (short) 26);
        setField(term130362, term130362.getClass(), "date", term130363);
        setByteField(term130367, term130367.getClass(), "hour", (byte) 5);
        setByteField(term130367, term130367.getClass(), "minute", (byte) 11);
        setByteField(term130367, term130367.getClass(), "second", (byte) 9);
        setIntField(term130367, term130367.getClass(), "nano", 219245092);
        setField(term130362, term130362.getClass(), "time", term130367);
        setField(term129640, term129640.getClass(), "dateTime", term130362);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWrongPercent", argTypes, term129640, args);
    }

};


