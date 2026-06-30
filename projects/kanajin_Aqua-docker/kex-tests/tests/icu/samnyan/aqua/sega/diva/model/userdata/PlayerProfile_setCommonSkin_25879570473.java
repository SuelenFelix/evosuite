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

public class PlayerProfile_setCommonSkin_25879570473 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term860396;
     Object term861001;

    public PlayerProfile_setCommonSkin_25879570473() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term861010 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term861009 = ((Class) term861010).getDeclaredField((String) "MISS");
        ((Field) term861009).setAccessible(true);
        Object enum1852 = ((Field) term861009).get((Object) null);
        Class<? extends Object> term861387 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term861386 = ((Class) term861387).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term861386).setAccessible(true);
        Object enum1853 = ((Field) term861386).get((Object) null);
        Class<? extends Object> term861670 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term861669 = ((Class) term861670).getDeclaredField((String) "NORMAL");
        ((Field) term861669).setAccessible(true);
        Object enum1854 = ((Field) term861669).get((Object) null);
        Class<? extends Object> term861945 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term861944 = ((Class) term861945).getDeclaredField((String) "ORIGINAL");
        ((Field) term861944).setAccessible(true);
        Object enum1855 = ((Field) term861944).get((Object) null);
        Class<? extends Object> term862211 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term862210 = ((Class) term862211).getDeclaredField((String) "NONE");
        ((Field) term862210).setAccessible(true);
        Object enum1856 = ((Field) term862210).get((Object) null);
        term860396 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term860519 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term860520 = newInstance(Class.forName("java.time.LocalDate"));
        Object term860524 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term860396, term860396.getClass(), "id", 6695041041196724237L);
        setIntField(term860396, term860396.getClass(), "pdId", -456155591);
        setField(term860396, term860396.getClass(), "playerName", "xxx");
        setIntField(term860396, term860396.getClass(), "vocaloidPoints", 300);
        setIntField(term860396, term860396.getClass(), "level", 1);
        setIntField(term860396, term860396.getClass(), "levelExp", -678946365);
        setField(term860396, term860396.getClass(), "levelTitle", "xxx");
        setIntField(term860396, term860396.getClass(), "plateId", -1);
        setIntField(term860396, term860396.getClass(), "plateEffectId", -1);
        setField(term860396, term860396.getClass(), "passwordStatus", enum1852);
        setField(term860396, term860396.getClass(), "password", "**********");
        setBooleanField(term860396, term860396.getClass(), "preferPerPvModule", true);
        setBooleanField(term860396, term860396.getClass(), "preferCommonModule", true);
        setBooleanField(term860396, term860396.getClass(), "usePerPvSkin", false);
        setBooleanField(term860396, term860396.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term860396, term860396.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term860396, term860396.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term860396, term860396.getClass(), "usePerPvTouchSliderSe", false);
        setField(term860396, term860396.getClass(), "commonModule", "-999,-999,-999");
        setField(term860396, term860396.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term860520, term860520.getClass(), "year", 2026);
        setShortField(term860520, term860520.getClass(), "month", (short) 6);
        setShortField(term860520, term860520.getClass(), "day", (short) 29);
        setField(term860519, term860519.getClass(), "date", term860520);
        setByteField(term860524, term860524.getClass(), "hour", (byte) 4);
        setByteField(term860524, term860524.getClass(), "minute", (byte) 29);
        setByteField(term860524, term860524.getClass(), "second", (byte) 28);
        setIntField(term860524, term860524.getClass(), "nano", 19433000);
        setField(term860519, term860519.getClass(), "time", term860524);
        setField(term860396, term860396.getClass(), "commonModuleSetTime", term860519);
        setField(term860396, term860396.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term860396, term860396.getClass(), "commonSkin", -1);
        setIntField(term860396, term860396.getClass(), "headphoneVolume", 100);
        setBooleanField(term860396, term860396.getClass(), "buttonSeOn", true);
        setIntField(term860396, term860396.getClass(), "buttonSeVolume", 100);
        setIntField(term860396, term860396.getClass(), "sliderSeVolume", 100);
        setIntField(term860396, term860396.getClass(), "buttonSe", -1);
        setIntField(term860396, term860396.getClass(), "chainSlideSe", -1);
        setIntField(term860396, term860396.getClass(), "slideSe", -1);
        setIntField(term860396, term860396.getClass(), "sliderTouchSe", -1);
        setField(term860396, term860396.getClass(), "sortMode", enum1853);
        setIntField(term860396, term860396.getClass(), "nextPvId", -1);
        setField(term860396, term860396.getClass(), "nextDifficulty", enum1854);
        setField(term860396, term860396.getClass(), "nextEdition", enum1855);
        setBooleanField(term860396, term860396.getClass(), "showInterimRanking", true);
        setBooleanField(term860396, term860396.getClass(), "showClearStatus", true);
        setBooleanField(term860396, term860396.getClass(), "showGreatBorder", true);
        setBooleanField(term860396, term860396.getClass(), "showExcellentBorder", true);
        setBooleanField(term860396, term860396.getClass(), "showRivalBorder", true);
        setBooleanField(term860396, term860396.getClass(), "showRgoSetting", true);
        setBooleanField(term860396, term860396.getClass(), "contestNowPlayingEnable", true);
        setIntField(term860396, term860396.getClass(), "contestNowPlayingId", -1);
        setIntField(term860396, term860396.getClass(), "contestNowPlayingValue", -1);
        setField(term860396, term860396.getClass(), "contestNowPlayingResultRank", enum1856);
        setField(term860396, term860396.getClass(), "contestNowPlayingSpecifier", "");
        setField(term860396, term860396.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term860396, term860396.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term860396, term860396.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term860396, term860396.getClass(), "rivalPdId", -1);
        term861001 = new Integer(2121147631);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term861001;
        callMethod(klass, "setCommonSkin", argTypes, term860396, args);
    }

};


