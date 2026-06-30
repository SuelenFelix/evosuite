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

public class PlayerInventory_toString_175597842611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term559094;

    public PlayerInventory_toString_175597842611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term559095 = new Long(-4325723315152823407L);
        Class<? extends Object> term559733 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term559732 = ((Class) term559733).getDeclaredField((String) "MISS");
        ((Field) term559732).setAccessible(true);
        Object enum1222 = ((Field) term559732).get((Object) null);
        Class<? extends Object> term560110 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term560109 = ((Class) term560110).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term560109).setAccessible(true);
        Object enum1223 = ((Field) term560109).get((Object) null);
        Class<? extends Object> term560393 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term560392 = ((Class) term560393).getDeclaredField((String) "NORMAL");
        ((Field) term560392).setAccessible(true);
        Object enum1224 = ((Field) term560392).get((Object) null);
        Class<? extends Object> term560668 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term560667 = ((Class) term560668).getDeclaredField((String) "ORIGINAL");
        ((Field) term560667).setAccessible(true);
        Object enum1225 = ((Field) term560667).get((Object) null);
        Class<? extends Object> term560934 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term560933 = ((Class) term560934).getDeclaredField((String) "NONE");
        ((Field) term560933).setAccessible(true);
        Object enum1226 = ((Field) term560933).get((Object) null);
        term559094 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerInventory"));
        Object term559097 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term559220 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term559221 = newInstance(Class.forName("java.time.LocalDate"));
        Object term559225 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term559094, term559094.getClass(), "id", term559095);
        setLongField(term559097, term559097.getClass(), "id", 4552367707739103094L);
        setIntField(term559097, term559097.getClass(), "pdId", -840076719);
        setField(term559097, term559097.getClass(), "playerName", "xxx");
        setIntField(term559097, term559097.getClass(), "vocaloidPoints", 300);
        setIntField(term559097, term559097.getClass(), "level", 1);
        setIntField(term559097, term559097.getClass(), "levelExp", 2002762153);
        setField(term559097, term559097.getClass(), "levelTitle", "xxx");
        setIntField(term559097, term559097.getClass(), "plateId", -1);
        setIntField(term559097, term559097.getClass(), "plateEffectId", -1);
        setField(term559097, term559097.getClass(), "passwordStatus", enum1222);
        setField(term559097, term559097.getClass(), "password", "**********");
        setBooleanField(term559097, term559097.getClass(), "preferPerPvModule", true);
        setBooleanField(term559097, term559097.getClass(), "preferCommonModule", false);
        setBooleanField(term559097, term559097.getClass(), "usePerPvSkin", false);
        setBooleanField(term559097, term559097.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term559097, term559097.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term559097, term559097.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term559097, term559097.getClass(), "usePerPvTouchSliderSe", true);
        setField(term559097, term559097.getClass(), "commonModule", "-999,-999,-999");
        setField(term559097, term559097.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term559221, term559221.getClass(), "year", 2026);
        setShortField(term559221, term559221.getClass(), "month", (short) 6);
        setShortField(term559221, term559221.getClass(), "day", (short) 29);
        setField(term559220, term559220.getClass(), "date", term559221);
        setByteField(term559225, term559225.getClass(), "hour", (byte) 4);
        setByteField(term559225, term559225.getClass(), "minute", (byte) 28);
        setByteField(term559225, term559225.getClass(), "second", (byte) 43);
        setIntField(term559225, term559225.getClass(), "nano", 201422000);
        setField(term559220, term559220.getClass(), "time", term559225);
        setField(term559097, term559097.getClass(), "commonModuleSetTime", term559220);
        setField(term559097, term559097.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term559097, term559097.getClass(), "commonSkin", -1);
        setIntField(term559097, term559097.getClass(), "headphoneVolume", 100);
        setBooleanField(term559097, term559097.getClass(), "buttonSeOn", true);
        setIntField(term559097, term559097.getClass(), "buttonSeVolume", 100);
        setIntField(term559097, term559097.getClass(), "sliderSeVolume", 100);
        setIntField(term559097, term559097.getClass(), "buttonSe", -1);
        setIntField(term559097, term559097.getClass(), "chainSlideSe", -1);
        setIntField(term559097, term559097.getClass(), "slideSe", -1);
        setIntField(term559097, term559097.getClass(), "sliderTouchSe", -1);
        setField(term559097, term559097.getClass(), "sortMode", enum1223);
        setIntField(term559097, term559097.getClass(), "nextPvId", -1);
        setField(term559097, term559097.getClass(), "nextDifficulty", enum1224);
        setField(term559097, term559097.getClass(), "nextEdition", enum1225);
        setBooleanField(term559097, term559097.getClass(), "showInterimRanking", true);
        setBooleanField(term559097, term559097.getClass(), "showClearStatus", true);
        setBooleanField(term559097, term559097.getClass(), "showGreatBorder", true);
        setBooleanField(term559097, term559097.getClass(), "showExcellentBorder", true);
        setBooleanField(term559097, term559097.getClass(), "showRivalBorder", true);
        setBooleanField(term559097, term559097.getClass(), "showRgoSetting", true);
        setBooleanField(term559097, term559097.getClass(), "contestNowPlayingEnable", true);
        setIntField(term559097, term559097.getClass(), "contestNowPlayingId", -1);
        setIntField(term559097, term559097.getClass(), "contestNowPlayingValue", -1);
        setField(term559097, term559097.getClass(), "contestNowPlayingResultRank", enum1226);
        setField(term559097, term559097.getClass(), "contestNowPlayingSpecifier", "");
        setField(term559097, term559097.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term559097, term559097.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term559097, term559097.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term559097, term559097.getClass(), "rivalPdId", -1);
        setField(term559094, term559094.getClass(), "pdId", term559097);
        setField(term559094, term559094.getClass(), "value", "RCOqfVsRHt");
        setField(term559094, term559094.getClass(), "type", "TSyCeEZPaT");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerInventory");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term559094, args);
    }

};


