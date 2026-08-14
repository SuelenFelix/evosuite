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

public class PlayerContest_setResultRank_125984581713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33357;
     Object enum69;

    public PlayerContest_setResultRank_125984581713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term33985 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term33984 = ((Class) term33985).getDeclaredField((String) "MISS");
        ((Field) term33984).setAccessible(true);
        Object enum65 = ((Field) term33984).get((Object) null);
        Class<? extends Object> term34362 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term34361 = ((Class) term34362).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term34361).setAccessible(true);
        Object enum66 = ((Field) term34361).get((Object) null);
        Class<? extends Object> term34645 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term34644 = ((Class) term34645).getDeclaredField((String) "NORMAL");
        ((Field) term34644).setAccessible(true);
        Object enum67 = ((Field) term34644).get((Object) null);
        Class<? extends Object> term34920 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term34919 = ((Class) term34920).getDeclaredField((String) "ORIGINAL");
        ((Field) term34919).setAccessible(true);
        Object enum68 = ((Field) term34919).get((Object) null);
        Class<? extends Object> term35186 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term35185 = ((Class) term35186).getDeclaredField((String) "NONE");
        ((Field) term35185).setAccessible(true);
        enum69 = ((Field) term35185).get((Object) null);
        term33357 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerContest"));
        Object term33359 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term33482 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term33483 = newInstance(Class.forName("java.time.LocalDate"));
        Object term33487 = newInstance(Class.forName("java.time.LocalTime"));
        Object term33968 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term33969 = newInstance(Class.forName("java.time.LocalDate"));
        Object term33973 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term33357, term33357.getClass(), "id", -4502405999831680926L);
        setLongField(term33359, term33359.getClass(), "id", 1967728129628047933L);
        setIntField(term33359, term33359.getClass(), "pdId", 292681826);
        setField(term33359, term33359.getClass(), "playerName", "xxx");
        setIntField(term33359, term33359.getClass(), "vocaloidPoints", 300);
        setIntField(term33359, term33359.getClass(), "level", 1);
        setIntField(term33359, term33359.getClass(), "levelExp", 458147407);
        setField(term33359, term33359.getClass(), "levelTitle", "xxx");
        setIntField(term33359, term33359.getClass(), "plateId", -1);
        setIntField(term33359, term33359.getClass(), "plateEffectId", -1);
        setField(term33359, term33359.getClass(), "passwordStatus", enum65);
        setField(term33359, term33359.getClass(), "password", "**********");
        setBooleanField(term33359, term33359.getClass(), "preferPerPvModule", true);
        setBooleanField(term33359, term33359.getClass(), "preferCommonModule", true);
        setBooleanField(term33359, term33359.getClass(), "usePerPvSkin", false);
        setBooleanField(term33359, term33359.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term33359, term33359.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term33359, term33359.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term33359, term33359.getClass(), "usePerPvTouchSliderSe", false);
        setField(term33359, term33359.getClass(), "commonModule", "-999,-999,-999");
        setField(term33359, term33359.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term33483, term33483.getClass(), "year", 2026);
        setShortField(term33483, term33483.getClass(), "month", (short) 8);
        setShortField(term33483, term33483.getClass(), "day", (short) 12);
        setField(term33482, term33482.getClass(), "date", term33483);
        setByteField(term33487, term33487.getClass(), "hour", (byte) 2);
        setByteField(term33487, term33487.getClass(), "minute", (byte) 2);
        setByteField(term33487, term33487.getClass(), "second", (byte) 31);
        setIntField(term33487, term33487.getClass(), "nano", 361465000);
        setField(term33482, term33482.getClass(), "time", term33487);
        setField(term33359, term33359.getClass(), "commonModuleSetTime", term33482);
        setField(term33359, term33359.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term33359, term33359.getClass(), "commonSkin", -1);
        setIntField(term33359, term33359.getClass(), "headphoneVolume", 100);
        setBooleanField(term33359, term33359.getClass(), "buttonSeOn", true);
        setIntField(term33359, term33359.getClass(), "buttonSeVolume", 100);
        setIntField(term33359, term33359.getClass(), "sliderSeVolume", 100);
        setIntField(term33359, term33359.getClass(), "buttonSe", -1);
        setIntField(term33359, term33359.getClass(), "chainSlideSe", -1);
        setIntField(term33359, term33359.getClass(), "slideSe", -1);
        setIntField(term33359, term33359.getClass(), "sliderTouchSe", -1);
        setField(term33359, term33359.getClass(), "sortMode", enum66);
        setIntField(term33359, term33359.getClass(), "nextPvId", -1);
        setField(term33359, term33359.getClass(), "nextDifficulty", enum67);
        setField(term33359, term33359.getClass(), "nextEdition", enum68);
        setBooleanField(term33359, term33359.getClass(), "showInterimRanking", true);
        setBooleanField(term33359, term33359.getClass(), "showClearStatus", true);
        setBooleanField(term33359, term33359.getClass(), "showGreatBorder", true);
        setBooleanField(term33359, term33359.getClass(), "showExcellentBorder", true);
        setBooleanField(term33359, term33359.getClass(), "showRivalBorder", true);
        setBooleanField(term33359, term33359.getClass(), "showRgoSetting", true);
        setBooleanField(term33359, term33359.getClass(), "contestNowPlayingEnable", true);
        setIntField(term33359, term33359.getClass(), "contestNowPlayingId", -1);
        setIntField(term33359, term33359.getClass(), "contestNowPlayingValue", -1);
        setField(term33359, term33359.getClass(), "contestNowPlayingResultRank", enum69);
        setField(term33359, term33359.getClass(), "contestNowPlayingSpecifier", "");
        setField(term33359, term33359.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term33359, term33359.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term33359, term33359.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term33359, term33359.getClass(), "rivalPdId", -1);
        setField(term33357, term33357.getClass(), "pdId", term33359);
        setIntField(term33357, term33357.getClass(), "contestId", -184153539);
        setIntField(term33357, term33357.getClass(), "startCount", 493620644);
        setField(term33357, term33357.getClass(), "resultRank", enum69);
        setIntField(term33357, term33357.getClass(), "bestValue", -1);
        setIntField(term33357, term33357.getClass(), "flag", -1);
        setIntField(term33969, term33969.getClass(), "year", 2026);
        setShortField(term33969, term33969.getClass(), "month", (short) 8);
        setShortField(term33969, term33969.getClass(), "day", (short) 12);
        setField(term33968, term33968.getClass(), "date", term33969);
        setByteField(term33973, term33973.getClass(), "hour", (byte) 2);
        setByteField(term33973, term33973.getClass(), "minute", (byte) 2);
        setByteField(term33973, term33973.getClass(), "second", (byte) 31);
        setIntField(term33973, term33973.getClass(), "nano", 361305000);
        setField(term33968, term33968.getClass(), "time", term33973);
        setField(term33357, term33357.getClass(), "lastUpdateTime", term33968);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerContest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Object[] args = new Object[1];
        args[0] = enum69;
        callMethod(klass, "setResultRank", argTypes, term33357, args);
    }

};


