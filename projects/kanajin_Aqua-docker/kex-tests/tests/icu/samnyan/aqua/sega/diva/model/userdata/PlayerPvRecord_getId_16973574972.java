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

public class PlayerPvRecord_getId_16973574972 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term567386;

    public PlayerPvRecord_getId_16973574972() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term568044 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term568043 = ((Class) term568044).getDeclaredField((String) "MISS");
        ((Field) term568043).setAccessible(true);
        Object enum1240 = ((Field) term568043).get((Object) null);
        Class<? extends Object> term568421 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term568420 = ((Class) term568421).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term568420).setAccessible(true);
        Object enum1241 = ((Field) term568420).get((Object) null);
        Class<? extends Object> term568704 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term568703 = ((Class) term568704).getDeclaredField((String) "NORMAL");
        ((Field) term568703).setAccessible(true);
        Object enum1242 = ((Field) term568703).get((Object) null);
        Class<? extends Object> term568979 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term568978 = ((Class) term568979).getDeclaredField((String) "ORIGINAL");
        ((Field) term568978).setAccessible(true);
        Object enum1243 = ((Field) term568978).get((Object) null);
        Class<? extends Object> term569245 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term569244 = ((Class) term569245).getDeclaredField((String) "NONE");
        ((Field) term569244).setAccessible(true);
        Object enum1244 = ((Field) term569244).get((Object) null);
        Class<? extends Object> term569886 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Field term569885 = ((Class) term569886).getDeclaredField((String) "NO_CLEAR");
        ((Field) term569885).setAccessible(true);
        Object enum1245 = ((Field) term569885).get((Object) null);
        Class<? extends Object> term570172 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ChallengeKind");
        Field term570171 = ((Class) term570172).getDeclaredField((String) "UNDEFINED");
        ((Field) term570171).setAccessible(true);
        Object enum1246 = ((Field) term570171).get((Object) null);
        term567386 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvRecord"));
        Object term567388 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        Object term567511 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term567512 = newInstance(Class.forName("java.time.LocalDate"));
        Object term567516 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term567386, term567386.getClass(), "id", 3472971833455746664L);
        setLongField(term567388, term567388.getClass(), "id", 3731931947533293029L);
        setIntField(term567388, term567388.getClass(), "pdId", 1661615099);
        setField(term567388, term567388.getClass(), "playerName", "xxx");
        setIntField(term567388, term567388.getClass(), "vocaloidPoints", 300);
        setIntField(term567388, term567388.getClass(), "level", 1);
        setIntField(term567388, term567388.getClass(), "levelExp", 1908136627);
        setField(term567388, term567388.getClass(), "levelTitle", "xxx");
        setIntField(term567388, term567388.getClass(), "plateId", -1);
        setIntField(term567388, term567388.getClass(), "plateEffectId", -1);
        setField(term567388, term567388.getClass(), "passwordStatus", enum1240);
        setField(term567388, term567388.getClass(), "password", "**********");
        setBooleanField(term567388, term567388.getClass(), "preferPerPvModule", true);
        setBooleanField(term567388, term567388.getClass(), "preferCommonModule", true);
        setBooleanField(term567388, term567388.getClass(), "usePerPvSkin", false);
        setBooleanField(term567388, term567388.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term567388, term567388.getClass(), "usePerPvSliderSe", true);
        setBooleanField(term567388, term567388.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term567388, term567388.getClass(), "usePerPvTouchSliderSe", false);
        setField(term567388, term567388.getClass(), "commonModule", "-999,-999,-999");
        setField(term567388, term567388.getClass(), "commonCustomizeItems", "-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999,-999");
        setIntField(term567512, term567512.getClass(), "year", 2026);
        setShortField(term567512, term567512.getClass(), "month", (short) 6);
        setShortField(term567512, term567512.getClass(), "day", (short) 29);
        setField(term567511, term567511.getClass(), "date", term567512);
        setByteField(term567516, term567516.getClass(), "hour", (byte) 4);
        setByteField(term567516, term567516.getClass(), "minute", (byte) 28);
        setByteField(term567516, term567516.getClass(), "second", (byte) 47);
        setIntField(term567516, term567516.getClass(), "nano", 962061000);
        setField(term567511, term567511.getClass(), "time", term567516);
        setField(term567388, term567388.getClass(), "commonModuleSetTime", term567511);
        setField(term567388, term567388.getClass(), "moduleSelectItemFlag", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term567388, term567388.getClass(), "commonSkin", -1);
        setIntField(term567388, term567388.getClass(), "headphoneVolume", 100);
        setBooleanField(term567388, term567388.getClass(), "buttonSeOn", true);
        setIntField(term567388, term567388.getClass(), "buttonSeVolume", 100);
        setIntField(term567388, term567388.getClass(), "sliderSeVolume", 100);
        setIntField(term567388, term567388.getClass(), "buttonSe", -1);
        setIntField(term567388, term567388.getClass(), "chainSlideSe", -1);
        setIntField(term567388, term567388.getClass(), "slideSe", -1);
        setIntField(term567388, term567388.getClass(), "sliderTouchSe", -1);
        setField(term567388, term567388.getClass(), "sortMode", enum1241);
        setIntField(term567388, term567388.getClass(), "nextPvId", -1);
        setField(term567388, term567388.getClass(), "nextDifficulty", enum1242);
        setField(term567388, term567388.getClass(), "nextEdition", enum1243);
        setBooleanField(term567388, term567388.getClass(), "showInterimRanking", true);
        setBooleanField(term567388, term567388.getClass(), "showClearStatus", true);
        setBooleanField(term567388, term567388.getClass(), "showGreatBorder", true);
        setBooleanField(term567388, term567388.getClass(), "showExcellentBorder", true);
        setBooleanField(term567388, term567388.getClass(), "showRivalBorder", true);
        setBooleanField(term567388, term567388.getClass(), "showRgoSetting", true);
        setBooleanField(term567388, term567388.getClass(), "contestNowPlayingEnable", false);
        setIntField(term567388, term567388.getClass(), "contestNowPlayingId", -1);
        setIntField(term567388, term567388.getClass(), "contestNowPlayingValue", -1);
        setField(term567388, term567388.getClass(), "contestNowPlayingResultRank", enum1244);
        setField(term567388, term567388.getClass(), "contestNowPlayingSpecifier", "");
        setField(term567388, term567388.getClass(), "myList0", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term567388, term567388.getClass(), "myList1", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setField(term567388, term567388.getClass(), "myList2", "-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1");
        setIntField(term567388, term567388.getClass(), "rivalPdId", -1);
        setField(term567386, term567386.getClass(), "pdId", term567388);
        setIntField(term567386, term567386.getClass(), "pvId", -1);
        setField(term567386, term567386.getClass(), "edition", enum1243);
        setField(term567386, term567386.getClass(), "difficulty", enum1242);
        setField(term567386, term567386.getClass(), "result", enum1245);
        setIntField(term567386, term567386.getClass(), "maxScore", -1);
        setIntField(term567386, term567386.getClass(), "maxAttain", -1);
        setField(term567386, term567386.getClass(), "challengeKind", enum1246);
        setField(term567386, term567386.getClass(), "rgoPurchased", "0,0,0");
        setField(term567386, term567386.getClass(), "rgoPlayed", "0,0,0");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerPvRecord");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term567386, args);
    }

};


