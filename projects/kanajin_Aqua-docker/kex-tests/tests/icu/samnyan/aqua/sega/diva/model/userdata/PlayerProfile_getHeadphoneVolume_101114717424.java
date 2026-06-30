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

public class PlayerProfile_getHeadphoneVolume_101114717424 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term740029;

    public PlayerProfile_getHeadphoneVolume_101114717424() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term740641 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term740640 = ((Class) term740641).getDeclaredField((String) "MISS");
        ((Field) term740640).setAccessible(true);
        Object enum1607 = ((Field) term740640).get((Object) null);
        Class<? extends Object> term741018 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term741017 = ((Class) term741018).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term741017).setAccessible(true);
        Object enum1608 = ((Field) term741017).get((Object) null);
        Class<? extends Object> term741301 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term741300 = ((Class) term741301).getDeclaredField((String) "NORMAL");
        ((Field) term741300).setAccessible(true);
        Object enum1609 = ((Field) term741300).get((Object) null);
        Class<? extends Object> term741576 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term741575 = ((Class) term741576).getDeclaredField((String) "ORIGINAL");
        ((Field) term741575).setAccessible(true);
        Object enum1610 = ((Field) term741575).get((Object) null);
        Class<? extends Object> term741842 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term741841 = ((Class) term741842).getDeclaredField((String) "NONE");
        ((Field) term741841).setAccessible(true);
        Object enum1611 = ((Field) term741841).get((Object) null);
        term740029 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term740152 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term740153 = newInstance(Class.forName("java.time.LocalDate"));
        Object term740157 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term740029, term740029.getClass(), "id", -1647156882669215876L);
        setIntField(term740029, term740029.getClass(), "pdId", 744634969);
        setField(term740029, term740029.getClass(), "playerName", "xxx");
        setIntField(term740029, term740029.getClass(), "vocaloidPoints", 300);
        setIntField(term740029, term740029.getClass(), "level", 1);
        setIntField(term740029, term740029.getClass(), "levelExp", -13561953);
        setField(term740029, term740029.getClass(), "levelTitle", "xxx");
        setIntField(term740029, term740029.getClass(), "plateId", -1);
        setIntField(term740029, term740029.getClass(), "plateEffectId", -1);
        setField(term740029, term740029.getClass(), "passwordStatus", enum1607);
        setField(term740029, term740029.getClass(), "password", "**********");
        setBooleanField(term740029, term740029.getClass(), "preferPerPvModule", true);
        setBooleanField(term740029, term740029.getClass(), "preferCommonModule", true);
        setBooleanField(term740029, term740029.getClass(), "usePerPvSkin", true);
        setBooleanField(term740029, term740029.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term740029, term740029.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term740029, term740029.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term740029, term740029.getClass(), "usePerPvTouchSliderSe", false);
        setField(term740029, term740029.getClass(), "commonModule", "-999,-999,-999");
        setField(term740029, term740029.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term740153, term740153.getClass(), "year", 2026);
        setShortField(term740153, term740153.getClass(), "month", (short) 6);
        setShortField(term740153, term740153.getClass(), "day", (short) 29);
        setField(term740152, term740152.getClass(), "date", term740153);
        setByteField(term740157, term740157.getClass(), "hour", (byte) 4);
        setByteField(term740157, term740157.getClass(), "minute", (byte) 29);
        setByteField(term740157, term740157.getClass(), "second", (byte) 15);
        setIntField(term740157, term740157.getClass(), "nano", 417875000);
        setField(term740152, term740152.getClass(), "time", term740157);
        setField(term740029, term740029.getClass(), "commonModuleSetTime", term740152);
        setField(term740029, term740029.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term740029, term740029.getClass(), "commonSkin", -1);
        setIntField(term740029, term740029.getClass(), "headphoneVolume", 100);
        setBooleanField(term740029, term740029.getClass(), "buttonSeOn", true);
        setIntField(term740029, term740029.getClass(), "buttonSeVolume", 100);
        setIntField(term740029, term740029.getClass(), "sliderSeVolume", 100);
        setIntField(term740029, term740029.getClass(), "buttonSe", -1);
        setIntField(term740029, term740029.getClass(), "chainSlideSe", -1);
        setIntField(term740029, term740029.getClass(), "slideSe", -1);
        setIntField(term740029, term740029.getClass(), "sliderTouchSe", -1);
        setField(term740029, term740029.getClass(), "sortMode", enum1608);
        setIntField(term740029, term740029.getClass(), "nextPvId", -1);
        setField(term740029, term740029.getClass(), "nextDifficulty", enum1609);
        setField(term740029, term740029.getClass(), "nextEdition", enum1610);
        setBooleanField(term740029, term740029.getClass(), "showInterimRanking", true);
        setBooleanField(term740029, term740029.getClass(), "showClearStatus", true);
        setBooleanField(term740029, term740029.getClass(), "showGreatBorder", true);
        setBooleanField(term740029, term740029.getClass(), "showExcellentBorder", true);
        setBooleanField(term740029, term740029.getClass(), "showRivalBorder", true);
        setBooleanField(term740029, term740029.getClass(), "showRgoSetting", true);
        setBooleanField(term740029, term740029.getClass(), "contestNowPlayingEnable", false);
        setIntField(term740029, term740029.getClass(), "contestNowPlayingId", -1);
        setIntField(term740029, term740029.getClass(), "contestNowPlayingValue", -1);
        setField(term740029, term740029.getClass(), "contestNowPlayingResultRank", enum1611);
        setField(term740029, term740029.getClass(), "contestNowPlayingSpecifier", "");
        setField(term740029, term740029.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term740029, term740029.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term740029, term740029.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term740029, term740029.getClass(), "rivalPdId", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHeadphoneVolume", argTypes, term740029, args);
    }

};


