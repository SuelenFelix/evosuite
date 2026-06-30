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

public class PlayerProfile_getPasswordStatus_107509137110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term705687;

    public PlayerProfile_getPasswordStatus_107509137110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term706299 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term706298 = ((Class) term706299).getDeclaredField((String) "MISS");
        ((Field) term706298).setAccessible(true);
        Object enum1537 = ((Field) term706298).get((Object) null);
        Class<? extends Object> term706676 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term706675 = ((Class) term706676).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term706675).setAccessible(true);
        Object enum1538 = ((Field) term706675).get((Object) null);
        Class<? extends Object> term706959 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term706958 = ((Class) term706959).getDeclaredField((String) "NORMAL");
        ((Field) term706958).setAccessible(true);
        Object enum1539 = ((Field) term706958).get((Object) null);
        Class<? extends Object> term707234 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term707233 = ((Class) term707234).getDeclaredField((String) "ORIGINAL");
        ((Field) term707233).setAccessible(true);
        Object enum1540 = ((Field) term707233).get((Object) null);
        Class<? extends Object> term707500 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term707499 = ((Class) term707500).getDeclaredField((String) "NONE");
        ((Field) term707499).setAccessible(true);
        Object enum1541 = ((Field) term707499).get((Object) null);
        term705687 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term705810 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term705811 = newInstance(Class.forName("java.time.LocalDate"));
        Object term705815 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term705687, term705687.getClass(), "id", 1133267598258375793L);
        setIntField(term705687, term705687.getClass(), "pdId", -51407538);
        setField(term705687, term705687.getClass(), "playerName", "xxx");
        setIntField(term705687, term705687.getClass(), "vocaloidPoints", 300);
        setIntField(term705687, term705687.getClass(), "level", 1);
        setIntField(term705687, term705687.getClass(), "levelExp", -465783748);
        setField(term705687, term705687.getClass(), "levelTitle", "xxx");
        setIntField(term705687, term705687.getClass(), "plateId", -1);
        setIntField(term705687, term705687.getClass(), "plateEffectId", -1);
        setField(term705687, term705687.getClass(), "passwordStatus", enum1537);
        setField(term705687, term705687.getClass(), "password", "**********");
        setBooleanField(term705687, term705687.getClass(), "preferPerPvModule", true);
        setBooleanField(term705687, term705687.getClass(), "preferCommonModule", false);
        setBooleanField(term705687, term705687.getClass(), "usePerPvSkin", true);
        setBooleanField(term705687, term705687.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term705687, term705687.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term705687, term705687.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term705687, term705687.getClass(), "usePerPvTouchSliderSe", true);
        setField(term705687, term705687.getClass(), "commonModule", "-999,-999,-999");
        setField(term705687, term705687.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term705811, term705811.getClass(), "year", 2026);
        setShortField(term705811, term705811.getClass(), "month", (short) 6);
        setShortField(term705811, term705811.getClass(), "day", (short) 29);
        setField(term705810, term705810.getClass(), "date", term705811);
        setByteField(term705815, term705815.getClass(), "hour", (byte) 4);
        setByteField(term705815, term705815.getClass(), "minute", (byte) 29);
        setByteField(term705815, term705815.getClass(), "second", (byte) 11);
        setIntField(term705815, term705815.getClass(), "nano", 816929000);
        setField(term705810, term705810.getClass(), "time", term705815);
        setField(term705687, term705687.getClass(), "commonModuleSetTime", term705810);
        setField(term705687, term705687.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term705687, term705687.getClass(), "commonSkin", -1);
        setIntField(term705687, term705687.getClass(), "headphoneVolume", 100);
        setBooleanField(term705687, term705687.getClass(), "buttonSeOn", true);
        setIntField(term705687, term705687.getClass(), "buttonSeVolume", 100);
        setIntField(term705687, term705687.getClass(), "sliderSeVolume", 100);
        setIntField(term705687, term705687.getClass(), "buttonSe", -1);
        setIntField(term705687, term705687.getClass(), "chainSlideSe", -1);
        setIntField(term705687, term705687.getClass(), "slideSe", -1);
        setIntField(term705687, term705687.getClass(), "sliderTouchSe", -1);
        setField(term705687, term705687.getClass(), "sortMode", enum1538);
        setIntField(term705687, term705687.getClass(), "nextPvId", -1);
        setField(term705687, term705687.getClass(), "nextDifficulty", enum1539);
        setField(term705687, term705687.getClass(), "nextEdition", enum1540);
        setBooleanField(term705687, term705687.getClass(), "showInterimRanking", true);
        setBooleanField(term705687, term705687.getClass(), "showClearStatus", true);
        setBooleanField(term705687, term705687.getClass(), "showGreatBorder", true);
        setBooleanField(term705687, term705687.getClass(), "showExcellentBorder", true);
        setBooleanField(term705687, term705687.getClass(), "showRivalBorder", true);
        setBooleanField(term705687, term705687.getClass(), "showRgoSetting", true);
        setBooleanField(term705687, term705687.getClass(), "contestNowPlayingEnable", false);
        setIntField(term705687, term705687.getClass(), "contestNowPlayingId", -1);
        setIntField(term705687, term705687.getClass(), "contestNowPlayingValue", -1);
        setField(term705687, term705687.getClass(), "contestNowPlayingResultRank", enum1541);
        setField(term705687, term705687.getClass(), "contestNowPlayingSpecifier", "");
        setField(term705687, term705687.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term705687, term705687.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term705687, term705687.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term705687, term705687.getClass(), "rivalPdId", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPasswordStatus", argTypes, term705687, args);
    }

};


