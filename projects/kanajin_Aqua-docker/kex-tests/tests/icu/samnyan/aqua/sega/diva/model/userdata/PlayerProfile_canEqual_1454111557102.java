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

public class PlayerProfile_canEqual_1454111557102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term932498;
     Object term933103;

    public PlayerProfile_canEqual_1454111557102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term933111 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term933110 = ((Class) term933111).getDeclaredField((String) "MISS");
        ((Field) term933110).setAccessible(true);
        Object enum2000 = ((Field) term933110).get((Object) null);
        Class<? extends Object> term933488 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term933487 = ((Class) term933488).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term933487).setAccessible(true);
        Object enum2001 = ((Field) term933487).get((Object) null);
        Class<? extends Object> term933771 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term933770 = ((Class) term933771).getDeclaredField((String) "NORMAL");
        ((Field) term933770).setAccessible(true);
        Object enum2002 = ((Field) term933770).get((Object) null);
        Class<? extends Object> term934046 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term934045 = ((Class) term934046).getDeclaredField((String) "ORIGINAL");
        ((Field) term934045).setAccessible(true);
        Object enum2003 = ((Field) term934045).get((Object) null);
        Class<? extends Object> term934312 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term934311 = ((Class) term934312).getDeclaredField((String) "NONE");
        ((Field) term934311).setAccessible(true);
        Object enum2004 = ((Field) term934311).get((Object) null);
        term932498 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term932621 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term932622 = newInstance(Class.forName("java.time.LocalDate"));
        Object term932626 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term932498, term932498.getClass(), "id", 4628458998884457238L);
        setIntField(term932498, term932498.getClass(), "pdId", 1727889509);
        setField(term932498, term932498.getClass(), "playerName", "xxx");
        setIntField(term932498, term932498.getClass(), "vocaloidPoints", 300);
        setIntField(term932498, term932498.getClass(), "level", 1);
        setIntField(term932498, term932498.getClass(), "levelExp", -159961860);
        setField(term932498, term932498.getClass(), "levelTitle", "xxx");
        setIntField(term932498, term932498.getClass(), "plateId", -1);
        setIntField(term932498, term932498.getClass(), "plateEffectId", -1);
        setField(term932498, term932498.getClass(), "passwordStatus", enum2000);
        setField(term932498, term932498.getClass(), "password", "**********");
        setBooleanField(term932498, term932498.getClass(), "preferPerPvModule", true);
        setBooleanField(term932498, term932498.getClass(), "preferCommonModule", false);
        setBooleanField(term932498, term932498.getClass(), "usePerPvSkin", false);
        setBooleanField(term932498, term932498.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term932498, term932498.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term932498, term932498.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term932498, term932498.getClass(), "usePerPvTouchSliderSe", false);
        setField(term932498, term932498.getClass(), "commonModule", "-999,-999,-999");
        setField(term932498, term932498.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term932622, term932622.getClass(), "year", 2026);
        setShortField(term932622, term932622.getClass(), "month", (short) 6);
        setShortField(term932622, term932622.getClass(), "day", (short) 29);
        setField(term932621, term932621.getClass(), "date", term932622);
        setByteField(term932626, term932626.getClass(), "hour", (byte) 4);
        setByteField(term932626, term932626.getClass(), "minute", (byte) 29);
        setByteField(term932626, term932626.getClass(), "second", (byte) 35);
        setIntField(term932626, term932626.getClass(), "nano", 559468000);
        setField(term932621, term932621.getClass(), "time", term932626);
        setField(term932498, term932498.getClass(), "commonModuleSetTime", term932621);
        setField(term932498, term932498.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term932498, term932498.getClass(), "commonSkin", -1);
        setIntField(term932498, term932498.getClass(), "headphoneVolume", 100);
        setBooleanField(term932498, term932498.getClass(), "buttonSeOn", true);
        setIntField(term932498, term932498.getClass(), "buttonSeVolume", 100);
        setIntField(term932498, term932498.getClass(), "sliderSeVolume", 100);
        setIntField(term932498, term932498.getClass(), "buttonSe", -1);
        setIntField(term932498, term932498.getClass(), "chainSlideSe", -1);
        setIntField(term932498, term932498.getClass(), "slideSe", -1);
        setIntField(term932498, term932498.getClass(), "sliderTouchSe", -1);
        setField(term932498, term932498.getClass(), "sortMode", enum2001);
        setIntField(term932498, term932498.getClass(), "nextPvId", -1);
        setField(term932498, term932498.getClass(), "nextDifficulty", enum2002);
        setField(term932498, term932498.getClass(), "nextEdition", enum2003);
        setBooleanField(term932498, term932498.getClass(), "showInterimRanking", true);
        setBooleanField(term932498, term932498.getClass(), "showClearStatus", true);
        setBooleanField(term932498, term932498.getClass(), "showGreatBorder", true);
        setBooleanField(term932498, term932498.getClass(), "showExcellentBorder", true);
        setBooleanField(term932498, term932498.getClass(), "showRivalBorder", true);
        setBooleanField(term932498, term932498.getClass(), "showRgoSetting", true);
        setBooleanField(term932498, term932498.getClass(), "contestNowPlayingEnable", false);
        setIntField(term932498, term932498.getClass(), "contestNowPlayingId", -1);
        setIntField(term932498, term932498.getClass(), "contestNowPlayingValue", -1);
        setField(term932498, term932498.getClass(), "contestNowPlayingResultRank", enum2004);
        setField(term932498, term932498.getClass(), "contestNowPlayingSpecifier", "");
        setField(term932498, term932498.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term932498, term932498.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term932498, term932498.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term932498, term932498.getClass(), "rivalPdId", -1);
        term933103 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term933103;
        callMethod(klass, "canEqual", argTypes, term932498, args);
    }

};


