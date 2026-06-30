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
import java.lang.Integer;

public class UserData_setTotalMasterHighScore_141879154172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19117;
     Object term19291;

    public UserData_setTotalMasterHighScore_141879154172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term19121 = new Long(6682528376118987775L);
        term19117 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term19119 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term19135 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19136 = newInstance(Class.forName("java.time.LocalDate"));
        Object term19140 = newInstance(Class.forName("java.time.LocalTime"));
        Object term19145 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19146 = newInstance(Class.forName("java.time.LocalDate"));
        Object term19150 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term19117, term19117.getClass(), "id", 8166095254618543564L);
        setLongField(term19119, term19119.getClass(), "id", -4598158870068953328L);
        setField(term19119, term19119.getClass(), "extId", term19121);
        setField(term19119, term19119.getClass(), "luid", "EBYHwsuWAU");
        setIntField(term19136, term19136.getClass(), "year", 2018);
        setShortField(term19136, term19136.getClass(), "month", (short) 5);
        setShortField(term19136, term19136.getClass(), "day", (short) 22);
        setField(term19135, term19135.getClass(), "date", term19136);
        setByteField(term19140, term19140.getClass(), "hour", (byte) 16);
        setByteField(term19140, term19140.getClass(), "minute", (byte) 46);
        setByteField(term19140, term19140.getClass(), "second", (byte) 48);
        setIntField(term19140, term19140.getClass(), "nano", 72983043);
        setField(term19135, term19135.getClass(), "time", term19140);
        setField(term19119, term19119.getClass(), "registerTime", term19135);
        setIntField(term19146, term19146.getClass(), "year", 2022);
        setShortField(term19146, term19146.getClass(), "month", (short) 3);
        setShortField(term19146, term19146.getClass(), "day", (short) 16);
        setField(term19145, term19145.getClass(), "date", term19146);
        setByteField(term19150, term19150.getClass(), "hour", (byte) 16);
        setByteField(term19150, term19150.getClass(), "minute", (byte) 35);
        setByteField(term19150, term19150.getClass(), "second", (byte) 38);
        setIntField(term19150, term19150.getClass(), "nano", 79329968);
        setField(term19145, term19145.getClass(), "time", term19150);
        setField(term19119, term19119.getClass(), "accessTime", term19145);
        setField(term19117, term19117.getClass(), "card", term19119);
        setIntField(term19117, term19117.getClass(), "lastDataVersion", -1965240023);
        setField(term19117, term19117.getClass(), "userName", "PtIjKpiSix");
        setIntField(term19117, term19117.getClass(), "point", -86860026);
        setIntField(term19117, term19117.getClass(), "totalPoint", -444451515);
        setIntField(term19117, term19117.getClass(), "iconId", -545419660);
        setIntField(term19117, term19117.getClass(), "nameplateId", -1917689550);
        setIntField(term19117, term19117.getClass(), "frameId", 1829428325);
        setIntField(term19117, term19117.getClass(), "trophyId", -1881843694);
        setIntField(term19117, term19117.getClass(), "playCount", -1134250665);
        setIntField(term19117, term19117.getClass(), "playVsCount", -1607263638);
        setIntField(term19117, term19117.getClass(), "playSyncCount", 691469974);
        setIntField(term19117, term19117.getClass(), "winCount", -2080503799);
        setIntField(term19117, term19117.getClass(), "helpCount", 13757525);
        setIntField(term19117, term19117.getClass(), "comboCount", 77853966);
        setIntField(term19117, term19117.getClass(), "feverCount", 1451393741);
        setIntField(term19117, term19117.getClass(), "totalHiScore", -1115815564);
        setIntField(term19117, term19117.getClass(), "totalEasyHighScore", 425132480);
        setIntField(term19117, term19117.getClass(), "totalBasicHighScore", 1968674006);
        setIntField(term19117, term19117.getClass(), "totalAdvancedHighScore", -634536248);
        setIntField(term19117, term19117.getClass(), "totalExpertHighScore", 1090329667);
        setIntField(term19117, term19117.getClass(), "totalMasterHighScore", -1082123686);
        setIntField(term19117, term19117.getClass(), "totalReMasterHighScore", -991011239);
        setIntField(term19117, term19117.getClass(), "totalHighSync", -1774267288);
        setIntField(term19117, term19117.getClass(), "totalEasySync", -1394083316);
        setIntField(term19117, term19117.getClass(), "totalBasicSync", 23814407);
        setIntField(term19117, term19117.getClass(), "totalAdvancedSync", 1941438128);
        setIntField(term19117, term19117.getClass(), "totalExpertSync", -418002301);
        setIntField(term19117, term19117.getClass(), "totalMasterSync", 2067599442);
        setIntField(term19117, term19117.getClass(), "totalReMasterSync", -335577660);
        setIntField(term19117, term19117.getClass(), "playerRating", 1488144730);
        setIntField(term19117, term19117.getClass(), "highestRating", -1075257608);
        setIntField(term19117, term19117.getClass(), "rankAuthTailId", -693529847);
        setField(term19117, term19117.getClass(), "eventWatchedDate", "NZdTuwSCIM");
        setField(term19117, term19117.getClass(), "webLimitDate", "dDHcmzPAmP");
        setIntField(term19117, term19117.getClass(), "challengeTrackPhase", -325187625);
        setIntField(term19117, term19117.getClass(), "firstPlayBits", -317484961);
        setField(term19117, term19117.getClass(), "lastPlayDate", "HEaTkWYBgv");
        setIntField(term19117, term19117.getClass(), "lastPlaceId", 418080259);
        setField(term19117, term19117.getClass(), "lastPlaceName", "MpJsPKLTIU");
        setIntField(term19117, term19117.getClass(), "lastRegionId", 657195865);
        setField(term19117, term19117.getClass(), "lastRegionName", "IiNCZfdouL");
        setField(term19117, term19117.getClass(), "lastClientId", "AhOHzCsHKW");
        setField(term19117, term19117.getClass(), "lastCountryCode", "UqgLPaaAHi");
        setIntField(term19117, term19117.getClass(), "eventPoint", 1397647176);
        setIntField(term19117, term19117.getClass(), "totalLv", -1375675721);
        setIntField(term19117, term19117.getClass(), "lastLoginBonusDay", 456313553);
        setIntField(term19117, term19117.getClass(), "lastSurvivalBonusDay", 1636460194);
        setIntField(term19117, term19117.getClass(), "loginBonusLv", -1926178417);
        term19291 = new Integer(-1011180309);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term19291;
        callMethod(klass, "setTotalMasterHighScore", argTypes, term19117, args);
    }

};


