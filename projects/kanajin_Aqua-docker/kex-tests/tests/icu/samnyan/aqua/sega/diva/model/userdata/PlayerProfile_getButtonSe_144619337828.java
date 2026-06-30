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

public class PlayerProfile_getButtonSe_144619337828 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term749841;

    public PlayerProfile_getButtonSe_144619337828() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term750453 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term750452 = ((Class) term750453).getDeclaredField((String) "MISS");
        ((Field) term750452).setAccessible(true);
        Object enum1627 = ((Field) term750452).get((Object) null);
        Class<? extends Object> term750830 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term750829 = ((Class) term750830).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term750829).setAccessible(true);
        Object enum1628 = ((Field) term750829).get((Object) null);
        Class<? extends Object> term751113 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term751112 = ((Class) term751113).getDeclaredField((String) "NORMAL");
        ((Field) term751112).setAccessible(true);
        Object enum1629 = ((Field) term751112).get((Object) null);
        Class<? extends Object> term751388 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term751387 = ((Class) term751388).getDeclaredField((String) "ORIGINAL");
        ((Field) term751387).setAccessible(true);
        Object enum1630 = ((Field) term751387).get((Object) null);
        Class<? extends Object> term751654 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term751653 = ((Class) term751654).getDeclaredField((String) "NONE");
        ((Field) term751653).setAccessible(true);
        Object enum1631 = ((Field) term751653).get((Object) null);
        term749841 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term749964 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term749965 = newInstance(Class.forName("java.time.LocalDate"));
        Object term749969 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term749841, term749841.getClass(), "id", 5818741986224130131L);
        setIntField(term749841, term749841.getClass(), "pdId", -2019439660);
        setField(term749841, term749841.getClass(), "playerName", "xxx");
        setIntField(term749841, term749841.getClass(), "vocaloidPoints", 300);
        setIntField(term749841, term749841.getClass(), "level", 1);
        setIntField(term749841, term749841.getClass(), "levelExp", 1037621714);
        setField(term749841, term749841.getClass(), "levelTitle", "xxx");
        setIntField(term749841, term749841.getClass(), "plateId", -1);
        setIntField(term749841, term749841.getClass(), "plateEffectId", -1);
        setField(term749841, term749841.getClass(), "passwordStatus", enum1627);
        setField(term749841, term749841.getClass(), "password", "**********");
        setBooleanField(term749841, term749841.getClass(), "preferPerPvModule", true);
        setBooleanField(term749841, term749841.getClass(), "preferCommonModule", true);
        setBooleanField(term749841, term749841.getClass(), "usePerPvSkin", false);
        setBooleanField(term749841, term749841.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term749841, term749841.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term749841, term749841.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term749841, term749841.getClass(), "usePerPvTouchSliderSe", true);
        setField(term749841, term749841.getClass(), "commonModule", "-999,-999,-999");
        setField(term749841, term749841.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term749965, term749965.getClass(), "year", 2026);
        setShortField(term749965, term749965.getClass(), "month", (short) 6);
        setShortField(term749965, term749965.getClass(), "day", (short) 29);
        setField(term749964, term749964.getClass(), "date", term749965);
        setByteField(term749969, term749969.getClass(), "hour", (byte) 4);
        setByteField(term749969, term749969.getClass(), "minute", (byte) 29);
        setByteField(term749969, term749969.getClass(), "second", (byte) 16);
        setIntField(term749969, term749969.getClass(), "nano", 442100000);
        setField(term749964, term749964.getClass(), "time", term749969);
        setField(term749841, term749841.getClass(), "commonModuleSetTime", term749964);
        setField(term749841, term749841.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term749841, term749841.getClass(), "commonSkin", -1);
        setIntField(term749841, term749841.getClass(), "headphoneVolume", 100);
        setBooleanField(term749841, term749841.getClass(), "buttonSeOn", true);
        setIntField(term749841, term749841.getClass(), "buttonSeVolume", 100);
        setIntField(term749841, term749841.getClass(), "sliderSeVolume", 100);
        setIntField(term749841, term749841.getClass(), "buttonSe", -1);
        setIntField(term749841, term749841.getClass(), "chainSlideSe", -1);
        setIntField(term749841, term749841.getClass(), "slideSe", -1);
        setIntField(term749841, term749841.getClass(), "sliderTouchSe", -1);
        setField(term749841, term749841.getClass(), "sortMode", enum1628);
        setIntField(term749841, term749841.getClass(), "nextPvId", -1);
        setField(term749841, term749841.getClass(), "nextDifficulty", enum1629);
        setField(term749841, term749841.getClass(), "nextEdition", enum1630);
        setBooleanField(term749841, term749841.getClass(), "showInterimRanking", true);
        setBooleanField(term749841, term749841.getClass(), "showClearStatus", true);
        setBooleanField(term749841, term749841.getClass(), "showGreatBorder", true);
        setBooleanField(term749841, term749841.getClass(), "showExcellentBorder", true);
        setBooleanField(term749841, term749841.getClass(), "showRivalBorder", true);
        setBooleanField(term749841, term749841.getClass(), "showRgoSetting", true);
        setBooleanField(term749841, term749841.getClass(), "contestNowPlayingEnable", true);
        setIntField(term749841, term749841.getClass(), "contestNowPlayingId", -1);
        setIntField(term749841, term749841.getClass(), "contestNowPlayingValue", -1);
        setField(term749841, term749841.getClass(), "contestNowPlayingResultRank", enum1631);
        setField(term749841, term749841.getClass(), "contestNowPlayingSpecifier", "");
        setField(term749841, term749841.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term749841, term749841.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term749841, term749841.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term749841, term749841.getClass(), "rivalPdId", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getButtonSe", argTypes, term749841, args);
    }

};


