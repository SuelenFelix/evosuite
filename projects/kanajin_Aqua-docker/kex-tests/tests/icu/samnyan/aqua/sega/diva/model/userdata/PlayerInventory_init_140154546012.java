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

public class PlayerInventory_init_140154546012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term561594;
     Object term561596;

    public PlayerInventory_init_140154546012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term561594 = new Long(2535595959091595249L);
        Class<? extends Object> term562232 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term562231 = ((Class) term562232).getDeclaredField((String) "MISS");
        ((Field) term562231).setAccessible(true);
        Object enum1227 = ((Field) term562231).get((Object) null);
        Class<? extends Object> term562609 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term562608 = ((Class) term562609).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term562608).setAccessible(true);
        Object enum1228 = ((Field) term562608).get((Object) null);
        Class<? extends Object> term562892 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term562891 = ((Class) term562892).getDeclaredField((String) "NORMAL");
        ((Field) term562891).setAccessible(true);
        Object enum1229 = ((Field) term562891).get((Object) null);
        Class<? extends Object> term563167 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term563166 = ((Class) term563167).getDeclaredField((String) "ORIGINAL");
        ((Field) term563166).setAccessible(true);
        Object enum1230 = ((Field) term563166).get((Object) null);
        Class<? extends Object> term563433 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term563432 = ((Class) term563433).getDeclaredField((String) "NONE");
        ((Field) term563432).setAccessible(true);
        Object enum1231 = ((Field) term563432).get((Object) null);
        term561596 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term561719 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term561720 = newInstance(Class.forName("java.time.LocalDate"));
        Object term561724 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term561596, term561596.getClass(), "id", -6001151456088965547L);
        setIntField(term561596, term561596.getClass(), "pdId", -531666058);
        setField(term561596, term561596.getClass(), "playerName", "xxx");
        setIntField(term561596, term561596.getClass(), "vocaloidPoints", 300);
        setIntField(term561596, term561596.getClass(), "level", 1);
        setIntField(term561596, term561596.getClass(), "levelExp", -1659995523);
        setField(term561596, term561596.getClass(), "levelTitle", "xxx");
        setIntField(term561596, term561596.getClass(), "plateId", -1);
        setIntField(term561596, term561596.getClass(), "plateEffectId", -1);
        setField(term561596, term561596.getClass(), "passwordStatus", enum1227);
        setField(term561596, term561596.getClass(), "password", "**********");
        setBooleanField(term561596, term561596.getClass(), "preferPerPvModule", true);
        setBooleanField(term561596, term561596.getClass(), "preferCommonModule", false);
        setBooleanField(term561596, term561596.getClass(), "usePerPvSkin", true);
        setBooleanField(term561596, term561596.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term561596, term561596.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term561596, term561596.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term561596, term561596.getClass(), "usePerPvTouchSliderSe", true);
        setField(term561596, term561596.getClass(), "commonModule", "-999,-999,-999");
        setField(term561596, term561596.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term561720, term561720.getClass(), "year", 2026);
        setShortField(term561720, term561720.getClass(), "month", (short) 6);
        setShortField(term561720, term561720.getClass(), "day", (short) 29);
        setField(term561719, term561719.getClass(), "date", term561720);
        setByteField(term561724, term561724.getClass(), "hour", (byte) 4);
        setByteField(term561724, term561724.getClass(), "minute", (byte) 28);
        setByteField(term561724, term561724.getClass(), "second", (byte) 43);
        setIntField(term561724, term561724.getClass(), "nano", 452591000);
        setField(term561719, term561719.getClass(), "time", term561724);
        setField(term561596, term561596.getClass(), "commonModuleSetTime", term561719);
        setField(term561596, term561596.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term561596, term561596.getClass(), "commonSkin", -1);
        setIntField(term561596, term561596.getClass(), "headphoneVolume", 100);
        setBooleanField(term561596, term561596.getClass(), "buttonSeOn", true);
        setIntField(term561596, term561596.getClass(), "buttonSeVolume", 100);
        setIntField(term561596, term561596.getClass(), "sliderSeVolume", 100);
        setIntField(term561596, term561596.getClass(), "buttonSe", -1);
        setIntField(term561596, term561596.getClass(), "chainSlideSe", -1);
        setIntField(term561596, term561596.getClass(), "slideSe", -1);
        setIntField(term561596, term561596.getClass(), "sliderTouchSe", -1);
        setField(term561596, term561596.getClass(), "sortMode", enum1228);
        setIntField(term561596, term561596.getClass(), "nextPvId", -1);
        setField(term561596, term561596.getClass(), "nextDifficulty", enum1229);
        setField(term561596, term561596.getClass(), "nextEdition", enum1230);
        setBooleanField(term561596, term561596.getClass(), "showInterimRanking", true);
        setBooleanField(term561596, term561596.getClass(), "showClearStatus", true);
        setBooleanField(term561596, term561596.getClass(), "showGreatBorder", true);
        setBooleanField(term561596, term561596.getClass(), "showExcellentBorder", true);
        setBooleanField(term561596, term561596.getClass(), "showRivalBorder", true);
        setBooleanField(term561596, term561596.getClass(), "showRgoSetting", true);
        setBooleanField(term561596, term561596.getClass(), "contestNowPlayingEnable", true);
        setIntField(term561596, term561596.getClass(), "contestNowPlayingId", -1);
        setIntField(term561596, term561596.getClass(), "contestNowPlayingValue", -1);
        setField(term561596, term561596.getClass(), "contestNowPlayingResultRank", enum1231);
        setField(term561596, term561596.getClass(), "contestNowPlayingSpecifier", "");
        setField(term561596, term561596.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term561596, term561596.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term561596, term561596.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term561596, term561596.getClass(), "rivalPdId", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerInventory");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        Object[] args = new Object[4];
        args[0] = term561594;
        args[1] = term561596;
        args[2] = "JeZFtaqkzW";
        args[3] = "vOVuNSCCLe";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


