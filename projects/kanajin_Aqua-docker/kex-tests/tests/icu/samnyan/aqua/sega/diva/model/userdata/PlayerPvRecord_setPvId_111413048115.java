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
import java.lang.Integer;

public class PlayerPvRecord_setPvId_111413048115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term608637;
     Object term609288;

    public PlayerPvRecord_setPvId_111413048115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term609297 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term609296 = ((Class) term609297).getDeclaredField((String) "MISS");
        ((Field) term609296).setAccessible(true);
        Object enum1331 = ((Field) term609296).get((Object) null);
        Class<? extends Object> term609674 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term609673 = ((Class) term609674).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term609673).setAccessible(true);
        Object enum1332 = ((Field) term609673).get((Object) null);
        Class<? extends Object> term609957 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term609956 = ((Class) term609957).getDeclaredField((String) "NORMAL");
        ((Field) term609956).setAccessible(true);
        Object enum1333 = ((Field) term609956).get((Object) null);
        Class<? extends Object> term610232 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term610231 = ((Class) term610232).getDeclaredField((String) "ORIGINAL");
        ((Field) term610231).setAccessible(true);
        Object enum1334 = ((Field) term610231).get((Object) null);
        Class<? extends Object> term610498 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term610497 = ((Class) term610498).getDeclaredField((String) "NONE");
        ((Field) term610497).setAccessible(true);
        Object enum1335 = ((Field) term610497).get((Object) null);
        Class<? extends Object> term611139 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term611138 = ((Class) term611139).getDeclaredField((String) "NO_CLEAR");
        ((Field) term611138).setAccessible(true);
        Object enum1336 = ((Field) term611138).get((Object) null);
        Class<? extends Object> term611425 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term611424 = ((Class) term611425).getDeclaredField((String) "UNDEFINED");
        ((Field) term611424).setAccessible(true);
        Object enum1337 = ((Field) term611424).get((Object) null);
        term608637 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvRecord"));
        Object term608639 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term608762 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term608763 = newInstance(Class.forName("java.time.LocalDate"));
        Object term608767 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term608637, term608637.getClass(), "id", -7400951017937830861L);
        setLongField(term608639, term608639.getClass(), "id", -8993073054427011802L);
        setIntField(term608639, term608639.getClass(), "pdId", -2080503799);
        setField(term608639, term608639.getClass(), "playerName", "xxx");
        setIntField(term608639, term608639.getClass(), "vocaloidPoints", 300);
        setIntField(term608639, term608639.getClass(), "level", 1);
        setIntField(term608639, term608639.getClass(), "levelExp", 13757525);
        setField(term608639, term608639.getClass(), "levelTitle", "xxx");
        setIntField(term608639, term608639.getClass(), "plateId", -1);
        setIntField(term608639, term608639.getClass(), "plateEffectId", -1);
        setField(term608639, term608639.getClass(), "passwordStatus", enum1331);
        setField(term608639, term608639.getClass(), "password", "**********");
        setBooleanField(term608639, term608639.getClass(), "preferPerPvModule", true);
        setBooleanField(term608639, term608639.getClass(), "preferCommonModule", false);
        setBooleanField(term608639, term608639.getClass(), "usePerPvSkin", false);
        setBooleanField(term608639, term608639.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term608639, term608639.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term608639, term608639.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term608639, term608639.getClass(), "usePerPvTouchSliderSe", false);
        setField(term608639, term608639.getClass(), "commonModule", "-999,-999,-999");
        setField(term608639, term608639.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term608763, term608763.getClass(), "year", 2026);
        setShortField(term608763, term608763.getClass(), "month", (short) 8);
        setShortField(term608763, term608763.getClass(), "day", (short) 12);
        setField(term608762, term608762.getClass(), "date", term608763);
        setByteField(term608767, term608767.getClass(), "hour", (byte) 2);
        setByteField(term608767, term608767.getClass(), "minute", (byte) 4);
        setByteField(term608767, term608767.getClass(), "second", (byte) 5);
        setIntField(term608767, term608767.getClass(), "nano", 190681000);
        setField(term608762, term608762.getClass(), "time", term608767);
        setField(term608639, term608639.getClass(), "commonModuleSetTime", term608762);
        setField(term608639, term608639.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term608639, term608639.getClass(), "commonSkin", -1);
        setIntField(term608639, term608639.getClass(), "headphoneVolume", 100);
        setBooleanField(term608639, term608639.getClass(), "buttonSeOn", true);
        setIntField(term608639, term608639.getClass(), "buttonSeVolume", 100);
        setIntField(term608639, term608639.getClass(), "sliderSeVolume", 100);
        setIntField(term608639, term608639.getClass(), "buttonSe", -1);
        setIntField(term608639, term608639.getClass(), "chainSlideSe", -1);
        setIntField(term608639, term608639.getClass(), "slideSe", -1);
        setIntField(term608639, term608639.getClass(), "sliderTouchSe", -1);
        setField(term608639, term608639.getClass(), "sortMode", enum1332);
        setIntField(term608639, term608639.getClass(), "nextPvId", -1);
        setField(term608639, term608639.getClass(), "nextDifficulty", enum1333);
        setField(term608639, term608639.getClass(), "nextEdition", enum1334);
        setBooleanField(term608639, term608639.getClass(), "showInterimRanking", true);
        setBooleanField(term608639, term608639.getClass(), "showClearStatus", true);
        setBooleanField(term608639, term608639.getClass(), "showGreatBorder", true);
        setBooleanField(term608639, term608639.getClass(), "showExcellentBorder", true);
        setBooleanField(term608639, term608639.getClass(), "showRivalBorder", true);
        setBooleanField(term608639, term608639.getClass(), "showRgoSetting", true);
        setBooleanField(term608639, term608639.getClass(), "contestNowPlayingEnable", true);
        setIntField(term608639, term608639.getClass(), "contestNowPlayingId", -1);
        setIntField(term608639, term608639.getClass(), "contestNowPlayingValue", -1);
        setField(term608639, term608639.getClass(), "contestNowPlayingResultRank", enum1335);
        setField(term608639, term608639.getClass(), "contestNowPlayingSpecifier", "");
        setField(term608639, term608639.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term608639, term608639.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term608639, term608639.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term608639, term608639.getClass(), "rivalPdId", -1);
        setField(term608637, term608637.getClass(), "pdId", term608639);
        setIntField(term608637, term608637.getClass(), "pvId", -1);
        setField(term608637, term608637.getClass(), "edition", enum1334);
        setField(term608637, term608637.getClass(), "difficulty", enum1333);
        setField(term608637, term608637.getClass(), "result", enum1336);
        setIntField(term608637, term608637.getClass(), "maxScore", -1);
        setIntField(term608637, term608637.getClass(), "maxAttain", -1);
        setField(term608637, term608637.getClass(), "challengeKind", enum1337);
        setField(term608637, term608637.getClass(), "rgoPurchased", "0,0,0");
        setField(term608637, term608637.getClass(), "rgoPlayed", "0,0,0");
        term609288 = new Integer(77853966);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term609288;
        callMethod(klass, "setPvId", argTypes, term608637, args);
    }

};


