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

public class PlayerContest_setFlag_203333712115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38297;
     Object term38918;

    public PlayerContest_setFlag_203333712115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term38927 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term38926 = ((Class) term38927).getDeclaredField((String) "MISS");
        ((Field) term38926).setAccessible(true);
        Object enum75 = ((Field) term38926).get((Object) null);
        Class<? extends Object> term39304 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term39303 = ((Class) term39304).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term39303).setAccessible(true);
        Object enum76 = ((Field) term39303).get((Object) null);
        Class<? extends Object> term39587 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term39586 = ((Class) term39587).getDeclaredField((String) "NORMAL");
        ((Field) term39586).setAccessible(true);
        Object enum77 = ((Field) term39586).get((Object) null);
        Class<? extends Object> term39862 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term39861 = ((Class) term39862).getDeclaredField((String) "ORIGINAL");
        ((Field) term39861).setAccessible(true);
        Object enum78 = ((Field) term39861).get((Object) null);
        Class<? extends Object> term40128 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term40127 = ((Class) term40128).getDeclaredField((String) "NONE");
        ((Field) term40127).setAccessible(true);
        Object enum79 = ((Field) term40127).get((Object) null);
        term38297 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerContest"));
        Object term38299 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term38422 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term38423 = newInstance(Class.forName("java.time.LocalDate"));
        Object term38427 = newInstance(Class.forName("java.time.LocalTime"));
        Object term38908 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term38909 = newInstance(Class.forName("java.time.LocalDate"));
        Object term38913 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term38297, term38297.getClass(), "id", -5892135042702373494L);
        setLongField(term38299, term38299.getClass(), "id", 5262507301787091109L);
        setIntField(term38299, term38299.getClass(), "pdId", 1225272962);
        setField(term38299, term38299.getClass(), "playerName", "xxx");
        setIntField(term38299, term38299.getClass(), "vocaloidPoints", 300);
        setIntField(term38299, term38299.getClass(), "level", 1);
        setIntField(term38299, term38299.getClass(), "levelExp", 1324040357);
        setField(term38299, term38299.getClass(), "levelTitle", "xxx");
        setIntField(term38299, term38299.getClass(), "plateId", -1);
        setIntField(term38299, term38299.getClass(), "plateEffectId", -1);
        setField(term38299, term38299.getClass(), "passwordStatus", enum75);
        setField(term38299, term38299.getClass(), "password", "**********");
        setBooleanField(term38299, term38299.getClass(), "preferPerPvModule", true);
        setBooleanField(term38299, term38299.getClass(), "preferCommonModule", true);
        setBooleanField(term38299, term38299.getClass(), "usePerPvSkin", false);
        setBooleanField(term38299, term38299.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term38299, term38299.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term38299, term38299.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term38299, term38299.getClass(), "usePerPvTouchSliderSe", true);
        setField(term38299, term38299.getClass(), "commonModule", "-999,-999,-999");
        setField(term38299, term38299.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term38423, term38423.getClass(), "year", 2026);
        setShortField(term38423, term38423.getClass(), "month", (short) 6);
        setShortField(term38423, term38423.getClass(), "day", (short) 29);
        setField(term38422, term38422.getClass(), "date", term38423);
        setByteField(term38427, term38427.getClass(), "hour", (byte) 4);
        setByteField(term38427, term38427.getClass(), "minute", (byte) 27);
        setByteField(term38427, term38427.getClass(), "second", (byte) 15);
        setIntField(term38427, term38427.getClass(), "nano", 581477000);
        setField(term38422, term38422.getClass(), "time", term38427);
        setField(term38299, term38299.getClass(), "commonModuleSetTime", term38422);
        setField(term38299, term38299.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term38299, term38299.getClass(), "commonSkin", -1);
        setIntField(term38299, term38299.getClass(), "headphoneVolume", 100);
        setBooleanField(term38299, term38299.getClass(), "buttonSeOn", true);
        setIntField(term38299, term38299.getClass(), "buttonSeVolume", 100);
        setIntField(term38299, term38299.getClass(), "sliderSeVolume", 100);
        setIntField(term38299, term38299.getClass(), "buttonSe", -1);
        setIntField(term38299, term38299.getClass(), "chainSlideSe", -1);
        setIntField(term38299, term38299.getClass(), "slideSe", -1);
        setIntField(term38299, term38299.getClass(), "sliderTouchSe", -1);
        setField(term38299, term38299.getClass(), "sortMode", enum76);
        setIntField(term38299, term38299.getClass(), "nextPvId", -1);
        setField(term38299, term38299.getClass(), "nextDifficulty", enum77);
        setField(term38299, term38299.getClass(), "nextEdition", enum78);
        setBooleanField(term38299, term38299.getClass(), "showInterimRanking", true);
        setBooleanField(term38299, term38299.getClass(), "showClearStatus", true);
        setBooleanField(term38299, term38299.getClass(), "showGreatBorder", true);
        setBooleanField(term38299, term38299.getClass(), "showExcellentBorder", true);
        setBooleanField(term38299, term38299.getClass(), "showRivalBorder", true);
        setBooleanField(term38299, term38299.getClass(), "showRgoSetting", true);
        setBooleanField(term38299, term38299.getClass(), "contestNowPlayingEnable", false);
        setIntField(term38299, term38299.getClass(), "contestNowPlayingId", -1);
        setIntField(term38299, term38299.getClass(), "contestNowPlayingValue", -1);
        setField(term38299, term38299.getClass(), "contestNowPlayingResultRank", enum79);
        setField(term38299, term38299.getClass(), "contestNowPlayingSpecifier", "");
        setField(term38299, term38299.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term38299, term38299.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term38299, term38299.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term38299, term38299.getClass(), "rivalPdId", -1);
        setField(term38297, term38297.getClass(), "pdId", term38299);
        setIntField(term38297, term38297.getClass(), "contestId", -1588772968);
        setIntField(term38297, term38297.getClass(), "startCount", -93135961);
        setField(term38297, term38297.getClass(), "resultRank", enum79);
        setIntField(term38297, term38297.getClass(), "bestValue", -1);
        setIntField(term38297, term38297.getClass(), "flag", -1);
        setIntField(term38909, term38909.getClass(), "year", 2026);
        setShortField(term38909, term38909.getClass(), "month", (short) 6);
        setShortField(term38909, term38909.getClass(), "day", (short) 29);
        setField(term38908, term38908.getClass(), "date", term38909);
        setByteField(term38913, term38913.getClass(), "hour", (byte) 4);
        setByteField(term38913, term38913.getClass(), "minute", (byte) 27);
        setByteField(term38913, term38913.getClass(), "second", (byte) 15);
        setIntField(term38913, term38913.getClass(), "nano", 581298000);
        setField(term38908, term38908.getClass(), "time", term38913);
        setField(term38297, term38297.getClass(), "lastUpdateTime", term38908);
        term38918 = new Integer(-112921587);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerContest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term38918;
        callMethod(klass, "setFlag", argTypes, term38297, args);
    }

};


