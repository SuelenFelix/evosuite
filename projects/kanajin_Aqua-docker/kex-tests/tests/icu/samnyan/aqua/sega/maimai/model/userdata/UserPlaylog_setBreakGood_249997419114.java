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

public class UserPlaylog_setBreakGood_249997419114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term166707;
     Object term167019;

    public UserPlaylog_setBreakGood_249997419114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term166713 = new Long(7464122056779140588L);
        term166707 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term166709 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term166711 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term166727 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term166728 = newInstance(Class.forName("java.time.LocalDate"));
        Object term166732 = newInstance(Class.forName("java.time.LocalTime"));
        Object term166737 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term166738 = newInstance(Class.forName("java.time.LocalDate"));
        Object term166742 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term166707, term166707.getClass(), "id", -7979131537588306481L);
        setLongField(term166709, term166709.getClass(), "id", 1914754471514802967L);
        setLongField(term166711, term166711.getClass(), "id", 2773198289980268296L);
        setField(term166711, term166711.getClass(), "extId", term166713);
        setField(term166711, term166711.getClass(), "luid", "lAeBISqCrk");
        setIntField(term166728, term166728.getClass(), "year", 2010);
        setShortField(term166728, term166728.getClass(), "month", (short) 9);
        setShortField(term166728, term166728.getClass(), "day", (short) 29);
        setField(term166727, term166727.getClass(), "date", term166728);
        setByteField(term166732, term166732.getClass(), "hour", (byte) 8);
        setByteField(term166732, term166732.getClass(), "minute", (byte) 31);
        setByteField(term166732, term166732.getClass(), "second", (byte) 30);
        setIntField(term166732, term166732.getClass(), "nano", 849859593);
        setField(term166727, term166727.getClass(), "time", term166732);
        setField(term166711, term166711.getClass(), "registerTime", term166727);
        setIntField(term166738, term166738.getClass(), "year", 2012);
        setShortField(term166738, term166738.getClass(), "month", (short) 8);
        setShortField(term166738, term166738.getClass(), "day", (short) 20);
        setField(term166737, term166737.getClass(), "date", term166738);
        setByteField(term166742, term166742.getClass(), "hour", (byte) 3);
        setByteField(term166742, term166742.getClass(), "minute", (byte) 28);
        setByteField(term166742, term166742.getClass(), "second", (byte) 41);
        setIntField(term166742, term166742.getClass(), "nano", 318104116);
        setField(term166737, term166737.getClass(), "time", term166742);
        setField(term166711, term166711.getClass(), "accessTime", term166737);
        setField(term166709, term166709.getClass(), "card", term166711);
        setIntField(term166709, term166709.getClass(), "lastDataVersion", -1351423865);
        setField(term166709, term166709.getClass(), "userName", "HnnPhDNDyi");
        setIntField(term166709, term166709.getClass(), "point", -2015672634);
        setIntField(term166709, term166709.getClass(), "totalPoint", 1028150528);
        setIntField(term166709, term166709.getClass(), "iconId", -1524830135);
        setIntField(term166709, term166709.getClass(), "nameplateId", -794970365);
        setIntField(term166709, term166709.getClass(), "frameId", 409899436);
        setIntField(term166709, term166709.getClass(), "trophyId", 2125556559);
        setIntField(term166709, term166709.getClass(), "playCount", 664340054);
        setIntField(term166709, term166709.getClass(), "playVsCount", -877384450);
        setIntField(term166709, term166709.getClass(), "playSyncCount", 142458254);
        setIntField(term166709, term166709.getClass(), "winCount", 1202347510);
        setIntField(term166709, term166709.getClass(), "helpCount", -810607624);
        setIntField(term166709, term166709.getClass(), "comboCount", -1563203827);
        setIntField(term166709, term166709.getClass(), "feverCount", -1636094904);
        setIntField(term166709, term166709.getClass(), "totalHiScore", -421708599);
        setIntField(term166709, term166709.getClass(), "totalEasyHighScore", -1169073237);
        setIntField(term166709, term166709.getClass(), "totalBasicHighScore", 639742248);
        setIntField(term166709, term166709.getClass(), "totalAdvancedHighScore", 475306102);
        setIntField(term166709, term166709.getClass(), "totalExpertHighScore", 382363602);
        setIntField(term166709, term166709.getClass(), "totalMasterHighScore", -648483307);
        setIntField(term166709, term166709.getClass(), "totalReMasterHighScore", 1153847712);
        setIntField(term166709, term166709.getClass(), "totalHighSync", -1975797926);
        setIntField(term166709, term166709.getClass(), "totalEasySync", -1931979420);
        setIntField(term166709, term166709.getClass(), "totalBasicSync", -73185137);
        setIntField(term166709, term166709.getClass(), "totalAdvancedSync", -1348563120);
        setIntField(term166709, term166709.getClass(), "totalExpertSync", 1899795714);
        setIntField(term166709, term166709.getClass(), "totalMasterSync", -1420745360);
        setIntField(term166709, term166709.getClass(), "totalReMasterSync", 299327459);
        setIntField(term166709, term166709.getClass(), "playerRating", 293627666);
        setIntField(term166709, term166709.getClass(), "highestRating", -1650782551);
        setIntField(term166709, term166709.getClass(), "rankAuthTailId", -883583466);
        setField(term166709, term166709.getClass(), "eventWatchedDate", "krnrkIPbzN");
        setField(term166709, term166709.getClass(), "webLimitDate", "mplyyLrKQK");
        setIntField(term166709, term166709.getClass(), "challengeTrackPhase", -1023098025);
        setIntField(term166709, term166709.getClass(), "firstPlayBits", -1460755340);
        setField(term166709, term166709.getClass(), "lastPlayDate", "oLdidoDNLS");
        setIntField(term166709, term166709.getClass(), "lastPlaceId", 1017319261);
        setField(term166709, term166709.getClass(), "lastPlaceName", "EbcXzUOlTx");
        setIntField(term166709, term166709.getClass(), "lastRegionId", 607268223);
        setField(term166709, term166709.getClass(), "lastRegionName", "cskZnajTgh");
        setField(term166709, term166709.getClass(), "lastClientId", "WZVuzItKLn");
        setField(term166709, term166709.getClass(), "lastCountryCode", "GlWTGuZeKv");
        setIntField(term166709, term166709.getClass(), "eventPoint", -689249302);
        setIntField(term166709, term166709.getClass(), "totalLv", 1026118060);
        setIntField(term166709, term166709.getClass(), "lastLoginBonusDay", -970099998);
        setIntField(term166709, term166709.getClass(), "lastSurvivalBonusDay", 2130488553);
        setIntField(term166709, term166709.getClass(), "loginBonusLv", -1814623267);
        setField(term166707, term166707.getClass(), "user", term166709);
        setIntField(term166707, term166707.getClass(), "orderId", 666940104);
        setLongField(term166707, term166707.getClass(), "sortNumber", 632360974898166826L);
        setIntField(term166707, term166707.getClass(), "placeId", -908741930);
        setField(term166707, term166707.getClass(), "placeName", "PVYBCybavV");
        setField(term166707, term166707.getClass(), "country", "lXOLVBrGzc");
        setIntField(term166707, term166707.getClass(), "regionId", -1523769085);
        setField(term166707, term166707.getClass(), "playDate", "lWRWhoPZaY");
        setField(term166707, term166707.getClass(), "userPlayDate", "jUBVwhASOA");
        setIntField(term166707, term166707.getClass(), "musicId", 1072417396);
        setIntField(term166707, term166707.getClass(), "level", -612351959);
        setIntField(term166707, term166707.getClass(), "gameMode", -117784043);
        setIntField(term166707, term166707.getClass(), "rivalNum", 1615274874);
        setIntField(term166707, term166707.getClass(), "track", -645081091);
        setIntField(term166707, term166707.getClass(), "eventId", 82465841);
        setBooleanField(term166707, term166707.getClass(), "isFreeToPlay", true);
        setIntField(term166707, term166707.getClass(), "playerRating", 1399306846);
        setLongField(term166707, term166707.getClass(), "playedUserId1", -4867174099943207188L);
        setField(term166707, term166707.getClass(), "playedUserName1", "WNLNmPMYIn");
        setIntField(term166707, term166707.getClass(), "playedMusicLevel1", 1423778259);
        setLongField(term166707, term166707.getClass(), "playedUserId2", -6992366326063551384L);
        setField(term166707, term166707.getClass(), "playedUserName2", "uGYzQjwRvb");
        setIntField(term166707, term166707.getClass(), "playedMusicLevel2", 1826010641);
        setLongField(term166707, term166707.getClass(), "playedUserId3", -257489281168692227L);
        setField(term166707, term166707.getClass(), "playedUserName3", "nkZCVHXnmb");
        setIntField(term166707, term166707.getClass(), "playedMusicLevel3", 517242939);
        setIntField(term166707, term166707.getClass(), "achievement", -886620106);
        setIntField(term166707, term166707.getClass(), "score", 2105589115);
        setIntField(term166707, term166707.getClass(), "tapScore", 1287229465);
        setIntField(term166707, term166707.getClass(), "holdScore", 1514126539);
        setIntField(term166707, term166707.getClass(), "slideScore", -1093746420);
        setIntField(term166707, term166707.getClass(), "breakScore", 1473288476);
        setIntField(term166707, term166707.getClass(), "syncRate", -909959149);
        setIntField(term166707, term166707.getClass(), "vsWin", -1299781370);
        setBooleanField(term166707, term166707.getClass(), "isAllPerfect", true);
        setIntField(term166707, term166707.getClass(), "fullCombo", 1857875869);
        setIntField(term166707, term166707.getClass(), "maxFever", 1476732721);
        setIntField(term166707, term166707.getClass(), "maxCombo", -1357145194);
        setIntField(term166707, term166707.getClass(), "tapPerfect", 1504791908);
        setIntField(term166707, term166707.getClass(), "tapGreat", -744938855);
        setIntField(term166707, term166707.getClass(), "tapGood", 593710556);
        setIntField(term166707, term166707.getClass(), "tapBad", 66448659);
        setIntField(term166707, term166707.getClass(), "holdPerfect", -1419897437);
        setIntField(term166707, term166707.getClass(), "holdGreat", -1592297082);
        setIntField(term166707, term166707.getClass(), "holdGood", -1324026890);
        setIntField(term166707, term166707.getClass(), "holdBad", -51135139);
        setIntField(term166707, term166707.getClass(), "slidePerfect", 312014334);
        setIntField(term166707, term166707.getClass(), "slideGreat", -1847596059);
        setIntField(term166707, term166707.getClass(), "slideGood", 1616169832);
        setIntField(term166707, term166707.getClass(), "slideBad", 570560874);
        setIntField(term166707, term166707.getClass(), "breakPerfect", -952668257);
        setIntField(term166707, term166707.getClass(), "breakGreat", -2034981230);
        setIntField(term166707, term166707.getClass(), "breakGood", -2082739016);
        setIntField(term166707, term166707.getClass(), "breakBad", -365199269);
        setBooleanField(term166707, term166707.getClass(), "isTrackSkip", true);
        setBooleanField(term166707, term166707.getClass(), "isHighScore", false);
        setBooleanField(term166707, term166707.getClass(), "isChallengeTrack", true);
        setIntField(term166707, term166707.getClass(), "challengeLife", -1386125231);
        setIntField(term166707, term166707.getClass(), "challengeRemain", 1574329200);
        setIntField(term166707, term166707.getClass(), "isAllPerfectPlus", -631957530);
        term167019 = new Integer(749290937);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term167019;
        callMethod(klass, "setBreakGood", argTypes, term166707, args);
    }

};


