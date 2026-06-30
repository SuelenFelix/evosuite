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
import java.lang.Integer;

public class UserSurvival_setTotalAchieve_52915091812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105404;
     Object term105585;

    public UserSurvival_setTotalAchieve_52915091812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term105410 = new Long(-2195061939206930224L);
        term105404 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserSurvival"));
        Object term105406 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term105408 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term105424 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term105425 = newInstance(Class.forName("java.time.LocalDate"));
        Object term105429 = newInstance(Class.forName("java.time.LocalTime"));
        Object term105434 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term105435 = newInstance(Class.forName("java.time.LocalDate"));
        Object term105439 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term105404, term105404.getClass(), "id", 8778744391146217826L);
        setLongField(term105406, term105406.getClass(), "id", 7377514870475587049L);
        setLongField(term105408, term105408.getClass(), "id", 3437866678450547130L);
        setField(term105408, term105408.getClass(), "extId", term105410);
        setField(term105408, term105408.getClass(), "luid", "POLJqDqHhk");
        setIntField(term105425, term105425.getClass(), "year", 2025);
        setShortField(term105425, term105425.getClass(), "month", (short) 10);
        setShortField(term105425, term105425.getClass(), "day", (short) 12);
        setField(term105424, term105424.getClass(), "date", term105425);
        setByteField(term105429, term105429.getClass(), "hour", (byte) 0);
        setByteField(term105429, term105429.getClass(), "minute", (byte) 58);
        setByteField(term105429, term105429.getClass(), "second", (byte) 44);
        setIntField(term105429, term105429.getClass(), "nano", 42807662);
        setField(term105424, term105424.getClass(), "time", term105429);
        setField(term105408, term105408.getClass(), "registerTime", term105424);
        setIntField(term105435, term105435.getClass(), "year", 2026);
        setShortField(term105435, term105435.getClass(), "month", (short) 3);
        setShortField(term105435, term105435.getClass(), "day", (short) 23);
        setField(term105434, term105434.getClass(), "date", term105435);
        setByteField(term105439, term105439.getClass(), "hour", (byte) 21);
        setByteField(term105439, term105439.getClass(), "minute", (byte) 25);
        setByteField(term105439, term105439.getClass(), "second", (byte) 41);
        setIntField(term105439, term105439.getClass(), "nano", 714890677);
        setField(term105434, term105434.getClass(), "time", term105439);
        setField(term105408, term105408.getClass(), "accessTime", term105434);
        setField(term105406, term105406.getClass(), "card", term105408);
        setIntField(term105406, term105406.getClass(), "lastDataVersion", 76477391);
        setField(term105406, term105406.getClass(), "userName", "eXlhmImRUd");
        setIntField(term105406, term105406.getClass(), "point", 1959375944);
        setIntField(term105406, term105406.getClass(), "totalPoint", -989809275);
        setIntField(term105406, term105406.getClass(), "iconId", -198811836);
        setIntField(term105406, term105406.getClass(), "nameplateId", 538159596);
        setIntField(term105406, term105406.getClass(), "frameId", -711082612);
        setIntField(term105406, term105406.getClass(), "trophyId", -1053368081);
        setIntField(term105406, term105406.getClass(), "playCount", 708346792);
        setIntField(term105406, term105406.getClass(), "playVsCount", -402126719);
        setIntField(term105406, term105406.getClass(), "playSyncCount", -447989377);
        setIntField(term105406, term105406.getClass(), "winCount", -995008409);
        setIntField(term105406, term105406.getClass(), "helpCount", -875149663);
        setIntField(term105406, term105406.getClass(), "comboCount", 127189459);
        setIntField(term105406, term105406.getClass(), "feverCount", 112918829);
        setIntField(term105406, term105406.getClass(), "totalHiScore", 1035574889);
        setIntField(term105406, term105406.getClass(), "totalEasyHighScore", 679714254);
        setIntField(term105406, term105406.getClass(), "totalBasicHighScore", 87877280);
        setIntField(term105406, term105406.getClass(), "totalAdvancedHighScore", 1439798945);
        setIntField(term105406, term105406.getClass(), "totalExpertHighScore", 1123175842);
        setIntField(term105406, term105406.getClass(), "totalMasterHighScore", 1522845698);
        setIntField(term105406, term105406.getClass(), "totalReMasterHighScore", -2025066214);
        setIntField(term105406, term105406.getClass(), "totalHighSync", 1206480279);
        setIntField(term105406, term105406.getClass(), "totalEasySync", -496495218);
        setIntField(term105406, term105406.getClass(), "totalBasicSync", 1283663634);
        setIntField(term105406, term105406.getClass(), "totalAdvancedSync", 1978334259);
        setIntField(term105406, term105406.getClass(), "totalExpertSync", 690850678);
        setIntField(term105406, term105406.getClass(), "totalMasterSync", 2045633891);
        setIntField(term105406, term105406.getClass(), "totalReMasterSync", 1795515119);
        setIntField(term105406, term105406.getClass(), "playerRating", 968600347);
        setIntField(term105406, term105406.getClass(), "highestRating", -700468612);
        setIntField(term105406, term105406.getClass(), "rankAuthTailId", 321982765);
        setField(term105406, term105406.getClass(), "eventWatchedDate", "pNjJQBsfBv");
        setField(term105406, term105406.getClass(), "webLimitDate", "AeoFWTVnXE");
        setIntField(term105406, term105406.getClass(), "challengeTrackPhase", 48114166);
        setIntField(term105406, term105406.getClass(), "firstPlayBits", -2034531066);
        setField(term105406, term105406.getClass(), "lastPlayDate", "KNodpPTOen");
        setIntField(term105406, term105406.getClass(), "lastPlaceId", -198669254);
        setField(term105406, term105406.getClass(), "lastPlaceName", "HLdVSdPKUm");
        setIntField(term105406, term105406.getClass(), "lastRegionId", -1240490694);
        setField(term105406, term105406.getClass(), "lastRegionName", "cKqYMrtneQ");
        setField(term105406, term105406.getClass(), "lastClientId", "CgvYDHvQnF");
        setField(term105406, term105406.getClass(), "lastCountryCode", "wzvrwvpSgi");
        setIntField(term105406, term105406.getClass(), "eventPoint", 244720262);
        setIntField(term105406, term105406.getClass(), "totalLv", 370854194);
        setIntField(term105406, term105406.getClass(), "lastLoginBonusDay", -17070269);
        setIntField(term105406, term105406.getClass(), "lastSurvivalBonusDay", 1467833271);
        setIntField(term105406, term105406.getClass(), "loginBonusLv", 1376444883);
        setField(term105404, term105404.getClass(), "user", term105406);
        setIntField(term105404, term105404.getClass(), "survivalId", 48103208);
        setIntField(term105404, term105404.getClass(), "totalScore", -655467488);
        setIntField(term105404, term105404.getClass(), "totalAchieve", 283820186);
        setBooleanField(term105404, term105404.getClass(), "isClear", true);
        setBooleanField(term105404, term105404.getClass(), "isNoDamage", false);
        term105585 = new Integer(1640365049);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserSurvival");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term105585;
        callMethod(klass, "setTotalAchieve", argTypes, term105404, args);
    }

};


