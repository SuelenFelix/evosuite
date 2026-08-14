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

public class UserPlaylog_setTapGood_357762161102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3987385;
     Object term3987697;

    public UserPlaylog_setTapGood_357762161102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3987391 = new Long(6760936648872508104L);
        term3987385 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term3987387 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term3987389 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term3987405 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3987406 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3987410 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3987415 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3987416 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3987420 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term3987385, term3987385.getClass(), "id", 3281910730330845777L);
        setLongField(term3987387, term3987387.getClass(), "id", 7851250136758766446L);
        setLongField(term3987389, term3987389.getClass(), "id", 3475202561917777327L);
        setField(term3987389, term3987389.getClass(), "extId", term3987391);
        setField(term3987389, term3987389.getClass(), "luid", "cGmsWAAKWR");
        setIntField(term3987406, term3987406.getClass(), "year", 2011);
        setShortField(term3987406, term3987406.getClass(), "month", (short) 12);
        setShortField(term3987406, term3987406.getClass(), "day", (short) 14);
        setField(term3987405, term3987405.getClass(), "date", term3987406);
        setByteField(term3987410, term3987410.getClass(), "hour", (byte) 16);
        setByteField(term3987410, term3987410.getClass(), "minute", (byte) 1);
        setByteField(term3987410, term3987410.getClass(), "second", (byte) 10);
        setIntField(term3987410, term3987410.getClass(), "nano", 59246258);
        setField(term3987405, term3987405.getClass(), "time", term3987410);
        setField(term3987389, term3987389.getClass(), "registerTime", term3987405);
        setIntField(term3987416, term3987416.getClass(), "year", 2011);
        setShortField(term3987416, term3987416.getClass(), "month", (short) 5);
        setShortField(term3987416, term3987416.getClass(), "day", (short) 10);
        setField(term3987415, term3987415.getClass(), "date", term3987416);
        setByteField(term3987420, term3987420.getClass(), "hour", (byte) 16);
        setByteField(term3987420, term3987420.getClass(), "minute", (byte) 10);
        setByteField(term3987420, term3987420.getClass(), "second", (byte) 23);
        setIntField(term3987420, term3987420.getClass(), "nano", 336930393);
        setField(term3987415, term3987415.getClass(), "time", term3987420);
        setField(term3987389, term3987389.getClass(), "accessTime", term3987415);
        setField(term3987387, term3987387.getClass(), "card", term3987389);
        setIntField(term3987387, term3987387.getClass(), "lastDataVersion", 2138145300);
        setField(term3987387, term3987387.getClass(), "userName", "xpQOfITMwD");
        setIntField(term3987387, term3987387.getClass(), "point", -1011083687);
        setIntField(term3987387, term3987387.getClass(), "totalPoint", 659206142);
        setIntField(term3987387, term3987387.getClass(), "iconId", 809800214);
        setIntField(term3987387, term3987387.getClass(), "nameplateId", -883344364);
        setIntField(term3987387, term3987387.getClass(), "frameId", 650649221);
        setIntField(term3987387, term3987387.getClass(), "trophyId", 768198537);
        setIntField(term3987387, term3987387.getClass(), "playCount", -1088776184);
        setIntField(term3987387, term3987387.getClass(), "playVsCount", 1556685489);
        setIntField(term3987387, term3987387.getClass(), "playSyncCount", 491918348);
        setIntField(term3987387, term3987387.getClass(), "winCount", 48643386);
        setIntField(term3987387, term3987387.getClass(), "helpCount", 1758074289);
        setIntField(term3987387, term3987387.getClass(), "comboCount", -1104421264);
        setIntField(term3987387, term3987387.getClass(), "feverCount", 1864277499);
        setIntField(term3987387, term3987387.getClass(), "totalHiScore", -1890849576);
        setIntField(term3987387, term3987387.getClass(), "totalEasyHighScore", 633577773);
        setIntField(term3987387, term3987387.getClass(), "totalBasicHighScore", 1534579109);
        setIntField(term3987387, term3987387.getClass(), "totalAdvancedHighScore", -65673403);
        setIntField(term3987387, term3987387.getClass(), "totalExpertHighScore", -1322259497);
        setIntField(term3987387, term3987387.getClass(), "totalMasterHighScore", 717738934);
        setIntField(term3987387, term3987387.getClass(), "totalReMasterHighScore", -1931157500);
        setIntField(term3987387, term3987387.getClass(), "totalHighSync", -244805434);
        setIntField(term3987387, term3987387.getClass(), "totalEasySync", -1574228718);
        setIntField(term3987387, term3987387.getClass(), "totalBasicSync", -1207782071);
        setIntField(term3987387, term3987387.getClass(), "totalAdvancedSync", -612459657);
        setIntField(term3987387, term3987387.getClass(), "totalExpertSync", 2072199045);
        setIntField(term3987387, term3987387.getClass(), "totalMasterSync", -1402000457);
        setIntField(term3987387, term3987387.getClass(), "totalReMasterSync", -1023426936);
        setIntField(term3987387, term3987387.getClass(), "playerRating", 233564721);
        setIntField(term3987387, term3987387.getClass(), "highestRating", 146164537);
        setIntField(term3987387, term3987387.getClass(), "rankAuthTailId", -1935289983);
        setField(term3987387, term3987387.getClass(), "eventWatchedDate", "hKmUqrZcAc");
        setField(term3987387, term3987387.getClass(), "webLimitDate", "kdseWDZlhW");
        setIntField(term3987387, term3987387.getClass(), "challengeTrackPhase", 465671393);
        setIntField(term3987387, term3987387.getClass(), "firstPlayBits", -272467454);
        setField(term3987387, term3987387.getClass(), "lastPlayDate", "nsWZCMJJsw");
        setIntField(term3987387, term3987387.getClass(), "lastPlaceId", 1254838542);
        setField(term3987387, term3987387.getClass(), "lastPlaceName", "OhZspuObGk");
        setIntField(term3987387, term3987387.getClass(), "lastRegionId", -986903507);
        setField(term3987387, term3987387.getClass(), "lastRegionName", "uPKoOTnafT");
        setField(term3987387, term3987387.getClass(), "lastClientId", "rebEtWIdEL");
        setField(term3987387, term3987387.getClass(), "lastCountryCode", "sfQJjQjiLe");
        setIntField(term3987387, term3987387.getClass(), "eventPoint", -1000938256);
        setIntField(term3987387, term3987387.getClass(), "totalLv", 1682805996);
        setIntField(term3987387, term3987387.getClass(), "lastLoginBonusDay", 689614504);
        setIntField(term3987387, term3987387.getClass(), "lastSurvivalBonusDay", -579746266);
        setIntField(term3987387, term3987387.getClass(), "loginBonusLv", 66584354);
        setField(term3987385, term3987385.getClass(), "user", term3987387);
        setIntField(term3987385, term3987385.getClass(), "orderId", -1005245705);
        setLongField(term3987385, term3987385.getClass(), "sortNumber", 5075614972540660160L);
        setIntField(term3987385, term3987385.getClass(), "placeId", -850450073);
        setField(term3987385, term3987385.getClass(), "placeName", "NDbeAieRns");
        setField(term3987385, term3987385.getClass(), "country", "OHWbpHLoAD");
        setIntField(term3987385, term3987385.getClass(), "regionId", -1003145598);
        setField(term3987385, term3987385.getClass(), "playDate", "gGRIKLHgfI");
        setField(term3987385, term3987385.getClass(), "userPlayDate", "AcAxqJVbvn");
        setIntField(term3987385, term3987385.getClass(), "musicId", -783344998);
        setIntField(term3987385, term3987385.getClass(), "level", 1810572609);
        setIntField(term3987385, term3987385.getClass(), "gameMode", 1931888109);
        setIntField(term3987385, term3987385.getClass(), "rivalNum", 952286257);
        setIntField(term3987385, term3987385.getClass(), "track", 759652951);
        setIntField(term3987385, term3987385.getClass(), "eventId", -1038985640);
        setBooleanField(term3987385, term3987385.getClass(), "isFreeToPlay", true);
        setIntField(term3987385, term3987385.getClass(), "playerRating", -77589540);
        setLongField(term3987385, term3987385.getClass(), "playedUserId1", 4796107228851801839L);
        setField(term3987385, term3987385.getClass(), "playedUserName1", "NeFgAnquRX");
        setIntField(term3987385, term3987385.getClass(), "playedMusicLevel1", -1664370573);
        setLongField(term3987385, term3987385.getClass(), "playedUserId2", 3225745796269683078L);
        setField(term3987385, term3987385.getClass(), "playedUserName2", "FsSTUoJWNm");
        setIntField(term3987385, term3987385.getClass(), "playedMusicLevel2", -19058538);
        setLongField(term3987385, term3987385.getClass(), "playedUserId3", -1668759491180103821L);
        setField(term3987385, term3987385.getClass(), "playedUserName3", "thpeMOtMtU");
        setIntField(term3987385, term3987385.getClass(), "playedMusicLevel3", 1534303180);
        setIntField(term3987385, term3987385.getClass(), "achievement", -872844828);
        setIntField(term3987385, term3987385.getClass(), "score", -234742646);
        setIntField(term3987385, term3987385.getClass(), "tapScore", -1557390220);
        setIntField(term3987385, term3987385.getClass(), "holdScore", -1123351298);
        setIntField(term3987385, term3987385.getClass(), "slideScore", -537391620);
        setIntField(term3987385, term3987385.getClass(), "breakScore", 316776113);
        setIntField(term3987385, term3987385.getClass(), "syncRate", 1235074519);
        setIntField(term3987385, term3987385.getClass(), "vsWin", -301984962);
        setBooleanField(term3987385, term3987385.getClass(), "isAllPerfect", true);
        setIntField(term3987385, term3987385.getClass(), "fullCombo", 801089006);
        setIntField(term3987385, term3987385.getClass(), "maxFever", -1465726388);
        setIntField(term3987385, term3987385.getClass(), "maxCombo", 350636943);
        setIntField(term3987385, term3987385.getClass(), "tapPerfect", 2054776597);
        setIntField(term3987385, term3987385.getClass(), "tapGreat", -1269019623);
        setIntField(term3987385, term3987385.getClass(), "tapGood", -1470996640);
        setIntField(term3987385, term3987385.getClass(), "tapBad", -190154825);
        setIntField(term3987385, term3987385.getClass(), "holdPerfect", 124612318);
        setIntField(term3987385, term3987385.getClass(), "holdGreat", 480621682);
        setIntField(term3987385, term3987385.getClass(), "holdGood", -1581599420);
        setIntField(term3987385, term3987385.getClass(), "holdBad", 58469985);
        setIntField(term3987385, term3987385.getClass(), "slidePerfect", 1639377563);
        setIntField(term3987385, term3987385.getClass(), "slideGreat", 115068363);
        setIntField(term3987385, term3987385.getClass(), "slideGood", 997463192);
        setIntField(term3987385, term3987385.getClass(), "slideBad", -1886250383);
        setIntField(term3987385, term3987385.getClass(), "breakPerfect", 1338857733);
        setIntField(term3987385, term3987385.getClass(), "breakGreat", -459461800);
        setIntField(term3987385, term3987385.getClass(), "breakGood", 1665940598);
        setIntField(term3987385, term3987385.getClass(), "breakBad", -1669851959);
        setBooleanField(term3987385, term3987385.getClass(), "isTrackSkip", false);
        setBooleanField(term3987385, term3987385.getClass(), "isHighScore", true);
        setBooleanField(term3987385, term3987385.getClass(), "isChallengeTrack", false);
        setIntField(term3987385, term3987385.getClass(), "challengeLife", -85024284);
        setIntField(term3987385, term3987385.getClass(), "challengeRemain", 236716654);
        setIntField(term3987385, term3987385.getClass(), "isAllPerfectPlus", 8685287);
        term3987697 = new Integer(-818617946);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3987697;
        callMethod(klass, "setTapGood", argTypes, term3987385, args);
    }

};


