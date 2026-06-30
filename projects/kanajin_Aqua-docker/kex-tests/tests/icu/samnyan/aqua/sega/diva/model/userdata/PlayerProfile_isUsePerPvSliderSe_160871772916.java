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

public class PlayerProfile_isUsePerPvSliderSe_160871772916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term720405;

    public PlayerProfile_isUsePerPvSliderSe_160871772916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term721017 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term721016 = ((Class) term721017).getDeclaredField((String) "MISS");
        ((Field) term721016).setAccessible(true);
        Object enum1567 = ((Field) term721016).get((Object) null);
        Class<? extends Object> term721394 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term721393 = ((Class) term721394).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term721393).setAccessible(true);
        Object enum1568 = ((Field) term721393).get((Object) null);
        Class<? extends Object> term721677 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term721676 = ((Class) term721677).getDeclaredField((String) "NORMAL");
        ((Field) term721676).setAccessible(true);
        Object enum1569 = ((Field) term721676).get((Object) null);
        Class<? extends Object> term721952 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term721951 = ((Class) term721952).getDeclaredField((String) "ORIGINAL");
        ((Field) term721951).setAccessible(true);
        Object enum1570 = ((Field) term721951).get((Object) null);
        Class<? extends Object> term722218 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term722217 = ((Class) term722218).getDeclaredField((String) "NONE");
        ((Field) term722217).setAccessible(true);
        Object enum1571 = ((Field) term722217).get((Object) null);
        term720405 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term720528 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term720529 = newInstance(Class.forName("java.time.LocalDate"));
        Object term720533 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term720405, term720405.getClass(), "id", -997945615782059734L);
        setIntField(term720405, term720405.getClass(), "pdId", -1044762733);
        setField(term720405, term720405.getClass(), "playerName", "xxx");
        setIntField(term720405, term720405.getClass(), "vocaloidPoints", 300);
        setIntField(term720405, term720405.getClass(), "level", 1);
        setIntField(term720405, term720405.getClass(), "levelExp", 446184231);
        setField(term720405, term720405.getClass(), "levelTitle", "xxx");
        setIntField(term720405, term720405.getClass(), "plateId", -1);
        setIntField(term720405, term720405.getClass(), "plateEffectId", -1);
        setField(term720405, term720405.getClass(), "passwordStatus", enum1567);
        setField(term720405, term720405.getClass(), "password", "**********");
        setBooleanField(term720405, term720405.getClass(), "preferPerPvModule", true);
        setBooleanField(term720405, term720405.getClass(), "preferCommonModule", false);
        setBooleanField(term720405, term720405.getClass(), "usePerPvSkin", false);
        setBooleanField(term720405, term720405.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term720405, term720405.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term720405, term720405.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term720405, term720405.getClass(), "usePerPvTouchSliderSe", true);
        setField(term720405, term720405.getClass(), "commonModule", "-999,-999,-999");
        setField(term720405, term720405.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term720529, term720529.getClass(), "year", 2026);
        setShortField(term720529, term720529.getClass(), "month", (short) 6);
        setShortField(term720529, term720529.getClass(), "day", (short) 29);
        setField(term720528, term720528.getClass(), "date", term720529);
        setByteField(term720533, term720533.getClass(), "hour", (byte) 4);
        setByteField(term720533, term720533.getClass(), "minute", (byte) 29);
        setByteField(term720533, term720533.getClass(), "second", (byte) 13);
        setIntField(term720533, term720533.getClass(), "nano", 365725000);
        setField(term720528, term720528.getClass(), "time", term720533);
        setField(term720405, term720405.getClass(), "commonModuleSetTime", term720528);
        setField(term720405, term720405.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term720405, term720405.getClass(), "commonSkin", -1);
        setIntField(term720405, term720405.getClass(), "headphoneVolume", 100);
        setBooleanField(term720405, term720405.getClass(), "buttonSeOn", true);
        setIntField(term720405, term720405.getClass(), "buttonSeVolume", 100);
        setIntField(term720405, term720405.getClass(), "sliderSeVolume", 100);
        setIntField(term720405, term720405.getClass(), "buttonSe", -1);
        setIntField(term720405, term720405.getClass(), "chainSlideSe", -1);
        setIntField(term720405, term720405.getClass(), "slideSe", -1);
        setIntField(term720405, term720405.getClass(), "sliderTouchSe", -1);
        setField(term720405, term720405.getClass(), "sortMode", enum1568);
        setIntField(term720405, term720405.getClass(), "nextPvId", -1);
        setField(term720405, term720405.getClass(), "nextDifficulty", enum1569);
        setField(term720405, term720405.getClass(), "nextEdition", enum1570);
        setBooleanField(term720405, term720405.getClass(), "showInterimRanking", true);
        setBooleanField(term720405, term720405.getClass(), "showClearStatus", true);
        setBooleanField(term720405, term720405.getClass(), "showGreatBorder", true);
        setBooleanField(term720405, term720405.getClass(), "showExcellentBorder", true);
        setBooleanField(term720405, term720405.getClass(), "showRivalBorder", true);
        setBooleanField(term720405, term720405.getClass(), "showRgoSetting", true);
        setBooleanField(term720405, term720405.getClass(), "contestNowPlayingEnable", true);
        setIntField(term720405, term720405.getClass(), "contestNowPlayingId", -1);
        setIntField(term720405, term720405.getClass(), "contestNowPlayingValue", -1);
        setField(term720405, term720405.getClass(), "contestNowPlayingResultRank", enum1571);
        setField(term720405, term720405.getClass(), "contestNowPlayingSpecifier", "");
        setField(term720405, term720405.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term720405, term720405.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term720405, term720405.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term720405, term720405.getClass(), "rivalPdId", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isUsePerPvSliderSe", argTypes, term720405, args);
    }

};


