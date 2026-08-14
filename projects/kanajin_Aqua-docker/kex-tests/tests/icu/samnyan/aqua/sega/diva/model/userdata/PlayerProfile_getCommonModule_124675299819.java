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

public class PlayerProfile_getCommonModule_124675299819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term727764;

    public PlayerProfile_getCommonModule_124675299819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term728376 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term728375 = ((Class) term728376).getDeclaredField((String) "MISS");
        ((Field) term728375).setAccessible(true);
        Object enum1582 = ((Field) term728375).get((Object) null);
        Class<? extends Object> term728753 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term728752 = ((Class) term728753).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term728752).setAccessible(true);
        Object enum1583 = ((Field) term728752).get((Object) null);
        Class<? extends Object> term729036 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term729035 = ((Class) term729036).getDeclaredField((String) "NORMAL");
        ((Field) term729035).setAccessible(true);
        Object enum1584 = ((Field) term729035).get((Object) null);
        Class<? extends Object> term729311 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term729310 = ((Class) term729311).getDeclaredField((String) "ORIGINAL");
        ((Field) term729310).setAccessible(true);
        Object enum1585 = ((Field) term729310).get((Object) null);
        Class<? extends Object> term729577 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term729576 = ((Class) term729577).getDeclaredField((String) "NONE");
        ((Field) term729576).setAccessible(true);
        Object enum1586 = ((Field) term729576).get((Object) null);
        term727764 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term727887 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term727888 = newInstance(Class.forName("java.time.LocalDate"));
        Object term727892 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term727764, term727764.getClass(), "id", 1867943942587005261L);
        setIntField(term727764, term727764.getClass(), "pdId", -1924743705);
        setField(term727764, term727764.getClass(), "playerName", "xxx");
        setIntField(term727764, term727764.getClass(), "vocaloidPoints", 300);
        setIntField(term727764, term727764.getClass(), "level", 1);
        setIntField(term727764, term727764.getClass(), "levelExp", -1829672767);
        setField(term727764, term727764.getClass(), "levelTitle", "xxx");
        setIntField(term727764, term727764.getClass(), "plateId", -1);
        setIntField(term727764, term727764.getClass(), "plateEffectId", -1);
        setField(term727764, term727764.getClass(), "passwordStatus", enum1582);
        setField(term727764, term727764.getClass(), "password", "**********");
        setBooleanField(term727764, term727764.getClass(), "preferPerPvModule", true);
        setBooleanField(term727764, term727764.getClass(), "preferCommonModule", false);
        setBooleanField(term727764, term727764.getClass(), "usePerPvSkin", false);
        setBooleanField(term727764, term727764.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term727764, term727764.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term727764, term727764.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term727764, term727764.getClass(), "usePerPvTouchSliderSe", true);
        setField(term727764, term727764.getClass(), "commonModule", "-999,-999,-999");
        setField(term727764, term727764.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term727888, term727888.getClass(), "year", 2026);
        setShortField(term727888, term727888.getClass(), "month", (short) 8);
        setShortField(term727888, term727888.getClass(), "day", (short) 12);
        setField(term727887, term727887.getClass(), "date", term727888);
        setByteField(term727892, term727892.getClass(), "hour", (byte) 2);
        setByteField(term727892, term727892.getClass(), "minute", (byte) 4);
        setByteField(term727892, term727892.getClass(), "second", (byte) 27);
        setIntField(term727892, term727892.getClass(), "nano", 367035000);
        setField(term727887, term727887.getClass(), "time", term727892);
        setField(term727764, term727764.getClass(), "commonModuleSetTime", term727887);
        setField(term727764, term727764.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term727764, term727764.getClass(), "commonSkin", -1);
        setIntField(term727764, term727764.getClass(), "headphoneVolume", 100);
        setBooleanField(term727764, term727764.getClass(), "buttonSeOn", true);
        setIntField(term727764, term727764.getClass(), "buttonSeVolume", 100);
        setIntField(term727764, term727764.getClass(), "sliderSeVolume", 100);
        setIntField(term727764, term727764.getClass(), "buttonSe", -1);
        setIntField(term727764, term727764.getClass(), "chainSlideSe", -1);
        setIntField(term727764, term727764.getClass(), "slideSe", -1);
        setIntField(term727764, term727764.getClass(), "sliderTouchSe", -1);
        setField(term727764, term727764.getClass(), "sortMode", enum1583);
        setIntField(term727764, term727764.getClass(), "nextPvId", -1);
        setField(term727764, term727764.getClass(), "nextDifficulty", enum1584);
        setField(term727764, term727764.getClass(), "nextEdition", enum1585);
        setBooleanField(term727764, term727764.getClass(), "showInterimRanking", true);
        setBooleanField(term727764, term727764.getClass(), "showClearStatus", true);
        setBooleanField(term727764, term727764.getClass(), "showGreatBorder", true);
        setBooleanField(term727764, term727764.getClass(), "showExcellentBorder", true);
        setBooleanField(term727764, term727764.getClass(), "showRivalBorder", true);
        setBooleanField(term727764, term727764.getClass(), "showRgoSetting", true);
        setBooleanField(term727764, term727764.getClass(), "contestNowPlayingEnable", false);
        setIntField(term727764, term727764.getClass(), "contestNowPlayingId", -1);
        setIntField(term727764, term727764.getClass(), "contestNowPlayingValue", -1);
        setField(term727764, term727764.getClass(), "contestNowPlayingResultRank", enum1586);
        setField(term727764, term727764.getClass(), "contestNowPlayingSpecifier", "");
        setField(term727764, term727764.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term727764, term727764.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term727764, term727764.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term727764, term727764.getClass(), "rivalPdId", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCommonModule", argTypes, term727764, args);
    }

};


