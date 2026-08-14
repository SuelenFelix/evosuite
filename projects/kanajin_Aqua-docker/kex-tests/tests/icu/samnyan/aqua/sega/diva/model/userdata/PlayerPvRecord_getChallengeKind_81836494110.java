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

public class PlayerPvRecord_getChallengeKind_81836494110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term592138;

    public PlayerPvRecord_getChallengeKind_81836494110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term592796 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term592795 = ((Class) term592796).getDeclaredField((String) "MISS");
        ((Field) term592795).setAccessible(true);
        Object enum1296 = ((Field) term592795).get((Object) null);
        Class<? extends Object> term593173 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term593172 = ((Class) term593173).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term593172).setAccessible(true);
        Object enum1297 = ((Field) term593172).get((Object) null);
        Class<? extends Object> term593456 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term593455 = ((Class) term593456).getDeclaredField((String) "NORMAL");
        ((Field) term593455).setAccessible(true);
        Object enum1298 = ((Field) term593455).get((Object) null);
        Class<? extends Object> term593731 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term593730 = ((Class) term593731).getDeclaredField((String) "ORIGINAL");
        ((Field) term593730).setAccessible(true);
        Object enum1299 = ((Field) term593730).get((Object) null);
        Class<? extends Object> term593997 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term593996 = ((Class) term593997).getDeclaredField((String) "NONE");
        ((Field) term593996).setAccessible(true);
        Object enum1300 = ((Field) term593996).get((Object) null);
        Class<? extends Object> term594638 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term594637 = ((Class) term594638).getDeclaredField((String) "NO_CLEAR");
        ((Field) term594637).setAccessible(true);
        Object enum1301 = ((Field) term594637).get((Object) null);
        Class<? extends Object> term594924 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term594923 = ((Class) term594924).getDeclaredField((String) "UNDEFINED");
        ((Field) term594923).setAccessible(true);
        Object enum1302 = ((Field) term594923).get((Object) null);
        term592138 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvRecord"));
        Object term592140 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term592263 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term592264 = newInstance(Class.forName("java.time.LocalDate"));
        Object term592268 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term592138, term592138.getClass(), "id", -8306611953768020559L);
        setLongField(term592140, term592140.getClass(), "id", -8692119547314358088L);
        setIntField(term592140, term592140.getClass(), "pdId", -160995016);
        setField(term592140, term592140.getClass(), "playerName", "xxx");
        setIntField(term592140, term592140.getClass(), "vocaloidPoints", 300);
        setIntField(term592140, term592140.getClass(), "level", 1);
        setIntField(term592140, term592140.getClass(), "levelExp", -849730731);
        setField(term592140, term592140.getClass(), "levelTitle", "xxx");
        setIntField(term592140, term592140.getClass(), "plateId", -1);
        setIntField(term592140, term592140.getClass(), "plateEffectId", -1);
        setField(term592140, term592140.getClass(), "passwordStatus", enum1296);
        setField(term592140, term592140.getClass(), "password", "**********");
        setBooleanField(term592140, term592140.getClass(), "preferPerPvModule", true);
        setBooleanField(term592140, term592140.getClass(), "preferCommonModule", true);
        setBooleanField(term592140, term592140.getClass(), "usePerPvSkin", true);
        setBooleanField(term592140, term592140.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term592140, term592140.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term592140, term592140.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term592140, term592140.getClass(), "usePerPvTouchSliderSe", true);
        setField(term592140, term592140.getClass(), "commonModule", "-999,-999,-999");
        setField(term592140, term592140.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term592264, term592264.getClass(), "year", 2026);
        setShortField(term592264, term592264.getClass(), "month", (short) 8);
        setShortField(term592264, term592264.getClass(), "day", (short) 12);
        setField(term592263, term592263.getClass(), "date", term592264);
        setByteField(term592268, term592268.getClass(), "hour", (byte) 2);
        setByteField(term592268, term592268.getClass(), "minute", (byte) 4);
        setByteField(term592268, term592268.getClass(), "second", (byte) 3);
        setIntField(term592268, term592268.getClass(), "nano", 936395000);
        setField(term592263, term592263.getClass(), "time", term592268);
        setField(term592140, term592140.getClass(), "commonModuleSetTime", term592263);
        setField(term592140, term592140.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term592140, term592140.getClass(), "commonSkin", -1);
        setIntField(term592140, term592140.getClass(), "headphoneVolume", 100);
        setBooleanField(term592140, term592140.getClass(), "buttonSeOn", true);
        setIntField(term592140, term592140.getClass(), "buttonSeVolume", 100);
        setIntField(term592140, term592140.getClass(), "sliderSeVolume", 100);
        setIntField(term592140, term592140.getClass(), "buttonSe", -1);
        setIntField(term592140, term592140.getClass(), "chainSlideSe", -1);
        setIntField(term592140, term592140.getClass(), "slideSe", -1);
        setIntField(term592140, term592140.getClass(), "sliderTouchSe", -1);
        setField(term592140, term592140.getClass(), "sortMode", enum1297);
        setIntField(term592140, term592140.getClass(), "nextPvId", -1);
        setField(term592140, term592140.getClass(), "nextDifficulty", enum1298);
        setField(term592140, term592140.getClass(), "nextEdition", enum1299);
        setBooleanField(term592140, term592140.getClass(), "showInterimRanking", true);
        setBooleanField(term592140, term592140.getClass(), "showClearStatus", true);
        setBooleanField(term592140, term592140.getClass(), "showGreatBorder", true);
        setBooleanField(term592140, term592140.getClass(), "showExcellentBorder", true);
        setBooleanField(term592140, term592140.getClass(), "showRivalBorder", true);
        setBooleanField(term592140, term592140.getClass(), "showRgoSetting", true);
        setBooleanField(term592140, term592140.getClass(), "contestNowPlayingEnable", false);
        setIntField(term592140, term592140.getClass(), "contestNowPlayingId", -1);
        setIntField(term592140, term592140.getClass(), "contestNowPlayingValue", -1);
        setField(term592140, term592140.getClass(), "contestNowPlayingResultRank", enum1300);
        setField(term592140, term592140.getClass(), "contestNowPlayingSpecifier", "");
        setField(term592140, term592140.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term592140, term592140.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term592140, term592140.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term592140, term592140.getClass(), "rivalPdId", -1);
        setField(term592138, term592138.getClass(), "pdId", term592140);
        setIntField(term592138, term592138.getClass(), "pvId", -1);
        setField(term592138, term592138.getClass(), "edition", enum1299);
        setField(term592138, term592138.getClass(), "difficulty", enum1298);
        setField(term592138, term592138.getClass(), "result", enum1301);
        setIntField(term592138, term592138.getClass(), "maxScore", -1);
        setIntField(term592138, term592138.getClass(), "maxAttain", -1);
        setField(term592138, term592138.getClass(), "challengeKind", enum1302);
        setField(term592138, term592138.getClass(), "rgoPurchased", "0,0,0");
        setField(term592138, term592138.getClass(), "rgoPlayed", "0,0,0");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvRecord");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getChallengeKind", argTypes, term592138, args);
    }

};


