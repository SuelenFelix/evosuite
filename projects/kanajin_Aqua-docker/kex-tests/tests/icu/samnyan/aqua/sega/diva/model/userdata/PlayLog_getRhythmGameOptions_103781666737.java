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

public class PlayLog_getRhythmGameOptions_103781666737 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term187508;

    public PlayLog_getRhythmGameOptions_103781666737() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term188244 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term188243 = ((Class) term188244).getDeclaredField((String) "MISS");
        ((Field) term188243).setAccessible(true);
        Object enum421 = ((Field) term188243).get((Object) null);
        Class<? extends Object> term188621 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term188620 = ((Class) term188621).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term188620).setAccessible(true);
        Object enum422 = ((Field) term188620).get((Object) null);
        Class<? extends Object> term188904 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term188903 = ((Class) term188904).getDeclaredField((String) "NORMAL");
        ((Field) term188903).setAccessible(true);
        Object enum423 = ((Field) term188903).get((Object) null);
        Class<? extends Object> term189179 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term189178 = ((Class) term189179).getDeclaredField((String) "ORIGINAL");
        ((Field) term189178).setAccessible(true);
        Object enum424 = ((Field) term189178).get((Object) null);
        Class<? extends Object> term189445 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term189444 = ((Class) term189445).getDeclaredField((String) "NONE");
        ((Field) term189444).setAccessible(true);
        Object enum425 = ((Field) term189444).get((Object) null);
        Class<? extends Object> term190086 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term190085 = ((Class) term190086).getDeclaredField((String) "EASY");
        ((Field) term190085).setAccessible(true);
        Object enum426 = ((Field) term190085).get((Object) null);
        Class<? extends Object> term190355 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term190354 = ((Class) term190355).getDeclaredField((String) "EXTRA");
        ((Field) term190354).setAccessible(true);
        Object enum427 = ((Field) term190354).get((Object) null);
        Class<? extends Object> term190612 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term190611 = ((Class) term190612).getDeclaredField((String) "UNDEFINED");
        ((Field) term190611).setAccessible(true);
        Object enum428 = ((Field) term190611).get((Object) null);
        Class<? extends Object> term190911 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term190910 = ((Class) term190911).getDeclaredField((String) "EXCELLENT");
        ((Field) term190910).setAccessible(true);
        Object enum429 = ((Field) term190910).get((Object) null);
        term187508 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        Object term187510 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term187633 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term187634 = newInstance(Class.forName("java.time.LocalDate"));
        Object term187638 = newInstance(Class.forName("java.time.LocalTime"));
        Object term188227 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term188228 = newInstance(Class.forName("java.time.LocalDate"));
        Object term188232 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term187508, term187508.getClass(), "id", -5386201758403679145L);
        setLongField(term187510, term187510.getClass(), "id", -7268507582722666254L);
        setIntField(term187510, term187510.getClass(), "pdId", 1112256038);
        setField(term187510, term187510.getClass(), "playerName", "xxx");
        setIntField(term187510, term187510.getClass(), "vocaloidPoints", 300);
        setIntField(term187510, term187510.getClass(), "level", 1);
        setIntField(term187510, term187510.getClass(), "levelExp", -441333794);
        setField(term187510, term187510.getClass(), "levelTitle", "xxx");
        setIntField(term187510, term187510.getClass(), "plateId", -1);
        setIntField(term187510, term187510.getClass(), "plateEffectId", -1);
        setField(term187510, term187510.getClass(), "passwordStatus", enum421);
        setField(term187510, term187510.getClass(), "password", "**********");
        setBooleanField(term187510, term187510.getClass(), "preferPerPvModule", true);
        setBooleanField(term187510, term187510.getClass(), "preferCommonModule", false);
        setBooleanField(term187510, term187510.getClass(), "usePerPvSkin", true);
        setBooleanField(term187510, term187510.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term187510, term187510.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term187510, term187510.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term187510, term187510.getClass(), "usePerPvTouchSliderSe", false);
        setField(term187510, term187510.getClass(), "commonModule", "-999,-999,-999");
        setField(term187510, term187510.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term187634, term187634.getClass(), "year", 2026);
        setShortField(term187634, term187634.getClass(), "month", (short) 8);
        setShortField(term187634, term187634.getClass(), "day", (short) 12);
        setField(term187633, term187633.getClass(), "date", term187634);
        setByteField(term187638, term187638.getClass(), "hour", (byte) 2);
        setByteField(term187638, term187638.getClass(), "minute", (byte) 2);
        setByteField(term187638, term187638.getClass(), "second", (byte) 49);
        setIntField(term187638, term187638.getClass(), "nano", 583325000);
        setField(term187633, term187633.getClass(), "time", term187638);
        setField(term187510, term187510.getClass(), "commonModuleSetTime", term187633);
        setField(term187510, term187510.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term187510, term187510.getClass(), "commonSkin", -1);
        setIntField(term187510, term187510.getClass(), "headphoneVolume", 100);
        setBooleanField(term187510, term187510.getClass(), "buttonSeOn", true);
        setIntField(term187510, term187510.getClass(), "buttonSeVolume", 100);
        setIntField(term187510, term187510.getClass(), "sliderSeVolume", 100);
        setIntField(term187510, term187510.getClass(), "buttonSe", -1);
        setIntField(term187510, term187510.getClass(), "chainSlideSe", -1);
        setIntField(term187510, term187510.getClass(), "slideSe", -1);
        setIntField(term187510, term187510.getClass(), "sliderTouchSe", -1);
        setField(term187510, term187510.getClass(), "sortMode", enum422);
        setIntField(term187510, term187510.getClass(), "nextPvId", -1);
        setField(term187510, term187510.getClass(), "nextDifficulty", enum423);
        setField(term187510, term187510.getClass(), "nextEdition", enum424);
        setBooleanField(term187510, term187510.getClass(), "showInterimRanking", true);
        setBooleanField(term187510, term187510.getClass(), "showClearStatus", true);
        setBooleanField(term187510, term187510.getClass(), "showGreatBorder", true);
        setBooleanField(term187510, term187510.getClass(), "showExcellentBorder", true);
        setBooleanField(term187510, term187510.getClass(), "showRivalBorder", true);
        setBooleanField(term187510, term187510.getClass(), "showRgoSetting", true);
        setBooleanField(term187510, term187510.getClass(), "contestNowPlayingEnable", false);
        setIntField(term187510, term187510.getClass(), "contestNowPlayingId", -1);
        setIntField(term187510, term187510.getClass(), "contestNowPlayingValue", -1);
        setField(term187510, term187510.getClass(), "contestNowPlayingResultRank", enum425);
        setField(term187510, term187510.getClass(), "contestNowPlayingSpecifier", "");
        setField(term187510, term187510.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term187510, term187510.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term187510, term187510.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term187510, term187510.getClass(), "rivalPdId", -1);
        setField(term187508, term187508.getClass(), "pdId", term187510);
        setIntField(term187508, term187508.getClass(), "pvId", 1504698817);
        setField(term187508, term187508.getClass(), "difficulty", enum426);
        setField(term187508, term187508.getClass(), "edition", enum427);
        setIntField(term187508, term187508.getClass(), "scriptVer", -2018333791);
        setIntField(term187508, term187508.getClass(), "score", -742476678);
        setField(term187508, term187508.getClass(), "challengeKind", enum428);
        setIntField(term187508, term187508.getClass(), "challengeResult", -824369460);
        setField(term187508, term187508.getClass(), "clearResult", enum429);
        setIntField(term187508, term187508.getClass(), "vp", -1573760035);
        setIntField(term187508, term187508.getClass(), "coolCount", -1147965121);
        setIntField(term187508, term187508.getClass(), "coolPercent", -867099093);
        setIntField(term187508, term187508.getClass(), "fineCount", -1091199008);
        setIntField(term187508, term187508.getClass(), "finePercent", 1837886253);
        setIntField(term187508, term187508.getClass(), "safeCount", -269528550);
        setIntField(term187508, term187508.getClass(), "safePercent", 2108571355);
        setIntField(term187508, term187508.getClass(), "sadCount", 1909966089);
        setIntField(term187508, term187508.getClass(), "sadPercent", 1827255916);
        setIntField(term187508, term187508.getClass(), "wrongCount", 2039815750);
        setIntField(term187508, term187508.getClass(), "wrongPercent", 2079590265);
        setIntField(term187508, term187508.getClass(), "maxCombo", -435079567);
        setIntField(term187508, term187508.getClass(), "chanceTime", -1017617829);
        setIntField(term187508, term187508.getClass(), "holdScore", 270928865);
        setIntField(term187508, term187508.getClass(), "attainPoint", -308526089);
        setIntField(term187508, term187508.getClass(), "skinId", -359675864);
        setIntField(term187508, term187508.getClass(), "buttonSe", -1671982964);
        setIntField(term187508, term187508.getClass(), "buttonSeVol", 776218451);
        setIntField(term187508, term187508.getClass(), "sliderSe", -1362132929);
        setIntField(term187508, term187508.getClass(), "ChainSlideSe", 1267740164);
        setIntField(term187508, term187508.getClass(), "SliderTouchSe", 1363887997);
        setField(term187508, term187508.getClass(), "modules", "SJiQaLvSKv");
        setIntField(term187508, term187508.getClass(), "stageCompletion", -1744763945);
        setIntField(term187508, term187508.getClass(), "slideScore", 852281447);
        setIntField(term187508, term187508.getClass(), "isVocalChange", 1248430530);
        setField(term187508, term187508.getClass(), "customizeItems", "OEXDRUKcFl");
        setField(term187508, term187508.getClass(), "rhythmGameOptions", "RYdKCNNMBR");
        setIntField(term187508, term187508.getClass(), "screenShotCount", -1);
        setIntField(term188228, term188228.getClass(), "year", 2018);
        setShortField(term188228, term188228.getClass(), "month", (short) 7);
        setShortField(term188228, term188228.getClass(), "day", (short) 12);
        setField(term188227, term188227.getClass(), "date", term188228);
        setByteField(term188232, term188232.getClass(), "hour", (byte) 1);
        setByteField(term188232, term188232.getClass(), "minute", (byte) 3);
        setByteField(term188232, term188232.getClass(), "second", (byte) 47);
        setIntField(term188232, term188232.getClass(), "nano", 2729929);
        setField(term188227, term188227.getClass(), "time", term188232);
        setField(term187508, term187508.getClass(), "dateTime", term188227);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRhythmGameOptions", argTypes, term187508, args);
    }

};


