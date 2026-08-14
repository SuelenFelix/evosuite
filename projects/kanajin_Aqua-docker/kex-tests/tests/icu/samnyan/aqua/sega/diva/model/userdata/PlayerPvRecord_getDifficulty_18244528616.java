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

public class PlayerPvRecord_getDifficulty_18244528616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term579762;

    public PlayerPvRecord_getDifficulty_18244528616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term580420 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term580419 = ((Class) term580420).getDeclaredField((String) "MISS");
        ((Field) term580419).setAccessible(true);
        Object enum1268 = ((Field) term580419).get((Object) null);
        Class<? extends Object> term580797 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term580796 = ((Class) term580797).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term580796).setAccessible(true);
        Object enum1269 = ((Field) term580796).get((Object) null);
        Class<? extends Object> term581080 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term581079 = ((Class) term581080).getDeclaredField((String) "NORMAL");
        ((Field) term581079).setAccessible(true);
        Object enum1270 = ((Field) term581079).get((Object) null);
        Class<? extends Object> term581355 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term581354 = ((Class) term581355).getDeclaredField((String) "ORIGINAL");
        ((Field) term581354).setAccessible(true);
        Object enum1271 = ((Field) term581354).get((Object) null);
        Class<? extends Object> term581621 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term581620 = ((Class) term581621).getDeclaredField((String) "NONE");
        ((Field) term581620).setAccessible(true);
        Object enum1272 = ((Field) term581620).get((Object) null);
        Class<? extends Object> term582262 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term582261 = ((Class) term582262).getDeclaredField((String) "NO_CLEAR");
        ((Field) term582261).setAccessible(true);
        Object enum1273 = ((Field) term582261).get((Object) null);
        Class<? extends Object> term582548 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term582547 = ((Class) term582548).getDeclaredField((String) "UNDEFINED");
        ((Field) term582547).setAccessible(true);
        Object enum1274 = ((Field) term582547).get((Object) null);
        term579762 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvRecord"));
        Object term579764 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term579887 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term579888 = newInstance(Class.forName("java.time.LocalDate"));
        Object term579892 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term579762, term579762.getClass(), "id", -5587528177305224828L);
        setLongField(term579764, term579764.getClass(), "id", 7950532649535587877L);
        setIntField(term579764, term579764.getClass(), "pdId", 1765728316);
        setField(term579764, term579764.getClass(), "playerName", "xxx");
        setIntField(term579764, term579764.getClass(), "vocaloidPoints", 300);
        setIntField(term579764, term579764.getClass(), "level", 1);
        setIntField(term579764, term579764.getClass(), "levelExp", -1459041031);
        setField(term579764, term579764.getClass(), "levelTitle", "xxx");
        setIntField(term579764, term579764.getClass(), "plateId", -1);
        setIntField(term579764, term579764.getClass(), "plateEffectId", -1);
        setField(term579764, term579764.getClass(), "passwordStatus", enum1268);
        setField(term579764, term579764.getClass(), "password", "**********");
        setBooleanField(term579764, term579764.getClass(), "preferPerPvModule", true);
        setBooleanField(term579764, term579764.getClass(), "preferCommonModule", true);
        setBooleanField(term579764, term579764.getClass(), "usePerPvSkin", false);
        setBooleanField(term579764, term579764.getClass(), "usePerPvButtonSe", true);
        setBooleanField(term579764, term579764.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term579764, term579764.getClass(), "usePerPvChainSliderSe", true);
        setBooleanField(term579764, term579764.getClass(), "usePerPvTouchSliderSe", false);
        setField(term579764, term579764.getClass(), "commonModule", "-999,-999,-999");
        setField(term579764, term579764.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term579888, term579888.getClass(), "year", 2026);
        setShortField(term579888, term579888.getClass(), "month", (short) 8);
        setShortField(term579888, term579888.getClass(), "day", (short) 12);
        setField(term579887, term579887.getClass(), "date", term579888);
        setByteField(term579892, term579892.getClass(), "hour", (byte) 2);
        setByteField(term579892, term579892.getClass(), "minute", (byte) 4);
        setByteField(term579892, term579892.getClass(), "second", (byte) 2);
        setIntField(term579892, term579892.getClass(), "nano", 933389000);
        setField(term579887, term579887.getClass(), "time", term579892);
        setField(term579764, term579764.getClass(), "commonModuleSetTime", term579887);
        setField(term579764, term579764.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term579764, term579764.getClass(), "commonSkin", -1);
        setIntField(term579764, term579764.getClass(), "headphoneVolume", 100);
        setBooleanField(term579764, term579764.getClass(), "buttonSeOn", true);
        setIntField(term579764, term579764.getClass(), "buttonSeVolume", 100);
        setIntField(term579764, term579764.getClass(), "sliderSeVolume", 100);
        setIntField(term579764, term579764.getClass(), "buttonSe", -1);
        setIntField(term579764, term579764.getClass(), "chainSlideSe", -1);
        setIntField(term579764, term579764.getClass(), "slideSe", -1);
        setIntField(term579764, term579764.getClass(), "sliderTouchSe", -1);
        setField(term579764, term579764.getClass(), "sortMode", enum1269);
        setIntField(term579764, term579764.getClass(), "nextPvId", -1);
        setField(term579764, term579764.getClass(), "nextDifficulty", enum1270);
        setField(term579764, term579764.getClass(), "nextEdition", enum1271);
        setBooleanField(term579764, term579764.getClass(), "showInterimRanking", true);
        setBooleanField(term579764, term579764.getClass(), "showClearStatus", true);
        setBooleanField(term579764, term579764.getClass(), "showGreatBorder", true);
        setBooleanField(term579764, term579764.getClass(), "showExcellentBorder", true);
        setBooleanField(term579764, term579764.getClass(), "showRivalBorder", true);
        setBooleanField(term579764, term579764.getClass(), "showRgoSetting", true);
        setBooleanField(term579764, term579764.getClass(), "contestNowPlayingEnable", true);
        setIntField(term579764, term579764.getClass(), "contestNowPlayingId", -1);
        setIntField(term579764, term579764.getClass(), "contestNowPlayingValue", -1);
        setField(term579764, term579764.getClass(), "contestNowPlayingResultRank", enum1272);
        setField(term579764, term579764.getClass(), "contestNowPlayingSpecifier", "");
        setField(term579764, term579764.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term579764, term579764.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term579764, term579764.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term579764, term579764.getClass(), "rivalPdId", -1);
        setField(term579762, term579762.getClass(), "pdId", term579764);
        setIntField(term579762, term579762.getClass(), "pvId", -1);
        setField(term579762, term579762.getClass(), "edition", enum1271);
        setField(term579762, term579762.getClass(), "difficulty", enum1270);
        setField(term579762, term579762.getClass(), "result", enum1273);
        setIntField(term579762, term579762.getClass(), "maxScore", -1);
        setIntField(term579762, term579762.getClass(), "maxAttain", -1);
        setField(term579762, term579762.getClass(), "challengeKind", enum1274);
        setField(term579762, term579762.getClass(), "rgoPurchased", "0,0,0");
        setField(term579762, term579762.getClass(), "rgoPlayed", "0,0,0");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvRecord");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDifficulty", argTypes, term579762, args);
    }

};


