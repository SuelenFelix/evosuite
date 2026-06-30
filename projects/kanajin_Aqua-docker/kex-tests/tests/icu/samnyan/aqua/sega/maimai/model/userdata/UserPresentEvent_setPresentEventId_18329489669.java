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

public class UserPresentEvent_setPresentEventId_18329489669 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99329;
     Object term99509;

    public UserPresentEvent_setPresentEventId_18329489669() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term99335 = new Long(-2463629530824341661L);
        term99329 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPresentEvent"));
        Object term99331 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term99333 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term99349 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term99350 = newInstance(Class.forName("java.time.LocalDate"));
        Object term99354 = newInstance(Class.forName("java.time.LocalTime"));
        Object term99359 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term99360 = newInstance(Class.forName("java.time.LocalDate"));
        Object term99364 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term99329, term99329.getClass(), "id", 1006339275456792418L);
        setLongField(term99331, term99331.getClass(), "id", 7170045607484390400L);
        setLongField(term99333, term99333.getClass(), "id", 8650489888932702486L);
        setField(term99333, term99333.getClass(), "extId", term99335);
        setField(term99333, term99333.getClass(), "luid", "kWDcKMrObe");
        setIntField(term99350, term99350.getClass(), "year", 2017);
        setShortField(term99350, term99350.getClass(), "month", (short) 6);
        setShortField(term99350, term99350.getClass(), "day", (short) 3);
        setField(term99349, term99349.getClass(), "date", term99350);
        setByteField(term99354, term99354.getClass(), "hour", (byte) 20);
        setByteField(term99354, term99354.getClass(), "minute", (byte) 14);
        setByteField(term99354, term99354.getClass(), "second", (byte) 10);
        setIntField(term99354, term99354.getClass(), "nano", 594163001);
        setField(term99349, term99349.getClass(), "time", term99354);
        setField(term99333, term99333.getClass(), "registerTime", term99349);
        setIntField(term99360, term99360.getClass(), "year", 2014);
        setShortField(term99360, term99360.getClass(), "month", (short) 4);
        setShortField(term99360, term99360.getClass(), "day", (short) 9);
        setField(term99359, term99359.getClass(), "date", term99360);
        setByteField(term99364, term99364.getClass(), "hour", (byte) 0);
        setByteField(term99364, term99364.getClass(), "minute", (byte) 49);
        setByteField(term99364, term99364.getClass(), "second", (byte) 41);
        setIntField(term99364, term99364.getClass(), "nano", 379126669);
        setField(term99359, term99359.getClass(), "time", term99364);
        setField(term99333, term99333.getClass(), "accessTime", term99359);
        setField(term99331, term99331.getClass(), "card", term99333);
        setIntField(term99331, term99331.getClass(), "lastDataVersion", 1942797432);
        setField(term99331, term99331.getClass(), "userName", "yQIuIaxdRt");
        setIntField(term99331, term99331.getClass(), "point", -190935358);
        setIntField(term99331, term99331.getClass(), "totalPoint", -1392130122);
        setIntField(term99331, term99331.getClass(), "iconId", 152610093);
        setIntField(term99331, term99331.getClass(), "nameplateId", -1115692502);
        setIntField(term99331, term99331.getClass(), "frameId", -128305422);
        setIntField(term99331, term99331.getClass(), "trophyId", -1647436228);
        setIntField(term99331, term99331.getClass(), "playCount", 601867451);
        setIntField(term99331, term99331.getClass(), "playVsCount", -241946575);
        setIntField(term99331, term99331.getClass(), "playSyncCount", -1223017876);
        setIntField(term99331, term99331.getClass(), "winCount", -424247215);
        setIntField(term99331, term99331.getClass(), "helpCount", 832576798);
        setIntField(term99331, term99331.getClass(), "comboCount", 1324536041);
        setIntField(term99331, term99331.getClass(), "feverCount", -1310625886);
        setIntField(term99331, term99331.getClass(), "totalHiScore", 1040482108);
        setIntField(term99331, term99331.getClass(), "totalEasyHighScore", 1962507245);
        setIntField(term99331, term99331.getClass(), "totalBasicHighScore", 905482662);
        setIntField(term99331, term99331.getClass(), "totalAdvancedHighScore", -166421996);
        setIntField(term99331, term99331.getClass(), "totalExpertHighScore", -1157561721);
        setIntField(term99331, term99331.getClass(), "totalMasterHighScore", 1406181821);
        setIntField(term99331, term99331.getClass(), "totalReMasterHighScore", -38316383);
        setIntField(term99331, term99331.getClass(), "totalHighSync", 896926009);
        setIntField(term99331, term99331.getClass(), "totalEasySync", -405250282);
        setIntField(term99331, term99331.getClass(), "totalBasicSync", -421196383);
        setIntField(term99331, term99331.getClass(), "totalAdvancedSync", -1052354004);
        setIntField(term99331, term99331.getClass(), "totalExpertSync", -1509355099);
        setIntField(term99331, term99331.getClass(), "totalMasterSync", 1568426874);
        setIntField(term99331, term99331.getClass(), "totalReMasterSync", 1878621428);
        setIntField(term99331, term99331.getClass(), "playerRating", -763712723);
        setIntField(term99331, term99331.getClass(), "highestRating", -953389977);
        setIntField(term99331, term99331.getClass(), "rankAuthTailId", 29377926);
        setField(term99331, term99331.getClass(), "eventWatchedDate", "mppqyavbHE");
        setField(term99331, term99331.getClass(), "webLimitDate", "XRhNVGJlMP");
        setIntField(term99331, term99331.getClass(), "challengeTrackPhase", 1268654933);
        setIntField(term99331, term99331.getClass(), "firstPlayBits", 1996791497);
        setField(term99331, term99331.getClass(), "lastPlayDate", "OGvydrXtac");
        setIntField(term99331, term99331.getClass(), "lastPlaceId", 1161496755);
        setField(term99331, term99331.getClass(), "lastPlaceName", "SaPfgULGFp");
        setIntField(term99331, term99331.getClass(), "lastRegionId", -228704989);
        setField(term99331, term99331.getClass(), "lastRegionName", "olLmzJWshP");
        setField(term99331, term99331.getClass(), "lastClientId", "VbgHjUqRYR");
        setField(term99331, term99331.getClass(), "lastCountryCode", "qZzSujRYqy");
        setIntField(term99331, term99331.getClass(), "eventPoint", -2028478734);
        setIntField(term99331, term99331.getClass(), "totalLv", -1685706401);
        setIntField(term99331, term99331.getClass(), "lastLoginBonusDay", -420787264);
        setIntField(term99331, term99331.getClass(), "lastSurvivalBonusDay", -1004890016);
        setIntField(term99331, term99331.getClass(), "loginBonusLv", 953150729);
        setField(term99329, term99329.getClass(), "user", term99331);
        setIntField(term99329, term99329.getClass(), "presentEventId", -1191095625);
        setIntField(term99329, term99329.getClass(), "point", -1314047245);
        setIntField(term99329, term99329.getClass(), "presentCount", 287040717);
        setIntField(term99329, term99329.getClass(), "rate", 913040044);
        term99509 = new Integer(859650427);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPresentEvent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term99509;
        callMethod(klass, "setPresentEventId", argTypes, term99329, args);
    }

};


