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

public class PlayerProfile_getRivalPdId_106580893950 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term803807;

    public PlayerProfile_getRivalPdId_106580893950() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term804419 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term804418 = ((Class) term804419).getDeclaredField((String) "MISS");
        ((Field) term804418).setAccessible(true);
        Object enum1737 = ((Field) term804418).get((Object) null);
        Class<? extends Object> term804796 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term804795 = ((Class) term804796).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term804795).setAccessible(true);
        Object enum1738 = ((Field) term804795).get((Object) null);
        Class<? extends Object> term805079 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term805078 = ((Class) term805079).getDeclaredField((String) "NORMAL");
        ((Field) term805078).setAccessible(true);
        Object enum1739 = ((Field) term805078).get((Object) null);
        Class<? extends Object> term805354 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term805353 = ((Class) term805354).getDeclaredField((String) "ORIGINAL");
        ((Field) term805353).setAccessible(true);
        Object enum1740 = ((Field) term805353).get((Object) null);
        Class<? extends Object> term805620 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term805619 = ((Class) term805620).getDeclaredField((String) "NONE");
        ((Field) term805619).setAccessible(true);
        Object enum1741 = ((Field) term805619).get((Object) null);
        term803807 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term803930 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term803931 = newInstance(Class.forName("java.time.LocalDate"));
        Object term803935 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term803807, term803807.getClass(), "id", 3831994970480278159L);
        setIntField(term803807, term803807.getClass(), "pdId", -2062733514);
        setField(term803807, term803807.getClass(), "playerName", "xxx");
        setIntField(term803807, term803807.getClass(), "vocaloidPoints", 300);
        setIntField(term803807, term803807.getClass(), "level", 1);
        setIntField(term803807, term803807.getClass(), "levelExp", 901520301);
        setField(term803807, term803807.getClass(), "levelTitle", "xxx");
        setIntField(term803807, term803807.getClass(), "plateId", -1);
        setIntField(term803807, term803807.getClass(), "plateEffectId", -1);
        setField(term803807, term803807.getClass(), "passwordStatus", enum1737);
        setField(term803807, term803807.getClass(), "password", "**********");
        setBooleanField(term803807, term803807.getClass(), "preferPerPvModule", true);
        setBooleanField(term803807, term803807.getClass(), "preferCommonModule", false);
        setBooleanField(term803807, term803807.getClass(), "usePerPvSkin", false);
        setBooleanField(term803807, term803807.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term803807, term803807.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term803807, term803807.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term803807, term803807.getClass(), "usePerPvTouchSliderSe", false);
        setField(term803807, term803807.getClass(), "commonModule", "-999,-999,-999");
        setField(term803807, term803807.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term803931, term803931.getClass(), "year", 2026);
        setShortField(term803931, term803931.getClass(), "month", (short) 6);
        setShortField(term803931, term803931.getClass(), "day", (short) 29);
        setField(term803930, term803930.getClass(), "date", term803931);
        setByteField(term803935, term803935.getClass(), "hour", (byte) 4);
        setByteField(term803935, term803935.getClass(), "minute", (byte) 29);
        setByteField(term803935, term803935.getClass(), "second", (byte) 22);
        setIntField(term803935, term803935.getClass(), "nano", 96274000);
        setField(term803930, term803930.getClass(), "time", term803935);
        setField(term803807, term803807.getClass(), "commonModuleSetTime", term803930);
        setField(term803807, term803807.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term803807, term803807.getClass(), "commonSkin", -1);
        setIntField(term803807, term803807.getClass(), "headphoneVolume", 100);
        setBooleanField(term803807, term803807.getClass(), "buttonSeOn", true);
        setIntField(term803807, term803807.getClass(), "buttonSeVolume", 100);
        setIntField(term803807, term803807.getClass(), "sliderSeVolume", 100);
        setIntField(term803807, term803807.getClass(), "buttonSe", -1);
        setIntField(term803807, term803807.getClass(), "chainSlideSe", -1);
        setIntField(term803807, term803807.getClass(), "slideSe", -1);
        setIntField(term803807, term803807.getClass(), "sliderTouchSe", -1);
        setField(term803807, term803807.getClass(), "sortMode", enum1738);
        setIntField(term803807, term803807.getClass(), "nextPvId", -1);
        setField(term803807, term803807.getClass(), "nextDifficulty", enum1739);
        setField(term803807, term803807.getClass(), "nextEdition", enum1740);
        setBooleanField(term803807, term803807.getClass(), "showInterimRanking", true);
        setBooleanField(term803807, term803807.getClass(), "showClearStatus", true);
        setBooleanField(term803807, term803807.getClass(), "showGreatBorder", true);
        setBooleanField(term803807, term803807.getClass(), "showExcellentBorder", true);
        setBooleanField(term803807, term803807.getClass(), "showRivalBorder", true);
        setBooleanField(term803807, term803807.getClass(), "showRgoSetting", true);
        setBooleanField(term803807, term803807.getClass(), "contestNowPlayingEnable", true);
        setIntField(term803807, term803807.getClass(), "contestNowPlayingId", -1);
        setIntField(term803807, term803807.getClass(), "contestNowPlayingValue", -1);
        setField(term803807, term803807.getClass(), "contestNowPlayingResultRank", enum1741);
        setField(term803807, term803807.getClass(), "contestNowPlayingSpecifier", "");
        setField(term803807, term803807.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term803807, term803807.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term803807, term803807.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term803807, term803807.getClass(), "rivalPdId", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRivalPdId", argTypes, term803807, args);
    }

};


