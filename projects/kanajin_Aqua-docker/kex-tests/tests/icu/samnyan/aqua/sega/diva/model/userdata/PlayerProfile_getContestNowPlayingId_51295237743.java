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

public class PlayerProfile_getContestNowPlayingId_51295237743 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term786636;

    public PlayerProfile_getContestNowPlayingId_51295237743() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term787248 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term787247 = ((Class) term787248).getDeclaredField((String) "MISS");
        ((Field) term787247).setAccessible(true);
        Object enum1702 = ((Field) term787247).get((Object) null);
        Class<? extends Object> term787625 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term787624 = ((Class) term787625).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term787624).setAccessible(true);
        Object enum1703 = ((Field) term787624).get((Object) null);
        Class<? extends Object> term787908 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term787907 = ((Class) term787908).getDeclaredField((String) "NORMAL");
        ((Field) term787907).setAccessible(true);
        Object enum1704 = ((Field) term787907).get((Object) null);
        Class<? extends Object> term788183 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term788182 = ((Class) term788183).getDeclaredField((String) "ORIGINAL");
        ((Field) term788182).setAccessible(true);
        Object enum1705 = ((Field) term788182).get((Object) null);
        Class<? extends Object> term788449 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term788448 = ((Class) term788449).getDeclaredField((String) "NONE");
        ((Field) term788448).setAccessible(true);
        Object enum1706 = ((Field) term788448).get((Object) null);
        term786636 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term786759 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term786760 = newInstance(Class.forName("java.time.LocalDate"));
        Object term786764 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term786636, term786636.getClass(), "id", 8680715663951713735L);
        setIntField(term786636, term786636.getClass(), "pdId", 1690337049);
        setField(term786636, term786636.getClass(), "playerName", "xxx");
        setIntField(term786636, term786636.getClass(), "vocaloidPoints", 300);
        setIntField(term786636, term786636.getClass(), "level", 1);
        setIntField(term786636, term786636.getClass(), "levelExp", 254984950);
        setField(term786636, term786636.getClass(), "levelTitle", "xxx");
        setIntField(term786636, term786636.getClass(), "plateId", -1);
        setIntField(term786636, term786636.getClass(), "plateEffectId", -1);
        setField(term786636, term786636.getClass(), "passwordStatus", enum1702);
        setField(term786636, term786636.getClass(), "password", "**********");
        setBooleanField(term786636, term786636.getClass(), "preferPerPvModule", true);
        setBooleanField(term786636, term786636.getClass(), "preferCommonModule", false);
        setBooleanField(term786636, term786636.getClass(), "usePerPvSkin", true);
        setBooleanField(term786636, term786636.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term786636, term786636.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term786636, term786636.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term786636, term786636.getClass(), "usePerPvTouchSliderSe", true);
        setField(term786636, term786636.getClass(), "commonModule", "-999,-999,-999");
        setField(term786636, term786636.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term786760, term786760.getClass(), "year", 2026);
        setShortField(term786760, term786760.getClass(), "month", (short) 6);
        setShortField(term786760, term786760.getClass(), "day", (short) 29);
        setField(term786759, term786759.getClass(), "date", term786760);
        setByteField(term786764, term786764.getClass(), "hour", (byte) 4);
        setByteField(term786764, term786764.getClass(), "minute", (byte) 29);
        setByteField(term786764, term786764.getClass(), "second", (byte) 20);
        setIntField(term786764, term786764.getClass(), "nano", 292530000);
        setField(term786759, term786759.getClass(), "time", term786764);
        setField(term786636, term786636.getClass(), "commonModuleSetTime", term786759);
        setField(term786636, term786636.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term786636, term786636.getClass(), "commonSkin", -1);
        setIntField(term786636, term786636.getClass(), "headphoneVolume", 100);
        setBooleanField(term786636, term786636.getClass(), "buttonSeOn", true);
        setIntField(term786636, term786636.getClass(), "buttonSeVolume", 100);
        setIntField(term786636, term786636.getClass(), "sliderSeVolume", 100);
        setIntField(term786636, term786636.getClass(), "buttonSe", -1);
        setIntField(term786636, term786636.getClass(), "chainSlideSe", -1);
        setIntField(term786636, term786636.getClass(), "slideSe", -1);
        setIntField(term786636, term786636.getClass(), "sliderTouchSe", -1);
        setField(term786636, term786636.getClass(), "sortMode", enum1703);
        setIntField(term786636, term786636.getClass(), "nextPvId", -1);
        setField(term786636, term786636.getClass(), "nextDifficulty", enum1704);
        setField(term786636, term786636.getClass(), "nextEdition", enum1705);
        setBooleanField(term786636, term786636.getClass(), "showInterimRanking", true);
        setBooleanField(term786636, term786636.getClass(), "showClearStatus", true);
        setBooleanField(term786636, term786636.getClass(), "showGreatBorder", true);
        setBooleanField(term786636, term786636.getClass(), "showExcellentBorder", true);
        setBooleanField(term786636, term786636.getClass(), "showRivalBorder", true);
        setBooleanField(term786636, term786636.getClass(), "showRgoSetting", true);
        setBooleanField(term786636, term786636.getClass(), "contestNowPlayingEnable", false);
        setIntField(term786636, term786636.getClass(), "contestNowPlayingId", -1);
        setIntField(term786636, term786636.getClass(), "contestNowPlayingValue", -1);
        setField(term786636, term786636.getClass(), "contestNowPlayingResultRank", enum1706);
        setField(term786636, term786636.getClass(), "contestNowPlayingSpecifier", "");
        setField(term786636, term786636.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term786636, term786636.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term786636, term786636.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term786636, term786636.getClass(), "rivalPdId", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getContestNowPlayingId", argTypes, term786636, args);
    }

};


