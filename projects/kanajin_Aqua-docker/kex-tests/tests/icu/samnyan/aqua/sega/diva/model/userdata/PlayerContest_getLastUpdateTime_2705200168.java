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

public class PlayerContest_getLastUpdateTime_2705200168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19979;

    public PlayerContest_getLastUpdateTime_2705200168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term20607 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term20606 = ((Class) term20607).getDeclaredField((String) "MISS");
        ((Field) term20606).setAccessible(true);
        Object enum40 = ((Field) term20606).get((Object) null);
        Class<? extends Object> term20984 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term20983 = ((Class) term20984).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term20983).setAccessible(true);
        Object enum41 = ((Field) term20983).get((Object) null);
        Class<? extends Object> term21267 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term21266 = ((Class) term21267).getDeclaredField((String) "NORMAL");
        ((Field) term21266).setAccessible(true);
        Object enum42 = ((Field) term21266).get((Object) null);
        Class<? extends Object> term21542 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term21541 = ((Class) term21542).getDeclaredField((String) "ORIGINAL");
        ((Field) term21541).setAccessible(true);
        Object enum43 = ((Field) term21541).get((Object) null);
        Class<? extends Object> term21808 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term21807 = ((Class) term21808).getDeclaredField((String) "NONE");
        ((Field) term21807).setAccessible(true);
        Object enum44 = ((Field) term21807).get((Object) null);
        term19979 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerContest"));
        Object term19981 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term20104 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term20105 = newInstance(Class.forName("java.time.LocalDate"));
        Object term20109 = newInstance(Class.forName("java.time.LocalTime"));
        Object term20590 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term20591 = newInstance(Class.forName("java.time.LocalDate"));
        Object term20595 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term19979, term19979.getClass(), "id", -872011222785455006L);
        setLongField(term19981, term19981.getClass(), "id", -316468845751588286L);
        setIntField(term19981, term19981.getClass(), "pdId", -1179120542);
        setField(term19981, term19981.getClass(), "playerName", "xxx");
        setIntField(term19981, term19981.getClass(), "vocaloidPoints", 300);
        setIntField(term19981, term19981.getClass(), "level", 1);
        setIntField(term19981, term19981.getClass(), "levelExp", -73683645);
        setField(term19981, term19981.getClass(), "levelTitle", "xxx");
        setIntField(term19981, term19981.getClass(), "plateId", -1);
        setIntField(term19981, term19981.getClass(), "plateEffectId", -1);
        setField(term19981, term19981.getClass(), "passwordStatus", enum40);
        setField(term19981, term19981.getClass(), "password", "**********");
        setBooleanField(term19981, term19981.getClass(), "preferPerPvModule", true);
        setBooleanField(term19981, term19981.getClass(), "preferCommonModule", false);
        setBooleanField(term19981, term19981.getClass(), "usePerPvSkin", true);
        setBooleanField(term19981, term19981.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term19981, term19981.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term19981, term19981.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term19981, term19981.getClass(), "usePerPvTouchSliderSe", false);
        setField(term19981, term19981.getClass(), "commonModule", "-999,-999,-999");
        setField(term19981, term19981.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term20105, term20105.getClass(), "year", 2026);
        setShortField(term20105, term20105.getClass(), "month", (short) 8);
        setShortField(term20105, term20105.getClass(), "day", (short) 12);
        setField(term20104, term20104.getClass(), "date", term20105);
        setByteField(term20109, term20109.getClass(), "hour", (byte) 2);
        setByteField(term20109, term20109.getClass(), "minute", (byte) 2);
        setByteField(term20109, term20109.getClass(), "second", (byte) 29);
        setIntField(term20109, term20109.getClass(), "nano", 893154000);
        setField(term20104, term20104.getClass(), "time", term20109);
        setField(term19981, term19981.getClass(), "commonModuleSetTime", term20104);
        setField(term19981, term19981.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term19981, term19981.getClass(), "commonSkin", -1);
        setIntField(term19981, term19981.getClass(), "headphoneVolume", 100);
        setBooleanField(term19981, term19981.getClass(), "buttonSeOn", true);
        setIntField(term19981, term19981.getClass(), "buttonSeVolume", 100);
        setIntField(term19981, term19981.getClass(), "sliderSeVolume", 100);
        setIntField(term19981, term19981.getClass(), "buttonSe", -1);
        setIntField(term19981, term19981.getClass(), "chainSlideSe", -1);
        setIntField(term19981, term19981.getClass(), "slideSe", -1);
        setIntField(term19981, term19981.getClass(), "sliderTouchSe", -1);
        setField(term19981, term19981.getClass(), "sortMode", enum41);
        setIntField(term19981, term19981.getClass(), "nextPvId", -1);
        setField(term19981, term19981.getClass(), "nextDifficulty", enum42);
        setField(term19981, term19981.getClass(), "nextEdition", enum43);
        setBooleanField(term19981, term19981.getClass(), "showInterimRanking", true);
        setBooleanField(term19981, term19981.getClass(), "showClearStatus", true);
        setBooleanField(term19981, term19981.getClass(), "showGreatBorder", true);
        setBooleanField(term19981, term19981.getClass(), "showExcellentBorder", true);
        setBooleanField(term19981, term19981.getClass(), "showRivalBorder", true);
        setBooleanField(term19981, term19981.getClass(), "showRgoSetting", true);
        setBooleanField(term19981, term19981.getClass(), "contestNowPlayingEnable", true);
        setIntField(term19981, term19981.getClass(), "contestNowPlayingId", -1);
        setIntField(term19981, term19981.getClass(), "contestNowPlayingValue", -1);
        setField(term19981, term19981.getClass(), "contestNowPlayingResultRank", enum44);
        setField(term19981, term19981.getClass(), "contestNowPlayingSpecifier", "");
        setField(term19981, term19981.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term19981, term19981.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term19981, term19981.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term19981, term19981.getClass(), "rivalPdId", -1);
        setField(term19979, term19979.getClass(), "pdId", term19981);
        setIntField(term19979, term19979.getClass(), "contestId", -226514366);
        setIntField(term19979, term19979.getClass(), "startCount", 1193880199);
        setField(term19979, term19979.getClass(), "resultRank", enum44);
        setIntField(term19979, term19979.getClass(), "bestValue", -1);
        setIntField(term19979, term19979.getClass(), "flag", -1);
        setIntField(term20591, term20591.getClass(), "year", 2026);
        setShortField(term20591, term20591.getClass(), "month", (short) 8);
        setShortField(term20591, term20591.getClass(), "day", (short) 12);
        setField(term20590, term20590.getClass(), "date", term20591);
        setByteField(term20595, term20595.getClass(), "hour", (byte) 2);
        setByteField(term20595, term20595.getClass(), "minute", (byte) 2);
        setByteField(term20595, term20595.getClass(), "second", (byte) 29);
        setIntField(term20595, term20595.getClass(), "nano", 892932000);
        setField(term20590, term20590.getClass(), "time", term20595);
        setField(term19979, term19979.getClass(), "lastUpdateTime", term20590);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerContest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastUpdateTime", argTypes, term19979, args);
    }

};


