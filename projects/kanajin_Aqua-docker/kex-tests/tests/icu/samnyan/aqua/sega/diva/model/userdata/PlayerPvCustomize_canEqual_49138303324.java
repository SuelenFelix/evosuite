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

public class PlayerPvCustomize_canEqual_49138303324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1010616;
     Object term1011343;

    public PlayerPvCustomize_canEqual_49138303324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1011351 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term1011350 = ((Class) term1011351).getDeclaredField((String) "MISS");
        ((Field) term1011350).setAccessible(true);
        Object enum2140 = ((Field) term1011350).get((Object) null);
        Class<? extends Object> term1011728 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term1011727 = ((Class) term1011728).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term1011727).setAccessible(true);
        Object enum2141 = ((Field) term1011727).get((Object) null);
        Class<? extends Object> term1012011 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term1012010 = ((Class) term1012011).getDeclaredField((String) "NORMAL");
        ((Field) term1012010).setAccessible(true);
        Object enum2142 = ((Field) term1012010).get((Object) null);
        Class<? extends Object> term1012286 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term1012285 = ((Class) term1012286).getDeclaredField((String) "ORIGINAL");
        ((Field) term1012285).setAccessible(true);
        Object enum2143 = ((Field) term1012285).get((Object) null);
        Class<? extends Object> term1012552 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term1012551 = ((Class) term1012552).getDeclaredField((String) "NONE");
        ((Field) term1012551).setAccessible(true);
        Object enum2144 = ((Field) term1012551).get((Object) null);
        term1010616 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvCustomize"));
        Object term1010618 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term1010741 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1010742 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1010746 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term1010616, term1010616.getClass(), "id", 8261619652909874476L);
        setLongField(term1010618, term1010618.getClass(), "id", -3692936312179064102L);
        setIntField(term1010618, term1010618.getClass(), "pdId", -482056965);
        setField(term1010618, term1010618.getClass(), "playerName", "xxx");
        setIntField(term1010618, term1010618.getClass(), "vocaloidPoints", 300);
        setIntField(term1010618, term1010618.getClass(), "level", 1);
        setIntField(term1010618, term1010618.getClass(), "levelExp", 1727638564);
        setField(term1010618, term1010618.getClass(), "levelTitle", "xxx");
        setIntField(term1010618, term1010618.getClass(), "plateId", -1);
        setIntField(term1010618, term1010618.getClass(), "plateEffectId", -1);
        setField(term1010618, term1010618.getClass(), "passwordStatus", enum2140);
        setField(term1010618, term1010618.getClass(), "password", "**********");
        setBooleanField(term1010618, term1010618.getClass(), "preferPerPvModule", true);
        setBooleanField(term1010618, term1010618.getClass(), "preferCommonModule", true);
        setBooleanField(term1010618, term1010618.getClass(), "usePerPvSkin", false);
        setBooleanField(term1010618, term1010618.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term1010618, term1010618.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term1010618, term1010618.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term1010618, term1010618.getClass(), "usePerPvTouchSliderSe", false);
        setField(term1010618, term1010618.getClass(), "commonModule", "-999,-999,-999");
        setField(term1010618, term1010618.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term1010742, term1010742.getClass(), "year", 2026);
        setShortField(term1010742, term1010742.getClass(), "month", (short) 6);
        setShortField(term1010742, term1010742.getClass(), "day", (short) 29);
        setField(term1010741, term1010741.getClass(), "date", term1010742);
        setByteField(term1010746, term1010746.getClass(), "hour", (byte) 4);
        setByteField(term1010746, term1010746.getClass(), "minute", (byte) 30);
        setByteField(term1010746, term1010746.getClass(), "second", (byte) 10);
        setIntField(term1010746, term1010746.getClass(), "nano", 288878000);
        setField(term1010741, term1010741.getClass(), "time", term1010746);
        setField(term1010618, term1010618.getClass(), "commonModuleSetTime", term1010741);
        setField(term1010618, term1010618.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term1010618, term1010618.getClass(), "commonSkin", -1);
        setIntField(term1010618, term1010618.getClass(), "headphoneVolume", 100);
        setBooleanField(term1010618, term1010618.getClass(), "buttonSeOn", true);
        setIntField(term1010618, term1010618.getClass(), "buttonSeVolume", 100);
        setIntField(term1010618, term1010618.getClass(), "sliderSeVolume", 100);
        setIntField(term1010618, term1010618.getClass(), "buttonSe", -1);
        setIntField(term1010618, term1010618.getClass(), "chainSlideSe", -1);
        setIntField(term1010618, term1010618.getClass(), "slideSe", -1);
        setIntField(term1010618, term1010618.getClass(), "sliderTouchSe", -1);
        setField(term1010618, term1010618.getClass(), "sortMode", enum2141);
        setIntField(term1010618, term1010618.getClass(), "nextPvId", -1);
        setField(term1010618, term1010618.getClass(), "nextDifficulty", enum2142);
        setField(term1010618, term1010618.getClass(), "nextEdition", enum2143);
        setBooleanField(term1010618, term1010618.getClass(), "showInterimRanking", true);
        setBooleanField(term1010618, term1010618.getClass(), "showClearStatus", true);
        setBooleanField(term1010618, term1010618.getClass(), "showGreatBorder", true);
        setBooleanField(term1010618, term1010618.getClass(), "showExcellentBorder", true);
        setBooleanField(term1010618, term1010618.getClass(), "showRivalBorder", true);
        setBooleanField(term1010618, term1010618.getClass(), "showRgoSetting", true);
        setBooleanField(term1010618, term1010618.getClass(), "contestNowPlayingEnable", true);
        setIntField(term1010618, term1010618.getClass(), "contestNowPlayingId", -1);
        setIntField(term1010618, term1010618.getClass(), "contestNowPlayingValue", -1);
        setField(term1010618, term1010618.getClass(), "contestNowPlayingResultRank", enum2144);
        setField(term1010618, term1010618.getClass(), "contestNowPlayingSpecifier", "");
        setField(term1010618, term1010618.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term1010618, term1010618.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term1010618, term1010618.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term1010618, term1010618.getClass(), "rivalPdId", -1);
        setField(term1010616, term1010616.getClass(), "pdId", term1010618);
        setIntField(term1010616, term1010616.getClass(), "pvId", -1);
        setField(term1010616, term1010616.getClass(), "module", "-999,-999,-999");
        setField(term1010616, term1010616.getClass(), "customize", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setField(term1010616, term1010616.getClass(), "customizeFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term1010616, term1010616.getClass(), "skin", -1);
        setIntField(term1010616, term1010616.getClass(), "buttonSe", -1);
        setIntField(term1010616, term1010616.getClass(), "slideSe", -1);
        setIntField(term1010616, term1010616.getClass(), "chainSlideSe", -1);
        setIntField(term1010616, term1010616.getClass(), "sliderTouchSe", -1);
        term1011343 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvCustomize");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1011343;
        callMethod(klass, "canEqual", argTypes, term1010616, args);
    }

};


