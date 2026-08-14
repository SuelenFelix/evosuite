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

public class PlayerScreenShot_init_7098561250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term483966;
     Object term484583;

    public PlayerScreenShot_init_7098561250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term484616 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term484615 = ((Class) term484616).getDeclaredField((String) "MISS");
        ((Field) term484615).setAccessible(true);
        Object enum1077 = ((Field) term484615).get((Object) null);
        Class<? extends Object> term484993 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term484992 = ((Class) term484993).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term484992).setAccessible(true);
        Object enum1078 = ((Field) term484992).get((Object) null);
        Class<? extends Object> term485276 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term485275 = ((Class) term485276).getDeclaredField((String) "NORMAL");
        ((Field) term485275).setAccessible(true);
        Object enum1079 = ((Field) term485275).get((Object) null);
        Class<? extends Object> term485551 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term485550 = ((Class) term485551).getDeclaredField((String) "ORIGINAL");
        ((Field) term485550).setAccessible(true);
        Object enum1080 = ((Field) term485550).get((Object) null);
        Class<? extends Object> term485817 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term485816 = ((Class) term485817).getDeclaredField((String) "NONE");
        ((Field) term485816).setAccessible(true);
        Object enum1081 = ((Field) term485816).get((Object) null);
        term483966 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term484089 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term484090 = newInstance(Class.forName("java.time.LocalDate"));
        Object term484094 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term483966, term483966.getClass(), "id", -5935517391653614345L);
        setIntField(term483966, term483966.getClass(), "pdId", 45477597);
        setField(term483966, term483966.getClass(), "playerName", "xxx");
        setIntField(term483966, term483966.getClass(), "vocaloidPoints", 300);
        setIntField(term483966, term483966.getClass(), "level", 1);
        setIntField(term483966, term483966.getClass(), "levelExp", 702851889);
        setField(term483966, term483966.getClass(), "levelTitle", "xxx");
        setIntField(term483966, term483966.getClass(), "plateId", -1);
        setIntField(term483966, term483966.getClass(), "plateEffectId", -1);
        setField(term483966, term483966.getClass(), "passwordStatus", enum1077);
        setField(term483966, term483966.getClass(), "password", "**********");
        setBooleanField(term483966, term483966.getClass(), "preferPerPvModule", true);
        setBooleanField(term483966, term483966.getClass(), "preferCommonModule", false);
        setBooleanField(term483966, term483966.getClass(), "usePerPvSkin", true);
        setBooleanField(term483966, term483966.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term483966, term483966.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term483966, term483966.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term483966, term483966.getClass(), "usePerPvTouchSliderSe", false);
        setField(term483966, term483966.getClass(), "commonModule", "-999,-999,-999");
        setField(term483966, term483966.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term484090, term484090.getClass(), "year", 2026);
        setShortField(term484090, term484090.getClass(), "month", (short) 8);
        setShortField(term484090, term484090.getClass(), "day", (short) 12);
        setField(term484089, term484089.getClass(), "date", term484090);
        setByteField(term484094, term484094.getClass(), "hour", (byte) 2);
        setByteField(term484094, term484094.getClass(), "minute", (byte) 3);
        setByteField(term484094, term484094.getClass(), "second", (byte) 45);
        setIntField(term484094, term484094.getClass(), "nano", 285827000);
        setField(term484089, term484089.getClass(), "time", term484094);
        setField(term483966, term483966.getClass(), "commonModuleSetTime", term484089);
        setField(term483966, term483966.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term483966, term483966.getClass(), "commonSkin", -1);
        setIntField(term483966, term483966.getClass(), "headphoneVolume", 100);
        setBooleanField(term483966, term483966.getClass(), "buttonSeOn", true);
        setIntField(term483966, term483966.getClass(), "buttonSeVolume", 100);
        setIntField(term483966, term483966.getClass(), "sliderSeVolume", 100);
        setIntField(term483966, term483966.getClass(), "buttonSe", -1);
        setIntField(term483966, term483966.getClass(), "chainSlideSe", -1);
        setIntField(term483966, term483966.getClass(), "slideSe", -1);
        setIntField(term483966, term483966.getClass(), "sliderTouchSe", -1);
        setField(term483966, term483966.getClass(), "sortMode", enum1078);
        setIntField(term483966, term483966.getClass(), "nextPvId", -1);
        setField(term483966, term483966.getClass(), "nextDifficulty", enum1079);
        setField(term483966, term483966.getClass(), "nextEdition", enum1080);
        setBooleanField(term483966, term483966.getClass(), "showInterimRanking", true);
        setBooleanField(term483966, term483966.getClass(), "showClearStatus", true);
        setBooleanField(term483966, term483966.getClass(), "showGreatBorder", true);
        setBooleanField(term483966, term483966.getClass(), "showExcellentBorder", true);
        setBooleanField(term483966, term483966.getClass(), "showRivalBorder", true);
        setBooleanField(term483966, term483966.getClass(), "showRgoSetting", true);
        setBooleanField(term483966, term483966.getClass(), "contestNowPlayingEnable", true);
        setIntField(term483966, term483966.getClass(), "contestNowPlayingId", -1);
        setIntField(term483966, term483966.getClass(), "contestNowPlayingValue", -1);
        setField(term483966, term483966.getClass(), "contestNowPlayingResultRank", enum1081);
        setField(term483966, term483966.getClass(), "contestNowPlayingSpecifier", "");
        setField(term483966, term483966.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term483966, term483966.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term483966, term483966.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term483966, term483966.getClass(), "rivalPdId", -1);
        term484583 = new Integer(2035373298);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerScreenShot");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.String");
        Object[] args = new Object[5];
        args[0] = term483966;
        args[1] = "doQLHkjpNm";
        args[2] = term484583;
        args[3] = "lCyLIcSuom";
        args[4] = "CGOpQSZZwI";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


