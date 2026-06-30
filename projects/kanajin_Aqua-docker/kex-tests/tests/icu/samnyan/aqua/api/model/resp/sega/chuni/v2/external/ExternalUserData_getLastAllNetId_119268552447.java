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

public class ExternalUserData_getLastAllNetId_119268552447 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18848;

    public ExternalUserData_getLastAllNetId_119268552447() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18848 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData"));
        Object term18873 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18874 = newInstance(Class.forName("java.time.LocalDate"));
        Object term18878 = newInstance(Class.forName("java.time.LocalTime"));
        Object term18934 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18935 = newInstance(Class.forName("java.time.LocalDate"));
        Object term18939 = newInstance(Class.forName("java.time.LocalTime"));
        Object term18982 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18983 = newInstance(Class.forName("java.time.LocalDate"));
        Object term18987 = newInstance(Class.forName("java.time.LocalTime"));
        Object term19028 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19029 = newInstance(Class.forName("java.time.LocalDate"));
        Object term19033 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term18848, term18848.getClass(), "accessCode", "UbZGBpQZQW");
        setField(term18848, term18848.getClass(), "userName", "SvGTualQPa");
        setIntField(term18874, term18874.getClass(), "year", 2020);
        setShortField(term18874, term18874.getClass(), "month", (short) 12);
        setShortField(term18874, term18874.getClass(), "day", (short) 30);
        setField(term18873, term18873.getClass(), "date", term18874);
        setByteField(term18878, term18878.getClass(), "hour", (byte) 2);
        setByteField(term18878, term18878.getClass(), "minute", (byte) 11);
        setByteField(term18878, term18878.getClass(), "second", (byte) 8);
        setIntField(term18878, term18878.getClass(), "nano", 528799251);
        setField(term18873, term18873.getClass(), "time", term18878);
        setField(term18848, term18848.getClass(), "lastLoginDate", term18873);
        setBooleanField(term18848, term18848.getClass(), "isWebJoin", false);
        setField(term18848, term18848.getClass(), "webLimitDate", "mdxcgZwsaP");
        setIntField(term18848, term18848.getClass(), "level", -1641507499);
        setIntField(term18848, term18848.getClass(), "reincarnationNum", -33436796);
        setField(term18848, term18848.getClass(), "exp", "XildIRoZHG");
        setLongField(term18848, term18848.getClass(), "point", -7632759764262745126L);
        setLongField(term18848, term18848.getClass(), "totalPoint", 3746481521207337771L);
        setIntField(term18848, term18848.getClass(), "playCount", -1527326823);
        setIntField(term18848, term18848.getClass(), "multiPlayCount", 469871899);
        setIntField(term18848, term18848.getClass(), "multiWinCount", -1348703436);
        setIntField(term18848, term18848.getClass(), "requestResCount", -2027012650);
        setIntField(term18848, term18848.getClass(), "acceptResCount", 1343432022);
        setIntField(term18848, term18848.getClass(), "successResCount", -1767079160);
        setIntField(term18848, term18848.getClass(), "playerRating", -201010601);
        setIntField(term18848, term18848.getClass(), "highestRating", 2060027076);
        setIntField(term18848, term18848.getClass(), "nameplateId", 2084868811);
        setIntField(term18848, term18848.getClass(), "frameId", 314478878);
        setIntField(term18848, term18848.getClass(), "characterId", 1425342686);
        setIntField(term18848, term18848.getClass(), "trophyId", -1042470635);
        setIntField(term18848, term18848.getClass(), "playedTutorialBit", -524352937);
        setIntField(term18848, term18848.getClass(), "firstTutorialCancelNum", 1472218987);
        setIntField(term18848, term18848.getClass(), "masterTutorialCancelNum", 805176809);
        setIntField(term18848, term18848.getClass(), "totalRepertoireCount", -82632953);
        setIntField(term18848, term18848.getClass(), "totalMapNum", -1473876284);
        setLongField(term18848, term18848.getClass(), "totalHiScore", 4341016500855678917L);
        setLongField(term18848, term18848.getClass(), "totalBasicHighScore", -5871746020807491998L);
        setLongField(term18848, term18848.getClass(), "totalAdvancedHighScore", 4742108233936970770L);
        setLongField(term18848, term18848.getClass(), "totalExpertHighScore", 2722004046017350471L);
        setLongField(term18848, term18848.getClass(), "totalMasterHighScore", 6636235983121346803L);
        setIntField(term18935, term18935.getClass(), "year", 2027);
        setShortField(term18935, term18935.getClass(), "month", (short) 9);
        setShortField(term18935, term18935.getClass(), "day", (short) 29);
        setField(term18934, term18934.getClass(), "date", term18935);
        setByteField(term18939, term18939.getClass(), "hour", (byte) 19);
        setByteField(term18939, term18939.getClass(), "minute", (byte) 13);
        setByteField(term18939, term18939.getClass(), "second", (byte) 31);
        setIntField(term18939, term18939.getClass(), "nano", 854066575);
        setField(term18934, term18934.getClass(), "time", term18939);
        setField(term18848, term18848.getClass(), "eventWatchedDate", term18934);
        setIntField(term18848, term18848.getClass(), "friendCount", -1389314671);
        setBooleanField(term18848, term18848.getClass(), "isMaimai", false);
        setField(term18848, term18848.getClass(), "firstGameId", "lEcrFlxJXH");
        setField(term18848, term18848.getClass(), "firstRomVersion", "VNdDwXMYxR");
        setField(term18848, term18848.getClass(), "firstDataVersion", "bVbexZPmwW");
        setIntField(term18983, term18983.getClass(), "year", 2025);
        setShortField(term18983, term18983.getClass(), "month", (short) 11);
        setShortField(term18983, term18983.getClass(), "day", (short) 16);
        setField(term18982, term18982.getClass(), "date", term18983);
        setByteField(term18987, term18987.getClass(), "hour", (byte) 12);
        setByteField(term18987, term18987.getClass(), "minute", (byte) 27);
        setByteField(term18987, term18987.getClass(), "second", (byte) 36);
        setIntField(term18987, term18987.getClass(), "nano", 699989217);
        setField(term18982, term18982.getClass(), "time", term18987);
        setField(term18848, term18848.getClass(), "firstPlayDate", term18982);
        setField(term18848, term18848.getClass(), "lastGameId", "tvxYdqiyGc");
        setField(term18848, term18848.getClass(), "lastRomVersion", "ZEXFoMSKeG");
        setField(term18848, term18848.getClass(), "lastDataVersion", "HvxahUfZcJ");
        setIntField(term19029, term19029.getClass(), "year", 2018);
        setShortField(term19029, term19029.getClass(), "month", (short) 10);
        setShortField(term19029, term19029.getClass(), "day", (short) 3);
        setField(term19028, term19028.getClass(), "date", term19029);
        setByteField(term19033, term19033.getClass(), "hour", (byte) 12);
        setByteField(term19033, term19033.getClass(), "minute", (byte) 49);
        setByteField(term19033, term19033.getClass(), "second", (byte) 38);
        setIntField(term19033, term19033.getClass(), "nano", 549840711);
        setField(term19028, term19028.getClass(), "time", term19033);
        setField(term18848, term18848.getClass(), "lastPlayDate", term19028);
        setIntField(term18848, term18848.getClass(), "lastPlaceId", -499699841);
        setField(term18848, term18848.getClass(), "lastPlaceName", "WkLpmqoQxy");
        setField(term18848, term18848.getClass(), "lastRegionId", "XiNoscmYhd");
        setField(term18848, term18848.getClass(), "lastRegionName", "asMqnMNrZp");
        setField(term18848, term18848.getClass(), "lastAllNetId", "pqFUMTCKJd");
        setField(term18848, term18848.getClass(), "lastClientId", "PTEndmPMzk");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastAllNetId", argTypes, term18848, args);
    }

};


