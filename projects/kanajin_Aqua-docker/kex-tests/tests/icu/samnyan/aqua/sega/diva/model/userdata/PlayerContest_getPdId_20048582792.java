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

public class PlayerContest_getPdId_20048582792 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5165;

    public PlayerContest_getPdId_20048582792() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5793 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term5792 = ((Class) term5793).getDeclaredField((String) "MISS");
        ((Field) term5792).setAccessible(true);
        Object enum10 = ((Field) term5792).get((Object) null);
        Class<? extends Object> term6170 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term6169 = ((Class) term6170).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term6169).setAccessible(true);
        Object enum11 = ((Field) term6169).get((Object) null);
        Class<? extends Object> term6453 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term6452 = ((Class) term6453).getDeclaredField((String) "NORMAL");
        ((Field) term6452).setAccessible(true);
        Object enum12 = ((Field) term6452).get((Object) null);
        Class<? extends Object> term6728 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term6727 = ((Class) term6728).getDeclaredField((String) "ORIGINAL");
        ((Field) term6727).setAccessible(true);
        Object enum13 = ((Field) term6727).get((Object) null);
        Class<? extends Object> term6994 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term6993 = ((Class) term6994).getDeclaredField((String) "NONE");
        ((Field) term6993).setAccessible(true);
        Object enum14 = ((Field) term6993).get((Object) null);
        term5165 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerContest"));
        Object term5167 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term5290 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5291 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5295 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5776 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5777 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5781 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term5165, term5165.getClass(), "id", -8400487765614892086L);
        setLongField(term5167, term5167.getClass(), "id", 5270370404989704783L);
        setIntField(term5167, term5167.getClass(), "pdId", -2038273078);
        setField(term5167, term5167.getClass(), "playerName", "xxx");
        setIntField(term5167, term5167.getClass(), "vocaloidPoints", 300);
        setIntField(term5167, term5167.getClass(), "level", 1);
        setIntField(term5167, term5167.getClass(), "levelExp", 1227103734);
        setField(term5167, term5167.getClass(), "levelTitle", "xxx");
        setIntField(term5167, term5167.getClass(), "plateId", -1);
        setIntField(term5167, term5167.getClass(), "plateEffectId", -1);
        setField(term5167, term5167.getClass(), "passwordStatus", enum10);
        setField(term5167, term5167.getClass(), "password", "**********");
        setBooleanField(term5167, term5167.getClass(), "preferPerPvModule", true);
        setBooleanField(term5167, term5167.getClass(), "preferCommonModule", false);
        setBooleanField(term5167, term5167.getClass(), "usePerPvSkin", false);
        setBooleanField(term5167, term5167.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term5167, term5167.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term5167, term5167.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term5167, term5167.getClass(), "usePerPvTouchSliderSe", false);
        setField(term5167, term5167.getClass(), "commonModule", "-999,-999,-999");
        setField(term5167, term5167.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term5291, term5291.getClass(), "year", 2026);
        setShortField(term5291, term5291.getClass(), "month", (short) 6);
        setShortField(term5291, term5291.getClass(), "day", (short) 29);
        setField(term5290, term5290.getClass(), "date", term5291);
        setByteField(term5295, term5295.getClass(), "hour", (byte) 4);
        setByteField(term5295, term5295.getClass(), "minute", (byte) 27);
        setByteField(term5295, term5295.getClass(), "second", (byte) 11);
        setIntField(term5295, term5295.getClass(), "nano", 453500000);
        setField(term5290, term5290.getClass(), "time", term5295);
        setField(term5167, term5167.getClass(), "commonModuleSetTime", term5290);
        setField(term5167, term5167.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term5167, term5167.getClass(), "commonSkin", -1);
        setIntField(term5167, term5167.getClass(), "headphoneVolume", 100);
        setBooleanField(term5167, term5167.getClass(), "buttonSeOn", true);
        setIntField(term5167, term5167.getClass(), "buttonSeVolume", 100);
        setIntField(term5167, term5167.getClass(), "sliderSeVolume", 100);
        setIntField(term5167, term5167.getClass(), "buttonSe", -1);
        setIntField(term5167, term5167.getClass(), "chainSlideSe", -1);
        setIntField(term5167, term5167.getClass(), "slideSe", -1);
        setIntField(term5167, term5167.getClass(), "sliderTouchSe", -1);
        setField(term5167, term5167.getClass(), "sortMode", enum11);
        setIntField(term5167, term5167.getClass(), "nextPvId", -1);
        setField(term5167, term5167.getClass(), "nextDifficulty", enum12);
        setField(term5167, term5167.getClass(), "nextEdition", enum13);
        setBooleanField(term5167, term5167.getClass(), "showInterimRanking", true);
        setBooleanField(term5167, term5167.getClass(), "showClearStatus", true);
        setBooleanField(term5167, term5167.getClass(), "showGreatBorder", true);
        setBooleanField(term5167, term5167.getClass(), "showExcellentBorder", true);
        setBooleanField(term5167, term5167.getClass(), "showRivalBorder", true);
        setBooleanField(term5167, term5167.getClass(), "showRgoSetting", true);
        setBooleanField(term5167, term5167.getClass(), "contestNowPlayingEnable", true);
        setIntField(term5167, term5167.getClass(), "contestNowPlayingId", -1);
        setIntField(term5167, term5167.getClass(), "contestNowPlayingValue", -1);
        setField(term5167, term5167.getClass(), "contestNowPlayingResultRank", enum14);
        setField(term5167, term5167.getClass(), "contestNowPlayingSpecifier", "");
        setField(term5167, term5167.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term5167, term5167.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term5167, term5167.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term5167, term5167.getClass(), "rivalPdId", -1);
        setField(term5165, term5165.getClass(), "pdId", term5167);
        setIntField(term5165, term5165.getClass(), "contestId", -1339778481);
        setIntField(term5165, term5165.getClass(), "startCount", 1725571209);
        setField(term5165, term5165.getClass(), "resultRank", enum14);
        setIntField(term5165, term5165.getClass(), "bestValue", -1);
        setIntField(term5165, term5165.getClass(), "flag", -1);
        setIntField(term5777, term5777.getClass(), "year", 2026);
        setShortField(term5777, term5777.getClass(), "month", (short) 6);
        setShortField(term5777, term5777.getClass(), "day", (short) 29);
        setField(term5776, term5776.getClass(), "date", term5777);
        setByteField(term5781, term5781.getClass(), "hour", (byte) 4);
        setByteField(term5781, term5781.getClass(), "minute", (byte) 27);
        setByteField(term5781, term5781.getClass(), "second", (byte) 11);
        setIntField(term5781, term5781.getClass(), "nano", 453286000);
        setField(term5776, term5776.getClass(), "time", term5781);
        setField(term5165, term5165.getClass(), "lastUpdateTime", term5776);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerContest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPdId", argTypes, term5165, args);
    }

};


