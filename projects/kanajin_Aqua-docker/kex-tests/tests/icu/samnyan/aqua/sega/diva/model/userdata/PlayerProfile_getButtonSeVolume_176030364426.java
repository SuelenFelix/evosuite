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

public class PlayerProfile_getButtonSeVolume_176030364426 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term744935;

    public PlayerProfile_getButtonSeVolume_176030364426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term745547 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term745546 = ((Class) term745547).getDeclaredField((String) "MISS");
        ((Field) term745546).setAccessible(true);
        Object enum1617 = ((Field) term745546).get((Object) null);
        Class<? extends Object> term745924 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term745923 = ((Class) term745924).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term745923).setAccessible(true);
        Object enum1618 = ((Field) term745923).get((Object) null);
        Class<? extends Object> term746207 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term746206 = ((Class) term746207).getDeclaredField((String) "NORMAL");
        ((Field) term746206).setAccessible(true);
        Object enum1619 = ((Field) term746206).get((Object) null);
        Class<? extends Object> term746482 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term746481 = ((Class) term746482).getDeclaredField((String) "ORIGINAL");
        ((Field) term746481).setAccessible(true);
        Object enum1620 = ((Field) term746481).get((Object) null);
        Class<? extends Object> term746748 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term746747 = ((Class) term746748).getDeclaredField((String) "NONE");
        ((Field) term746747).setAccessible(true);
        Object enum1621 = ((Field) term746747).get((Object) null);
        term744935 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term745058 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term745059 = newInstance(Class.forName("java.time.LocalDate"));
        Object term745063 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term744935, term744935.getClass(), "id", 8527367353497875781L);
        setIntField(term744935, term744935.getClass(), "pdId", -926119173);
        setField(term744935, term744935.getClass(), "playerName", "xxx");
        setIntField(term744935, term744935.getClass(), "vocaloidPoints", 300);
        setIntField(term744935, term744935.getClass(), "level", 1);
        setIntField(term744935, term744935.getClass(), "levelExp", 1613936898);
        setField(term744935, term744935.getClass(), "levelTitle", "xxx");
        setIntField(term744935, term744935.getClass(), "plateId", -1);
        setIntField(term744935, term744935.getClass(), "plateEffectId", -1);
        setField(term744935, term744935.getClass(), "passwordStatus", enum1617);
        setField(term744935, term744935.getClass(), "password", "**********");
        setBooleanField(term744935, term744935.getClass(), "preferPerPvModule", true);
        setBooleanField(term744935, term744935.getClass(), "preferCommonModule", false);
        setBooleanField(term744935, term744935.getClass(), "usePerPvSkin", true);
        setBooleanField(term744935, term744935.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term744935, term744935.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term744935, term744935.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term744935, term744935.getClass(), "usePerPvTouchSliderSe", true);
        setField(term744935, term744935.getClass(), "commonModule", "-999,-999,-999");
        setField(term744935, term744935.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term745059, term745059.getClass(), "year", 2026);
        setShortField(term745059, term745059.getClass(), "month", (short) 8);
        setShortField(term745059, term745059.getClass(), "day", (short) 12);
        setField(term745058, term745058.getClass(), "date", term745059);
        setByteField(term745063, term745063.getClass(), "hour", (byte) 2);
        setByteField(term745063, term745063.getClass(), "minute", (byte) 4);
        setByteField(term745063, term745063.getClass(), "second", (byte) 29);
        setIntField(term745063, term745063.getClass(), "nano", 114521000);
        setField(term745058, term745058.getClass(), "time", term745063);
        setField(term744935, term744935.getClass(), "commonModuleSetTime", term745058);
        setField(term744935, term744935.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term744935, term744935.getClass(), "commonSkin", -1);
        setIntField(term744935, term744935.getClass(), "headphoneVolume", 100);
        setBooleanField(term744935, term744935.getClass(), "buttonSeOn", true);
        setIntField(term744935, term744935.getClass(), "buttonSeVolume", 100);
        setIntField(term744935, term744935.getClass(), "sliderSeVolume", 100);
        setIntField(term744935, term744935.getClass(), "buttonSe", -1);
        setIntField(term744935, term744935.getClass(), "chainSlideSe", -1);
        setIntField(term744935, term744935.getClass(), "slideSe", -1);
        setIntField(term744935, term744935.getClass(), "sliderTouchSe", -1);
        setField(term744935, term744935.getClass(), "sortMode", enum1618);
        setIntField(term744935, term744935.getClass(), "nextPvId", -1);
        setField(term744935, term744935.getClass(), "nextDifficulty", enum1619);
        setField(term744935, term744935.getClass(), "nextEdition", enum1620);
        setBooleanField(term744935, term744935.getClass(), "showInterimRanking", true);
        setBooleanField(term744935, term744935.getClass(), "showClearStatus", true);
        setBooleanField(term744935, term744935.getClass(), "showGreatBorder", true);
        setBooleanField(term744935, term744935.getClass(), "showExcellentBorder", true);
        setBooleanField(term744935, term744935.getClass(), "showRivalBorder", true);
        setBooleanField(term744935, term744935.getClass(), "showRgoSetting", true);
        setBooleanField(term744935, term744935.getClass(), "contestNowPlayingEnable", true);
        setIntField(term744935, term744935.getClass(), "contestNowPlayingId", -1);
        setIntField(term744935, term744935.getClass(), "contestNowPlayingValue", -1);
        setField(term744935, term744935.getClass(), "contestNowPlayingResultRank", enum1621);
        setField(term744935, term744935.getClass(), "contestNowPlayingSpecifier", "");
        setField(term744935, term744935.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term744935, term744935.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term744935, term744935.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term744935, term744935.getClass(), "rivalPdId", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getButtonSeVolume", argTypes, term744935, args);
    }

};


