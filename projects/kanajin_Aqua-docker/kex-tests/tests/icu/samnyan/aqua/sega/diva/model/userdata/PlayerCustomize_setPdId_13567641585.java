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

public class PlayerCustomize_setPdId_13567641585 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term465702;
     Object term466310;

    public PlayerCustomize_setPdId_13567641585() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term466863 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term466862 = ((Class) term466863).getDeclaredField((String) "MISS");
        ((Field) term466862).setAccessible(true);
        Object enum1042 = ((Field) term466862).get((Object) null);
        Class<? extends Object> term467240 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term467239 = ((Class) term467240).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term467239).setAccessible(true);
        Object enum1043 = ((Field) term467239).get((Object) null);
        Class<? extends Object> term467523 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term467522 = ((Class) term467523).getDeclaredField((String) "NORMAL");
        ((Field) term467522).setAccessible(true);
        Object enum1044 = ((Field) term467522).get((Object) null);
        Class<? extends Object> term467798 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term467797 = ((Class) term467798).getDeclaredField((String) "ORIGINAL");
        ((Field) term467797).setAccessible(true);
        Object enum1045 = ((Field) term467797).get((Object) null);
        Class<? extends Object> term468064 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term468063 = ((Class) term468064).getDeclaredField((String) "NONE");
        ((Field) term468063).setAccessible(true);
        Object enum1046 = ((Field) term468063).get((Object) null);
        term465702 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerCustomize"));
        Object term465704 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term465827 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term465828 = newInstance(Class.forName("java.time.LocalDate"));
        Object term465832 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term465702, term465702.getClass(), "id", 1346299551708610248L);
        setLongField(term465704, term465704.getClass(), "id", -7191625829563442696L);
        setIntField(term465704, term465704.getClass(), "pdId", 2002558305);
        setField(term465704, term465704.getClass(), "playerName", "xxx");
        setIntField(term465704, term465704.getClass(), "vocaloidPoints", 300);
        setIntField(term465704, term465704.getClass(), "level", 1);
        setIntField(term465704, term465704.getClass(), "levelExp", -1729207675);
        setField(term465704, term465704.getClass(), "levelTitle", "xxx");
        setIntField(term465704, term465704.getClass(), "plateId", -1);
        setIntField(term465704, term465704.getClass(), "plateEffectId", -1);
        setField(term465704, term465704.getClass(), "passwordStatus", enum1042);
        setField(term465704, term465704.getClass(), "password", "**********");
        setBooleanField(term465704, term465704.getClass(), "preferPerPvModule", true);
        setBooleanField(term465704, term465704.getClass(), "preferCommonModule", true);
        setBooleanField(term465704, term465704.getClass(), "usePerPvSkin", true);
        setBooleanField(term465704, term465704.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term465704, term465704.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term465704, term465704.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term465704, term465704.getClass(), "usePerPvTouchSliderSe", false);
        setField(term465704, term465704.getClass(), "commonModule", "-999,-999,-999");
        setField(term465704, term465704.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term465828, term465828.getClass(), "year", 2026);
        setShortField(term465828, term465828.getClass(), "month", (short) 8);
        setShortField(term465828, term465828.getClass(), "day", (short) 12);
        setField(term465827, term465827.getClass(), "date", term465828);
        setByteField(term465832, term465832.getClass(), "hour", (byte) 2);
        setByteField(term465832, term465832.getClass(), "minute", (byte) 3);
        setByteField(term465832, term465832.getClass(), "second", (byte) 40);
        setIntField(term465832, term465832.getClass(), "nano", 138538000);
        setField(term465827, term465827.getClass(), "time", term465832);
        setField(term465704, term465704.getClass(), "commonModuleSetTime", term465827);
        setField(term465704, term465704.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term465704, term465704.getClass(), "commonSkin", -1);
        setIntField(term465704, term465704.getClass(), "headphoneVolume", 100);
        setBooleanField(term465704, term465704.getClass(), "buttonSeOn", true);
        setIntField(term465704, term465704.getClass(), "buttonSeVolume", 100);
        setIntField(term465704, term465704.getClass(), "sliderSeVolume", 100);
        setIntField(term465704, term465704.getClass(), "buttonSe", -1);
        setIntField(term465704, term465704.getClass(), "chainSlideSe", -1);
        setIntField(term465704, term465704.getClass(), "slideSe", -1);
        setIntField(term465704, term465704.getClass(), "sliderTouchSe", -1);
        setField(term465704, term465704.getClass(), "sortMode", enum1043);
        setIntField(term465704, term465704.getClass(), "nextPvId", -1);
        setField(term465704, term465704.getClass(), "nextDifficulty", enum1044);
        setField(term465704, term465704.getClass(), "nextEdition", enum1045);
        setBooleanField(term465704, term465704.getClass(), "showInterimRanking", true);
        setBooleanField(term465704, term465704.getClass(), "showClearStatus", true);
        setBooleanField(term465704, term465704.getClass(), "showGreatBorder", true);
        setBooleanField(term465704, term465704.getClass(), "showExcellentBorder", true);
        setBooleanField(term465704, term465704.getClass(), "showRivalBorder", true);
        setBooleanField(term465704, term465704.getClass(), "showRgoSetting", true);
        setBooleanField(term465704, term465704.getClass(), "contestNowPlayingEnable", true);
        setIntField(term465704, term465704.getClass(), "contestNowPlayingId", -1);
        setIntField(term465704, term465704.getClass(), "contestNowPlayingValue", -1);
        setField(term465704, term465704.getClass(), "contestNowPlayingResultRank", enum1046);
        setField(term465704, term465704.getClass(), "contestNowPlayingSpecifier", "");
        setField(term465704, term465704.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term465704, term465704.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term465704, term465704.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term465704, term465704.getClass(), "rivalPdId", -1);
        setField(term465702, term465702.getClass(), "pdId", term465704);
        setIntField(term465702, term465702.getClass(), "customizeId", -861852803);
        term466310 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term466424 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term466425 = newInstance(Class.forName("java.time.LocalDate"));
        Object term466429 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term466310, term466310.getClass(), "id", 1463379874413441830L);
        setIntField(term466310, term466310.getClass(), "pdId", -2085852488);
        setField(term466310, term466310.getClass(), "playerName", "xxx");
        setIntField(term466310, term466310.getClass(), "vocaloidPoints", 300);
        setIntField(term466310, term466310.getClass(), "level", 1);
        setIntField(term466310, term466310.getClass(), "levelExp", 600214846);
        setField(term466310, term466310.getClass(), "levelTitle", "xxx");
        setIntField(term466310, term466310.getClass(), "plateId", -1);
        setIntField(term466310, term466310.getClass(), "plateEffectId", -1);
        setField(term466310, term466310.getClass(), "passwordStatus", enum1042);
        setField(term466310, term466310.getClass(), "password", "**********");
        setBooleanField(term466310, term466310.getClass(), "preferPerPvModule", true);
        setBooleanField(term466310, term466310.getClass(), "preferCommonModule", false);
        setBooleanField(term466310, term466310.getClass(), "usePerPvSkin", false);
        setBooleanField(term466310, term466310.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term466310, term466310.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term466310, term466310.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term466310, term466310.getClass(), "usePerPvTouchSliderSe", false);
        setField(term466310, term466310.getClass(), "commonModule", "-999,-999,-999");
        setField(term466310, term466310.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term466425, term466425.getClass(), "year", 2026);
        setShortField(term466425, term466425.getClass(), "month", (short) 8);
        setShortField(term466425, term466425.getClass(), "day", (short) 12);
        setField(term466424, term466424.getClass(), "date", term466425);
        setByteField(term466429, term466429.getClass(), "hour", (byte) 2);
        setByteField(term466429, term466429.getClass(), "minute", (byte) 3);
        setByteField(term466429, term466429.getClass(), "second", (byte) 40);
        setIntField(term466429, term466429.getClass(), "nano", 138931000);
        setField(term466424, term466424.getClass(), "time", term466429);
        setField(term466310, term466310.getClass(), "commonModuleSetTime", term466424);
        setField(term466310, term466310.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term466310, term466310.getClass(), "commonSkin", -1);
        setIntField(term466310, term466310.getClass(), "headphoneVolume", 100);
        setBooleanField(term466310, term466310.getClass(), "buttonSeOn", true);
        setIntField(term466310, term466310.getClass(), "buttonSeVolume", 100);
        setIntField(term466310, term466310.getClass(), "sliderSeVolume", 100);
        setIntField(term466310, term466310.getClass(), "buttonSe", -1);
        setIntField(term466310, term466310.getClass(), "chainSlideSe", -1);
        setIntField(term466310, term466310.getClass(), "slideSe", -1);
        setIntField(term466310, term466310.getClass(), "sliderTouchSe", -1);
        setField(term466310, term466310.getClass(), "sortMode", enum1043);
        setIntField(term466310, term466310.getClass(), "nextPvId", -1);
        setField(term466310, term466310.getClass(), "nextDifficulty", enum1044);
        setField(term466310, term466310.getClass(), "nextEdition", enum1045);
        setBooleanField(term466310, term466310.getClass(), "showInterimRanking", true);
        setBooleanField(term466310, term466310.getClass(), "showClearStatus", true);
        setBooleanField(term466310, term466310.getClass(), "showGreatBorder", true);
        setBooleanField(term466310, term466310.getClass(), "showExcellentBorder", true);
        setBooleanField(term466310, term466310.getClass(), "showRivalBorder", true);
        setBooleanField(term466310, term466310.getClass(), "showRgoSetting", true);
        setBooleanField(term466310, term466310.getClass(), "contestNowPlayingEnable", true);
        setIntField(term466310, term466310.getClass(), "contestNowPlayingId", -1);
        setIntField(term466310, term466310.getClass(), "contestNowPlayingValue", -1);
        setField(term466310, term466310.getClass(), "contestNowPlayingResultRank", enum1046);
        setField(term466310, term466310.getClass(), "contestNowPlayingSpecifier", "");
        setField(term466310, term466310.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term466310, term466310.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term466310, term466310.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term466310, term466310.getClass(), "rivalPdId", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerCustomize");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Object[] args = new Object[1];
        args[0] = term466310;
        callMethod(klass, "setPdId", argTypes, term465702, args);
    }

};


