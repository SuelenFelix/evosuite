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

public class PlayerModule_init_4495094060 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term653041;
     Object term653646;

    public PlayerModule_init_4495094060() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term653655 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term653654 = ((Class) term653655).getDeclaredField((String) "MISS");
        ((Field) term653654).setAccessible(true);
        Object enum1432 = ((Field) term653654).get((Object) null);
        Class<? extends Object> term654032 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term654031 = ((Class) term654032).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term654031).setAccessible(true);
        Object enum1433 = ((Field) term654031).get((Object) null);
        Class<? extends Object> term654315 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term654314 = ((Class) term654315).getDeclaredField((String) "NORMAL");
        ((Field) term654314).setAccessible(true);
        Object enum1434 = ((Field) term654314).get((Object) null);
        Class<? extends Object> term654590 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term654589 = ((Class) term654590).getDeclaredField((String) "ORIGINAL");
        ((Field) term654589).setAccessible(true);
        Object enum1435 = ((Field) term654589).get((Object) null);
        Class<? extends Object> term654856 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term654855 = ((Class) term654856).getDeclaredField((String) "NONE");
        ((Field) term654855).setAccessible(true);
        Object enum1436 = ((Field) term654855).get((Object) null);
        term653041 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term653164 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term653165 = newInstance(Class.forName("java.time.LocalDate"));
        Object term653169 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term653041, term653041.getClass(), "id", -8992404862613425105L);
        setIntField(term653041, term653041.getClass(), "pdId", -174401540);
        setField(term653041, term653041.getClass(), "playerName", "xxx");
        setIntField(term653041, term653041.getClass(), "vocaloidPoints", 300);
        setIntField(term653041, term653041.getClass(), "level", 1);
        setIntField(term653041, term653041.getClass(), "levelExp", -1881073314);
        setField(term653041, term653041.getClass(), "levelTitle", "xxx");
        setIntField(term653041, term653041.getClass(), "plateId", -1);
        setIntField(term653041, term653041.getClass(), "plateEffectId", -1);
        setField(term653041, term653041.getClass(), "passwordStatus", enum1432);
        setField(term653041, term653041.getClass(), "password", "**********");
        setBooleanField(term653041, term653041.getClass(), "preferPerPvModule", true);
        setBooleanField(term653041, term653041.getClass(), "preferCommonModule", true);
        setBooleanField(term653041, term653041.getClass(), "usePerPvSkin", true);
        setBooleanField(term653041, term653041.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term653041, term653041.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term653041, term653041.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term653041, term653041.getClass(), "usePerPvTouchSliderSe", false);
        setField(term653041, term653041.getClass(), "commonModule", "-999,-999,-999");
        setField(term653041, term653041.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term653165, term653165.getClass(), "year", 2026);
        setShortField(term653165, term653165.getClass(), "month", (short) 8);
        setShortField(term653165, term653165.getClass(), "day", (short) 12);
        setField(term653164, term653164.getClass(), "date", term653165);
        setByteField(term653169, term653169.getClass(), "hour", (byte) 2);
        setByteField(term653169, term653169.getClass(), "minute", (byte) 4);
        setByteField(term653169, term653169.getClass(), "second", (byte) 16);
        setIntField(term653169, term653169.getClass(), "nano", 211493000);
        setField(term653164, term653164.getClass(), "time", term653169);
        setField(term653041, term653041.getClass(), "commonModuleSetTime", term653164);
        setField(term653041, term653041.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term653041, term653041.getClass(), "commonSkin", -1);
        setIntField(term653041, term653041.getClass(), "headphoneVolume", 100);
        setBooleanField(term653041, term653041.getClass(), "buttonSeOn", true);
        setIntField(term653041, term653041.getClass(), "buttonSeVolume", 100);
        setIntField(term653041, term653041.getClass(), "sliderSeVolume", 100);
        setIntField(term653041, term653041.getClass(), "buttonSe", -1);
        setIntField(term653041, term653041.getClass(), "chainSlideSe", -1);
        setIntField(term653041, term653041.getClass(), "slideSe", -1);
        setIntField(term653041, term653041.getClass(), "sliderTouchSe", -1);
        setField(term653041, term653041.getClass(), "sortMode", enum1433);
        setIntField(term653041, term653041.getClass(), "nextPvId", -1);
        setField(term653041, term653041.getClass(), "nextDifficulty", enum1434);
        setField(term653041, term653041.getClass(), "nextEdition", enum1435);
        setBooleanField(term653041, term653041.getClass(), "showInterimRanking", true);
        setBooleanField(term653041, term653041.getClass(), "showClearStatus", true);
        setBooleanField(term653041, term653041.getClass(), "showGreatBorder", true);
        setBooleanField(term653041, term653041.getClass(), "showExcellentBorder", true);
        setBooleanField(term653041, term653041.getClass(), "showRivalBorder", true);
        setBooleanField(term653041, term653041.getClass(), "showRgoSetting", true);
        setBooleanField(term653041, term653041.getClass(), "contestNowPlayingEnable", true);
        setIntField(term653041, term653041.getClass(), "contestNowPlayingId", -1);
        setIntField(term653041, term653041.getClass(), "contestNowPlayingValue", -1);
        setField(term653041, term653041.getClass(), "contestNowPlayingResultRank", enum1436);
        setField(term653041, term653041.getClass(), "contestNowPlayingSpecifier", "");
        setField(term653041, term653041.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term653041, term653041.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term653041, term653041.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term653041, term653041.getClass(), "rivalPdId", -1);
        term653646 = new Integer(-1902513009);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerModule");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term653041;
        args[1] = term653646;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


