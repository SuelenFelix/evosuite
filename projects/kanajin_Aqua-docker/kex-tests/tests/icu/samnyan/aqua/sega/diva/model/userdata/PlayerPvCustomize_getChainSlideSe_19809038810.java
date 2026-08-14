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

public class PlayerPvCustomize_getChainSlideSe_19809038810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term971946;

    public PlayerPvCustomize_getChainSlideSe_19809038810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term972680 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term972679 = ((Class) term972680).getDeclaredField((String) "MISS");
        ((Field) term972679).setAccessible(true);
        Object enum2070 = ((Field) term972679).get((Object) null);
        Class<? extends Object> term973057 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term973056 = ((Class) term973057).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term973056).setAccessible(true);
        Object enum2071 = ((Field) term973056).get((Object) null);
        Class<? extends Object> term973340 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term973339 = ((Class) term973340).getDeclaredField((String) "NORMAL");
        ((Field) term973339).setAccessible(true);
        Object enum2072 = ((Field) term973339).get((Object) null);
        Class<? extends Object> term973615 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term973614 = ((Class) term973615).getDeclaredField((String) "ORIGINAL");
        ((Field) term973614).setAccessible(true);
        Object enum2073 = ((Field) term973614).get((Object) null);
        Class<? extends Object> term973881 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term973880 = ((Class) term973881).getDeclaredField((String) "NONE");
        ((Field) term973880).setAccessible(true);
        Object enum2074 = ((Field) term973880).get((Object) null);
        term971946 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvCustomize"));
        Object term971948 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term972071 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term972072 = newInstance(Class.forName("java.time.LocalDate"));
        Object term972076 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term971946, term971946.getClass(), "id", -5338413783740215067L);
        setLongField(term971948, term971948.getClass(), "id", -814922776357887557L);
        setIntField(term971948, term971948.getClass(), "pdId", -1974107061);
        setField(term971948, term971948.getClass(), "playerName", "xxx");
        setIntField(term971948, term971948.getClass(), "vocaloidPoints", 300);
        setIntField(term971948, term971948.getClass(), "level", 1);
        setIntField(term971948, term971948.getClass(), "levelExp", -1806271948);
        setField(term971948, term971948.getClass(), "levelTitle", "xxx");
        setIntField(term971948, term971948.getClass(), "plateId", -1);
        setIntField(term971948, term971948.getClass(), "plateEffectId", -1);
        setField(term971948, term971948.getClass(), "passwordStatus", enum2070);
        setField(term971948, term971948.getClass(), "password", "**********");
        setBooleanField(term971948, term971948.getClass(), "preferPerPvModule", true);
        setBooleanField(term971948, term971948.getClass(), "preferCommonModule", true);
        setBooleanField(term971948, term971948.getClass(), "usePerPvSkin", false);
        setBooleanField(term971948, term971948.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term971948, term971948.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term971948, term971948.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term971948, term971948.getClass(), "usePerPvTouchSliderSe", false);
        setField(term971948, term971948.getClass(), "commonModule", "-999,-999,-999");
        setField(term971948, term971948.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term972072, term972072.getClass(), "year", 2026);
        setShortField(term972072, term972072.getClass(), "month", (short) 8);
        setShortField(term972072, term972072.getClass(), "day", (short) 12);
        setField(term972071, term972071.getClass(), "date", term972072);
        setByteField(term972076, term972076.getClass(), "hour", (byte) 2);
        setByteField(term972076, term972076.getClass(), "minute", (byte) 5);
        setByteField(term972076, term972076.getClass(), "second", (byte) 18);
        setIntField(term972076, term972076.getClass(), "nano", 866666000);
        setField(term972071, term972071.getClass(), "time", term972076);
        setField(term971948, term971948.getClass(), "commonModuleSetTime", term972071);
        setField(term971948, term971948.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term971948, term971948.getClass(), "commonSkin", -1);
        setIntField(term971948, term971948.getClass(), "headphoneVolume", 100);
        setBooleanField(term971948, term971948.getClass(), "buttonSeOn", true);
        setIntField(term971948, term971948.getClass(), "buttonSeVolume", 100);
        setIntField(term971948, term971948.getClass(), "sliderSeVolume", 100);
        setIntField(term971948, term971948.getClass(), "buttonSe", -1);
        setIntField(term971948, term971948.getClass(), "chainSlideSe", -1);
        setIntField(term971948, term971948.getClass(), "slideSe", -1);
        setIntField(term971948, term971948.getClass(), "sliderTouchSe", -1);
        setField(term971948, term971948.getClass(), "sortMode", enum2071);
        setIntField(term971948, term971948.getClass(), "nextPvId", -1);
        setField(term971948, term971948.getClass(), "nextDifficulty", enum2072);
        setField(term971948, term971948.getClass(), "nextEdition", enum2073);
        setBooleanField(term971948, term971948.getClass(), "showInterimRanking", true);
        setBooleanField(term971948, term971948.getClass(), "showClearStatus", true);
        setBooleanField(term971948, term971948.getClass(), "showGreatBorder", true);
        setBooleanField(term971948, term971948.getClass(), "showExcellentBorder", true);
        setBooleanField(term971948, term971948.getClass(), "showRivalBorder", true);
        setBooleanField(term971948, term971948.getClass(), "showRgoSetting", true);
        setBooleanField(term971948, term971948.getClass(), "contestNowPlayingEnable", false);
        setIntField(term971948, term971948.getClass(), "contestNowPlayingId", -1);
        setIntField(term971948, term971948.getClass(), "contestNowPlayingValue", -1);
        setField(term971948, term971948.getClass(), "contestNowPlayingResultRank", enum2074);
        setField(term971948, term971948.getClass(), "contestNowPlayingSpecifier", "");
        setField(term971948, term971948.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term971948, term971948.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term971948, term971948.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term971948, term971948.getClass(), "rivalPdId", -1);
        setField(term971946, term971946.getClass(), "pdId", term971948);
        setIntField(term971946, term971946.getClass(), "pvId", -1);
        setField(term971946, term971946.getClass(), "module", "-999,-999,-999");
        setField(term971946, term971946.getClass(), "customize", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setField(term971946, term971946.getClass(), "customizeFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term971946, term971946.getClass(), "skin", -1);
        setIntField(term971946, term971946.getClass(), "buttonSe", -1);
        setIntField(term971946, term971946.getClass(), "slideSe", -1);
        setIntField(term971946, term971946.getClass(), "chainSlideSe", -1);
        setIntField(term971946, term971946.getClass(), "sliderTouchSe", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvCustomize");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getChainSlideSe", argTypes, term971946, args);
    }

};


