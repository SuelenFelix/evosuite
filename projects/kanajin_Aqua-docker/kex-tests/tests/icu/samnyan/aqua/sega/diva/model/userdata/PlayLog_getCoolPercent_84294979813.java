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

public class PlayLog_getCoolPercent_84294979813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101536;

    public PlayLog_getCoolPercent_84294979813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term102273 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term102272 = ((Class) term102273).getDeclaredField((String) "MISS");
        ((Field) term102272).setAccessible(true);
        Object enum217 = ((Field) term102272).get((Object) null);
        Class<? extends Object> term102650 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term102649 = ((Class) term102650).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term102649).setAccessible(true);
        Object enum218 = ((Field) term102649).get((Object) null);
        Class<? extends Object> term102933 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term102932 = ((Class) term102933).getDeclaredField((String) "NORMAL");
        ((Field) term102932).setAccessible(true);
        Object enum219 = ((Field) term102932).get((Object) null);
        Class<? extends Object> term103208 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term103207 = ((Class) term103208).getDeclaredField((String) "ORIGINAL");
        ((Field) term103207).setAccessible(true);
        Object enum220 = ((Field) term103207).get((Object) null);
        Class<? extends Object> term103474 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term103473 = ((Class) term103474).getDeclaredField((String) "NONE");
        ((Field) term103473).setAccessible(true);
        Object enum221 = ((Field) term103473).get((Object) null);
        Class<? extends Object> term104115 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term104114 = ((Class) term104115).getDeclaredField((String) "UNDEFINED");
        ((Field) term104114).setAccessible(true);
        Object enum222 = ((Field) term104114).get((Object) null);
        Class<? extends Object> term104399 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term104398 = ((Class) term104399).getDeclaredField((String) "EXTRA");
        ((Field) term104398).setAccessible(true);
        Object enum223 = ((Field) term104398).get((Object) null);
        Class<? extends Object> term104656 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term104655 = ((Class) term104656).getDeclaredField((String) "EXCELLENT");
        ((Field) term104655).setAccessible(true);
        Object enum224 = ((Field) term104655).get((Object) null);
        Class<? extends Object> term104955 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term104954 = ((Class) term104955).getDeclaredField((String) "GREAT");
        ((Field) term104954).setAccessible(true);
        Object enum225 = ((Field) term104954).get((Object) null);
        term101536 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        Object term101538 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term101661 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term101662 = newInstance(Class.forName("java.time.LocalDate"));
        Object term101666 = newInstance(Class.forName("java.time.LocalTime"));
        Object term102256 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term102257 = newInstance(Class.forName("java.time.LocalDate"));
        Object term102261 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term101536, term101536.getClass(), "id", -5248475803419977214L);
        setLongField(term101538, term101538.getClass(), "id", -6723783499250797216L);
        setIntField(term101538, term101538.getClass(), "pdId", 723812297);
        setField(term101538, term101538.getClass(), "playerName", "xxx");
        setIntField(term101538, term101538.getClass(), "vocaloidPoints", 300);
        setIntField(term101538, term101538.getClass(), "level", 1);
        setIntField(term101538, term101538.getClass(), "levelExp", 1639448749);
        setField(term101538, term101538.getClass(), "levelTitle", "xxx");
        setIntField(term101538, term101538.getClass(), "plateId", -1);
        setIntField(term101538, term101538.getClass(), "plateEffectId", -1);
        setField(term101538, term101538.getClass(), "passwordStatus", enum217);
        setField(term101538, term101538.getClass(), "password", "**********");
        setBooleanField(term101538, term101538.getClass(), "preferPerPvModule", true);
        setBooleanField(term101538, term101538.getClass(), "preferCommonModule", false);
        setBooleanField(term101538, term101538.getClass(), "usePerPvSkin", false);
        setBooleanField(term101538, term101538.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term101538, term101538.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term101538, term101538.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term101538, term101538.getClass(), "usePerPvTouchSliderSe", false);
        setField(term101538, term101538.getClass(), "commonModule", "-999,-999,-999");
        setField(term101538, term101538.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term101662, term101662.getClass(), "year", 2026);
        setShortField(term101662, term101662.getClass(), "month", (short) 8);
        setShortField(term101662, term101662.getClass(), "day", (short) 12);
        setField(term101661, term101661.getClass(), "date", term101662);
        setByteField(term101666, term101666.getClass(), "hour", (byte) 2);
        setByteField(term101666, term101666.getClass(), "minute", (byte) 2);
        setByteField(term101666, term101666.getClass(), "second", (byte) 43);
        setIntField(term101666, term101666.getClass(), "nano", 359132000);
        setField(term101661, term101661.getClass(), "time", term101666);
        setField(term101538, term101538.getClass(), "commonModuleSetTime", term101661);
        setField(term101538, term101538.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term101538, term101538.getClass(), "commonSkin", -1);
        setIntField(term101538, term101538.getClass(), "headphoneVolume", 100);
        setBooleanField(term101538, term101538.getClass(), "buttonSeOn", true);
        setIntField(term101538, term101538.getClass(), "buttonSeVolume", 100);
        setIntField(term101538, term101538.getClass(), "sliderSeVolume", 100);
        setIntField(term101538, term101538.getClass(), "buttonSe", -1);
        setIntField(term101538, term101538.getClass(), "chainSlideSe", -1);
        setIntField(term101538, term101538.getClass(), "slideSe", -1);
        setIntField(term101538, term101538.getClass(), "sliderTouchSe", -1);
        setField(term101538, term101538.getClass(), "sortMode", enum218);
        setIntField(term101538, term101538.getClass(), "nextPvId", -1);
        setField(term101538, term101538.getClass(), "nextDifficulty", enum219);
        setField(term101538, term101538.getClass(), "nextEdition", enum220);
        setBooleanField(term101538, term101538.getClass(), "showInterimRanking", true);
        setBooleanField(term101538, term101538.getClass(), "showClearStatus", true);
        setBooleanField(term101538, term101538.getClass(), "showGreatBorder", true);
        setBooleanField(term101538, term101538.getClass(), "showExcellentBorder", true);
        setBooleanField(term101538, term101538.getClass(), "showRivalBorder", true);
        setBooleanField(term101538, term101538.getClass(), "showRgoSetting", true);
        setBooleanField(term101538, term101538.getClass(), "contestNowPlayingEnable", true);
        setIntField(term101538, term101538.getClass(), "contestNowPlayingId", -1);
        setIntField(term101538, term101538.getClass(), "contestNowPlayingValue", -1);
        setField(term101538, term101538.getClass(), "contestNowPlayingResultRank", enum221);
        setField(term101538, term101538.getClass(), "contestNowPlayingSpecifier", "");
        setField(term101538, term101538.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term101538, term101538.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term101538, term101538.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term101538, term101538.getClass(), "rivalPdId", -1);
        setField(term101536, term101536.getClass(), "pdId", term101538);
        setIntField(term101536, term101536.getClass(), "pvId", 873659088);
        setField(term101536, term101536.getClass(), "difficulty", enum222);
        setField(term101536, term101536.getClass(), "edition", enum223);
        setIntField(term101536, term101536.getClass(), "scriptVer", -975748721);
        setIntField(term101536, term101536.getClass(), "score", 433248783);
        setField(term101536, term101536.getClass(), "challengeKind", enum224);
        setIntField(term101536, term101536.getClass(), "challengeResult", -507944154);
        setField(term101536, term101536.getClass(), "clearResult", enum225);
        setIntField(term101536, term101536.getClass(), "vp", -1736183862);
        setIntField(term101536, term101536.getClass(), "coolCount", 897010381);
        setIntField(term101536, term101536.getClass(), "coolPercent", -15712667);
        setIntField(term101536, term101536.getClass(), "fineCount", 1964967720);
        setIntField(term101536, term101536.getClass(), "finePercent", 1351900243);
        setIntField(term101536, term101536.getClass(), "safeCount", -330897705);
        setIntField(term101536, term101536.getClass(), "safePercent", 1065595802);
        setIntField(term101536, term101536.getClass(), "sadCount", 21031843);
        setIntField(term101536, term101536.getClass(), "sadPercent", -380787857);
        setIntField(term101536, term101536.getClass(), "wrongCount", 319853052);
        setIntField(term101536, term101536.getClass(), "wrongPercent", -1097563716);
        setIntField(term101536, term101536.getClass(), "maxCombo", 1572907769);
        setIntField(term101536, term101536.getClass(), "chanceTime", 1608016787);
        setIntField(term101536, term101536.getClass(), "holdScore", -516303035);
        setIntField(term101536, term101536.getClass(), "attainPoint", -2143043890);
        setIntField(term101536, term101536.getClass(), "skinId", -2138825831);
        setIntField(term101536, term101536.getClass(), "buttonSe", 1454781562);
        setIntField(term101536, term101536.getClass(), "buttonSeVol", -27944011);
        setIntField(term101536, term101536.getClass(), "sliderSe", -20614472);
        setIntField(term101536, term101536.getClass(), "ChainSlideSe", 1126618861);
        setIntField(term101536, term101536.getClass(), "SliderTouchSe", 947449400);
        setField(term101536, term101536.getClass(), "modules", "aKnKipADSo");
        setIntField(term101536, term101536.getClass(), "stageCompletion", -763799087);
        setIntField(term101536, term101536.getClass(), "slideScore", 1207142014);
        setIntField(term101536, term101536.getClass(), "isVocalChange", -876426634);
        setField(term101536, term101536.getClass(), "customizeItems", "wSQxaModmm");
        setField(term101536, term101536.getClass(), "rhythmGameOptions", "UlajhuVLaP");
        setIntField(term101536, term101536.getClass(), "screenShotCount", -1);
        setIntField(term102257, term102257.getClass(), "year", 2017);
        setShortField(term102257, term102257.getClass(), "month", (short) 6);
        setShortField(term102257, term102257.getClass(), "day", (short) 8);
        setField(term102256, term102256.getClass(), "date", term102257);
        setByteField(term102261, term102261.getClass(), "hour", (byte) 0);
        setByteField(term102261, term102261.getClass(), "minute", (byte) 18);
        setByteField(term102261, term102261.getClass(), "second", (byte) 55);
        setIntField(term102261, term102261.getClass(), "nano", 680586717);
        setField(term102256, term102256.getClass(), "time", term102261);
        setField(term101536, term101536.getClass(), "dateTime", term102256);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCoolPercent", argTypes, term101536, args);
    }

};


