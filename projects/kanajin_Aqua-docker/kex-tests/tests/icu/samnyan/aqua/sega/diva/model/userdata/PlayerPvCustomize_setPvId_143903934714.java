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

public class PlayerPvCustomize_setPvId_143903934714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term983707;
     Object term984434;

    public PlayerPvCustomize_setPvId_143903934714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term984443 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term984442 = ((Class) term984443).getDeclaredField((String) "MISS");
        ((Field) term984442).setAccessible(true);
        Object enum2090 = ((Field) term984442).get((Object) null);
        Class<? extends Object> term984820 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term984819 = ((Class) term984820).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term984819).setAccessible(true);
        Object enum2091 = ((Field) term984819).get((Object) null);
        Class<? extends Object> term985103 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term985102 = ((Class) term985103).getDeclaredField((String) "NORMAL");
        ((Field) term985102).setAccessible(true);
        Object enum2092 = ((Field) term985102).get((Object) null);
        Class<? extends Object> term985378 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term985377 = ((Class) term985378).getDeclaredField((String) "ORIGINAL");
        ((Field) term985377).setAccessible(true);
        Object enum2093 = ((Field) term985377).get((Object) null);
        Class<? extends Object> term985644 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term985643 = ((Class) term985644).getDeclaredField((String) "NONE");
        ((Field) term985643).setAccessible(true);
        Object enum2094 = ((Field) term985643).get((Object) null);
        term983707 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvCustomize"));
        Object term983709 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term983832 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term983833 = newInstance(Class.forName("java.time.LocalDate"));
        Object term983837 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term983707, term983707.getClass(), "id", 4041117732464806744L);
        setLongField(term983709, term983709.getClass(), "id", 7199459243454109261L);
        setIntField(term983709, term983709.getClass(), "pdId", 1803068346);
        setField(term983709, term983709.getClass(), "playerName", "xxx");
        setIntField(term983709, term983709.getClass(), "vocaloidPoints", 300);
        setIntField(term983709, term983709.getClass(), "level", 1);
        setIntField(term983709, term983709.getClass(), "levelExp", 1598485572);
        setField(term983709, term983709.getClass(), "levelTitle", "xxx");
        setIntField(term983709, term983709.getClass(), "plateId", -1);
        setIntField(term983709, term983709.getClass(), "plateEffectId", -1);
        setField(term983709, term983709.getClass(), "passwordStatus", enum2090);
        setField(term983709, term983709.getClass(), "password", "**********");
        setBooleanField(term983709, term983709.getClass(), "preferPerPvModule", true);
        setBooleanField(term983709, term983709.getClass(), "preferCommonModule", true);
        setBooleanField(term983709, term983709.getClass(), "usePerPvSkin", true);
        setBooleanField(term983709, term983709.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term983709, term983709.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term983709, term983709.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term983709, term983709.getClass(), "usePerPvTouchSliderSe", true);
        setField(term983709, term983709.getClass(), "commonModule", "-999,-999,-999");
        setField(term983709, term983709.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term983833, term983833.getClass(), "year", 2026);
        setShortField(term983833, term983833.getClass(), "month", (short) 8);
        setShortField(term983833, term983833.getClass(), "day", (short) 12);
        setField(term983832, term983832.getClass(), "date", term983833);
        setByteField(term983837, term983837.getClass(), "hour", (byte) 2);
        setByteField(term983837, term983837.getClass(), "minute", (byte) 5);
        setByteField(term983837, term983837.getClass(), "second", (byte) 19);
        setIntField(term983837, term983837.getClass(), "nano", 879759000);
        setField(term983832, term983832.getClass(), "time", term983837);
        setField(term983709, term983709.getClass(), "commonModuleSetTime", term983832);
        setField(term983709, term983709.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term983709, term983709.getClass(), "commonSkin", -1);
        setIntField(term983709, term983709.getClass(), "headphoneVolume", 100);
        setBooleanField(term983709, term983709.getClass(), "buttonSeOn", true);
        setIntField(term983709, term983709.getClass(), "buttonSeVolume", 100);
        setIntField(term983709, term983709.getClass(), "sliderSeVolume", 100);
        setIntField(term983709, term983709.getClass(), "buttonSe", -1);
        setIntField(term983709, term983709.getClass(), "chainSlideSe", -1);
        setIntField(term983709, term983709.getClass(), "slideSe", -1);
        setIntField(term983709, term983709.getClass(), "sliderTouchSe", -1);
        setField(term983709, term983709.getClass(), "sortMode", enum2091);
        setIntField(term983709, term983709.getClass(), "nextPvId", -1);
        setField(term983709, term983709.getClass(), "nextDifficulty", enum2092);
        setField(term983709, term983709.getClass(), "nextEdition", enum2093);
        setBooleanField(term983709, term983709.getClass(), "showInterimRanking", true);
        setBooleanField(term983709, term983709.getClass(), "showClearStatus", true);
        setBooleanField(term983709, term983709.getClass(), "showGreatBorder", true);
        setBooleanField(term983709, term983709.getClass(), "showExcellentBorder", true);
        setBooleanField(term983709, term983709.getClass(), "showRivalBorder", true);
        setBooleanField(term983709, term983709.getClass(), "showRgoSetting", true);
        setBooleanField(term983709, term983709.getClass(), "contestNowPlayingEnable", false);
        setIntField(term983709, term983709.getClass(), "contestNowPlayingId", -1);
        setIntField(term983709, term983709.getClass(), "contestNowPlayingValue", -1);
        setField(term983709, term983709.getClass(), "contestNowPlayingResultRank", enum2094);
        setField(term983709, term983709.getClass(), "contestNowPlayingSpecifier", "");
        setField(term983709, term983709.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term983709, term983709.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term983709, term983709.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term983709, term983709.getClass(), "rivalPdId", -1);
        setField(term983707, term983707.getClass(), "pdId", term983709);
        setIntField(term983707, term983707.getClass(), "pvId", -1);
        setField(term983707, term983707.getClass(), "module", "-999,-999,-999");
        setField(term983707, term983707.getClass(), "customize", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setField(term983707, term983707.getClass(), "customizeFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term983707, term983707.getClass(), "skin", -1);
        setIntField(term983707, term983707.getClass(), "buttonSe", -1);
        setIntField(term983707, term983707.getClass(), "slideSe", -1);
        setIntField(term983707, term983707.getClass(), "chainSlideSe", -1);
        setIntField(term983707, term983707.getClass(), "sliderTouchSe", -1);
        term984434 = new Integer(1328348146);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvCustomize");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term984434;
        callMethod(klass, "setPvId", argTypes, term983707, args);
    }

};


