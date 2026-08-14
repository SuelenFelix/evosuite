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

public class PlayerContest_hashCode_202295298419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48187;

    public PlayerContest_hashCode_202295298419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term48815 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term48814 = ((Class) term48815).getDeclaredField((String) "MISS");
        ((Field) term48814).setAccessible(true);
        Object enum95 = ((Field) term48814).get((Object) null);
        Class<? extends Object> term49192 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term49191 = ((Class) term49192).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term49191).setAccessible(true);
        Object enum96 = ((Field) term49191).get((Object) null);
        Class<? extends Object> term49475 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term49474 = ((Class) term49475).getDeclaredField((String) "NORMAL");
        ((Field) term49474).setAccessible(true);
        Object enum97 = ((Field) term49474).get((Object) null);
        Class<? extends Object> term49750 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term49749 = ((Class) term49750).getDeclaredField((String) "ORIGINAL");
        ((Field) term49749).setAccessible(true);
        Object enum98 = ((Field) term49749).get((Object) null);
        Class<? extends Object> term50016 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term50015 = ((Class) term50016).getDeclaredField((String) "NONE");
        ((Field) term50015).setAccessible(true);
        Object enum99 = ((Field) term50015).get((Object) null);
        term48187 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerContest"));
        Object term48189 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term48312 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term48313 = newInstance(Class.forName("java.time.LocalDate"));
        Object term48317 = newInstance(Class.forName("java.time.LocalTime"));
        Object term48798 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term48799 = newInstance(Class.forName("java.time.LocalDate"));
        Object term48803 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term48187, term48187.getClass(), "id", 5907001541142728739L);
        setLongField(term48189, term48189.getClass(), "id", 4178434741742309755L);
        setIntField(term48189, term48189.getClass(), "pdId", 1655935355);
        setField(term48189, term48189.getClass(), "playerName", "xxx");
        setIntField(term48189, term48189.getClass(), "vocaloidPoints", 300);
        setIntField(term48189, term48189.getClass(), "level", 1);
        setIntField(term48189, term48189.getClass(), "levelExp", -481533957);
        setField(term48189, term48189.getClass(), "levelTitle", "xxx");
        setIntField(term48189, term48189.getClass(), "plateId", -1);
        setIntField(term48189, term48189.getClass(), "plateEffectId", -1);
        setField(term48189, term48189.getClass(), "passwordStatus", enum95);
        setField(term48189, term48189.getClass(), "password", "**********");
        setBooleanField(term48189, term48189.getClass(), "preferPerPvModule", true);
        setBooleanField(term48189, term48189.getClass(), "preferCommonModule", true);
        setBooleanField(term48189, term48189.getClass(), "usePerPvSkin", false);
        setBooleanField(term48189, term48189.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term48189, term48189.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term48189, term48189.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term48189, term48189.getClass(), "usePerPvTouchSliderSe", true);
        setField(term48189, term48189.getClass(), "commonModule", "-999,-999,-999");
        setField(term48189, term48189.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term48313, term48313.getClass(), "year", 2026);
        setShortField(term48313, term48313.getClass(), "month", (short) 8);
        setShortField(term48313, term48313.getClass(), "day", (short) 12);
        setField(term48312, term48312.getClass(), "date", term48313);
        setByteField(term48317, term48317.getClass(), "hour", (byte) 2);
        setByteField(term48317, term48317.getClass(), "minute", (byte) 2);
        setByteField(term48317, term48317.getClass(), "second", (byte) 33);
        setIntField(term48317, term48317.getClass(), "nano", 39373000);
        setField(term48312, term48312.getClass(), "time", term48317);
        setField(term48189, term48189.getClass(), "commonModuleSetTime", term48312);
        setField(term48189, term48189.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term48189, term48189.getClass(), "commonSkin", -1);
        setIntField(term48189, term48189.getClass(), "headphoneVolume", 100);
        setBooleanField(term48189, term48189.getClass(), "buttonSeOn", true);
        setIntField(term48189, term48189.getClass(), "buttonSeVolume", 100);
        setIntField(term48189, term48189.getClass(), "sliderSeVolume", 100);
        setIntField(term48189, term48189.getClass(), "buttonSe", -1);
        setIntField(term48189, term48189.getClass(), "chainSlideSe", -1);
        setIntField(term48189, term48189.getClass(), "slideSe", -1);
        setIntField(term48189, term48189.getClass(), "sliderTouchSe", -1);
        setField(term48189, term48189.getClass(), "sortMode", enum96);
        setIntField(term48189, term48189.getClass(), "nextPvId", -1);
        setField(term48189, term48189.getClass(), "nextDifficulty", enum97);
        setField(term48189, term48189.getClass(), "nextEdition", enum98);
        setBooleanField(term48189, term48189.getClass(), "showInterimRanking", true);
        setBooleanField(term48189, term48189.getClass(), "showClearStatus", true);
        setBooleanField(term48189, term48189.getClass(), "showGreatBorder", true);
        setBooleanField(term48189, term48189.getClass(), "showExcellentBorder", true);
        setBooleanField(term48189, term48189.getClass(), "showRivalBorder", true);
        setBooleanField(term48189, term48189.getClass(), "showRgoSetting", true);
        setBooleanField(term48189, term48189.getClass(), "contestNowPlayingEnable", false);
        setIntField(term48189, term48189.getClass(), "contestNowPlayingId", -1);
        setIntField(term48189, term48189.getClass(), "contestNowPlayingValue", -1);
        setField(term48189, term48189.getClass(), "contestNowPlayingResultRank", enum99);
        setField(term48189, term48189.getClass(), "contestNowPlayingSpecifier", "");
        setField(term48189, term48189.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term48189, term48189.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term48189, term48189.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term48189, term48189.getClass(), "rivalPdId", -1);
        setField(term48187, term48187.getClass(), "pdId", term48189);
        setIntField(term48187, term48187.getClass(), "contestId", 1240914516);
        setIntField(term48187, term48187.getClass(), "startCount", -1465035361);
        setField(term48187, term48187.getClass(), "resultRank", enum99);
        setIntField(term48187, term48187.getClass(), "bestValue", -1);
        setIntField(term48187, term48187.getClass(), "flag", -1);
        setIntField(term48799, term48799.getClass(), "year", 2026);
        setShortField(term48799, term48799.getClass(), "month", (short) 8);
        setShortField(term48799, term48799.getClass(), "day", (short) 12);
        setField(term48798, term48798.getClass(), "date", term48799);
        setByteField(term48803, term48803.getClass(), "hour", (byte) 2);
        setByteField(term48803, term48803.getClass(), "minute", (byte) 2);
        setByteField(term48803, term48803.getClass(), "second", (byte) 33);
        setIntField(term48803, term48803.getClass(), "nano", 39235000);
        setField(term48798, term48798.getClass(), "time", term48803);
        setField(term48187, term48187.getClass(), "lastUpdateTime", term48798);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerContest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term48187, args);
    }

};


