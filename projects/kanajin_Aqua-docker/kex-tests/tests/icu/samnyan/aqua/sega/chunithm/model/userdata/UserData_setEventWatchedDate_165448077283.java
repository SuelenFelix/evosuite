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

public class UserData_setEventWatchedDate_165448077283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term164917;
     Object term165193;

    public UserData_setEventWatchedDate_165448077283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term164921 = new Long(-7205236974351118210L);
        term164917 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term164919 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term164935 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term164936 = newInstance(Class.forName("java.time.LocalDate"));
        Object term164940 = newInstance(Class.forName("java.time.LocalTime"));
        Object term164945 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term164946 = newInstance(Class.forName("java.time.LocalDate"));
        Object term164950 = newInstance(Class.forName("java.time.LocalTime"));
        Object term164967 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term164968 = newInstance(Class.forName("java.time.LocalDate"));
        Object term164972 = newInstance(Class.forName("java.time.LocalTime"));
        Object term165028 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term165029 = newInstance(Class.forName("java.time.LocalDate"));
        Object term165033 = newInstance(Class.forName("java.time.LocalTime"));
        Object term165076 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term165077 = newInstance(Class.forName("java.time.LocalDate"));
        Object term165081 = newInstance(Class.forName("java.time.LocalTime"));
        Object term165122 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term165123 = newInstance(Class.forName("java.time.LocalDate"));
        Object term165127 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term164917, term164917.getClass(), "id", 1741745847767936524L);
        setLongField(term164919, term164919.getClass(), "id", -7813097860460548694L);
        setField(term164919, term164919.getClass(), "extId", term164921);
        setField(term164919, term164919.getClass(), "luid", "yiNDXYaPYF");
        setIntField(term164936, term164936.getClass(), "year", 2020);
        setShortField(term164936, term164936.getClass(), "month", (short) 9);
        setShortField(term164936, term164936.getClass(), "day", (short) 29);
        setField(term164935, term164935.getClass(), "date", term164936);
        setByteField(term164940, term164940.getClass(), "hour", (byte) 22);
        setByteField(term164940, term164940.getClass(), "minute", (byte) 41);
        setByteField(term164940, term164940.getClass(), "second", (byte) 24);
        setIntField(term164940, term164940.getClass(), "nano", 580585241);
        setField(term164935, term164935.getClass(), "time", term164940);
        setField(term164919, term164919.getClass(), "registerTime", term164935);
        setIntField(term164946, term164946.getClass(), "year", 2025);
        setShortField(term164946, term164946.getClass(), "month", (short) 3);
        setShortField(term164946, term164946.getClass(), "day", (short) 21);
        setField(term164945, term164945.getClass(), "date", term164946);
        setByteField(term164950, term164950.getClass(), "hour", (byte) 12);
        setByteField(term164950, term164950.getClass(), "minute", (byte) 9);
        setByteField(term164950, term164950.getClass(), "second", (byte) 15);
        setIntField(term164950, term164950.getClass(), "nano", 81445403);
        setField(term164945, term164945.getClass(), "time", term164950);
        setField(term164919, term164919.getClass(), "accessTime", term164945);
        setField(term164917, term164917.getClass(), "card", term164919);
        setField(term164917, term164917.getClass(), "userName", "lQfbJGzgkN");
        setIntField(term164968, term164968.getClass(), "year", 2020);
        setShortField(term164968, term164968.getClass(), "month", (short) 4);
        setShortField(term164968, term164968.getClass(), "day", (short) 11);
        setField(term164967, term164967.getClass(), "date", term164968);
        setByteField(term164972, term164972.getClass(), "hour", (byte) 20);
        setByteField(term164972, term164972.getClass(), "minute", (byte) 16);
        setByteField(term164972, term164972.getClass(), "second", (byte) 18);
        setIntField(term164972, term164972.getClass(), "nano", 309930973);
        setField(term164967, term164967.getClass(), "time", term164972);
        setField(term164917, term164917.getClass(), "lastLoginDate", term164967);
        setBooleanField(term164917, term164917.getClass(), "isWebJoin", false);
        setField(term164917, term164917.getClass(), "webLimitDate", "vCTyZdNoZR");
        setIntField(term164917, term164917.getClass(), "level", -393770145);
        setIntField(term164917, term164917.getClass(), "reincarnationNum", 772000733);
        setField(term164917, term164917.getClass(), "exp", "CUvKslUjGD");
        setLongField(term164917, term164917.getClass(), "point", -2180637454140991363L);
        setLongField(term164917, term164917.getClass(), "totalPoint", -3593615111110492012L);
        setIntField(term164917, term164917.getClass(), "playCount", -1694461759);
        setIntField(term164917, term164917.getClass(), "multiPlayCount", -1209885402);
        setIntField(term164917, term164917.getClass(), "multiWinCount", 544600300);
        setIntField(term164917, term164917.getClass(), "requestResCount", 680424981);
        setIntField(term164917, term164917.getClass(), "acceptResCount", -972500336);
        setIntField(term164917, term164917.getClass(), "successResCount", 1208675424);
        setIntField(term164917, term164917.getClass(), "playerRating", 1546061631);
        setIntField(term164917, term164917.getClass(), "highestRating", -1211628823);
        setIntField(term164917, term164917.getClass(), "nameplateId", -1281293973);
        setIntField(term164917, term164917.getClass(), "frameId", -542138921);
        setIntField(term164917, term164917.getClass(), "characterId", 1572030763);
        setIntField(term164917, term164917.getClass(), "trophyId", -1020308117);
        setIntField(term164917, term164917.getClass(), "playedTutorialBit", -1195161500);
        setIntField(term164917, term164917.getClass(), "firstTutorialCancelNum", -824702620);
        setIntField(term164917, term164917.getClass(), "masterTutorialCancelNum", -1695248876);
        setIntField(term164917, term164917.getClass(), "totalRepertoireCount", 1112501548);
        setIntField(term164917, term164917.getClass(), "totalMapNum", -519151155);
        setLongField(term164917, term164917.getClass(), "totalHiScore", 659947615533781814L);
        setLongField(term164917, term164917.getClass(), "totalBasicHighScore", -4752004427270923675L);
        setLongField(term164917, term164917.getClass(), "totalAdvancedHighScore", -5521161457467523042L);
        setLongField(term164917, term164917.getClass(), "totalExpertHighScore", 5986332249270190194L);
        setLongField(term164917, term164917.getClass(), "totalMasterHighScore", -3409249187038060561L);
        setIntField(term165029, term165029.getClass(), "year", 2014);
        setShortField(term165029, term165029.getClass(), "month", (short) 10);
        setShortField(term165029, term165029.getClass(), "day", (short) 4);
        setField(term165028, term165028.getClass(), "date", term165029);
        setByteField(term165033, term165033.getClass(), "hour", (byte) 10);
        setByteField(term165033, term165033.getClass(), "minute", (byte) 16);
        setByteField(term165033, term165033.getClass(), "second", (byte) 19);
        setIntField(term165033, term165033.getClass(), "nano", 599774724);
        setField(term165028, term165028.getClass(), "time", term165033);
        setField(term164917, term164917.getClass(), "eventWatchedDate", term165028);
        setIntField(term164917, term164917.getClass(), "friendCount", -403167960);
        setBooleanField(term164917, term164917.getClass(), "isMaimai", true);
        setField(term164917, term164917.getClass(), "firstGameId", "WIGBWJtmAB");
        setField(term164917, term164917.getClass(), "firstRomVersion", "QBaceAmfVr");
        setField(term164917, term164917.getClass(), "firstDataVersion", "hWLfpgPZDo");
        setIntField(term165077, term165077.getClass(), "year", 2025);
        setShortField(term165077, term165077.getClass(), "month", (short) 7);
        setShortField(term165077, term165077.getClass(), "day", (short) 6);
        setField(term165076, term165076.getClass(), "date", term165077);
        setByteField(term165081, term165081.getClass(), "hour", (byte) 20);
        setByteField(term165081, term165081.getClass(), "minute", (byte) 18);
        setByteField(term165081, term165081.getClass(), "second", (byte) 19);
        setIntField(term165081, term165081.getClass(), "nano", 280923217);
        setField(term165076, term165076.getClass(), "time", term165081);
        setField(term164917, term164917.getClass(), "firstPlayDate", term165076);
        setField(term164917, term164917.getClass(), "lastGameId", "YVKAmDRCvR");
        setField(term164917, term164917.getClass(), "lastRomVersion", "HseZXIAzZp");
        setField(term164917, term164917.getClass(), "lastDataVersion", "jbkKYvnNUK");
        setIntField(term165123, term165123.getClass(), "year", 2018);
        setShortField(term165123, term165123.getClass(), "month", (short) 6);
        setShortField(term165123, term165123.getClass(), "day", (short) 5);
        setField(term165122, term165122.getClass(), "date", term165123);
        setByteField(term165127, term165127.getClass(), "hour", (byte) 12);
        setByteField(term165127, term165127.getClass(), "minute", (byte) 21);
        setByteField(term165127, term165127.getClass(), "second", (byte) 13);
        setIntField(term165127, term165127.getClass(), "nano", 440529578);
        setField(term165122, term165122.getClass(), "time", term165127);
        setField(term164917, term164917.getClass(), "lastPlayDate", term165122);
        setIntField(term164917, term164917.getClass(), "lastPlaceId", 2052324257);
        setField(term164917, term164917.getClass(), "lastPlaceName", "qBnhTJalNA");
        setField(term164917, term164917.getClass(), "lastRegionId", "sgpNzhEbZp");
        setField(term164917, term164917.getClass(), "lastRegionName", "JrardfRgpb");
        setField(term164917, term164917.getClass(), "lastAllNetId", "LNnXYTWbVh");
        setField(term164917, term164917.getClass(), "lastClientId", "IsSVVsKoyt");
        term165193 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term165194 = newInstance(Class.forName("java.time.LocalDate"));
        Object term165198 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term165194, term165194.getClass(), "year", 2028);
        setShortField(term165194, term165194.getClass(), "month", (short) 5);
        setShortField(term165194, term165194.getClass(), "day", (short) 11);
        setField(term165193, term165193.getClass(), "date", term165194);
        setByteField(term165198, term165198.getClass(), "hour", (byte) 14);
        setByteField(term165198, term165198.getClass(), "minute", (byte) 57);
        setByteField(term165198, term165198.getClass(), "second", (byte) 16);
        setIntField(term165198, term165198.getClass(), "nano", 386804601);
        setField(term165193, term165193.getClass(), "time", term165198);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term165193;
        callMethod(klass, "setEventWatchedDate", argTypes, term164917, args);
    }

};


