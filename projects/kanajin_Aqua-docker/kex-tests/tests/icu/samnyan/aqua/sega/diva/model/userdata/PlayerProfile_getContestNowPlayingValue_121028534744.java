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

public class PlayerProfile_getContestNowPlayingValue_121028534744 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term789089;

    public PlayerProfile_getContestNowPlayingValue_121028534744() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term789701 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term789700 = ((Class) term789701).getDeclaredField((String) "MISS");
        ((Field) term789700).setAccessible(true);
        Object enum1707 = ((Field) term789700).get((Object) null);
        Class<? extends Object> term790078 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term790077 = ((Class) term790078).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term790077).setAccessible(true);
        Object enum1708 = ((Field) term790077).get((Object) null);
        Class<? extends Object> term790361 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term790360 = ((Class) term790361).getDeclaredField((String) "NORMAL");
        ((Field) term790360).setAccessible(true);
        Object enum1709 = ((Field) term790360).get((Object) null);
        Class<? extends Object> term790636 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term790635 = ((Class) term790636).getDeclaredField((String) "ORIGINAL");
        ((Field) term790635).setAccessible(true);
        Object enum1710 = ((Field) term790635).get((Object) null);
        Class<? extends Object> term790902 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term790901 = ((Class) term790902).getDeclaredField((String) "NONE");
        ((Field) term790901).setAccessible(true);
        Object enum1711 = ((Field) term790901).get((Object) null);
        term789089 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term789212 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term789213 = newInstance(Class.forName("java.time.LocalDate"));
        Object term789217 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term789089, term789089.getClass(), "id", -4905558793519537969L);
        setIntField(term789089, term789089.getClass(), "pdId", 491595035);
        setField(term789089, term789089.getClass(), "playerName", "xxx");
        setIntField(term789089, term789089.getClass(), "vocaloidPoints", 300);
        setIntField(term789089, term789089.getClass(), "level", 1);
        setIntField(term789089, term789089.getClass(), "levelExp", 2111929590);
        setField(term789089, term789089.getClass(), "levelTitle", "xxx");
        setIntField(term789089, term789089.getClass(), "plateId", -1);
        setIntField(term789089, term789089.getClass(), "plateEffectId", -1);
        setField(term789089, term789089.getClass(), "passwordStatus", enum1707);
        setField(term789089, term789089.getClass(), "password", "**********");
        setBooleanField(term789089, term789089.getClass(), "preferPerPvModule", true);
        setBooleanField(term789089, term789089.getClass(), "preferCommonModule", true);
        setBooleanField(term789089, term789089.getClass(), "usePerPvSkin", true);
        setBooleanField(term789089, term789089.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term789089, term789089.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term789089, term789089.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term789089, term789089.getClass(), "usePerPvTouchSliderSe", true);
        setField(term789089, term789089.getClass(), "commonModule", "-999,-999,-999");
        setField(term789089, term789089.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term789213, term789213.getClass(), "year", 2026);
        setShortField(term789213, term789213.getClass(), "month", (short) 6);
        setShortField(term789213, term789213.getClass(), "day", (short) 29);
        setField(term789212, term789212.getClass(), "date", term789213);
        setByteField(term789217, term789217.getClass(), "hour", (byte) 4);
        setByteField(term789217, term789217.getClass(), "minute", (byte) 29);
        setByteField(term789217, term789217.getClass(), "second", (byte) 20);
        setIntField(term789217, term789217.getClass(), "nano", 547849000);
        setField(term789212, term789212.getClass(), "time", term789217);
        setField(term789089, term789089.getClass(), "commonModuleSetTime", term789212);
        setField(term789089, term789089.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term789089, term789089.getClass(), "commonSkin", -1);
        setIntField(term789089, term789089.getClass(), "headphoneVolume", 100);
        setBooleanField(term789089, term789089.getClass(), "buttonSeOn", true);
        setIntField(term789089, term789089.getClass(), "buttonSeVolume", 100);
        setIntField(term789089, term789089.getClass(), "sliderSeVolume", 100);
        setIntField(term789089, term789089.getClass(), "buttonSe", -1);
        setIntField(term789089, term789089.getClass(), "chainSlideSe", -1);
        setIntField(term789089, term789089.getClass(), "slideSe", -1);
        setIntField(term789089, term789089.getClass(), "sliderTouchSe", -1);
        setField(term789089, term789089.getClass(), "sortMode", enum1708);
        setIntField(term789089, term789089.getClass(), "nextPvId", -1);
        setField(term789089, term789089.getClass(), "nextDifficulty", enum1709);
        setField(term789089, term789089.getClass(), "nextEdition", enum1710);
        setBooleanField(term789089, term789089.getClass(), "showInterimRanking", true);
        setBooleanField(term789089, term789089.getClass(), "showClearStatus", true);
        setBooleanField(term789089, term789089.getClass(), "showGreatBorder", true);
        setBooleanField(term789089, term789089.getClass(), "showExcellentBorder", true);
        setBooleanField(term789089, term789089.getClass(), "showRivalBorder", true);
        setBooleanField(term789089, term789089.getClass(), "showRgoSetting", true);
        setBooleanField(term789089, term789089.getClass(), "contestNowPlayingEnable", false);
        setIntField(term789089, term789089.getClass(), "contestNowPlayingId", -1);
        setIntField(term789089, term789089.getClass(), "contestNowPlayingValue", -1);
        setField(term789089, term789089.getClass(), "contestNowPlayingResultRank", enum1711);
        setField(term789089, term789089.getClass(), "contestNowPlayingSpecifier", "");
        setField(term789089, term789089.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term789089, term789089.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term789089, term789089.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term789089, term789089.getClass(), "rivalPdId", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getContestNowPlayingValue", argTypes, term789089, args);
    }

};


