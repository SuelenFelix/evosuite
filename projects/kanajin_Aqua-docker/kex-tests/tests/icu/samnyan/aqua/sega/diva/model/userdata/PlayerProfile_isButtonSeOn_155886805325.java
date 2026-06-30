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

public class PlayerProfile_isButtonSeOn_155886805325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term742482;

    public PlayerProfile_isButtonSeOn_155886805325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term743094 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term743093 = ((Class) term743094).getDeclaredField((String) "MISS");
        ((Field) term743093).setAccessible(true);
        Object enum1612 = ((Field) term743093).get((Object) null);
        Class<? extends Object> term743471 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term743470 = ((Class) term743471).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term743470).setAccessible(true);
        Object enum1613 = ((Field) term743470).get((Object) null);
        Class<? extends Object> term743754 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term743753 = ((Class) term743754).getDeclaredField((String) "NORMAL");
        ((Field) term743753).setAccessible(true);
        Object enum1614 = ((Field) term743753).get((Object) null);
        Class<? extends Object> term744029 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term744028 = ((Class) term744029).getDeclaredField((String) "ORIGINAL");
        ((Field) term744028).setAccessible(true);
        Object enum1615 = ((Field) term744028).get((Object) null);
        Class<? extends Object> term744295 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term744294 = ((Class) term744295).getDeclaredField((String) "NONE");
        ((Field) term744294).setAccessible(true);
        Object enum1616 = ((Field) term744294).get((Object) null);
        term742482 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term742605 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term742606 = newInstance(Class.forName("java.time.LocalDate"));
        Object term742610 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term742482, term742482.getClass(), "id", 4115148503664117517L);
        setIntField(term742482, term742482.getClass(), "pdId", 2069622671);
        setField(term742482, term742482.getClass(), "playerName", "xxx");
        setIntField(term742482, term742482.getClass(), "vocaloidPoints", 300);
        setIntField(term742482, term742482.getClass(), "level", 1);
        setIntField(term742482, term742482.getClass(), "levelExp", 86341231);
        setField(term742482, term742482.getClass(), "levelTitle", "xxx");
        setIntField(term742482, term742482.getClass(), "plateId", -1);
        setIntField(term742482, term742482.getClass(), "plateEffectId", -1);
        setField(term742482, term742482.getClass(), "passwordStatus", enum1612);
        setField(term742482, term742482.getClass(), "password", "**********");
        setBooleanField(term742482, term742482.getClass(), "preferPerPvModule", true);
        setBooleanField(term742482, term742482.getClass(), "preferCommonModule", false);
        setBooleanField(term742482, term742482.getClass(), "usePerPvSkin", true);
        setBooleanField(term742482, term742482.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term742482, term742482.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term742482, term742482.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term742482, term742482.getClass(), "usePerPvTouchSliderSe", false);
        setField(term742482, term742482.getClass(), "commonModule", "-999,-999,-999");
        setField(term742482, term742482.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term742606, term742606.getClass(), "year", 2026);
        setShortField(term742606, term742606.getClass(), "month", (short) 6);
        setShortField(term742606, term742606.getClass(), "day", (short) 29);
        setField(term742605, term742605.getClass(), "date", term742606);
        setByteField(term742610, term742610.getClass(), "hour", (byte) 4);
        setByteField(term742610, term742610.getClass(), "minute", (byte) 29);
        setByteField(term742610, term742610.getClass(), "second", (byte) 15);
        setIntField(term742610, term742610.getClass(), "nano", 674792000);
        setField(term742605, term742605.getClass(), "time", term742610);
        setField(term742482, term742482.getClass(), "commonModuleSetTime", term742605);
        setField(term742482, term742482.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term742482, term742482.getClass(), "commonSkin", -1);
        setIntField(term742482, term742482.getClass(), "headphoneVolume", 100);
        setBooleanField(term742482, term742482.getClass(), "buttonSeOn", true);
        setIntField(term742482, term742482.getClass(), "buttonSeVolume", 100);
        setIntField(term742482, term742482.getClass(), "sliderSeVolume", 100);
        setIntField(term742482, term742482.getClass(), "buttonSe", -1);
        setIntField(term742482, term742482.getClass(), "chainSlideSe", -1);
        setIntField(term742482, term742482.getClass(), "slideSe", -1);
        setIntField(term742482, term742482.getClass(), "sliderTouchSe", -1);
        setField(term742482, term742482.getClass(), "sortMode", enum1613);
        setIntField(term742482, term742482.getClass(), "nextPvId", -1);
        setField(term742482, term742482.getClass(), "nextDifficulty", enum1614);
        setField(term742482, term742482.getClass(), "nextEdition", enum1615);
        setBooleanField(term742482, term742482.getClass(), "showInterimRanking", true);
        setBooleanField(term742482, term742482.getClass(), "showClearStatus", true);
        setBooleanField(term742482, term742482.getClass(), "showGreatBorder", true);
        setBooleanField(term742482, term742482.getClass(), "showExcellentBorder", true);
        setBooleanField(term742482, term742482.getClass(), "showRivalBorder", true);
        setBooleanField(term742482, term742482.getClass(), "showRgoSetting", true);
        setBooleanField(term742482, term742482.getClass(), "contestNowPlayingEnable", false);
        setIntField(term742482, term742482.getClass(), "contestNowPlayingId", -1);
        setIntField(term742482, term742482.getClass(), "contestNowPlayingValue", -1);
        setField(term742482, term742482.getClass(), "contestNowPlayingResultRank", enum1616);
        setField(term742482, term742482.getClass(), "contestNowPlayingSpecifier", "");
        setField(term742482, term742482.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term742482, term742482.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term742482, term742482.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term742482, term742482.getClass(), "rivalPdId", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isButtonSeOn", argTypes, term742482, args);
    }

};


