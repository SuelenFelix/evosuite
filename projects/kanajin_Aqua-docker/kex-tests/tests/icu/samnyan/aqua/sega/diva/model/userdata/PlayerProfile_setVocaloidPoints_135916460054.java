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
import java.lang.Integer;

public class PlayerProfile_setVocaloidPoints_135916460054 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term813645;
     Object term814250;

    public PlayerProfile_setVocaloidPoints_135916460054() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term814259 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term814258 = ((Class) term814259).getDeclaredField((String) "MISS");
        ((Field) term814258).setAccessible(true);
        Object enum1757 = ((Field) term814258).get((Object) null);
        Class<? extends Object> term814636 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term814635 = ((Class) term814636).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term814635).setAccessible(true);
        Object enum1758 = ((Field) term814635).get((Object) null);
        Class<? extends Object> term814919 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term814918 = ((Class) term814919).getDeclaredField((String) "NORMAL");
        ((Field) term814918).setAccessible(true);
        Object enum1759 = ((Field) term814918).get((Object) null);
        Class<? extends Object> term815194 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term815193 = ((Class) term815194).getDeclaredField((String) "ORIGINAL");
        ((Field) term815193).setAccessible(true);
        Object enum1760 = ((Field) term815193).get((Object) null);
        Class<? extends Object> term815460 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term815459 = ((Class) term815460).getDeclaredField((String) "NONE");
        ((Field) term815459).setAccessible(true);
        Object enum1761 = ((Field) term815459).get((Object) null);
        term813645 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term813768 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term813769 = newInstance(Class.forName("java.time.LocalDate"));
        Object term813773 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term813645, term813645.getClass(), "id", 2018084438165711668L);
        setIntField(term813645, term813645.getClass(), "pdId", -326684811);
        setField(term813645, term813645.getClass(), "playerName", "xxx");
        setIntField(term813645, term813645.getClass(), "vocaloidPoints", 300);
        setIntField(term813645, term813645.getClass(), "level", 1);
        setIntField(term813645, term813645.getClass(), "levelExp", 1260583823);
        setField(term813645, term813645.getClass(), "levelTitle", "xxx");
        setIntField(term813645, term813645.getClass(), "plateId", -1);
        setIntField(term813645, term813645.getClass(), "plateEffectId", -1);
        setField(term813645, term813645.getClass(), "passwordStatus", enum1757);
        setField(term813645, term813645.getClass(), "password", "**********");
        setBooleanField(term813645, term813645.getClass(), "preferPerPvModule", true);
        setBooleanField(term813645, term813645.getClass(), "preferCommonModule", false);
        setBooleanField(term813645, term813645.getClass(), "usePerPvSkin", true);
        setBooleanField(term813645, term813645.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term813645, term813645.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term813645, term813645.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term813645, term813645.getClass(), "usePerPvTouchSliderSe", true);
        setField(term813645, term813645.getClass(), "commonModule", "-999,-999,-999");
        setField(term813645, term813645.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term813769, term813769.getClass(), "year", 2026);
        setShortField(term813769, term813769.getClass(), "month", (short) 6);
        setShortField(term813769, term813769.getClass(), "day", (short) 29);
        setField(term813768, term813768.getClass(), "date", term813769);
        setByteField(term813773, term813773.getClass(), "hour", (byte) 4);
        setByteField(term813773, term813773.getClass(), "minute", (byte) 29);
        setByteField(term813773, term813773.getClass(), "second", (byte) 23);
        setIntField(term813773, term813773.getClass(), "nano", 125620000);
        setField(term813768, term813768.getClass(), "time", term813773);
        setField(term813645, term813645.getClass(), "commonModuleSetTime", term813768);
        setField(term813645, term813645.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term813645, term813645.getClass(), "commonSkin", -1);
        setIntField(term813645, term813645.getClass(), "headphoneVolume", 100);
        setBooleanField(term813645, term813645.getClass(), "buttonSeOn", true);
        setIntField(term813645, term813645.getClass(), "buttonSeVolume", 100);
        setIntField(term813645, term813645.getClass(), "sliderSeVolume", 100);
        setIntField(term813645, term813645.getClass(), "buttonSe", -1);
        setIntField(term813645, term813645.getClass(), "chainSlideSe", -1);
        setIntField(term813645, term813645.getClass(), "slideSe", -1);
        setIntField(term813645, term813645.getClass(), "sliderTouchSe", -1);
        setField(term813645, term813645.getClass(), "sortMode", enum1758);
        setIntField(term813645, term813645.getClass(), "nextPvId", -1);
        setField(term813645, term813645.getClass(), "nextDifficulty", enum1759);
        setField(term813645, term813645.getClass(), "nextEdition", enum1760);
        setBooleanField(term813645, term813645.getClass(), "showInterimRanking", true);
        setBooleanField(term813645, term813645.getClass(), "showClearStatus", true);
        setBooleanField(term813645, term813645.getClass(), "showGreatBorder", true);
        setBooleanField(term813645, term813645.getClass(), "showExcellentBorder", true);
        setBooleanField(term813645, term813645.getClass(), "showRivalBorder", true);
        setBooleanField(term813645, term813645.getClass(), "showRgoSetting", true);
        setBooleanField(term813645, term813645.getClass(), "contestNowPlayingEnable", false);
        setIntField(term813645, term813645.getClass(), "contestNowPlayingId", -1);
        setIntField(term813645, term813645.getClass(), "contestNowPlayingValue", -1);
        setField(term813645, term813645.getClass(), "contestNowPlayingResultRank", enum1761);
        setField(term813645, term813645.getClass(), "contestNowPlayingSpecifier", "");
        setField(term813645, term813645.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term813645, term813645.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term813645, term813645.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term813645, term813645.getClass(), "rivalPdId", -1);
        term814250 = new Integer(-1368801661);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term814250;
        callMethod(klass, "setVocaloidPoints", argTypes, term813645, args);
    }

};


