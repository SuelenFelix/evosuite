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

public class PlayerProfile_getContestNowPlayingResultRank_46064530045 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term791542;

    public PlayerProfile_getContestNowPlayingResultRank_46064530045() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term792154 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term792153 = ((Class) term792154).getDeclaredField((String) "MISS");
        ((Field) term792153).setAccessible(true);
        Object enum1712 = ((Field) term792153).get((Object) null);
        Class<? extends Object> term792531 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term792530 = ((Class) term792531).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term792530).setAccessible(true);
        Object enum1713 = ((Field) term792530).get((Object) null);
        Class<? extends Object> term792814 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term792813 = ((Class) term792814).getDeclaredField((String) "NORMAL");
        ((Field) term792813).setAccessible(true);
        Object enum1714 = ((Field) term792813).get((Object) null);
        Class<? extends Object> term793089 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term793088 = ((Class) term793089).getDeclaredField((String) "ORIGINAL");
        ((Field) term793088).setAccessible(true);
        Object enum1715 = ((Field) term793088).get((Object) null);
        Class<? extends Object> term793355 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term793354 = ((Class) term793355).getDeclaredField((String) "NONE");
        ((Field) term793354).setAccessible(true);
        Object enum1716 = ((Field) term793354).get((Object) null);
        term791542 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term791665 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term791666 = newInstance(Class.forName("java.time.LocalDate"));
        Object term791670 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term791542, term791542.getClass(), "id", 4354242424632479389L);
        setIntField(term791542, term791542.getClass(), "pdId", 1984033465);
        setField(term791542, term791542.getClass(), "playerName", "xxx");
        setIntField(term791542, term791542.getClass(), "vocaloidPoints", 300);
        setIntField(term791542, term791542.getClass(), "level", 1);
        setIntField(term791542, term791542.getClass(), "levelExp", 415386900);
        setField(term791542, term791542.getClass(), "levelTitle", "xxx");
        setIntField(term791542, term791542.getClass(), "plateId", -1);
        setIntField(term791542, term791542.getClass(), "plateEffectId", -1);
        setField(term791542, term791542.getClass(), "passwordStatus", enum1712);
        setField(term791542, term791542.getClass(), "password", "**********");
        setBooleanField(term791542, term791542.getClass(), "preferPerPvModule", true);
        setBooleanField(term791542, term791542.getClass(), "preferCommonModule", true);
        setBooleanField(term791542, term791542.getClass(), "usePerPvSkin", true);
        setBooleanField(term791542, term791542.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term791542, term791542.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term791542, term791542.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term791542, term791542.getClass(), "usePerPvTouchSliderSe", false);
        setField(term791542, term791542.getClass(), "commonModule", "-999,-999,-999");
        setField(term791542, term791542.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term791666, term791666.getClass(), "year", 2026);
        setShortField(term791666, term791666.getClass(), "month", (short) 8);
        setShortField(term791666, term791666.getClass(), "day", (short) 12);
        setField(term791665, term791665.getClass(), "date", term791666);
        setByteField(term791670, term791670.getClass(), "hour", (byte) 2);
        setByteField(term791670, term791670.getClass(), "minute", (byte) 4);
        setByteField(term791670, term791670.getClass(), "second", (byte) 34);
        setIntField(term791670, term791670.getClass(), "nano", 177983000);
        setField(term791665, term791665.getClass(), "time", term791670);
        setField(term791542, term791542.getClass(), "commonModuleSetTime", term791665);
        setField(term791542, term791542.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term791542, term791542.getClass(), "commonSkin", -1);
        setIntField(term791542, term791542.getClass(), "headphoneVolume", 100);
        setBooleanField(term791542, term791542.getClass(), "buttonSeOn", true);
        setIntField(term791542, term791542.getClass(), "buttonSeVolume", 100);
        setIntField(term791542, term791542.getClass(), "sliderSeVolume", 100);
        setIntField(term791542, term791542.getClass(), "buttonSe", -1);
        setIntField(term791542, term791542.getClass(), "chainSlideSe", -1);
        setIntField(term791542, term791542.getClass(), "slideSe", -1);
        setIntField(term791542, term791542.getClass(), "sliderTouchSe", -1);
        setField(term791542, term791542.getClass(), "sortMode", enum1713);
        setIntField(term791542, term791542.getClass(), "nextPvId", -1);
        setField(term791542, term791542.getClass(), "nextDifficulty", enum1714);
        setField(term791542, term791542.getClass(), "nextEdition", enum1715);
        setBooleanField(term791542, term791542.getClass(), "showInterimRanking", true);
        setBooleanField(term791542, term791542.getClass(), "showClearStatus", true);
        setBooleanField(term791542, term791542.getClass(), "showGreatBorder", true);
        setBooleanField(term791542, term791542.getClass(), "showExcellentBorder", true);
        setBooleanField(term791542, term791542.getClass(), "showRivalBorder", true);
        setBooleanField(term791542, term791542.getClass(), "showRgoSetting", true);
        setBooleanField(term791542, term791542.getClass(), "contestNowPlayingEnable", false);
        setIntField(term791542, term791542.getClass(), "contestNowPlayingId", -1);
        setIntField(term791542, term791542.getClass(), "contestNowPlayingValue", -1);
        setField(term791542, term791542.getClass(), "contestNowPlayingResultRank", enum1716);
        setField(term791542, term791542.getClass(), "contestNowPlayingSpecifier", "");
        setField(term791542, term791542.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term791542, term791542.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term791542, term791542.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term791542, term791542.getClass(), "rivalPdId", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getContestNowPlayingResultRank", argTypes, term791542, args);
    }

};


