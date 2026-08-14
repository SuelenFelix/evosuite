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

public class PlayerPvRecord_toString_193008316127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term646406;

    public PlayerPvRecord_toString_193008316127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term647064 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term647063 = ((Class) term647064).getDeclaredField((String) "MISS");
        ((Field) term647063).setAccessible(true);
        Object enum1417 = ((Field) term647063).get((Object) null);
        Class<? extends Object> term647441 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term647440 = ((Class) term647441).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term647440).setAccessible(true);
        Object enum1418 = ((Field) term647440).get((Object) null);
        Class<? extends Object> term647724 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term647723 = ((Class) term647724).getDeclaredField((String) "NORMAL");
        ((Field) term647723).setAccessible(true);
        Object enum1419 = ((Field) term647723).get((Object) null);
        Class<? extends Object> term647999 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term647998 = ((Class) term647999).getDeclaredField((String) "ORIGINAL");
        ((Field) term647998).setAccessible(true);
        Object enum1420 = ((Field) term647998).get((Object) null);
        Class<? extends Object> term648265 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term648264 = ((Class) term648265).getDeclaredField((String) "NONE");
        ((Field) term648264).setAccessible(true);
        Object enum1421 = ((Field) term648264).get((Object) null);
        Class<? extends Object> term648906 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term648905 = ((Class) term648906).getDeclaredField((String) "NO_CLEAR");
        ((Field) term648905).setAccessible(true);
        Object enum1422 = ((Field) term648905).get((Object) null);
        Class<? extends Object> term649192 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term649191 = ((Class) term649192).getDeclaredField((String) "UNDEFINED");
        ((Field) term649191).setAccessible(true);
        Object enum1423 = ((Field) term649191).get((Object) null);
        term646406 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvRecord"));
        Object term646408 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term646531 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term646532 = newInstance(Class.forName("java.time.LocalDate"));
        Object term646536 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term646406, term646406.getClass(), "id", -6771377873268167033L);
        setLongField(term646408, term646408.getClass(), "id", 1278107327214302894L);
        setIntField(term646408, term646408.getClass(), "pdId", 456313553);
        setField(term646408, term646408.getClass(), "playerName", "xxx");
        setIntField(term646408, term646408.getClass(), "vocaloidPoints", 300);
        setIntField(term646408, term646408.getClass(), "level", 1);
        setIntField(term646408, term646408.getClass(), "levelExp", 1636460194);
        setField(term646408, term646408.getClass(), "levelTitle", "xxx");
        setIntField(term646408, term646408.getClass(), "plateId", -1);
        setIntField(term646408, term646408.getClass(), "plateEffectId", -1);
        setField(term646408, term646408.getClass(), "passwordStatus", enum1417);
        setField(term646408, term646408.getClass(), "password", "**********");
        setBooleanField(term646408, term646408.getClass(), "preferPerPvModule", true);
        setBooleanField(term646408, term646408.getClass(), "preferCommonModule", true);
        setBooleanField(term646408, term646408.getClass(), "usePerPvSkin", true);
        setBooleanField(term646408, term646408.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term646408, term646408.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term646408, term646408.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term646408, term646408.getClass(), "usePerPvTouchSliderSe", true);
        setField(term646408, term646408.getClass(), "commonModule", "-999,-999,-999");
        setField(term646408, term646408.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term646532, term646532.getClass(), "year", 2026);
        setShortField(term646532, term646532.getClass(), "month", (short) 8);
        setShortField(term646532, term646532.getClass(), "day", (short) 12);
        setField(term646531, term646531.getClass(), "date", term646532);
        setByteField(term646536, term646536.getClass(), "hour", (byte) 2);
        setByteField(term646536, term646536.getClass(), "minute", (byte) 4);
        setByteField(term646536, term646536.getClass(), "second", (byte) 8);
        setIntField(term646536, term646536.getClass(), "nano", 187770000);
        setField(term646531, term646531.getClass(), "time", term646536);
        setField(term646408, term646408.getClass(), "commonModuleSetTime", term646531);
        setField(term646408, term646408.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term646408, term646408.getClass(), "commonSkin", -1);
        setIntField(term646408, term646408.getClass(), "headphoneVolume", 100);
        setBooleanField(term646408, term646408.getClass(), "buttonSeOn", true);
        setIntField(term646408, term646408.getClass(), "buttonSeVolume", 100);
        setIntField(term646408, term646408.getClass(), "sliderSeVolume", 100);
        setIntField(term646408, term646408.getClass(), "buttonSe", -1);
        setIntField(term646408, term646408.getClass(), "chainSlideSe", -1);
        setIntField(term646408, term646408.getClass(), "slideSe", -1);
        setIntField(term646408, term646408.getClass(), "sliderTouchSe", -1);
        setField(term646408, term646408.getClass(), "sortMode", enum1418);
        setIntField(term646408, term646408.getClass(), "nextPvId", -1);
        setField(term646408, term646408.getClass(), "nextDifficulty", enum1419);
        setField(term646408, term646408.getClass(), "nextEdition", enum1420);
        setBooleanField(term646408, term646408.getClass(), "showInterimRanking", true);
        setBooleanField(term646408, term646408.getClass(), "showClearStatus", true);
        setBooleanField(term646408, term646408.getClass(), "showGreatBorder", true);
        setBooleanField(term646408, term646408.getClass(), "showExcellentBorder", true);
        setBooleanField(term646408, term646408.getClass(), "showRivalBorder", true);
        setBooleanField(term646408, term646408.getClass(), "showRgoSetting", true);
        setBooleanField(term646408, term646408.getClass(), "contestNowPlayingEnable", true);
        setIntField(term646408, term646408.getClass(), "contestNowPlayingId", -1);
        setIntField(term646408, term646408.getClass(), "contestNowPlayingValue", -1);
        setField(term646408, term646408.getClass(), "contestNowPlayingResultRank", enum1421);
        setField(term646408, term646408.getClass(), "contestNowPlayingSpecifier", "");
        setField(term646408, term646408.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term646408, term646408.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term646408, term646408.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term646408, term646408.getClass(), "rivalPdId", -1);
        setField(term646406, term646406.getClass(), "pdId", term646408);
        setIntField(term646406, term646406.getClass(), "pvId", -1);
        setField(term646406, term646406.getClass(), "edition", enum1420);
        setField(term646406, term646406.getClass(), "difficulty", enum1419);
        setField(term646406, term646406.getClass(), "result", enum1422);
        setIntField(term646406, term646406.getClass(), "maxScore", -1);
        setIntField(term646406, term646406.getClass(), "maxAttain", -1);
        setField(term646406, term646406.getClass(), "challengeKind", enum1423);
        setField(term646406, term646406.getClass(), "rgoPurchased", "0,0,0");
        setField(term646406, term646406.getClass(), "rgoPlayed", "0,0,0");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvRecord");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term646406, args);
    }

};


