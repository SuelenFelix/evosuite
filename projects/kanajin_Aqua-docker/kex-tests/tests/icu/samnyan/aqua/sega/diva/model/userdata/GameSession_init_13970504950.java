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
import java.lang.Integer;
import java.lang.String;
import java.lang.Object;

public class GameSession_init_13970504950 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term357362;
     Object term357364;
     Object enum817;
     Object term357978;
     Object term357988;
     Object term357998;
     Object term358000;
     Object term358002;
     Object term358004;
     Object term358006;
     Object term358008;
     Object term358010;
     Object term358012;

    public GameSession_init_13970504950() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term357362 = new Integer(-1765697393);
        Class<? extends Object> term358021 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term358020 = ((Class) term358021).getDeclaredField((String) "MISS");
        ((Field) term358020).setAccessible(true);
        Object enum812 = ((Field) term358020).get((Object) null);
        Class<? extends Object> term358398 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term358397 = ((Class) term358398).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term358397).setAccessible(true);
        Object enum813 = ((Field) term358397).get((Object) null);
        Class<? extends Object> term358681 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term358680 = ((Class) term358681).getDeclaredField((String) "NORMAL");
        ((Field) term358680).setAccessible(true);
        Object enum814 = ((Field) term358680).get((Object) null);
        Class<? extends Object> term358956 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term358955 = ((Class) term358956).getDeclaredField((String) "ORIGINAL");
        ((Field) term358955).setAccessible(true);
        Object enum815 = ((Field) term358955).get((Object) null);
        Class<? extends Object> term359222 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term359221 = ((Class) term359222).getDeclaredField((String) "NONE");
        ((Field) term359221).setAccessible(true);
        Object enum816 = ((Field) term359221).get((Object) null);
        term357364 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term357487 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term357488 = newInstance(Class.forName("java.time.LocalDate"));
        Object term357492 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term357364, term357364.getClass(), "id", 2191130532479601175L);
        setIntField(term357364, term357364.getClass(), "pdId", 2101925650);
        setField(term357364, term357364.getClass(), "playerName", "xxx");
        setIntField(term357364, term357364.getClass(), "vocaloidPoints", 300);
        setIntField(term357364, term357364.getClass(), "level", 1);
        setIntField(term357364, term357364.getClass(), "levelExp", -242176552);
        setField(term357364, term357364.getClass(), "levelTitle", "xxx");
        setIntField(term357364, term357364.getClass(), "plateId", -1);
        setIntField(term357364, term357364.getClass(), "plateEffectId", -1);
        setField(term357364, term357364.getClass(), "passwordStatus", enum812);
        setField(term357364, term357364.getClass(), "password", "**********");
        setBooleanField(term357364, term357364.getClass(), "preferPerPvModule", true);
        setBooleanField(term357364, term357364.getClass(), "preferCommonModule", true);
        setBooleanField(term357364, term357364.getClass(), "usePerPvSkin", false);
        setBooleanField(term357364, term357364.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term357364, term357364.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term357364, term357364.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term357364, term357364.getClass(), "usePerPvTouchSliderSe", false);
        setField(term357364, term357364.getClass(), "commonModule", "-999,-999,-999");
        setField(term357364, term357364.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term357488, term357488.getClass(), "year", 2026);
        setShortField(term357488, term357488.getClass(), "month", (short) 6);
        setShortField(term357488, term357488.getClass(), "day", (short) 29);
        setField(term357487, term357487.getClass(), "date", term357488);
        setByteField(term357492, term357492.getClass(), "hour", (byte) 4);
        setByteField(term357492, term357492.getClass(), "minute", (byte) 28);
        setByteField(term357492, term357492.getClass(), "second", (byte) 6);
        setIntField(term357492, term357492.getClass(), "nano", 777023000);
        setField(term357487, term357487.getClass(), "time", term357492);
        setField(term357364, term357364.getClass(), "commonModuleSetTime", term357487);
        setField(term357364, term357364.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term357364, term357364.getClass(), "commonSkin", -1);
        setIntField(term357364, term357364.getClass(), "headphoneVolume", 100);
        setBooleanField(term357364, term357364.getClass(), "buttonSeOn", true);
        setIntField(term357364, term357364.getClass(), "buttonSeVolume", 100);
        setIntField(term357364, term357364.getClass(), "sliderSeVolume", 100);
        setIntField(term357364, term357364.getClass(), "buttonSe", -1);
        setIntField(term357364, term357364.getClass(), "chainSlideSe", -1);
        setIntField(term357364, term357364.getClass(), "slideSe", -1);
        setIntField(term357364, term357364.getClass(), "sliderTouchSe", -1);
        setField(term357364, term357364.getClass(), "sortMode", enum813);
        setIntField(term357364, term357364.getClass(), "nextPvId", -1);
        setField(term357364, term357364.getClass(), "nextDifficulty", enum814);
        setField(term357364, term357364.getClass(), "nextEdition", enum815);
        setBooleanField(term357364, term357364.getClass(), "showInterimRanking", true);
        setBooleanField(term357364, term357364.getClass(), "showClearStatus", true);
        setBooleanField(term357364, term357364.getClass(), "showGreatBorder", true);
        setBooleanField(term357364, term357364.getClass(), "showExcellentBorder", true);
        setBooleanField(term357364, term357364.getClass(), "showRivalBorder", true);
        setBooleanField(term357364, term357364.getClass(), "showRgoSetting", true);
        setBooleanField(term357364, term357364.getClass(), "contestNowPlayingEnable", true);
        setIntField(term357364, term357364.getClass(), "contestNowPlayingId", -1);
        setIntField(term357364, term357364.getClass(), "contestNowPlayingValue", -1);
        setField(term357364, term357364.getClass(), "contestNowPlayingResultRank", enum816);
        setField(term357364, term357364.getClass(), "contestNowPlayingSpecifier", "");
        setField(term357364, term357364.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term357364, term357364.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term357364, term357364.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term357364, term357364.getClass(), "rivalPdId", -1);
        Class<? extends Object> term359903 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.StartMode");
        Field term359902 = ((Class) term359903).getDeclaredField((String) "START");
        ((Field) term359902).setAccessible(true);
        enum817 = ((Field) term359902).get((Object) null);
        term357978 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term357979 = newInstance(Class.forName("java.time.LocalDate"));
        Object term357983 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term357979, term357979.getClass(), "year", 2024);
        setShortField(term357979, term357979.getClass(), "month", (short) 2);
        setShortField(term357979, term357979.getClass(), "day", (short) 5);
        setField(term357978, term357978.getClass(), "date", term357979);
        setByteField(term357983, term357983.getClass(), "hour", (byte) 12);
        setByteField(term357983, term357983.getClass(), "minute", (byte) 28);
        setByteField(term357983, term357983.getClass(), "second", (byte) 37);
        setIntField(term357983, term357983.getClass(), "nano", 689695229);
        setField(term357978, term357978.getClass(), "time", term357983);
        term357988 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term357989 = newInstance(Class.forName("java.time.LocalDate"));
        Object term357993 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term357989, term357989.getClass(), "year", 2023);
        setShortField(term357989, term357989.getClass(), "month", (short) 5);
        setShortField(term357989, term357989.getClass(), "day", (short) 23);
        setField(term357988, term357988.getClass(), "date", term357989);
        setByteField(term357993, term357993.getClass(), "hour", (byte) 0);
        setByteField(term357993, term357993.getClass(), "minute", (byte) 50);
        setByteField(term357993, term357993.getClass(), "second", (byte) 5);
        setIntField(term357993, term357993.getClass(), "nano", 296286825);
        setField(term357988, term357988.getClass(), "time", term357993);
        term357998 = new Integer(568599855);
        term358000 = new Integer(1162663216);
        term358002 = new Integer(1484323161);
        term358004 = new Integer(391863371);
        term358006 = new Integer(-1922583790);
        term358008 = new Integer(-616727354);
        term358010 = new Integer(-1955890973);
        term358012 = new Integer(-2038273078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession");
        Class<?>[] argTypes = new Class<?>[13];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        argTypes[2] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.StartMode");
        argTypes[3] = Class.forName("java.time.LocalDateTime");
        argTypes[4] = Class.forName("java.time.LocalDateTime");
        argTypes[5] = Class.forName("java.lang.Integer");
        argTypes[6] = Class.forName("java.lang.Integer");
        argTypes[7] = Class.forName("java.lang.Integer");
        argTypes[8] = Class.forName("java.lang.Integer");
        argTypes[9] = Class.forName("java.lang.Integer");
        argTypes[10] = Class.forName("java.lang.Integer");
        argTypes[11] = Class.forName("java.lang.Integer");
        argTypes[12] = Class.forName("java.lang.Integer");
        Object[] args = new Object[13];
        args[0] = term357362;
        args[1] = term357364;
        args[2] = enum817;
        args[3] = term357978;
        args[4] = term357988;
        args[5] = term357998;
        args[6] = term358000;
        args[7] = term358002;
        args[8] = term358004;
        args[9] = term358006;
        args[10] = term358008;
        args[11] = term358010;
        args[12] = term358012;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


