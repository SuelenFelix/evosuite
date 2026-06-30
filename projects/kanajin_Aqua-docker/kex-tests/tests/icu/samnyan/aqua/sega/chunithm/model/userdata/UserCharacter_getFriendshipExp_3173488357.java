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

public class UserCharacter_getFriendshipExp_3173488357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111093;

    public UserCharacter_getFriendshipExp_3173488357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term111099 = new Long(2145420811068634601L);
        term111093 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharacter"));
        Object term111095 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term111097 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term111113 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term111114 = newInstance(Class.forName("java.time.LocalDate"));
        Object term111118 = newInstance(Class.forName("java.time.LocalTime"));
        Object term111123 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term111124 = newInstance(Class.forName("java.time.LocalDate"));
        Object term111128 = newInstance(Class.forName("java.time.LocalTime"));
        Object term111145 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term111146 = newInstance(Class.forName("java.time.LocalDate"));
        Object term111150 = newInstance(Class.forName("java.time.LocalTime"));
        Object term111206 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term111207 = newInstance(Class.forName("java.time.LocalDate"));
        Object term111211 = newInstance(Class.forName("java.time.LocalTime"));
        Object term111254 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term111255 = newInstance(Class.forName("java.time.LocalDate"));
        Object term111259 = newInstance(Class.forName("java.time.LocalTime"));
        Object term111300 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term111301 = newInstance(Class.forName("java.time.LocalDate"));
        Object term111305 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term111093, term111093.getClass(), "id", -8439940175231511654L);
        setLongField(term111095, term111095.getClass(), "id", 5112631327574323651L);
        setLongField(term111097, term111097.getClass(), "id", -166481681441578938L);
        setField(term111097, term111097.getClass(), "extId", term111099);
        setField(term111097, term111097.getClass(), "luid", "DejzaVMRwf");
        setIntField(term111114, term111114.getClass(), "year", 2028);
        setShortField(term111114, term111114.getClass(), "month", (short) 2);
        setShortField(term111114, term111114.getClass(), "day", (short) 8);
        setField(term111113, term111113.getClass(), "date", term111114);
        setByteField(term111118, term111118.getClass(), "hour", (byte) 15);
        setByteField(term111118, term111118.getClass(), "minute", (byte) 26);
        setByteField(term111118, term111118.getClass(), "second", (byte) 10);
        setIntField(term111118, term111118.getClass(), "nano", 693423932);
        setField(term111113, term111113.getClass(), "time", term111118);
        setField(term111097, term111097.getClass(), "registerTime", term111113);
        setIntField(term111124, term111124.getClass(), "year", 2017);
        setShortField(term111124, term111124.getClass(), "month", (short) 5);
        setShortField(term111124, term111124.getClass(), "day", (short) 3);
        setField(term111123, term111123.getClass(), "date", term111124);
        setByteField(term111128, term111128.getClass(), "hour", (byte) 0);
        setByteField(term111128, term111128.getClass(), "minute", (byte) 54);
        setByteField(term111128, term111128.getClass(), "second", (byte) 19);
        setIntField(term111128, term111128.getClass(), "nano", 176887766);
        setField(term111123, term111123.getClass(), "time", term111128);
        setField(term111097, term111097.getClass(), "accessTime", term111123);
        setField(term111095, term111095.getClass(), "card", term111097);
        setField(term111095, term111095.getClass(), "userName", "vpcvPRFXOI");
        setIntField(term111146, term111146.getClass(), "year", 2018);
        setShortField(term111146, term111146.getClass(), "month", (short) 2);
        setShortField(term111146, term111146.getClass(), "day", (short) 1);
        setField(term111145, term111145.getClass(), "date", term111146);
        setByteField(term111150, term111150.getClass(), "hour", (byte) 16);
        setByteField(term111150, term111150.getClass(), "minute", (byte) 0);
        setByteField(term111150, term111150.getClass(), "second", (byte) 45);
        setIntField(term111150, term111150.getClass(), "nano", 920431415);
        setField(term111145, term111145.getClass(), "time", term111150);
        setField(term111095, term111095.getClass(), "lastLoginDate", term111145);
        setBooleanField(term111095, term111095.getClass(), "isWebJoin", true);
        setField(term111095, term111095.getClass(), "webLimitDate", "LpBQSpICQX");
        setIntField(term111095, term111095.getClass(), "level", -1186136316);
        setIntField(term111095, term111095.getClass(), "reincarnationNum", -1777720081);
        setField(term111095, term111095.getClass(), "exp", "uPhRdRCFnR");
        setLongField(term111095, term111095.getClass(), "point", -4633318477485324682L);
        setLongField(term111095, term111095.getClass(), "totalPoint", 5380478321033986380L);
        setIntField(term111095, term111095.getClass(), "playCount", -21630131);
        setIntField(term111095, term111095.getClass(), "multiPlayCount", -908750386);
        setIntField(term111095, term111095.getClass(), "multiWinCount", 373886649);
        setIntField(term111095, term111095.getClass(), "requestResCount", -2113984384);
        setIntField(term111095, term111095.getClass(), "acceptResCount", 900825176);
        setIntField(term111095, term111095.getClass(), "successResCount", -1078523636);
        setIntField(term111095, term111095.getClass(), "playerRating", -1869767871);
        setIntField(term111095, term111095.getClass(), "highestRating", -1987615511);
        setIntField(term111095, term111095.getClass(), "nameplateId", -334279196);
        setIntField(term111095, term111095.getClass(), "frameId", -1801372665);
        setIntField(term111095, term111095.getClass(), "characterId", 149567580);
        setIntField(term111095, term111095.getClass(), "trophyId", -1027296422);
        setIntField(term111095, term111095.getClass(), "playedTutorialBit", 1436156970);
        setIntField(term111095, term111095.getClass(), "firstTutorialCancelNum", 349805322);
        setIntField(term111095, term111095.getClass(), "masterTutorialCancelNum", -1951028737);
        setIntField(term111095, term111095.getClass(), "totalRepertoireCount", -2088200216);
        setIntField(term111095, term111095.getClass(), "totalMapNum", 808519297);
        setLongField(term111095, term111095.getClass(), "totalHiScore", -5286169278330415236L);
        setLongField(term111095, term111095.getClass(), "totalBasicHighScore", -6466670514888869637L);
        setLongField(term111095, term111095.getClass(), "totalAdvancedHighScore", 1092970910177761761L);
        setLongField(term111095, term111095.getClass(), "totalExpertHighScore", 4106733769705635532L);
        setLongField(term111095, term111095.getClass(), "totalMasterHighScore", -983658954375044823L);
        setIntField(term111207, term111207.getClass(), "year", 2023);
        setShortField(term111207, term111207.getClass(), "month", (short) 12);
        setShortField(term111207, term111207.getClass(), "day", (short) 12);
        setField(term111206, term111206.getClass(), "date", term111207);
        setByteField(term111211, term111211.getClass(), "hour", (byte) 17);
        setByteField(term111211, term111211.getClass(), "minute", (byte) 33);
        setByteField(term111211, term111211.getClass(), "second", (byte) 4);
        setIntField(term111211, term111211.getClass(), "nano", 217741311);
        setField(term111206, term111206.getClass(), "time", term111211);
        setField(term111095, term111095.getClass(), "eventWatchedDate", term111206);
        setIntField(term111095, term111095.getClass(), "friendCount", 1331143399);
        setBooleanField(term111095, term111095.getClass(), "isMaimai", true);
        setField(term111095, term111095.getClass(), "firstGameId", "HdiCCAVvaY");
        setField(term111095, term111095.getClass(), "firstRomVersion", "UrAeseWSFd");
        setField(term111095, term111095.getClass(), "firstDataVersion", "udLLyuUbuM");
        setIntField(term111255, term111255.getClass(), "year", 2020);
        setShortField(term111255, term111255.getClass(), "month", (short) 6);
        setShortField(term111255, term111255.getClass(), "day", (short) 5);
        setField(term111254, term111254.getClass(), "date", term111255);
        setByteField(term111259, term111259.getClass(), "hour", (byte) 15);
        setByteField(term111259, term111259.getClass(), "minute", (byte) 13);
        setByteField(term111259, term111259.getClass(), "second", (byte) 42);
        setIntField(term111259, term111259.getClass(), "nano", 206255017);
        setField(term111254, term111254.getClass(), "time", term111259);
        setField(term111095, term111095.getClass(), "firstPlayDate", term111254);
        setField(term111095, term111095.getClass(), "lastGameId", "sNNylQpAva");
        setField(term111095, term111095.getClass(), "lastRomVersion", "fiwockBanw");
        setField(term111095, term111095.getClass(), "lastDataVersion", "VbcximgVTz");
        setIntField(term111301, term111301.getClass(), "year", 2024);
        setShortField(term111301, term111301.getClass(), "month", (short) 1);
        setShortField(term111301, term111301.getClass(), "day", (short) 24);
        setField(term111300, term111300.getClass(), "date", term111301);
        setByteField(term111305, term111305.getClass(), "hour", (byte) 21);
        setByteField(term111305, term111305.getClass(), "minute", (byte) 42);
        setByteField(term111305, term111305.getClass(), "second", (byte) 42);
        setIntField(term111305, term111305.getClass(), "nano", 888293358);
        setField(term111300, term111300.getClass(), "time", term111305);
        setField(term111095, term111095.getClass(), "lastPlayDate", term111300);
        setIntField(term111095, term111095.getClass(), "lastPlaceId", -1736012493);
        setField(term111095, term111095.getClass(), "lastPlaceName", "TGJZvuTmTU");
        setField(term111095, term111095.getClass(), "lastRegionId", "BSkkjeLezA");
        setField(term111095, term111095.getClass(), "lastRegionName", "uAlTVusgen");
        setField(term111095, term111095.getClass(), "lastAllNetId", "PAUaymMOSJ");
        setField(term111095, term111095.getClass(), "lastClientId", "OcTjqWhWJS");
        setField(term111093, term111093.getClass(), "user", term111095);
        setIntField(term111093, term111093.getClass(), "characterId", 1021379232);
        setIntField(term111093, term111093.getClass(), "playCount", 180789471);
        setIntField(term111093, term111093.getClass(), "level", 1);
        setIntField(term111093, term111093.getClass(), "skillId", -1718954451);
        setIntField(term111093, term111093.getClass(), "friendshipExp", 1867721531);
        setBooleanField(term111093, term111093.getClass(), "isValid", true);
        setBooleanField(term111093, term111093.getClass(), "isNewMark", true);
        setIntField(term111093, term111093.getClass(), "param1", -964194849);
        setIntField(term111093, term111093.getClass(), "param2", -1558640225);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFriendshipExp", argTypes, term111093, args);
    }

};


