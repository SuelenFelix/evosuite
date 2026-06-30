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

public class PlayLog_getChallengeKind_4450124198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84602;

    public PlayLog_getChallengeKind_4450124198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term85319 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term85318 = ((Class) term85319).getDeclaredField((String) "MISS");
        ((Field) term85318).setAccessible(true);
        Object enum178 = ((Field) term85318).get((Object) null);
        Class<? extends Object> term85696 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term85695 = ((Class) term85696).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term85695).setAccessible(true);
        Object enum179 = ((Field) term85695).get((Object) null);
        Class<? extends Object> term85979 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term85978 = ((Class) term85979).getDeclaredField((String) "NORMAL");
        ((Field) term85978).setAccessible(true);
        Object enum180 = ((Field) term85978).get((Object) null);
        Class<? extends Object> term86254 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term86253 = ((Class) term86254).getDeclaredField((String) "ORIGINAL");
        ((Field) term86253).setAccessible(true);
        Object enum181 = ((Field) term86253).get((Object) null);
        Class<? extends Object> term86520 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term86519 = ((Class) term86520).getDeclaredField((String) "NONE");
        ((Field) term86519).setAccessible(true);
        Object enum182 = ((Field) term86519).get((Object) null);
        Class<? extends Object> term87161 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term87160 = ((Class) term87161).getDeclaredField((String) "EXCELLENT");
        ((Field) term87160).setAccessible(true);
        Object enum183 = ((Field) term87160).get((Object) null);
        Class<? extends Object> term87460 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term87459 = ((Class) term87460).getDeclaredField((String) "EXCELLENT");
        ((Field) term87459).setAccessible(true);
        Object enum184 = ((Field) term87459).get((Object) null);
        term84602 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        Object term84604 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term84727 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term84728 = newInstance(Class.forName("java.time.LocalDate"));
        Object term84732 = newInstance(Class.forName("java.time.LocalTime"));
        Object term85302 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term85303 = newInstance(Class.forName("java.time.LocalDate"));
        Object term85307 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term84602, term84602.getClass(), "id", 5953383087795962419L);
        setLongField(term84604, term84604.getClass(), "id", 7994303628307559416L);
        setIntField(term84604, term84604.getClass(), "pdId", -2070466617);
        setField(term84604, term84604.getClass(), "playerName", "xxx");
        setIntField(term84604, term84604.getClass(), "vocaloidPoints", 300);
        setIntField(term84604, term84604.getClass(), "level", 1);
        setIntField(term84604, term84604.getClass(), "levelExp", -1127721881);
        setField(term84604, term84604.getClass(), "levelTitle", "xxx");
        setIntField(term84604, term84604.getClass(), "plateId", -1);
        setIntField(term84604, term84604.getClass(), "plateEffectId", -1);
        setField(term84604, term84604.getClass(), "passwordStatus", enum178);
        setField(term84604, term84604.getClass(), "password", "**********");
        setBooleanField(term84604, term84604.getClass(), "preferPerPvModule", true);
        setBooleanField(term84604, term84604.getClass(), "preferCommonModule", true);
        setBooleanField(term84604, term84604.getClass(), "usePerPvSkin", false);
        setBooleanField(term84604, term84604.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term84604, term84604.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term84604, term84604.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term84604, term84604.getClass(), "usePerPvTouchSliderSe", true);
        setField(term84604, term84604.getClass(), "commonModule", "-999,-999,-999");
        setField(term84604, term84604.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term84728, term84728.getClass(), "year", 2026);
        setShortField(term84728, term84728.getClass(), "month", (short) 6);
        setShortField(term84728, term84728.getClass(), "day", (short) 29);
        setField(term84727, term84727.getClass(), "date", term84728);
        setByteField(term84732, term84732.getClass(), "hour", (byte) 4);
        setByteField(term84732, term84732.getClass(), "minute", (byte) 27);
        setByteField(term84732, term84732.getClass(), "second", (byte) 25);
        setIntField(term84732, term84732.getClass(), "nano", 599221000);
        setField(term84727, term84727.getClass(), "time", term84732);
        setField(term84604, term84604.getClass(), "commonModuleSetTime", term84727);
        setField(term84604, term84604.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term84604, term84604.getClass(), "commonSkin", -1);
        setIntField(term84604, term84604.getClass(), "headphoneVolume", 100);
        setBooleanField(term84604, term84604.getClass(), "buttonSeOn", true);
        setIntField(term84604, term84604.getClass(), "buttonSeVolume", 100);
        setIntField(term84604, term84604.getClass(), "sliderSeVolume", 100);
        setIntField(term84604, term84604.getClass(), "buttonSe", -1);
        setIntField(term84604, term84604.getClass(), "chainSlideSe", -1);
        setIntField(term84604, term84604.getClass(), "slideSe", -1);
        setIntField(term84604, term84604.getClass(), "sliderTouchSe", -1);
        setField(term84604, term84604.getClass(), "sortMode", enum179);
        setIntField(term84604, term84604.getClass(), "nextPvId", -1);
        setField(term84604, term84604.getClass(), "nextDifficulty", enum180);
        setField(term84604, term84604.getClass(), "nextEdition", enum181);
        setBooleanField(term84604, term84604.getClass(), "showInterimRanking", true);
        setBooleanField(term84604, term84604.getClass(), "showClearStatus", true);
        setBooleanField(term84604, term84604.getClass(), "showGreatBorder", true);
        setBooleanField(term84604, term84604.getClass(), "showExcellentBorder", true);
        setBooleanField(term84604, term84604.getClass(), "showRivalBorder", true);
        setBooleanField(term84604, term84604.getClass(), "showRgoSetting", true);
        setBooleanField(term84604, term84604.getClass(), "contestNowPlayingEnable", true);
        setIntField(term84604, term84604.getClass(), "contestNowPlayingId", -1);
        setIntField(term84604, term84604.getClass(), "contestNowPlayingValue", -1);
        setField(term84604, term84604.getClass(), "contestNowPlayingResultRank", enum182);
        setField(term84604, term84604.getClass(), "contestNowPlayingSpecifier", "");
        setField(term84604, term84604.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term84604, term84604.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term84604, term84604.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term84604, term84604.getClass(), "rivalPdId", -1);
        setField(term84602, term84602.getClass(), "pdId", term84604);
        setIntField(term84602, term84602.getClass(), "pvId", 1074848808);
        setField(term84602, term84602.getClass(), "difficulty", enum180);
        setField(term84602, term84602.getClass(), "edition", enum181);
        setIntField(term84602, term84602.getClass(), "scriptVer", -146054762);
        setIntField(term84602, term84602.getClass(), "score", 798043553);
        setField(term84602, term84602.getClass(), "challengeKind", enum183);
        setIntField(term84602, term84602.getClass(), "challengeResult", 533197381);
        setField(term84602, term84602.getClass(), "clearResult", enum184);
        setIntField(term84602, term84602.getClass(), "vp", 1048271679);
        setIntField(term84602, term84602.getClass(), "coolCount", -1529797673);
        setIntField(term84602, term84602.getClass(), "coolPercent", -868676396);
        setIntField(term84602, term84602.getClass(), "fineCount", 1922684808);
        setIntField(term84602, term84602.getClass(), "finePercent", -2005784375);
        setIntField(term84602, term84602.getClass(), "safeCount", -288604325);
        setIntField(term84602, term84602.getClass(), "safePercent", -1268314569);
        setIntField(term84602, term84602.getClass(), "sadCount", 877649659);
        setIntField(term84602, term84602.getClass(), "sadPercent", -1332748804);
        setIntField(term84602, term84602.getClass(), "wrongCount", 1774507971);
        setIntField(term84602, term84602.getClass(), "wrongPercent", -1420269858);
        setIntField(term84602, term84602.getClass(), "maxCombo", -2119545015);
        setIntField(term84602, term84602.getClass(), "chanceTime", 1272542218);
        setIntField(term84602, term84602.getClass(), "holdScore", 1209799204);
        setIntField(term84602, term84602.getClass(), "attainPoint", 1094107751);
        setIntField(term84602, term84602.getClass(), "skinId", 844222656);
        setIntField(term84602, term84602.getClass(), "buttonSe", -18216811);
        setIntField(term84602, term84602.getClass(), "buttonSeVol", -1813280137);
        setIntField(term84602, term84602.getClass(), "sliderSe", 719656595);
        setIntField(term84602, term84602.getClass(), "ChainSlideSe", -1516995753);
        setIntField(term84602, term84602.getClass(), "SliderTouchSe", -390501023);
        setField(term84602, term84602.getClass(), "modules", "BYqFIqCKAV");
        setIntField(term84602, term84602.getClass(), "stageCompletion", -1667482829);
        setIntField(term84602, term84602.getClass(), "slideScore", 1116576792);
        setIntField(term84602, term84602.getClass(), "isVocalChange", -942194446);
        setField(term84602, term84602.getClass(), "customizeItems", "vrQLuWIDJX");
        setField(term84602, term84602.getClass(), "rhythmGameOptions", "flxyYxBRtu");
        setIntField(term84602, term84602.getClass(), "screenShotCount", -1);
        setIntField(term85303, term85303.getClass(), "year", 2019);
        setShortField(term85303, term85303.getClass(), "month", (short) 2);
        setShortField(term85303, term85303.getClass(), "day", (short) 21);
        setField(term85302, term85302.getClass(), "date", term85303);
        setByteField(term85307, term85307.getClass(), "hour", (byte) 5);
        setByteField(term85307, term85307.getClass(), "minute", (byte) 41);
        setByteField(term85307, term85307.getClass(), "second", (byte) 11);
        setIntField(term85307, term85307.getClass(), "nano", 859829782);
        setField(term85302, term85302.getClass(), "time", term85307);
        setField(term84602, term84602.getClass(), "dateTime", term85302);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getChallengeKind", argTypes, term84602, args);
    }

};


