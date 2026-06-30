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

public class PlayerCustomize_setCustomizeId_18257577286 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term469185;
     Object term469793;

    public PlayerCustomize_setCustomizeId_18257577286() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term469802 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term469801 = ((Class) term469802).getDeclaredField((String) "MISS");
        ((Field) term469801).setAccessible(true);
        Object enum1047 = ((Field) term469801).get((Object) null);
        Class<? extends Object> term470179 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term470178 = ((Class) term470179).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term470178).setAccessible(true);
        Object enum1048 = ((Field) term470178).get((Object) null);
        Class<? extends Object> term470462 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term470461 = ((Class) term470462).getDeclaredField((String) "NORMAL");
        ((Field) term470461).setAccessible(true);
        Object enum1049 = ((Field) term470461).get((Object) null);
        Class<? extends Object> term470737 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term470736 = ((Class) term470737).getDeclaredField((String) "ORIGINAL");
        ((Field) term470736).setAccessible(true);
        Object enum1050 = ((Field) term470736).get((Object) null);
        Class<? extends Object> term471003 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term471002 = ((Class) term471003).getDeclaredField((String) "NONE");
        ((Field) term471002).setAccessible(true);
        Object enum1051 = ((Field) term471002).get((Object) null);
        term469185 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerCustomize"));
        Object term469187 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term469310 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term469311 = newInstance(Class.forName("java.time.LocalDate"));
        Object term469315 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term469185, term469185.getClass(), "id", 7998051124369147543L);
        setLongField(term469187, term469187.getClass(), "id", -1481367303699139651L);
        setIntField(term469187, term469187.getClass(), "pdId", 697208850);
        setField(term469187, term469187.getClass(), "playerName", "xxx");
        setIntField(term469187, term469187.getClass(), "vocaloidPoints", 300);
        setIntField(term469187, term469187.getClass(), "level", 1);
        setIntField(term469187, term469187.getClass(), "levelExp", -973142506);
        setField(term469187, term469187.getClass(), "levelTitle", "xxx");
        setIntField(term469187, term469187.getClass(), "plateId", -1);
        setIntField(term469187, term469187.getClass(), "plateEffectId", -1);
        setField(term469187, term469187.getClass(), "passwordStatus", enum1047);
        setField(term469187, term469187.getClass(), "password", "**********");
        setBooleanField(term469187, term469187.getClass(), "preferPerPvModule", true);
        setBooleanField(term469187, term469187.getClass(), "preferCommonModule", true);
        setBooleanField(term469187, term469187.getClass(), "usePerPvSkin", true);
        setBooleanField(term469187, term469187.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term469187, term469187.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term469187, term469187.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term469187, term469187.getClass(), "usePerPvTouchSliderSe", true);
        setField(term469187, term469187.getClass(), "commonModule", "-999,-999,-999");
        setField(term469187, term469187.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term469311, term469311.getClass(), "year", 2026);
        setShortField(term469311, term469311.getClass(), "month", (short) 6);
        setShortField(term469311, term469311.getClass(), "day", (short) 29);
        setField(term469310, term469310.getClass(), "date", term469311);
        setByteField(term469315, term469315.getClass(), "hour", (byte) 4);
        setByteField(term469315, term469315.getClass(), "minute", (byte) 28);
        setByteField(term469315, term469315.getClass(), "second", (byte) 25);
        setIntField(term469315, term469315.getClass(), "nano", 846737000);
        setField(term469310, term469310.getClass(), "time", term469315);
        setField(term469187, term469187.getClass(), "commonModuleSetTime", term469310);
        setField(term469187, term469187.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term469187, term469187.getClass(), "commonSkin", -1);
        setIntField(term469187, term469187.getClass(), "headphoneVolume", 100);
        setBooleanField(term469187, term469187.getClass(), "buttonSeOn", true);
        setIntField(term469187, term469187.getClass(), "buttonSeVolume", 100);
        setIntField(term469187, term469187.getClass(), "sliderSeVolume", 100);
        setIntField(term469187, term469187.getClass(), "buttonSe", -1);
        setIntField(term469187, term469187.getClass(), "chainSlideSe", -1);
        setIntField(term469187, term469187.getClass(), "slideSe", -1);
        setIntField(term469187, term469187.getClass(), "sliderTouchSe", -1);
        setField(term469187, term469187.getClass(), "sortMode", enum1048);
        setIntField(term469187, term469187.getClass(), "nextPvId", -1);
        setField(term469187, term469187.getClass(), "nextDifficulty", enum1049);
        setField(term469187, term469187.getClass(), "nextEdition", enum1050);
        setBooleanField(term469187, term469187.getClass(), "showInterimRanking", true);
        setBooleanField(term469187, term469187.getClass(), "showClearStatus", true);
        setBooleanField(term469187, term469187.getClass(), "showGreatBorder", true);
        setBooleanField(term469187, term469187.getClass(), "showExcellentBorder", true);
        setBooleanField(term469187, term469187.getClass(), "showRivalBorder", true);
        setBooleanField(term469187, term469187.getClass(), "showRgoSetting", true);
        setBooleanField(term469187, term469187.getClass(), "contestNowPlayingEnable", true);
        setIntField(term469187, term469187.getClass(), "contestNowPlayingId", -1);
        setIntField(term469187, term469187.getClass(), "contestNowPlayingValue", -1);
        setField(term469187, term469187.getClass(), "contestNowPlayingResultRank", enum1051);
        setField(term469187, term469187.getClass(), "contestNowPlayingSpecifier", "");
        setField(term469187, term469187.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term469187, term469187.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term469187, term469187.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term469187, term469187.getClass(), "rivalPdId", -1);
        setField(term469185, term469185.getClass(), "pdId", term469187);
        setIntField(term469185, term469185.getClass(), "customizeId", -15011809);
        term469793 = new Integer(-482193296);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerCustomize");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term469793;
        callMethod(klass, "setCustomizeId", argTypes, term469185, args);
    }

};


