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

public class PlayerPvCustomize_getId_20222663631 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term947799;

    public PlayerPvCustomize_getId_20222663631() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term948533 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term948532 = ((Class) term948533).getDeclaredField((String) "MISS");
        ((Field) term948532).setAccessible(true);
        Object enum2025 = ((Field) term948532).get((Object) null);
        Class<? extends Object> term948910 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term948909 = ((Class) term948910).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term948909).setAccessible(true);
        Object enum2026 = ((Field) term948909).get((Object) null);
        Class<? extends Object> term949193 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term949192 = ((Class) term949193).getDeclaredField((String) "NORMAL");
        ((Field) term949192).setAccessible(true);
        Object enum2027 = ((Field) term949192).get((Object) null);
        Class<? extends Object> term949468 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term949467 = ((Class) term949468).getDeclaredField((String) "ORIGINAL");
        ((Field) term949467).setAccessible(true);
        Object enum2028 = ((Field) term949467).get((Object) null);
        Class<? extends Object> term949734 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term949733 = ((Class) term949734).getDeclaredField((String) "NONE");
        ((Field) term949733).setAccessible(true);
        Object enum2029 = ((Field) term949733).get((Object) null);
        term947799 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvCustomize"));
        Object term947801 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term947924 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term947925 = newInstance(Class.forName("java.time.LocalDate"));
        Object term947929 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term947799, term947799.getClass(), "id", -8842842172497711872L);
        setLongField(term947801, term947801.getClass(), "id", -5367775625638780650L);
        setIntField(term947801, term947801.getClass(), "pdId", -881632231);
        setField(term947801, term947801.getClass(), "playerName", "xxx");
        setIntField(term947801, term947801.getClass(), "vocaloidPoints", 300);
        setIntField(term947801, term947801.getClass(), "level", 1);
        setIntField(term947801, term947801.getClass(), "levelExp", -1285148224);
        setField(term947801, term947801.getClass(), "levelTitle", "xxx");
        setIntField(term947801, term947801.getClass(), "plateId", -1);
        setIntField(term947801, term947801.getClass(), "plateEffectId", -1);
        setField(term947801, term947801.getClass(), "passwordStatus", enum2025);
        setField(term947801, term947801.getClass(), "password", "**********");
        setBooleanField(term947801, term947801.getClass(), "preferPerPvModule", true);
        setBooleanField(term947801, term947801.getClass(), "preferCommonModule", true);
        setBooleanField(term947801, term947801.getClass(), "usePerPvSkin", true);
        setBooleanField(term947801, term947801.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term947801, term947801.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term947801, term947801.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term947801, term947801.getClass(), "usePerPvTouchSliderSe", false);
        setField(term947801, term947801.getClass(), "commonModule", "-999,-999,-999");
        setField(term947801, term947801.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term947925, term947925.getClass(), "year", 2026);
        setShortField(term947925, term947925.getClass(), "month", (short) 8);
        setShortField(term947925, term947925.getClass(), "day", (short) 12);
        setField(term947924, term947924.getClass(), "date", term947925);
        setByteField(term947929, term947929.getClass(), "hour", (byte) 2);
        setByteField(term947929, term947929.getClass(), "minute", (byte) 5);
        setByteField(term947929, term947929.getClass(), "second", (byte) 16);
        setIntField(term947929, term947929.getClass(), "nano", 608459000);
        setField(term947924, term947924.getClass(), "time", term947929);
        setField(term947801, term947801.getClass(), "commonModuleSetTime", term947924);
        setField(term947801, term947801.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term947801, term947801.getClass(), "commonSkin", -1);
        setIntField(term947801, term947801.getClass(), "headphoneVolume", 100);
        setBooleanField(term947801, term947801.getClass(), "buttonSeOn", true);
        setIntField(term947801, term947801.getClass(), "buttonSeVolume", 100);
        setIntField(term947801, term947801.getClass(), "sliderSeVolume", 100);
        setIntField(term947801, term947801.getClass(), "buttonSe", -1);
        setIntField(term947801, term947801.getClass(), "chainSlideSe", -1);
        setIntField(term947801, term947801.getClass(), "slideSe", -1);
        setIntField(term947801, term947801.getClass(), "sliderTouchSe", -1);
        setField(term947801, term947801.getClass(), "sortMode", enum2026);
        setIntField(term947801, term947801.getClass(), "nextPvId", -1);
        setField(term947801, term947801.getClass(), "nextDifficulty", enum2027);
        setField(term947801, term947801.getClass(), "nextEdition", enum2028);
        setBooleanField(term947801, term947801.getClass(), "showInterimRanking", true);
        setBooleanField(term947801, term947801.getClass(), "showClearStatus", true);
        setBooleanField(term947801, term947801.getClass(), "showGreatBorder", true);
        setBooleanField(term947801, term947801.getClass(), "showExcellentBorder", true);
        setBooleanField(term947801, term947801.getClass(), "showRivalBorder", true);
        setBooleanField(term947801, term947801.getClass(), "showRgoSetting", true);
        setBooleanField(term947801, term947801.getClass(), "contestNowPlayingEnable", true);
        setIntField(term947801, term947801.getClass(), "contestNowPlayingId", -1);
        setIntField(term947801, term947801.getClass(), "contestNowPlayingValue", -1);
        setField(term947801, term947801.getClass(), "contestNowPlayingResultRank", enum2029);
        setField(term947801, term947801.getClass(), "contestNowPlayingSpecifier", "");
        setField(term947801, term947801.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term947801, term947801.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term947801, term947801.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term947801, term947801.getClass(), "rivalPdId", -1);
        setField(term947799, term947799.getClass(), "pdId", term947801);
        setIntField(term947799, term947799.getClass(), "pvId", -1);
        setField(term947799, term947799.getClass(), "module", "-999,-999,-999");
        setField(term947799, term947799.getClass(), "customize", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setField(term947799, term947799.getClass(), "customizeFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term947799, term947799.getClass(), "skin", -1);
        setIntField(term947799, term947799.getClass(), "buttonSe", -1);
        setIntField(term947799, term947799.getClass(), "slideSe", -1);
        setIntField(term947799, term947799.getClass(), "chainSlideSe", -1);
        setIntField(term947799, term947799.getClass(), "sliderTouchSe", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvCustomize");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term947799, args);
    }

};


