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

public class PlayLog_getSadCount_109008097718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119035;

    public PlayLog_getSadCount_109008097718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term119762 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term119761 = ((Class) term119762).getDeclaredField((String) "MISS");
        ((Field) term119761).setAccessible(true);
        Object enum258 = ((Field) term119761).get((Object) null);
        Class<? extends Object> term120139 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term120138 = ((Class) term120139).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term120138).setAccessible(true);
        Object enum259 = ((Field) term120138).get((Object) null);
        Class<? extends Object> term120422 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term120421 = ((Class) term120422).getDeclaredField((String) "NORMAL");
        ((Field) term120421).setAccessible(true);
        Object enum260 = ((Field) term120421).get((Object) null);
        Class<? extends Object> term120697 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term120696 = ((Class) term120697).getDeclaredField((String) "ORIGINAL");
        ((Field) term120696).setAccessible(true);
        Object enum261 = ((Field) term120696).get((Object) null);
        Class<? extends Object> term120963 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term120962 = ((Class) term120963).getDeclaredField((String) "NONE");
        ((Field) term120962).setAccessible(true);
        Object enum262 = ((Field) term120962).get((Object) null);
        Class<? extends Object> term121604 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term121603 = ((Class) term121604).getDeclaredField((String) "EXTREME");
        ((Field) term121603).setAccessible(true);
        Object enum263 = ((Field) term121603).get((Object) null);
        Class<? extends Object> term121882 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term121881 = ((Class) term121882).getDeclaredField((String) "EXCELLENT");
        ((Field) term121881).setAccessible(true);
        Object enum264 = ((Field) term121881).get((Object) null);
        Class<? extends Object> term122181 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term122180 = ((Class) term122181).getDeclaredField((String) "PERFECT");
        ((Field) term122180).setAccessible(true);
        Object enum265 = ((Field) term122180).get((Object) null);
        term119035 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        Object term119037 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term119160 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term119161 = newInstance(Class.forName("java.time.LocalDate"));
        Object term119165 = newInstance(Class.forName("java.time.LocalTime"));
        Object term119745 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term119746 = newInstance(Class.forName("java.time.LocalDate"));
        Object term119750 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term119035, term119035.getClass(), "id", 5510783420697225605L);
        setLongField(term119037, term119037.getClass(), "id", 6005241913654469005L);
        setIntField(term119037, term119037.getClass(), "pdId", -124088550);
        setField(term119037, term119037.getClass(), "playerName", "xxx");
        setIntField(term119037, term119037.getClass(), "vocaloidPoints", 300);
        setIntField(term119037, term119037.getClass(), "level", 1);
        setIntField(term119037, term119037.getClass(), "levelExp", 777492093);
        setField(term119037, term119037.getClass(), "levelTitle", "xxx");
        setIntField(term119037, term119037.getClass(), "plateId", -1);
        setIntField(term119037, term119037.getClass(), "plateEffectId", -1);
        setField(term119037, term119037.getClass(), "passwordStatus", enum258);
        setField(term119037, term119037.getClass(), "password", "**********");
        setBooleanField(term119037, term119037.getClass(), "preferPerPvModule", true);
        setBooleanField(term119037, term119037.getClass(), "preferCommonModule", true);
        setBooleanField(term119037, term119037.getClass(), "usePerPvSkin", true);
        setBooleanField(term119037, term119037.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term119037, term119037.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term119037, term119037.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term119037, term119037.getClass(), "usePerPvTouchSliderSe", false);
        setField(term119037, term119037.getClass(), "commonModule", "-999,-999,-999");
        setField(term119037, term119037.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term119161, term119161.getClass(), "year", 2026);
        setShortField(term119161, term119161.getClass(), "month", (short) 6);
        setShortField(term119161, term119161.getClass(), "day", (short) 29);
        setField(term119160, term119160.getClass(), "date", term119161);
        setByteField(term119165, term119165.getClass(), "hour", (byte) 4);
        setByteField(term119165, term119165.getClass(), "minute", (byte) 27);
        setByteField(term119165, term119165.getClass(), "second", (byte) 28);
        setIntField(term119165, term119165.getClass(), "nano", 180831000);
        setField(term119160, term119160.getClass(), "time", term119165);
        setField(term119037, term119037.getClass(), "commonModuleSetTime", term119160);
        setField(term119037, term119037.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term119037, term119037.getClass(), "commonSkin", -1);
        setIntField(term119037, term119037.getClass(), "headphoneVolume", 100);
        setBooleanField(term119037, term119037.getClass(), "buttonSeOn", true);
        setIntField(term119037, term119037.getClass(), "buttonSeVolume", 100);
        setIntField(term119037, term119037.getClass(), "sliderSeVolume", 100);
        setIntField(term119037, term119037.getClass(), "buttonSe", -1);
        setIntField(term119037, term119037.getClass(), "chainSlideSe", -1);
        setIntField(term119037, term119037.getClass(), "slideSe", -1);
        setIntField(term119037, term119037.getClass(), "sliderTouchSe", -1);
        setField(term119037, term119037.getClass(), "sortMode", enum259);
        setIntField(term119037, term119037.getClass(), "nextPvId", -1);
        setField(term119037, term119037.getClass(), "nextDifficulty", enum260);
        setField(term119037, term119037.getClass(), "nextEdition", enum261);
        setBooleanField(term119037, term119037.getClass(), "showInterimRanking", true);
        setBooleanField(term119037, term119037.getClass(), "showClearStatus", true);
        setBooleanField(term119037, term119037.getClass(), "showGreatBorder", true);
        setBooleanField(term119037, term119037.getClass(), "showExcellentBorder", true);
        setBooleanField(term119037, term119037.getClass(), "showRivalBorder", true);
        setBooleanField(term119037, term119037.getClass(), "showRgoSetting", true);
        setBooleanField(term119037, term119037.getClass(), "contestNowPlayingEnable", false);
        setIntField(term119037, term119037.getClass(), "contestNowPlayingId", -1);
        setIntField(term119037, term119037.getClass(), "contestNowPlayingValue", -1);
        setField(term119037, term119037.getClass(), "contestNowPlayingResultRank", enum262);
        setField(term119037, term119037.getClass(), "contestNowPlayingSpecifier", "");
        setField(term119037, term119037.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term119037, term119037.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term119037, term119037.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term119037, term119037.getClass(), "rivalPdId", -1);
        setField(term119035, term119035.getClass(), "pdId", term119037);
        setIntField(term119035, term119035.getClass(), "pvId", 1414025609);
        setField(term119035, term119035.getClass(), "difficulty", enum263);
        setField(term119035, term119035.getClass(), "edition", enum261);
        setIntField(term119035, term119035.getClass(), "scriptVer", 255145822);
        setIntField(term119035, term119035.getClass(), "score", -573608449);
        setField(term119035, term119035.getClass(), "challengeKind", enum264);
        setIntField(term119035, term119035.getClass(), "challengeResult", -1660057757);
        setField(term119035, term119035.getClass(), "clearResult", enum265);
        setIntField(term119035, term119035.getClass(), "vp", 1816273440);
        setIntField(term119035, term119035.getClass(), "coolCount", -96541009);
        setIntField(term119035, term119035.getClass(), "coolPercent", -43719302);
        setIntField(term119035, term119035.getClass(), "fineCount", 1024134939);
        setIntField(term119035, term119035.getClass(), "finePercent", 109078154);
        setIntField(term119035, term119035.getClass(), "safeCount", -314165467);
        setIntField(term119035, term119035.getClass(), "safePercent", 963694071);
        setIntField(term119035, term119035.getClass(), "sadCount", -995785731);
        setIntField(term119035, term119035.getClass(), "sadPercent", 1349815364);
        setIntField(term119035, term119035.getClass(), "wrongCount", 2128383340);
        setIntField(term119035, term119035.getClass(), "wrongPercent", 1238598518);
        setIntField(term119035, term119035.getClass(), "maxCombo", -558146961);
        setIntField(term119035, term119035.getClass(), "chanceTime", 1505480070);
        setIntField(term119035, term119035.getClass(), "holdScore", -829088844);
        setIntField(term119035, term119035.getClass(), "attainPoint", -31751777);
        setIntField(term119035, term119035.getClass(), "skinId", -246967963);
        setIntField(term119035, term119035.getClass(), "buttonSe", -1777140369);
        setIntField(term119035, term119035.getClass(), "buttonSeVol", 993627098);
        setIntField(term119035, term119035.getClass(), "sliderSe", 872295704);
        setIntField(term119035, term119035.getClass(), "ChainSlideSe", 86041387);
        setIntField(term119035, term119035.getClass(), "SliderTouchSe", 1010721666);
        setField(term119035, term119035.getClass(), "modules", "onpbIeEKoi");
        setIntField(term119035, term119035.getClass(), "stageCompletion", 27043781);
        setIntField(term119035, term119035.getClass(), "slideScore", -1367122405);
        setIntField(term119035, term119035.getClass(), "isVocalChange", -1703625118);
        setField(term119035, term119035.getClass(), "customizeItems", "YRHGsAkhxb");
        setField(term119035, term119035.getClass(), "rhythmGameOptions", "ffYhPOzlUs");
        setIntField(term119035, term119035.getClass(), "screenShotCount", -1);
        setIntField(term119746, term119746.getClass(), "year", 2014);
        setShortField(term119746, term119746.getClass(), "month", (short) 7);
        setShortField(term119746, term119746.getClass(), "day", (short) 13);
        setField(term119745, term119745.getClass(), "date", term119746);
        setByteField(term119750, term119750.getClass(), "hour", (byte) 21);
        setByteField(term119750, term119750.getClass(), "minute", (byte) 46);
        setByteField(term119750, term119750.getClass(), "second", (byte) 0);
        setIntField(term119750, term119750.getClass(), "nano", 887884128);
        setField(term119745, term119745.getClass(), "time", term119750);
        setField(term119035, term119035.getClass(), "dateTime", term119745);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSadCount", argTypes, term119035, args);
    }

};


