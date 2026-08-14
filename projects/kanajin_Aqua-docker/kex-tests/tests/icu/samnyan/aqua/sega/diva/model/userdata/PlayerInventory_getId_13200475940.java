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
import java.lang.Object;
import java.lang.String;

public class PlayerInventory_getId_13200475940 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term530519;

    public PlayerInventory_getId_13200475940() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term530520 = new Long(2442117782898005296L);
        Class<? extends Object> term531158 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term531157 = ((Class) term531158).getDeclaredField((String) "MISS");
        ((Field) term531157).setAccessible(true);
        Object enum1167 = ((Field) term531157).get((Object) null);
        Class<? extends Object> term531535 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term531534 = ((Class) term531535).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term531534).setAccessible(true);
        Object enum1168 = ((Field) term531534).get((Object) null);
        Class<? extends Object> term531818 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term531817 = ((Class) term531818).getDeclaredField((String) "NORMAL");
        ((Field) term531817).setAccessible(true);
        Object enum1169 = ((Field) term531817).get((Object) null);
        Class<? extends Object> term532093 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term532092 = ((Class) term532093).getDeclaredField((String) "ORIGINAL");
        ((Field) term532092).setAccessible(true);
        Object enum1170 = ((Field) term532092).get((Object) null);
        Class<? extends Object> term532359 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term532358 = ((Class) term532359).getDeclaredField((String) "NONE");
        ((Field) term532358).setAccessible(true);
        Object enum1171 = ((Field) term532358).get((Object) null);
        term530519 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerInventory"));
        Object term530522 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term530645 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term530646 = newInstance(Class.forName("java.time.LocalDate"));
        Object term530650 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term530519, term530519.getClass(), "id", term530520);
        setLongField(term530522, term530522.getClass(), "id", -1164342036939643746L);
        setIntField(term530522, term530522.getClass(), "pdId", 507507290);
        setField(term530522, term530522.getClass(), "playerName", "xxx");
        setIntField(term530522, term530522.getClass(), "vocaloidPoints", 300);
        setIntField(term530522, term530522.getClass(), "level", 1);
        setIntField(term530522, term530522.getClass(), "levelExp", 9057138);
        setField(term530522, term530522.getClass(), "levelTitle", "xxx");
        setIntField(term530522, term530522.getClass(), "plateId", -1);
        setIntField(term530522, term530522.getClass(), "plateEffectId", -1);
        setField(term530522, term530522.getClass(), "passwordStatus", enum1167);
        setField(term530522, term530522.getClass(), "password", "**********");
        setBooleanField(term530522, term530522.getClass(), "preferPerPvModule", true);
        setBooleanField(term530522, term530522.getClass(), "preferCommonModule", false);
        setBooleanField(term530522, term530522.getClass(), "usePerPvSkin", true);
        setBooleanField(term530522, term530522.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term530522, term530522.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term530522, term530522.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term530522, term530522.getClass(), "usePerPvTouchSliderSe", true);
        setField(term530522, term530522.getClass(), "commonModule", "-999,-999,-999");
        setField(term530522, term530522.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term530646, term530646.getClass(), "year", 2026);
        setShortField(term530646, term530646.getClass(), "month", (short) 8);
        setShortField(term530646, term530646.getClass(), "day", (short) 12);
        setField(term530645, term530645.getClass(), "date", term530646);
        setByteField(term530650, term530650.getClass(), "hour", (byte) 2);
        setByteField(term530650, term530650.getClass(), "minute", (byte) 3);
        setByteField(term530650, term530650.getClass(), "second", (byte) 54);
        setIntField(term530650, term530650.getClass(), "nano", 594622000);
        setField(term530645, term530645.getClass(), "time", term530650);
        setField(term530522, term530522.getClass(), "commonModuleSetTime", term530645);
        setField(term530522, term530522.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term530522, term530522.getClass(), "commonSkin", -1);
        setIntField(term530522, term530522.getClass(), "headphoneVolume", 100);
        setBooleanField(term530522, term530522.getClass(), "buttonSeOn", true);
        setIntField(term530522, term530522.getClass(), "buttonSeVolume", 100);
        setIntField(term530522, term530522.getClass(), "sliderSeVolume", 100);
        setIntField(term530522, term530522.getClass(), "buttonSe", -1);
        setIntField(term530522, term530522.getClass(), "chainSlideSe", -1);
        setIntField(term530522, term530522.getClass(), "slideSe", -1);
        setIntField(term530522, term530522.getClass(), "sliderTouchSe", -1);
        setField(term530522, term530522.getClass(), "sortMode", enum1168);
        setIntField(term530522, term530522.getClass(), "nextPvId", -1);
        setField(term530522, term530522.getClass(), "nextDifficulty", enum1169);
        setField(term530522, term530522.getClass(), "nextEdition", enum1170);
        setBooleanField(term530522, term530522.getClass(), "showInterimRanking", true);
        setBooleanField(term530522, term530522.getClass(), "showClearStatus", true);
        setBooleanField(term530522, term530522.getClass(), "showGreatBorder", true);
        setBooleanField(term530522, term530522.getClass(), "showExcellentBorder", true);
        setBooleanField(term530522, term530522.getClass(), "showRivalBorder", true);
        setBooleanField(term530522, term530522.getClass(), "showRgoSetting", true);
        setBooleanField(term530522, term530522.getClass(), "contestNowPlayingEnable", false);
        setIntField(term530522, term530522.getClass(), "contestNowPlayingId", -1);
        setIntField(term530522, term530522.getClass(), "contestNowPlayingValue", -1);
        setField(term530522, term530522.getClass(), "contestNowPlayingResultRank", enum1171);
        setField(term530522, term530522.getClass(), "contestNowPlayingSpecifier", "");
        setField(term530522, term530522.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term530522, term530522.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term530522, term530522.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term530522, term530522.getClass(), "rivalPdId", -1);
        setField(term530519, term530519.getClass(), "pdId", term530522);
        setField(term530519, term530519.getClass(), "value", "IlvgFINwIa");
        setField(term530519, term530519.getClass(), "type", "GEJABPlHSI");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerInventory");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term530519, args);
    }

};


