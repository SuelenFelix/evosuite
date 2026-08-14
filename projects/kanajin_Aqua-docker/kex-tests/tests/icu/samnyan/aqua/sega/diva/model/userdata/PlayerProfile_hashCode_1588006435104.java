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

public class PlayerProfile_hashCode_1588006435104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4907777;

    public PlayerProfile_hashCode_1588006435104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4908389 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term4908388 = ((Class) term4908389).getDeclaredField((String) "MISS");
        ((Field) term4908388).setAccessible(true);
        Object enum3152 = ((Field) term4908388).get((Object) null);
        Class<? extends Object> term4908766 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term4908765 = ((Class) term4908766).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term4908765).setAccessible(true);
        Object enum3153 = ((Field) term4908765).get((Object) null);
        Class<? extends Object> term4909049 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term4909048 = ((Class) term4909049).getDeclaredField((String) "NORMAL");
        ((Field) term4909048).setAccessible(true);
        Object enum3154 = ((Field) term4909048).get((Object) null);
        Class<? extends Object> term4909324 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term4909323 = ((Class) term4909324).getDeclaredField((String) "ORIGINAL");
        ((Field) term4909323).setAccessible(true);
        Object enum3155 = ((Field) term4909323).get((Object) null);
        Class<? extends Object> term4909590 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term4909589 = ((Class) term4909590).getDeclaredField((String) "NONE");
        ((Field) term4909589).setAccessible(true);
        Object enum3156 = ((Field) term4909589).get((Object) null);
        term4907777 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term4907900 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4907901 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4907905 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4907777, term4907777.getClass(), "id", 6475132901745158329L);
        setIntField(term4907777, term4907777.getClass(), "pdId", 1352014107);
        setField(term4907777, term4907777.getClass(), "playerName", "xxx");
        setIntField(term4907777, term4907777.getClass(), "vocaloidPoints", 300);
        setIntField(term4907777, term4907777.getClass(), "level", 1);
        setIntField(term4907777, term4907777.getClass(), "levelExp", 387616162);
        setField(term4907777, term4907777.getClass(), "levelTitle", "xxx");
        setIntField(term4907777, term4907777.getClass(), "plateId", -1);
        setIntField(term4907777, term4907777.getClass(), "plateEffectId", -1);
        setField(term4907777, term4907777.getClass(), "passwordStatus", enum3152);
        setField(term4907777, term4907777.getClass(), "password", "**********");
        setBooleanField(term4907777, term4907777.getClass(), "preferPerPvModule", true);
        setBooleanField(term4907777, term4907777.getClass(), "preferCommonModule", false);
        setBooleanField(term4907777, term4907777.getClass(), "usePerPvSkin", true);
        setBooleanField(term4907777, term4907777.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term4907777, term4907777.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term4907777, term4907777.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term4907777, term4907777.getClass(), "usePerPvTouchSliderSe", false);
        setField(term4907777, term4907777.getClass(), "commonModule", "-999,-999,-999");
        setField(term4907777, term4907777.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term4907901, term4907901.getClass(), "year", 2026);
        setShortField(term4907901, term4907901.getClass(), "month", (short) 8);
        setShortField(term4907901, term4907901.getClass(), "day", (short) 11);
        setField(term4907900, term4907900.getClass(), "date", term4907901);
        setByteField(term4907905, term4907905.getClass(), "hour", (byte) 23);
        setByteField(term4907905, term4907905.getClass(), "minute", (byte) 7);
        setByteField(term4907905, term4907905.getClass(), "second", (byte) 42);
        setIntField(term4907905, term4907905.getClass(), "nano", 315019000);
        setField(term4907900, term4907900.getClass(), "time", term4907905);
        setField(term4907777, term4907777.getClass(), "commonModuleSetTime", term4907900);
        setField(term4907777, term4907777.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term4907777, term4907777.getClass(), "commonSkin", -1);
        setIntField(term4907777, term4907777.getClass(), "headphoneVolume", 100);
        setBooleanField(term4907777, term4907777.getClass(), "buttonSeOn", true);
        setIntField(term4907777, term4907777.getClass(), "buttonSeVolume", 100);
        setIntField(term4907777, term4907777.getClass(), "sliderSeVolume", 100);
        setIntField(term4907777, term4907777.getClass(), "buttonSe", -1);
        setIntField(term4907777, term4907777.getClass(), "chainSlideSe", -1);
        setIntField(term4907777, term4907777.getClass(), "slideSe", -1);
        setIntField(term4907777, term4907777.getClass(), "sliderTouchSe", -1);
        setField(term4907777, term4907777.getClass(), "sortMode", enum3153);
        setIntField(term4907777, term4907777.getClass(), "nextPvId", -1);
        setField(term4907777, term4907777.getClass(), "nextDifficulty", enum3154);
        setField(term4907777, term4907777.getClass(), "nextEdition", enum3155);
        setBooleanField(term4907777, term4907777.getClass(), "showInterimRanking", true);
        setBooleanField(term4907777, term4907777.getClass(), "showClearStatus", true);
        setBooleanField(term4907777, term4907777.getClass(), "showGreatBorder", true);
        setBooleanField(term4907777, term4907777.getClass(), "showExcellentBorder", true);
        setBooleanField(term4907777, term4907777.getClass(), "showRivalBorder", true);
        setBooleanField(term4907777, term4907777.getClass(), "showRgoSetting", true);
        setBooleanField(term4907777, term4907777.getClass(), "contestNowPlayingEnable", true);
        setIntField(term4907777, term4907777.getClass(), "contestNowPlayingId", -1);
        setIntField(term4907777, term4907777.getClass(), "contestNowPlayingValue", -1);
        setField(term4907777, term4907777.getClass(), "contestNowPlayingResultRank", enum3156);
        setField(term4907777, term4907777.getClass(), "contestNowPlayingSpecifier", "");
        setField(term4907777, term4907777.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term4907777, term4907777.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term4907777, term4907777.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term4907777, term4907777.getClass(), "rivalPdId", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term4907777, args);
    }

};


