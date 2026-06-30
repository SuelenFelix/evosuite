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
import java.lang.Integer;

public class PlayerPvCustomize_setSkin_136234770318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term994507;
     Object term995234;

    public PlayerPvCustomize_setSkin_136234770318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term995243 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term995242 = ((Class) term995243).getDeclaredField((String) "MISS");
        ((Field) term995242).setAccessible(true);
        Object enum2110 = ((Field) term995242).get((Object) null);
        Class<? extends Object> term995620 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term995619 = ((Class) term995620).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term995619).setAccessible(true);
        Object enum2111 = ((Field) term995619).get((Object) null);
        Class<? extends Object> term995903 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term995902 = ((Class) term995903).getDeclaredField((String) "NORMAL");
        ((Field) term995902).setAccessible(true);
        Object enum2112 = ((Field) term995902).get((Object) null);
        Class<? extends Object> term996178 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term996177 = ((Class) term996178).getDeclaredField((String) "ORIGINAL");
        ((Field) term996177).setAccessible(true);
        Object enum2113 = ((Field) term996177).get((Object) null);
        Class<? extends Object> term996444 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term996443 = ((Class) term996444).getDeclaredField((String) "NONE");
        ((Field) term996443).setAccessible(true);
        Object enum2114 = ((Field) term996443).get((Object) null);
        term994507 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvCustomize"));
        Object term994509 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term994632 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term994633 = newInstance(Class.forName("java.time.LocalDate"));
        Object term994637 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term994507, term994507.getClass(), "id", 204473662283899955L);
        setLongField(term994509, term994509.getClass(), "id", -4029227951294167228L);
        setIntField(term994509, term994509.getClass(), "pdId", 584068841);
        setField(term994509, term994509.getClass(), "playerName", "xxx");
        setIntField(term994509, term994509.getClass(), "vocaloidPoints", 300);
        setIntField(term994509, term994509.getClass(), "level", 1);
        setIntField(term994509, term994509.getClass(), "levelExp", -289675978);
        setField(term994509, term994509.getClass(), "levelTitle", "xxx");
        setIntField(term994509, term994509.getClass(), "plateId", -1);
        setIntField(term994509, term994509.getClass(), "plateEffectId", -1);
        setField(term994509, term994509.getClass(), "passwordStatus", enum2110);
        setField(term994509, term994509.getClass(), "password", "**********");
        setBooleanField(term994509, term994509.getClass(), "preferPerPvModule", true);
        setBooleanField(term994509, term994509.getClass(), "preferCommonModule", true);
        setBooleanField(term994509, term994509.getClass(), "usePerPvSkin", false);
        setBooleanField(term994509, term994509.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term994509, term994509.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term994509, term994509.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term994509, term994509.getClass(), "usePerPvTouchSliderSe", true);
        setField(term994509, term994509.getClass(), "commonModule", "-999,-999,-999");
        setField(term994509, term994509.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term994633, term994633.getClass(), "year", 2026);
        setShortField(term994633, term994633.getClass(), "month", (short) 6);
        setShortField(term994633, term994633.getClass(), "day", (short) 29);
        setField(term994632, term994632.getClass(), "date", term994633);
        setByteField(term994637, term994637.getClass(), "hour", (byte) 4);
        setByteField(term994637, term994637.getClass(), "minute", (byte) 30);
        setByteField(term994637, term994637.getClass(), "second", (byte) 8);
        setIntField(term994637, term994637.getClass(), "nano", 734855000);
        setField(term994632, term994632.getClass(), "time", term994637);
        setField(term994509, term994509.getClass(), "commonModuleSetTime", term994632);
        setField(term994509, term994509.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term994509, term994509.getClass(), "commonSkin", -1);
        setIntField(term994509, term994509.getClass(), "headphoneVolume", 100);
        setBooleanField(term994509, term994509.getClass(), "buttonSeOn", true);
        setIntField(term994509, term994509.getClass(), "buttonSeVolume", 100);
        setIntField(term994509, term994509.getClass(), "sliderSeVolume", 100);
        setIntField(term994509, term994509.getClass(), "buttonSe", -1);
        setIntField(term994509, term994509.getClass(), "chainSlideSe", -1);
        setIntField(term994509, term994509.getClass(), "slideSe", -1);
        setIntField(term994509, term994509.getClass(), "sliderTouchSe", -1);
        setField(term994509, term994509.getClass(), "sortMode", enum2111);
        setIntField(term994509, term994509.getClass(), "nextPvId", -1);
        setField(term994509, term994509.getClass(), "nextDifficulty", enum2112);
        setField(term994509, term994509.getClass(), "nextEdition", enum2113);
        setBooleanField(term994509, term994509.getClass(), "showInterimRanking", true);
        setBooleanField(term994509, term994509.getClass(), "showClearStatus", true);
        setBooleanField(term994509, term994509.getClass(), "showGreatBorder", true);
        setBooleanField(term994509, term994509.getClass(), "showExcellentBorder", true);
        setBooleanField(term994509, term994509.getClass(), "showRivalBorder", true);
        setBooleanField(term994509, term994509.getClass(), "showRgoSetting", true);
        setBooleanField(term994509, term994509.getClass(), "contestNowPlayingEnable", false);
        setIntField(term994509, term994509.getClass(), "contestNowPlayingId", -1);
        setIntField(term994509, term994509.getClass(), "contestNowPlayingValue", -1);
        setField(term994509, term994509.getClass(), "contestNowPlayingResultRank", enum2114);
        setField(term994509, term994509.getClass(), "contestNowPlayingSpecifier", "");
        setField(term994509, term994509.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term994509, term994509.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term994509, term994509.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term994509, term994509.getClass(), "rivalPdId", -1);
        setField(term994507, term994507.getClass(), "pdId", term994509);
        setIntField(term994507, term994507.getClass(), "pvId", -1);
        setField(term994507, term994507.getClass(), "module", "-999,-999,-999");
        setField(term994507, term994507.getClass(), "customize", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setField(term994507, term994507.getClass(), "customizeFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term994507, term994507.getClass(), "skin", -1);
        setIntField(term994507, term994507.getClass(), "buttonSe", -1);
        setIntField(term994507, term994507.getClass(), "slideSe", -1);
        setIntField(term994507, term994507.getClass(), "chainSlideSe", -1);
        setIntField(term994507, term994507.getClass(), "sliderTouchSe", -1);
        term995234 = new Integer(1466847406);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvCustomize");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term995234;
        callMethod(klass, "setSkin", argTypes, term994507, args);
    }

};


