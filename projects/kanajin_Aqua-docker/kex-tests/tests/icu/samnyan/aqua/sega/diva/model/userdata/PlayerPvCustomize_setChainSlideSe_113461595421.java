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
import java.lang.Integer;

public class PlayerPvCustomize_setChainSlideSe_113461595421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1002562;
     Object term1003289;

    public PlayerPvCustomize_setChainSlideSe_113461595421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1003298 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term1003297 = ((Class) term1003298).getDeclaredField((String) "MISS");
        ((Field) term1003297).setAccessible(true);
        Object enum2125 = ((Field) term1003297).get((Object) null);
        Class<? extends Object> term1003675 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term1003674 = ((Class) term1003675).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term1003674).setAccessible(true);
        Object enum2126 = ((Field) term1003674).get((Object) null);
        Class<? extends Object> term1003958 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term1003957 = ((Class) term1003958).getDeclaredField((String) "NORMAL");
        ((Field) term1003957).setAccessible(true);
        Object enum2127 = ((Field) term1003957).get((Object) null);
        Class<? extends Object> term1004233 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term1004232 = ((Class) term1004233).getDeclaredField((String) "ORIGINAL");
        ((Field) term1004232).setAccessible(true);
        Object enum2128 = ((Field) term1004232).get((Object) null);
        Class<? extends Object> term1004499 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term1004498 = ((Class) term1004499).getDeclaredField((String) "NONE");
        ((Field) term1004498).setAccessible(true);
        Object enum2129 = ((Field) term1004498).get((Object) null);
        term1002562 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvCustomize"));
        Object term1002564 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term1002687 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1002688 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1002692 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term1002562, term1002562.getClass(), "id", -590890905395927244L);
        setLongField(term1002564, term1002564.getClass(), "id", 6978548804004471804L);
        setIntField(term1002564, term1002564.getClass(), "pdId", 1304790955);
        setField(term1002564, term1002564.getClass(), "playerName", "xxx");
        setIntField(term1002564, term1002564.getClass(), "vocaloidPoints", 300);
        setIntField(term1002564, term1002564.getClass(), "level", 1);
        setIntField(term1002564, term1002564.getClass(), "levelExp", -1412824084);
        setField(term1002564, term1002564.getClass(), "levelTitle", "xxx");
        setIntField(term1002564, term1002564.getClass(), "plateId", -1);
        setIntField(term1002564, term1002564.getClass(), "plateEffectId", -1);
        setField(term1002564, term1002564.getClass(), "passwordStatus", enum2125);
        setField(term1002564, term1002564.getClass(), "password", "**********");
        setBooleanField(term1002564, term1002564.getClass(), "preferPerPvModule", true);
        setBooleanField(term1002564, term1002564.getClass(), "preferCommonModule", false);
        setBooleanField(term1002564, term1002564.getClass(), "usePerPvSkin", false);
        setBooleanField(term1002564, term1002564.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term1002564, term1002564.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term1002564, term1002564.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term1002564, term1002564.getClass(), "usePerPvTouchSliderSe", true);
        setField(term1002564, term1002564.getClass(), "commonModule", "-999,-999,-999");
        setField(term1002564, term1002564.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term1002688, term1002688.getClass(), "year", 2026);
        setShortField(term1002688, term1002688.getClass(), "month", (short) 6);
        setShortField(term1002688, term1002688.getClass(), "day", (short) 29);
        setField(term1002687, term1002687.getClass(), "date", term1002688);
        setByteField(term1002692, term1002692.getClass(), "hour", (byte) 4);
        setByteField(term1002692, term1002692.getClass(), "minute", (byte) 30);
        setByteField(term1002692, term1002692.getClass(), "second", (byte) 9);
        setIntField(term1002692, term1002692.getClass(), "nano", 508440000);
        setField(term1002687, term1002687.getClass(), "time", term1002692);
        setField(term1002564, term1002564.getClass(), "commonModuleSetTime", term1002687);
        setField(term1002564, term1002564.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term1002564, term1002564.getClass(), "commonSkin", -1);
        setIntField(term1002564, term1002564.getClass(), "headphoneVolume", 100);
        setBooleanField(term1002564, term1002564.getClass(), "buttonSeOn", true);
        setIntField(term1002564, term1002564.getClass(), "buttonSeVolume", 100);
        setIntField(term1002564, term1002564.getClass(), "sliderSeVolume", 100);
        setIntField(term1002564, term1002564.getClass(), "buttonSe", -1);
        setIntField(term1002564, term1002564.getClass(), "chainSlideSe", -1);
        setIntField(term1002564, term1002564.getClass(), "slideSe", -1);
        setIntField(term1002564, term1002564.getClass(), "sliderTouchSe", -1);
        setField(term1002564, term1002564.getClass(), "sortMode", enum2126);
        setIntField(term1002564, term1002564.getClass(), "nextPvId", -1);
        setField(term1002564, term1002564.getClass(), "nextDifficulty", enum2127);
        setField(term1002564, term1002564.getClass(), "nextEdition", enum2128);
        setBooleanField(term1002564, term1002564.getClass(), "showInterimRanking", true);
        setBooleanField(term1002564, term1002564.getClass(), "showClearStatus", true);
        setBooleanField(term1002564, term1002564.getClass(), "showGreatBorder", true);
        setBooleanField(term1002564, term1002564.getClass(), "showExcellentBorder", true);
        setBooleanField(term1002564, term1002564.getClass(), "showRivalBorder", true);
        setBooleanField(term1002564, term1002564.getClass(), "showRgoSetting", true);
        setBooleanField(term1002564, term1002564.getClass(), "contestNowPlayingEnable", true);
        setIntField(term1002564, term1002564.getClass(), "contestNowPlayingId", -1);
        setIntField(term1002564, term1002564.getClass(), "contestNowPlayingValue", -1);
        setField(term1002564, term1002564.getClass(), "contestNowPlayingResultRank", enum2129);
        setField(term1002564, term1002564.getClass(), "contestNowPlayingSpecifier", "");
        setField(term1002564, term1002564.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term1002564, term1002564.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term1002564, term1002564.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term1002564, term1002564.getClass(), "rivalPdId", -1);
        setField(term1002562, term1002562.getClass(), "pdId", term1002564);
        setIntField(term1002562, term1002562.getClass(), "pvId", -1);
        setField(term1002562, term1002562.getClass(), "module", "-999,-999,-999");
        setField(term1002562, term1002562.getClass(), "customize", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setField(term1002562, term1002562.getClass(), "customizeFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term1002562, term1002562.getClass(), "skin", -1);
        setIntField(term1002562, term1002562.getClass(), "buttonSe", -1);
        setIntField(term1002562, term1002562.getClass(), "slideSe", -1);
        setIntField(term1002562, term1002562.getClass(), "chainSlideSe", -1);
        setIntField(term1002562, term1002562.getClass(), "sliderTouchSe", -1);
        term1003289 = new Integer(659034364);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvCustomize");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1003289;
        callMethod(klass, "setChainSlideSe", argTypes, term1002562, args);
    }

};


