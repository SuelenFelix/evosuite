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

public class PlayerScreenShot_getPvId_7968620503 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term491531;

    public PlayerScreenShot_getPvId_7968620503() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term492182 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term492181 = ((Class) term492182).getDeclaredField((String) "MISS");
        ((Field) term492181).setAccessible(true);
        Object enum1092 = ((Field) term492181).get((Object) null);
        Class<? extends Object> term492559 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term492558 = ((Class) term492559).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term492558).setAccessible(true);
        Object enum1093 = ((Field) term492558).get((Object) null);
        Class<? extends Object> term492842 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term492841 = ((Class) term492842).getDeclaredField((String) "NORMAL");
        ((Field) term492841).setAccessible(true);
        Object enum1094 = ((Field) term492841).get((Object) null);
        Class<? extends Object> term493117 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term493116 = ((Class) term493117).getDeclaredField((String) "ORIGINAL");
        ((Field) term493116).setAccessible(true);
        Object enum1095 = ((Field) term493116).get((Object) null);
        Class<? extends Object> term493383 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term493382 = ((Class) term493383).getDeclaredField((String) "NONE");
        ((Field) term493382).setAccessible(true);
        Object enum1096 = ((Field) term493382).get((Object) null);
        term491531 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerScreenShot"));
        Object term491533 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term491656 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term491657 = newInstance(Class.forName("java.time.LocalDate"));
        Object term491661 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term491531, term491531.getClass(), "id", -5951743062322506095L);
        setLongField(term491533, term491533.getClass(), "id", 768144790810175653L);
        setIntField(term491533, term491533.getClass(), "pdId", 56756754);
        setField(term491533, term491533.getClass(), "playerName", "xxx");
        setIntField(term491533, term491533.getClass(), "vocaloidPoints", 300);
        setIntField(term491533, term491533.getClass(), "level", 1);
        setIntField(term491533, term491533.getClass(), "levelExp", -1283242129);
        setField(term491533, term491533.getClass(), "levelTitle", "xxx");
        setIntField(term491533, term491533.getClass(), "plateId", -1);
        setIntField(term491533, term491533.getClass(), "plateEffectId", -1);
        setField(term491533, term491533.getClass(), "passwordStatus", enum1092);
        setField(term491533, term491533.getClass(), "password", "**********");
        setBooleanField(term491533, term491533.getClass(), "preferPerPvModule", true);
        setBooleanField(term491533, term491533.getClass(), "preferCommonModule", true);
        setBooleanField(term491533, term491533.getClass(), "usePerPvSkin", true);
        setBooleanField(term491533, term491533.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term491533, term491533.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term491533, term491533.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term491533, term491533.getClass(), "usePerPvTouchSliderSe", true);
        setField(term491533, term491533.getClass(), "commonModule", "-999,-999,-999");
        setField(term491533, term491533.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term491657, term491657.getClass(), "year", 2026);
        setShortField(term491657, term491657.getClass(), "month", (short) 8);
        setShortField(term491657, term491657.getClass(), "day", (short) 12);
        setField(term491656, term491656.getClass(), "date", term491657);
        setByteField(term491661, term491661.getClass(), "hour", (byte) 2);
        setByteField(term491661, term491661.getClass(), "minute", (byte) 3);
        setByteField(term491661, term491661.getClass(), "second", (byte) 46);
        setIntField(term491661, term491661.getClass(), "nano", 30596000);
        setField(term491656, term491656.getClass(), "time", term491661);
        setField(term491533, term491533.getClass(), "commonModuleSetTime", term491656);
        setField(term491533, term491533.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term491533, term491533.getClass(), "commonSkin", -1);
        setIntField(term491533, term491533.getClass(), "headphoneVolume", 100);
        setBooleanField(term491533, term491533.getClass(), "buttonSeOn", true);
        setIntField(term491533, term491533.getClass(), "buttonSeVolume", 100);
        setIntField(term491533, term491533.getClass(), "sliderSeVolume", 100);
        setIntField(term491533, term491533.getClass(), "buttonSe", -1);
        setIntField(term491533, term491533.getClass(), "chainSlideSe", -1);
        setIntField(term491533, term491533.getClass(), "slideSe", -1);
        setIntField(term491533, term491533.getClass(), "sliderTouchSe", -1);
        setField(term491533, term491533.getClass(), "sortMode", enum1093);
        setIntField(term491533, term491533.getClass(), "nextPvId", -1);
        setField(term491533, term491533.getClass(), "nextDifficulty", enum1094);
        setField(term491533, term491533.getClass(), "nextEdition", enum1095);
        setBooleanField(term491533, term491533.getClass(), "showInterimRanking", true);
        setBooleanField(term491533, term491533.getClass(), "showClearStatus", true);
        setBooleanField(term491533, term491533.getClass(), "showGreatBorder", true);
        setBooleanField(term491533, term491533.getClass(), "showExcellentBorder", true);
        setBooleanField(term491533, term491533.getClass(), "showRivalBorder", true);
        setBooleanField(term491533, term491533.getClass(), "showRgoSetting", true);
        setBooleanField(term491533, term491533.getClass(), "contestNowPlayingEnable", false);
        setIntField(term491533, term491533.getClass(), "contestNowPlayingId", -1);
        setIntField(term491533, term491533.getClass(), "contestNowPlayingValue", -1);
        setField(term491533, term491533.getClass(), "contestNowPlayingResultRank", enum1096);
        setField(term491533, term491533.getClass(), "contestNowPlayingSpecifier", "");
        setField(term491533, term491533.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term491533, term491533.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term491533, term491533.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term491533, term491533.getClass(), "rivalPdId", -1);
        setField(term491531, term491531.getClass(), "pdId", term491533);
        setIntField(term491531, term491531.getClass(), "pvId", -1400827537);
        setField(term491531, term491531.getClass(), "fileName", "uSUvKAyuvd");
        setField(term491531, term491531.getClass(), "moduleList", "onQLVONGuf");
        setField(term491531, term491531.getClass(), "customizeList", "SOrEHbcbmn");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerScreenShot");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPvId", argTypes, term491531, args);
    }

};


