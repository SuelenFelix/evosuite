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

public class GameSession_getStartMode_21375768274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term368545;

    public GameSession_getStartMode_21375768274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term369209 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term369208 = ((Class) term369209).getDeclaredField((String) "MISS");
        ((Field) term369208).setAccessible(true);
        Object enum836 = ((Field) term369208).get((Object) null);
        Class<? extends Object> term369586 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term369585 = ((Class) term369586).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term369585).setAccessible(true);
        Object enum837 = ((Field) term369585).get((Object) null);
        Class<? extends Object> term369869 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term369868 = ((Class) term369869).getDeclaredField((String) "NORMAL");
        ((Field) term369868).setAccessible(true);
        Object enum838 = ((Field) term369868).get((Object) null);
        Class<? extends Object> term370144 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term370143 = ((Class) term370144).getDeclaredField((String) "ORIGINAL");
        ((Field) term370143).setAccessible(true);
        Object enum839 = ((Field) term370143).get((Object) null);
        Class<? extends Object> term370410 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term370409 = ((Class) term370410).getDeclaredField((String) "NONE");
        ((Field) term370409).setAccessible(true);
        Object enum840 = ((Field) term370409).get((Object) null);
        Class<? extends Object> term371051 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.StartMode");
        Field term371050 = ((Class) term371051).getDeclaredField((String) "PRE_START");
        ((Field) term371050).setAccessible(true);
        Object enum841 = ((Field) term371050).get((Object) null);
        Integer term369186 = new Integer(-73683645);
        Integer term369188 = new Integer(-226514366);
        Integer term369190 = new Integer(1193880199);
        Integer term369192 = new Integer(-1087774327);
        Integer term369194 = new Integer(-1530420153);
        Integer term369196 = new Integer(-469968304);
        Integer term369198 = new Integer(-1145578966);
        Integer term369200 = new Integer(679763016);
        term368545 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession"));
        Object term368548 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term368671 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term368672 = newInstance(Class.forName("java.time.LocalDate"));
        Object term368676 = newInstance(Class.forName("java.time.LocalTime"));
        Object term369166 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term369167 = newInstance(Class.forName("java.time.LocalDate"));
        Object term369171 = newInstance(Class.forName("java.time.LocalTime"));
        Object term369176 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term369177 = newInstance(Class.forName("java.time.LocalDate"));
        Object term369181 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term368545, term368545.getClass(), "id", 5904678961906211249L);
        setIntField(term368545, term368545.getClass(), "acceptId", -477520795);
        setLongField(term368548, term368548.getClass(), "id", -1820639665251914495L);
        setIntField(term368548, term368548.getClass(), "pdId", -480468995);
        setField(term368548, term368548.getClass(), "playerName", "xxx");
        setIntField(term368548, term368548.getClass(), "vocaloidPoints", 300);
        setIntField(term368548, term368548.getClass(), "level", 1);
        setIntField(term368548, term368548.getClass(), "levelExp", -2037695985);
        setField(term368548, term368548.getClass(), "levelTitle", "xxx");
        setIntField(term368548, term368548.getClass(), "plateId", -1);
        setIntField(term368548, term368548.getClass(), "plateEffectId", -1);
        setField(term368548, term368548.getClass(), "passwordStatus", enum836);
        setField(term368548, term368548.getClass(), "password", "**********");
        setBooleanField(term368548, term368548.getClass(), "preferPerPvModule", true);
        setBooleanField(term368548, term368548.getClass(), "preferCommonModule", false);
        setBooleanField(term368548, term368548.getClass(), "usePerPvSkin", false);
        setBooleanField(term368548, term368548.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term368548, term368548.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term368548, term368548.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term368548, term368548.getClass(), "usePerPvTouchSliderSe", false);
        setField(term368548, term368548.getClass(), "commonModule", "-999,-999,-999");
        setField(term368548, term368548.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term368672, term368672.getClass(), "year", 2026);
        setShortField(term368672, term368672.getClass(), "month", (short) 6);
        setShortField(term368672, term368672.getClass(), "day", (short) 29);
        setField(term368671, term368671.getClass(), "date", term368672);
        setByteField(term368676, term368676.getClass(), "hour", (byte) 4);
        setByteField(term368676, term368676.getClass(), "minute", (byte) 28);
        setByteField(term368676, term368676.getClass(), "second", (byte) 7);
        setIntField(term368676, term368676.getClass(), "nano", 793188000);
        setField(term368671, term368671.getClass(), "time", term368676);
        setField(term368548, term368548.getClass(), "commonModuleSetTime", term368671);
        setField(term368548, term368548.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term368548, term368548.getClass(), "commonSkin", -1);
        setIntField(term368548, term368548.getClass(), "headphoneVolume", 100);
        setBooleanField(term368548, term368548.getClass(), "buttonSeOn", true);
        setIntField(term368548, term368548.getClass(), "buttonSeVolume", 100);
        setIntField(term368548, term368548.getClass(), "sliderSeVolume", 100);
        setIntField(term368548, term368548.getClass(), "buttonSe", -1);
        setIntField(term368548, term368548.getClass(), "chainSlideSe", -1);
        setIntField(term368548, term368548.getClass(), "slideSe", -1);
        setIntField(term368548, term368548.getClass(), "sliderTouchSe", -1);
        setField(term368548, term368548.getClass(), "sortMode", enum837);
        setIntField(term368548, term368548.getClass(), "nextPvId", -1);
        setField(term368548, term368548.getClass(), "nextDifficulty", enum838);
        setField(term368548, term368548.getClass(), "nextEdition", enum839);
        setBooleanField(term368548, term368548.getClass(), "showInterimRanking", true);
        setBooleanField(term368548, term368548.getClass(), "showClearStatus", true);
        setBooleanField(term368548, term368548.getClass(), "showGreatBorder", true);
        setBooleanField(term368548, term368548.getClass(), "showExcellentBorder", true);
        setBooleanField(term368548, term368548.getClass(), "showRivalBorder", true);
        setBooleanField(term368548, term368548.getClass(), "showRgoSetting", true);
        setBooleanField(term368548, term368548.getClass(), "contestNowPlayingEnable", true);
        setIntField(term368548, term368548.getClass(), "contestNowPlayingId", -1);
        setIntField(term368548, term368548.getClass(), "contestNowPlayingValue", -1);
        setField(term368548, term368548.getClass(), "contestNowPlayingResultRank", enum840);
        setField(term368548, term368548.getClass(), "contestNowPlayingSpecifier", "");
        setField(term368548, term368548.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term368548, term368548.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term368548, term368548.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term368548, term368548.getClass(), "rivalPdId", -1);
        setField(term368545, term368545.getClass(), "pdId", term368548);
        setField(term368545, term368545.getClass(), "startMode", enum841);
        setIntField(term369167, term369167.getClass(), "year", 2028);
        setShortField(term369167, term369167.getClass(), "month", (short) 5);
        setShortField(term369167, term369167.getClass(), "day", (short) 15);
        setField(term369166, term369166.getClass(), "date", term369167);
        setByteField(term369171, term369171.getClass(), "hour", (byte) 20);
        setByteField(term369171, term369171.getClass(), "minute", (byte) 31);
        setByteField(term369171, term369171.getClass(), "second", (byte) 49);
        setIntField(term369171, term369171.getClass(), "nano", 945744862);
        setField(term369166, term369166.getClass(), "time", term369171);
        setField(term368545, term368545.getClass(), "startTime", term369166);
        setIntField(term369177, term369177.getClass(), "year", 2016);
        setShortField(term369177, term369177.getClass(), "month", (short) 6);
        setShortField(term369177, term369177.getClass(), "day", (short) 23);
        setField(term369176, term369176.getClass(), "date", term369177);
        setByteField(term369181, term369181.getClass(), "hour", (byte) 20);
        setByteField(term369181, term369181.getClass(), "minute", (byte) 51);
        setByteField(term369181, term369181.getClass(), "second", (byte) 43);
        setIntField(term369181, term369181.getClass(), "nano", 284389409);
        setField(term369176, term369176.getClass(), "time", term369181);
        setField(term368545, term368545.getClass(), "lastUpdateTime", term369176);
        setField(term368545, term368545.getClass(), "stageIndex", term369186);
        setField(term368545, term368545.getClass(), "stageResultIndex", term369188);
        setField(term368545, term368545.getClass(), "lastPvId", term369190);
        setField(term368545, term368545.getClass(), "levelNumber", term369192);
        setField(term368545, term368545.getClass(), "levelExp", term369194);
        setField(term368545, term368545.getClass(), "oldLevelNumber", term369196);
        setField(term368545, term368545.getClass(), "oldLevelExp", term369198);
        setField(term368545, term368545.getClass(), "vp", term369200);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.GameSession");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStartMode", argTypes, term368545, args);
    }

};


