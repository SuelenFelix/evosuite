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

public class PlayerProfile_setCommonModule_25241217469 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term850508;

    public PlayerProfile_setCommonModule_25241217469() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term851132 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term851131 = ((Class) term851132).getDeclaredField((String) "MISS");
        ((Field) term851131).setAccessible(true);
        Object enum1832 = ((Field) term851131).get((Object) null);
        Class<? extends Object> term851509 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term851508 = ((Class) term851509).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term851508).setAccessible(true);
        Object enum1833 = ((Field) term851508).get((Object) null);
        Class<? extends Object> term851792 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term851791 = ((Class) term851792).getDeclaredField((String) "NORMAL");
        ((Field) term851791).setAccessible(true);
        Object enum1834 = ((Field) term851791).get((Object) null);
        Class<? extends Object> term852067 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term852066 = ((Class) term852067).getDeclaredField((String) "ORIGINAL");
        ((Field) term852066).setAccessible(true);
        Object enum1835 = ((Field) term852066).get((Object) null);
        Class<? extends Object> term852333 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term852332 = ((Class) term852333).getDeclaredField((String) "NONE");
        ((Field) term852332).setAccessible(true);
        Object enum1836 = ((Field) term852332).get((Object) null);
        term850508 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term850631 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term850632 = newInstance(Class.forName("java.time.LocalDate"));
        Object term850636 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term850508, term850508.getClass(), "id", -7155106718297861156L);
        setIntField(term850508, term850508.getClass(), "pdId", 1036231784);
        setField(term850508, term850508.getClass(), "playerName", "xxx");
        setIntField(term850508, term850508.getClass(), "vocaloidPoints", 300);
        setIntField(term850508, term850508.getClass(), "level", 1);
        setIntField(term850508, term850508.getClass(), "levelExp", 732187274);
        setField(term850508, term850508.getClass(), "levelTitle", "xxx");
        setIntField(term850508, term850508.getClass(), "plateId", -1);
        setIntField(term850508, term850508.getClass(), "plateEffectId", -1);
        setField(term850508, term850508.getClass(), "passwordStatus", enum1832);
        setField(term850508, term850508.getClass(), "password", "**********");
        setBooleanField(term850508, term850508.getClass(), "preferPerPvModule", true);
        setBooleanField(term850508, term850508.getClass(), "preferCommonModule", false);
        setBooleanField(term850508, term850508.getClass(), "usePerPvSkin", false);
        setBooleanField(term850508, term850508.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term850508, term850508.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term850508, term850508.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term850508, term850508.getClass(), "usePerPvTouchSliderSe", false);
        setField(term850508, term850508.getClass(), "commonModule", "-999,-999,-999");
        setField(term850508, term850508.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term850632, term850632.getClass(), "year", 2026);
        setShortField(term850632, term850632.getClass(), "month", (short) 8);
        setShortField(term850632, term850632.getClass(), "day", (short) 12);
        setField(term850631, term850631.getClass(), "date", term850632);
        setByteField(term850636, term850636.getClass(), "hour", (byte) 2);
        setByteField(term850636, term850636.getClass(), "minute", (byte) 4);
        setByteField(term850636, term850636.getClass(), "second", (byte) 40);
        setIntField(term850636, term850636.getClass(), "nano", 492370000);
        setField(term850631, term850631.getClass(), "time", term850636);
        setField(term850508, term850508.getClass(), "commonModuleSetTime", term850631);
        setField(term850508, term850508.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term850508, term850508.getClass(), "commonSkin", -1);
        setIntField(term850508, term850508.getClass(), "headphoneVolume", 100);
        setBooleanField(term850508, term850508.getClass(), "buttonSeOn", true);
        setIntField(term850508, term850508.getClass(), "buttonSeVolume", 100);
        setIntField(term850508, term850508.getClass(), "sliderSeVolume", 100);
        setIntField(term850508, term850508.getClass(), "buttonSe", -1);
        setIntField(term850508, term850508.getClass(), "chainSlideSe", -1);
        setIntField(term850508, term850508.getClass(), "slideSe", -1);
        setIntField(term850508, term850508.getClass(), "sliderTouchSe", -1);
        setField(term850508, term850508.getClass(), "sortMode", enum1833);
        setIntField(term850508, term850508.getClass(), "nextPvId", -1);
        setField(term850508, term850508.getClass(), "nextDifficulty", enum1834);
        setField(term850508, term850508.getClass(), "nextEdition", enum1835);
        setBooleanField(term850508, term850508.getClass(), "showInterimRanking", true);
        setBooleanField(term850508, term850508.getClass(), "showClearStatus", true);
        setBooleanField(term850508, term850508.getClass(), "showGreatBorder", true);
        setBooleanField(term850508, term850508.getClass(), "showExcellentBorder", true);
        setBooleanField(term850508, term850508.getClass(), "showRivalBorder", true);
        setBooleanField(term850508, term850508.getClass(), "showRgoSetting", true);
        setBooleanField(term850508, term850508.getClass(), "contestNowPlayingEnable", true);
        setIntField(term850508, term850508.getClass(), "contestNowPlayingId", -1);
        setIntField(term850508, term850508.getClass(), "contestNowPlayingValue", -1);
        setField(term850508, term850508.getClass(), "contestNowPlayingResultRank", enum1836);
        setField(term850508, term850508.getClass(), "contestNowPlayingSpecifier", "");
        setField(term850508, term850508.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term850508, term850508.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term850508, term850508.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term850508, term850508.getClass(), "rivalPdId", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IHqvyhMtuM";
        callMethod(klass, "setCommonModule", argTypes, term850508, args);
    }

};


