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

public class UserPlaylog_setBreakGood_249997419115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term166763;
     Object term167075;

    public UserPlaylog_setBreakGood_249997419115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term166769 = new Long(7464122056779140588L);
        term166763 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term166765 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term166767 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term166783 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term166784 = newInstance(Class.forName("java.time.LocalDate"));
        Object term166788 = newInstance(Class.forName("java.time.LocalTime"));
        Object term166793 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term166794 = newInstance(Class.forName("java.time.LocalDate"));
        Object term166798 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term166763, term166763.getClass(), "id", -7979131537588306481L);
        setLongField(term166765, term166765.getClass(), "id", 1914754471514802967L);
        setLongField(term166767, term166767.getClass(), "id", 2773198289980268296L);
        setField(term166767, term166767.getClass(), "extId", term166769);
        setField(term166767, term166767.getClass(), "luid", "lAeBISqCrk");
        setIntField(term166784, term166784.getClass(), "year", 2010);
        setShortField(term166784, term166784.getClass(), "month", (short) 9);
        setShortField(term166784, term166784.getClass(), "day", (short) 29);
        setField(term166783, term166783.getClass(), "date", term166784);
        setByteField(term166788, term166788.getClass(), "hour", (byte) 8);
        setByteField(term166788, term166788.getClass(), "minute", (byte) 31);
        setByteField(term166788, term166788.getClass(), "second", (byte) 30);
        setIntField(term166788, term166788.getClass(), "nano", 849859593);
        setField(term166783, term166783.getClass(), "time", term166788);
        setField(term166767, term166767.getClass(), "registerTime", term166783);
        setIntField(term166794, term166794.getClass(), "year", 2012);
        setShortField(term166794, term166794.getClass(), "month", (short) 8);
        setShortField(term166794, term166794.getClass(), "day", (short) 20);
        setField(term166793, term166793.getClass(), "date", term166794);
        setByteField(term166798, term166798.getClass(), "hour", (byte) 3);
        setByteField(term166798, term166798.getClass(), "minute", (byte) 28);
        setByteField(term166798, term166798.getClass(), "second", (byte) 41);
        setIntField(term166798, term166798.getClass(), "nano", 318104116);
        setField(term166793, term166793.getClass(), "time", term166798);
        setField(term166767, term166767.getClass(), "accessTime", term166793);
        setField(term166765, term166765.getClass(), "card", term166767);
        setIntField(term166765, term166765.getClass(), "lastDataVersion", -1351423865);
        setField(term166765, term166765.getClass(), "userName", "HnnPhDNDyi");
        setIntField(term166765, term166765.getClass(), "point", -2015672634);
        setIntField(term166765, term166765.getClass(), "totalPoint", 1028150528);
        setIntField(term166765, term166765.getClass(), "iconId", -1524830135);
        setIntField(term166765, term166765.getClass(), "nameplateId", -794970365);
        setIntField(term166765, term166765.getClass(), "frameId", 409899436);
        setIntField(term166765, term166765.getClass(), "trophyId", 2125556559);
        setIntField(term166765, term166765.getClass(), "playCount", 664340054);
        setIntField(term166765, term166765.getClass(), "playVsCount", -877384450);
        setIntField(term166765, term166765.getClass(), "playSyncCount", 142458254);
        setIntField(term166765, term166765.getClass(), "winCount", 1202347510);
        setIntField(term166765, term166765.getClass(), "helpCount", -810607624);
        setIntField(term166765, term166765.getClass(), "comboCount", -1563203827);
        setIntField(term166765, term166765.getClass(), "feverCount", -1636094904);
        setIntField(term166765, term166765.getClass(), "totalHiScore", -421708599);
        setIntField(term166765, term166765.getClass(), "totalEasyHighScore", -1169073237);
        setIntField(term166765, term166765.getClass(), "totalBasicHighScore", 639742248);
        setIntField(term166765, term166765.getClass(), "totalAdvancedHighScore", 475306102);
        setIntField(term166765, term166765.getClass(), "totalExpertHighScore", 382363602);
        setIntField(term166765, term166765.getClass(), "totalMasterHighScore", -648483307);
        setIntField(term166765, term166765.getClass(), "totalReMasterHighScore", 1153847712);
        setIntField(term166765, term166765.getClass(), "totalHighSync", -1975797926);
        setIntField(term166765, term166765.getClass(), "totalEasySync", -1931979420);
        setIntField(term166765, term166765.getClass(), "totalBasicSync", -73185137);
        setIntField(term166765, term166765.getClass(), "totalAdvancedSync", -1348563120);
        setIntField(term166765, term166765.getClass(), "totalExpertSync", 1899795714);
        setIntField(term166765, term166765.getClass(), "totalMasterSync", -1420745360);
        setIntField(term166765, term166765.getClass(), "totalReMasterSync", 299327459);
        setIntField(term166765, term166765.getClass(), "playerRating", 293627666);
        setIntField(term166765, term166765.getClass(), "highestRating", -1650782551);
        setIntField(term166765, term166765.getClass(), "rankAuthTailId", -883583466);
        setField(term166765, term166765.getClass(), "eventWatchedDate", "krnrkIPbzN");
        setField(term166765, term166765.getClass(), "webLimitDate", "mplyyLrKQK");
        setIntField(term166765, term166765.getClass(), "challengeTrackPhase", -1023098025);
        setIntField(term166765, term166765.getClass(), "firstPlayBits", -1460755340);
        setField(term166765, term166765.getClass(), "lastPlayDate", "oLdidoDNLS");
        setIntField(term166765, term166765.getClass(), "lastPlaceId", 1017319261);
        setField(term166765, term166765.getClass(), "lastPlaceName", "EbcXzUOlTx");
        setIntField(term166765, term166765.getClass(), "lastRegionId", 607268223);
        setField(term166765, term166765.getClass(), "lastRegionName", "cskZnajTgh");
        setField(term166765, term166765.getClass(), "lastClientId", "WZVuzItKLn");
        setField(term166765, term166765.getClass(), "lastCountryCode", "GlWTGuZeKv");
        setIntField(term166765, term166765.getClass(), "eventPoint", -689249302);
        setIntField(term166765, term166765.getClass(), "totalLv", 1026118060);
        setIntField(term166765, term166765.getClass(), "lastLoginBonusDay", -970099998);
        setIntField(term166765, term166765.getClass(), "lastSurvivalBonusDay", 2130488553);
        setIntField(term166765, term166765.getClass(), "loginBonusLv", -1814623267);
        setField(term166763, term166763.getClass(), "user", term166765);
        setIntField(term166763, term166763.getClass(), "orderId", 666940104);
        setLongField(term166763, term166763.getClass(), "sortNumber", 632360974898166826L);
        setIntField(term166763, term166763.getClass(), "placeId", -908741930);
        setField(term166763, term166763.getClass(), "placeName", "PVYBCybavV");
        setField(term166763, term166763.getClass(), "country", "lXOLVBrGzc");
        setIntField(term166763, term166763.getClass(), "regionId", -1523769085);
        setField(term166763, term166763.getClass(), "playDate", "lWRWhoPZaY");
        setField(term166763, term166763.getClass(), "userPlayDate", "jUBVwhASOA");
        setIntField(term166763, term166763.getClass(), "musicId", 1072417396);
        setIntField(term166763, term166763.getClass(), "level", -612351959);
        setIntField(term166763, term166763.getClass(), "gameMode", -117784043);
        setIntField(term166763, term166763.getClass(), "rivalNum", 1615274874);
        setIntField(term166763, term166763.getClass(), "track", -645081091);
        setIntField(term166763, term166763.getClass(), "eventId", 82465841);
        setBooleanField(term166763, term166763.getClass(), "isFreeToPlay", true);
        setIntField(term166763, term166763.getClass(), "playerRating", 1399306846);
        setLongField(term166763, term166763.getClass(), "playedUserId1", -4867174099943207188L);
        setField(term166763, term166763.getClass(), "playedUserName1", "WNLNmPMYIn");
        setIntField(term166763, term166763.getClass(), "playedMusicLevel1", 1423778259);
        setLongField(term166763, term166763.getClass(), "playedUserId2", -6992366326063551384L);
        setField(term166763, term166763.getClass(), "playedUserName2", "uGYzQjwRvb");
        setIntField(term166763, term166763.getClass(), "playedMusicLevel2", 1826010641);
        setLongField(term166763, term166763.getClass(), "playedUserId3", -257489281168692227L);
        setField(term166763, term166763.getClass(), "playedUserName3", "nkZCVHXnmb");
        setIntField(term166763, term166763.getClass(), "playedMusicLevel3", 517242939);
        setIntField(term166763, term166763.getClass(), "achievement", -886620106);
        setIntField(term166763, term166763.getClass(), "score", 2105589115);
        setIntField(term166763, term166763.getClass(), "tapScore", 1287229465);
        setIntField(term166763, term166763.getClass(), "holdScore", 1514126539);
        setIntField(term166763, term166763.getClass(), "slideScore", -1093746420);
        setIntField(term166763, term166763.getClass(), "breakScore", 1473288476);
        setIntField(term166763, term166763.getClass(), "syncRate", -909959149);
        setIntField(term166763, term166763.getClass(), "vsWin", -1299781370);
        setBooleanField(term166763, term166763.getClass(), "isAllPerfect", true);
        setIntField(term166763, term166763.getClass(), "fullCombo", 1857875869);
        setIntField(term166763, term166763.getClass(), "maxFever", 1476732721);
        setIntField(term166763, term166763.getClass(), "maxCombo", -1357145194);
        setIntField(term166763, term166763.getClass(), "tapPerfect", 1504791908);
        setIntField(term166763, term166763.getClass(), "tapGreat", -744938855);
        setIntField(term166763, term166763.getClass(), "tapGood", 593710556);
        setIntField(term166763, term166763.getClass(), "tapBad", 66448659);
        setIntField(term166763, term166763.getClass(), "holdPerfect", -1419897437);
        setIntField(term166763, term166763.getClass(), "holdGreat", -1592297082);
        setIntField(term166763, term166763.getClass(), "holdGood", -1324026890);
        setIntField(term166763, term166763.getClass(), "holdBad", -51135139);
        setIntField(term166763, term166763.getClass(), "slidePerfect", 312014334);
        setIntField(term166763, term166763.getClass(), "slideGreat", -1847596059);
        setIntField(term166763, term166763.getClass(), "slideGood", 1616169832);
        setIntField(term166763, term166763.getClass(), "slideBad", 570560874);
        setIntField(term166763, term166763.getClass(), "breakPerfect", -952668257);
        setIntField(term166763, term166763.getClass(), "breakGreat", -2034981230);
        setIntField(term166763, term166763.getClass(), "breakGood", -2082739016);
        setIntField(term166763, term166763.getClass(), "breakBad", -365199269);
        setBooleanField(term166763, term166763.getClass(), "isTrackSkip", true);
        setBooleanField(term166763, term166763.getClass(), "isHighScore", false);
        setBooleanField(term166763, term166763.getClass(), "isChallengeTrack", true);
        setIntField(term166763, term166763.getClass(), "challengeLife", -1386125231);
        setIntField(term166763, term166763.getClass(), "challengeRemain", 1574329200);
        setIntField(term166763, term166763.getClass(), "isAllPerfectPlus", -631957530);
        term167075 = new Integer(749290937);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term167075;
        callMethod(klass, "setBreakGood", argTypes, term166763, args);
    }

};


