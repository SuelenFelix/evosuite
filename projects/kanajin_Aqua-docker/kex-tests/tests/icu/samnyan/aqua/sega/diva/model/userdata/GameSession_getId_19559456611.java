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

public class GameSession_getId_19559456611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term360169;

    public GameSession_getId_19559456611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term360838 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term360837 = ((Class) term360838).getDeclaredField((String) "MISS");
        ((Field) term360837).setAccessible(true);
        Object enum818 = ((Field) term360837).get((Object) null);
        Class<? extends Object> term361215 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term361214 = ((Class) term361215).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term361214).setAccessible(true);
        Object enum819 = ((Field) term361214).get((Object) null);
        Class<? extends Object> term361498 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term361497 = ((Class) term361498).getDeclaredField((String) "NORMAL");
        ((Field) term361497).setAccessible(true);
        Object enum820 = ((Field) term361497).get((Object) null);
        Class<? extends Object> term361773 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term361772 = ((Class) term361773).getDeclaredField((String) "ORIGINAL");
        ((Field) term361772).setAccessible(true);
        Object enum821 = ((Field) term361772).get((Object) null);
        Class<? extends Object> term362039 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term362038 = ((Class) term362039).getDeclaredField((String) "NONE");
        ((Field) term362038).setAccessible(true);
        Object enum822 = ((Field) term362038).get((Object) null);
        Class<? extends Object> term362680 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.StartMode");
        Field term362679 = ((Class) term362680).getDeclaredField((String) "CARD_PROCEDURE");
        ((Field) term362679).setAccessible(true);
        Object enum823 = ((Field) term362679).get((Object) null);
        Integer term360815 = new Integer(1227103734);
        Integer term360817 = new Integer(-1339778481);
        Integer term360819 = new Integer(1725571209);
        Integer term360821 = new Integer(-522618178);
        Integer term360823 = new Integer(1134449235);
        Integer term360825 = new Integer(-883034806);
        Integer term360827 = new Integer(1585847225);
        Integer term360829 = new Integer(597278769);
        term360169 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession"));
        Object term360172 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term360295 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term360296 = newInstance(Class.forName("java.time.LocalDate"));
        Object term360300 = newInstance(Class.forName("java.time.LocalTime"));
        Object term360795 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term360796 = newInstance(Class.forName("java.time.LocalDate"));
        Object term360800 = newInstance(Class.forName("java.time.LocalTime"));
        Object term360805 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term360806 = newInstance(Class.forName("java.time.LocalDate"));
        Object term360810 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term360169, term360169.getClass(), "id", 860079646007397083L);
        setIntField(term360169, term360169.getClass(), "acceptId", 776524710);
        setLongField(term360172, term360172.getClass(), "id", 3230472384687362867L);
        setIntField(term360172, term360172.getClass(), "pdId", 1069095385);
        setField(term360172, term360172.getClass(), "playerName", "xxx");
        setIntField(term360172, term360172.getClass(), "vocaloidPoints", 300);
        setIntField(term360172, term360172.getClass(), "level", 1);
        setIntField(term360172, term360172.getClass(), "levelExp", -1889206410);
        setField(term360172, term360172.getClass(), "levelTitle", "xxx");
        setIntField(term360172, term360172.getClass(), "plateId", -1);
        setIntField(term360172, term360172.getClass(), "plateEffectId", -1);
        setField(term360172, term360172.getClass(), "passwordStatus", enum818);
        setField(term360172, term360172.getClass(), "password", "**********");
        setBooleanField(term360172, term360172.getClass(), "preferPerPvModule", true);
        setBooleanField(term360172, term360172.getClass(), "preferCommonModule", false);
        setBooleanField(term360172, term360172.getClass(), "usePerPvSkin", false);
        setBooleanField(term360172, term360172.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term360172, term360172.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term360172, term360172.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term360172, term360172.getClass(), "usePerPvTouchSliderSe", false);
        setField(term360172, term360172.getClass(), "commonModule", "-999,-999,-999");
        setField(term360172, term360172.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term360296, term360296.getClass(), "year", 2026);
        setShortField(term360296, term360296.getClass(), "month", (short) 8);
        setShortField(term360296, term360296.getClass(), "day", (short) 12);
        setField(term360295, term360295.getClass(), "date", term360296);
        setByteField(term360300, term360300.getClass(), "hour", (byte) 2);
        setByteField(term360300, term360300.getClass(), "minute", (byte) 3);
        setByteField(term360300, term360300.getClass(), "second", (byte) 22);
        setIntField(term360300, term360300.getClass(), "nano", 82429000);
        setField(term360295, term360295.getClass(), "time", term360300);
        setField(term360172, term360172.getClass(), "commonModuleSetTime", term360295);
        setField(term360172, term360172.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term360172, term360172.getClass(), "commonSkin", -1);
        setIntField(term360172, term360172.getClass(), "headphoneVolume", 100);
        setBooleanField(term360172, term360172.getClass(), "buttonSeOn", true);
        setIntField(term360172, term360172.getClass(), "buttonSeVolume", 100);
        setIntField(term360172, term360172.getClass(), "sliderSeVolume", 100);
        setIntField(term360172, term360172.getClass(), "buttonSe", -1);
        setIntField(term360172, term360172.getClass(), "chainSlideSe", -1);
        setIntField(term360172, term360172.getClass(), "slideSe", -1);
        setIntField(term360172, term360172.getClass(), "sliderTouchSe", -1);
        setField(term360172, term360172.getClass(), "sortMode", enum819);
        setIntField(term360172, term360172.getClass(), "nextPvId", -1);
        setField(term360172, term360172.getClass(), "nextDifficulty", enum820);
        setField(term360172, term360172.getClass(), "nextEdition", enum821);
        setBooleanField(term360172, term360172.getClass(), "showInterimRanking", true);
        setBooleanField(term360172, term360172.getClass(), "showClearStatus", true);
        setBooleanField(term360172, term360172.getClass(), "showGreatBorder", true);
        setBooleanField(term360172, term360172.getClass(), "showExcellentBorder", true);
        setBooleanField(term360172, term360172.getClass(), "showRivalBorder", true);
        setBooleanField(term360172, term360172.getClass(), "showRgoSetting", true);
        setBooleanField(term360172, term360172.getClass(), "contestNowPlayingEnable", true);
        setIntField(term360172, term360172.getClass(), "contestNowPlayingId", -1);
        setIntField(term360172, term360172.getClass(), "contestNowPlayingValue", -1);
        setField(term360172, term360172.getClass(), "contestNowPlayingResultRank", enum822);
        setField(term360172, term360172.getClass(), "contestNowPlayingSpecifier", "");
        setField(term360172, term360172.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term360172, term360172.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term360172, term360172.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term360172, term360172.getClass(), "rivalPdId", -1);
        setField(term360169, term360169.getClass(), "pdId", term360172);
        setField(term360169, term360169.getClass(), "startMode", enum823);
        setIntField(term360796, term360796.getClass(), "year", 2015);
        setShortField(term360796, term360796.getClass(), "month", (short) 2);
        setShortField(term360796, term360796.getClass(), "day", (short) 5);
        setField(term360795, term360795.getClass(), "date", term360796);
        setByteField(term360800, term360800.getClass(), "hour", (byte) 3);
        setByteField(term360800, term360800.getClass(), "minute", (byte) 26);
        setByteField(term360800, term360800.getClass(), "second", (byte) 49);
        setIntField(term360800, term360800.getClass(), "nano", 995758570);
        setField(term360795, term360795.getClass(), "time", term360800);
        setField(term360169, term360169.getClass(), "startTime", term360795);
        setIntField(term360806, term360806.getClass(), "year", 2013);
        setShortField(term360806, term360806.getClass(), "month", (short) 5);
        setShortField(term360806, term360806.getClass(), "day", (short) 9);
        setField(term360805, term360805.getClass(), "date", term360806);
        setByteField(term360810, term360810.getClass(), "hour", (byte) 4);
        setByteField(term360810, term360810.getClass(), "minute", (byte) 18);
        setByteField(term360810, term360810.getClass(), "second", (byte) 35);
        setIntField(term360810, term360810.getClass(), "nano", 909079395);
        setField(term360805, term360805.getClass(), "time", term360810);
        setField(term360169, term360169.getClass(), "lastUpdateTime", term360805);
        setField(term360169, term360169.getClass(), "stageIndex", term360815);
        setField(term360169, term360169.getClass(), "stageResultIndex", term360817);
        setField(term360169, term360169.getClass(), "lastPvId", term360819);
        setField(term360169, term360169.getClass(), "levelNumber", term360821);
        setField(term360169, term360169.getClass(), "levelExp", term360823);
        setField(term360169, term360169.getClass(), "oldLevelNumber", term360825);
        setField(term360169, term360169.getClass(), "oldLevelExp", term360827);
        setField(term360169, term360169.getClass(), "vp", term360829);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term360169, args);
    }

};


