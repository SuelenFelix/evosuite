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

public class PlayerPvCustomize_getPvId_12280495253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term953165;

    public PlayerPvCustomize_getPvId_12280495253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term953899 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term953898 = ((Class) term953899).getDeclaredField((String) "MISS");
        ((Field) term953898).setAccessible(true);
        Object enum2035 = ((Field) term953898).get((Object) null);
        Class<? extends Object> term954276 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term954275 = ((Class) term954276).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term954275).setAccessible(true);
        Object enum2036 = ((Field) term954275).get((Object) null);
        Class<? extends Object> term954559 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term954558 = ((Class) term954559).getDeclaredField((String) "NORMAL");
        ((Field) term954558).setAccessible(true);
        Object enum2037 = ((Field) term954558).get((Object) null);
        Class<? extends Object> term954834 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term954833 = ((Class) term954834).getDeclaredField((String) "ORIGINAL");
        ((Field) term954833).setAccessible(true);
        Object enum2038 = ((Field) term954833).get((Object) null);
        Class<? extends Object> term955100 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term955099 = ((Class) term955100).getDeclaredField((String) "NONE");
        ((Field) term955099).setAccessible(true);
        Object enum2039 = ((Field) term955099).get((Object) null);
        term953165 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvCustomize"));
        Object term953167 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term953290 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term953291 = newInstance(Class.forName("java.time.LocalDate"));
        Object term953295 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term953165, term953165.getClass(), "id", 6545086285386938562L);
        setLongField(term953167, term953167.getClass(), "id", 3951346165629352117L);
        setIntField(term953167, term953167.getClass(), "pdId", 1166664554);
        setField(term953167, term953167.getClass(), "playerName", "xxx");
        setIntField(term953167, term953167.getClass(), "vocaloidPoints", 300);
        setIntField(term953167, term953167.getClass(), "level", 1);
        setIntField(term953167, term953167.getClass(), "levelExp", -1287204441);
        setField(term953167, term953167.getClass(), "levelTitle", "xxx");
        setIntField(term953167, term953167.getClass(), "plateId", -1);
        setIntField(term953167, term953167.getClass(), "plateEffectId", -1);
        setField(term953167, term953167.getClass(), "passwordStatus", enum2035);
        setField(term953167, term953167.getClass(), "password", "**********");
        setBooleanField(term953167, term953167.getClass(), "preferPerPvModule", true);
        setBooleanField(term953167, term953167.getClass(), "preferCommonModule", false);
        setBooleanField(term953167, term953167.getClass(), "usePerPvSkin", false);
        setBooleanField(term953167, term953167.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term953167, term953167.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term953167, term953167.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term953167, term953167.getClass(), "usePerPvTouchSliderSe", false);
        setField(term953167, term953167.getClass(), "commonModule", "-999,-999,-999");
        setField(term953167, term953167.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term953291, term953291.getClass(), "year", 2026);
        setShortField(term953291, term953291.getClass(), "month", (short) 8);
        setShortField(term953291, term953291.getClass(), "day", (short) 12);
        setField(term953290, term953290.getClass(), "date", term953291);
        setByteField(term953295, term953295.getClass(), "hour", (byte) 2);
        setByteField(term953295, term953295.getClass(), "minute", (byte) 5);
        setByteField(term953295, term953295.getClass(), "second", (byte) 17);
        setIntField(term953295, term953295.getClass(), "nano", 109106000);
        setField(term953290, term953290.getClass(), "time", term953295);
        setField(term953167, term953167.getClass(), "commonModuleSetTime", term953290);
        setField(term953167, term953167.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term953167, term953167.getClass(), "commonSkin", -1);
        setIntField(term953167, term953167.getClass(), "headphoneVolume", 100);
        setBooleanField(term953167, term953167.getClass(), "buttonSeOn", true);
        setIntField(term953167, term953167.getClass(), "buttonSeVolume", 100);
        setIntField(term953167, term953167.getClass(), "sliderSeVolume", 100);
        setIntField(term953167, term953167.getClass(), "buttonSe", -1);
        setIntField(term953167, term953167.getClass(), "chainSlideSe", -1);
        setIntField(term953167, term953167.getClass(), "slideSe", -1);
        setIntField(term953167, term953167.getClass(), "sliderTouchSe", -1);
        setField(term953167, term953167.getClass(), "sortMode", enum2036);
        setIntField(term953167, term953167.getClass(), "nextPvId", -1);
        setField(term953167, term953167.getClass(), "nextDifficulty", enum2037);
        setField(term953167, term953167.getClass(), "nextEdition", enum2038);
        setBooleanField(term953167, term953167.getClass(), "showInterimRanking", true);
        setBooleanField(term953167, term953167.getClass(), "showClearStatus", true);
        setBooleanField(term953167, term953167.getClass(), "showGreatBorder", true);
        setBooleanField(term953167, term953167.getClass(), "showExcellentBorder", true);
        setBooleanField(term953167, term953167.getClass(), "showRivalBorder", true);
        setBooleanField(term953167, term953167.getClass(), "showRgoSetting", true);
        setBooleanField(term953167, term953167.getClass(), "contestNowPlayingEnable", false);
        setIntField(term953167, term953167.getClass(), "contestNowPlayingId", -1);
        setIntField(term953167, term953167.getClass(), "contestNowPlayingValue", -1);
        setField(term953167, term953167.getClass(), "contestNowPlayingResultRank", enum2039);
        setField(term953167, term953167.getClass(), "contestNowPlayingSpecifier", "");
        setField(term953167, term953167.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term953167, term953167.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term953167, term953167.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term953167, term953167.getClass(), "rivalPdId", -1);
        setField(term953165, term953165.getClass(), "pdId", term953167);
        setIntField(term953165, term953165.getClass(), "pvId", -1);
        setField(term953165, term953165.getClass(), "module", "-999,-999,-999");
        setField(term953165, term953165.getClass(), "customize", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setField(term953165, term953165.getClass(), "customizeFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term953165, term953165.getClass(), "skin", -1);
        setIntField(term953165, term953165.getClass(), "buttonSe", -1);
        setIntField(term953165, term953165.getClass(), "slideSe", -1);
        setIntField(term953165, term953165.getClass(), "chainSlideSe", -1);
        setIntField(term953165, term953165.getClass(), "sliderTouchSe", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvCustomize");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPvId", argTypes, term953165, args);
    }

};


