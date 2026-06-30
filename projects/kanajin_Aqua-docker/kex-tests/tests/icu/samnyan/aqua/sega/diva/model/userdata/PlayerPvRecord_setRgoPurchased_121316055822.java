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

public class PlayerPvRecord_setRgoPurchased_121316055822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term630890;

    public PlayerPvRecord_setRgoPurchased_121316055822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term631560 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term631559 = ((Class) term631560).getDeclaredField((String) "MISS");
        ((Field) term631559).setAccessible(true);
        Object enum1382 = ((Field) term631559).get((Object) null);
        Class<? extends Object> term631937 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term631936 = ((Class) term631937).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term631936).setAccessible(true);
        Object enum1383 = ((Field) term631936).get((Object) null);
        Class<? extends Object> term632220 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term632219 = ((Class) term632220).getDeclaredField((String) "NORMAL");
        ((Field) term632219).setAccessible(true);
        Object enum1384 = ((Field) term632219).get((Object) null);
        Class<? extends Object> term632495 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term632494 = ((Class) term632495).getDeclaredField((String) "ORIGINAL");
        ((Field) term632494).setAccessible(true);
        Object enum1385 = ((Field) term632494).get((Object) null);
        Class<? extends Object> term632761 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term632760 = ((Class) term632761).getDeclaredField((String) "NONE");
        ((Field) term632760).setAccessible(true);
        Object enum1386 = ((Field) term632760).get((Object) null);
        Class<? extends Object> term633402 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term633401 = ((Class) term633402).getDeclaredField((String) "NO_CLEAR");
        ((Field) term633401).setAccessible(true);
        Object enum1387 = ((Field) term633401).get((Object) null);
        Class<? extends Object> term633688 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term633687 = ((Class) term633688).getDeclaredField((String) "UNDEFINED");
        ((Field) term633687).setAccessible(true);
        Object enum1388 = ((Field) term633687).get((Object) null);
        term630890 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvRecord"));
        Object term630892 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term631015 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term631016 = newInstance(Class.forName("java.time.LocalDate"));
        Object term631020 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term630890, term630890.getClass(), "id", -769824408235898287L);
        setLongField(term630892, term630892.getClass(), "id", -2828343143039517941L);
        setIntField(term630892, term630892.getClass(), "pdId", -335577660);
        setField(term630892, term630892.getClass(), "playerName", "xxx");
        setIntField(term630892, term630892.getClass(), "vocaloidPoints", 300);
        setIntField(term630892, term630892.getClass(), "level", 1);
        setIntField(term630892, term630892.getClass(), "levelExp", 1488144730);
        setField(term630892, term630892.getClass(), "levelTitle", "xxx");
        setIntField(term630892, term630892.getClass(), "plateId", -1);
        setIntField(term630892, term630892.getClass(), "plateEffectId", -1);
        setField(term630892, term630892.getClass(), "passwordStatus", enum1382);
        setField(term630892, term630892.getClass(), "password", "**********");
        setBooleanField(term630892, term630892.getClass(), "preferPerPvModule", true);
        setBooleanField(term630892, term630892.getClass(), "preferCommonModule", false);
        setBooleanField(term630892, term630892.getClass(), "usePerPvSkin", false);
        setBooleanField(term630892, term630892.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term630892, term630892.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term630892, term630892.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term630892, term630892.getClass(), "usePerPvTouchSliderSe", true);
        setField(term630892, term630892.getClass(), "commonModule", "-999,-999,-999");
        setField(term630892, term630892.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term631016, term631016.getClass(), "year", 2026);
        setShortField(term631016, term631016.getClass(), "month", (short) 6);
        setShortField(term631016, term631016.getClass(), "day", (short) 29);
        setField(term631015, term631015.getClass(), "date", term631016);
        setByteField(term631020, term631020.getClass(), "hour", (byte) 4);
        setByteField(term631020, term631020.getClass(), "minute", (byte) 28);
        setByteField(term631020, term631020.getClass(), "second", (byte) 53);
        setIntField(term631020, term631020.getClass(), "nano", 93084000);
        setField(term631015, term631015.getClass(), "time", term631020);
        setField(term630892, term630892.getClass(), "commonModuleSetTime", term631015);
        setField(term630892, term630892.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term630892, term630892.getClass(), "commonSkin", -1);
        setIntField(term630892, term630892.getClass(), "headphoneVolume", 100);
        setBooleanField(term630892, term630892.getClass(), "buttonSeOn", true);
        setIntField(term630892, term630892.getClass(), "buttonSeVolume", 100);
        setIntField(term630892, term630892.getClass(), "sliderSeVolume", 100);
        setIntField(term630892, term630892.getClass(), "buttonSe", -1);
        setIntField(term630892, term630892.getClass(), "chainSlideSe", -1);
        setIntField(term630892, term630892.getClass(), "slideSe", -1);
        setIntField(term630892, term630892.getClass(), "sliderTouchSe", -1);
        setField(term630892, term630892.getClass(), "sortMode", enum1383);
        setIntField(term630892, term630892.getClass(), "nextPvId", -1);
        setField(term630892, term630892.getClass(), "nextDifficulty", enum1384);
        setField(term630892, term630892.getClass(), "nextEdition", enum1385);
        setBooleanField(term630892, term630892.getClass(), "showInterimRanking", true);
        setBooleanField(term630892, term630892.getClass(), "showClearStatus", true);
        setBooleanField(term630892, term630892.getClass(), "showGreatBorder", true);
        setBooleanField(term630892, term630892.getClass(), "showExcellentBorder", true);
        setBooleanField(term630892, term630892.getClass(), "showRivalBorder", true);
        setBooleanField(term630892, term630892.getClass(), "showRgoSetting", true);
        setBooleanField(term630892, term630892.getClass(), "contestNowPlayingEnable", false);
        setIntField(term630892, term630892.getClass(), "contestNowPlayingId", -1);
        setIntField(term630892, term630892.getClass(), "contestNowPlayingValue", -1);
        setField(term630892, term630892.getClass(), "contestNowPlayingResultRank", enum1386);
        setField(term630892, term630892.getClass(), "contestNowPlayingSpecifier", "");
        setField(term630892, term630892.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term630892, term630892.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term630892, term630892.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term630892, term630892.getClass(), "rivalPdId", -1);
        setField(term630890, term630890.getClass(), "pdId", term630892);
        setIntField(term630890, term630890.getClass(), "pvId", -1);
        setField(term630890, term630890.getClass(), "edition", enum1385);
        setField(term630890, term630890.getClass(), "difficulty", enum1384);
        setField(term630890, term630890.getClass(), "result", enum1387);
        setIntField(term630890, term630890.getClass(), "maxScore", -1);
        setIntField(term630890, term630890.getClass(), "maxAttain", -1);
        setField(term630890, term630890.getClass(), "challengeKind", enum1388);
        setField(term630890, term630890.getClass(), "rgoPurchased", "0,0,0");
        setField(term630890, term630890.getClass(), "rgoPlayed", "0,0,0");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "fzeqPnzpnt";
        callMethod(klass, "setRgoPurchased", argTypes, term630890, args);
    }

};


