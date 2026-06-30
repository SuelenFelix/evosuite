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

public class PlayerContest_getStartCount_246999684 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10103;

    public PlayerContest_getStartCount_246999684() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10731 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term10730 = ((Class) term10731).getDeclaredField((String) "MISS");
        ((Field) term10730).setAccessible(true);
        Object enum20 = ((Field) term10730).get((Object) null);
        Class<? extends Object> term11108 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term11107 = ((Class) term11108).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term11107).setAccessible(true);
        Object enum21 = ((Field) term11107).get((Object) null);
        Class<? extends Object> term11391 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term11390 = ((Class) term11391).getDeclaredField((String) "NORMAL");
        ((Field) term11390).setAccessible(true);
        Object enum22 = ((Field) term11390).get((Object) null);
        Class<? extends Object> term11666 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term11665 = ((Class) term11666).getDeclaredField((String) "ORIGINAL");
        ((Field) term11665).setAccessible(true);
        Object enum23 = ((Field) term11665).get((Object) null);
        Class<? extends Object> term11932 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term11931 = ((Class) term11932).getDeclaredField((String) "NONE");
        ((Field) term11931).setAccessible(true);
        Object enum24 = ((Field) term11931).get((Object) null);
        term10103 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerContest"));
        Object term10105 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term10228 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10229 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10233 = newInstance(Class.forName("java.time.LocalTime"));
        Object term10714 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10715 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10719 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term10103, term10103.getClass(), "id", 6811161968424632369L);
        setLongField(term10105, term10105.getClass(), "id", -7237588299778557629L);
        setIntField(term10105, term10105.getClass(), "pdId", 597278769);
        setField(term10105, term10105.getClass(), "playerName", "xxx");
        setIntField(term10105, term10105.getClass(), "vocaloidPoints", 300);
        setIntField(term10105, term10105.getClass(), "level", 1);
        setIntField(term10105, term10105.getClass(), "levelExp", -1685132342);
        setField(term10105, term10105.getClass(), "levelTitle", "xxx");
        setIntField(term10105, term10105.getClass(), "plateId", -1);
        setIntField(term10105, term10105.getClass(), "plateEffectId", -1);
        setField(term10105, term10105.getClass(), "passwordStatus", enum20);
        setField(term10105, term10105.getClass(), "password", "**********");
        setBooleanField(term10105, term10105.getClass(), "preferPerPvModule", true);
        setBooleanField(term10105, term10105.getClass(), "preferCommonModule", true);
        setBooleanField(term10105, term10105.getClass(), "usePerPvSkin", true);
        setBooleanField(term10105, term10105.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term10105, term10105.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term10105, term10105.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term10105, term10105.getClass(), "usePerPvTouchSliderSe", true);
        setField(term10105, term10105.getClass(), "commonModule", "-999,-999,-999");
        setField(term10105, term10105.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term10229, term10229.getClass(), "year", 2026);
        setShortField(term10229, term10229.getClass(), "month", (short) 6);
        setShortField(term10229, term10229.getClass(), "day", (short) 29);
        setField(term10228, term10228.getClass(), "date", term10229);
        setByteField(term10233, term10233.getClass(), "hour", (byte) 4);
        setByteField(term10233, term10233.getClass(), "minute", (byte) 27);
        setByteField(term10233, term10233.getClass(), "second", (byte) 12);
        setIntField(term10233, term10233.getClass(), "nano", 166955000);
        setField(term10228, term10228.getClass(), "time", term10233);
        setField(term10105, term10105.getClass(), "commonModuleSetTime", term10228);
        setField(term10105, term10105.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term10105, term10105.getClass(), "commonSkin", -1);
        setIntField(term10105, term10105.getClass(), "headphoneVolume", 100);
        setBooleanField(term10105, term10105.getClass(), "buttonSeOn", true);
        setIntField(term10105, term10105.getClass(), "buttonSeVolume", 100);
        setIntField(term10105, term10105.getClass(), "sliderSeVolume", 100);
        setIntField(term10105, term10105.getClass(), "buttonSe", -1);
        setIntField(term10105, term10105.getClass(), "chainSlideSe", -1);
        setIntField(term10105, term10105.getClass(), "slideSe", -1);
        setIntField(term10105, term10105.getClass(), "sliderTouchSe", -1);
        setField(term10105, term10105.getClass(), "sortMode", enum21);
        setIntField(term10105, term10105.getClass(), "nextPvId", -1);
        setField(term10105, term10105.getClass(), "nextDifficulty", enum22);
        setField(term10105, term10105.getClass(), "nextEdition", enum23);
        setBooleanField(term10105, term10105.getClass(), "showInterimRanking", true);
        setBooleanField(term10105, term10105.getClass(), "showClearStatus", true);
        setBooleanField(term10105, term10105.getClass(), "showGreatBorder", true);
        setBooleanField(term10105, term10105.getClass(), "showExcellentBorder", true);
        setBooleanField(term10105, term10105.getClass(), "showRivalBorder", true);
        setBooleanField(term10105, term10105.getClass(), "showRgoSetting", true);
        setBooleanField(term10105, term10105.getClass(), "contestNowPlayingEnable", false);
        setIntField(term10105, term10105.getClass(), "contestNowPlayingId", -1);
        setIntField(term10105, term10105.getClass(), "contestNowPlayingValue", -1);
        setField(term10105, term10105.getClass(), "contestNowPlayingResultRank", enum24);
        setField(term10105, term10105.getClass(), "contestNowPlayingSpecifier", "");
        setField(term10105, term10105.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term10105, term10105.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term10105, term10105.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term10105, term10105.getClass(), "rivalPdId", -1);
        setField(term10103, term10103.getClass(), "pdId", term10105);
        setIntField(term10103, term10103.getClass(), "contestId", -1456670397);
        setIntField(term10103, term10103.getClass(), "startCount", 1622346318);
        setField(term10103, term10103.getClass(), "resultRank", enum24);
        setIntField(term10103, term10103.getClass(), "bestValue", -1);
        setIntField(term10103, term10103.getClass(), "flag", -1);
        setIntField(term10715, term10715.getClass(), "year", 2026);
        setShortField(term10715, term10715.getClass(), "month", (short) 6);
        setShortField(term10715, term10715.getClass(), "day", (short) 29);
        setField(term10714, term10714.getClass(), "date", term10715);
        setByteField(term10719, term10719.getClass(), "hour", (byte) 4);
        setByteField(term10719, term10719.getClass(), "minute", (byte) 27);
        setByteField(term10719, term10719.getClass(), "second", (byte) 12);
        setIntField(term10719, term10719.getClass(), "nano", 166736000);
        setField(term10714, term10714.getClass(), "time", term10719);
        setField(term10103, term10103.getClass(), "lastUpdateTime", term10714);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerContest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStartCount", argTypes, term10103, args);
    }

};


