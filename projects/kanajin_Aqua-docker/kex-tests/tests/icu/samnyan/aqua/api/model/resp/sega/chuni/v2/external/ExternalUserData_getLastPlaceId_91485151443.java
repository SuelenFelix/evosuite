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

public class ExternalUserData_getLastPlaceId_91485151443 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17244;

    public ExternalUserData_getLastPlaceId_91485151443() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17244 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData"));
        Object term17269 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17270 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17274 = newInstance(Class.forName("java.time.LocalTime"));
        Object term17330 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17331 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17335 = newInstance(Class.forName("java.time.LocalTime"));
        Object term17378 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17379 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17383 = newInstance(Class.forName("java.time.LocalTime"));
        Object term17424 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17425 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17429 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term17244, term17244.getClass(), "accessCode", "ZWcOCwKNvd");
        setField(term17244, term17244.getClass(), "userName", "GTmoNrziyc");
        setIntField(term17270, term17270.getClass(), "year", 2026);
        setShortField(term17270, term17270.getClass(), "month", (short) 7);
        setShortField(term17270, term17270.getClass(), "day", (short) 4);
        setField(term17269, term17269.getClass(), "date", term17270);
        setByteField(term17274, term17274.getClass(), "hour", (byte) 8);
        setByteField(term17274, term17274.getClass(), "minute", (byte) 51);
        setByteField(term17274, term17274.getClass(), "second", (byte) 9);
        setIntField(term17274, term17274.getClass(), "nano", 936880887);
        setField(term17269, term17269.getClass(), "time", term17274);
        setField(term17244, term17244.getClass(), "lastLoginDate", term17269);
        setBooleanField(term17244, term17244.getClass(), "isWebJoin", true);
        setField(term17244, term17244.getClass(), "webLimitDate", "LvztehSlhM");
        setIntField(term17244, term17244.getClass(), "level", -1421649118);
        setIntField(term17244, term17244.getClass(), "reincarnationNum", -511248284);
        setField(term17244, term17244.getClass(), "exp", "njvnWFTMxN");
        setLongField(term17244, term17244.getClass(), "point", 8512025621149521819L);
        setLongField(term17244, term17244.getClass(), "totalPoint", 2022482096970820459L);
        setIntField(term17244, term17244.getClass(), "playCount", 788630042);
        setIntField(term17244, term17244.getClass(), "multiPlayCount", 1430066560);
        setIntField(term17244, term17244.getClass(), "multiWinCount", 836734074);
        setIntField(term17244, term17244.getClass(), "requestResCount", -1747711865);
        setIntField(term17244, term17244.getClass(), "acceptResCount", 682812715);
        setIntField(term17244, term17244.getClass(), "successResCount", -1092883950);
        setIntField(term17244, term17244.getClass(), "playerRating", 950385621);
        setIntField(term17244, term17244.getClass(), "highestRating", -232352320);
        setIntField(term17244, term17244.getClass(), "nameplateId", -232333014);
        setIntField(term17244, term17244.getClass(), "frameId", -139694079);
        setIntField(term17244, term17244.getClass(), "characterId", -1602072035);
        setIntField(term17244, term17244.getClass(), "trophyId", 1902624392);
        setIntField(term17244, term17244.getClass(), "playedTutorialBit", 904607217);
        setIntField(term17244, term17244.getClass(), "firstTutorialCancelNum", 434914590);
        setIntField(term17244, term17244.getClass(), "masterTutorialCancelNum", 1983756621);
        setIntField(term17244, term17244.getClass(), "totalRepertoireCount", -2134711835);
        setIntField(term17244, term17244.getClass(), "totalMapNum", -1641244494);
        setLongField(term17244, term17244.getClass(), "totalHiScore", 6315101499811179240L);
        setLongField(term17244, term17244.getClass(), "totalBasicHighScore", -3033337370154155851L);
        setLongField(term17244, term17244.getClass(), "totalAdvancedHighScore", -3130003589475815807L);
        setLongField(term17244, term17244.getClass(), "totalExpertHighScore", -5344598381371854750L);
        setLongField(term17244, term17244.getClass(), "totalMasterHighScore", -3718250311794019732L);
        setIntField(term17331, term17331.getClass(), "year", 2022);
        setShortField(term17331, term17331.getClass(), "month", (short) 5);
        setShortField(term17331, term17331.getClass(), "day", (short) 26);
        setField(term17330, term17330.getClass(), "date", term17331);
        setByteField(term17335, term17335.getClass(), "hour", (byte) 6);
        setByteField(term17335, term17335.getClass(), "minute", (byte) 54);
        setByteField(term17335, term17335.getClass(), "second", (byte) 49);
        setIntField(term17335, term17335.getClass(), "nano", 822216068);
        setField(term17330, term17330.getClass(), "time", term17335);
        setField(term17244, term17244.getClass(), "eventWatchedDate", term17330);
        setIntField(term17244, term17244.getClass(), "friendCount", 1124282188);
        setBooleanField(term17244, term17244.getClass(), "isMaimai", false);
        setField(term17244, term17244.getClass(), "firstGameId", "fLRqcTSfzF");
        setField(term17244, term17244.getClass(), "firstRomVersion", "EBYHwsuWAU");
        setField(term17244, term17244.getClass(), "firstDataVersion", "PtIjKpiSix");
        setIntField(term17379, term17379.getClass(), "year", 2022);
        setShortField(term17379, term17379.getClass(), "month", (short) 12);
        setShortField(term17379, term17379.getClass(), "day", (short) 19);
        setField(term17378, term17378.getClass(), "date", term17379);
        setByteField(term17383, term17383.getClass(), "hour", (byte) 11);
        setByteField(term17383, term17383.getClass(), "minute", (byte) 25);
        setByteField(term17383, term17383.getClass(), "second", (byte) 6);
        setIntField(term17383, term17383.getClass(), "nano", 620469872);
        setField(term17378, term17378.getClass(), "time", term17383);
        setField(term17244, term17244.getClass(), "firstPlayDate", term17378);
        setField(term17244, term17244.getClass(), "lastGameId", "NZdTuwSCIM");
        setField(term17244, term17244.getClass(), "lastRomVersion", "dDHcmzPAmP");
        setField(term17244, term17244.getClass(), "lastDataVersion", "HEaTkWYBgv");
        setIntField(term17425, term17425.getClass(), "year", 2013);
        setShortField(term17425, term17425.getClass(), "month", (short) 5);
        setShortField(term17425, term17425.getClass(), "day", (short) 3);
        setField(term17424, term17424.getClass(), "date", term17425);
        setByteField(term17429, term17429.getClass(), "hour", (byte) 18);
        setByteField(term17429, term17429.getClass(), "minute", (byte) 52);
        setByteField(term17429, term17429.getClass(), "second", (byte) 15);
        setIntField(term17429, term17429.getClass(), "nano", 241685081);
        setField(term17424, term17424.getClass(), "time", term17429);
        setField(term17244, term17244.getClass(), "lastPlayDate", term17424);
        setIntField(term17244, term17244.getClass(), "lastPlaceId", -489441521);
        setField(term17244, term17244.getClass(), "lastPlaceName", "MpJsPKLTIU");
        setField(term17244, term17244.getClass(), "lastRegionId", "IiNCZfdouL");
        setField(term17244, term17244.getClass(), "lastRegionName", "AhOHzCsHKW");
        setField(term17244, term17244.getClass(), "lastAllNetId", "UqgLPaaAHi");
        setField(term17244, term17244.getClass(), "lastClientId", "xypryEkUPF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastPlaceId", argTypes, term17244, args);
    }

};


