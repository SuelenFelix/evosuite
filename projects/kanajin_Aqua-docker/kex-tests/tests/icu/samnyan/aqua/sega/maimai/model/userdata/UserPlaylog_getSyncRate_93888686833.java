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

public class UserPlaylog_getSyncRate_93888686833 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127967;

    public UserPlaylog_getSyncRate_93888686833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term127973 = new Long(9174730812791817537L);
        term127967 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term127969 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term127971 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term127987 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term127988 = newInstance(Class.forName("java.time.LocalDate"));
        Object term127992 = newInstance(Class.forName("java.time.LocalTime"));
        Object term127997 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term127998 = newInstance(Class.forName("java.time.LocalDate"));
        Object term128002 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term127967, term127967.getClass(), "id", -4890319435899707472L);
        setLongField(term127969, term127969.getClass(), "id", 6556282323732455484L);
        setLongField(term127971, term127971.getClass(), "id", -6266533510820240265L);
        setField(term127971, term127971.getClass(), "extId", term127973);
        setField(term127971, term127971.getClass(), "luid", "WFTVkzwtMV");
        setIntField(term127988, term127988.getClass(), "year", 2019);
        setShortField(term127988, term127988.getClass(), "month", (short) 3);
        setShortField(term127988, term127988.getClass(), "day", (short) 14);
        setField(term127987, term127987.getClass(), "date", term127988);
        setByteField(term127992, term127992.getClass(), "hour", (byte) 21);
        setByteField(term127992, term127992.getClass(), "minute", (byte) 1);
        setByteField(term127992, term127992.getClass(), "second", (byte) 27);
        setIntField(term127992, term127992.getClass(), "nano", 855781320);
        setField(term127987, term127987.getClass(), "time", term127992);
        setField(term127971, term127971.getClass(), "registerTime", term127987);
        setIntField(term127998, term127998.getClass(), "year", 2010);
        setShortField(term127998, term127998.getClass(), "month", (short) 2);
        setShortField(term127998, term127998.getClass(), "day", (short) 1);
        setField(term127997, term127997.getClass(), "date", term127998);
        setByteField(term128002, term128002.getClass(), "hour", (byte) 15);
        setByteField(term128002, term128002.getClass(), "minute", (byte) 12);
        setByteField(term128002, term128002.getClass(), "second", (byte) 8);
        setIntField(term128002, term128002.getClass(), "nano", 722621943);
        setField(term127997, term127997.getClass(), "time", term128002);
        setField(term127971, term127971.getClass(), "accessTime", term127997);
        setField(term127969, term127969.getClass(), "card", term127971);
        setIntField(term127969, term127969.getClass(), "lastDataVersion", 671448927);
        setField(term127969, term127969.getClass(), "userName", "NFhdyebxdy");
        setIntField(term127969, term127969.getClass(), "point", -1995125137);
        setIntField(term127969, term127969.getClass(), "totalPoint", 1052567802);
        setIntField(term127969, term127969.getClass(), "iconId", -823917574);
        setIntField(term127969, term127969.getClass(), "nameplateId", -2028837196);
        setIntField(term127969, term127969.getClass(), "frameId", -1509629142);
        setIntField(term127969, term127969.getClass(), "trophyId", 319507405);
        setIntField(term127969, term127969.getClass(), "playCount", 435716326);
        setIntField(term127969, term127969.getClass(), "playVsCount", -1387319323);
        setIntField(term127969, term127969.getClass(), "playSyncCount", 1676848994);
        setIntField(term127969, term127969.getClass(), "winCount", 1608056311);
        setIntField(term127969, term127969.getClass(), "helpCount", 12015436);
        setIntField(term127969, term127969.getClass(), "comboCount", 1451738148);
        setIntField(term127969, term127969.getClass(), "feverCount", -502537377);
        setIntField(term127969, term127969.getClass(), "totalHiScore", 324933257);
        setIntField(term127969, term127969.getClass(), "totalEasyHighScore", -1568921238);
        setIntField(term127969, term127969.getClass(), "totalBasicHighScore", -914765958);
        setIntField(term127969, term127969.getClass(), "totalAdvancedHighScore", -1658583299);
        setIntField(term127969, term127969.getClass(), "totalExpertHighScore", -1470316088);
        setIntField(term127969, term127969.getClass(), "totalMasterHighScore", 1649132902);
        setIntField(term127969, term127969.getClass(), "totalReMasterHighScore", -1640921587);
        setIntField(term127969, term127969.getClass(), "totalHighSync", 354457503);
        setIntField(term127969, term127969.getClass(), "totalEasySync", -318555635);
        setIntField(term127969, term127969.getClass(), "totalBasicSync", -992479651);
        setIntField(term127969, term127969.getClass(), "totalAdvancedSync", -906890843);
        setIntField(term127969, term127969.getClass(), "totalExpertSync", 2050265443);
        setIntField(term127969, term127969.getClass(), "totalMasterSync", -696653076);
        setIntField(term127969, term127969.getClass(), "totalReMasterSync", -725167428);
        setIntField(term127969, term127969.getClass(), "playerRating", 1868591980);
        setIntField(term127969, term127969.getClass(), "highestRating", 112121751);
        setIntField(term127969, term127969.getClass(), "rankAuthTailId", 311304856);
        setField(term127969, term127969.getClass(), "eventWatchedDate", "tLWbdOibIF");
        setField(term127969, term127969.getClass(), "webLimitDate", "SMOAkwbjOJ");
        setIntField(term127969, term127969.getClass(), "challengeTrackPhase", -1007674417);
        setIntField(term127969, term127969.getClass(), "firstPlayBits", 502633973);
        setField(term127969, term127969.getClass(), "lastPlayDate", "MfaucIGOtB");
        setIntField(term127969, term127969.getClass(), "lastPlaceId", 1851928682);
        setField(term127969, term127969.getClass(), "lastPlaceName", "InUomUyBlU");
        setIntField(term127969, term127969.getClass(), "lastRegionId", 84669830);
        setField(term127969, term127969.getClass(), "lastRegionName", "JeDxEhXsPC");
        setField(term127969, term127969.getClass(), "lastClientId", "VAGxXrcAsi");
        setField(term127969, term127969.getClass(), "lastCountryCode", "ApYkVuFRIL");
        setIntField(term127969, term127969.getClass(), "eventPoint", -1604812137);
        setIntField(term127969, term127969.getClass(), "totalLv", -331363457);
        setIntField(term127969, term127969.getClass(), "lastLoginBonusDay", -907753498);
        setIntField(term127969, term127969.getClass(), "lastSurvivalBonusDay", 1382037583);
        setIntField(term127969, term127969.getClass(), "loginBonusLv", -136583713);
        setField(term127967, term127967.getClass(), "user", term127969);
        setIntField(term127967, term127967.getClass(), "orderId", -1382689671);
        setLongField(term127967, term127967.getClass(), "sortNumber", 3350405455840199132L);
        setIntField(term127967, term127967.getClass(), "placeId", -1253020131);
        setField(term127967, term127967.getClass(), "placeName", "diuhMpMKFr");
        setField(term127967, term127967.getClass(), "country", "jYgdYPEnbw");
        setIntField(term127967, term127967.getClass(), "regionId", 524661722);
        setField(term127967, term127967.getClass(), "playDate", "MaWPQSNeis");
        setField(term127967, term127967.getClass(), "userPlayDate", "SiShLTAOSK");
        setIntField(term127967, term127967.getClass(), "musicId", -621486703);
        setIntField(term127967, term127967.getClass(), "level", -1314223543);
        setIntField(term127967, term127967.getClass(), "gameMode", -1895037790);
        setIntField(term127967, term127967.getClass(), "rivalNum", 1137637306);
        setIntField(term127967, term127967.getClass(), "track", 388048709);
        setIntField(term127967, term127967.getClass(), "eventId", 1263276616);
        setBooleanField(term127967, term127967.getClass(), "isFreeToPlay", true);
        setIntField(term127967, term127967.getClass(), "playerRating", 515493691);
        setLongField(term127967, term127967.getClass(), "playedUserId1", 2490169994997257831L);
        setField(term127967, term127967.getClass(), "playedUserName1", "FAPbpaVZzb");
        setIntField(term127967, term127967.getClass(), "playedMusicLevel1", -112169260);
        setLongField(term127967, term127967.getClass(), "playedUserId2", 8578793794565531960L);
        setField(term127967, term127967.getClass(), "playedUserName2", "jMmGJiFUkL");
        setIntField(term127967, term127967.getClass(), "playedMusicLevel2", -783824870);
        setLongField(term127967, term127967.getClass(), "playedUserId3", -3649565702016413399L);
        setField(term127967, term127967.getClass(), "playedUserName3", "fHyUJhfoxR");
        setIntField(term127967, term127967.getClass(), "playedMusicLevel3", 1471462673);
        setIntField(term127967, term127967.getClass(), "achievement", -1511154732);
        setIntField(term127967, term127967.getClass(), "score", 214211140);
        setIntField(term127967, term127967.getClass(), "tapScore", 159315913);
        setIntField(term127967, term127967.getClass(), "holdScore", 963909115);
        setIntField(term127967, term127967.getClass(), "slideScore", -553060939);
        setIntField(term127967, term127967.getClass(), "breakScore", -2072078720);
        setIntField(term127967, term127967.getClass(), "syncRate", -2132989706);
        setIntField(term127967, term127967.getClass(), "vsWin", 89843427);
        setBooleanField(term127967, term127967.getClass(), "isAllPerfect", false);
        setIntField(term127967, term127967.getClass(), "fullCombo", -1714759689);
        setIntField(term127967, term127967.getClass(), "maxFever", 2124238526);
        setIntField(term127967, term127967.getClass(), "maxCombo", 149013193);
        setIntField(term127967, term127967.getClass(), "tapPerfect", -717409234);
        setIntField(term127967, term127967.getClass(), "tapGreat", 201560884);
        setIntField(term127967, term127967.getClass(), "tapGood", 133431955);
        setIntField(term127967, term127967.getClass(), "tapBad", 1471635389);
        setIntField(term127967, term127967.getClass(), "holdPerfect", 1879667981);
        setIntField(term127967, term127967.getClass(), "holdGreat", 380951165);
        setIntField(term127967, term127967.getClass(), "holdGood", -549256740);
        setIntField(term127967, term127967.getClass(), "holdBad", 240821687);
        setIntField(term127967, term127967.getClass(), "slidePerfect", 1491373059);
        setIntField(term127967, term127967.getClass(), "slideGreat", 1743858576);
        setIntField(term127967, term127967.getClass(), "slideGood", -1058684191);
        setIntField(term127967, term127967.getClass(), "slideBad", -87159974);
        setIntField(term127967, term127967.getClass(), "breakPerfect", 1139688356);
        setIntField(term127967, term127967.getClass(), "breakGreat", -1219688886);
        setIntField(term127967, term127967.getClass(), "breakGood", -1849051466);
        setIntField(term127967, term127967.getClass(), "breakBad", -1439424871);
        setBooleanField(term127967, term127967.getClass(), "isTrackSkip", true);
        setBooleanField(term127967, term127967.getClass(), "isHighScore", true);
        setBooleanField(term127967, term127967.getClass(), "isChallengeTrack", false);
        setIntField(term127967, term127967.getClass(), "challengeLife", 1330271134);
        setIntField(term127967, term127967.getClass(), "challengeRemain", 1088923482);
        setIntField(term127967, term127967.getClass(), "isAllPerfectPlus", -808222748);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSyncRate", argTypes, term127967, args);
    }

};


