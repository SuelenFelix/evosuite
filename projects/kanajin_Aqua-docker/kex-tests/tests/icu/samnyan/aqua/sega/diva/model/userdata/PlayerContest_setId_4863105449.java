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
import java.lang.Long;

public class PlayerContest_setId_4863105449 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22448;
     Object term23069;

    public PlayerContest_setId_4863105449() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term23078 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term23077 = ((Class) term23078).getDeclaredField((String) "MISS");
        ((Field) term23077).setAccessible(true);
        Object enum45 = ((Field) term23077).get((Object) null);
        Class<? extends Object> term23455 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term23454 = ((Class) term23455).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term23454).setAccessible(true);
        Object enum46 = ((Field) term23454).get((Object) null);
        Class<? extends Object> term23738 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term23737 = ((Class) term23738).getDeclaredField((String) "NORMAL");
        ((Field) term23737).setAccessible(true);
        Object enum47 = ((Field) term23737).get((Object) null);
        Class<? extends Object> term24013 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term24012 = ((Class) term24013).getDeclaredField((String) "ORIGINAL");
        ((Field) term24012).setAccessible(true);
        Object enum48 = ((Field) term24012).get((Object) null);
        Class<? extends Object> term24279 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term24278 = ((Class) term24279).getDeclaredField((String) "NONE");
        ((Field) term24278).setAccessible(true);
        Object enum49 = ((Field) term24278).get((Object) null);
        term22448 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerContest"));
        Object term22450 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term22573 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22574 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22578 = newInstance(Class.forName("java.time.LocalTime"));
        Object term23059 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23060 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23064 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term22448, term22448.getClass(), "id", 5127676408959197577L);
        setLongField(term22450, term22450.getClass(), "id", -6573104506744284592L);
        setIntField(term22450, term22450.getClass(), "pdId", -1087774327);
        setField(term22450, term22450.getClass(), "playerName", "xxx");
        setIntField(term22450, term22450.getClass(), "vocaloidPoints", 300);
        setIntField(term22450, term22450.getClass(), "level", 1);
        setIntField(term22450, term22450.getClass(), "levelExp", -1530420153);
        setField(term22450, term22450.getClass(), "levelTitle", "xxx");
        setIntField(term22450, term22450.getClass(), "plateId", -1);
        setIntField(term22450, term22450.getClass(), "plateEffectId", -1);
        setField(term22450, term22450.getClass(), "passwordStatus", enum45);
        setField(term22450, term22450.getClass(), "password", "**********");
        setBooleanField(term22450, term22450.getClass(), "preferPerPvModule", true);
        setBooleanField(term22450, term22450.getClass(), "preferCommonModule", true);
        setBooleanField(term22450, term22450.getClass(), "usePerPvSkin", false);
        setBooleanField(term22450, term22450.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term22450, term22450.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term22450, term22450.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term22450, term22450.getClass(), "usePerPvTouchSliderSe", true);
        setField(term22450, term22450.getClass(), "commonModule", "-999,-999,-999");
        setField(term22450, term22450.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term22574, term22574.getClass(), "year", 2026);
        setShortField(term22574, term22574.getClass(), "month", (short) 8);
        setShortField(term22574, term22574.getClass(), "day", (short) 12);
        setField(term22573, term22573.getClass(), "date", term22574);
        setByteField(term22578, term22578.getClass(), "hour", (byte) 2);
        setByteField(term22578, term22578.getClass(), "minute", (byte) 2);
        setByteField(term22578, term22578.getClass(), "second", (byte) 30);
        setIntField(term22578, term22578.getClass(), "nano", 249130000);
        setField(term22573, term22573.getClass(), "time", term22578);
        setField(term22450, term22450.getClass(), "commonModuleSetTime", term22573);
        setField(term22450, term22450.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term22450, term22450.getClass(), "commonSkin", -1);
        setIntField(term22450, term22450.getClass(), "headphoneVolume", 100);
        setBooleanField(term22450, term22450.getClass(), "buttonSeOn", true);
        setIntField(term22450, term22450.getClass(), "buttonSeVolume", 100);
        setIntField(term22450, term22450.getClass(), "sliderSeVolume", 100);
        setIntField(term22450, term22450.getClass(), "buttonSe", -1);
        setIntField(term22450, term22450.getClass(), "chainSlideSe", -1);
        setIntField(term22450, term22450.getClass(), "slideSe", -1);
        setIntField(term22450, term22450.getClass(), "sliderTouchSe", -1);
        setField(term22450, term22450.getClass(), "sortMode", enum46);
        setIntField(term22450, term22450.getClass(), "nextPvId", -1);
        setField(term22450, term22450.getClass(), "nextDifficulty", enum47);
        setField(term22450, term22450.getClass(), "nextEdition", enum48);
        setBooleanField(term22450, term22450.getClass(), "showInterimRanking", true);
        setBooleanField(term22450, term22450.getClass(), "showClearStatus", true);
        setBooleanField(term22450, term22450.getClass(), "showGreatBorder", true);
        setBooleanField(term22450, term22450.getClass(), "showExcellentBorder", true);
        setBooleanField(term22450, term22450.getClass(), "showRivalBorder", true);
        setBooleanField(term22450, term22450.getClass(), "showRgoSetting", true);
        setBooleanField(term22450, term22450.getClass(), "contestNowPlayingEnable", false);
        setIntField(term22450, term22450.getClass(), "contestNowPlayingId", -1);
        setIntField(term22450, term22450.getClass(), "contestNowPlayingValue", -1);
        setField(term22450, term22450.getClass(), "contestNowPlayingResultRank", enum49);
        setField(term22450, term22450.getClass(), "contestNowPlayingSpecifier", "");
        setField(term22450, term22450.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term22450, term22450.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term22450, term22450.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term22450, term22450.getClass(), "rivalPdId", -1);
        setField(term22448, term22448.getClass(), "pdId", term22450);
        setIntField(term22448, term22448.getClass(), "contestId", -469968304);
        setIntField(term22448, term22448.getClass(), "startCount", -1145578966);
        setField(term22448, term22448.getClass(), "resultRank", enum49);
        setIntField(term22448, term22448.getClass(), "bestValue", -1);
        setIntField(term22448, term22448.getClass(), "flag", -1);
        setIntField(term23060, term23060.getClass(), "year", 2026);
        setShortField(term23060, term23060.getClass(), "month", (short) 8);
        setShortField(term23060, term23060.getClass(), "day", (short) 12);
        setField(term23059, term23059.getClass(), "date", term23060);
        setByteField(term23064, term23064.getClass(), "hour", (byte) 2);
        setByteField(term23064, term23064.getClass(), "minute", (byte) 2);
        setByteField(term23064, term23064.getClass(), "second", (byte) 30);
        setIntField(term23064, term23064.getClass(), "nano", 248919000);
        setField(term23059, term23059.getClass(), "time", term23064);
        setField(term22448, term22448.getClass(), "lastUpdateTime", term23059);
        term23069 = new Long(-4920224193275732920L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerContest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term23069;
        callMethod(klass, "setId", argTypes, term22448, args);
    }

};


