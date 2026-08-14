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

public class PlayerProfile_isShowInterimRanking_110684015536 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term769465;

    public PlayerProfile_isShowInterimRanking_110684015536() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term770077 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term770076 = ((Class) term770077).getDeclaredField((String) "MISS");
        ((Field) term770076).setAccessible(true);
        Object enum1667 = ((Field) term770076).get((Object) null);
        Class<? extends Object> term770454 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term770453 = ((Class) term770454).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term770453).setAccessible(true);
        Object enum1668 = ((Field) term770453).get((Object) null);
        Class<? extends Object> term770737 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term770736 = ((Class) term770737).getDeclaredField((String) "NORMAL");
        ((Field) term770736).setAccessible(true);
        Object enum1669 = ((Field) term770736).get((Object) null);
        Class<? extends Object> term771012 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term771011 = ((Class) term771012).getDeclaredField((String) "ORIGINAL");
        ((Field) term771011).setAccessible(true);
        Object enum1670 = ((Field) term771011).get((Object) null);
        Class<? extends Object> term771278 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term771277 = ((Class) term771278).getDeclaredField((String) "NONE");
        ((Field) term771277).setAccessible(true);
        Object enum1671 = ((Field) term771277).get((Object) null);
        term769465 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term769588 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term769589 = newInstance(Class.forName("java.time.LocalDate"));
        Object term769593 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term769465, term769465.getClass(), "id", -4663904610228258188L);
        setIntField(term769465, term769465.getClass(), "pdId", -786856127);
        setField(term769465, term769465.getClass(), "playerName", "xxx");
        setIntField(term769465, term769465.getClass(), "vocaloidPoints", 300);
        setIntField(term769465, term769465.getClass(), "level", 1);
        setIntField(term769465, term769465.getClass(), "levelExp", 891987554);
        setField(term769465, term769465.getClass(), "levelTitle", "xxx");
        setIntField(term769465, term769465.getClass(), "plateId", -1);
        setIntField(term769465, term769465.getClass(), "plateEffectId", -1);
        setField(term769465, term769465.getClass(), "passwordStatus", enum1667);
        setField(term769465, term769465.getClass(), "password", "**********");
        setBooleanField(term769465, term769465.getClass(), "preferPerPvModule", true);
        setBooleanField(term769465, term769465.getClass(), "preferCommonModule", true);
        setBooleanField(term769465, term769465.getClass(), "usePerPvSkin", false);
        setBooleanField(term769465, term769465.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term769465, term769465.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term769465, term769465.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term769465, term769465.getClass(), "usePerPvTouchSliderSe", false);
        setField(term769465, term769465.getClass(), "commonModule", "-999,-999,-999");
        setField(term769465, term769465.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term769589, term769589.getClass(), "year", 2026);
        setShortField(term769589, term769589.getClass(), "month", (short) 8);
        setShortField(term769589, term769589.getClass(), "day", (short) 12);
        setField(term769588, term769588.getClass(), "date", term769589);
        setByteField(term769593, term769593.getClass(), "hour", (byte) 2);
        setByteField(term769593, term769593.getClass(), "minute", (byte) 4);
        setByteField(term769593, term769593.getClass(), "second", (byte) 31);
        setIntField(term769593, term769593.getClass(), "nano", 768258000);
        setField(term769588, term769588.getClass(), "time", term769593);
        setField(term769465, term769465.getClass(), "commonModuleSetTime", term769588);
        setField(term769465, term769465.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term769465, term769465.getClass(), "commonSkin", -1);
        setIntField(term769465, term769465.getClass(), "headphoneVolume", 100);
        setBooleanField(term769465, term769465.getClass(), "buttonSeOn", true);
        setIntField(term769465, term769465.getClass(), "buttonSeVolume", 100);
        setIntField(term769465, term769465.getClass(), "sliderSeVolume", 100);
        setIntField(term769465, term769465.getClass(), "buttonSe", -1);
        setIntField(term769465, term769465.getClass(), "chainSlideSe", -1);
        setIntField(term769465, term769465.getClass(), "slideSe", -1);
        setIntField(term769465, term769465.getClass(), "sliderTouchSe", -1);
        setField(term769465, term769465.getClass(), "sortMode", enum1668);
        setIntField(term769465, term769465.getClass(), "nextPvId", -1);
        setField(term769465, term769465.getClass(), "nextDifficulty", enum1669);
        setField(term769465, term769465.getClass(), "nextEdition", enum1670);
        setBooleanField(term769465, term769465.getClass(), "showInterimRanking", true);
        setBooleanField(term769465, term769465.getClass(), "showClearStatus", true);
        setBooleanField(term769465, term769465.getClass(), "showGreatBorder", true);
        setBooleanField(term769465, term769465.getClass(), "showExcellentBorder", true);
        setBooleanField(term769465, term769465.getClass(), "showRivalBorder", true);
        setBooleanField(term769465, term769465.getClass(), "showRgoSetting", true);
        setBooleanField(term769465, term769465.getClass(), "contestNowPlayingEnable", false);
        setIntField(term769465, term769465.getClass(), "contestNowPlayingId", -1);
        setIntField(term769465, term769465.getClass(), "contestNowPlayingValue", -1);
        setField(term769465, term769465.getClass(), "contestNowPlayingResultRank", enum1671);
        setField(term769465, term769465.getClass(), "contestNowPlayingSpecifier", "");
        setField(term769465, term769465.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term769465, term769465.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term769465, term769465.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term769465, term769465.getClass(), "rivalPdId", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isShowInterimRanking", argTypes, term769465, args);
    }

};


