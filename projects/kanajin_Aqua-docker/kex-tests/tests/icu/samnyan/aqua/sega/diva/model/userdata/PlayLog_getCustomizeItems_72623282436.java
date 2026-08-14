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

public class PlayLog_getCustomizeItems_72623282436 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term183791;

    public PlayLog_getCustomizeItems_72623282436() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term184526 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term184525 = ((Class) term184526).getDeclaredField((String) "MISS");
        ((Field) term184525).setAccessible(true);
        Object enum412 = ((Field) term184525).get((Object) null);
        Class<? extends Object> term184903 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term184902 = ((Class) term184903).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term184902).setAccessible(true);
        Object enum413 = ((Field) term184902).get((Object) null);
        Class<? extends Object> term185186 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term185185 = ((Class) term185186).getDeclaredField((String) "NORMAL");
        ((Field) term185185).setAccessible(true);
        Object enum414 = ((Field) term185185).get((Object) null);
        Class<? extends Object> term185461 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term185460 = ((Class) term185461).getDeclaredField((String) "ORIGINAL");
        ((Field) term185460).setAccessible(true);
        Object enum415 = ((Field) term185460).get((Object) null);
        Class<? extends Object> term185727 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term185726 = ((Class) term185727).getDeclaredField((String) "NONE");
        ((Field) term185726).setAccessible(true);
        Object enum416 = ((Field) term185726).get((Object) null);
        Class<? extends Object> term186368 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term186367 = ((Class) term186368).getDeclaredField((String) "EASY");
        ((Field) term186367).setAccessible(true);
        Object enum417 = ((Field) term186367).get((Object) null);
        Class<? extends Object> term186637 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term186636 = ((Class) term186637).getDeclaredField((String) "EXTRA");
        ((Field) term186636).setAccessible(true);
        Object enum418 = ((Field) term186636).get((Object) null);
        Class<? extends Object> term186894 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term186893 = ((Class) term186894).getDeclaredField((String) "EXCELLENT");
        ((Field) term186893).setAccessible(true);
        Object enum419 = ((Field) term186893).get((Object) null);
        Class<? extends Object> term187193 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term187192 = ((Class) term187193).getDeclaredField((String) "NO_CLEAR");
        ((Field) term187192).setAccessible(true);
        Object enum420 = ((Field) term187192).get((Object) null);
        term183791 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        Object term183793 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term183916 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term183917 = newInstance(Class.forName("java.time.LocalDate"));
        Object term183921 = newInstance(Class.forName("java.time.LocalTime"));
        Object term184509 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term184510 = newInstance(Class.forName("java.time.LocalDate"));
        Object term184514 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term183791, term183791.getClass(), "id", -4393710401270724527L);
        setLongField(term183793, term183793.getClass(), "id", -4822736661741380518L);
        setIntField(term183793, term183793.getClass(), "pdId", -1631415805);
        setField(term183793, term183793.getClass(), "playerName", "xxx");
        setIntField(term183793, term183793.getClass(), "vocaloidPoints", 300);
        setIntField(term183793, term183793.getClass(), "level", 1);
        setIntField(term183793, term183793.getClass(), "levelExp", 1073400519);
        setField(term183793, term183793.getClass(), "levelTitle", "xxx");
        setIntField(term183793, term183793.getClass(), "plateId", -1);
        setIntField(term183793, term183793.getClass(), "plateEffectId", -1);
        setField(term183793, term183793.getClass(), "passwordStatus", enum412);
        setField(term183793, term183793.getClass(), "password", "**********");
        setBooleanField(term183793, term183793.getClass(), "preferPerPvModule", true);
        setBooleanField(term183793, term183793.getClass(), "preferCommonModule", true);
        setBooleanField(term183793, term183793.getClass(), "usePerPvSkin", false);
        setBooleanField(term183793, term183793.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term183793, term183793.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term183793, term183793.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term183793, term183793.getClass(), "usePerPvTouchSliderSe", true);
        setField(term183793, term183793.getClass(), "commonModule", "-999,-999,-999");
        setField(term183793, term183793.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term183917, term183917.getClass(), "year", 2026);
        setShortField(term183917, term183917.getClass(), "month", (short) 8);
        setShortField(term183917, term183917.getClass(), "day", (short) 12);
        setField(term183916, term183916.getClass(), "date", term183917);
        setByteField(term183921, term183921.getClass(), "hour", (byte) 2);
        setByteField(term183921, term183921.getClass(), "minute", (byte) 2);
        setByteField(term183921, term183921.getClass(), "second", (byte) 49);
        setIntField(term183921, term183921.getClass(), "nano", 324374000);
        setField(term183916, term183916.getClass(), "time", term183921);
        setField(term183793, term183793.getClass(), "commonModuleSetTime", term183916);
        setField(term183793, term183793.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term183793, term183793.getClass(), "commonSkin", -1);
        setIntField(term183793, term183793.getClass(), "headphoneVolume", 100);
        setBooleanField(term183793, term183793.getClass(), "buttonSeOn", true);
        setIntField(term183793, term183793.getClass(), "buttonSeVolume", 100);
        setIntField(term183793, term183793.getClass(), "sliderSeVolume", 100);
        setIntField(term183793, term183793.getClass(), "buttonSe", -1);
        setIntField(term183793, term183793.getClass(), "chainSlideSe", -1);
        setIntField(term183793, term183793.getClass(), "slideSe", -1);
        setIntField(term183793, term183793.getClass(), "sliderTouchSe", -1);
        setField(term183793, term183793.getClass(), "sortMode", enum413);
        setIntField(term183793, term183793.getClass(), "nextPvId", -1);
        setField(term183793, term183793.getClass(), "nextDifficulty", enum414);
        setField(term183793, term183793.getClass(), "nextEdition", enum415);
        setBooleanField(term183793, term183793.getClass(), "showInterimRanking", true);
        setBooleanField(term183793, term183793.getClass(), "showClearStatus", true);
        setBooleanField(term183793, term183793.getClass(), "showGreatBorder", true);
        setBooleanField(term183793, term183793.getClass(), "showExcellentBorder", true);
        setBooleanField(term183793, term183793.getClass(), "showRivalBorder", true);
        setBooleanField(term183793, term183793.getClass(), "showRgoSetting", true);
        setBooleanField(term183793, term183793.getClass(), "contestNowPlayingEnable", false);
        setIntField(term183793, term183793.getClass(), "contestNowPlayingId", -1);
        setIntField(term183793, term183793.getClass(), "contestNowPlayingValue", -1);
        setField(term183793, term183793.getClass(), "contestNowPlayingResultRank", enum416);
        setField(term183793, term183793.getClass(), "contestNowPlayingSpecifier", "");
        setField(term183793, term183793.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term183793, term183793.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term183793, term183793.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term183793, term183793.getClass(), "rivalPdId", -1);
        setField(term183791, term183791.getClass(), "pdId", term183793);
        setIntField(term183791, term183791.getClass(), "pvId", -2025555268);
        setField(term183791, term183791.getClass(), "difficulty", enum417);
        setField(term183791, term183791.getClass(), "edition", enum418);
        setIntField(term183791, term183791.getClass(), "scriptVer", -746950289);
        setIntField(term183791, term183791.getClass(), "score", -137577510);
        setField(term183791, term183791.getClass(), "challengeKind", enum419);
        setIntField(term183791, term183791.getClass(), "challengeResult", 719185716);
        setField(term183791, term183791.getClass(), "clearResult", enum420);
        setIntField(term183791, term183791.getClass(), "vp", 1624820010);
        setIntField(term183791, term183791.getClass(), "coolCount", -831921156);
        setIntField(term183791, term183791.getClass(), "coolPercent", -2085566906);
        setIntField(term183791, term183791.getClass(), "fineCount", 1773193728);
        setIntField(term183791, term183791.getClass(), "finePercent", -1341357647);
        setIntField(term183791, term183791.getClass(), "safeCount", 138447019);
        setIntField(term183791, term183791.getClass(), "safePercent", 114915275);
        setIntField(term183791, term183791.getClass(), "sadCount", 338519695);
        setIntField(term183791, term183791.getClass(), "sadPercent", 2025566580);
        setIntField(term183791, term183791.getClass(), "wrongCount", -1231122778);
        setIntField(term183791, term183791.getClass(), "wrongPercent", 1923558221);
        setIntField(term183791, term183791.getClass(), "maxCombo", 1762934060);
        setIntField(term183791, term183791.getClass(), "chanceTime", -859828739);
        setIntField(term183791, term183791.getClass(), "holdScore", 1986855642);
        setIntField(term183791, term183791.getClass(), "attainPoint", 1280322790);
        setIntField(term183791, term183791.getClass(), "skinId", -1702209203);
        setIntField(term183791, term183791.getClass(), "buttonSe", -1592307668);
        setIntField(term183791, term183791.getClass(), "buttonSeVol", -203832871);
        setIntField(term183791, term183791.getClass(), "sliderSe", 1151963130);
        setIntField(term183791, term183791.getClass(), "ChainSlideSe", -1855819749);
        setIntField(term183791, term183791.getClass(), "SliderTouchSe", 1059048043);
        setField(term183791, term183791.getClass(), "modules", "ZVecLZMLHF");
        setIntField(term183791, term183791.getClass(), "stageCompletion", 537273345);
        setIntField(term183791, term183791.getClass(), "slideScore", -346107257);
        setIntField(term183791, term183791.getClass(), "isVocalChange", -1577393360);
        setField(term183791, term183791.getClass(), "customizeItems", "fztQhjqwdP");
        setField(term183791, term183791.getClass(), "rhythmGameOptions", "eVpkWxjuki");
        setIntField(term183791, term183791.getClass(), "screenShotCount", -1);
        setIntField(term184510, term184510.getClass(), "year", 2023);
        setShortField(term184510, term184510.getClass(), "month", (short) 7);
        setShortField(term184510, term184510.getClass(), "day", (short) 16);
        setField(term184509, term184509.getClass(), "date", term184510);
        setByteField(term184514, term184514.getClass(), "hour", (byte) 3);
        setByteField(term184514, term184514.getClass(), "minute", (byte) 1);
        setByteField(term184514, term184514.getClass(), "second", (byte) 19);
        setIntField(term184514, term184514.getClass(), "nano", 488629554);
        setField(term184509, term184509.getClass(), "time", term184514);
        setField(term183791, term183791.getClass(), "dateTime", term184509);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCustomizeItems", argTypes, term183791, args);
    }

};


