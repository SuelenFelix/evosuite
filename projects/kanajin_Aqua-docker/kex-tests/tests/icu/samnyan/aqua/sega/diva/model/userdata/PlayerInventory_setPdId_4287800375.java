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

public class PlayerInventory_setPdId_4287800375 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term543021;
     Object term543653;

    public PlayerInventory_setPdId_4287800375() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term543022 = new Long(4872422362414183754L);
        Class<? extends Object> term544206 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term544205 = ((Class) term544206).getDeclaredField((String) "MISS");
        ((Field) term544205).setAccessible(true);
        Object enum1192 = ((Field) term544205).get((Object) null);
        Class<? extends Object> term544583 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term544582 = ((Class) term544583).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term544582).setAccessible(true);
        Object enum1193 = ((Field) term544582).get((Object) null);
        Class<? extends Object> term544866 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term544865 = ((Class) term544866).getDeclaredField((String) "NORMAL");
        ((Field) term544865).setAccessible(true);
        Object enum1194 = ((Field) term544865).get((Object) null);
        Class<? extends Object> term545141 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term545140 = ((Class) term545141).getDeclaredField((String) "ORIGINAL");
        ((Field) term545140).setAccessible(true);
        Object enum1195 = ((Field) term545140).get((Object) null);
        Class<? extends Object> term545407 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term545406 = ((Class) term545407).getDeclaredField((String) "NONE");
        ((Field) term545406).setAccessible(true);
        Object enum1196 = ((Field) term545406).get((Object) null);
        term543021 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerInventory"));
        Object term543024 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term543147 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term543148 = newInstance(Class.forName("java.time.LocalDate"));
        Object term543152 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term543021, term543021.getClass(), "id", term543022);
        setLongField(term543024, term543024.getClass(), "id", 3077284143733577490L);
        setIntField(term543024, term543024.getClass(), "pdId", -1211119545);
        setField(term543024, term543024.getClass(), "playerName", "xxx");
        setIntField(term543024, term543024.getClass(), "vocaloidPoints", 300);
        setIntField(term543024, term543024.getClass(), "level", 1);
        setIntField(term543024, term543024.getClass(), "levelExp", 1584121590);
        setField(term543024, term543024.getClass(), "levelTitle", "xxx");
        setIntField(term543024, term543024.getClass(), "plateId", -1);
        setIntField(term543024, term543024.getClass(), "plateEffectId", -1);
        setField(term543024, term543024.getClass(), "passwordStatus", enum1192);
        setField(term543024, term543024.getClass(), "password", "**********");
        setBooleanField(term543024, term543024.getClass(), "preferPerPvModule", true);
        setBooleanField(term543024, term543024.getClass(), "preferCommonModule", false);
        setBooleanField(term543024, term543024.getClass(), "usePerPvSkin", true);
        setBooleanField(term543024, term543024.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term543024, term543024.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term543024, term543024.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term543024, term543024.getClass(), "usePerPvTouchSliderSe", true);
        setField(term543024, term543024.getClass(), "commonModule", "-999,-999,-999");
        setField(term543024, term543024.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term543148, term543148.getClass(), "year", 2026);
        setShortField(term543148, term543148.getClass(), "month", (short) 8);
        setShortField(term543148, term543148.getClass(), "day", (short) 12);
        setField(term543147, term543147.getClass(), "date", term543148);
        setByteField(term543152, term543152.getClass(), "hour", (byte) 2);
        setByteField(term543152, term543152.getClass(), "minute", (byte) 3);
        setByteField(term543152, term543152.getClass(), "second", (byte) 55);
        setIntField(term543152, term543152.getClass(), "nano", 833443000);
        setField(term543147, term543147.getClass(), "time", term543152);
        setField(term543024, term543024.getClass(), "commonModuleSetTime", term543147);
        setField(term543024, term543024.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term543024, term543024.getClass(), "commonSkin", -1);
        setIntField(term543024, term543024.getClass(), "headphoneVolume", 100);
        setBooleanField(term543024, term543024.getClass(), "buttonSeOn", true);
        setIntField(term543024, term543024.getClass(), "buttonSeVolume", 100);
        setIntField(term543024, term543024.getClass(), "sliderSeVolume", 100);
        setIntField(term543024, term543024.getClass(), "buttonSe", -1);
        setIntField(term543024, term543024.getClass(), "chainSlideSe", -1);
        setIntField(term543024, term543024.getClass(), "slideSe", -1);
        setIntField(term543024, term543024.getClass(), "sliderTouchSe", -1);
        setField(term543024, term543024.getClass(), "sortMode", enum1193);
        setIntField(term543024, term543024.getClass(), "nextPvId", -1);
        setField(term543024, term543024.getClass(), "nextDifficulty", enum1194);
        setField(term543024, term543024.getClass(), "nextEdition", enum1195);
        setBooleanField(term543024, term543024.getClass(), "showInterimRanking", true);
        setBooleanField(term543024, term543024.getClass(), "showClearStatus", true);
        setBooleanField(term543024, term543024.getClass(), "showGreatBorder", true);
        setBooleanField(term543024, term543024.getClass(), "showExcellentBorder", true);
        setBooleanField(term543024, term543024.getClass(), "showRivalBorder", true);
        setBooleanField(term543024, term543024.getClass(), "showRgoSetting", true);
        setBooleanField(term543024, term543024.getClass(), "contestNowPlayingEnable", true);
        setIntField(term543024, term543024.getClass(), "contestNowPlayingId", -1);
        setIntField(term543024, term543024.getClass(), "contestNowPlayingValue", -1);
        setField(term543024, term543024.getClass(), "contestNowPlayingResultRank", enum1196);
        setField(term543024, term543024.getClass(), "contestNowPlayingSpecifier", "");
        setField(term543024, term543024.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term543024, term543024.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term543024, term543024.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term543024, term543024.getClass(), "rivalPdId", -1);
        setField(term543021, term543021.getClass(), "pdId", term543024);
        setField(term543021, term543021.getClass(), "value", "riMtzCoxNj");
        setField(term543021, term543021.getClass(), "type", "YAXkVjQZcV");
        term543653 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term543767 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term543768 = newInstance(Class.forName("java.time.LocalDate"));
        Object term543772 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term543653, term543653.getClass(), "id", 4458302820344896046L);
        setIntField(term543653, term543653.getClass(), "pdId", 1133839602);
        setField(term543653, term543653.getClass(), "playerName", "xxx");
        setIntField(term543653, term543653.getClass(), "vocaloidPoints", 300);
        setIntField(term543653, term543653.getClass(), "level", 1);
        setIntField(term543653, term543653.getClass(), "levelExp", -986002923);
        setField(term543653, term543653.getClass(), "levelTitle", "xxx");
        setIntField(term543653, term543653.getClass(), "plateId", -1);
        setIntField(term543653, term543653.getClass(), "plateEffectId", -1);
        setField(term543653, term543653.getClass(), "passwordStatus", enum1192);
        setField(term543653, term543653.getClass(), "password", "**********");
        setBooleanField(term543653, term543653.getClass(), "preferPerPvModule", true);
        setBooleanField(term543653, term543653.getClass(), "preferCommonModule", false);
        setBooleanField(term543653, term543653.getClass(), "usePerPvSkin", false);
        setBooleanField(term543653, term543653.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term543653, term543653.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term543653, term543653.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term543653, term543653.getClass(), "usePerPvTouchSliderSe", false);
        setField(term543653, term543653.getClass(), "commonModule", "-999,-999,-999");
        setField(term543653, term543653.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term543768, term543768.getClass(), "year", 2026);
        setShortField(term543768, term543768.getClass(), "month", (short) 8);
        setShortField(term543768, term543768.getClass(), "day", (short) 12);
        setField(term543767, term543767.getClass(), "date", term543768);
        setByteField(term543772, term543772.getClass(), "hour", (byte) 2);
        setByteField(term543772, term543772.getClass(), "minute", (byte) 3);
        setByteField(term543772, term543772.getClass(), "second", (byte) 55);
        setIntField(term543772, term543772.getClass(), "nano", 833828000);
        setField(term543767, term543767.getClass(), "time", term543772);
        setField(term543653, term543653.getClass(), "commonModuleSetTime", term543767);
        setField(term543653, term543653.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term543653, term543653.getClass(), "commonSkin", -1);
        setIntField(term543653, term543653.getClass(), "headphoneVolume", 100);
        setBooleanField(term543653, term543653.getClass(), "buttonSeOn", true);
        setIntField(term543653, term543653.getClass(), "buttonSeVolume", 100);
        setIntField(term543653, term543653.getClass(), "sliderSeVolume", 100);
        setIntField(term543653, term543653.getClass(), "buttonSe", -1);
        setIntField(term543653, term543653.getClass(), "chainSlideSe", -1);
        setIntField(term543653, term543653.getClass(), "slideSe", -1);
        setIntField(term543653, term543653.getClass(), "sliderTouchSe", -1);
        setField(term543653, term543653.getClass(), "sortMode", enum1193);
        setIntField(term543653, term543653.getClass(), "nextPvId", -1);
        setField(term543653, term543653.getClass(), "nextDifficulty", enum1194);
        setField(term543653, term543653.getClass(), "nextEdition", enum1195);
        setBooleanField(term543653, term543653.getClass(), "showInterimRanking", true);
        setBooleanField(term543653, term543653.getClass(), "showClearStatus", true);
        setBooleanField(term543653, term543653.getClass(), "showGreatBorder", true);
        setBooleanField(term543653, term543653.getClass(), "showExcellentBorder", true);
        setBooleanField(term543653, term543653.getClass(), "showRivalBorder", true);
        setBooleanField(term543653, term543653.getClass(), "showRgoSetting", true);
        setBooleanField(term543653, term543653.getClass(), "contestNowPlayingEnable", true);
        setIntField(term543653, term543653.getClass(), "contestNowPlayingId", -1);
        setIntField(term543653, term543653.getClass(), "contestNowPlayingValue", -1);
        setField(term543653, term543653.getClass(), "contestNowPlayingResultRank", enum1196);
        setField(term543653, term543653.getClass(), "contestNowPlayingSpecifier", "");
        setField(term543653, term543653.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term543653, term543653.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term543653, term543653.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term543653, term543653.getClass(), "rivalPdId", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerInventory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Object[] args = new Object[1];
        args[0] = term543653;
        callMethod(klass, "setPdId", argTypes, term543021, args);
    }

};


