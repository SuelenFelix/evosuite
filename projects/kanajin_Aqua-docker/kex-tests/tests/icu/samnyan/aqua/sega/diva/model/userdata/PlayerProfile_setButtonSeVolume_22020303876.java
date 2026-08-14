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
import java.lang.Integer;

public class PlayerProfile_setButtonSeVolume_22020303876 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term867761;
     Object term868366;

    public PlayerProfile_setButtonSeVolume_22020303876() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term868375 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term868374 = ((Class) term868375).getDeclaredField((String) "MISS");
        ((Field) term868374).setAccessible(true);
        Object enum1867 = ((Field) term868374).get((Object) null);
        Class<? extends Object> term868752 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term868751 = ((Class) term868752).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term868751).setAccessible(true);
        Object enum1868 = ((Field) term868751).get((Object) null);
        Class<? extends Object> term869035 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term869034 = ((Class) term869035).getDeclaredField((String) "NORMAL");
        ((Field) term869034).setAccessible(true);
        Object enum1869 = ((Field) term869034).get((Object) null);
        Class<? extends Object> term869310 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term869309 = ((Class) term869310).getDeclaredField((String) "ORIGINAL");
        ((Field) term869309).setAccessible(true);
        Object enum1870 = ((Field) term869309).get((Object) null);
        Class<? extends Object> term869576 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term869575 = ((Class) term869576).getDeclaredField((String) "NONE");
        ((Field) term869575).setAccessible(true);
        Object enum1871 = ((Field) term869575).get((Object) null);
        term867761 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term867884 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term867885 = newInstance(Class.forName("java.time.LocalDate"));
        Object term867889 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term867761, term867761.getClass(), "id", -6503611645609982617L);
        setIntField(term867761, term867761.getClass(), "pdId", 364335952);
        setField(term867761, term867761.getClass(), "playerName", "xxx");
        setIntField(term867761, term867761.getClass(), "vocaloidPoints", 300);
        setIntField(term867761, term867761.getClass(), "level", 1);
        setIntField(term867761, term867761.getClass(), "levelExp", 254542714);
        setField(term867761, term867761.getClass(), "levelTitle", "xxx");
        setIntField(term867761, term867761.getClass(), "plateId", -1);
        setIntField(term867761, term867761.getClass(), "plateEffectId", -1);
        setField(term867761, term867761.getClass(), "passwordStatus", enum1867);
        setField(term867761, term867761.getClass(), "password", "**********");
        setBooleanField(term867761, term867761.getClass(), "preferPerPvModule", true);
        setBooleanField(term867761, term867761.getClass(), "preferCommonModule", true);
        setBooleanField(term867761, term867761.getClass(), "usePerPvSkin", true);
        setBooleanField(term867761, term867761.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term867761, term867761.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term867761, term867761.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term867761, term867761.getClass(), "usePerPvTouchSliderSe", false);
        setField(term867761, term867761.getClass(), "commonModule", "-999,-999,-999");
        setField(term867761, term867761.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term867885, term867885.getClass(), "year", 2026);
        setShortField(term867885, term867885.getClass(), "month", (short) 8);
        setShortField(term867885, term867885.getClass(), "day", (short) 12);
        setField(term867884, term867884.getClass(), "date", term867885);
        setByteField(term867889, term867889.getClass(), "hour", (byte) 2);
        setByteField(term867889, term867889.getClass(), "minute", (byte) 4);
        setByteField(term867889, term867889.getClass(), "second", (byte) 42);
        setIntField(term867889, term867889.getClass(), "nano", 307843000);
        setField(term867884, term867884.getClass(), "time", term867889);
        setField(term867761, term867761.getClass(), "commonModuleSetTime", term867884);
        setField(term867761, term867761.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term867761, term867761.getClass(), "commonSkin", -1);
        setIntField(term867761, term867761.getClass(), "headphoneVolume", 100);
        setBooleanField(term867761, term867761.getClass(), "buttonSeOn", true);
        setIntField(term867761, term867761.getClass(), "buttonSeVolume", 100);
        setIntField(term867761, term867761.getClass(), "sliderSeVolume", 100);
        setIntField(term867761, term867761.getClass(), "buttonSe", -1);
        setIntField(term867761, term867761.getClass(), "chainSlideSe", -1);
        setIntField(term867761, term867761.getClass(), "slideSe", -1);
        setIntField(term867761, term867761.getClass(), "sliderTouchSe", -1);
        setField(term867761, term867761.getClass(), "sortMode", enum1868);
        setIntField(term867761, term867761.getClass(), "nextPvId", -1);
        setField(term867761, term867761.getClass(), "nextDifficulty", enum1869);
        setField(term867761, term867761.getClass(), "nextEdition", enum1870);
        setBooleanField(term867761, term867761.getClass(), "showInterimRanking", true);
        setBooleanField(term867761, term867761.getClass(), "showClearStatus", true);
        setBooleanField(term867761, term867761.getClass(), "showGreatBorder", true);
        setBooleanField(term867761, term867761.getClass(), "showExcellentBorder", true);
        setBooleanField(term867761, term867761.getClass(), "showRivalBorder", true);
        setBooleanField(term867761, term867761.getClass(), "showRgoSetting", true);
        setBooleanField(term867761, term867761.getClass(), "contestNowPlayingEnable", false);
        setIntField(term867761, term867761.getClass(), "contestNowPlayingId", -1);
        setIntField(term867761, term867761.getClass(), "contestNowPlayingValue", -1);
        setField(term867761, term867761.getClass(), "contestNowPlayingResultRank", enum1871);
        setField(term867761, term867761.getClass(), "contestNowPlayingSpecifier", "");
        setField(term867761, term867761.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term867761, term867761.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term867761, term867761.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term867761, term867761.getClass(), "rivalPdId", -1);
        term868366 = new Integer(-51533463);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term868366;
        callMethod(klass, "setButtonSeVolume", argTypes, term867761, args);
    }

};


