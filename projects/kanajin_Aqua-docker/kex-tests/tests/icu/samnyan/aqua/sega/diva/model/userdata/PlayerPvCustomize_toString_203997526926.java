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

public class PlayerPvCustomize_toString_203997526926 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1015983;

    public PlayerPvCustomize_toString_203997526926() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1016717 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term1016716 = ((Class) term1016717).getDeclaredField((String) "MISS");
        ((Field) term1016716).setAccessible(true);
        Object enum2150 = ((Field) term1016716).get((Object) null);
        Class<? extends Object> term1017094 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term1017093 = ((Class) term1017094).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term1017093).setAccessible(true);
        Object enum2151 = ((Field) term1017093).get((Object) null);
        Class<? extends Object> term1017377 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term1017376 = ((Class) term1017377).getDeclaredField((String) "NORMAL");
        ((Field) term1017376).setAccessible(true);
        Object enum2152 = ((Field) term1017376).get((Object) null);
        Class<? extends Object> term1017652 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term1017651 = ((Class) term1017652).getDeclaredField((String) "ORIGINAL");
        ((Field) term1017651).setAccessible(true);
        Object enum2153 = ((Field) term1017651).get((Object) null);
        Class<? extends Object> term1017918 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term1017917 = ((Class) term1017918).getDeclaredField((String) "NONE");
        ((Field) term1017917).setAccessible(true);
        Object enum2154 = ((Field) term1017917).get((Object) null);
        term1015983 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvCustomize"));
        Object term1015985 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term1016108 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1016109 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1016113 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term1015983, term1015983.getClass(), "id", 4947643967691976731L);
        setLongField(term1015985, term1015985.getClass(), "id", 4548576710115075073L);
        setIntField(term1015985, term1015985.getClass(), "pdId", -1201816382);
        setField(term1015985, term1015985.getClass(), "playerName", "xxx");
        setIntField(term1015985, term1015985.getClass(), "vocaloidPoints", 300);
        setIntField(term1015985, term1015985.getClass(), "level", 1);
        setIntField(term1015985, term1015985.getClass(), "levelExp", 964841377);
        setField(term1015985, term1015985.getClass(), "levelTitle", "xxx");
        setIntField(term1015985, term1015985.getClass(), "plateId", -1);
        setIntField(term1015985, term1015985.getClass(), "plateEffectId", -1);
        setField(term1015985, term1015985.getClass(), "passwordStatus", enum2150);
        setField(term1015985, term1015985.getClass(), "password", "**********");
        setBooleanField(term1015985, term1015985.getClass(), "preferPerPvModule", true);
        setBooleanField(term1015985, term1015985.getClass(), "preferCommonModule", false);
        setBooleanField(term1015985, term1015985.getClass(), "usePerPvSkin", false);
        setBooleanField(term1015985, term1015985.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term1015985, term1015985.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term1015985, term1015985.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term1015985, term1015985.getClass(), "usePerPvTouchSliderSe", true);
        setField(term1015985, term1015985.getClass(), "commonModule", "-999,-999,-999");
        setField(term1015985, term1015985.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term1016109, term1016109.getClass(), "year", 2026);
        setShortField(term1016109, term1016109.getClass(), "month", (short) 8);
        setShortField(term1016109, term1016109.getClass(), "day", (short) 12);
        setField(term1016108, term1016108.getClass(), "date", term1016109);
        setByteField(term1016113, term1016113.getClass(), "hour", (byte) 2);
        setByteField(term1016113, term1016113.getClass(), "minute", (byte) 5);
        setByteField(term1016113, term1016113.getClass(), "second", (byte) 22);
        setIntField(term1016113, term1016113.getClass(), "nano", 885179000);
        setField(term1016108, term1016108.getClass(), "time", term1016113);
        setField(term1015985, term1015985.getClass(), "commonModuleSetTime", term1016108);
        setField(term1015985, term1015985.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term1015985, term1015985.getClass(), "commonSkin", -1);
        setIntField(term1015985, term1015985.getClass(), "headphoneVolume", 100);
        setBooleanField(term1015985, term1015985.getClass(), "buttonSeOn", true);
        setIntField(term1015985, term1015985.getClass(), "buttonSeVolume", 100);
        setIntField(term1015985, term1015985.getClass(), "sliderSeVolume", 100);
        setIntField(term1015985, term1015985.getClass(), "buttonSe", -1);
        setIntField(term1015985, term1015985.getClass(), "chainSlideSe", -1);
        setIntField(term1015985, term1015985.getClass(), "slideSe", -1);
        setIntField(term1015985, term1015985.getClass(), "sliderTouchSe", -1);
        setField(term1015985, term1015985.getClass(), "sortMode", enum2151);
        setIntField(term1015985, term1015985.getClass(), "nextPvId", -1);
        setField(term1015985, term1015985.getClass(), "nextDifficulty", enum2152);
        setField(term1015985, term1015985.getClass(), "nextEdition", enum2153);
        setBooleanField(term1015985, term1015985.getClass(), "showInterimRanking", true);
        setBooleanField(term1015985, term1015985.getClass(), "showClearStatus", true);
        setBooleanField(term1015985, term1015985.getClass(), "showGreatBorder", true);
        setBooleanField(term1015985, term1015985.getClass(), "showExcellentBorder", true);
        setBooleanField(term1015985, term1015985.getClass(), "showRivalBorder", true);
        setBooleanField(term1015985, term1015985.getClass(), "showRgoSetting", true);
        setBooleanField(term1015985, term1015985.getClass(), "contestNowPlayingEnable", true);
        setIntField(term1015985, term1015985.getClass(), "contestNowPlayingId", -1);
        setIntField(term1015985, term1015985.getClass(), "contestNowPlayingValue", -1);
        setField(term1015985, term1015985.getClass(), "contestNowPlayingResultRank", enum2154);
        setField(term1015985, term1015985.getClass(), "contestNowPlayingSpecifier", "");
        setField(term1015985, term1015985.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term1015985, term1015985.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term1015985, term1015985.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term1015985, term1015985.getClass(), "rivalPdId", -1);
        setField(term1015983, term1015983.getClass(), "pdId", term1015985);
        setIntField(term1015983, term1015983.getClass(), "pvId", -1);
        setField(term1015983, term1015983.getClass(), "module", "-999,-999,-999");
        setField(term1015983, term1015983.getClass(), "customize", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setField(term1015983, term1015983.getClass(), "customizeFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term1015983, term1015983.getClass(), "skin", -1);
        setIntField(term1015983, term1015983.getClass(), "buttonSe", -1);
        setIntField(term1015983, term1015983.getClass(), "slideSe", -1);
        setIntField(term1015983, term1015983.getClass(), "chainSlideSe", -1);
        setIntField(term1015983, term1015983.getClass(), "sliderTouchSe", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvCustomize");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1015983, args);
    }

};


