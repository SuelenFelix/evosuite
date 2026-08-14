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
import java.lang.Integer;

public class GameSession_getPdId_17938315763 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term365741;

    public GameSession_getPdId_17938315763() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term366410 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term366409 = ((Class) term366410).getDeclaredField((String) "MISS");
        ((Field) term366409).setAccessible(true);
        Object enum830 = ((Field) term366409).get((Object) null);
        Class<? extends Object> term366787 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term366786 = ((Class) term366787).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term366786).setAccessible(true);
        Object enum831 = ((Field) term366786).get((Object) null);
        Class<? extends Object> term367070 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term367069 = ((Class) term367070).getDeclaredField((String) "NORMAL");
        ((Field) term367069).setAccessible(true);
        Object enum832 = ((Field) term367069).get((Object) null);
        Class<? extends Object> term367345 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term367344 = ((Class) term367345).getDeclaredField((String) "ORIGINAL");
        ((Field) term367344).setAccessible(true);
        Object enum833 = ((Field) term367344).get((Object) null);
        Class<? extends Object> term367611 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term367610 = ((Class) term367611).getDeclaredField((String) "NONE");
        ((Field) term367610).setAccessible(true);
        Object enum834 = ((Field) term367610).get((Object) null);
        Class<? extends Object> term368252 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.StartMode");
        Field term368251 = ((Class) term368252).getDeclaredField((String) "CARD_PROCEDURE");
        ((Field) term368251).setAccessible(true);
        Object enum835 = ((Field) term368251).get((Object) null);
        Integer term366387 = new Integer(-1007160944);
        Integer term366389 = new Integer(1135664017);
        Integer term366391 = new Integer(590364439);
        Integer term366393 = new Integer(865208305);
        Integer term366395 = new Integer(-1275173084);
        Integer term366397 = new Integer(-244121226);
        Integer term366399 = new Integer(-203030934);
        Integer term366401 = new Integer(-1179120542);
        term365741 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession"));
        Object term365744 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term365867 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term365868 = newInstance(Class.forName("java.time.LocalDate"));
        Object term365872 = newInstance(Class.forName("java.time.LocalTime"));
        Object term366367 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term366368 = newInstance(Class.forName("java.time.LocalDate"));
        Object term366372 = newInstance(Class.forName("java.time.LocalTime"));
        Object term366377 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term366378 = newInstance(Class.forName("java.time.LocalDate"));
        Object term366382 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term365741, term365741.getClass(), "id", -4043093655001688454L);
        setIntField(term365741, term365741.getClass(), "acceptId", 175338916);
        setLongField(term365744, term365744.getClass(), "id", -419800263764810394L);
        setIntField(term365744, term365744.getClass(), "pdId", -1484528924);
        setField(term365744, term365744.getClass(), "playerName", "xxx");
        setIntField(term365744, term365744.getClass(), "vocaloidPoints", 300);
        setIntField(term365744, term365744.getClass(), "level", 1);
        setIntField(term365744, term365744.getClass(), "levelExp", -557662858);
        setField(term365744, term365744.getClass(), "levelTitle", "xxx");
        setIntField(term365744, term365744.getClass(), "plateId", -1);
        setIntField(term365744, term365744.getClass(), "plateEffectId", -1);
        setField(term365744, term365744.getClass(), "passwordStatus", enum830);
        setField(term365744, term365744.getClass(), "password", "**********");
        setBooleanField(term365744, term365744.getClass(), "preferPerPvModule", true);
        setBooleanField(term365744, term365744.getClass(), "preferCommonModule", true);
        setBooleanField(term365744, term365744.getClass(), "usePerPvSkin", true);
        setBooleanField(term365744, term365744.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term365744, term365744.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term365744, term365744.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term365744, term365744.getClass(), "usePerPvTouchSliderSe", true);
        setField(term365744, term365744.getClass(), "commonModule", "-999,-999,-999");
        setField(term365744, term365744.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term365868, term365868.getClass(), "year", 2026);
        setShortField(term365868, term365868.getClass(), "month", (short) 8);
        setShortField(term365868, term365868.getClass(), "day", (short) 12);
        setField(term365867, term365867.getClass(), "date", term365868);
        setByteField(term365872, term365872.getClass(), "hour", (byte) 2);
        setByteField(term365872, term365872.getClass(), "minute", (byte) 3);
        setByteField(term365872, term365872.getClass(), "second", (byte) 22);
        setIntField(term365872, term365872.getClass(), "nano", 574134000);
        setField(term365867, term365867.getClass(), "time", term365872);
        setField(term365744, term365744.getClass(), "commonModuleSetTime", term365867);
        setField(term365744, term365744.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term365744, term365744.getClass(), "commonSkin", -1);
        setIntField(term365744, term365744.getClass(), "headphoneVolume", 100);
        setBooleanField(term365744, term365744.getClass(), "buttonSeOn", true);
        setIntField(term365744, term365744.getClass(), "buttonSeVolume", 100);
        setIntField(term365744, term365744.getClass(), "sliderSeVolume", 100);
        setIntField(term365744, term365744.getClass(), "buttonSe", -1);
        setIntField(term365744, term365744.getClass(), "chainSlideSe", -1);
        setIntField(term365744, term365744.getClass(), "slideSe", -1);
        setIntField(term365744, term365744.getClass(), "sliderTouchSe", -1);
        setField(term365744, term365744.getClass(), "sortMode", enum831);
        setIntField(term365744, term365744.getClass(), "nextPvId", -1);
        setField(term365744, term365744.getClass(), "nextDifficulty", enum832);
        setField(term365744, term365744.getClass(), "nextEdition", enum833);
        setBooleanField(term365744, term365744.getClass(), "showInterimRanking", true);
        setBooleanField(term365744, term365744.getClass(), "showClearStatus", true);
        setBooleanField(term365744, term365744.getClass(), "showGreatBorder", true);
        setBooleanField(term365744, term365744.getClass(), "showExcellentBorder", true);
        setBooleanField(term365744, term365744.getClass(), "showRivalBorder", true);
        setBooleanField(term365744, term365744.getClass(), "showRgoSetting", true);
        setBooleanField(term365744, term365744.getClass(), "contestNowPlayingEnable", false);
        setIntField(term365744, term365744.getClass(), "contestNowPlayingId", -1);
        setIntField(term365744, term365744.getClass(), "contestNowPlayingValue", -1);
        setField(term365744, term365744.getClass(), "contestNowPlayingResultRank", enum834);
        setField(term365744, term365744.getClass(), "contestNowPlayingSpecifier", "");
        setField(term365744, term365744.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term365744, term365744.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term365744, term365744.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term365744, term365744.getClass(), "rivalPdId", -1);
        setField(term365741, term365741.getClass(), "pdId", term365744);
        setField(term365741, term365741.getClass(), "startMode", enum835);
        setIntField(term366368, term366368.getClass(), "year", 2013);
        setShortField(term366368, term366368.getClass(), "month", (short) 9);
        setShortField(term366368, term366368.getClass(), "day", (short) 13);
        setField(term366367, term366367.getClass(), "date", term366368);
        setByteField(term366372, term366372.getClass(), "hour", (byte) 14);
        setByteField(term366372, term366372.getClass(), "minute", (byte) 36);
        setByteField(term366372, term366372.getClass(), "second", (byte) 59);
        setIntField(term366372, term366372.getClass(), "nano", 363124001);
        setField(term366367, term366367.getClass(), "time", term366372);
        setField(term365741, term365741.getClass(), "startTime", term366367);
        setIntField(term366378, term366378.getClass(), "year", 2020);
        setShortField(term366378, term366378.getClass(), "month", (short) 12);
        setShortField(term366378, term366378.getClass(), "day", (short) 21);
        setField(term366377, term366377.getClass(), "date", term366378);
        setByteField(term366382, term366382.getClass(), "hour", (byte) 20);
        setByteField(term366382, term366382.getClass(), "minute", (byte) 16);
        setByteField(term366382, term366382.getClass(), "second", (byte) 59);
        setIntField(term366382, term366382.getClass(), "nano", 976524801);
        setField(term366377, term366377.getClass(), "time", term366382);
        setField(term365741, term365741.getClass(), "lastUpdateTime", term366377);
        setField(term365741, term365741.getClass(), "stageIndex", term366387);
        setField(term365741, term365741.getClass(), "stageResultIndex", term366389);
        setField(term365741, term365741.getClass(), "lastPvId", term366391);
        setField(term365741, term365741.getClass(), "levelNumber", term366393);
        setField(term365741, term365741.getClass(), "levelExp", term366395);
        setField(term365741, term365741.getClass(), "oldLevelNumber", term366397);
        setField(term365741, term365741.getClass(), "oldLevelExp", term366399);
        setField(term365741, term365741.getClass(), "vp", term366401);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPdId", argTypes, term365741, args);
    }

};


