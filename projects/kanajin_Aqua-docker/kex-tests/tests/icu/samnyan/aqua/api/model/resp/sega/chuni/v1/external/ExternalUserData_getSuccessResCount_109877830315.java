package icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ExternalUserData_getSuccessResCount_109877830315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6016;

    public ExternalUserData_getSuccessResCount_109877830315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6016 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData"));
        Object term6041 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6042 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6046 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6102 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6103 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6107 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6150 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6151 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6155 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6196 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6197 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6201 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term6016, term6016.getClass(), "accessCode", "qCpEbQDHdF");
        setField(term6016, term6016.getClass(), "userName", "AHbZyFOmlo");
        setIntField(term6042, term6042.getClass(), "year", 2016);
        setShortField(term6042, term6042.getClass(), "month", (short) 2);
        setShortField(term6042, term6042.getClass(), "day", (short) 25);
        setField(term6041, term6041.getClass(), "date", term6042);
        setByteField(term6046, term6046.getClass(), "hour", (byte) 8);
        setByteField(term6046, term6046.getClass(), "minute", (byte) 54);
        setByteField(term6046, term6046.getClass(), "second", (byte) 40);
        setIntField(term6046, term6046.getClass(), "nano", 124525896);
        setField(term6041, term6041.getClass(), "time", term6046);
        setField(term6016, term6016.getClass(), "lastLoginDate", term6041);
        setBooleanField(term6016, term6016.getClass(), "isWebJoin", true);
        setField(term6016, term6016.getClass(), "webLimitDate", "TwfWVQGiIj");
        setIntField(term6016, term6016.getClass(), "level", 1466373988);
        setIntField(term6016, term6016.getClass(), "reincarnationNum", -358526505);
        setField(term6016, term6016.getClass(), "exp", "gUvcueTURF");
        setLongField(term6016, term6016.getClass(), "point", -5786861555969446503L);
        setLongField(term6016, term6016.getClass(), "totalPoint", 2354625302846375590L);
        setIntField(term6016, term6016.getClass(), "playCount", 1843268026);
        setIntField(term6016, term6016.getClass(), "multiPlayCount", 954660603);
        setIntField(term6016, term6016.getClass(), "multiWinCount", -1351605385);
        setIntField(term6016, term6016.getClass(), "requestResCount", 278355793);
        setIntField(term6016, term6016.getClass(), "acceptResCount", -310648604);
        setIntField(term6016, term6016.getClass(), "successResCount", -648200466);
        setIntField(term6016, term6016.getClass(), "playerRating", 2007134147);
        setIntField(term6016, term6016.getClass(), "highestRating", 993388358);
        setIntField(term6016, term6016.getClass(), "nameplateId", -765191335);
        setIntField(term6016, term6016.getClass(), "frameId", -1697741155);
        setIntField(term6016, term6016.getClass(), "characterId", 1295839803);
        setIntField(term6016, term6016.getClass(), "trophyId", -1891015523);
        setIntField(term6016, term6016.getClass(), "playedTutorialBit", -1560631747);
        setIntField(term6016, term6016.getClass(), "firstTutorialCancelNum", 1215150180);
        setIntField(term6016, term6016.getClass(), "masterTutorialCancelNum", -1422859977);
        setIntField(term6016, term6016.getClass(), "totalRepertoireCount", -1972436591);
        setIntField(term6016, term6016.getClass(), "totalMapNum", 68922753);
        setLongField(term6016, term6016.getClass(), "totalHiScore", 7276637106827860087L);
        setLongField(term6016, term6016.getClass(), "totalBasicHighScore", -3936701866695933852L);
        setLongField(term6016, term6016.getClass(), "totalAdvancedHighScore", 1215116475929634177L);
        setLongField(term6016, term6016.getClass(), "totalExpertHighScore", 1597484336218508869L);
        setLongField(term6016, term6016.getClass(), "totalMasterHighScore", -685023850445639859L);
        setIntField(term6103, term6103.getClass(), "year", 2029);
        setShortField(term6103, term6103.getClass(), "month", (short) 1);
        setShortField(term6103, term6103.getClass(), "day", (short) 10);
        setField(term6102, term6102.getClass(), "date", term6103);
        setByteField(term6107, term6107.getClass(), "hour", (byte) 8);
        setByteField(term6107, term6107.getClass(), "minute", (byte) 46);
        setByteField(term6107, term6107.getClass(), "second", (byte) 35);
        setIntField(term6107, term6107.getClass(), "nano", 58807194);
        setField(term6102, term6102.getClass(), "time", term6107);
        setField(term6016, term6016.getClass(), "eventWatchedDate", term6102);
        setIntField(term6016, term6016.getClass(), "friendCount", -220791533);
        setBooleanField(term6016, term6016.getClass(), "isMaimai", true);
        setField(term6016, term6016.getClass(), "firstGameId", "EwQBhZjCIT");
        setField(term6016, term6016.getClass(), "firstRomVersion", "aSkmSwTnEw");
        setField(term6016, term6016.getClass(), "firstDataVersion", "xvkbvaEGYd");
        setIntField(term6151, term6151.getClass(), "year", 2016);
        setShortField(term6151, term6151.getClass(), "month", (short) 10);
        setShortField(term6151, term6151.getClass(), "day", (short) 20);
        setField(term6150, term6150.getClass(), "date", term6151);
        setByteField(term6155, term6155.getClass(), "hour", (byte) 18);
        setByteField(term6155, term6155.getClass(), "minute", (byte) 39);
        setByteField(term6155, term6155.getClass(), "second", (byte) 1);
        setIntField(term6155, term6155.getClass(), "nano", 196253988);
        setField(term6150, term6150.getClass(), "time", term6155);
        setField(term6016, term6016.getClass(), "firstPlayDate", term6150);
        setField(term6016, term6016.getClass(), "lastGameId", "HBGNxdNURv");
        setField(term6016, term6016.getClass(), "lastRomVersion", "mfCpTPPQQm");
        setField(term6016, term6016.getClass(), "lastDataVersion", "OcJCIDNIXA");
        setIntField(term6197, term6197.getClass(), "year", 2019);
        setShortField(term6197, term6197.getClass(), "month", (short) 1);
        setShortField(term6197, term6197.getClass(), "day", (short) 6);
        setField(term6196, term6196.getClass(), "date", term6197);
        setByteField(term6201, term6201.getClass(), "hour", (byte) 18);
        setByteField(term6201, term6201.getClass(), "minute", (byte) 8);
        setByteField(term6201, term6201.getClass(), "second", (byte) 46);
        setIntField(term6201, term6201.getClass(), "nano", 934136445);
        setField(term6196, term6196.getClass(), "time", term6201);
        setField(term6016, term6016.getClass(), "lastPlayDate", term6196);
        setIntField(term6016, term6016.getClass(), "lastPlaceId", 1741500243);
        setField(term6016, term6016.getClass(), "lastPlaceName", "XfRABIFVEp");
        setField(term6016, term6016.getClass(), "lastRegionId", "MHGKyEnwKc");
        setField(term6016, term6016.getClass(), "lastRegionName", "ShIELyuULw");
        setField(term6016, term6016.getClass(), "lastAllNetId", "IpQuOGMgmj");
        setField(term6016, term6016.getClass(), "lastClientId", "pJbnHTYrxn");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSuccessResCount", argTypes, term6016, args);
    }

};


