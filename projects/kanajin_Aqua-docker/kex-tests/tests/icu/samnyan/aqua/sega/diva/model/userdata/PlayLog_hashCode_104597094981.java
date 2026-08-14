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

public class PlayLog_hashCode_104597094981 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term344031;

    public PlayLog_hashCode_104597094981() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term344766 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term344765 = ((Class) term344766).getDeclaredField((String) "MISS");
        ((Field) term344765).setAccessible(true);
        Object enum787 = ((Field) term344765).get((Object) null);
        Class<? extends Object> term345143 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term345142 = ((Class) term345143).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term345142).setAccessible(true);
        Object enum788 = ((Field) term345142).get((Object) null);
        Class<? extends Object> term345426 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term345425 = ((Class) term345426).getDeclaredField((String) "NORMAL");
        ((Field) term345425).setAccessible(true);
        Object enum789 = ((Field) term345425).get((Object) null);
        Class<? extends Object> term345701 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term345700 = ((Class) term345701).getDeclaredField((String) "ORIGINAL");
        ((Field) term345700).setAccessible(true);
        Object enum790 = ((Field) term345700).get((Object) null);
        Class<? extends Object> term345967 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term345966 = ((Class) term345967).getDeclaredField((String) "NONE");
        ((Field) term345966).setAccessible(true);
        Object enum791 = ((Field) term345966).get((Object) null);
        Class<? extends Object> term346608 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term346607 = ((Class) term346608).getDeclaredField((String) "EXTREME");
        ((Field) term346607).setAccessible(true);
        Object enum792 = ((Field) term346607).get((Object) null);
        Class<? extends Object> term346886 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term346885 = ((Class) term346886).getDeclaredField((String) "EXTRA");
        ((Field) term346885).setAccessible(true);
        Object enum793 = ((Field) term346885).get((Object) null);
        Class<? extends Object> term347143 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term347142 = ((Class) term347143).getDeclaredField((String) "EXCELLENT");
        ((Field) term347142).setAccessible(true);
        Object enum794 = ((Field) term347142).get((Object) null);
        Class<? extends Object> term347442 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term347441 = ((Class) term347442).getDeclaredField((String) "GREAT");
        ((Field) term347441).setAccessible(true);
        Object enum795 = ((Field) term347441).get((Object) null);
        term344031 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        Object term344033 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term344156 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term344157 = newInstance(Class.forName("java.time.LocalDate"));
        Object term344161 = newInstance(Class.forName("java.time.LocalTime"));
        Object term344749 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term344750 = newInstance(Class.forName("java.time.LocalDate"));
        Object term344754 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term344031, term344031.getClass(), "id", 3288941170644426558L);
        setLongField(term344033, term344033.getClass(), "id", -8338004844694486146L);
        setIntField(term344033, term344033.getClass(), "pdId", -1539896141);
        setField(term344033, term344033.getClass(), "playerName", "xxx");
        setIntField(term344033, term344033.getClass(), "vocaloidPoints", 300);
        setIntField(term344033, term344033.getClass(), "level", 1);
        setIntField(term344033, term344033.getClass(), "levelExp", 798480099);
        setField(term344033, term344033.getClass(), "levelTitle", "xxx");
        setIntField(term344033, term344033.getClass(), "plateId", -1);
        setIntField(term344033, term344033.getClass(), "plateEffectId", -1);
        setField(term344033, term344033.getClass(), "passwordStatus", enum787);
        setField(term344033, term344033.getClass(), "password", "**********");
        setBooleanField(term344033, term344033.getClass(), "preferPerPvModule", true);
        setBooleanField(term344033, term344033.getClass(), "preferCommonModule", false);
        setBooleanField(term344033, term344033.getClass(), "usePerPvSkin", true);
        setBooleanField(term344033, term344033.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term344033, term344033.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term344033, term344033.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term344033, term344033.getClass(), "usePerPvTouchSliderSe", false);
        setField(term344033, term344033.getClass(), "commonModule", "-999,-999,-999");
        setField(term344033, term344033.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term344157, term344157.getClass(), "year", 2026);
        setShortField(term344157, term344157.getClass(), "month", (short) 8);
        setShortField(term344157, term344157.getClass(), "day", (short) 12);
        setField(term344156, term344156.getClass(), "date", term344157);
        setByteField(term344161, term344161.getClass(), "hour", (byte) 2);
        setByteField(term344161, term344161.getClass(), "minute", (byte) 3);
        setByteField(term344161, term344161.getClass(), "second", (byte) 0);
        setIntField(term344161, term344161.getClass(), "nano", 488650000);
        setField(term344156, term344156.getClass(), "time", term344161);
        setField(term344033, term344033.getClass(), "commonModuleSetTime", term344156);
        setField(term344033, term344033.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term344033, term344033.getClass(), "commonSkin", -1);
        setIntField(term344033, term344033.getClass(), "headphoneVolume", 100);
        setBooleanField(term344033, term344033.getClass(), "buttonSeOn", true);
        setIntField(term344033, term344033.getClass(), "buttonSeVolume", 100);
        setIntField(term344033, term344033.getClass(), "sliderSeVolume", 100);
        setIntField(term344033, term344033.getClass(), "buttonSe", -1);
        setIntField(term344033, term344033.getClass(), "chainSlideSe", -1);
        setIntField(term344033, term344033.getClass(), "slideSe", -1);
        setIntField(term344033, term344033.getClass(), "sliderTouchSe", -1);
        setField(term344033, term344033.getClass(), "sortMode", enum788);
        setIntField(term344033, term344033.getClass(), "nextPvId", -1);
        setField(term344033, term344033.getClass(), "nextDifficulty", enum789);
        setField(term344033, term344033.getClass(), "nextEdition", enum790);
        setBooleanField(term344033, term344033.getClass(), "showInterimRanking", true);
        setBooleanField(term344033, term344033.getClass(), "showClearStatus", true);
        setBooleanField(term344033, term344033.getClass(), "showGreatBorder", true);
        setBooleanField(term344033, term344033.getClass(), "showExcellentBorder", true);
        setBooleanField(term344033, term344033.getClass(), "showRivalBorder", true);
        setBooleanField(term344033, term344033.getClass(), "showRgoSetting", true);
        setBooleanField(term344033, term344033.getClass(), "contestNowPlayingEnable", false);
        setIntField(term344033, term344033.getClass(), "contestNowPlayingId", -1);
        setIntField(term344033, term344033.getClass(), "contestNowPlayingValue", -1);
        setField(term344033, term344033.getClass(), "contestNowPlayingResultRank", enum791);
        setField(term344033, term344033.getClass(), "contestNowPlayingSpecifier", "");
        setField(term344033, term344033.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term344033, term344033.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term344033, term344033.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term344033, term344033.getClass(), "rivalPdId", -1);
        setField(term344031, term344031.getClass(), "pdId", term344033);
        setIntField(term344031, term344031.getClass(), "pvId", -1624038595);
        setField(term344031, term344031.getClass(), "difficulty", enum792);
        setField(term344031, term344031.getClass(), "edition", enum793);
        setIntField(term344031, term344031.getClass(), "scriptVer", 1593619323);
        setIntField(term344031, term344031.getClass(), "score", -232601868);
        setField(term344031, term344031.getClass(), "challengeKind", enum794);
        setIntField(term344031, term344031.getClass(), "challengeResult", -1743056588);
        setField(term344031, term344031.getClass(), "clearResult", enum795);
        setIntField(term344031, term344031.getClass(), "vp", 576646846);
        setIntField(term344031, term344031.getClass(), "coolCount", 916507296);
        setIntField(term344031, term344031.getClass(), "coolPercent", 1307887729);
        setIntField(term344031, term344031.getClass(), "fineCount", 1628336669);
        setIntField(term344031, term344031.getClass(), "finePercent", 466807421);
        setIntField(term344031, term344031.getClass(), "safeCount", -407675703);
        setIntField(term344031, term344031.getClass(), "safePercent", -429960516);
        setIntField(term344031, term344031.getClass(), "sadCount", -630727180);
        setIntField(term344031, term344031.getClass(), "sadPercent", -1234361060);
        setIntField(term344031, term344031.getClass(), "wrongCount", -267520884);
        setIntField(term344031, term344031.getClass(), "wrongPercent", 1431716083);
        setIntField(term344031, term344031.getClass(), "maxCombo", 1540004680);
        setIntField(term344031, term344031.getClass(), "chanceTime", -594861500);
        setIntField(term344031, term344031.getClass(), "holdScore", 1731562923);
        setIntField(term344031, term344031.getClass(), "attainPoint", 33467458);
        setIntField(term344031, term344031.getClass(), "skinId", 1729034001);
        setIntField(term344031, term344031.getClass(), "buttonSe", 1094810824);
        setIntField(term344031, term344031.getClass(), "buttonSeVol", -1746471324);
        setIntField(term344031, term344031.getClass(), "sliderSe", 844485803);
        setIntField(term344031, term344031.getClass(), "ChainSlideSe", -1373407191);
        setIntField(term344031, term344031.getClass(), "SliderTouchSe", 1013516042);
        setField(term344031, term344031.getClass(), "modules", "WVRMUmrljA");
        setIntField(term344031, term344031.getClass(), "stageCompletion", 284652039);
        setIntField(term344031, term344031.getClass(), "slideScore", 1163350537);
        setIntField(term344031, term344031.getClass(), "isVocalChange", -855026181);
        setField(term344031, term344031.getClass(), "customizeItems", "NTlKJDDWlk");
        setField(term344031, term344031.getClass(), "rhythmGameOptions", "vOuMEpOQAg");
        setIntField(term344031, term344031.getClass(), "screenShotCount", -1);
        setIntField(term344750, term344750.getClass(), "year", 2020);
        setShortField(term344750, term344750.getClass(), "month", (short) 5);
        setShortField(term344750, term344750.getClass(), "day", (short) 12);
        setField(term344749, term344749.getClass(), "date", term344750);
        setByteField(term344754, term344754.getClass(), "hour", (byte) 0);
        setByteField(term344754, term344754.getClass(), "minute", (byte) 15);
        setByteField(term344754, term344754.getClass(), "second", (byte) 24);
        setIntField(term344754, term344754.getClass(), "nano", 250257744);
        setField(term344749, term344749.getClass(), "time", term344754);
        setField(term344031, term344031.getClass(), "dateTime", term344749);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term344031, args);
    }

};


