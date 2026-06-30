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

public class PlayerContest_toString_151219329420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50656;

    public PlayerContest_toString_151219329420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term51284 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term51283 = ((Class) term51284).getDeclaredField((String) "MISS");
        ((Field) term51283).setAccessible(true);
        Object enum100 = ((Field) term51283).get((Object) null);
        Class<? extends Object> term51661 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term51660 = ((Class) term51661).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term51660).setAccessible(true);
        Object enum101 = ((Field) term51660).get((Object) null);
        Class<? extends Object> term51944 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term51943 = ((Class) term51944).getDeclaredField((String) "NORMAL");
        ((Field) term51943).setAccessible(true);
        Object enum102 = ((Field) term51943).get((Object) null);
        Class<? extends Object> term52219 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term52218 = ((Class) term52219).getDeclaredField((String) "ORIGINAL");
        ((Field) term52218).setAccessible(true);
        Object enum103 = ((Field) term52218).get((Object) null);
        Class<? extends Object> term52485 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term52484 = ((Class) term52485).getDeclaredField((String) "NONE");
        ((Field) term52484).setAccessible(true);
        Object enum104 = ((Field) term52484).get((Object) null);
        term50656 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerContest"));
        Object term50658 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term50781 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term50782 = newInstance(Class.forName("java.time.LocalDate"));
        Object term50786 = newInstance(Class.forName("java.time.LocalTime"));
        Object term51267 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term51268 = newInstance(Class.forName("java.time.LocalDate"));
        Object term51272 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term50656, term50656.getClass(), "id", -2068172595987555756L);
        setLongField(term50658, term50658.getClass(), "id", -6292278961887936280L);
        setIntField(term50658, term50658.getClass(), "pdId", 1090617576);
        setField(term50658, term50658.getClass(), "playerName", "xxx");
        setIntField(term50658, term50658.getClass(), "vocaloidPoints", 300);
        setIntField(term50658, term50658.getClass(), "level", 1);
        setIntField(term50658, term50658.getClass(), "levelExp", -1547384488);
        setField(term50658, term50658.getClass(), "levelTitle", "xxx");
        setIntField(term50658, term50658.getClass(), "plateId", -1);
        setIntField(term50658, term50658.getClass(), "plateEffectId", -1);
        setField(term50658, term50658.getClass(), "passwordStatus", enum100);
        setField(term50658, term50658.getClass(), "password", "**********");
        setBooleanField(term50658, term50658.getClass(), "preferPerPvModule", true);
        setBooleanField(term50658, term50658.getClass(), "preferCommonModule", false);
        setBooleanField(term50658, term50658.getClass(), "usePerPvSkin", false);
        setBooleanField(term50658, term50658.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term50658, term50658.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term50658, term50658.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term50658, term50658.getClass(), "usePerPvTouchSliderSe", true);
        setField(term50658, term50658.getClass(), "commonModule", "-999,-999,-999");
        setField(term50658, term50658.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term50782, term50782.getClass(), "year", 2026);
        setShortField(term50782, term50782.getClass(), "month", (short) 6);
        setShortField(term50782, term50782.getClass(), "day", (short) 29);
        setField(term50781, term50781.getClass(), "date", term50782);
        setByteField(term50786, term50786.getClass(), "hour", (byte) 4);
        setByteField(term50786, term50786.getClass(), "minute", (byte) 27);
        setByteField(term50786, term50786.getClass(), "second", (byte) 16);
        setIntField(term50786, term50786.getClass(), "nano", 920237000);
        setField(term50781, term50781.getClass(), "time", term50786);
        setField(term50658, term50658.getClass(), "commonModuleSetTime", term50781);
        setField(term50658, term50658.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term50658, term50658.getClass(), "commonSkin", -1);
        setIntField(term50658, term50658.getClass(), "headphoneVolume", 100);
        setBooleanField(term50658, term50658.getClass(), "buttonSeOn", true);
        setIntField(term50658, term50658.getClass(), "buttonSeVolume", 100);
        setIntField(term50658, term50658.getClass(), "sliderSeVolume", 100);
        setIntField(term50658, term50658.getClass(), "buttonSe", -1);
        setIntField(term50658, term50658.getClass(), "chainSlideSe", -1);
        setIntField(term50658, term50658.getClass(), "slideSe", -1);
        setIntField(term50658, term50658.getClass(), "sliderTouchSe", -1);
        setField(term50658, term50658.getClass(), "sortMode", enum101);
        setIntField(term50658, term50658.getClass(), "nextPvId", -1);
        setField(term50658, term50658.getClass(), "nextDifficulty", enum102);
        setField(term50658, term50658.getClass(), "nextEdition", enum103);
        setBooleanField(term50658, term50658.getClass(), "showInterimRanking", true);
        setBooleanField(term50658, term50658.getClass(), "showClearStatus", true);
        setBooleanField(term50658, term50658.getClass(), "showGreatBorder", true);
        setBooleanField(term50658, term50658.getClass(), "showExcellentBorder", true);
        setBooleanField(term50658, term50658.getClass(), "showRivalBorder", true);
        setBooleanField(term50658, term50658.getClass(), "showRgoSetting", true);
        setBooleanField(term50658, term50658.getClass(), "contestNowPlayingEnable", true);
        setIntField(term50658, term50658.getClass(), "contestNowPlayingId", -1);
        setIntField(term50658, term50658.getClass(), "contestNowPlayingValue", -1);
        setField(term50658, term50658.getClass(), "contestNowPlayingResultRank", enum104);
        setField(term50658, term50658.getClass(), "contestNowPlayingSpecifier", "");
        setField(term50658, term50658.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term50658, term50658.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term50658, term50658.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term50658, term50658.getClass(), "rivalPdId", -1);
        setField(term50656, term50656.getClass(), "pdId", term50658);
        setIntField(term50656, term50656.getClass(), "contestId", 1442160736);
        setIntField(term50656, term50656.getClass(), "startCount", 1114000454);
        setField(term50656, term50656.getClass(), "resultRank", enum104);
        setIntField(term50656, term50656.getClass(), "bestValue", -1);
        setIntField(term50656, term50656.getClass(), "flag", -1);
        setIntField(term51268, term51268.getClass(), "year", 2026);
        setShortField(term51268, term51268.getClass(), "month", (short) 6);
        setShortField(term51268, term51268.getClass(), "day", (short) 29);
        setField(term51267, term51267.getClass(), "date", term51268);
        setByteField(term51272, term51272.getClass(), "hour", (byte) 4);
        setByteField(term51272, term51272.getClass(), "minute", (byte) 27);
        setByteField(term51272, term51272.getClass(), "second", (byte) 16);
        setIntField(term51272, term51272.getClass(), "nano", 920086000);
        setField(term51267, term51267.getClass(), "time", term51272);
        setField(term50656, term50656.getClass(), "lastUpdateTime", term51267);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerContest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term50656, args);
    }

};


