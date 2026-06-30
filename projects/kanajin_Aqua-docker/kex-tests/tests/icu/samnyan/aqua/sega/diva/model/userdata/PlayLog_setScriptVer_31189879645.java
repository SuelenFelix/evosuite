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

public class PlayLog_setScriptVer_31189879645 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term217458;
     Object term218186;

    public PlayLog_setScriptVer_31189879645() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term218195 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term218194 = ((Class) term218195).getDeclaredField((String) "MISS");
        ((Field) term218194).setAccessible(true);
        Object enum490 = ((Field) term218194).get((Object) null);
        Class<? extends Object> term218572 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term218571 = ((Class) term218572).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term218571).setAccessible(true);
        Object enum491 = ((Field) term218571).get((Object) null);
        Class<? extends Object> term218855 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term218854 = ((Class) term218855).getDeclaredField((String) "NORMAL");
        ((Field) term218854).setAccessible(true);
        Object enum492 = ((Field) term218854).get((Object) null);
        Class<? extends Object> term219130 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term219129 = ((Class) term219130).getDeclaredField((String) "ORIGINAL");
        ((Field) term219129).setAccessible(true);
        Object enum493 = ((Field) term219129).get((Object) null);
        Class<? extends Object> term219396 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term219395 = ((Class) term219396).getDeclaredField((String) "NONE");
        ((Field) term219395).setAccessible(true);
        Object enum494 = ((Field) term219395).get((Object) null);
        Class<? extends Object> term220037 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term220036 = ((Class) term220037).getDeclaredField((String) "HARD");
        ((Field) term220036).setAccessible(true);
        Object enum495 = ((Field) term220036).get((Object) null);
        Class<? extends Object> term220306 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term220305 = ((Class) term220306).getDeclaredField((String) "EXTRA");
        ((Field) term220305).setAccessible(true);
        Object enum496 = ((Field) term220305).get((Object) null);
        Class<? extends Object> term220563 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term220562 = ((Class) term220563).getDeclaredField((String) "COMPLETED");
        ((Field) term220562).setAccessible(true);
        Object enum497 = ((Field) term220562).get((Object) null);
        Class<? extends Object> term220862 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term220861 = ((Class) term220862).getDeclaredField((String) "STANDARD");
        ((Field) term220861).setAccessible(true);
        Object enum498 = ((Field) term220861).get((Object) null);
        term217458 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        Object term217460 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term217583 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term217584 = newInstance(Class.forName("java.time.LocalDate"));
        Object term217588 = newInstance(Class.forName("java.time.LocalTime"));
        Object term218176 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term218177 = newInstance(Class.forName("java.time.LocalDate"));
        Object term218181 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term217458, term217458.getClass(), "id", -1616722610139554082L);
        setLongField(term217460, term217460.getClass(), "id", 7495904023107549024L);
        setIntField(term217460, term217460.getClass(), "pdId", 155423433);
        setField(term217460, term217460.getClass(), "playerName", "xxx");
        setIntField(term217460, term217460.getClass(), "vocaloidPoints", 300);
        setIntField(term217460, term217460.getClass(), "level", 1);
        setIntField(term217460, term217460.getClass(), "levelExp", -815471632);
        setField(term217460, term217460.getClass(), "levelTitle", "xxx");
        setIntField(term217460, term217460.getClass(), "plateId", -1);
        setIntField(term217460, term217460.getClass(), "plateEffectId", -1);
        setField(term217460, term217460.getClass(), "passwordStatus", enum490);
        setField(term217460, term217460.getClass(), "password", "**********");
        setBooleanField(term217460, term217460.getClass(), "preferPerPvModule", true);
        setBooleanField(term217460, term217460.getClass(), "preferCommonModule", true);
        setBooleanField(term217460, term217460.getClass(), "usePerPvSkin", false);
        setBooleanField(term217460, term217460.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term217460, term217460.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term217460, term217460.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term217460, term217460.getClass(), "usePerPvTouchSliderSe", false);
        setField(term217460, term217460.getClass(), "commonModule", "-999,-999,-999");
        setField(term217460, term217460.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term217584, term217584.getClass(), "year", 2026);
        setShortField(term217584, term217584.getClass(), "month", (short) 6);
        setShortField(term217584, term217584.getClass(), "day", (short) 29);
        setField(term217583, term217583.getClass(), "date", term217584);
        setByteField(term217588, term217588.getClass(), "hour", (byte) 4);
        setByteField(term217588, term217588.getClass(), "minute", (byte) 27);
        setByteField(term217588, term217588.getClass(), "second", (byte) 35);
        setIntField(term217588, term217588.getClass(), "nano", 86069000);
        setField(term217583, term217583.getClass(), "time", term217588);
        setField(term217460, term217460.getClass(), "commonModuleSetTime", term217583);
        setField(term217460, term217460.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term217460, term217460.getClass(), "commonSkin", -1);
        setIntField(term217460, term217460.getClass(), "headphoneVolume", 100);
        setBooleanField(term217460, term217460.getClass(), "buttonSeOn", true);
        setIntField(term217460, term217460.getClass(), "buttonSeVolume", 100);
        setIntField(term217460, term217460.getClass(), "sliderSeVolume", 100);
        setIntField(term217460, term217460.getClass(), "buttonSe", -1);
        setIntField(term217460, term217460.getClass(), "chainSlideSe", -1);
        setIntField(term217460, term217460.getClass(), "slideSe", -1);
        setIntField(term217460, term217460.getClass(), "sliderTouchSe", -1);
        setField(term217460, term217460.getClass(), "sortMode", enum491);
        setIntField(term217460, term217460.getClass(), "nextPvId", -1);
        setField(term217460, term217460.getClass(), "nextDifficulty", enum492);
        setField(term217460, term217460.getClass(), "nextEdition", enum493);
        setBooleanField(term217460, term217460.getClass(), "showInterimRanking", true);
        setBooleanField(term217460, term217460.getClass(), "showClearStatus", true);
        setBooleanField(term217460, term217460.getClass(), "showGreatBorder", true);
        setBooleanField(term217460, term217460.getClass(), "showExcellentBorder", true);
        setBooleanField(term217460, term217460.getClass(), "showRivalBorder", true);
        setBooleanField(term217460, term217460.getClass(), "showRgoSetting", true);
        setBooleanField(term217460, term217460.getClass(), "contestNowPlayingEnable", true);
        setIntField(term217460, term217460.getClass(), "contestNowPlayingId", -1);
        setIntField(term217460, term217460.getClass(), "contestNowPlayingValue", -1);
        setField(term217460, term217460.getClass(), "contestNowPlayingResultRank", enum494);
        setField(term217460, term217460.getClass(), "contestNowPlayingSpecifier", "");
        setField(term217460, term217460.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term217460, term217460.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term217460, term217460.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term217460, term217460.getClass(), "rivalPdId", -1);
        setField(term217458, term217458.getClass(), "pdId", term217460);
        setIntField(term217458, term217458.getClass(), "pvId", -1469668708);
        setField(term217458, term217458.getClass(), "difficulty", enum495);
        setField(term217458, term217458.getClass(), "edition", enum496);
        setIntField(term217458, term217458.getClass(), "scriptVer", 1796950482);
        setIntField(term217458, term217458.getClass(), "score", -945759470);
        setField(term217458, term217458.getClass(), "challengeKind", enum497);
        setIntField(term217458, term217458.getClass(), "challengeResult", 657342039);
        setField(term217458, term217458.getClass(), "clearResult", enum498);
        setIntField(term217458, term217458.getClass(), "vp", 1483999606);
        setIntField(term217458, term217458.getClass(), "coolCount", 1871761182);
        setIntField(term217458, term217458.getClass(), "coolPercent", 233983728);
        setIntField(term217458, term217458.getClass(), "fineCount", -1650132476);
        setIntField(term217458, term217458.getClass(), "finePercent", 1719680265);
        setIntField(term217458, term217458.getClass(), "safeCount", -1890898783);
        setIntField(term217458, term217458.getClass(), "safePercent", 1357632911);
        setIntField(term217458, term217458.getClass(), "sadCount", 1768195761);
        setIntField(term217458, term217458.getClass(), "sadPercent", -1382661134);
        setIntField(term217458, term217458.getClass(), "wrongCount", -1042022818);
        setIntField(term217458, term217458.getClass(), "wrongPercent", 317372051);
        setIntField(term217458, term217458.getClass(), "maxCombo", 892170444);
        setIntField(term217458, term217458.getClass(), "chanceTime", -82417507);
        setIntField(term217458, term217458.getClass(), "holdScore", -511400358);
        setIntField(term217458, term217458.getClass(), "attainPoint", -742178468);
        setIntField(term217458, term217458.getClass(), "skinId", 694989162);
        setIntField(term217458, term217458.getClass(), "buttonSe", -65504209);
        setIntField(term217458, term217458.getClass(), "buttonSeVol", 1745199030);
        setIntField(term217458, term217458.getClass(), "sliderSe", -1440013173);
        setIntField(term217458, term217458.getClass(), "ChainSlideSe", -288126597);
        setIntField(term217458, term217458.getClass(), "SliderTouchSe", -218831961);
        setField(term217458, term217458.getClass(), "modules", "fWKJoSoCwE");
        setIntField(term217458, term217458.getClass(), "stageCompletion", 826765055);
        setIntField(term217458, term217458.getClass(), "slideScore", 1358117317);
        setIntField(term217458, term217458.getClass(), "isVocalChange", 229989439);
        setField(term217458, term217458.getClass(), "customizeItems", "wfaXBpWAUH");
        setField(term217458, term217458.getClass(), "rhythmGameOptions", "VMeAzAHwZj");
        setIntField(term217458, term217458.getClass(), "screenShotCount", -1);
        setIntField(term218177, term218177.getClass(), "year", 2013);
        setShortField(term218177, term218177.getClass(), "month", (short) 5);
        setShortField(term218177, term218177.getClass(), "day", (short) 26);
        setField(term218176, term218176.getClass(), "date", term218177);
        setByteField(term218181, term218181.getClass(), "hour", (byte) 4);
        setByteField(term218181, term218181.getClass(), "minute", (byte) 39);
        setByteField(term218181, term218181.getClass(), "second", (byte) 5);
        setIntField(term218181, term218181.getClass(), "nano", 392869354);
        setField(term218176, term218176.getClass(), "time", term218181);
        setField(term217458, term217458.getClass(), "dateTime", term218176);
        term218186 = new Integer(-1620126913);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term218186;
        callMethod(klass, "setScriptVer", argTypes, term217458, args);
    }

};


