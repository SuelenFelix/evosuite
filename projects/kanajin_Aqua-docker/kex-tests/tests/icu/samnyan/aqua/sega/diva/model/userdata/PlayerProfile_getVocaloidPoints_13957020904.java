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

public class PlayerProfile_getVocaloidPoints_13957020904 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term690969;

    public PlayerProfile_getVocaloidPoints_13957020904() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term691581 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term691580 = ((Class) term691581).getDeclaredField((String) "MISS");
        ((Field) term691580).setAccessible(true);
        Object enum1507 = ((Field) term691580).get((Object) null);
        Class<? extends Object> term691958 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term691957 = ((Class) term691958).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term691957).setAccessible(true);
        Object enum1508 = ((Field) term691957).get((Object) null);
        Class<? extends Object> term692241 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term692240 = ((Class) term692241).getDeclaredField((String) "NORMAL");
        ((Field) term692240).setAccessible(true);
        Object enum1509 = ((Field) term692240).get((Object) null);
        Class<? extends Object> term692516 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term692515 = ((Class) term692516).getDeclaredField((String) "ORIGINAL");
        ((Field) term692515).setAccessible(true);
        Object enum1510 = ((Field) term692515).get((Object) null);
        Class<? extends Object> term692782 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term692781 = ((Class) term692782).getDeclaredField((String) "NONE");
        ((Field) term692781).setAccessible(true);
        Object enum1511 = ((Field) term692781).get((Object) null);
        term690969 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term691092 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term691093 = newInstance(Class.forName("java.time.LocalDate"));
        Object term691097 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term690969, term690969.getClass(), "id", -6108006981756732593L);
        setIntField(term690969, term690969.getClass(), "pdId", 1952367361);
        setField(term690969, term690969.getClass(), "playerName", "xxx");
        setIntField(term690969, term690969.getClass(), "vocaloidPoints", 300);
        setIntField(term690969, term690969.getClass(), "level", 1);
        setIntField(term690969, term690969.getClass(), "levelExp", -715290594);
        setField(term690969, term690969.getClass(), "levelTitle", "xxx");
        setIntField(term690969, term690969.getClass(), "plateId", -1);
        setIntField(term690969, term690969.getClass(), "plateEffectId", -1);
        setField(term690969, term690969.getClass(), "passwordStatus", enum1507);
        setField(term690969, term690969.getClass(), "password", "**********");
        setBooleanField(term690969, term690969.getClass(), "preferPerPvModule", true);
        setBooleanField(term690969, term690969.getClass(), "preferCommonModule", false);
        setBooleanField(term690969, term690969.getClass(), "usePerPvSkin", false);
        setBooleanField(term690969, term690969.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term690969, term690969.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term690969, term690969.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term690969, term690969.getClass(), "usePerPvTouchSliderSe", false);
        setField(term690969, term690969.getClass(), "commonModule", "-999,-999,-999");
        setField(term690969, term690969.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term691093, term691093.getClass(), "year", 2026);
        setShortField(term691093, term691093.getClass(), "month", (short) 8);
        setShortField(term691093, term691093.getClass(), "day", (short) 12);
        setField(term691092, term691092.getClass(), "date", term691093);
        setByteField(term691097, term691097.getClass(), "hour", (byte) 2);
        setByteField(term691097, term691097.getClass(), "minute", (byte) 4);
        setByteField(term691097, term691097.getClass(), "second", (byte) 23);
        setIntField(term691097, term691097.getClass(), "nano", 630032000);
        setField(term691092, term691092.getClass(), "time", term691097);
        setField(term690969, term690969.getClass(), "commonModuleSetTime", term691092);
        setField(term690969, term690969.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term690969, term690969.getClass(), "commonSkin", -1);
        setIntField(term690969, term690969.getClass(), "headphoneVolume", 100);
        setBooleanField(term690969, term690969.getClass(), "buttonSeOn", true);
        setIntField(term690969, term690969.getClass(), "buttonSeVolume", 100);
        setIntField(term690969, term690969.getClass(), "sliderSeVolume", 100);
        setIntField(term690969, term690969.getClass(), "buttonSe", -1);
        setIntField(term690969, term690969.getClass(), "chainSlideSe", -1);
        setIntField(term690969, term690969.getClass(), "slideSe", -1);
        setIntField(term690969, term690969.getClass(), "sliderTouchSe", -1);
        setField(term690969, term690969.getClass(), "sortMode", enum1508);
        setIntField(term690969, term690969.getClass(), "nextPvId", -1);
        setField(term690969, term690969.getClass(), "nextDifficulty", enum1509);
        setField(term690969, term690969.getClass(), "nextEdition", enum1510);
        setBooleanField(term690969, term690969.getClass(), "showInterimRanking", true);
        setBooleanField(term690969, term690969.getClass(), "showClearStatus", true);
        setBooleanField(term690969, term690969.getClass(), "showGreatBorder", true);
        setBooleanField(term690969, term690969.getClass(), "showExcellentBorder", true);
        setBooleanField(term690969, term690969.getClass(), "showRivalBorder", true);
        setBooleanField(term690969, term690969.getClass(), "showRgoSetting", true);
        setBooleanField(term690969, term690969.getClass(), "contestNowPlayingEnable", true);
        setIntField(term690969, term690969.getClass(), "contestNowPlayingId", -1);
        setIntField(term690969, term690969.getClass(), "contestNowPlayingValue", -1);
        setField(term690969, term690969.getClass(), "contestNowPlayingResultRank", enum1511);
        setField(term690969, term690969.getClass(), "contestNowPlayingSpecifier", "");
        setField(term690969, term690969.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term690969, term690969.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term690969, term690969.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term690969, term690969.getClass(), "rivalPdId", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVocaloidPoints", argTypes, term690969, args);
    }

};


