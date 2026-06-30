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

public class UserGeneralData_getId_19588018981 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108021;

    public UserGeneralData_getId_19588018981() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term108027 = new Long(4458302820344896046L);
        term108021 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserGeneralData"));
        Object term108023 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term108025 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term108041 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term108042 = newInstance(Class.forName("java.time.LocalDate"));
        Object term108046 = newInstance(Class.forName("java.time.LocalTime"));
        Object term108051 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term108052 = newInstance(Class.forName("java.time.LocalDate"));
        Object term108056 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term108021, term108021.getClass(), "id", 8532808243879007296L);
        setLongField(term108023, term108023.getClass(), "id", 3757985447600693853L);
        setLongField(term108025, term108025.getClass(), "id", 7118424169978013558L);
        setField(term108025, term108025.getClass(), "extId", term108027);
        setField(term108025, term108025.getClass(), "luid", "apdJoJDItV");
        setIntField(term108042, term108042.getClass(), "year", 2014);
        setShortField(term108042, term108042.getClass(), "month", (short) 6);
        setShortField(term108042, term108042.getClass(), "day", (short) 12);
        setField(term108041, term108041.getClass(), "date", term108042);
        setByteField(term108046, term108046.getClass(), "hour", (byte) 2);
        setByteField(term108046, term108046.getClass(), "minute", (byte) 24);
        setByteField(term108046, term108046.getClass(), "second", (byte) 28);
        setIntField(term108046, term108046.getClass(), "nano", 77504831);
        setField(term108041, term108041.getClass(), "time", term108046);
        setField(term108025, term108025.getClass(), "registerTime", term108041);
        setIntField(term108052, term108052.getClass(), "year", 2028);
        setShortField(term108052, term108052.getClass(), "month", (short) 11);
        setShortField(term108052, term108052.getClass(), "day", (short) 18);
        setField(term108051, term108051.getClass(), "date", term108052);
        setByteField(term108056, term108056.getClass(), "hour", (byte) 18);
        setByteField(term108056, term108056.getClass(), "minute", (byte) 21);
        setByteField(term108056, term108056.getClass(), "second", (byte) 32);
        setIntField(term108056, term108056.getClass(), "nano", 483463169);
        setField(term108051, term108051.getClass(), "time", term108056);
        setField(term108025, term108025.getClass(), "accessTime", term108051);
        setField(term108023, term108023.getClass(), "card", term108025);
        setIntField(term108023, term108023.getClass(), "lastDataVersion", 198419559);
        setField(term108023, term108023.getClass(), "userName", "UidjRWfqYK");
        setIntField(term108023, term108023.getClass(), "point", -187137059);
        setIntField(term108023, term108023.getClass(), "totalPoint", 1785454510);
        setIntField(term108023, term108023.getClass(), "iconId", 342838125);
        setIntField(term108023, term108023.getClass(), "nameplateId", 1139336608);
        setIntField(term108023, term108023.getClass(), "frameId", 217987429);
        setIntField(term108023, term108023.getClass(), "trophyId", -1331001027);
        setIntField(term108023, term108023.getClass(), "playCount", 1191278613);
        setIntField(term108023, term108023.getClass(), "playVsCount", -132996897);
        setIntField(term108023, term108023.getClass(), "playSyncCount", -698351557);
        setIntField(term108023, term108023.getClass(), "winCount", 442187587);
        setIntField(term108023, term108023.getClass(), "helpCount", 1002253912);
        setIntField(term108023, term108023.getClass(), "comboCount", 1461361961);
        setIntField(term108023, term108023.getClass(), "feverCount", -943692426);
        setIntField(term108023, term108023.getClass(), "totalHiScore", 466240025);
        setIntField(term108023, term108023.getClass(), "totalEasyHighScore", -2026987701);
        setIntField(term108023, term108023.getClass(), "totalBasicHighScore", -889572864);
        setIntField(term108023, term108023.getClass(), "totalAdvancedHighScore", 365154265);
        setIntField(term108023, term108023.getClass(), "totalExpertHighScore", -199029048);
        setIntField(term108023, term108023.getClass(), "totalMasterHighScore", -1738730758);
        setIntField(term108023, term108023.getClass(), "totalReMasterHighScore", 252807194);
        setIntField(term108023, term108023.getClass(), "totalHighSync", -1970748295);
        setIntField(term108023, term108023.getClass(), "totalEasySync", -970919712);
        setIntField(term108023, term108023.getClass(), "totalBasicSync", 644708268);
        setIntField(term108023, term108023.getClass(), "totalAdvancedSync", -171593389);
        setIntField(term108023, term108023.getClass(), "totalExpertSync", 1617777059);
        setIntField(term108023, term108023.getClass(), "totalMasterSync", 1582718344);
        setIntField(term108023, term108023.getClass(), "totalReMasterSync", 122167659);
        setIntField(term108023, term108023.getClass(), "playerRating", -1126970397);
        setIntField(term108023, term108023.getClass(), "highestRating", 1728431100);
        setIntField(term108023, term108023.getClass(), "rankAuthTailId", -869897258);
        setField(term108023, term108023.getClass(), "eventWatchedDate", "SrmUNtssfz");
        setField(term108023, term108023.getClass(), "webLimitDate", "ARMUeNVaDF");
        setIntField(term108023, term108023.getClass(), "challengeTrackPhase", 962362818);
        setIntField(term108023, term108023.getClass(), "firstPlayBits", -1177115437);
        setField(term108023, term108023.getClass(), "lastPlayDate", "EUduJelZVE");
        setIntField(term108023, term108023.getClass(), "lastPlaceId", -488175128);
        setField(term108023, term108023.getClass(), "lastPlaceName", "uwfvHKGrlb");
        setIntField(term108023, term108023.getClass(), "lastRegionId", -663945631);
        setField(term108023, term108023.getClass(), "lastRegionName", "pSLljKyfgK");
        setField(term108023, term108023.getClass(), "lastClientId", "JTQXicvesT");
        setField(term108023, term108023.getClass(), "lastCountryCode", "lfirJwUftT");
        setIntField(term108023, term108023.getClass(), "eventPoint", 721797064);
        setIntField(term108023, term108023.getClass(), "totalLv", 1046449580);
        setIntField(term108023, term108023.getClass(), "lastLoginBonusDay", 371812655);
        setIntField(term108023, term108023.getClass(), "lastSurvivalBonusDay", 1065841171);
        setIntField(term108023, term108023.getClass(), "loginBonusLv", 1086310493);
        setField(term108021, term108021.getClass(), "user", term108023);
        setField(term108021, term108021.getClass(), "propertyKey", "oiIvvyhWbf");
        setField(term108021, term108021.getClass(), "propertyValue", "EhCoIxBpMd");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserGeneralData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term108021, args);
    }

};


