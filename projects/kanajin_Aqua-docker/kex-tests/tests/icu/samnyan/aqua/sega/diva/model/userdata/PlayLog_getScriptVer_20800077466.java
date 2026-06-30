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

public class PlayLog_getScriptVer_20800077466 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77148;

    public PlayLog_getScriptVer_20800077466() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term77884 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term77883 = ((Class) term77884).getDeclaredField((String) "MISS");
        ((Field) term77883).setAccessible(true);
        Object enum160 = ((Field) term77883).get((Object) null);
        Class<? extends Object> term78261 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term78260 = ((Class) term78261).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term78260).setAccessible(true);
        Object enum161 = ((Field) term78260).get((Object) null);
        Class<? extends Object> term78544 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term78543 = ((Class) term78544).getDeclaredField((String) "NORMAL");
        ((Field) term78543).setAccessible(true);
        Object enum162 = ((Field) term78543).get((Object) null);
        Class<? extends Object> term78819 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term78818 = ((Class) term78819).getDeclaredField((String) "ORIGINAL");
        ((Field) term78818).setAccessible(true);
        Object enum163 = ((Field) term78818).get((Object) null);
        Class<? extends Object> term79085 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term79084 = ((Class) term79085).getDeclaredField((String) "NONE");
        ((Field) term79084).setAccessible(true);
        Object enum164 = ((Field) term79084).get((Object) null);
        Class<? extends Object> term79726 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term79725 = ((Class) term79726).getDeclaredField((String) "EASY");
        ((Field) term79725).setAccessible(true);
        Object enum165 = ((Field) term79725).get((Object) null);
        Class<? extends Object> term79995 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term79994 = ((Class) term79995).getDeclaredField((String) "EXTRA");
        ((Field) term79994).setAccessible(true);
        Object enum166 = ((Field) term79994).get((Object) null);
        Class<? extends Object> term80252 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term80251 = ((Class) term80252).getDeclaredField((String) "COMPLETED");
        ((Field) term80251).setAccessible(true);
        Object enum167 = ((Field) term80251).get((Object) null);
        Class<? extends Object> term80551 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term80550 = ((Class) term80551).getDeclaredField((String) "MISS_TAKE");
        ((Field) term80550).setAccessible(true);
        Object enum168 = ((Field) term80550).get((Object) null);
        term77148 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        Object term77150 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term77273 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term77274 = newInstance(Class.forName("java.time.LocalDate"));
        Object term77278 = newInstance(Class.forName("java.time.LocalTime"));
        Object term77867 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term77868 = newInstance(Class.forName("java.time.LocalDate"));
        Object term77872 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term77148, term77148.getClass(), "id", -7738503207562305297L);
        setLongField(term77150, term77150.getClass(), "id", 3825396310311739952L);
        setIntField(term77150, term77150.getClass(), "pdId", 2049577015);
        setField(term77150, term77150.getClass(), "playerName", "xxx");
        setIntField(term77150, term77150.getClass(), "vocaloidPoints", 300);
        setIntField(term77150, term77150.getClass(), "level", 1);
        setIntField(term77150, term77150.getClass(), "levelExp", 1236004505);
        setField(term77150, term77150.getClass(), "levelTitle", "xxx");
        setIntField(term77150, term77150.getClass(), "plateId", -1);
        setIntField(term77150, term77150.getClass(), "plateEffectId", -1);
        setField(term77150, term77150.getClass(), "passwordStatus", enum160);
        setField(term77150, term77150.getClass(), "password", "**********");
        setBooleanField(term77150, term77150.getClass(), "preferPerPvModule", true);
        setBooleanField(term77150, term77150.getClass(), "preferCommonModule", true);
        setBooleanField(term77150, term77150.getClass(), "usePerPvSkin", true);
        setBooleanField(term77150, term77150.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term77150, term77150.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term77150, term77150.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term77150, term77150.getClass(), "usePerPvTouchSliderSe", false);
        setField(term77150, term77150.getClass(), "commonModule", "-999,-999,-999");
        setField(term77150, term77150.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term77274, term77274.getClass(), "year", 2026);
        setShortField(term77274, term77274.getClass(), "month", (short) 6);
        setShortField(term77274, term77274.getClass(), "day", (short) 29);
        setField(term77273, term77273.getClass(), "date", term77274);
        setByteField(term77278, term77278.getClass(), "hour", (byte) 4);
        setByteField(term77278, term77278.getClass(), "minute", (byte) 27);
        setByteField(term77278, term77278.getClass(), "second", (byte) 25);
        setIntField(term77278, term77278.getClass(), "nano", 85472000);
        setField(term77273, term77273.getClass(), "time", term77278);
        setField(term77150, term77150.getClass(), "commonModuleSetTime", term77273);
        setField(term77150, term77150.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term77150, term77150.getClass(), "commonSkin", -1);
        setIntField(term77150, term77150.getClass(), "headphoneVolume", 100);
        setBooleanField(term77150, term77150.getClass(), "buttonSeOn", true);
        setIntField(term77150, term77150.getClass(), "buttonSeVolume", 100);
        setIntField(term77150, term77150.getClass(), "sliderSeVolume", 100);
        setIntField(term77150, term77150.getClass(), "buttonSe", -1);
        setIntField(term77150, term77150.getClass(), "chainSlideSe", -1);
        setIntField(term77150, term77150.getClass(), "slideSe", -1);
        setIntField(term77150, term77150.getClass(), "sliderTouchSe", -1);
        setField(term77150, term77150.getClass(), "sortMode", enum161);
        setIntField(term77150, term77150.getClass(), "nextPvId", -1);
        setField(term77150, term77150.getClass(), "nextDifficulty", enum162);
        setField(term77150, term77150.getClass(), "nextEdition", enum163);
        setBooleanField(term77150, term77150.getClass(), "showInterimRanking", true);
        setBooleanField(term77150, term77150.getClass(), "showClearStatus", true);
        setBooleanField(term77150, term77150.getClass(), "showGreatBorder", true);
        setBooleanField(term77150, term77150.getClass(), "showExcellentBorder", true);
        setBooleanField(term77150, term77150.getClass(), "showRivalBorder", true);
        setBooleanField(term77150, term77150.getClass(), "showRgoSetting", true);
        setBooleanField(term77150, term77150.getClass(), "contestNowPlayingEnable", true);
        setIntField(term77150, term77150.getClass(), "contestNowPlayingId", -1);
        setIntField(term77150, term77150.getClass(), "contestNowPlayingValue", -1);
        setField(term77150, term77150.getClass(), "contestNowPlayingResultRank", enum164);
        setField(term77150, term77150.getClass(), "contestNowPlayingSpecifier", "");
        setField(term77150, term77150.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term77150, term77150.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term77150, term77150.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term77150, term77150.getClass(), "rivalPdId", -1);
        setField(term77148, term77148.getClass(), "pdId", term77150);
        setIntField(term77148, term77148.getClass(), "pvId", 1050765721);
        setField(term77148, term77148.getClass(), "difficulty", enum165);
        setField(term77148, term77148.getClass(), "edition", enum166);
        setIntField(term77148, term77148.getClass(), "scriptVer", 474518942);
        setIntField(term77148, term77148.getClass(), "score", -1656687479);
        setField(term77148, term77148.getClass(), "challengeKind", enum167);
        setIntField(term77148, term77148.getClass(), "challengeResult", -249614216);
        setField(term77148, term77148.getClass(), "clearResult", enum168);
        setIntField(term77148, term77148.getClass(), "vp", 1870727665);
        setIntField(term77148, term77148.getClass(), "coolCount", -519881101);
        setIntField(term77148, term77148.getClass(), "coolPercent", -680920524);
        setIntField(term77148, term77148.getClass(), "fineCount", -916335264);
        setIntField(term77148, term77148.getClass(), "finePercent", -919416536);
        setIntField(term77148, term77148.getClass(), "safeCount", -43417861);
        setIntField(term77148, term77148.getClass(), "safePercent", -1533843432);
        setIntField(term77148, term77148.getClass(), "sadCount", -123338791);
        setIntField(term77148, term77148.getClass(), "sadPercent", -1467089634);
        setIntField(term77148, term77148.getClass(), "wrongCount", 413548937);
        setIntField(term77148, term77148.getClass(), "wrongPercent", 1901317214);
        setIntField(term77148, term77148.getClass(), "maxCombo", 1166710220);
        setIntField(term77148, term77148.getClass(), "chanceTime", -1070592289);
        setIntField(term77148, term77148.getClass(), "holdScore", -1464172784);
        setIntField(term77148, term77148.getClass(), "attainPoint", 32185364);
        setIntField(term77148, term77148.getClass(), "skinId", 1768204942);
        setIntField(term77148, term77148.getClass(), "buttonSe", 1252951645);
        setIntField(term77148, term77148.getClass(), "buttonSeVol", 574481092);
        setIntField(term77148, term77148.getClass(), "sliderSe", -310528004);
        setIntField(term77148, term77148.getClass(), "ChainSlideSe", -634976996);
        setIntField(term77148, term77148.getClass(), "SliderTouchSe", -1015274146);
        setField(term77148, term77148.getClass(), "modules", "HyxfbSQYBe");
        setIntField(term77148, term77148.getClass(), "stageCompletion", -49052672);
        setIntField(term77148, term77148.getClass(), "slideScore", 339372704);
        setIntField(term77148, term77148.getClass(), "isVocalChange", -851097944);
        setField(term77148, term77148.getClass(), "customizeItems", "pCTimMblYc");
        setField(term77148, term77148.getClass(), "rhythmGameOptions", "hNxWaHcfhY");
        setIntField(term77148, term77148.getClass(), "screenShotCount", -1);
        setIntField(term77868, term77868.getClass(), "year", 2029);
        setShortField(term77868, term77868.getClass(), "month", (short) 8);
        setShortField(term77868, term77868.getClass(), "day", (short) 29);
        setField(term77867, term77867.getClass(), "date", term77868);
        setByteField(term77872, term77872.getClass(), "hour", (byte) 15);
        setByteField(term77872, term77872.getClass(), "minute", (byte) 50);
        setByteField(term77872, term77872.getClass(), "second", (byte) 1);
        setIntField(term77872, term77872.getClass(), "nano", 277971904);
        setField(term77867, term77867.getClass(), "time", term77872);
        setField(term77148, term77148.getClass(), "dateTime", term77867);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getScriptVer", argTypes, term77148, args);
    }

};


