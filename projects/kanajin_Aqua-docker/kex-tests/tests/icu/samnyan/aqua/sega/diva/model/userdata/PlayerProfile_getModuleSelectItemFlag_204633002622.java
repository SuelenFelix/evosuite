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

public class PlayerProfile_getModuleSelectItemFlag_204633002622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term735123;

    public PlayerProfile_getModuleSelectItemFlag_204633002622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term735735 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term735734 = ((Class) term735735).getDeclaredField((String) "MISS");
        ((Field) term735734).setAccessible(true);
        Object enum1597 = ((Field) term735734).get((Object) null);
        Class<? extends Object> term736112 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term736111 = ((Class) term736112).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term736111).setAccessible(true);
        Object enum1598 = ((Field) term736111).get((Object) null);
        Class<? extends Object> term736395 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term736394 = ((Class) term736395).getDeclaredField((String) "NORMAL");
        ((Field) term736394).setAccessible(true);
        Object enum1599 = ((Field) term736394).get((Object) null);
        Class<? extends Object> term736670 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term736669 = ((Class) term736670).getDeclaredField((String) "ORIGINAL");
        ((Field) term736669).setAccessible(true);
        Object enum1600 = ((Field) term736669).get((Object) null);
        Class<? extends Object> term736936 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term736935 = ((Class) term736936).getDeclaredField((String) "NONE");
        ((Field) term736935).setAccessible(true);
        Object enum1601 = ((Field) term736935).get((Object) null);
        term735123 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term735246 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term735247 = newInstance(Class.forName("java.time.LocalDate"));
        Object term735251 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term735123, term735123.getClass(), "id", 970120292495348028L);
        setIntField(term735123, term735123.getClass(), "pdId", 1060963259);
        setField(term735123, term735123.getClass(), "playerName", "xxx");
        setIntField(term735123, term735123.getClass(), "vocaloidPoints", 300);
        setIntField(term735123, term735123.getClass(), "level", 1);
        setIntField(term735123, term735123.getClass(), "levelExp", -1275604693);
        setField(term735123, term735123.getClass(), "levelTitle", "xxx");
        setIntField(term735123, term735123.getClass(), "plateId", -1);
        setIntField(term735123, term735123.getClass(), "plateEffectId", -1);
        setField(term735123, term735123.getClass(), "passwordStatus", enum1597);
        setField(term735123, term735123.getClass(), "password", "**********");
        setBooleanField(term735123, term735123.getClass(), "preferPerPvModule", true);
        setBooleanField(term735123, term735123.getClass(), "preferCommonModule", true);
        setBooleanField(term735123, term735123.getClass(), "usePerPvSkin", false);
        setBooleanField(term735123, term735123.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term735123, term735123.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term735123, term735123.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term735123, term735123.getClass(), "usePerPvTouchSliderSe", false);
        setField(term735123, term735123.getClass(), "commonModule", "-999,-999,-999");
        setField(term735123, term735123.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term735247, term735247.getClass(), "year", 2026);
        setShortField(term735247, term735247.getClass(), "month", (short) 6);
        setShortField(term735247, term735247.getClass(), "day", (short) 29);
        setField(term735246, term735246.getClass(), "date", term735247);
        setByteField(term735251, term735251.getClass(), "hour", (byte) 4);
        setByteField(term735251, term735251.getClass(), "minute", (byte) 29);
        setByteField(term735251, term735251.getClass(), "second", (byte) 14);
        setIntField(term735251, term735251.getClass(), "nano", 901981000);
        setField(term735246, term735246.getClass(), "time", term735251);
        setField(term735123, term735123.getClass(), "commonModuleSetTime", term735246);
        setField(term735123, term735123.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term735123, term735123.getClass(), "commonSkin", -1);
        setIntField(term735123, term735123.getClass(), "headphoneVolume", 100);
        setBooleanField(term735123, term735123.getClass(), "buttonSeOn", true);
        setIntField(term735123, term735123.getClass(), "buttonSeVolume", 100);
        setIntField(term735123, term735123.getClass(), "sliderSeVolume", 100);
        setIntField(term735123, term735123.getClass(), "buttonSe", -1);
        setIntField(term735123, term735123.getClass(), "chainSlideSe", -1);
        setIntField(term735123, term735123.getClass(), "slideSe", -1);
        setIntField(term735123, term735123.getClass(), "sliderTouchSe", -1);
        setField(term735123, term735123.getClass(), "sortMode", enum1598);
        setIntField(term735123, term735123.getClass(), "nextPvId", -1);
        setField(term735123, term735123.getClass(), "nextDifficulty", enum1599);
        setField(term735123, term735123.getClass(), "nextEdition", enum1600);
        setBooleanField(term735123, term735123.getClass(), "showInterimRanking", true);
        setBooleanField(term735123, term735123.getClass(), "showClearStatus", true);
        setBooleanField(term735123, term735123.getClass(), "showGreatBorder", true);
        setBooleanField(term735123, term735123.getClass(), "showExcellentBorder", true);
        setBooleanField(term735123, term735123.getClass(), "showRivalBorder", true);
        setBooleanField(term735123, term735123.getClass(), "showRgoSetting", true);
        setBooleanField(term735123, term735123.getClass(), "contestNowPlayingEnable", false);
        setIntField(term735123, term735123.getClass(), "contestNowPlayingId", -1);
        setIntField(term735123, term735123.getClass(), "contestNowPlayingValue", -1);
        setField(term735123, term735123.getClass(), "contestNowPlayingResultRank", enum1601);
        setField(term735123, term735123.getClass(), "contestNowPlayingSpecifier", "");
        setField(term735123, term735123.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term735123, term735123.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term735123, term735123.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term735123, term735123.getClass(), "rivalPdId", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getModuleSelectItemFlag", argTypes, term735123, args);
    }

};


