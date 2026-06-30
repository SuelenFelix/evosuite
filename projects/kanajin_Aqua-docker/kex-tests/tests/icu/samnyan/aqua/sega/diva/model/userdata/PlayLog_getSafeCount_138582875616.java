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

public class PlayLog_getSafeCount_138582875616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111879;

    public PlayLog_getSafeCount_138582875616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term112601 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term112600 = ((Class) term112601).getDeclaredField((String) "MISS");
        ((Field) term112600).setAccessible(true);
        Object enum241 = ((Field) term112600).get((Object) null);
        Class<? extends Object> term112978 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term112977 = ((Class) term112978).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term112977).setAccessible(true);
        Object enum242 = ((Field) term112977).get((Object) null);
        Class<? extends Object> term113261 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term113260 = ((Class) term113261).getDeclaredField((String) "NORMAL");
        ((Field) term113260).setAccessible(true);
        Object enum243 = ((Field) term113260).get((Object) null);
        Class<? extends Object> term113536 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term113535 = ((Class) term113536).getDeclaredField((String) "ORIGINAL");
        ((Field) term113535).setAccessible(true);
        Object enum244 = ((Field) term113535).get((Object) null);
        Class<? extends Object> term113802 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term113801 = ((Class) term113802).getDeclaredField((String) "NONE");
        ((Field) term113801).setAccessible(true);
        Object enum245 = ((Field) term113801).get((Object) null);
        Class<? extends Object> term114443 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term114442 = ((Class) term114443).getDeclaredField((String) "EXTRA");
        ((Field) term114442).setAccessible(true);
        Object enum246 = ((Field) term114442).get((Object) null);
        Class<? extends Object> term114700 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term114699 = ((Class) term114700).getDeclaredField((String) "CLEAR");
        ((Field) term114699).setAccessible(true);
        Object enum247 = ((Field) term114699).get((Object) null);
        Class<? extends Object> term114987 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term114986 = ((Class) term114987).getDeclaredField((String) "STANDARD");
        ((Field) term114986).setAccessible(true);
        Object enum248 = ((Field) term114986).get((Object) null);
        term111879 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        Object term111881 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term112004 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term112005 = newInstance(Class.forName("java.time.LocalDate"));
        Object term112009 = newInstance(Class.forName("java.time.LocalTime"));
        Object term112584 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term112585 = newInstance(Class.forName("java.time.LocalDate"));
        Object term112589 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term111879, term111879.getClass(), "id", -5963439350418910964L);
        setLongField(term111881, term111881.getClass(), "id", 9013624480170062917L);
        setIntField(term111881, term111881.getClass(), "pdId", -1415256843);
        setField(term111881, term111881.getClass(), "playerName", "xxx");
        setIntField(term111881, term111881.getClass(), "vocaloidPoints", 300);
        setIntField(term111881, term111881.getClass(), "level", 1);
        setIntField(term111881, term111881.getClass(), "levelExp", 612177768);
        setField(term111881, term111881.getClass(), "levelTitle", "xxx");
        setIntField(term111881, term111881.getClass(), "plateId", -1);
        setIntField(term111881, term111881.getClass(), "plateEffectId", -1);
        setField(term111881, term111881.getClass(), "passwordStatus", enum241);
        setField(term111881, term111881.getClass(), "password", "**********");
        setBooleanField(term111881, term111881.getClass(), "preferPerPvModule", true);
        setBooleanField(term111881, term111881.getClass(), "preferCommonModule", false);
        setBooleanField(term111881, term111881.getClass(), "usePerPvSkin", false);
        setBooleanField(term111881, term111881.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term111881, term111881.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term111881, term111881.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term111881, term111881.getClass(), "usePerPvTouchSliderSe", false);
        setField(term111881, term111881.getClass(), "commonModule", "-999,-999,-999");
        setField(term111881, term111881.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term112005, term112005.getClass(), "year", 2026);
        setShortField(term112005, term112005.getClass(), "month", (short) 6);
        setShortField(term112005, term112005.getClass(), "day", (short) 29);
        setField(term112004, term112004.getClass(), "date", term112005);
        setByteField(term112009, term112009.getClass(), "hour", (byte) 4);
        setByteField(term112009, term112009.getClass(), "minute", (byte) 27);
        setByteField(term112009, term112009.getClass(), "second", (byte) 27);
        setIntField(term112009, term112009.getClass(), "nano", 660569000);
        setField(term112004, term112004.getClass(), "time", term112009);
        setField(term111881, term111881.getClass(), "commonModuleSetTime", term112004);
        setField(term111881, term111881.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term111881, term111881.getClass(), "commonSkin", -1);
        setIntField(term111881, term111881.getClass(), "headphoneVolume", 100);
        setBooleanField(term111881, term111881.getClass(), "buttonSeOn", true);
        setIntField(term111881, term111881.getClass(), "buttonSeVolume", 100);
        setIntField(term111881, term111881.getClass(), "sliderSeVolume", 100);
        setIntField(term111881, term111881.getClass(), "buttonSe", -1);
        setIntField(term111881, term111881.getClass(), "chainSlideSe", -1);
        setIntField(term111881, term111881.getClass(), "slideSe", -1);
        setIntField(term111881, term111881.getClass(), "sliderTouchSe", -1);
        setField(term111881, term111881.getClass(), "sortMode", enum242);
        setIntField(term111881, term111881.getClass(), "nextPvId", -1);
        setField(term111881, term111881.getClass(), "nextDifficulty", enum243);
        setField(term111881, term111881.getClass(), "nextEdition", enum244);
        setBooleanField(term111881, term111881.getClass(), "showInterimRanking", true);
        setBooleanField(term111881, term111881.getClass(), "showClearStatus", true);
        setBooleanField(term111881, term111881.getClass(), "showGreatBorder", true);
        setBooleanField(term111881, term111881.getClass(), "showExcellentBorder", true);
        setBooleanField(term111881, term111881.getClass(), "showRivalBorder", true);
        setBooleanField(term111881, term111881.getClass(), "showRgoSetting", true);
        setBooleanField(term111881, term111881.getClass(), "contestNowPlayingEnable", false);
        setIntField(term111881, term111881.getClass(), "contestNowPlayingId", -1);
        setIntField(term111881, term111881.getClass(), "contestNowPlayingValue", -1);
        setField(term111881, term111881.getClass(), "contestNowPlayingResultRank", enum245);
        setField(term111881, term111881.getClass(), "contestNowPlayingSpecifier", "");
        setField(term111881, term111881.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term111881, term111881.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term111881, term111881.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term111881, term111881.getClass(), "rivalPdId", -1);
        setField(term111879, term111879.getClass(), "pdId", term111881);
        setIntField(term111879, term111879.getClass(), "pvId", -1626451656);
        setField(term111879, term111879.getClass(), "difficulty", enum243);
        setField(term111879, term111879.getClass(), "edition", enum246);
        setIntField(term111879, term111879.getClass(), "scriptVer", 173952451);
        setIntField(term111879, term111879.getClass(), "score", -1972033388);
        setField(term111879, term111879.getClass(), "challengeKind", enum247);
        setIntField(term111879, term111879.getClass(), "challengeResult", -1005024758);
        setField(term111879, term111879.getClass(), "clearResult", enum248);
        setIntField(term111879, term111879.getClass(), "vp", 2634669);
        setIntField(term111879, term111879.getClass(), "coolCount", -1912429941);
        setIntField(term111879, term111879.getClass(), "coolPercent", 1801052257);
        setIntField(term111879, term111879.getClass(), "fineCount", -2110556060);
        setIntField(term111879, term111879.getClass(), "finePercent", 313459791);
        setIntField(term111879, term111879.getClass(), "safeCount", 752615112);
        setIntField(term111879, term111879.getClass(), "safePercent", -1674430871);
        setIntField(term111879, term111879.getClass(), "sadCount", 794352120);
        setIntField(term111879, term111879.getClass(), "sadPercent", 340719678);
        setIntField(term111879, term111879.getClass(), "wrongCount", 299791142);
        setIntField(term111879, term111879.getClass(), "wrongPercent", 1862191391);
        setIntField(term111879, term111879.getClass(), "maxCombo", 1131398807);
        setIntField(term111879, term111879.getClass(), "chanceTime", -344907703);
        setIntField(term111879, term111879.getClass(), "holdScore", 824341437);
        setIntField(term111879, term111879.getClass(), "attainPoint", -1794965320);
        setIntField(term111879, term111879.getClass(), "skinId", 520504102);
        setIntField(term111879, term111879.getClass(), "buttonSe", -457396133);
        setIntField(term111879, term111879.getClass(), "buttonSeVol", -1793950607);
        setIntField(term111879, term111879.getClass(), "sliderSe", 1091954101);
        setIntField(term111879, term111879.getClass(), "ChainSlideSe", 1895143076);
        setIntField(term111879, term111879.getClass(), "SliderTouchSe", 1981860404);
        setField(term111879, term111879.getClass(), "modules", "xLbjWUgOIL");
        setIntField(term111879, term111879.getClass(), "stageCompletion", 732174235);
        setIntField(term111879, term111879.getClass(), "slideScore", 470895808);
        setIntField(term111879, term111879.getClass(), "isVocalChange", 1787325291);
        setField(term111879, term111879.getClass(), "customizeItems", "jDtqGUpnZN");
        setField(term111879, term111879.getClass(), "rhythmGameOptions", "nGKItKLYNC");
        setIntField(term111879, term111879.getClass(), "screenShotCount", -1);
        setIntField(term112585, term112585.getClass(), "year", 2017);
        setShortField(term112585, term112585.getClass(), "month", (short) 3);
        setShortField(term112585, term112585.getClass(), "day", (short) 5);
        setField(term112584, term112584.getClass(), "date", term112585);
        setByteField(term112589, term112589.getClass(), "hour", (byte) 20);
        setByteField(term112589, term112589.getClass(), "minute", (byte) 34);
        setByteField(term112589, term112589.getClass(), "second", (byte) 55);
        setIntField(term112589, term112589.getClass(), "nano", 78024496);
        setField(term112584, term112584.getClass(), "time", term112589);
        setField(term111879, term111879.getClass(), "dateTime", term112584);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSafeCount", argTypes, term111879, args);
    }

};


