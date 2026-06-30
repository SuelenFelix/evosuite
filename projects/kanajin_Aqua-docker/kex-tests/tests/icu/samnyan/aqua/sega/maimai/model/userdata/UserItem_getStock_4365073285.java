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

public class UserItem_getStock_4365073285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85635;

    public UserItem_getStock_4365073285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term85641 = new Long(-6685235643232255177L);
        term85635 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserItem"));
        Object term85637 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term85639 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term85655 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term85656 = newInstance(Class.forName("java.time.LocalDate"));
        Object term85660 = newInstance(Class.forName("java.time.LocalTime"));
        Object term85665 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term85666 = newInstance(Class.forName("java.time.LocalDate"));
        Object term85670 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term85635, term85635.getClass(), "id", 7717843551775677202L);
        setLongField(term85637, term85637.getClass(), "id", 2823262561274956150L);
        setLongField(term85639, term85639.getClass(), "id", 8039153062846287600L);
        setField(term85639, term85639.getClass(), "extId", term85641);
        setField(term85639, term85639.getClass(), "luid", "VhnistEcCA");
        setIntField(term85656, term85656.getClass(), "year", 2019);
        setShortField(term85656, term85656.getClass(), "month", (short) 10);
        setShortField(term85656, term85656.getClass(), "day", (short) 4);
        setField(term85655, term85655.getClass(), "date", term85656);
        setByteField(term85660, term85660.getClass(), "hour", (byte) 14);
        setByteField(term85660, term85660.getClass(), "minute", (byte) 11);
        setByteField(term85660, term85660.getClass(), "second", (byte) 28);
        setIntField(term85660, term85660.getClass(), "nano", 963604727);
        setField(term85655, term85655.getClass(), "time", term85660);
        setField(term85639, term85639.getClass(), "registerTime", term85655);
        setIntField(term85666, term85666.getClass(), "year", 2029);
        setShortField(term85666, term85666.getClass(), "month", (short) 8);
        setShortField(term85666, term85666.getClass(), "day", (short) 18);
        setField(term85665, term85665.getClass(), "date", term85666);
        setByteField(term85670, term85670.getClass(), "hour", (byte) 8);
        setByteField(term85670, term85670.getClass(), "minute", (byte) 52);
        setByteField(term85670, term85670.getClass(), "second", (byte) 59);
        setIntField(term85670, term85670.getClass(), "nano", 526040172);
        setField(term85665, term85665.getClass(), "time", term85670);
        setField(term85639, term85639.getClass(), "accessTime", term85665);
        setField(term85637, term85637.getClass(), "card", term85639);
        setIntField(term85637, term85637.getClass(), "lastDataVersion", -1843660330);
        setField(term85637, term85637.getClass(), "userName", "hlPKLObFBU");
        setIntField(term85637, term85637.getClass(), "point", 1324882121);
        setIntField(term85637, term85637.getClass(), "totalPoint", 254828594);
        setIntField(term85637, term85637.getClass(), "iconId", -2104928418);
        setIntField(term85637, term85637.getClass(), "nameplateId", -637342505);
        setIntField(term85637, term85637.getClass(), "frameId", 1064415036);
        setIntField(term85637, term85637.getClass(), "trophyId", -1504699704);
        setIntField(term85637, term85637.getClass(), "playCount", 188156612);
        setIntField(term85637, term85637.getClass(), "playVsCount", -1650671835);
        setIntField(term85637, term85637.getClass(), "playSyncCount", 1886042366);
        setIntField(term85637, term85637.getClass(), "winCount", 1750279326);
        setIntField(term85637, term85637.getClass(), "helpCount", 69628657);
        setIntField(term85637, term85637.getClass(), "comboCount", -2051929242);
        setIntField(term85637, term85637.getClass(), "feverCount", -1610300223);
        setIntField(term85637, term85637.getClass(), "totalHiScore", 446623516);
        setIntField(term85637, term85637.getClass(), "totalEasyHighScore", 1459327378);
        setIntField(term85637, term85637.getClass(), "totalBasicHighScore", -2025069703);
        setIntField(term85637, term85637.getClass(), "totalAdvancedHighScore", -10565826);
        setIntField(term85637, term85637.getClass(), "totalExpertHighScore", -613811757);
        setIntField(term85637, term85637.getClass(), "totalMasterHighScore", -1533182108);
        setIntField(term85637, term85637.getClass(), "totalReMasterHighScore", -2143828825);
        setIntField(term85637, term85637.getClass(), "totalHighSync", -1675965095);
        setIntField(term85637, term85637.getClass(), "totalEasySync", -1629158447);
        setIntField(term85637, term85637.getClass(), "totalBasicSync", -478026502);
        setIntField(term85637, term85637.getClass(), "totalAdvancedSync", -1202054376);
        setIntField(term85637, term85637.getClass(), "totalExpertSync", 1502227586);
        setIntField(term85637, term85637.getClass(), "totalMasterSync", 1320517174);
        setIntField(term85637, term85637.getClass(), "totalReMasterSync", -1036993603);
        setIntField(term85637, term85637.getClass(), "playerRating", -1696528248);
        setIntField(term85637, term85637.getClass(), "highestRating", -1346251427);
        setIntField(term85637, term85637.getClass(), "rankAuthTailId", -821292025);
        setField(term85637, term85637.getClass(), "eventWatchedDate", "oNGVAyjCob");
        setField(term85637, term85637.getClass(), "webLimitDate", "lzqPLDonds");
        setIntField(term85637, term85637.getClass(), "challengeTrackPhase", 525638452);
        setIntField(term85637, term85637.getClass(), "firstPlayBits", -1387240902);
        setField(term85637, term85637.getClass(), "lastPlayDate", "gCFzBxPZKw");
        setIntField(term85637, term85637.getClass(), "lastPlaceId", 1456385188);
        setField(term85637, term85637.getClass(), "lastPlaceName", "YNVbzJpOdk");
        setIntField(term85637, term85637.getClass(), "lastRegionId", -1778689215);
        setField(term85637, term85637.getClass(), "lastRegionName", "CjPfMVeNPm");
        setField(term85637, term85637.getClass(), "lastClientId", "TeqSJDWXQD");
        setField(term85637, term85637.getClass(), "lastCountryCode", "XNgNLbjmim");
        setIntField(term85637, term85637.getClass(), "eventPoint", -215214458);
        setIntField(term85637, term85637.getClass(), "totalLv", 2088442412);
        setIntField(term85637, term85637.getClass(), "lastLoginBonusDay", 1432096332);
        setIntField(term85637, term85637.getClass(), "lastSurvivalBonusDay", -1621097679);
        setIntField(term85637, term85637.getClass(), "loginBonusLv", 1349840444);
        setField(term85635, term85635.getClass(), "user", term85637);
        setIntField(term85635, term85635.getClass(), "itemKind", 671975307);
        setIntField(term85635, term85635.getClass(), "itemId", 178052838);
        setIntField(term85635, term85635.getClass(), "stock", -890432510);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStock", argTypes, term85635, args);
    }

};


