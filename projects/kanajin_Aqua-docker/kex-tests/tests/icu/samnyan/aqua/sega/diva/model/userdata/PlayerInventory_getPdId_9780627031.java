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

public class PlayerInventory_getPdId_9780627031 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term533019;

    public PlayerInventory_getPdId_9780627031() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term533020 = new Long(6375119433582206027L);
        Class<? extends Object> term533658 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term533657 = ((Class) term533658).getDeclaredField((String) "MISS");
        ((Field) term533657).setAccessible(true);
        Object enum1172 = ((Field) term533657).get((Object) null);
        Class<? extends Object> term534035 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term534034 = ((Class) term534035).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term534034).setAccessible(true);
        Object enum1173 = ((Field) term534034).get((Object) null);
        Class<? extends Object> term534318 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term534317 = ((Class) term534318).getDeclaredField((String) "NORMAL");
        ((Field) term534317).setAccessible(true);
        Object enum1174 = ((Field) term534317).get((Object) null);
        Class<? extends Object> term534593 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term534592 = ((Class) term534593).getDeclaredField((String) "ORIGINAL");
        ((Field) term534592).setAccessible(true);
        Object enum1175 = ((Field) term534592).get((Object) null);
        Class<? extends Object> term534859 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term534858 = ((Class) term534859).getDeclaredField((String) "NONE");
        ((Field) term534858).setAccessible(true);
        Object enum1176 = ((Field) term534858).get((Object) null);
        term533019 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerInventory"));
        Object term533022 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term533145 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term533146 = newInstance(Class.forName("java.time.LocalDate"));
        Object term533150 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term533019, term533019.getClass(), "id", term533020);
        setLongField(term533022, term533022.getClass(), "id", -7013378340043571457L);
        setIntField(term533022, term533022.getClass(), "pdId", 2130019201);
        setField(term533022, term533022.getClass(), "playerName", "xxx");
        setIntField(term533022, term533022.getClass(), "vocaloidPoints", 300);
        setIntField(term533022, term533022.getClass(), "level", 1);
        setIntField(term533022, term533022.getClass(), "levelExp", 504634766);
        setField(term533022, term533022.getClass(), "levelTitle", "xxx");
        setIntField(term533022, term533022.getClass(), "plateId", -1);
        setIntField(term533022, term533022.getClass(), "plateEffectId", -1);
        setField(term533022, term533022.getClass(), "passwordStatus", enum1172);
        setField(term533022, term533022.getClass(), "password", "**********");
        setBooleanField(term533022, term533022.getClass(), "preferPerPvModule", true);
        setBooleanField(term533022, term533022.getClass(), "preferCommonModule", false);
        setBooleanField(term533022, term533022.getClass(), "usePerPvSkin", true);
        setBooleanField(term533022, term533022.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term533022, term533022.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term533022, term533022.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term533022, term533022.getClass(), "usePerPvTouchSliderSe", false);
        setField(term533022, term533022.getClass(), "commonModule", "-999,-999,-999");
        setField(term533022, term533022.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term533146, term533146.getClass(), "year", 2026);
        setShortField(term533146, term533146.getClass(), "month", (short) 8);
        setShortField(term533146, term533146.getClass(), "day", (short) 12);
        setField(term533145, term533145.getClass(), "date", term533146);
        setByteField(term533150, term533150.getClass(), "hour", (byte) 2);
        setByteField(term533150, term533150.getClass(), "minute", (byte) 3);
        setByteField(term533150, term533150.getClass(), "second", (byte) 54);
        setIntField(term533150, term533150.getClass(), "nano", 847284000);
        setField(term533145, term533145.getClass(), "time", term533150);
        setField(term533022, term533022.getClass(), "commonModuleSetTime", term533145);
        setField(term533022, term533022.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term533022, term533022.getClass(), "commonSkin", -1);
        setIntField(term533022, term533022.getClass(), "headphoneVolume", 100);
        setBooleanField(term533022, term533022.getClass(), "buttonSeOn", true);
        setIntField(term533022, term533022.getClass(), "buttonSeVolume", 100);
        setIntField(term533022, term533022.getClass(), "sliderSeVolume", 100);
        setIntField(term533022, term533022.getClass(), "buttonSe", -1);
        setIntField(term533022, term533022.getClass(), "chainSlideSe", -1);
        setIntField(term533022, term533022.getClass(), "slideSe", -1);
        setIntField(term533022, term533022.getClass(), "sliderTouchSe", -1);
        setField(term533022, term533022.getClass(), "sortMode", enum1173);
        setIntField(term533022, term533022.getClass(), "nextPvId", -1);
        setField(term533022, term533022.getClass(), "nextDifficulty", enum1174);
        setField(term533022, term533022.getClass(), "nextEdition", enum1175);
        setBooleanField(term533022, term533022.getClass(), "showInterimRanking", true);
        setBooleanField(term533022, term533022.getClass(), "showClearStatus", true);
        setBooleanField(term533022, term533022.getClass(), "showGreatBorder", true);
        setBooleanField(term533022, term533022.getClass(), "showExcellentBorder", true);
        setBooleanField(term533022, term533022.getClass(), "showRivalBorder", true);
        setBooleanField(term533022, term533022.getClass(), "showRgoSetting", true);
        setBooleanField(term533022, term533022.getClass(), "contestNowPlayingEnable", false);
        setIntField(term533022, term533022.getClass(), "contestNowPlayingId", -1);
        setIntField(term533022, term533022.getClass(), "contestNowPlayingValue", -1);
        setField(term533022, term533022.getClass(), "contestNowPlayingResultRank", enum1176);
        setField(term533022, term533022.getClass(), "contestNowPlayingSpecifier", "");
        setField(term533022, term533022.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term533022, term533022.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term533022, term533022.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term533022, term533022.getClass(), "rivalPdId", -1);
        setField(term533019, term533019.getClass(), "pdId", term533022);
        setField(term533019, term533019.getClass(), "value", "aQFUvuaYxd");
        setField(term533019, term533019.getClass(), "type", "zNFLXMifnS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerInventory");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPdId", argTypes, term533019, args);
    }

};


