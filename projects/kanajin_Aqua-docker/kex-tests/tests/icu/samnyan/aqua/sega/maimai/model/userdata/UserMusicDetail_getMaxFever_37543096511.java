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

public class UserMusicDetail_getMaxFever_37543096511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term182953;

    public UserMusicDetail_getMaxFever_37543096511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term182959 = new Long(1550364590565203407L);
        term182953 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserMusicDetail"));
        Object term182955 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term182957 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term182973 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term182974 = newInstance(Class.forName("java.time.LocalDate"));
        Object term182978 = newInstance(Class.forName("java.time.LocalTime"));
        Object term182983 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term182984 = newInstance(Class.forName("java.time.LocalDate"));
        Object term182988 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term182953, term182953.getClass(), "id", -2505520083946785927L);
        setLongField(term182955, term182955.getClass(), "id", 3830634993165746272L);
        setLongField(term182957, term182957.getClass(), "id", -7432340314800293983L);
        setField(term182957, term182957.getClass(), "extId", term182959);
        setField(term182957, term182957.getClass(), "luid", "ZkckWvQlSC");
        setIntField(term182974, term182974.getClass(), "year", 2025);
        setShortField(term182974, term182974.getClass(), "month", (short) 6);
        setShortField(term182974, term182974.getClass(), "day", (short) 10);
        setField(term182973, term182973.getClass(), "date", term182974);
        setByteField(term182978, term182978.getClass(), "hour", (byte) 2);
        setByteField(term182978, term182978.getClass(), "minute", (byte) 11);
        setByteField(term182978, term182978.getClass(), "second", (byte) 0);
        setIntField(term182978, term182978.getClass(), "nano", 567450408);
        setField(term182973, term182973.getClass(), "time", term182978);
        setField(term182957, term182957.getClass(), "registerTime", term182973);
        setIntField(term182984, term182984.getClass(), "year", 2012);
        setShortField(term182984, term182984.getClass(), "month", (short) 1);
        setShortField(term182984, term182984.getClass(), "day", (short) 29);
        setField(term182983, term182983.getClass(), "date", term182984);
        setByteField(term182988, term182988.getClass(), "hour", (byte) 8);
        setByteField(term182988, term182988.getClass(), "minute", (byte) 32);
        setByteField(term182988, term182988.getClass(), "second", (byte) 23);
        setIntField(term182988, term182988.getClass(), "nano", 150335383);
        setField(term182983, term182983.getClass(), "time", term182988);
        setField(term182957, term182957.getClass(), "accessTime", term182983);
        setField(term182955, term182955.getClass(), "card", term182957);
        setIntField(term182955, term182955.getClass(), "lastDataVersion", 1131148296);
        setField(term182955, term182955.getClass(), "userName", "RMAILvTevE");
        setIntField(term182955, term182955.getClass(), "point", -371210957);
        setIntField(term182955, term182955.getClass(), "totalPoint", 542294244);
        setIntField(term182955, term182955.getClass(), "iconId", 972245562);
        setIntField(term182955, term182955.getClass(), "nameplateId", -1098946020);
        setIntField(term182955, term182955.getClass(), "frameId", 73489438);
        setIntField(term182955, term182955.getClass(), "trophyId", -2045108354);
        setIntField(term182955, term182955.getClass(), "playCount", -1520644405);
        setIntField(term182955, term182955.getClass(), "playVsCount", 1770399524);
        setIntField(term182955, term182955.getClass(), "playSyncCount", 1782950762);
        setIntField(term182955, term182955.getClass(), "winCount", 17925883);
        setIntField(term182955, term182955.getClass(), "helpCount", -378223222);
        setIntField(term182955, term182955.getClass(), "comboCount", -773021599);
        setIntField(term182955, term182955.getClass(), "feverCount", -1007979356);
        setIntField(term182955, term182955.getClass(), "totalHiScore", 1408842666);
        setIntField(term182955, term182955.getClass(), "totalEasyHighScore", -194924521);
        setIntField(term182955, term182955.getClass(), "totalBasicHighScore", -1573557620);
        setIntField(term182955, term182955.getClass(), "totalAdvancedHighScore", 1849924630);
        setIntField(term182955, term182955.getClass(), "totalExpertHighScore", 2018956236);
        setIntField(term182955, term182955.getClass(), "totalMasterHighScore", 195919907);
        setIntField(term182955, term182955.getClass(), "totalReMasterHighScore", 1966946205);
        setIntField(term182955, term182955.getClass(), "totalHighSync", 1547744259);
        setIntField(term182955, term182955.getClass(), "totalEasySync", 750951306);
        setIntField(term182955, term182955.getClass(), "totalBasicSync", -1477026219);
        setIntField(term182955, term182955.getClass(), "totalAdvancedSync", 1163943401);
        setIntField(term182955, term182955.getClass(), "totalExpertSync", -6457296);
        setIntField(term182955, term182955.getClass(), "totalMasterSync", -1173175256);
        setIntField(term182955, term182955.getClass(), "totalReMasterSync", -794133647);
        setIntField(term182955, term182955.getClass(), "playerRating", 1049181298);
        setIntField(term182955, term182955.getClass(), "highestRating", -57606746);
        setIntField(term182955, term182955.getClass(), "rankAuthTailId", 1521341051);
        setField(term182955, term182955.getClass(), "eventWatchedDate", "xKATihyOsy");
        setField(term182955, term182955.getClass(), "webLimitDate", "uinyvocUGz");
        setIntField(term182955, term182955.getClass(), "challengeTrackPhase", -1806872649);
        setIntField(term182955, term182955.getClass(), "firstPlayBits", 1389367418);
        setField(term182955, term182955.getClass(), "lastPlayDate", "mhGOBiEPDs");
        setIntField(term182955, term182955.getClass(), "lastPlaceId", 1211079350);
        setField(term182955, term182955.getClass(), "lastPlaceName", "BtaROXxZYZ");
        setIntField(term182955, term182955.getClass(), "lastRegionId", -1779367784);
        setField(term182955, term182955.getClass(), "lastRegionName", "LjyAsUkMpT");
        setField(term182955, term182955.getClass(), "lastClientId", "eVYbmAKfrT");
        setField(term182955, term182955.getClass(), "lastCountryCode", "OpDokNbkSu");
        setIntField(term182955, term182955.getClass(), "eventPoint", 415689864);
        setIntField(term182955, term182955.getClass(), "totalLv", -355856295);
        setIntField(term182955, term182955.getClass(), "lastLoginBonusDay", -542913731);
        setIntField(term182955, term182955.getClass(), "lastSurvivalBonusDay", -953252147);
        setIntField(term182955, term182955.getClass(), "loginBonusLv", 1680098383);
        setField(term182953, term182953.getClass(), "user", term182955);
        setIntField(term182953, term182953.getClass(), "musicId", 506388368);
        setIntField(term182953, term182953.getClass(), "level", -413493975);
        setIntField(term182953, term182953.getClass(), "playCount", 1737686997);
        setIntField(term182953, term182953.getClass(), "scoreMax", 1664715934);
        setIntField(term182953, term182953.getClass(), "syncRateMax", 475574301);
        setBooleanField(term182953, term182953.getClass(), "isAllPerfect", true);
        setIntField(term182953, term182953.getClass(), "isAllPerfectPlus", -655150789);
        setIntField(term182953, term182953.getClass(), "fullCombo", 2072009798);
        setIntField(term182953, term182953.getClass(), "maxFever", 923147927);
        setIntField(term182953, term182953.getClass(), "achievement", 1872012560);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxFever", argTypes, term182953, args);
    }

};


