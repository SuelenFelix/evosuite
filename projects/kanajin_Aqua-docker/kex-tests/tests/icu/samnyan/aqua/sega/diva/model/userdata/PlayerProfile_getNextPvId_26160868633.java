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

public class PlayerProfile_getNextPvId_26160868633 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term762106;

    public PlayerProfile_getNextPvId_26160868633() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term762718 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term762717 = ((Class) term762718).getDeclaredField((String) "MISS");
        ((Field) term762717).setAccessible(true);
        Object enum1652 = ((Field) term762717).get((Object) null);
        Class<? extends Object> term763095 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term763094 = ((Class) term763095).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term763094).setAccessible(true);
        Object enum1653 = ((Field) term763094).get((Object) null);
        Class<? extends Object> term763378 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term763377 = ((Class) term763378).getDeclaredField((String) "NORMAL");
        ((Field) term763377).setAccessible(true);
        Object enum1654 = ((Field) term763377).get((Object) null);
        Class<? extends Object> term763653 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term763652 = ((Class) term763653).getDeclaredField((String) "ORIGINAL");
        ((Field) term763652).setAccessible(true);
        Object enum1655 = ((Field) term763652).get((Object) null);
        Class<? extends Object> term763919 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term763918 = ((Class) term763919).getDeclaredField((String) "NONE");
        ((Field) term763918).setAccessible(true);
        Object enum1656 = ((Field) term763918).get((Object) null);
        term762106 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term762229 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term762230 = newInstance(Class.forName("java.time.LocalDate"));
        Object term762234 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term762106, term762106.getClass(), "id", -3058119213533262883L);
        setIntField(term762106, term762106.getClass(), "pdId", -179816637);
        setField(term762106, term762106.getClass(), "playerName", "xxx");
        setIntField(term762106, term762106.getClass(), "vocaloidPoints", 300);
        setIntField(term762106, term762106.getClass(), "level", 1);
        setIntField(term762106, term762106.getClass(), "levelExp", -1304594615);
        setField(term762106, term762106.getClass(), "levelTitle", "xxx");
        setIntField(term762106, term762106.getClass(), "plateId", -1);
        setIntField(term762106, term762106.getClass(), "plateEffectId", -1);
        setField(term762106, term762106.getClass(), "passwordStatus", enum1652);
        setField(term762106, term762106.getClass(), "password", "**********");
        setBooleanField(term762106, term762106.getClass(), "preferPerPvModule", true);
        setBooleanField(term762106, term762106.getClass(), "preferCommonModule", true);
        setBooleanField(term762106, term762106.getClass(), "usePerPvSkin", true);
        setBooleanField(term762106, term762106.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term762106, term762106.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term762106, term762106.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term762106, term762106.getClass(), "usePerPvTouchSliderSe", true);
        setField(term762106, term762106.getClass(), "commonModule", "-999,-999,-999");
        setField(term762106, term762106.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term762230, term762230.getClass(), "year", 2026);
        setShortField(term762230, term762230.getClass(), "month", (short) 8);
        setShortField(term762230, term762230.getClass(), "day", (short) 12);
        setField(term762229, term762229.getClass(), "date", term762230);
        setByteField(term762234, term762234.getClass(), "hour", (byte) 2);
        setByteField(term762234, term762234.getClass(), "minute", (byte) 4);
        setByteField(term762234, term762234.getClass(), "second", (byte) 30);
        setIntField(term762234, term762234.getClass(), "nano", 966327000);
        setField(term762229, term762229.getClass(), "time", term762234);
        setField(term762106, term762106.getClass(), "commonModuleSetTime", term762229);
        setField(term762106, term762106.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term762106, term762106.getClass(), "commonSkin", -1);
        setIntField(term762106, term762106.getClass(), "headphoneVolume", 100);
        setBooleanField(term762106, term762106.getClass(), "buttonSeOn", true);
        setIntField(term762106, term762106.getClass(), "buttonSeVolume", 100);
        setIntField(term762106, term762106.getClass(), "sliderSeVolume", 100);
        setIntField(term762106, term762106.getClass(), "buttonSe", -1);
        setIntField(term762106, term762106.getClass(), "chainSlideSe", -1);
        setIntField(term762106, term762106.getClass(), "slideSe", -1);
        setIntField(term762106, term762106.getClass(), "sliderTouchSe", -1);
        setField(term762106, term762106.getClass(), "sortMode", enum1653);
        setIntField(term762106, term762106.getClass(), "nextPvId", -1);
        setField(term762106, term762106.getClass(), "nextDifficulty", enum1654);
        setField(term762106, term762106.getClass(), "nextEdition", enum1655);
        setBooleanField(term762106, term762106.getClass(), "showInterimRanking", true);
        setBooleanField(term762106, term762106.getClass(), "showClearStatus", true);
        setBooleanField(term762106, term762106.getClass(), "showGreatBorder", true);
        setBooleanField(term762106, term762106.getClass(), "showExcellentBorder", true);
        setBooleanField(term762106, term762106.getClass(), "showRivalBorder", true);
        setBooleanField(term762106, term762106.getClass(), "showRgoSetting", true);
        setBooleanField(term762106, term762106.getClass(), "contestNowPlayingEnable", true);
        setIntField(term762106, term762106.getClass(), "contestNowPlayingId", -1);
        setIntField(term762106, term762106.getClass(), "contestNowPlayingValue", -1);
        setField(term762106, term762106.getClass(), "contestNowPlayingResultRank", enum1656);
        setField(term762106, term762106.getClass(), "contestNowPlayingSpecifier", "");
        setField(term762106, term762106.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term762106, term762106.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term762106, term762106.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term762106, term762106.getClass(), "rivalPdId", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNextPvId", argTypes, term762106, args);
    }

};


