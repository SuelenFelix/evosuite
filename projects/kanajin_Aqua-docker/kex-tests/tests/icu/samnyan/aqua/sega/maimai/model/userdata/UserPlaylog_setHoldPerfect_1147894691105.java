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

public class UserPlaylog_setHoldPerfect_1147894691105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term162023;
     Object term162335;

    public UserPlaylog_setHoldPerfect_1147894691105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term162029 = new Long(-6399462725251497844L);
        term162023 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term162025 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term162027 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term162043 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term162044 = newInstance(Class.forName("java.time.LocalDate"));
        Object term162048 = newInstance(Class.forName("java.time.LocalTime"));
        Object term162053 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term162054 = newInstance(Class.forName("java.time.LocalDate"));
        Object term162058 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term162023, term162023.getClass(), "id", -4303254485153363630L);
        setLongField(term162025, term162025.getClass(), "id", -6459891615024824682L);
        setLongField(term162027, term162027.getClass(), "id", 4404944231648782138L);
        setField(term162027, term162027.getClass(), "extId", term162029);
        setField(term162027, term162027.getClass(), "luid", "FECGrszMje");
        setIntField(term162044, term162044.getClass(), "year", 2024);
        setShortField(term162044, term162044.getClass(), "month", (short) 1);
        setShortField(term162044, term162044.getClass(), "day", (short) 2);
        setField(term162043, term162043.getClass(), "date", term162044);
        setByteField(term162048, term162048.getClass(), "hour", (byte) 11);
        setByteField(term162048, term162048.getClass(), "minute", (byte) 57);
        setByteField(term162048, term162048.getClass(), "second", (byte) 11);
        setIntField(term162048, term162048.getClass(), "nano", 372467179);
        setField(term162043, term162043.getClass(), "time", term162048);
        setField(term162027, term162027.getClass(), "registerTime", term162043);
        setIntField(term162054, term162054.getClass(), "year", 2027);
        setShortField(term162054, term162054.getClass(), "month", (short) 8);
        setShortField(term162054, term162054.getClass(), "day", (short) 9);
        setField(term162053, term162053.getClass(), "date", term162054);
        setByteField(term162058, term162058.getClass(), "hour", (byte) 20);
        setByteField(term162058, term162058.getClass(), "minute", (byte) 47);
        setByteField(term162058, term162058.getClass(), "second", (byte) 18);
        setIntField(term162058, term162058.getClass(), "nano", 296781163);
        setField(term162053, term162053.getClass(), "time", term162058);
        setField(term162027, term162027.getClass(), "accessTime", term162053);
        setField(term162025, term162025.getClass(), "card", term162027);
        setIntField(term162025, term162025.getClass(), "lastDataVersion", 423150618);
        setField(term162025, term162025.getClass(), "userName", "uYvUMAqudy");
        setIntField(term162025, term162025.getClass(), "point", -331188138);
        setIntField(term162025, term162025.getClass(), "totalPoint", 452861971);
        setIntField(term162025, term162025.getClass(), "iconId", 233956740);
        setIntField(term162025, term162025.getClass(), "nameplateId", 784786065);
        setIntField(term162025, term162025.getClass(), "frameId", -1150190375);
        setIntField(term162025, term162025.getClass(), "trophyId", 2019123147);
        setIntField(term162025, term162025.getClass(), "playCount", -2004315391);
        setIntField(term162025, term162025.getClass(), "playVsCount", 783251457);
        setIntField(term162025, term162025.getClass(), "playSyncCount", 75955740);
        setIntField(term162025, term162025.getClass(), "winCount", 1873501970);
        setIntField(term162025, term162025.getClass(), "helpCount", 2062401058);
        setIntField(term162025, term162025.getClass(), "comboCount", 1857369874);
        setIntField(term162025, term162025.getClass(), "feverCount", 1970011244);
        setIntField(term162025, term162025.getClass(), "totalHiScore", -1426757140);
        setIntField(term162025, term162025.getClass(), "totalEasyHighScore", -1254420032);
        setIntField(term162025, term162025.getClass(), "totalBasicHighScore", 758112612);
        setIntField(term162025, term162025.getClass(), "totalAdvancedHighScore", -1609198447);
        setIntField(term162025, term162025.getClass(), "totalExpertHighScore", 1395245543);
        setIntField(term162025, term162025.getClass(), "totalMasterHighScore", -1401508518);
        setIntField(term162025, term162025.getClass(), "totalReMasterHighScore", -1998883830);
        setIntField(term162025, term162025.getClass(), "totalHighSync", 849028402);
        setIntField(term162025, term162025.getClass(), "totalEasySync", 123822516);
        setIntField(term162025, term162025.getClass(), "totalBasicSync", -1365351657);
        setIntField(term162025, term162025.getClass(), "totalAdvancedSync", 1728653113);
        setIntField(term162025, term162025.getClass(), "totalExpertSync", -776018312);
        setIntField(term162025, term162025.getClass(), "totalMasterSync", -1536039432);
        setIntField(term162025, term162025.getClass(), "totalReMasterSync", 135942667);
        setIntField(term162025, term162025.getClass(), "playerRating", -1967901380);
        setIntField(term162025, term162025.getClass(), "highestRating", -1737107470);
        setIntField(term162025, term162025.getClass(), "rankAuthTailId", -1212633244);
        setField(term162025, term162025.getClass(), "eventWatchedDate", "ynxbUIshhw");
        setField(term162025, term162025.getClass(), "webLimitDate", "YLRmtmCngx");
        setIntField(term162025, term162025.getClass(), "challengeTrackPhase", 659054777);
        setIntField(term162025, term162025.getClass(), "firstPlayBits", 1890032811);
        setField(term162025, term162025.getClass(), "lastPlayDate", "nrdzzTSWFF");
        setIntField(term162025, term162025.getClass(), "lastPlaceId", -530175816);
        setField(term162025, term162025.getClass(), "lastPlaceName", "KoJHLBVrxX");
        setIntField(term162025, term162025.getClass(), "lastRegionId", -1481797117);
        setField(term162025, term162025.getClass(), "lastRegionName", "HkLucnnsSl");
        setField(term162025, term162025.getClass(), "lastClientId", "VdhooJgKjD");
        setField(term162025, term162025.getClass(), "lastCountryCode", "glIybxsQbc");
        setIntField(term162025, term162025.getClass(), "eventPoint", 635853784);
        setIntField(term162025, term162025.getClass(), "totalLv", 2114015707);
        setIntField(term162025, term162025.getClass(), "lastLoginBonusDay", 488734162);
        setIntField(term162025, term162025.getClass(), "lastSurvivalBonusDay", 52471250);
        setIntField(term162025, term162025.getClass(), "loginBonusLv", -1338458791);
        setField(term162023, term162023.getClass(), "user", term162025);
        setIntField(term162023, term162023.getClass(), "orderId", 842175384);
        setLongField(term162023, term162023.getClass(), "sortNumber", -7960465355740029962L);
        setIntField(term162023, term162023.getClass(), "placeId", -1605190950);
        setField(term162023, term162023.getClass(), "placeName", "nWUrJaIrWY");
        setField(term162023, term162023.getClass(), "country", "azfYXqXuep");
        setIntField(term162023, term162023.getClass(), "regionId", 1512836245);
        setField(term162023, term162023.getClass(), "playDate", "RUDKjRvYEj");
        setField(term162023, term162023.getClass(), "userPlayDate", "qqfmBAQNbi");
        setIntField(term162023, term162023.getClass(), "musicId", -752328791);
        setIntField(term162023, term162023.getClass(), "level", -748398831);
        setIntField(term162023, term162023.getClass(), "gameMode", 1449996511);
        setIntField(term162023, term162023.getClass(), "rivalNum", -350502680);
        setIntField(term162023, term162023.getClass(), "track", 493986099);
        setIntField(term162023, term162023.getClass(), "eventId", 522321683);
        setBooleanField(term162023, term162023.getClass(), "isFreeToPlay", false);
        setIntField(term162023, term162023.getClass(), "playerRating", 1541756812);
        setLongField(term162023, term162023.getClass(), "playedUserId1", -7641504744663354190L);
        setField(term162023, term162023.getClass(), "playedUserName1", "ZazUKKNrNz");
        setIntField(term162023, term162023.getClass(), "playedMusicLevel1", 119194259);
        setLongField(term162023, term162023.getClass(), "playedUserId2", 2973367088695686720L);
        setField(term162023, term162023.getClass(), "playedUserName2", "adJVCgKQux");
        setIntField(term162023, term162023.getClass(), "playedMusicLevel2", -928793560);
        setLongField(term162023, term162023.getClass(), "playedUserId3", 3957586217570224080L);
        setField(term162023, term162023.getClass(), "playedUserName3", "PQibUERIvR");
        setIntField(term162023, term162023.getClass(), "playedMusicLevel3", 144429690);
        setIntField(term162023, term162023.getClass(), "achievement", -2133232503);
        setIntField(term162023, term162023.getClass(), "score", -1349110749);
        setIntField(term162023, term162023.getClass(), "tapScore", 1700222594);
        setIntField(term162023, term162023.getClass(), "holdScore", 1291183587);
        setIntField(term162023, term162023.getClass(), "slideScore", -560802528);
        setIntField(term162023, term162023.getClass(), "breakScore", -1287897675);
        setIntField(term162023, term162023.getClass(), "syncRate", 653233733);
        setIntField(term162023, term162023.getClass(), "vsWin", 1815047334);
        setBooleanField(term162023, term162023.getClass(), "isAllPerfect", true);
        setIntField(term162023, term162023.getClass(), "fullCombo", -575767005);
        setIntField(term162023, term162023.getClass(), "maxFever", -1182414572);
        setIntField(term162023, term162023.getClass(), "maxCombo", 1185482247);
        setIntField(term162023, term162023.getClass(), "tapPerfect", 1568253187);
        setIntField(term162023, term162023.getClass(), "tapGreat", -280594931);
        setIntField(term162023, term162023.getClass(), "tapGood", -1021875450);
        setIntField(term162023, term162023.getClass(), "tapBad", -1343310413);
        setIntField(term162023, term162023.getClass(), "holdPerfect", -1886071910);
        setIntField(term162023, term162023.getClass(), "holdGreat", -1520235161);
        setIntField(term162023, term162023.getClass(), "holdGood", -852029982);
        setIntField(term162023, term162023.getClass(), "holdBad", -383482999);
        setIntField(term162023, term162023.getClass(), "slidePerfect", -1807941088);
        setIntField(term162023, term162023.getClass(), "slideGreat", 1234028909);
        setIntField(term162023, term162023.getClass(), "slideGood", 1952002406);
        setIntField(term162023, term162023.getClass(), "slideBad", -527177368);
        setIntField(term162023, term162023.getClass(), "breakPerfect", 1343714639);
        setIntField(term162023, term162023.getClass(), "breakGreat", -237644559);
        setIntField(term162023, term162023.getClass(), "breakGood", -1365126201);
        setIntField(term162023, term162023.getClass(), "breakBad", 1562847823);
        setBooleanField(term162023, term162023.getClass(), "isTrackSkip", true);
        setBooleanField(term162023, term162023.getClass(), "isHighScore", false);
        setBooleanField(term162023, term162023.getClass(), "isChallengeTrack", false);
        setIntField(term162023, term162023.getClass(), "challengeLife", -97710562);
        setIntField(term162023, term162023.getClass(), "challengeRemain", -282059906);
        setIntField(term162023, term162023.getClass(), "isAllPerfectPlus", 1617057800);
        term162335 = new Integer(-2107384799);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term162335;
        callMethod(klass, "setHoldPerfect", argTypes, term162023, args);
    }

};


