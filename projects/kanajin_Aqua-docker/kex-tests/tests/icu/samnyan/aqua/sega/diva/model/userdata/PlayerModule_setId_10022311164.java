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

public class PlayerModule_setId_10022311164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term662864;
     Object term663472;

    public PlayerModule_setId_10022311164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term663481 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term663480 = ((Class) term663481).getDeclaredField((String) "MISS");
        ((Field) term663480).setAccessible(true);
        Object enum1452 = ((Field) term663480).get((Object) null);
        Class<? extends Object> term663858 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term663857 = ((Class) term663858).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term663857).setAccessible(true);
        Object enum1453 = ((Field) term663857).get((Object) null);
        Class<? extends Object> term664141 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term664140 = ((Class) term664141).getDeclaredField((String) "NORMAL");
        ((Field) term664140).setAccessible(true);
        Object enum1454 = ((Field) term664140).get((Object) null);
        Class<? extends Object> term664416 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term664415 = ((Class) term664416).getDeclaredField((String) "ORIGINAL");
        ((Field) term664415).setAccessible(true);
        Object enum1455 = ((Field) term664415).get((Object) null);
        Class<? extends Object> term664682 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term664681 = ((Class) term664682).getDeclaredField((String) "NONE");
        ((Field) term664681).setAccessible(true);
        Object enum1456 = ((Field) term664681).get((Object) null);
        term662864 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerModule"));
        Object term662866 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term662989 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term662990 = newInstance(Class.forName("java.time.LocalDate"));
        Object term662994 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term662864, term662864.getClass(), "id", 5845993504299821981L);
        setLongField(term662866, term662866.getClass(), "id", -1528017371096319990L);
        setIntField(term662866, term662866.getClass(), "pdId", 1532668668);
        setField(term662866, term662866.getClass(), "playerName", "xxx");
        setIntField(term662866, term662866.getClass(), "vocaloidPoints", 300);
        setIntField(term662866, term662866.getClass(), "level", 1);
        setIntField(term662866, term662866.getClass(), "levelExp", -100547107);
        setField(term662866, term662866.getClass(), "levelTitle", "xxx");
        setIntField(term662866, term662866.getClass(), "plateId", -1);
        setIntField(term662866, term662866.getClass(), "plateEffectId", -1);
        setField(term662866, term662866.getClass(), "passwordStatus", enum1452);
        setField(term662866, term662866.getClass(), "password", "**********");
        setBooleanField(term662866, term662866.getClass(), "preferPerPvModule", true);
        setBooleanField(term662866, term662866.getClass(), "preferCommonModule", true);
        setBooleanField(term662866, term662866.getClass(), "usePerPvSkin", true);
        setBooleanField(term662866, term662866.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term662866, term662866.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term662866, term662866.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term662866, term662866.getClass(), "usePerPvTouchSliderSe", false);
        setField(term662866, term662866.getClass(), "commonModule", "-999,-999,-999");
        setField(term662866, term662866.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term662990, term662990.getClass(), "year", 2026);
        setShortField(term662990, term662990.getClass(), "month", (short) 8);
        setShortField(term662990, term662990.getClass(), "day", (short) 12);
        setField(term662989, term662989.getClass(), "date", term662990);
        setByteField(term662994, term662994.getClass(), "hour", (byte) 2);
        setByteField(term662994, term662994.getClass(), "minute", (byte) 4);
        setByteField(term662994, term662994.getClass(), "second", (byte) 17);
        setIntField(term662994, term662994.getClass(), "nano", 208062000);
        setField(term662989, term662989.getClass(), "time", term662994);
        setField(term662866, term662866.getClass(), "commonModuleSetTime", term662989);
        setField(term662866, term662866.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term662866, term662866.getClass(), "commonSkin", -1);
        setIntField(term662866, term662866.getClass(), "headphoneVolume", 100);
        setBooleanField(term662866, term662866.getClass(), "buttonSeOn", true);
        setIntField(term662866, term662866.getClass(), "buttonSeVolume", 100);
        setIntField(term662866, term662866.getClass(), "sliderSeVolume", 100);
        setIntField(term662866, term662866.getClass(), "buttonSe", -1);
        setIntField(term662866, term662866.getClass(), "chainSlideSe", -1);
        setIntField(term662866, term662866.getClass(), "slideSe", -1);
        setIntField(term662866, term662866.getClass(), "sliderTouchSe", -1);
        setField(term662866, term662866.getClass(), "sortMode", enum1453);
        setIntField(term662866, term662866.getClass(), "nextPvId", -1);
        setField(term662866, term662866.getClass(), "nextDifficulty", enum1454);
        setField(term662866, term662866.getClass(), "nextEdition", enum1455);
        setBooleanField(term662866, term662866.getClass(), "showInterimRanking", true);
        setBooleanField(term662866, term662866.getClass(), "showClearStatus", true);
        setBooleanField(term662866, term662866.getClass(), "showGreatBorder", true);
        setBooleanField(term662866, term662866.getClass(), "showExcellentBorder", true);
        setBooleanField(term662866, term662866.getClass(), "showRivalBorder", true);
        setBooleanField(term662866, term662866.getClass(), "showRgoSetting", true);
        setBooleanField(term662866, term662866.getClass(), "contestNowPlayingEnable", false);
        setIntField(term662866, term662866.getClass(), "contestNowPlayingId", -1);
        setIntField(term662866, term662866.getClass(), "contestNowPlayingValue", -1);
        setField(term662866, term662866.getClass(), "contestNowPlayingResultRank", enum1456);
        setField(term662866, term662866.getClass(), "contestNowPlayingSpecifier", "");
        setField(term662866, term662866.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term662866, term662866.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term662866, term662866.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term662866, term662866.getClass(), "rivalPdId", -1);
        setField(term662864, term662864.getClass(), "pdId", term662866);
        setIntField(term662864, term662864.getClass(), "moduleId", 2140567451);
        term663472 = new Long(-1526328443223793465L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerModule");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term663472;
        callMethod(klass, "setId", argTypes, term662864, args);
    }

};


