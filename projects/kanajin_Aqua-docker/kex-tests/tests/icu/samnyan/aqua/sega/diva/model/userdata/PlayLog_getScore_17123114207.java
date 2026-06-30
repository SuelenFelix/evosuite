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

public class PlayLog_getScore_17123114207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80869;

    public PlayLog_getScore_17123114207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term81608 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term81607 = ((Class) term81608).getDeclaredField((String) "MISS");
        ((Field) term81607).setAccessible(true);
        Object enum169 = ((Field) term81607).get((Object) null);
        Class<? extends Object> term81985 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term81984 = ((Class) term81985).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term81984).setAccessible(true);
        Object enum170 = ((Field) term81984).get((Object) null);
        Class<? extends Object> term82268 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term82267 = ((Class) term82268).getDeclaredField((String) "NORMAL");
        ((Field) term82267).setAccessible(true);
        Object enum171 = ((Field) term82267).get((Object) null);
        Class<? extends Object> term82543 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term82542 = ((Class) term82543).getDeclaredField((String) "ORIGINAL");
        ((Field) term82542).setAccessible(true);
        Object enum172 = ((Field) term82542).get((Object) null);
        Class<? extends Object> term82809 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term82808 = ((Class) term82809).getDeclaredField((String) "NONE");
        ((Field) term82808).setAccessible(true);
        Object enum173 = ((Field) term82808).get((Object) null);
        Class<? extends Object> term83450 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term83449 = ((Class) term83450).getDeclaredField((String) "EXTREME");
        ((Field) term83449).setAccessible(true);
        Object enum174 = ((Field) term83449).get((Object) null);
        Class<? extends Object> term83728 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term83727 = ((Class) term83728).getDeclaredField((String) "EXTRA");
        ((Field) term83727).setAccessible(true);
        Object enum175 = ((Field) term83727).get((Object) null);
        Class<? extends Object> term83985 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term83984 = ((Class) term83985).getDeclaredField((String) "EXCELLENT");
        ((Field) term83984).setAccessible(true);
        Object enum176 = ((Field) term83984).get((Object) null);
        Class<? extends Object> term84284 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term84283 = ((Class) term84284).getDeclaredField((String) "MISS_TAKE");
        ((Field) term84283).setAccessible(true);
        Object enum177 = ((Field) term84283).get((Object) null);
        term80869 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        Object term80871 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term80994 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term80995 = newInstance(Class.forName("java.time.LocalDate"));
        Object term80999 = newInstance(Class.forName("java.time.LocalTime"));
        Object term81591 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term81592 = newInstance(Class.forName("java.time.LocalDate"));
        Object term81596 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term80869, term80869.getClass(), "id", -3838084482494604218L);
        setLongField(term80871, term80871.getClass(), "id", 3892018155439224435L);
        setIntField(term80871, term80871.getClass(), "pdId", 803925431);
        setField(term80871, term80871.getClass(), "playerName", "xxx");
        setIntField(term80871, term80871.getClass(), "vocaloidPoints", 300);
        setIntField(term80871, term80871.getClass(), "level", 1);
        setIntField(term80871, term80871.getClass(), "levelExp", 76929641);
        setField(term80871, term80871.getClass(), "levelTitle", "xxx");
        setIntField(term80871, term80871.getClass(), "plateId", -1);
        setIntField(term80871, term80871.getClass(), "plateEffectId", -1);
        setField(term80871, term80871.getClass(), "passwordStatus", enum169);
        setField(term80871, term80871.getClass(), "password", "**********");
        setBooleanField(term80871, term80871.getClass(), "preferPerPvModule", true);
        setBooleanField(term80871, term80871.getClass(), "preferCommonModule", true);
        setBooleanField(term80871, term80871.getClass(), "usePerPvSkin", false);
        setBooleanField(term80871, term80871.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term80871, term80871.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term80871, term80871.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term80871, term80871.getClass(), "usePerPvTouchSliderSe", false);
        setField(term80871, term80871.getClass(), "commonModule", "-999,-999,-999");
        setField(term80871, term80871.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term80995, term80995.getClass(), "year", 2026);
        setShortField(term80995, term80995.getClass(), "month", (short) 6);
        setShortField(term80995, term80995.getClass(), "day", (short) 29);
        setField(term80994, term80994.getClass(), "date", term80995);
        setByteField(term80999, term80999.getClass(), "hour", (byte) 4);
        setByteField(term80999, term80999.getClass(), "minute", (byte) 27);
        setByteField(term80999, term80999.getClass(), "second", (byte) 25);
        setIntField(term80999, term80999.getClass(), "nano", 341834000);
        setField(term80994, term80994.getClass(), "time", term80999);
        setField(term80871, term80871.getClass(), "commonModuleSetTime", term80994);
        setField(term80871, term80871.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term80871, term80871.getClass(), "commonSkin", -1);
        setIntField(term80871, term80871.getClass(), "headphoneVolume", 100);
        setBooleanField(term80871, term80871.getClass(), "buttonSeOn", true);
        setIntField(term80871, term80871.getClass(), "buttonSeVolume", 100);
        setIntField(term80871, term80871.getClass(), "sliderSeVolume", 100);
        setIntField(term80871, term80871.getClass(), "buttonSe", -1);
        setIntField(term80871, term80871.getClass(), "chainSlideSe", -1);
        setIntField(term80871, term80871.getClass(), "slideSe", -1);
        setIntField(term80871, term80871.getClass(), "sliderTouchSe", -1);
        setField(term80871, term80871.getClass(), "sortMode", enum170);
        setIntField(term80871, term80871.getClass(), "nextPvId", -1);
        setField(term80871, term80871.getClass(), "nextDifficulty", enum171);
        setField(term80871, term80871.getClass(), "nextEdition", enum172);
        setBooleanField(term80871, term80871.getClass(), "showInterimRanking", true);
        setBooleanField(term80871, term80871.getClass(), "showClearStatus", true);
        setBooleanField(term80871, term80871.getClass(), "showGreatBorder", true);
        setBooleanField(term80871, term80871.getClass(), "showExcellentBorder", true);
        setBooleanField(term80871, term80871.getClass(), "showRivalBorder", true);
        setBooleanField(term80871, term80871.getClass(), "showRgoSetting", true);
        setBooleanField(term80871, term80871.getClass(), "contestNowPlayingEnable", true);
        setIntField(term80871, term80871.getClass(), "contestNowPlayingId", -1);
        setIntField(term80871, term80871.getClass(), "contestNowPlayingValue", -1);
        setField(term80871, term80871.getClass(), "contestNowPlayingResultRank", enum173);
        setField(term80871, term80871.getClass(), "contestNowPlayingSpecifier", "");
        setField(term80871, term80871.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term80871, term80871.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term80871, term80871.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term80871, term80871.getClass(), "rivalPdId", -1);
        setField(term80869, term80869.getClass(), "pdId", term80871);
        setIntField(term80869, term80869.getClass(), "pvId", -2003192918);
        setField(term80869, term80869.getClass(), "difficulty", enum174);
        setField(term80869, term80869.getClass(), "edition", enum175);
        setIntField(term80869, term80869.getClass(), "scriptVer", -1362856620);
        setIntField(term80869, term80869.getClass(), "score", -1835839814);
        setField(term80869, term80869.getClass(), "challengeKind", enum176);
        setIntField(term80869, term80869.getClass(), "challengeResult", -1404350380);
        setField(term80869, term80869.getClass(), "clearResult", enum177);
        setIntField(term80869, term80869.getClass(), "vp", -2013924238);
        setIntField(term80869, term80869.getClass(), "coolCount", 579006268);
        setIntField(term80869, term80869.getClass(), "coolPercent", -1694747156);
        setIntField(term80869, term80869.getClass(), "fineCount", 1466373988);
        setIntField(term80869, term80869.getClass(), "finePercent", -358526505);
        setIntField(term80869, term80869.getClass(), "safeCount", 1843268026);
        setIntField(term80869, term80869.getClass(), "safePercent", 954660603);
        setIntField(term80869, term80869.getClass(), "sadCount", -1351605385);
        setIntField(term80869, term80869.getClass(), "sadPercent", 278355793);
        setIntField(term80869, term80869.getClass(), "wrongCount", -310648604);
        setIntField(term80869, term80869.getClass(), "wrongPercent", -648200466);
        setIntField(term80869, term80869.getClass(), "maxCombo", 2007134147);
        setIntField(term80869, term80869.getClass(), "chanceTime", 993388358);
        setIntField(term80869, term80869.getClass(), "holdScore", -765191335);
        setIntField(term80869, term80869.getClass(), "attainPoint", -1697741155);
        setIntField(term80869, term80869.getClass(), "skinId", 1295839803);
        setIntField(term80869, term80869.getClass(), "buttonSe", -1891015523);
        setIntField(term80869, term80869.getClass(), "buttonSeVol", -1560631747);
        setIntField(term80869, term80869.getClass(), "sliderSe", 1215150180);
        setIntField(term80869, term80869.getClass(), "ChainSlideSe", -1422859977);
        setIntField(term80869, term80869.getClass(), "SliderTouchSe", -1972436591);
        setField(term80869, term80869.getClass(), "modules", "RkybSrpybU");
        setIntField(term80869, term80869.getClass(), "stageCompletion", 68922753);
        setIntField(term80869, term80869.getClass(), "slideScore", -220791533);
        setIntField(term80869, term80869.getClass(), "isVocalChange", 1741500243);
        setField(term80869, term80869.getClass(), "customizeItems", "xOEqzGAmDU");
        setField(term80869, term80869.getClass(), "rhythmGameOptions", "eZFUvlxvGV");
        setIntField(term80869, term80869.getClass(), "screenShotCount", -1);
        setIntField(term81592, term81592.getClass(), "year", 2022);
        setShortField(term81592, term81592.getClass(), "month", (short) 11);
        setShortField(term81592, term81592.getClass(), "day", (short) 16);
        setField(term81591, term81591.getClass(), "date", term81592);
        setByteField(term81596, term81596.getClass(), "hour", (byte) 15);
        setByteField(term81596, term81596.getClass(), "minute", (byte) 54);
        setByteField(term81596, term81596.getClass(), "second", (byte) 2);
        setIntField(term81596, term81596.getClass(), "nano", 733274103);
        setField(term81591, term81591.getClass(), "time", term81596);
        setField(term80869, term80869.getClass(), "dateTime", term81591);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getScore", argTypes, term80869, args);
    }

};


