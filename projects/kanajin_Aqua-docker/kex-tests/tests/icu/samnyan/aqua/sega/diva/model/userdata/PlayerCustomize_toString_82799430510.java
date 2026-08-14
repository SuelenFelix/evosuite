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

public class PlayerCustomize_toString_82799430510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term479013;

    public PlayerCustomize_toString_82799430510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term479628 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term479627 = ((Class) term479628).getDeclaredField((String) "MISS");
        ((Field) term479627).setAccessible(true);
        Object enum1067 = ((Field) term479627).get((Object) null);
        Class<? extends Object> term480005 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term480004 = ((Class) term480005).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term480004).setAccessible(true);
        Object enum1068 = ((Field) term480004).get((Object) null);
        Class<? extends Object> term480288 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term480287 = ((Class) term480288).getDeclaredField((String) "NORMAL");
        ((Field) term480287).setAccessible(true);
        Object enum1069 = ((Field) term480287).get((Object) null);
        Class<? extends Object> term480563 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term480562 = ((Class) term480563).getDeclaredField((String) "ORIGINAL");
        ((Field) term480562).setAccessible(true);
        Object enum1070 = ((Field) term480562).get((Object) null);
        Class<? extends Object> term480829 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term480828 = ((Class) term480829).getDeclaredField((String) "NONE");
        ((Field) term480828).setAccessible(true);
        Object enum1071 = ((Field) term480828).get((Object) null);
        term479013 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerCustomize"));
        Object term479015 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term479138 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term479139 = newInstance(Class.forName("java.time.LocalDate"));
        Object term479143 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term479013, term479013.getClass(), "id", -3033337370154155851L);
        setLongField(term479015, term479015.getClass(), "id", -3130003589475815807L);
        setIntField(term479015, term479015.getClass(), "pdId", 1999560627);
        setField(term479015, term479015.getClass(), "playerName", "xxx");
        setIntField(term479015, term479015.getClass(), "vocaloidPoints", 300);
        setIntField(term479015, term479015.getClass(), "level", 1);
        setIntField(term479015, term479015.getClass(), "levelExp", 93344937);
        setField(term479015, term479015.getClass(), "levelTitle", "xxx");
        setIntField(term479015, term479015.getClass(), "plateId", -1);
        setIntField(term479015, term479015.getClass(), "plateEffectId", -1);
        setField(term479015, term479015.getClass(), "passwordStatus", enum1067);
        setField(term479015, term479015.getClass(), "password", "**********");
        setBooleanField(term479015, term479015.getClass(), "preferPerPvModule", true);
        setBooleanField(term479015, term479015.getClass(), "preferCommonModule", false);
        setBooleanField(term479015, term479015.getClass(), "usePerPvSkin", false);
        setBooleanField(term479015, term479015.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term479015, term479015.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term479015, term479015.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term479015, term479015.getClass(), "usePerPvTouchSliderSe", true);
        setField(term479015, term479015.getClass(), "commonModule", "-999,-999,-999");
        setField(term479015, term479015.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term479139, term479139.getClass(), "year", 2026);
        setShortField(term479139, term479139.getClass(), "month", (short) 8);
        setShortField(term479139, term479139.getClass(), "day", (short) 12);
        setField(term479138, term479138.getClass(), "date", term479139);
        setByteField(term479143, term479143.getClass(), "hour", (byte) 2);
        setByteField(term479143, term479143.getClass(), "minute", (byte) 3);
        setByteField(term479143, term479143.getClass(), "second", (byte) 41);
        setIntField(term479143, term479143.getClass(), "nano", 377629000);
        setField(term479138, term479138.getClass(), "time", term479143);
        setField(term479015, term479015.getClass(), "commonModuleSetTime", term479138);
        setField(term479015, term479015.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term479015, term479015.getClass(), "commonSkin", -1);
        setIntField(term479015, term479015.getClass(), "headphoneVolume", 100);
        setBooleanField(term479015, term479015.getClass(), "buttonSeOn", true);
        setIntField(term479015, term479015.getClass(), "buttonSeVolume", 100);
        setIntField(term479015, term479015.getClass(), "sliderSeVolume", 100);
        setIntField(term479015, term479015.getClass(), "buttonSe", -1);
        setIntField(term479015, term479015.getClass(), "chainSlideSe", -1);
        setIntField(term479015, term479015.getClass(), "slideSe", -1);
        setIntField(term479015, term479015.getClass(), "sliderTouchSe", -1);
        setField(term479015, term479015.getClass(), "sortMode", enum1068);
        setIntField(term479015, term479015.getClass(), "nextPvId", -1);
        setField(term479015, term479015.getClass(), "nextDifficulty", enum1069);
        setField(term479015, term479015.getClass(), "nextEdition", enum1070);
        setBooleanField(term479015, term479015.getClass(), "showInterimRanking", true);
        setBooleanField(term479015, term479015.getClass(), "showClearStatus", true);
        setBooleanField(term479015, term479015.getClass(), "showGreatBorder", true);
        setBooleanField(term479015, term479015.getClass(), "showExcellentBorder", true);
        setBooleanField(term479015, term479015.getClass(), "showRivalBorder", true);
        setBooleanField(term479015, term479015.getClass(), "showRgoSetting", true);
        setBooleanField(term479015, term479015.getClass(), "contestNowPlayingEnable", true);
        setIntField(term479015, term479015.getClass(), "contestNowPlayingId", -1);
        setIntField(term479015, term479015.getClass(), "contestNowPlayingValue", -1);
        setField(term479015, term479015.getClass(), "contestNowPlayingResultRank", enum1071);
        setField(term479015, term479015.getClass(), "contestNowPlayingSpecifier", "");
        setField(term479015, term479015.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term479015, term479015.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term479015, term479015.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term479015, term479015.getClass(), "rivalPdId", -1);
        setField(term479013, term479013.getClass(), "pdId", term479015);
        setIntField(term479013, term479013.getClass(), "customizeId", 1426545044);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerCustomize");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term479013, args);
    }

};


