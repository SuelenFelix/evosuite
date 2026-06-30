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

public class PlayerContest_getBestValue_9955020286 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15041;

    public PlayerContest_getBestValue_9955020286() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term15669 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term15668 = ((Class) term15669).getDeclaredField((String) "MISS");
        ((Field) term15668).setAccessible(true);
        Object enum30 = ((Field) term15668).get((Object) null);
        Class<? extends Object> term16046 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term16045 = ((Class) term16046).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term16045).setAccessible(true);
        Object enum31 = ((Field) term16045).get((Object) null);
        Class<? extends Object> term16329 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term16328 = ((Class) term16329).getDeclaredField((String) "NORMAL");
        ((Field) term16328).setAccessible(true);
        Object enum32 = ((Field) term16328).get((Object) null);
        Class<? extends Object> term16604 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term16603 = ((Class) term16604).getDeclaredField((String) "ORIGINAL");
        ((Field) term16603).setAccessible(true);
        Object enum33 = ((Field) term16603).get((Object) null);
        Class<? extends Object> term16870 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term16869 = ((Class) term16870).getDeclaredField((String) "NONE");
        ((Field) term16869).setAccessible(true);
        Object enum34 = ((Field) term16869).get((Object) null);
        term15041 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerContest"));
        Object term15043 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term15166 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15167 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15171 = newInstance(Class.forName("java.time.LocalTime"));
        Object term15652 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15653 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15657 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term15041, term15041.getClass(), "id", -8885298608300233488L);
        setLongField(term15043, term15043.getClass(), "id", -4325723315152823407L);
        setIntField(term15043, term15043.getClass(), "pdId", -117576464);
        setField(term15043, term15043.getClass(), "playerName", "xxx");
        setIntField(term15043, term15043.getClass(), "vocaloidPoints", 300);
        setIntField(term15043, term15043.getClass(), "level", 1);
        setIntField(term15043, term15043.getClass(), "levelExp", -1007160944);
        setField(term15043, term15043.getClass(), "levelTitle", "xxx");
        setIntField(term15043, term15043.getClass(), "plateId", -1);
        setIntField(term15043, term15043.getClass(), "plateEffectId", -1);
        setField(term15043, term15043.getClass(), "passwordStatus", enum30);
        setField(term15043, term15043.getClass(), "password", "**********");
        setBooleanField(term15043, term15043.getClass(), "preferPerPvModule", true);
        setBooleanField(term15043, term15043.getClass(), "preferCommonModule", true);
        setBooleanField(term15043, term15043.getClass(), "usePerPvSkin", true);
        setBooleanField(term15043, term15043.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term15043, term15043.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term15043, term15043.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term15043, term15043.getClass(), "usePerPvTouchSliderSe", true);
        setField(term15043, term15043.getClass(), "commonModule", "-999,-999,-999");
        setField(term15043, term15043.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term15167, term15167.getClass(), "year", 2026);
        setShortField(term15167, term15167.getClass(), "month", (short) 6);
        setShortField(term15167, term15167.getClass(), "day", (short) 29);
        setField(term15166, term15166.getClass(), "date", term15167);
        setByteField(term15171, term15171.getClass(), "hour", (byte) 4);
        setByteField(term15171, term15171.getClass(), "minute", (byte) 27);
        setByteField(term15171, term15171.getClass(), "second", (byte) 12);
        setIntField(term15171, term15171.getClass(), "nano", 804447000);
        setField(term15166, term15166.getClass(), "time", term15171);
        setField(term15043, term15043.getClass(), "commonModuleSetTime", term15166);
        setField(term15043, term15043.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term15043, term15043.getClass(), "commonSkin", -1);
        setIntField(term15043, term15043.getClass(), "headphoneVolume", 100);
        setBooleanField(term15043, term15043.getClass(), "buttonSeOn", true);
        setIntField(term15043, term15043.getClass(), "buttonSeVolume", 100);
        setIntField(term15043, term15043.getClass(), "sliderSeVolume", 100);
        setIntField(term15043, term15043.getClass(), "buttonSe", -1);
        setIntField(term15043, term15043.getClass(), "chainSlideSe", -1);
        setIntField(term15043, term15043.getClass(), "slideSe", -1);
        setIntField(term15043, term15043.getClass(), "sliderTouchSe", -1);
        setField(term15043, term15043.getClass(), "sortMode", enum31);
        setIntField(term15043, term15043.getClass(), "nextPvId", -1);
        setField(term15043, term15043.getClass(), "nextDifficulty", enum32);
        setField(term15043, term15043.getClass(), "nextEdition", enum33);
        setBooleanField(term15043, term15043.getClass(), "showInterimRanking", true);
        setBooleanField(term15043, term15043.getClass(), "showClearStatus", true);
        setBooleanField(term15043, term15043.getClass(), "showGreatBorder", true);
        setBooleanField(term15043, term15043.getClass(), "showExcellentBorder", true);
        setBooleanField(term15043, term15043.getClass(), "showRivalBorder", true);
        setBooleanField(term15043, term15043.getClass(), "showRgoSetting", true);
        setBooleanField(term15043, term15043.getClass(), "contestNowPlayingEnable", false);
        setIntField(term15043, term15043.getClass(), "contestNowPlayingId", -1);
        setIntField(term15043, term15043.getClass(), "contestNowPlayingValue", -1);
        setField(term15043, term15043.getClass(), "contestNowPlayingResultRank", enum34);
        setField(term15043, term15043.getClass(), "contestNowPlayingSpecifier", "");
        setField(term15043, term15043.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term15043, term15043.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term15043, term15043.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term15043, term15043.getClass(), "rivalPdId", -1);
        setField(term15041, term15041.getClass(), "pdId", term15043);
        setIntField(term15041, term15041.getClass(), "contestId", 1135664017);
        setIntField(term15041, term15041.getClass(), "startCount", 590364439);
        setField(term15041, term15041.getClass(), "resultRank", enum34);
        setIntField(term15041, term15041.getClass(), "bestValue", -1);
        setIntField(term15041, term15041.getClass(), "flag", -1);
        setIntField(term15653, term15653.getClass(), "year", 2026);
        setShortField(term15653, term15653.getClass(), "month", (short) 6);
        setShortField(term15653, term15653.getClass(), "day", (short) 29);
        setField(term15652, term15652.getClass(), "date", term15653);
        setByteField(term15657, term15657.getClass(), "hour", (byte) 4);
        setByteField(term15657, term15657.getClass(), "minute", (byte) 27);
        setByteField(term15657, term15657.getClass(), "second", (byte) 12);
        setIntField(term15657, term15657.getClass(), "nano", 804273000);
        setField(term15652, term15652.getClass(), "time", term15657);
        setField(term15041, term15041.getClass(), "lastUpdateTime", term15652);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerContest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBestValue", argTypes, term15041, args);
    }

};


