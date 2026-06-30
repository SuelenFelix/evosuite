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

public class ExternalUserData_setTotalMapNum_72059762675 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30216;
     Object term30467;

    public ExternalUserData_setTotalMapNum_72059762675() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30216 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData"));
        Object term30241 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30242 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30246 = newInstance(Class.forName("java.time.LocalTime"));
        Object term30302 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30303 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30307 = newInstance(Class.forName("java.time.LocalTime"));
        Object term30350 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30351 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30355 = newInstance(Class.forName("java.time.LocalTime"));
        Object term30396 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30397 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30401 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term30216, term30216.getClass(), "accessCode", "KqQOTshBOL");
        setField(term30216, term30216.getClass(), "userName", "cuWgFcYkPC");
        setIntField(term30242, term30242.getClass(), "year", 2028);
        setShortField(term30242, term30242.getClass(), "month", (short) 5);
        setShortField(term30242, term30242.getClass(), "day", (short) 23);
        setField(term30241, term30241.getClass(), "date", term30242);
        setByteField(term30246, term30246.getClass(), "hour", (byte) 6);
        setByteField(term30246, term30246.getClass(), "minute", (byte) 0);
        setByteField(term30246, term30246.getClass(), "second", (byte) 51);
        setIntField(term30246, term30246.getClass(), "nano", 258967293);
        setField(term30241, term30241.getClass(), "time", term30246);
        setField(term30216, term30216.getClass(), "lastLoginDate", term30241);
        setBooleanField(term30216, term30216.getClass(), "isWebJoin", false);
        setField(term30216, term30216.getClass(), "webLimitDate", "HfbcOKkXBm");
        setIntField(term30216, term30216.getClass(), "level", 407708341);
        setIntField(term30216, term30216.getClass(), "reincarnationNum", -287519200);
        setField(term30216, term30216.getClass(), "exp", "pLbTzSMbsN");
        setLongField(term30216, term30216.getClass(), "point", 7656211287234019484L);
        setLongField(term30216, term30216.getClass(), "totalPoint", -872579514000598474L);
        setIntField(term30216, term30216.getClass(), "playCount", -1490696181);
        setIntField(term30216, term30216.getClass(), "multiPlayCount", 623717232);
        setIntField(term30216, term30216.getClass(), "multiWinCount", -1413291732);
        setIntField(term30216, term30216.getClass(), "requestResCount", 203264365);
        setIntField(term30216, term30216.getClass(), "acceptResCount", -1066281036);
        setIntField(term30216, term30216.getClass(), "successResCount", 30837706);
        setIntField(term30216, term30216.getClass(), "playerRating", 379523101);
        setIntField(term30216, term30216.getClass(), "highestRating", 1017354215);
        setIntField(term30216, term30216.getClass(), "nameplateId", 695330987);
        setIntField(term30216, term30216.getClass(), "frameId", -267289967);
        setIntField(term30216, term30216.getClass(), "characterId", 773432822);
        setIntField(term30216, term30216.getClass(), "trophyId", -488294922);
        setIntField(term30216, term30216.getClass(), "playedTutorialBit", -397161164);
        setIntField(term30216, term30216.getClass(), "firstTutorialCancelNum", -703717191);
        setIntField(term30216, term30216.getClass(), "masterTutorialCancelNum", -1255535445);
        setIntField(term30216, term30216.getClass(), "totalRepertoireCount", -2033952124);
        setIntField(term30216, term30216.getClass(), "totalMapNum", 560401653);
        setLongField(term30216, term30216.getClass(), "totalHiScore", 5097769785635819744L);
        setLongField(term30216, term30216.getClass(), "totalBasicHighScore", 9192899183781208922L);
        setLongField(term30216, term30216.getClass(), "totalAdvancedHighScore", -7705159544905337794L);
        setLongField(term30216, term30216.getClass(), "totalExpertHighScore", 678465732474023847L);
        setLongField(term30216, term30216.getClass(), "totalMasterHighScore", 2551047634163864862L);
        setIntField(term30303, term30303.getClass(), "year", 2017);
        setShortField(term30303, term30303.getClass(), "month", (short) 1);
        setShortField(term30303, term30303.getClass(), "day", (short) 3);
        setField(term30302, term30302.getClass(), "date", term30303);
        setByteField(term30307, term30307.getClass(), "hour", (byte) 14);
        setByteField(term30307, term30307.getClass(), "minute", (byte) 1);
        setByteField(term30307, term30307.getClass(), "second", (byte) 1);
        setIntField(term30307, term30307.getClass(), "nano", 827128674);
        setField(term30302, term30302.getClass(), "time", term30307);
        setField(term30216, term30216.getClass(), "eventWatchedDate", term30302);
        setIntField(term30216, term30216.getClass(), "friendCount", 1633691536);
        setBooleanField(term30216, term30216.getClass(), "isMaimai", true);
        setField(term30216, term30216.getClass(), "firstGameId", "lFSbxerCPP");
        setField(term30216, term30216.getClass(), "firstRomVersion", "vjaZIyixCm");
        setField(term30216, term30216.getClass(), "firstDataVersion", "gAAPyftlIR");
        setIntField(term30351, term30351.getClass(), "year", 2022);
        setShortField(term30351, term30351.getClass(), "month", (short) 9);
        setShortField(term30351, term30351.getClass(), "day", (short) 3);
        setField(term30350, term30350.getClass(), "date", term30351);
        setByteField(term30355, term30355.getClass(), "hour", (byte) 22);
        setByteField(term30355, term30355.getClass(), "minute", (byte) 31);
        setByteField(term30355, term30355.getClass(), "second", (byte) 44);
        setIntField(term30355, term30355.getClass(), "nano", 798112760);
        setField(term30350, term30350.getClass(), "time", term30355);
        setField(term30216, term30216.getClass(), "firstPlayDate", term30350);
        setField(term30216, term30216.getClass(), "lastGameId", "kevWstoxwq");
        setField(term30216, term30216.getClass(), "lastRomVersion", "aSYOhFwzSm");
        setField(term30216, term30216.getClass(), "lastDataVersion", "pVZlzrBeDB");
        setIntField(term30397, term30397.getClass(), "year", 2018);
        setShortField(term30397, term30397.getClass(), "month", (short) 7);
        setShortField(term30397, term30397.getClass(), "day", (short) 24);
        setField(term30396, term30396.getClass(), "date", term30397);
        setByteField(term30401, term30401.getClass(), "hour", (byte) 8);
        setByteField(term30401, term30401.getClass(), "minute", (byte) 32);
        setByteField(term30401, term30401.getClass(), "second", (byte) 43);
        setIntField(term30401, term30401.getClass(), "nano", 490940025);
        setField(term30396, term30396.getClass(), "time", term30401);
        setField(term30216, term30216.getClass(), "lastPlayDate", term30396);
        setIntField(term30216, term30216.getClass(), "lastPlaceId", 898165245);
        setField(term30216, term30216.getClass(), "lastPlaceName", "EfSUvjuZAA");
        setField(term30216, term30216.getClass(), "lastRegionId", "PrHWfHydsG");
        setField(term30216, term30216.getClass(), "lastRegionName", "igruEzTbBE");
        setField(term30216, term30216.getClass(), "lastAllNetId", "LFjgROsRUV");
        setField(term30216, term30216.getClass(), "lastClientId", "kHxujKiCsr");
        term30467 = new Integer(1810754549);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term30467;
        callMethod(klass, "setTotalMapNum", argTypes, term30216, args);
    }

};


