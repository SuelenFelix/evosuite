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

public class PlayerProfile_canEqual_1454111557103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4905323;
     Object term4905928;

    public PlayerProfile_canEqual_1454111557103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4905936 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term4905935 = ((Class) term4905936).getDeclaredField((String) "MISS");
        ((Field) term4905935).setAccessible(true);
        Object enum3147 = ((Field) term4905935).get((Object) null);
        Class<? extends Object> term4906313 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term4906312 = ((Class) term4906313).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term4906312).setAccessible(true);
        Object enum3148 = ((Field) term4906312).get((Object) null);
        Class<? extends Object> term4906596 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term4906595 = ((Class) term4906596).getDeclaredField((String) "NORMAL");
        ((Field) term4906595).setAccessible(true);
        Object enum3149 = ((Field) term4906595).get((Object) null);
        Class<? extends Object> term4906871 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term4906870 = ((Class) term4906871).getDeclaredField((String) "ORIGINAL");
        ((Field) term4906870).setAccessible(true);
        Object enum3150 = ((Field) term4906870).get((Object) null);
        Class<? extends Object> term4907137 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term4907136 = ((Class) term4907137).getDeclaredField((String) "NONE");
        ((Field) term4907136).setAccessible(true);
        Object enum3151 = ((Field) term4907136).get((Object) null);
        term4905323 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term4905446 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4905447 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4905451 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4905323, term4905323.getClass(), "id", 2797847236330702952L);
        setIntField(term4905323, term4905323.getClass(), "pdId", 1059121190);
        setField(term4905323, term4905323.getClass(), "playerName", "xxx");
        setIntField(term4905323, term4905323.getClass(), "vocaloidPoints", 300);
        setIntField(term4905323, term4905323.getClass(), "level", 1);
        setIntField(term4905323, term4905323.getClass(), "levelExp", 349600257);
        setField(term4905323, term4905323.getClass(), "levelTitle", "xxx");
        setIntField(term4905323, term4905323.getClass(), "plateId", -1);
        setIntField(term4905323, term4905323.getClass(), "plateEffectId", -1);
        setField(term4905323, term4905323.getClass(), "passwordStatus", enum3147);
        setField(term4905323, term4905323.getClass(), "password", "**********");
        setBooleanField(term4905323, term4905323.getClass(), "preferPerPvModule", true);
        setBooleanField(term4905323, term4905323.getClass(), "preferCommonModule", false);
        setBooleanField(term4905323, term4905323.getClass(), "usePerPvSkin", false);
        setBooleanField(term4905323, term4905323.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term4905323, term4905323.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term4905323, term4905323.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term4905323, term4905323.getClass(), "usePerPvTouchSliderSe", true);
        setField(term4905323, term4905323.getClass(), "commonModule", "-999,-999,-999");
        setField(term4905323, term4905323.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term4905447, term4905447.getClass(), "year", 2026);
        setShortField(term4905447, term4905447.getClass(), "month", (short) 8);
        setShortField(term4905447, term4905447.getClass(), "day", (short) 11);
        setField(term4905446, term4905446.getClass(), "date", term4905447);
        setByteField(term4905451, term4905451.getClass(), "hour", (byte) 23);
        setByteField(term4905451, term4905451.getClass(), "minute", (byte) 7);
        setByteField(term4905451, term4905451.getClass(), "second", (byte) 42);
        setIntField(term4905451, term4905451.getClass(), "nano", 79724000);
        setField(term4905446, term4905446.getClass(), "time", term4905451);
        setField(term4905323, term4905323.getClass(), "commonModuleSetTime", term4905446);
        setField(term4905323, term4905323.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term4905323, term4905323.getClass(), "commonSkin", -1);
        setIntField(term4905323, term4905323.getClass(), "headphoneVolume", 100);
        setBooleanField(term4905323, term4905323.getClass(), "buttonSeOn", true);
        setIntField(term4905323, term4905323.getClass(), "buttonSeVolume", 100);
        setIntField(term4905323, term4905323.getClass(), "sliderSeVolume", 100);
        setIntField(term4905323, term4905323.getClass(), "buttonSe", -1);
        setIntField(term4905323, term4905323.getClass(), "chainSlideSe", -1);
        setIntField(term4905323, term4905323.getClass(), "slideSe", -1);
        setIntField(term4905323, term4905323.getClass(), "sliderTouchSe", -1);
        setField(term4905323, term4905323.getClass(), "sortMode", enum3148);
        setIntField(term4905323, term4905323.getClass(), "nextPvId", -1);
        setField(term4905323, term4905323.getClass(), "nextDifficulty", enum3149);
        setField(term4905323, term4905323.getClass(), "nextEdition", enum3150);
        setBooleanField(term4905323, term4905323.getClass(), "showInterimRanking", true);
        setBooleanField(term4905323, term4905323.getClass(), "showClearStatus", true);
        setBooleanField(term4905323, term4905323.getClass(), "showGreatBorder", true);
        setBooleanField(term4905323, term4905323.getClass(), "showExcellentBorder", true);
        setBooleanField(term4905323, term4905323.getClass(), "showRivalBorder", true);
        setBooleanField(term4905323, term4905323.getClass(), "showRgoSetting", true);
        setBooleanField(term4905323, term4905323.getClass(), "contestNowPlayingEnable", true);
        setIntField(term4905323, term4905323.getClass(), "contestNowPlayingId", -1);
        setIntField(term4905323, term4905323.getClass(), "contestNowPlayingValue", -1);
        setField(term4905323, term4905323.getClass(), "contestNowPlayingResultRank", enum3151);
        setField(term4905323, term4905323.getClass(), "contestNowPlayingSpecifier", "");
        setField(term4905323, term4905323.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term4905323, term4905323.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term4905323, term4905323.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term4905323, term4905323.getClass(), "rivalPdId", -1);
        term4905928 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term4905928;
        callMethod(klass, "canEqual", argTypes, term4905323, args);
    }

};


