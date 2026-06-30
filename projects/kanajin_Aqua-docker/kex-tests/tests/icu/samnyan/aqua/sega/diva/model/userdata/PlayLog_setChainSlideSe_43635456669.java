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

public class PlayLog_setChainSlideSe_43635456669 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term302583;
     Object term303296;

    public PlayLog_setChainSlideSe_43635456669() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term303305 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term303304 = ((Class) term303305).getDeclaredField((String) "MISS");
        ((Field) term303304).setAccessible(true);
        Object enum691 = ((Field) term303304).get((Object) null);
        Class<? extends Object> term303682 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term303681 = ((Class) term303682).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term303681).setAccessible(true);
        Object enum692 = ((Field) term303681).get((Object) null);
        Class<? extends Object> term303965 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term303964 = ((Class) term303965).getDeclaredField((String) "NORMAL");
        ((Field) term303964).setAccessible(true);
        Object enum693 = ((Field) term303964).get((Object) null);
        Class<? extends Object> term304240 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term304239 = ((Class) term304240).getDeclaredField((String) "ORIGINAL");
        ((Field) term304239).setAccessible(true);
        Object enum694 = ((Field) term304239).get((Object) null);
        Class<? extends Object> term304506 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term304505 = ((Class) term304506).getDeclaredField((String) "NONE");
        ((Field) term304505).setAccessible(true);
        Object enum695 = ((Field) term304505).get((Object) null);
        Class<? extends Object> term305147 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term305146 = ((Class) term305147).getDeclaredField((String) "EASY");
        ((Field) term305146).setAccessible(true);
        Object enum696 = ((Field) term305146).get((Object) null);
        Class<? extends Object> term305416 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term305415 = ((Class) term305416).getDeclaredField((String) "PERFECT");
        ((Field) term305415).setAccessible(true);
        Object enum697 = ((Field) term305415).get((Object) null);
        Class<? extends Object> term305709 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term305708 = ((Class) term305709).getDeclaredField((String) "GREAT");
        ((Field) term305708).setAccessible(true);
        Object enum698 = ((Field) term305708).get((Object) null);
        term302583 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        Object term302585 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term302708 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term302709 = newInstance(Class.forName("java.time.LocalDate"));
        Object term302713 = newInstance(Class.forName("java.time.LocalTime"));
        Object term303286 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term303287 = newInstance(Class.forName("java.time.LocalDate"));
        Object term303291 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term302583, term302583.getClass(), "id", -8010214112439224349L);
        setLongField(term302585, term302585.getClass(), "id", -6673920710396545553L);
        setIntField(term302585, term302585.getClass(), "pdId", -694297070);
        setField(term302585, term302585.getClass(), "playerName", "xxx");
        setIntField(term302585, term302585.getClass(), "vocaloidPoints", 300);
        setIntField(term302585, term302585.getClass(), "level", 1);
        setIntField(term302585, term302585.getClass(), "levelExp", 786551253);
        setField(term302585, term302585.getClass(), "levelTitle", "xxx");
        setIntField(term302585, term302585.getClass(), "plateId", -1);
        setIntField(term302585, term302585.getClass(), "plateEffectId", -1);
        setField(term302585, term302585.getClass(), "passwordStatus", enum691);
        setField(term302585, term302585.getClass(), "password", "**********");
        setBooleanField(term302585, term302585.getClass(), "preferPerPvModule", true);
        setBooleanField(term302585, term302585.getClass(), "preferCommonModule", false);
        setBooleanField(term302585, term302585.getClass(), "usePerPvSkin", false);
        setBooleanField(term302585, term302585.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term302585, term302585.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term302585, term302585.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term302585, term302585.getClass(), "usePerPvTouchSliderSe", true);
        setField(term302585, term302585.getClass(), "commonModule", "-999,-999,-999");
        setField(term302585, term302585.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term302709, term302709.getClass(), "year", 2026);
        setShortField(term302709, term302709.getClass(), "month", (short) 6);
        setShortField(term302709, term302709.getClass(), "day", (short) 29);
        setField(term302708, term302708.getClass(), "date", term302709);
        setByteField(term302713, term302713.getClass(), "hour", (byte) 4);
        setByteField(term302713, term302713.getClass(), "minute", (byte) 27);
        setByteField(term302713, term302713.getClass(), "second", (byte) 41);
        setIntField(term302713, term302713.getClass(), "nano", 214980000);
        setField(term302708, term302708.getClass(), "time", term302713);
        setField(term302585, term302585.getClass(), "commonModuleSetTime", term302708);
        setField(term302585, term302585.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term302585, term302585.getClass(), "commonSkin", -1);
        setIntField(term302585, term302585.getClass(), "headphoneVolume", 100);
        setBooleanField(term302585, term302585.getClass(), "buttonSeOn", true);
        setIntField(term302585, term302585.getClass(), "buttonSeVolume", 100);
        setIntField(term302585, term302585.getClass(), "sliderSeVolume", 100);
        setIntField(term302585, term302585.getClass(), "buttonSe", -1);
        setIntField(term302585, term302585.getClass(), "chainSlideSe", -1);
        setIntField(term302585, term302585.getClass(), "slideSe", -1);
        setIntField(term302585, term302585.getClass(), "sliderTouchSe", -1);
        setField(term302585, term302585.getClass(), "sortMode", enum692);
        setIntField(term302585, term302585.getClass(), "nextPvId", -1);
        setField(term302585, term302585.getClass(), "nextDifficulty", enum693);
        setField(term302585, term302585.getClass(), "nextEdition", enum694);
        setBooleanField(term302585, term302585.getClass(), "showInterimRanking", true);
        setBooleanField(term302585, term302585.getClass(), "showClearStatus", true);
        setBooleanField(term302585, term302585.getClass(), "showGreatBorder", true);
        setBooleanField(term302585, term302585.getClass(), "showExcellentBorder", true);
        setBooleanField(term302585, term302585.getClass(), "showRivalBorder", true);
        setBooleanField(term302585, term302585.getClass(), "showRgoSetting", true);
        setBooleanField(term302585, term302585.getClass(), "contestNowPlayingEnable", true);
        setIntField(term302585, term302585.getClass(), "contestNowPlayingId", -1);
        setIntField(term302585, term302585.getClass(), "contestNowPlayingValue", -1);
        setField(term302585, term302585.getClass(), "contestNowPlayingResultRank", enum695);
        setField(term302585, term302585.getClass(), "contestNowPlayingSpecifier", "");
        setField(term302585, term302585.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term302585, term302585.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term302585, term302585.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term302585, term302585.getClass(), "rivalPdId", -1);
        setField(term302583, term302583.getClass(), "pdId", term302585);
        setIntField(term302583, term302583.getClass(), "pvId", -104779523);
        setField(term302583, term302583.getClass(), "difficulty", enum696);
        setField(term302583, term302583.getClass(), "edition", enum694);
        setIntField(term302583, term302583.getClass(), "scriptVer", 749289511);
        setIntField(term302583, term302583.getClass(), "score", -414437174);
        setField(term302583, term302583.getClass(), "challengeKind", enum697);
        setIntField(term302583, term302583.getClass(), "challengeResult", -860227615);
        setField(term302583, term302583.getClass(), "clearResult", enum698);
        setIntField(term302583, term302583.getClass(), "vp", -1696192372);
        setIntField(term302583, term302583.getClass(), "coolCount", 1239525687);
        setIntField(term302583, term302583.getClass(), "coolPercent", 1496590861);
        setIntField(term302583, term302583.getClass(), "fineCount", 1046957508);
        setIntField(term302583, term302583.getClass(), "finePercent", -553500478);
        setIntField(term302583, term302583.getClass(), "safeCount", 841910530);
        setIntField(term302583, term302583.getClass(), "safePercent", -1415371559);
        setIntField(term302583, term302583.getClass(), "sadCount", -2083858949);
        setIntField(term302583, term302583.getClass(), "sadPercent", -1878319299);
        setIntField(term302583, term302583.getClass(), "wrongCount", -690862846);
        setIntField(term302583, term302583.getClass(), "wrongPercent", 805027262);
        setIntField(term302583, term302583.getClass(), "maxCombo", 717389178);
        setIntField(term302583, term302583.getClass(), "chanceTime", -1265226052);
        setIntField(term302583, term302583.getClass(), "holdScore", 1970023149);
        setIntField(term302583, term302583.getClass(), "attainPoint", -336351735);
        setIntField(term302583, term302583.getClass(), "skinId", 1938932230);
        setIntField(term302583, term302583.getClass(), "buttonSe", 1128720609);
        setIntField(term302583, term302583.getClass(), "buttonSeVol", 216265002);
        setIntField(term302583, term302583.getClass(), "sliderSe", -97405660);
        setIntField(term302583, term302583.getClass(), "ChainSlideSe", 872278468);
        setIntField(term302583, term302583.getClass(), "SliderTouchSe", -1003390920);
        setField(term302583, term302583.getClass(), "modules", "AZdLeSugwv");
        setIntField(term302583, term302583.getClass(), "stageCompletion", -2052568448);
        setIntField(term302583, term302583.getClass(), "slideScore", 664155196);
        setIntField(term302583, term302583.getClass(), "isVocalChange", -1103257588);
        setField(term302583, term302583.getClass(), "customizeItems", "RMsXuyzKJV");
        setField(term302583, term302583.getClass(), "rhythmGameOptions", "FwPbDZcHmB");
        setIntField(term302583, term302583.getClass(), "screenShotCount", -1);
        setIntField(term303287, term303287.getClass(), "year", 2026);
        setShortField(term303287, term303287.getClass(), "month", (short) 10);
        setShortField(term303287, term303287.getClass(), "day", (short) 31);
        setField(term303286, term303286.getClass(), "date", term303287);
        setByteField(term303291, term303291.getClass(), "hour", (byte) 17);
        setByteField(term303291, term303291.getClass(), "minute", (byte) 6);
        setByteField(term303291, term303291.getClass(), "second", (byte) 30);
        setIntField(term303291, term303291.getClass(), "nano", 785931660);
        setField(term303286, term303286.getClass(), "time", term303291);
        setField(term302583, term302583.getClass(), "dateTime", term303286);
        term303296 = new Integer(1463219831);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term303296;
        callMethod(klass, "setChainSlideSe", argTypes, term302583, args);
    }

};


