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

public class PlayerScreenShot_canEqual_6019555814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term520371;
     Object term521015;

    public PlayerScreenShot_canEqual_6019555814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term521023 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term521022 = ((Class) term521023).getDeclaredField((String) "MISS");
        ((Field) term521022).setAccessible(true);
        Object enum1147 = ((Field) term521022).get((Object) null);
        Class<? extends Object> term521400 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term521399 = ((Class) term521400).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term521399).setAccessible(true);
        Object enum1148 = ((Field) term521399).get((Object) null);
        Class<? extends Object> term521683 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term521682 = ((Class) term521683).getDeclaredField((String) "NORMAL");
        ((Field) term521682).setAccessible(true);
        Object enum1149 = ((Field) term521682).get((Object) null);
        Class<? extends Object> term521958 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term521957 = ((Class) term521958).getDeclaredField((String) "ORIGINAL");
        ((Field) term521957).setAccessible(true);
        Object enum1150 = ((Field) term521957).get((Object) null);
        Class<? extends Object> term522224 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term522223 = ((Class) term522224).getDeclaredField((String) "NONE");
        ((Field) term522223).setAccessible(true);
        Object enum1151 = ((Field) term522223).get((Object) null);
        term520371 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerScreenShot"));
        Object term520373 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term520496 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term520497 = newInstance(Class.forName("java.time.LocalDate"));
        Object term520501 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term520371, term520371.getClass(), "id", -1279670138064751276L);
        setLongField(term520373, term520373.getClass(), "id", -7205236974351118210L);
        setIntField(term520373, term520373.getClass(), "pdId", -1488558129);
        setField(term520373, term520373.getClass(), "playerName", "xxx");
        setIntField(term520373, term520373.getClass(), "vocaloidPoints", 300);
        setIntField(term520373, term520373.getClass(), "level", 1);
        setIntField(term520373, term520373.getClass(), "levelExp", -929614389);
        setField(term520373, term520373.getClass(), "levelTitle", "xxx");
        setIntField(term520373, term520373.getClass(), "plateId", -1);
        setIntField(term520373, term520373.getClass(), "plateEffectId", -1);
        setField(term520373, term520373.getClass(), "passwordStatus", enum1147);
        setField(term520373, term520373.getClass(), "password", "**********");
        setBooleanField(term520373, term520373.getClass(), "preferPerPvModule", true);
        setBooleanField(term520373, term520373.getClass(), "preferCommonModule", true);
        setBooleanField(term520373, term520373.getClass(), "usePerPvSkin", true);
        setBooleanField(term520373, term520373.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term520373, term520373.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term520373, term520373.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term520373, term520373.getClass(), "usePerPvTouchSliderSe", false);
        setField(term520373, term520373.getClass(), "commonModule", "-999,-999,-999");
        setField(term520373, term520373.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term520497, term520497.getClass(), "year", 2026);
        setShortField(term520497, term520497.getClass(), "month", (short) 6);
        setShortField(term520497, term520497.getClass(), "day", (short) 29);
        setField(term520496, term520496.getClass(), "date", term520497);
        setByteField(term520501, term520501.getClass(), "hour", (byte) 4);
        setByteField(term520501, term520501.getClass(), "minute", (byte) 28);
        setByteField(term520501, term520501.getClass(), "second", (byte) 34);
        setIntField(term520501, term520501.getClass(), "nano", 411092000);
        setField(term520496, term520496.getClass(), "time", term520501);
        setField(term520373, term520373.getClass(), "commonModuleSetTime", term520496);
        setField(term520373, term520373.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term520373, term520373.getClass(), "commonSkin", -1);
        setIntField(term520373, term520373.getClass(), "headphoneVolume", 100);
        setBooleanField(term520373, term520373.getClass(), "buttonSeOn", true);
        setIntField(term520373, term520373.getClass(), "buttonSeVolume", 100);
        setIntField(term520373, term520373.getClass(), "sliderSeVolume", 100);
        setIntField(term520373, term520373.getClass(), "buttonSe", -1);
        setIntField(term520373, term520373.getClass(), "chainSlideSe", -1);
        setIntField(term520373, term520373.getClass(), "slideSe", -1);
        setIntField(term520373, term520373.getClass(), "sliderTouchSe", -1);
        setField(term520373, term520373.getClass(), "sortMode", enum1148);
        setIntField(term520373, term520373.getClass(), "nextPvId", -1);
        setField(term520373, term520373.getClass(), "nextDifficulty", enum1149);
        setField(term520373, term520373.getClass(), "nextEdition", enum1150);
        setBooleanField(term520373, term520373.getClass(), "showInterimRanking", true);
        setBooleanField(term520373, term520373.getClass(), "showClearStatus", true);
        setBooleanField(term520373, term520373.getClass(), "showGreatBorder", true);
        setBooleanField(term520373, term520373.getClass(), "showExcellentBorder", true);
        setBooleanField(term520373, term520373.getClass(), "showRivalBorder", true);
        setBooleanField(term520373, term520373.getClass(), "showRgoSetting", true);
        setBooleanField(term520373, term520373.getClass(), "contestNowPlayingEnable", false);
        setIntField(term520373, term520373.getClass(), "contestNowPlayingId", -1);
        setIntField(term520373, term520373.getClass(), "contestNowPlayingValue", -1);
        setField(term520373, term520373.getClass(), "contestNowPlayingResultRank", enum1151);
        setField(term520373, term520373.getClass(), "contestNowPlayingSpecifier", "");
        setField(term520373, term520373.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term520373, term520373.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term520373, term520373.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term520373, term520373.getClass(), "rivalPdId", -1);
        setField(term520371, term520371.getClass(), "pdId", term520373);
        setIntField(term520371, term520371.getClass(), "pvId", 1585326879);
        setField(term520371, term520371.getClass(), "fileName", "vLerpqavFM");
        setField(term520371, term520371.getClass(), "moduleList", "qnvxzwuGKX");
        setField(term520371, term520371.getClass(), "customizeList", "EdPAvpluZg");
        term521015 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerScreenShot");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term521015;
        callMethod(klass, "canEqual", argTypes, term520371, args);
    }

};


