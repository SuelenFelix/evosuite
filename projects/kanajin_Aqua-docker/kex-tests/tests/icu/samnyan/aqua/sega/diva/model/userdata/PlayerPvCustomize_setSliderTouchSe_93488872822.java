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
import java.lang.Integer;

public class PlayerPvCustomize_setSliderTouchSe_93488872822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1005247;
     Object term1005974;

    public PlayerPvCustomize_setSliderTouchSe_93488872822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1005983 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term1005982 = ((Class) term1005983).getDeclaredField((String) "MISS");
        ((Field) term1005982).setAccessible(true);
        Object enum2130 = ((Field) term1005982).get((Object) null);
        Class<? extends Object> term1006360 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term1006359 = ((Class) term1006360).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term1006359).setAccessible(true);
        Object enum2131 = ((Field) term1006359).get((Object) null);
        Class<? extends Object> term1006643 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term1006642 = ((Class) term1006643).getDeclaredField((String) "NORMAL");
        ((Field) term1006642).setAccessible(true);
        Object enum2132 = ((Field) term1006642).get((Object) null);
        Class<? extends Object> term1006918 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term1006917 = ((Class) term1006918).getDeclaredField((String) "ORIGINAL");
        ((Field) term1006917).setAccessible(true);
        Object enum2133 = ((Field) term1006917).get((Object) null);
        Class<? extends Object> term1007184 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term1007183 = ((Class) term1007184).getDeclaredField((String) "NONE");
        ((Field) term1007183).setAccessible(true);
        Object enum2134 = ((Field) term1007183).get((Object) null);
        term1005247 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvCustomize"));
        Object term1005249 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term1005372 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1005373 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1005377 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term1005247, term1005247.getClass(), "id", -8957441653116712448L);
        setLongField(term1005249, term1005249.getClass(), "id", -5761087225966065493L);
        setIntField(term1005249, term1005249.getClass(), "pdId", 671129726);
        setField(term1005249, term1005249.getClass(), "playerName", "xxx");
        setIntField(term1005249, term1005249.getClass(), "vocaloidPoints", 300);
        setIntField(term1005249, term1005249.getClass(), "level", 1);
        setIntField(term1005249, term1005249.getClass(), "levelExp", -1217066846);
        setField(term1005249, term1005249.getClass(), "levelTitle", "xxx");
        setIntField(term1005249, term1005249.getClass(), "plateId", -1);
        setIntField(term1005249, term1005249.getClass(), "plateEffectId", -1);
        setField(term1005249, term1005249.getClass(), "passwordStatus", enum2130);
        setField(term1005249, term1005249.getClass(), "password", "**********");
        setBooleanField(term1005249, term1005249.getClass(), "preferPerPvModule", true);
        setBooleanField(term1005249, term1005249.getClass(), "preferCommonModule", false);
        setBooleanField(term1005249, term1005249.getClass(), "usePerPvSkin", false);
        setBooleanField(term1005249, term1005249.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term1005249, term1005249.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term1005249, term1005249.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term1005249, term1005249.getClass(), "usePerPvTouchSliderSe", true);
        setField(term1005249, term1005249.getClass(), "commonModule", "-999,-999,-999");
        setField(term1005249, term1005249.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term1005373, term1005373.getClass(), "year", 2026);
        setShortField(term1005373, term1005373.getClass(), "month", (short) 8);
        setShortField(term1005373, term1005373.getClass(), "day", (short) 12);
        setField(term1005372, term1005372.getClass(), "date", term1005373);
        setByteField(term1005377, term1005377.getClass(), "hour", (byte) 2);
        setByteField(term1005377, term1005377.getClass(), "minute", (byte) 5);
        setByteField(term1005377, term1005377.getClass(), "second", (byte) 21);
        setIntField(term1005377, term1005377.getClass(), "nano", 886171000);
        setField(term1005372, term1005372.getClass(), "time", term1005377);
        setField(term1005249, term1005249.getClass(), "commonModuleSetTime", term1005372);
        setField(term1005249, term1005249.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term1005249, term1005249.getClass(), "commonSkin", -1);
        setIntField(term1005249, term1005249.getClass(), "headphoneVolume", 100);
        setBooleanField(term1005249, term1005249.getClass(), "buttonSeOn", true);
        setIntField(term1005249, term1005249.getClass(), "buttonSeVolume", 100);
        setIntField(term1005249, term1005249.getClass(), "sliderSeVolume", 100);
        setIntField(term1005249, term1005249.getClass(), "buttonSe", -1);
        setIntField(term1005249, term1005249.getClass(), "chainSlideSe", -1);
        setIntField(term1005249, term1005249.getClass(), "slideSe", -1);
        setIntField(term1005249, term1005249.getClass(), "sliderTouchSe", -1);
        setField(term1005249, term1005249.getClass(), "sortMode", enum2131);
        setIntField(term1005249, term1005249.getClass(), "nextPvId", -1);
        setField(term1005249, term1005249.getClass(), "nextDifficulty", enum2132);
        setField(term1005249, term1005249.getClass(), "nextEdition", enum2133);
        setBooleanField(term1005249, term1005249.getClass(), "showInterimRanking", true);
        setBooleanField(term1005249, term1005249.getClass(), "showClearStatus", true);
        setBooleanField(term1005249, term1005249.getClass(), "showGreatBorder", true);
        setBooleanField(term1005249, term1005249.getClass(), "showExcellentBorder", true);
        setBooleanField(term1005249, term1005249.getClass(), "showRivalBorder", true);
        setBooleanField(term1005249, term1005249.getClass(), "showRgoSetting", true);
        setBooleanField(term1005249, term1005249.getClass(), "contestNowPlayingEnable", false);
        setIntField(term1005249, term1005249.getClass(), "contestNowPlayingId", -1);
        setIntField(term1005249, term1005249.getClass(), "contestNowPlayingValue", -1);
        setField(term1005249, term1005249.getClass(), "contestNowPlayingResultRank", enum2134);
        setField(term1005249, term1005249.getClass(), "contestNowPlayingSpecifier", "");
        setField(term1005249, term1005249.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term1005249, term1005249.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term1005249, term1005249.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term1005249, term1005249.getClass(), "rivalPdId", -1);
        setField(term1005247, term1005247.getClass(), "pdId", term1005249);
        setIntField(term1005247, term1005247.getClass(), "pvId", -1);
        setField(term1005247, term1005247.getClass(), "module", "-999,-999,-999");
        setField(term1005247, term1005247.getClass(), "customize", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setField(term1005247, term1005247.getClass(), "customizeFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term1005247, term1005247.getClass(), "skin", -1);
        setIntField(term1005247, term1005247.getClass(), "buttonSe", -1);
        setIntField(term1005247, term1005247.getClass(), "slideSe", -1);
        setIntField(term1005247, term1005247.getClass(), "chainSlideSe", -1);
        setIntField(term1005247, term1005247.getClass(), "sliderTouchSe", -1);
        term1005974 = new Integer(570145845);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvCustomize");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1005974;
        callMethod(klass, "setSliderTouchSe", argTypes, term1005247, args);
    }

};


