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

public class UserMusicDetail_getLevel_8152902754 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term181021;

    public UserMusicDetail_getLevel_8152902754() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term181027 = new Long(-7589547201844161961L);
        term181021 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserMusicDetail"));
        Object term181023 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term181025 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term181041 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term181042 = newInstance(Class.forName("java.time.LocalDate"));
        Object term181046 = newInstance(Class.forName("java.time.LocalTime"));
        Object term181051 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term181052 = newInstance(Class.forName("java.time.LocalDate"));
        Object term181056 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term181021, term181021.getClass(), "id", 6348449517519237060L);
        setLongField(term181023, term181023.getClass(), "id", -3736670675123148973L);
        setLongField(term181025, term181025.getClass(), "id", -732854020469829996L);
        setField(term181025, term181025.getClass(), "extId", term181027);
        setField(term181025, term181025.getClass(), "luid", "qiYIlJidwz");
        setIntField(term181042, term181042.getClass(), "year", 2017);
        setShortField(term181042, term181042.getClass(), "month", (short) 2);
        setShortField(term181042, term181042.getClass(), "day", (short) 5);
        setField(term181041, term181041.getClass(), "date", term181042);
        setByteField(term181046, term181046.getClass(), "hour", (byte) 21);
        setByteField(term181046, term181046.getClass(), "minute", (byte) 39);
        setByteField(term181046, term181046.getClass(), "second", (byte) 40);
        setIntField(term181046, term181046.getClass(), "nano", 124450071);
        setField(term181041, term181041.getClass(), "time", term181046);
        setField(term181025, term181025.getClass(), "registerTime", term181041);
        setIntField(term181052, term181052.getClass(), "year", 2017);
        setShortField(term181052, term181052.getClass(), "month", (short) 12);
        setShortField(term181052, term181052.getClass(), "day", (short) 4);
        setField(term181051, term181051.getClass(), "date", term181052);
        setByteField(term181056, term181056.getClass(), "hour", (byte) 17);
        setByteField(term181056, term181056.getClass(), "minute", (byte) 31);
        setByteField(term181056, term181056.getClass(), "second", (byte) 26);
        setIntField(term181056, term181056.getClass(), "nano", 462103828);
        setField(term181051, term181051.getClass(), "time", term181056);
        setField(term181025, term181025.getClass(), "accessTime", term181051);
        setField(term181023, term181023.getClass(), "card", term181025);
        setIntField(term181023, term181023.getClass(), "lastDataVersion", -988253987);
        setField(term181023, term181023.getClass(), "userName", "bTxEkaNhzD");
        setIntField(term181023, term181023.getClass(), "point", 636756098);
        setIntField(term181023, term181023.getClass(), "totalPoint", 734043224);
        setIntField(term181023, term181023.getClass(), "iconId", -668594446);
        setIntField(term181023, term181023.getClass(), "nameplateId", 119165844);
        setIntField(term181023, term181023.getClass(), "frameId", 479479404);
        setIntField(term181023, term181023.getClass(), "trophyId", 264020178);
        setIntField(term181023, term181023.getClass(), "playCount", 1869110181);
        setIntField(term181023, term181023.getClass(), "playVsCount", -1855510337);
        setIntField(term181023, term181023.getClass(), "playSyncCount", -511279379);
        setIntField(term181023, term181023.getClass(), "winCount", 106081153);
        setIntField(term181023, term181023.getClass(), "helpCount", -1187225625);
        setIntField(term181023, term181023.getClass(), "comboCount", -2128845125);
        setIntField(term181023, term181023.getClass(), "feverCount", -2071097025);
        setIntField(term181023, term181023.getClass(), "totalHiScore", 1382119349);
        setIntField(term181023, term181023.getClass(), "totalEasyHighScore", 1912184942);
        setIntField(term181023, term181023.getClass(), "totalBasicHighScore", 1240175878);
        setIntField(term181023, term181023.getClass(), "totalAdvancedHighScore", -82474792);
        setIntField(term181023, term181023.getClass(), "totalExpertHighScore", -1689908870);
        setIntField(term181023, term181023.getClass(), "totalMasterHighScore", 1682370238);
        setIntField(term181023, term181023.getClass(), "totalReMasterHighScore", -1056877052);
        setIntField(term181023, term181023.getClass(), "totalHighSync", 1342764510);
        setIntField(term181023, term181023.getClass(), "totalEasySync", -444573956);
        setIntField(term181023, term181023.getClass(), "totalBasicSync", 395731131);
        setIntField(term181023, term181023.getClass(), "totalAdvancedSync", 1554827520);
        setIntField(term181023, term181023.getClass(), "totalExpertSync", -204128038);
        setIntField(term181023, term181023.getClass(), "totalMasterSync", -911301593);
        setIntField(term181023, term181023.getClass(), "totalReMasterSync", -1062163073);
        setIntField(term181023, term181023.getClass(), "playerRating", 1082951792);
        setIntField(term181023, term181023.getClass(), "highestRating", -1229716052);
        setIntField(term181023, term181023.getClass(), "rankAuthTailId", 1584428173);
        setField(term181023, term181023.getClass(), "eventWatchedDate", "GJhlvPIEzj");
        setField(term181023, term181023.getClass(), "webLimitDate", "JxjbIphmRX");
        setIntField(term181023, term181023.getClass(), "challengeTrackPhase", 1926824813);
        setIntField(term181023, term181023.getClass(), "firstPlayBits", 244762748);
        setField(term181023, term181023.getClass(), "lastPlayDate", "igspPNkvLc");
        setIntField(term181023, term181023.getClass(), "lastPlaceId", -1371887170);
        setField(term181023, term181023.getClass(), "lastPlaceName", "BaRcksFiYp");
        setIntField(term181023, term181023.getClass(), "lastRegionId", -2022951027);
        setField(term181023, term181023.getClass(), "lastRegionName", "qCsUoglQjM");
        setField(term181023, term181023.getClass(), "lastClientId", "BVcWJbDXrQ");
        setField(term181023, term181023.getClass(), "lastCountryCode", "PNxbmyThZc");
        setIntField(term181023, term181023.getClass(), "eventPoint", -955274362);
        setIntField(term181023, term181023.getClass(), "totalLv", 1722177985);
        setIntField(term181023, term181023.getClass(), "lastLoginBonusDay", -1181703812);
        setIntField(term181023, term181023.getClass(), "lastSurvivalBonusDay", -1581182288);
        setIntField(term181023, term181023.getClass(), "loginBonusLv", -796193285);
        setField(term181021, term181021.getClass(), "user", term181023);
        setIntField(term181021, term181021.getClass(), "musicId", 1217303633);
        setIntField(term181021, term181021.getClass(), "level", 1220548867);
        setIntField(term181021, term181021.getClass(), "playCount", 1994419798);
        setIntField(term181021, term181021.getClass(), "scoreMax", -689705982);
        setIntField(term181021, term181021.getClass(), "syncRateMax", 1012166398);
        setBooleanField(term181021, term181021.getClass(), "isAllPerfect", true);
        setIntField(term181021, term181021.getClass(), "isAllPerfectPlus", 849081368);
        setIntField(term181021, term181021.getClass(), "fullCombo", -2141116271);
        setIntField(term181021, term181021.getClass(), "maxFever", -1729436948);
        setIntField(term181021, term181021.getClass(), "achievement", -917813544);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLevel", argTypes, term181021, args);
    }

};


