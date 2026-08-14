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
import java.lang.Long;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;

public class PlayerScreenShot_init_170777294318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term527938;
     Object term527940;
     Object term528545;

    public PlayerScreenShot_init_170777294318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term527938 = new Long(4525924047960478347L);
        Class<? extends Object> term528590 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term528589 = ((Class) term528590).getDeclaredField((String) "MISS");
        ((Field) term528589).setAccessible(true);
        Object enum1162 = ((Field) term528589).get((Object) null);
        Class<? extends Object> term528967 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term528966 = ((Class) term528967).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term528966).setAccessible(true);
        Object enum1163 = ((Field) term528966).get((Object) null);
        Class<? extends Object> term529250 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term529249 = ((Class) term529250).getDeclaredField((String) "NORMAL");
        ((Field) term529249).setAccessible(true);
        Object enum1164 = ((Field) term529249).get((Object) null);
        Class<? extends Object> term529525 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term529524 = ((Class) term529525).getDeclaredField((String) "ORIGINAL");
        ((Field) term529524).setAccessible(true);
        Object enum1165 = ((Field) term529524).get((Object) null);
        Class<? extends Object> term529791 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term529790 = ((Class) term529791).getDeclaredField((String) "NONE");
        ((Field) term529790).setAccessible(true);
        Object enum1166 = ((Field) term529790).get((Object) null);
        term527940 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term528063 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term528064 = newInstance(Class.forName("java.time.LocalDate"));
        Object term528068 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term527940, term527940.getClass(), "id", -3225860270104198596L);
        setIntField(term527940, term527940.getClass(), "pdId", 1268210239);
        setField(term527940, term527940.getClass(), "playerName", "xxx");
        setIntField(term527940, term527940.getClass(), "vocaloidPoints", 300);
        setIntField(term527940, term527940.getClass(), "level", 1);
        setIntField(term527940, term527940.getClass(), "levelExp", -697986260);
        setField(term527940, term527940.getClass(), "levelTitle", "xxx");
        setIntField(term527940, term527940.getClass(), "plateId", -1);
        setIntField(term527940, term527940.getClass(), "plateEffectId", -1);
        setField(term527940, term527940.getClass(), "passwordStatus", enum1162);
        setField(term527940, term527940.getClass(), "password", "**********");
        setBooleanField(term527940, term527940.getClass(), "preferPerPvModule", true);
        setBooleanField(term527940, term527940.getClass(), "preferCommonModule", false);
        setBooleanField(term527940, term527940.getClass(), "usePerPvSkin", false);
        setBooleanField(term527940, term527940.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term527940, term527940.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term527940, term527940.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term527940, term527940.getClass(), "usePerPvTouchSliderSe", true);
        setField(term527940, term527940.getClass(), "commonModule", "-999,-999,-999");
        setField(term527940, term527940.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term528064, term528064.getClass(), "year", 2026);
        setShortField(term528064, term528064.getClass(), "month", (short) 8);
        setShortField(term528064, term528064.getClass(), "day", (short) 12);
        setField(term528063, term528063.getClass(), "date", term528064);
        setByteField(term528068, term528068.getClass(), "hour", (byte) 2);
        setByteField(term528068, term528068.getClass(), "minute", (byte) 3);
        setByteField(term528068, term528068.getClass(), "second", (byte) 49);
        setIntField(term528068, term528068.getClass(), "nano", 747640000);
        setField(term528063, term528063.getClass(), "time", term528068);
        setField(term527940, term527940.getClass(), "commonModuleSetTime", term528063);
        setField(term527940, term527940.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term527940, term527940.getClass(), "commonSkin", -1);
        setIntField(term527940, term527940.getClass(), "headphoneVolume", 100);
        setBooleanField(term527940, term527940.getClass(), "buttonSeOn", true);
        setIntField(term527940, term527940.getClass(), "buttonSeVolume", 100);
        setIntField(term527940, term527940.getClass(), "sliderSeVolume", 100);
        setIntField(term527940, term527940.getClass(), "buttonSe", -1);
        setIntField(term527940, term527940.getClass(), "chainSlideSe", -1);
        setIntField(term527940, term527940.getClass(), "slideSe", -1);
        setIntField(term527940, term527940.getClass(), "sliderTouchSe", -1);
        setField(term527940, term527940.getClass(), "sortMode", enum1163);
        setIntField(term527940, term527940.getClass(), "nextPvId", -1);
        setField(term527940, term527940.getClass(), "nextDifficulty", enum1164);
        setField(term527940, term527940.getClass(), "nextEdition", enum1165);
        setBooleanField(term527940, term527940.getClass(), "showInterimRanking", true);
        setBooleanField(term527940, term527940.getClass(), "showClearStatus", true);
        setBooleanField(term527940, term527940.getClass(), "showGreatBorder", true);
        setBooleanField(term527940, term527940.getClass(), "showExcellentBorder", true);
        setBooleanField(term527940, term527940.getClass(), "showRivalBorder", true);
        setBooleanField(term527940, term527940.getClass(), "showRgoSetting", true);
        setBooleanField(term527940, term527940.getClass(), "contestNowPlayingEnable", true);
        setIntField(term527940, term527940.getClass(), "contestNowPlayingId", -1);
        setIntField(term527940, term527940.getClass(), "contestNowPlayingValue", -1);
        setField(term527940, term527940.getClass(), "contestNowPlayingResultRank", enum1166);
        setField(term527940, term527940.getClass(), "contestNowPlayingSpecifier", "");
        setField(term527940, term527940.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term527940, term527940.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term527940, term527940.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term527940, term527940.getClass(), "rivalPdId", -1);
        term528545 = new Integer(-672315403);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerScreenShot");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = Class.forName("java.lang.String");
        Object[] args = new Object[6];
        args[0] = term527938;
        args[1] = term527940;
        args[2] = term528545;
        args[3] = "SPBstwKFVr";
        args[4] = "WxYUTuqmIq";
        args[5] = "OeQLvhVERT";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


