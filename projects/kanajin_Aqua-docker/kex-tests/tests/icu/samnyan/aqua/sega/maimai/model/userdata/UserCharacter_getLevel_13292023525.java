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

public class UserCharacter_getLevel_13292023525 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33939;

    public UserCharacter_getLevel_13292023525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term33945 = new Long(-685023850445639859L);
        term33939 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserCharacter"));
        Object term33941 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term33943 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term33959 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term33960 = newInstance(Class.forName("java.time.LocalDate"));
        Object term33964 = newInstance(Class.forName("java.time.LocalTime"));
        Object term33969 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term33970 = newInstance(Class.forName("java.time.LocalDate"));
        Object term33974 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term33939, term33939.getClass(), "id", -8019730974733786399L);
        setLongField(term33941, term33941.getClass(), "id", 394960377236392159L);
        setLongField(term33943, term33943.getClass(), "id", -2955854401507097864L);
        setField(term33943, term33943.getClass(), "extId", term33945);
        setField(term33943, term33943.getClass(), "luid", "YcgHACNgyo");
        setIntField(term33960, term33960.getClass(), "year", 2023);
        setShortField(term33960, term33960.getClass(), "month", (short) 5);
        setShortField(term33960, term33960.getClass(), "day", (short) 19);
        setField(term33959, term33959.getClass(), "date", term33960);
        setByteField(term33964, term33964.getClass(), "hour", (byte) 20);
        setByteField(term33964, term33964.getClass(), "minute", (byte) 50);
        setByteField(term33964, term33964.getClass(), "second", (byte) 49);
        setIntField(term33964, term33964.getClass(), "nano", 806710892);
        setField(term33959, term33959.getClass(), "time", term33964);
        setField(term33943, term33943.getClass(), "registerTime", term33959);
        setIntField(term33970, term33970.getClass(), "year", 2022);
        setShortField(term33970, term33970.getClass(), "month", (short) 8);
        setShortField(term33970, term33970.getClass(), "day", (short) 3);
        setField(term33969, term33969.getClass(), "date", term33970);
        setByteField(term33974, term33974.getClass(), "hour", (byte) 18);
        setByteField(term33974, term33974.getClass(), "minute", (byte) 3);
        setByteField(term33974, term33974.getClass(), "second", (byte) 33);
        setIntField(term33974, term33974.getClass(), "nano", 770583920);
        setField(term33969, term33969.getClass(), "time", term33974);
        setField(term33943, term33943.getClass(), "accessTime", term33969);
        setField(term33941, term33941.getClass(), "card", term33943);
        setIntField(term33941, term33941.getClass(), "lastDataVersion", 752002755);
        setField(term33941, term33941.getClass(), "userName", "MrUPJzBTEn");
        setIntField(term33941, term33941.getClass(), "point", -975157064);
        setIntField(term33941, term33941.getClass(), "totalPoint", -378255267);
        setIntField(term33941, term33941.getClass(), "iconId", -1205835103);
        setIntField(term33941, term33941.getClass(), "nameplateId", -2022370596);
        setIntField(term33941, term33941.getClass(), "frameId", 856428856);
        setIntField(term33941, term33941.getClass(), "trophyId", 1295040350);
        setIntField(term33941, term33941.getClass(), "playCount", 1744402926);
        setIntField(term33941, term33941.getClass(), "playVsCount", -68148707);
        setIntField(term33941, term33941.getClass(), "playSyncCount", -487634357);
        setIntField(term33941, term33941.getClass(), "winCount", 52605389);
        setIntField(term33941, term33941.getClass(), "helpCount", -769585004);
        setIntField(term33941, term33941.getClass(), "comboCount", 483184455);
        setIntField(term33941, term33941.getClass(), "feverCount", -1969040570);
        setIntField(term33941, term33941.getClass(), "totalHiScore", 1627123408);
        setIntField(term33941, term33941.getClass(), "totalEasyHighScore", 782600956);
        setIntField(term33941, term33941.getClass(), "totalBasicHighScore", -1051453067);
        setIntField(term33941, term33941.getClass(), "totalAdvancedHighScore", -865849681);
        setIntField(term33941, term33941.getClass(), "totalExpertHighScore", -1554795442);
        setIntField(term33941, term33941.getClass(), "totalMasterHighScore", 1486110844);
        setIntField(term33941, term33941.getClass(), "totalReMasterHighScore", 1811211444);
        setIntField(term33941, term33941.getClass(), "totalHighSync", -1188357817);
        setIntField(term33941, term33941.getClass(), "totalEasySync", 800428961);
        setIntField(term33941, term33941.getClass(), "totalBasicSync", 1035639807);
        setIntField(term33941, term33941.getClass(), "totalAdvancedSync", 1255067608);
        setIntField(term33941, term33941.getClass(), "totalExpertSync", -1085076149);
        setIntField(term33941, term33941.getClass(), "totalMasterSync", 2037214602);
        setIntField(term33941, term33941.getClass(), "totalReMasterSync", 1791859428);
        setIntField(term33941, term33941.getClass(), "playerRating", 313791373);
        setIntField(term33941, term33941.getClass(), "highestRating", -1757202955);
        setIntField(term33941, term33941.getClass(), "rankAuthTailId", -1618822811);
        setField(term33941, term33941.getClass(), "eventWatchedDate", "IaSymdfFGa");
        setField(term33941, term33941.getClass(), "webLimitDate", "FxSvJCIpul");
        setIntField(term33941, term33941.getClass(), "challengeTrackPhase", -850405849);
        setIntField(term33941, term33941.getClass(), "firstPlayBits", -545145172);
        setField(term33941, term33941.getClass(), "lastPlayDate", "HCjKwpexJj");
        setIntField(term33941, term33941.getClass(), "lastPlaceId", -2069653687);
        setField(term33941, term33941.getClass(), "lastPlaceName", "sCpIHVPdfl");
        setIntField(term33941, term33941.getClass(), "lastRegionId", -1832612963);
        setField(term33941, term33941.getClass(), "lastRegionName", "lMUBBGRjfY");
        setField(term33941, term33941.getClass(), "lastClientId", "olYpqbolWL");
        setField(term33941, term33941.getClass(), "lastCountryCode", "MCMCjxXzjw");
        setIntField(term33941, term33941.getClass(), "eventPoint", 1064073662);
        setIntField(term33941, term33941.getClass(), "totalLv", 1120854991);
        setIntField(term33941, term33941.getClass(), "lastLoginBonusDay", 1448504845);
        setIntField(term33941, term33941.getClass(), "lastSurvivalBonusDay", 451612513);
        setIntField(term33941, term33941.getClass(), "loginBonusLv", 343920197);
        setField(term33939, term33939.getClass(), "user", term33941);
        setIntField(term33939, term33939.getClass(), "characterId", -521630681);
        setIntField(term33939, term33939.getClass(), "point", 1297681432);
        setIntField(term33939, term33939.getClass(), "level", 820668311);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLevel", argTypes, term33939, args);
    }

};


