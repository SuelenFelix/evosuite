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
import java.lang.Long;

public class PlayerCustomize_setId_14684691534 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term463244;
     Object term463852;

    public PlayerCustomize_setId_14684691534() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term463861 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term463860 = ((Class) term463861).getDeclaredField((String) "MISS");
        ((Field) term463860).setAccessible(true);
        Object enum1037 = ((Field) term463860).get((Object) null);
        Class<? extends Object> term464238 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term464237 = ((Class) term464238).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term464237).setAccessible(true);
        Object enum1038 = ((Field) term464237).get((Object) null);
        Class<? extends Object> term464521 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term464520 = ((Class) term464521).getDeclaredField((String) "NORMAL");
        ((Field) term464520).setAccessible(true);
        Object enum1039 = ((Field) term464520).get((Object) null);
        Class<? extends Object> term464796 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term464795 = ((Class) term464796).getDeclaredField((String) "ORIGINAL");
        ((Field) term464795).setAccessible(true);
        Object enum1040 = ((Field) term464795).get((Object) null);
        Class<? extends Object> term465062 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term465061 = ((Class) term465062).getDeclaredField((String) "NONE");
        ((Field) term465061).setAccessible(true);
        Object enum1041 = ((Field) term465061).get((Object) null);
        term463244 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerCustomize"));
        Object term463246 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term463369 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term463370 = newInstance(Class.forName("java.time.LocalDate"));
        Object term463374 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term463244, term463244.getClass(), "id", -8469818909085103606L);
        setLongField(term463246, term463246.getClass(), "id", 11315815278355083L);
        setIntField(term463246, term463246.getClass(), "pdId", -537204050);
        setField(term463246, term463246.getClass(), "playerName", "xxx");
        setIntField(term463246, term463246.getClass(), "vocaloidPoints", 300);
        setIntField(term463246, term463246.getClass(), "level", 1);
        setIntField(term463246, term463246.getClass(), "levelExp", 549083285);
        setField(term463246, term463246.getClass(), "levelTitle", "xxx");
        setIntField(term463246, term463246.getClass(), "plateId", -1);
        setIntField(term463246, term463246.getClass(), "plateEffectId", -1);
        setField(term463246, term463246.getClass(), "passwordStatus", enum1037);
        setField(term463246, term463246.getClass(), "password", "**********");
        setBooleanField(term463246, term463246.getClass(), "preferPerPvModule", true);
        setBooleanField(term463246, term463246.getClass(), "preferCommonModule", true);
        setBooleanField(term463246, term463246.getClass(), "usePerPvSkin", true);
        setBooleanField(term463246, term463246.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term463246, term463246.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term463246, term463246.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term463246, term463246.getClass(), "usePerPvTouchSliderSe", true);
        setField(term463246, term463246.getClass(), "commonModule", "-999,-999,-999");
        setField(term463246, term463246.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term463370, term463370.getClass(), "year", 2026);
        setShortField(term463370, term463370.getClass(), "month", (short) 8);
        setShortField(term463370, term463370.getClass(), "day", (short) 12);
        setField(term463369, term463369.getClass(), "date", term463370);
        setByteField(term463374, term463374.getClass(), "hour", (byte) 2);
        setByteField(term463374, term463374.getClass(), "minute", (byte) 3);
        setByteField(term463374, term463374.getClass(), "second", (byte) 39);
        setIntField(term463374, term463374.getClass(), "nano", 891413000);
        setField(term463369, term463369.getClass(), "time", term463374);
        setField(term463246, term463246.getClass(), "commonModuleSetTime", term463369);
        setField(term463246, term463246.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term463246, term463246.getClass(), "commonSkin", -1);
        setIntField(term463246, term463246.getClass(), "headphoneVolume", 100);
        setBooleanField(term463246, term463246.getClass(), "buttonSeOn", true);
        setIntField(term463246, term463246.getClass(), "buttonSeVolume", 100);
        setIntField(term463246, term463246.getClass(), "sliderSeVolume", 100);
        setIntField(term463246, term463246.getClass(), "buttonSe", -1);
        setIntField(term463246, term463246.getClass(), "chainSlideSe", -1);
        setIntField(term463246, term463246.getClass(), "slideSe", -1);
        setIntField(term463246, term463246.getClass(), "sliderTouchSe", -1);
        setField(term463246, term463246.getClass(), "sortMode", enum1038);
        setIntField(term463246, term463246.getClass(), "nextPvId", -1);
        setField(term463246, term463246.getClass(), "nextDifficulty", enum1039);
        setField(term463246, term463246.getClass(), "nextEdition", enum1040);
        setBooleanField(term463246, term463246.getClass(), "showInterimRanking", true);
        setBooleanField(term463246, term463246.getClass(), "showClearStatus", true);
        setBooleanField(term463246, term463246.getClass(), "showGreatBorder", true);
        setBooleanField(term463246, term463246.getClass(), "showExcellentBorder", true);
        setBooleanField(term463246, term463246.getClass(), "showRivalBorder", true);
        setBooleanField(term463246, term463246.getClass(), "showRgoSetting", true);
        setBooleanField(term463246, term463246.getClass(), "contestNowPlayingEnable", false);
        setIntField(term463246, term463246.getClass(), "contestNowPlayingId", -1);
        setIntField(term463246, term463246.getClass(), "contestNowPlayingValue", -1);
        setField(term463246, term463246.getClass(), "contestNowPlayingResultRank", enum1041);
        setField(term463246, term463246.getClass(), "contestNowPlayingSpecifier", "");
        setField(term463246, term463246.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term463246, term463246.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term463246, term463246.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term463246, term463246.getClass(), "rivalPdId", -1);
        setField(term463244, term463244.getClass(), "pdId", term463246);
        setIntField(term463244, term463244.getClass(), "customizeId", 110630919);
        term463852 = new Long(7735460540091431012L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerCustomize");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term463852;
        callMethod(klass, "setId", argTypes, term463244, args);
    }

};


