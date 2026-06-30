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

public class PlayerProfile_setLevelTitle_54903880157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term821010;

    public PlayerProfile_setLevelTitle_54903880157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term821634 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term821633 = ((Class) term821634).getDeclaredField((String) "MISS");
        ((Field) term821633).setAccessible(true);
        Object enum1772 = ((Field) term821633).get((Object) null);
        Class<? extends Object> term822011 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term822010 = ((Class) term822011).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term822010).setAccessible(true);
        Object enum1773 = ((Field) term822010).get((Object) null);
        Class<? extends Object> term822294 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term822293 = ((Class) term822294).getDeclaredField((String) "NORMAL");
        ((Field) term822293).setAccessible(true);
        Object enum1774 = ((Field) term822293).get((Object) null);
        Class<? extends Object> term822569 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term822568 = ((Class) term822569).getDeclaredField((String) "ORIGINAL");
        ((Field) term822568).setAccessible(true);
        Object enum1775 = ((Field) term822568).get((Object) null);
        Class<? extends Object> term822835 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term822834 = ((Class) term822835).getDeclaredField((String) "NONE");
        ((Field) term822834).setAccessible(true);
        Object enum1776 = ((Field) term822834).get((Object) null);
        term821010 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term821133 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term821134 = newInstance(Class.forName("java.time.LocalDate"));
        Object term821138 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term821010, term821010.getClass(), "id", 8847748922379375307L);
        setIntField(term821010, term821010.getClass(), "pdId", -388682282);
        setField(term821010, term821010.getClass(), "playerName", "xxx");
        setIntField(term821010, term821010.getClass(), "vocaloidPoints", 300);
        setIntField(term821010, term821010.getClass(), "level", 1);
        setIntField(term821010, term821010.getClass(), "levelExp", 2028706829);
        setField(term821010, term821010.getClass(), "levelTitle", "xxx");
        setIntField(term821010, term821010.getClass(), "plateId", -1);
        setIntField(term821010, term821010.getClass(), "plateEffectId", -1);
        setField(term821010, term821010.getClass(), "passwordStatus", enum1772);
        setField(term821010, term821010.getClass(), "password", "**********");
        setBooleanField(term821010, term821010.getClass(), "preferPerPvModule", true);
        setBooleanField(term821010, term821010.getClass(), "preferCommonModule", false);
        setBooleanField(term821010, term821010.getClass(), "usePerPvSkin", false);
        setBooleanField(term821010, term821010.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term821010, term821010.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term821010, term821010.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term821010, term821010.getClass(), "usePerPvTouchSliderSe", false);
        setField(term821010, term821010.getClass(), "commonModule", "-999,-999,-999");
        setField(term821010, term821010.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term821134, term821134.getClass(), "year", 2026);
        setShortField(term821134, term821134.getClass(), "month", (short) 6);
        setShortField(term821134, term821134.getClass(), "day", (short) 29);
        setField(term821133, term821133.getClass(), "date", term821134);
        setByteField(term821138, term821138.getClass(), "hour", (byte) 4);
        setByteField(term821138, term821138.getClass(), "minute", (byte) 29);
        setByteField(term821138, term821138.getClass(), "second", (byte) 23);
        setIntField(term821138, term821138.getClass(), "nano", 894382000);
        setField(term821133, term821133.getClass(), "time", term821138);
        setField(term821010, term821010.getClass(), "commonModuleSetTime", term821133);
        setField(term821010, term821010.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term821010, term821010.getClass(), "commonSkin", -1);
        setIntField(term821010, term821010.getClass(), "headphoneVolume", 100);
        setBooleanField(term821010, term821010.getClass(), "buttonSeOn", true);
        setIntField(term821010, term821010.getClass(), "buttonSeVolume", 100);
        setIntField(term821010, term821010.getClass(), "sliderSeVolume", 100);
        setIntField(term821010, term821010.getClass(), "buttonSe", -1);
        setIntField(term821010, term821010.getClass(), "chainSlideSe", -1);
        setIntField(term821010, term821010.getClass(), "slideSe", -1);
        setIntField(term821010, term821010.getClass(), "sliderTouchSe", -1);
        setField(term821010, term821010.getClass(), "sortMode", enum1773);
        setIntField(term821010, term821010.getClass(), "nextPvId", -1);
        setField(term821010, term821010.getClass(), "nextDifficulty", enum1774);
        setField(term821010, term821010.getClass(), "nextEdition", enum1775);
        setBooleanField(term821010, term821010.getClass(), "showInterimRanking", true);
        setBooleanField(term821010, term821010.getClass(), "showClearStatus", true);
        setBooleanField(term821010, term821010.getClass(), "showGreatBorder", true);
        setBooleanField(term821010, term821010.getClass(), "showExcellentBorder", true);
        setBooleanField(term821010, term821010.getClass(), "showRivalBorder", true);
        setBooleanField(term821010, term821010.getClass(), "showRgoSetting", true);
        setBooleanField(term821010, term821010.getClass(), "contestNowPlayingEnable", false);
        setIntField(term821010, term821010.getClass(), "contestNowPlayingId", -1);
        setIntField(term821010, term821010.getClass(), "contestNowPlayingValue", -1);
        setField(term821010, term821010.getClass(), "contestNowPlayingResultRank", enum1776);
        setField(term821010, term821010.getClass(), "contestNowPlayingSpecifier", "");
        setField(term821010, term821010.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term821010, term821010.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term821010, term821010.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term821010, term821010.getClass(), "rivalPdId", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JkgoRtImdE";
        callMethod(klass, "setLevelTitle", argTypes, term821010, args);
    }

};


