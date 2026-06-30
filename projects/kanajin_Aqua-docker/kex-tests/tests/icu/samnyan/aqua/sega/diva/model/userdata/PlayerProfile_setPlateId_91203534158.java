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

public class PlayerProfile_setPlateId_91203534158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term823485;
     Object term824090;

    public PlayerProfile_setPlateId_91203534158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term824099 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term824098 = ((Class) term824099).getDeclaredField((String) "MISS");
        ((Field) term824098).setAccessible(true);
        Object enum1777 = ((Field) term824098).get((Object) null);
        Class<? extends Object> term824476 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term824475 = ((Class) term824476).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term824475).setAccessible(true);
        Object enum1778 = ((Field) term824475).get((Object) null);
        Class<? extends Object> term824759 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term824758 = ((Class) term824759).getDeclaredField((String) "NORMAL");
        ((Field) term824758).setAccessible(true);
        Object enum1779 = ((Field) term824758).get((Object) null);
        Class<? extends Object> term825034 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term825033 = ((Class) term825034).getDeclaredField((String) "ORIGINAL");
        ((Field) term825033).setAccessible(true);
        Object enum1780 = ((Field) term825033).get((Object) null);
        Class<? extends Object> term825300 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term825299 = ((Class) term825300).getDeclaredField((String) "NONE");
        ((Field) term825299).setAccessible(true);
        Object enum1781 = ((Field) term825299).get((Object) null);
        term823485 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term823608 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term823609 = newInstance(Class.forName("java.time.LocalDate"));
        Object term823613 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term823485, term823485.getClass(), "id", 1350676497718116574L);
        setIntField(term823485, term823485.getClass(), "pdId", -656080518);
        setField(term823485, term823485.getClass(), "playerName", "xxx");
        setIntField(term823485, term823485.getClass(), "vocaloidPoints", 300);
        setIntField(term823485, term823485.getClass(), "level", 1);
        setIntField(term823485, term823485.getClass(), "levelExp", 1769230265);
        setField(term823485, term823485.getClass(), "levelTitle", "xxx");
        setIntField(term823485, term823485.getClass(), "plateId", -1);
        setIntField(term823485, term823485.getClass(), "plateEffectId", -1);
        setField(term823485, term823485.getClass(), "passwordStatus", enum1777);
        setField(term823485, term823485.getClass(), "password", "**********");
        setBooleanField(term823485, term823485.getClass(), "preferPerPvModule", true);
        setBooleanField(term823485, term823485.getClass(), "preferCommonModule", false);
        setBooleanField(term823485, term823485.getClass(), "usePerPvSkin", false);
        setBooleanField(term823485, term823485.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term823485, term823485.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term823485, term823485.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term823485, term823485.getClass(), "usePerPvTouchSliderSe", true);
        setField(term823485, term823485.getClass(), "commonModule", "-999,-999,-999");
        setField(term823485, term823485.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term823609, term823609.getClass(), "year", 2026);
        setShortField(term823609, term823609.getClass(), "month", (short) 6);
        setShortField(term823609, term823609.getClass(), "day", (short) 29);
        setField(term823608, term823608.getClass(), "date", term823609);
        setByteField(term823613, term823613.getClass(), "hour", (byte) 4);
        setByteField(term823613, term823613.getClass(), "minute", (byte) 29);
        setByteField(term823613, term823613.getClass(), "second", (byte) 24);
        setIntField(term823613, term823613.getClass(), "nano", 151010000);
        setField(term823608, term823608.getClass(), "time", term823613);
        setField(term823485, term823485.getClass(), "commonModuleSetTime", term823608);
        setField(term823485, term823485.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term823485, term823485.getClass(), "commonSkin", -1);
        setIntField(term823485, term823485.getClass(), "headphoneVolume", 100);
        setBooleanField(term823485, term823485.getClass(), "buttonSeOn", true);
        setIntField(term823485, term823485.getClass(), "buttonSeVolume", 100);
        setIntField(term823485, term823485.getClass(), "sliderSeVolume", 100);
        setIntField(term823485, term823485.getClass(), "buttonSe", -1);
        setIntField(term823485, term823485.getClass(), "chainSlideSe", -1);
        setIntField(term823485, term823485.getClass(), "slideSe", -1);
        setIntField(term823485, term823485.getClass(), "sliderTouchSe", -1);
        setField(term823485, term823485.getClass(), "sortMode", enum1778);
        setIntField(term823485, term823485.getClass(), "nextPvId", -1);
        setField(term823485, term823485.getClass(), "nextDifficulty", enum1779);
        setField(term823485, term823485.getClass(), "nextEdition", enum1780);
        setBooleanField(term823485, term823485.getClass(), "showInterimRanking", true);
        setBooleanField(term823485, term823485.getClass(), "showClearStatus", true);
        setBooleanField(term823485, term823485.getClass(), "showGreatBorder", true);
        setBooleanField(term823485, term823485.getClass(), "showExcellentBorder", true);
        setBooleanField(term823485, term823485.getClass(), "showRivalBorder", true);
        setBooleanField(term823485, term823485.getClass(), "showRgoSetting", true);
        setBooleanField(term823485, term823485.getClass(), "contestNowPlayingEnable", true);
        setIntField(term823485, term823485.getClass(), "contestNowPlayingId", -1);
        setIntField(term823485, term823485.getClass(), "contestNowPlayingValue", -1);
        setField(term823485, term823485.getClass(), "contestNowPlayingResultRank", enum1781);
        setField(term823485, term823485.getClass(), "contestNowPlayingSpecifier", "");
        setField(term823485, term823485.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term823485, term823485.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term823485, term823485.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term823485, term823485.getClass(), "rivalPdId", -1);
        term824090 = new Integer(-1946503216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term824090;
        callMethod(klass, "setPlateId", argTypes, term823485, args);
    }

};


