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

public class PlayerCustomize_getId_5952686411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term455876;

    public PlayerCustomize_getId_5952686411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term456491 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term456490 = ((Class) term456491).getDeclaredField((String) "MISS");
        ((Field) term456490).setAccessible(true);
        Object enum1022 = ((Field) term456490).get((Object) null);
        Class<? extends Object> term456868 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term456867 = ((Class) term456868).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term456867).setAccessible(true);
        Object enum1023 = ((Field) term456867).get((Object) null);
        Class<? extends Object> term457151 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term457150 = ((Class) term457151).getDeclaredField((String) "NORMAL");
        ((Field) term457150).setAccessible(true);
        Object enum1024 = ((Field) term457150).get((Object) null);
        Class<? extends Object> term457426 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term457425 = ((Class) term457426).getDeclaredField((String) "ORIGINAL");
        ((Field) term457425).setAccessible(true);
        Object enum1025 = ((Field) term457425).get((Object) null);
        Class<? extends Object> term457692 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term457691 = ((Class) term457692).getDeclaredField((String) "NONE");
        ((Field) term457691).setAccessible(true);
        Object enum1026 = ((Field) term457691).get((Object) null);
        term455876 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerCustomize"));
        Object term455878 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term456001 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term456002 = newInstance(Class.forName("java.time.LocalDate"));
        Object term456006 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term455876, term455876.getClass(), "id", 24067105862153728L);
        setLongField(term455878, term455878.getClass(), "id", -8477368071089201577L);
        setIntField(term455878, term455878.getClass(), "pdId", -316033780);
        setField(term455878, term455878.getClass(), "playerName", "xxx");
        setIntField(term455878, term455878.getClass(), "vocaloidPoints", 300);
        setIntField(term455878, term455878.getClass(), "level", 1);
        setIntField(term455878, term455878.getClass(), "levelExp", -1242223364);
        setField(term455878, term455878.getClass(), "levelTitle", "xxx");
        setIntField(term455878, term455878.getClass(), "plateId", -1);
        setIntField(term455878, term455878.getClass(), "plateEffectId", -1);
        setField(term455878, term455878.getClass(), "passwordStatus", enum1022);
        setField(term455878, term455878.getClass(), "password", "**********");
        setBooleanField(term455878, term455878.getClass(), "preferPerPvModule", true);
        setBooleanField(term455878, term455878.getClass(), "preferCommonModule", false);
        setBooleanField(term455878, term455878.getClass(), "usePerPvSkin", true);
        setBooleanField(term455878, term455878.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term455878, term455878.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term455878, term455878.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term455878, term455878.getClass(), "usePerPvTouchSliderSe", false);
        setField(term455878, term455878.getClass(), "commonModule", "-999,-999,-999");
        setField(term455878, term455878.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term456002, term456002.getClass(), "year", 2026);
        setShortField(term456002, term456002.getClass(), "month", (short) 8);
        setShortField(term456002, term456002.getClass(), "day", (short) 12);
        setField(term456001, term456001.getClass(), "date", term456002);
        setByteField(term456006, term456006.getClass(), "hour", (byte) 2);
        setByteField(term456006, term456006.getClass(), "minute", (byte) 3);
        setByteField(term456006, term456006.getClass(), "second", (byte) 39);
        setIntField(term456006, term456006.getClass(), "nano", 142425000);
        setField(term456001, term456001.getClass(), "time", term456006);
        setField(term455878, term455878.getClass(), "commonModuleSetTime", term456001);
        setField(term455878, term455878.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term455878, term455878.getClass(), "commonSkin", -1);
        setIntField(term455878, term455878.getClass(), "headphoneVolume", 100);
        setBooleanField(term455878, term455878.getClass(), "buttonSeOn", true);
        setIntField(term455878, term455878.getClass(), "buttonSeVolume", 100);
        setIntField(term455878, term455878.getClass(), "sliderSeVolume", 100);
        setIntField(term455878, term455878.getClass(), "buttonSe", -1);
        setIntField(term455878, term455878.getClass(), "chainSlideSe", -1);
        setIntField(term455878, term455878.getClass(), "slideSe", -1);
        setIntField(term455878, term455878.getClass(), "sliderTouchSe", -1);
        setField(term455878, term455878.getClass(), "sortMode", enum1023);
        setIntField(term455878, term455878.getClass(), "nextPvId", -1);
        setField(term455878, term455878.getClass(), "nextDifficulty", enum1024);
        setField(term455878, term455878.getClass(), "nextEdition", enum1025);
        setBooleanField(term455878, term455878.getClass(), "showInterimRanking", true);
        setBooleanField(term455878, term455878.getClass(), "showClearStatus", true);
        setBooleanField(term455878, term455878.getClass(), "showGreatBorder", true);
        setBooleanField(term455878, term455878.getClass(), "showExcellentBorder", true);
        setBooleanField(term455878, term455878.getClass(), "showRivalBorder", true);
        setBooleanField(term455878, term455878.getClass(), "showRgoSetting", true);
        setBooleanField(term455878, term455878.getClass(), "contestNowPlayingEnable", false);
        setIntField(term455878, term455878.getClass(), "contestNowPlayingId", -1);
        setIntField(term455878, term455878.getClass(), "contestNowPlayingValue", -1);
        setField(term455878, term455878.getClass(), "contestNowPlayingResultRank", enum1026);
        setField(term455878, term455878.getClass(), "contestNowPlayingSpecifier", "");
        setField(term455878, term455878.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term455878, term455878.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term455878, term455878.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term455878, term455878.getClass(), "rivalPdId", -1);
        setField(term455876, term455876.getClass(), "pdId", term455878);
        setIntField(term455876, term455876.getClass(), "customizeId", -347672279);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerCustomize");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term455876, args);
    }

};


