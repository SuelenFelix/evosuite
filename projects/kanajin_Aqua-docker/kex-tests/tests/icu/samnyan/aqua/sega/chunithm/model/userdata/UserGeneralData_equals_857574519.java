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

public class UserGeneralData_equals_857574519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term307215;
     Object term307517;

    public UserGeneralData_equals_857574519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term307221 = new Long(4548576710115075073L);
        term307215 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGeneralData"));
        Object term307217 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term307219 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term307235 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term307236 = newInstance(Class.forName("java.time.LocalDate"));
        Object term307240 = newInstance(Class.forName("java.time.LocalTime"));
        Object term307245 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term307246 = newInstance(Class.forName("java.time.LocalDate"));
        Object term307250 = newInstance(Class.forName("java.time.LocalTime"));
        Object term307267 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term307268 = newInstance(Class.forName("java.time.LocalDate"));
        Object term307272 = newInstance(Class.forName("java.time.LocalTime"));
        Object term307328 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term307329 = newInstance(Class.forName("java.time.LocalDate"));
        Object term307333 = newInstance(Class.forName("java.time.LocalTime"));
        Object term307376 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term307377 = newInstance(Class.forName("java.time.LocalDate"));
        Object term307381 = newInstance(Class.forName("java.time.LocalTime"));
        Object term307422 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term307423 = newInstance(Class.forName("java.time.LocalDate"));
        Object term307427 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term307215, term307215.getClass(), "id", -580146737256999868L);
        setLongField(term307217, term307217.getClass(), "id", 3455894127448585088L);
        setLongField(term307219, term307219.getClass(), "id", 7664533889848969246L);
        setField(term307219, term307219.getClass(), "extId", term307221);
        setField(term307219, term307219.getClass(), "luid", "BxmcTjXInn");
        setIntField(term307236, term307236.getClass(), "year", 2027);
        setShortField(term307236, term307236.getClass(), "month", (short) 11);
        setShortField(term307236, term307236.getClass(), "day", (short) 23);
        setField(term307235, term307235.getClass(), "date", term307236);
        setByteField(term307240, term307240.getClass(), "hour", (byte) 6);
        setByteField(term307240, term307240.getClass(), "minute", (byte) 27);
        setByteField(term307240, term307240.getClass(), "second", (byte) 11);
        setIntField(term307240, term307240.getClass(), "nano", 215258553);
        setField(term307235, term307235.getClass(), "time", term307240);
        setField(term307219, term307219.getClass(), "registerTime", term307235);
        setIntField(term307246, term307246.getClass(), "year", 2011);
        setShortField(term307246, term307246.getClass(), "month", (short) 9);
        setShortField(term307246, term307246.getClass(), "day", (short) 13);
        setField(term307245, term307245.getClass(), "date", term307246);
        setByteField(term307250, term307250.getClass(), "hour", (byte) 19);
        setByteField(term307250, term307250.getClass(), "minute", (byte) 45);
        setByteField(term307250, term307250.getClass(), "second", (byte) 36);
        setIntField(term307250, term307250.getClass(), "nano", 990971739);
        setField(term307245, term307245.getClass(), "time", term307250);
        setField(term307219, term307219.getClass(), "accessTime", term307245);
        setField(term307217, term307217.getClass(), "card", term307219);
        setField(term307217, term307217.getClass(), "userName", "aVPQtBXJuy");
        setIntField(term307268, term307268.getClass(), "year", 2021);
        setShortField(term307268, term307268.getClass(), "month", (short) 9);
        setShortField(term307268, term307268.getClass(), "day", (short) 17);
        setField(term307267, term307267.getClass(), "date", term307268);
        setByteField(term307272, term307272.getClass(), "hour", (byte) 9);
        setByteField(term307272, term307272.getClass(), "minute", (byte) 1);
        setByteField(term307272, term307272.getClass(), "second", (byte) 48);
        setIntField(term307272, term307272.getClass(), "nano", 366443020);
        setField(term307267, term307267.getClass(), "time", term307272);
        setField(term307217, term307217.getClass(), "lastLoginDate", term307267);
        setBooleanField(term307217, term307217.getClass(), "isWebJoin", false);
        setField(term307217, term307217.getClass(), "webLimitDate", "SWtqfxdgNg");
        setIntField(term307217, term307217.getClass(), "level", 1273867637);
        setIntField(term307217, term307217.getClass(), "reincarnationNum", 1418101531);
        setField(term307217, term307217.getClass(), "exp", "jsgrwgnbEn");
        setLongField(term307217, term307217.getClass(), "point", -9084332621876549048L);
        setLongField(term307217, term307217.getClass(), "totalPoint", -6009441163360803919L);
        setIntField(term307217, term307217.getClass(), "playCount", 769920456);
        setIntField(term307217, term307217.getClass(), "multiPlayCount", -477204253);
        setIntField(term307217, term307217.getClass(), "multiWinCount", 1662398256);
        setIntField(term307217, term307217.getClass(), "requestResCount", 1766347483);
        setIntField(term307217, term307217.getClass(), "acceptResCount", -423561050);
        setIntField(term307217, term307217.getClass(), "successResCount", 1213171057);
        setIntField(term307217, term307217.getClass(), "playerRating", 1305018379);
        setIntField(term307217, term307217.getClass(), "highestRating", 1128377530);
        setIntField(term307217, term307217.getClass(), "nameplateId", -566082419);
        setIntField(term307217, term307217.getClass(), "frameId", 507892364);
        setIntField(term307217, term307217.getClass(), "characterId", -1303417924);
        setIntField(term307217, term307217.getClass(), "trophyId", 690014633);
        setIntField(term307217, term307217.getClass(), "playedTutorialBit", 887139549);
        setIntField(term307217, term307217.getClass(), "firstTutorialCancelNum", -1974628635);
        setIntField(term307217, term307217.getClass(), "masterTutorialCancelNum", 1927255362);
        setIntField(term307217, term307217.getClass(), "totalRepertoireCount", 772050796);
        setIntField(term307217, term307217.getClass(), "totalMapNum", -1285946960);
        setLongField(term307217, term307217.getClass(), "totalHiScore", -8881477098752211725L);
        setLongField(term307217, term307217.getClass(), "totalBasicHighScore", -1861906512478722940L);
        setLongField(term307217, term307217.getClass(), "totalAdvancedHighScore", 6061874064969433300L);
        setLongField(term307217, term307217.getClass(), "totalExpertHighScore", 4026231818761862019L);
        setLongField(term307217, term307217.getClass(), "totalMasterHighScore", -6754907102141916706L);
        setIntField(term307329, term307329.getClass(), "year", 2014);
        setShortField(term307329, term307329.getClass(), "month", (short) 12);
        setShortField(term307329, term307329.getClass(), "day", (short) 19);
        setField(term307328, term307328.getClass(), "date", term307329);
        setByteField(term307333, term307333.getClass(), "hour", (byte) 8);
        setByteField(term307333, term307333.getClass(), "minute", (byte) 38);
        setByteField(term307333, term307333.getClass(), "second", (byte) 11);
        setIntField(term307333, term307333.getClass(), "nano", 547315308);
        setField(term307328, term307328.getClass(), "time", term307333);
        setField(term307217, term307217.getClass(), "eventWatchedDate", term307328);
        setIntField(term307217, term307217.getClass(), "friendCount", 1737634703);
        setBooleanField(term307217, term307217.getClass(), "isMaimai", true);
        setField(term307217, term307217.getClass(), "firstGameId", "vwbyoYQzvo");
        setField(term307217, term307217.getClass(), "firstRomVersion", "RtAsTvbELo");
        setField(term307217, term307217.getClass(), "firstDataVersion", "reFozIJLZz");
        setIntField(term307377, term307377.getClass(), "year", 2020);
        setShortField(term307377, term307377.getClass(), "month", (short) 9);
        setShortField(term307377, term307377.getClass(), "day", (short) 26);
        setField(term307376, term307376.getClass(), "date", term307377);
        setByteField(term307381, term307381.getClass(), "hour", (byte) 11);
        setByteField(term307381, term307381.getClass(), "minute", (byte) 2);
        setByteField(term307381, term307381.getClass(), "second", (byte) 50);
        setIntField(term307381, term307381.getClass(), "nano", 113500831);
        setField(term307376, term307376.getClass(), "time", term307381);
        setField(term307217, term307217.getClass(), "firstPlayDate", term307376);
        setField(term307217, term307217.getClass(), "lastGameId", "oGDahLAYSF");
        setField(term307217, term307217.getClass(), "lastRomVersion", "RNRZKctZBC");
        setField(term307217, term307217.getClass(), "lastDataVersion", "OzqbIrAqJB");
        setIntField(term307423, term307423.getClass(), "year", 2022);
        setShortField(term307423, term307423.getClass(), "month", (short) 1);
        setShortField(term307423, term307423.getClass(), "day", (short) 9);
        setField(term307422, term307422.getClass(), "date", term307423);
        setByteField(term307427, term307427.getClass(), "hour", (byte) 6);
        setByteField(term307427, term307427.getClass(), "minute", (byte) 47);
        setByteField(term307427, term307427.getClass(), "second", (byte) 10);
        setIntField(term307427, term307427.getClass(), "nano", 277676966);
        setField(term307422, term307422.getClass(), "time", term307427);
        setField(term307217, term307217.getClass(), "lastPlayDate", term307422);
        setIntField(term307217, term307217.getClass(), "lastPlaceId", 793533464);
        setField(term307217, term307217.getClass(), "lastPlaceName", "oHBNAywdjX");
        setField(term307217, term307217.getClass(), "lastRegionId", "LtXEvmsGft");
        setField(term307217, term307217.getClass(), "lastRegionName", "lQlNRkcQRY");
        setField(term307217, term307217.getClass(), "lastAllNetId", "tGFJhbkqHf");
        setField(term307217, term307217.getClass(), "lastClientId", "IPPRLZGZBn");
        setField(term307215, term307215.getClass(), "user", term307217);
        setField(term307215, term307215.getClass(), "propertyKey", "FvDAlgSUBA");
        setField(term307215, term307215.getClass(), "propertyValue", "RSpTPOOWxv");
        term307517 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGeneralData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term307517;
        callMethod(klass, "equals", argTypes, term307215, args);
    }

};


