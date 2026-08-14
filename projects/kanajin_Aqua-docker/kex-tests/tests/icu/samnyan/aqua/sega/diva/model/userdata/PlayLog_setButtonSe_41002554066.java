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

public class PlayLog_setButtonSe_41002554066 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term292003;
     Object term292715;

    public PlayLog_setButtonSe_41002554066() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term292724 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term292723 = ((Class) term292724).getDeclaredField((String) "MISS");
        ((Field) term292723).setAccessible(true);
        Object enum666 = ((Field) term292723).get((Object) null);
        Class<? extends Object> term293101 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term293100 = ((Class) term293101).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term293100).setAccessible(true);
        Object enum667 = ((Field) term293100).get((Object) null);
        Class<? extends Object> term293384 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term293383 = ((Class) term293384).getDeclaredField((String) "NORMAL");
        ((Field) term293383).setAccessible(true);
        Object enum668 = ((Field) term293383).get((Object) null);
        Class<? extends Object> term293659 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term293658 = ((Class) term293659).getDeclaredField((String) "ORIGINAL");
        ((Field) term293658).setAccessible(true);
        Object enum669 = ((Field) term293658).get((Object) null);
        Class<? extends Object> term293925 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term293924 = ((Class) term293925).getDeclaredField((String) "NONE");
        ((Field) term293924).setAccessible(true);
        Object enum670 = ((Field) term293924).get((Object) null);
        Class<? extends Object> term294566 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term294565 = ((Class) term294566).getDeclaredField((String) "EXTRA");
        ((Field) term294565).setAccessible(true);
        Object enum671 = ((Field) term294565).get((Object) null);
        Class<? extends Object> term294823 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term294822 = ((Class) term294823).getDeclaredField((String) "CLEAR");
        ((Field) term294822).setAccessible(true);
        Object enum672 = ((Field) term294822).get((Object) null);
        Class<? extends Object> term295110 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term295109 = ((Class) term295110).getDeclaredField((String) "GREAT");
        ((Field) term295109).setAccessible(true);
        Object enum673 = ((Field) term295109).get((Object) null);
        term292003 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        Object term292005 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term292128 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term292129 = newInstance(Class.forName("java.time.LocalDate"));
        Object term292133 = newInstance(Class.forName("java.time.LocalTime"));
        Object term292705 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term292706 = newInstance(Class.forName("java.time.LocalDate"));
        Object term292710 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term292003, term292003.getClass(), "id", 4699157009689333952L);
        setLongField(term292005, term292005.getClass(), "id", -78240609295693193L);
        setIntField(term292005, term292005.getClass(), "pdId", 622731276);
        setField(term292005, term292005.getClass(), "playerName", "xxx");
        setIntField(term292005, term292005.getClass(), "vocaloidPoints", 300);
        setIntField(term292005, term292005.getClass(), "level", 1);
        setIntField(term292005, term292005.getClass(), "levelExp", -1302341502);
        setField(term292005, term292005.getClass(), "levelTitle", "xxx");
        setIntField(term292005, term292005.getClass(), "plateId", -1);
        setIntField(term292005, term292005.getClass(), "plateEffectId", -1);
        setField(term292005, term292005.getClass(), "passwordStatus", enum666);
        setField(term292005, term292005.getClass(), "password", "**********");
        setBooleanField(term292005, term292005.getClass(), "preferPerPvModule", true);
        setBooleanField(term292005, term292005.getClass(), "preferCommonModule", true);
        setBooleanField(term292005, term292005.getClass(), "usePerPvSkin", false);
        setBooleanField(term292005, term292005.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term292005, term292005.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term292005, term292005.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term292005, term292005.getClass(), "usePerPvTouchSliderSe", false);
        setField(term292005, term292005.getClass(), "commonModule", "-999,-999,-999");
        setField(term292005, term292005.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term292129, term292129.getClass(), "year", 2026);
        setShortField(term292129, term292129.getClass(), "month", (short) 8);
        setShortField(term292129, term292129.getClass(), "day", (short) 12);
        setField(term292128, term292128.getClass(), "date", term292129);
        setByteField(term292133, term292133.getClass(), "hour", (byte) 2);
        setByteField(term292133, term292133.getClass(), "minute", (byte) 2);
        setByteField(term292133, term292133.getClass(), "second", (byte) 56);
        setIntField(term292133, term292133.getClass(), "nano", 784389000);
        setField(term292128, term292128.getClass(), "time", term292133);
        setField(term292005, term292005.getClass(), "commonModuleSetTime", term292128);
        setField(term292005, term292005.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term292005, term292005.getClass(), "commonSkin", -1);
        setIntField(term292005, term292005.getClass(), "headphoneVolume", 100);
        setBooleanField(term292005, term292005.getClass(), "buttonSeOn", true);
        setIntField(term292005, term292005.getClass(), "buttonSeVolume", 100);
        setIntField(term292005, term292005.getClass(), "sliderSeVolume", 100);
        setIntField(term292005, term292005.getClass(), "buttonSe", -1);
        setIntField(term292005, term292005.getClass(), "chainSlideSe", -1);
        setIntField(term292005, term292005.getClass(), "slideSe", -1);
        setIntField(term292005, term292005.getClass(), "sliderTouchSe", -1);
        setField(term292005, term292005.getClass(), "sortMode", enum667);
        setIntField(term292005, term292005.getClass(), "nextPvId", -1);
        setField(term292005, term292005.getClass(), "nextDifficulty", enum668);
        setField(term292005, term292005.getClass(), "nextEdition", enum669);
        setBooleanField(term292005, term292005.getClass(), "showInterimRanking", true);
        setBooleanField(term292005, term292005.getClass(), "showClearStatus", true);
        setBooleanField(term292005, term292005.getClass(), "showGreatBorder", true);
        setBooleanField(term292005, term292005.getClass(), "showExcellentBorder", true);
        setBooleanField(term292005, term292005.getClass(), "showRivalBorder", true);
        setBooleanField(term292005, term292005.getClass(), "showRgoSetting", true);
        setBooleanField(term292005, term292005.getClass(), "contestNowPlayingEnable", true);
        setIntField(term292005, term292005.getClass(), "contestNowPlayingId", -1);
        setIntField(term292005, term292005.getClass(), "contestNowPlayingValue", -1);
        setField(term292005, term292005.getClass(), "contestNowPlayingResultRank", enum670);
        setField(term292005, term292005.getClass(), "contestNowPlayingSpecifier", "");
        setField(term292005, term292005.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term292005, term292005.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term292005, term292005.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term292005, term292005.getClass(), "rivalPdId", -1);
        setField(term292003, term292003.getClass(), "pdId", term292005);
        setIntField(term292003, term292003.getClass(), "pvId", 1113574554);
        setField(term292003, term292003.getClass(), "difficulty", enum668);
        setField(term292003, term292003.getClass(), "edition", enum671);
        setIntField(term292003, term292003.getClass(), "scriptVer", 1685800093);
        setIntField(term292003, term292003.getClass(), "score", -318699441);
        setField(term292003, term292003.getClass(), "challengeKind", enum672);
        setIntField(term292003, term292003.getClass(), "challengeResult", 1381027809);
        setField(term292003, term292003.getClass(), "clearResult", enum673);
        setIntField(term292003, term292003.getClass(), "vp", -371717995);
        setIntField(term292003, term292003.getClass(), "coolCount", 1713005479);
        setIntField(term292003, term292003.getClass(), "coolPercent", -1948910444);
        setIntField(term292003, term292003.getClass(), "fineCount", -1099061955);
        setIntField(term292003, term292003.getClass(), "finePercent", -1672904007);
        setIntField(term292003, term292003.getClass(), "safeCount", -217232010);
        setIntField(term292003, term292003.getClass(), "safePercent", 2053372601);
        setIntField(term292003, term292003.getClass(), "sadCount", -1828855069);
        setIntField(term292003, term292003.getClass(), "sadPercent", -1213694931);
        setIntField(term292003, term292003.getClass(), "wrongCount", -1255656944);
        setIntField(term292003, term292003.getClass(), "wrongPercent", -377697034);
        setIntField(term292003, term292003.getClass(), "maxCombo", 1102778743);
        setIntField(term292003, term292003.getClass(), "chanceTime", 1300928519);
        setIntField(term292003, term292003.getClass(), "holdScore", 338172676);
        setIntField(term292003, term292003.getClass(), "attainPoint", -1896960942);
        setIntField(term292003, term292003.getClass(), "skinId", -935912608);
        setIntField(term292003, term292003.getClass(), "buttonSe", 505087197);
        setIntField(term292003, term292003.getClass(), "buttonSeVol", 427005798);
        setIntField(term292003, term292003.getClass(), "sliderSe", -993454505);
        setIntField(term292003, term292003.getClass(), "ChainSlideSe", -238353821);
        setIntField(term292003, term292003.getClass(), "SliderTouchSe", -818992228);
        setField(term292003, term292003.getClass(), "modules", "XJJNClzHRf");
        setIntField(term292003, term292003.getClass(), "stageCompletion", 2087429143);
        setIntField(term292003, term292003.getClass(), "slideScore", -1892890104);
        setIntField(term292003, term292003.getClass(), "isVocalChange", 2003356558);
        setField(term292003, term292003.getClass(), "customizeItems", "HDaezxQfQR");
        setField(term292003, term292003.getClass(), "rhythmGameOptions", "iikZEapDlu");
        setIntField(term292003, term292003.getClass(), "screenShotCount", -1);
        setIntField(term292706, term292706.getClass(), "year", 2028);
        setShortField(term292706, term292706.getClass(), "month", (short) 4);
        setShortField(term292706, term292706.getClass(), "day", (short) 1);
        setField(term292705, term292705.getClass(), "date", term292706);
        setByteField(term292710, term292710.getClass(), "hour", (byte) 16);
        setByteField(term292710, term292710.getClass(), "minute", (byte) 22);
        setByteField(term292710, term292710.getClass(), "second", (byte) 32);
        setIntField(term292710, term292710.getClass(), "nano", 406353763);
        setField(term292705, term292705.getClass(), "time", term292710);
        setField(term292003, term292003.getClass(), "dateTime", term292705);
        term292715 = new Integer(-638126185);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term292715;
        callMethod(klass, "setButtonSe", argTypes, term292003, args);
    }

};


