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

public class GameSession_getLevelExp_130945027711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term388021;

    public GameSession_getLevelExp_130945027711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term388685 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term388684 = ((Class) term388685).getDeclaredField((String) "MISS");
        ((Field) term388684).setAccessible(true);
        Object enum878 = ((Field) term388684).get((Object) null);
        Class<? extends Object> term389062 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term389061 = ((Class) term389062).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term389061).setAccessible(true);
        Object enum879 = ((Field) term389061).get((Object) null);
        Class<? extends Object> term389345 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term389344 = ((Class) term389345).getDeclaredField((String) "NORMAL");
        ((Field) term389344).setAccessible(true);
        Object enum880 = ((Field) term389344).get((Object) null);
        Class<? extends Object> term389620 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term389619 = ((Class) term389620).getDeclaredField((String) "ORIGINAL");
        ((Field) term389619).setAccessible(true);
        Object enum881 = ((Field) term389619).get((Object) null);
        Class<? extends Object> term389886 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term389885 = ((Class) term389886).getDeclaredField((String) "NONE");
        ((Field) term389885).setAccessible(true);
        Object enum882 = ((Field) term389885).get((Object) null);
        Class<? extends Object> term390527 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.StartMode");
        Field term390526 = ((Class) term390527).getDeclaredField((String) "PRE_START");
        ((Field) term390526).setAccessible(true);
        Object enum883 = ((Field) term390526).get((Object) null);
        Integer term388662 = new Integer(1114000454);
        Integer term388664 = new Integer(-556405712);
        Integer term388666 = new Integer(-1772434990);
        Integer term388668 = new Integer(-1845499264);
        Integer term388670 = new Integer(-505439934);
        Integer term388672 = new Integer(-344842608);
        Integer term388674 = new Integer(941650513);
        Integer term388676 = new Integer(444029505);
        term388021 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession"));
        Object term388024 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term388147 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term388148 = newInstance(Class.forName("java.time.LocalDate"));
        Object term388152 = newInstance(Class.forName("java.time.LocalTime"));
        Object term388642 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term388643 = newInstance(Class.forName("java.time.LocalDate"));
        Object term388647 = newInstance(Class.forName("java.time.LocalTime"));
        Object term388652 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term388653 = newInstance(Class.forName("java.time.LocalDate"));
        Object term388657 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term388021, term388021.getClass(), "id", -6394943900800506753L);
        setIntField(term388021, term388021.getClass(), "acceptId", 1463964937);
        setLongField(term388024, term388024.getClass(), "id", -4867941246533901410L);
        setIntField(term388024, term388024.getClass(), "pdId", -1207878110);
        setField(term388024, term388024.getClass(), "playerName", "xxx");
        setIntField(term388024, term388024.getClass(), "vocaloidPoints", 300);
        setIntField(term388024, term388024.getClass(), "level", 1);
        setIntField(term388024, term388024.getClass(), "levelExp", -284421477);
        setField(term388024, term388024.getClass(), "levelTitle", "xxx");
        setIntField(term388024, term388024.getClass(), "plateId", -1);
        setIntField(term388024, term388024.getClass(), "plateEffectId", -1);
        setField(term388024, term388024.getClass(), "passwordStatus", enum878);
        setField(term388024, term388024.getClass(), "password", "**********");
        setBooleanField(term388024, term388024.getClass(), "preferPerPvModule", true);
        setBooleanField(term388024, term388024.getClass(), "preferCommonModule", true);
        setBooleanField(term388024, term388024.getClass(), "usePerPvSkin", false);
        setBooleanField(term388024, term388024.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term388024, term388024.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term388024, term388024.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term388024, term388024.getClass(), "usePerPvTouchSliderSe", false);
        setField(term388024, term388024.getClass(), "commonModule", "-999,-999,-999");
        setField(term388024, term388024.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term388148, term388148.getClass(), "year", 2026);
        setShortField(term388148, term388148.getClass(), "month", (short) 8);
        setShortField(term388148, term388148.getClass(), "day", (short) 12);
        setField(term388147, term388147.getClass(), "date", term388148);
        setByteField(term388152, term388152.getClass(), "hour", (byte) 2);
        setByteField(term388152, term388152.getClass(), "minute", (byte) 3);
        setByteField(term388152, term388152.getClass(), "second", (byte) 24);
        setIntField(term388152, term388152.getClass(), "nano", 548005000);
        setField(term388147, term388147.getClass(), "time", term388152);
        setField(term388024, term388024.getClass(), "commonModuleSetTime", term388147);
        setField(term388024, term388024.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term388024, term388024.getClass(), "commonSkin", -1);
        setIntField(term388024, term388024.getClass(), "headphoneVolume", 100);
        setBooleanField(term388024, term388024.getClass(), "buttonSeOn", true);
        setIntField(term388024, term388024.getClass(), "buttonSeVolume", 100);
        setIntField(term388024, term388024.getClass(), "sliderSeVolume", 100);
        setIntField(term388024, term388024.getClass(), "buttonSe", -1);
        setIntField(term388024, term388024.getClass(), "chainSlideSe", -1);
        setIntField(term388024, term388024.getClass(), "slideSe", -1);
        setIntField(term388024, term388024.getClass(), "sliderTouchSe", -1);
        setField(term388024, term388024.getClass(), "sortMode", enum879);
        setIntField(term388024, term388024.getClass(), "nextPvId", -1);
        setField(term388024, term388024.getClass(), "nextDifficulty", enum880);
        setField(term388024, term388024.getClass(), "nextEdition", enum881);
        setBooleanField(term388024, term388024.getClass(), "showInterimRanking", true);
        setBooleanField(term388024, term388024.getClass(), "showClearStatus", true);
        setBooleanField(term388024, term388024.getClass(), "showGreatBorder", true);
        setBooleanField(term388024, term388024.getClass(), "showExcellentBorder", true);
        setBooleanField(term388024, term388024.getClass(), "showRivalBorder", true);
        setBooleanField(term388024, term388024.getClass(), "showRgoSetting", true);
        setBooleanField(term388024, term388024.getClass(), "contestNowPlayingEnable", true);
        setIntField(term388024, term388024.getClass(), "contestNowPlayingId", -1);
        setIntField(term388024, term388024.getClass(), "contestNowPlayingValue", -1);
        setField(term388024, term388024.getClass(), "contestNowPlayingResultRank", enum882);
        setField(term388024, term388024.getClass(), "contestNowPlayingSpecifier", "");
        setField(term388024, term388024.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term388024, term388024.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term388024, term388024.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term388024, term388024.getClass(), "rivalPdId", -1);
        setField(term388021, term388021.getClass(), "pdId", term388024);
        setField(term388021, term388021.getClass(), "startMode", enum883);
        setIntField(term388643, term388643.getClass(), "year", 2012);
        setShortField(term388643, term388643.getClass(), "month", (short) 2);
        setShortField(term388643, term388643.getClass(), "day", (short) 29);
        setField(term388642, term388642.getClass(), "date", term388643);
        setByteField(term388647, term388647.getClass(), "hour", (byte) 14);
        setByteField(term388647, term388647.getClass(), "minute", (byte) 26);
        setByteField(term388647, term388647.getClass(), "second", (byte) 20);
        setIntField(term388647, term388647.getClass(), "nano", 780823452);
        setField(term388642, term388642.getClass(), "time", term388647);
        setField(term388021, term388021.getClass(), "startTime", term388642);
        setIntField(term388653, term388653.getClass(), "year", 2029);
        setShortField(term388653, term388653.getClass(), "month", (short) 7);
        setShortField(term388653, term388653.getClass(), "day", (short) 19);
        setField(term388652, term388652.getClass(), "date", term388653);
        setByteField(term388657, term388657.getClass(), "hour", (byte) 17);
        setByteField(term388657, term388657.getClass(), "minute", (byte) 37);
        setByteField(term388657, term388657.getClass(), "second", (byte) 21);
        setIntField(term388657, term388657.getClass(), "nano", 320093277);
        setField(term388652, term388652.getClass(), "time", term388657);
        setField(term388021, term388021.getClass(), "lastUpdateTime", term388652);
        setField(term388021, term388021.getClass(), "stageIndex", term388662);
        setField(term388021, term388021.getClass(), "stageResultIndex", term388664);
        setField(term388021, term388021.getClass(), "lastPvId", term388666);
        setField(term388021, term388021.getClass(), "levelNumber", term388668);
        setField(term388021, term388021.getClass(), "levelExp", term388670);
        setField(term388021, term388021.getClass(), "oldLevelNumber", term388672);
        setField(term388021, term388021.getClass(), "oldLevelExp", term388674);
        setField(term388021, term388021.getClass(), "vp", term388676);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLevelExp", argTypes, term388021, args);
    }

};


