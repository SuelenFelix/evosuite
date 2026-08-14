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

public class PlayerModule_setPdId_11139361115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term665322;
     Object term665930;

    public PlayerModule_setPdId_11139361115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term666483 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term666482 = ((Class) term666483).getDeclaredField((String) "MISS");
        ((Field) term666482).setAccessible(true);
        Object enum1457 = ((Field) term666482).get((Object) null);
        Class<? extends Object> term666860 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term666859 = ((Class) term666860).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term666859).setAccessible(true);
        Object enum1458 = ((Field) term666859).get((Object) null);
        Class<? extends Object> term667143 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term667142 = ((Class) term667143).getDeclaredField((String) "NORMAL");
        ((Field) term667142).setAccessible(true);
        Object enum1459 = ((Field) term667142).get((Object) null);
        Class<? extends Object> term667418 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term667417 = ((Class) term667418).getDeclaredField((String) "ORIGINAL");
        ((Field) term667417).setAccessible(true);
        Object enum1460 = ((Field) term667417).get((Object) null);
        Class<? extends Object> term667684 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term667683 = ((Class) term667684).getDeclaredField((String) "NONE");
        ((Field) term667683).setAccessible(true);
        Object enum1461 = ((Field) term667683).get((Object) null);
        term665322 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerModule"));
        Object term665324 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term665447 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term665448 = newInstance(Class.forName("java.time.LocalDate"));
        Object term665452 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term665322, term665322.getClass(), "id", -412186147449928821L);
        setLongField(term665324, term665324.getClass(), "id", -1449569009562240465L);
        setIntField(term665324, term665324.getClass(), "pdId", -390400057);
        setField(term665324, term665324.getClass(), "playerName", "xxx");
        setIntField(term665324, term665324.getClass(), "vocaloidPoints", 300);
        setIntField(term665324, term665324.getClass(), "level", 1);
        setIntField(term665324, term665324.getClass(), "levelExp", -157273113);
        setField(term665324, term665324.getClass(), "levelTitle", "xxx");
        setIntField(term665324, term665324.getClass(), "plateId", -1);
        setIntField(term665324, term665324.getClass(), "plateEffectId", -1);
        setField(term665324, term665324.getClass(), "passwordStatus", enum1457);
        setField(term665324, term665324.getClass(), "password", "**********");
        setBooleanField(term665324, term665324.getClass(), "preferPerPvModule", true);
        setBooleanField(term665324, term665324.getClass(), "preferCommonModule", false);
        setBooleanField(term665324, term665324.getClass(), "usePerPvSkin", false);
        setBooleanField(term665324, term665324.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term665324, term665324.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term665324, term665324.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term665324, term665324.getClass(), "usePerPvTouchSliderSe", false);
        setField(term665324, term665324.getClass(), "commonModule", "-999,-999,-999");
        setField(term665324, term665324.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term665448, term665448.getClass(), "year", 2026);
        setShortField(term665448, term665448.getClass(), "month", (short) 8);
        setShortField(term665448, term665448.getClass(), "day", (short) 12);
        setField(term665447, term665447.getClass(), "date", term665448);
        setByteField(term665452, term665452.getClass(), "hour", (byte) 2);
        setByteField(term665452, term665452.getClass(), "minute", (byte) 4);
        setByteField(term665452, term665452.getClass(), "second", (byte) 17);
        setIntField(term665452, term665452.getClass(), "nano", 457431000);
        setField(term665447, term665447.getClass(), "time", term665452);
        setField(term665324, term665324.getClass(), "commonModuleSetTime", term665447);
        setField(term665324, term665324.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term665324, term665324.getClass(), "commonSkin", -1);
        setIntField(term665324, term665324.getClass(), "headphoneVolume", 100);
        setBooleanField(term665324, term665324.getClass(), "buttonSeOn", true);
        setIntField(term665324, term665324.getClass(), "buttonSeVolume", 100);
        setIntField(term665324, term665324.getClass(), "sliderSeVolume", 100);
        setIntField(term665324, term665324.getClass(), "buttonSe", -1);
        setIntField(term665324, term665324.getClass(), "chainSlideSe", -1);
        setIntField(term665324, term665324.getClass(), "slideSe", -1);
        setIntField(term665324, term665324.getClass(), "sliderTouchSe", -1);
        setField(term665324, term665324.getClass(), "sortMode", enum1458);
        setIntField(term665324, term665324.getClass(), "nextPvId", -1);
        setField(term665324, term665324.getClass(), "nextDifficulty", enum1459);
        setField(term665324, term665324.getClass(), "nextEdition", enum1460);
        setBooleanField(term665324, term665324.getClass(), "showInterimRanking", true);
        setBooleanField(term665324, term665324.getClass(), "showClearStatus", true);
        setBooleanField(term665324, term665324.getClass(), "showGreatBorder", true);
        setBooleanField(term665324, term665324.getClass(), "showExcellentBorder", true);
        setBooleanField(term665324, term665324.getClass(), "showRivalBorder", true);
        setBooleanField(term665324, term665324.getClass(), "showRgoSetting", true);
        setBooleanField(term665324, term665324.getClass(), "contestNowPlayingEnable", false);
        setIntField(term665324, term665324.getClass(), "contestNowPlayingId", -1);
        setIntField(term665324, term665324.getClass(), "contestNowPlayingValue", -1);
        setField(term665324, term665324.getClass(), "contestNowPlayingResultRank", enum1461);
        setField(term665324, term665324.getClass(), "contestNowPlayingSpecifier", "");
        setField(term665324, term665324.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term665324, term665324.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term665324, term665324.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term665324, term665324.getClass(), "rivalPdId", -1);
        setField(term665322, term665322.getClass(), "pdId", term665324);
        setIntField(term665322, term665322.getClass(), "moduleId", 1497057438);
        term665930 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term666044 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term666045 = newInstance(Class.forName("java.time.LocalDate"));
        Object term666049 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term665930, term665930.getClass(), "id", 2287449183416662404L);
        setIntField(term665930, term665930.getClass(), "pdId", 1526060255);
        setField(term665930, term665930.getClass(), "playerName", "xxx");
        setIntField(term665930, term665930.getClass(), "vocaloidPoints", 300);
        setIntField(term665930, term665930.getClass(), "level", 1);
        setIntField(term665930, term665930.getClass(), "levelExp", -833785119);
        setField(term665930, term665930.getClass(), "levelTitle", "xxx");
        setIntField(term665930, term665930.getClass(), "plateId", -1);
        setIntField(term665930, term665930.getClass(), "plateEffectId", -1);
        setField(term665930, term665930.getClass(), "passwordStatus", enum1457);
        setField(term665930, term665930.getClass(), "password", "**********");
        setBooleanField(term665930, term665930.getClass(), "preferPerPvModule", true);
        setBooleanField(term665930, term665930.getClass(), "preferCommonModule", true);
        setBooleanField(term665930, term665930.getClass(), "usePerPvSkin", true);
        setBooleanField(term665930, term665930.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term665930, term665930.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term665930, term665930.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term665930, term665930.getClass(), "usePerPvTouchSliderSe", false);
        setField(term665930, term665930.getClass(), "commonModule", "-999,-999,-999");
        setField(term665930, term665930.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term666045, term666045.getClass(), "year", 2026);
        setShortField(term666045, term666045.getClass(), "month", (short) 8);
        setShortField(term666045, term666045.getClass(), "day", (short) 12);
        setField(term666044, term666044.getClass(), "date", term666045);
        setByteField(term666049, term666049.getClass(), "hour", (byte) 2);
        setByteField(term666049, term666049.getClass(), "minute", (byte) 4);
        setByteField(term666049, term666049.getClass(), "second", (byte) 17);
        setIntField(term666049, term666049.getClass(), "nano", 457817000);
        setField(term666044, term666044.getClass(), "time", term666049);
        setField(term665930, term665930.getClass(), "commonModuleSetTime", term666044);
        setField(term665930, term665930.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term665930, term665930.getClass(), "commonSkin", -1);
        setIntField(term665930, term665930.getClass(), "headphoneVolume", 100);
        setBooleanField(term665930, term665930.getClass(), "buttonSeOn", true);
        setIntField(term665930, term665930.getClass(), "buttonSeVolume", 100);
        setIntField(term665930, term665930.getClass(), "sliderSeVolume", 100);
        setIntField(term665930, term665930.getClass(), "buttonSe", -1);
        setIntField(term665930, term665930.getClass(), "chainSlideSe", -1);
        setIntField(term665930, term665930.getClass(), "slideSe", -1);
        setIntField(term665930, term665930.getClass(), "sliderTouchSe", -1);
        setField(term665930, term665930.getClass(), "sortMode", enum1458);
        setIntField(term665930, term665930.getClass(), "nextPvId", -1);
        setField(term665930, term665930.getClass(), "nextDifficulty", enum1459);
        setField(term665930, term665930.getClass(), "nextEdition", enum1460);
        setBooleanField(term665930, term665930.getClass(), "showInterimRanking", true);
        setBooleanField(term665930, term665930.getClass(), "showClearStatus", true);
        setBooleanField(term665930, term665930.getClass(), "showGreatBorder", true);
        setBooleanField(term665930, term665930.getClass(), "showExcellentBorder", true);
        setBooleanField(term665930, term665930.getClass(), "showRivalBorder", true);
        setBooleanField(term665930, term665930.getClass(), "showRgoSetting", true);
        setBooleanField(term665930, term665930.getClass(), "contestNowPlayingEnable", false);
        setIntField(term665930, term665930.getClass(), "contestNowPlayingId", -1);
        setIntField(term665930, term665930.getClass(), "contestNowPlayingValue", -1);
        setField(term665930, term665930.getClass(), "contestNowPlayingResultRank", enum1461);
        setField(term665930, term665930.getClass(), "contestNowPlayingSpecifier", "");
        setField(term665930, term665930.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term665930, term665930.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term665930, term665930.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term665930, term665930.getClass(), "rivalPdId", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerModule");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Object[] args = new Object[1];
        args[0] = term665930;
        callMethod(klass, "setPdId", argTypes, term665322, args);
    }

};


