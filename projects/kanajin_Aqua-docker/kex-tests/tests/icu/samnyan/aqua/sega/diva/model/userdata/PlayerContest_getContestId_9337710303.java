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

public class PlayerContest_getContestId_9337710303 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7634;

    public PlayerContest_getContestId_9337710303() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8262 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term8261 = ((Class) term8262).getDeclaredField((String) "MISS");
        ((Field) term8261).setAccessible(true);
        Object enum15 = ((Field) term8261).get((Object) null);
        Class<? extends Object> term8639 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term8638 = ((Class) term8639).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term8638).setAccessible(true);
        Object enum16 = ((Field) term8638).get((Object) null);
        Class<? extends Object> term8922 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term8921 = ((Class) term8922).getDeclaredField((String) "NORMAL");
        ((Field) term8921).setAccessible(true);
        Object enum17 = ((Field) term8921).get((Object) null);
        Class<? extends Object> term9197 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term9196 = ((Class) term9197).getDeclaredField((String) "ORIGINAL");
        ((Field) term9196).setAccessible(true);
        Object enum18 = ((Field) term9196).get((Object) null);
        Class<? extends Object> term9463 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term9462 = ((Class) term9463).getDeclaredField((String) "NONE");
        ((Field) term9462).setAccessible(true);
        Object enum19 = ((Field) term9462).get((Object) null);
        term7634 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerContest"));
        Object term7636 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term7759 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7760 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7764 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8245 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8246 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8250 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term7634, term7634.getClass(), "id", 7411271909051562686L);
        setLongField(term7636, term7636.getClass(), "id", 4872422362414183754L);
        setIntField(term7636, term7636.getClass(), "pdId", -522618178);
        setField(term7636, term7636.getClass(), "playerName", "xxx");
        setIntField(term7636, term7636.getClass(), "vocaloidPoints", 300);
        setIntField(term7636, term7636.getClass(), "level", 1);
        setIntField(term7636, term7636.getClass(), "levelExp", 1134449235);
        setField(term7636, term7636.getClass(), "levelTitle", "xxx");
        setIntField(term7636, term7636.getClass(), "plateId", -1);
        setIntField(term7636, term7636.getClass(), "plateEffectId", -1);
        setField(term7636, term7636.getClass(), "passwordStatus", enum15);
        setField(term7636, term7636.getClass(), "password", "**********");
        setBooleanField(term7636, term7636.getClass(), "preferPerPvModule", true);
        setBooleanField(term7636, term7636.getClass(), "preferCommonModule", true);
        setBooleanField(term7636, term7636.getClass(), "usePerPvSkin", true);
        setBooleanField(term7636, term7636.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term7636, term7636.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term7636, term7636.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term7636, term7636.getClass(), "usePerPvTouchSliderSe", false);
        setField(term7636, term7636.getClass(), "commonModule", "-999,-999,-999");
        setField(term7636, term7636.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term7760, term7760.getClass(), "year", 2026);
        setShortField(term7760, term7760.getClass(), "month", (short) 6);
        setShortField(term7760, term7760.getClass(), "day", (short) 29);
        setField(term7759, term7759.getClass(), "date", term7760);
        setByteField(term7764, term7764.getClass(), "hour", (byte) 4);
        setByteField(term7764, term7764.getClass(), "minute", (byte) 27);
        setByteField(term7764, term7764.getClass(), "second", (byte) 11);
        setIntField(term7764, term7764.getClass(), "nano", 785380000);
        setField(term7759, term7759.getClass(), "time", term7764);
        setField(term7636, term7636.getClass(), "commonModuleSetTime", term7759);
        setField(term7636, term7636.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term7636, term7636.getClass(), "commonSkin", -1);
        setIntField(term7636, term7636.getClass(), "headphoneVolume", 100);
        setBooleanField(term7636, term7636.getClass(), "buttonSeOn", true);
        setIntField(term7636, term7636.getClass(), "buttonSeVolume", 100);
        setIntField(term7636, term7636.getClass(), "sliderSeVolume", 100);
        setIntField(term7636, term7636.getClass(), "buttonSe", -1);
        setIntField(term7636, term7636.getClass(), "chainSlideSe", -1);
        setIntField(term7636, term7636.getClass(), "slideSe", -1);
        setIntField(term7636, term7636.getClass(), "sliderTouchSe", -1);
        setField(term7636, term7636.getClass(), "sortMode", enum16);
        setIntField(term7636, term7636.getClass(), "nextPvId", -1);
        setField(term7636, term7636.getClass(), "nextDifficulty", enum17);
        setField(term7636, term7636.getClass(), "nextEdition", enum18);
        setBooleanField(term7636, term7636.getClass(), "showInterimRanking", true);
        setBooleanField(term7636, term7636.getClass(), "showClearStatus", true);
        setBooleanField(term7636, term7636.getClass(), "showGreatBorder", true);
        setBooleanField(term7636, term7636.getClass(), "showExcellentBorder", true);
        setBooleanField(term7636, term7636.getClass(), "showRivalBorder", true);
        setBooleanField(term7636, term7636.getClass(), "showRgoSetting", true);
        setBooleanField(term7636, term7636.getClass(), "contestNowPlayingEnable", false);
        setIntField(term7636, term7636.getClass(), "contestNowPlayingId", -1);
        setIntField(term7636, term7636.getClass(), "contestNowPlayingValue", -1);
        setField(term7636, term7636.getClass(), "contestNowPlayingResultRank", enum19);
        setField(term7636, term7636.getClass(), "contestNowPlayingSpecifier", "");
        setField(term7636, term7636.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term7636, term7636.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term7636, term7636.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term7636, term7636.getClass(), "rivalPdId", -1);
        setField(term7634, term7634.getClass(), "pdId", term7636);
        setIntField(term7634, term7634.getClass(), "contestId", -883034806);
        setIntField(term7634, term7634.getClass(), "startCount", 1585847225);
        setField(term7634, term7634.getClass(), "resultRank", enum19);
        setIntField(term7634, term7634.getClass(), "bestValue", -1);
        setIntField(term7634, term7634.getClass(), "flag", -1);
        setIntField(term8246, term8246.getClass(), "year", 2026);
        setShortField(term8246, term8246.getClass(), "month", (short) 6);
        setShortField(term8246, term8246.getClass(), "day", (short) 29);
        setField(term8245, term8245.getClass(), "date", term8246);
        setByteField(term8250, term8250.getClass(), "hour", (byte) 4);
        setByteField(term8250, term8250.getClass(), "minute", (byte) 27);
        setByteField(term8250, term8250.getClass(), "second", (byte) 11);
        setIntField(term8250, term8250.getClass(), "nano", 785127000);
        setField(term8245, term8245.getClass(), "time", term8250);
        setField(term7634, term7634.getClass(), "lastUpdateTime", term8245);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerContest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getContestId", argTypes, term7634, args);
    }

};


