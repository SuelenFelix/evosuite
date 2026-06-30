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

public class PlayerProfile_isUsePerPvChainSliderSe_202819233017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term722858;

    public PlayerProfile_isUsePerPvChainSliderSe_202819233017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term723470 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term723469 = ((Class) term723470).getDeclaredField((String) "MISS");
        ((Field) term723469).setAccessible(true);
        Object enum1572 = ((Field) term723469).get((Object) null);
        Class<? extends Object> term723847 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term723846 = ((Class) term723847).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term723846).setAccessible(true);
        Object enum1573 = ((Field) term723846).get((Object) null);
        Class<? extends Object> term724130 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term724129 = ((Class) term724130).getDeclaredField((String) "NORMAL");
        ((Field) term724129).setAccessible(true);
        Object enum1574 = ((Field) term724129).get((Object) null);
        Class<? extends Object> term724405 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term724404 = ((Class) term724405).getDeclaredField((String) "ORIGINAL");
        ((Field) term724404).setAccessible(true);
        Object enum1575 = ((Field) term724404).get((Object) null);
        Class<? extends Object> term724671 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term724670 = ((Class) term724671).getDeclaredField((String) "NONE");
        ((Field) term724670).setAccessible(true);
        Object enum1576 = ((Field) term724670).get((Object) null);
        term722858 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term722981 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term722982 = newInstance(Class.forName("java.time.LocalDate"));
        Object term722986 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term722858, term722858.getClass(), "id", -599981502351912419L);
        setIntField(term722858, term722858.getClass(), "pdId", 1313599240);
        setField(term722858, term722858.getClass(), "playerName", "xxx");
        setIntField(term722858, term722858.getClass(), "vocaloidPoints", 300);
        setIntField(term722858, term722858.getClass(), "level", 1);
        setIntField(term722858, term722858.getClass(), "levelExp", 1889501733);
        setField(term722858, term722858.getClass(), "levelTitle", "xxx");
        setIntField(term722858, term722858.getClass(), "plateId", -1);
        setIntField(term722858, term722858.getClass(), "plateEffectId", -1);
        setField(term722858, term722858.getClass(), "passwordStatus", enum1572);
        setField(term722858, term722858.getClass(), "password", "**********");
        setBooleanField(term722858, term722858.getClass(), "preferPerPvModule", true);
        setBooleanField(term722858, term722858.getClass(), "preferCommonModule", true);
        setBooleanField(term722858, term722858.getClass(), "usePerPvSkin", false);
        setBooleanField(term722858, term722858.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term722858, term722858.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term722858, term722858.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term722858, term722858.getClass(), "usePerPvTouchSliderSe", true);
        setField(term722858, term722858.getClass(), "commonModule", "-999,-999,-999");
        setField(term722858, term722858.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term722982, term722982.getClass(), "year", 2026);
        setShortField(term722982, term722982.getClass(), "month", (short) 6);
        setShortField(term722982, term722982.getClass(), "day", (short) 29);
        setField(term722981, term722981.getClass(), "date", term722982);
        setByteField(term722986, term722986.getClass(), "hour", (byte) 4);
        setByteField(term722986, term722986.getClass(), "minute", (byte) 29);
        setByteField(term722986, term722986.getClass(), "second", (byte) 13);
        setIntField(term722986, term722986.getClass(), "nano", 621638000);
        setField(term722981, term722981.getClass(), "time", term722986);
        setField(term722858, term722858.getClass(), "commonModuleSetTime", term722981);
        setField(term722858, term722858.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term722858, term722858.getClass(), "commonSkin", -1);
        setIntField(term722858, term722858.getClass(), "headphoneVolume", 100);
        setBooleanField(term722858, term722858.getClass(), "buttonSeOn", true);
        setIntField(term722858, term722858.getClass(), "buttonSeVolume", 100);
        setIntField(term722858, term722858.getClass(), "sliderSeVolume", 100);
        setIntField(term722858, term722858.getClass(), "buttonSe", -1);
        setIntField(term722858, term722858.getClass(), "chainSlideSe", -1);
        setIntField(term722858, term722858.getClass(), "slideSe", -1);
        setIntField(term722858, term722858.getClass(), "sliderTouchSe", -1);
        setField(term722858, term722858.getClass(), "sortMode", enum1573);
        setIntField(term722858, term722858.getClass(), "nextPvId", -1);
        setField(term722858, term722858.getClass(), "nextDifficulty", enum1574);
        setField(term722858, term722858.getClass(), "nextEdition", enum1575);
        setBooleanField(term722858, term722858.getClass(), "showInterimRanking", true);
        setBooleanField(term722858, term722858.getClass(), "showClearStatus", true);
        setBooleanField(term722858, term722858.getClass(), "showGreatBorder", true);
        setBooleanField(term722858, term722858.getClass(), "showExcellentBorder", true);
        setBooleanField(term722858, term722858.getClass(), "showRivalBorder", true);
        setBooleanField(term722858, term722858.getClass(), "showRgoSetting", true);
        setBooleanField(term722858, term722858.getClass(), "contestNowPlayingEnable", true);
        setIntField(term722858, term722858.getClass(), "contestNowPlayingId", -1);
        setIntField(term722858, term722858.getClass(), "contestNowPlayingValue", -1);
        setField(term722858, term722858.getClass(), "contestNowPlayingResultRank", enum1576);
        setField(term722858, term722858.getClass(), "contestNowPlayingSpecifier", "");
        setField(term722858, term722858.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term722858, term722858.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term722858, term722858.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term722858, term722858.getClass(), "rivalPdId", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isUsePerPvChainSliderSe", argTypes, term722858, args);
    }

};


