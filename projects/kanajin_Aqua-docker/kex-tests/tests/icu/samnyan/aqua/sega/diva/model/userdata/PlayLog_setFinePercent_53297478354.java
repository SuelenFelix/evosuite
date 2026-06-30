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

public class PlayLog_setFinePercent_53297478354 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term250151;
     Object term250866;

    public PlayLog_setFinePercent_53297478354() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term250875 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term250874 = ((Class) term250875).getDeclaredField((String) "MISS");
        ((Field) term250874).setAccessible(true);
        Object enum568 = ((Field) term250874).get((Object) null);
        Class<? extends Object> term251252 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term251251 = ((Class) term251252).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term251251).setAccessible(true);
        Object enum569 = ((Field) term251251).get((Object) null);
        Class<? extends Object> term251535 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term251534 = ((Class) term251535).getDeclaredField((String) "NORMAL");
        ((Field) term251534).setAccessible(true);
        Object enum570 = ((Field) term251534).get((Object) null);
        Class<? extends Object> term251810 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term251809 = ((Class) term251810).getDeclaredField((String) "ORIGINAL");
        ((Field) term251809).setAccessible(true);
        Object enum571 = ((Field) term251809).get((Object) null);
        Class<? extends Object> term252076 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term252075 = ((Class) term252076).getDeclaredField((String) "NONE");
        ((Field) term252075).setAccessible(true);
        Object enum572 = ((Field) term252075).get((Object) null);
        Class<? extends Object> term252717 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term252716 = ((Class) term252717).getDeclaredField((String) "HARD");
        ((Field) term252716).setAccessible(true);
        Object enum573 = ((Field) term252716).get((Object) null);
        Class<? extends Object> term252986 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term252985 = ((Class) term252986).getDeclaredField((String) "CLEAR");
        ((Field) term252985).setAccessible(true);
        Object enum574 = ((Field) term252985).get((Object) null);
        Class<? extends Object> term253273 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term253272 = ((Class) term253273).getDeclaredField((String) "EXCELLENT");
        ((Field) term253272).setAccessible(true);
        Object enum575 = ((Field) term253272).get((Object) null);
        term250151 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        Object term250153 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term250276 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term250277 = newInstance(Class.forName("java.time.LocalDate"));
        Object term250281 = newInstance(Class.forName("java.time.LocalTime"));
        Object term250856 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term250857 = newInstance(Class.forName("java.time.LocalDate"));
        Object term250861 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term250151, term250151.getClass(), "id", -8603648071751666348L);
        setLongField(term250153, term250153.getClass(), "id", -7884871963229073324L);
        setIntField(term250153, term250153.getClass(), "pdId", -1908164516);
        setField(term250153, term250153.getClass(), "playerName", "xxx");
        setIntField(term250153, term250153.getClass(), "vocaloidPoints", 300);
        setIntField(term250153, term250153.getClass(), "level", 1);
        setIntField(term250153, term250153.getClass(), "levelExp", -1343269854);
        setField(term250153, term250153.getClass(), "levelTitle", "xxx");
        setIntField(term250153, term250153.getClass(), "plateId", -1);
        setIntField(term250153, term250153.getClass(), "plateEffectId", -1);
        setField(term250153, term250153.getClass(), "passwordStatus", enum568);
        setField(term250153, term250153.getClass(), "password", "**********");
        setBooleanField(term250153, term250153.getClass(), "preferPerPvModule", true);
        setBooleanField(term250153, term250153.getClass(), "preferCommonModule", true);
        setBooleanField(term250153, term250153.getClass(), "usePerPvSkin", false);
        setBooleanField(term250153, term250153.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term250153, term250153.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term250153, term250153.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term250153, term250153.getClass(), "usePerPvTouchSliderSe", false);
        setField(term250153, term250153.getClass(), "commonModule", "-999,-999,-999");
        setField(term250153, term250153.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term250277, term250277.getClass(), "year", 2026);
        setShortField(term250277, term250277.getClass(), "month", (short) 6);
        setShortField(term250277, term250277.getClass(), "day", (short) 29);
        setField(term250276, term250276.getClass(), "date", term250277);
        setByteField(term250281, term250281.getClass(), "hour", (byte) 4);
        setByteField(term250281, term250281.getClass(), "minute", (byte) 27);
        setByteField(term250281, term250281.getClass(), "second", (byte) 37);
        setIntField(term250281, term250281.getClass(), "nano", 387084000);
        setField(term250276, term250276.getClass(), "time", term250281);
        setField(term250153, term250153.getClass(), "commonModuleSetTime", term250276);
        setField(term250153, term250153.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term250153, term250153.getClass(), "commonSkin", -1);
        setIntField(term250153, term250153.getClass(), "headphoneVolume", 100);
        setBooleanField(term250153, term250153.getClass(), "buttonSeOn", true);
        setIntField(term250153, term250153.getClass(), "buttonSeVolume", 100);
        setIntField(term250153, term250153.getClass(), "sliderSeVolume", 100);
        setIntField(term250153, term250153.getClass(), "buttonSe", -1);
        setIntField(term250153, term250153.getClass(), "chainSlideSe", -1);
        setIntField(term250153, term250153.getClass(), "slideSe", -1);
        setIntField(term250153, term250153.getClass(), "sliderTouchSe", -1);
        setField(term250153, term250153.getClass(), "sortMode", enum569);
        setIntField(term250153, term250153.getClass(), "nextPvId", -1);
        setField(term250153, term250153.getClass(), "nextDifficulty", enum570);
        setField(term250153, term250153.getClass(), "nextEdition", enum571);
        setBooleanField(term250153, term250153.getClass(), "showInterimRanking", true);
        setBooleanField(term250153, term250153.getClass(), "showClearStatus", true);
        setBooleanField(term250153, term250153.getClass(), "showGreatBorder", true);
        setBooleanField(term250153, term250153.getClass(), "showExcellentBorder", true);
        setBooleanField(term250153, term250153.getClass(), "showRivalBorder", true);
        setBooleanField(term250153, term250153.getClass(), "showRgoSetting", true);
        setBooleanField(term250153, term250153.getClass(), "contestNowPlayingEnable", false);
        setIntField(term250153, term250153.getClass(), "contestNowPlayingId", -1);
        setIntField(term250153, term250153.getClass(), "contestNowPlayingValue", -1);
        setField(term250153, term250153.getClass(), "contestNowPlayingResultRank", enum572);
        setField(term250153, term250153.getClass(), "contestNowPlayingSpecifier", "");
        setField(term250153, term250153.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term250153, term250153.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term250153, term250153.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term250153, term250153.getClass(), "rivalPdId", -1);
        setField(term250151, term250151.getClass(), "pdId", term250153);
        setIntField(term250151, term250151.getClass(), "pvId", -731459309);
        setField(term250151, term250151.getClass(), "difficulty", enum573);
        setField(term250151, term250151.getClass(), "edition", enum571);
        setIntField(term250151, term250151.getClass(), "scriptVer", -913468095);
        setIntField(term250151, term250151.getClass(), "score", 38489871);
        setField(term250151, term250151.getClass(), "challengeKind", enum574);
        setIntField(term250151, term250151.getClass(), "challengeResult", -1667787735);
        setField(term250151, term250151.getClass(), "clearResult", enum575);
        setIntField(term250151, term250151.getClass(), "vp", 1841765799);
        setIntField(term250151, term250151.getClass(), "coolCount", 72160200);
        setIntField(term250151, term250151.getClass(), "coolPercent", -1870567623);
        setIntField(term250151, term250151.getClass(), "fineCount", -1442923471);
        setIntField(term250151, term250151.getClass(), "finePercent", -434247549);
        setIntField(term250151, term250151.getClass(), "safeCount", 1246505552);
        setIntField(term250151, term250151.getClass(), "safePercent", -1456497810);
        setIntField(term250151, term250151.getClass(), "sadCount", 61954667);
        setIntField(term250151, term250151.getClass(), "sadPercent", -919022885);
        setIntField(term250151, term250151.getClass(), "wrongCount", -1836286878);
        setIntField(term250151, term250151.getClass(), "wrongPercent", 276336694);
        setIntField(term250151, term250151.getClass(), "maxCombo", 1627938506);
        setIntField(term250151, term250151.getClass(), "chanceTime", 386284750);
        setIntField(term250151, term250151.getClass(), "holdScore", 906856023);
        setIntField(term250151, term250151.getClass(), "attainPoint", 198857801);
        setIntField(term250151, term250151.getClass(), "skinId", 1342884142);
        setIntField(term250151, term250151.getClass(), "buttonSe", -1454325068);
        setIntField(term250151, term250151.getClass(), "buttonSeVol", 346714653);
        setIntField(term250151, term250151.getClass(), "sliderSe", 2121928697);
        setIntField(term250151, term250151.getClass(), "ChainSlideSe", -1741056571);
        setIntField(term250151, term250151.getClass(), "SliderTouchSe", 522501050);
        setField(term250151, term250151.getClass(), "modules", "BRIVNtfUWU");
        setIntField(term250151, term250151.getClass(), "stageCompletion", 125432890);
        setIntField(term250151, term250151.getClass(), "slideScore", -197740561);
        setIntField(term250151, term250151.getClass(), "isVocalChange", -1811706962);
        setField(term250151, term250151.getClass(), "customizeItems", "DbiCVtPPCT");
        setField(term250151, term250151.getClass(), "rhythmGameOptions", "WzFopsaDuG");
        setIntField(term250151, term250151.getClass(), "screenShotCount", -1);
        setIntField(term250857, term250857.getClass(), "year", 2022);
        setShortField(term250857, term250857.getClass(), "month", (short) 6);
        setShortField(term250857, term250857.getClass(), "day", (short) 20);
        setField(term250856, term250856.getClass(), "date", term250857);
        setByteField(term250861, term250861.getClass(), "hour", (byte) 7);
        setByteField(term250861, term250861.getClass(), "minute", (byte) 57);
        setByteField(term250861, term250861.getClass(), "second", (byte) 37);
        setIntField(term250861, term250861.getClass(), "nano", 90374877);
        setField(term250856, term250856.getClass(), "time", term250861);
        setField(term250151, term250151.getClass(), "dateTime", term250856);
        term250866 = new Integer(-1242133071);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term250866;
        callMethod(klass, "setFinePercent", argTypes, term250151, args);
    }

};


