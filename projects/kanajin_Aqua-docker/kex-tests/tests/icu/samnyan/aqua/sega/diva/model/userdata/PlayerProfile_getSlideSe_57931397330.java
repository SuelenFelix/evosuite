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

public class PlayerProfile_getSlideSe_57931397330 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term754747;

    public PlayerProfile_getSlideSe_57931397330() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term755359 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term755358 = ((Class) term755359).getDeclaredField((String) "MISS");
        ((Field) term755358).setAccessible(true);
        Object enum1637 = ((Field) term755358).get((Object) null);
        Class<? extends Object> term755736 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term755735 = ((Class) term755736).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term755735).setAccessible(true);
        Object enum1638 = ((Field) term755735).get((Object) null);
        Class<? extends Object> term756019 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term756018 = ((Class) term756019).getDeclaredField((String) "NORMAL");
        ((Field) term756018).setAccessible(true);
        Object enum1639 = ((Field) term756018).get((Object) null);
        Class<? extends Object> term756294 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term756293 = ((Class) term756294).getDeclaredField((String) "ORIGINAL");
        ((Field) term756293).setAccessible(true);
        Object enum1640 = ((Field) term756293).get((Object) null);
        Class<? extends Object> term756560 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term756559 = ((Class) term756560).getDeclaredField((String) "NONE");
        ((Field) term756559).setAccessible(true);
        Object enum1641 = ((Field) term756559).get((Object) null);
        term754747 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term754870 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term754871 = newInstance(Class.forName("java.time.LocalDate"));
        Object term754875 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term754747, term754747.getClass(), "id", -6399462725251497844L);
        setIntField(term754747, term754747.getClass(), "pdId", -1289646730);
        setField(term754747, term754747.getClass(), "playerName", "xxx");
        setIntField(term754747, term754747.getClass(), "vocaloidPoints", 300);
        setIntField(term754747, term754747.getClass(), "level", 1);
        setIntField(term754747, term754747.getClass(), "levelExp", 983651082);
        setField(term754747, term754747.getClass(), "levelTitle", "xxx");
        setIntField(term754747, term754747.getClass(), "plateId", -1);
        setIntField(term754747, term754747.getClass(), "plateEffectId", -1);
        setField(term754747, term754747.getClass(), "passwordStatus", enum1637);
        setField(term754747, term754747.getClass(), "password", "**********");
        setBooleanField(term754747, term754747.getClass(), "preferPerPvModule", true);
        setBooleanField(term754747, term754747.getClass(), "preferCommonModule", true);
        setBooleanField(term754747, term754747.getClass(), "usePerPvSkin", true);
        setBooleanField(term754747, term754747.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term754747, term754747.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term754747, term754747.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term754747, term754747.getClass(), "usePerPvTouchSliderSe", false);
        setField(term754747, term754747.getClass(), "commonModule", "-999,-999,-999");
        setField(term754747, term754747.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term754871, term754871.getClass(), "year", 2026);
        setShortField(term754871, term754871.getClass(), "month", (short) 6);
        setShortField(term754871, term754871.getClass(), "day", (short) 29);
        setField(term754870, term754870.getClass(), "date", term754871);
        setByteField(term754875, term754875.getClass(), "hour", (byte) 4);
        setByteField(term754875, term754875.getClass(), "minute", (byte) 29);
        setByteField(term754875, term754875.getClass(), "second", (byte) 16);
        setIntField(term754875, term754875.getClass(), "nano", 954632000);
        setField(term754870, term754870.getClass(), "time", term754875);
        setField(term754747, term754747.getClass(), "commonModuleSetTime", term754870);
        setField(term754747, term754747.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term754747, term754747.getClass(), "commonSkin", -1);
        setIntField(term754747, term754747.getClass(), "headphoneVolume", 100);
        setBooleanField(term754747, term754747.getClass(), "buttonSeOn", true);
        setIntField(term754747, term754747.getClass(), "buttonSeVolume", 100);
        setIntField(term754747, term754747.getClass(), "sliderSeVolume", 100);
        setIntField(term754747, term754747.getClass(), "buttonSe", -1);
        setIntField(term754747, term754747.getClass(), "chainSlideSe", -1);
        setIntField(term754747, term754747.getClass(), "slideSe", -1);
        setIntField(term754747, term754747.getClass(), "sliderTouchSe", -1);
        setField(term754747, term754747.getClass(), "sortMode", enum1638);
        setIntField(term754747, term754747.getClass(), "nextPvId", -1);
        setField(term754747, term754747.getClass(), "nextDifficulty", enum1639);
        setField(term754747, term754747.getClass(), "nextEdition", enum1640);
        setBooleanField(term754747, term754747.getClass(), "showInterimRanking", true);
        setBooleanField(term754747, term754747.getClass(), "showClearStatus", true);
        setBooleanField(term754747, term754747.getClass(), "showGreatBorder", true);
        setBooleanField(term754747, term754747.getClass(), "showExcellentBorder", true);
        setBooleanField(term754747, term754747.getClass(), "showRivalBorder", true);
        setBooleanField(term754747, term754747.getClass(), "showRgoSetting", true);
        setBooleanField(term754747, term754747.getClass(), "contestNowPlayingEnable", false);
        setIntField(term754747, term754747.getClass(), "contestNowPlayingId", -1);
        setIntField(term754747, term754747.getClass(), "contestNowPlayingValue", -1);
        setField(term754747, term754747.getClass(), "contestNowPlayingResultRank", enum1641);
        setField(term754747, term754747.getClass(), "contestNowPlayingSpecifier", "");
        setField(term754747, term754747.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term754747, term754747.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term754747, term754747.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term754747, term754747.getClass(), "rivalPdId", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSlideSe", argTypes, term754747, args);
    }

};


