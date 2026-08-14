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

public class PlayLog_setIsVocalChange_155932388974 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term319553;
     Object term320271;

    public PlayLog_setIsVocalChange_155932388974() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term320280 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term320279 = ((Class) term320280).getDeclaredField((String) "MISS");
        ((Field) term320279).setAccessible(true);
        Object enum730 = ((Field) term320279).get((Object) null);
        Class<? extends Object> term320657 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term320656 = ((Class) term320657).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term320656).setAccessible(true);
        Object enum731 = ((Field) term320656).get((Object) null);
        Class<? extends Object> term320940 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term320939 = ((Class) term320940).getDeclaredField((String) "NORMAL");
        ((Field) term320939).setAccessible(true);
        Object enum732 = ((Field) term320939).get((Object) null);
        Class<? extends Object> term321215 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term321214 = ((Class) term321215).getDeclaredField((String) "ORIGINAL");
        ((Field) term321214).setAccessible(true);
        Object enum733 = ((Field) term321214).get((Object) null);
        Class<? extends Object> term321481 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term321480 = ((Class) term321481).getDeclaredField((String) "NONE");
        ((Field) term321480).setAccessible(true);
        Object enum734 = ((Field) term321480).get((Object) null);
        Class<? extends Object> term322122 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term322121 = ((Class) term322122).getDeclaredField((String) "EASY");
        ((Field) term322121).setAccessible(true);
        Object enum735 = ((Field) term322121).get((Object) null);
        Class<? extends Object> term322391 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term322390 = ((Class) term322391).getDeclaredField((String) "EXCELLENT");
        ((Field) term322390).setAccessible(true);
        Object enum736 = ((Field) term322390).get((Object) null);
        Class<? extends Object> term322690 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term322689 = ((Class) term322690).getDeclaredField((String) "STANDARD");
        ((Field) term322689).setAccessible(true);
        Object enum737 = ((Field) term322689).get((Object) null);
        term319553 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        Object term319555 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term319678 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term319679 = newInstance(Class.forName("java.time.LocalDate"));
        Object term319683 = newInstance(Class.forName("java.time.LocalTime"));
        Object term320261 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term320262 = newInstance(Class.forName("java.time.LocalDate"));
        Object term320266 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term319553, term319553.getClass(), "id", 4394651392080968777L);
        setLongField(term319555, term319555.getClass(), "id", -7310273014364148916L);
        setIntField(term319555, term319555.getClass(), "pdId", 1276651382);
        setField(term319555, term319555.getClass(), "playerName", "xxx");
        setIntField(term319555, term319555.getClass(), "vocaloidPoints", 300);
        setIntField(term319555, term319555.getClass(), "level", 1);
        setIntField(term319555, term319555.getClass(), "levelExp", 266716659);
        setField(term319555, term319555.getClass(), "levelTitle", "xxx");
        setIntField(term319555, term319555.getClass(), "plateId", -1);
        setIntField(term319555, term319555.getClass(), "plateEffectId", -1);
        setField(term319555, term319555.getClass(), "passwordStatus", enum730);
        setField(term319555, term319555.getClass(), "password", "**********");
        setBooleanField(term319555, term319555.getClass(), "preferPerPvModule", true);
        setBooleanField(term319555, term319555.getClass(), "preferCommonModule", false);
        setBooleanField(term319555, term319555.getClass(), "usePerPvSkin", false);
        setBooleanField(term319555, term319555.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term319555, term319555.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term319555, term319555.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term319555, term319555.getClass(), "usePerPvTouchSliderSe", false);
        setField(term319555, term319555.getClass(), "commonModule", "-999,-999,-999");
        setField(term319555, term319555.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term319679, term319679.getClass(), "year", 2026);
        setShortField(term319679, term319679.getClass(), "month", (short) 8);
        setShortField(term319679, term319679.getClass(), "day", (short) 12);
        setField(term319678, term319678.getClass(), "date", term319679);
        setByteField(term319683, term319683.getClass(), "hour", (byte) 2);
        setByteField(term319683, term319683.getClass(), "minute", (byte) 2);
        setByteField(term319683, term319683.getClass(), "second", (byte) 58);
        setIntField(term319683, term319683.getClass(), "nano", 757846000);
        setField(term319678, term319678.getClass(), "time", term319683);
        setField(term319555, term319555.getClass(), "commonModuleSetTime", term319678);
        setField(term319555, term319555.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term319555, term319555.getClass(), "commonSkin", -1);
        setIntField(term319555, term319555.getClass(), "headphoneVolume", 100);
        setBooleanField(term319555, term319555.getClass(), "buttonSeOn", true);
        setIntField(term319555, term319555.getClass(), "buttonSeVolume", 100);
        setIntField(term319555, term319555.getClass(), "sliderSeVolume", 100);
        setIntField(term319555, term319555.getClass(), "buttonSe", -1);
        setIntField(term319555, term319555.getClass(), "chainSlideSe", -1);
        setIntField(term319555, term319555.getClass(), "slideSe", -1);
        setIntField(term319555, term319555.getClass(), "sliderTouchSe", -1);
        setField(term319555, term319555.getClass(), "sortMode", enum731);
        setIntField(term319555, term319555.getClass(), "nextPvId", -1);
        setField(term319555, term319555.getClass(), "nextDifficulty", enum732);
        setField(term319555, term319555.getClass(), "nextEdition", enum733);
        setBooleanField(term319555, term319555.getClass(), "showInterimRanking", true);
        setBooleanField(term319555, term319555.getClass(), "showClearStatus", true);
        setBooleanField(term319555, term319555.getClass(), "showGreatBorder", true);
        setBooleanField(term319555, term319555.getClass(), "showExcellentBorder", true);
        setBooleanField(term319555, term319555.getClass(), "showRivalBorder", true);
        setBooleanField(term319555, term319555.getClass(), "showRgoSetting", true);
        setBooleanField(term319555, term319555.getClass(), "contestNowPlayingEnable", true);
        setIntField(term319555, term319555.getClass(), "contestNowPlayingId", -1);
        setIntField(term319555, term319555.getClass(), "contestNowPlayingValue", -1);
        setField(term319555, term319555.getClass(), "contestNowPlayingResultRank", enum734);
        setField(term319555, term319555.getClass(), "contestNowPlayingSpecifier", "");
        setField(term319555, term319555.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term319555, term319555.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term319555, term319555.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term319555, term319555.getClass(), "rivalPdId", -1);
        setField(term319553, term319553.getClass(), "pdId", term319555);
        setIntField(term319553, term319553.getClass(), "pvId", 1249390809);
        setField(term319553, term319553.getClass(), "difficulty", enum735);
        setField(term319553, term319553.getClass(), "edition", enum733);
        setIntField(term319553, term319553.getClass(), "scriptVer", -1069437097);
        setIntField(term319553, term319553.getClass(), "score", 215016257);
        setField(term319553, term319553.getClass(), "challengeKind", enum736);
        setIntField(term319553, term319553.getClass(), "challengeResult", -1967315273);
        setField(term319553, term319553.getClass(), "clearResult", enum737);
        setIntField(term319553, term319553.getClass(), "vp", -1848110874);
        setIntField(term319553, term319553.getClass(), "coolCount", -1988070462);
        setIntField(term319553, term319553.getClass(), "coolPercent", 323423569);
        setIntField(term319553, term319553.getClass(), "fineCount", -274269573);
        setIntField(term319553, term319553.getClass(), "finePercent", 1395520168);
        setIntField(term319553, term319553.getClass(), "safeCount", -524708742);
        setIntField(term319553, term319553.getClass(), "safePercent", -349448118);
        setIntField(term319553, term319553.getClass(), "sadCount", 1938137872);
        setIntField(term319553, term319553.getClass(), "sadPercent", 1767604467);
        setIntField(term319553, term319553.getClass(), "wrongCount", 1997859160);
        setIntField(term319553, term319553.getClass(), "wrongPercent", 1565529799);
        setIntField(term319553, term319553.getClass(), "maxCombo", -1144608643);
        setIntField(term319553, term319553.getClass(), "chanceTime", -2020428308);
        setIntField(term319553, term319553.getClass(), "holdScore", -226298436);
        setIntField(term319553, term319553.getClass(), "attainPoint", -1570350431);
        setIntField(term319553, term319553.getClass(), "skinId", -1378803474);
        setIntField(term319553, term319553.getClass(), "buttonSe", 699225584);
        setIntField(term319553, term319553.getClass(), "buttonSeVol", -577432675);
        setIntField(term319553, term319553.getClass(), "sliderSe", -953072528);
        setIntField(term319553, term319553.getClass(), "ChainSlideSe", 2011046892);
        setIntField(term319553, term319553.getClass(), "SliderTouchSe", 466007219);
        setField(term319553, term319553.getClass(), "modules", "wKWbJssZuG");
        setIntField(term319553, term319553.getClass(), "stageCompletion", -2142979104);
        setIntField(term319553, term319553.getClass(), "slideScore", -1983330479);
        setIntField(term319553, term319553.getClass(), "isVocalChange", 1929952462);
        setField(term319553, term319553.getClass(), "customizeItems", "NzBMMhkhpT");
        setField(term319553, term319553.getClass(), "rhythmGameOptions", "qCpEbQDHdF");
        setIntField(term319553, term319553.getClass(), "screenShotCount", -1);
        setIntField(term320262, term320262.getClass(), "year", 2011);
        setShortField(term320262, term320262.getClass(), "month", (short) 8);
        setShortField(term320262, term320262.getClass(), "day", (short) 1);
        setField(term320261, term320261.getClass(), "date", term320262);
        setByteField(term320266, term320266.getClass(), "hour", (byte) 7);
        setByteField(term320266, term320266.getClass(), "minute", (byte) 2);
        setByteField(term320266, term320266.getClass(), "second", (byte) 46);
        setIntField(term320266, term320266.getClass(), "nano", 187178462);
        setField(term320261, term320261.getClass(), "time", term320266);
        setField(term319553, term319553.getClass(), "dateTime", term320261);
        term320271 = new Integer(701114540);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term320271;
        callMethod(klass, "setIsVocalChange", argTypes, term319553, args);
    }

};


