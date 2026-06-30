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

public class PlayerScreenShot_setFileName_45294854510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term510216;

    public PlayerScreenShot_setFileName_45294854510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term510879 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term510878 = ((Class) term510879).getDeclaredField((String) "MISS");
        ((Field) term510878).setAccessible(true);
        Object enum1127 = ((Field) term510878).get((Object) null);
        Class<? extends Object> term511256 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term511255 = ((Class) term511256).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term511255).setAccessible(true);
        Object enum1128 = ((Field) term511255).get((Object) null);
        Class<? extends Object> term511539 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term511538 = ((Class) term511539).getDeclaredField((String) "NORMAL");
        ((Field) term511538).setAccessible(true);
        Object enum1129 = ((Field) term511538).get((Object) null);
        Class<? extends Object> term511814 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term511813 = ((Class) term511814).getDeclaredField((String) "ORIGINAL");
        ((Field) term511813).setAccessible(true);
        Object enum1130 = ((Field) term511813).get((Object) null);
        Class<? extends Object> term512080 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term512079 = ((Class) term512080).getDeclaredField((String) "NONE");
        ((Field) term512079).setAccessible(true);
        Object enum1131 = ((Field) term512079).get((Object) null);
        term510216 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerScreenShot"));
        Object term510218 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term510341 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term510342 = newInstance(Class.forName("java.time.LocalDate"));
        Object term510346 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term510216, term510216.getClass(), "id", -7632759764262745126L);
        setLongField(term510218, term510218.getClass(), "id", 3746481521207337771L);
        setIntField(term510218, term510218.getClass(), "pdId", -1558194793);
        setField(term510218, term510218.getClass(), "playerName", "xxx");
        setIntField(term510218, term510218.getClass(), "vocaloidPoints", 300);
        setIntField(term510218, term510218.getClass(), "level", 1);
        setIntField(term510218, term510218.getClass(), "levelExp", -13354986);
        setField(term510218, term510218.getClass(), "levelTitle", "xxx");
        setIntField(term510218, term510218.getClass(), "plateId", -1);
        setIntField(term510218, term510218.getClass(), "plateEffectId", -1);
        setField(term510218, term510218.getClass(), "passwordStatus", enum1127);
        setField(term510218, term510218.getClass(), "password", "**********");
        setBooleanField(term510218, term510218.getClass(), "preferPerPvModule", true);
        setBooleanField(term510218, term510218.getClass(), "preferCommonModule", false);
        setBooleanField(term510218, term510218.getClass(), "usePerPvSkin", true);
        setBooleanField(term510218, term510218.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term510218, term510218.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term510218, term510218.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term510218, term510218.getClass(), "usePerPvTouchSliderSe", false);
        setField(term510218, term510218.getClass(), "commonModule", "-999,-999,-999");
        setField(term510218, term510218.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term510342, term510342.getClass(), "year", 2026);
        setShortField(term510342, term510342.getClass(), "month", (short) 6);
        setShortField(term510342, term510342.getClass(), "day", (short) 29);
        setField(term510341, term510341.getClass(), "date", term510342);
        setByteField(term510346, term510346.getClass(), "hour", (byte) 4);
        setByteField(term510346, term510346.getClass(), "minute", (byte) 28);
        setByteField(term510346, term510346.getClass(), "second", (byte) 33);
        setIntField(term510346, term510346.getClass(), "nano", 399095000);
        setField(term510341, term510341.getClass(), "time", term510346);
        setField(term510218, term510218.getClass(), "commonModuleSetTime", term510341);
        setField(term510218, term510218.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term510218, term510218.getClass(), "commonSkin", -1);
        setIntField(term510218, term510218.getClass(), "headphoneVolume", 100);
        setBooleanField(term510218, term510218.getClass(), "buttonSeOn", true);
        setIntField(term510218, term510218.getClass(), "buttonSeVolume", 100);
        setIntField(term510218, term510218.getClass(), "sliderSeVolume", 100);
        setIntField(term510218, term510218.getClass(), "buttonSe", -1);
        setIntField(term510218, term510218.getClass(), "chainSlideSe", -1);
        setIntField(term510218, term510218.getClass(), "slideSe", -1);
        setIntField(term510218, term510218.getClass(), "sliderTouchSe", -1);
        setField(term510218, term510218.getClass(), "sortMode", enum1128);
        setIntField(term510218, term510218.getClass(), "nextPvId", -1);
        setField(term510218, term510218.getClass(), "nextDifficulty", enum1129);
        setField(term510218, term510218.getClass(), "nextEdition", enum1130);
        setBooleanField(term510218, term510218.getClass(), "showInterimRanking", true);
        setBooleanField(term510218, term510218.getClass(), "showClearStatus", true);
        setBooleanField(term510218, term510218.getClass(), "showGreatBorder", true);
        setBooleanField(term510218, term510218.getClass(), "showExcellentBorder", true);
        setBooleanField(term510218, term510218.getClass(), "showRivalBorder", true);
        setBooleanField(term510218, term510218.getClass(), "showRgoSetting", true);
        setBooleanField(term510218, term510218.getClass(), "contestNowPlayingEnable", false);
        setIntField(term510218, term510218.getClass(), "contestNowPlayingId", -1);
        setIntField(term510218, term510218.getClass(), "contestNowPlayingValue", -1);
        setField(term510218, term510218.getClass(), "contestNowPlayingResultRank", enum1131);
        setField(term510218, term510218.getClass(), "contestNowPlayingSpecifier", "");
        setField(term510218, term510218.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term510218, term510218.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term510218, term510218.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term510218, term510218.getClass(), "rivalPdId", -1);
        setField(term510216, term510216.getClass(), "pdId", term510218);
        setIntField(term510216, term510216.getClass(), "pvId", -2134459880);
        setField(term510216, term510216.getClass(), "fileName", "tsTGdgQYUL");
        setField(term510216, term510216.getClass(), "moduleList", "TtGbVmKcnX");
        setField(term510216, term510216.getClass(), "customizeList", "GJVkUrCVdD");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerScreenShot");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "zNdorvdUgu";
        callMethod(klass, "setFileName", argTypes, term510216, args);
    }

};


