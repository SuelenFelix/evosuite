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

public class PlayerProfile_isUsePerPvTouchSliderSe_156937402818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term725311;

    public PlayerProfile_isUsePerPvTouchSliderSe_156937402818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term725923 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term725922 = ((Class) term725923).getDeclaredField((String) "MISS");
        ((Field) term725922).setAccessible(true);
        Object enum1577 = ((Field) term725922).get((Object) null);
        Class<? extends Object> term726300 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term726299 = ((Class) term726300).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term726299).setAccessible(true);
        Object enum1578 = ((Field) term726299).get((Object) null);
        Class<? extends Object> term726583 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term726582 = ((Class) term726583).getDeclaredField((String) "NORMAL");
        ((Field) term726582).setAccessible(true);
        Object enum1579 = ((Field) term726582).get((Object) null);
        Class<? extends Object> term726858 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term726857 = ((Class) term726858).getDeclaredField((String) "ORIGINAL");
        ((Field) term726857).setAccessible(true);
        Object enum1580 = ((Field) term726857).get((Object) null);
        Class<? extends Object> term727124 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term727123 = ((Class) term727124).getDeclaredField((String) "NONE");
        ((Field) term727123).setAccessible(true);
        Object enum1581 = ((Field) term727123).get((Object) null);
        term725311 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term725434 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term725435 = newInstance(Class.forName("java.time.LocalDate"));
        Object term725439 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term725311, term725311.getClass(), "id", 8171709541116491249L);
        setIntField(term725311, term725311.getClass(), "pdId", 1316243148);
        setField(term725311, term725311.getClass(), "playerName", "xxx");
        setIntField(term725311, term725311.getClass(), "vocaloidPoints", 300);
        setIntField(term725311, term725311.getClass(), "level", 1);
        setIntField(term725311, term725311.getClass(), "levelExp", 1524913540);
        setField(term725311, term725311.getClass(), "levelTitle", "xxx");
        setIntField(term725311, term725311.getClass(), "plateId", -1);
        setIntField(term725311, term725311.getClass(), "plateEffectId", -1);
        setField(term725311, term725311.getClass(), "passwordStatus", enum1577);
        setField(term725311, term725311.getClass(), "password", "**********");
        setBooleanField(term725311, term725311.getClass(), "preferPerPvModule", true);
        setBooleanField(term725311, term725311.getClass(), "preferCommonModule", true);
        setBooleanField(term725311, term725311.getClass(), "usePerPvSkin", false);
        setBooleanField(term725311, term725311.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term725311, term725311.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term725311, term725311.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term725311, term725311.getClass(), "usePerPvTouchSliderSe", true);
        setField(term725311, term725311.getClass(), "commonModule", "-999,-999,-999");
        setField(term725311, term725311.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term725435, term725435.getClass(), "year", 2026);
        setShortField(term725435, term725435.getClass(), "month", (short) 8);
        setShortField(term725435, term725435.getClass(), "day", (short) 12);
        setField(term725434, term725434.getClass(), "date", term725435);
        setByteField(term725439, term725439.getClass(), "hour", (byte) 2);
        setByteField(term725439, term725439.getClass(), "minute", (byte) 4);
        setByteField(term725439, term725439.getClass(), "second", (byte) 27);
        setIntField(term725439, term725439.getClass(), "nano", 118051000);
        setField(term725434, term725434.getClass(), "time", term725439);
        setField(term725311, term725311.getClass(), "commonModuleSetTime", term725434);
        setField(term725311, term725311.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term725311, term725311.getClass(), "commonSkin", -1);
        setIntField(term725311, term725311.getClass(), "headphoneVolume", 100);
        setBooleanField(term725311, term725311.getClass(), "buttonSeOn", true);
        setIntField(term725311, term725311.getClass(), "buttonSeVolume", 100);
        setIntField(term725311, term725311.getClass(), "sliderSeVolume", 100);
        setIntField(term725311, term725311.getClass(), "buttonSe", -1);
        setIntField(term725311, term725311.getClass(), "chainSlideSe", -1);
        setIntField(term725311, term725311.getClass(), "slideSe", -1);
        setIntField(term725311, term725311.getClass(), "sliderTouchSe", -1);
        setField(term725311, term725311.getClass(), "sortMode", enum1578);
        setIntField(term725311, term725311.getClass(), "nextPvId", -1);
        setField(term725311, term725311.getClass(), "nextDifficulty", enum1579);
        setField(term725311, term725311.getClass(), "nextEdition", enum1580);
        setBooleanField(term725311, term725311.getClass(), "showInterimRanking", true);
        setBooleanField(term725311, term725311.getClass(), "showClearStatus", true);
        setBooleanField(term725311, term725311.getClass(), "showGreatBorder", true);
        setBooleanField(term725311, term725311.getClass(), "showExcellentBorder", true);
        setBooleanField(term725311, term725311.getClass(), "showRivalBorder", true);
        setBooleanField(term725311, term725311.getClass(), "showRgoSetting", true);
        setBooleanField(term725311, term725311.getClass(), "contestNowPlayingEnable", false);
        setIntField(term725311, term725311.getClass(), "contestNowPlayingId", -1);
        setIntField(term725311, term725311.getClass(), "contestNowPlayingValue", -1);
        setField(term725311, term725311.getClass(), "contestNowPlayingResultRank", enum1581);
        setField(term725311, term725311.getClass(), "contestNowPlayingSpecifier", "");
        setField(term725311, term725311.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term725311, term725311.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term725311, term725311.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term725311, term725311.getClass(), "rivalPdId", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isUsePerPvTouchSliderSe", argTypes, term725311, args);
    }

};


