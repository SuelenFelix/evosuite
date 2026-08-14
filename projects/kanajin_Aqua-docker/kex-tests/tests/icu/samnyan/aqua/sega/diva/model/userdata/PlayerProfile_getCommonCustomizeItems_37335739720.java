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

public class PlayerProfile_getCommonCustomizeItems_37335739720 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term730217;

    public PlayerProfile_getCommonCustomizeItems_37335739720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term730829 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term730828 = ((Class) term730829).getDeclaredField((String) "MISS");
        ((Field) term730828).setAccessible(true);
        Object enum1587 = ((Field) term730828).get((Object) null);
        Class<? extends Object> term731206 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term731205 = ((Class) term731206).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term731205).setAccessible(true);
        Object enum1588 = ((Field) term731205).get((Object) null);
        Class<? extends Object> term731489 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term731488 = ((Class) term731489).getDeclaredField((String) "NORMAL");
        ((Field) term731488).setAccessible(true);
        Object enum1589 = ((Field) term731488).get((Object) null);
        Class<? extends Object> term731764 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term731763 = ((Class) term731764).getDeclaredField((String) "ORIGINAL");
        ((Field) term731763).setAccessible(true);
        Object enum1590 = ((Field) term731763).get((Object) null);
        Class<? extends Object> term732030 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term732029 = ((Class) term732030).getDeclaredField((String) "NONE");
        ((Field) term732029).setAccessible(true);
        Object enum1591 = ((Field) term732029).get((Object) null);
        term730217 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term730340 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term730341 = newInstance(Class.forName("java.time.LocalDate"));
        Object term730345 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term730217, term730217.getClass(), "id", -9168517519350392654L);
        setIntField(term730217, term730217.getClass(), "pdId", -311098933);
        setField(term730217, term730217.getClass(), "playerName", "xxx");
        setIntField(term730217, term730217.getClass(), "vocaloidPoints", 300);
        setIntField(term730217, term730217.getClass(), "level", 1);
        setIntField(term730217, term730217.getClass(), "levelExp", -1778687889);
        setField(term730217, term730217.getClass(), "levelTitle", "xxx");
        setIntField(term730217, term730217.getClass(), "plateId", -1);
        setIntField(term730217, term730217.getClass(), "plateEffectId", -1);
        setField(term730217, term730217.getClass(), "passwordStatus", enum1587);
        setField(term730217, term730217.getClass(), "password", "**********");
        setBooleanField(term730217, term730217.getClass(), "preferPerPvModule", true);
        setBooleanField(term730217, term730217.getClass(), "preferCommonModule", false);
        setBooleanField(term730217, term730217.getClass(), "usePerPvSkin", true);
        setBooleanField(term730217, term730217.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term730217, term730217.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term730217, term730217.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term730217, term730217.getClass(), "usePerPvTouchSliderSe", true);
        setField(term730217, term730217.getClass(), "commonModule", "-999,-999,-999");
        setField(term730217, term730217.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term730341, term730341.getClass(), "year", 2026);
        setShortField(term730341, term730341.getClass(), "month", (short) 8);
        setShortField(term730341, term730341.getClass(), "day", (short) 12);
        setField(term730340, term730340.getClass(), "date", term730341);
        setByteField(term730345, term730345.getClass(), "hour", (byte) 2);
        setByteField(term730345, term730345.getClass(), "minute", (byte) 4);
        setByteField(term730345, term730345.getClass(), "second", (byte) 27);
        setIntField(term730345, term730345.getClass(), "nano", 615007000);
        setField(term730340, term730340.getClass(), "time", term730345);
        setField(term730217, term730217.getClass(), "commonModuleSetTime", term730340);
        setField(term730217, term730217.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term730217, term730217.getClass(), "commonSkin", -1);
        setIntField(term730217, term730217.getClass(), "headphoneVolume", 100);
        setBooleanField(term730217, term730217.getClass(), "buttonSeOn", true);
        setIntField(term730217, term730217.getClass(), "buttonSeVolume", 100);
        setIntField(term730217, term730217.getClass(), "sliderSeVolume", 100);
        setIntField(term730217, term730217.getClass(), "buttonSe", -1);
        setIntField(term730217, term730217.getClass(), "chainSlideSe", -1);
        setIntField(term730217, term730217.getClass(), "slideSe", -1);
        setIntField(term730217, term730217.getClass(), "sliderTouchSe", -1);
        setField(term730217, term730217.getClass(), "sortMode", enum1588);
        setIntField(term730217, term730217.getClass(), "nextPvId", -1);
        setField(term730217, term730217.getClass(), "nextDifficulty", enum1589);
        setField(term730217, term730217.getClass(), "nextEdition", enum1590);
        setBooleanField(term730217, term730217.getClass(), "showInterimRanking", true);
        setBooleanField(term730217, term730217.getClass(), "showClearStatus", true);
        setBooleanField(term730217, term730217.getClass(), "showGreatBorder", true);
        setBooleanField(term730217, term730217.getClass(), "showExcellentBorder", true);
        setBooleanField(term730217, term730217.getClass(), "showRivalBorder", true);
        setBooleanField(term730217, term730217.getClass(), "showRgoSetting", true);
        setBooleanField(term730217, term730217.getClass(), "contestNowPlayingEnable", true);
        setIntField(term730217, term730217.getClass(), "contestNowPlayingId", -1);
        setIntField(term730217, term730217.getClass(), "contestNowPlayingValue", -1);
        setField(term730217, term730217.getClass(), "contestNowPlayingResultRank", enum1591);
        setField(term730217, term730217.getClass(), "contestNowPlayingSpecifier", "");
        setField(term730217, term730217.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term730217, term730217.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term730217, term730217.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term730217, term730217.getClass(), "rivalPdId", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCommonCustomizeItems", argTypes, term730217, args);
    }

};


