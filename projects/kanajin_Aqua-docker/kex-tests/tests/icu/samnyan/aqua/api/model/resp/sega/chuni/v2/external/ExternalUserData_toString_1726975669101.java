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

public class ExternalUserData_toString_1726975669101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40934;

    public ExternalUserData_toString_1726975669101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40934 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData"));
        Object term40959 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40960 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40964 = newInstance(Class.forName("java.time.LocalTime"));
        Object term41020 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term41021 = newInstance(Class.forName("java.time.LocalDate"));
        Object term41025 = newInstance(Class.forName("java.time.LocalTime"));
        Object term41068 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term41069 = newInstance(Class.forName("java.time.LocalDate"));
        Object term41073 = newInstance(Class.forName("java.time.LocalTime"));
        Object term41114 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term41115 = newInstance(Class.forName("java.time.LocalDate"));
        Object term41119 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term40934, term40934.getClass(), "accessCode", "BRMTHqqoRg");
        setField(term40934, term40934.getClass(), "userName", "nOElYZBeyU");
        setIntField(term40960, term40960.getClass(), "year", 2018);
        setShortField(term40960, term40960.getClass(), "month", (short) 11);
        setShortField(term40960, term40960.getClass(), "day", (short) 23);
        setField(term40959, term40959.getClass(), "date", term40960);
        setByteField(term40964, term40964.getClass(), "hour", (byte) 15);
        setByteField(term40964, term40964.getClass(), "minute", (byte) 21);
        setByteField(term40964, term40964.getClass(), "second", (byte) 39);
        setIntField(term40964, term40964.getClass(), "nano", 255623386);
        setField(term40959, term40959.getClass(), "time", term40964);
        setField(term40934, term40934.getClass(), "lastLoginDate", term40959);
        setBooleanField(term40934, term40934.getClass(), "isWebJoin", true);
        setField(term40934, term40934.getClass(), "webLimitDate", "eUXPtGmoNg");
        setIntField(term40934, term40934.getClass(), "level", 1146236760);
        setIntField(term40934, term40934.getClass(), "reincarnationNum", 985801789);
        setField(term40934, term40934.getClass(), "exp", "ZjqXyUmAJY");
        setLongField(term40934, term40934.getClass(), "point", 8912657350087595530L);
        setLongField(term40934, term40934.getClass(), "totalPoint", 7440648013789140935L);
        setIntField(term40934, term40934.getClass(), "playCount", -1628536749);
        setIntField(term40934, term40934.getClass(), "multiPlayCount", -748022064);
        setIntField(term40934, term40934.getClass(), "multiWinCount", -1745708025);
        setIntField(term40934, term40934.getClass(), "requestResCount", 790614624);
        setIntField(term40934, term40934.getClass(), "acceptResCount", 117387225);
        setIntField(term40934, term40934.getClass(), "successResCount", 948347134);
        setIntField(term40934, term40934.getClass(), "playerRating", -1552842218);
        setIntField(term40934, term40934.getClass(), "highestRating", -157220068);
        setIntField(term40934, term40934.getClass(), "nameplateId", 141434141);
        setIntField(term40934, term40934.getClass(), "frameId", -288619829);
        setIntField(term40934, term40934.getClass(), "characterId", -505635206);
        setIntField(term40934, term40934.getClass(), "trophyId", 932246615);
        setIntField(term40934, term40934.getClass(), "playedTutorialBit", 261281668);
        setIntField(term40934, term40934.getClass(), "firstTutorialCancelNum", 1712273163);
        setIntField(term40934, term40934.getClass(), "masterTutorialCancelNum", 234306621);
        setIntField(term40934, term40934.getClass(), "totalRepertoireCount", 1025525602);
        setIntField(term40934, term40934.getClass(), "totalMapNum", 1669406334);
        setLongField(term40934, term40934.getClass(), "totalHiScore", -7488291606536854368L);
        setLongField(term40934, term40934.getClass(), "totalBasicHighScore", -6664891356964396236L);
        setLongField(term40934, term40934.getClass(), "totalAdvancedHighScore", 5307445998877056304L);
        setLongField(term40934, term40934.getClass(), "totalExpertHighScore", -8148408579143384073L);
        setLongField(term40934, term40934.getClass(), "totalMasterHighScore", -888581501148999479L);
        setIntField(term41021, term41021.getClass(), "year", 2016);
        setShortField(term41021, term41021.getClass(), "month", (short) 11);
        setShortField(term41021, term41021.getClass(), "day", (short) 8);
        setField(term41020, term41020.getClass(), "date", term41021);
        setByteField(term41025, term41025.getClass(), "hour", (byte) 7);
        setByteField(term41025, term41025.getClass(), "minute", (byte) 33);
        setByteField(term41025, term41025.getClass(), "second", (byte) 30);
        setIntField(term41025, term41025.getClass(), "nano", 274725601);
        setField(term41020, term41020.getClass(), "time", term41025);
        setField(term40934, term40934.getClass(), "eventWatchedDate", term41020);
        setIntField(term40934, term40934.getClass(), "friendCount", -780862464);
        setBooleanField(term40934, term40934.getClass(), "isMaimai", true);
        setField(term40934, term40934.getClass(), "firstGameId", "pjEERkBbYo");
        setField(term40934, term40934.getClass(), "firstRomVersion", "FQPqmjhWog");
        setField(term40934, term40934.getClass(), "firstDataVersion", "sYtJsiIiSX");
        setIntField(term41069, term41069.getClass(), "year", 2028);
        setShortField(term41069, term41069.getClass(), "month", (short) 4);
        setShortField(term41069, term41069.getClass(), "day", (short) 19);
        setField(term41068, term41068.getClass(), "date", term41069);
        setByteField(term41073, term41073.getClass(), "hour", (byte) 1);
        setByteField(term41073, term41073.getClass(), "minute", (byte) 47);
        setByteField(term41073, term41073.getClass(), "second", (byte) 52);
        setIntField(term41073, term41073.getClass(), "nano", 666536453);
        setField(term41068, term41068.getClass(), "time", term41073);
        setField(term40934, term40934.getClass(), "firstPlayDate", term41068);
        setField(term40934, term40934.getClass(), "lastGameId", "KgfsAwTFFn");
        setField(term40934, term40934.getClass(), "lastRomVersion", "hFnFlgThhp");
        setField(term40934, term40934.getClass(), "lastDataVersion", "aEZAnHuGSR");
        setIntField(term41115, term41115.getClass(), "year", 2023);
        setShortField(term41115, term41115.getClass(), "month", (short) 12);
        setShortField(term41115, term41115.getClass(), "day", (short) 8);
        setField(term41114, term41114.getClass(), "date", term41115);
        setByteField(term41119, term41119.getClass(), "hour", (byte) 1);
        setByteField(term41119, term41119.getClass(), "minute", (byte) 26);
        setByteField(term41119, term41119.getClass(), "second", (byte) 38);
        setIntField(term41119, term41119.getClass(), "nano", 334721598);
        setField(term41114, term41114.getClass(), "time", term41119);
        setField(term40934, term40934.getClass(), "lastPlayDate", term41114);
        setIntField(term40934, term40934.getClass(), "lastPlaceId", 2014099129);
        setField(term40934, term40934.getClass(), "lastPlaceName", "uMzGGnJFYF");
        setField(term40934, term40934.getClass(), "lastRegionId", "iAIRLRjFkP");
        setField(term40934, term40934.getClass(), "lastRegionName", "cdXvvxXVTz");
        setField(term40934, term40934.getClass(), "lastAllNetId", "tXsfWIqIPn");
        setField(term40934, term40934.getClass(), "lastClientId", "tDmfqEyHaN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term40934, args);
    }

};


