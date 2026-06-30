package icu.samnyan.aqua.sega.maimai.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserGeneralData_hashCode_205813137211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111433;

    public UserGeneralData_hashCode_205813137211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term111439 = new Long(9214973322210954344L);
        term111433 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserGeneralData"));
        Object term111435 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term111437 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term111453 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term111454 = newInstance(Class.forName("java.time.LocalDate"));
        Object term111458 = newInstance(Class.forName("java.time.LocalTime"));
        Object term111463 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term111464 = newInstance(Class.forName("java.time.LocalDate"));
        Object term111468 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term111433, term111433.getClass(), "id", -7304801244306393588L);
        setLongField(term111435, term111435.getClass(), "id", 1676018795123486151L);
        setLongField(term111437, term111437.getClass(), "id", 8578275227150470673L);
        setField(term111437, term111437.getClass(), "extId", term111439);
        setField(term111437, term111437.getClass(), "luid", "vdErTHSsJu");
        setIntField(term111454, term111454.getClass(), "year", 2019);
        setShortField(term111454, term111454.getClass(), "month", (short) 4);
        setShortField(term111454, term111454.getClass(), "day", (short) 21);
        setField(term111453, term111453.getClass(), "date", term111454);
        setByteField(term111458, term111458.getClass(), "hour", (byte) 17);
        setByteField(term111458, term111458.getClass(), "minute", (byte) 1);
        setByteField(term111458, term111458.getClass(), "second", (byte) 1);
        setIntField(term111458, term111458.getClass(), "nano", 802156649);
        setField(term111453, term111453.getClass(), "time", term111458);
        setField(term111437, term111437.getClass(), "registerTime", term111453);
        setIntField(term111464, term111464.getClass(), "year", 2029);
        setShortField(term111464, term111464.getClass(), "month", (short) 8);
        setShortField(term111464, term111464.getClass(), "day", (short) 7);
        setField(term111463, term111463.getClass(), "date", term111464);
        setByteField(term111468, term111468.getClass(), "hour", (byte) 5);
        setByteField(term111468, term111468.getClass(), "minute", (byte) 54);
        setByteField(term111468, term111468.getClass(), "second", (byte) 5);
        setIntField(term111468, term111468.getClass(), "nano", 873009584);
        setField(term111463, term111463.getClass(), "time", term111468);
        setField(term111437, term111437.getClass(), "accessTime", term111463);
        setField(term111435, term111435.getClass(), "card", term111437);
        setIntField(term111435, term111435.getClass(), "lastDataVersion", 2095561765);
        setField(term111435, term111435.getClass(), "userName", "MeFZCtLbdV");
        setIntField(term111435, term111435.getClass(), "point", -874380115);
        setIntField(term111435, term111435.getClass(), "totalPoint", 489952093);
        setIntField(term111435, term111435.getClass(), "iconId", 860886224);
        setIntField(term111435, term111435.getClass(), "nameplateId", -187851938);
        setIntField(term111435, term111435.getClass(), "frameId", -1426453409);
        setIntField(term111435, term111435.getClass(), "trophyId", 307700009);
        setIntField(term111435, term111435.getClass(), "playCount", -21762966);
        setIntField(term111435, term111435.getClass(), "playVsCount", -1469517921);
        setIntField(term111435, term111435.getClass(), "playSyncCount", 1698773498);
        setIntField(term111435, term111435.getClass(), "winCount", 1051340647);
        setIntField(term111435, term111435.getClass(), "helpCount", 1761068817);
        setIntField(term111435, term111435.getClass(), "comboCount", -1260103469);
        setIntField(term111435, term111435.getClass(), "feverCount", -405127424);
        setIntField(term111435, term111435.getClass(), "totalHiScore", 708547892);
        setIntField(term111435, term111435.getClass(), "totalEasyHighScore", -1814890256);
        setIntField(term111435, term111435.getClass(), "totalBasicHighScore", -1681376129);
        setIntField(term111435, term111435.getClass(), "totalAdvancedHighScore", -1404448298);
        setIntField(term111435, term111435.getClass(), "totalExpertHighScore", -1560306376);
        setIntField(term111435, term111435.getClass(), "totalMasterHighScore", -994453726);
        setIntField(term111435, term111435.getClass(), "totalReMasterHighScore", 1508458483);
        setIntField(term111435, term111435.getClass(), "totalHighSync", 2109435374);
        setIntField(term111435, term111435.getClass(), "totalEasySync", -655971082);
        setIntField(term111435, term111435.getClass(), "totalBasicSync", 1527901816);
        setIntField(term111435, term111435.getClass(), "totalAdvancedSync", -1719160388);
        setIntField(term111435, term111435.getClass(), "totalExpertSync", -670076376);
        setIntField(term111435, term111435.getClass(), "totalMasterSync", 1113460068);
        setIntField(term111435, term111435.getClass(), "totalReMasterSync", 262955641);
        setIntField(term111435, term111435.getClass(), "playerRating", -1166567844);
        setIntField(term111435, term111435.getClass(), "highestRating", 708985205);
        setIntField(term111435, term111435.getClass(), "rankAuthTailId", -658757442);
        setField(term111435, term111435.getClass(), "eventWatchedDate", "oNgxBniAuz");
        setField(term111435, term111435.getClass(), "webLimitDate", "hvbJVpbmAQ");
        setIntField(term111435, term111435.getClass(), "challengeTrackPhase", -975652694);
        setIntField(term111435, term111435.getClass(), "firstPlayBits", 342903868);
        setField(term111435, term111435.getClass(), "lastPlayDate", "aqayJgOWOQ");
        setIntField(term111435, term111435.getClass(), "lastPlaceId", 1553091005);
        setField(term111435, term111435.getClass(), "lastPlaceName", "YStxlrcedL");
        setIntField(term111435, term111435.getClass(), "lastRegionId", 1926386070);
        setField(term111435, term111435.getClass(), "lastRegionName", "mDLwflwlja");
        setField(term111435, term111435.getClass(), "lastClientId", "RqkgPxDFnv");
        setField(term111435, term111435.getClass(), "lastCountryCode", "egaLajwFgY");
        setIntField(term111435, term111435.getClass(), "eventPoint", -222129138);
        setIntField(term111435, term111435.getClass(), "totalLv", -2044855583);
        setIntField(term111435, term111435.getClass(), "lastLoginBonusDay", 12915970);
        setIntField(term111435, term111435.getClass(), "lastSurvivalBonusDay", 1693148976);
        setIntField(term111435, term111435.getClass(), "loginBonusLv", -638507792);
        setField(term111433, term111433.getClass(), "user", term111435);
        setField(term111433, term111433.getClass(), "propertyKey", "wUXTYOJezz");
        setField(term111433, term111433.getClass(), "propertyValue", "dovCZEmPER");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserGeneralData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term111433, args);
    }

};


