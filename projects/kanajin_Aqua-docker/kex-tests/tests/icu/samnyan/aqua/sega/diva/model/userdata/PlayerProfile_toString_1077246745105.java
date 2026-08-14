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

public class PlayerProfile_toString_1077246745105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4910230;

    public PlayerProfile_toString_1077246745105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4910842 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term4910841 = ((Class) term4910842).getDeclaredField((String) "MISS");
        ((Field) term4910841).setAccessible(true);
        Object enum3157 = ((Field) term4910841).get((Object) null);
        Class<? extends Object> term4911219 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term4911218 = ((Class) term4911219).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term4911218).setAccessible(true);
        Object enum3158 = ((Field) term4911218).get((Object) null);
        Class<? extends Object> term4911502 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term4911501 = ((Class) term4911502).getDeclaredField((String) "NORMAL");
        ((Field) term4911501).setAccessible(true);
        Object enum3159 = ((Field) term4911501).get((Object) null);
        Class<? extends Object> term4911777 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term4911776 = ((Class) term4911777).getDeclaredField((String) "ORIGINAL");
        ((Field) term4911776).setAccessible(true);
        Object enum3160 = ((Field) term4911776).get((Object) null);
        Class<? extends Object> term4912043 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term4912042 = ((Class) term4912043).getDeclaredField((String) "NONE");
        ((Field) term4912042).setAccessible(true);
        Object enum3161 = ((Field) term4912042).get((Object) null);
        term4910230 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term4910353 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4910354 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4910358 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4910230, term4910230.getClass(), "id", -6641955066703803415L);
        setIntField(term4910230, term4910230.getClass(), "pdId", 1313186765);
        setField(term4910230, term4910230.getClass(), "playerName", "xxx");
        setIntField(term4910230, term4910230.getClass(), "vocaloidPoints", 300);
        setIntField(term4910230, term4910230.getClass(), "level", 1);
        setIntField(term4910230, term4910230.getClass(), "levelExp", 559204586);
        setField(term4910230, term4910230.getClass(), "levelTitle", "xxx");
        setIntField(term4910230, term4910230.getClass(), "plateId", -1);
        setIntField(term4910230, term4910230.getClass(), "plateEffectId", -1);
        setField(term4910230, term4910230.getClass(), "passwordStatus", enum3157);
        setField(term4910230, term4910230.getClass(), "password", "**********");
        setBooleanField(term4910230, term4910230.getClass(), "preferPerPvModule", true);
        setBooleanField(term4910230, term4910230.getClass(), "preferCommonModule", false);
        setBooleanField(term4910230, term4910230.getClass(), "usePerPvSkin", false);
        setBooleanField(term4910230, term4910230.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term4910230, term4910230.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term4910230, term4910230.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term4910230, term4910230.getClass(), "usePerPvTouchSliderSe", false);
        setField(term4910230, term4910230.getClass(), "commonModule", "-999,-999,-999");
        setField(term4910230, term4910230.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term4910354, term4910354.getClass(), "year", 2026);
        setShortField(term4910354, term4910354.getClass(), "month", (short) 8);
        setShortField(term4910354, term4910354.getClass(), "day", (short) 11);
        setField(term4910353, term4910353.getClass(), "date", term4910354);
        setByteField(term4910358, term4910358.getClass(), "hour", (byte) 23);
        setByteField(term4910358, term4910358.getClass(), "minute", (byte) 7);
        setByteField(term4910358, term4910358.getClass(), "second", (byte) 42);
        setIntField(term4910358, term4910358.getClass(), "nano", 575073000);
        setField(term4910353, term4910353.getClass(), "time", term4910358);
        setField(term4910230, term4910230.getClass(), "commonModuleSetTime", term4910353);
        setField(term4910230, term4910230.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term4910230, term4910230.getClass(), "commonSkin", -1);
        setIntField(term4910230, term4910230.getClass(), "headphoneVolume", 100);
        setBooleanField(term4910230, term4910230.getClass(), "buttonSeOn", true);
        setIntField(term4910230, term4910230.getClass(), "buttonSeVolume", 100);
        setIntField(term4910230, term4910230.getClass(), "sliderSeVolume", 100);
        setIntField(term4910230, term4910230.getClass(), "buttonSe", -1);
        setIntField(term4910230, term4910230.getClass(), "chainSlideSe", -1);
        setIntField(term4910230, term4910230.getClass(), "slideSe", -1);
        setIntField(term4910230, term4910230.getClass(), "sliderTouchSe", -1);
        setField(term4910230, term4910230.getClass(), "sortMode", enum3158);
        setIntField(term4910230, term4910230.getClass(), "nextPvId", -1);
        setField(term4910230, term4910230.getClass(), "nextDifficulty", enum3159);
        setField(term4910230, term4910230.getClass(), "nextEdition", enum3160);
        setBooleanField(term4910230, term4910230.getClass(), "showInterimRanking", true);
        setBooleanField(term4910230, term4910230.getClass(), "showClearStatus", true);
        setBooleanField(term4910230, term4910230.getClass(), "showGreatBorder", true);
        setBooleanField(term4910230, term4910230.getClass(), "showExcellentBorder", true);
        setBooleanField(term4910230, term4910230.getClass(), "showRivalBorder", true);
        setBooleanField(term4910230, term4910230.getClass(), "showRgoSetting", true);
        setBooleanField(term4910230, term4910230.getClass(), "contestNowPlayingEnable", true);
        setIntField(term4910230, term4910230.getClass(), "contestNowPlayingId", -1);
        setIntField(term4910230, term4910230.getClass(), "contestNowPlayingValue", -1);
        setField(term4910230, term4910230.getClass(), "contestNowPlayingResultRank", enum3161);
        setField(term4910230, term4910230.getClass(), "contestNowPlayingSpecifier", "");
        setField(term4910230, term4910230.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term4910230, term4910230.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term4910230, term4910230.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term4910230, term4910230.getClass(), "rivalPdId", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term4910230, args);
    }

};


