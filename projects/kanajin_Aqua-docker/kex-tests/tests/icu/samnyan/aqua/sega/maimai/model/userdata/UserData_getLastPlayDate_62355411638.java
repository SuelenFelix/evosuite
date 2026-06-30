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

public class UserData_getLastPlayDate_62355411638 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10033;

    public UserData_getLastPlayDate_62355411638() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term10037 = new Long(-8708192233349544946L);
        term10033 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term10035 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term10051 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10052 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10056 = newInstance(Class.forName("java.time.LocalTime"));
        Object term10061 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10062 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10066 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term10033, term10033.getClass(), "id", -5963439350418910964L);
        setLongField(term10035, term10035.getClass(), "id", 9013624480170062917L);
        setField(term10035, term10035.getClass(), "extId", term10037);
        setField(term10035, term10035.getClass(), "luid", "aanyiAOJCl");
        setIntField(term10052, term10052.getClass(), "year", 2011);
        setShortField(term10052, term10052.getClass(), "month", (short) 8);
        setShortField(term10052, term10052.getClass(), "day", (short) 1);
        setField(term10051, term10051.getClass(), "date", term10052);
        setByteField(term10056, term10056.getClass(), "hour", (byte) 7);
        setByteField(term10056, term10056.getClass(), "minute", (byte) 2);
        setByteField(term10056, term10056.getClass(), "second", (byte) 46);
        setIntField(term10056, term10056.getClass(), "nano", 187178462);
        setField(term10051, term10051.getClass(), "time", term10056);
        setField(term10035, term10035.getClass(), "registerTime", term10051);
        setIntField(term10062, term10062.getClass(), "year", 2020);
        setShortField(term10062, term10062.getClass(), "month", (short) 9);
        setShortField(term10062, term10062.getClass(), "day", (short) 3);
        setField(term10061, term10061.getClass(), "date", term10062);
        setByteField(term10066, term10066.getClass(), "hour", (byte) 10);
        setByteField(term10066, term10066.getClass(), "minute", (byte) 44);
        setByteField(term10066, term10066.getClass(), "second", (byte) 5);
        setIntField(term10066, term10066.getClass(), "nano", 572560230);
        setField(term10061, term10061.getClass(), "time", term10066);
        setField(term10035, term10035.getClass(), "accessTime", term10061);
        setField(term10033, term10033.getClass(), "card", term10035);
        setIntField(term10033, term10033.getClass(), "lastDataVersion", 751596480);
        setField(term10033, term10033.getClass(), "userName", "VDokbsCuqq");
        setIntField(term10033, term10033.getClass(), "point", 1971485144);
        setIntField(term10033, term10033.getClass(), "totalPoint", 2059603512);
        setIntField(term10033, term10033.getClass(), "iconId", -1308902065);
        setIntField(term10033, term10033.getClass(), "nameplateId", 605255795);
        setIntField(term10033, term10033.getClass(), "frameId", 1743438307);
        setIntField(term10033, term10033.getClass(), "trophyId", -1122596893);
        setIntField(term10033, term10033.getClass(), "playCount", -2147297900);
        setIntField(term10033, term10033.getClass(), "playVsCount", 539095138);
        setIntField(term10033, term10033.getClass(), "playSyncCount", 1462297654);
        setIntField(term10033, term10033.getClass(), "winCount", 1009915858);
        setIntField(term10033, term10033.getClass(), "helpCount", 500127209);
        setIntField(term10033, term10033.getClass(), "comboCount", -1482530168);
        setIntField(term10033, term10033.getClass(), "feverCount", -432987116);
        setIntField(term10033, term10033.getClass(), "totalHiScore", 1483499310);
        setIntField(term10033, term10033.getClass(), "totalEasyHighScore", -1516568587);
        setIntField(term10033, term10033.getClass(), "totalBasicHighScore", 1537690170);
        setIntField(term10033, term10033.getClass(), "totalAdvancedHighScore", 1133116994);
        setIntField(term10033, term10033.getClass(), "totalExpertHighScore", -1195191239);
        setIntField(term10033, term10033.getClass(), "totalMasterHighScore", -470798982);
        setIntField(term10033, term10033.getClass(), "totalReMasterHighScore", 1844345719);
        setIntField(term10033, term10033.getClass(), "totalHighSync", 1704024265);
        setIntField(term10033, term10033.getClass(), "totalEasySync", 501801161);
        setIntField(term10033, term10033.getClass(), "totalBasicSync", 2103971768);
        setIntField(term10033, term10033.getClass(), "totalAdvancedSync", -939132796);
        setIntField(term10033, term10033.getClass(), "totalExpertSync", 159279866);
        setIntField(term10033, term10033.getClass(), "totalMasterSync", 138122227);
        setIntField(term10033, term10033.getClass(), "totalReMasterSync", 1795358995);
        setIntField(term10033, term10033.getClass(), "playerRating", -781185864);
        setIntField(term10033, term10033.getClass(), "highestRating", 340500914);
        setIntField(term10033, term10033.getClass(), "rankAuthTailId", -2061712635);
        setField(term10033, term10033.getClass(), "eventWatchedDate", "xClUIcPECX");
        setField(term10033, term10033.getClass(), "webLimitDate", "avhRaGZaBF");
        setIntField(term10033, term10033.getClass(), "challengeTrackPhase", 1182911731);
        setIntField(term10033, term10033.getClass(), "firstPlayBits", 644726932);
        setField(term10033, term10033.getClass(), "lastPlayDate", "JkgoRtImdE");
        setIntField(term10033, term10033.getClass(), "lastPlaceId", -1515977761);
        setField(term10033, term10033.getClass(), "lastPlaceName", "qFGKIJjlmV");
        setIntField(term10033, term10033.getClass(), "lastRegionId", -1476037190);
        setField(term10033, term10033.getClass(), "lastRegionName", "IHqvyhMtuM");
        setField(term10033, term10033.getClass(), "lastClientId", "dAldIGYAXV");
        setField(term10033, term10033.getClass(), "lastCountryCode", "mLwibAPEsa");
        setIntField(term10033, term10033.getClass(), "eventPoint", -718204437);
        setIntField(term10033, term10033.getClass(), "totalLv", 468974358);
        setIntField(term10033, term10033.getClass(), "lastLoginBonusDay", 346282818);
        setIntField(term10033, term10033.getClass(), "lastSurvivalBonusDay", -857876056);
        setIntField(term10033, term10033.getClass(), "loginBonusLv", 1392910876);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastPlayDate", argTypes, term10033, args);
    }

};


