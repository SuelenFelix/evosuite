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
import java.lang.Integer;

public class GameSession_getLastUpdateTime_4815467196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term374097;

    public GameSession_getLastUpdateTime_4815467196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term374766 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term374765 = ((Class) term374766).getDeclaredField((String) "MISS");
        ((Field) term374765).setAccessible(true);
        Object enum848 = ((Field) term374765).get((Object) null);
        Class<? extends Object> term375143 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term375142 = ((Class) term375143).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term375142).setAccessible(true);
        Object enum849 = ((Field) term375142).get((Object) null);
        Class<? extends Object> term375426 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term375425 = ((Class) term375426).getDeclaredField((String) "NORMAL");
        ((Field) term375425).setAccessible(true);
        Object enum850 = ((Field) term375425).get((Object) null);
        Class<? extends Object> term375701 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term375700 = ((Class) term375701).getDeclaredField((String) "ORIGINAL");
        ((Field) term375700).setAccessible(true);
        Object enum851 = ((Field) term375700).get((Object) null);
        Class<? extends Object> term375967 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term375966 = ((Class) term375967).getDeclaredField((String) "NONE");
        ((Field) term375966).setAccessible(true);
        Object enum852 = ((Field) term375966).get((Object) null);
        Class<? extends Object> term376608 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.StartMode");
        Field term376607 = ((Class) term376608).getDeclaredField((String) "CARD_PROCEDURE");
        ((Field) term376607).setAccessible(true);
        Object enum853 = ((Field) term376607).get((Object) null);
        Integer term374743 = new Integer(579005622);
        Integer term374745 = new Integer(-14890619);
        Integer term374747 = new Integer(1632125673);
        Integer term374749 = new Integer(454281060);
        Integer term374751 = new Integer(-1786399638);
        Integer term374753 = new Integer(2055867847);
        Integer term374755 = new Integer(-1048298087);
        Integer term374757 = new Integer(292681826);
        term374097 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession"));
        Object term374100 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term374223 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term374224 = newInstance(Class.forName("java.time.LocalDate"));
        Object term374228 = newInstance(Class.forName("java.time.LocalTime"));
        Object term374723 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term374724 = newInstance(Class.forName("java.time.LocalDate"));
        Object term374728 = newInstance(Class.forName("java.time.LocalTime"));
        Object term374733 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term374734 = newInstance(Class.forName("java.time.LocalDate"));
        Object term374738 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term374097, term374097.getClass(), "id", 6902365338255307910L);
        setIntField(term374097, term374097.getClass(), "acceptId", 306903225);
        setLongField(term374100, term374100.getClass(), "id", -8019730974733786399L);
        setIntField(term374100, term374100.getClass(), "pdId", -1245754321);
        setField(term374100, term374100.getClass(), "playerName", "xxx");
        setIntField(term374100, term374100.getClass(), "vocaloidPoints", 300);
        setIntField(term374100, term374100.getClass(), "level", 1);
        setIntField(term374100, term374100.getClass(), "levelExp", 398727237);
        setField(term374100, term374100.getClass(), "levelTitle", "xxx");
        setIntField(term374100, term374100.getClass(), "plateId", -1);
        setIntField(term374100, term374100.getClass(), "plateEffectId", -1);
        setField(term374100, term374100.getClass(), "passwordStatus", enum848);
        setField(term374100, term374100.getClass(), "password", "**********");
        setBooleanField(term374100, term374100.getClass(), "preferPerPvModule", true);
        setBooleanField(term374100, term374100.getClass(), "preferCommonModule", false);
        setBooleanField(term374100, term374100.getClass(), "usePerPvSkin", false);
        setBooleanField(term374100, term374100.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term374100, term374100.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term374100, term374100.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term374100, term374100.getClass(), "usePerPvTouchSliderSe", false);
        setField(term374100, term374100.getClass(), "commonModule", "-999,-999,-999");
        setField(term374100, term374100.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term374224, term374224.getClass(), "year", 2026);
        setShortField(term374224, term374224.getClass(), "month", (short) 6);
        setShortField(term374224, term374224.getClass(), "day", (short) 29);
        setField(term374223, term374223.getClass(), "date", term374224);
        setByteField(term374228, term374228.getClass(), "hour", (byte) 4);
        setByteField(term374228, term374228.getClass(), "minute", (byte) 28);
        setByteField(term374228, term374228.getClass(), "second", (byte) 8);
        setIntField(term374228, term374228.getClass(), "nano", 303019000);
        setField(term374223, term374223.getClass(), "time", term374228);
        setField(term374100, term374100.getClass(), "commonModuleSetTime", term374223);
        setField(term374100, term374100.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term374100, term374100.getClass(), "commonSkin", -1);
        setIntField(term374100, term374100.getClass(), "headphoneVolume", 100);
        setBooleanField(term374100, term374100.getClass(), "buttonSeOn", true);
        setIntField(term374100, term374100.getClass(), "buttonSeVolume", 100);
        setIntField(term374100, term374100.getClass(), "sliderSeVolume", 100);
        setIntField(term374100, term374100.getClass(), "buttonSe", -1);
        setIntField(term374100, term374100.getClass(), "chainSlideSe", -1);
        setIntField(term374100, term374100.getClass(), "slideSe", -1);
        setIntField(term374100, term374100.getClass(), "sliderTouchSe", -1);
        setField(term374100, term374100.getClass(), "sortMode", enum849);
        setIntField(term374100, term374100.getClass(), "nextPvId", -1);
        setField(term374100, term374100.getClass(), "nextDifficulty", enum850);
        setField(term374100, term374100.getClass(), "nextEdition", enum851);
        setBooleanField(term374100, term374100.getClass(), "showInterimRanking", true);
        setBooleanField(term374100, term374100.getClass(), "showClearStatus", true);
        setBooleanField(term374100, term374100.getClass(), "showGreatBorder", true);
        setBooleanField(term374100, term374100.getClass(), "showExcellentBorder", true);
        setBooleanField(term374100, term374100.getClass(), "showRivalBorder", true);
        setBooleanField(term374100, term374100.getClass(), "showRgoSetting", true);
        setBooleanField(term374100, term374100.getClass(), "contestNowPlayingEnable", true);
        setIntField(term374100, term374100.getClass(), "contestNowPlayingId", -1);
        setIntField(term374100, term374100.getClass(), "contestNowPlayingValue", -1);
        setField(term374100, term374100.getClass(), "contestNowPlayingResultRank", enum852);
        setField(term374100, term374100.getClass(), "contestNowPlayingSpecifier", "");
        setField(term374100, term374100.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term374100, term374100.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term374100, term374100.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term374100, term374100.getClass(), "rivalPdId", -1);
        setField(term374097, term374097.getClass(), "pdId", term374100);
        setField(term374097, term374097.getClass(), "startMode", enum853);
        setIntField(term374724, term374724.getClass(), "year", 2014);
        setShortField(term374724, term374724.getClass(), "month", (short) 7);
        setShortField(term374724, term374724.getClass(), "day", (short) 22);
        setField(term374723, term374723.getClass(), "date", term374724);
        setByteField(term374728, term374728.getClass(), "hour", (byte) 9);
        setByteField(term374728, term374728.getClass(), "minute", (byte) 40);
        setByteField(term374728, term374728.getClass(), "second", (byte) 34);
        setIntField(term374728, term374728.getClass(), "nano", 463008257);
        setField(term374723, term374723.getClass(), "time", term374728);
        setField(term374097, term374097.getClass(), "startTime", term374723);
        setIntField(term374734, term374734.getClass(), "year", 2027);
        setShortField(term374734, term374734.getClass(), "month", (short) 6);
        setShortField(term374734, term374734.getClass(), "day", (short) 20);
        setField(term374733, term374733.getClass(), "date", term374734);
        setByteField(term374738, term374738.getClass(), "hour", (byte) 23);
        setByteField(term374738, term374738.getClass(), "minute", (byte) 21);
        setByteField(term374738, term374738.getClass(), "second", (byte) 6);
        setIntField(term374738, term374738.getClass(), "nano", 897776059);
        setField(term374733, term374733.getClass(), "time", term374738);
        setField(term374097, term374097.getClass(), "lastUpdateTime", term374733);
        setField(term374097, term374097.getClass(), "stageIndex", term374743);
        setField(term374097, term374097.getClass(), "stageResultIndex", term374745);
        setField(term374097, term374097.getClass(), "lastPvId", term374747);
        setField(term374097, term374097.getClass(), "levelNumber", term374749);
        setField(term374097, term374097.getClass(), "levelExp", term374751);
        setField(term374097, term374097.getClass(), "oldLevelNumber", term374753);
        setField(term374097, term374097.getClass(), "oldLevelExp", term374755);
        setField(term374097, term374097.getClass(), "vp", term374757);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastUpdateTime", argTypes, term374097, args);
    }

};


