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

public class PlayLog_setAttainPoint_148019478564 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term284836;
     Object term285551;

    public PlayLog_setAttainPoint_148019478564() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term285560 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term285559 = ((Class) term285560).getDeclaredField((String) "MISS");
        ((Field) term285559).setAccessible(true);
        Object enum649 = ((Field) term285559).get((Object) null);
        Class<? extends Object> term285937 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term285936 = ((Class) term285937).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term285936).setAccessible(true);
        Object enum650 = ((Field) term285936).get((Object) null);
        Class<? extends Object> term286220 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term286219 = ((Class) term286220).getDeclaredField((String) "NORMAL");
        ((Field) term286219).setAccessible(true);
        Object enum651 = ((Field) term286219).get((Object) null);
        Class<? extends Object> term286495 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term286494 = ((Class) term286495).getDeclaredField((String) "ORIGINAL");
        ((Field) term286494).setAccessible(true);
        Object enum652 = ((Field) term286494).get((Object) null);
        Class<? extends Object> term286761 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term286760 = ((Class) term286761).getDeclaredField((String) "NONE");
        ((Field) term286760).setAccessible(true);
        Object enum653 = ((Field) term286760).get((Object) null);
        Class<? extends Object> term287402 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term287401 = ((Class) term287402).getDeclaredField((String) "HARD");
        ((Field) term287401).setAccessible(true);
        Object enum654 = ((Field) term287401).get((Object) null);
        Class<? extends Object> term287671 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term287670 = ((Class) term287671).getDeclaredField((String) "GREAT");
        ((Field) term287670).setAccessible(true);
        Object enum655 = ((Field) term287670).get((Object) null);
        Class<? extends Object> term287958 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term287957 = ((Class) term287958).getDeclaredField((String) "MISS_TAKE");
        ((Field) term287957).setAccessible(true);
        Object enum656 = ((Field) term287957).get((Object) null);
        term284836 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        Object term284838 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term284961 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term284962 = newInstance(Class.forName("java.time.LocalDate"));
        Object term284966 = newInstance(Class.forName("java.time.LocalTime"));
        Object term285541 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term285542 = newInstance(Class.forName("java.time.LocalDate"));
        Object term285546 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term284836, term284836.getClass(), "id", -5447369594017685765L);
        setLongField(term284838, term284838.getClass(), "id", -5724112525188606013L);
        setIntField(term284838, term284838.getClass(), "pdId", 1018925421);
        setField(term284838, term284838.getClass(), "playerName", "xxx");
        setIntField(term284838, term284838.getClass(), "vocaloidPoints", 300);
        setIntField(term284838, term284838.getClass(), "level", 1);
        setIntField(term284838, term284838.getClass(), "levelExp", -1658031378);
        setField(term284838, term284838.getClass(), "levelTitle", "xxx");
        setIntField(term284838, term284838.getClass(), "plateId", -1);
        setIntField(term284838, term284838.getClass(), "plateEffectId", -1);
        setField(term284838, term284838.getClass(), "passwordStatus", enum649);
        setField(term284838, term284838.getClass(), "password", "**********");
        setBooleanField(term284838, term284838.getClass(), "preferPerPvModule", true);
        setBooleanField(term284838, term284838.getClass(), "preferCommonModule", true);
        setBooleanField(term284838, term284838.getClass(), "usePerPvSkin", false);
        setBooleanField(term284838, term284838.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term284838, term284838.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term284838, term284838.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term284838, term284838.getClass(), "usePerPvTouchSliderSe", true);
        setField(term284838, term284838.getClass(), "commonModule", "-999,-999,-999");
        setField(term284838, term284838.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term284962, term284962.getClass(), "year", 2026);
        setShortField(term284962, term284962.getClass(), "month", (short) 8);
        setShortField(term284962, term284962.getClass(), "day", (short) 12);
        setField(term284961, term284961.getClass(), "date", term284962);
        setByteField(term284966, term284966.getClass(), "hour", (byte) 2);
        setByteField(term284966, term284966.getClass(), "minute", (byte) 2);
        setByteField(term284966, term284966.getClass(), "second", (byte) 56);
        setIntField(term284966, term284966.getClass(), "nano", 288238000);
        setField(term284961, term284961.getClass(), "time", term284966);
        setField(term284838, term284838.getClass(), "commonModuleSetTime", term284961);
        setField(term284838, term284838.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term284838, term284838.getClass(), "commonSkin", -1);
        setIntField(term284838, term284838.getClass(), "headphoneVolume", 100);
        setBooleanField(term284838, term284838.getClass(), "buttonSeOn", true);
        setIntField(term284838, term284838.getClass(), "buttonSeVolume", 100);
        setIntField(term284838, term284838.getClass(), "sliderSeVolume", 100);
        setIntField(term284838, term284838.getClass(), "buttonSe", -1);
        setIntField(term284838, term284838.getClass(), "chainSlideSe", -1);
        setIntField(term284838, term284838.getClass(), "slideSe", -1);
        setIntField(term284838, term284838.getClass(), "sliderTouchSe", -1);
        setField(term284838, term284838.getClass(), "sortMode", enum650);
        setIntField(term284838, term284838.getClass(), "nextPvId", -1);
        setField(term284838, term284838.getClass(), "nextDifficulty", enum651);
        setField(term284838, term284838.getClass(), "nextEdition", enum652);
        setBooleanField(term284838, term284838.getClass(), "showInterimRanking", true);
        setBooleanField(term284838, term284838.getClass(), "showClearStatus", true);
        setBooleanField(term284838, term284838.getClass(), "showGreatBorder", true);
        setBooleanField(term284838, term284838.getClass(), "showExcellentBorder", true);
        setBooleanField(term284838, term284838.getClass(), "showRivalBorder", true);
        setBooleanField(term284838, term284838.getClass(), "showRgoSetting", true);
        setBooleanField(term284838, term284838.getClass(), "contestNowPlayingEnable", true);
        setIntField(term284838, term284838.getClass(), "contestNowPlayingId", -1);
        setIntField(term284838, term284838.getClass(), "contestNowPlayingValue", -1);
        setField(term284838, term284838.getClass(), "contestNowPlayingResultRank", enum653);
        setField(term284838, term284838.getClass(), "contestNowPlayingSpecifier", "");
        setField(term284838, term284838.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term284838, term284838.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term284838, term284838.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term284838, term284838.getClass(), "rivalPdId", -1);
        setField(term284836, term284836.getClass(), "pdId", term284838);
        setIntField(term284836, term284836.getClass(), "pvId", -863483345);
        setField(term284836, term284836.getClass(), "difficulty", enum654);
        setField(term284836, term284836.getClass(), "edition", enum652);
        setIntField(term284836, term284836.getClass(), "scriptVer", -1722702406);
        setIntField(term284836, term284836.getClass(), "score", 549278914);
        setField(term284836, term284836.getClass(), "challengeKind", enum655);
        setIntField(term284836, term284836.getClass(), "challengeResult", -1490125498);
        setField(term284836, term284836.getClass(), "clearResult", enum656);
        setIntField(term284836, term284836.getClass(), "vp", -1443119347);
        setIntField(term284836, term284836.getClass(), "coolCount", 1962181481);
        setIntField(term284836, term284836.getClass(), "coolPercent", 1798831879);
        setIntField(term284836, term284836.getClass(), "fineCount", 1393855580);
        setIntField(term284836, term284836.getClass(), "finePercent", -849064032);
        setIntField(term284836, term284836.getClass(), "safeCount", -184659375);
        setIntField(term284836, term284836.getClass(), "safePercent", 629005618);
        setIntField(term284836, term284836.getClass(), "sadCount", -2006508013);
        setIntField(term284836, term284836.getClass(), "sadPercent", 974951631);
        setIntField(term284836, term284836.getClass(), "wrongCount", -942202284);
        setIntField(term284836, term284836.getClass(), "wrongPercent", -2083254556);
        setIntField(term284836, term284836.getClass(), "maxCombo", 1452346261);
        setIntField(term284836, term284836.getClass(), "chanceTime", -548776693);
        setIntField(term284836, term284836.getClass(), "holdScore", 99032275);
        setIntField(term284836, term284836.getClass(), "attainPoint", 794098686);
        setIntField(term284836, term284836.getClass(), "skinId", -1671524013);
        setIntField(term284836, term284836.getClass(), "buttonSe", -438794741);
        setIntField(term284836, term284836.getClass(), "buttonSeVol", -1400834481);
        setIntField(term284836, term284836.getClass(), "sliderSe", 957091706);
        setIntField(term284836, term284836.getClass(), "ChainSlideSe", -2011802805);
        setIntField(term284836, term284836.getClass(), "SliderTouchSe", -1683802689);
        setField(term284836, term284836.getClass(), "modules", "OqbwYQfvAe");
        setIntField(term284836, term284836.getClass(), "stageCompletion", -1949346221);
        setIntField(term284836, term284836.getClass(), "slideScore", 831638391);
        setIntField(term284836, term284836.getClass(), "isVocalChange", -1184374392);
        setField(term284836, term284836.getClass(), "customizeItems", "tRxZafjqIx");
        setField(term284836, term284836.getClass(), "rhythmGameOptions", "DhjNLmRMCu");
        setIntField(term284836, term284836.getClass(), "screenShotCount", -1);
        setIntField(term285542, term285542.getClass(), "year", 2018);
        setShortField(term285542, term285542.getClass(), "month", (short) 2);
        setShortField(term285542, term285542.getClass(), "day", (short) 14);
        setField(term285541, term285541.getClass(), "date", term285542);
        setByteField(term285546, term285546.getClass(), "hour", (byte) 2);
        setByteField(term285546, term285546.getClass(), "minute", (byte) 40);
        setByteField(term285546, term285546.getClass(), "second", (byte) 48);
        setIntField(term285546, term285546.getClass(), "nano", 371006728);
        setField(term285541, term285541.getClass(), "time", term285546);
        setField(term284836, term284836.getClass(), "dateTime", term285541);
        term285551 = new Integer(-758870402);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term285551;
        callMethod(klass, "setAttainPoint", argTypes, term284836, args);
    }

};


