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

public class PlayerProfile_isShowClearStatus_19764672037 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term771918;

    public PlayerProfile_isShowClearStatus_19764672037() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term772530 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term772529 = ((Class) term772530).getDeclaredField((String) "MISS");
        ((Field) term772529).setAccessible(true);
        Object enum1672 = ((Field) term772529).get((Object) null);
        Class<? extends Object> term772907 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term772906 = ((Class) term772907).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term772906).setAccessible(true);
        Object enum1673 = ((Field) term772906).get((Object) null);
        Class<? extends Object> term773190 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term773189 = ((Class) term773190).getDeclaredField((String) "NORMAL");
        ((Field) term773189).setAccessible(true);
        Object enum1674 = ((Field) term773189).get((Object) null);
        Class<? extends Object> term773465 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term773464 = ((Class) term773465).getDeclaredField((String) "ORIGINAL");
        ((Field) term773464).setAccessible(true);
        Object enum1675 = ((Field) term773464).get((Object) null);
        Class<? extends Object> term773731 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term773730 = ((Class) term773731).getDeclaredField((String) "NONE");
        ((Field) term773730).setAccessible(true);
        Object enum1676 = ((Field) term773730).get((Object) null);
        term771918 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term772041 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term772042 = newInstance(Class.forName("java.time.LocalDate"));
        Object term772046 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term771918, term771918.getClass(), "id", 3824691451696451167L);
        setIntField(term771918, term771918.getClass(), "pdId", 407640701);
        setField(term771918, term771918.getClass(), "playerName", "xxx");
        setIntField(term771918, term771918.getClass(), "vocaloidPoints", 300);
        setIntField(term771918, term771918.getClass(), "level", 1);
        setIntField(term771918, term771918.getClass(), "levelExp", -55858757);
        setField(term771918, term771918.getClass(), "levelTitle", "xxx");
        setIntField(term771918, term771918.getClass(), "plateId", -1);
        setIntField(term771918, term771918.getClass(), "plateEffectId", -1);
        setField(term771918, term771918.getClass(), "passwordStatus", enum1672);
        setField(term771918, term771918.getClass(), "password", "**********");
        setBooleanField(term771918, term771918.getClass(), "preferPerPvModule", true);
        setBooleanField(term771918, term771918.getClass(), "preferCommonModule", true);
        setBooleanField(term771918, term771918.getClass(), "usePerPvSkin", false);
        setBooleanField(term771918, term771918.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term771918, term771918.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term771918, term771918.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term771918, term771918.getClass(), "usePerPvTouchSliderSe", true);
        setField(term771918, term771918.getClass(), "commonModule", "-999,-999,-999");
        setField(term771918, term771918.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term772042, term772042.getClass(), "year", 2026);
        setShortField(term772042, term772042.getClass(), "month", (short) 6);
        setShortField(term772042, term772042.getClass(), "day", (short) 29);
        setField(term772041, term772041.getClass(), "date", term772042);
        setByteField(term772046, term772046.getClass(), "hour", (byte) 4);
        setByteField(term772046, term772046.getClass(), "minute", (byte) 29);
        setByteField(term772046, term772046.getClass(), "second", (byte) 18);
        setIntField(term772046, term772046.getClass(), "nano", 750775000);
        setField(term772041, term772041.getClass(), "time", term772046);
        setField(term771918, term771918.getClass(), "commonModuleSetTime", term772041);
        setField(term771918, term771918.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term771918, term771918.getClass(), "commonSkin", -1);
        setIntField(term771918, term771918.getClass(), "headphoneVolume", 100);
        setBooleanField(term771918, term771918.getClass(), "buttonSeOn", true);
        setIntField(term771918, term771918.getClass(), "buttonSeVolume", 100);
        setIntField(term771918, term771918.getClass(), "sliderSeVolume", 100);
        setIntField(term771918, term771918.getClass(), "buttonSe", -1);
        setIntField(term771918, term771918.getClass(), "chainSlideSe", -1);
        setIntField(term771918, term771918.getClass(), "slideSe", -1);
        setIntField(term771918, term771918.getClass(), "sliderTouchSe", -1);
        setField(term771918, term771918.getClass(), "sortMode", enum1673);
        setIntField(term771918, term771918.getClass(), "nextPvId", -1);
        setField(term771918, term771918.getClass(), "nextDifficulty", enum1674);
        setField(term771918, term771918.getClass(), "nextEdition", enum1675);
        setBooleanField(term771918, term771918.getClass(), "showInterimRanking", true);
        setBooleanField(term771918, term771918.getClass(), "showClearStatus", true);
        setBooleanField(term771918, term771918.getClass(), "showGreatBorder", true);
        setBooleanField(term771918, term771918.getClass(), "showExcellentBorder", true);
        setBooleanField(term771918, term771918.getClass(), "showRivalBorder", true);
        setBooleanField(term771918, term771918.getClass(), "showRgoSetting", true);
        setBooleanField(term771918, term771918.getClass(), "contestNowPlayingEnable", false);
        setIntField(term771918, term771918.getClass(), "contestNowPlayingId", -1);
        setIntField(term771918, term771918.getClass(), "contestNowPlayingValue", -1);
        setField(term771918, term771918.getClass(), "contestNowPlayingResultRank", enum1676);
        setField(term771918, term771918.getClass(), "contestNowPlayingSpecifier", "");
        setField(term771918, term771918.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term771918, term771918.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term771918, term771918.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term771918, term771918.getClass(), "rivalPdId", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isShowClearStatus", argTypes, term771918, args);
    }

};


