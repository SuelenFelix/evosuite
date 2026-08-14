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

public class PlayerProfile_setMyList2_1310407743100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4897939;

    public PlayerProfile_setMyList2_1310407743100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4898563 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term4898562 = ((Class) term4898563).getDeclaredField((String) "MISS");
        ((Field) term4898562).setAccessible(true);
        Object enum3132 = ((Field) term4898562).get((Object) null);
        Class<? extends Object> term4898940 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term4898939 = ((Class) term4898940).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term4898939).setAccessible(true);
        Object enum3133 = ((Field) term4898939).get((Object) null);
        Class<? extends Object> term4899223 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term4899222 = ((Class) term4899223).getDeclaredField((String) "NORMAL");
        ((Field) term4899222).setAccessible(true);
        Object enum3134 = ((Field) term4899222).get((Object) null);
        Class<? extends Object> term4899498 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term4899497 = ((Class) term4899498).getDeclaredField((String) "ORIGINAL");
        ((Field) term4899497).setAccessible(true);
        Object enum3135 = ((Field) term4899497).get((Object) null);
        Class<? extends Object> term4899764 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term4899763 = ((Class) term4899764).getDeclaredField((String) "NONE");
        ((Field) term4899763).setAccessible(true);
        Object enum3136 = ((Field) term4899763).get((Object) null);
        term4897939 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term4898062 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4898063 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4898067 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4897939, term4897939.getClass(), "id", 8352320750658799234L);
        setIntField(term4897939, term4897939.getClass(), "pdId", -2145029580);
        setField(term4897939, term4897939.getClass(), "playerName", "xxx");
        setIntField(term4897939, term4897939.getClass(), "vocaloidPoints", 300);
        setIntField(term4897939, term4897939.getClass(), "level", 1);
        setIntField(term4897939, term4897939.getClass(), "levelExp", 161445785);
        setField(term4897939, term4897939.getClass(), "levelTitle", "xxx");
        setIntField(term4897939, term4897939.getClass(), "plateId", -1);
        setIntField(term4897939, term4897939.getClass(), "plateEffectId", -1);
        setField(term4897939, term4897939.getClass(), "passwordStatus", enum3132);
        setField(term4897939, term4897939.getClass(), "password", "**********");
        setBooleanField(term4897939, term4897939.getClass(), "preferPerPvModule", true);
        setBooleanField(term4897939, term4897939.getClass(), "preferCommonModule", true);
        setBooleanField(term4897939, term4897939.getClass(), "usePerPvSkin", false);
        setBooleanField(term4897939, term4897939.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term4897939, term4897939.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term4897939, term4897939.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term4897939, term4897939.getClass(), "usePerPvTouchSliderSe", true);
        setField(term4897939, term4897939.getClass(), "commonModule", "-999,-999,-999");
        setField(term4897939, term4897939.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term4898063, term4898063.getClass(), "year", 2026);
        setShortField(term4898063, term4898063.getClass(), "month", (short) 8);
        setShortField(term4898063, term4898063.getClass(), "day", (short) 11);
        setField(term4898062, term4898062.getClass(), "date", term4898063);
        setByteField(term4898067, term4898067.getClass(), "hour", (byte) 23);
        setByteField(term4898067, term4898067.getClass(), "minute", (byte) 7);
        setByteField(term4898067, term4898067.getClass(), "second", (byte) 41);
        setIntField(term4898067, term4898067.getClass(), "nano", 340914000);
        setField(term4898062, term4898062.getClass(), "time", term4898067);
        setField(term4897939, term4897939.getClass(), "commonModuleSetTime", term4898062);
        setField(term4897939, term4897939.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term4897939, term4897939.getClass(), "commonSkin", -1);
        setIntField(term4897939, term4897939.getClass(), "headphoneVolume", 100);
        setBooleanField(term4897939, term4897939.getClass(), "buttonSeOn", true);
        setIntField(term4897939, term4897939.getClass(), "buttonSeVolume", 100);
        setIntField(term4897939, term4897939.getClass(), "sliderSeVolume", 100);
        setIntField(term4897939, term4897939.getClass(), "buttonSe", -1);
        setIntField(term4897939, term4897939.getClass(), "chainSlideSe", -1);
        setIntField(term4897939, term4897939.getClass(), "slideSe", -1);
        setIntField(term4897939, term4897939.getClass(), "sliderTouchSe", -1);
        setField(term4897939, term4897939.getClass(), "sortMode", enum3133);
        setIntField(term4897939, term4897939.getClass(), "nextPvId", -1);
        setField(term4897939, term4897939.getClass(), "nextDifficulty", enum3134);
        setField(term4897939, term4897939.getClass(), "nextEdition", enum3135);
        setBooleanField(term4897939, term4897939.getClass(), "showInterimRanking", true);
        setBooleanField(term4897939, term4897939.getClass(), "showClearStatus", true);
        setBooleanField(term4897939, term4897939.getClass(), "showGreatBorder", true);
        setBooleanField(term4897939, term4897939.getClass(), "showExcellentBorder", true);
        setBooleanField(term4897939, term4897939.getClass(), "showRivalBorder", true);
        setBooleanField(term4897939, term4897939.getClass(), "showRgoSetting", true);
        setBooleanField(term4897939, term4897939.getClass(), "contestNowPlayingEnable", true);
        setIntField(term4897939, term4897939.getClass(), "contestNowPlayingId", -1);
        setIntField(term4897939, term4897939.getClass(), "contestNowPlayingValue", -1);
        setField(term4897939, term4897939.getClass(), "contestNowPlayingResultRank", enum3136);
        setField(term4897939, term4897939.getClass(), "contestNowPlayingSpecifier", "");
        setField(term4897939, term4897939.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term4897939, term4897939.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term4897939, term4897939.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term4897939, term4897939.getClass(), "rivalPdId", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "tpbBvVWWnf";
        callMethod(klass, "setMyList2", argTypes, term4897939, args);
    }

};


