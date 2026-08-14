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

public class PlayerCustomize_init_137195726711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term481469;
     Object term481471;
     Object term482076;

    public PlayerCustomize_init_137195726711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term481469 = new Long(-5344598381371854750L);
        Class<? extends Object> term482085 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term482084 = ((Class) term482085).getDeclaredField((String) "MISS");
        ((Field) term482084).setAccessible(true);
        Object enum1072 = ((Field) term482084).get((Object) null);
        Class<? extends Object> term482462 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term482461 = ((Class) term482462).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term482461).setAccessible(true);
        Object enum1073 = ((Field) term482461).get((Object) null);
        Class<? extends Object> term482745 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term482744 = ((Class) term482745).getDeclaredField((String) "NORMAL");
        ((Field) term482744).setAccessible(true);
        Object enum1074 = ((Field) term482744).get((Object) null);
        Class<? extends Object> term483020 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term483019 = ((Class) term483020).getDeclaredField((String) "ORIGINAL");
        ((Field) term483019).setAccessible(true);
        Object enum1075 = ((Field) term483019).get((Object) null);
        Class<? extends Object> term483286 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term483285 = ((Class) term483286).getDeclaredField((String) "NONE");
        ((Field) term483285).setAccessible(true);
        Object enum1076 = ((Field) term483285).get((Object) null);
        term481471 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term481594 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term481595 = newInstance(Class.forName("java.time.LocalDate"));
        Object term481599 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term481471, term481471.getClass(), "id", -3718250311794019732L);
        setIntField(term481471, term481471.getClass(), "pdId", -2114135536);
        setField(term481471, term481471.getClass(), "playerName", "xxx");
        setIntField(term481471, term481471.getClass(), "vocaloidPoints", 300);
        setIntField(term481471, term481471.getClass(), "level", 1);
        setIntField(term481471, term481471.getClass(), "levelExp", -1934156754);
        setField(term481471, term481471.getClass(), "levelTitle", "xxx");
        setIntField(term481471, term481471.getClass(), "plateId", -1);
        setIntField(term481471, term481471.getClass(), "plateEffectId", -1);
        setField(term481471, term481471.getClass(), "passwordStatus", enum1072);
        setField(term481471, term481471.getClass(), "password", "**********");
        setBooleanField(term481471, term481471.getClass(), "preferPerPvModule", true);
        setBooleanField(term481471, term481471.getClass(), "preferCommonModule", true);
        setBooleanField(term481471, term481471.getClass(), "usePerPvSkin", false);
        setBooleanField(term481471, term481471.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term481471, term481471.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term481471, term481471.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term481471, term481471.getClass(), "usePerPvTouchSliderSe", false);
        setField(term481471, term481471.getClass(), "commonModule", "-999,-999,-999");
        setField(term481471, term481471.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term481595, term481595.getClass(), "year", 2026);
        setShortField(term481595, term481595.getClass(), "month", (short) 8);
        setShortField(term481595, term481595.getClass(), "day", (short) 12);
        setField(term481594, term481594.getClass(), "date", term481595);
        setByteField(term481599, term481599.getClass(), "hour", (byte) 2);
        setByteField(term481599, term481599.getClass(), "minute", (byte) 3);
        setByteField(term481599, term481599.getClass(), "second", (byte) 41);
        setIntField(term481599, term481599.getClass(), "nano", 624596000);
        setField(term481594, term481594.getClass(), "time", term481599);
        setField(term481471, term481471.getClass(), "commonModuleSetTime", term481594);
        setField(term481471, term481471.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term481471, term481471.getClass(), "commonSkin", -1);
        setIntField(term481471, term481471.getClass(), "headphoneVolume", 100);
        setBooleanField(term481471, term481471.getClass(), "buttonSeOn", true);
        setIntField(term481471, term481471.getClass(), "buttonSeVolume", 100);
        setIntField(term481471, term481471.getClass(), "sliderSeVolume", 100);
        setIntField(term481471, term481471.getClass(), "buttonSe", -1);
        setIntField(term481471, term481471.getClass(), "chainSlideSe", -1);
        setIntField(term481471, term481471.getClass(), "slideSe", -1);
        setIntField(term481471, term481471.getClass(), "sliderTouchSe", -1);
        setField(term481471, term481471.getClass(), "sortMode", enum1073);
        setIntField(term481471, term481471.getClass(), "nextPvId", -1);
        setField(term481471, term481471.getClass(), "nextDifficulty", enum1074);
        setField(term481471, term481471.getClass(), "nextEdition", enum1075);
        setBooleanField(term481471, term481471.getClass(), "showInterimRanking", true);
        setBooleanField(term481471, term481471.getClass(), "showClearStatus", true);
        setBooleanField(term481471, term481471.getClass(), "showGreatBorder", true);
        setBooleanField(term481471, term481471.getClass(), "showExcellentBorder", true);
        setBooleanField(term481471, term481471.getClass(), "showRivalBorder", true);
        setBooleanField(term481471, term481471.getClass(), "showRgoSetting", true);
        setBooleanField(term481471, term481471.getClass(), "contestNowPlayingEnable", true);
        setIntField(term481471, term481471.getClass(), "contestNowPlayingId", -1);
        setIntField(term481471, term481471.getClass(), "contestNowPlayingValue", -1);
        setField(term481471, term481471.getClass(), "contestNowPlayingResultRank", enum1076);
        setField(term481471, term481471.getClass(), "contestNowPlayingSpecifier", "");
        setField(term481471, term481471.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term481471, term481471.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term481471, term481471.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term481471, term481471.getClass(), "rivalPdId", -1);
        term482076 = new Integer(-2122545415);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerCustomize");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term481469;
        args[1] = term481471;
        args[2] = term482076;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


