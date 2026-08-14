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

public class UserPlaylog_setSlideBad_1155879833111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3991651;
     Object term3991963;

    public UserPlaylog_setSlideBad_1155879833111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3991657 = new Long(4588689385775306407L);
        term3991651 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term3991653 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term3991655 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term3991671 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3991672 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3991676 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3991681 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3991682 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3991686 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term3991651, term3991651.getClass(), "id", 4903293597875804440L);
        setLongField(term3991653, term3991653.getClass(), "id", 8012686055217910013L);
        setLongField(term3991655, term3991655.getClass(), "id", -3467181837996668971L);
        setField(term3991655, term3991655.getClass(), "extId", term3991657);
        setField(term3991655, term3991655.getClass(), "luid", "eYysgKFJzF");
        setIntField(term3991672, term3991672.getClass(), "year", 2029);
        setShortField(term3991672, term3991672.getClass(), "month", (short) 5);
        setShortField(term3991672, term3991672.getClass(), "day", (short) 5);
        setField(term3991671, term3991671.getClass(), "date", term3991672);
        setByteField(term3991676, term3991676.getClass(), "hour", (byte) 16);
        setByteField(term3991676, term3991676.getClass(), "minute", (byte) 43);
        setByteField(term3991676, term3991676.getClass(), "second", (byte) 37);
        setIntField(term3991676, term3991676.getClass(), "nano", 902025206);
        setField(term3991671, term3991671.getClass(), "time", term3991676);
        setField(term3991655, term3991655.getClass(), "registerTime", term3991671);
        setIntField(term3991682, term3991682.getClass(), "year", 2023);
        setShortField(term3991682, term3991682.getClass(), "month", (short) 4);
        setShortField(term3991682, term3991682.getClass(), "day", (short) 21);
        setField(term3991681, term3991681.getClass(), "date", term3991682);
        setByteField(term3991686, term3991686.getClass(), "hour", (byte) 20);
        setByteField(term3991686, term3991686.getClass(), "minute", (byte) 6);
        setByteField(term3991686, term3991686.getClass(), "second", (byte) 41);
        setIntField(term3991686, term3991686.getClass(), "nano", 148000382);
        setField(term3991681, term3991681.getClass(), "time", term3991686);
        setField(term3991655, term3991655.getClass(), "accessTime", term3991681);
        setField(term3991653, term3991653.getClass(), "card", term3991655);
        setIntField(term3991653, term3991653.getClass(), "lastDataVersion", -764080360);
        setField(term3991653, term3991653.getClass(), "userName", "apeeUppQqU");
        setIntField(term3991653, term3991653.getClass(), "point", 1953724018);
        setIntField(term3991653, term3991653.getClass(), "totalPoint", -1098395988);
        setIntField(term3991653, term3991653.getClass(), "iconId", 1258147097);
        setIntField(term3991653, term3991653.getClass(), "nameplateId", -547549508);
        setIntField(term3991653, term3991653.getClass(), "frameId", -2010808361);
        setIntField(term3991653, term3991653.getClass(), "trophyId", 1253304781);
        setIntField(term3991653, term3991653.getClass(), "playCount", 1351140084);
        setIntField(term3991653, term3991653.getClass(), "playVsCount", 1366894712);
        setIntField(term3991653, term3991653.getClass(), "playSyncCount", 678291863);
        setIntField(term3991653, term3991653.getClass(), "winCount", 1219634613);
        setIntField(term3991653, term3991653.getClass(), "helpCount", -597826190);
        setIntField(term3991653, term3991653.getClass(), "comboCount", 2081139154);
        setIntField(term3991653, term3991653.getClass(), "feverCount", -220474020);
        setIntField(term3991653, term3991653.getClass(), "totalHiScore", 2066419139);
        setIntField(term3991653, term3991653.getClass(), "totalEasyHighScore", -1560533796);
        setIntField(term3991653, term3991653.getClass(), "totalBasicHighScore", 1633878499);
        setIntField(term3991653, term3991653.getClass(), "totalAdvancedHighScore", 448278312);
        setIntField(term3991653, term3991653.getClass(), "totalExpertHighScore", -1584882068);
        setIntField(term3991653, term3991653.getClass(), "totalMasterHighScore", -233446867);
        setIntField(term3991653, term3991653.getClass(), "totalReMasterHighScore", 768065831);
        setIntField(term3991653, term3991653.getClass(), "totalHighSync", 1134826137);
        setIntField(term3991653, term3991653.getClass(), "totalEasySync", 789740330);
        setIntField(term3991653, term3991653.getClass(), "totalBasicSync", 1425874937);
        setIntField(term3991653, term3991653.getClass(), "totalAdvancedSync", 933905045);
        setIntField(term3991653, term3991653.getClass(), "totalExpertSync", -782122899);
        setIntField(term3991653, term3991653.getClass(), "totalMasterSync", -1648160845);
        setIntField(term3991653, term3991653.getClass(), "totalReMasterSync", 153574794);
        setIntField(term3991653, term3991653.getClass(), "playerRating", 1339642351);
        setIntField(term3991653, term3991653.getClass(), "highestRating", 1442375753);
        setIntField(term3991653, term3991653.getClass(), "rankAuthTailId", -424603538);
        setField(term3991653, term3991653.getClass(), "eventWatchedDate", "hhAOyzFwmX");
        setField(term3991653, term3991653.getClass(), "webLimitDate", "PeFcsBZitW");
        setIntField(term3991653, term3991653.getClass(), "challengeTrackPhase", 259096651);
        setIntField(term3991653, term3991653.getClass(), "firstPlayBits", -11771046);
        setField(term3991653, term3991653.getClass(), "lastPlayDate", "HlyZHsRXWS");
        setIntField(term3991653, term3991653.getClass(), "lastPlaceId", 590301877);
        setField(term3991653, term3991653.getClass(), "lastPlaceName", "USSnXaYlHp");
        setIntField(term3991653, term3991653.getClass(), "lastRegionId", -1481896414);
        setField(term3991653, term3991653.getClass(), "lastRegionName", "VEWJuJXyTX");
        setField(term3991653, term3991653.getClass(), "lastClientId", "BDymUNmLQP");
        setField(term3991653, term3991653.getClass(), "lastCountryCode", "HymmxcRBGn");
        setIntField(term3991653, term3991653.getClass(), "eventPoint", 510553961);
        setIntField(term3991653, term3991653.getClass(), "totalLv", 94449713);
        setIntField(term3991653, term3991653.getClass(), "lastLoginBonusDay", 1817900907);
        setIntField(term3991653, term3991653.getClass(), "lastSurvivalBonusDay", -865988368);
        setIntField(term3991653, term3991653.getClass(), "loginBonusLv", -510573130);
        setField(term3991651, term3991651.getClass(), "user", term3991653);
        setIntField(term3991651, term3991651.getClass(), "orderId", -585773803);
        setLongField(term3991651, term3991651.getClass(), "sortNumber", -4920287881940879410L);
        setIntField(term3991651, term3991651.getClass(), "placeId", -635196463);
        setField(term3991651, term3991651.getClass(), "placeName", "KdEwlWoKZm");
        setField(term3991651, term3991651.getClass(), "country", "wwWkwtFmOt");
        setIntField(term3991651, term3991651.getClass(), "regionId", -867209597);
        setField(term3991651, term3991651.getClass(), "playDate", "QAfhcsWkFp");
        setField(term3991651, term3991651.getClass(), "userPlayDate", "wxmQaIzTcI");
        setIntField(term3991651, term3991651.getClass(), "musicId", 1655586257);
        setIntField(term3991651, term3991651.getClass(), "level", 1673891144);
        setIntField(term3991651, term3991651.getClass(), "gameMode", -1222830654);
        setIntField(term3991651, term3991651.getClass(), "rivalNum", -988196987);
        setIntField(term3991651, term3991651.getClass(), "track", 895204484);
        setIntField(term3991651, term3991651.getClass(), "eventId", -813676741);
        setBooleanField(term3991651, term3991651.getClass(), "isFreeToPlay", false);
        setIntField(term3991651, term3991651.getClass(), "playerRating", -1166279020);
        setLongField(term3991651, term3991651.getClass(), "playedUserId1", 285021758561628481L);
        setField(term3991651, term3991651.getClass(), "playedUserName1", "YfibfSBOFA");
        setIntField(term3991651, term3991651.getClass(), "playedMusicLevel1", -1375299500);
        setLongField(term3991651, term3991651.getClass(), "playedUserId2", -1882768890104622226L);
        setField(term3991651, term3991651.getClass(), "playedUserName2", "vdVGIDqYGr");
        setIntField(term3991651, term3991651.getClass(), "playedMusicLevel2", -1603330708);
        setLongField(term3991651, term3991651.getClass(), "playedUserId3", 2155249538582966303L);
        setField(term3991651, term3991651.getClass(), "playedUserName3", "kBoqzOXNIo");
        setIntField(term3991651, term3991651.getClass(), "playedMusicLevel3", 1459146341);
        setIntField(term3991651, term3991651.getClass(), "achievement", -104553898);
        setIntField(term3991651, term3991651.getClass(), "score", 1280452853);
        setIntField(term3991651, term3991651.getClass(), "tapScore", 392635871);
        setIntField(term3991651, term3991651.getClass(), "holdScore", 696301141);
        setIntField(term3991651, term3991651.getClass(), "slideScore", 1131460441);
        setIntField(term3991651, term3991651.getClass(), "breakScore", 1548527688);
        setIntField(term3991651, term3991651.getClass(), "syncRate", -2041560567);
        setIntField(term3991651, term3991651.getClass(), "vsWin", 1666495242);
        setBooleanField(term3991651, term3991651.getClass(), "isAllPerfect", true);
        setIntField(term3991651, term3991651.getClass(), "fullCombo", 1735387633);
        setIntField(term3991651, term3991651.getClass(), "maxFever", -269267331);
        setIntField(term3991651, term3991651.getClass(), "maxCombo", 1288499288);
        setIntField(term3991651, term3991651.getClass(), "tapPerfect", 954083970);
        setIntField(term3991651, term3991651.getClass(), "tapGreat", 390975612);
        setIntField(term3991651, term3991651.getClass(), "tapGood", 1678009030);
        setIntField(term3991651, term3991651.getClass(), "tapBad", -89194726);
        setIntField(term3991651, term3991651.getClass(), "holdPerfect", -58471536);
        setIntField(term3991651, term3991651.getClass(), "holdGreat", -1426809949);
        setIntField(term3991651, term3991651.getClass(), "holdGood", -2014224306);
        setIntField(term3991651, term3991651.getClass(), "holdBad", -2009825181);
        setIntField(term3991651, term3991651.getClass(), "slidePerfect", 1642872306);
        setIntField(term3991651, term3991651.getClass(), "slideGreat", 1488193247);
        setIntField(term3991651, term3991651.getClass(), "slideGood", -426117528);
        setIntField(term3991651, term3991651.getClass(), "slideBad", -1748658125);
        setIntField(term3991651, term3991651.getClass(), "breakPerfect", 1144209314);
        setIntField(term3991651, term3991651.getClass(), "breakGreat", 866667839);
        setIntField(term3991651, term3991651.getClass(), "breakGood", 884627467);
        setIntField(term3991651, term3991651.getClass(), "breakBad", 1832814808);
        setBooleanField(term3991651, term3991651.getClass(), "isTrackSkip", true);
        setBooleanField(term3991651, term3991651.getClass(), "isHighScore", true);
        setBooleanField(term3991651, term3991651.getClass(), "isChallengeTrack", true);
        setIntField(term3991651, term3991651.getClass(), "challengeLife", -1681734804);
        setIntField(term3991651, term3991651.getClass(), "challengeRemain", 1930765927);
        setIntField(term3991651, term3991651.getClass(), "isAllPerfectPlus", 699043454);
        term3991963 = new Integer(1906549137);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3991963;
        callMethod(klass, "setSlideBad", argTypes, term3991651, args);
    }

};


