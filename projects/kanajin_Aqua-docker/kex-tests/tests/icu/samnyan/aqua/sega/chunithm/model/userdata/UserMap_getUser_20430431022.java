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

public class UserMap_getUser_20430431022 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term279262;

    public UserMap_getUser_20430431022() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term279268 = new Long(797798302378380033L);
        term279262 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMap"));
        Object term279264 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term279266 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term279282 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term279283 = newInstance(Class.forName("java.time.LocalDate"));
        Object term279287 = newInstance(Class.forName("java.time.LocalTime"));
        Object term279292 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term279293 = newInstance(Class.forName("java.time.LocalDate"));
        Object term279297 = newInstance(Class.forName("java.time.LocalTime"));
        Object term279314 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term279315 = newInstance(Class.forName("java.time.LocalDate"));
        Object term279319 = newInstance(Class.forName("java.time.LocalTime"));
        Object term279375 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term279376 = newInstance(Class.forName("java.time.LocalDate"));
        Object term279380 = newInstance(Class.forName("java.time.LocalTime"));
        Object term279423 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term279424 = newInstance(Class.forName("java.time.LocalDate"));
        Object term279428 = newInstance(Class.forName("java.time.LocalTime"));
        Object term279469 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term279470 = newInstance(Class.forName("java.time.LocalDate"));
        Object term279474 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term279262, term279262.getClass(), "id", 4068660933771121363L);
        setLongField(term279264, term279264.getClass(), "id", 2985864539120934146L);
        setLongField(term279266, term279266.getClass(), "id", -66419523700932945L);
        setField(term279266, term279266.getClass(), "extId", term279268);
        setField(term279266, term279266.getClass(), "luid", "veGctJDCVu");
        setIntField(term279283, term279283.getClass(), "year", 2019);
        setShortField(term279283, term279283.getClass(), "month", (short) 7);
        setShortField(term279283, term279283.getClass(), "day", (short) 26);
        setField(term279282, term279282.getClass(), "date", term279283);
        setByteField(term279287, term279287.getClass(), "hour", (byte) 11);
        setByteField(term279287, term279287.getClass(), "minute", (byte) 58);
        setByteField(term279287, term279287.getClass(), "second", (byte) 30);
        setIntField(term279287, term279287.getClass(), "nano", 879061372);
        setField(term279282, term279282.getClass(), "time", term279287);
        setField(term279266, term279266.getClass(), "registerTime", term279282);
        setIntField(term279293, term279293.getClass(), "year", 2019);
        setShortField(term279293, term279293.getClass(), "month", (short) 8);
        setShortField(term279293, term279293.getClass(), "day", (short) 5);
        setField(term279292, term279292.getClass(), "date", term279293);
        setByteField(term279297, term279297.getClass(), "hour", (byte) 16);
        setByteField(term279297, term279297.getClass(), "minute", (byte) 22);
        setByteField(term279297, term279297.getClass(), "second", (byte) 43);
        setIntField(term279297, term279297.getClass(), "nano", 870855715);
        setField(term279292, term279292.getClass(), "time", term279297);
        setField(term279266, term279266.getClass(), "accessTime", term279292);
        setField(term279264, term279264.getClass(), "card", term279266);
        setField(term279264, term279264.getClass(), "userName", "qWiNHIOSQh");
        setIntField(term279315, term279315.getClass(), "year", 2013);
        setShortField(term279315, term279315.getClass(), "month", (short) 4);
        setShortField(term279315, term279315.getClass(), "day", (short) 11);
        setField(term279314, term279314.getClass(), "date", term279315);
        setByteField(term279319, term279319.getClass(), "hour", (byte) 6);
        setByteField(term279319, term279319.getClass(), "minute", (byte) 40);
        setByteField(term279319, term279319.getClass(), "second", (byte) 45);
        setIntField(term279319, term279319.getClass(), "nano", 348855014);
        setField(term279314, term279314.getClass(), "time", term279319);
        setField(term279264, term279264.getClass(), "lastLoginDate", term279314);
        setBooleanField(term279264, term279264.getClass(), "isWebJoin", false);
        setField(term279264, term279264.getClass(), "webLimitDate", "iyKXXnfbdP");
        setIntField(term279264, term279264.getClass(), "level", -2040339650);
        setIntField(term279264, term279264.getClass(), "reincarnationNum", -1201443594);
        setField(term279264, term279264.getClass(), "exp", "GrnLzQSLgP");
        setLongField(term279264, term279264.getClass(), "point", 6949812586987088557L);
        setLongField(term279264, term279264.getClass(), "totalPoint", 6578303124806212669L);
        setIntField(term279264, term279264.getClass(), "playCount", 49361066);
        setIntField(term279264, term279264.getClass(), "multiPlayCount", -1429526464);
        setIntField(term279264, term279264.getClass(), "multiWinCount", 1223961715);
        setIntField(term279264, term279264.getClass(), "requestResCount", 240428767);
        setIntField(term279264, term279264.getClass(), "acceptResCount", 495648720);
        setIntField(term279264, term279264.getClass(), "successResCount", -1601485867);
        setIntField(term279264, term279264.getClass(), "playerRating", 1998131577);
        setIntField(term279264, term279264.getClass(), "highestRating", -796385132);
        setIntField(term279264, term279264.getClass(), "nameplateId", 764130450);
        setIntField(term279264, term279264.getClass(), "frameId", 88245264);
        setIntField(term279264, term279264.getClass(), "characterId", 1442828973);
        setIntField(term279264, term279264.getClass(), "trophyId", 935972072);
        setIntField(term279264, term279264.getClass(), "playedTutorialBit", 150265946);
        setIntField(term279264, term279264.getClass(), "firstTutorialCancelNum", 1626027490);
        setIntField(term279264, term279264.getClass(), "masterTutorialCancelNum", -1464025625);
        setIntField(term279264, term279264.getClass(), "totalRepertoireCount", 2015899963);
        setIntField(term279264, term279264.getClass(), "totalMapNum", 679633464);
        setLongField(term279264, term279264.getClass(), "totalHiScore", -9062864130224560298L);
        setLongField(term279264, term279264.getClass(), "totalBasicHighScore", -1322070514457737058L);
        setLongField(term279264, term279264.getClass(), "totalAdvancedHighScore", 34771316986040907L);
        setLongField(term279264, term279264.getClass(), "totalExpertHighScore", 2555076423360346949L);
        setLongField(term279264, term279264.getClass(), "totalMasterHighScore", 4097039108785248322L);
        setIntField(term279376, term279376.getClass(), "year", 2028);
        setShortField(term279376, term279376.getClass(), "month", (short) 5);
        setShortField(term279376, term279376.getClass(), "day", (short) 29);
        setField(term279375, term279375.getClass(), "date", term279376);
        setByteField(term279380, term279380.getClass(), "hour", (byte) 9);
        setByteField(term279380, term279380.getClass(), "minute", (byte) 42);
        setByteField(term279380, term279380.getClass(), "second", (byte) 40);
        setIntField(term279380, term279380.getClass(), "nano", 347871399);
        setField(term279375, term279375.getClass(), "time", term279380);
        setField(term279264, term279264.getClass(), "eventWatchedDate", term279375);
        setIntField(term279264, term279264.getClass(), "friendCount", 696207020);
        setBooleanField(term279264, term279264.getClass(), "isMaimai", true);
        setField(term279264, term279264.getClass(), "firstGameId", "rSNlwQrRPz");
        setField(term279264, term279264.getClass(), "firstRomVersion", "xKEzbRMPpP");
        setField(term279264, term279264.getClass(), "firstDataVersion", "mxNOSqFuhi");
        setIntField(term279424, term279424.getClass(), "year", 2023);
        setShortField(term279424, term279424.getClass(), "month", (short) 10);
        setShortField(term279424, term279424.getClass(), "day", (short) 16);
        setField(term279423, term279423.getClass(), "date", term279424);
        setByteField(term279428, term279428.getClass(), "hour", (byte) 13);
        setByteField(term279428, term279428.getClass(), "minute", (byte) 34);
        setByteField(term279428, term279428.getClass(), "second", (byte) 51);
        setIntField(term279428, term279428.getClass(), "nano", 896575404);
        setField(term279423, term279423.getClass(), "time", term279428);
        setField(term279264, term279264.getClass(), "firstPlayDate", term279423);
        setField(term279264, term279264.getClass(), "lastGameId", "PAZrXfKSSy");
        setField(term279264, term279264.getClass(), "lastRomVersion", "tsZmZiLwvf");
        setField(term279264, term279264.getClass(), "lastDataVersion", "PcMXaJAFsa");
        setIntField(term279470, term279470.getClass(), "year", 2020);
        setShortField(term279470, term279470.getClass(), "month", (short) 8);
        setShortField(term279470, term279470.getClass(), "day", (short) 2);
        setField(term279469, term279469.getClass(), "date", term279470);
        setByteField(term279474, term279474.getClass(), "hour", (byte) 13);
        setByteField(term279474, term279474.getClass(), "minute", (byte) 34);
        setByteField(term279474, term279474.getClass(), "second", (byte) 10);
        setIntField(term279474, term279474.getClass(), "nano", 335261673);
        setField(term279469, term279469.getClass(), "time", term279474);
        setField(term279264, term279264.getClass(), "lastPlayDate", term279469);
        setIntField(term279264, term279264.getClass(), "lastPlaceId", -764517409);
        setField(term279264, term279264.getClass(), "lastPlaceName", "prPCXDaclm");
        setField(term279264, term279264.getClass(), "lastRegionId", "HpYrZqtpjz");
        setField(term279264, term279264.getClass(), "lastRegionName", "dHWPzCnTgu");
        setField(term279264, term279264.getClass(), "lastAllNetId", "ZsLVOMoUYo");
        setField(term279264, term279264.getClass(), "lastClientId", "TwUxYxbDNT");
        setField(term279262, term279262.getClass(), "user", term279264);
        setIntField(term279262, term279262.getClass(), "mapId", -1031341811);
        setIntField(term279262, term279262.getClass(), "position", 1746547938);
        setBooleanField(term279262, term279262.getClass(), "isClear", true);
        setIntField(term279262, term279262.getClass(), "areaId", -1990552588);
        setIntField(term279262, term279262.getClass(), "routeNumber", 866467788);
        setIntField(term279262, term279262.getClass(), "eventId", -309416237);
        setIntField(term279262, term279262.getClass(), "rate", -1872979717);
        setIntField(term279262, term279262.getClass(), "statusCount", 1715864149);
        setBooleanField(term279262, term279262.getClass(), "isValid", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term279262, args);
    }

};


