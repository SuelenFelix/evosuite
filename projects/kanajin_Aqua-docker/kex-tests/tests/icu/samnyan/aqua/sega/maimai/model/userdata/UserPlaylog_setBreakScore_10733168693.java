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

public class UserPlaylog_setBreakScore_10733168693 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term156753;
     Object term157065;

    public UserPlaylog_setBreakScore_10733168693() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term156759 = new Long(1867943942587005261L);
        term156753 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term156755 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term156757 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term156773 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term156774 = newInstance(Class.forName("java.time.LocalDate"));
        Object term156778 = newInstance(Class.forName("java.time.LocalTime"));
        Object term156783 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term156784 = newInstance(Class.forName("java.time.LocalDate"));
        Object term156788 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term156753, term156753.getClass(), "id", 2239859681808970691L);
        setLongField(term156755, term156755.getClass(), "id", -4502190204332677735L);
        setLongField(term156757, term156757.getClass(), "id", 4165201970048882126L);
        setField(term156757, term156757.getClass(), "extId", term156759);
        setField(term156757, term156757.getClass(), "luid", "YPFFWDNfXT");
        setIntField(term156774, term156774.getClass(), "year", 2021);
        setShortField(term156774, term156774.getClass(), "month", (short) 3);
        setShortField(term156774, term156774.getClass(), "day", (short) 14);
        setField(term156773, term156773.getClass(), "date", term156774);
        setByteField(term156778, term156778.getClass(), "hour", (byte) 19);
        setByteField(term156778, term156778.getClass(), "minute", (byte) 26);
        setByteField(term156778, term156778.getClass(), "second", (byte) 19);
        setIntField(term156778, term156778.getClass(), "nano", 18560091);
        setField(term156773, term156773.getClass(), "time", term156778);
        setField(term156757, term156757.getClass(), "registerTime", term156773);
        setIntField(term156784, term156784.getClass(), "year", 2022);
        setShortField(term156784, term156784.getClass(), "month", (short) 7);
        setShortField(term156784, term156784.getClass(), "day", (short) 30);
        setField(term156783, term156783.getClass(), "date", term156784);
        setByteField(term156788, term156788.getClass(), "hour", (byte) 14);
        setByteField(term156788, term156788.getClass(), "minute", (byte) 34);
        setByteField(term156788, term156788.getClass(), "second", (byte) 38);
        setIntField(term156788, term156788.getClass(), "nano", 597227850);
        setField(term156783, term156783.getClass(), "time", term156788);
        setField(term156757, term156757.getClass(), "accessTime", term156783);
        setField(term156755, term156755.getClass(), "card", term156757);
        setIntField(term156755, term156755.getClass(), "lastDataVersion", -750908998);
        setField(term156755, term156755.getClass(), "userName", "QrnjkRvNan");
        setIntField(term156755, term156755.getClass(), "point", 1543613241);
        setIntField(term156755, term156755.getClass(), "totalPoint", 1066517946);
        setIntField(term156755, term156755.getClass(), "iconId", 1950386050);
        setIntField(term156755, term156755.getClass(), "nameplateId", 1986349058);
        setIntField(term156755, term156755.getClass(), "frameId", -246172605);
        setIntField(term156755, term156755.getClass(), "trophyId", -911870500);
        setIntField(term156755, term156755.getClass(), "playCount", 1943346435);
        setIntField(term156755, term156755.getClass(), "playVsCount", -1303010347);
        setIntField(term156755, term156755.getClass(), "playSyncCount", -654353389);
        setIntField(term156755, term156755.getClass(), "winCount", 1416494399);
        setIntField(term156755, term156755.getClass(), "helpCount", 150474550);
        setIntField(term156755, term156755.getClass(), "comboCount", 1361897823);
        setIntField(term156755, term156755.getClass(), "feverCount", -655935832);
        setIntField(term156755, term156755.getClass(), "totalHiScore", 1924786231);
        setIntField(term156755, term156755.getClass(), "totalEasyHighScore", 1433368139);
        setIntField(term156755, term156755.getClass(), "totalBasicHighScore", 1683289870);
        setIntField(term156755, term156755.getClass(), "totalAdvancedHighScore", 2006485504);
        setIntField(term156755, term156755.getClass(), "totalExpertHighScore", -1969509086);
        setIntField(term156755, term156755.getClass(), "totalMasterHighScore", -848266892);
        setIntField(term156755, term156755.getClass(), "totalReMasterHighScore", -964887760);
        setIntField(term156755, term156755.getClass(), "totalHighSync", 1274799342);
        setIntField(term156755, term156755.getClass(), "totalEasySync", 1317657769);
        setIntField(term156755, term156755.getClass(), "totalBasicSync", 1819374556);
        setIntField(term156755, term156755.getClass(), "totalAdvancedSync", 255223769);
        setIntField(term156755, term156755.getClass(), "totalExpertSync", 1215811376);
        setIntField(term156755, term156755.getClass(), "totalMasterSync", -1882811835);
        setIntField(term156755, term156755.getClass(), "totalReMasterSync", -121309994);
        setIntField(term156755, term156755.getClass(), "playerRating", -434978551);
        setIntField(term156755, term156755.getClass(), "highestRating", 654698176);
        setIntField(term156755, term156755.getClass(), "rankAuthTailId", 489056517);
        setField(term156755, term156755.getClass(), "eventWatchedDate", "TZfRFyUTAy");
        setField(term156755, term156755.getClass(), "webLimitDate", "fDBSbnZQEb");
        setIntField(term156755, term156755.getClass(), "challengeTrackPhase", 988286809);
        setIntField(term156755, term156755.getClass(), "firstPlayBits", -1051875058);
        setField(term156755, term156755.getClass(), "lastPlayDate", "eWwifIiXBf");
        setIntField(term156755, term156755.getClass(), "lastPlaceId", -2098463126);
        setField(term156755, term156755.getClass(), "lastPlaceName", "WeglJEjdLT");
        setIntField(term156755, term156755.getClass(), "lastRegionId", -1865713523);
        setField(term156755, term156755.getClass(), "lastRegionName", "BCHkdVYkdA");
        setField(term156755, term156755.getClass(), "lastClientId", "jKLqoDVqyY");
        setField(term156755, term156755.getClass(), "lastCountryCode", "nXxhbinfxu");
        setIntField(term156755, term156755.getClass(), "eventPoint", 1294052524);
        setIntField(term156755, term156755.getClass(), "totalLv", 1189138215);
        setIntField(term156755, term156755.getClass(), "lastLoginBonusDay", 1305481630);
        setIntField(term156755, term156755.getClass(), "lastSurvivalBonusDay", -1239114143);
        setIntField(term156755, term156755.getClass(), "loginBonusLv", -407382435);
        setField(term156753, term156753.getClass(), "user", term156755);
        setIntField(term156753, term156753.getClass(), "orderId", 1687528554);
        setLongField(term156753, term156753.getClass(), "sortNumber", 1713132989163348687L);
        setIntField(term156753, term156753.getClass(), "placeId", 1912021383);
        setField(term156753, term156753.getClass(), "placeName", "YUJWXjGqoj");
        setField(term156753, term156753.getClass(), "country", "FYbsLyvQEc");
        setIntField(term156753, term156753.getClass(), "regionId", 1069651811);
        setField(term156753, term156753.getClass(), "playDate", "DZVnOFFNzA");
        setField(term156753, term156753.getClass(), "userPlayDate", "UhHOlEncqe");
        setIntField(term156753, term156753.getClass(), "musicId", 1490758519);
        setIntField(term156753, term156753.getClass(), "level", -1904018713);
        setIntField(term156753, term156753.getClass(), "gameMode", 938233691);
        setIntField(term156753, term156753.getClass(), "rivalNum", 1318104474);
        setIntField(term156753, term156753.getClass(), "track", -1397230349);
        setIntField(term156753, term156753.getClass(), "eventId", -1717374196);
        setBooleanField(term156753, term156753.getClass(), "isFreeToPlay", false);
        setIntField(term156753, term156753.getClass(), "playerRating", -1680947212);
        setLongField(term156753, term156753.getClass(), "playedUserId1", 4782360695691953108L);
        setField(term156753, term156753.getClass(), "playedUserName1", "BombodvByI");
        setIntField(term156753, term156753.getClass(), "playedMusicLevel1", 1243807284);
        setLongField(term156753, term156753.getClass(), "playedUserId2", 5499210513338318618L);
        setField(term156753, term156753.getClass(), "playedUserName2", "xWXSMsmgup");
        setIntField(term156753, term156753.getClass(), "playedMusicLevel2", 488607086);
        setLongField(term156753, term156753.getClass(), "playedUserId3", 4904841436380882882L);
        setField(term156753, term156753.getClass(), "playedUserName3", "CiRiThUkzG");
        setIntField(term156753, term156753.getClass(), "playedMusicLevel3", 739236682);
        setIntField(term156753, term156753.getClass(), "achievement", 727340192);
        setIntField(term156753, term156753.getClass(), "score", 2011208654);
        setIntField(term156753, term156753.getClass(), "tapScore", -667676644);
        setIntField(term156753, term156753.getClass(), "holdScore", 1950148088);
        setIntField(term156753, term156753.getClass(), "slideScore", 1655153972);
        setIntField(term156753, term156753.getClass(), "breakScore", -572124943);
        setIntField(term156753, term156753.getClass(), "syncRate", 1705739004);
        setIntField(term156753, term156753.getClass(), "vsWin", -1637230216);
        setBooleanField(term156753, term156753.getClass(), "isAllPerfect", true);
        setIntField(term156753, term156753.getClass(), "fullCombo", 937338727);
        setIntField(term156753, term156753.getClass(), "maxFever", 1373177568);
        setIntField(term156753, term156753.getClass(), "maxCombo", -1176571827);
        setIntField(term156753, term156753.getClass(), "tapPerfect", -1847648617);
        setIntField(term156753, term156753.getClass(), "tapGreat", -1629061284);
        setIntField(term156753, term156753.getClass(), "tapGood", 614077584);
        setIntField(term156753, term156753.getClass(), "tapBad", 1613570880);
        setIntField(term156753, term156753.getClass(), "holdPerfect", -1066282695);
        setIntField(term156753, term156753.getClass(), "holdGreat", 449049984);
        setIntField(term156753, term156753.getClass(), "holdGood", -174720521);
        setIntField(term156753, term156753.getClass(), "holdBad", 176159726);
        setIntField(term156753, term156753.getClass(), "slidePerfect", 145078069);
        setIntField(term156753, term156753.getClass(), "slideGreat", -602903146);
        setIntField(term156753, term156753.getClass(), "slideGood", -1411855479);
        setIntField(term156753, term156753.getClass(), "slideBad", 1832816267);
        setIntField(term156753, term156753.getClass(), "breakPerfect", -1078115971);
        setIntField(term156753, term156753.getClass(), "breakGreat", -1342129393);
        setIntField(term156753, term156753.getClass(), "breakGood", -198585857);
        setIntField(term156753, term156753.getClass(), "breakBad", 1021673948);
        setBooleanField(term156753, term156753.getClass(), "isTrackSkip", true);
        setBooleanField(term156753, term156753.getClass(), "isHighScore", false);
        setBooleanField(term156753, term156753.getClass(), "isChallengeTrack", false);
        setIntField(term156753, term156753.getClass(), "challengeLife", 996539266);
        setIntField(term156753, term156753.getClass(), "challengeRemain", -216766818);
        setIntField(term156753, term156753.getClass(), "isAllPerfectPlus", -1969282471);
        term157065 = new Integer(-1205706522);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term157065;
        callMethod(klass, "setBreakScore", argTypes, term156753, args);
    }

};


