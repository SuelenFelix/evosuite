package icu.samnyan.aqua.sega.chunithm.service;

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
import static icu.samnyan.aqua.sega.chunithm.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.lang.Integer;

public class UserMapService_getByUserAndMapId_6904731124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2237;
     Object term2513;

    public UserMapService_getByUserAndMapId_6904731124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2241 = new Long(4872422362414183754L);
        term2237 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term2239 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term2255 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2256 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2260 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2265 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2266 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2270 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2287 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2288 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2292 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2348 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2349 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2353 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2396 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2397 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2401 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2442 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2443 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2447 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term2237, term2237.getClass(), "id", 4044358158040652353L);
        setLongField(term2239, term2239.getClass(), "id", -4443169559037975007L);
        setField(term2239, term2239.getClass(), "extId", term2241);
        setField(term2239, term2239.getClass(), "luid", "OWKQODBLzb");
        setIntField(term2256, term2256.getClass(), "year", 2012);
        setShortField(term2256, term2256.getClass(), "month", (short) 3);
        setShortField(term2256, term2256.getClass(), "day", (short) 27);
        setField(term2255, term2255.getClass(), "date", term2256);
        setByteField(term2260, term2260.getClass(), "hour", (byte) 17);
        setByteField(term2260, term2260.getClass(), "minute", (byte) 49);
        setByteField(term2260, term2260.getClass(), "second", (byte) 24);
        setIntField(term2260, term2260.getClass(), "nano", 530647398);
        setField(term2255, term2255.getClass(), "time", term2260);
        setField(term2239, term2239.getClass(), "registerTime", term2255);
        setIntField(term2266, term2266.getClass(), "year", 2010);
        setShortField(term2266, term2266.getClass(), "month", (short) 6);
        setShortField(term2266, term2266.getClass(), "day", (short) 14);
        setField(term2265, term2265.getClass(), "date", term2266);
        setByteField(term2270, term2270.getClass(), "hour", (byte) 6);
        setByteField(term2270, term2270.getClass(), "minute", (byte) 22);
        setByteField(term2270, term2270.getClass(), "second", (byte) 20);
        setIntField(term2270, term2270.getClass(), "nano", 25133051);
        setField(term2265, term2265.getClass(), "time", term2270);
        setField(term2239, term2239.getClass(), "accessTime", term2265);
        setField(term2237, term2237.getClass(), "card", term2239);
        setField(term2237, term2237.getClass(), "userName", "wGmYcqUkgE");
        setIntField(term2288, term2288.getClass(), "year", 2010);
        setShortField(term2288, term2288.getClass(), "month", (short) 5);
        setShortField(term2288, term2288.getClass(), "day", (short) 2);
        setField(term2287, term2287.getClass(), "date", term2288);
        setByteField(term2292, term2292.getClass(), "hour", (byte) 2);
        setByteField(term2292, term2292.getClass(), "minute", (byte) 22);
        setByteField(term2292, term2292.getClass(), "second", (byte) 33);
        setIntField(term2292, term2292.getClass(), "nano", 530835039);
        setField(term2287, term2287.getClass(), "time", term2292);
        setField(term2237, term2237.getClass(), "lastLoginDate", term2287);
        setBooleanField(term2237, term2237.getClass(), "isWebJoin", false);
        setField(term2237, term2237.getClass(), "webLimitDate", "idgaQsnJpQ");
        setIntField(term2237, term2237.getClass(), "level", -1801760683);
        setIntField(term2237, term2237.getClass(), "reincarnationNum", 1141317871);
        setField(term2237, term2237.getClass(), "exp", "VgZnGoIFwQ");
        setLongField(term2237, term2237.getClass(), "point", -3842548265506930260L);
        setLongField(term2237, term2237.getClass(), "totalPoint", -5788180182343976541L);
        setIntField(term2237, term2237.getClass(), "playCount", 890669485);
        setIntField(term2237, term2237.getClass(), "multiPlayCount", 691577392);
        setIntField(term2237, term2237.getClass(), "multiWinCount", -893623680);
        setIntField(term2237, term2237.getClass(), "requestResCount", -1963434938);
        setIntField(term2237, term2237.getClass(), "acceptResCount", 906181092);
        setIntField(term2237, term2237.getClass(), "successResCount", 1045657203);
        setIntField(term2237, term2237.getClass(), "playerRating", 1386130016);
        setIntField(term2237, term2237.getClass(), "highestRating", 1072005683);
        setIntField(term2237, term2237.getClass(), "nameplateId", 1861318859);
        setIntField(term2237, term2237.getClass(), "frameId", 1474524152);
        setIntField(term2237, term2237.getClass(), "characterId", 568954359);
        setIntField(term2237, term2237.getClass(), "trophyId", 53410913);
        setIntField(term2237, term2237.getClass(), "playedTutorialBit", -375014958);
        setIntField(term2237, term2237.getClass(), "firstTutorialCancelNum", 1107176718);
        setIntField(term2237, term2237.getClass(), "masterTutorialCancelNum", 480137250);
        setIntField(term2237, term2237.getClass(), "totalRepertoireCount", -341152642);
        setIntField(term2237, term2237.getClass(), "totalMapNum", -2015854073);
        setLongField(term2237, term2237.getClass(), "totalHiScore", 2936323121573284007L);
        setLongField(term2237, term2237.getClass(), "totalBasicHighScore", -1154553077993834885L);
        setLongField(term2237, term2237.getClass(), "totalAdvancedHighScore", -2850532706972744550L);
        setLongField(term2237, term2237.getClass(), "totalExpertHighScore", -2644215923136513282L);
        setLongField(term2237, term2237.getClass(), "totalMasterHighScore", -1468719814009985452L);
        setIntField(term2349, term2349.getClass(), "year", 2024);
        setShortField(term2349, term2349.getClass(), "month", (short) 4);
        setShortField(term2349, term2349.getClass(), "day", (short) 24);
        setField(term2348, term2348.getClass(), "date", term2349);
        setByteField(term2353, term2353.getClass(), "hour", (byte) 7);
        setByteField(term2353, term2353.getClass(), "minute", (byte) 2);
        setByteField(term2353, term2353.getClass(), "second", (byte) 51);
        setIntField(term2353, term2353.getClass(), "nano", 635502964);
        setField(term2348, term2348.getClass(), "time", term2353);
        setField(term2237, term2237.getClass(), "eventWatchedDate", term2348);
        setIntField(term2237, term2237.getClass(), "friendCount", 538259104);
        setBooleanField(term2237, term2237.getClass(), "isMaimai", true);
        setField(term2237, term2237.getClass(), "firstGameId", "jUbSRrkrYZ");
        setField(term2237, term2237.getClass(), "firstRomVersion", "bWWfajKbEX");
        setField(term2237, term2237.getClass(), "firstDataVersion", "cAPeiZHKGJ");
        setIntField(term2397, term2397.getClass(), "year", 2010);
        setShortField(term2397, term2397.getClass(), "month", (short) 1);
        setShortField(term2397, term2397.getClass(), "day", (short) 17);
        setField(term2396, term2396.getClass(), "date", term2397);
        setByteField(term2401, term2401.getClass(), "hour", (byte) 13);
        setByteField(term2401, term2401.getClass(), "minute", (byte) 5);
        setByteField(term2401, term2401.getClass(), "second", (byte) 51);
        setIntField(term2401, term2401.getClass(), "nano", 362260580);
        setField(term2396, term2396.getClass(), "time", term2401);
        setField(term2237, term2237.getClass(), "firstPlayDate", term2396);
        setField(term2237, term2237.getClass(), "lastGameId", "LvJFtLBaxj");
        setField(term2237, term2237.getClass(), "lastRomVersion", "PHvxnGHptP");
        setField(term2237, term2237.getClass(), "lastDataVersion", "TimdotUuNC");
        setIntField(term2443, term2443.getClass(), "year", 2010);
        setShortField(term2443, term2443.getClass(), "month", (short) 9);
        setShortField(term2443, term2443.getClass(), "day", (short) 28);
        setField(term2442, term2442.getClass(), "date", term2443);
        setByteField(term2447, term2447.getClass(), "hour", (byte) 6);
        setByteField(term2447, term2447.getClass(), "minute", (byte) 4);
        setByteField(term2447, term2447.getClass(), "second", (byte) 54);
        setIntField(term2447, term2447.getClass(), "nano", 604713782);
        setField(term2442, term2442.getClass(), "time", term2447);
        setField(term2237, term2237.getClass(), "lastPlayDate", term2442);
        setIntField(term2237, term2237.getClass(), "lastPlaceId", 96566506);
        setField(term2237, term2237.getClass(), "lastPlaceName", "PkWMRdJcBb");
        setField(term2237, term2237.getClass(), "lastRegionId", "jSpAteRute");
        setField(term2237, term2237.getClass(), "lastRegionName", "swZVeJAxjt");
        setField(term2237, term2237.getClass(), "lastAllNetId", "xOcJIiQQDu");
        setField(term2237, term2237.getClass(), "lastClientId", "GVizqqzXpy");
        term2513 = new Integer(-343325701);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.service.UserMapService");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term2237;
        args[1] = term2513;
        callMethod(klass, "getByUserAndMapId", argTypes, null, args);
    }

};


