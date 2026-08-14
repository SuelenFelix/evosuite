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

public class PlayerProfile_toString_1077246745104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term937405;

    public PlayerProfile_toString_1077246745104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term938017 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term938016 = ((Class) term938017).getDeclaredField((String) "MISS");
        ((Field) term938016).setAccessible(true);
        Object enum2010 = ((Field) term938016).get((Object) null);
        Class<? extends Object> term938394 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term938393 = ((Class) term938394).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term938393).setAccessible(true);
        Object enum2011 = ((Field) term938393).get((Object) null);
        Class<? extends Object> term938677 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term938676 = ((Class) term938677).getDeclaredField((String) "NORMAL");
        ((Field) term938676).setAccessible(true);
        Object enum2012 = ((Field) term938676).get((Object) null);
        Class<? extends Object> term938952 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term938951 = ((Class) term938952).getDeclaredField((String) "ORIGINAL");
        ((Field) term938951).setAccessible(true);
        Object enum2013 = ((Field) term938951).get((Object) null);
        Class<? extends Object> term939218 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term939217 = ((Class) term939218).getDeclaredField((String) "NONE");
        ((Field) term939217).setAccessible(true);
        Object enum2014 = ((Field) term939217).get((Object) null);
        term937405 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term937528 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term937529 = newInstance(Class.forName("java.time.LocalDate"));
        Object term937533 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term937405, term937405.getClass(), "id", 6437032166810658671L);
        setIntField(term937405, term937405.getClass(), "pdId", 1130655068);
        setField(term937405, term937405.getClass(), "playerName", "xxx");
        setIntField(term937405, term937405.getClass(), "vocaloidPoints", 300);
        setIntField(term937405, term937405.getClass(), "level", 1);
        setIntField(term937405, term937405.getClass(), "levelExp", 1747437566);
        setField(term937405, term937405.getClass(), "levelTitle", "xxx");
        setIntField(term937405, term937405.getClass(), "plateId", -1);
        setIntField(term937405, term937405.getClass(), "plateEffectId", -1);
        setField(term937405, term937405.getClass(), "passwordStatus", enum2010);
        setField(term937405, term937405.getClass(), "password", "**********");
        setBooleanField(term937405, term937405.getClass(), "preferPerPvModule", true);
        setBooleanField(term937405, term937405.getClass(), "preferCommonModule", false);
        setBooleanField(term937405, term937405.getClass(), "usePerPvSkin", true);
        setBooleanField(term937405, term937405.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term937405, term937405.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term937405, term937405.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term937405, term937405.getClass(), "usePerPvTouchSliderSe", false);
        setField(term937405, term937405.getClass(), "commonModule", "-999,-999,-999");
        setField(term937405, term937405.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term937529, term937529.getClass(), "year", 2026);
        setShortField(term937529, term937529.getClass(), "month", (short) 8);
        setShortField(term937529, term937529.getClass(), "day", (short) 12);
        setField(term937528, term937528.getClass(), "date", term937529);
        setByteField(term937533, term937533.getClass(), "hour", (byte) 2);
        setByteField(term937533, term937533.getClass(), "minute", (byte) 4);
        setByteField(term937533, term937533.getClass(), "second", (byte) 49);
        setIntField(term937533, term937533.getClass(), "nano", 503736000);
        setField(term937528, term937528.getClass(), "time", term937533);
        setField(term937405, term937405.getClass(), "commonModuleSetTime", term937528);
        setField(term937405, term937405.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term937405, term937405.getClass(), "commonSkin", -1);
        setIntField(term937405, term937405.getClass(), "headphoneVolume", 100);
        setBooleanField(term937405, term937405.getClass(), "buttonSeOn", true);
        setIntField(term937405, term937405.getClass(), "buttonSeVolume", 100);
        setIntField(term937405, term937405.getClass(), "sliderSeVolume", 100);
        setIntField(term937405, term937405.getClass(), "buttonSe", -1);
        setIntField(term937405, term937405.getClass(), "chainSlideSe", -1);
        setIntField(term937405, term937405.getClass(), "slideSe", -1);
        setIntField(term937405, term937405.getClass(), "sliderTouchSe", -1);
        setField(term937405, term937405.getClass(), "sortMode", enum2011);
        setIntField(term937405, term937405.getClass(), "nextPvId", -1);
        setField(term937405, term937405.getClass(), "nextDifficulty", enum2012);
        setField(term937405, term937405.getClass(), "nextEdition", enum2013);
        setBooleanField(term937405, term937405.getClass(), "showInterimRanking", true);
        setBooleanField(term937405, term937405.getClass(), "showClearStatus", true);
        setBooleanField(term937405, term937405.getClass(), "showGreatBorder", true);
        setBooleanField(term937405, term937405.getClass(), "showExcellentBorder", true);
        setBooleanField(term937405, term937405.getClass(), "showRivalBorder", true);
        setBooleanField(term937405, term937405.getClass(), "showRgoSetting", true);
        setBooleanField(term937405, term937405.getClass(), "contestNowPlayingEnable", false);
        setIntField(term937405, term937405.getClass(), "contestNowPlayingId", -1);
        setIntField(term937405, term937405.getClass(), "contestNowPlayingValue", -1);
        setField(term937405, term937405.getClass(), "contestNowPlayingResultRank", enum2014);
        setField(term937405, term937405.getClass(), "contestNowPlayingSpecifier", "");
        setField(term937405, term937405.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term937405, term937405.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term937405, term937405.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term937405, term937405.getClass(), "rivalPdId", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term937405, args);
    }

};


