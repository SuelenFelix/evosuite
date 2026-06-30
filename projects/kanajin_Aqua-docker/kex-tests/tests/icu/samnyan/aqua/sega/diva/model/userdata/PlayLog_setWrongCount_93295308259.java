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

public class PlayLog_setWrongCount_93295308259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term267376;
     Object term268093;

    public PlayLog_setWrongCount_93295308259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term268102 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term268101 = ((Class) term268102).getDeclaredField((String) "MISS");
        ((Field) term268101).setAccessible(true);
        Object enum608 = ((Field) term268101).get((Object) null);
        Class<? extends Object> term268479 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term268478 = ((Class) term268479).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term268478).setAccessible(true);
        Object enum609 = ((Field) term268478).get((Object) null);
        Class<? extends Object> term268762 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term268761 = ((Class) term268762).getDeclaredField((String) "NORMAL");
        ((Field) term268761).setAccessible(true);
        Object enum610 = ((Field) term268761).get((Object) null);
        Class<? extends Object> term269037 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term269036 = ((Class) term269037).getDeclaredField((String) "ORIGINAL");
        ((Field) term269036).setAccessible(true);
        Object enum611 = ((Field) term269036).get((Object) null);
        Class<? extends Object> term269303 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term269302 = ((Class) term269303).getDeclaredField((String) "NONE");
        ((Field) term269302).setAccessible(true);
        Object enum612 = ((Field) term269302).get((Object) null);
        Class<? extends Object> term269944 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term269943 = ((Class) term269944).getDeclaredField((String) "EASY");
        ((Field) term269943).setAccessible(true);
        Object enum613 = ((Field) term269943).get((Object) null);
        Class<? extends Object> term270213 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term270212 = ((Class) term270213).getDeclaredField((String) "PERFECT");
        ((Field) term270212).setAccessible(true);
        Object enum614 = ((Field) term270212).get((Object) null);
        Class<? extends Object> term270506 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term270505 = ((Class) term270506).getDeclaredField((String) "MISS_TAKE");
        ((Field) term270505).setAccessible(true);
        Object enum615 = ((Field) term270505).get((Object) null);
        term267376 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        Object term267378 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term267501 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term267502 = newInstance(Class.forName("java.time.LocalDate"));
        Object term267506 = newInstance(Class.forName("java.time.LocalTime"));
        Object term268083 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term268084 = newInstance(Class.forName("java.time.LocalDate"));
        Object term268088 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term267376, term267376.getClass(), "id", -8121849829073967555L);
        setLongField(term267378, term267378.getClass(), "id", 5219030281405653303L);
        setIntField(term267378, term267378.getClass(), "pdId", -381130069);
        setField(term267378, term267378.getClass(), "playerName", "xxx");
        setIntField(term267378, term267378.getClass(), "vocaloidPoints", 300);
        setIntField(term267378, term267378.getClass(), "level", 1);
        setIntField(term267378, term267378.getClass(), "levelExp", 885769749);
        setField(term267378, term267378.getClass(), "levelTitle", "xxx");
        setIntField(term267378, term267378.getClass(), "plateId", -1);
        setIntField(term267378, term267378.getClass(), "plateEffectId", -1);
        setField(term267378, term267378.getClass(), "passwordStatus", enum608);
        setField(term267378, term267378.getClass(), "password", "**********");
        setBooleanField(term267378, term267378.getClass(), "preferPerPvModule", true);
        setBooleanField(term267378, term267378.getClass(), "preferCommonModule", true);
        setBooleanField(term267378, term267378.getClass(), "usePerPvSkin", false);
        setBooleanField(term267378, term267378.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term267378, term267378.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term267378, term267378.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term267378, term267378.getClass(), "usePerPvTouchSliderSe", false);
        setField(term267378, term267378.getClass(), "commonModule", "-999,-999,-999");
        setField(term267378, term267378.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term267502, term267502.getClass(), "year", 2026);
        setShortField(term267502, term267502.getClass(), "month", (short) 6);
        setShortField(term267502, term267502.getClass(), "day", (short) 29);
        setField(term267501, term267501.getClass(), "date", term267502);
        setByteField(term267506, term267506.getClass(), "hour", (byte) 4);
        setByteField(term267506, term267506.getClass(), "minute", (byte) 27);
        setByteField(term267506, term267506.getClass(), "second", (byte) 38);
        setIntField(term267506, term267506.getClass(), "nano", 664153000);
        setField(term267501, term267501.getClass(), "time", term267506);
        setField(term267378, term267378.getClass(), "commonModuleSetTime", term267501);
        setField(term267378, term267378.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term267378, term267378.getClass(), "commonSkin", -1);
        setIntField(term267378, term267378.getClass(), "headphoneVolume", 100);
        setBooleanField(term267378, term267378.getClass(), "buttonSeOn", true);
        setIntField(term267378, term267378.getClass(), "buttonSeVolume", 100);
        setIntField(term267378, term267378.getClass(), "sliderSeVolume", 100);
        setIntField(term267378, term267378.getClass(), "buttonSe", -1);
        setIntField(term267378, term267378.getClass(), "chainSlideSe", -1);
        setIntField(term267378, term267378.getClass(), "slideSe", -1);
        setIntField(term267378, term267378.getClass(), "sliderTouchSe", -1);
        setField(term267378, term267378.getClass(), "sortMode", enum609);
        setIntField(term267378, term267378.getClass(), "nextPvId", -1);
        setField(term267378, term267378.getClass(), "nextDifficulty", enum610);
        setField(term267378, term267378.getClass(), "nextEdition", enum611);
        setBooleanField(term267378, term267378.getClass(), "showInterimRanking", true);
        setBooleanField(term267378, term267378.getClass(), "showClearStatus", true);
        setBooleanField(term267378, term267378.getClass(), "showGreatBorder", true);
        setBooleanField(term267378, term267378.getClass(), "showExcellentBorder", true);
        setBooleanField(term267378, term267378.getClass(), "showRivalBorder", true);
        setBooleanField(term267378, term267378.getClass(), "showRgoSetting", true);
        setBooleanField(term267378, term267378.getClass(), "contestNowPlayingEnable", false);
        setIntField(term267378, term267378.getClass(), "contestNowPlayingId", -1);
        setIntField(term267378, term267378.getClass(), "contestNowPlayingValue", -1);
        setField(term267378, term267378.getClass(), "contestNowPlayingResultRank", enum612);
        setField(term267378, term267378.getClass(), "contestNowPlayingSpecifier", "");
        setField(term267378, term267378.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term267378, term267378.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term267378, term267378.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term267378, term267378.getClass(), "rivalPdId", -1);
        setField(term267376, term267376.getClass(), "pdId", term267378);
        setIntField(term267376, term267376.getClass(), "pvId", -1021168716);
        setField(term267376, term267376.getClass(), "difficulty", enum613);
        setField(term267376, term267376.getClass(), "edition", enum611);
        setIntField(term267376, term267376.getClass(), "scriptVer", -1238055654);
        setIntField(term267376, term267376.getClass(), "score", 1561513428);
        setField(term267376, term267376.getClass(), "challengeKind", enum614);
        setIntField(term267376, term267376.getClass(), "challengeResult", 778959809);
        setField(term267376, term267376.getClass(), "clearResult", enum615);
        setIntField(term267376, term267376.getClass(), "vp", -7504064);
        setIntField(term267376, term267376.getClass(), "coolCount", -1464364418);
        setIntField(term267376, term267376.getClass(), "coolPercent", 1050420173);
        setIntField(term267376, term267376.getClass(), "fineCount", 994300935);
        setIntField(term267376, term267376.getClass(), "finePercent", 433954476);
        setIntField(term267376, term267376.getClass(), "safeCount", 1780958641);
        setIntField(term267376, term267376.getClass(), "safePercent", 1890582085);
        setIntField(term267376, term267376.getClass(), "sadCount", 2146568808);
        setIntField(term267376, term267376.getClass(), "sadPercent", 245081679);
        setIntField(term267376, term267376.getClass(), "wrongCount", 1199789398);
        setIntField(term267376, term267376.getClass(), "wrongPercent", -1056402285);
        setIntField(term267376, term267376.getClass(), "maxCombo", 1881803912);
        setIntField(term267376, term267376.getClass(), "chanceTime", -188535038);
        setIntField(term267376, term267376.getClass(), "holdScore", 254650626);
        setIntField(term267376, term267376.getClass(), "attainPoint", -1789030917);
        setIntField(term267376, term267376.getClass(), "skinId", 912208163);
        setIntField(term267376, term267376.getClass(), "buttonSe", 909767683);
        setIntField(term267376, term267376.getClass(), "buttonSeVol", -639390893);
        setIntField(term267376, term267376.getClass(), "sliderSe", 1176415280);
        setIntField(term267376, term267376.getClass(), "ChainSlideSe", -1272714687);
        setIntField(term267376, term267376.getClass(), "SliderTouchSe", -762778853);
        setField(term267376, term267376.getClass(), "modules", "JmcmxoGhIK");
        setIntField(term267376, term267376.getClass(), "stageCompletion", 946727239);
        setIntField(term267376, term267376.getClass(), "slideScore", 349182490);
        setIntField(term267376, term267376.getClass(), "isVocalChange", -353671511);
        setField(term267376, term267376.getClass(), "customizeItems", "jXzmYyrnnT");
        setField(term267376, term267376.getClass(), "rhythmGameOptions", "igCAtimmYB");
        setIntField(term267376, term267376.getClass(), "screenShotCount", -1);
        setIntField(term268084, term268084.getClass(), "year", 2029);
        setShortField(term268084, term268084.getClass(), "month", (short) 1);
        setShortField(term268084, term268084.getClass(), "day", (short) 10);
        setField(term268083, term268083.getClass(), "date", term268084);
        setByteField(term268088, term268088.getClass(), "hour", (byte) 8);
        setByteField(term268088, term268088.getClass(), "minute", (byte) 46);
        setByteField(term268088, term268088.getClass(), "second", (byte) 35);
        setIntField(term268088, term268088.getClass(), "nano", 58807194);
        setField(term268083, term268083.getClass(), "time", term268088);
        setField(term267376, term267376.getClass(), "dateTime", term268083);
        term268093 = new Integer(1598831363);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term268093;
        callMethod(klass, "setWrongCount", argTypes, term267376, args);
    }

};


