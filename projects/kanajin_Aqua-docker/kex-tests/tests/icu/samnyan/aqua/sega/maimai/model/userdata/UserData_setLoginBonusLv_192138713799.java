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

public class UserData_setLoginBonusLv_192138713799 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26439;
     Object term26613;

    public UserData_setLoginBonusLv_192138713799() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term26443 = new Long(-5216789073301458893L);
        term26439 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term26441 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term26457 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26458 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26462 = newInstance(Class.forName("java.time.LocalTime"));
        Object term26467 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26468 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26472 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term26439, term26439.getClass(), "id", -2338103433822116635L);
        setLongField(term26441, term26441.getClass(), "id", -1885698929232124806L);
        setField(term26441, term26441.getClass(), "extId", term26443);
        setField(term26441, term26441.getClass(), "luid", "GISHLsgALf");
        setIntField(term26458, term26458.getClass(), "year", 2017);
        setShortField(term26458, term26458.getClass(), "month", (short) 8);
        setShortField(term26458, term26458.getClass(), "day", (short) 6);
        setField(term26457, term26457.getClass(), "date", term26458);
        setByteField(term26462, term26462.getClass(), "hour", (byte) 22);
        setByteField(term26462, term26462.getClass(), "minute", (byte) 46);
        setByteField(term26462, term26462.getClass(), "second", (byte) 47);
        setIntField(term26462, term26462.getClass(), "nano", 782967389);
        setField(term26457, term26457.getClass(), "time", term26462);
        setField(term26441, term26441.getClass(), "registerTime", term26457);
        setIntField(term26468, term26468.getClass(), "year", 2029);
        setShortField(term26468, term26468.getClass(), "month", (short) 3);
        setShortField(term26468, term26468.getClass(), "day", (short) 3);
        setField(term26467, term26467.getClass(), "date", term26468);
        setByteField(term26472, term26472.getClass(), "hour", (byte) 2);
        setByteField(term26472, term26472.getClass(), "minute", (byte) 29);
        setByteField(term26472, term26472.getClass(), "second", (byte) 54);
        setIntField(term26472, term26472.getClass(), "nano", 846675209);
        setField(term26467, term26467.getClass(), "time", term26472);
        setField(term26441, term26441.getClass(), "accessTime", term26467);
        setField(term26439, term26439.getClass(), "card", term26441);
        setIntField(term26439, term26439.getClass(), "lastDataVersion", 1364268540);
        setField(term26439, term26439.getClass(), "userName", "PVykkUSgBq");
        setIntField(term26439, term26439.getClass(), "point", 1613417207);
        setIntField(term26439, term26439.getClass(), "totalPoint", -267884738);
        setIntField(term26439, term26439.getClass(), "iconId", 1701113802);
        setIntField(term26439, term26439.getClass(), "nameplateId", 2142343992);
        setIntField(term26439, term26439.getClass(), "frameId", -875414289);
        setIntField(term26439, term26439.getClass(), "trophyId", 510025419);
        setIntField(term26439, term26439.getClass(), "playCount", 768579195);
        setIntField(term26439, term26439.getClass(), "playVsCount", 935186156);
        setIntField(term26439, term26439.getClass(), "playSyncCount", -101515724);
        setIntField(term26439, term26439.getClass(), "winCount", 987526407);
        setIntField(term26439, term26439.getClass(), "helpCount", -1370999464);
        setIntField(term26439, term26439.getClass(), "comboCount", -409231949);
        setIntField(term26439, term26439.getClass(), "feverCount", -666074929);
        setIntField(term26439, term26439.getClass(), "totalHiScore", 1263172764);
        setIntField(term26439, term26439.getClass(), "totalEasyHighScore", 294155442);
        setIntField(term26439, term26439.getClass(), "totalBasicHighScore", -790860079);
        setIntField(term26439, term26439.getClass(), "totalAdvancedHighScore", 52653332);
        setIntField(term26439, term26439.getClass(), "totalExpertHighScore", 605369567);
        setIntField(term26439, term26439.getClass(), "totalMasterHighScore", 662969700);
        setIntField(term26439, term26439.getClass(), "totalReMasterHighScore", -907171757);
        setIntField(term26439, term26439.getClass(), "totalHighSync", 1041315057);
        setIntField(term26439, term26439.getClass(), "totalEasySync", 5602462);
        setIntField(term26439, term26439.getClass(), "totalBasicSync", 1573768776);
        setIntField(term26439, term26439.getClass(), "totalAdvancedSync", 1525686645);
        setIntField(term26439, term26439.getClass(), "totalExpertSync", -538376054);
        setIntField(term26439, term26439.getClass(), "totalMasterSync", -159290084);
        setIntField(term26439, term26439.getClass(), "totalReMasterSync", -1181936403);
        setIntField(term26439, term26439.getClass(), "playerRating", 597843779);
        setIntField(term26439, term26439.getClass(), "highestRating", -920715260);
        setIntField(term26439, term26439.getClass(), "rankAuthTailId", -111304359);
        setField(term26439, term26439.getClass(), "eventWatchedDate", "tnKbZaCsuj");
        setField(term26439, term26439.getClass(), "webLimitDate", "ZFpcYBgLNC");
        setIntField(term26439, term26439.getClass(), "challengeTrackPhase", -1359946362);
        setIntField(term26439, term26439.getClass(), "firstPlayBits", 882866050);
        setField(term26439, term26439.getClass(), "lastPlayDate", "VAGkRppBem");
        setIntField(term26439, term26439.getClass(), "lastPlaceId", -979923296);
        setField(term26439, term26439.getClass(), "lastPlaceName", "eKcEJRxNSu");
        setIntField(term26439, term26439.getClass(), "lastRegionId", 1294282133);
        setField(term26439, term26439.getClass(), "lastRegionName", "NTXQPWFYSA");
        setField(term26439, term26439.getClass(), "lastClientId", "fOuOhBpldm");
        setField(term26439, term26439.getClass(), "lastCountryCode", "qQQRKGPyIM");
        setIntField(term26439, term26439.getClass(), "eventPoint", -1857786332);
        setIntField(term26439, term26439.getClass(), "totalLv", 1307491791);
        setIntField(term26439, term26439.getClass(), "lastLoginBonusDay", 445813516);
        setIntField(term26439, term26439.getClass(), "lastSurvivalBonusDay", 180030231);
        setIntField(term26439, term26439.getClass(), "loginBonusLv", 645685543);
        term26613 = new Integer(-704733432);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term26613;
        callMethod(klass, "setLoginBonusLv", argTypes, term26439, args);
    }

};


