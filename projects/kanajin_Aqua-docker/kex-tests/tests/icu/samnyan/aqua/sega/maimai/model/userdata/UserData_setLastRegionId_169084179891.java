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

public class UserData_setLastRegionId_169084179891 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24251;
     Object term24425;

    public UserData_setLastRegionId_169084179891() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term24255 = new Long(-2177368829816872572L);
        term24251 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term24253 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term24269 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24270 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24274 = newInstance(Class.forName("java.time.LocalTime"));
        Object term24279 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24280 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24284 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term24251, term24251.getClass(), "id", -8010214112439224349L);
        setLongField(term24253, term24253.getClass(), "id", -6673920710396545553L);
        setField(term24253, term24253.getClass(), "extId", term24255);
        setField(term24253, term24253.getClass(), "luid", "zSMVllDpfk");
        setIntField(term24270, term24270.getClass(), "year", 2023);
        setShortField(term24270, term24270.getClass(), "month", (short) 12);
        setShortField(term24270, term24270.getClass(), "day", (short) 12);
        setField(term24269, term24269.getClass(), "date", term24270);
        setByteField(term24274, term24274.getClass(), "hour", (byte) 0);
        setByteField(term24274, term24274.getClass(), "minute", (byte) 12);
        setByteField(term24274, term24274.getClass(), "second", (byte) 38);
        setIntField(term24274, term24274.getClass(), "nano", 430999236);
        setField(term24269, term24269.getClass(), "time", term24274);
        setField(term24253, term24253.getClass(), "registerTime", term24269);
        setIntField(term24280, term24280.getClass(), "year", 2018);
        setShortField(term24280, term24280.getClass(), "month", (short) 6);
        setShortField(term24280, term24280.getClass(), "day", (short) 17);
        setField(term24279, term24279.getClass(), "date", term24280);
        setByteField(term24284, term24284.getClass(), "hour", (byte) 1);
        setByteField(term24284, term24284.getClass(), "minute", (byte) 3);
        setByteField(term24284, term24284.getClass(), "second", (byte) 5);
        setIntField(term24284, term24284.getClass(), "nano", 914834044);
        setField(term24279, term24279.getClass(), "time", term24284);
        setField(term24253, term24253.getClass(), "accessTime", term24279);
        setField(term24251, term24251.getClass(), "card", term24253);
        setIntField(term24251, term24251.getClass(), "lastDataVersion", 79714955);
        setField(term24251, term24251.getClass(), "userName", "iptRXVDoYE");
        setIntField(term24251, term24251.getClass(), "point", -1409613044);
        setIntField(term24251, term24251.getClass(), "totalPoint", -1594530234);
        setIntField(term24251, term24251.getClass(), "iconId", -414324261);
        setIntField(term24251, term24251.getClass(), "nameplateId", -1729893211);
        setIntField(term24251, term24251.getClass(), "frameId", -1648760670);
        setIntField(term24251, term24251.getClass(), "trophyId", 590703291);
        setIntField(term24251, term24251.getClass(), "playCount", -2033199492);
        setIntField(term24251, term24251.getClass(), "playVsCount", 350096397);
        setIntField(term24251, term24251.getClass(), "playSyncCount", -325295536);
        setIntField(term24251, term24251.getClass(), "winCount", -411068820);
        setIntField(term24251, term24251.getClass(), "helpCount", -608484309);
        setIntField(term24251, term24251.getClass(), "comboCount", -396456847);
        setIntField(term24251, term24251.getClass(), "feverCount", 1826615515);
        setIntField(term24251, term24251.getClass(), "totalHiScore", 1129458600);
        setIntField(term24251, term24251.getClass(), "totalEasyHighScore", -1559804880);
        setIntField(term24251, term24251.getClass(), "totalBasicHighScore", 420300457);
        setIntField(term24251, term24251.getClass(), "totalAdvancedHighScore", 804843661);
        setIntField(term24251, term24251.getClass(), "totalExpertHighScore", 1968236726);
        setIntField(term24251, term24251.getClass(), "totalMasterHighScore", -1080686915);
        setIntField(term24251, term24251.getClass(), "totalReMasterHighScore", -1329496162);
        setIntField(term24251, term24251.getClass(), "totalHighSync", -1181178091);
        setIntField(term24251, term24251.getClass(), "totalEasySync", 797166053);
        setIntField(term24251, term24251.getClass(), "totalBasicSync", -1145342603);
        setIntField(term24251, term24251.getClass(), "totalAdvancedSync", -1135326582);
        setIntField(term24251, term24251.getClass(), "totalExpertSync", 594267051);
        setIntField(term24251, term24251.getClass(), "totalMasterSync", -1225303838);
        setIntField(term24251, term24251.getClass(), "totalReMasterSync", 1093956146);
        setIntField(term24251, term24251.getClass(), "playerRating", 1459247713);
        setIntField(term24251, term24251.getClass(), "highestRating", 1400302967);
        setIntField(term24251, term24251.getClass(), "rankAuthTailId", 692198729);
        setField(term24251, term24251.getClass(), "eventWatchedDate", "kucsxnvbES");
        setField(term24251, term24251.getClass(), "webLimitDate", "IdGzDFfcZf");
        setIntField(term24251, term24251.getClass(), "challengeTrackPhase", -1232290301);
        setIntField(term24251, term24251.getClass(), "firstPlayBits", -1411058034);
        setField(term24251, term24251.getClass(), "lastPlayDate", "KDdRNhZmnU");
        setIntField(term24251, term24251.getClass(), "lastPlaceId", -144155597);
        setField(term24251, term24251.getClass(), "lastPlaceName", "iMsqJaKlDC");
        setIntField(term24251, term24251.getClass(), "lastRegionId", -996670851);
        setField(term24251, term24251.getClass(), "lastRegionName", "aPkGHbZyjj");
        setField(term24251, term24251.getClass(), "lastClientId", "nSWdsVyJRI");
        setField(term24251, term24251.getClass(), "lastCountryCode", "JBOPGgGKnc");
        setIntField(term24251, term24251.getClass(), "eventPoint", 340642931);
        setIntField(term24251, term24251.getClass(), "totalLv", -2018441502);
        setIntField(term24251, term24251.getClass(), "lastLoginBonusDay", -762480882);
        setIntField(term24251, term24251.getClass(), "lastSurvivalBonusDay", -263338308);
        setIntField(term24251, term24251.getClass(), "loginBonusLv", 1496385296);
        term24425 = new Integer(-1339659575);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term24425;
        callMethod(klass, "setLastRegionId", argTypes, term24251, args);
    }

};


