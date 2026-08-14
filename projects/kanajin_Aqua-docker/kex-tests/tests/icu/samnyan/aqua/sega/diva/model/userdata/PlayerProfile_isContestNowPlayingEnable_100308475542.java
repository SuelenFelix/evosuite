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

public class PlayerProfile_isContestNowPlayingEnable_100308475542 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term784183;

    public PlayerProfile_isContestNowPlayingEnable_100308475542() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term784795 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term784794 = ((Class) term784795).getDeclaredField((String) "MISS");
        ((Field) term784794).setAccessible(true);
        Object enum1697 = ((Field) term784794).get((Object) null);
        Class<? extends Object> term785172 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term785171 = ((Class) term785172).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term785171).setAccessible(true);
        Object enum1698 = ((Field) term785171).get((Object) null);
        Class<? extends Object> term785455 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term785454 = ((Class) term785455).getDeclaredField((String) "NORMAL");
        ((Field) term785454).setAccessible(true);
        Object enum1699 = ((Field) term785454).get((Object) null);
        Class<? extends Object> term785730 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term785729 = ((Class) term785730).getDeclaredField((String) "ORIGINAL");
        ((Field) term785729).setAccessible(true);
        Object enum1700 = ((Field) term785729).get((Object) null);
        Class<? extends Object> term785996 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term785995 = ((Class) term785996).getDeclaredField((String) "NONE");
        ((Field) term785995).setAccessible(true);
        Object enum1701 = ((Field) term785995).get((Object) null);
        term784183 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term784306 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term784307 = newInstance(Class.forName("java.time.LocalDate"));
        Object term784311 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term784183, term784183.getClass(), "id", 206360660645917003L);
        setIntField(term784183, term784183.getClass(), "pdId", 1819563159);
        setField(term784183, term784183.getClass(), "playerName", "xxx");
        setIntField(term784183, term784183.getClass(), "vocaloidPoints", 300);
        setIntField(term784183, term784183.getClass(), "level", 1);
        setIntField(term784183, term784183.getClass(), "levelExp", -131038479);
        setField(term784183, term784183.getClass(), "levelTitle", "xxx");
        setIntField(term784183, term784183.getClass(), "plateId", -1);
        setIntField(term784183, term784183.getClass(), "plateEffectId", -1);
        setField(term784183, term784183.getClass(), "passwordStatus", enum1697);
        setField(term784183, term784183.getClass(), "password", "**********");
        setBooleanField(term784183, term784183.getClass(), "preferPerPvModule", true);
        setBooleanField(term784183, term784183.getClass(), "preferCommonModule", true);
        setBooleanField(term784183, term784183.getClass(), "usePerPvSkin", false);
        setBooleanField(term784183, term784183.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term784183, term784183.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term784183, term784183.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term784183, term784183.getClass(), "usePerPvTouchSliderSe", false);
        setField(term784183, term784183.getClass(), "commonModule", "-999,-999,-999");
        setField(term784183, term784183.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term784307, term784307.getClass(), "year", 2026);
        setShortField(term784307, term784307.getClass(), "month", (short) 8);
        setShortField(term784307, term784307.getClass(), "day", (short) 12);
        setField(term784306, term784306.getClass(), "date", term784307);
        setByteField(term784311, term784311.getClass(), "hour", (byte) 2);
        setByteField(term784311, term784311.getClass(), "minute", (byte) 4);
        setByteField(term784311, term784311.getClass(), "second", (byte) 33);
        setIntField(term784311, term784311.getClass(), "nano", 370341000);
        setField(term784306, term784306.getClass(), "time", term784311);
        setField(term784183, term784183.getClass(), "commonModuleSetTime", term784306);
        setField(term784183, term784183.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term784183, term784183.getClass(), "commonSkin", -1);
        setIntField(term784183, term784183.getClass(), "headphoneVolume", 100);
        setBooleanField(term784183, term784183.getClass(), "buttonSeOn", true);
        setIntField(term784183, term784183.getClass(), "buttonSeVolume", 100);
        setIntField(term784183, term784183.getClass(), "sliderSeVolume", 100);
        setIntField(term784183, term784183.getClass(), "buttonSe", -1);
        setIntField(term784183, term784183.getClass(), "chainSlideSe", -1);
        setIntField(term784183, term784183.getClass(), "slideSe", -1);
        setIntField(term784183, term784183.getClass(), "sliderTouchSe", -1);
        setField(term784183, term784183.getClass(), "sortMode", enum1698);
        setIntField(term784183, term784183.getClass(), "nextPvId", -1);
        setField(term784183, term784183.getClass(), "nextDifficulty", enum1699);
        setField(term784183, term784183.getClass(), "nextEdition", enum1700);
        setBooleanField(term784183, term784183.getClass(), "showInterimRanking", true);
        setBooleanField(term784183, term784183.getClass(), "showClearStatus", true);
        setBooleanField(term784183, term784183.getClass(), "showGreatBorder", true);
        setBooleanField(term784183, term784183.getClass(), "showExcellentBorder", true);
        setBooleanField(term784183, term784183.getClass(), "showRivalBorder", true);
        setBooleanField(term784183, term784183.getClass(), "showRgoSetting", true);
        setBooleanField(term784183, term784183.getClass(), "contestNowPlayingEnable", true);
        setIntField(term784183, term784183.getClass(), "contestNowPlayingId", -1);
        setIntField(term784183, term784183.getClass(), "contestNowPlayingValue", -1);
        setField(term784183, term784183.getClass(), "contestNowPlayingResultRank", enum1701);
        setField(term784183, term784183.getClass(), "contestNowPlayingSpecifier", "");
        setField(term784183, term784183.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term784183, term784183.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term784183, term784183.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term784183, term784183.getClass(), "rivalPdId", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isContestNowPlayingEnable", argTypes, term784183, args);
    }

};


