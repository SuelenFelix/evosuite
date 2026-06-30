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

public class PlayerProfile_setCommonCustomizeItems_189053938970 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term852983;

    public PlayerProfile_setCommonCustomizeItems_189053938970() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term853607 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term853606 = ((Class) term853607).getDeclaredField((String) "MISS");
        ((Field) term853606).setAccessible(true);
        Object enum1837 = ((Field) term853606).get((Object) null);
        Class<? extends Object> term853984 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term853983 = ((Class) term853984).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term853983).setAccessible(true);
        Object enum1838 = ((Field) term853983).get((Object) null);
        Class<? extends Object> term854267 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term854266 = ((Class) term854267).getDeclaredField((String) "NORMAL");
        ((Field) term854266).setAccessible(true);
        Object enum1839 = ((Field) term854266).get((Object) null);
        Class<? extends Object> term854542 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term854541 = ((Class) term854542).getDeclaredField((String) "ORIGINAL");
        ((Field) term854541).setAccessible(true);
        Object enum1840 = ((Field) term854541).get((Object) null);
        Class<? extends Object> term854808 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term854807 = ((Class) term854808).getDeclaredField((String) "NONE");
        ((Field) term854807).setAccessible(true);
        Object enum1841 = ((Field) term854807).get((Object) null);
        term852983 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term853106 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term853107 = newInstance(Class.forName("java.time.LocalDate"));
        Object term853111 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term852983, term852983.getClass(), "id", -4191270658895729623L);
        setIntField(term852983, term852983.getClass(), "pdId", 1495500544);
        setField(term852983, term852983.getClass(), "playerName", "xxx");
        setIntField(term852983, term852983.getClass(), "vocaloidPoints", 300);
        setIntField(term852983, term852983.getClass(), "level", 1);
        setIntField(term852983, term852983.getClass(), "levelExp", -610532968);
        setField(term852983, term852983.getClass(), "levelTitle", "xxx");
        setIntField(term852983, term852983.getClass(), "plateId", -1);
        setIntField(term852983, term852983.getClass(), "plateEffectId", -1);
        setField(term852983, term852983.getClass(), "passwordStatus", enum1837);
        setField(term852983, term852983.getClass(), "password", "**********");
        setBooleanField(term852983, term852983.getClass(), "preferPerPvModule", true);
        setBooleanField(term852983, term852983.getClass(), "preferCommonModule", true);
        setBooleanField(term852983, term852983.getClass(), "usePerPvSkin", true);
        setBooleanField(term852983, term852983.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term852983, term852983.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term852983, term852983.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term852983, term852983.getClass(), "usePerPvTouchSliderSe", true);
        setField(term852983, term852983.getClass(), "commonModule", "-999,-999,-999");
        setField(term852983, term852983.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term853107, term853107.getClass(), "year", 2026);
        setShortField(term853107, term853107.getClass(), "month", (short) 6);
        setShortField(term853107, term853107.getClass(), "day", (short) 29);
        setField(term853106, term853106.getClass(), "date", term853107);
        setByteField(term853111, term853111.getClass(), "hour", (byte) 4);
        setByteField(term853111, term853111.getClass(), "minute", (byte) 29);
        setByteField(term853111, term853111.getClass(), "second", (byte) 27);
        setIntField(term853111, term853111.getClass(), "nano", 251130000);
        setField(term853106, term853106.getClass(), "time", term853111);
        setField(term852983, term852983.getClass(), "commonModuleSetTime", term853106);
        setField(term852983, term852983.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term852983, term852983.getClass(), "commonSkin", -1);
        setIntField(term852983, term852983.getClass(), "headphoneVolume", 100);
        setBooleanField(term852983, term852983.getClass(), "buttonSeOn", true);
        setIntField(term852983, term852983.getClass(), "buttonSeVolume", 100);
        setIntField(term852983, term852983.getClass(), "sliderSeVolume", 100);
        setIntField(term852983, term852983.getClass(), "buttonSe", -1);
        setIntField(term852983, term852983.getClass(), "chainSlideSe", -1);
        setIntField(term852983, term852983.getClass(), "slideSe", -1);
        setIntField(term852983, term852983.getClass(), "sliderTouchSe", -1);
        setField(term852983, term852983.getClass(), "sortMode", enum1838);
        setIntField(term852983, term852983.getClass(), "nextPvId", -1);
        setField(term852983, term852983.getClass(), "nextDifficulty", enum1839);
        setField(term852983, term852983.getClass(), "nextEdition", enum1840);
        setBooleanField(term852983, term852983.getClass(), "showInterimRanking", true);
        setBooleanField(term852983, term852983.getClass(), "showClearStatus", true);
        setBooleanField(term852983, term852983.getClass(), "showGreatBorder", true);
        setBooleanField(term852983, term852983.getClass(), "showExcellentBorder", true);
        setBooleanField(term852983, term852983.getClass(), "showRivalBorder", true);
        setBooleanField(term852983, term852983.getClass(), "showRgoSetting", true);
        setBooleanField(term852983, term852983.getClass(), "contestNowPlayingEnable", true);
        setIntField(term852983, term852983.getClass(), "contestNowPlayingId", -1);
        setIntField(term852983, term852983.getClass(), "contestNowPlayingValue", -1);
        setField(term852983, term852983.getClass(), "contestNowPlayingResultRank", enum1841);
        setField(term852983, term852983.getClass(), "contestNowPlayingSpecifier", "");
        setField(term852983, term852983.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term852983, term852983.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term852983, term852983.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term852983, term852983.getClass(), "rivalPdId", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "dAldIGYAXV";
        callMethod(klass, "setCommonCustomizeItems", argTypes, term852983, args);
    }

};


