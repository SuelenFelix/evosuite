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

public class PlayLog_getDateTime_76995395439 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term194954;

    public PlayLog_getDateTime_76995395439() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term195680 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term195679 = ((Class) term195680).getDeclaredField((String) "MISS");
        ((Field) term195679).setAccessible(true);
        Object enum439 = ((Field) term195679).get((Object) null);
        Class<? extends Object> term196057 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term196056 = ((Class) term196057).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term196056).setAccessible(true);
        Object enum440 = ((Field) term196056).get((Object) null);
        Class<? extends Object> term196340 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term196339 = ((Class) term196340).getDeclaredField((String) "NORMAL");
        ((Field) term196339).setAccessible(true);
        Object enum441 = ((Field) term196339).get((Object) null);
        Class<? extends Object> term196615 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term196614 = ((Class) term196615).getDeclaredField((String) "ORIGINAL");
        ((Field) term196614).setAccessible(true);
        Object enum442 = ((Field) term196614).get((Object) null);
        Class<? extends Object> term196881 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term196880 = ((Class) term196881).getDeclaredField((String) "NONE");
        ((Field) term196880).setAccessible(true);
        Object enum443 = ((Field) term196880).get((Object) null);
        Class<? extends Object> term197522 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term197521 = ((Class) term197522).getDeclaredField((String) "HARD");
        ((Field) term197521).setAccessible(true);
        Object enum444 = ((Field) term197521).get((Object) null);
        Class<? extends Object> term197791 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term197790 = ((Class) term197791).getDeclaredField((String) "UNDEFINED");
        ((Field) term197790).setAccessible(true);
        Object enum445 = ((Field) term197790).get((Object) null);
        Class<? extends Object> term198090 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term198089 = ((Class) term198090).getDeclaredField((String) "MISS_TAKE");
        ((Field) term198089).setAccessible(true);
        Object enum446 = ((Field) term198089).get((Object) null);
        term194954 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        Object term194956 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term195079 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term195080 = newInstance(Class.forName("java.time.LocalDate"));
        Object term195084 = newInstance(Class.forName("java.time.LocalTime"));
        Object term195663 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term195664 = newInstance(Class.forName("java.time.LocalDate"));
        Object term195668 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term194954, term194954.getClass(), "id", -900457279156388404L);
        setLongField(term194956, term194956.getClass(), "id", 1084801489398441516L);
        setIntField(term194956, term194956.getClass(), "pdId", -1062027102);
        setField(term194956, term194956.getClass(), "playerName", "xxx");
        setIntField(term194956, term194956.getClass(), "vocaloidPoints", 300);
        setIntField(term194956, term194956.getClass(), "level", 1);
        setIntField(term194956, term194956.getClass(), "levelExp", 1763217806);
        setField(term194956, term194956.getClass(), "levelTitle", "xxx");
        setIntField(term194956, term194956.getClass(), "plateId", -1);
        setIntField(term194956, term194956.getClass(), "plateEffectId", -1);
        setField(term194956, term194956.getClass(), "passwordStatus", enum439);
        setField(term194956, term194956.getClass(), "password", "**********");
        setBooleanField(term194956, term194956.getClass(), "preferPerPvModule", true);
        setBooleanField(term194956, term194956.getClass(), "preferCommonModule", true);
        setBooleanField(term194956, term194956.getClass(), "usePerPvSkin", false);
        setBooleanField(term194956, term194956.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term194956, term194956.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term194956, term194956.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term194956, term194956.getClass(), "usePerPvTouchSliderSe", true);
        setField(term194956, term194956.getClass(), "commonModule", "-999,-999,-999");
        setField(term194956, term194956.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term195080, term195080.getClass(), "year", 2026);
        setShortField(term195080, term195080.getClass(), "month", (short) 8);
        setShortField(term195080, term195080.getClass(), "day", (short) 12);
        setField(term195079, term195079.getClass(), "date", term195080);
        setByteField(term195084, term195084.getClass(), "hour", (byte) 2);
        setByteField(term195084, term195084.getClass(), "minute", (byte) 2);
        setByteField(term195084, term195084.getClass(), "second", (byte) 50);
        setIntField(term195084, term195084.getClass(), "nano", 85820000);
        setField(term195079, term195079.getClass(), "time", term195084);
        setField(term194956, term194956.getClass(), "commonModuleSetTime", term195079);
        setField(term194956, term194956.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term194956, term194956.getClass(), "commonSkin", -1);
        setIntField(term194956, term194956.getClass(), "headphoneVolume", 100);
        setBooleanField(term194956, term194956.getClass(), "buttonSeOn", true);
        setIntField(term194956, term194956.getClass(), "buttonSeVolume", 100);
        setIntField(term194956, term194956.getClass(), "sliderSeVolume", 100);
        setIntField(term194956, term194956.getClass(), "buttonSe", -1);
        setIntField(term194956, term194956.getClass(), "chainSlideSe", -1);
        setIntField(term194956, term194956.getClass(), "slideSe", -1);
        setIntField(term194956, term194956.getClass(), "sliderTouchSe", -1);
        setField(term194956, term194956.getClass(), "sortMode", enum440);
        setIntField(term194956, term194956.getClass(), "nextPvId", -1);
        setField(term194956, term194956.getClass(), "nextDifficulty", enum441);
        setField(term194956, term194956.getClass(), "nextEdition", enum442);
        setBooleanField(term194956, term194956.getClass(), "showInterimRanking", true);
        setBooleanField(term194956, term194956.getClass(), "showClearStatus", true);
        setBooleanField(term194956, term194956.getClass(), "showGreatBorder", true);
        setBooleanField(term194956, term194956.getClass(), "showExcellentBorder", true);
        setBooleanField(term194956, term194956.getClass(), "showRivalBorder", true);
        setBooleanField(term194956, term194956.getClass(), "showRgoSetting", true);
        setBooleanField(term194956, term194956.getClass(), "contestNowPlayingEnable", true);
        setIntField(term194956, term194956.getClass(), "contestNowPlayingId", -1);
        setIntField(term194956, term194956.getClass(), "contestNowPlayingValue", -1);
        setField(term194956, term194956.getClass(), "contestNowPlayingResultRank", enum443);
        setField(term194956, term194956.getClass(), "contestNowPlayingSpecifier", "");
        setField(term194956, term194956.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term194956, term194956.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term194956, term194956.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term194956, term194956.getClass(), "rivalPdId", -1);
        setField(term194954, term194954.getClass(), "pdId", term194956);
        setIntField(term194954, term194954.getClass(), "pvId", 1644949396);
        setField(term194954, term194954.getClass(), "difficulty", enum444);
        setField(term194954, term194954.getClass(), "edition", enum442);
        setIntField(term194954, term194954.getClass(), "scriptVer", -2017073245);
        setIntField(term194954, term194954.getClass(), "score", 522440332);
        setField(term194954, term194954.getClass(), "challengeKind", enum445);
        setIntField(term194954, term194954.getClass(), "challengeResult", 1516598327);
        setField(term194954, term194954.getClass(), "clearResult", enum446);
        setIntField(term194954, term194954.getClass(), "vp", 82353584);
        setIntField(term194954, term194954.getClass(), "coolCount", -758778797);
        setIntField(term194954, term194954.getClass(), "coolPercent", 765680355);
        setIntField(term194954, term194954.getClass(), "fineCount", -1012090049);
        setIntField(term194954, term194954.getClass(), "finePercent", -2025214553);
        setIntField(term194954, term194954.getClass(), "safeCount", -154750730);
        setIntField(term194954, term194954.getClass(), "safePercent", -2047179134);
        setIntField(term194954, term194954.getClass(), "sadCount", 44908093);
        setIntField(term194954, term194954.getClass(), "sadPercent", 887198203);
        setIntField(term194954, term194954.getClass(), "wrongCount", 12581312);
        setIntField(term194954, term194954.getClass(), "wrongPercent", 2087383644);
        setIntField(term194954, term194954.getClass(), "maxCombo", 405527523);
        setIntField(term194954, term194954.getClass(), "chanceTime", -1123526433);
        setIntField(term194954, term194954.getClass(), "holdScore", 910269225);
        setIntField(term194954, term194954.getClass(), "attainPoint", -298852874);
        setIntField(term194954, term194954.getClass(), "skinId", 1094297953);
        setIntField(term194954, term194954.getClass(), "buttonSe", -329141819);
        setIntField(term194954, term194954.getClass(), "buttonSeVol", -963204620);
        setIntField(term194954, term194954.getClass(), "sliderSe", 172898580);
        setIntField(term194954, term194954.getClass(), "ChainSlideSe", -777833461);
        setIntField(term194954, term194954.getClass(), "SliderTouchSe", 1583691829);
        setField(term194954, term194954.getClass(), "modules", "XylxrMBraH");
        setIntField(term194954, term194954.getClass(), "stageCompletion", -1468541076);
        setIntField(term194954, term194954.getClass(), "slideScore", -1796760393);
        setIntField(term194954, term194954.getClass(), "isVocalChange", -2099267271);
        setField(term194954, term194954.getClass(), "customizeItems", "pORebkoRdD");
        setField(term194954, term194954.getClass(), "rhythmGameOptions", "mXGCWJDOqA");
        setIntField(term194954, term194954.getClass(), "screenShotCount", -1);
        setIntField(term195664, term195664.getClass(), "year", 2027);
        setShortField(term195664, term195664.getClass(), "month", (short) 11);
        setShortField(term195664, term195664.getClass(), "day", (short) 8);
        setField(term195663, term195663.getClass(), "date", term195664);
        setByteField(term195668, term195668.getClass(), "hour", (byte) 11);
        setByteField(term195668, term195668.getClass(), "minute", (byte) 59);
        setByteField(term195668, term195668.getClass(), "second", (byte) 14);
        setIntField(term195668, term195668.getClass(), "nano", 322375591);
        setField(term195663, term195663.getClass(), "time", term195668);
        setField(term194954, term194954.getClass(), "dateTime", term195663);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDateTime", argTypes, term194954, args);
    }

};


