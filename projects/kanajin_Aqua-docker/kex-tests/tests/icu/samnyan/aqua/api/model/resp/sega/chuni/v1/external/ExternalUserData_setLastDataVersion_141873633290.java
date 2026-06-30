package icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ExternalUserData_setLastDataVersion_141873633290 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36377;

    public ExternalUserData_setLastDataVersion_141873633290() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36377 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData"));
        Object term36402 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term36403 = newInstance(Class.forName("java.time.LocalDate"));
        Object term36407 = newInstance(Class.forName("java.time.LocalTime"));
        Object term36463 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term36464 = newInstance(Class.forName("java.time.LocalDate"));
        Object term36468 = newInstance(Class.forName("java.time.LocalTime"));
        Object term36511 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term36512 = newInstance(Class.forName("java.time.LocalDate"));
        Object term36516 = newInstance(Class.forName("java.time.LocalTime"));
        Object term36557 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term36558 = newInstance(Class.forName("java.time.LocalDate"));
        Object term36562 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term36377, term36377.getClass(), "accessCode", "HOgkhttJZS");
        setField(term36377, term36377.getClass(), "userName", "goqNSmXSSS");
        setIntField(term36403, term36403.getClass(), "year", 2018);
        setShortField(term36403, term36403.getClass(), "month", (short) 5);
        setShortField(term36403, term36403.getClass(), "day", (short) 15);
        setField(term36402, term36402.getClass(), "date", term36403);
        setByteField(term36407, term36407.getClass(), "hour", (byte) 17);
        setByteField(term36407, term36407.getClass(), "minute", (byte) 19);
        setByteField(term36407, term36407.getClass(), "second", (byte) 28);
        setIntField(term36407, term36407.getClass(), "nano", 153049369);
        setField(term36402, term36402.getClass(), "time", term36407);
        setField(term36377, term36377.getClass(), "lastLoginDate", term36402);
        setBooleanField(term36377, term36377.getClass(), "isWebJoin", false);
        setField(term36377, term36377.getClass(), "webLimitDate", "AkViBLdqXM");
        setIntField(term36377, term36377.getClass(), "level", -353671511);
        setIntField(term36377, term36377.getClass(), "reincarnationNum", 1598831363);
        setField(term36377, term36377.getClass(), "exp", "UlxGFzEifL");
        setLongField(term36377, term36377.getClass(), "point", 3288572082902580031L);
        setLongField(term36377, term36377.getClass(), "totalPoint", -8698230272673009418L);
        setIntField(term36377, term36377.getClass(), "playCount", -690367798);
        setIntField(term36377, term36377.getClass(), "multiPlayCount", 1863738073);
        setIntField(term36377, term36377.getClass(), "multiWinCount", 2009028243);
        setIntField(term36377, term36377.getClass(), "requestResCount", 1900131331);
        setIntField(term36377, term36377.getClass(), "acceptResCount", -1489604464);
        setIntField(term36377, term36377.getClass(), "successResCount", 601642248);
        setIntField(term36377, term36377.getClass(), "playerRating", -1186936928);
        setIntField(term36377, term36377.getClass(), "highestRating", -315380004);
        setIntField(term36377, term36377.getClass(), "nameplateId", -1945754843);
        setIntField(term36377, term36377.getClass(), "frameId", -1512221115);
        setIntField(term36377, term36377.getClass(), "characterId", -515486706);
        setIntField(term36377, term36377.getClass(), "trophyId", -612862488);
        setIntField(term36377, term36377.getClass(), "playedTutorialBit", 52739905);
        setIntField(term36377, term36377.getClass(), "firstTutorialCancelNum", -2105349391);
        setIntField(term36377, term36377.getClass(), "masterTutorialCancelNum", -1176968921);
        setIntField(term36377, term36377.getClass(), "totalRepertoireCount", -1986225025);
        setIntField(term36377, term36377.getClass(), "totalMapNum", -838689952);
        setLongField(term36377, term36377.getClass(), "totalHiScore", -8792567429538693571L);
        setLongField(term36377, term36377.getClass(), "totalBasicHighScore", 3810487266967550400L);
        setLongField(term36377, term36377.getClass(), "totalAdvancedHighScore", 8965244485590834147L);
        setLongField(term36377, term36377.getClass(), "totalExpertHighScore", -4825509285016265943L);
        setLongField(term36377, term36377.getClass(), "totalMasterHighScore", -1283563319051310751L);
        setIntField(term36464, term36464.getClass(), "year", 2018);
        setShortField(term36464, term36464.getClass(), "month", (short) 9);
        setShortField(term36464, term36464.getClass(), "day", (short) 19);
        setField(term36463, term36463.getClass(), "date", term36464);
        setByteField(term36468, term36468.getClass(), "hour", (byte) 23);
        setByteField(term36468, term36468.getClass(), "minute", (byte) 30);
        setByteField(term36468, term36468.getClass(), "second", (byte) 11);
        setIntField(term36468, term36468.getClass(), "nano", 615798597);
        setField(term36463, term36463.getClass(), "time", term36468);
        setField(term36377, term36377.getClass(), "eventWatchedDate", term36463);
        setIntField(term36377, term36377.getClass(), "friendCount", -307464652);
        setBooleanField(term36377, term36377.getClass(), "isMaimai", false);
        setField(term36377, term36377.getClass(), "firstGameId", "HilHTbDKDF");
        setField(term36377, term36377.getClass(), "firstRomVersion", "IaEqlVwmNS");
        setField(term36377, term36377.getClass(), "firstDataVersion", "ljNOgdPWrL");
        setIntField(term36512, term36512.getClass(), "year", 2021);
        setShortField(term36512, term36512.getClass(), "month", (short) 3);
        setShortField(term36512, term36512.getClass(), "day", (short) 13);
        setField(term36511, term36511.getClass(), "date", term36512);
        setByteField(term36516, term36516.getClass(), "hour", (byte) 11);
        setByteField(term36516, term36516.getClass(), "minute", (byte) 11);
        setByteField(term36516, term36516.getClass(), "second", (byte) 36);
        setIntField(term36516, term36516.getClass(), "nano", 411690155);
        setField(term36511, term36511.getClass(), "time", term36516);
        setField(term36377, term36377.getClass(), "firstPlayDate", term36511);
        setField(term36377, term36377.getClass(), "lastGameId", "oBlIZiyRMS");
        setField(term36377, term36377.getClass(), "lastRomVersion", "QUYAkhtCNh");
        setField(term36377, term36377.getClass(), "lastDataVersion", "kOaAQOLyqd");
        setIntField(term36558, term36558.getClass(), "year", 2025);
        setShortField(term36558, term36558.getClass(), "month", (short) 2);
        setShortField(term36558, term36558.getClass(), "day", (short) 24);
        setField(term36557, term36557.getClass(), "date", term36558);
        setByteField(term36562, term36562.getClass(), "hour", (byte) 10);
        setByteField(term36562, term36562.getClass(), "minute", (byte) 56);
        setByteField(term36562, term36562.getClass(), "second", (byte) 29);
        setIntField(term36562, term36562.getClass(), "nano", 207724630);
        setField(term36557, term36557.getClass(), "time", term36562);
        setField(term36377, term36377.getClass(), "lastPlayDate", term36557);
        setIntField(term36377, term36377.getClass(), "lastPlaceId", 460605690);
        setField(term36377, term36377.getClass(), "lastPlaceName", "ICBWiKaeHC");
        setField(term36377, term36377.getClass(), "lastRegionId", "WAljagiCzu");
        setField(term36377, term36377.getClass(), "lastRegionName", "XKMXfDZajw");
        setField(term36377, term36377.getClass(), "lastAllNetId", "avZoBQSrBy");
        setField(term36377, term36377.getClass(), "lastClientId", "KIXGeHXdwi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "tTfdvLMwEE";
        callMethod(klass, "setLastDataVersion", argTypes, term36377, args);
    }

};


