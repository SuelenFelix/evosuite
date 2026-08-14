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

public class PlayerProfile_isUsePerPvSkin_112941554114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term715499;

    public PlayerProfile_isUsePerPvSkin_112941554114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term716111 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term716110 = ((Class) term716111).getDeclaredField((String) "MISS");
        ((Field) term716110).setAccessible(true);
        Object enum1557 = ((Field) term716110).get((Object) null);
        Class<? extends Object> term716488 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term716487 = ((Class) term716488).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term716487).setAccessible(true);
        Object enum1558 = ((Field) term716487).get((Object) null);
        Class<? extends Object> term716771 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term716770 = ((Class) term716771).getDeclaredField((String) "NORMAL");
        ((Field) term716770).setAccessible(true);
        Object enum1559 = ((Field) term716770).get((Object) null);
        Class<? extends Object> term717046 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term717045 = ((Class) term717046).getDeclaredField((String) "ORIGINAL");
        ((Field) term717045).setAccessible(true);
        Object enum1560 = ((Field) term717045).get((Object) null);
        Class<? extends Object> term717312 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term717311 = ((Class) term717312).getDeclaredField((String) "NONE");
        ((Field) term717311).setAccessible(true);
        Object enum1561 = ((Field) term717311).get((Object) null);
        term715499 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term715622 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term715623 = newInstance(Class.forName("java.time.LocalDate"));
        Object term715627 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term715499, term715499.getClass(), "id", -7506365302323354325L);
        setIntField(term715499, term715499.getClass(), "pdId", -766656824);
        setField(term715499, term715499.getClass(), "playerName", "xxx");
        setIntField(term715499, term715499.getClass(), "vocaloidPoints", 300);
        setIntField(term715499, term715499.getClass(), "level", 1);
        setIntField(term715499, term715499.getClass(), "levelExp", 137514813);
        setField(term715499, term715499.getClass(), "levelTitle", "xxx");
        setIntField(term715499, term715499.getClass(), "plateId", -1);
        setIntField(term715499, term715499.getClass(), "plateEffectId", -1);
        setField(term715499, term715499.getClass(), "passwordStatus", enum1557);
        setField(term715499, term715499.getClass(), "password", "**********");
        setBooleanField(term715499, term715499.getClass(), "preferPerPvModule", true);
        setBooleanField(term715499, term715499.getClass(), "preferCommonModule", false);
        setBooleanField(term715499, term715499.getClass(), "usePerPvSkin", false);
        setBooleanField(term715499, term715499.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term715499, term715499.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term715499, term715499.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term715499, term715499.getClass(), "usePerPvTouchSliderSe", false);
        setField(term715499, term715499.getClass(), "commonModule", "-999,-999,-999");
        setField(term715499, term715499.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term715623, term715623.getClass(), "year", 2026);
        setShortField(term715623, term715623.getClass(), "month", (short) 8);
        setShortField(term715623, term715623.getClass(), "day", (short) 12);
        setField(term715622, term715622.getClass(), "date", term715623);
        setByteField(term715627, term715627.getClass(), "hour", (byte) 2);
        setByteField(term715627, term715627.getClass(), "minute", (byte) 4);
        setByteField(term715627, term715627.getClass(), "second", (byte) 26);
        setIntField(term715627, term715627.getClass(), "nano", 122986000);
        setField(term715622, term715622.getClass(), "time", term715627);
        setField(term715499, term715499.getClass(), "commonModuleSetTime", term715622);
        setField(term715499, term715499.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term715499, term715499.getClass(), "commonSkin", -1);
        setIntField(term715499, term715499.getClass(), "headphoneVolume", 100);
        setBooleanField(term715499, term715499.getClass(), "buttonSeOn", true);
        setIntField(term715499, term715499.getClass(), "buttonSeVolume", 100);
        setIntField(term715499, term715499.getClass(), "sliderSeVolume", 100);
        setIntField(term715499, term715499.getClass(), "buttonSe", -1);
        setIntField(term715499, term715499.getClass(), "chainSlideSe", -1);
        setIntField(term715499, term715499.getClass(), "slideSe", -1);
        setIntField(term715499, term715499.getClass(), "sliderTouchSe", -1);
        setField(term715499, term715499.getClass(), "sortMode", enum1558);
        setIntField(term715499, term715499.getClass(), "nextPvId", -1);
        setField(term715499, term715499.getClass(), "nextDifficulty", enum1559);
        setField(term715499, term715499.getClass(), "nextEdition", enum1560);
        setBooleanField(term715499, term715499.getClass(), "showInterimRanking", true);
        setBooleanField(term715499, term715499.getClass(), "showClearStatus", true);
        setBooleanField(term715499, term715499.getClass(), "showGreatBorder", true);
        setBooleanField(term715499, term715499.getClass(), "showExcellentBorder", true);
        setBooleanField(term715499, term715499.getClass(), "showRivalBorder", true);
        setBooleanField(term715499, term715499.getClass(), "showRgoSetting", true);
        setBooleanField(term715499, term715499.getClass(), "contestNowPlayingEnable", false);
        setIntField(term715499, term715499.getClass(), "contestNowPlayingId", -1);
        setIntField(term715499, term715499.getClass(), "contestNowPlayingValue", -1);
        setField(term715499, term715499.getClass(), "contestNowPlayingResultRank", enum1561);
        setField(term715499, term715499.getClass(), "contestNowPlayingSpecifier", "");
        setField(term715499, term715499.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term715499, term715499.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term715499, term715499.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term715499, term715499.getClass(), "rivalPdId", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isUsePerPvSkin", argTypes, term715499, args);
    }

};


