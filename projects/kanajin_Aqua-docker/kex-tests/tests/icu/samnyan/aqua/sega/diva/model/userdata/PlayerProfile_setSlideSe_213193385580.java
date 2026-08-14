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
import java.lang.Integer;

public class PlayerProfile_setSlideSe_213193385580 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term877581;
     Object term878186;

    public PlayerProfile_setSlideSe_213193385580() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term878195 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term878194 = ((Class) term878195).getDeclaredField((String) "MISS");
        ((Field) term878194).setAccessible(true);
        Object enum1887 = ((Field) term878194).get((Object) null);
        Class<? extends Object> term878572 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term878571 = ((Class) term878572).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term878571).setAccessible(true);
        Object enum1888 = ((Field) term878571).get((Object) null);
        Class<? extends Object> term878855 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term878854 = ((Class) term878855).getDeclaredField((String) "NORMAL");
        ((Field) term878854).setAccessible(true);
        Object enum1889 = ((Field) term878854).get((Object) null);
        Class<? extends Object> term879130 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term879129 = ((Class) term879130).getDeclaredField((String) "ORIGINAL");
        ((Field) term879129).setAccessible(true);
        Object enum1890 = ((Field) term879129).get((Object) null);
        Class<? extends Object> term879396 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term879395 = ((Class) term879396).getDeclaredField((String) "NONE");
        ((Field) term879395).setAccessible(true);
        Object enum1891 = ((Field) term879395).get((Object) null);
        term877581 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term877704 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term877705 = newInstance(Class.forName("java.time.LocalDate"));
        Object term877709 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term877581, term877581.getClass(), "id", -7840999196900383276L);
        setIntField(term877581, term877581.getClass(), "pdId", -2041732081);
        setField(term877581, term877581.getClass(), "playerName", "xxx");
        setIntField(term877581, term877581.getClass(), "vocaloidPoints", 300);
        setIntField(term877581, term877581.getClass(), "level", 1);
        setIntField(term877581, term877581.getClass(), "levelExp", 2073870078);
        setField(term877581, term877581.getClass(), "levelTitle", "xxx");
        setIntField(term877581, term877581.getClass(), "plateId", -1);
        setIntField(term877581, term877581.getClass(), "plateEffectId", -1);
        setField(term877581, term877581.getClass(), "passwordStatus", enum1887);
        setField(term877581, term877581.getClass(), "password", "**********");
        setBooleanField(term877581, term877581.getClass(), "preferPerPvModule", true);
        setBooleanField(term877581, term877581.getClass(), "preferCommonModule", true);
        setBooleanField(term877581, term877581.getClass(), "usePerPvSkin", false);
        setBooleanField(term877581, term877581.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term877581, term877581.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term877581, term877581.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term877581, term877581.getClass(), "usePerPvTouchSliderSe", true);
        setField(term877581, term877581.getClass(), "commonModule", "-999,-999,-999");
        setField(term877581, term877581.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term877705, term877705.getClass(), "year", 2026);
        setShortField(term877705, term877705.getClass(), "month", (short) 8);
        setShortField(term877705, term877705.getClass(), "day", (short) 12);
        setField(term877704, term877704.getClass(), "date", term877705);
        setByteField(term877709, term877709.getClass(), "hour", (byte) 2);
        setByteField(term877709, term877709.getClass(), "minute", (byte) 4);
        setByteField(term877709, term877709.getClass(), "second", (byte) 43);
        setIntField(term877709, term877709.getClass(), "nano", 329783000);
        setField(term877704, term877704.getClass(), "time", term877709);
        setField(term877581, term877581.getClass(), "commonModuleSetTime", term877704);
        setField(term877581, term877581.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term877581, term877581.getClass(), "commonSkin", -1);
        setIntField(term877581, term877581.getClass(), "headphoneVolume", 100);
        setBooleanField(term877581, term877581.getClass(), "buttonSeOn", true);
        setIntField(term877581, term877581.getClass(), "buttonSeVolume", 100);
        setIntField(term877581, term877581.getClass(), "sliderSeVolume", 100);
        setIntField(term877581, term877581.getClass(), "buttonSe", -1);
        setIntField(term877581, term877581.getClass(), "chainSlideSe", -1);
        setIntField(term877581, term877581.getClass(), "slideSe", -1);
        setIntField(term877581, term877581.getClass(), "sliderTouchSe", -1);
        setField(term877581, term877581.getClass(), "sortMode", enum1888);
        setIntField(term877581, term877581.getClass(), "nextPvId", -1);
        setField(term877581, term877581.getClass(), "nextDifficulty", enum1889);
        setField(term877581, term877581.getClass(), "nextEdition", enum1890);
        setBooleanField(term877581, term877581.getClass(), "showInterimRanking", true);
        setBooleanField(term877581, term877581.getClass(), "showClearStatus", true);
        setBooleanField(term877581, term877581.getClass(), "showGreatBorder", true);
        setBooleanField(term877581, term877581.getClass(), "showExcellentBorder", true);
        setBooleanField(term877581, term877581.getClass(), "showRivalBorder", true);
        setBooleanField(term877581, term877581.getClass(), "showRgoSetting", true);
        setBooleanField(term877581, term877581.getClass(), "contestNowPlayingEnable", false);
        setIntField(term877581, term877581.getClass(), "contestNowPlayingId", -1);
        setIntField(term877581, term877581.getClass(), "contestNowPlayingValue", -1);
        setField(term877581, term877581.getClass(), "contestNowPlayingResultRank", enum1891);
        setField(term877581, term877581.getClass(), "contestNowPlayingSpecifier", "");
        setField(term877581, term877581.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term877581, term877581.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term877581, term877581.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term877581, term877581.getClass(), "rivalPdId", -1);
        term878186 = new Integer(1649066040);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term878186;
        callMethod(klass, "setSlideSe", argTypes, term877581, args);
    }

};


