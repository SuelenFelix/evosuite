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

public class PlayerPvCustomize_getModule_17386779794 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term955848;

    public PlayerPvCustomize_getModule_17386779794() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term956582 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term956581 = ((Class) term956582).getDeclaredField((String) "MISS");
        ((Field) term956581).setAccessible(true);
        Object enum2040 = ((Field) term956581).get((Object) null);
        Class<? extends Object> term956959 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term956958 = ((Class) term956959).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term956958).setAccessible(true);
        Object enum2041 = ((Field) term956958).get((Object) null);
        Class<? extends Object> term957242 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term957241 = ((Class) term957242).getDeclaredField((String) "NORMAL");
        ((Field) term957241).setAccessible(true);
        Object enum2042 = ((Field) term957241).get((Object) null);
        Class<? extends Object> term957517 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term957516 = ((Class) term957517).getDeclaredField((String) "ORIGINAL");
        ((Field) term957516).setAccessible(true);
        Object enum2043 = ((Field) term957516).get((Object) null);
        Class<? extends Object> term957783 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term957782 = ((Class) term957783).getDeclaredField((String) "NONE");
        ((Field) term957782).setAccessible(true);
        Object enum2044 = ((Field) term957782).get((Object) null);
        term955848 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvCustomize"));
        Object term955850 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term955973 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term955974 = newInstance(Class.forName("java.time.LocalDate"));
        Object term955978 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term955848, term955848.getClass(), "id", -4187265590402169996L);
        setLongField(term955850, term955850.getClass(), "id", -8033044954947064558L);
        setIntField(term955850, term955850.getClass(), "pdId", 1826016641);
        setField(term955850, term955850.getClass(), "playerName", "xxx");
        setIntField(term955850, term955850.getClass(), "vocaloidPoints", 300);
        setIntField(term955850, term955850.getClass(), "level", 1);
        setIntField(term955850, term955850.getClass(), "levelExp", 1726886771);
        setField(term955850, term955850.getClass(), "levelTitle", "xxx");
        setIntField(term955850, term955850.getClass(), "plateId", -1);
        setIntField(term955850, term955850.getClass(), "plateEffectId", -1);
        setField(term955850, term955850.getClass(), "passwordStatus", enum2040);
        setField(term955850, term955850.getClass(), "password", "**********");
        setBooleanField(term955850, term955850.getClass(), "preferPerPvModule", true);
        setBooleanField(term955850, term955850.getClass(), "preferCommonModule", true);
        setBooleanField(term955850, term955850.getClass(), "usePerPvSkin", true);
        setBooleanField(term955850, term955850.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term955850, term955850.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term955850, term955850.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term955850, term955850.getClass(), "usePerPvTouchSliderSe", false);
        setField(term955850, term955850.getClass(), "commonModule", "-999,-999,-999");
        setField(term955850, term955850.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term955974, term955974.getClass(), "year", 2026);
        setShortField(term955974, term955974.getClass(), "month", (short) 6);
        setShortField(term955974, term955974.getClass(), "day", (short) 29);
        setField(term955973, term955973.getClass(), "date", term955974);
        setByteField(term955978, term955978.getClass(), "hour", (byte) 4);
        setByteField(term955978, term955978.getClass(), "minute", (byte) 30);
        setByteField(term955978, term955978.getClass(), "second", (byte) 5);
        setIntField(term955978, term955978.getClass(), "nano", 137747000);
        setField(term955973, term955973.getClass(), "time", term955978);
        setField(term955850, term955850.getClass(), "commonModuleSetTime", term955973);
        setField(term955850, term955850.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term955850, term955850.getClass(), "commonSkin", -1);
        setIntField(term955850, term955850.getClass(), "headphoneVolume", 100);
        setBooleanField(term955850, term955850.getClass(), "buttonSeOn", true);
        setIntField(term955850, term955850.getClass(), "buttonSeVolume", 100);
        setIntField(term955850, term955850.getClass(), "sliderSeVolume", 100);
        setIntField(term955850, term955850.getClass(), "buttonSe", -1);
        setIntField(term955850, term955850.getClass(), "chainSlideSe", -1);
        setIntField(term955850, term955850.getClass(), "slideSe", -1);
        setIntField(term955850, term955850.getClass(), "sliderTouchSe", -1);
        setField(term955850, term955850.getClass(), "sortMode", enum2041);
        setIntField(term955850, term955850.getClass(), "nextPvId", -1);
        setField(term955850, term955850.getClass(), "nextDifficulty", enum2042);
        setField(term955850, term955850.getClass(), "nextEdition", enum2043);
        setBooleanField(term955850, term955850.getClass(), "showInterimRanking", true);
        setBooleanField(term955850, term955850.getClass(), "showClearStatus", true);
        setBooleanField(term955850, term955850.getClass(), "showGreatBorder", true);
        setBooleanField(term955850, term955850.getClass(), "showExcellentBorder", true);
        setBooleanField(term955850, term955850.getClass(), "showRivalBorder", true);
        setBooleanField(term955850, term955850.getClass(), "showRgoSetting", true);
        setBooleanField(term955850, term955850.getClass(), "contestNowPlayingEnable", true);
        setIntField(term955850, term955850.getClass(), "contestNowPlayingId", -1);
        setIntField(term955850, term955850.getClass(), "contestNowPlayingValue", -1);
        setField(term955850, term955850.getClass(), "contestNowPlayingResultRank", enum2044);
        setField(term955850, term955850.getClass(), "contestNowPlayingSpecifier", "");
        setField(term955850, term955850.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term955850, term955850.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term955850, term955850.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term955850, term955850.getClass(), "rivalPdId", -1);
        setField(term955848, term955848.getClass(), "pdId", term955850);
        setIntField(term955848, term955848.getClass(), "pvId", -1);
        setField(term955848, term955848.getClass(), "module", "-999,-999,-999");
        setField(term955848, term955848.getClass(), "customize", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setField(term955848, term955848.getClass(), "customizeFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term955848, term955848.getClass(), "skin", -1);
        setIntField(term955848, term955848.getClass(), "buttonSe", -1);
        setIntField(term955848, term955848.getClass(), "slideSe", -1);
        setIntField(term955848, term955848.getClass(), "chainSlideSe", -1);
        setIntField(term955848, term955848.getClass(), "sliderTouchSe", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvCustomize");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getModule", argTypes, term955848, args);
    }

};


