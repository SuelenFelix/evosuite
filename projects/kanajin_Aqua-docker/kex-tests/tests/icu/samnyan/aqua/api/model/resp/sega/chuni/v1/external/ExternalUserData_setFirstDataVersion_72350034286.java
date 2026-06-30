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

public class ExternalUserData_setFirstDataVersion_72350034286 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34697;

    public ExternalUserData_setFirstDataVersion_72350034286() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34697 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData"));
        Object term34722 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term34723 = newInstance(Class.forName("java.time.LocalDate"));
        Object term34727 = newInstance(Class.forName("java.time.LocalTime"));
        Object term34783 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term34784 = newInstance(Class.forName("java.time.LocalDate"));
        Object term34788 = newInstance(Class.forName("java.time.LocalTime"));
        Object term34831 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term34832 = newInstance(Class.forName("java.time.LocalDate"));
        Object term34836 = newInstance(Class.forName("java.time.LocalTime"));
        Object term34877 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term34878 = newInstance(Class.forName("java.time.LocalDate"));
        Object term34882 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term34697, term34697.getClass(), "accessCode", "cHqLMqZSmc");
        setField(term34697, term34697.getClass(), "userName", "hkWmAkXSOW");
        setIntField(term34723, term34723.getClass(), "year", 2013);
        setShortField(term34723, term34723.getClass(), "month", (short) 9);
        setShortField(term34723, term34723.getClass(), "day", (short) 12);
        setField(term34722, term34722.getClass(), "date", term34723);
        setByteField(term34727, term34727.getClass(), "hour", (byte) 14);
        setByteField(term34727, term34727.getClass(), "minute", (byte) 21);
        setByteField(term34727, term34727.getClass(), "second", (byte) 35);
        setIntField(term34727, term34727.getClass(), "nano", 520302725);
        setField(term34722, term34722.getClass(), "time", term34727);
        setField(term34697, term34697.getClass(), "lastLoginDate", term34722);
        setBooleanField(term34697, term34697.getClass(), "isWebJoin", false);
        setField(term34697, term34697.getClass(), "webLimitDate", "DwQmZEKeOp");
        setIntField(term34697, term34697.getClass(), "level", 1044519085);
        setIntField(term34697, term34697.getClass(), "reincarnationNum", 2095699770);
        setField(term34697, term34697.getClass(), "exp", "DbxrFiyttv");
        setLongField(term34697, term34697.getClass(), "point", 9056245012917372169L);
        setLongField(term34697, term34697.getClass(), "totalPoint", 7848004402682338886L);
        setIntField(term34697, term34697.getClass(), "playCount", -1365904757);
        setIntField(term34697, term34697.getClass(), "multiPlayCount", -1487263349);
        setIntField(term34697, term34697.getClass(), "multiWinCount", -1009732764);
        setIntField(term34697, term34697.getClass(), "requestResCount", 950783153);
        setIntField(term34697, term34697.getClass(), "acceptResCount", -801175078);
        setIntField(term34697, term34697.getClass(), "successResCount", 2085098404);
        setIntField(term34697, term34697.getClass(), "playerRating", -684064427);
        setIntField(term34697, term34697.getClass(), "highestRating", -1981080836);
        setIntField(term34697, term34697.getClass(), "nameplateId", -176676344);
        setIntField(term34697, term34697.getClass(), "frameId", 1949009312);
        setIntField(term34697, term34697.getClass(), "characterId", -432054743);
        setIntField(term34697, term34697.getClass(), "trophyId", -859726380);
        setIntField(term34697, term34697.getClass(), "playedTutorialBit", -1498422654);
        setIntField(term34697, term34697.getClass(), "firstTutorialCancelNum", -1499829233);
        setIntField(term34697, term34697.getClass(), "masterTutorialCancelNum", -888855662);
        setIntField(term34697, term34697.getClass(), "totalRepertoireCount", -1483966656);
        setIntField(term34697, term34697.getClass(), "totalMapNum", -334260786);
        setLongField(term34697, term34697.getClass(), "totalHiScore", 8931772176819893873L);
        setLongField(term34697, term34697.getClass(), "totalBasicHighScore", -4370635295110591519L);
        setLongField(term34697, term34697.getClass(), "totalAdvancedHighScore", -1325109462577461208L);
        setLongField(term34697, term34697.getClass(), "totalExpertHighScore", -7181112149072926893L);
        setLongField(term34697, term34697.getClass(), "totalMasterHighScore", -5850316381591949820L);
        setIntField(term34784, term34784.getClass(), "year", 2016);
        setShortField(term34784, term34784.getClass(), "month", (short) 2);
        setShortField(term34784, term34784.getClass(), "day", (short) 15);
        setField(term34783, term34783.getClass(), "date", term34784);
        setByteField(term34788, term34788.getClass(), "hour", (byte) 7);
        setByteField(term34788, term34788.getClass(), "minute", (byte) 36);
        setByteField(term34788, term34788.getClass(), "second", (byte) 21);
        setIntField(term34788, term34788.getClass(), "nano", 74269011);
        setField(term34783, term34783.getClass(), "time", term34788);
        setField(term34697, term34697.getClass(), "eventWatchedDate", term34783);
        setIntField(term34697, term34697.getClass(), "friendCount", -765890956);
        setBooleanField(term34697, term34697.getClass(), "isMaimai", true);
        setField(term34697, term34697.getClass(), "firstGameId", "iVIrSxTsaM");
        setField(term34697, term34697.getClass(), "firstRomVersion", "FmJNEfmYgq");
        setField(term34697, term34697.getClass(), "firstDataVersion", "NqQofgWsJd");
        setIntField(term34832, term34832.getClass(), "year", 2012);
        setShortField(term34832, term34832.getClass(), "month", (short) 11);
        setShortField(term34832, term34832.getClass(), "day", (short) 23);
        setField(term34831, term34831.getClass(), "date", term34832);
        setByteField(term34836, term34836.getClass(), "hour", (byte) 21);
        setByteField(term34836, term34836.getClass(), "minute", (byte) 45);
        setByteField(term34836, term34836.getClass(), "second", (byte) 46);
        setIntField(term34836, term34836.getClass(), "nano", 484678696);
        setField(term34831, term34831.getClass(), "time", term34836);
        setField(term34697, term34697.getClass(), "firstPlayDate", term34831);
        setField(term34697, term34697.getClass(), "lastGameId", "ZlVRdHsBMO");
        setField(term34697, term34697.getClass(), "lastRomVersion", "UMMXkhuqzw");
        setField(term34697, term34697.getClass(), "lastDataVersion", "KyGXZcXJwq");
        setIntField(term34878, term34878.getClass(), "year", 2027);
        setShortField(term34878, term34878.getClass(), "month", (short) 12);
        setShortField(term34878, term34878.getClass(), "day", (short) 25);
        setField(term34877, term34877.getClass(), "date", term34878);
        setByteField(term34882, term34882.getClass(), "hour", (byte) 8);
        setByteField(term34882, term34882.getClass(), "minute", (byte) 19);
        setByteField(term34882, term34882.getClass(), "second", (byte) 20);
        setIntField(term34882, term34882.getClass(), "nano", 127700185);
        setField(term34877, term34877.getClass(), "time", term34882);
        setField(term34697, term34697.getClass(), "lastPlayDate", term34877);
        setIntField(term34697, term34697.getClass(), "lastPlaceId", -214452542);
        setField(term34697, term34697.getClass(), "lastPlaceName", "TqiCjeuoWE");
        setField(term34697, term34697.getClass(), "lastRegionId", "GWWfkXOYLP");
        setField(term34697, term34697.getClass(), "lastRegionName", "qvykDllgpT");
        setField(term34697, term34697.getClass(), "lastAllNetId", "hzdUbcLZhZ");
        setField(term34697, term34697.getClass(), "lastClientId", "GlxnEJvYeC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SLdOGaqmNv";
        callMethod(klass, "setFirstDataVersion", argTypes, term34697, args);
    }

};


