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
import java.lang.String;
import java.lang.Object;

public class PlayerProfile_setSortMode_159044525382 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term882491;
     Object enum1902;

    public PlayerProfile_setSortMode_159044525382() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term883112 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term883111 = ((Class) term883112).getDeclaredField((String) "MISS");
        ((Field) term883111).setAccessible(true);
        Object enum1897 = ((Field) term883111).get((Object) null);
        Class<? extends Object> term883489 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term883488 = ((Class) term883489).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term883488).setAccessible(true);
        Object enum1898 = ((Field) term883488).get((Object) null);
        Class<? extends Object> term883772 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term883771 = ((Class) term883772).getDeclaredField((String) "NORMAL");
        ((Field) term883771).setAccessible(true);
        Object enum1899 = ((Field) term883771).get((Object) null);
        Class<? extends Object> term884047 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term884046 = ((Class) term884047).getDeclaredField((String) "ORIGINAL");
        ((Field) term884046).setAccessible(true);
        Object enum1900 = ((Field) term884046).get((Object) null);
        Class<? extends Object> term884313 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term884312 = ((Class) term884313).getDeclaredField((String) "NONE");
        ((Field) term884312).setAccessible(true);
        Object enum1901 = ((Field) term884312).get((Object) null);
        term882491 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term882614 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term882615 = newInstance(Class.forName("java.time.LocalDate"));
        Object term882619 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term882491, term882491.getClass(), "id", 3161040540173678206L);
        setIntField(term882491, term882491.getClass(), "pdId", -1059947211);
        setField(term882491, term882491.getClass(), "playerName", "xxx");
        setIntField(term882491, term882491.getClass(), "vocaloidPoints", 300);
        setIntField(term882491, term882491.getClass(), "level", 1);
        setIntField(term882491, term882491.getClass(), "levelExp", -768583538);
        setField(term882491, term882491.getClass(), "levelTitle", "xxx");
        setIntField(term882491, term882491.getClass(), "plateId", -1);
        setIntField(term882491, term882491.getClass(), "plateEffectId", -1);
        setField(term882491, term882491.getClass(), "passwordStatus", enum1897);
        setField(term882491, term882491.getClass(), "password", "**********");
        setBooleanField(term882491, term882491.getClass(), "preferPerPvModule", true);
        setBooleanField(term882491, term882491.getClass(), "preferCommonModule", false);
        setBooleanField(term882491, term882491.getClass(), "usePerPvSkin", true);
        setBooleanField(term882491, term882491.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term882491, term882491.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term882491, term882491.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term882491, term882491.getClass(), "usePerPvTouchSliderSe", true);
        setField(term882491, term882491.getClass(), "commonModule", "-999,-999,-999");
        setField(term882491, term882491.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term882615, term882615.getClass(), "year", 2026);
        setShortField(term882615, term882615.getClass(), "month", (short) 6);
        setShortField(term882615, term882615.getClass(), "day", (short) 29);
        setField(term882614, term882614.getClass(), "date", term882615);
        setByteField(term882619, term882619.getClass(), "hour", (byte) 4);
        setByteField(term882619, term882619.getClass(), "minute", (byte) 29);
        setByteField(term882619, term882619.getClass(), "second", (byte) 30);
        setIntField(term882619, term882619.getClass(), "nano", 333447000);
        setField(term882614, term882614.getClass(), "time", term882619);
        setField(term882491, term882491.getClass(), "commonModuleSetTime", term882614);
        setField(term882491, term882491.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term882491, term882491.getClass(), "commonSkin", -1);
        setIntField(term882491, term882491.getClass(), "headphoneVolume", 100);
        setBooleanField(term882491, term882491.getClass(), "buttonSeOn", true);
        setIntField(term882491, term882491.getClass(), "buttonSeVolume", 100);
        setIntField(term882491, term882491.getClass(), "sliderSeVolume", 100);
        setIntField(term882491, term882491.getClass(), "buttonSe", -1);
        setIntField(term882491, term882491.getClass(), "chainSlideSe", -1);
        setIntField(term882491, term882491.getClass(), "slideSe", -1);
        setIntField(term882491, term882491.getClass(), "sliderTouchSe", -1);
        setField(term882491, term882491.getClass(), "sortMode", enum1898);
        setIntField(term882491, term882491.getClass(), "nextPvId", -1);
        setField(term882491, term882491.getClass(), "nextDifficulty", enum1899);
        setField(term882491, term882491.getClass(), "nextEdition", enum1900);
        setBooleanField(term882491, term882491.getClass(), "showInterimRanking", true);
        setBooleanField(term882491, term882491.getClass(), "showClearStatus", true);
        setBooleanField(term882491, term882491.getClass(), "showGreatBorder", true);
        setBooleanField(term882491, term882491.getClass(), "showExcellentBorder", true);
        setBooleanField(term882491, term882491.getClass(), "showRivalBorder", true);
        setBooleanField(term882491, term882491.getClass(), "showRgoSetting", true);
        setBooleanField(term882491, term882491.getClass(), "contestNowPlayingEnable", false);
        setIntField(term882491, term882491.getClass(), "contestNowPlayingId", -1);
        setIntField(term882491, term882491.getClass(), "contestNowPlayingValue", -1);
        setField(term882491, term882491.getClass(), "contestNowPlayingResultRank", enum1901);
        setField(term882491, term882491.getClass(), "contestNowPlayingSpecifier", "");
        setField(term882491, term882491.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term882491, term882491.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term882491, term882491.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term882491, term882491.getClass(), "rivalPdId", -1);
        Class<? extends Object> term884954 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term884953 = ((Class) term884954).getDeclaredField((String) "NAME");
        ((Field) term884953).setAccessible(true);
        enum1902 = ((Field) term884953).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Object[] args = new Object[1];
        args[0] = enum1902;
        callMethod(klass, "setSortMode", argTypes, term882491, args);
    }

};


