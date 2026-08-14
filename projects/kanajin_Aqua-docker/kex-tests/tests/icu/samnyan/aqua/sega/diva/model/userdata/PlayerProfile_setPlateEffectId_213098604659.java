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

public class PlayerProfile_setPlateEffectId_213098604659 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term825940;
     Object term826545;

    public PlayerProfile_setPlateEffectId_213098604659() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term826554 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term826553 = ((Class) term826554).getDeclaredField((String) "MISS");
        ((Field) term826553).setAccessible(true);
        Object enum1782 = ((Field) term826553).get((Object) null);
        Class<? extends Object> term826931 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term826930 = ((Class) term826931).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term826930).setAccessible(true);
        Object enum1783 = ((Field) term826930).get((Object) null);
        Class<? extends Object> term827214 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term827213 = ((Class) term827214).getDeclaredField((String) "NORMAL");
        ((Field) term827213).setAccessible(true);
        Object enum1784 = ((Field) term827213).get((Object) null);
        Class<? extends Object> term827489 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term827488 = ((Class) term827489).getDeclaredField((String) "ORIGINAL");
        ((Field) term827488).setAccessible(true);
        Object enum1785 = ((Field) term827488).get((Object) null);
        Class<? extends Object> term827755 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term827754 = ((Class) term827755).getDeclaredField((String) "NONE");
        ((Field) term827754).setAccessible(true);
        Object enum1786 = ((Field) term827754).get((Object) null);
        term825940 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term826063 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term826064 = newInstance(Class.forName("java.time.LocalDate"));
        Object term826068 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term825940, term825940.getClass(), "id", -4477377284889705897L);
        setIntField(term825940, term825940.getClass(), "pdId", 467573222);
        setField(term825940, term825940.getClass(), "playerName", "xxx");
        setIntField(term825940, term825940.getClass(), "vocaloidPoints", 300);
        setIntField(term825940, term825940.getClass(), "level", 1);
        setIntField(term825940, term825940.getClass(), "levelExp", -197212451);
        setField(term825940, term825940.getClass(), "levelTitle", "xxx");
        setIntField(term825940, term825940.getClass(), "plateId", -1);
        setIntField(term825940, term825940.getClass(), "plateEffectId", -1);
        setField(term825940, term825940.getClass(), "passwordStatus", enum1782);
        setField(term825940, term825940.getClass(), "password", "**********");
        setBooleanField(term825940, term825940.getClass(), "preferPerPvModule", true);
        setBooleanField(term825940, term825940.getClass(), "preferCommonModule", true);
        setBooleanField(term825940, term825940.getClass(), "usePerPvSkin", false);
        setBooleanField(term825940, term825940.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term825940, term825940.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term825940, term825940.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term825940, term825940.getClass(), "usePerPvTouchSliderSe", false);
        setField(term825940, term825940.getClass(), "commonModule", "-999,-999,-999");
        setField(term825940, term825940.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term826064, term826064.getClass(), "year", 2026);
        setShortField(term826064, term826064.getClass(), "month", (short) 8);
        setShortField(term826064, term826064.getClass(), "day", (short) 12);
        setField(term826063, term826063.getClass(), "date", term826064);
        setByteField(term826068, term826068.getClass(), "hour", (byte) 2);
        setByteField(term826068, term826068.getClass(), "minute", (byte) 4);
        setByteField(term826068, term826068.getClass(), "second", (byte) 37);
        setIntField(term826068, term826068.getClass(), "nano", 894493000);
        setField(term826063, term826063.getClass(), "time", term826068);
        setField(term825940, term825940.getClass(), "commonModuleSetTime", term826063);
        setField(term825940, term825940.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term825940, term825940.getClass(), "commonSkin", -1);
        setIntField(term825940, term825940.getClass(), "headphoneVolume", 100);
        setBooleanField(term825940, term825940.getClass(), "buttonSeOn", true);
        setIntField(term825940, term825940.getClass(), "buttonSeVolume", 100);
        setIntField(term825940, term825940.getClass(), "sliderSeVolume", 100);
        setIntField(term825940, term825940.getClass(), "buttonSe", -1);
        setIntField(term825940, term825940.getClass(), "chainSlideSe", -1);
        setIntField(term825940, term825940.getClass(), "slideSe", -1);
        setIntField(term825940, term825940.getClass(), "sliderTouchSe", -1);
        setField(term825940, term825940.getClass(), "sortMode", enum1783);
        setIntField(term825940, term825940.getClass(), "nextPvId", -1);
        setField(term825940, term825940.getClass(), "nextDifficulty", enum1784);
        setField(term825940, term825940.getClass(), "nextEdition", enum1785);
        setBooleanField(term825940, term825940.getClass(), "showInterimRanking", true);
        setBooleanField(term825940, term825940.getClass(), "showClearStatus", true);
        setBooleanField(term825940, term825940.getClass(), "showGreatBorder", true);
        setBooleanField(term825940, term825940.getClass(), "showExcellentBorder", true);
        setBooleanField(term825940, term825940.getClass(), "showRivalBorder", true);
        setBooleanField(term825940, term825940.getClass(), "showRgoSetting", true);
        setBooleanField(term825940, term825940.getClass(), "contestNowPlayingEnable", false);
        setIntField(term825940, term825940.getClass(), "contestNowPlayingId", -1);
        setIntField(term825940, term825940.getClass(), "contestNowPlayingValue", -1);
        setField(term825940, term825940.getClass(), "contestNowPlayingResultRank", enum1786);
        setField(term825940, term825940.getClass(), "contestNowPlayingSpecifier", "");
        setField(term825940, term825940.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term825940, term825940.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term825940, term825940.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term825940, term825940.getClass(), "rivalPdId", -1);
        term826545 = new Integer(213194885);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term826545;
        callMethod(klass, "setPlateEffectId", argTypes, term825940, args);
    }

};


