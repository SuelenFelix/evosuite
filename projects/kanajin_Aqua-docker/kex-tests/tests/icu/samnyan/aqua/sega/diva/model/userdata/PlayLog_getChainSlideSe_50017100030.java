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

public class PlayLog_getChainSlideSe_50017100030 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term161998;

    public PlayLog_getChainSlideSe_50017100030() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term162734 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term162733 = ((Class) term162734).getDeclaredField((String) "MISS");
        ((Field) term162733).setAccessible(true);
        Object enum360 = ((Field) term162733).get((Object) null);
        Class<? extends Object> term163111 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term163110 = ((Class) term163111).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term163110).setAccessible(true);
        Object enum361 = ((Field) term163110).get((Object) null);
        Class<? extends Object> term163394 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term163393 = ((Class) term163394).getDeclaredField((String) "NORMAL");
        ((Field) term163393).setAccessible(true);
        Object enum362 = ((Field) term163393).get((Object) null);
        Class<? extends Object> term163669 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term163668 = ((Class) term163669).getDeclaredField((String) "ORIGINAL");
        ((Field) term163668).setAccessible(true);
        Object enum363 = ((Field) term163668).get((Object) null);
        Class<? extends Object> term163935 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term163934 = ((Class) term163935).getDeclaredField((String) "NONE");
        ((Field) term163934).setAccessible(true);
        Object enum364 = ((Field) term163934).get((Object) null);
        Class<? extends Object> term164576 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term164575 = ((Class) term164576).getDeclaredField((String) "EASY");
        ((Field) term164575).setAccessible(true);
        Object enum365 = ((Field) term164575).get((Object) null);
        Class<? extends Object> term164845 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term164844 = ((Class) term164845).getDeclaredField((String) "EXTRA");
        ((Field) term164844).setAccessible(true);
        Object enum366 = ((Field) term164844).get((Object) null);
        Class<? extends Object> term165102 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term165101 = ((Class) term165102).getDeclaredField((String) "COMPLETED");
        ((Field) term165101).setAccessible(true);
        Object enum367 = ((Field) term165101).get((Object) null);
        Class<? extends Object> term165401 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term165400 = ((Class) term165401).getDeclaredField((String) "EXCELLENT");
        ((Field) term165400).setAccessible(true);
        Object enum368 = ((Field) term165400).get((Object) null);
        term161998 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        Object term162000 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term162123 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term162124 = newInstance(Class.forName("java.time.LocalDate"));
        Object term162128 = newInstance(Class.forName("java.time.LocalTime"));
        Object term162717 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term162718 = newInstance(Class.forName("java.time.LocalDate"));
        Object term162722 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term161998, term161998.getClass(), "id", 1368340889161782793L);
        setLongField(term162000, term162000.getClass(), "id", -5786861555969446503L);
        setIntField(term162000, term162000.getClass(), "pdId", 2060027076);
        setField(term162000, term162000.getClass(), "playerName", "xxx");
        setIntField(term162000, term162000.getClass(), "vocaloidPoints", 300);
        setIntField(term162000, term162000.getClass(), "level", 1);
        setIntField(term162000, term162000.getClass(), "levelExp", 2084868811);
        setField(term162000, term162000.getClass(), "levelTitle", "xxx");
        setIntField(term162000, term162000.getClass(), "plateId", -1);
        setIntField(term162000, term162000.getClass(), "plateEffectId", -1);
        setField(term162000, term162000.getClass(), "passwordStatus", enum360);
        setField(term162000, term162000.getClass(), "password", "**********");
        setBooleanField(term162000, term162000.getClass(), "preferPerPvModule", true);
        setBooleanField(term162000, term162000.getClass(), "preferCommonModule", false);
        setBooleanField(term162000, term162000.getClass(), "usePerPvSkin", false);
        setBooleanField(term162000, term162000.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term162000, term162000.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term162000, term162000.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term162000, term162000.getClass(), "usePerPvTouchSliderSe", true);
        setField(term162000, term162000.getClass(), "commonModule", "-999,-999,-999");
        setField(term162000, term162000.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term162124, term162124.getClass(), "year", 2026);
        setShortField(term162124, term162124.getClass(), "month", (short) 8);
        setShortField(term162124, term162124.getClass(), "day", (short) 12);
        setField(term162123, term162123.getClass(), "date", term162124);
        setByteField(term162128, term162128.getClass(), "hour", (byte) 2);
        setByteField(term162128, term162128.getClass(), "minute", (byte) 2);
        setByteField(term162128, term162128.getClass(), "second", (byte) 47);
        setIntField(term162128, term162128.getClass(), "nano", 704157000);
        setField(term162123, term162123.getClass(), "time", term162128);
        setField(term162000, term162000.getClass(), "commonModuleSetTime", term162123);
        setField(term162000, term162000.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term162000, term162000.getClass(), "commonSkin", -1);
        setIntField(term162000, term162000.getClass(), "headphoneVolume", 100);
        setBooleanField(term162000, term162000.getClass(), "buttonSeOn", true);
        setIntField(term162000, term162000.getClass(), "buttonSeVolume", 100);
        setIntField(term162000, term162000.getClass(), "sliderSeVolume", 100);
        setIntField(term162000, term162000.getClass(), "buttonSe", -1);
        setIntField(term162000, term162000.getClass(), "chainSlideSe", -1);
        setIntField(term162000, term162000.getClass(), "slideSe", -1);
        setIntField(term162000, term162000.getClass(), "sliderTouchSe", -1);
        setField(term162000, term162000.getClass(), "sortMode", enum361);
        setIntField(term162000, term162000.getClass(), "nextPvId", -1);
        setField(term162000, term162000.getClass(), "nextDifficulty", enum362);
        setField(term162000, term162000.getClass(), "nextEdition", enum363);
        setBooleanField(term162000, term162000.getClass(), "showInterimRanking", true);
        setBooleanField(term162000, term162000.getClass(), "showClearStatus", true);
        setBooleanField(term162000, term162000.getClass(), "showGreatBorder", true);
        setBooleanField(term162000, term162000.getClass(), "showExcellentBorder", true);
        setBooleanField(term162000, term162000.getClass(), "showRivalBorder", true);
        setBooleanField(term162000, term162000.getClass(), "showRgoSetting", true);
        setBooleanField(term162000, term162000.getClass(), "contestNowPlayingEnable", true);
        setIntField(term162000, term162000.getClass(), "contestNowPlayingId", -1);
        setIntField(term162000, term162000.getClass(), "contestNowPlayingValue", -1);
        setField(term162000, term162000.getClass(), "contestNowPlayingResultRank", enum364);
        setField(term162000, term162000.getClass(), "contestNowPlayingSpecifier", "");
        setField(term162000, term162000.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term162000, term162000.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term162000, term162000.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term162000, term162000.getClass(), "rivalPdId", -1);
        setField(term161998, term161998.getClass(), "pdId", term162000);
        setIntField(term161998, term161998.getClass(), "pvId", 314478878);
        setField(term161998, term161998.getClass(), "difficulty", enum365);
        setField(term161998, term161998.getClass(), "edition", enum366);
        setIntField(term161998, term161998.getClass(), "scriptVer", 1425342686);
        setIntField(term161998, term161998.getClass(), "score", -1042470635);
        setField(term161998, term161998.getClass(), "challengeKind", enum367);
        setIntField(term161998, term161998.getClass(), "challengeResult", -524352937);
        setField(term161998, term161998.getClass(), "clearResult", enum368);
        setIntField(term161998, term161998.getClass(), "vp", 1472218987);
        setIntField(term161998, term161998.getClass(), "coolCount", 805176809);
        setIntField(term161998, term161998.getClass(), "coolPercent", -82632953);
        setIntField(term161998, term161998.getClass(), "fineCount", -1473876284);
        setIntField(term161998, term161998.getClass(), "finePercent", -1389314671);
        setIntField(term161998, term161998.getClass(), "safeCount", -499699841);
        setIntField(term161998, term161998.getClass(), "safePercent", 360972386);
        setIntField(term161998, term161998.getClass(), "sadCount", -2063884849);
        setIntField(term161998, term161998.getClass(), "sadPercent", 1054887169);
        setIntField(term161998, term161998.getClass(), "wrongCount", 692873905);
        setIntField(term161998, term161998.getClass(), "wrongPercent", 1734759369);
        setIntField(term161998, term161998.getClass(), "maxCombo", 1841493736);
        setIntField(term161998, term161998.getClass(), "chanceTime", 320739944);
        setIntField(term161998, term161998.getClass(), "holdScore", 760218111);
        setIntField(term161998, term161998.getClass(), "attainPoint", -1986366126);
        setIntField(term161998, term161998.getClass(), "skinId", -1963228619);
        setIntField(term161998, term161998.getClass(), "buttonSe", -709868952);
        setIntField(term161998, term161998.getClass(), "buttonSeVol", 847207929);
        setIntField(term161998, term161998.getClass(), "sliderSe", -1665928103);
        setIntField(term161998, term161998.getClass(), "ChainSlideSe", 1574458332);
        setIntField(term161998, term161998.getClass(), "SliderTouchSe", -975856245);
        setField(term161998, term161998.getClass(), "modules", "swZVeJAxjt");
        setIntField(term161998, term161998.getClass(), "stageCompletion", -1023366103);
        setIntField(term161998, term161998.getClass(), "slideScore", 81427089);
        setIntField(term161998, term161998.getClass(), "isVocalChange", 755951489);
        setField(term161998, term161998.getClass(), "customizeItems", "xOcJIiQQDu");
        setField(term161998, term161998.getClass(), "rhythmGameOptions", "GVizqqzXpy");
        setIntField(term161998, term161998.getClass(), "screenShotCount", -1);
        setIntField(term162718, term162718.getClass(), "year", 2012);
        setShortField(term162718, term162718.getClass(), "month", (short) 3);
        setShortField(term162718, term162718.getClass(), "day", (short) 27);
        setField(term162717, term162717.getClass(), "date", term162718);
        setByteField(term162722, term162722.getClass(), "hour", (byte) 17);
        setByteField(term162722, term162722.getClass(), "minute", (byte) 49);
        setByteField(term162722, term162722.getClass(), "second", (byte) 24);
        setIntField(term162722, term162722.getClass(), "nano", 530647398);
        setField(term162717, term162717.getClass(), "time", term162722);
        setField(term161998, term161998.getClass(), "dateTime", term162717);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getChainSlideSe", argTypes, term161998, args);
    }

};


