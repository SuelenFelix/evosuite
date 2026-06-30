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

public class PlayerProfile_getPdId_20875658692 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term686063;

    public PlayerProfile_getPdId_20875658692() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term686675 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term686674 = ((Class) term686675).getDeclaredField((String) "MISS");
        ((Field) term686674).setAccessible(true);
        Object enum1497 = ((Field) term686674).get((Object) null);
        Class<? extends Object> term687052 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term687051 = ((Class) term687052).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term687051).setAccessible(true);
        Object enum1498 = ((Field) term687051).get((Object) null);
        Class<? extends Object> term687335 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term687334 = ((Class) term687335).getDeclaredField((String) "NORMAL");
        ((Field) term687334).setAccessible(true);
        Object enum1499 = ((Field) term687334).get((Object) null);
        Class<? extends Object> term687610 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term687609 = ((Class) term687610).getDeclaredField((String) "ORIGINAL");
        ((Field) term687609).setAccessible(true);
        Object enum1500 = ((Field) term687609).get((Object) null);
        Class<? extends Object> term687876 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term687875 = ((Class) term687876).getDeclaredField((String) "NONE");
        ((Field) term687875).setAccessible(true);
        Object enum1501 = ((Field) term687875).get((Object) null);
        term686063 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term686186 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term686187 = newInstance(Class.forName("java.time.LocalDate"));
        Object term686191 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term686063, term686063.getClass(), "id", 1193381106528373019L);
        setIntField(term686063, term686063.getClass(), "pdId", 755500171);
        setField(term686063, term686063.getClass(), "playerName", "xxx");
        setIntField(term686063, term686063.getClass(), "vocaloidPoints", 300);
        setIntField(term686063, term686063.getClass(), "level", 1);
        setIntField(term686063, term686063.getClass(), "levelExp", -535062491);
        setField(term686063, term686063.getClass(), "levelTitle", "xxx");
        setIntField(term686063, term686063.getClass(), "plateId", -1);
        setIntField(term686063, term686063.getClass(), "plateEffectId", -1);
        setField(term686063, term686063.getClass(), "passwordStatus", enum1497);
        setField(term686063, term686063.getClass(), "password", "**********");
        setBooleanField(term686063, term686063.getClass(), "preferPerPvModule", true);
        setBooleanField(term686063, term686063.getClass(), "preferCommonModule", false);
        setBooleanField(term686063, term686063.getClass(), "usePerPvSkin", false);
        setBooleanField(term686063, term686063.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term686063, term686063.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term686063, term686063.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term686063, term686063.getClass(), "usePerPvTouchSliderSe", false);
        setField(term686063, term686063.getClass(), "commonModule", "-999,-999,-999");
        setField(term686063, term686063.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term686187, term686187.getClass(), "year", 2026);
        setShortField(term686187, term686187.getClass(), "month", (short) 6);
        setShortField(term686187, term686187.getClass(), "day", (short) 29);
        setField(term686186, term686186.getClass(), "date", term686187);
        setByteField(term686191, term686191.getClass(), "hour", (byte) 4);
        setByteField(term686191, term686191.getClass(), "minute", (byte) 29);
        setByteField(term686191, term686191.getClass(), "second", (byte) 9);
        setIntField(term686191, term686191.getClass(), "nano", 767433000);
        setField(term686186, term686186.getClass(), "time", term686191);
        setField(term686063, term686063.getClass(), "commonModuleSetTime", term686186);
        setField(term686063, term686063.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term686063, term686063.getClass(), "commonSkin", -1);
        setIntField(term686063, term686063.getClass(), "headphoneVolume", 100);
        setBooleanField(term686063, term686063.getClass(), "buttonSeOn", true);
        setIntField(term686063, term686063.getClass(), "buttonSeVolume", 100);
        setIntField(term686063, term686063.getClass(), "sliderSeVolume", 100);
        setIntField(term686063, term686063.getClass(), "buttonSe", -1);
        setIntField(term686063, term686063.getClass(), "chainSlideSe", -1);
        setIntField(term686063, term686063.getClass(), "slideSe", -1);
        setIntField(term686063, term686063.getClass(), "sliderTouchSe", -1);
        setField(term686063, term686063.getClass(), "sortMode", enum1498);
        setIntField(term686063, term686063.getClass(), "nextPvId", -1);
        setField(term686063, term686063.getClass(), "nextDifficulty", enum1499);
        setField(term686063, term686063.getClass(), "nextEdition", enum1500);
        setBooleanField(term686063, term686063.getClass(), "showInterimRanking", true);
        setBooleanField(term686063, term686063.getClass(), "showClearStatus", true);
        setBooleanField(term686063, term686063.getClass(), "showGreatBorder", true);
        setBooleanField(term686063, term686063.getClass(), "showExcellentBorder", true);
        setBooleanField(term686063, term686063.getClass(), "showRivalBorder", true);
        setBooleanField(term686063, term686063.getClass(), "showRgoSetting", true);
        setBooleanField(term686063, term686063.getClass(), "contestNowPlayingEnable", true);
        setIntField(term686063, term686063.getClass(), "contestNowPlayingId", -1);
        setIntField(term686063, term686063.getClass(), "contestNowPlayingValue", -1);
        setField(term686063, term686063.getClass(), "contestNowPlayingResultRank", enum1501);
        setField(term686063, term686063.getClass(), "contestNowPlayingSpecifier", "");
        setField(term686063, term686063.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term686063, term686063.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term686063, term686063.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term686063, term686063.getClass(), "rivalPdId", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPdId", argTypes, term686063, args);
    }

};


