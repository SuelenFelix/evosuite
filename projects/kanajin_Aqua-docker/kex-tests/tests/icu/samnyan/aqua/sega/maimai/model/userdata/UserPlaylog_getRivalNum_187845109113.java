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

public class UserPlaylog_getRivalNum_187845109113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118527;

    public UserPlaylog_getRivalNum_187845109113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term118533 = new Long(-2083524977884307536L);
        term118527 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term118529 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term118531 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term118547 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term118548 = newInstance(Class.forName("java.time.LocalDate"));
        Object term118552 = newInstance(Class.forName("java.time.LocalTime"));
        Object term118557 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term118558 = newInstance(Class.forName("java.time.LocalDate"));
        Object term118562 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term118527, term118527.getClass(), "id", 7329701902499669605L);
        setLongField(term118529, term118529.getClass(), "id", 596630330404532696L);
        setLongField(term118531, term118531.getClass(), "id", 3628778546975266226L);
        setField(term118531, term118531.getClass(), "extId", term118533);
        setField(term118531, term118531.getClass(), "luid", "DjDquUkDJf");
        setIntField(term118548, term118548.getClass(), "year", 2023);
        setShortField(term118548, term118548.getClass(), "month", (short) 12);
        setShortField(term118548, term118548.getClass(), "day", (short) 26);
        setField(term118547, term118547.getClass(), "date", term118548);
        setByteField(term118552, term118552.getClass(), "hour", (byte) 17);
        setByteField(term118552, term118552.getClass(), "minute", (byte) 38);
        setByteField(term118552, term118552.getClass(), "second", (byte) 54);
        setIntField(term118552, term118552.getClass(), "nano", 703000129);
        setField(term118547, term118547.getClass(), "time", term118552);
        setField(term118531, term118531.getClass(), "registerTime", term118547);
        setIntField(term118558, term118558.getClass(), "year", 2013);
        setShortField(term118558, term118558.getClass(), "month", (short) 8);
        setShortField(term118558, term118558.getClass(), "day", (short) 24);
        setField(term118557, term118557.getClass(), "date", term118558);
        setByteField(term118562, term118562.getClass(), "hour", (byte) 15);
        setByteField(term118562, term118562.getClass(), "minute", (byte) 52);
        setByteField(term118562, term118562.getClass(), "second", (byte) 16);
        setIntField(term118562, term118562.getClass(), "nano", 996842360);
        setField(term118557, term118557.getClass(), "time", term118562);
        setField(term118531, term118531.getClass(), "accessTime", term118557);
        setField(term118529, term118529.getClass(), "card", term118531);
        setIntField(term118529, term118529.getClass(), "lastDataVersion", -35003186);
        setField(term118529, term118529.getClass(), "userName", "SszlMxumKX");
        setIntField(term118529, term118529.getClass(), "point", -595721425);
        setIntField(term118529, term118529.getClass(), "totalPoint", -439609584);
        setIntField(term118529, term118529.getClass(), "iconId", -1502962234);
        setIntField(term118529, term118529.getClass(), "nameplateId", -1873626416);
        setIntField(term118529, term118529.getClass(), "frameId", 1896977196);
        setIntField(term118529, term118529.getClass(), "trophyId", -1792266722);
        setIntField(term118529, term118529.getClass(), "playCount", 1396274905);
        setIntField(term118529, term118529.getClass(), "playVsCount", -1779394164);
        setIntField(term118529, term118529.getClass(), "playSyncCount", 1284222670);
        setIntField(term118529, term118529.getClass(), "winCount", -1909014850);
        setIntField(term118529, term118529.getClass(), "helpCount", -418988719);
        setIntField(term118529, term118529.getClass(), "comboCount", 1464492645);
        setIntField(term118529, term118529.getClass(), "feverCount", 1487670377);
        setIntField(term118529, term118529.getClass(), "totalHiScore", -996307380);
        setIntField(term118529, term118529.getClass(), "totalEasyHighScore", 2022112906);
        setIntField(term118529, term118529.getClass(), "totalBasicHighScore", -1414718374);
        setIntField(term118529, term118529.getClass(), "totalAdvancedHighScore", -1159346345);
        setIntField(term118529, term118529.getClass(), "totalExpertHighScore", 1885858233);
        setIntField(term118529, term118529.getClass(), "totalMasterHighScore", -1733459877);
        setIntField(term118529, term118529.getClass(), "totalReMasterHighScore", 1176390024);
        setIntField(term118529, term118529.getClass(), "totalHighSync", -1642962642);
        setIntField(term118529, term118529.getClass(), "totalEasySync", -164699981);
        setIntField(term118529, term118529.getClass(), "totalBasicSync", 245614438);
        setIntField(term118529, term118529.getClass(), "totalAdvancedSync", -840986382);
        setIntField(term118529, term118529.getClass(), "totalExpertSync", 1706500660);
        setIntField(term118529, term118529.getClass(), "totalMasterSync", -1824551166);
        setIntField(term118529, term118529.getClass(), "totalReMasterSync", 1350741680);
        setIntField(term118529, term118529.getClass(), "playerRating", -1529036668);
        setIntField(term118529, term118529.getClass(), "highestRating", 1415286034);
        setIntField(term118529, term118529.getClass(), "rankAuthTailId", -1639049163);
        setField(term118529, term118529.getClass(), "eventWatchedDate", "FhbYnMXUCk");
        setField(term118529, term118529.getClass(), "webLimitDate", "MMUzzZjmHQ");
        setIntField(term118529, term118529.getClass(), "challengeTrackPhase", 281863283);
        setIntField(term118529, term118529.getClass(), "firstPlayBits", 476670805);
        setField(term118529, term118529.getClass(), "lastPlayDate", "NSPCJaizlC");
        setIntField(term118529, term118529.getClass(), "lastPlaceId", 992401864);
        setField(term118529, term118529.getClass(), "lastPlaceName", "JoFUYaQQtF");
        setIntField(term118529, term118529.getClass(), "lastRegionId", -1159054979);
        setField(term118529, term118529.getClass(), "lastRegionName", "SAKoORlZVA");
        setField(term118529, term118529.getClass(), "lastClientId", "HhYVbmMRiN");
        setField(term118529, term118529.getClass(), "lastCountryCode", "UYEVBNEKyf");
        setIntField(term118529, term118529.getClass(), "eventPoint", 408150067);
        setIntField(term118529, term118529.getClass(), "totalLv", 591636524);
        setIntField(term118529, term118529.getClass(), "lastLoginBonusDay", 568699873);
        setIntField(term118529, term118529.getClass(), "lastSurvivalBonusDay", -1785686568);
        setIntField(term118529, term118529.getClass(), "loginBonusLv", 1294837262);
        setField(term118527, term118527.getClass(), "user", term118529);
        setIntField(term118527, term118527.getClass(), "orderId", -215632827);
        setLongField(term118527, term118527.getClass(), "sortNumber", 5655884987926296954L);
        setIntField(term118527, term118527.getClass(), "placeId", 184055783);
        setField(term118527, term118527.getClass(), "placeName", "EXduYtKPaE");
        setField(term118527, term118527.getClass(), "country", "UVMEqArKpY");
        setIntField(term118527, term118527.getClass(), "regionId", -1639833487);
        setField(term118527, term118527.getClass(), "playDate", "fLbDziHEHK");
        setField(term118527, term118527.getClass(), "userPlayDate", "lzRecPiQNU");
        setIntField(term118527, term118527.getClass(), "musicId", -84743336);
        setIntField(term118527, term118527.getClass(), "level", -1199014315);
        setIntField(term118527, term118527.getClass(), "gameMode", -910275560);
        setIntField(term118527, term118527.getClass(), "rivalNum", 1648183622);
        setIntField(term118527, term118527.getClass(), "track", -1008570265);
        setIntField(term118527, term118527.getClass(), "eventId", -1462411830);
        setBooleanField(term118527, term118527.getClass(), "isFreeToPlay", false);
        setIntField(term118527, term118527.getClass(), "playerRating", 186052697);
        setLongField(term118527, term118527.getClass(), "playedUserId1", -6055416231811865303L);
        setField(term118527, term118527.getClass(), "playedUserName1", "CVfKmjoLKq");
        setIntField(term118527, term118527.getClass(), "playedMusicLevel1", 554356747);
        setLongField(term118527, term118527.getClass(), "playedUserId2", 4600612212546071466L);
        setField(term118527, term118527.getClass(), "playedUserName2", "zvqciKTUAl");
        setIntField(term118527, term118527.getClass(), "playedMusicLevel2", -1090542678);
        setLongField(term118527, term118527.getClass(), "playedUserId3", 736282298030442495L);
        setField(term118527, term118527.getClass(), "playedUserName3", "hvNiDuvOYJ");
        setIntField(term118527, term118527.getClass(), "playedMusicLevel3", 174422614);
        setIntField(term118527, term118527.getClass(), "achievement", 433230186);
        setIntField(term118527, term118527.getClass(), "score", -1345691314);
        setIntField(term118527, term118527.getClass(), "tapScore", 705683968);
        setIntField(term118527, term118527.getClass(), "holdScore", -1433294930);
        setIntField(term118527, term118527.getClass(), "slideScore", -208376998);
        setIntField(term118527, term118527.getClass(), "breakScore", -1110875685);
        setIntField(term118527, term118527.getClass(), "syncRate", 1354426438);
        setIntField(term118527, term118527.getClass(), "vsWin", 2029894030);
        setBooleanField(term118527, term118527.getClass(), "isAllPerfect", true);
        setIntField(term118527, term118527.getClass(), "fullCombo", 17901373);
        setIntField(term118527, term118527.getClass(), "maxFever", -919565215);
        setIntField(term118527, term118527.getClass(), "maxCombo", 1095256626);
        setIntField(term118527, term118527.getClass(), "tapPerfect", 410424321);
        setIntField(term118527, term118527.getClass(), "tapGreat", 1038671901);
        setIntField(term118527, term118527.getClass(), "tapGood", 540755284);
        setIntField(term118527, term118527.getClass(), "tapBad", 347931231);
        setIntField(term118527, term118527.getClass(), "holdPerfect", 1298824158);
        setIntField(term118527, term118527.getClass(), "holdGreat", 199754542);
        setIntField(term118527, term118527.getClass(), "holdGood", -449459947);
        setIntField(term118527, term118527.getClass(), "holdBad", -1061589081);
        setIntField(term118527, term118527.getClass(), "slidePerfect", 746023829);
        setIntField(term118527, term118527.getClass(), "slideGreat", 41516868);
        setIntField(term118527, term118527.getClass(), "slideGood", 1336776784);
        setIntField(term118527, term118527.getClass(), "slideBad", -22457416);
        setIntField(term118527, term118527.getClass(), "breakPerfect", -1325174741);
        setIntField(term118527, term118527.getClass(), "breakGreat", 684193673);
        setIntField(term118527, term118527.getClass(), "breakGood", 370263718);
        setIntField(term118527, term118527.getClass(), "breakBad", 48015073);
        setBooleanField(term118527, term118527.getClass(), "isTrackSkip", true);
        setBooleanField(term118527, term118527.getClass(), "isHighScore", true);
        setBooleanField(term118527, term118527.getClass(), "isChallengeTrack", false);
        setIntField(term118527, term118527.getClass(), "challengeLife", 546263682);
        setIntField(term118527, term118527.getClass(), "challengeRemain", -2035094166);
        setIntField(term118527, term118527.getClass(), "isAllPerfectPlus", -1363734645);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRivalNum", argTypes, term118527, args);
    }

};


