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

public class UserPlaylog_setHoldGreat_849996131106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term162497;
     Object term162809;

    public UserPlaylog_setHoldGreat_849996131106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term162503 = new Long(-4855037955202452256L);
        term162497 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term162499 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term162501 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term162517 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term162518 = newInstance(Class.forName("java.time.LocalDate"));
        Object term162522 = newInstance(Class.forName("java.time.LocalTime"));
        Object term162527 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term162528 = newInstance(Class.forName("java.time.LocalDate"));
        Object term162532 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term162497, term162497.getClass(), "id", 8593688994010397171L);
        setLongField(term162499, term162499.getClass(), "id", -4702186846634836119L);
        setLongField(term162501, term162501.getClass(), "id", -8068180925713934318L);
        setField(term162501, term162501.getClass(), "extId", term162503);
        setField(term162501, term162501.getClass(), "luid", "HsNjJxtWVg");
        setIntField(term162518, term162518.getClass(), "year", 2024);
        setShortField(term162518, term162518.getClass(), "month", (short) 11);
        setShortField(term162518, term162518.getClass(), "day", (short) 30);
        setField(term162517, term162517.getClass(), "date", term162518);
        setByteField(term162522, term162522.getClass(), "hour", (byte) 4);
        setByteField(term162522, term162522.getClass(), "minute", (byte) 23);
        setByteField(term162522, term162522.getClass(), "second", (byte) 32);
        setIntField(term162522, term162522.getClass(), "nano", 784828432);
        setField(term162517, term162517.getClass(), "time", term162522);
        setField(term162501, term162501.getClass(), "registerTime", term162517);
        setIntField(term162528, term162528.getClass(), "year", 2019);
        setShortField(term162528, term162528.getClass(), "month", (short) 1);
        setShortField(term162528, term162528.getClass(), "day", (short) 31);
        setField(term162527, term162527.getClass(), "date", term162528);
        setByteField(term162532, term162532.getClass(), "hour", (byte) 8);
        setByteField(term162532, term162532.getClass(), "minute", (byte) 28);
        setByteField(term162532, term162532.getClass(), "second", (byte) 32);
        setIntField(term162532, term162532.getClass(), "nano", 828700368);
        setField(term162527, term162527.getClass(), "time", term162532);
        setField(term162501, term162501.getClass(), "accessTime", term162527);
        setField(term162499, term162499.getClass(), "card", term162501);
        setIntField(term162499, term162499.getClass(), "lastDataVersion", 1577912882);
        setField(term162499, term162499.getClass(), "userName", "yrkhDRBntk");
        setIntField(term162499, term162499.getClass(), "point", 840659647);
        setIntField(term162499, term162499.getClass(), "totalPoint", -1822491249);
        setIntField(term162499, term162499.getClass(), "iconId", 1457375656);
        setIntField(term162499, term162499.getClass(), "nameplateId", 628545427);
        setIntField(term162499, term162499.getClass(), "frameId", 2115204641);
        setIntField(term162499, term162499.getClass(), "trophyId", 1127988468);
        setIntField(term162499, term162499.getClass(), "playCount", 140996827);
        setIntField(term162499, term162499.getClass(), "playVsCount", -786370653);
        setIntField(term162499, term162499.getClass(), "playSyncCount", 1877145783);
        setIntField(term162499, term162499.getClass(), "winCount", -686186980);
        setIntField(term162499, term162499.getClass(), "helpCount", -1042964125);
        setIntField(term162499, term162499.getClass(), "comboCount", 387837259);
        setIntField(term162499, term162499.getClass(), "feverCount", 277950814);
        setIntField(term162499, term162499.getClass(), "totalHiScore", -1351951482);
        setIntField(term162499, term162499.getClass(), "totalEasyHighScore", 260046683);
        setIntField(term162499, term162499.getClass(), "totalBasicHighScore", -1480568202);
        setIntField(term162499, term162499.getClass(), "totalAdvancedHighScore", -323812063);
        setIntField(term162499, term162499.getClass(), "totalExpertHighScore", 1754621668);
        setIntField(term162499, term162499.getClass(), "totalMasterHighScore", -771723689);
        setIntField(term162499, term162499.getClass(), "totalReMasterHighScore", -1561284414);
        setIntField(term162499, term162499.getClass(), "totalHighSync", 278664158);
        setIntField(term162499, term162499.getClass(), "totalEasySync", 744530669);
        setIntField(term162499, term162499.getClass(), "totalBasicSync", -1504728921);
        setIntField(term162499, term162499.getClass(), "totalAdvancedSync", 116468085);
        setIntField(term162499, term162499.getClass(), "totalExpertSync", 1669425961);
        setIntField(term162499, term162499.getClass(), "totalMasterSync", 1319396977);
        setIntField(term162499, term162499.getClass(), "totalReMasterSync", 125667037);
        setIntField(term162499, term162499.getClass(), "playerRating", 29653165);
        setIntField(term162499, term162499.getClass(), "highestRating", 1348076400);
        setIntField(term162499, term162499.getClass(), "rankAuthTailId", 2054986925);
        setField(term162499, term162499.getClass(), "eventWatchedDate", "LbApweKHaq");
        setField(term162499, term162499.getClass(), "webLimitDate", "CvaVsebeSp");
        setIntField(term162499, term162499.getClass(), "challengeTrackPhase", -1792558197);
        setIntField(term162499, term162499.getClass(), "firstPlayBits", -1356988453);
        setField(term162499, term162499.getClass(), "lastPlayDate", "sGjykeQShT");
        setIntField(term162499, term162499.getClass(), "lastPlaceId", -1989711010);
        setField(term162499, term162499.getClass(), "lastPlaceName", "hnbqtTirak");
        setIntField(term162499, term162499.getClass(), "lastRegionId", 1973819104);
        setField(term162499, term162499.getClass(), "lastRegionName", "xfornNGLCO");
        setField(term162499, term162499.getClass(), "lastClientId", "ADfzHZloSW");
        setField(term162499, term162499.getClass(), "lastCountryCode", "wIJnugNtmS");
        setIntField(term162499, term162499.getClass(), "eventPoint", 851052368);
        setIntField(term162499, term162499.getClass(), "totalLv", -2128379023);
        setIntField(term162499, term162499.getClass(), "lastLoginBonusDay", -1391245948);
        setIntField(term162499, term162499.getClass(), "lastSurvivalBonusDay", 1558078237);
        setIntField(term162499, term162499.getClass(), "loginBonusLv", -1162925802);
        setField(term162497, term162497.getClass(), "user", term162499);
        setIntField(term162497, term162497.getClass(), "orderId", 1637912538);
        setLongField(term162497, term162497.getClass(), "sortNumber", -5687439958444660557L);
        setIntField(term162497, term162497.getClass(), "placeId", 1047821366);
        setField(term162497, term162497.getClass(), "placeName", "ctdWGECgpL");
        setField(term162497, term162497.getClass(), "country", "NpOvJxLOcu");
        setIntField(term162497, term162497.getClass(), "regionId", -1352024989);
        setField(term162497, term162497.getClass(), "playDate", "VuMCtXnbbd");
        setField(term162497, term162497.getClass(), "userPlayDate", "fXGAskxMPG");
        setIntField(term162497, term162497.getClass(), "musicId", -424014188);
        setIntField(term162497, term162497.getClass(), "level", -1093224022);
        setIntField(term162497, term162497.getClass(), "gameMode", 2073644979);
        setIntField(term162497, term162497.getClass(), "rivalNum", 1451190250);
        setIntField(term162497, term162497.getClass(), "track", -1238169318);
        setIntField(term162497, term162497.getClass(), "eventId", -501928682);
        setBooleanField(term162497, term162497.getClass(), "isFreeToPlay", true);
        setIntField(term162497, term162497.getClass(), "playerRating", 1038197384);
        setLongField(term162497, term162497.getClass(), "playedUserId1", 643414393920888432L);
        setField(term162497, term162497.getClass(), "playedUserName1", "IRGoqHyCCH");
        setIntField(term162497, term162497.getClass(), "playedMusicLevel1", 1888359359);
        setLongField(term162497, term162497.getClass(), "playedUserId2", -3982367954172699860L);
        setField(term162497, term162497.getClass(), "playedUserName2", "UsLqohewfX");
        setIntField(term162497, term162497.getClass(), "playedMusicLevel2", -274920819);
        setLongField(term162497, term162497.getClass(), "playedUserId3", 7153115868701511726L);
        setField(term162497, term162497.getClass(), "playedUserName3", "llZOjgXknR");
        setIntField(term162497, term162497.getClass(), "playedMusicLevel3", -2114633562);
        setIntField(term162497, term162497.getClass(), "achievement", -7919563);
        setIntField(term162497, term162497.getClass(), "score", 1028590227);
        setIntField(term162497, term162497.getClass(), "tapScore", -2066534737);
        setIntField(term162497, term162497.getClass(), "holdScore", -708772056);
        setIntField(term162497, term162497.getClass(), "slideScore", 52910608);
        setIntField(term162497, term162497.getClass(), "breakScore", 1605914830);
        setIntField(term162497, term162497.getClass(), "syncRate", 1403983011);
        setIntField(term162497, term162497.getClass(), "vsWin", 241425640);
        setBooleanField(term162497, term162497.getClass(), "isAllPerfect", true);
        setIntField(term162497, term162497.getClass(), "fullCombo", 956126825);
        setIntField(term162497, term162497.getClass(), "maxFever", 1665859306);
        setIntField(term162497, term162497.getClass(), "maxCombo", 1794952368);
        setIntField(term162497, term162497.getClass(), "tapPerfect", 43322397);
        setIntField(term162497, term162497.getClass(), "tapGreat", 129502702);
        setIntField(term162497, term162497.getClass(), "tapGood", 1010593023);
        setIntField(term162497, term162497.getClass(), "tapBad", 496590404);
        setIntField(term162497, term162497.getClass(), "holdPerfect", -1024580443);
        setIntField(term162497, term162497.getClass(), "holdGreat", 1723556689);
        setIntField(term162497, term162497.getClass(), "holdGood", 1523450777);
        setIntField(term162497, term162497.getClass(), "holdBad", 2145724988);
        setIntField(term162497, term162497.getClass(), "slidePerfect", 1452806901);
        setIntField(term162497, term162497.getClass(), "slideGreat", 1935745319);
        setIntField(term162497, term162497.getClass(), "slideGood", -82786863);
        setIntField(term162497, term162497.getClass(), "slideBad", -1367102110);
        setIntField(term162497, term162497.getClass(), "breakPerfect", -312245686);
        setIntField(term162497, term162497.getClass(), "breakGreat", -1262949869);
        setIntField(term162497, term162497.getClass(), "breakGood", 143583387);
        setIntField(term162497, term162497.getClass(), "breakBad", 1962305334);
        setBooleanField(term162497, term162497.getClass(), "isTrackSkip", true);
        setBooleanField(term162497, term162497.getClass(), "isHighScore", true);
        setBooleanField(term162497, term162497.getClass(), "isChallengeTrack", false);
        setIntField(term162497, term162497.getClass(), "challengeLife", -1346292188);
        setIntField(term162497, term162497.getClass(), "challengeRemain", -678131933);
        setIntField(term162497, term162497.getClass(), "isAllPerfectPlus", 975637339);
        term162809 = new Integer(-1623660303);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term162809;
        callMethod(klass, "setHoldGreat", argTypes, term162497, args);
    }

};


