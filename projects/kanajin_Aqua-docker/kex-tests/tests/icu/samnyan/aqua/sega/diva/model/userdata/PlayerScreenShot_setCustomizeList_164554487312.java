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

public class PlayerScreenShot_setCustomizeList_164554487312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term515304;

    public PlayerScreenShot_setCustomizeList_164554487312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term515967 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term515966 = ((Class) term515967).getDeclaredField((String) "MISS");
        ((Field) term515966).setAccessible(true);
        Object enum1137 = ((Field) term515966).get((Object) null);
        Class<? extends Object> term516344 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term516343 = ((Class) term516344).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term516343).setAccessible(true);
        Object enum1138 = ((Field) term516343).get((Object) null);
        Class<? extends Object> term516627 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term516626 = ((Class) term516627).getDeclaredField((String) "NORMAL");
        ((Field) term516626).setAccessible(true);
        Object enum1139 = ((Field) term516626).get((Object) null);
        Class<? extends Object> term516902 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term516901 = ((Class) term516902).getDeclaredField((String) "ORIGINAL");
        ((Field) term516901).setAccessible(true);
        Object enum1140 = ((Field) term516901).get((Object) null);
        Class<? extends Object> term517168 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term517167 = ((Class) term517168).getDeclaredField((String) "NONE");
        ((Field) term517167).setAccessible(true);
        Object enum1141 = ((Field) term517167).get((Object) null);
        term515304 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerScreenShot"));
        Object term515306 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term515429 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term515430 = newInstance(Class.forName("java.time.LocalDate"));
        Object term515434 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term515304, term515304.getClass(), "id", 4742108233936970770L);
        setLongField(term515306, term515306.getClass(), "id", 2722004046017350471L);
        setIntField(term515306, term515306.getClass(), "pdId", 1541867826);
        setField(term515306, term515306.getClass(), "playerName", "xxx");
        setIntField(term515306, term515306.getClass(), "vocaloidPoints", 300);
        setIntField(term515306, term515306.getClass(), "level", 1);
        setIntField(term515306, term515306.getClass(), "levelExp", -137176190);
        setField(term515306, term515306.getClass(), "levelTitle", "xxx");
        setIntField(term515306, term515306.getClass(), "plateId", -1);
        setIntField(term515306, term515306.getClass(), "plateEffectId", -1);
        setField(term515306, term515306.getClass(), "passwordStatus", enum1137);
        setField(term515306, term515306.getClass(), "password", "**********");
        setBooleanField(term515306, term515306.getClass(), "preferPerPvModule", true);
        setBooleanField(term515306, term515306.getClass(), "preferCommonModule", true);
        setBooleanField(term515306, term515306.getClass(), "usePerPvSkin", true);
        setBooleanField(term515306, term515306.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term515306, term515306.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term515306, term515306.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term515306, term515306.getClass(), "usePerPvTouchSliderSe", false);
        setField(term515306, term515306.getClass(), "commonModule", "-999,-999,-999");
        setField(term515306, term515306.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term515430, term515430.getClass(), "year", 2026);
        setShortField(term515430, term515430.getClass(), "month", (short) 6);
        setShortField(term515430, term515430.getClass(), "day", (short) 29);
        setField(term515429, term515429.getClass(), "date", term515430);
        setByteField(term515434, term515434.getClass(), "hour", (byte) 4);
        setByteField(term515434, term515434.getClass(), "minute", (byte) 28);
        setByteField(term515434, term515434.getClass(), "second", (byte) 33);
        setIntField(term515434, term515434.getClass(), "nano", 902710000);
        setField(term515429, term515429.getClass(), "time", term515434);
        setField(term515306, term515306.getClass(), "commonModuleSetTime", term515429);
        setField(term515306, term515306.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term515306, term515306.getClass(), "commonSkin", -1);
        setIntField(term515306, term515306.getClass(), "headphoneVolume", 100);
        setBooleanField(term515306, term515306.getClass(), "buttonSeOn", true);
        setIntField(term515306, term515306.getClass(), "buttonSeVolume", 100);
        setIntField(term515306, term515306.getClass(), "sliderSeVolume", 100);
        setIntField(term515306, term515306.getClass(), "buttonSe", -1);
        setIntField(term515306, term515306.getClass(), "chainSlideSe", -1);
        setIntField(term515306, term515306.getClass(), "slideSe", -1);
        setIntField(term515306, term515306.getClass(), "sliderTouchSe", -1);
        setField(term515306, term515306.getClass(), "sortMode", enum1138);
        setIntField(term515306, term515306.getClass(), "nextPvId", -1);
        setField(term515306, term515306.getClass(), "nextDifficulty", enum1139);
        setField(term515306, term515306.getClass(), "nextEdition", enum1140);
        setBooleanField(term515306, term515306.getClass(), "showInterimRanking", true);
        setBooleanField(term515306, term515306.getClass(), "showClearStatus", true);
        setBooleanField(term515306, term515306.getClass(), "showGreatBorder", true);
        setBooleanField(term515306, term515306.getClass(), "showExcellentBorder", true);
        setBooleanField(term515306, term515306.getClass(), "showRivalBorder", true);
        setBooleanField(term515306, term515306.getClass(), "showRgoSetting", true);
        setBooleanField(term515306, term515306.getClass(), "contestNowPlayingEnable", false);
        setIntField(term515306, term515306.getClass(), "contestNowPlayingId", -1);
        setIntField(term515306, term515306.getClass(), "contestNowPlayingValue", -1);
        setField(term515306, term515306.getClass(), "contestNowPlayingResultRank", enum1141);
        setField(term515306, term515306.getClass(), "contestNowPlayingSpecifier", "");
        setField(term515306, term515306.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term515306, term515306.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term515306, term515306.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term515306, term515306.getClass(), "rivalPdId", -1);
        setField(term515304, term515304.getClass(), "pdId", term515306);
        setIntField(term515304, term515304.getClass(), "pvId", 348263044);
        setField(term515304, term515304.getClass(), "fileName", "TXZAIPQJHt");
        setField(term515304, term515304.getClass(), "moduleList", "DIbeDHICho");
        setField(term515304, term515304.getClass(), "customizeList", "dJGPlmSRnz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerScreenShot");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "DPskuFUobI";
        callMethod(klass, "setCustomizeList", argTypes, term515304, args);
    }

};


