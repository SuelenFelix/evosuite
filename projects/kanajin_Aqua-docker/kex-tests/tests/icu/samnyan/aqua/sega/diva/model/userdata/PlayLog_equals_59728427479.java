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

public class PlayLog_equals_59728427479 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term337399;
     Object term338118;

    public PlayLog_equals_59728427479() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term338126 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term338125 = ((Class) term338126).getDeclaredField((String) "MISS");
        ((Field) term338125).setAccessible(true);
        Object enum772 = ((Field) term338125).get((Object) null);
        Class<? extends Object> term338503 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term338502 = ((Class) term338503).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term338502).setAccessible(true);
        Object enum773 = ((Field) term338502).get((Object) null);
        Class<? extends Object> term338786 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term338785 = ((Class) term338786).getDeclaredField((String) "NORMAL");
        ((Field) term338785).setAccessible(true);
        Object enum774 = ((Field) term338785).get((Object) null);
        Class<? extends Object> term339061 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term339060 = ((Class) term339061).getDeclaredField((String) "ORIGINAL");
        ((Field) term339060).setAccessible(true);
        Object enum775 = ((Field) term339060).get((Object) null);
        Class<? extends Object> term339327 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term339326 = ((Class) term339327).getDeclaredField((String) "NONE");
        ((Field) term339326).setAccessible(true);
        Object enum776 = ((Field) term339326).get((Object) null);
        Class<? extends Object> term339968 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term339967 = ((Class) term339968).getDeclaredField((String) "UNDEFINED");
        ((Field) term339967).setAccessible(true);
        Object enum777 = ((Field) term339967).get((Object) null);
        Class<? extends Object> term340252 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term340251 = ((Class) term340252).getDeclaredField((String) "CLEAR");
        ((Field) term340251).setAccessible(true);
        Object enum778 = ((Field) term340251).get((Object) null);
        Class<? extends Object> term340539 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term340538 = ((Class) term340539).getDeclaredField((String) "STANDARD");
        ((Field) term340538).setAccessible(true);
        Object enum779 = ((Field) term340538).get((Object) null);
        term337399 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        Object term337401 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term337524 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term337525 = newInstance(Class.forName("java.time.LocalDate"));
        Object term337529 = newInstance(Class.forName("java.time.LocalTime"));
        Object term338108 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term338109 = newInstance(Class.forName("java.time.LocalDate"));
        Object term338113 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term337399, term337399.getClass(), "id", 3580984732036213717L);
        setLongField(term337401, term337401.getClass(), "id", 5330761990446327930L);
        setIntField(term337401, term337401.getClass(), "pdId", -2045231879);
        setField(term337401, term337401.getClass(), "playerName", "xxx");
        setIntField(term337401, term337401.getClass(), "vocaloidPoints", 300);
        setIntField(term337401, term337401.getClass(), "level", 1);
        setIntField(term337401, term337401.getClass(), "levelExp", 1678025090);
        setField(term337401, term337401.getClass(), "levelTitle", "xxx");
        setIntField(term337401, term337401.getClass(), "plateId", -1);
        setIntField(term337401, term337401.getClass(), "plateEffectId", -1);
        setField(term337401, term337401.getClass(), "passwordStatus", enum772);
        setField(term337401, term337401.getClass(), "password", "**********");
        setBooleanField(term337401, term337401.getClass(), "preferPerPvModule", true);
        setBooleanField(term337401, term337401.getClass(), "preferCommonModule", false);
        setBooleanField(term337401, term337401.getClass(), "usePerPvSkin", false);
        setBooleanField(term337401, term337401.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term337401, term337401.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term337401, term337401.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term337401, term337401.getClass(), "usePerPvTouchSliderSe", false);
        setField(term337401, term337401.getClass(), "commonModule", "-999,-999,-999");
        setField(term337401, term337401.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term337525, term337525.getClass(), "year", 2026);
        setShortField(term337525, term337525.getClass(), "month", (short) 8);
        setShortField(term337525, term337525.getClass(), "day", (short) 12);
        setField(term337524, term337524.getClass(), "date", term337525);
        setByteField(term337529, term337529.getClass(), "hour", (byte) 2);
        setByteField(term337529, term337529.getClass(), "minute", (byte) 2);
        setByteField(term337529, term337529.getClass(), "second", (byte) 59);
        setIntField(term337529, term337529.getClass(), "nano", 998593000);
        setField(term337524, term337524.getClass(), "time", term337529);
        setField(term337401, term337401.getClass(), "commonModuleSetTime", term337524);
        setField(term337401, term337401.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term337401, term337401.getClass(), "commonSkin", -1);
        setIntField(term337401, term337401.getClass(), "headphoneVolume", 100);
        setBooleanField(term337401, term337401.getClass(), "buttonSeOn", true);
        setIntField(term337401, term337401.getClass(), "buttonSeVolume", 100);
        setIntField(term337401, term337401.getClass(), "sliderSeVolume", 100);
        setIntField(term337401, term337401.getClass(), "buttonSe", -1);
        setIntField(term337401, term337401.getClass(), "chainSlideSe", -1);
        setIntField(term337401, term337401.getClass(), "slideSe", -1);
        setIntField(term337401, term337401.getClass(), "sliderTouchSe", -1);
        setField(term337401, term337401.getClass(), "sortMode", enum773);
        setIntField(term337401, term337401.getClass(), "nextPvId", -1);
        setField(term337401, term337401.getClass(), "nextDifficulty", enum774);
        setField(term337401, term337401.getClass(), "nextEdition", enum775);
        setBooleanField(term337401, term337401.getClass(), "showInterimRanking", true);
        setBooleanField(term337401, term337401.getClass(), "showClearStatus", true);
        setBooleanField(term337401, term337401.getClass(), "showGreatBorder", true);
        setBooleanField(term337401, term337401.getClass(), "showExcellentBorder", true);
        setBooleanField(term337401, term337401.getClass(), "showRivalBorder", true);
        setBooleanField(term337401, term337401.getClass(), "showRgoSetting", true);
        setBooleanField(term337401, term337401.getClass(), "contestNowPlayingEnable", false);
        setIntField(term337401, term337401.getClass(), "contestNowPlayingId", -1);
        setIntField(term337401, term337401.getClass(), "contestNowPlayingValue", -1);
        setField(term337401, term337401.getClass(), "contestNowPlayingResultRank", enum776);
        setField(term337401, term337401.getClass(), "contestNowPlayingSpecifier", "");
        setField(term337401, term337401.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term337401, term337401.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term337401, term337401.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term337401, term337401.getClass(), "rivalPdId", -1);
        setField(term337399, term337399.getClass(), "pdId", term337401);
        setIntField(term337399, term337399.getClass(), "pvId", 714453255);
        setField(term337399, term337399.getClass(), "difficulty", enum777);
        setField(term337399, term337399.getClass(), "edition", enum775);
        setIntField(term337399, term337399.getClass(), "scriptVer", 2096762388);
        setIntField(term337399, term337399.getClass(), "score", -1646872343);
        setField(term337399, term337399.getClass(), "challengeKind", enum778);
        setIntField(term337399, term337399.getClass(), "challengeResult", -140841633);
        setField(term337399, term337399.getClass(), "clearResult", enum779);
        setIntField(term337399, term337399.getClass(), "vp", 1970986976);
        setIntField(term337399, term337399.getClass(), "coolCount", 530909877);
        setIntField(term337399, term337399.getClass(), "coolPercent", -123945804);
        setIntField(term337399, term337399.getClass(), "fineCount", 2133669766);
        setIntField(term337399, term337399.getClass(), "finePercent", -1423215684);
        setIntField(term337399, term337399.getClass(), "safeCount", -1096652631);
        setIntField(term337399, term337399.getClass(), "safePercent", 1116810901);
        setIntField(term337399, term337399.getClass(), "sadCount", 1944430959);
        setIntField(term337399, term337399.getClass(), "sadPercent", 98801346);
        setIntField(term337399, term337399.getClass(), "wrongCount", 2133290622);
        setIntField(term337399, term337399.getClass(), "wrongPercent", -164869996);
        setIntField(term337399, term337399.getClass(), "maxCombo", 1415001538);
        setIntField(term337399, term337399.getClass(), "chanceTime", 1738077695);
        setIntField(term337399, term337399.getClass(), "holdScore", -1351117314);
        setIntField(term337399, term337399.getClass(), "attainPoint", 1693588815);
        setIntField(term337399, term337399.getClass(), "skinId", 1272985537);
        setIntField(term337399, term337399.getClass(), "buttonSe", -785719854);
        setIntField(term337399, term337399.getClass(), "buttonSeVol", -1542292796);
        setIntField(term337399, term337399.getClass(), "sliderSe", 1892295932);
        setIntField(term337399, term337399.getClass(), "ChainSlideSe", 1028855301);
        setIntField(term337399, term337399.getClass(), "SliderTouchSe", -2075314038);
        setField(term337399, term337399.getClass(), "modules", "iIRsCSYqXH");
        setIntField(term337399, term337399.getClass(), "stageCompletion", 1085906450);
        setIntField(term337399, term337399.getClass(), "slideScore", 1892947629);
        setIntField(term337399, term337399.getClass(), "isVocalChange", -1350968212);
        setField(term337399, term337399.getClass(), "customizeItems", "nghfqDXyCG");
        setField(term337399, term337399.getClass(), "rhythmGameOptions", "WBAOTqErtm");
        setIntField(term337399, term337399.getClass(), "screenShotCount", -1);
        setIntField(term338109, term338109.getClass(), "year", 2021);
        setShortField(term338109, term338109.getClass(), "month", (short) 3);
        setShortField(term338109, term338109.getClass(), "day", (short) 13);
        setField(term338108, term338108.getClass(), "date", term338109);
        setByteField(term338113, term338113.getClass(), "hour", (byte) 6);
        setByteField(term338113, term338113.getClass(), "minute", (byte) 25);
        setByteField(term338113, term338113.getClass(), "second", (byte) 42);
        setIntField(term338113, term338113.getClass(), "nano", 282924199);
        setField(term338108, term338108.getClass(), "time", term338113);
        setField(term337399, term337399.getClass(), "dateTime", term338108);
        term338118 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term338118;
        callMethod(klass, "equals", argTypes, term337399, args);
    }

};


