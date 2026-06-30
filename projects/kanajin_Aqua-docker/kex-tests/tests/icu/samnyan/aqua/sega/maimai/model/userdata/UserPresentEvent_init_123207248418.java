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
import java.lang.Long;
import java.lang.Object;
import java.lang.Integer;

public class UserPresentEvent_init_123207248418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101499;
     Object term101501;
     Object term101675;
     Object term101677;
     Object term101679;
     Object term101681;

    public UserPresentEvent_init_123207248418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101499 = new Long(-2967233328786457154L);
        Long term101505 = new Long(-136372844051852955L);
        term101501 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term101503 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term101519 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term101520 = newInstance(Class.forName("java.time.LocalDate"));
        Object term101524 = newInstance(Class.forName("java.time.LocalTime"));
        Object term101529 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term101530 = newInstance(Class.forName("java.time.LocalDate"));
        Object term101534 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term101501, term101501.getClass(), "id", 3081163056749096636L);
        setLongField(term101503, term101503.getClass(), "id", 8461184996981583369L);
        setField(term101503, term101503.getClass(), "extId", term101505);
        setField(term101503, term101503.getClass(), "luid", "AOUZgesZGu");
        setIntField(term101520, term101520.getClass(), "year", 2025);
        setShortField(term101520, term101520.getClass(), "month", (short) 3);
        setShortField(term101520, term101520.getClass(), "day", (short) 2);
        setField(term101519, term101519.getClass(), "date", term101520);
        setByteField(term101524, term101524.getClass(), "hour", (byte) 23);
        setByteField(term101524, term101524.getClass(), "minute", (byte) 28);
        setByteField(term101524, term101524.getClass(), "second", (byte) 42);
        setIntField(term101524, term101524.getClass(), "nano", 204636448);
        setField(term101519, term101519.getClass(), "time", term101524);
        setField(term101503, term101503.getClass(), "registerTime", term101519);
        setIntField(term101530, term101530.getClass(), "year", 2023);
        setShortField(term101530, term101530.getClass(), "month", (short) 8);
        setShortField(term101530, term101530.getClass(), "day", (short) 30);
        setField(term101529, term101529.getClass(), "date", term101530);
        setByteField(term101534, term101534.getClass(), "hour", (byte) 9);
        setByteField(term101534, term101534.getClass(), "minute", (byte) 28);
        setByteField(term101534, term101534.getClass(), "second", (byte) 51);
        setIntField(term101534, term101534.getClass(), "nano", 285035808);
        setField(term101529, term101529.getClass(), "time", term101534);
        setField(term101503, term101503.getClass(), "accessTime", term101529);
        setField(term101501, term101501.getClass(), "card", term101503);
        setIntField(term101501, term101501.getClass(), "lastDataVersion", -24531941);
        setField(term101501, term101501.getClass(), "userName", "RApShxzpug");
        setIntField(term101501, term101501.getClass(), "point", 1265656841);
        setIntField(term101501, term101501.getClass(), "totalPoint", -1881871368);
        setIntField(term101501, term101501.getClass(), "iconId", -1725616340);
        setIntField(term101501, term101501.getClass(), "nameplateId", 1579393316);
        setIntField(term101501, term101501.getClass(), "frameId", 291434697);
        setIntField(term101501, term101501.getClass(), "trophyId", 1157245504);
        setIntField(term101501, term101501.getClass(), "playCount", -1468740029);
        setIntField(term101501, term101501.getClass(), "playVsCount", 1419365246);
        setIntField(term101501, term101501.getClass(), "playSyncCount", -591173078);
        setIntField(term101501, term101501.getClass(), "winCount", 1565076807);
        setIntField(term101501, term101501.getClass(), "helpCount", 1016664474);
        setIntField(term101501, term101501.getClass(), "comboCount", -1410426998);
        setIntField(term101501, term101501.getClass(), "feverCount", 1213587618);
        setIntField(term101501, term101501.getClass(), "totalHiScore", 980395350);
        setIntField(term101501, term101501.getClass(), "totalEasyHighScore", -941431124);
        setIntField(term101501, term101501.getClass(), "totalBasicHighScore", 228698990);
        setIntField(term101501, term101501.getClass(), "totalAdvancedHighScore", -432537089);
        setIntField(term101501, term101501.getClass(), "totalExpertHighScore", -1871594001);
        setIntField(term101501, term101501.getClass(), "totalMasterHighScore", -59629101);
        setIntField(term101501, term101501.getClass(), "totalReMasterHighScore", -1074564020);
        setIntField(term101501, term101501.getClass(), "totalHighSync", -897257334);
        setIntField(term101501, term101501.getClass(), "totalEasySync", 761466913);
        setIntField(term101501, term101501.getClass(), "totalBasicSync", 1025254415);
        setIntField(term101501, term101501.getClass(), "totalAdvancedSync", -1179135307);
        setIntField(term101501, term101501.getClass(), "totalExpertSync", -706418583);
        setIntField(term101501, term101501.getClass(), "totalMasterSync", -1861491170);
        setIntField(term101501, term101501.getClass(), "totalReMasterSync", 1307613446);
        setIntField(term101501, term101501.getClass(), "playerRating", -1321035168);
        setIntField(term101501, term101501.getClass(), "highestRating", 1558927173);
        setIntField(term101501, term101501.getClass(), "rankAuthTailId", -1134124022);
        setField(term101501, term101501.getClass(), "eventWatchedDate", "aygFZPbIko");
        setField(term101501, term101501.getClass(), "webLimitDate", "hUhlDCVWIF");
        setIntField(term101501, term101501.getClass(), "challengeTrackPhase", -734162613);
        setIntField(term101501, term101501.getClass(), "firstPlayBits", 2087704854);
        setField(term101501, term101501.getClass(), "lastPlayDate", "GjzKvoPaBR");
        setIntField(term101501, term101501.getClass(), "lastPlaceId", 2085374508);
        setField(term101501, term101501.getClass(), "lastPlaceName", "VZRLekBSXz");
        setIntField(term101501, term101501.getClass(), "lastRegionId", 323643925);
        setField(term101501, term101501.getClass(), "lastRegionName", "XfdYCOWEXZ");
        setField(term101501, term101501.getClass(), "lastClientId", "aPbJKoMxFL");
        setField(term101501, term101501.getClass(), "lastCountryCode", "FgtqUFBPnP");
        setIntField(term101501, term101501.getClass(), "eventPoint", 2084863202);
        setIntField(term101501, term101501.getClass(), "totalLv", 561322224);
        setIntField(term101501, term101501.getClass(), "lastLoginBonusDay", 1667257783);
        setIntField(term101501, term101501.getClass(), "lastSurvivalBonusDay", -766164021);
        setIntField(term101501, term101501.getClass(), "loginBonusLv", 233163267);
        term101675 = new Integer(692588997);
        term101677 = new Integer(-600023953);
        term101679 = new Integer(-109479766);
        term101681 = new Integer(-509531106);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPresentEvent");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        Object[] args = new Object[6];
        args[0] = term101499;
        args[1] = term101501;
        args[2] = term101675;
        args[3] = term101677;
        args[4] = term101679;
        args[5] = term101681;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


