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

public class PlayerContest_setStartCount_88967981012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30886;
     Object term31507;

    public PlayerContest_setStartCount_88967981012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term31516 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term31515 = ((Class) term31516).getDeclaredField((String) "MISS");
        ((Field) term31515).setAccessible(true);
        Object enum60 = ((Field) term31515).get((Object) null);
        Class<? extends Object> term31893 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term31892 = ((Class) term31893).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term31892).setAccessible(true);
        Object enum61 = ((Field) term31892).get((Object) null);
        Class<? extends Object> term32176 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term32175 = ((Class) term32176).getDeclaredField((String) "NORMAL");
        ((Field) term32175).setAccessible(true);
        Object enum62 = ((Field) term32175).get((Object) null);
        Class<? extends Object> term32451 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term32450 = ((Class) term32451).getDeclaredField((String) "ORIGINAL");
        ((Field) term32450).setAccessible(true);
        Object enum63 = ((Field) term32450).get((Object) null);
        Class<? extends Object> term32717 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term32716 = ((Class) term32717).getDeclaredField((String) "NONE");
        ((Field) term32716).setAccessible(true);
        Object enum64 = ((Field) term32716).get((Object) null);
        term30886 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerContest"));
        Object term30888 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term31011 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31012 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31016 = newInstance(Class.forName("java.time.LocalTime"));
        Object term31497 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31498 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31502 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term30886, term30886.getClass(), "id", 7009926388951271268L);
        setLongField(term30888, term30888.getClass(), "id", -7672528020740371001L);
        setIntField(term30888, term30888.getClass(), "pdId", 1632125673);
        setField(term30888, term30888.getClass(), "playerName", "xxx");
        setIntField(term30888, term30888.getClass(), "vocaloidPoints", 300);
        setIntField(term30888, term30888.getClass(), "level", 1);
        setIntField(term30888, term30888.getClass(), "levelExp", 454281060);
        setField(term30888, term30888.getClass(), "levelTitle", "xxx");
        setIntField(term30888, term30888.getClass(), "plateId", -1);
        setIntField(term30888, term30888.getClass(), "plateEffectId", -1);
        setField(term30888, term30888.getClass(), "passwordStatus", enum60);
        setField(term30888, term30888.getClass(), "password", "**********");
        setBooleanField(term30888, term30888.getClass(), "preferPerPvModule", true);
        setBooleanField(term30888, term30888.getClass(), "preferCommonModule", true);
        setBooleanField(term30888, term30888.getClass(), "usePerPvSkin", true);
        setBooleanField(term30888, term30888.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term30888, term30888.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term30888, term30888.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term30888, term30888.getClass(), "usePerPvTouchSliderSe", true);
        setField(term30888, term30888.getClass(), "commonModule", "-999,-999,-999");
        setField(term30888, term30888.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term31012, term31012.getClass(), "year", 2026);
        setShortField(term31012, term31012.getClass(), "month", (short) 8);
        setShortField(term31012, term31012.getClass(), "day", (short) 12);
        setField(term31011, term31011.getClass(), "date", term31012);
        setByteField(term31016, term31016.getClass(), "hour", (byte) 2);
        setByteField(term31016, term31016.getClass(), "minute", (byte) 2);
        setByteField(term31016, term31016.getClass(), "second", (byte) 31);
        setIntField(term31016, term31016.getClass(), "nano", 86925000);
        setField(term31011, term31011.getClass(), "time", term31016);
        setField(term30888, term30888.getClass(), "commonModuleSetTime", term31011);
        setField(term30888, term30888.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term30888, term30888.getClass(), "commonSkin", -1);
        setIntField(term30888, term30888.getClass(), "headphoneVolume", 100);
        setBooleanField(term30888, term30888.getClass(), "buttonSeOn", true);
        setIntField(term30888, term30888.getClass(), "buttonSeVolume", 100);
        setIntField(term30888, term30888.getClass(), "sliderSeVolume", 100);
        setIntField(term30888, term30888.getClass(), "buttonSe", -1);
        setIntField(term30888, term30888.getClass(), "chainSlideSe", -1);
        setIntField(term30888, term30888.getClass(), "slideSe", -1);
        setIntField(term30888, term30888.getClass(), "sliderTouchSe", -1);
        setField(term30888, term30888.getClass(), "sortMode", enum61);
        setIntField(term30888, term30888.getClass(), "nextPvId", -1);
        setField(term30888, term30888.getClass(), "nextDifficulty", enum62);
        setField(term30888, term30888.getClass(), "nextEdition", enum63);
        setBooleanField(term30888, term30888.getClass(), "showInterimRanking", true);
        setBooleanField(term30888, term30888.getClass(), "showClearStatus", true);
        setBooleanField(term30888, term30888.getClass(), "showGreatBorder", true);
        setBooleanField(term30888, term30888.getClass(), "showExcellentBorder", true);
        setBooleanField(term30888, term30888.getClass(), "showRivalBorder", true);
        setBooleanField(term30888, term30888.getClass(), "showRgoSetting", true);
        setBooleanField(term30888, term30888.getClass(), "contestNowPlayingEnable", true);
        setIntField(term30888, term30888.getClass(), "contestNowPlayingId", -1);
        setIntField(term30888, term30888.getClass(), "contestNowPlayingValue", -1);
        setField(term30888, term30888.getClass(), "contestNowPlayingResultRank", enum64);
        setField(term30888, term30888.getClass(), "contestNowPlayingSpecifier", "");
        setField(term30888, term30888.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term30888, term30888.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term30888, term30888.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term30888, term30888.getClass(), "rivalPdId", -1);
        setField(term30886, term30886.getClass(), "pdId", term30888);
        setIntField(term30886, term30886.getClass(), "contestId", -1786399638);
        setIntField(term30886, term30886.getClass(), "startCount", 2055867847);
        setField(term30886, term30886.getClass(), "resultRank", enum64);
        setIntField(term30886, term30886.getClass(), "bestValue", -1);
        setIntField(term30886, term30886.getClass(), "flag", -1);
        setIntField(term31498, term31498.getClass(), "year", 2026);
        setShortField(term31498, term31498.getClass(), "month", (short) 8);
        setShortField(term31498, term31498.getClass(), "day", (short) 12);
        setField(term31497, term31497.getClass(), "date", term31498);
        setByteField(term31502, term31502.getClass(), "hour", (byte) 2);
        setByteField(term31502, term31502.getClass(), "minute", (byte) 2);
        setByteField(term31502, term31502.getClass(), "second", (byte) 31);
        setIntField(term31502, term31502.getClass(), "nano", 86763000);
        setField(term31497, term31497.getClass(), "time", term31502);
        setField(term30886, term30886.getClass(), "lastUpdateTime", term31497);
        term31507 = new Integer(-1048298087);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerContest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term31507;
        callMethod(klass, "setStartCount", argTypes, term30886, args);
    }

};


