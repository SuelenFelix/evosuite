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

public class PlayerPvCustomize_init_165738378427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1018666;
     Object term1018668;
     Object term1019273;
     Object term1019311;
     Object term1019313;
     Object term1019315;
     Object term1019317;
     Object term1019319;

    public PlayerPvCustomize_init_165738378427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1018666 = new Long(-1486519351300660432L);
        Class<? extends Object> term1019328 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term1019327 = ((Class) term1019328).getDeclaredField((String) "MISS");
        ((Field) term1019327).setAccessible(true);
        Object enum2155 = ((Field) term1019327).get((Object) null);
        Class<? extends Object> term1019705 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term1019704 = ((Class) term1019705).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term1019704).setAccessible(true);
        Object enum2156 = ((Field) term1019704).get((Object) null);
        Class<? extends Object> term1019988 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term1019987 = ((Class) term1019988).getDeclaredField((String) "NORMAL");
        ((Field) term1019987).setAccessible(true);
        Object enum2157 = ((Field) term1019987).get((Object) null);
        Class<? extends Object> term1020263 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term1020262 = ((Class) term1020263).getDeclaredField((String) "ORIGINAL");
        ((Field) term1020262).setAccessible(true);
        Object enum2158 = ((Field) term1020262).get((Object) null);
        Class<? extends Object> term1020529 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term1020528 = ((Class) term1020529).getDeclaredField((String) "NONE");
        ((Field) term1020528).setAccessible(true);
        Object enum2159 = ((Field) term1020528).get((Object) null);
        term1018668 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term1018791 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1018792 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1018796 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term1018668, term1018668.getClass(), "id", 4777103307547199454L);
        setIntField(term1018668, term1018668.getClass(), "pdId", -1503153618);
        setField(term1018668, term1018668.getClass(), "playerName", "xxx");
        setIntField(term1018668, term1018668.getClass(), "vocaloidPoints", 300);
        setIntField(term1018668, term1018668.getClass(), "level", 1);
        setIntField(term1018668, term1018668.getClass(), "levelExp", -1417720854);
        setField(term1018668, term1018668.getClass(), "levelTitle", "xxx");
        setIntField(term1018668, term1018668.getClass(), "plateId", -1);
        setIntField(term1018668, term1018668.getClass(), "plateEffectId", -1);
        setField(term1018668, term1018668.getClass(), "passwordStatus", enum2155);
        setField(term1018668, term1018668.getClass(), "password", "**********");
        setBooleanField(term1018668, term1018668.getClass(), "preferPerPvModule", true);
        setBooleanField(term1018668, term1018668.getClass(), "preferCommonModule", true);
        setBooleanField(term1018668, term1018668.getClass(), "usePerPvSkin", true);
        setBooleanField(term1018668, term1018668.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term1018668, term1018668.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term1018668, term1018668.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term1018668, term1018668.getClass(), "usePerPvTouchSliderSe", false);
        setField(term1018668, term1018668.getClass(), "commonModule", "-999,-999,-999");
        setField(term1018668, term1018668.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term1018792, term1018792.getClass(), "year", 2026);
        setShortField(term1018792, term1018792.getClass(), "month", (short) 8);
        setShortField(term1018792, term1018792.getClass(), "day", (short) 12);
        setField(term1018791, term1018791.getClass(), "date", term1018792);
        setByteField(term1018796, term1018796.getClass(), "hour", (byte) 2);
        setByteField(term1018796, term1018796.getClass(), "minute", (byte) 5);
        setByteField(term1018796, term1018796.getClass(), "second", (byte) 23);
        setIntField(term1018796, term1018796.getClass(), "nano", 134397000);
        setField(term1018791, term1018791.getClass(), "time", term1018796);
        setField(term1018668, term1018668.getClass(), "commonModuleSetTime", term1018791);
        setField(term1018668, term1018668.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term1018668, term1018668.getClass(), "commonSkin", -1);
        setIntField(term1018668, term1018668.getClass(), "headphoneVolume", 100);
        setBooleanField(term1018668, term1018668.getClass(), "buttonSeOn", true);
        setIntField(term1018668, term1018668.getClass(), "buttonSeVolume", 100);
        setIntField(term1018668, term1018668.getClass(), "sliderSeVolume", 100);
        setIntField(term1018668, term1018668.getClass(), "buttonSe", -1);
        setIntField(term1018668, term1018668.getClass(), "chainSlideSe", -1);
        setIntField(term1018668, term1018668.getClass(), "slideSe", -1);
        setIntField(term1018668, term1018668.getClass(), "sliderTouchSe", -1);
        setField(term1018668, term1018668.getClass(), "sortMode", enum2156);
        setIntField(term1018668, term1018668.getClass(), "nextPvId", -1);
        setField(term1018668, term1018668.getClass(), "nextDifficulty", enum2157);
        setField(term1018668, term1018668.getClass(), "nextEdition", enum2158);
        setBooleanField(term1018668, term1018668.getClass(), "showInterimRanking", true);
        setBooleanField(term1018668, term1018668.getClass(), "showClearStatus", true);
        setBooleanField(term1018668, term1018668.getClass(), "showGreatBorder", true);
        setBooleanField(term1018668, term1018668.getClass(), "showExcellentBorder", true);
        setBooleanField(term1018668, term1018668.getClass(), "showRivalBorder", true);
        setBooleanField(term1018668, term1018668.getClass(), "showRgoSetting", true);
        setBooleanField(term1018668, term1018668.getClass(), "contestNowPlayingEnable", false);
        setIntField(term1018668, term1018668.getClass(), "contestNowPlayingId", -1);
        setIntField(term1018668, term1018668.getClass(), "contestNowPlayingValue", -1);
        setField(term1018668, term1018668.getClass(), "contestNowPlayingResultRank", enum2159);
        setField(term1018668, term1018668.getClass(), "contestNowPlayingSpecifier", "");
        setField(term1018668, term1018668.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term1018668, term1018668.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term1018668, term1018668.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term1018668, term1018668.getClass(), "rivalPdId", -1);
        term1019273 = new Integer(-231019352);
        term1019311 = new Integer(-677712787);
        term1019313 = new Integer(-473854701);
        term1019315 = new Integer(-193355905);
        term1019317 = new Integer(-104223978);
        term1019319 = new Integer(192932780);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvCustomize");
        Class<?>[] argTypes = new Class<?>[11];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = Class.forName("java.lang.String");
        argTypes[6] = int.class;
        argTypes[7] = int.class;
        argTypes[8] = int.class;
        argTypes[9] = int.class;
        argTypes[10] = int.class;
        Object[] args = new Object[11];
        args[0] = term1018666;
        args[1] = term1018668;
        args[2] = term1019273;
        args[3] = "RSaoipUlsg";
        args[4] = "cSHGbqKqlN";
        args[5] = "pFAfANnxup";
        args[6] = term1019311;
        args[7] = term1019313;
        args[8] = term1019315;
        args[9] = term1019317;
        args[10] = term1019319;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


