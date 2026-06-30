package icu.samnyan.aqua.sega.diva.service;

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
import static icu.samnyan.aqua.sega.diva.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;

public class PlayerCustomizeService_buy_1130740450 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3335;
     Object term3940;

    public PlayerCustomizeService_buy_1130740450() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3949 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term3948 = ((Class) term3949).getDeclaredField((String) "MISS");
        ((Field) term3948).setAccessible(true);
        Object enum5 = ((Field) term3948).get((Object) null);
        Class<? extends Object> term4326 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term4325 = ((Class) term4326).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term4325).setAccessible(true);
        Object enum6 = ((Field) term4325).get((Object) null);
        Class<? extends Object> term4609 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term4608 = ((Class) term4609).getDeclaredField((String) "NORMAL");
        ((Field) term4608).setAccessible(true);
        Object enum7 = ((Field) term4608).get((Object) null);
        Class<? extends Object> term4884 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term4883 = ((Class) term4884).getDeclaredField((String) "ORIGINAL");
        ((Field) term4883).setAccessible(true);
        Object enum8 = ((Field) term4883).get((Object) null);
        Class<? extends Object> term5150 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term5149 = ((Class) term5150).getDeclaredField((String) "NONE");
        ((Field) term5149).setAccessible(true);
        Object enum9 = ((Field) term5149).get((Object) null);
        term3335 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term3458 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3459 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3463 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term3335, term3335.getClass(), "id", 6375119433582206027L);
        setIntField(term3335, term3335.getClass(), "pdId", -1922583790);
        setField(term3335, term3335.getClass(), "playerName", "xxx");
        setIntField(term3335, term3335.getClass(), "vocaloidPoints", 300);
        setIntField(term3335, term3335.getClass(), "level", 1);
        setIntField(term3335, term3335.getClass(), "levelExp", -616727354);
        setField(term3335, term3335.getClass(), "levelTitle", "xxx");
        setIntField(term3335, term3335.getClass(), "plateId", -1);
        setIntField(term3335, term3335.getClass(), "plateEffectId", -1);
        setField(term3335, term3335.getClass(), "passwordStatus", enum5);
        setField(term3335, term3335.getClass(), "password", "**********");
        setBooleanField(term3335, term3335.getClass(), "preferPerPvModule", true);
        setBooleanField(term3335, term3335.getClass(), "preferCommonModule", true);
        setBooleanField(term3335, term3335.getClass(), "usePerPvSkin", false);
        setBooleanField(term3335, term3335.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term3335, term3335.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term3335, term3335.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term3335, term3335.getClass(), "usePerPvTouchSliderSe", false);
        setField(term3335, term3335.getClass(), "commonModule", "-999,-999,-999");
        setField(term3335, term3335.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term3459, term3459.getClass(), "year", 2026);
        setShortField(term3459, term3459.getClass(), "month", (short) 6);
        setShortField(term3459, term3459.getClass(), "day", (short) 29);
        setField(term3458, term3458.getClass(), "date", term3459);
        setByteField(term3463, term3463.getClass(), "hour", (byte) 4);
        setByteField(term3463, term3463.getClass(), "minute", (byte) 32);
        setByteField(term3463, term3463.getClass(), "second", (byte) 3);
        setIntField(term3463, term3463.getClass(), "nano", 513534000);
        setField(term3458, term3458.getClass(), "time", term3463);
        setField(term3335, term3335.getClass(), "commonModuleSetTime", term3458);
        setField(term3335, term3335.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term3335, term3335.getClass(), "commonSkin", -1);
        setIntField(term3335, term3335.getClass(), "headphoneVolume", 100);
        setBooleanField(term3335, term3335.getClass(), "buttonSeOn", true);
        setIntField(term3335, term3335.getClass(), "buttonSeVolume", 100);
        setIntField(term3335, term3335.getClass(), "sliderSeVolume", 100);
        setIntField(term3335, term3335.getClass(), "buttonSe", -1);
        setIntField(term3335, term3335.getClass(), "chainSlideSe", -1);
        setIntField(term3335, term3335.getClass(), "slideSe", -1);
        setIntField(term3335, term3335.getClass(), "sliderTouchSe", -1);
        setField(term3335, term3335.getClass(), "sortMode", enum6);
        setIntField(term3335, term3335.getClass(), "nextPvId", -1);
        setField(term3335, term3335.getClass(), "nextDifficulty", enum7);
        setField(term3335, term3335.getClass(), "nextEdition", enum8);
        setBooleanField(term3335, term3335.getClass(), "showInterimRanking", true);
        setBooleanField(term3335, term3335.getClass(), "showClearStatus", true);
        setBooleanField(term3335, term3335.getClass(), "showGreatBorder", true);
        setBooleanField(term3335, term3335.getClass(), "showExcellentBorder", true);
        setBooleanField(term3335, term3335.getClass(), "showRivalBorder", true);
        setBooleanField(term3335, term3335.getClass(), "showRgoSetting", true);
        setBooleanField(term3335, term3335.getClass(), "contestNowPlayingEnable", true);
        setIntField(term3335, term3335.getClass(), "contestNowPlayingId", -1);
        setIntField(term3335, term3335.getClass(), "contestNowPlayingValue", -1);
        setField(term3335, term3335.getClass(), "contestNowPlayingResultRank", enum9);
        setField(term3335, term3335.getClass(), "contestNowPlayingSpecifier", "");
        setField(term3335, term3335.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term3335, term3335.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term3335, term3335.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term3335, term3335.getClass(), "rivalPdId", -1);
        term3940 = new Integer(-1955890973);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.service.PlayerCustomizeService");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term3335;
        args[1] = term3940;
        callMethod(klass, "buy", argTypes, null, args);
    }

};


