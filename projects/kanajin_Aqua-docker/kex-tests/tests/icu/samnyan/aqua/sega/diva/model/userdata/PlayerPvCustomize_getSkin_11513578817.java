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

public class PlayerPvCustomize_getSkin_11513578817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term963897;

    public PlayerPvCustomize_getSkin_11513578817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term964631 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term964630 = ((Class) term964631).getDeclaredField((String) "MISS");
        ((Field) term964630).setAccessible(true);
        Object enum2055 = ((Field) term964630).get((Object) null);
        Class<? extends Object> term965008 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term965007 = ((Class) term965008).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term965007).setAccessible(true);
        Object enum2056 = ((Field) term965007).get((Object) null);
        Class<? extends Object> term965291 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term965290 = ((Class) term965291).getDeclaredField((String) "NORMAL");
        ((Field) term965290).setAccessible(true);
        Object enum2057 = ((Field) term965290).get((Object) null);
        Class<? extends Object> term965566 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term965565 = ((Class) term965566).getDeclaredField((String) "ORIGINAL");
        ((Field) term965565).setAccessible(true);
        Object enum2058 = ((Field) term965565).get((Object) null);
        Class<? extends Object> term965832 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term965831 = ((Class) term965832).getDeclaredField((String) "NONE");
        ((Field) term965831).setAccessible(true);
        Object enum2059 = ((Field) term965831).get((Object) null);
        term963897 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvCustomize"));
        Object term963899 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term964022 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term964023 = newInstance(Class.forName("java.time.LocalDate"));
        Object term964027 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term963897, term963897.getClass(), "id", 5592522907226111065L);
        setLongField(term963899, term963899.getClass(), "id", -2577420466618938650L);
        setIntField(term963899, term963899.getClass(), "pdId", -1597424060);
        setField(term963899, term963899.getClass(), "playerName", "xxx");
        setIntField(term963899, term963899.getClass(), "vocaloidPoints", 300);
        setIntField(term963899, term963899.getClass(), "level", 1);
        setIntField(term963899, term963899.getClass(), "levelExp", 243854303);
        setField(term963899, term963899.getClass(), "levelTitle", "xxx");
        setIntField(term963899, term963899.getClass(), "plateId", -1);
        setIntField(term963899, term963899.getClass(), "plateEffectId", -1);
        setField(term963899, term963899.getClass(), "passwordStatus", enum2055);
        setField(term963899, term963899.getClass(), "password", "**********");
        setBooleanField(term963899, term963899.getClass(), "preferPerPvModule", true);
        setBooleanField(term963899, term963899.getClass(), "preferCommonModule", true);
        setBooleanField(term963899, term963899.getClass(), "usePerPvSkin", false);
        setBooleanField(term963899, term963899.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term963899, term963899.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term963899, term963899.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term963899, term963899.getClass(), "usePerPvTouchSliderSe", false);
        setField(term963899, term963899.getClass(), "commonModule", "-999,-999,-999");
        setField(term963899, term963899.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term964023, term964023.getClass(), "year", 2026);
        setShortField(term964023, term964023.getClass(), "month", (short) 8);
        setShortField(term964023, term964023.getClass(), "day", (short) 12);
        setField(term964022, term964022.getClass(), "date", term964023);
        setByteField(term964027, term964027.getClass(), "hour", (byte) 2);
        setByteField(term964027, term964027.getClass(), "minute", (byte) 5);
        setByteField(term964027, term964027.getClass(), "second", (byte) 18);
        setIntField(term964027, term964027.getClass(), "nano", 116580000);
        setField(term964022, term964022.getClass(), "time", term964027);
        setField(term963899, term963899.getClass(), "commonModuleSetTime", term964022);
        setField(term963899, term963899.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term963899, term963899.getClass(), "commonSkin", -1);
        setIntField(term963899, term963899.getClass(), "headphoneVolume", 100);
        setBooleanField(term963899, term963899.getClass(), "buttonSeOn", true);
        setIntField(term963899, term963899.getClass(), "buttonSeVolume", 100);
        setIntField(term963899, term963899.getClass(), "sliderSeVolume", 100);
        setIntField(term963899, term963899.getClass(), "buttonSe", -1);
        setIntField(term963899, term963899.getClass(), "chainSlideSe", -1);
        setIntField(term963899, term963899.getClass(), "slideSe", -1);
        setIntField(term963899, term963899.getClass(), "sliderTouchSe", -1);
        setField(term963899, term963899.getClass(), "sortMode", enum2056);
        setIntField(term963899, term963899.getClass(), "nextPvId", -1);
        setField(term963899, term963899.getClass(), "nextDifficulty", enum2057);
        setField(term963899, term963899.getClass(), "nextEdition", enum2058);
        setBooleanField(term963899, term963899.getClass(), "showInterimRanking", true);
        setBooleanField(term963899, term963899.getClass(), "showClearStatus", true);
        setBooleanField(term963899, term963899.getClass(), "showGreatBorder", true);
        setBooleanField(term963899, term963899.getClass(), "showExcellentBorder", true);
        setBooleanField(term963899, term963899.getClass(), "showRivalBorder", true);
        setBooleanField(term963899, term963899.getClass(), "showRgoSetting", true);
        setBooleanField(term963899, term963899.getClass(), "contestNowPlayingEnable", true);
        setIntField(term963899, term963899.getClass(), "contestNowPlayingId", -1);
        setIntField(term963899, term963899.getClass(), "contestNowPlayingValue", -1);
        setField(term963899, term963899.getClass(), "contestNowPlayingResultRank", enum2059);
        setField(term963899, term963899.getClass(), "contestNowPlayingSpecifier", "");
        setField(term963899, term963899.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term963899, term963899.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term963899, term963899.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term963899, term963899.getClass(), "rivalPdId", -1);
        setField(term963897, term963897.getClass(), "pdId", term963899);
        setIntField(term963897, term963897.getClass(), "pvId", -1);
        setField(term963897, term963897.getClass(), "module", "-999,-999,-999");
        setField(term963897, term963897.getClass(), "customize", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setField(term963897, term963897.getClass(), "customizeFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term963897, term963897.getClass(), "skin", -1);
        setIntField(term963897, term963897.getClass(), "buttonSe", -1);
        setIntField(term963897, term963897.getClass(), "slideSe", -1);
        setIntField(term963897, term963897.getClass(), "chainSlideSe", -1);
        setIntField(term963897, term963897.getClass(), "sliderTouchSe", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvCustomize");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSkin", argTypes, term963897, args);
    }

};


