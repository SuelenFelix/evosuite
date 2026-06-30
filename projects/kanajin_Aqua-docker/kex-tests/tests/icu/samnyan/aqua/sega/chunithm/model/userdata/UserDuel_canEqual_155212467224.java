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

public class UserDuel_canEqual_155212467224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85996;
     Object term86292;

    public UserDuel_canEqual_155212467224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term86002 = new Long(4100236067313034103L);
        term85996 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserDuel"));
        Object term85998 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term86000 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term86016 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term86017 = newInstance(Class.forName("java.time.LocalDate"));
        Object term86021 = newInstance(Class.forName("java.time.LocalTime"));
        Object term86026 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term86027 = newInstance(Class.forName("java.time.LocalDate"));
        Object term86031 = newInstance(Class.forName("java.time.LocalTime"));
        Object term86048 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term86049 = newInstance(Class.forName("java.time.LocalDate"));
        Object term86053 = newInstance(Class.forName("java.time.LocalTime"));
        Object term86109 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term86110 = newInstance(Class.forName("java.time.LocalDate"));
        Object term86114 = newInstance(Class.forName("java.time.LocalTime"));
        Object term86157 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term86158 = newInstance(Class.forName("java.time.LocalDate"));
        Object term86162 = newInstance(Class.forName("java.time.LocalTime"));
        Object term86203 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term86204 = newInstance(Class.forName("java.time.LocalDate"));
        Object term86208 = newInstance(Class.forName("java.time.LocalTime"));
        Object term86278 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term86279 = newInstance(Class.forName("java.time.LocalDate"));
        Object term86283 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term85996, term85996.getClass(), "id", 2699420536723014626L);
        setLongField(term85998, term85998.getClass(), "id", -8846138397677255464L);
        setLongField(term86000, term86000.getClass(), "id", -3563971116155081558L);
        setField(term86000, term86000.getClass(), "extId", term86002);
        setField(term86000, term86000.getClass(), "luid", "AAzuYrqTRq");
        setIntField(term86017, term86017.getClass(), "year", 2021);
        setShortField(term86017, term86017.getClass(), "month", (short) 4);
        setShortField(term86017, term86017.getClass(), "day", (short) 3);
        setField(term86016, term86016.getClass(), "date", term86017);
        setByteField(term86021, term86021.getClass(), "hour", (byte) 12);
        setByteField(term86021, term86021.getClass(), "minute", (byte) 34);
        setByteField(term86021, term86021.getClass(), "second", (byte) 25);
        setIntField(term86021, term86021.getClass(), "nano", 691683257);
        setField(term86016, term86016.getClass(), "time", term86021);
        setField(term86000, term86000.getClass(), "registerTime", term86016);
        setIntField(term86027, term86027.getClass(), "year", 2010);
        setShortField(term86027, term86027.getClass(), "month", (short) 9);
        setShortField(term86027, term86027.getClass(), "day", (short) 12);
        setField(term86026, term86026.getClass(), "date", term86027);
        setByteField(term86031, term86031.getClass(), "hour", (byte) 19);
        setByteField(term86031, term86031.getClass(), "minute", (byte) 55);
        setByteField(term86031, term86031.getClass(), "second", (byte) 15);
        setIntField(term86031, term86031.getClass(), "nano", 784115402);
        setField(term86026, term86026.getClass(), "time", term86031);
        setField(term86000, term86000.getClass(), "accessTime", term86026);
        setField(term85998, term85998.getClass(), "card", term86000);
        setField(term85998, term85998.getClass(), "userName", "cUQuwEPzJb");
        setIntField(term86049, term86049.getClass(), "year", 2017);
        setShortField(term86049, term86049.getClass(), "month", (short) 10);
        setShortField(term86049, term86049.getClass(), "day", (short) 4);
        setField(term86048, term86048.getClass(), "date", term86049);
        setByteField(term86053, term86053.getClass(), "hour", (byte) 1);
        setByteField(term86053, term86053.getClass(), "minute", (byte) 21);
        setByteField(term86053, term86053.getClass(), "second", (byte) 3);
        setIntField(term86053, term86053.getClass(), "nano", 164928538);
        setField(term86048, term86048.getClass(), "time", term86053);
        setField(term85998, term85998.getClass(), "lastLoginDate", term86048);
        setBooleanField(term85998, term85998.getClass(), "isWebJoin", false);
        setField(term85998, term85998.getClass(), "webLimitDate", "sqPZeXSusM");
        setIntField(term85998, term85998.getClass(), "level", -1109536397);
        setIntField(term85998, term85998.getClass(), "reincarnationNum", -356798505);
        setField(term85998, term85998.getClass(), "exp", "mUCxMstoOT");
        setLongField(term85998, term85998.getClass(), "point", -3838500537611270485L);
        setLongField(term85998, term85998.getClass(), "totalPoint", 7524709905774533651L);
        setIntField(term85998, term85998.getClass(), "playCount", 1298263326);
        setIntField(term85998, term85998.getClass(), "multiPlayCount", 1534262946);
        setIntField(term85998, term85998.getClass(), "multiWinCount", -732512836);
        setIntField(term85998, term85998.getClass(), "requestResCount", -583097103);
        setIntField(term85998, term85998.getClass(), "acceptResCount", 390772759);
        setIntField(term85998, term85998.getClass(), "successResCount", 121280572);
        setIntField(term85998, term85998.getClass(), "playerRating", 683645623);
        setIntField(term85998, term85998.getClass(), "highestRating", -1807588897);
        setIntField(term85998, term85998.getClass(), "nameplateId", 702237858);
        setIntField(term85998, term85998.getClass(), "frameId", -70803343);
        setIntField(term85998, term85998.getClass(), "characterId", -2147305933);
        setIntField(term85998, term85998.getClass(), "trophyId", 1174830017);
        setIntField(term85998, term85998.getClass(), "playedTutorialBit", 2140219446);
        setIntField(term85998, term85998.getClass(), "firstTutorialCancelNum", -417525632);
        setIntField(term85998, term85998.getClass(), "masterTutorialCancelNum", 1228187048);
        setIntField(term85998, term85998.getClass(), "totalRepertoireCount", -809028643);
        setIntField(term85998, term85998.getClass(), "totalMapNum", -1322926388);
        setLongField(term85998, term85998.getClass(), "totalHiScore", -872902981503394121L);
        setLongField(term85998, term85998.getClass(), "totalBasicHighScore", 560784718707260252L);
        setLongField(term85998, term85998.getClass(), "totalAdvancedHighScore", -3516575907450439911L);
        setLongField(term85998, term85998.getClass(), "totalExpertHighScore", -888272683506995872L);
        setLongField(term85998, term85998.getClass(), "totalMasterHighScore", -4435966730765688655L);
        setIntField(term86110, term86110.getClass(), "year", 2014);
        setShortField(term86110, term86110.getClass(), "month", (short) 5);
        setShortField(term86110, term86110.getClass(), "day", (short) 12);
        setField(term86109, term86109.getClass(), "date", term86110);
        setByteField(term86114, term86114.getClass(), "hour", (byte) 21);
        setByteField(term86114, term86114.getClass(), "minute", (byte) 50);
        setByteField(term86114, term86114.getClass(), "second", (byte) 24);
        setIntField(term86114, term86114.getClass(), "nano", 165505767);
        setField(term86109, term86109.getClass(), "time", term86114);
        setField(term85998, term85998.getClass(), "eventWatchedDate", term86109);
        setIntField(term85998, term85998.getClass(), "friendCount", 701619360);
        setBooleanField(term85998, term85998.getClass(), "isMaimai", true);
        setField(term85998, term85998.getClass(), "firstGameId", "LroMhmrHbv");
        setField(term85998, term85998.getClass(), "firstRomVersion", "nUWkEhozFC");
        setField(term85998, term85998.getClass(), "firstDataVersion", "cZOLUZUhxQ");
        setIntField(term86158, term86158.getClass(), "year", 2028);
        setShortField(term86158, term86158.getClass(), "month", (short) 4);
        setShortField(term86158, term86158.getClass(), "day", (short) 3);
        setField(term86157, term86157.getClass(), "date", term86158);
        setByteField(term86162, term86162.getClass(), "hour", (byte) 0);
        setByteField(term86162, term86162.getClass(), "minute", (byte) 28);
        setByteField(term86162, term86162.getClass(), "second", (byte) 50);
        setIntField(term86162, term86162.getClass(), "nano", 521054025);
        setField(term86157, term86157.getClass(), "time", term86162);
        setField(term85998, term85998.getClass(), "firstPlayDate", term86157);
        setField(term85998, term85998.getClass(), "lastGameId", "fXCybRqtsq");
        setField(term85998, term85998.getClass(), "lastRomVersion", "gPhmseJiob");
        setField(term85998, term85998.getClass(), "lastDataVersion", "dgpHJUBySN");
        setIntField(term86204, term86204.getClass(), "year", 2012);
        setShortField(term86204, term86204.getClass(), "month", (short) 11);
        setShortField(term86204, term86204.getClass(), "day", (short) 12);
        setField(term86203, term86203.getClass(), "date", term86204);
        setByteField(term86208, term86208.getClass(), "hour", (byte) 2);
        setByteField(term86208, term86208.getClass(), "minute", (byte) 45);
        setByteField(term86208, term86208.getClass(), "second", (byte) 14);
        setIntField(term86208, term86208.getClass(), "nano", 572497850);
        setField(term86203, term86203.getClass(), "time", term86208);
        setField(term85998, term85998.getClass(), "lastPlayDate", term86203);
        setIntField(term85998, term85998.getClass(), "lastPlaceId", 930820216);
        setField(term85998, term85998.getClass(), "lastPlaceName", "jCEXysSVZf");
        setField(term85998, term85998.getClass(), "lastRegionId", "jWrmcNnNoB");
        setField(term85998, term85998.getClass(), "lastRegionName", "MoncgugUfo");
        setField(term85998, term85998.getClass(), "lastAllNetId", "OdbuOWCJTS");
        setField(term85998, term85998.getClass(), "lastClientId", "ksvfEdmpqg");
        setField(term85996, term85996.getClass(), "user", term85998);
        setIntField(term85996, term85996.getClass(), "duelId", -1573368178);
        setIntField(term85996, term85996.getClass(), "progress", -1007994686);
        setIntField(term85996, term85996.getClass(), "point", -849828336);
        setBooleanField(term85996, term85996.getClass(), "isClear", true);
        setIntField(term86279, term86279.getClass(), "year", 2014);
        setShortField(term86279, term86279.getClass(), "month", (short) 3);
        setShortField(term86279, term86279.getClass(), "day", (short) 8);
        setField(term86278, term86278.getClass(), "date", term86279);
        setByteField(term86283, term86283.getClass(), "hour", (byte) 7);
        setByteField(term86283, term86283.getClass(), "minute", (byte) 51);
        setByteField(term86283, term86283.getClass(), "second", (byte) 58);
        setIntField(term86283, term86283.getClass(), "nano", 266448887);
        setField(term86278, term86278.getClass(), "time", term86283);
        setField(term85996, term85996.getClass(), "lastPlayDate", term86278);
        setIntField(term85996, term85996.getClass(), "param1", 184687223);
        setIntField(term85996, term85996.getClass(), "param2", 1768023420);
        setIntField(term85996, term85996.getClass(), "param3", -409163006);
        setIntField(term85996, term85996.getClass(), "param4", 1632107117);
        term86292 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserDuel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term86292;
        callMethod(klass, "canEqual", argTypes, term85996, args);
    }

};


