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

public class PlayLog_setFineCount_12028107953 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term246436;
     Object term247163;

    public PlayLog_setFineCount_12028107953() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term247172 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term247171 = ((Class) term247172).getDeclaredField((String) "MISS");
        ((Field) term247171).setAccessible(true);
        Object enum559 = ((Field) term247171).get((Object) null);
        Class<? extends Object> term247549 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term247548 = ((Class) term247549).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term247548).setAccessible(true);
        Object enum560 = ((Field) term247548).get((Object) null);
        Class<? extends Object> term247832 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term247831 = ((Class) term247832).getDeclaredField((String) "NORMAL");
        ((Field) term247831).setAccessible(true);
        Object enum561 = ((Field) term247831).get((Object) null);
        Class<? extends Object> term248107 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term248106 = ((Class) term248107).getDeclaredField((String) "ORIGINAL");
        ((Field) term248106).setAccessible(true);
        Object enum562 = ((Field) term248106).get((Object) null);
        Class<? extends Object> term248373 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term248372 = ((Class) term248373).getDeclaredField((String) "NONE");
        ((Field) term248372).setAccessible(true);
        Object enum563 = ((Field) term248372).get((Object) null);
        Class<? extends Object> term249014 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term249013 = ((Class) term249014).getDeclaredField((String) "EXTREME");
        ((Field) term249013).setAccessible(true);
        Object enum564 = ((Field) term249013).get((Object) null);
        Class<? extends Object> term249292 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term249291 = ((Class) term249292).getDeclaredField((String) "EXTRA");
        ((Field) term249291).setAccessible(true);
        Object enum565 = ((Field) term249291).get((Object) null);
        Class<? extends Object> term249549 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term249548 = ((Class) term249549).getDeclaredField((String) "GREAT");
        ((Field) term249548).setAccessible(true);
        Object enum566 = ((Field) term249548).get((Object) null);
        Class<? extends Object> term249836 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term249835 = ((Class) term249836).getDeclaredField((String) "STANDARD");
        ((Field) term249835).setAccessible(true);
        Object enum567 = ((Field) term249835).get((Object) null);
        term246436 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        Object term246438 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term246561 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term246562 = newInstance(Class.forName("java.time.LocalDate"));
        Object term246566 = newInstance(Class.forName("java.time.LocalTime"));
        Object term247153 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term247154 = newInstance(Class.forName("java.time.LocalDate"));
        Object term247158 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term246436, term246436.getClass(), "id", 1457594663983990440L);
        setLongField(term246438, term246438.getClass(), "id", 3452833434644634217L);
        setIntField(term246438, term246438.getClass(), "pdId", 35388821);
        setField(term246438, term246438.getClass(), "playerName", "xxx");
        setIntField(term246438, term246438.getClass(), "vocaloidPoints", 300);
        setIntField(term246438, term246438.getClass(), "level", 1);
        setIntField(term246438, term246438.getClass(), "levelExp", -598803400);
        setField(term246438, term246438.getClass(), "levelTitle", "xxx");
        setIntField(term246438, term246438.getClass(), "plateId", -1);
        setIntField(term246438, term246438.getClass(), "plateEffectId", -1);
        setField(term246438, term246438.getClass(), "passwordStatus", enum559);
        setField(term246438, term246438.getClass(), "password", "**********");
        setBooleanField(term246438, term246438.getClass(), "preferPerPvModule", true);
        setBooleanField(term246438, term246438.getClass(), "preferCommonModule", true);
        setBooleanField(term246438, term246438.getClass(), "usePerPvSkin", true);
        setBooleanField(term246438, term246438.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term246438, term246438.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term246438, term246438.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term246438, term246438.getClass(), "usePerPvTouchSliderSe", true);
        setField(term246438, term246438.getClass(), "commonModule", "-999,-999,-999");
        setField(term246438, term246438.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term246562, term246562.getClass(), "year", 2026);
        setShortField(term246562, term246562.getClass(), "month", (short) 8);
        setShortField(term246562, term246562.getClass(), "day", (short) 12);
        setField(term246561, term246561.getClass(), "date", term246562);
        setByteField(term246566, term246566.getClass(), "hour", (byte) 2);
        setByteField(term246566, term246566.getClass(), "minute", (byte) 2);
        setByteField(term246566, term246566.getClass(), "second", (byte) 53);
        setIntField(term246566, term246566.getClass(), "nano", 570900000);
        setField(term246561, term246561.getClass(), "time", term246566);
        setField(term246438, term246438.getClass(), "commonModuleSetTime", term246561);
        setField(term246438, term246438.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term246438, term246438.getClass(), "commonSkin", -1);
        setIntField(term246438, term246438.getClass(), "headphoneVolume", 100);
        setBooleanField(term246438, term246438.getClass(), "buttonSeOn", true);
        setIntField(term246438, term246438.getClass(), "buttonSeVolume", 100);
        setIntField(term246438, term246438.getClass(), "sliderSeVolume", 100);
        setIntField(term246438, term246438.getClass(), "buttonSe", -1);
        setIntField(term246438, term246438.getClass(), "chainSlideSe", -1);
        setIntField(term246438, term246438.getClass(), "slideSe", -1);
        setIntField(term246438, term246438.getClass(), "sliderTouchSe", -1);
        setField(term246438, term246438.getClass(), "sortMode", enum560);
        setIntField(term246438, term246438.getClass(), "nextPvId", -1);
        setField(term246438, term246438.getClass(), "nextDifficulty", enum561);
        setField(term246438, term246438.getClass(), "nextEdition", enum562);
        setBooleanField(term246438, term246438.getClass(), "showInterimRanking", true);
        setBooleanField(term246438, term246438.getClass(), "showClearStatus", true);
        setBooleanField(term246438, term246438.getClass(), "showGreatBorder", true);
        setBooleanField(term246438, term246438.getClass(), "showExcellentBorder", true);
        setBooleanField(term246438, term246438.getClass(), "showRivalBorder", true);
        setBooleanField(term246438, term246438.getClass(), "showRgoSetting", true);
        setBooleanField(term246438, term246438.getClass(), "contestNowPlayingEnable", true);
        setIntField(term246438, term246438.getClass(), "contestNowPlayingId", -1);
        setIntField(term246438, term246438.getClass(), "contestNowPlayingValue", -1);
        setField(term246438, term246438.getClass(), "contestNowPlayingResultRank", enum563);
        setField(term246438, term246438.getClass(), "contestNowPlayingSpecifier", "");
        setField(term246438, term246438.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term246438, term246438.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term246438, term246438.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term246438, term246438.getClass(), "rivalPdId", -1);
        setField(term246436, term246436.getClass(), "pdId", term246438);
        setIntField(term246436, term246436.getClass(), "pvId", 25560022);
        setField(term246436, term246436.getClass(), "difficulty", enum564);
        setField(term246436, term246436.getClass(), "edition", enum565);
        setIntField(term246436, term246436.getClass(), "scriptVer", -1090136985);
        setIntField(term246436, term246436.getClass(), "score", -355574894);
        setField(term246436, term246436.getClass(), "challengeKind", enum566);
        setIntField(term246436, term246436.getClass(), "challengeResult", 1866941633);
        setField(term246436, term246436.getClass(), "clearResult", enum567);
        setIntField(term246436, term246436.getClass(), "vp", 1697296048);
        setIntField(term246436, term246436.getClass(), "coolCount", 1302075623);
        setIntField(term246436, term246436.getClass(), "coolPercent", 1238707613);
        setIntField(term246436, term246436.getClass(), "fineCount", 1961351136);
        setIntField(term246436, term246436.getClass(), "finePercent", -1546528470);
        setIntField(term246436, term246436.getClass(), "safeCount", -1518971561);
        setIntField(term246436, term246436.getClass(), "safePercent", 1513663171);
        setIntField(term246436, term246436.getClass(), "sadCount", 1527034193);
        setIntField(term246436, term246436.getClass(), "sadPercent", 1309545946);
        setIntField(term246436, term246436.getClass(), "wrongCount", -1457812682);
        setIntField(term246436, term246436.getClass(), "wrongPercent", -161850441);
        setIntField(term246436, term246436.getClass(), "maxCombo", 1486351894);
        setIntField(term246436, term246436.getClass(), "chanceTime", 1352463113);
        setIntField(term246436, term246436.getClass(), "holdScore", 897269648);
        setIntField(term246436, term246436.getClass(), "attainPoint", -1020664075);
        setIntField(term246436, term246436.getClass(), "skinId", -1412100145);
        setIntField(term246436, term246436.getClass(), "buttonSe", -1702355599);
        setIntField(term246436, term246436.getClass(), "buttonSeVol", -1477091217);
        setIntField(term246436, term246436.getClass(), "sliderSe", 2023226154);
        setIntField(term246436, term246436.getClass(), "ChainSlideSe", 2111611214);
        setIntField(term246436, term246436.getClass(), "SliderTouchSe", -2031129784);
        setField(term246436, term246436.getClass(), "modules", "hMmaoREuCK");
        setIntField(term246436, term246436.getClass(), "stageCompletion", 251039122);
        setIntField(term246436, term246436.getClass(), "slideScore", 459471826);
        setIntField(term246436, term246436.getClass(), "isVocalChange", -1054011286);
        setField(term246436, term246436.getClass(), "customizeItems", "VeDtgDzGAN");
        setField(term246436, term246436.getClass(), "rhythmGameOptions", "aWYOWZFyaX");
        setIntField(term246436, term246436.getClass(), "screenShotCount", -1);
        setIntField(term247154, term247154.getClass(), "year", 2011);
        setShortField(term247154, term247154.getClass(), "month", (short) 9);
        setShortField(term247154, term247154.getClass(), "day", (short) 25);
        setField(term247153, term247153.getClass(), "date", term247154);
        setByteField(term247158, term247158.getClass(), "hour", (byte) 16);
        setByteField(term247158, term247158.getClass(), "minute", (byte) 45);
        setByteField(term247158, term247158.getClass(), "second", (byte) 19);
        setIntField(term247158, term247158.getClass(), "nano", 962864785);
        setField(term247153, term247153.getClass(), "time", term247158);
        setField(term246436, term246436.getClass(), "dateTime", term247153);
        term247163 = new Integer(-1640361091);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term247163;
        callMethod(klass, "setFineCount", argTypes, term246436, args);
    }

};


