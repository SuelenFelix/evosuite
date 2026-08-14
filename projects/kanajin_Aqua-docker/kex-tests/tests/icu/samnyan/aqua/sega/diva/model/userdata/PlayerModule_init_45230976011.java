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
import java.lang.Long;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;

public class PlayerModule_init_45230976011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term681089;
     Object term681091;
     Object term681696;

    public PlayerModule_init_45230976011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term681089 = new Long(6940486570215409900L);
        Class<? extends Object> term681705 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term681704 = ((Class) term681705).getDeclaredField((String) "MISS");
        ((Field) term681704).setAccessible(true);
        Object enum1487 = ((Field) term681704).get((Object) null);
        Class<? extends Object> term682082 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term682081 = ((Class) term682082).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term682081).setAccessible(true);
        Object enum1488 = ((Field) term682081).get((Object) null);
        Class<? extends Object> term682365 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term682364 = ((Class) term682365).getDeclaredField((String) "NORMAL");
        ((Field) term682364).setAccessible(true);
        Object enum1489 = ((Field) term682364).get((Object) null);
        Class<? extends Object> term682640 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term682639 = ((Class) term682640).getDeclaredField((String) "ORIGINAL");
        ((Field) term682639).setAccessible(true);
        Object enum1490 = ((Field) term682639).get((Object) null);
        Class<? extends Object> term682906 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term682905 = ((Class) term682906).getDeclaredField((String) "NONE");
        ((Field) term682905).setAccessible(true);
        Object enum1491 = ((Field) term682905).get((Object) null);
        term681091 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term681214 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term681215 = newInstance(Class.forName("java.time.LocalDate"));
        Object term681219 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term681091, term681091.getClass(), "id", -7370364068296402536L);
        setIntField(term681091, term681091.getClass(), "pdId", -1497378582);
        setField(term681091, term681091.getClass(), "playerName", "xxx");
        setIntField(term681091, term681091.getClass(), "vocaloidPoints", 300);
        setIntField(term681091, term681091.getClass(), "level", 1);
        setIntField(term681091, term681091.getClass(), "levelExp", -449740668);
        setField(term681091, term681091.getClass(), "levelTitle", "xxx");
        setIntField(term681091, term681091.getClass(), "plateId", -1);
        setIntField(term681091, term681091.getClass(), "plateEffectId", -1);
        setField(term681091, term681091.getClass(), "passwordStatus", enum1487);
        setField(term681091, term681091.getClass(), "password", "**********");
        setBooleanField(term681091, term681091.getClass(), "preferPerPvModule", true);
        setBooleanField(term681091, term681091.getClass(), "preferCommonModule", true);
        setBooleanField(term681091, term681091.getClass(), "usePerPvSkin", false);
        setBooleanField(term681091, term681091.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term681091, term681091.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term681091, term681091.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term681091, term681091.getClass(), "usePerPvTouchSliderSe", false);
        setField(term681091, term681091.getClass(), "commonModule", "-999,-999,-999");
        setField(term681091, term681091.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term681215, term681215.getClass(), "year", 2026);
        setShortField(term681215, term681215.getClass(), "month", (short) 8);
        setShortField(term681215, term681215.getClass(), "day", (short) 12);
        setField(term681214, term681214.getClass(), "date", term681215);
        setByteField(term681219, term681219.getClass(), "hour", (byte) 2);
        setByteField(term681219, term681219.getClass(), "minute", (byte) 4);
        setByteField(term681219, term681219.getClass(), "second", (byte) 18);
        setIntField(term681219, term681219.getClass(), "nano", 967838000);
        setField(term681214, term681214.getClass(), "time", term681219);
        setField(term681091, term681091.getClass(), "commonModuleSetTime", term681214);
        setField(term681091, term681091.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term681091, term681091.getClass(), "commonSkin", -1);
        setIntField(term681091, term681091.getClass(), "headphoneVolume", 100);
        setBooleanField(term681091, term681091.getClass(), "buttonSeOn", true);
        setIntField(term681091, term681091.getClass(), "buttonSeVolume", 100);
        setIntField(term681091, term681091.getClass(), "sliderSeVolume", 100);
        setIntField(term681091, term681091.getClass(), "buttonSe", -1);
        setIntField(term681091, term681091.getClass(), "chainSlideSe", -1);
        setIntField(term681091, term681091.getClass(), "slideSe", -1);
        setIntField(term681091, term681091.getClass(), "sliderTouchSe", -1);
        setField(term681091, term681091.getClass(), "sortMode", enum1488);
        setIntField(term681091, term681091.getClass(), "nextPvId", -1);
        setField(term681091, term681091.getClass(), "nextDifficulty", enum1489);
        setField(term681091, term681091.getClass(), "nextEdition", enum1490);
        setBooleanField(term681091, term681091.getClass(), "showInterimRanking", true);
        setBooleanField(term681091, term681091.getClass(), "showClearStatus", true);
        setBooleanField(term681091, term681091.getClass(), "showGreatBorder", true);
        setBooleanField(term681091, term681091.getClass(), "showExcellentBorder", true);
        setBooleanField(term681091, term681091.getClass(), "showRivalBorder", true);
        setBooleanField(term681091, term681091.getClass(), "showRgoSetting", true);
        setBooleanField(term681091, term681091.getClass(), "contestNowPlayingEnable", true);
        setIntField(term681091, term681091.getClass(), "contestNowPlayingId", -1);
        setIntField(term681091, term681091.getClass(), "contestNowPlayingValue", -1);
        setField(term681091, term681091.getClass(), "contestNowPlayingResultRank", enum1491);
        setField(term681091, term681091.getClass(), "contestNowPlayingSpecifier", "");
        setField(term681091, term681091.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term681091, term681091.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term681091, term681091.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term681091, term681091.getClass(), "rivalPdId", -1);
        term681696 = new Integer(1283268105);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerModule");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term681089;
        args[1] = term681091;
        args[2] = term681696;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


