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

public class PlayerCustomize_equals_1314520607 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term471643;
     Object term472251;

    public PlayerCustomize_equals_1314520607() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term472259 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term472258 = ((Class) term472259).getDeclaredField((String) "MISS");
        ((Field) term472258).setAccessible(true);
        Object enum1052 = ((Field) term472258).get((Object) null);
        Class<? extends Object> term472636 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term472635 = ((Class) term472636).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term472635).setAccessible(true);
        Object enum1053 = ((Field) term472635).get((Object) null);
        Class<? extends Object> term472919 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term472918 = ((Class) term472919).getDeclaredField((String) "NORMAL");
        ((Field) term472918).setAccessible(true);
        Object enum1054 = ((Field) term472918).get((Object) null);
        Class<? extends Object> term473194 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term473193 = ((Class) term473194).getDeclaredField((String) "ORIGINAL");
        ((Field) term473193).setAccessible(true);
        Object enum1055 = ((Field) term473193).get((Object) null);
        Class<? extends Object> term473460 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term473459 = ((Class) term473460).getDeclaredField((String) "NONE");
        ((Field) term473459).setAccessible(true);
        Object enum1056 = ((Field) term473459).get((Object) null);
        term471643 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerCustomize"));
        Object term471645 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term471768 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term471769 = newInstance(Class.forName("java.time.LocalDate"));
        Object term471773 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term471643, term471643.getClass(), "id", -7709317346333670618L);
        setLongField(term471645, term471645.getClass(), "id", -1964501434345816975L);
        setIntField(term471645, term471645.getClass(), "pdId", 1506869786);
        setField(term471645, term471645.getClass(), "playerName", "xxx");
        setIntField(term471645, term471645.getClass(), "vocaloidPoints", 300);
        setIntField(term471645, term471645.getClass(), "level", 1);
        setIntField(term471645, term471645.getClass(), "levelExp", 950749769);
        setField(term471645, term471645.getClass(), "levelTitle", "xxx");
        setIntField(term471645, term471645.getClass(), "plateId", -1);
        setIntField(term471645, term471645.getClass(), "plateEffectId", -1);
        setField(term471645, term471645.getClass(), "passwordStatus", enum1052);
        setField(term471645, term471645.getClass(), "password", "**********");
        setBooleanField(term471645, term471645.getClass(), "preferPerPvModule", true);
        setBooleanField(term471645, term471645.getClass(), "preferCommonModule", false);
        setBooleanField(term471645, term471645.getClass(), "usePerPvSkin", false);
        setBooleanField(term471645, term471645.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term471645, term471645.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term471645, term471645.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term471645, term471645.getClass(), "usePerPvTouchSliderSe", true);
        setField(term471645, term471645.getClass(), "commonModule", "-999,-999,-999");
        setField(term471645, term471645.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term471769, term471769.getClass(), "year", 2026);
        setShortField(term471769, term471769.getClass(), "month", (short) 8);
        setShortField(term471769, term471769.getClass(), "day", (short) 12);
        setField(term471768, term471768.getClass(), "date", term471769);
        setByteField(term471773, term471773.getClass(), "hour", (byte) 2);
        setByteField(term471773, term471773.getClass(), "minute", (byte) 3);
        setByteField(term471773, term471773.getClass(), "second", (byte) 40);
        setIntField(term471773, term471773.getClass(), "nano", 634984000);
        setField(term471768, term471768.getClass(), "time", term471773);
        setField(term471645, term471645.getClass(), "commonModuleSetTime", term471768);
        setField(term471645, term471645.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term471645, term471645.getClass(), "commonSkin", -1);
        setIntField(term471645, term471645.getClass(), "headphoneVolume", 100);
        setBooleanField(term471645, term471645.getClass(), "buttonSeOn", true);
        setIntField(term471645, term471645.getClass(), "buttonSeVolume", 100);
        setIntField(term471645, term471645.getClass(), "sliderSeVolume", 100);
        setIntField(term471645, term471645.getClass(), "buttonSe", -1);
        setIntField(term471645, term471645.getClass(), "chainSlideSe", -1);
        setIntField(term471645, term471645.getClass(), "slideSe", -1);
        setIntField(term471645, term471645.getClass(), "sliderTouchSe", -1);
        setField(term471645, term471645.getClass(), "sortMode", enum1053);
        setIntField(term471645, term471645.getClass(), "nextPvId", -1);
        setField(term471645, term471645.getClass(), "nextDifficulty", enum1054);
        setField(term471645, term471645.getClass(), "nextEdition", enum1055);
        setBooleanField(term471645, term471645.getClass(), "showInterimRanking", true);
        setBooleanField(term471645, term471645.getClass(), "showClearStatus", true);
        setBooleanField(term471645, term471645.getClass(), "showGreatBorder", true);
        setBooleanField(term471645, term471645.getClass(), "showExcellentBorder", true);
        setBooleanField(term471645, term471645.getClass(), "showRivalBorder", true);
        setBooleanField(term471645, term471645.getClass(), "showRgoSetting", true);
        setBooleanField(term471645, term471645.getClass(), "contestNowPlayingEnable", true);
        setIntField(term471645, term471645.getClass(), "contestNowPlayingId", -1);
        setIntField(term471645, term471645.getClass(), "contestNowPlayingValue", -1);
        setField(term471645, term471645.getClass(), "contestNowPlayingResultRank", enum1056);
        setField(term471645, term471645.getClass(), "contestNowPlayingSpecifier", "");
        setField(term471645, term471645.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term471645, term471645.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term471645, term471645.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term471645, term471645.getClass(), "rivalPdId", -1);
        setField(term471643, term471643.getClass(), "pdId", term471645);
        setIntField(term471643, term471643.getClass(), "customizeId", 1497396124);
        term472251 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerCustomize");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term472251;
        callMethod(klass, "equals", argTypes, term471643, args);
    }

};


