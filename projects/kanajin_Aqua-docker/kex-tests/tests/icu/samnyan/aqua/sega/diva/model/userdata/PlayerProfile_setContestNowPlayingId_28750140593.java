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

public class PlayerProfile_setContestNowPlayingId_28750140593 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term910025;
     Object term910630;

    public PlayerProfile_setContestNowPlayingId_28750140593() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term910639 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term910638 = ((Class) term910639).getDeclaredField((String) "MISS");
        ((Field) term910638).setAccessible(true);
        Object enum1954 = ((Field) term910638).get((Object) null);
        Class<? extends Object> term911016 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term911015 = ((Class) term911016).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term911015).setAccessible(true);
        Object enum1955 = ((Field) term911015).get((Object) null);
        Class<? extends Object> term911299 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term911298 = ((Class) term911299).getDeclaredField((String) "NORMAL");
        ((Field) term911298).setAccessible(true);
        Object enum1956 = ((Field) term911298).get((Object) null);
        Class<? extends Object> term911574 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term911573 = ((Class) term911574).getDeclaredField((String) "ORIGINAL");
        ((Field) term911573).setAccessible(true);
        Object enum1957 = ((Field) term911573).get((Object) null);
        Class<? extends Object> term911840 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term911839 = ((Class) term911840).getDeclaredField((String) "NONE");
        ((Field) term911839).setAccessible(true);
        Object enum1958 = ((Field) term911839).get((Object) null);
        term910025 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term910148 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term910149 = newInstance(Class.forName("java.time.LocalDate"));
        Object term910153 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term910025, term910025.getClass(), "id", -6656996002079682356L);
        setIntField(term910025, term910025.getClass(), "pdId", -1991945298);
        setField(term910025, term910025.getClass(), "playerName", "xxx");
        setIntField(term910025, term910025.getClass(), "vocaloidPoints", 300);
        setIntField(term910025, term910025.getClass(), "level", 1);
        setIntField(term910025, term910025.getClass(), "levelExp", 110090057);
        setField(term910025, term910025.getClass(), "levelTitle", "xxx");
        setIntField(term910025, term910025.getClass(), "plateId", -1);
        setIntField(term910025, term910025.getClass(), "plateEffectId", -1);
        setField(term910025, term910025.getClass(), "passwordStatus", enum1954);
        setField(term910025, term910025.getClass(), "password", "**********");
        setBooleanField(term910025, term910025.getClass(), "preferPerPvModule", true);
        setBooleanField(term910025, term910025.getClass(), "preferCommonModule", false);
        setBooleanField(term910025, term910025.getClass(), "usePerPvSkin", true);
        setBooleanField(term910025, term910025.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term910025, term910025.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term910025, term910025.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term910025, term910025.getClass(), "usePerPvTouchSliderSe", true);
        setField(term910025, term910025.getClass(), "commonModule", "-999,-999,-999");
        setField(term910025, term910025.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term910149, term910149.getClass(), "year", 2026);
        setShortField(term910149, term910149.getClass(), "month", (short) 6);
        setShortField(term910149, term910149.getClass(), "day", (short) 29);
        setField(term910148, term910148.getClass(), "date", term910149);
        setByteField(term910153, term910153.getClass(), "hour", (byte) 4);
        setByteField(term910153, term910153.getClass(), "minute", (byte) 29);
        setByteField(term910153, term910153.getClass(), "second", (byte) 33);
        setIntField(term910153, term910153.getClass(), "nano", 168935000);
        setField(term910148, term910148.getClass(), "time", term910153);
        setField(term910025, term910025.getClass(), "commonModuleSetTime", term910148);
        setField(term910025, term910025.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term910025, term910025.getClass(), "commonSkin", -1);
        setIntField(term910025, term910025.getClass(), "headphoneVolume", 100);
        setBooleanField(term910025, term910025.getClass(), "buttonSeOn", true);
        setIntField(term910025, term910025.getClass(), "buttonSeVolume", 100);
        setIntField(term910025, term910025.getClass(), "sliderSeVolume", 100);
        setIntField(term910025, term910025.getClass(), "buttonSe", -1);
        setIntField(term910025, term910025.getClass(), "chainSlideSe", -1);
        setIntField(term910025, term910025.getClass(), "slideSe", -1);
        setIntField(term910025, term910025.getClass(), "sliderTouchSe", -1);
        setField(term910025, term910025.getClass(), "sortMode", enum1955);
        setIntField(term910025, term910025.getClass(), "nextPvId", -1);
        setField(term910025, term910025.getClass(), "nextDifficulty", enum1956);
        setField(term910025, term910025.getClass(), "nextEdition", enum1957);
        setBooleanField(term910025, term910025.getClass(), "showInterimRanking", true);
        setBooleanField(term910025, term910025.getClass(), "showClearStatus", true);
        setBooleanField(term910025, term910025.getClass(), "showGreatBorder", true);
        setBooleanField(term910025, term910025.getClass(), "showExcellentBorder", true);
        setBooleanField(term910025, term910025.getClass(), "showRivalBorder", true);
        setBooleanField(term910025, term910025.getClass(), "showRgoSetting", true);
        setBooleanField(term910025, term910025.getClass(), "contestNowPlayingEnable", true);
        setIntField(term910025, term910025.getClass(), "contestNowPlayingId", -1);
        setIntField(term910025, term910025.getClass(), "contestNowPlayingValue", -1);
        setField(term910025, term910025.getClass(), "contestNowPlayingResultRank", enum1958);
        setField(term910025, term910025.getClass(), "contestNowPlayingSpecifier", "");
        setField(term910025, term910025.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term910025, term910025.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term910025, term910025.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term910025, term910025.getClass(), "rivalPdId", -1);
        term910630 = new Integer(1975165299);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term910630;
        callMethod(klass, "setContestNowPlayingId", argTypes, term910025, args);
    }

};


