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

public class UserData_getTotalHiScore_76722313828 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141309;

    public UserData_getTotalHiScore_76722313828() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term141313 = new Long(2535970782317488741L);
        term141309 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term141311 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term141327 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term141328 = newInstance(Class.forName("java.time.LocalDate"));
        Object term141332 = newInstance(Class.forName("java.time.LocalTime"));
        Object term141337 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term141338 = newInstance(Class.forName("java.time.LocalDate"));
        Object term141342 = newInstance(Class.forName("java.time.LocalTime"));
        Object term141359 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term141360 = newInstance(Class.forName("java.time.LocalDate"));
        Object term141364 = newInstance(Class.forName("java.time.LocalTime"));
        Object term141420 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term141421 = newInstance(Class.forName("java.time.LocalDate"));
        Object term141425 = newInstance(Class.forName("java.time.LocalTime"));
        Object term141468 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term141469 = newInstance(Class.forName("java.time.LocalDate"));
        Object term141473 = newInstance(Class.forName("java.time.LocalTime"));
        Object term141514 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term141515 = newInstance(Class.forName("java.time.LocalDate"));
        Object term141519 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term141309, term141309.getClass(), "id", 4747433622332782753L);
        setLongField(term141311, term141311.getClass(), "id", -2410843304256238512L);
        setField(term141311, term141311.getClass(), "extId", term141313);
        setField(term141311, term141311.getClass(), "luid", "ByJOYpCmFi");
        setIntField(term141328, term141328.getClass(), "year", 2011);
        setShortField(term141328, term141328.getClass(), "month", (short) 8);
        setShortField(term141328, term141328.getClass(), "day", (short) 23);
        setField(term141327, term141327.getClass(), "date", term141328);
        setByteField(term141332, term141332.getClass(), "hour", (byte) 19);
        setByteField(term141332, term141332.getClass(), "minute", (byte) 16);
        setByteField(term141332, term141332.getClass(), "second", (byte) 0);
        setIntField(term141332, term141332.getClass(), "nano", 640387013);
        setField(term141327, term141327.getClass(), "time", term141332);
        setField(term141311, term141311.getClass(), "registerTime", term141327);
        setIntField(term141338, term141338.getClass(), "year", 2019);
        setShortField(term141338, term141338.getClass(), "month", (short) 10);
        setShortField(term141338, term141338.getClass(), "day", (short) 14);
        setField(term141337, term141337.getClass(), "date", term141338);
        setByteField(term141342, term141342.getClass(), "hour", (byte) 3);
        setByteField(term141342, term141342.getClass(), "minute", (byte) 24);
        setByteField(term141342, term141342.getClass(), "second", (byte) 52);
        setIntField(term141342, term141342.getClass(), "nano", 901189499);
        setField(term141337, term141337.getClass(), "time", term141342);
        setField(term141311, term141311.getClass(), "accessTime", term141337);
        setField(term141309, term141309.getClass(), "card", term141311);
        setField(term141309, term141309.getClass(), "userName", "PdnAkNWoHq");
        setIntField(term141360, term141360.getClass(), "year", 2023);
        setShortField(term141360, term141360.getClass(), "month", (short) 1);
        setShortField(term141360, term141360.getClass(), "day", (short) 30);
        setField(term141359, term141359.getClass(), "date", term141360);
        setByteField(term141364, term141364.getClass(), "hour", (byte) 7);
        setByteField(term141364, term141364.getClass(), "minute", (byte) 20);
        setByteField(term141364, term141364.getClass(), "second", (byte) 52);
        setIntField(term141364, term141364.getClass(), "nano", 873057592);
        setField(term141359, term141359.getClass(), "time", term141364);
        setField(term141309, term141309.getClass(), "lastLoginDate", term141359);
        setBooleanField(term141309, term141309.getClass(), "isWebJoin", false);
        setField(term141309, term141309.getClass(), "webLimitDate", "lQITAtdMxP");
        setIntField(term141309, term141309.getClass(), "level", -668635527);
        setIntField(term141309, term141309.getClass(), "reincarnationNum", -1270221622);
        setField(term141309, term141309.getClass(), "exp", "OXJdVKkuub");
        setLongField(term141309, term141309.getClass(), "point", 529795251759909859L);
        setLongField(term141309, term141309.getClass(), "totalPoint", 5093227115352597520L);
        setIntField(term141309, term141309.getClass(), "playCount", -768998591);
        setIntField(term141309, term141309.getClass(), "multiPlayCount", 1911741101);
        setIntField(term141309, term141309.getClass(), "multiWinCount", 1972178133);
        setIntField(term141309, term141309.getClass(), "requestResCount", -555791745);
        setIntField(term141309, term141309.getClass(), "acceptResCount", 1871265534);
        setIntField(term141309, term141309.getClass(), "successResCount", 403098234);
        setIntField(term141309, term141309.getClass(), "playerRating", 400286709);
        setIntField(term141309, term141309.getClass(), "highestRating", -754991776);
        setIntField(term141309, term141309.getClass(), "nameplateId", 252830341);
        setIntField(term141309, term141309.getClass(), "frameId", 1540328966);
        setIntField(term141309, term141309.getClass(), "characterId", -1473745505);
        setIntField(term141309, term141309.getClass(), "trophyId", -186887389);
        setIntField(term141309, term141309.getClass(), "playedTutorialBit", 1862081090);
        setIntField(term141309, term141309.getClass(), "firstTutorialCancelNum", -290784129);
        setIntField(term141309, term141309.getClass(), "masterTutorialCancelNum", 2007865762);
        setIntField(term141309, term141309.getClass(), "totalRepertoireCount", -666918167);
        setIntField(term141309, term141309.getClass(), "totalMapNum", 898423021);
        setLongField(term141309, term141309.getClass(), "totalHiScore", 1676643367165787423L);
        setLongField(term141309, term141309.getClass(), "totalBasicHighScore", -2189506306600248684L);
        setLongField(term141309, term141309.getClass(), "totalAdvancedHighScore", -1860737589067248426L);
        setLongField(term141309, term141309.getClass(), "totalExpertHighScore", -5623728246411068431L);
        setLongField(term141309, term141309.getClass(), "totalMasterHighScore", -1482512839344698645L);
        setIntField(term141421, term141421.getClass(), "year", 2022);
        setShortField(term141421, term141421.getClass(), "month", (short) 2);
        setShortField(term141421, term141421.getClass(), "day", (short) 21);
        setField(term141420, term141420.getClass(), "date", term141421);
        setByteField(term141425, term141425.getClass(), "hour", (byte) 18);
        setByteField(term141425, term141425.getClass(), "minute", (byte) 30);
        setByteField(term141425, term141425.getClass(), "second", (byte) 42);
        setIntField(term141425, term141425.getClass(), "nano", 404969998);
        setField(term141420, term141420.getClass(), "time", term141425);
        setField(term141309, term141309.getClass(), "eventWatchedDate", term141420);
        setIntField(term141309, term141309.getClass(), "friendCount", 2126116511);
        setBooleanField(term141309, term141309.getClass(), "isMaimai", true);
        setField(term141309, term141309.getClass(), "firstGameId", "uMRcoxIazP");
        setField(term141309, term141309.getClass(), "firstRomVersion", "JskWlUhLMp");
        setField(term141309, term141309.getClass(), "firstDataVersion", "IxZRiNpvbq");
        setIntField(term141469, term141469.getClass(), "year", 2019);
        setShortField(term141469, term141469.getClass(), "month", (short) 5);
        setShortField(term141469, term141469.getClass(), "day", (short) 3);
        setField(term141468, term141468.getClass(), "date", term141469);
        setByteField(term141473, term141473.getClass(), "hour", (byte) 6);
        setByteField(term141473, term141473.getClass(), "minute", (byte) 33);
        setByteField(term141473, term141473.getClass(), "second", (byte) 39);
        setIntField(term141473, term141473.getClass(), "nano", 961769504);
        setField(term141468, term141468.getClass(), "time", term141473);
        setField(term141309, term141309.getClass(), "firstPlayDate", term141468);
        setField(term141309, term141309.getClass(), "lastGameId", "ImAEcQhwQN");
        setField(term141309, term141309.getClass(), "lastRomVersion", "bBtEXrbQOO");
        setField(term141309, term141309.getClass(), "lastDataVersion", "WZsnWyKyyP");
        setIntField(term141515, term141515.getClass(), "year", 2016);
        setShortField(term141515, term141515.getClass(), "month", (short) 9);
        setShortField(term141515, term141515.getClass(), "day", (short) 25);
        setField(term141514, term141514.getClass(), "date", term141515);
        setByteField(term141519, term141519.getClass(), "hour", (byte) 21);
        setByteField(term141519, term141519.getClass(), "minute", (byte) 13);
        setByteField(term141519, term141519.getClass(), "second", (byte) 45);
        setIntField(term141519, term141519.getClass(), "nano", 346006281);
        setField(term141514, term141514.getClass(), "time", term141519);
        setField(term141309, term141309.getClass(), "lastPlayDate", term141514);
        setIntField(term141309, term141309.getClass(), "lastPlaceId", -1607033559);
        setField(term141309, term141309.getClass(), "lastPlaceName", "UmOVAGRRWa");
        setField(term141309, term141309.getClass(), "lastRegionId", "TmxjPyLcFT");
        setField(term141309, term141309.getClass(), "lastRegionName", "BgvFipVgjI");
        setField(term141309, term141309.getClass(), "lastAllNetId", "jwrtzwtiwQ");
        setField(term141309, term141309.getClass(), "lastClientId", "HyjgdbYLEd");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalHiScore", argTypes, term141309, args);
    }

};


