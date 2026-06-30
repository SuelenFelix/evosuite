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

public class PlayerProfile_getMyList2_212188876749 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term801354;

    public PlayerProfile_getMyList2_212188876749() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term801966 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term801965 = ((Class) term801966).getDeclaredField((String) "MISS");
        ((Field) term801965).setAccessible(true);
        Object enum1732 = ((Field) term801965).get((Object) null);
        Class<? extends Object> term802343 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term802342 = ((Class) term802343).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term802342).setAccessible(true);
        Object enum1733 = ((Field) term802342).get((Object) null);
        Class<? extends Object> term802626 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term802625 = ((Class) term802626).getDeclaredField((String) "NORMAL");
        ((Field) term802625).setAccessible(true);
        Object enum1734 = ((Field) term802625).get((Object) null);
        Class<? extends Object> term802901 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term802900 = ((Class) term802901).getDeclaredField((String) "ORIGINAL");
        ((Field) term802900).setAccessible(true);
        Object enum1735 = ((Field) term802900).get((Object) null);
        Class<? extends Object> term803167 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term803166 = ((Class) term803167).getDeclaredField((String) "NONE");
        ((Field) term803166).setAccessible(true);
        Object enum1736 = ((Field) term803166).get((Object) null);
        term801354 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term801477 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term801478 = newInstance(Class.forName("java.time.LocalDate"));
        Object term801482 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term801354, term801354.getClass(), "id", -6254265799185295775L);
        setIntField(term801354, term801354.getClass(), "pdId", -1715210057);
        setField(term801354, term801354.getClass(), "playerName", "xxx");
        setIntField(term801354, term801354.getClass(), "vocaloidPoints", 300);
        setIntField(term801354, term801354.getClass(), "level", 1);
        setIntField(term801354, term801354.getClass(), "levelExp", 118463203);
        setField(term801354, term801354.getClass(), "levelTitle", "xxx");
        setIntField(term801354, term801354.getClass(), "plateId", -1);
        setIntField(term801354, term801354.getClass(), "plateEffectId", -1);
        setField(term801354, term801354.getClass(), "passwordStatus", enum1732);
        setField(term801354, term801354.getClass(), "password", "**********");
        setBooleanField(term801354, term801354.getClass(), "preferPerPvModule", true);
        setBooleanField(term801354, term801354.getClass(), "preferCommonModule", true);
        setBooleanField(term801354, term801354.getClass(), "usePerPvSkin", false);
        setBooleanField(term801354, term801354.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term801354, term801354.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term801354, term801354.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term801354, term801354.getClass(), "usePerPvTouchSliderSe", true);
        setField(term801354, term801354.getClass(), "commonModule", "-999,-999,-999");
        setField(term801354, term801354.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term801478, term801478.getClass(), "year", 2026);
        setShortField(term801478, term801478.getClass(), "month", (short) 6);
        setShortField(term801478, term801478.getClass(), "day", (short) 29);
        setField(term801477, term801477.getClass(), "date", term801478);
        setByteField(term801482, term801482.getClass(), "hour", (byte) 4);
        setByteField(term801482, term801482.getClass(), "minute", (byte) 29);
        setByteField(term801482, term801482.getClass(), "second", (byte) 21);
        setIntField(term801482, term801482.getClass(), "nano", 840253000);
        setField(term801477, term801477.getClass(), "time", term801482);
        setField(term801354, term801354.getClass(), "commonModuleSetTime", term801477);
        setField(term801354, term801354.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term801354, term801354.getClass(), "commonSkin", -1);
        setIntField(term801354, term801354.getClass(), "headphoneVolume", 100);
        setBooleanField(term801354, term801354.getClass(), "buttonSeOn", true);
        setIntField(term801354, term801354.getClass(), "buttonSeVolume", 100);
        setIntField(term801354, term801354.getClass(), "sliderSeVolume", 100);
        setIntField(term801354, term801354.getClass(), "buttonSe", -1);
        setIntField(term801354, term801354.getClass(), "chainSlideSe", -1);
        setIntField(term801354, term801354.getClass(), "slideSe", -1);
        setIntField(term801354, term801354.getClass(), "sliderTouchSe", -1);
        setField(term801354, term801354.getClass(), "sortMode", enum1733);
        setIntField(term801354, term801354.getClass(), "nextPvId", -1);
        setField(term801354, term801354.getClass(), "nextDifficulty", enum1734);
        setField(term801354, term801354.getClass(), "nextEdition", enum1735);
        setBooleanField(term801354, term801354.getClass(), "showInterimRanking", true);
        setBooleanField(term801354, term801354.getClass(), "showClearStatus", true);
        setBooleanField(term801354, term801354.getClass(), "showGreatBorder", true);
        setBooleanField(term801354, term801354.getClass(), "showExcellentBorder", true);
        setBooleanField(term801354, term801354.getClass(), "showRivalBorder", true);
        setBooleanField(term801354, term801354.getClass(), "showRgoSetting", true);
        setBooleanField(term801354, term801354.getClass(), "contestNowPlayingEnable", false);
        setIntField(term801354, term801354.getClass(), "contestNowPlayingId", -1);
        setIntField(term801354, term801354.getClass(), "contestNowPlayingValue", -1);
        setField(term801354, term801354.getClass(), "contestNowPlayingResultRank", enum1736);
        setField(term801354, term801354.getClass(), "contestNowPlayingSpecifier", "");
        setField(term801354, term801354.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term801354, term801354.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term801354, term801354.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term801354, term801354.getClass(), "rivalPdId", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMyList2", argTypes, term801354, args);
    }

};


