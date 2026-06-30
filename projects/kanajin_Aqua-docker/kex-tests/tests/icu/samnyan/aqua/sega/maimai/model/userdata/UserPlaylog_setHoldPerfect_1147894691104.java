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

public class UserPlaylog_setHoldPerfect_1147894691104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term161967;
     Object term162279;

    public UserPlaylog_setHoldPerfect_1147894691104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term161973 = new Long(-6399462725251497844L);
        term161967 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term161969 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term161971 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term161987 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term161988 = newInstance(Class.forName("java.time.LocalDate"));
        Object term161992 = newInstance(Class.forName("java.time.LocalTime"));
        Object term161997 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term161998 = newInstance(Class.forName("java.time.LocalDate"));
        Object term162002 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term161967, term161967.getClass(), "id", -4303254485153363630L);
        setLongField(term161969, term161969.getClass(), "id", -6459891615024824682L);
        setLongField(term161971, term161971.getClass(), "id", 4404944231648782138L);
        setField(term161971, term161971.getClass(), "extId", term161973);
        setField(term161971, term161971.getClass(), "luid", "FECGrszMje");
        setIntField(term161988, term161988.getClass(), "year", 2024);
        setShortField(term161988, term161988.getClass(), "month", (short) 1);
        setShortField(term161988, term161988.getClass(), "day", (short) 2);
        setField(term161987, term161987.getClass(), "date", term161988);
        setByteField(term161992, term161992.getClass(), "hour", (byte) 11);
        setByteField(term161992, term161992.getClass(), "minute", (byte) 57);
        setByteField(term161992, term161992.getClass(), "second", (byte) 11);
        setIntField(term161992, term161992.getClass(), "nano", 372467179);
        setField(term161987, term161987.getClass(), "time", term161992);
        setField(term161971, term161971.getClass(), "registerTime", term161987);
        setIntField(term161998, term161998.getClass(), "year", 2027);
        setShortField(term161998, term161998.getClass(), "month", (short) 8);
        setShortField(term161998, term161998.getClass(), "day", (short) 9);
        setField(term161997, term161997.getClass(), "date", term161998);
        setByteField(term162002, term162002.getClass(), "hour", (byte) 20);
        setByteField(term162002, term162002.getClass(), "minute", (byte) 47);
        setByteField(term162002, term162002.getClass(), "second", (byte) 18);
        setIntField(term162002, term162002.getClass(), "nano", 296781163);
        setField(term161997, term161997.getClass(), "time", term162002);
        setField(term161971, term161971.getClass(), "accessTime", term161997);
        setField(term161969, term161969.getClass(), "card", term161971);
        setIntField(term161969, term161969.getClass(), "lastDataVersion", 423150618);
        setField(term161969, term161969.getClass(), "userName", "uYvUMAqudy");
        setIntField(term161969, term161969.getClass(), "point", -331188138);
        setIntField(term161969, term161969.getClass(), "totalPoint", 452861971);
        setIntField(term161969, term161969.getClass(), "iconId", 233956740);
        setIntField(term161969, term161969.getClass(), "nameplateId", 784786065);
        setIntField(term161969, term161969.getClass(), "frameId", -1150190375);
        setIntField(term161969, term161969.getClass(), "trophyId", 2019123147);
        setIntField(term161969, term161969.getClass(), "playCount", -2004315391);
        setIntField(term161969, term161969.getClass(), "playVsCount", 783251457);
        setIntField(term161969, term161969.getClass(), "playSyncCount", 75955740);
        setIntField(term161969, term161969.getClass(), "winCount", 1873501970);
        setIntField(term161969, term161969.getClass(), "helpCount", 2062401058);
        setIntField(term161969, term161969.getClass(), "comboCount", 1857369874);
        setIntField(term161969, term161969.getClass(), "feverCount", 1970011244);
        setIntField(term161969, term161969.getClass(), "totalHiScore", -1426757140);
        setIntField(term161969, term161969.getClass(), "totalEasyHighScore", -1254420032);
        setIntField(term161969, term161969.getClass(), "totalBasicHighScore", 758112612);
        setIntField(term161969, term161969.getClass(), "totalAdvancedHighScore", -1609198447);
        setIntField(term161969, term161969.getClass(), "totalExpertHighScore", 1395245543);
        setIntField(term161969, term161969.getClass(), "totalMasterHighScore", -1401508518);
        setIntField(term161969, term161969.getClass(), "totalReMasterHighScore", -1998883830);
        setIntField(term161969, term161969.getClass(), "totalHighSync", 849028402);
        setIntField(term161969, term161969.getClass(), "totalEasySync", 123822516);
        setIntField(term161969, term161969.getClass(), "totalBasicSync", -1365351657);
        setIntField(term161969, term161969.getClass(), "totalAdvancedSync", 1728653113);
        setIntField(term161969, term161969.getClass(), "totalExpertSync", -776018312);
        setIntField(term161969, term161969.getClass(), "totalMasterSync", -1536039432);
        setIntField(term161969, term161969.getClass(), "totalReMasterSync", 135942667);
        setIntField(term161969, term161969.getClass(), "playerRating", -1967901380);
        setIntField(term161969, term161969.getClass(), "highestRating", -1737107470);
        setIntField(term161969, term161969.getClass(), "rankAuthTailId", -1212633244);
        setField(term161969, term161969.getClass(), "eventWatchedDate", "ynxbUIshhw");
        setField(term161969, term161969.getClass(), "webLimitDate", "YLRmtmCngx");
        setIntField(term161969, term161969.getClass(), "challengeTrackPhase", 659054777);
        setIntField(term161969, term161969.getClass(), "firstPlayBits", 1890032811);
        setField(term161969, term161969.getClass(), "lastPlayDate", "nrdzzTSWFF");
        setIntField(term161969, term161969.getClass(), "lastPlaceId", -530175816);
        setField(term161969, term161969.getClass(), "lastPlaceName", "KoJHLBVrxX");
        setIntField(term161969, term161969.getClass(), "lastRegionId", -1481797117);
        setField(term161969, term161969.getClass(), "lastRegionName", "HkLucnnsSl");
        setField(term161969, term161969.getClass(), "lastClientId", "VdhooJgKjD");
        setField(term161969, term161969.getClass(), "lastCountryCode", "glIybxsQbc");
        setIntField(term161969, term161969.getClass(), "eventPoint", 635853784);
        setIntField(term161969, term161969.getClass(), "totalLv", 2114015707);
        setIntField(term161969, term161969.getClass(), "lastLoginBonusDay", 488734162);
        setIntField(term161969, term161969.getClass(), "lastSurvivalBonusDay", 52471250);
        setIntField(term161969, term161969.getClass(), "loginBonusLv", -1338458791);
        setField(term161967, term161967.getClass(), "user", term161969);
        setIntField(term161967, term161967.getClass(), "orderId", 842175384);
        setLongField(term161967, term161967.getClass(), "sortNumber", -7960465355740029962L);
        setIntField(term161967, term161967.getClass(), "placeId", -1605190950);
        setField(term161967, term161967.getClass(), "placeName", "nWUrJaIrWY");
        setField(term161967, term161967.getClass(), "country", "azfYXqXuep");
        setIntField(term161967, term161967.getClass(), "regionId", 1512836245);
        setField(term161967, term161967.getClass(), "playDate", "RUDKjRvYEj");
        setField(term161967, term161967.getClass(), "userPlayDate", "qqfmBAQNbi");
        setIntField(term161967, term161967.getClass(), "musicId", -752328791);
        setIntField(term161967, term161967.getClass(), "level", -748398831);
        setIntField(term161967, term161967.getClass(), "gameMode", 1449996511);
        setIntField(term161967, term161967.getClass(), "rivalNum", -350502680);
        setIntField(term161967, term161967.getClass(), "track", 493986099);
        setIntField(term161967, term161967.getClass(), "eventId", 522321683);
        setBooleanField(term161967, term161967.getClass(), "isFreeToPlay", false);
        setIntField(term161967, term161967.getClass(), "playerRating", 1541756812);
        setLongField(term161967, term161967.getClass(), "playedUserId1", -7641504744663354190L);
        setField(term161967, term161967.getClass(), "playedUserName1", "ZazUKKNrNz");
        setIntField(term161967, term161967.getClass(), "playedMusicLevel1", 119194259);
        setLongField(term161967, term161967.getClass(), "playedUserId2", 2973367088695686720L);
        setField(term161967, term161967.getClass(), "playedUserName2", "adJVCgKQux");
        setIntField(term161967, term161967.getClass(), "playedMusicLevel2", -928793560);
        setLongField(term161967, term161967.getClass(), "playedUserId3", 3957586217570224080L);
        setField(term161967, term161967.getClass(), "playedUserName3", "PQibUERIvR");
        setIntField(term161967, term161967.getClass(), "playedMusicLevel3", 144429690);
        setIntField(term161967, term161967.getClass(), "achievement", -2133232503);
        setIntField(term161967, term161967.getClass(), "score", -1349110749);
        setIntField(term161967, term161967.getClass(), "tapScore", 1700222594);
        setIntField(term161967, term161967.getClass(), "holdScore", 1291183587);
        setIntField(term161967, term161967.getClass(), "slideScore", -560802528);
        setIntField(term161967, term161967.getClass(), "breakScore", -1287897675);
        setIntField(term161967, term161967.getClass(), "syncRate", 653233733);
        setIntField(term161967, term161967.getClass(), "vsWin", 1815047334);
        setBooleanField(term161967, term161967.getClass(), "isAllPerfect", true);
        setIntField(term161967, term161967.getClass(), "fullCombo", -575767005);
        setIntField(term161967, term161967.getClass(), "maxFever", -1182414572);
        setIntField(term161967, term161967.getClass(), "maxCombo", 1185482247);
        setIntField(term161967, term161967.getClass(), "tapPerfect", 1568253187);
        setIntField(term161967, term161967.getClass(), "tapGreat", -280594931);
        setIntField(term161967, term161967.getClass(), "tapGood", -1021875450);
        setIntField(term161967, term161967.getClass(), "tapBad", -1343310413);
        setIntField(term161967, term161967.getClass(), "holdPerfect", -1886071910);
        setIntField(term161967, term161967.getClass(), "holdGreat", -1520235161);
        setIntField(term161967, term161967.getClass(), "holdGood", -852029982);
        setIntField(term161967, term161967.getClass(), "holdBad", -383482999);
        setIntField(term161967, term161967.getClass(), "slidePerfect", -1807941088);
        setIntField(term161967, term161967.getClass(), "slideGreat", 1234028909);
        setIntField(term161967, term161967.getClass(), "slideGood", 1952002406);
        setIntField(term161967, term161967.getClass(), "slideBad", -527177368);
        setIntField(term161967, term161967.getClass(), "breakPerfect", 1343714639);
        setIntField(term161967, term161967.getClass(), "breakGreat", -237644559);
        setIntField(term161967, term161967.getClass(), "breakGood", -1365126201);
        setIntField(term161967, term161967.getClass(), "breakBad", 1562847823);
        setBooleanField(term161967, term161967.getClass(), "isTrackSkip", true);
        setBooleanField(term161967, term161967.getClass(), "isHighScore", false);
        setBooleanField(term161967, term161967.getClass(), "isChallengeTrack", false);
        setIntField(term161967, term161967.getClass(), "challengeLife", -97710562);
        setIntField(term161967, term161967.getClass(), "challengeRemain", -282059906);
        setIntField(term161967, term161967.getClass(), "isAllPerfectPlus", 1617057800);
        term162279 = new Integer(-2107384799);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term162279;
        callMethod(klass, "setHoldPerfect", argTypes, term161967, args);
    }

};


