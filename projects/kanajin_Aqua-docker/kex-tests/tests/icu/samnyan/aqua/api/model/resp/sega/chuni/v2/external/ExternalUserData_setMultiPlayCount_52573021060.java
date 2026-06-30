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
import java.lang.Integer;

public class ExternalUserData_setMultiPlayCount_52573021060 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24171;
     Object term24422;

    public ExternalUserData_setMultiPlayCount_52573021060() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24171 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData"));
        Object term24196 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24197 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24201 = newInstance(Class.forName("java.time.LocalTime"));
        Object term24257 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24258 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24262 = newInstance(Class.forName("java.time.LocalTime"));
        Object term24305 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24306 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24310 = newInstance(Class.forName("java.time.LocalTime"));
        Object term24351 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24352 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24356 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term24171, term24171.getClass(), "accessCode", "VAGkRppBem");
        setField(term24171, term24171.getClass(), "userName", "eKcEJRxNSu");
        setIntField(term24197, term24197.getClass(), "year", 2010);
        setShortField(term24197, term24197.getClass(), "month", (short) 3);
        setShortField(term24197, term24197.getClass(), "day", (short) 23);
        setField(term24196, term24196.getClass(), "date", term24197);
        setByteField(term24201, term24201.getClass(), "hour", (byte) 17);
        setByteField(term24201, term24201.getClass(), "minute", (byte) 32);
        setByteField(term24201, term24201.getClass(), "second", (byte) 36);
        setIntField(term24201, term24201.getClass(), "nano", 470582535);
        setField(term24196, term24196.getClass(), "time", term24201);
        setField(term24171, term24171.getClass(), "lastLoginDate", term24196);
        setBooleanField(term24171, term24171.getClass(), "isWebJoin", false);
        setField(term24171, term24171.getClass(), "webLimitDate", "NTXQPWFYSA");
        setIntField(term24171, term24171.getClass(), "level", -1652588127);
        setIntField(term24171, term24171.getClass(), "reincarnationNum", -1902823385);
        setField(term24171, term24171.getClass(), "exp", "fOuOhBpldm");
        setLongField(term24171, term24171.getClass(), "point", 8010417010297313651L);
        setLongField(term24171, term24171.getClass(), "totalPoint", 5845993504299821981L);
        setIntField(term24171, term24171.getClass(), "playCount", -784924879);
        setIntField(term24171, term24171.getClass(), "multiPlayCount", -1062027102);
        setIntField(term24171, term24171.getClass(), "multiWinCount", 1763217806);
        setIntField(term24171, term24171.getClass(), "requestResCount", 1644949396);
        setIntField(term24171, term24171.getClass(), "acceptResCount", -2017073245);
        setIntField(term24171, term24171.getClass(), "successResCount", 522440332);
        setIntField(term24171, term24171.getClass(), "playerRating", 1516598327);
        setIntField(term24171, term24171.getClass(), "highestRating", 82353584);
        setIntField(term24171, term24171.getClass(), "nameplateId", -758778797);
        setIntField(term24171, term24171.getClass(), "frameId", 765680355);
        setIntField(term24171, term24171.getClass(), "characterId", -1012090049);
        setIntField(term24171, term24171.getClass(), "trophyId", -2025214553);
        setIntField(term24171, term24171.getClass(), "playedTutorialBit", -154750730);
        setIntField(term24171, term24171.getClass(), "firstTutorialCancelNum", -2047179134);
        setIntField(term24171, term24171.getClass(), "masterTutorialCancelNum", 44908093);
        setIntField(term24171, term24171.getClass(), "totalRepertoireCount", 887198203);
        setIntField(term24171, term24171.getClass(), "totalMapNum", 12581312);
        setLongField(term24171, term24171.getClass(), "totalHiScore", -1528017371096319990L);
        setLongField(term24171, term24171.getClass(), "totalBasicHighScore", -1526328443223793465L);
        setLongField(term24171, term24171.getClass(), "totalAdvancedHighScore", -412186147449928821L);
        setLongField(term24171, term24171.getClass(), "totalExpertHighScore", -1449569009562240465L);
        setLongField(term24171, term24171.getClass(), "totalMasterHighScore", 2287449183416662404L);
        setIntField(term24258, term24258.getClass(), "year", 2024);
        setShortField(term24258, term24258.getClass(), "month", (short) 9);
        setShortField(term24258, term24258.getClass(), "day", (short) 7);
        setField(term24257, term24257.getClass(), "date", term24258);
        setByteField(term24262, term24262.getClass(), "hour", (byte) 2);
        setByteField(term24262, term24262.getClass(), "minute", (byte) 37);
        setByteField(term24262, term24262.getClass(), "second", (byte) 4);
        setIntField(term24262, term24262.getClass(), "nano", 236043949);
        setField(term24257, term24257.getClass(), "time", term24262);
        setField(term24171, term24171.getClass(), "eventWatchedDate", term24257);
        setIntField(term24171, term24171.getClass(), "friendCount", 2087383644);
        setBooleanField(term24171, term24171.getClass(), "isMaimai", false);
        setField(term24171, term24171.getClass(), "firstGameId", "qQQRKGPyIM");
        setField(term24171, term24171.getClass(), "firstRomVersion", "lzcwhvjdFg");
        setField(term24171, term24171.getClass(), "firstDataVersion", "dfzWTjcjnI");
        setIntField(term24306, term24306.getClass(), "year", 2025);
        setShortField(term24306, term24306.getClass(), "month", (short) 7);
        setShortField(term24306, term24306.getClass(), "day", (short) 4);
        setField(term24305, term24305.getClass(), "date", term24306);
        setByteField(term24310, term24310.getClass(), "hour", (byte) 18);
        setByteField(term24310, term24310.getClass(), "minute", (byte) 13);
        setByteField(term24310, term24310.getClass(), "second", (byte) 37);
        setIntField(term24310, term24310.getClass(), "nano", 681447348);
        setField(term24305, term24305.getClass(), "time", term24310);
        setField(term24171, term24171.getClass(), "firstPlayDate", term24305);
        setField(term24171, term24171.getClass(), "lastGameId", "bsnZXGEvFv");
        setField(term24171, term24171.getClass(), "lastRomVersion", "osFrHWYeRy");
        setField(term24171, term24171.getClass(), "lastDataVersion", "scpIQUfPKw");
        setIntField(term24352, term24352.getClass(), "year", 2025);
        setShortField(term24352, term24352.getClass(), "month", (short) 1);
        setShortField(term24352, term24352.getClass(), "day", (short) 20);
        setField(term24351, term24351.getClass(), "date", term24352);
        setByteField(term24356, term24356.getClass(), "hour", (byte) 22);
        setByteField(term24356, term24356.getClass(), "minute", (byte) 55);
        setByteField(term24356, term24356.getClass(), "second", (byte) 9);
        setIntField(term24356, term24356.getClass(), "nano", 660955568);
        setField(term24351, term24351.getClass(), "time", term24356);
        setField(term24171, term24171.getClass(), "lastPlayDate", term24351);
        setIntField(term24171, term24171.getClass(), "lastPlaceId", 405527523);
        setField(term24171, term24171.getClass(), "lastPlaceName", "QKYBpCjuYt");
        setField(term24171, term24171.getClass(), "lastRegionId", "vjiRfoGdkl");
        setField(term24171, term24171.getClass(), "lastRegionName", "TwaxeSHvnR");
        setField(term24171, term24171.getClass(), "lastAllNetId", "paPzDETzIq");
        setField(term24171, term24171.getClass(), "lastClientId", "fufeuGfwpN");
        term24422 = new Integer(-1123526433);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term24422;
        callMethod(klass, "setMultiPlayCount", argTypes, term24171, args);
    }

};


