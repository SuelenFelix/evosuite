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

public class PlayerProfile_setButtonSe_207101545278 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term872671;
     Object term873276;

    public PlayerProfile_setButtonSe_207101545278() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term873285 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term873284 = ((Class) term873285).getDeclaredField((String) "MISS");
        ((Field) term873284).setAccessible(true);
        Object enum1877 = ((Field) term873284).get((Object) null);
        Class<? extends Object> term873662 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term873661 = ((Class) term873662).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term873661).setAccessible(true);
        Object enum1878 = ((Field) term873661).get((Object) null);
        Class<? extends Object> term873945 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term873944 = ((Class) term873945).getDeclaredField((String) "NORMAL");
        ((Field) term873944).setAccessible(true);
        Object enum1879 = ((Field) term873944).get((Object) null);
        Class<? extends Object> term874220 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term874219 = ((Class) term874220).getDeclaredField((String) "ORIGINAL");
        ((Field) term874219).setAccessible(true);
        Object enum1880 = ((Field) term874219).get((Object) null);
        Class<? extends Object> term874486 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term874485 = ((Class) term874486).getDeclaredField((String) "NONE");
        ((Field) term874485).setAccessible(true);
        Object enum1881 = ((Field) term874485).get((Object) null);
        term872671 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term872794 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term872795 = newInstance(Class.forName("java.time.LocalDate"));
        Object term872799 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term872671, term872671.getClass(), "id", -6792339614909987294L);
        setIntField(term872671, term872671.getClass(), "pdId", -1150137872);
        setField(term872671, term872671.getClass(), "playerName", "xxx");
        setIntField(term872671, term872671.getClass(), "vocaloidPoints", 300);
        setIntField(term872671, term872671.getClass(), "level", 1);
        setIntField(term872671, term872671.getClass(), "levelExp", -781333853);
        setField(term872671, term872671.getClass(), "levelTitle", "xxx");
        setIntField(term872671, term872671.getClass(), "plateId", -1);
        setIntField(term872671, term872671.getClass(), "plateEffectId", -1);
        setField(term872671, term872671.getClass(), "passwordStatus", enum1877);
        setField(term872671, term872671.getClass(), "password", "**********");
        setBooleanField(term872671, term872671.getClass(), "preferPerPvModule", true);
        setBooleanField(term872671, term872671.getClass(), "preferCommonModule", true);
        setBooleanField(term872671, term872671.getClass(), "usePerPvSkin", false);
        setBooleanField(term872671, term872671.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term872671, term872671.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term872671, term872671.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term872671, term872671.getClass(), "usePerPvTouchSliderSe", false);
        setField(term872671, term872671.getClass(), "commonModule", "-999,-999,-999");
        setField(term872671, term872671.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term872795, term872795.getClass(), "year", 2026);
        setShortField(term872795, term872795.getClass(), "month", (short) 6);
        setShortField(term872795, term872795.getClass(), "day", (short) 29);
        setField(term872794, term872794.getClass(), "date", term872795);
        setByteField(term872799, term872799.getClass(), "hour", (byte) 4);
        setByteField(term872799, term872799.getClass(), "minute", (byte) 29);
        setByteField(term872799, term872799.getClass(), "second", (byte) 29);
        setIntField(term872799, term872799.getClass(), "nano", 303249000);
        setField(term872794, term872794.getClass(), "time", term872799);
        setField(term872671, term872671.getClass(), "commonModuleSetTime", term872794);
        setField(term872671, term872671.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term872671, term872671.getClass(), "commonSkin", -1);
        setIntField(term872671, term872671.getClass(), "headphoneVolume", 100);
        setBooleanField(term872671, term872671.getClass(), "buttonSeOn", true);
        setIntField(term872671, term872671.getClass(), "buttonSeVolume", 100);
        setIntField(term872671, term872671.getClass(), "sliderSeVolume", 100);
        setIntField(term872671, term872671.getClass(), "buttonSe", -1);
        setIntField(term872671, term872671.getClass(), "chainSlideSe", -1);
        setIntField(term872671, term872671.getClass(), "slideSe", -1);
        setIntField(term872671, term872671.getClass(), "sliderTouchSe", -1);
        setField(term872671, term872671.getClass(), "sortMode", enum1878);
        setIntField(term872671, term872671.getClass(), "nextPvId", -1);
        setField(term872671, term872671.getClass(), "nextDifficulty", enum1879);
        setField(term872671, term872671.getClass(), "nextEdition", enum1880);
        setBooleanField(term872671, term872671.getClass(), "showInterimRanking", true);
        setBooleanField(term872671, term872671.getClass(), "showClearStatus", true);
        setBooleanField(term872671, term872671.getClass(), "showGreatBorder", true);
        setBooleanField(term872671, term872671.getClass(), "showExcellentBorder", true);
        setBooleanField(term872671, term872671.getClass(), "showRivalBorder", true);
        setBooleanField(term872671, term872671.getClass(), "showRgoSetting", true);
        setBooleanField(term872671, term872671.getClass(), "contestNowPlayingEnable", true);
        setIntField(term872671, term872671.getClass(), "contestNowPlayingId", -1);
        setIntField(term872671, term872671.getClass(), "contestNowPlayingValue", -1);
        setField(term872671, term872671.getClass(), "contestNowPlayingResultRank", enum1881);
        setField(term872671, term872671.getClass(), "contestNowPlayingSpecifier", "");
        setField(term872671, term872671.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term872671, term872671.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term872671, term872671.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term872671, term872671.getClass(), "rivalPdId", -1);
        term873276 = new Integer(158137467);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term873276;
        callMethod(klass, "setButtonSe", argTypes, term872671, args);
    }

};


