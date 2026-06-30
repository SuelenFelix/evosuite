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
import java.lang.Boolean;

public class PlayerProfile_setShowExcellentBorder_39122448189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term900205;
     Object term900810;

    public PlayerProfile_setShowExcellentBorder_39122448189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term900819 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term900818 = ((Class) term900819).getDeclaredField((String) "MISS");
        ((Field) term900818).setAccessible(true);
        Object enum1934 = ((Field) term900818).get((Object) null);
        Class<? extends Object> term901196 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term901195 = ((Class) term901196).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term901195).setAccessible(true);
        Object enum1935 = ((Field) term901195).get((Object) null);
        Class<? extends Object> term901479 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term901478 = ((Class) term901479).getDeclaredField((String) "NORMAL");
        ((Field) term901478).setAccessible(true);
        Object enum1936 = ((Field) term901478).get((Object) null);
        Class<? extends Object> term901754 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term901753 = ((Class) term901754).getDeclaredField((String) "ORIGINAL");
        ((Field) term901753).setAccessible(true);
        Object enum1937 = ((Field) term901753).get((Object) null);
        Class<? extends Object> term902020 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term902019 = ((Class) term902020).getDeclaredField((String) "NONE");
        ((Field) term902019).setAccessible(true);
        Object enum1938 = ((Field) term902019).get((Object) null);
        term900205 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term900328 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term900329 = newInstance(Class.forName("java.time.LocalDate"));
        Object term900333 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term900205, term900205.getClass(), "id", 9192899183781208922L);
        setIntField(term900205, term900205.getClass(), "pdId", -720629032);
        setField(term900205, term900205.getClass(), "playerName", "xxx");
        setIntField(term900205, term900205.getClass(), "vocaloidPoints", 300);
        setIntField(term900205, term900205.getClass(), "level", 1);
        setIntField(term900205, term900205.getClass(), "levelExp", 398554038);
        setField(term900205, term900205.getClass(), "levelTitle", "xxx");
        setIntField(term900205, term900205.getClass(), "plateId", -1);
        setIntField(term900205, term900205.getClass(), "plateEffectId", -1);
        setField(term900205, term900205.getClass(), "passwordStatus", enum1934);
        setField(term900205, term900205.getClass(), "password", "**********");
        setBooleanField(term900205, term900205.getClass(), "preferPerPvModule", true);
        setBooleanField(term900205, term900205.getClass(), "preferCommonModule", true);
        setBooleanField(term900205, term900205.getClass(), "usePerPvSkin", true);
        setBooleanField(term900205, term900205.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term900205, term900205.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term900205, term900205.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term900205, term900205.getClass(), "usePerPvTouchSliderSe", false);
        setField(term900205, term900205.getClass(), "commonModule", "-999,-999,-999");
        setField(term900205, term900205.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term900329, term900329.getClass(), "year", 2026);
        setShortField(term900329, term900329.getClass(), "month", (short) 6);
        setShortField(term900329, term900329.getClass(), "day", (short) 29);
        setField(term900328, term900328.getClass(), "date", term900329);
        setByteField(term900333, term900333.getClass(), "hour", (byte) 4);
        setByteField(term900333, term900333.getClass(), "minute", (byte) 29);
        setByteField(term900333, term900333.getClass(), "second", (byte) 32);
        setIntField(term900333, term900333.getClass(), "nano", 133988000);
        setField(term900328, term900328.getClass(), "time", term900333);
        setField(term900205, term900205.getClass(), "commonModuleSetTime", term900328);
        setField(term900205, term900205.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term900205, term900205.getClass(), "commonSkin", -1);
        setIntField(term900205, term900205.getClass(), "headphoneVolume", 100);
        setBooleanField(term900205, term900205.getClass(), "buttonSeOn", true);
        setIntField(term900205, term900205.getClass(), "buttonSeVolume", 100);
        setIntField(term900205, term900205.getClass(), "sliderSeVolume", 100);
        setIntField(term900205, term900205.getClass(), "buttonSe", -1);
        setIntField(term900205, term900205.getClass(), "chainSlideSe", -1);
        setIntField(term900205, term900205.getClass(), "slideSe", -1);
        setIntField(term900205, term900205.getClass(), "sliderTouchSe", -1);
        setField(term900205, term900205.getClass(), "sortMode", enum1935);
        setIntField(term900205, term900205.getClass(), "nextPvId", -1);
        setField(term900205, term900205.getClass(), "nextDifficulty", enum1936);
        setField(term900205, term900205.getClass(), "nextEdition", enum1937);
        setBooleanField(term900205, term900205.getClass(), "showInterimRanking", true);
        setBooleanField(term900205, term900205.getClass(), "showClearStatus", true);
        setBooleanField(term900205, term900205.getClass(), "showGreatBorder", true);
        setBooleanField(term900205, term900205.getClass(), "showExcellentBorder", true);
        setBooleanField(term900205, term900205.getClass(), "showRivalBorder", true);
        setBooleanField(term900205, term900205.getClass(), "showRgoSetting", true);
        setBooleanField(term900205, term900205.getClass(), "contestNowPlayingEnable", true);
        setIntField(term900205, term900205.getClass(), "contestNowPlayingId", -1);
        setIntField(term900205, term900205.getClass(), "contestNowPlayingValue", -1);
        setField(term900205, term900205.getClass(), "contestNowPlayingResultRank", enum1938);
        setField(term900205, term900205.getClass(), "contestNowPlayingSpecifier", "");
        setField(term900205, term900205.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term900205, term900205.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term900205, term900205.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term900205, term900205.getClass(), "rivalPdId", -1);
        term900810 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term900810;
        callMethod(klass, "setShowExcellentBorder", argTypes, term900205, args);
    }

};


