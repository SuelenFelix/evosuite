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

public class PlayerProfile_setMyList0_131040582197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term920164;

    public PlayerProfile_setMyList0_131040582197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term920788 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term920787 = ((Class) term920788).getDeclaredField((String) "MISS");
        ((Field) term920787).setAccessible(true);
        Object enum1975 = ((Field) term920787).get((Object) null);
        Class<? extends Object> term921165 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term921164 = ((Class) term921165).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term921164).setAccessible(true);
        Object enum1976 = ((Field) term921164).get((Object) null);
        Class<? extends Object> term921448 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term921447 = ((Class) term921448).getDeclaredField((String) "NORMAL");
        ((Field) term921447).setAccessible(true);
        Object enum1977 = ((Field) term921447).get((Object) null);
        Class<? extends Object> term921723 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term921722 = ((Class) term921723).getDeclaredField((String) "ORIGINAL");
        ((Field) term921722).setAccessible(true);
        Object enum1978 = ((Field) term921722).get((Object) null);
        Class<? extends Object> term921989 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term921988 = ((Class) term921989).getDeclaredField((String) "NONE");
        ((Field) term921988).setAccessible(true);
        Object enum1979 = ((Field) term921988).get((Object) null);
        term920164 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term920287 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term920288 = newInstance(Class.forName("java.time.LocalDate"));
        Object term920292 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term920164, term920164.getClass(), "id", -99017747847004910L);
        setIntField(term920164, term920164.getClass(), "pdId", 398974629);
        setField(term920164, term920164.getClass(), "playerName", "xxx");
        setIntField(term920164, term920164.getClass(), "vocaloidPoints", 300);
        setIntField(term920164, term920164.getClass(), "level", 1);
        setIntField(term920164, term920164.getClass(), "levelExp", -790946306);
        setField(term920164, term920164.getClass(), "levelTitle", "xxx");
        setIntField(term920164, term920164.getClass(), "plateId", -1);
        setIntField(term920164, term920164.getClass(), "plateEffectId", -1);
        setField(term920164, term920164.getClass(), "passwordStatus", enum1975);
        setField(term920164, term920164.getClass(), "password", "**********");
        setBooleanField(term920164, term920164.getClass(), "preferPerPvModule", true);
        setBooleanField(term920164, term920164.getClass(), "preferCommonModule", true);
        setBooleanField(term920164, term920164.getClass(), "usePerPvSkin", false);
        setBooleanField(term920164, term920164.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term920164, term920164.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term920164, term920164.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term920164, term920164.getClass(), "usePerPvTouchSliderSe", true);
        setField(term920164, term920164.getClass(), "commonModule", "-999,-999,-999");
        setField(term920164, term920164.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term920288, term920288.getClass(), "year", 2026);
        setShortField(term920288, term920288.getClass(), "month", (short) 6);
        setShortField(term920288, term920288.getClass(), "day", (short) 29);
        setField(term920287, term920287.getClass(), "date", term920288);
        setByteField(term920292, term920292.getClass(), "hour", (byte) 4);
        setByteField(term920292, term920292.getClass(), "minute", (byte) 29);
        setByteField(term920292, term920292.getClass(), "second", (byte) 34);
        setIntField(term920292, term920292.getClass(), "nano", 199989000);
        setField(term920287, term920287.getClass(), "time", term920292);
        setField(term920164, term920164.getClass(), "commonModuleSetTime", term920287);
        setField(term920164, term920164.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term920164, term920164.getClass(), "commonSkin", -1);
        setIntField(term920164, term920164.getClass(), "headphoneVolume", 100);
        setBooleanField(term920164, term920164.getClass(), "buttonSeOn", true);
        setIntField(term920164, term920164.getClass(), "buttonSeVolume", 100);
        setIntField(term920164, term920164.getClass(), "sliderSeVolume", 100);
        setIntField(term920164, term920164.getClass(), "buttonSe", -1);
        setIntField(term920164, term920164.getClass(), "chainSlideSe", -1);
        setIntField(term920164, term920164.getClass(), "slideSe", -1);
        setIntField(term920164, term920164.getClass(), "sliderTouchSe", -1);
        setField(term920164, term920164.getClass(), "sortMode", enum1976);
        setIntField(term920164, term920164.getClass(), "nextPvId", -1);
        setField(term920164, term920164.getClass(), "nextDifficulty", enum1977);
        setField(term920164, term920164.getClass(), "nextEdition", enum1978);
        setBooleanField(term920164, term920164.getClass(), "showInterimRanking", true);
        setBooleanField(term920164, term920164.getClass(), "showClearStatus", true);
        setBooleanField(term920164, term920164.getClass(), "showGreatBorder", true);
        setBooleanField(term920164, term920164.getClass(), "showExcellentBorder", true);
        setBooleanField(term920164, term920164.getClass(), "showRivalBorder", true);
        setBooleanField(term920164, term920164.getClass(), "showRgoSetting", true);
        setBooleanField(term920164, term920164.getClass(), "contestNowPlayingEnable", true);
        setIntField(term920164, term920164.getClass(), "contestNowPlayingId", -1);
        setIntField(term920164, term920164.getClass(), "contestNowPlayingValue", -1);
        setField(term920164, term920164.getClass(), "contestNowPlayingResultRank", enum1979);
        setField(term920164, term920164.getClass(), "contestNowPlayingSpecifier", "");
        setField(term920164, term920164.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term920164, term920164.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term920164, term920164.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term920164, term920164.getClass(), "rivalPdId", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UPUbwyHQKN";
        callMethod(klass, "setMyList0", argTypes, term920164, args);
    }

};


