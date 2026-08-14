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

public class PlayerProfile_getPlateEffectId_12073251409 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term703234;

    public PlayerProfile_getPlateEffectId_12073251409() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term703846 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term703845 = ((Class) term703846).getDeclaredField((String) "MISS");
        ((Field) term703845).setAccessible(true);
        Object enum1532 = ((Field) term703845).get((Object) null);
        Class<? extends Object> term704223 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term704222 = ((Class) term704223).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term704222).setAccessible(true);
        Object enum1533 = ((Field) term704222).get((Object) null);
        Class<? extends Object> term704506 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term704505 = ((Class) term704506).getDeclaredField((String) "NORMAL");
        ((Field) term704505).setAccessible(true);
        Object enum1534 = ((Field) term704505).get((Object) null);
        Class<? extends Object> term704781 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term704780 = ((Class) term704781).getDeclaredField((String) "ORIGINAL");
        ((Field) term704780).setAccessible(true);
        Object enum1535 = ((Field) term704780).get((Object) null);
        Class<? extends Object> term705047 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term705046 = ((Class) term705047).getDeclaredField((String) "NONE");
        ((Field) term705046).setAccessible(true);
        Object enum1536 = ((Field) term705046).get((Object) null);
        term703234 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term703357 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term703358 = newInstance(Class.forName("java.time.LocalDate"));
        Object term703362 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term703234, term703234.getClass(), "id", -2614906266506360948L);
        setIntField(term703234, term703234.getClass(), "pdId", -172607907);
        setField(term703234, term703234.getClass(), "playerName", "xxx");
        setIntField(term703234, term703234.getClass(), "vocaloidPoints", 300);
        setIntField(term703234, term703234.getClass(), "level", 1);
        setIntField(term703234, term703234.getClass(), "levelExp", 182656750);
        setField(term703234, term703234.getClass(), "levelTitle", "xxx");
        setIntField(term703234, term703234.getClass(), "plateId", -1);
        setIntField(term703234, term703234.getClass(), "plateEffectId", -1);
        setField(term703234, term703234.getClass(), "passwordStatus", enum1532);
        setField(term703234, term703234.getClass(), "password", "**********");
        setBooleanField(term703234, term703234.getClass(), "preferPerPvModule", true);
        setBooleanField(term703234, term703234.getClass(), "preferCommonModule", false);
        setBooleanField(term703234, term703234.getClass(), "usePerPvSkin", true);
        setBooleanField(term703234, term703234.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term703234, term703234.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term703234, term703234.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term703234, term703234.getClass(), "usePerPvTouchSliderSe", true);
        setField(term703234, term703234.getClass(), "commonModule", "-999,-999,-999");
        setField(term703234, term703234.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term703358, term703358.getClass(), "year", 2026);
        setShortField(term703358, term703358.getClass(), "month", (short) 8);
        setShortField(term703358, term703358.getClass(), "day", (short) 12);
        setField(term703357, term703357.getClass(), "date", term703358);
        setByteField(term703362, term703362.getClass(), "hour", (byte) 2);
        setByteField(term703362, term703362.getClass(), "minute", (byte) 4);
        setByteField(term703362, term703362.getClass(), "second", (byte) 24);
        setIntField(term703362, term703362.getClass(), "nano", 874274000);
        setField(term703357, term703357.getClass(), "time", term703362);
        setField(term703234, term703234.getClass(), "commonModuleSetTime", term703357);
        setField(term703234, term703234.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term703234, term703234.getClass(), "commonSkin", -1);
        setIntField(term703234, term703234.getClass(), "headphoneVolume", 100);
        setBooleanField(term703234, term703234.getClass(), "buttonSeOn", true);
        setIntField(term703234, term703234.getClass(), "buttonSeVolume", 100);
        setIntField(term703234, term703234.getClass(), "sliderSeVolume", 100);
        setIntField(term703234, term703234.getClass(), "buttonSe", -1);
        setIntField(term703234, term703234.getClass(), "chainSlideSe", -1);
        setIntField(term703234, term703234.getClass(), "slideSe", -1);
        setIntField(term703234, term703234.getClass(), "sliderTouchSe", -1);
        setField(term703234, term703234.getClass(), "sortMode", enum1533);
        setIntField(term703234, term703234.getClass(), "nextPvId", -1);
        setField(term703234, term703234.getClass(), "nextDifficulty", enum1534);
        setField(term703234, term703234.getClass(), "nextEdition", enum1535);
        setBooleanField(term703234, term703234.getClass(), "showInterimRanking", true);
        setBooleanField(term703234, term703234.getClass(), "showClearStatus", true);
        setBooleanField(term703234, term703234.getClass(), "showGreatBorder", true);
        setBooleanField(term703234, term703234.getClass(), "showExcellentBorder", true);
        setBooleanField(term703234, term703234.getClass(), "showRivalBorder", true);
        setBooleanField(term703234, term703234.getClass(), "showRgoSetting", true);
        setBooleanField(term703234, term703234.getClass(), "contestNowPlayingEnable", false);
        setIntField(term703234, term703234.getClass(), "contestNowPlayingId", -1);
        setIntField(term703234, term703234.getClass(), "contestNowPlayingValue", -1);
        setField(term703234, term703234.getClass(), "contestNowPlayingResultRank", enum1536);
        setField(term703234, term703234.getClass(), "contestNowPlayingSpecifier", "");
        setField(term703234, term703234.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term703234, term703234.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term703234, term703234.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term703234, term703234.getClass(), "rivalPdId", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlateEffectId", argTypes, term703234, args);
    }

};


