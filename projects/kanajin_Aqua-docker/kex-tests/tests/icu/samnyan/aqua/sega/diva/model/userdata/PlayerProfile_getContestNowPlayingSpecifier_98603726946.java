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

public class PlayerProfile_getContestNowPlayingSpecifier_98603726946 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term793995;

    public PlayerProfile_getContestNowPlayingSpecifier_98603726946() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term794607 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term794606 = ((Class) term794607).getDeclaredField((String) "MISS");
        ((Field) term794606).setAccessible(true);
        Object enum1717 = ((Field) term794606).get((Object) null);
        Class<? extends Object> term794984 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term794983 = ((Class) term794984).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term794983).setAccessible(true);
        Object enum1718 = ((Field) term794983).get((Object) null);
        Class<? extends Object> term795267 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term795266 = ((Class) term795267).getDeclaredField((String) "NORMAL");
        ((Field) term795266).setAccessible(true);
        Object enum1719 = ((Field) term795266).get((Object) null);
        Class<? extends Object> term795542 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term795541 = ((Class) term795542).getDeclaredField((String) "ORIGINAL");
        ((Field) term795541).setAccessible(true);
        Object enum1720 = ((Field) term795541).get((Object) null);
        Class<? extends Object> term795808 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term795807 = ((Class) term795808).getDeclaredField((String) "NONE");
        ((Field) term795807).setAccessible(true);
        Object enum1721 = ((Field) term795807).get((Object) null);
        term793995 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term794118 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term794119 = newInstance(Class.forName("java.time.LocalDate"));
        Object term794123 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term793995, term793995.getClass(), "id", -4146453776626172590L);
        setIntField(term793995, term793995.getClass(), "pdId", -80119579);
        setField(term793995, term793995.getClass(), "playerName", "xxx");
        setIntField(term793995, term793995.getClass(), "vocaloidPoints", 300);
        setIntField(term793995, term793995.getClass(), "level", 1);
        setIntField(term793995, term793995.getClass(), "levelExp", -725563031);
        setField(term793995, term793995.getClass(), "levelTitle", "xxx");
        setIntField(term793995, term793995.getClass(), "plateId", -1);
        setIntField(term793995, term793995.getClass(), "plateEffectId", -1);
        setField(term793995, term793995.getClass(), "passwordStatus", enum1717);
        setField(term793995, term793995.getClass(), "password", "**********");
        setBooleanField(term793995, term793995.getClass(), "preferPerPvModule", true);
        setBooleanField(term793995, term793995.getClass(), "preferCommonModule", false);
        setBooleanField(term793995, term793995.getClass(), "usePerPvSkin", false);
        setBooleanField(term793995, term793995.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term793995, term793995.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term793995, term793995.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term793995, term793995.getClass(), "usePerPvTouchSliderSe", false);
        setField(term793995, term793995.getClass(), "commonModule", "-999,-999,-999");
        setField(term793995, term793995.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term794119, term794119.getClass(), "year", 2026);
        setShortField(term794119, term794119.getClass(), "month", (short) 6);
        setShortField(term794119, term794119.getClass(), "day", (short) 29);
        setField(term794118, term794118.getClass(), "date", term794119);
        setByteField(term794123, term794123.getClass(), "hour", (byte) 4);
        setByteField(term794123, term794123.getClass(), "minute", (byte) 29);
        setByteField(term794123, term794123.getClass(), "second", (byte) 21);
        setIntField(term794123, term794123.getClass(), "nano", 67551000);
        setField(term794118, term794118.getClass(), "time", term794123);
        setField(term793995, term793995.getClass(), "commonModuleSetTime", term794118);
        setField(term793995, term793995.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term793995, term793995.getClass(), "commonSkin", -1);
        setIntField(term793995, term793995.getClass(), "headphoneVolume", 100);
        setBooleanField(term793995, term793995.getClass(), "buttonSeOn", true);
        setIntField(term793995, term793995.getClass(), "buttonSeVolume", 100);
        setIntField(term793995, term793995.getClass(), "sliderSeVolume", 100);
        setIntField(term793995, term793995.getClass(), "buttonSe", -1);
        setIntField(term793995, term793995.getClass(), "chainSlideSe", -1);
        setIntField(term793995, term793995.getClass(), "slideSe", -1);
        setIntField(term793995, term793995.getClass(), "sliderTouchSe", -1);
        setField(term793995, term793995.getClass(), "sortMode", enum1718);
        setIntField(term793995, term793995.getClass(), "nextPvId", -1);
        setField(term793995, term793995.getClass(), "nextDifficulty", enum1719);
        setField(term793995, term793995.getClass(), "nextEdition", enum1720);
        setBooleanField(term793995, term793995.getClass(), "showInterimRanking", true);
        setBooleanField(term793995, term793995.getClass(), "showClearStatus", true);
        setBooleanField(term793995, term793995.getClass(), "showGreatBorder", true);
        setBooleanField(term793995, term793995.getClass(), "showExcellentBorder", true);
        setBooleanField(term793995, term793995.getClass(), "showRivalBorder", true);
        setBooleanField(term793995, term793995.getClass(), "showRgoSetting", true);
        setBooleanField(term793995, term793995.getClass(), "contestNowPlayingEnable", false);
        setIntField(term793995, term793995.getClass(), "contestNowPlayingId", -1);
        setIntField(term793995, term793995.getClass(), "contestNowPlayingValue", -1);
        setField(term793995, term793995.getClass(), "contestNowPlayingResultRank", enum1721);
        setField(term793995, term793995.getClass(), "contestNowPlayingSpecifier", "");
        setField(term793995, term793995.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term793995, term793995.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term793995, term793995.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term793995, term793995.getClass(), "rivalPdId", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getContestNowPlayingSpecifier", argTypes, term793995, args);
    }

};


