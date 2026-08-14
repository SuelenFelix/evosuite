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

public class PlayerProfile_equals_2036693110102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4902869;
     Object term4903474;

    public PlayerProfile_equals_2036693110102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4903482 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term4903481 = ((Class) term4903482).getDeclaredField((String) "MISS");
        ((Field) term4903481).setAccessible(true);
        Object enum3142 = ((Field) term4903481).get((Object) null);
        Class<? extends Object> term4903859 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term4903858 = ((Class) term4903859).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term4903858).setAccessible(true);
        Object enum3143 = ((Field) term4903858).get((Object) null);
        Class<? extends Object> term4904142 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term4904141 = ((Class) term4904142).getDeclaredField((String) "NORMAL");
        ((Field) term4904141).setAccessible(true);
        Object enum3144 = ((Field) term4904141).get((Object) null);
        Class<? extends Object> term4904417 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term4904416 = ((Class) term4904417).getDeclaredField((String) "ORIGINAL");
        ((Field) term4904416).setAccessible(true);
        Object enum3145 = ((Field) term4904416).get((Object) null);
        Class<? extends Object> term4904683 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term4904682 = ((Class) term4904683).getDeclaredField((String) "NONE");
        ((Field) term4904682).setAccessible(true);
        Object enum3146 = ((Field) term4904682).get((Object) null);
        term4902869 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term4902992 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4902993 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4902997 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4902869, term4902869.getClass(), "id", 1955069796260067733L);
        setIntField(term4902869, term4902869.getClass(), "pdId", 1083304551);
        setField(term4902869, term4902869.getClass(), "playerName", "xxx");
        setIntField(term4902869, term4902869.getClass(), "vocaloidPoints", 300);
        setIntField(term4902869, term4902869.getClass(), "level", 1);
        setIntField(term4902869, term4902869.getClass(), "levelExp", 784072421);
        setField(term4902869, term4902869.getClass(), "levelTitle", "xxx");
        setIntField(term4902869, term4902869.getClass(), "plateId", -1);
        setIntField(term4902869, term4902869.getClass(), "plateEffectId", -1);
        setField(term4902869, term4902869.getClass(), "passwordStatus", enum3142);
        setField(term4902869, term4902869.getClass(), "password", "**********");
        setBooleanField(term4902869, term4902869.getClass(), "preferPerPvModule", true);
        setBooleanField(term4902869, term4902869.getClass(), "preferCommonModule", true);
        setBooleanField(term4902869, term4902869.getClass(), "usePerPvSkin", false);
        setBooleanField(term4902869, term4902869.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term4902869, term4902869.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term4902869, term4902869.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term4902869, term4902869.getClass(), "usePerPvTouchSliderSe", false);
        setField(term4902869, term4902869.getClass(), "commonModule", "-999,-999,-999");
        setField(term4902869, term4902869.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term4902993, term4902993.getClass(), "year", 2026);
        setShortField(term4902993, term4902993.getClass(), "month", (short) 8);
        setShortField(term4902993, term4902993.getClass(), "day", (short) 11);
        setField(term4902992, term4902992.getClass(), "date", term4902993);
        setByteField(term4902997, term4902997.getClass(), "hour", (byte) 23);
        setByteField(term4902997, term4902997.getClass(), "minute", (byte) 7);
        setByteField(term4902997, term4902997.getClass(), "second", (byte) 41);
        setIntField(term4902997, term4902997.getClass(), "nano", 846850000);
        setField(term4902992, term4902992.getClass(), "time", term4902997);
        setField(term4902869, term4902869.getClass(), "commonModuleSetTime", term4902992);
        setField(term4902869, term4902869.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term4902869, term4902869.getClass(), "commonSkin", -1);
        setIntField(term4902869, term4902869.getClass(), "headphoneVolume", 100);
        setBooleanField(term4902869, term4902869.getClass(), "buttonSeOn", true);
        setIntField(term4902869, term4902869.getClass(), "buttonSeVolume", 100);
        setIntField(term4902869, term4902869.getClass(), "sliderSeVolume", 100);
        setIntField(term4902869, term4902869.getClass(), "buttonSe", -1);
        setIntField(term4902869, term4902869.getClass(), "chainSlideSe", -1);
        setIntField(term4902869, term4902869.getClass(), "slideSe", -1);
        setIntField(term4902869, term4902869.getClass(), "sliderTouchSe", -1);
        setField(term4902869, term4902869.getClass(), "sortMode", enum3143);
        setIntField(term4902869, term4902869.getClass(), "nextPvId", -1);
        setField(term4902869, term4902869.getClass(), "nextDifficulty", enum3144);
        setField(term4902869, term4902869.getClass(), "nextEdition", enum3145);
        setBooleanField(term4902869, term4902869.getClass(), "showInterimRanking", true);
        setBooleanField(term4902869, term4902869.getClass(), "showClearStatus", true);
        setBooleanField(term4902869, term4902869.getClass(), "showGreatBorder", true);
        setBooleanField(term4902869, term4902869.getClass(), "showExcellentBorder", true);
        setBooleanField(term4902869, term4902869.getClass(), "showRivalBorder", true);
        setBooleanField(term4902869, term4902869.getClass(), "showRgoSetting", true);
        setBooleanField(term4902869, term4902869.getClass(), "contestNowPlayingEnable", false);
        setIntField(term4902869, term4902869.getClass(), "contestNowPlayingId", -1);
        setIntField(term4902869, term4902869.getClass(), "contestNowPlayingValue", -1);
        setField(term4902869, term4902869.getClass(), "contestNowPlayingResultRank", enum3146);
        setField(term4902869, term4902869.getClass(), "contestNowPlayingSpecifier", "");
        setField(term4902869, term4902869.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term4902869, term4902869.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term4902869, term4902869.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term4902869, term4902869.getClass(), "rivalPdId", -1);
        term4903474 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term4903474;
        callMethod(klass, "equals", argTypes, term4902869, args);
    }

};


