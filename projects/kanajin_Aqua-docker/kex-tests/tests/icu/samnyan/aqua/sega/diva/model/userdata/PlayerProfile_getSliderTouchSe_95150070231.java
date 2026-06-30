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

public class PlayerProfile_getSliderTouchSe_95150070231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term757200;

    public PlayerProfile_getSliderTouchSe_95150070231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term757812 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term757811 = ((Class) term757812).getDeclaredField((String) "MISS");
        ((Field) term757811).setAccessible(true);
        Object enum1642 = ((Field) term757811).get((Object) null);
        Class<? extends Object> term758189 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term758188 = ((Class) term758189).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term758188).setAccessible(true);
        Object enum1643 = ((Field) term758188).get((Object) null);
        Class<? extends Object> term758472 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term758471 = ((Class) term758472).getDeclaredField((String) "NORMAL");
        ((Field) term758471).setAccessible(true);
        Object enum1644 = ((Field) term758471).get((Object) null);
        Class<? extends Object> term758747 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term758746 = ((Class) term758747).getDeclaredField((String) "ORIGINAL");
        ((Field) term758746).setAccessible(true);
        Object enum1645 = ((Field) term758746).get((Object) null);
        Class<? extends Object> term759013 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term759012 = ((Class) term759013).getDeclaredField((String) "NONE");
        ((Field) term759012).setAccessible(true);
        Object enum1646 = ((Field) term759012).get((Object) null);
        term757200 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term757323 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term757324 = newInstance(Class.forName("java.time.LocalDate"));
        Object term757328 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term757200, term757200.getClass(), "id", -4855037955202452256L);
        setIntField(term757200, term757200.getClass(), "pdId", 794411004);
        setField(term757200, term757200.getClass(), "playerName", "xxx");
        setIntField(term757200, term757200.getClass(), "vocaloidPoints", 300);
        setIntField(term757200, term757200.getClass(), "level", 1);
        setIntField(term757200, term757200.getClass(), "levelExp", 1964107266);
        setField(term757200, term757200.getClass(), "levelTitle", "xxx");
        setIntField(term757200, term757200.getClass(), "plateId", -1);
        setIntField(term757200, term757200.getClass(), "plateEffectId", -1);
        setField(term757200, term757200.getClass(), "passwordStatus", enum1642);
        setField(term757200, term757200.getClass(), "password", "**********");
        setBooleanField(term757200, term757200.getClass(), "preferPerPvModule", true);
        setBooleanField(term757200, term757200.getClass(), "preferCommonModule", false);
        setBooleanField(term757200, term757200.getClass(), "usePerPvSkin", true);
        setBooleanField(term757200, term757200.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term757200, term757200.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term757200, term757200.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term757200, term757200.getClass(), "usePerPvTouchSliderSe", true);
        setField(term757200, term757200.getClass(), "commonModule", "-999,-999,-999");
        setField(term757200, term757200.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term757324, term757324.getClass(), "year", 2026);
        setShortField(term757324, term757324.getClass(), "month", (short) 6);
        setShortField(term757324, term757324.getClass(), "day", (short) 29);
        setField(term757323, term757323.getClass(), "date", term757324);
        setByteField(term757328, term757328.getClass(), "hour", (byte) 4);
        setByteField(term757328, term757328.getClass(), "minute", (byte) 29);
        setByteField(term757328, term757328.getClass(), "second", (byte) 17);
        setIntField(term757328, term757328.getClass(), "nano", 215477000);
        setField(term757323, term757323.getClass(), "time", term757328);
        setField(term757200, term757200.getClass(), "commonModuleSetTime", term757323);
        setField(term757200, term757200.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term757200, term757200.getClass(), "commonSkin", -1);
        setIntField(term757200, term757200.getClass(), "headphoneVolume", 100);
        setBooleanField(term757200, term757200.getClass(), "buttonSeOn", true);
        setIntField(term757200, term757200.getClass(), "buttonSeVolume", 100);
        setIntField(term757200, term757200.getClass(), "sliderSeVolume", 100);
        setIntField(term757200, term757200.getClass(), "buttonSe", -1);
        setIntField(term757200, term757200.getClass(), "chainSlideSe", -1);
        setIntField(term757200, term757200.getClass(), "slideSe", -1);
        setIntField(term757200, term757200.getClass(), "sliderTouchSe", -1);
        setField(term757200, term757200.getClass(), "sortMode", enum1643);
        setIntField(term757200, term757200.getClass(), "nextPvId", -1);
        setField(term757200, term757200.getClass(), "nextDifficulty", enum1644);
        setField(term757200, term757200.getClass(), "nextEdition", enum1645);
        setBooleanField(term757200, term757200.getClass(), "showInterimRanking", true);
        setBooleanField(term757200, term757200.getClass(), "showClearStatus", true);
        setBooleanField(term757200, term757200.getClass(), "showGreatBorder", true);
        setBooleanField(term757200, term757200.getClass(), "showExcellentBorder", true);
        setBooleanField(term757200, term757200.getClass(), "showRivalBorder", true);
        setBooleanField(term757200, term757200.getClass(), "showRgoSetting", true);
        setBooleanField(term757200, term757200.getClass(), "contestNowPlayingEnable", false);
        setIntField(term757200, term757200.getClass(), "contestNowPlayingId", -1);
        setIntField(term757200, term757200.getClass(), "contestNowPlayingValue", -1);
        setField(term757200, term757200.getClass(), "contestNowPlayingResultRank", enum1646);
        setField(term757200, term757200.getClass(), "contestNowPlayingSpecifier", "");
        setField(term757200, term757200.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term757200, term757200.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term757200, term757200.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term757200, term757200.getClass(), "rivalPdId", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSliderTouchSe", argTypes, term757200, args);
    }

};


