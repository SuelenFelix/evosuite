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

public class PlayerPvCustomize_getSlideSe_15420424979 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term969263;

    public PlayerPvCustomize_getSlideSe_15420424979() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term969997 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term969996 = ((Class) term969997).getDeclaredField((String) "MISS");
        ((Field) term969996).setAccessible(true);
        Object enum2065 = ((Field) term969996).get((Object) null);
        Class<? extends Object> term970374 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term970373 = ((Class) term970374).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term970373).setAccessible(true);
        Object enum2066 = ((Field) term970373).get((Object) null);
        Class<? extends Object> term970657 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term970656 = ((Class) term970657).getDeclaredField((String) "NORMAL");
        ((Field) term970656).setAccessible(true);
        Object enum2067 = ((Field) term970656).get((Object) null);
        Class<? extends Object> term970932 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term970931 = ((Class) term970932).getDeclaredField((String) "ORIGINAL");
        ((Field) term970931).setAccessible(true);
        Object enum2068 = ((Field) term970931).get((Object) null);
        Class<? extends Object> term971198 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term971197 = ((Class) term971198).getDeclaredField((String) "NONE");
        ((Field) term971197).setAccessible(true);
        Object enum2069 = ((Field) term971197).get((Object) null);
        term969263 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvCustomize"));
        Object term969265 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term969388 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term969389 = newInstance(Class.forName("java.time.LocalDate"));
        Object term969393 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term969263, term969263.getClass(), "id", 9160882370265093763L);
        setLongField(term969265, term969265.getClass(), "id", 6848008460134431064L);
        setIntField(term969265, term969265.getClass(), "pdId", 2061147445);
        setField(term969265, term969265.getClass(), "playerName", "xxx");
        setIntField(term969265, term969265.getClass(), "vocaloidPoints", 300);
        setIntField(term969265, term969265.getClass(), "level", 1);
        setIntField(term969265, term969265.getClass(), "levelExp", -531060561);
        setField(term969265, term969265.getClass(), "levelTitle", "xxx");
        setIntField(term969265, term969265.getClass(), "plateId", -1);
        setIntField(term969265, term969265.getClass(), "plateEffectId", -1);
        setField(term969265, term969265.getClass(), "passwordStatus", enum2065);
        setField(term969265, term969265.getClass(), "password", "**********");
        setBooleanField(term969265, term969265.getClass(), "preferPerPvModule", true);
        setBooleanField(term969265, term969265.getClass(), "preferCommonModule", true);
        setBooleanField(term969265, term969265.getClass(), "usePerPvSkin", true);
        setBooleanField(term969265, term969265.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term969265, term969265.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term969265, term969265.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term969265, term969265.getClass(), "usePerPvTouchSliderSe", true);
        setField(term969265, term969265.getClass(), "commonModule", "-999,-999,-999");
        setField(term969265, term969265.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term969389, term969389.getClass(), "year", 2026);
        setShortField(term969389, term969389.getClass(), "month", (short) 8);
        setShortField(term969389, term969389.getClass(), "day", (short) 12);
        setField(term969388, term969388.getClass(), "date", term969389);
        setByteField(term969393, term969393.getClass(), "hour", (byte) 2);
        setByteField(term969393, term969393.getClass(), "minute", (byte) 5);
        setByteField(term969393, term969393.getClass(), "second", (byte) 18);
        setIntField(term969393, term969393.getClass(), "nano", 616415000);
        setField(term969388, term969388.getClass(), "time", term969393);
        setField(term969265, term969265.getClass(), "commonModuleSetTime", term969388);
        setField(term969265, term969265.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term969265, term969265.getClass(), "commonSkin", -1);
        setIntField(term969265, term969265.getClass(), "headphoneVolume", 100);
        setBooleanField(term969265, term969265.getClass(), "buttonSeOn", true);
        setIntField(term969265, term969265.getClass(), "buttonSeVolume", 100);
        setIntField(term969265, term969265.getClass(), "sliderSeVolume", 100);
        setIntField(term969265, term969265.getClass(), "buttonSe", -1);
        setIntField(term969265, term969265.getClass(), "chainSlideSe", -1);
        setIntField(term969265, term969265.getClass(), "slideSe", -1);
        setIntField(term969265, term969265.getClass(), "sliderTouchSe", -1);
        setField(term969265, term969265.getClass(), "sortMode", enum2066);
        setIntField(term969265, term969265.getClass(), "nextPvId", -1);
        setField(term969265, term969265.getClass(), "nextDifficulty", enum2067);
        setField(term969265, term969265.getClass(), "nextEdition", enum2068);
        setBooleanField(term969265, term969265.getClass(), "showInterimRanking", true);
        setBooleanField(term969265, term969265.getClass(), "showClearStatus", true);
        setBooleanField(term969265, term969265.getClass(), "showGreatBorder", true);
        setBooleanField(term969265, term969265.getClass(), "showExcellentBorder", true);
        setBooleanField(term969265, term969265.getClass(), "showRivalBorder", true);
        setBooleanField(term969265, term969265.getClass(), "showRgoSetting", true);
        setBooleanField(term969265, term969265.getClass(), "contestNowPlayingEnable", true);
        setIntField(term969265, term969265.getClass(), "contestNowPlayingId", -1);
        setIntField(term969265, term969265.getClass(), "contestNowPlayingValue", -1);
        setField(term969265, term969265.getClass(), "contestNowPlayingResultRank", enum2069);
        setField(term969265, term969265.getClass(), "contestNowPlayingSpecifier", "");
        setField(term969265, term969265.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term969265, term969265.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term969265, term969265.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term969265, term969265.getClass(), "rivalPdId", -1);
        setField(term969263, term969263.getClass(), "pdId", term969265);
        setIntField(term969263, term969263.getClass(), "pvId", -1);
        setField(term969263, term969263.getClass(), "module", "-999,-999,-999");
        setField(term969263, term969263.getClass(), "customize", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setField(term969263, term969263.getClass(), "customizeFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term969263, term969263.getClass(), "skin", -1);
        setIntField(term969263, term969263.getClass(), "buttonSe", -1);
        setIntField(term969263, term969263.getClass(), "slideSe", -1);
        setIntField(term969263, term969263.getClass(), "chainSlideSe", -1);
        setIntField(term969263, term969263.getClass(), "sliderTouchSe", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvCustomize");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSlideSe", argTypes, term969263, args);
    }

};


