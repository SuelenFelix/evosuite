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

public class PlayerProfile_getSliderSeVolume_152991410127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term747388;

    public PlayerProfile_getSliderSeVolume_152991410127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term748000 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term747999 = ((Class) term748000).getDeclaredField((String) "MISS");
        ((Field) term747999).setAccessible(true);
        Object enum1622 = ((Field) term747999).get((Object) null);
        Class<? extends Object> term748377 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term748376 = ((Class) term748377).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term748376).setAccessible(true);
        Object enum1623 = ((Field) term748376).get((Object) null);
        Class<? extends Object> term748660 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term748659 = ((Class) term748660).getDeclaredField((String) "NORMAL");
        ((Field) term748659).setAccessible(true);
        Object enum1624 = ((Field) term748659).get((Object) null);
        Class<? extends Object> term748935 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term748934 = ((Class) term748935).getDeclaredField((String) "ORIGINAL");
        ((Field) term748934).setAccessible(true);
        Object enum1625 = ((Field) term748934).get((Object) null);
        Class<? extends Object> term749201 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term749200 = ((Class) term749201).getDeclaredField((String) "NONE");
        ((Field) term749200).setAccessible(true);
        Object enum1626 = ((Field) term749200).get((Object) null);
        term747388 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term747511 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term747512 = newInstance(Class.forName("java.time.LocalDate"));
        Object term747516 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term747388, term747388.getClass(), "id", -6489405551733780896L);
        setIntField(term747388, term747388.getClass(), "pdId", -406599151);
        setField(term747388, term747388.getClass(), "playerName", "xxx");
        setIntField(term747388, term747388.getClass(), "vocaloidPoints", 300);
        setIntField(term747388, term747388.getClass(), "level", 1);
        setIntField(term747388, term747388.getClass(), "levelExp", -1421272179);
        setField(term747388, term747388.getClass(), "levelTitle", "xxx");
        setIntField(term747388, term747388.getClass(), "plateId", -1);
        setIntField(term747388, term747388.getClass(), "plateEffectId", -1);
        setField(term747388, term747388.getClass(), "passwordStatus", enum1622);
        setField(term747388, term747388.getClass(), "password", "**********");
        setBooleanField(term747388, term747388.getClass(), "preferPerPvModule", true);
        setBooleanField(term747388, term747388.getClass(), "preferCommonModule", true);
        setBooleanField(term747388, term747388.getClass(), "usePerPvSkin", false);
        setBooleanField(term747388, term747388.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term747388, term747388.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term747388, term747388.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term747388, term747388.getClass(), "usePerPvTouchSliderSe", true);
        setField(term747388, term747388.getClass(), "commonModule", "-999,-999,-999");
        setField(term747388, term747388.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term747512, term747512.getClass(), "year", 2026);
        setShortField(term747512, term747512.getClass(), "month", (short) 8);
        setShortField(term747512, term747512.getClass(), "day", (short) 12);
        setField(term747511, term747511.getClass(), "date", term747512);
        setByteField(term747516, term747516.getClass(), "hour", (byte) 2);
        setByteField(term747516, term747516.getClass(), "minute", (byte) 4);
        setByteField(term747516, term747516.getClass(), "second", (byte) 29);
        setIntField(term747516, term747516.getClass(), "nano", 371124000);
        setField(term747511, term747511.getClass(), "time", term747516);
        setField(term747388, term747388.getClass(), "commonModuleSetTime", term747511);
        setField(term747388, term747388.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term747388, term747388.getClass(), "commonSkin", -1);
        setIntField(term747388, term747388.getClass(), "headphoneVolume", 100);
        setBooleanField(term747388, term747388.getClass(), "buttonSeOn", true);
        setIntField(term747388, term747388.getClass(), "buttonSeVolume", 100);
        setIntField(term747388, term747388.getClass(), "sliderSeVolume", 100);
        setIntField(term747388, term747388.getClass(), "buttonSe", -1);
        setIntField(term747388, term747388.getClass(), "chainSlideSe", -1);
        setIntField(term747388, term747388.getClass(), "slideSe", -1);
        setIntField(term747388, term747388.getClass(), "sliderTouchSe", -1);
        setField(term747388, term747388.getClass(), "sortMode", enum1623);
        setIntField(term747388, term747388.getClass(), "nextPvId", -1);
        setField(term747388, term747388.getClass(), "nextDifficulty", enum1624);
        setField(term747388, term747388.getClass(), "nextEdition", enum1625);
        setBooleanField(term747388, term747388.getClass(), "showInterimRanking", true);
        setBooleanField(term747388, term747388.getClass(), "showClearStatus", true);
        setBooleanField(term747388, term747388.getClass(), "showGreatBorder", true);
        setBooleanField(term747388, term747388.getClass(), "showExcellentBorder", true);
        setBooleanField(term747388, term747388.getClass(), "showRivalBorder", true);
        setBooleanField(term747388, term747388.getClass(), "showRgoSetting", true);
        setBooleanField(term747388, term747388.getClass(), "contestNowPlayingEnable", false);
        setIntField(term747388, term747388.getClass(), "contestNowPlayingId", -1);
        setIntField(term747388, term747388.getClass(), "contestNowPlayingValue", -1);
        setField(term747388, term747388.getClass(), "contestNowPlayingResultRank", enum1626);
        setField(term747388, term747388.getClass(), "contestNowPlayingSpecifier", "");
        setField(term747388, term747388.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term747388, term747388.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term747388, term747388.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term747388, term747388.getClass(), "rivalPdId", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSliderSeVolume", argTypes, term747388, args);
    }

};


