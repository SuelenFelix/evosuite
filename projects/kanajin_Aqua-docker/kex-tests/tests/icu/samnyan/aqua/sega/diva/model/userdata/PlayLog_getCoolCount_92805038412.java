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

public class PlayLog_getCoolCount_92805038412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98376;

    public PlayLog_getCoolCount_92805038412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term99089 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term99088 = ((Class) term99089).getDeclaredField((String) "MISS");
        ((Field) term99088).setAccessible(true);
        Object enum210 = ((Field) term99088).get((Object) null);
        Class<? extends Object> term99466 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term99465 = ((Class) term99466).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term99465).setAccessible(true);
        Object enum211 = ((Field) term99465).get((Object) null);
        Class<? extends Object> term99749 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term99748 = ((Class) term99749).getDeclaredField((String) "NORMAL");
        ((Field) term99748).setAccessible(true);
        Object enum212 = ((Field) term99748).get((Object) null);
        Class<? extends Object> term100024 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term100023 = ((Class) term100024).getDeclaredField((String) "ORIGINAL");
        ((Field) term100023).setAccessible(true);
        Object enum213 = ((Field) term100023).get((Object) null);
        Class<? extends Object> term100290 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term100289 = ((Class) term100290).getDeclaredField((String) "NONE");
        ((Field) term100289).setAccessible(true);
        Object enum214 = ((Field) term100289).get((Object) null);
        Class<? extends Object> term100931 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term100930 = ((Class) term100931).getDeclaredField((String) "CLEAR");
        ((Field) term100930).setAccessible(true);
        Object enum215 = ((Field) term100930).get((Object) null);
        Class<? extends Object> term101218 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term101217 = ((Class) term101218).getDeclaredField((String) "MISS_TAKE");
        ((Field) term101217).setAccessible(true);
        Object enum216 = ((Field) term101217).get((Object) null);
        term98376 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        Object term98378 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term98501 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term98502 = newInstance(Class.forName("java.time.LocalDate"));
        Object term98506 = newInstance(Class.forName("java.time.LocalTime"));
        Object term99072 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term99073 = newInstance(Class.forName("java.time.LocalDate"));
        Object term99077 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term98376, term98376.getClass(), "id", 305759998609888272L);
        setLongField(term98378, term98378.getClass(), "id", -8654565919063661957L);
        setIntField(term98378, term98378.getClass(), "pdId", -688213483);
        setField(term98378, term98378.getClass(), "playerName", "xxx");
        setIntField(term98378, term98378.getClass(), "vocaloidPoints", 300);
        setIntField(term98378, term98378.getClass(), "level", 1);
        setIntField(term98378, term98378.getClass(), "levelExp", 644154104);
        setField(term98378, term98378.getClass(), "levelTitle", "xxx");
        setIntField(term98378, term98378.getClass(), "plateId", -1);
        setIntField(term98378, term98378.getClass(), "plateEffectId", -1);
        setField(term98378, term98378.getClass(), "passwordStatus", enum210);
        setField(term98378, term98378.getClass(), "password", "**********");
        setBooleanField(term98378, term98378.getClass(), "preferPerPvModule", true);
        setBooleanField(term98378, term98378.getClass(), "preferCommonModule", false);
        setBooleanField(term98378, term98378.getClass(), "usePerPvSkin", false);
        setBooleanField(term98378, term98378.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term98378, term98378.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term98378, term98378.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term98378, term98378.getClass(), "usePerPvTouchSliderSe", false);
        setField(term98378, term98378.getClass(), "commonModule", "-999,-999,-999");
        setField(term98378, term98378.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term98502, term98502.getClass(), "year", 2026);
        setShortField(term98502, term98502.getClass(), "month", (short) 6);
        setShortField(term98502, term98502.getClass(), "day", (short) 29);
        setField(term98501, term98501.getClass(), "date", term98502);
        setByteField(term98506, term98506.getClass(), "hour", (byte) 4);
        setByteField(term98506, term98506.getClass(), "minute", (byte) 27);
        setByteField(term98506, term98506.getClass(), "second", (byte) 26);
        setIntField(term98506, term98506.getClass(), "nano", 633664000);
        setField(term98501, term98501.getClass(), "time", term98506);
        setField(term98378, term98378.getClass(), "commonModuleSetTime", term98501);
        setField(term98378, term98378.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term98378, term98378.getClass(), "commonSkin", -1);
        setIntField(term98378, term98378.getClass(), "headphoneVolume", 100);
        setBooleanField(term98378, term98378.getClass(), "buttonSeOn", true);
        setIntField(term98378, term98378.getClass(), "buttonSeVolume", 100);
        setIntField(term98378, term98378.getClass(), "sliderSeVolume", 100);
        setIntField(term98378, term98378.getClass(), "buttonSe", -1);
        setIntField(term98378, term98378.getClass(), "chainSlideSe", -1);
        setIntField(term98378, term98378.getClass(), "slideSe", -1);
        setIntField(term98378, term98378.getClass(), "sliderTouchSe", -1);
        setField(term98378, term98378.getClass(), "sortMode", enum211);
        setIntField(term98378, term98378.getClass(), "nextPvId", -1);
        setField(term98378, term98378.getClass(), "nextDifficulty", enum212);
        setField(term98378, term98378.getClass(), "nextEdition", enum213);
        setBooleanField(term98378, term98378.getClass(), "showInterimRanking", true);
        setBooleanField(term98378, term98378.getClass(), "showClearStatus", true);
        setBooleanField(term98378, term98378.getClass(), "showGreatBorder", true);
        setBooleanField(term98378, term98378.getClass(), "showExcellentBorder", true);
        setBooleanField(term98378, term98378.getClass(), "showRivalBorder", true);
        setBooleanField(term98378, term98378.getClass(), "showRgoSetting", true);
        setBooleanField(term98378, term98378.getClass(), "contestNowPlayingEnable", false);
        setIntField(term98378, term98378.getClass(), "contestNowPlayingId", -1);
        setIntField(term98378, term98378.getClass(), "contestNowPlayingValue", -1);
        setField(term98378, term98378.getClass(), "contestNowPlayingResultRank", enum214);
        setField(term98378, term98378.getClass(), "contestNowPlayingSpecifier", "");
        setField(term98378, term98378.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term98378, term98378.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term98378, term98378.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term98378, term98378.getClass(), "rivalPdId", -1);
        setField(term98376, term98376.getClass(), "pdId", term98378);
        setIntField(term98376, term98376.getClass(), "pvId", 76650923);
        setField(term98376, term98376.getClass(), "difficulty", enum212);
        setField(term98376, term98376.getClass(), "edition", enum213);
        setIntField(term98376, term98376.getClass(), "scriptVer", 1003743923);
        setIntField(term98376, term98376.getClass(), "score", 1887772522);
        setField(term98376, term98376.getClass(), "challengeKind", enum215);
        setIntField(term98376, term98376.getClass(), "challengeResult", 354196060);
        setField(term98376, term98376.getClass(), "clearResult", enum216);
        setIntField(term98376, term98376.getClass(), "vp", -1840305774);
        setIntField(term98376, term98376.getClass(), "coolCount", 1365087144);
        setIntField(term98376, term98376.getClass(), "coolPercent", -1537255112);
        setIntField(term98376, term98376.getClass(), "fineCount", 934477462);
        setIntField(term98376, term98376.getClass(), "finePercent", 4900410);
        setIntField(term98376, term98376.getClass(), "safeCount", -1252345779);
        setIntField(term98376, term98376.getClass(), "safePercent", -2063365430);
        setIntField(term98376, term98376.getClass(), "sadCount", 812570053);
        setIntField(term98376, term98376.getClass(), "sadPercent", -1488938905);
        setIntField(term98376, term98376.getClass(), "wrongCount", 1916544127);
        setIntField(term98376, term98376.getClass(), "wrongPercent", -1133405894);
        setIntField(term98376, term98376.getClass(), "maxCombo", 1289741214);
        setIntField(term98376, term98376.getClass(), "chanceTime", 243280944);
        setIntField(term98376, term98376.getClass(), "holdScore", -726681073);
        setIntField(term98376, term98376.getClass(), "attainPoint", -1724487863);
        setIntField(term98376, term98376.getClass(), "skinId", -128490829);
        setIntField(term98376, term98376.getClass(), "buttonSe", 202214133);
        setIntField(term98376, term98376.getClass(), "buttonSeVol", 1543091617);
        setIntField(term98376, term98376.getClass(), "sliderSe", -763166094);
        setIntField(term98376, term98376.getClass(), "ChainSlideSe", -222941705);
        setIntField(term98376, term98376.getClass(), "SliderTouchSe", 291864719);
        setField(term98376, term98376.getClass(), "modules", "xrwlQZdwCp");
        setIntField(term98376, term98376.getClass(), "stageCompletion", -1549607466);
        setIntField(term98376, term98376.getClass(), "slideScore", 853609788);
        setIntField(term98376, term98376.getClass(), "isVocalChange", -197820800);
        setField(term98376, term98376.getClass(), "customizeItems", "IDCWpPLRkE");
        setField(term98376, term98376.getClass(), "rhythmGameOptions", "nyiiPDVjAc");
        setIntField(term98376, term98376.getClass(), "screenShotCount", -1);
        setIntField(term99073, term99073.getClass(), "year", 2012);
        setShortField(term99073, term99073.getClass(), "month", (short) 2);
        setShortField(term99073, term99073.getClass(), "day", (short) 19);
        setField(term99072, term99072.getClass(), "date", term99073);
        setByteField(term99077, term99077.getClass(), "hour", (byte) 8);
        setByteField(term99077, term99077.getClass(), "minute", (byte) 4);
        setByteField(term99077, term99077.getClass(), "second", (byte) 43);
        setIntField(term99077, term99077.getClass(), "nano", 114930008);
        setField(term99072, term99072.getClass(), "time", term99077);
        setField(term98376, term98376.getClass(), "dateTime", term99072);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCoolCount", argTypes, term98376, args);
    }

};


