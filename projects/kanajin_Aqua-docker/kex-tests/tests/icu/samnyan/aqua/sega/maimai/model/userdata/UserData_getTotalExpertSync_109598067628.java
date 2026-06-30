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

public class UserData_getTotalExpertSync_109598067628 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7393;

    public UserData_getTotalExpertSync_109598067628() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7397 = new Long(1967728129628047933L);
        term7393 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term7395 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term7411 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7412 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7416 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7421 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7422 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7426 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term7393, term7393.getClass(), "id", -7738503207562305297L);
        setLongField(term7395, term7395.getClass(), "id", 3825396310311739952L);
        setField(term7395, term7395.getClass(), "extId", term7397);
        setField(term7395, term7395.getClass(), "luid", "CKWpJaaaxX");
        setIntField(term7412, term7412.getClass(), "year", 2022);
        setShortField(term7412, term7412.getClass(), "month", (short) 6);
        setShortField(term7412, term7412.getClass(), "day", (short) 20);
        setField(term7411, term7411.getClass(), "date", term7412);
        setByteField(term7416, term7416.getClass(), "hour", (byte) 7);
        setByteField(term7416, term7416.getClass(), "minute", (byte) 57);
        setByteField(term7416, term7416.getClass(), "second", (byte) 37);
        setIntField(term7416, term7416.getClass(), "nano", 90374877);
        setField(term7411, term7411.getClass(), "time", term7416);
        setField(term7395, term7395.getClass(), "registerTime", term7411);
        setIntField(term7422, term7422.getClass(), "year", 2023);
        setShortField(term7422, term7422.getClass(), "month", (short) 2);
        setShortField(term7422, term7422.getClass(), "day", (short) 16);
        setField(term7421, term7421.getClass(), "date", term7422);
        setByteField(term7426, term7426.getClass(), "hour", (byte) 3);
        setByteField(term7426, term7426.getClass(), "minute", (byte) 18);
        setByteField(term7426, term7426.getClass(), "second", (byte) 56);
        setIntField(term7426, term7426.getClass(), "nano", 733017887);
        setField(term7421, term7421.getClass(), "time", term7426);
        setField(term7395, term7395.getClass(), "accessTime", term7421);
        setField(term7393, term7393.getClass(), "card", term7395);
        setIntField(term7393, term7393.getClass(), "lastDataVersion", 1302110708);
        setField(term7393, term7393.getClass(), "userName", "UBRmXJmfrt");
        setIntField(term7393, term7393.getClass(), "point", 594705497);
        setIntField(term7393, term7393.getClass(), "totalPoint", -600102466);
        setIntField(term7393, term7393.getClass(), "iconId", -899986714);
        setIntField(term7393, term7393.getClass(), "nameplateId", 1307244466);
        setIntField(term7393, term7393.getClass(), "frameId", -252262096);
        setIntField(term7393, term7393.getClass(), "trophyId", -37129068);
        setIntField(term7393, term7393.getClass(), "playCount", -861014847);
        setIntField(term7393, term7393.getClass(), "playVsCount", 2132934139);
        setIntField(term7393, term7393.getClass(), "playSyncCount", -1261824381);
        setIntField(term7393, term7393.getClass(), "winCount", 1594426218);
        setIntField(term7393, term7393.getClass(), "helpCount", -2060535464);
        setIntField(term7393, term7393.getClass(), "comboCount", -1242946317);
        setIntField(term7393, term7393.getClass(), "feverCount", -1541566235);
        setIntField(term7393, term7393.getClass(), "totalHiScore", -189738995);
        setIntField(term7393, term7393.getClass(), "totalEasyHighScore", 1943019963);
        setIntField(term7393, term7393.getClass(), "totalBasicHighScore", 186472650);
        setIntField(term7393, term7393.getClass(), "totalAdvancedHighScore", 279675992);
        setIntField(term7393, term7393.getClass(), "totalExpertHighScore", -1626074989);
        setIntField(term7393, term7393.getClass(), "totalMasterHighScore", -552272253);
        setIntField(term7393, term7393.getClass(), "totalReMasterHighScore", -633523956);
        setIntField(term7393, term7393.getClass(), "totalHighSync", 1761540885);
        setIntField(term7393, term7393.getClass(), "totalEasySync", -168498989);
        setIntField(term7393, term7393.getClass(), "totalBasicSync", 388247095);
        setIntField(term7393, term7393.getClass(), "totalAdvancedSync", -1320402633);
        setIntField(term7393, term7393.getClass(), "totalExpertSync", 919602316);
        setIntField(term7393, term7393.getClass(), "totalMasterSync", 1833713431);
        setIntField(term7393, term7393.getClass(), "totalReMasterSync", -706222608);
        setIntField(term7393, term7393.getClass(), "playerRating", -2003607923);
        setIntField(term7393, term7393.getClass(), "highestRating", 1378805929);
        setIntField(term7393, term7393.getClass(), "rankAuthTailId", 695052304);
        setField(term7393, term7393.getClass(), "eventWatchedDate", "WZzvmIHhzZ");
        setField(term7393, term7393.getClass(), "webLimitDate", "doQLHkjpNm");
        setIntField(term7393, term7393.getClass(), "challengeTrackPhase", -179937218);
        setIntField(term7393, term7393.getClass(), "firstPlayBits", 940896043);
        setField(term7393, term7393.getClass(), "lastPlayDate", "lCyLIcSuom");
        setIntField(term7393, term7393.getClass(), "lastPlaceId", -1156002984);
        setField(term7393, term7393.getClass(), "lastPlaceName", "CGOpQSZZwI");
        setIntField(term7393, term7393.getClass(), "lastRegionId", 1676254730);
        setField(term7393, term7393.getClass(), "lastRegionName", "ypEdrstygY");
        setField(term7393, term7393.getClass(), "lastClientId", "sNQFlATEeQ");
        setField(term7393, term7393.getClass(), "lastCountryCode", "ZKMLioamsY");
        setIntField(term7393, term7393.getClass(), "eventPoint", -1661200819);
        setIntField(term7393, term7393.getClass(), "totalLv", -235039141);
        setIntField(term7393, term7393.getClass(), "lastLoginBonusDay", -1414233013);
        setIntField(term7393, term7393.getClass(), "lastSurvivalBonusDay", -1174440096);
        setIntField(term7393, term7393.getClass(), "loginBonusLv", -679614653);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalExpertSync", argTypes, term7393, args);
    }

};


