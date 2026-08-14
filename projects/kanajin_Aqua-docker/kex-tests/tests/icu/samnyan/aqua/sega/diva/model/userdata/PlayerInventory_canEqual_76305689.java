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
import java.lang.Long;
import java.lang.Object;
import java.lang.String;

public class PlayerInventory_canEqual_76305689 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term554093;
     Object term554725;

    public PlayerInventory_canEqual_76305689() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term554094 = new Long(-2813493605142626659L);
        Class<? extends Object> term554733 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term554732 = ((Class) term554733).getDeclaredField((String) "MISS");
        ((Field) term554732).setAccessible(true);
        Object enum1212 = ((Field) term554732).get((Object) null);
        Class<? extends Object> term555110 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term555109 = ((Class) term555110).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term555109).setAccessible(true);
        Object enum1213 = ((Field) term555109).get((Object) null);
        Class<? extends Object> term555393 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term555392 = ((Class) term555393).getDeclaredField((String) "NORMAL");
        ((Field) term555392).setAccessible(true);
        Object enum1214 = ((Field) term555392).get((Object) null);
        Class<? extends Object> term555668 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term555667 = ((Class) term555668).getDeclaredField((String) "ORIGINAL");
        ((Field) term555667).setAccessible(true);
        Object enum1215 = ((Field) term555667).get((Object) null);
        Class<? extends Object> term555934 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term555933 = ((Class) term555934).getDeclaredField((String) "NONE");
        ((Field) term555933).setAccessible(true);
        Object enum1216 = ((Field) term555933).get((Object) null);
        term554093 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerInventory"));
        Object term554096 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term554219 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term554220 = newInstance(Class.forName("java.time.LocalDate"));
        Object term554224 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term554093, term554093.getClass(), "id", term554094);
        setLongField(term554096, term554096.getClass(), "id", -5207216109884759743L);
        setIntField(term554096, term554096.getClass(), "pdId", -938772433);
        setField(term554096, term554096.getClass(), "playerName", "xxx");
        setIntField(term554096, term554096.getClass(), "vocaloidPoints", 300);
        setIntField(term554096, term554096.getClass(), "level", 1);
        setIntField(term554096, term554096.getClass(), "levelExp", 46527533);
        setField(term554096, term554096.getClass(), "levelTitle", "xxx");
        setIntField(term554096, term554096.getClass(), "plateId", -1);
        setIntField(term554096, term554096.getClass(), "plateEffectId", -1);
        setField(term554096, term554096.getClass(), "passwordStatus", enum1212);
        setField(term554096, term554096.getClass(), "password", "**********");
        setBooleanField(term554096, term554096.getClass(), "preferPerPvModule", true);
        setBooleanField(term554096, term554096.getClass(), "preferCommonModule", true);
        setBooleanField(term554096, term554096.getClass(), "usePerPvSkin", false);
        setBooleanField(term554096, term554096.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term554096, term554096.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term554096, term554096.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term554096, term554096.getClass(), "usePerPvTouchSliderSe", false);
        setField(term554096, term554096.getClass(), "commonModule", "-999,-999,-999");
        setField(term554096, term554096.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term554220, term554220.getClass(), "year", 2026);
        setShortField(term554220, term554220.getClass(), "month", (short) 8);
        setShortField(term554220, term554220.getClass(), "day", (short) 12);
        setField(term554219, term554219.getClass(), "date", term554220);
        setByteField(term554224, term554224.getClass(), "hour", (byte) 2);
        setByteField(term554224, term554224.getClass(), "minute", (byte) 3);
        setByteField(term554224, term554224.getClass(), "second", (byte) 56);
        setIntField(term554224, term554224.getClass(), "nano", 827145000);
        setField(term554219, term554219.getClass(), "time", term554224);
        setField(term554096, term554096.getClass(), "commonModuleSetTime", term554219);
        setField(term554096, term554096.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term554096, term554096.getClass(), "commonSkin", -1);
        setIntField(term554096, term554096.getClass(), "headphoneVolume", 100);
        setBooleanField(term554096, term554096.getClass(), "buttonSeOn", true);
        setIntField(term554096, term554096.getClass(), "buttonSeVolume", 100);
        setIntField(term554096, term554096.getClass(), "sliderSeVolume", 100);
        setIntField(term554096, term554096.getClass(), "buttonSe", -1);
        setIntField(term554096, term554096.getClass(), "chainSlideSe", -1);
        setIntField(term554096, term554096.getClass(), "slideSe", -1);
        setIntField(term554096, term554096.getClass(), "sliderTouchSe", -1);
        setField(term554096, term554096.getClass(), "sortMode", enum1213);
        setIntField(term554096, term554096.getClass(), "nextPvId", -1);
        setField(term554096, term554096.getClass(), "nextDifficulty", enum1214);
        setField(term554096, term554096.getClass(), "nextEdition", enum1215);
        setBooleanField(term554096, term554096.getClass(), "showInterimRanking", true);
        setBooleanField(term554096, term554096.getClass(), "showClearStatus", true);
        setBooleanField(term554096, term554096.getClass(), "showGreatBorder", true);
        setBooleanField(term554096, term554096.getClass(), "showExcellentBorder", true);
        setBooleanField(term554096, term554096.getClass(), "showRivalBorder", true);
        setBooleanField(term554096, term554096.getClass(), "showRgoSetting", true);
        setBooleanField(term554096, term554096.getClass(), "contestNowPlayingEnable", true);
        setIntField(term554096, term554096.getClass(), "contestNowPlayingId", -1);
        setIntField(term554096, term554096.getClass(), "contestNowPlayingValue", -1);
        setField(term554096, term554096.getClass(), "contestNowPlayingResultRank", enum1216);
        setField(term554096, term554096.getClass(), "contestNowPlayingSpecifier", "");
        setField(term554096, term554096.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term554096, term554096.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term554096, term554096.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term554096, term554096.getClass(), "rivalPdId", -1);
        setField(term554093, term554093.getClass(), "pdId", term554096);
        setField(term554093, term554093.getClass(), "value", "TXyHhqeCjR");
        setField(term554093, term554093.getClass(), "type", "lZIgPZPgTu");
        term554725 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerInventory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term554725;
        callMethod(klass, "canEqual", argTypes, term554093, args);
    }

};


