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

public class PlayerProfile_getPlayerName_5157530073 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term688516;

    public PlayerProfile_getPlayerName_5157530073() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term689128 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term689127 = ((Class) term689128).getDeclaredField((String) "MISS");
        ((Field) term689127).setAccessible(true);
        Object enum1502 = ((Field) term689127).get((Object) null);
        Class<? extends Object> term689505 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term689504 = ((Class) term689505).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term689504).setAccessible(true);
        Object enum1503 = ((Field) term689504).get((Object) null);
        Class<? extends Object> term689788 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term689787 = ((Class) term689788).getDeclaredField((String) "NORMAL");
        ((Field) term689787).setAccessible(true);
        Object enum1504 = ((Field) term689787).get((Object) null);
        Class<? extends Object> term690063 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term690062 = ((Class) term690063).getDeclaredField((String) "ORIGINAL");
        ((Field) term690062).setAccessible(true);
        Object enum1505 = ((Field) term690062).get((Object) null);
        Class<? extends Object> term690329 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term690328 = ((Class) term690329).getDeclaredField((String) "NONE");
        ((Field) term690328).setAccessible(true);
        Object enum1506 = ((Field) term690328).get((Object) null);
        term688516 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term688639 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term688640 = newInstance(Class.forName("java.time.LocalDate"));
        Object term688644 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term688516, term688516.getClass(), "id", -1365372122034008688L);
        setIntField(term688516, term688516.getClass(), "pdId", -147381920);
        setField(term688516, term688516.getClass(), "playerName", "xxx");
        setIntField(term688516, term688516.getClass(), "vocaloidPoints", 300);
        setIntField(term688516, term688516.getClass(), "level", 1);
        setIntField(term688516, term688516.getClass(), "levelExp", -7568006);
        setField(term688516, term688516.getClass(), "levelTitle", "xxx");
        setIntField(term688516, term688516.getClass(), "plateId", -1);
        setIntField(term688516, term688516.getClass(), "plateEffectId", -1);
        setField(term688516, term688516.getClass(), "passwordStatus", enum1502);
        setField(term688516, term688516.getClass(), "password", "**********");
        setBooleanField(term688516, term688516.getClass(), "preferPerPvModule", true);
        setBooleanField(term688516, term688516.getClass(), "preferCommonModule", true);
        setBooleanField(term688516, term688516.getClass(), "usePerPvSkin", false);
        setBooleanField(term688516, term688516.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term688516, term688516.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term688516, term688516.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term688516, term688516.getClass(), "usePerPvTouchSliderSe", false);
        setField(term688516, term688516.getClass(), "commonModule", "-999,-999,-999");
        setField(term688516, term688516.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term688640, term688640.getClass(), "year", 2026);
        setShortField(term688640, term688640.getClass(), "month", (short) 8);
        setShortField(term688640, term688640.getClass(), "day", (short) 12);
        setField(term688639, term688639.getClass(), "date", term688640);
        setByteField(term688644, term688644.getClass(), "hour", (byte) 2);
        setByteField(term688644, term688644.getClass(), "minute", (byte) 4);
        setByteField(term688644, term688644.getClass(), "second", (byte) 23);
        setIntField(term688644, term688644.getClass(), "nano", 382204000);
        setField(term688639, term688639.getClass(), "time", term688644);
        setField(term688516, term688516.getClass(), "commonModuleSetTime", term688639);
        setField(term688516, term688516.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term688516, term688516.getClass(), "commonSkin", -1);
        setIntField(term688516, term688516.getClass(), "headphoneVolume", 100);
        setBooleanField(term688516, term688516.getClass(), "buttonSeOn", true);
        setIntField(term688516, term688516.getClass(), "buttonSeVolume", 100);
        setIntField(term688516, term688516.getClass(), "sliderSeVolume", 100);
        setIntField(term688516, term688516.getClass(), "buttonSe", -1);
        setIntField(term688516, term688516.getClass(), "chainSlideSe", -1);
        setIntField(term688516, term688516.getClass(), "slideSe", -1);
        setIntField(term688516, term688516.getClass(), "sliderTouchSe", -1);
        setField(term688516, term688516.getClass(), "sortMode", enum1503);
        setIntField(term688516, term688516.getClass(), "nextPvId", -1);
        setField(term688516, term688516.getClass(), "nextDifficulty", enum1504);
        setField(term688516, term688516.getClass(), "nextEdition", enum1505);
        setBooleanField(term688516, term688516.getClass(), "showInterimRanking", true);
        setBooleanField(term688516, term688516.getClass(), "showClearStatus", true);
        setBooleanField(term688516, term688516.getClass(), "showGreatBorder", true);
        setBooleanField(term688516, term688516.getClass(), "showExcellentBorder", true);
        setBooleanField(term688516, term688516.getClass(), "showRivalBorder", true);
        setBooleanField(term688516, term688516.getClass(), "showRgoSetting", true);
        setBooleanField(term688516, term688516.getClass(), "contestNowPlayingEnable", true);
        setIntField(term688516, term688516.getClass(), "contestNowPlayingId", -1);
        setIntField(term688516, term688516.getClass(), "contestNowPlayingValue", -1);
        setField(term688516, term688516.getClass(), "contestNowPlayingResultRank", enum1506);
        setField(term688516, term688516.getClass(), "contestNowPlayingSpecifier", "");
        setField(term688516, term688516.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term688516, term688516.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term688516, term688516.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term688516, term688516.getClass(), "rivalPdId", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayerName", argTypes, term688516, args);
    }

};


