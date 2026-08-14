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

public class PlayerProfile_equals_2036693110101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term930044;
     Object term930649;

    public PlayerProfile_equals_2036693110101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term930657 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term930656 = ((Class) term930657).getDeclaredField((String) "MISS");
        ((Field) term930656).setAccessible(true);
        Object enum1995 = ((Field) term930656).get((Object) null);
        Class<? extends Object> term931034 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term931033 = ((Class) term931034).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term931033).setAccessible(true);
        Object enum1996 = ((Field) term931033).get((Object) null);
        Class<? extends Object> term931317 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term931316 = ((Class) term931317).getDeclaredField((String) "NORMAL");
        ((Field) term931316).setAccessible(true);
        Object enum1997 = ((Field) term931316).get((Object) null);
        Class<? extends Object> term931592 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term931591 = ((Class) term931592).getDeclaredField((String) "ORIGINAL");
        ((Field) term931591).setAccessible(true);
        Object enum1998 = ((Field) term931591).get((Object) null);
        Class<? extends Object> term931858 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term931857 = ((Class) term931858).getDeclaredField((String) "NONE");
        ((Field) term931857).setAccessible(true);
        Object enum1999 = ((Field) term931857).get((Object) null);
        term930044 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term930167 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term930168 = newInstance(Class.forName("java.time.LocalDate"));
        Object term930172 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term930044, term930044.getClass(), "id", -8928717808154338062L);
        setIntField(term930044, term930044.getClass(), "pdId", 1670477259);
        setField(term930044, term930044.getClass(), "playerName", "xxx");
        setIntField(term930044, term930044.getClass(), "vocaloidPoints", 300);
        setIntField(term930044, term930044.getClass(), "level", 1);
        setIntField(term930044, term930044.getClass(), "levelExp", 186917839);
        setField(term930044, term930044.getClass(), "levelTitle", "xxx");
        setIntField(term930044, term930044.getClass(), "plateId", -1);
        setIntField(term930044, term930044.getClass(), "plateEffectId", -1);
        setField(term930044, term930044.getClass(), "passwordStatus", enum1995);
        setField(term930044, term930044.getClass(), "password", "**********");
        setBooleanField(term930044, term930044.getClass(), "preferPerPvModule", true);
        setBooleanField(term930044, term930044.getClass(), "preferCommonModule", true);
        setBooleanField(term930044, term930044.getClass(), "usePerPvSkin", false);
        setBooleanField(term930044, term930044.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term930044, term930044.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term930044, term930044.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term930044, term930044.getClass(), "usePerPvTouchSliderSe", true);
        setField(term930044, term930044.getClass(), "commonModule", "-999,-999,-999");
        setField(term930044, term930044.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term930168, term930168.getClass(), "year", 2026);
        setShortField(term930168, term930168.getClass(), "month", (short) 8);
        setShortField(term930168, term930168.getClass(), "day", (short) 12);
        setField(term930167, term930167.getClass(), "date", term930168);
        setByteField(term930172, term930172.getClass(), "hour", (byte) 2);
        setByteField(term930172, term930172.getClass(), "minute", (byte) 4);
        setByteField(term930172, term930172.getClass(), "second", (byte) 48);
        setIntField(term930172, term930172.getClass(), "nano", 760283000);
        setField(term930167, term930167.getClass(), "time", term930172);
        setField(term930044, term930044.getClass(), "commonModuleSetTime", term930167);
        setField(term930044, term930044.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term930044, term930044.getClass(), "commonSkin", -1);
        setIntField(term930044, term930044.getClass(), "headphoneVolume", 100);
        setBooleanField(term930044, term930044.getClass(), "buttonSeOn", true);
        setIntField(term930044, term930044.getClass(), "buttonSeVolume", 100);
        setIntField(term930044, term930044.getClass(), "sliderSeVolume", 100);
        setIntField(term930044, term930044.getClass(), "buttonSe", -1);
        setIntField(term930044, term930044.getClass(), "chainSlideSe", -1);
        setIntField(term930044, term930044.getClass(), "slideSe", -1);
        setIntField(term930044, term930044.getClass(), "sliderTouchSe", -1);
        setField(term930044, term930044.getClass(), "sortMode", enum1996);
        setIntField(term930044, term930044.getClass(), "nextPvId", -1);
        setField(term930044, term930044.getClass(), "nextDifficulty", enum1997);
        setField(term930044, term930044.getClass(), "nextEdition", enum1998);
        setBooleanField(term930044, term930044.getClass(), "showInterimRanking", true);
        setBooleanField(term930044, term930044.getClass(), "showClearStatus", true);
        setBooleanField(term930044, term930044.getClass(), "showGreatBorder", true);
        setBooleanField(term930044, term930044.getClass(), "showExcellentBorder", true);
        setBooleanField(term930044, term930044.getClass(), "showRivalBorder", true);
        setBooleanField(term930044, term930044.getClass(), "showRgoSetting", true);
        setBooleanField(term930044, term930044.getClass(), "contestNowPlayingEnable", false);
        setIntField(term930044, term930044.getClass(), "contestNowPlayingId", -1);
        setIntField(term930044, term930044.getClass(), "contestNowPlayingValue", -1);
        setField(term930044, term930044.getClass(), "contestNowPlayingResultRank", enum1999);
        setField(term930044, term930044.getClass(), "contestNowPlayingSpecifier", "");
        setField(term930044, term930044.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term930044, term930044.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term930044, term930044.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term930044, term930044.getClass(), "rivalPdId", -1);
        term930649 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term930649;
        callMethod(klass, "equals", argTypes, term930044, args);
    }

};


