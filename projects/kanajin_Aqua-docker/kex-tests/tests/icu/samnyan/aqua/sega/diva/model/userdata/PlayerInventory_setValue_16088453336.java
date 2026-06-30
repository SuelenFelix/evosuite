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
import java.lang.Object;
import java.lang.String;

public class PlayerInventory_setValue_16088453336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term546548;

    public PlayerInventory_setValue_16088453336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term546549 = new Long(6811161968424632369L);
        Class<? extends Object> term547199 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term547198 = ((Class) term547199).getDeclaredField((String) "MISS");
        ((Field) term547198).setAccessible(true);
        Object enum1197 = ((Field) term547198).get((Object) null);
        Class<? extends Object> term547576 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term547575 = ((Class) term547576).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term547575).setAccessible(true);
        Object enum1198 = ((Field) term547575).get((Object) null);
        Class<? extends Object> term547859 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term547858 = ((Class) term547859).getDeclaredField((String) "NORMAL");
        ((Field) term547858).setAccessible(true);
        Object enum1199 = ((Field) term547858).get((Object) null);
        Class<? extends Object> term548134 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term548133 = ((Class) term548134).getDeclaredField((String) "ORIGINAL");
        ((Field) term548133).setAccessible(true);
        Object enum1200 = ((Field) term548133).get((Object) null);
        Class<? extends Object> term548400 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term548399 = ((Class) term548400).getDeclaredField((String) "NONE");
        ((Field) term548399).setAccessible(true);
        Object enum1201 = ((Field) term548399).get((Object) null);
        term546548 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerInventory"));
        Object term546551 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term546674 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term546675 = newInstance(Class.forName("java.time.LocalDate"));
        Object term546679 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term546548, term546548.getClass(), "id", term546549);
        setLongField(term546551, term546551.getClass(), "id", -432424084523104253L);
        setIntField(term546551, term546551.getClass(), "pdId", 724930183);
        setField(term546551, term546551.getClass(), "playerName", "xxx");
        setIntField(term546551, term546551.getClass(), "vocaloidPoints", 300);
        setIntField(term546551, term546551.getClass(), "level", 1);
        setIntField(term546551, term546551.getClass(), "levelExp", 1053680722);
        setField(term546551, term546551.getClass(), "levelTitle", "xxx");
        setIntField(term546551, term546551.getClass(), "plateId", -1);
        setIntField(term546551, term546551.getClass(), "plateEffectId", -1);
        setField(term546551, term546551.getClass(), "passwordStatus", enum1197);
        setField(term546551, term546551.getClass(), "password", "**********");
        setBooleanField(term546551, term546551.getClass(), "preferPerPvModule", true);
        setBooleanField(term546551, term546551.getClass(), "preferCommonModule", false);
        setBooleanField(term546551, term546551.getClass(), "usePerPvSkin", true);
        setBooleanField(term546551, term546551.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term546551, term546551.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term546551, term546551.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term546551, term546551.getClass(), "usePerPvTouchSliderSe", false);
        setField(term546551, term546551.getClass(), "commonModule", "-999,-999,-999");
        setField(term546551, term546551.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term546675, term546675.getClass(), "year", 2026);
        setShortField(term546675, term546675.getClass(), "month", (short) 6);
        setShortField(term546675, term546675.getClass(), "day", (short) 29);
        setField(term546674, term546674.getClass(), "date", term546675);
        setByteField(term546679, term546679.getClass(), "hour", (byte) 4);
        setByteField(term546679, term546679.getClass(), "minute", (byte) 28);
        setByteField(term546679, term546679.getClass(), "second", (byte) 41);
        setIntField(term546679, term546679.getClass(), "nano", 930179000);
        setField(term546674, term546674.getClass(), "time", term546679);
        setField(term546551, term546551.getClass(), "commonModuleSetTime", term546674);
        setField(term546551, term546551.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term546551, term546551.getClass(), "commonSkin", -1);
        setIntField(term546551, term546551.getClass(), "headphoneVolume", 100);
        setBooleanField(term546551, term546551.getClass(), "buttonSeOn", true);
        setIntField(term546551, term546551.getClass(), "buttonSeVolume", 100);
        setIntField(term546551, term546551.getClass(), "sliderSeVolume", 100);
        setIntField(term546551, term546551.getClass(), "buttonSe", -1);
        setIntField(term546551, term546551.getClass(), "chainSlideSe", -1);
        setIntField(term546551, term546551.getClass(), "slideSe", -1);
        setIntField(term546551, term546551.getClass(), "sliderTouchSe", -1);
        setField(term546551, term546551.getClass(), "sortMode", enum1198);
        setIntField(term546551, term546551.getClass(), "nextPvId", -1);
        setField(term546551, term546551.getClass(), "nextDifficulty", enum1199);
        setField(term546551, term546551.getClass(), "nextEdition", enum1200);
        setBooleanField(term546551, term546551.getClass(), "showInterimRanking", true);
        setBooleanField(term546551, term546551.getClass(), "showClearStatus", true);
        setBooleanField(term546551, term546551.getClass(), "showGreatBorder", true);
        setBooleanField(term546551, term546551.getClass(), "showExcellentBorder", true);
        setBooleanField(term546551, term546551.getClass(), "showRivalBorder", true);
        setBooleanField(term546551, term546551.getClass(), "showRgoSetting", true);
        setBooleanField(term546551, term546551.getClass(), "contestNowPlayingEnable", false);
        setIntField(term546551, term546551.getClass(), "contestNowPlayingId", -1);
        setIntField(term546551, term546551.getClass(), "contestNowPlayingValue", -1);
        setField(term546551, term546551.getClass(), "contestNowPlayingResultRank", enum1201);
        setField(term546551, term546551.getClass(), "contestNowPlayingSpecifier", "");
        setField(term546551, term546551.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term546551, term546551.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term546551, term546551.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term546551, term546551.getClass(), "rivalPdId", -1);
        setField(term546548, term546548.getClass(), "pdId", term546551);
        setField(term546548, term546548.getClass(), "value", "pumvwBWvpy");
        setField(term546548, term546548.getClass(), "type", "HwLHeGLyhe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerInventory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "RDnkgWkcbz";
        callMethod(klass, "setValue", argTypes, term546548, args);
    }

};


