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

public class PlayerProfile_hashCode_1588006435103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term934952;

    public PlayerProfile_hashCode_1588006435103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term935564 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term935563 = ((Class) term935564).getDeclaredField((String) "MISS");
        ((Field) term935563).setAccessible(true);
        Object enum2005 = ((Field) term935563).get((Object) null);
        Class<? extends Object> term935941 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term935940 = ((Class) term935941).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term935940).setAccessible(true);
        Object enum2006 = ((Field) term935940).get((Object) null);
        Class<? extends Object> term936224 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term936223 = ((Class) term936224).getDeclaredField((String) "NORMAL");
        ((Field) term936223).setAccessible(true);
        Object enum2007 = ((Field) term936223).get((Object) null);
        Class<? extends Object> term936499 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term936498 = ((Class) term936499).getDeclaredField((String) "ORIGINAL");
        ((Field) term936498).setAccessible(true);
        Object enum2008 = ((Field) term936498).get((Object) null);
        Class<? extends Object> term936765 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term936764 = ((Class) term936765).getDeclaredField((String) "NONE");
        ((Field) term936764).setAccessible(true);
        Object enum2009 = ((Field) term936764).get((Object) null);
        term934952 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term935075 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term935076 = newInstance(Class.forName("java.time.LocalDate"));
        Object term935080 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term934952, term934952.getClass(), "id", -6806576523000182981L);
        setIntField(term934952, term934952.getClass(), "pdId", -1656685141);
        setField(term934952, term934952.getClass(), "playerName", "xxx");
        setIntField(term934952, term934952.getClass(), "vocaloidPoints", 300);
        setIntField(term934952, term934952.getClass(), "level", 1);
        setIntField(term934952, term934952.getClass(), "levelExp", -1550347560);
        setField(term934952, term934952.getClass(), "levelTitle", "xxx");
        setIntField(term934952, term934952.getClass(), "plateId", -1);
        setIntField(term934952, term934952.getClass(), "plateEffectId", -1);
        setField(term934952, term934952.getClass(), "passwordStatus", enum2005);
        setField(term934952, term934952.getClass(), "password", "**********");
        setBooleanField(term934952, term934952.getClass(), "preferPerPvModule", true);
        setBooleanField(term934952, term934952.getClass(), "preferCommonModule", false);
        setBooleanField(term934952, term934952.getClass(), "usePerPvSkin", false);
        setBooleanField(term934952, term934952.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term934952, term934952.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term934952, term934952.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term934952, term934952.getClass(), "usePerPvTouchSliderSe", true);
        setField(term934952, term934952.getClass(), "commonModule", "-999,-999,-999");
        setField(term934952, term934952.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term935076, term935076.getClass(), "year", 2026);
        setShortField(term935076, term935076.getClass(), "month", (short) 8);
        setShortField(term935076, term935076.getClass(), "day", (short) 12);
        setField(term935075, term935075.getClass(), "date", term935076);
        setByteField(term935080, term935080.getClass(), "hour", (byte) 2);
        setByteField(term935080, term935080.getClass(), "minute", (byte) 4);
        setByteField(term935080, term935080.getClass(), "second", (byte) 49);
        setIntField(term935080, term935080.getClass(), "nano", 256260000);
        setField(term935075, term935075.getClass(), "time", term935080);
        setField(term934952, term934952.getClass(), "commonModuleSetTime", term935075);
        setField(term934952, term934952.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term934952, term934952.getClass(), "commonSkin", -1);
        setIntField(term934952, term934952.getClass(), "headphoneVolume", 100);
        setBooleanField(term934952, term934952.getClass(), "buttonSeOn", true);
        setIntField(term934952, term934952.getClass(), "buttonSeVolume", 100);
        setIntField(term934952, term934952.getClass(), "sliderSeVolume", 100);
        setIntField(term934952, term934952.getClass(), "buttonSe", -1);
        setIntField(term934952, term934952.getClass(), "chainSlideSe", -1);
        setIntField(term934952, term934952.getClass(), "slideSe", -1);
        setIntField(term934952, term934952.getClass(), "sliderTouchSe", -1);
        setField(term934952, term934952.getClass(), "sortMode", enum2006);
        setIntField(term934952, term934952.getClass(), "nextPvId", -1);
        setField(term934952, term934952.getClass(), "nextDifficulty", enum2007);
        setField(term934952, term934952.getClass(), "nextEdition", enum2008);
        setBooleanField(term934952, term934952.getClass(), "showInterimRanking", true);
        setBooleanField(term934952, term934952.getClass(), "showClearStatus", true);
        setBooleanField(term934952, term934952.getClass(), "showGreatBorder", true);
        setBooleanField(term934952, term934952.getClass(), "showExcellentBorder", true);
        setBooleanField(term934952, term934952.getClass(), "showRivalBorder", true);
        setBooleanField(term934952, term934952.getClass(), "showRgoSetting", true);
        setBooleanField(term934952, term934952.getClass(), "contestNowPlayingEnable", true);
        setIntField(term934952, term934952.getClass(), "contestNowPlayingId", -1);
        setIntField(term934952, term934952.getClass(), "contestNowPlayingValue", -1);
        setField(term934952, term934952.getClass(), "contestNowPlayingResultRank", enum2009);
        setField(term934952, term934952.getClass(), "contestNowPlayingSpecifier", "");
        setField(term934952, term934952.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term934952, term934952.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term934952, term934952.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term934952, term934952.getClass(), "rivalPdId", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term934952, args);
    }

};


