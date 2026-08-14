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

public class PlayerProfile_setMyList1_131040678299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4895464;

    public PlayerProfile_setMyList1_131040678299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4896088 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term4896087 = ((Class) term4896088).getDeclaredField((String) "MISS");
        ((Field) term4896087).setAccessible(true);
        Object enum3127 = ((Field) term4896087).get((Object) null);
        Class<? extends Object> term4896465 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term4896464 = ((Class) term4896465).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term4896464).setAccessible(true);
        Object enum3128 = ((Field) term4896464).get((Object) null);
        Class<? extends Object> term4896748 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term4896747 = ((Class) term4896748).getDeclaredField((String) "NORMAL");
        ((Field) term4896747).setAccessible(true);
        Object enum3129 = ((Field) term4896747).get((Object) null);
        Class<? extends Object> term4897023 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term4897022 = ((Class) term4897023).getDeclaredField((String) "ORIGINAL");
        ((Field) term4897022).setAccessible(true);
        Object enum3130 = ((Field) term4897022).get((Object) null);
        Class<? extends Object> term4897289 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term4897288 = ((Class) term4897289).getDeclaredField((String) "NONE");
        ((Field) term4897288).setAccessible(true);
        Object enum3131 = ((Field) term4897288).get((Object) null);
        term4895464 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term4895587 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4895588 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4895592 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4895464, term4895464.getClass(), "id", -3741004166413644113L);
        setIntField(term4895464, term4895464.getClass(), "pdId", 1163437363);
        setField(term4895464, term4895464.getClass(), "playerName", "xxx");
        setIntField(term4895464, term4895464.getClass(), "vocaloidPoints", 300);
        setIntField(term4895464, term4895464.getClass(), "level", 1);
        setIntField(term4895464, term4895464.getClass(), "levelExp", -1131787869);
        setField(term4895464, term4895464.getClass(), "levelTitle", "xxx");
        setIntField(term4895464, term4895464.getClass(), "plateId", -1);
        setIntField(term4895464, term4895464.getClass(), "plateEffectId", -1);
        setField(term4895464, term4895464.getClass(), "passwordStatus", enum3127);
        setField(term4895464, term4895464.getClass(), "password", "**********");
        setBooleanField(term4895464, term4895464.getClass(), "preferPerPvModule", true);
        setBooleanField(term4895464, term4895464.getClass(), "preferCommonModule", false);
        setBooleanField(term4895464, term4895464.getClass(), "usePerPvSkin", false);
        setBooleanField(term4895464, term4895464.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term4895464, term4895464.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term4895464, term4895464.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term4895464, term4895464.getClass(), "usePerPvTouchSliderSe", true);
        setField(term4895464, term4895464.getClass(), "commonModule", "-999,-999,-999");
        setField(term4895464, term4895464.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term4895588, term4895588.getClass(), "year", 2026);
        setShortField(term4895588, term4895588.getClass(), "month", (short) 8);
        setShortField(term4895588, term4895588.getClass(), "day", (short) 11);
        setField(term4895587, term4895587.getClass(), "date", term4895588);
        setByteField(term4895592, term4895592.getClass(), "hour", (byte) 23);
        setByteField(term4895592, term4895592.getClass(), "minute", (byte) 7);
        setByteField(term4895592, term4895592.getClass(), "second", (byte) 41);
        setIntField(term4895592, term4895592.getClass(), "nano", 75916000);
        setField(term4895587, term4895587.getClass(), "time", term4895592);
        setField(term4895464, term4895464.getClass(), "commonModuleSetTime", term4895587);
        setField(term4895464, term4895464.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term4895464, term4895464.getClass(), "commonSkin", -1);
        setIntField(term4895464, term4895464.getClass(), "headphoneVolume", 100);
        setBooleanField(term4895464, term4895464.getClass(), "buttonSeOn", true);
        setIntField(term4895464, term4895464.getClass(), "buttonSeVolume", 100);
        setIntField(term4895464, term4895464.getClass(), "sliderSeVolume", 100);
        setIntField(term4895464, term4895464.getClass(), "buttonSe", -1);
        setIntField(term4895464, term4895464.getClass(), "chainSlideSe", -1);
        setIntField(term4895464, term4895464.getClass(), "slideSe", -1);
        setIntField(term4895464, term4895464.getClass(), "sliderTouchSe", -1);
        setField(term4895464, term4895464.getClass(), "sortMode", enum3128);
        setIntField(term4895464, term4895464.getClass(), "nextPvId", -1);
        setField(term4895464, term4895464.getClass(), "nextDifficulty", enum3129);
        setField(term4895464, term4895464.getClass(), "nextEdition", enum3130);
        setBooleanField(term4895464, term4895464.getClass(), "showInterimRanking", true);
        setBooleanField(term4895464, term4895464.getClass(), "showClearStatus", true);
        setBooleanField(term4895464, term4895464.getClass(), "showGreatBorder", true);
        setBooleanField(term4895464, term4895464.getClass(), "showExcellentBorder", true);
        setBooleanField(term4895464, term4895464.getClass(), "showRivalBorder", true);
        setBooleanField(term4895464, term4895464.getClass(), "showRgoSetting", true);
        setBooleanField(term4895464, term4895464.getClass(), "contestNowPlayingEnable", true);
        setIntField(term4895464, term4895464.getClass(), "contestNowPlayingId", -1);
        setIntField(term4895464, term4895464.getClass(), "contestNowPlayingValue", -1);
        setField(term4895464, term4895464.getClass(), "contestNowPlayingResultRank", enum3131);
        setField(term4895464, term4895464.getClass(), "contestNowPlayingSpecifier", "");
        setField(term4895464, term4895464.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term4895464, term4895464.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term4895464, term4895464.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term4895464, term4895464.getClass(), "rivalPdId", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "eAHEgFxRjP";
        callMethod(klass, "setMyList1", argTypes, term4895464, args);
    }

};


