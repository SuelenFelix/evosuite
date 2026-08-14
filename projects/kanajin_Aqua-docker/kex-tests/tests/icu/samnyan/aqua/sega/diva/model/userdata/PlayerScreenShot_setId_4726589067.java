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
import java.lang.Long;

public class PlayerScreenShot_setId_4726589067 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term501619;
     Object term502263;

    public PlayerScreenShot_setId_4726589067() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term502272 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term502271 = ((Class) term502272).getDeclaredField((String) "MISS");
        ((Field) term502271).setAccessible(true);
        Object enum1112 = ((Field) term502271).get((Object) null);
        Class<? extends Object> term502649 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term502648 = ((Class) term502649).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term502648).setAccessible(true);
        Object enum1113 = ((Field) term502648).get((Object) null);
        Class<? extends Object> term502932 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term502931 = ((Class) term502932).getDeclaredField((String) "NORMAL");
        ((Field) term502931).setAccessible(true);
        Object enum1114 = ((Field) term502931).get((Object) null);
        Class<? extends Object> term503207 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term503206 = ((Class) term503207).getDeclaredField((String) "ORIGINAL");
        ((Field) term503206).setAccessible(true);
        Object enum1115 = ((Field) term503206).get((Object) null);
        Class<? extends Object> term503473 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term503472 = ((Class) term503473).getDeclaredField((String) "NONE");
        ((Field) term503472).setAccessible(true);
        Object enum1116 = ((Field) term503472).get((Object) null);
        term501619 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerScreenShot"));
        Object term501621 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term501744 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term501745 = newInstance(Class.forName("java.time.LocalDate"));
        Object term501749 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term501619, term501619.getClass(), "id", 7800835025296877231L);
        setLongField(term501621, term501621.getClass(), "id", -187772971269812453L);
        setIntField(term501621, term501621.getClass(), "pdId", 148921829);
        setField(term501621, term501621.getClass(), "playerName", "xxx");
        setIntField(term501621, term501621.getClass(), "vocaloidPoints", 300);
        setIntField(term501621, term501621.getClass(), "level", 1);
        setIntField(term501621, term501621.getClass(), "levelExp", 2076458515);
        setField(term501621, term501621.getClass(), "levelTitle", "xxx");
        setIntField(term501621, term501621.getClass(), "plateId", -1);
        setIntField(term501621, term501621.getClass(), "plateEffectId", -1);
        setField(term501621, term501621.getClass(), "passwordStatus", enum1112);
        setField(term501621, term501621.getClass(), "password", "**********");
        setBooleanField(term501621, term501621.getClass(), "preferPerPvModule", true);
        setBooleanField(term501621, term501621.getClass(), "preferCommonModule", false);
        setBooleanField(term501621, term501621.getClass(), "usePerPvSkin", true);
        setBooleanField(term501621, term501621.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term501621, term501621.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term501621, term501621.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term501621, term501621.getClass(), "usePerPvTouchSliderSe", false);
        setField(term501621, term501621.getClass(), "commonModule", "-999,-999,-999");
        setField(term501621, term501621.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term501745, term501745.getClass(), "year", 2026);
        setShortField(term501745, term501745.getClass(), "month", (short) 8);
        setShortField(term501745, term501745.getClass(), "day", (short) 12);
        setField(term501744, term501744.getClass(), "date", term501745);
        setByteField(term501749, term501749.getClass(), "hour", (byte) 2);
        setByteField(term501749, term501749.getClass(), "minute", (byte) 3);
        setByteField(term501749, term501749.getClass(), "second", (byte) 47);
        setIntField(term501749, term501749.getClass(), "nano", 17238000);
        setField(term501744, term501744.getClass(), "time", term501749);
        setField(term501621, term501621.getClass(), "commonModuleSetTime", term501744);
        setField(term501621, term501621.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term501621, term501621.getClass(), "commonSkin", -1);
        setIntField(term501621, term501621.getClass(), "headphoneVolume", 100);
        setBooleanField(term501621, term501621.getClass(), "buttonSeOn", true);
        setIntField(term501621, term501621.getClass(), "buttonSeVolume", 100);
        setIntField(term501621, term501621.getClass(), "sliderSeVolume", 100);
        setIntField(term501621, term501621.getClass(), "buttonSe", -1);
        setIntField(term501621, term501621.getClass(), "chainSlideSe", -1);
        setIntField(term501621, term501621.getClass(), "slideSe", -1);
        setIntField(term501621, term501621.getClass(), "sliderTouchSe", -1);
        setField(term501621, term501621.getClass(), "sortMode", enum1113);
        setIntField(term501621, term501621.getClass(), "nextPvId", -1);
        setField(term501621, term501621.getClass(), "nextDifficulty", enum1114);
        setField(term501621, term501621.getClass(), "nextEdition", enum1115);
        setBooleanField(term501621, term501621.getClass(), "showInterimRanking", true);
        setBooleanField(term501621, term501621.getClass(), "showClearStatus", true);
        setBooleanField(term501621, term501621.getClass(), "showGreatBorder", true);
        setBooleanField(term501621, term501621.getClass(), "showExcellentBorder", true);
        setBooleanField(term501621, term501621.getClass(), "showRivalBorder", true);
        setBooleanField(term501621, term501621.getClass(), "showRgoSetting", true);
        setBooleanField(term501621, term501621.getClass(), "contestNowPlayingEnable", true);
        setIntField(term501621, term501621.getClass(), "contestNowPlayingId", -1);
        setIntField(term501621, term501621.getClass(), "contestNowPlayingValue", -1);
        setField(term501621, term501621.getClass(), "contestNowPlayingResultRank", enum1116);
        setField(term501621, term501621.getClass(), "contestNowPlayingSpecifier", "");
        setField(term501621, term501621.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term501621, term501621.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term501621, term501621.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term501621, term501621.getClass(), "rivalPdId", -1);
        setField(term501619, term501619.getClass(), "pdId", term501621);
        setIntField(term501619, term501619.getClass(), "pvId", 622248745);
        setField(term501619, term501619.getClass(), "fileName", "pXdglvyrQe");
        setField(term501619, term501619.getClass(), "moduleList", "OcfNzHYdki");
        setField(term501619, term501619.getClass(), "customizeList", "uPuCVuZYOI");
        term502263 = new Long(468487103823886117L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerScreenShot");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term502263;
        callMethod(klass, "setId", argTypes, term501619, args);
    }

};


