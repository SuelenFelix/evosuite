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

public class PlayerCustomize_getPdId_500785822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term458332;

    public PlayerCustomize_getPdId_500785822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term458947 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term458946 = ((Class) term458947).getDeclaredField((String) "MISS");
        ((Field) term458946).setAccessible(true);
        Object enum1027 = ((Field) term458946).get((Object) null);
        Class<? extends Object> term459324 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term459323 = ((Class) term459324).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term459323).setAccessible(true);
        Object enum1028 = ((Field) term459323).get((Object) null);
        Class<? extends Object> term459607 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term459606 = ((Class) term459607).getDeclaredField((String) "NORMAL");
        ((Field) term459606).setAccessible(true);
        Object enum1029 = ((Field) term459606).get((Object) null);
        Class<? extends Object> term459882 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term459881 = ((Class) term459882).getDeclaredField((String) "ORIGINAL");
        ((Field) term459881).setAccessible(true);
        Object enum1030 = ((Field) term459881).get((Object) null);
        Class<? extends Object> term460148 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term460147 = ((Class) term460148).getDeclaredField((String) "NONE");
        ((Field) term460147).setAccessible(true);
        Object enum1031 = ((Field) term460147).get((Object) null);
        term458332 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerCustomize"));
        Object term458334 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term458457 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term458458 = newInstance(Class.forName("java.time.LocalDate"));
        Object term458462 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term458332, term458332.getClass(), "id", -1526729287349763895L);
        setLongField(term458334, term458334.getClass(), "id", 7017605765544766728L);
        setIntField(term458334, term458334.getClass(), "pdId", -2001561246);
        setField(term458334, term458334.getClass(), "playerName", "xxx");
        setIntField(term458334, term458334.getClass(), "vocaloidPoints", 300);
        setIntField(term458334, term458334.getClass(), "level", 1);
        setIntField(term458334, term458334.getClass(), "levelExp", -526492477);
        setField(term458334, term458334.getClass(), "levelTitle", "xxx");
        setIntField(term458334, term458334.getClass(), "plateId", -1);
        setIntField(term458334, term458334.getClass(), "plateEffectId", -1);
        setField(term458334, term458334.getClass(), "passwordStatus", enum1027);
        setField(term458334, term458334.getClass(), "password", "**********");
        setBooleanField(term458334, term458334.getClass(), "preferPerPvModule", true);
        setBooleanField(term458334, term458334.getClass(), "preferCommonModule", false);
        setBooleanField(term458334, term458334.getClass(), "usePerPvSkin", true);
        setBooleanField(term458334, term458334.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term458334, term458334.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term458334, term458334.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term458334, term458334.getClass(), "usePerPvTouchSliderSe", true);
        setField(term458334, term458334.getClass(), "commonModule", "-999,-999,-999");
        setField(term458334, term458334.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term458458, term458458.getClass(), "year", 2026);
        setShortField(term458458, term458458.getClass(), "month", (short) 6);
        setShortField(term458458, term458458.getClass(), "day", (short) 29);
        setField(term458457, term458457.getClass(), "date", term458458);
        setByteField(term458462, term458462.getClass(), "hour", (byte) 4);
        setByteField(term458462, term458462.getClass(), "minute", (byte) 28);
        setByteField(term458462, term458462.getClass(), "second", (byte) 24);
        setIntField(term458462, term458462.getClass(), "nano", 822857000);
        setField(term458457, term458457.getClass(), "time", term458462);
        setField(term458334, term458334.getClass(), "commonModuleSetTime", term458457);
        setField(term458334, term458334.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term458334, term458334.getClass(), "commonSkin", -1);
        setIntField(term458334, term458334.getClass(), "headphoneVolume", 100);
        setBooleanField(term458334, term458334.getClass(), "buttonSeOn", true);
        setIntField(term458334, term458334.getClass(), "buttonSeVolume", 100);
        setIntField(term458334, term458334.getClass(), "sliderSeVolume", 100);
        setIntField(term458334, term458334.getClass(), "buttonSe", -1);
        setIntField(term458334, term458334.getClass(), "chainSlideSe", -1);
        setIntField(term458334, term458334.getClass(), "slideSe", -1);
        setIntField(term458334, term458334.getClass(), "sliderTouchSe", -1);
        setField(term458334, term458334.getClass(), "sortMode", enum1028);
        setIntField(term458334, term458334.getClass(), "nextPvId", -1);
        setField(term458334, term458334.getClass(), "nextDifficulty", enum1029);
        setField(term458334, term458334.getClass(), "nextEdition", enum1030);
        setBooleanField(term458334, term458334.getClass(), "showInterimRanking", true);
        setBooleanField(term458334, term458334.getClass(), "showClearStatus", true);
        setBooleanField(term458334, term458334.getClass(), "showGreatBorder", true);
        setBooleanField(term458334, term458334.getClass(), "showExcellentBorder", true);
        setBooleanField(term458334, term458334.getClass(), "showRivalBorder", true);
        setBooleanField(term458334, term458334.getClass(), "showRgoSetting", true);
        setBooleanField(term458334, term458334.getClass(), "contestNowPlayingEnable", false);
        setIntField(term458334, term458334.getClass(), "contestNowPlayingId", -1);
        setIntField(term458334, term458334.getClass(), "contestNowPlayingValue", -1);
        setField(term458334, term458334.getClass(), "contestNowPlayingResultRank", enum1031);
        setField(term458334, term458334.getClass(), "contestNowPlayingSpecifier", "");
        setField(term458334, term458334.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term458334, term458334.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term458334, term458334.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term458334, term458334.getClass(), "rivalPdId", -1);
        setField(term458332, term458332.getClass(), "pdId", term458334);
        setIntField(term458332, term458332.getClass(), "customizeId", 934758494);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerCustomize");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPdId", argTypes, term458332, args);
    }

};


