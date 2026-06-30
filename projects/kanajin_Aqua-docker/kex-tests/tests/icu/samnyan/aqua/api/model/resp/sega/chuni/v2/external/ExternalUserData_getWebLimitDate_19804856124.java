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

public class ExternalUserData_getWebLimitDate_19804856124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1605;

    public ExternalUserData_getWebLimitDate_19804856124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1605 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData"));
        Object term1630 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1631 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1635 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1691 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1692 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1696 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1739 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1740 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1744 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1785 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1786 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1790 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1605, term1605.getClass(), "accessCode", "ieCtQFdkii");
        setField(term1605, term1605.getClass(), "userName", "dEnhdmILtU");
        setIntField(term1631, term1631.getClass(), "year", 2015);
        setShortField(term1631, term1631.getClass(), "month", (short) 9);
        setShortField(term1631, term1631.getClass(), "day", (short) 16);
        setField(term1630, term1630.getClass(), "date", term1631);
        setByteField(term1635, term1635.getClass(), "hour", (byte) 6);
        setByteField(term1635, term1635.getClass(), "minute", (byte) 19);
        setByteField(term1635, term1635.getClass(), "second", (byte) 42);
        setIntField(term1635, term1635.getClass(), "nano", 630084975);
        setField(term1630, term1630.getClass(), "time", term1635);
        setField(term1605, term1605.getClass(), "lastLoginDate", term1630);
        setBooleanField(term1605, term1605.getClass(), "isWebJoin", false);
        setField(term1605, term1605.getClass(), "webLimitDate", "hoicvmsovO");
        setIntField(term1605, term1605.getClass(), "level", -1465035361);
        setIntField(term1605, term1605.getClass(), "reincarnationNum", 1090617576);
        setField(term1605, term1605.getClass(), "exp", "eqJfYWRaEL");
        setLongField(term1605, term1605.getClass(), "point", 1967728129628047933L);
        setLongField(term1605, term1605.getClass(), "totalPoint", 2120084523938730454L);
        setIntField(term1605, term1605.getClass(), "playCount", -1547384488);
        setIntField(term1605, term1605.getClass(), "multiPlayCount", 1442160736);
        setIntField(term1605, term1605.getClass(), "multiWinCount", 1114000454);
        setIntField(term1605, term1605.getClass(), "requestResCount", -556405712);
        setIntField(term1605, term1605.getClass(), "acceptResCount", -1772434990);
        setIntField(term1605, term1605.getClass(), "successResCount", -1845499264);
        setIntField(term1605, term1605.getClass(), "playerRating", -505439934);
        setIntField(term1605, term1605.getClass(), "highestRating", -344842608);
        setIntField(term1605, term1605.getClass(), "nameplateId", 941650513);
        setIntField(term1605, term1605.getClass(), "frameId", 444029505);
        setIntField(term1605, term1605.getClass(), "characterId", -1034506028);
        setIntField(term1605, term1605.getClass(), "trophyId", -1263114719);
        setIntField(term1605, term1605.getClass(), "playedTutorialBit", -894662986);
        setIntField(term1605, term1605.getClass(), "firstTutorialCancelNum", 304775596);
        setIntField(term1605, term1605.getClass(), "masterTutorialCancelNum", -1347665717);
        setIntField(term1605, term1605.getClass(), "totalRepertoireCount", -1888585309);
        setIntField(term1605, term1605.getClass(), "totalMapNum", 683666002);
        setLongField(term1605, term1605.getClass(), "totalHiScore", 6855071767938501807L);
        setLongField(term1605, term1605.getClass(), "totalBasicHighScore", -5892135042702373494L);
        setLongField(term1605, term1605.getClass(), "totalAdvancedHighScore", 5262507301787091109L);
        setLongField(term1605, term1605.getClass(), "totalExpertHighScore", -6823727938421990489L);
        setLongField(term1605, term1605.getClass(), "totalMasterHighScore", -484994522244390100L);
        setIntField(term1692, term1692.getClass(), "year", 2029);
        setShortField(term1692, term1692.getClass(), "month", (short) 6);
        setShortField(term1692, term1692.getClass(), "day", (short) 23);
        setField(term1691, term1691.getClass(), "date", term1692);
        setByteField(term1696, term1696.getClass(), "hour", (byte) 21);
        setByteField(term1696, term1696.getClass(), "minute", (byte) 55);
        setByteField(term1696, term1696.getClass(), "second", (byte) 27);
        setIntField(term1696, term1696.getClass(), "nano", 66889274);
        setField(term1691, term1691.getClass(), "time", term1696);
        setField(term1605, term1605.getClass(), "eventWatchedDate", term1691);
        setIntField(term1605, term1605.getClass(), "friendCount", 1596213415);
        setBooleanField(term1605, term1605.getClass(), "isMaimai", true);
        setField(term1605, term1605.getClass(), "firstGameId", "fhkbdRViHi");
        setField(term1605, term1605.getClass(), "firstRomVersion", "uWHnvSvaPl");
        setField(term1605, term1605.getClass(), "firstDataVersion", "kBdSllIBVz");
        setIntField(term1740, term1740.getClass(), "year", 2017);
        setShortField(term1740, term1740.getClass(), "month", (short) 3);
        setShortField(term1740, term1740.getClass(), "day", (short) 5);
        setField(term1739, term1739.getClass(), "date", term1740);
        setByteField(term1744, term1744.getClass(), "hour", (byte) 20);
        setByteField(term1744, term1744.getClass(), "minute", (byte) 34);
        setByteField(term1744, term1744.getClass(), "second", (byte) 55);
        setIntField(term1744, term1744.getClass(), "nano", 78024496);
        setField(term1739, term1739.getClass(), "time", term1744);
        setField(term1605, term1605.getClass(), "firstPlayDate", term1739);
        setField(term1605, term1605.getClass(), "lastGameId", "TJmVBGfTML");
        setField(term1605, term1605.getClass(), "lastRomVersion", "tPlsykYBqO");
        setField(term1605, term1605.getClass(), "lastDataVersion", "bLPjGVBhlX");
        setIntField(term1786, term1786.getClass(), "year", 2020);
        setShortField(term1786, term1786.getClass(), "month", (short) 7);
        setShortField(term1786, term1786.getClass(), "day", (short) 24);
        setField(term1785, term1785.getClass(), "date", term1786);
        setByteField(term1790, term1790.getClass(), "hour", (byte) 0);
        setByteField(term1790, term1790.getClass(), "minute", (byte) 59);
        setByteField(term1790, term1790.getClass(), "second", (byte) 56);
        setIntField(term1790, term1790.getClass(), "nano", 320219201);
        setField(term1785, term1785.getClass(), "time", term1790);
        setField(term1605, term1605.getClass(), "lastPlayDate", term1785);
        setIntField(term1605, term1605.getClass(), "lastPlaceId", -268815336);
        setField(term1605, term1605.getClass(), "lastPlaceName", "whBvTVIIlC");
        setField(term1605, term1605.getClass(), "lastRegionId", "IgRJUzaCwW");
        setField(term1605, term1605.getClass(), "lastRegionName", "JUmudUmaaV");
        setField(term1605, term1605.getClass(), "lastAllNetId", "KoyGrUJeJW");
        setField(term1605, term1605.getClass(), "lastClientId", "HqBOwkVqjD");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWebLimitDate", argTypes, term1605, args);
    }

};


