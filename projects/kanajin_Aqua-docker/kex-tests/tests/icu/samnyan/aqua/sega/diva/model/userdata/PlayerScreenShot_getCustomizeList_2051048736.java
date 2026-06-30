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

public class PlayerScreenShot_getCustomizeList_2051048736 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term499097;

    public PlayerScreenShot_getCustomizeList_2051048736() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term499748 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term499747 = ((Class) term499748).getDeclaredField((String) "MISS");
        ((Field) term499747).setAccessible(true);
        Object enum1107 = ((Field) term499747).get((Object) null);
        Class<? extends Object> term500125 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term500124 = ((Class) term500125).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term500124).setAccessible(true);
        Object enum1108 = ((Field) term500124).get((Object) null);
        Class<? extends Object> term500408 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term500407 = ((Class) term500408).getDeclaredField((String) "NORMAL");
        ((Field) term500407).setAccessible(true);
        Object enum1109 = ((Field) term500407).get((Object) null);
        Class<? extends Object> term500683 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term500682 = ((Class) term500683).getDeclaredField((String) "ORIGINAL");
        ((Field) term500682).setAccessible(true);
        Object enum1110 = ((Field) term500682).get((Object) null);
        Class<? extends Object> term500949 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term500948 = ((Class) term500949).getDeclaredField((String) "NONE");
        ((Field) term500948).setAccessible(true);
        Object enum1111 = ((Field) term500948).get((Object) null);
        term499097 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerScreenShot"));
        Object term499099 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term499222 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term499223 = newInstance(Class.forName("java.time.LocalDate"));
        Object term499227 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term499097, term499097.getClass(), "id", 6073193746616629086L);
        setLongField(term499099, term499099.getClass(), "id", -2463629530824341661L);
        setIntField(term499099, term499099.getClass(), "pdId", 332880714);
        setField(term499099, term499099.getClass(), "playerName", "xxx");
        setIntField(term499099, term499099.getClass(), "vocaloidPoints", 300);
        setIntField(term499099, term499099.getClass(), "level", 1);
        setIntField(term499099, term499099.getClass(), "levelExp", 904733719);
        setField(term499099, term499099.getClass(), "levelTitle", "xxx");
        setIntField(term499099, term499099.getClass(), "plateId", -1);
        setIntField(term499099, term499099.getClass(), "plateEffectId", -1);
        setField(term499099, term499099.getClass(), "passwordStatus", enum1107);
        setField(term499099, term499099.getClass(), "password", "**********");
        setBooleanField(term499099, term499099.getClass(), "preferPerPvModule", true);
        setBooleanField(term499099, term499099.getClass(), "preferCommonModule", true);
        setBooleanField(term499099, term499099.getClass(), "usePerPvSkin", false);
        setBooleanField(term499099, term499099.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term499099, term499099.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term499099, term499099.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term499099, term499099.getClass(), "usePerPvTouchSliderSe", true);
        setField(term499099, term499099.getClass(), "commonModule", "-999,-999,-999");
        setField(term499099, term499099.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term499223, term499223.getClass(), "year", 2026);
        setShortField(term499223, term499223.getClass(), "month", (short) 6);
        setShortField(term499223, term499223.getClass(), "day", (short) 29);
        setField(term499222, term499222.getClass(), "date", term499223);
        setByteField(term499227, term499227.getClass(), "hour", (byte) 4);
        setByteField(term499227, term499227.getClass(), "minute", (byte) 28);
        setByteField(term499227, term499227.getClass(), "second", (byte) 32);
        setIntField(term499227, term499227.getClass(), "nano", 383513000);
        setField(term499222, term499222.getClass(), "time", term499227);
        setField(term499099, term499099.getClass(), "commonModuleSetTime", term499222);
        setField(term499099, term499099.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term499099, term499099.getClass(), "commonSkin", -1);
        setIntField(term499099, term499099.getClass(), "headphoneVolume", 100);
        setBooleanField(term499099, term499099.getClass(), "buttonSeOn", true);
        setIntField(term499099, term499099.getClass(), "buttonSeVolume", 100);
        setIntField(term499099, term499099.getClass(), "sliderSeVolume", 100);
        setIntField(term499099, term499099.getClass(), "buttonSe", -1);
        setIntField(term499099, term499099.getClass(), "chainSlideSe", -1);
        setIntField(term499099, term499099.getClass(), "slideSe", -1);
        setIntField(term499099, term499099.getClass(), "sliderTouchSe", -1);
        setField(term499099, term499099.getClass(), "sortMode", enum1108);
        setIntField(term499099, term499099.getClass(), "nextPvId", -1);
        setField(term499099, term499099.getClass(), "nextDifficulty", enum1109);
        setField(term499099, term499099.getClass(), "nextEdition", enum1110);
        setBooleanField(term499099, term499099.getClass(), "showInterimRanking", true);
        setBooleanField(term499099, term499099.getClass(), "showClearStatus", true);
        setBooleanField(term499099, term499099.getClass(), "showGreatBorder", true);
        setBooleanField(term499099, term499099.getClass(), "showExcellentBorder", true);
        setBooleanField(term499099, term499099.getClass(), "showRivalBorder", true);
        setBooleanField(term499099, term499099.getClass(), "showRgoSetting", true);
        setBooleanField(term499099, term499099.getClass(), "contestNowPlayingEnable", true);
        setIntField(term499099, term499099.getClass(), "contestNowPlayingId", -1);
        setIntField(term499099, term499099.getClass(), "contestNowPlayingValue", -1);
        setField(term499099, term499099.getClass(), "contestNowPlayingResultRank", enum1111);
        setField(term499099, term499099.getClass(), "contestNowPlayingSpecifier", "");
        setField(term499099, term499099.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term499099, term499099.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term499099, term499099.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term499099, term499099.getClass(), "rivalPdId", -1);
        setField(term499097, term499097.getClass(), "pdId", term499099);
        setIntField(term499097, term499097.getClass(), "pvId", -240576356);
        setField(term499097, term499097.getClass(), "fileName", "NHbOFFjyVK");
        setField(term499097, term499097.getClass(), "moduleList", "zaloBqlrSo");
        setField(term499097, term499097.getClass(), "customizeList", "vvoLrMGCoN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerScreenShot");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCustomizeList", argTypes, term499097, args);
    }

};


