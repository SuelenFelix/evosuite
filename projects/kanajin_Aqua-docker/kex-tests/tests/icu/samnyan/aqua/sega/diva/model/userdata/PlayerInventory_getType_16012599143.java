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

public class PlayerInventory_getType_16012599143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term538019;

    public PlayerInventory_getType_16012599143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term538020 = new Long(-8400487765614892086L);
        Class<? extends Object> term538658 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term538657 = ((Class) term538658).getDeclaredField((String) "MISS");
        ((Field) term538657).setAccessible(true);
        Object enum1182 = ((Field) term538657).get((Object) null);
        Class<? extends Object> term539035 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term539034 = ((Class) term539035).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term539034).setAccessible(true);
        Object enum1183 = ((Field) term539034).get((Object) null);
        Class<? extends Object> term539318 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term539317 = ((Class) term539318).getDeclaredField((String) "NORMAL");
        ((Field) term539317).setAccessible(true);
        Object enum1184 = ((Field) term539317).get((Object) null);
        Class<? extends Object> term539593 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term539592 = ((Class) term539593).getDeclaredField((String) "ORIGINAL");
        ((Field) term539592).setAccessible(true);
        Object enum1185 = ((Field) term539592).get((Object) null);
        Class<? extends Object> term539859 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term539858 = ((Class) term539859).getDeclaredField((String) "NONE");
        ((Field) term539858).setAccessible(true);
        Object enum1186 = ((Field) term539858).get((Object) null);
        term538019 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerInventory"));
        Object term538022 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term538145 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term538146 = newInstance(Class.forName("java.time.LocalDate"));
        Object term538150 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term538019, term538019.getClass(), "id", term538020);
        setLongField(term538022, term538022.getClass(), "id", -6490254947459640565L);
        setIntField(term538022, term538022.getClass(), "pdId", 1645215896);
        setField(term538022, term538022.getClass(), "playerName", "xxx");
        setIntField(term538022, term538022.getClass(), "vocaloidPoints", 300);
        setIntField(term538022, term538022.getClass(), "level", 1);
        setIntField(term538022, term538022.getClass(), "levelExp", -914100840);
        setField(term538022, term538022.getClass(), "levelTitle", "xxx");
        setIntField(term538022, term538022.getClass(), "plateId", -1);
        setIntField(term538022, term538022.getClass(), "plateEffectId", -1);
        setField(term538022, term538022.getClass(), "passwordStatus", enum1182);
        setField(term538022, term538022.getClass(), "password", "**********");
        setBooleanField(term538022, term538022.getClass(), "preferPerPvModule", true);
        setBooleanField(term538022, term538022.getClass(), "preferCommonModule", true);
        setBooleanField(term538022, term538022.getClass(), "usePerPvSkin", false);
        setBooleanField(term538022, term538022.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term538022, term538022.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term538022, term538022.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term538022, term538022.getClass(), "usePerPvTouchSliderSe", true);
        setField(term538022, term538022.getClass(), "commonModule", "-999,-999,-999");
        setField(term538022, term538022.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term538146, term538146.getClass(), "year", 2026);
        setShortField(term538146, term538146.getClass(), "month", (short) 8);
        setShortField(term538146, term538146.getClass(), "day", (short) 12);
        setField(term538145, term538145.getClass(), "date", term538146);
        setByteField(term538150, term538150.getClass(), "hour", (byte) 2);
        setByteField(term538150, term538150.getClass(), "minute", (byte) 3);
        setByteField(term538150, term538150.getClass(), "second", (byte) 55);
        setIntField(term538150, term538150.getClass(), "nano", 341074000);
        setField(term538145, term538145.getClass(), "time", term538150);
        setField(term538022, term538022.getClass(), "commonModuleSetTime", term538145);
        setField(term538022, term538022.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term538022, term538022.getClass(), "commonSkin", -1);
        setIntField(term538022, term538022.getClass(), "headphoneVolume", 100);
        setBooleanField(term538022, term538022.getClass(), "buttonSeOn", true);
        setIntField(term538022, term538022.getClass(), "buttonSeVolume", 100);
        setIntField(term538022, term538022.getClass(), "sliderSeVolume", 100);
        setIntField(term538022, term538022.getClass(), "buttonSe", -1);
        setIntField(term538022, term538022.getClass(), "chainSlideSe", -1);
        setIntField(term538022, term538022.getClass(), "slideSe", -1);
        setIntField(term538022, term538022.getClass(), "sliderTouchSe", -1);
        setField(term538022, term538022.getClass(), "sortMode", enum1183);
        setIntField(term538022, term538022.getClass(), "nextPvId", -1);
        setField(term538022, term538022.getClass(), "nextDifficulty", enum1184);
        setField(term538022, term538022.getClass(), "nextEdition", enum1185);
        setBooleanField(term538022, term538022.getClass(), "showInterimRanking", true);
        setBooleanField(term538022, term538022.getClass(), "showClearStatus", true);
        setBooleanField(term538022, term538022.getClass(), "showGreatBorder", true);
        setBooleanField(term538022, term538022.getClass(), "showExcellentBorder", true);
        setBooleanField(term538022, term538022.getClass(), "showRivalBorder", true);
        setBooleanField(term538022, term538022.getClass(), "showRgoSetting", true);
        setBooleanField(term538022, term538022.getClass(), "contestNowPlayingEnable", false);
        setIntField(term538022, term538022.getClass(), "contestNowPlayingId", -1);
        setIntField(term538022, term538022.getClass(), "contestNowPlayingValue", -1);
        setField(term538022, term538022.getClass(), "contestNowPlayingResultRank", enum1186);
        setField(term538022, term538022.getClass(), "contestNowPlayingSpecifier", "");
        setField(term538022, term538022.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term538022, term538022.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term538022, term538022.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term538022, term538022.getClass(), "rivalPdId", -1);
        setField(term538019, term538019.getClass(), "pdId", term538022);
        setField(term538019, term538019.getClass(), "value", "rIPMBcrNqB");
        setField(term538019, term538019.getClass(), "type", "UDaboHZHhz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerInventory");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term538019, args);
    }

};


