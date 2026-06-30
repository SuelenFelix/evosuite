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

public class PlayerPvCustomize_setCustomizeFlag_204868187417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term991802;

    public PlayerPvCustomize_setCustomizeFlag_204868187417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term992548 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term992547 = ((Class) term992548).getDeclaredField((String) "MISS");
        ((Field) term992547).setAccessible(true);
        Object enum2105 = ((Field) term992547).get((Object) null);
        Class<? extends Object> term992925 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term992924 = ((Class) term992925).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term992924).setAccessible(true);
        Object enum2106 = ((Field) term992924).get((Object) null);
        Class<? extends Object> term993208 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term993207 = ((Class) term993208).getDeclaredField((String) "NORMAL");
        ((Field) term993207).setAccessible(true);
        Object enum2107 = ((Field) term993207).get((Object) null);
        Class<? extends Object> term993483 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term993482 = ((Class) term993483).getDeclaredField((String) "ORIGINAL");
        ((Field) term993482).setAccessible(true);
        Object enum2108 = ((Field) term993482).get((Object) null);
        Class<? extends Object> term993749 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term993748 = ((Class) term993749).getDeclaredField((String) "NONE");
        ((Field) term993748).setAccessible(true);
        Object enum2109 = ((Field) term993748).get((Object) null);
        term991802 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvCustomize"));
        Object term991804 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term991927 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term991928 = newInstance(Class.forName("java.time.LocalDate"));
        Object term991932 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term991802, term991802.getClass(), "id", -894705411488729365L);
        setLongField(term991804, term991804.getClass(), "id", -7514437039500876647L);
        setIntField(term991804, term991804.getClass(), "pdId", 913224981);
        setField(term991804, term991804.getClass(), "playerName", "xxx");
        setIntField(term991804, term991804.getClass(), "vocaloidPoints", 300);
        setIntField(term991804, term991804.getClass(), "level", 1);
        setIntField(term991804, term991804.getClass(), "levelExp", -2064677239);
        setField(term991804, term991804.getClass(), "levelTitle", "xxx");
        setIntField(term991804, term991804.getClass(), "plateId", -1);
        setIntField(term991804, term991804.getClass(), "plateEffectId", -1);
        setField(term991804, term991804.getClass(), "passwordStatus", enum2105);
        setField(term991804, term991804.getClass(), "password", "**********");
        setBooleanField(term991804, term991804.getClass(), "preferPerPvModule", true);
        setBooleanField(term991804, term991804.getClass(), "preferCommonModule", true);
        setBooleanField(term991804, term991804.getClass(), "usePerPvSkin", true);
        setBooleanField(term991804, term991804.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term991804, term991804.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term991804, term991804.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term991804, term991804.getClass(), "usePerPvTouchSliderSe", false);
        setField(term991804, term991804.getClass(), "commonModule", "-999,-999,-999");
        setField(term991804, term991804.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term991928, term991928.getClass(), "year", 2026);
        setShortField(term991928, term991928.getClass(), "month", (short) 6);
        setShortField(term991928, term991928.getClass(), "day", (short) 29);
        setField(term991927, term991927.getClass(), "date", term991928);
        setByteField(term991932, term991932.getClass(), "hour", (byte) 4);
        setByteField(term991932, term991932.getClass(), "minute", (byte) 30);
        setByteField(term991932, term991932.getClass(), "second", (byte) 8);
        setIntField(term991932, term991932.getClass(), "nano", 478672000);
        setField(term991927, term991927.getClass(), "time", term991932);
        setField(term991804, term991804.getClass(), "commonModuleSetTime", term991927);
        setField(term991804, term991804.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term991804, term991804.getClass(), "commonSkin", -1);
        setIntField(term991804, term991804.getClass(), "headphoneVolume", 100);
        setBooleanField(term991804, term991804.getClass(), "buttonSeOn", true);
        setIntField(term991804, term991804.getClass(), "buttonSeVolume", 100);
        setIntField(term991804, term991804.getClass(), "sliderSeVolume", 100);
        setIntField(term991804, term991804.getClass(), "buttonSe", -1);
        setIntField(term991804, term991804.getClass(), "chainSlideSe", -1);
        setIntField(term991804, term991804.getClass(), "slideSe", -1);
        setIntField(term991804, term991804.getClass(), "sliderTouchSe", -1);
        setField(term991804, term991804.getClass(), "sortMode", enum2106);
        setIntField(term991804, term991804.getClass(), "nextPvId", -1);
        setField(term991804, term991804.getClass(), "nextDifficulty", enum2107);
        setField(term991804, term991804.getClass(), "nextEdition", enum2108);
        setBooleanField(term991804, term991804.getClass(), "showInterimRanking", true);
        setBooleanField(term991804, term991804.getClass(), "showClearStatus", true);
        setBooleanField(term991804, term991804.getClass(), "showGreatBorder", true);
        setBooleanField(term991804, term991804.getClass(), "showExcellentBorder", true);
        setBooleanField(term991804, term991804.getClass(), "showRivalBorder", true);
        setBooleanField(term991804, term991804.getClass(), "showRgoSetting", true);
        setBooleanField(term991804, term991804.getClass(), "contestNowPlayingEnable", true);
        setIntField(term991804, term991804.getClass(), "contestNowPlayingId", -1);
        setIntField(term991804, term991804.getClass(), "contestNowPlayingValue", -1);
        setField(term991804, term991804.getClass(), "contestNowPlayingResultRank", enum2109);
        setField(term991804, term991804.getClass(), "contestNowPlayingSpecifier", "");
        setField(term991804, term991804.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term991804, term991804.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term991804, term991804.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term991804, term991804.getClass(), "rivalPdId", -1);
        setField(term991802, term991802.getClass(), "pdId", term991804);
        setIntField(term991802, term991802.getClass(), "pvId", -1);
        setField(term991802, term991802.getClass(), "module", "-999,-999,-999");
        setField(term991802, term991802.getClass(), "customize", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setField(term991802, term991802.getClass(), "customizeFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term991802, term991802.getClass(), "skin", -1);
        setIntField(term991802, term991802.getClass(), "buttonSe", -1);
        setIntField(term991802, term991802.getClass(), "slideSe", -1);
        setIntField(term991802, term991802.getClass(), "chainSlideSe", -1);
        setIntField(term991802, term991802.getClass(), "sliderTouchSe", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvCustomize");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JOqQxuzRuZ";
        callMethod(klass, "setCustomizeFlag", argTypes, term991802, args);
    }

};


