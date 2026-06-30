package icu.samnyan.aqua.sega.chunithm.model.userdata;

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
import static icu.samnyan.aqua.sega.chunithm.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.lang.Integer;

public class UserActivity_setActivityId_146842589613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term297483;
     Object term297768;

    public UserActivity_setActivityId_146842589613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term297489 = new Long(-2413135395771470086L);
        term297483 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserActivity"));
        Object term297485 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term297487 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term297503 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term297504 = newInstance(Class.forName("java.time.LocalDate"));
        Object term297508 = newInstance(Class.forName("java.time.LocalTime"));
        Object term297513 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term297514 = newInstance(Class.forName("java.time.LocalDate"));
        Object term297518 = newInstance(Class.forName("java.time.LocalTime"));
        Object term297535 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term297536 = newInstance(Class.forName("java.time.LocalDate"));
        Object term297540 = newInstance(Class.forName("java.time.LocalTime"));
        Object term297596 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term297597 = newInstance(Class.forName("java.time.LocalDate"));
        Object term297601 = newInstance(Class.forName("java.time.LocalTime"));
        Object term297644 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term297645 = newInstance(Class.forName("java.time.LocalDate"));
        Object term297649 = newInstance(Class.forName("java.time.LocalTime"));
        Object term297690 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term297691 = newInstance(Class.forName("java.time.LocalDate"));
        Object term297695 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term297483, term297483.getClass(), "id", -6137121667863437060L);
        setLongField(term297485, term297485.getClass(), "id", 1286359190898506191L);
        setLongField(term297487, term297487.getClass(), "id", -5312401346821386938L);
        setField(term297487, term297487.getClass(), "extId", term297489);
        setField(term297487, term297487.getClass(), "luid", "HKZGEhlODe");
        setIntField(term297504, term297504.getClass(), "year", 2024);
        setShortField(term297504, term297504.getClass(), "month", (short) 5);
        setShortField(term297504, term297504.getClass(), "day", (short) 17);
        setField(term297503, term297503.getClass(), "date", term297504);
        setByteField(term297508, term297508.getClass(), "hour", (byte) 11);
        setByteField(term297508, term297508.getClass(), "minute", (byte) 19);
        setByteField(term297508, term297508.getClass(), "second", (byte) 49);
        setIntField(term297508, term297508.getClass(), "nano", 693971996);
        setField(term297503, term297503.getClass(), "time", term297508);
        setField(term297487, term297487.getClass(), "registerTime", term297503);
        setIntField(term297514, term297514.getClass(), "year", 2014);
        setShortField(term297514, term297514.getClass(), "month", (short) 9);
        setShortField(term297514, term297514.getClass(), "day", (short) 19);
        setField(term297513, term297513.getClass(), "date", term297514);
        setByteField(term297518, term297518.getClass(), "hour", (byte) 8);
        setByteField(term297518, term297518.getClass(), "minute", (byte) 31);
        setByteField(term297518, term297518.getClass(), "second", (byte) 16);
        setIntField(term297518, term297518.getClass(), "nano", 631074485);
        setField(term297513, term297513.getClass(), "time", term297518);
        setField(term297487, term297487.getClass(), "accessTime", term297513);
        setField(term297485, term297485.getClass(), "card", term297487);
        setField(term297485, term297485.getClass(), "userName", "Brehxsxqlu");
        setIntField(term297536, term297536.getClass(), "year", 2019);
        setShortField(term297536, term297536.getClass(), "month", (short) 12);
        setShortField(term297536, term297536.getClass(), "day", (short) 17);
        setField(term297535, term297535.getClass(), "date", term297536);
        setByteField(term297540, term297540.getClass(), "hour", (byte) 22);
        setByteField(term297540, term297540.getClass(), "minute", (byte) 12);
        setByteField(term297540, term297540.getClass(), "second", (byte) 32);
        setIntField(term297540, term297540.getClass(), "nano", 743212978);
        setField(term297535, term297535.getClass(), "time", term297540);
        setField(term297485, term297485.getClass(), "lastLoginDate", term297535);
        setBooleanField(term297485, term297485.getClass(), "isWebJoin", true);
        setField(term297485, term297485.getClass(), "webLimitDate", "YJjLEIFIXz");
        setIntField(term297485, term297485.getClass(), "level", 1728733629);
        setIntField(term297485, term297485.getClass(), "reincarnationNum", 1916491404);
        setField(term297485, term297485.getClass(), "exp", "EUOVVchCuH");
        setLongField(term297485, term297485.getClass(), "point", 9222544456917499892L);
        setLongField(term297485, term297485.getClass(), "totalPoint", -8055960422626625967L);
        setIntField(term297485, term297485.getClass(), "playCount", 1963930446);
        setIntField(term297485, term297485.getClass(), "multiPlayCount", -408302545);
        setIntField(term297485, term297485.getClass(), "multiWinCount", -1320522399);
        setIntField(term297485, term297485.getClass(), "requestResCount", 1941013481);
        setIntField(term297485, term297485.getClass(), "acceptResCount", 558340441);
        setIntField(term297485, term297485.getClass(), "successResCount", 1770611027);
        setIntField(term297485, term297485.getClass(), "playerRating", 334175541);
        setIntField(term297485, term297485.getClass(), "highestRating", 1841048082);
        setIntField(term297485, term297485.getClass(), "nameplateId", -57312033);
        setIntField(term297485, term297485.getClass(), "frameId", 1742098836);
        setIntField(term297485, term297485.getClass(), "characterId", 64098614);
        setIntField(term297485, term297485.getClass(), "trophyId", 1944053676);
        setIntField(term297485, term297485.getClass(), "playedTutorialBit", 783466223);
        setIntField(term297485, term297485.getClass(), "firstTutorialCancelNum", 5087099);
        setIntField(term297485, term297485.getClass(), "masterTutorialCancelNum", 637442694);
        setIntField(term297485, term297485.getClass(), "totalRepertoireCount", 1058907718);
        setIntField(term297485, term297485.getClass(), "totalMapNum", 1946590161);
        setLongField(term297485, term297485.getClass(), "totalHiScore", -1072612554039652494L);
        setLongField(term297485, term297485.getClass(), "totalBasicHighScore", 7891904308631684957L);
        setLongField(term297485, term297485.getClass(), "totalAdvancedHighScore", -5131124286038907802L);
        setLongField(term297485, term297485.getClass(), "totalExpertHighScore", -7758209801141975741L);
        setLongField(term297485, term297485.getClass(), "totalMasterHighScore", -2048122109769301584L);
        setIntField(term297597, term297597.getClass(), "year", 2026);
        setShortField(term297597, term297597.getClass(), "month", (short) 2);
        setShortField(term297597, term297597.getClass(), "day", (short) 2);
        setField(term297596, term297596.getClass(), "date", term297597);
        setByteField(term297601, term297601.getClass(), "hour", (byte) 14);
        setByteField(term297601, term297601.getClass(), "minute", (byte) 37);
        setByteField(term297601, term297601.getClass(), "second", (byte) 36);
        setIntField(term297601, term297601.getClass(), "nano", 416508190);
        setField(term297596, term297596.getClass(), "time", term297601);
        setField(term297485, term297485.getClass(), "eventWatchedDate", term297596);
        setIntField(term297485, term297485.getClass(), "friendCount", -663998937);
        setBooleanField(term297485, term297485.getClass(), "isMaimai", false);
        setField(term297485, term297485.getClass(), "firstGameId", "YBEjtwoXAa");
        setField(term297485, term297485.getClass(), "firstRomVersion", "hcUrfXxUyU");
        setField(term297485, term297485.getClass(), "firstDataVersion", "EbtBgsMrVm");
        setIntField(term297645, term297645.getClass(), "year", 2015);
        setShortField(term297645, term297645.getClass(), "month", (short) 11);
        setShortField(term297645, term297645.getClass(), "day", (short) 24);
        setField(term297644, term297644.getClass(), "date", term297645);
        setByteField(term297649, term297649.getClass(), "hour", (byte) 7);
        setByteField(term297649, term297649.getClass(), "minute", (byte) 58);
        setByteField(term297649, term297649.getClass(), "second", (byte) 28);
        setIntField(term297649, term297649.getClass(), "nano", 452636750);
        setField(term297644, term297644.getClass(), "time", term297649);
        setField(term297485, term297485.getClass(), "firstPlayDate", term297644);
        setField(term297485, term297485.getClass(), "lastGameId", "ReSzglHqbI");
        setField(term297485, term297485.getClass(), "lastRomVersion", "CfqOwyPntO");
        setField(term297485, term297485.getClass(), "lastDataVersion", "aGJpzsREQk");
        setIntField(term297691, term297691.getClass(), "year", 2012);
        setShortField(term297691, term297691.getClass(), "month", (short) 8);
        setShortField(term297691, term297691.getClass(), "day", (short) 27);
        setField(term297690, term297690.getClass(), "date", term297691);
        setByteField(term297695, term297695.getClass(), "hour", (byte) 23);
        setByteField(term297695, term297695.getClass(), "minute", (byte) 0);
        setByteField(term297695, term297695.getClass(), "second", (byte) 15);
        setIntField(term297695, term297695.getClass(), "nano", 215633483);
        setField(term297690, term297690.getClass(), "time", term297695);
        setField(term297485, term297485.getClass(), "lastPlayDate", term297690);
        setIntField(term297485, term297485.getClass(), "lastPlaceId", 672324332);
        setField(term297485, term297485.getClass(), "lastPlaceName", "yNmAFVlbsd");
        setField(term297485, term297485.getClass(), "lastRegionId", "OdpsFXVyHb");
        setField(term297485, term297485.getClass(), "lastRegionName", "nJYYTNCMan");
        setField(term297485, term297485.getClass(), "lastAllNetId", "kfOHuUkyPD");
        setField(term297485, term297485.getClass(), "lastClientId", "dPfJJGqFNX");
        setField(term297483, term297483.getClass(), "user", term297485);
        setIntField(term297483, term297483.getClass(), "kind", 696727230);
        setIntField(term297483, term297483.getClass(), "activityId", -1533142622);
        setIntField(term297483, term297483.getClass(), "sortNumber", 285134412);
        setIntField(term297483, term297483.getClass(), "param1", 1477109630);
        setIntField(term297483, term297483.getClass(), "param2", 1716965346);
        setIntField(term297483, term297483.getClass(), "param3", -1457239006);
        setIntField(term297483, term297483.getClass(), "param4", 3643262);
        term297768 = new Integer(1345774236);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserActivity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term297768;
        callMethod(klass, "setActivityId", argTypes, term297483, args);
    }

};


