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

public class PlayLog_getMaxCombo_57771792022 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133373;

    public PlayLog_getMaxCombo_57771792022() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term134105 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term134104 = ((Class) term134105).getDeclaredField((String) "MISS");
        ((Field) term134104).setAccessible(true);
        Object enum292 = ((Field) term134104).get((Object) null);
        Class<? extends Object> term134482 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term134481 = ((Class) term134482).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term134481).setAccessible(true);
        Object enum293 = ((Field) term134481).get((Object) null);
        Class<? extends Object> term134765 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term134764 = ((Class) term134765).getDeclaredField((String) "NORMAL");
        ((Field) term134764).setAccessible(true);
        Object enum294 = ((Field) term134764).get((Object) null);
        Class<? extends Object> term135040 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term135039 = ((Class) term135040).getDeclaredField((String) "ORIGINAL");
        ((Field) term135039).setAccessible(true);
        Object enum295 = ((Field) term135039).get((Object) null);
        Class<? extends Object> term135306 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term135305 = ((Class) term135306).getDeclaredField((String) "NONE");
        ((Field) term135305).setAccessible(true);
        Object enum296 = ((Field) term135305).get((Object) null);
        Class<? extends Object> term135947 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term135946 = ((Class) term135947).getDeclaredField((String) "EASY");
        ((Field) term135946).setAccessible(true);
        Object enum297 = ((Field) term135946).get((Object) null);
        Class<? extends Object> term136216 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term136215 = ((Class) term136216).getDeclaredField((String) "EXTRA");
        ((Field) term136215).setAccessible(true);
        Object enum298 = ((Field) term136215).get((Object) null);
        Class<? extends Object> term136473 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term136472 = ((Class) term136473).getDeclaredField((String) "EXCELLENT");
        ((Field) term136472).setAccessible(true);
        Object enum299 = ((Field) term136472).get((Object) null);
        Class<? extends Object> term136772 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term136771 = ((Class) term136772).getDeclaredField((String) "CHEAP");
        ((Field) term136771).setAccessible(true);
        Object enum300 = ((Field) term136771).get((Object) null);
        term133373 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        Object term133375 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term133498 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term133499 = newInstance(Class.forName("java.time.LocalDate"));
        Object term133503 = newInstance(Class.forName("java.time.LocalTime"));
        Object term134088 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term134089 = newInstance(Class.forName("java.time.LocalDate"));
        Object term134093 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term133373, term133373.getClass(), "id", -8876856890348836498L);
        setLongField(term133375, term133375.getClass(), "id", 846579494941632714L);
        setIntField(term133375, term133375.getClass(), "pdId", -485108462);
        setField(term133375, term133375.getClass(), "playerName", "xxx");
        setIntField(term133375, term133375.getClass(), "vocaloidPoints", 300);
        setIntField(term133375, term133375.getClass(), "level", 1);
        setIntField(term133375, term133375.getClass(), "levelExp", 1418551216);
        setField(term133375, term133375.getClass(), "levelTitle", "xxx");
        setIntField(term133375, term133375.getClass(), "plateId", -1);
        setIntField(term133375, term133375.getClass(), "plateEffectId", -1);
        setField(term133375, term133375.getClass(), "passwordStatus", enum292);
        setField(term133375, term133375.getClass(), "password", "**********");
        setBooleanField(term133375, term133375.getClass(), "preferPerPvModule", true);
        setBooleanField(term133375, term133375.getClass(), "preferCommonModule", false);
        setBooleanField(term133375, term133375.getClass(), "usePerPvSkin", true);
        setBooleanField(term133375, term133375.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term133375, term133375.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term133375, term133375.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term133375, term133375.getClass(), "usePerPvTouchSliderSe", false);
        setField(term133375, term133375.getClass(), "commonModule", "-999,-999,-999");
        setField(term133375, term133375.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term133499, term133499.getClass(), "year", 2026);
        setShortField(term133499, term133499.getClass(), "month", (short) 8);
        setShortField(term133499, term133499.getClass(), "day", (short) 12);
        setField(term133498, term133498.getClass(), "date", term133499);
        setByteField(term133503, term133503.getClass(), "hour", (byte) 2);
        setByteField(term133503, term133503.getClass(), "minute", (byte) 2);
        setByteField(term133503, term133503.getClass(), "second", (byte) 45);
        setIntField(term133503, term133503.getClass(), "nano", 658771000);
        setField(term133498, term133498.getClass(), "time", term133503);
        setField(term133375, term133375.getClass(), "commonModuleSetTime", term133498);
        setField(term133375, term133375.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term133375, term133375.getClass(), "commonSkin", -1);
        setIntField(term133375, term133375.getClass(), "headphoneVolume", 100);
        setBooleanField(term133375, term133375.getClass(), "buttonSeOn", true);
        setIntField(term133375, term133375.getClass(), "buttonSeVolume", 100);
        setIntField(term133375, term133375.getClass(), "sliderSeVolume", 100);
        setIntField(term133375, term133375.getClass(), "buttonSe", -1);
        setIntField(term133375, term133375.getClass(), "chainSlideSe", -1);
        setIntField(term133375, term133375.getClass(), "slideSe", -1);
        setIntField(term133375, term133375.getClass(), "sliderTouchSe", -1);
        setField(term133375, term133375.getClass(), "sortMode", enum293);
        setIntField(term133375, term133375.getClass(), "nextPvId", -1);
        setField(term133375, term133375.getClass(), "nextDifficulty", enum294);
        setField(term133375, term133375.getClass(), "nextEdition", enum295);
        setBooleanField(term133375, term133375.getClass(), "showInterimRanking", true);
        setBooleanField(term133375, term133375.getClass(), "showClearStatus", true);
        setBooleanField(term133375, term133375.getClass(), "showGreatBorder", true);
        setBooleanField(term133375, term133375.getClass(), "showExcellentBorder", true);
        setBooleanField(term133375, term133375.getClass(), "showRivalBorder", true);
        setBooleanField(term133375, term133375.getClass(), "showRgoSetting", true);
        setBooleanField(term133375, term133375.getClass(), "contestNowPlayingEnable", true);
        setIntField(term133375, term133375.getClass(), "contestNowPlayingId", -1);
        setIntField(term133375, term133375.getClass(), "contestNowPlayingValue", -1);
        setField(term133375, term133375.getClass(), "contestNowPlayingResultRank", enum296);
        setField(term133375, term133375.getClass(), "contestNowPlayingSpecifier", "");
        setField(term133375, term133375.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term133375, term133375.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term133375, term133375.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term133375, term133375.getClass(), "rivalPdId", -1);
        setField(term133373, term133373.getClass(), "pdId", term133375);
        setIntField(term133373, term133373.getClass(), "pvId", -626779272);
        setField(term133373, term133373.getClass(), "difficulty", enum297);
        setField(term133373, term133373.getClass(), "edition", enum298);
        setIntField(term133373, term133373.getClass(), "scriptVer", -1150062870);
        setIntField(term133373, term133373.getClass(), "score", -886200503);
        setField(term133373, term133373.getClass(), "challengeKind", enum299);
        setIntField(term133373, term133373.getClass(), "challengeResult", 1136393691);
        setField(term133373, term133373.getClass(), "clearResult", enum300);
        setIntField(term133373, term133373.getClass(), "vp", -1288536479);
        setIntField(term133373, term133373.getClass(), "coolCount", 1092038167);
        setIntField(term133373, term133373.getClass(), "coolPercent", 1879729823);
        setIntField(term133373, term133373.getClass(), "fineCount", 1443855558);
        setIntField(term133373, term133373.getClass(), "finePercent", -1933419449);
        setIntField(term133373, term133373.getClass(), "safeCount", -1804322375);
        setIntField(term133373, term133373.getClass(), "safePercent", 1595814906);
        setIntField(term133373, term133373.getClass(), "sadCount", -834193529);
        setIntField(term133373, term133373.getClass(), "sadPercent", 335780735);
        setIntField(term133373, term133373.getClass(), "wrongCount", -1541981599);
        setIntField(term133373, term133373.getClass(), "wrongPercent", 1605456363);
        setIntField(term133373, term133373.getClass(), "maxCombo", 2059896693);
        setIntField(term133373, term133373.getClass(), "chanceTime", 2109912812);
        setIntField(term133373, term133373.getClass(), "holdScore", 1841286431);
        setIntField(term133373, term133373.getClass(), "attainPoint", -1723168189);
        setIntField(term133373, term133373.getClass(), "skinId", -675283917);
        setIntField(term133373, term133373.getClass(), "buttonSe", -2093862988);
        setIntField(term133373, term133373.getClass(), "buttonSeVol", 1337828646);
        setIntField(term133373, term133373.getClass(), "sliderSe", 532666604);
        setIntField(term133373, term133373.getClass(), "ChainSlideSe", -13725716);
        setIntField(term133373, term133373.getClass(), "SliderTouchSe", -1695750603);
        setField(term133373, term133373.getClass(), "modules", "kBdSllIBVz");
        setIntField(term133373, term133373.getClass(), "stageCompletion", 63677360);
        setIntField(term133373, term133373.getClass(), "slideScore", 1478914037);
        setIntField(term133373, term133373.getClass(), "isVocalChange", 1630231519);
        setField(term133373, term133373.getClass(), "customizeItems", "TJmVBGfTML");
        setField(term133373, term133373.getClass(), "rhythmGameOptions", "tPlsykYBqO");
        setIntField(term133373, term133373.getClass(), "screenShotCount", -1);
        setIntField(term134089, term134089.getClass(), "year", 2025);
        setShortField(term134089, term134089.getClass(), "month", (short) 3);
        setShortField(term134089, term134089.getClass(), "day", (short) 9);
        setField(term134088, term134088.getClass(), "date", term134089);
        setByteField(term134093, term134093.getClass(), "hour", (byte) 5);
        setByteField(term134093, term134093.getClass(), "minute", (byte) 49);
        setByteField(term134093, term134093.getClass(), "second", (byte) 12);
        setIntField(term134093, term134093.getClass(), "nano", 791695028);
        setField(term134088, term134088.getClass(), "time", term134093);
        setField(term133373, term133373.getClass(), "dateTime", term134088);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxCombo", argTypes, term133373, args);
    }

};


