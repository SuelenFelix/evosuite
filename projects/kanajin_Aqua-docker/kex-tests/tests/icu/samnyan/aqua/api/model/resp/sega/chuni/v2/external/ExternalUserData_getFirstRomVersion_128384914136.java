package icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ExternalUserData_getFirstRomVersion_128384914136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14437;

    public ExternalUserData_getFirstRomVersion_128384914136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14437 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData"));
        Object term14462 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14463 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14467 = newInstance(Class.forName("java.time.LocalTime"));
        Object term14523 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14524 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14528 = newInstance(Class.forName("java.time.LocalTime"));
        Object term14571 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14572 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14576 = newInstance(Class.forName("java.time.LocalTime"));
        Object term14617 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14618 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14622 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term14437, term14437.getClass(), "accessCode", "zMsSLTfGhl");
        setField(term14437, term14437.getClass(), "userName", "bEmHScVZaQ");
        setIntField(term14463, term14463.getClass(), "year", 2023);
        setShortField(term14463, term14463.getClass(), "month", (short) 5);
        setShortField(term14463, term14463.getClass(), "day", (short) 31);
        setField(term14462, term14462.getClass(), "date", term14463);
        setByteField(term14467, term14467.getClass(), "hour", (byte) 13);
        setByteField(term14467, term14467.getClass(), "minute", (byte) 29);
        setByteField(term14467, term14467.getClass(), "second", (byte) 29);
        setIntField(term14467, term14467.getClass(), "nano", 621312201);
        setField(term14462, term14462.getClass(), "time", term14467);
        setField(term14437, term14437.getClass(), "lastLoginDate", term14462);
        setBooleanField(term14437, term14437.getClass(), "isWebJoin", false);
        setField(term14437, term14437.getClass(), "webLimitDate", "TcuXODkzBV");
        setIntField(term14437, term14437.getClass(), "level", -485108462);
        setIntField(term14437, term14437.getClass(), "reincarnationNum", 1418551216);
        setField(term14437, term14437.getClass(), "exp", "coJPjrBZNe");
        setLongField(term14437, term14437.getClass(), "point", 6906379511067694917L);
        setLongField(term14437, term14437.getClass(), "totalPoint", -9204303423581447271L);
        setIntField(term14437, term14437.getClass(), "playCount", -626779272);
        setIntField(term14437, term14437.getClass(), "multiPlayCount", -1150062870);
        setIntField(term14437, term14437.getClass(), "multiWinCount", -886200503);
        setIntField(term14437, term14437.getClass(), "requestResCount", 1136393691);
        setIntField(term14437, term14437.getClass(), "acceptResCount", -1288536479);
        setIntField(term14437, term14437.getClass(), "successResCount", 1092038167);
        setIntField(term14437, term14437.getClass(), "playerRating", 1879729823);
        setIntField(term14437, term14437.getClass(), "highestRating", 1443855558);
        setIntField(term14437, term14437.getClass(), "nameplateId", -1933419449);
        setIntField(term14437, term14437.getClass(), "frameId", -1804322375);
        setIntField(term14437, term14437.getClass(), "characterId", 1595814906);
        setIntField(term14437, term14437.getClass(), "trophyId", -834193529);
        setIntField(term14437, term14437.getClass(), "playedTutorialBit", 335780735);
        setIntField(term14437, term14437.getClass(), "firstTutorialCancelNum", -1541981599);
        setIntField(term14437, term14437.getClass(), "masterTutorialCancelNum", 1605456363);
        setIntField(term14437, term14437.getClass(), "totalRepertoireCount", 2059896693);
        setIntField(term14437, term14437.getClass(), "totalMapNum", 2109912812);
        setLongField(term14437, term14437.getClass(), "totalHiScore", 6248239231585852341L);
        setLongField(term14437, term14437.getClass(), "totalBasicHighScore", -88538481937688851L);
        setLongField(term14437, term14437.getClass(), "totalAdvancedHighScore", 4069264186851023313L);
        setLongField(term14437, term14437.getClass(), "totalExpertHighScore", 5184635470881147510L);
        setLongField(term14437, term14437.getClass(), "totalMasterHighScore", 918397384129253729L);
        setIntField(term14524, term14524.getClass(), "year", 2020);
        setShortField(term14524, term14524.getClass(), "month", (short) 10);
        setShortField(term14524, term14524.getClass(), "day", (short) 26);
        setField(term14523, term14523.getClass(), "date", term14524);
        setByteField(term14528, term14528.getClass(), "hour", (byte) 10);
        setByteField(term14528, term14528.getClass(), "minute", (byte) 50);
        setByteField(term14528, term14528.getClass(), "second", (byte) 16);
        setIntField(term14528, term14528.getClass(), "nano", 613429);
        setField(term14523, term14523.getClass(), "time", term14528);
        setField(term14437, term14437.getClass(), "eventWatchedDate", term14523);
        setIntField(term14437, term14437.getClass(), "friendCount", 1841286431);
        setBooleanField(term14437, term14437.getClass(), "isMaimai", false);
        setField(term14437, term14437.getClass(), "firstGameId", "vMsWjuPTnO");
        setField(term14437, term14437.getClass(), "firstRomVersion", "zHvfKaOstO");
        setField(term14437, term14437.getClass(), "firstDataVersion", "tOszriqETr");
        setIntField(term14572, term14572.getClass(), "year", 2018);
        setShortField(term14572, term14572.getClass(), "month", (short) 5);
        setShortField(term14572, term14572.getClass(), "day", (short) 22);
        setField(term14571, term14571.getClass(), "date", term14572);
        setByteField(term14576, term14576.getClass(), "hour", (byte) 16);
        setByteField(term14576, term14576.getClass(), "minute", (byte) 46);
        setByteField(term14576, term14576.getClass(), "second", (byte) 48);
        setIntField(term14576, term14576.getClass(), "nano", 72983043);
        setField(term14571, term14571.getClass(), "time", term14576);
        setField(term14437, term14437.getClass(), "firstPlayDate", term14571);
        setField(term14437, term14437.getClass(), "lastGameId", "ncSPTkhKjO");
        setField(term14437, term14437.getClass(), "lastRomVersion", "jcWKHRWhyj");
        setField(term14437, term14437.getClass(), "lastDataVersion", "nrQjODRMLD");
        setIntField(term14618, term14618.getClass(), "year", 2022);
        setShortField(term14618, term14618.getClass(), "month", (short) 3);
        setShortField(term14618, term14618.getClass(), "day", (short) 16);
        setField(term14617, term14617.getClass(), "date", term14618);
        setByteField(term14622, term14622.getClass(), "hour", (byte) 16);
        setByteField(term14622, term14622.getClass(), "minute", (byte) 35);
        setByteField(term14622, term14622.getClass(), "second", (byte) 38);
        setIntField(term14622, term14622.getClass(), "nano", 79329968);
        setField(term14617, term14617.getClass(), "time", term14622);
        setField(term14437, term14437.getClass(), "lastPlayDate", term14617);
        setIntField(term14437, term14437.getClass(), "lastPlaceId", -1723168189);
        setField(term14437, term14437.getClass(), "lastPlaceName", "PNoWXrsFic");
        setField(term14437, term14437.getClass(), "lastRegionId", "QZBHZqZope");
        setField(term14437, term14437.getClass(), "lastRegionName", "VBUahCvyxC");
        setField(term14437, term14437.getClass(), "lastAllNetId", "MlzTkzKMCX");
        setField(term14437, term14437.getClass(), "lastClientId", "UqKUbMyPMJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstRomVersion", argTypes, term14437, args);
    }

};


