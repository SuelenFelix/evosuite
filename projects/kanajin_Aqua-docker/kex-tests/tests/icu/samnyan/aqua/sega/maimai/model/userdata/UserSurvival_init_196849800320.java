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
import java.lang.Boolean;

public class UserSurvival_init_196849800320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107309;
     Object term107311;
     Object term107485;
     Object term107487;
     Object term107489;
     Object term107491;
     Object term107493;

    public UserSurvival_init_196849800320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107309 = new Long(3834297266838969495L);
        Long term107315 = new Long(-7001094993638840490L);
        term107311 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term107313 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term107329 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term107330 = newInstance(Class.forName("java.time.LocalDate"));
        Object term107334 = newInstance(Class.forName("java.time.LocalTime"));
        Object term107339 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term107340 = newInstance(Class.forName("java.time.LocalDate"));
        Object term107344 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term107311, term107311.getClass(), "id", -3257831489581525693L);
        setLongField(term107313, term107313.getClass(), "id", 273141122717896399L);
        setField(term107313, term107313.getClass(), "extId", term107315);
        setField(term107313, term107313.getClass(), "luid", "qMveUiByVL");
        setIntField(term107330, term107330.getClass(), "year", 2010);
        setShortField(term107330, term107330.getClass(), "month", (short) 3);
        setShortField(term107330, term107330.getClass(), "day", (short) 19);
        setField(term107329, term107329.getClass(), "date", term107330);
        setByteField(term107334, term107334.getClass(), "hour", (byte) 8);
        setByteField(term107334, term107334.getClass(), "minute", (byte) 38);
        setByteField(term107334, term107334.getClass(), "second", (byte) 34);
        setIntField(term107334, term107334.getClass(), "nano", 473897267);
        setField(term107329, term107329.getClass(), "time", term107334);
        setField(term107313, term107313.getClass(), "registerTime", term107329);
        setIntField(term107340, term107340.getClass(), "year", 2023);
        setShortField(term107340, term107340.getClass(), "month", (short) 3);
        setShortField(term107340, term107340.getClass(), "day", (short) 17);
        setField(term107339, term107339.getClass(), "date", term107340);
        setByteField(term107344, term107344.getClass(), "hour", (byte) 13);
        setByteField(term107344, term107344.getClass(), "minute", (byte) 18);
        setByteField(term107344, term107344.getClass(), "second", (byte) 12);
        setIntField(term107344, term107344.getClass(), "nano", 422255508);
        setField(term107339, term107339.getClass(), "time", term107344);
        setField(term107313, term107313.getClass(), "accessTime", term107339);
        setField(term107311, term107311.getClass(), "card", term107313);
        setIntField(term107311, term107311.getClass(), "lastDataVersion", -1019693873);
        setField(term107311, term107311.getClass(), "userName", "VfhPQKCIrE");
        setIntField(term107311, term107311.getClass(), "point", 1079247960);
        setIntField(term107311, term107311.getClass(), "totalPoint", 2145303715);
        setIntField(term107311, term107311.getClass(), "iconId", -307543677);
        setIntField(term107311, term107311.getClass(), "nameplateId", -2034844354);
        setIntField(term107311, term107311.getClass(), "frameId", 1068979901);
        setIntField(term107311, term107311.getClass(), "trophyId", 2060073727);
        setIntField(term107311, term107311.getClass(), "playCount", -1770044035);
        setIntField(term107311, term107311.getClass(), "playVsCount", -2104780176);
        setIntField(term107311, term107311.getClass(), "playSyncCount", -1976301777);
        setIntField(term107311, term107311.getClass(), "winCount", -463965331);
        setIntField(term107311, term107311.getClass(), "helpCount", 769940367);
        setIntField(term107311, term107311.getClass(), "comboCount", 1030297962);
        setIntField(term107311, term107311.getClass(), "feverCount", -925377527);
        setIntField(term107311, term107311.getClass(), "totalHiScore", 1946040384);
        setIntField(term107311, term107311.getClass(), "totalEasyHighScore", -870849674);
        setIntField(term107311, term107311.getClass(), "totalBasicHighScore", -365807826);
        setIntField(term107311, term107311.getClass(), "totalAdvancedHighScore", -1527783758);
        setIntField(term107311, term107311.getClass(), "totalExpertHighScore", 1611976687);
        setIntField(term107311, term107311.getClass(), "totalMasterHighScore", -1847574054);
        setIntField(term107311, term107311.getClass(), "totalReMasterHighScore", -1096876519);
        setIntField(term107311, term107311.getClass(), "totalHighSync", -1260030158);
        setIntField(term107311, term107311.getClass(), "totalEasySync", -1556763879);
        setIntField(term107311, term107311.getClass(), "totalBasicSync", -640616441);
        setIntField(term107311, term107311.getClass(), "totalAdvancedSync", 209081740);
        setIntField(term107311, term107311.getClass(), "totalExpertSync", -845599480);
        setIntField(term107311, term107311.getClass(), "totalMasterSync", -997394743);
        setIntField(term107311, term107311.getClass(), "totalReMasterSync", -2121530653);
        setIntField(term107311, term107311.getClass(), "playerRating", 1319282638);
        setIntField(term107311, term107311.getClass(), "highestRating", -949477062);
        setIntField(term107311, term107311.getClass(), "rankAuthTailId", -1991471366);
        setField(term107311, term107311.getClass(), "eventWatchedDate", "RUgpUeqcGS");
        setField(term107311, term107311.getClass(), "webLimitDate", "ufopOhWQkB");
        setIntField(term107311, term107311.getClass(), "challengeTrackPhase", -951732964);
        setIntField(term107311, term107311.getClass(), "firstPlayBits", 810582577);
        setField(term107311, term107311.getClass(), "lastPlayDate", "RqVPcaMpxk");
        setIntField(term107311, term107311.getClass(), "lastPlaceId", -481913428);
        setField(term107311, term107311.getClass(), "lastPlaceName", "zOsnJKDwhL");
        setIntField(term107311, term107311.getClass(), "lastRegionId", 1878857053);
        setField(term107311, term107311.getClass(), "lastRegionName", "VCOuRNQveV");
        setField(term107311, term107311.getClass(), "lastClientId", "wOBUMePcSQ");
        setField(term107311, term107311.getClass(), "lastCountryCode", "SkfJvbcpSy");
        setIntField(term107311, term107311.getClass(), "eventPoint", -1703968608);
        setIntField(term107311, term107311.getClass(), "totalLv", -1516989582);
        setIntField(term107311, term107311.getClass(), "lastLoginBonusDay", -1473571403);
        setIntField(term107311, term107311.getClass(), "lastSurvivalBonusDay", -33345447);
        setIntField(term107311, term107311.getClass(), "loginBonusLv", -473865390);
        term107485 = new Integer(1560849509);
        term107487 = new Integer(548082671);
        term107489 = new Integer(143341138);
        term107491 = new Boolean(false);
        term107493 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserSurvival");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = boolean.class;
        argTypes[6] = boolean.class;
        Object[] args = new Object[7];
        args[0] = term107309;
        args[1] = term107311;
        args[2] = term107485;
        args[3] = term107487;
        args[4] = term107489;
        args[5] = term107491;
        args[6] = term107493;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


