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

public class PlayerProfile_getLevelExp_12708870316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term695875;

    public PlayerProfile_getLevelExp_12708870316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term696487 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term696486 = ((Class) term696487).getDeclaredField((String) "MISS");
        ((Field) term696486).setAccessible(true);
        Object enum1517 = ((Field) term696486).get((Object) null);
        Class<? extends Object> term696864 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term696863 = ((Class) term696864).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term696863).setAccessible(true);
        Object enum1518 = ((Field) term696863).get((Object) null);
        Class<? extends Object> term697147 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term697146 = ((Class) term697147).getDeclaredField((String) "NORMAL");
        ((Field) term697146).setAccessible(true);
        Object enum1519 = ((Field) term697146).get((Object) null);
        Class<? extends Object> term697422 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term697421 = ((Class) term697422).getDeclaredField((String) "ORIGINAL");
        ((Field) term697421).setAccessible(true);
        Object enum1520 = ((Field) term697421).get((Object) null);
        Class<? extends Object> term697688 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term697687 = ((Class) term697688).getDeclaredField((String) "NONE");
        ((Field) term697687).setAccessible(true);
        Object enum1521 = ((Field) term697687).get((Object) null);
        term695875 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term695998 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term695999 = newInstance(Class.forName("java.time.LocalDate"));
        Object term696003 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term695875, term695875.getClass(), "id", -6837989212848250735L);
        setIntField(term695875, term695875.getClass(), "pdId", -309827965);
        setField(term695875, term695875.getClass(), "playerName", "xxx");
        setIntField(term695875, term695875.getClass(), "vocaloidPoints", 300);
        setIntField(term695875, term695875.getClass(), "level", 1);
        setIntField(term695875, term695875.getClass(), "levelExp", -1534471014);
        setField(term695875, term695875.getClass(), "levelTitle", "xxx");
        setIntField(term695875, term695875.getClass(), "plateId", -1);
        setIntField(term695875, term695875.getClass(), "plateEffectId", -1);
        setField(term695875, term695875.getClass(), "passwordStatus", enum1517);
        setField(term695875, term695875.getClass(), "password", "**********");
        setBooleanField(term695875, term695875.getClass(), "preferPerPvModule", true);
        setBooleanField(term695875, term695875.getClass(), "preferCommonModule", true);
        setBooleanField(term695875, term695875.getClass(), "usePerPvSkin", true);
        setBooleanField(term695875, term695875.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term695875, term695875.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term695875, term695875.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term695875, term695875.getClass(), "usePerPvTouchSliderSe", true);
        setField(term695875, term695875.getClass(), "commonModule", "-999,-999,-999");
        setField(term695875, term695875.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term695999, term695999.getClass(), "year", 2026);
        setShortField(term695999, term695999.getClass(), "month", (short) 6);
        setShortField(term695999, term695999.getClass(), "day", (short) 29);
        setField(term695998, term695998.getClass(), "date", term695999);
        setByteField(term696003, term696003.getClass(), "hour", (byte) 4);
        setByteField(term696003, term696003.getClass(), "minute", (byte) 29);
        setByteField(term696003, term696003.getClass(), "second", (byte) 10);
        setIntField(term696003, term696003.getClass(), "nano", 790762000);
        setField(term695998, term695998.getClass(), "time", term696003);
        setField(term695875, term695875.getClass(), "commonModuleSetTime", term695998);
        setField(term695875, term695875.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term695875, term695875.getClass(), "commonSkin", -1);
        setIntField(term695875, term695875.getClass(), "headphoneVolume", 100);
        setBooleanField(term695875, term695875.getClass(), "buttonSeOn", true);
        setIntField(term695875, term695875.getClass(), "buttonSeVolume", 100);
        setIntField(term695875, term695875.getClass(), "sliderSeVolume", 100);
        setIntField(term695875, term695875.getClass(), "buttonSe", -1);
        setIntField(term695875, term695875.getClass(), "chainSlideSe", -1);
        setIntField(term695875, term695875.getClass(), "slideSe", -1);
        setIntField(term695875, term695875.getClass(), "sliderTouchSe", -1);
        setField(term695875, term695875.getClass(), "sortMode", enum1518);
        setIntField(term695875, term695875.getClass(), "nextPvId", -1);
        setField(term695875, term695875.getClass(), "nextDifficulty", enum1519);
        setField(term695875, term695875.getClass(), "nextEdition", enum1520);
        setBooleanField(term695875, term695875.getClass(), "showInterimRanking", true);
        setBooleanField(term695875, term695875.getClass(), "showClearStatus", true);
        setBooleanField(term695875, term695875.getClass(), "showGreatBorder", true);
        setBooleanField(term695875, term695875.getClass(), "showExcellentBorder", true);
        setBooleanField(term695875, term695875.getClass(), "showRivalBorder", true);
        setBooleanField(term695875, term695875.getClass(), "showRgoSetting", true);
        setBooleanField(term695875, term695875.getClass(), "contestNowPlayingEnable", false);
        setIntField(term695875, term695875.getClass(), "contestNowPlayingId", -1);
        setIntField(term695875, term695875.getClass(), "contestNowPlayingValue", -1);
        setField(term695875, term695875.getClass(), "contestNowPlayingResultRank", enum1521);
        setField(term695875, term695875.getClass(), "contestNowPlayingSpecifier", "");
        setField(term695875, term695875.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term695875, term695875.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term695875, term695875.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term695875, term695875.getClass(), "rivalPdId", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLevelExp", argTypes, term695875, args);
    }

};


