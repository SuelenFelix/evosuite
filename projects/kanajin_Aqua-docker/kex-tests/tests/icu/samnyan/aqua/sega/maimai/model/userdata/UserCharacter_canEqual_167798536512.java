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

public class UserCharacter_canEqual_167798536512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36095;
     Object term36274;

    public UserCharacter_canEqual_167798536512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term36101 = new Long(-7268507582722666254L);
        term36095 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserCharacter"));
        Object term36097 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term36099 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term36115 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term36116 = newInstance(Class.forName("java.time.LocalDate"));
        Object term36120 = newInstance(Class.forName("java.time.LocalTime"));
        Object term36125 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term36126 = newInstance(Class.forName("java.time.LocalDate"));
        Object term36130 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term36095, term36095.getClass(), "id", -1635471392209071620L);
        setLongField(term36097, term36097.getClass(), "id", -4714000263923324167L);
        setLongField(term36099, term36099.getClass(), "id", 6906379511067694917L);
        setField(term36099, term36099.getClass(), "extId", term36101);
        setField(term36099, term36099.getClass(), "luid", "IXPaHQnEUy");
        setIntField(term36116, term36116.getClass(), "year", 2024);
        setShortField(term36116, term36116.getClass(), "month", (short) 12);
        setShortField(term36116, term36116.getClass(), "day", (short) 11);
        setField(term36115, term36115.getClass(), "date", term36116);
        setByteField(term36120, term36120.getClass(), "hour", (byte) 19);
        setByteField(term36120, term36120.getClass(), "minute", (byte) 38);
        setByteField(term36120, term36120.getClass(), "second", (byte) 23);
        setIntField(term36120, term36120.getClass(), "nano", 207336939);
        setField(term36115, term36115.getClass(), "time", term36120);
        setField(term36099, term36099.getClass(), "registerTime", term36115);
        setIntField(term36126, term36126.getClass(), "year", 2023);
        setShortField(term36126, term36126.getClass(), "month", (short) 3);
        setShortField(term36126, term36126.getClass(), "day", (short) 29);
        setField(term36125, term36125.getClass(), "date", term36126);
        setByteField(term36130, term36130.getClass(), "hour", (byte) 12);
        setByteField(term36130, term36130.getClass(), "minute", (byte) 11);
        setByteField(term36130, term36130.getClass(), "second", (byte) 3);
        setIntField(term36130, term36130.getClass(), "nano", 876063258);
        setField(term36125, term36125.getClass(), "time", term36130);
        setField(term36099, term36099.getClass(), "accessTime", term36125);
        setField(term36097, term36097.getClass(), "card", term36099);
        setIntField(term36097, term36097.getClass(), "lastDataVersion", -465766326);
        setField(term36097, term36097.getClass(), "userName", "zhcWVVrrjs");
        setIntField(term36097, term36097.getClass(), "point", 369314367);
        setIntField(term36097, term36097.getClass(), "totalPoint", 256576657);
        setIntField(term36097, term36097.getClass(), "iconId", 1029365631);
        setIntField(term36097, term36097.getClass(), "nameplateId", 833153549);
        setIntField(term36097, term36097.getClass(), "frameId", 2031081082);
        setIntField(term36097, term36097.getClass(), "trophyId", -595867565);
        setIntField(term36097, term36097.getClass(), "playCount", -1428615750);
        setIntField(term36097, term36097.getClass(), "playVsCount", -247199850);
        setIntField(term36097, term36097.getClass(), "playSyncCount", 1369708580);
        setIntField(term36097, term36097.getClass(), "winCount", -1943851319);
        setIntField(term36097, term36097.getClass(), "helpCount", 1613470339);
        setIntField(term36097, term36097.getClass(), "comboCount", 764077315);
        setIntField(term36097, term36097.getClass(), "feverCount", -127465158);
        setIntField(term36097, term36097.getClass(), "totalHiScore", -727010746);
        setIntField(term36097, term36097.getClass(), "totalEasyHighScore", 1698984137);
        setIntField(term36097, term36097.getClass(), "totalBasicHighScore", 1539842378);
        setIntField(term36097, term36097.getClass(), "totalAdvancedHighScore", -2020812793);
        setIntField(term36097, term36097.getClass(), "totalExpertHighScore", 1214417682);
        setIntField(term36097, term36097.getClass(), "totalMasterHighScore", -492639935);
        setIntField(term36097, term36097.getClass(), "totalReMasterHighScore", 1013003846);
        setIntField(term36097, term36097.getClass(), "totalHighSync", -1997703261);
        setIntField(term36097, term36097.getClass(), "totalEasySync", 1822676900);
        setIntField(term36097, term36097.getClass(), "totalBasicSync", 1807366282);
        setIntField(term36097, term36097.getClass(), "totalAdvancedSync", 1352119826);
        setIntField(term36097, term36097.getClass(), "totalExpertSync", 399848636);
        setIntField(term36097, term36097.getClass(), "totalMasterSync", -1577579504);
        setIntField(term36097, term36097.getClass(), "totalReMasterSync", -1664214126);
        setIntField(term36097, term36097.getClass(), "playerRating", -124745318);
        setIntField(term36097, term36097.getClass(), "highestRating", 885215896);
        setIntField(term36097, term36097.getClass(), "rankAuthTailId", 1157850302);
        setField(term36097, term36097.getClass(), "eventWatchedDate", "EAMaFLdmaG");
        setField(term36097, term36097.getClass(), "webLimitDate", "DYZSJMwbhX");
        setIntField(term36097, term36097.getClass(), "challengeTrackPhase", -1748801993);
        setIntField(term36097, term36097.getClass(), "firstPlayBits", -1351089042);
        setField(term36097, term36097.getClass(), "lastPlayDate", "QGcshsIIWo");
        setIntField(term36097, term36097.getClass(), "lastPlaceId", -368642982);
        setField(term36097, term36097.getClass(), "lastPlaceName", "dPHtrzKWgf");
        setIntField(term36097, term36097.getClass(), "lastRegionId", 1100435548);
        setField(term36097, term36097.getClass(), "lastRegionName", "olmFxfIVeh");
        setField(term36097, term36097.getClass(), "lastClientId", "iSPirUEhXs");
        setField(term36097, term36097.getClass(), "lastCountryCode", "WWyLFmYpAy");
        setIntField(term36097, term36097.getClass(), "eventPoint", 1930975280);
        setIntField(term36097, term36097.getClass(), "totalLv", 1639113177);
        setIntField(term36097, term36097.getClass(), "lastLoginBonusDay", -1469393277);
        setIntField(term36097, term36097.getClass(), "lastSurvivalBonusDay", 1311573269);
        setIntField(term36097, term36097.getClass(), "loginBonusLv", 1393744942);
        setField(term36095, term36095.getClass(), "user", term36097);
        setIntField(term36095, term36095.getClass(), "characterId", 528056114);
        setIntField(term36095, term36095.getClass(), "point", 1730452667);
        setIntField(term36095, term36095.getClass(), "level", 760722690);
        term36274 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term36274;
        callMethod(klass, "canEqual", argTypes, term36095, args);
    }

};


