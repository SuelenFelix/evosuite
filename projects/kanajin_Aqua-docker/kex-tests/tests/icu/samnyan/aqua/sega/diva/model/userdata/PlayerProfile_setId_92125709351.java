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
import java.lang.Long;

public class PlayerProfile_setId_92125709351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term806260;
     Object term806865;

    public PlayerProfile_setId_92125709351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term806874 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term806873 = ((Class) term806874).getDeclaredField((String) "MISS");
        ((Field) term806873).setAccessible(true);
        Object enum1742 = ((Field) term806873).get((Object) null);
        Class<? extends Object> term807251 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term807250 = ((Class) term807251).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term807250).setAccessible(true);
        Object enum1743 = ((Field) term807250).get((Object) null);
        Class<? extends Object> term807534 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term807533 = ((Class) term807534).getDeclaredField((String) "NORMAL");
        ((Field) term807533).setAccessible(true);
        Object enum1744 = ((Field) term807533).get((Object) null);
        Class<? extends Object> term807809 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term807808 = ((Class) term807809).getDeclaredField((String) "ORIGINAL");
        ((Field) term807808).setAccessible(true);
        Object enum1745 = ((Field) term807808).get((Object) null);
        Class<? extends Object> term808075 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term808074 = ((Class) term808075).getDeclaredField((String) "NONE");
        ((Field) term808074).setAccessible(true);
        Object enum1746 = ((Field) term808074).get((Object) null);
        term806260 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term806383 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term806384 = newInstance(Class.forName("java.time.LocalDate"));
        Object term806388 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term806260, term806260.getClass(), "id", -5714578622746827780L);
        setIntField(term806260, term806260.getClass(), "pdId", -1536684680);
        setField(term806260, term806260.getClass(), "playerName", "xxx");
        setIntField(term806260, term806260.getClass(), "vocaloidPoints", 300);
        setIntField(term806260, term806260.getClass(), "level", 1);
        setIntField(term806260, term806260.getClass(), "levelExp", -322159635);
        setField(term806260, term806260.getClass(), "levelTitle", "xxx");
        setIntField(term806260, term806260.getClass(), "plateId", -1);
        setIntField(term806260, term806260.getClass(), "plateEffectId", -1);
        setField(term806260, term806260.getClass(), "passwordStatus", enum1742);
        setField(term806260, term806260.getClass(), "password", "**********");
        setBooleanField(term806260, term806260.getClass(), "preferPerPvModule", true);
        setBooleanField(term806260, term806260.getClass(), "preferCommonModule", false);
        setBooleanField(term806260, term806260.getClass(), "usePerPvSkin", false);
        setBooleanField(term806260, term806260.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term806260, term806260.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term806260, term806260.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term806260, term806260.getClass(), "usePerPvTouchSliderSe", false);
        setField(term806260, term806260.getClass(), "commonModule", "-999,-999,-999");
        setField(term806260, term806260.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term806384, term806384.getClass(), "year", 2026);
        setShortField(term806384, term806384.getClass(), "month", (short) 8);
        setShortField(term806384, term806384.getClass(), "day", (short) 12);
        setField(term806383, term806383.getClass(), "date", term806384);
        setByteField(term806388, term806388.getClass(), "hour", (byte) 2);
        setByteField(term806388, term806388.getClass(), "minute", (byte) 4);
        setByteField(term806388, term806388.getClass(), "second", (byte) 35);
        setIntField(term806388, term806388.getClass(), "nano", 766267000);
        setField(term806383, term806383.getClass(), "time", term806388);
        setField(term806260, term806260.getClass(), "commonModuleSetTime", term806383);
        setField(term806260, term806260.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term806260, term806260.getClass(), "commonSkin", -1);
        setIntField(term806260, term806260.getClass(), "headphoneVolume", 100);
        setBooleanField(term806260, term806260.getClass(), "buttonSeOn", true);
        setIntField(term806260, term806260.getClass(), "buttonSeVolume", 100);
        setIntField(term806260, term806260.getClass(), "sliderSeVolume", 100);
        setIntField(term806260, term806260.getClass(), "buttonSe", -1);
        setIntField(term806260, term806260.getClass(), "chainSlideSe", -1);
        setIntField(term806260, term806260.getClass(), "slideSe", -1);
        setIntField(term806260, term806260.getClass(), "sliderTouchSe", -1);
        setField(term806260, term806260.getClass(), "sortMode", enum1743);
        setIntField(term806260, term806260.getClass(), "nextPvId", -1);
        setField(term806260, term806260.getClass(), "nextDifficulty", enum1744);
        setField(term806260, term806260.getClass(), "nextEdition", enum1745);
        setBooleanField(term806260, term806260.getClass(), "showInterimRanking", true);
        setBooleanField(term806260, term806260.getClass(), "showClearStatus", true);
        setBooleanField(term806260, term806260.getClass(), "showGreatBorder", true);
        setBooleanField(term806260, term806260.getClass(), "showExcellentBorder", true);
        setBooleanField(term806260, term806260.getClass(), "showRivalBorder", true);
        setBooleanField(term806260, term806260.getClass(), "showRgoSetting", true);
        setBooleanField(term806260, term806260.getClass(), "contestNowPlayingEnable", true);
        setIntField(term806260, term806260.getClass(), "contestNowPlayingId", -1);
        setIntField(term806260, term806260.getClass(), "contestNowPlayingValue", -1);
        setField(term806260, term806260.getClass(), "contestNowPlayingResultRank", enum1746);
        setField(term806260, term806260.getClass(), "contestNowPlayingSpecifier", "");
        setField(term806260, term806260.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term806260, term806260.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term806260, term806260.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term806260, term806260.getClass(), "rivalPdId", -1);
        term806865 = new Long(8918129626022907229L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term806865;
        callMethod(klass, "setId", argTypes, term806260, args);
    }

};


