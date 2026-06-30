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

public class GameSession_equals_161230093429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term439404;
     Object term440066;

    public GameSession_equals_161230093429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term440074 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term440073 = ((Class) term440074).getDeclaredField((String) "MISS");
        ((Field) term440073).setAccessible(true);
        Object enum987 = ((Field) term440073).get((Object) null);
        Class<? extends Object> term440451 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term440450 = ((Class) term440451).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term440450).setAccessible(true);
        Object enum988 = ((Field) term440450).get((Object) null);
        Class<? extends Object> term440734 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term440733 = ((Class) term440734).getDeclaredField((String) "NORMAL");
        ((Field) term440733).setAccessible(true);
        Object enum989 = ((Field) term440733).get((Object) null);
        Class<? extends Object> term441009 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term441008 = ((Class) term441009).getDeclaredField((String) "ORIGINAL");
        ((Field) term441008).setAccessible(true);
        Object enum990 = ((Field) term441008).get((Object) null);
        Class<? extends Object> term441275 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term441274 = ((Class) term441275).getDeclaredField((String) "NONE");
        ((Field) term441274).setAccessible(true);
        Object enum991 = ((Field) term441274).get((Object) null);
        Class<? extends Object> term441916 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.StartMode");
        Field term441915 = ((Class) term441916).getDeclaredField((String) "CARD_PROCEDURE");
        ((Field) term441915).setAccessible(true);
        Object enum992 = ((Field) term441915).get((Object) null);
        Integer term440050 = new Integer(1320570890);
        Integer term440052 = new Integer(-130649791);
        Integer term440054 = new Integer(534834644);
        Integer term440056 = new Integer(1959097203);
        Integer term440058 = new Integer(-209654048);
        Integer term440060 = new Integer(477625804);
        Integer term440062 = new Integer(252575029);
        Integer term440064 = new Integer(57189932);
        term439404 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession"));
        Object term439407 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term439530 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term439531 = newInstance(Class.forName("java.time.LocalDate"));
        Object term439535 = newInstance(Class.forName("java.time.LocalTime"));
        Object term440030 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term440031 = newInstance(Class.forName("java.time.LocalDate"));
        Object term440035 = newInstance(Class.forName("java.time.LocalTime"));
        Object term440040 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term440041 = newInstance(Class.forName("java.time.LocalDate"));
        Object term440045 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term439404, term439404.getClass(), "id", -5460517064177800852L);
        setIntField(term439404, term439404.getClass(), "acceptId", 183857482);
        setLongField(term439407, term439407.getClass(), "id", -5242567610844514867L);
        setIntField(term439407, term439407.getClass(), "pdId", -1845135476);
        setField(term439407, term439407.getClass(), "playerName", "xxx");
        setIntField(term439407, term439407.getClass(), "vocaloidPoints", 300);
        setIntField(term439407, term439407.getClass(), "level", 1);
        setIntField(term439407, term439407.getClass(), "levelExp", -811321521);
        setField(term439407, term439407.getClass(), "levelTitle", "xxx");
        setIntField(term439407, term439407.getClass(), "plateId", -1);
        setIntField(term439407, term439407.getClass(), "plateEffectId", -1);
        setField(term439407, term439407.getClass(), "passwordStatus", enum987);
        setField(term439407, term439407.getClass(), "password", "**********");
        setBooleanField(term439407, term439407.getClass(), "preferPerPvModule", true);
        setBooleanField(term439407, term439407.getClass(), "preferCommonModule", false);
        setBooleanField(term439407, term439407.getClass(), "usePerPvSkin", false);
        setBooleanField(term439407, term439407.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term439407, term439407.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term439407, term439407.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term439407, term439407.getClass(), "usePerPvTouchSliderSe", false);
        setField(term439407, term439407.getClass(), "commonModule", "-999,-999,-999");
        setField(term439407, term439407.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term439531, term439531.getClass(), "year", 2026);
        setShortField(term439531, term439531.getClass(), "month", (short) 6);
        setShortField(term439531, term439531.getClass(), "day", (short) 29);
        setField(term439530, term439530.getClass(), "date", term439531);
        setByteField(term439535, term439535.getClass(), "hour", (byte) 4);
        setByteField(term439535, term439535.getClass(), "minute", (byte) 28);
        setByteField(term439535, term439535.getClass(), "second", (byte) 14);
        setIntField(term439535, term439535.getClass(), "nano", 150386000);
        setField(term439530, term439530.getClass(), "time", term439535);
        setField(term439407, term439407.getClass(), "commonModuleSetTime", term439530);
        setField(term439407, term439407.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term439407, term439407.getClass(), "commonSkin", -1);
        setIntField(term439407, term439407.getClass(), "headphoneVolume", 100);
        setBooleanField(term439407, term439407.getClass(), "buttonSeOn", true);
        setIntField(term439407, term439407.getClass(), "buttonSeVolume", 100);
        setIntField(term439407, term439407.getClass(), "sliderSeVolume", 100);
        setIntField(term439407, term439407.getClass(), "buttonSe", -1);
        setIntField(term439407, term439407.getClass(), "chainSlideSe", -1);
        setIntField(term439407, term439407.getClass(), "slideSe", -1);
        setIntField(term439407, term439407.getClass(), "sliderTouchSe", -1);
        setField(term439407, term439407.getClass(), "sortMode", enum988);
        setIntField(term439407, term439407.getClass(), "nextPvId", -1);
        setField(term439407, term439407.getClass(), "nextDifficulty", enum989);
        setField(term439407, term439407.getClass(), "nextEdition", enum990);
        setBooleanField(term439407, term439407.getClass(), "showInterimRanking", true);
        setBooleanField(term439407, term439407.getClass(), "showClearStatus", true);
        setBooleanField(term439407, term439407.getClass(), "showGreatBorder", true);
        setBooleanField(term439407, term439407.getClass(), "showExcellentBorder", true);
        setBooleanField(term439407, term439407.getClass(), "showRivalBorder", true);
        setBooleanField(term439407, term439407.getClass(), "showRgoSetting", true);
        setBooleanField(term439407, term439407.getClass(), "contestNowPlayingEnable", true);
        setIntField(term439407, term439407.getClass(), "contestNowPlayingId", -1);
        setIntField(term439407, term439407.getClass(), "contestNowPlayingValue", -1);
        setField(term439407, term439407.getClass(), "contestNowPlayingResultRank", enum991);
        setField(term439407, term439407.getClass(), "contestNowPlayingSpecifier", "");
        setField(term439407, term439407.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term439407, term439407.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term439407, term439407.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term439407, term439407.getClass(), "rivalPdId", -1);
        setField(term439404, term439404.getClass(), "pdId", term439407);
        setField(term439404, term439404.getClass(), "startMode", enum992);
        setIntField(term440031, term440031.getClass(), "year", 2022);
        setShortField(term440031, term440031.getClass(), "month", (short) 3);
        setShortField(term440031, term440031.getClass(), "day", (short) 16);
        setField(term440030, term440030.getClass(), "date", term440031);
        setByteField(term440035, term440035.getClass(), "hour", (byte) 16);
        setByteField(term440035, term440035.getClass(), "minute", (byte) 35);
        setByteField(term440035, term440035.getClass(), "second", (byte) 38);
        setIntField(term440035, term440035.getClass(), "nano", 79329968);
        setField(term440030, term440030.getClass(), "time", term440035);
        setField(term439404, term439404.getClass(), "startTime", term440030);
        setIntField(term440041, term440041.getClass(), "year", 2018);
        setShortField(term440041, term440041.getClass(), "month", (short) 9);
        setShortField(term440041, term440041.getClass(), "day", (short) 3);
        setField(term440040, term440040.getClass(), "date", term440041);
        setByteField(term440045, term440045.getClass(), "hour", (byte) 16);
        setByteField(term440045, term440045.getClass(), "minute", (byte) 48);
        setByteField(term440045, term440045.getClass(), "second", (byte) 45);
        setIntField(term440045, term440045.getClass(), "nano", 919694917);
        setField(term440040, term440040.getClass(), "time", term440045);
        setField(term439404, term439404.getClass(), "lastUpdateTime", term440040);
        setField(term439404, term439404.getClass(), "stageIndex", term440050);
        setField(term439404, term439404.getClass(), "stageResultIndex", term440052);
        setField(term439404, term439404.getClass(), "lastPvId", term440054);
        setField(term439404, term439404.getClass(), "levelNumber", term440056);
        setField(term439404, term439404.getClass(), "levelExp", term440058);
        setField(term439404, term439404.getClass(), "oldLevelNumber", term440060);
        setField(term439404, term439404.getClass(), "oldLevelExp", term440062);
        setField(term439404, term439404.getClass(), "vp", term440064);
        term440066 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term440066;
        callMethod(klass, "equals", argTypes, term439404, args);
    }

};


