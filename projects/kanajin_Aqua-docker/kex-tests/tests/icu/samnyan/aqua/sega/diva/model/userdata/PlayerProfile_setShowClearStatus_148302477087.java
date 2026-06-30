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
import java.lang.Boolean;

public class PlayerProfile_setShowClearStatus_148302477087 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term895295;
     Object term895900;

    public PlayerProfile_setShowClearStatus_148302477087() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term895909 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term895908 = ((Class) term895909).getDeclaredField((String) "MISS");
        ((Field) term895908).setAccessible(true);
        Object enum1924 = ((Field) term895908).get((Object) null);
        Class<? extends Object> term896286 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term896285 = ((Class) term896286).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term896285).setAccessible(true);
        Object enum1925 = ((Field) term896285).get((Object) null);
        Class<? extends Object> term896569 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term896568 = ((Class) term896569).getDeclaredField((String) "NORMAL");
        ((Field) term896568).setAccessible(true);
        Object enum1926 = ((Field) term896568).get((Object) null);
        Class<? extends Object> term896844 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term896843 = ((Class) term896844).getDeclaredField((String) "ORIGINAL");
        ((Field) term896843).setAccessible(true);
        Object enum1927 = ((Field) term896843).get((Object) null);
        Class<? extends Object> term897110 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term897109 = ((Class) term897110).getDeclaredField((String) "NONE");
        ((Field) term897109).setAccessible(true);
        Object enum1928 = ((Field) term897109).get((Object) null);
        term895295 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term895418 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term895419 = newInstance(Class.forName("java.time.LocalDate"));
        Object term895423 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term895295, term895295.getClass(), "id", -872579514000598474L);
        setIntField(term895295, term895295.getClass(), "pdId", 1810292112);
        setField(term895295, term895295.getClass(), "playerName", "xxx");
        setIntField(term895295, term895295.getClass(), "vocaloidPoints", 300);
        setIntField(term895295, term895295.getClass(), "level", 1);
        setIntField(term895295, term895295.getClass(), "levelExp", 385619995);
        setField(term895295, term895295.getClass(), "levelTitle", "xxx");
        setIntField(term895295, term895295.getClass(), "plateId", -1);
        setIntField(term895295, term895295.getClass(), "plateEffectId", -1);
        setField(term895295, term895295.getClass(), "passwordStatus", enum1924);
        setField(term895295, term895295.getClass(), "password", "**********");
        setBooleanField(term895295, term895295.getClass(), "preferPerPvModule", true);
        setBooleanField(term895295, term895295.getClass(), "preferCommonModule", true);
        setBooleanField(term895295, term895295.getClass(), "usePerPvSkin", false);
        setBooleanField(term895295, term895295.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term895295, term895295.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term895295, term895295.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term895295, term895295.getClass(), "usePerPvTouchSliderSe", false);
        setField(term895295, term895295.getClass(), "commonModule", "-999,-999,-999");
        setField(term895295, term895295.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term895419, term895419.getClass(), "year", 2026);
        setShortField(term895419, term895419.getClass(), "month", (short) 6);
        setShortField(term895419, term895419.getClass(), "day", (short) 29);
        setField(term895418, term895418.getClass(), "date", term895419);
        setByteField(term895423, term895423.getClass(), "hour", (byte) 4);
        setByteField(term895423, term895423.getClass(), "minute", (byte) 29);
        setByteField(term895423, term895423.getClass(), "second", (byte) 31);
        setIntField(term895423, term895423.getClass(), "nano", 620443000);
        setField(term895418, term895418.getClass(), "time", term895423);
        setField(term895295, term895295.getClass(), "commonModuleSetTime", term895418);
        setField(term895295, term895295.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term895295, term895295.getClass(), "commonSkin", -1);
        setIntField(term895295, term895295.getClass(), "headphoneVolume", 100);
        setBooleanField(term895295, term895295.getClass(), "buttonSeOn", true);
        setIntField(term895295, term895295.getClass(), "buttonSeVolume", 100);
        setIntField(term895295, term895295.getClass(), "sliderSeVolume", 100);
        setIntField(term895295, term895295.getClass(), "buttonSe", -1);
        setIntField(term895295, term895295.getClass(), "chainSlideSe", -1);
        setIntField(term895295, term895295.getClass(), "slideSe", -1);
        setIntField(term895295, term895295.getClass(), "sliderTouchSe", -1);
        setField(term895295, term895295.getClass(), "sortMode", enum1925);
        setIntField(term895295, term895295.getClass(), "nextPvId", -1);
        setField(term895295, term895295.getClass(), "nextDifficulty", enum1926);
        setField(term895295, term895295.getClass(), "nextEdition", enum1927);
        setBooleanField(term895295, term895295.getClass(), "showInterimRanking", true);
        setBooleanField(term895295, term895295.getClass(), "showClearStatus", true);
        setBooleanField(term895295, term895295.getClass(), "showGreatBorder", true);
        setBooleanField(term895295, term895295.getClass(), "showExcellentBorder", true);
        setBooleanField(term895295, term895295.getClass(), "showRivalBorder", true);
        setBooleanField(term895295, term895295.getClass(), "showRgoSetting", true);
        setBooleanField(term895295, term895295.getClass(), "contestNowPlayingEnable", true);
        setIntField(term895295, term895295.getClass(), "contestNowPlayingId", -1);
        setIntField(term895295, term895295.getClass(), "contestNowPlayingValue", -1);
        setField(term895295, term895295.getClass(), "contestNowPlayingResultRank", enum1928);
        setField(term895295, term895295.getClass(), "contestNowPlayingSpecifier", "");
        setField(term895295, term895295.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term895295, term895295.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term895295, term895295.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term895295, term895295.getClass(), "rivalPdId", -1);
        term895900 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term895900;
        callMethod(klass, "setShowClearStatus", argTypes, term895295, args);
    }

};


