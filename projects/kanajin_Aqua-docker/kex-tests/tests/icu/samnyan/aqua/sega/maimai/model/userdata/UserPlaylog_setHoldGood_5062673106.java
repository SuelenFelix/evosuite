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

public class UserPlaylog_setHoldGood_5062673106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3989281;
     Object term3989593;

    public UserPlaylog_setHoldGood_5062673106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3989287 = new Long(-1958562832213922986L);
        term3989281 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term3989283 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term3989285 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term3989301 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3989302 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3989306 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3989311 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3989312 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3989316 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term3989281, term3989281.getClass(), "id", -2496648411030748983L);
        setLongField(term3989283, term3989283.getClass(), "id", 3594815428970095873L);
        setLongField(term3989285, term3989285.getClass(), "id", -7938125539037497823L);
        setField(term3989285, term3989285.getClass(), "extId", term3989287);
        setField(term3989285, term3989285.getClass(), "luid", "HiXiqMAEyG");
        setIntField(term3989302, term3989302.getClass(), "year", 2025);
        setShortField(term3989302, term3989302.getClass(), "month", (short) 5);
        setShortField(term3989302, term3989302.getClass(), "day", (short) 12);
        setField(term3989301, term3989301.getClass(), "date", term3989302);
        setByteField(term3989306, term3989306.getClass(), "hour", (byte) 18);
        setByteField(term3989306, term3989306.getClass(), "minute", (byte) 39);
        setByteField(term3989306, term3989306.getClass(), "second", (byte) 10);
        setIntField(term3989306, term3989306.getClass(), "nano", 839154707);
        setField(term3989301, term3989301.getClass(), "time", term3989306);
        setField(term3989285, term3989285.getClass(), "registerTime", term3989301);
        setIntField(term3989312, term3989312.getClass(), "year", 2016);
        setShortField(term3989312, term3989312.getClass(), "month", (short) 3);
        setShortField(term3989312, term3989312.getClass(), "day", (short) 24);
        setField(term3989311, term3989311.getClass(), "date", term3989312);
        setByteField(term3989316, term3989316.getClass(), "hour", (byte) 20);
        setByteField(term3989316, term3989316.getClass(), "minute", (byte) 29);
        setByteField(term3989316, term3989316.getClass(), "second", (byte) 30);
        setIntField(term3989316, term3989316.getClass(), "nano", 320929400);
        setField(term3989311, term3989311.getClass(), "time", term3989316);
        setField(term3989285, term3989285.getClass(), "accessTime", term3989311);
        setField(term3989283, term3989283.getClass(), "card", term3989285);
        setIntField(term3989283, term3989283.getClass(), "lastDataVersion", -2033320594);
        setField(term3989283, term3989283.getClass(), "userName", "wwVfmilEyB");
        setIntField(term3989283, term3989283.getClass(), "point", -833357855);
        setIntField(term3989283, term3989283.getClass(), "totalPoint", -448834616);
        setIntField(term3989283, term3989283.getClass(), "iconId", 840986812);
        setIntField(term3989283, term3989283.getClass(), "nameplateId", 568147689);
        setIntField(term3989283, term3989283.getClass(), "frameId", -463228130);
        setIntField(term3989283, term3989283.getClass(), "trophyId", 927082716);
        setIntField(term3989283, term3989283.getClass(), "playCount", 180122249);
        setIntField(term3989283, term3989283.getClass(), "playVsCount", -612981699);
        setIntField(term3989283, term3989283.getClass(), "playSyncCount", 153507496);
        setIntField(term3989283, term3989283.getClass(), "winCount", 1595874394);
        setIntField(term3989283, term3989283.getClass(), "helpCount", 1846040003);
        setIntField(term3989283, term3989283.getClass(), "comboCount", -1566157920);
        setIntField(term3989283, term3989283.getClass(), "feverCount", 1362891755);
        setIntField(term3989283, term3989283.getClass(), "totalHiScore", 1896317343);
        setIntField(term3989283, term3989283.getClass(), "totalEasyHighScore", -1261956436);
        setIntField(term3989283, term3989283.getClass(), "totalBasicHighScore", 1630320423);
        setIntField(term3989283, term3989283.getClass(), "totalAdvancedHighScore", 846579974);
        setIntField(term3989283, term3989283.getClass(), "totalExpertHighScore", 1673209419);
        setIntField(term3989283, term3989283.getClass(), "totalMasterHighScore", 2081260020);
        setIntField(term3989283, term3989283.getClass(), "totalReMasterHighScore", -826747561);
        setIntField(term3989283, term3989283.getClass(), "totalHighSync", -542003247);
        setIntField(term3989283, term3989283.getClass(), "totalEasySync", 1114402543);
        setIntField(term3989283, term3989283.getClass(), "totalBasicSync", 1662143835);
        setIntField(term3989283, term3989283.getClass(), "totalAdvancedSync", 605495035);
        setIntField(term3989283, term3989283.getClass(), "totalExpertSync", 941979937);
        setIntField(term3989283, term3989283.getClass(), "totalMasterSync", -1099101435);
        setIntField(term3989283, term3989283.getClass(), "totalReMasterSync", 523093659);
        setIntField(term3989283, term3989283.getClass(), "playerRating", 1277085239);
        setIntField(term3989283, term3989283.getClass(), "highestRating", 1998084170);
        setIntField(term3989283, term3989283.getClass(), "rankAuthTailId", 1035826208);
        setField(term3989283, term3989283.getClass(), "eventWatchedDate", "EcAzHKXtjf");
        setField(term3989283, term3989283.getClass(), "webLimitDate", "wWEdBgnvKV");
        setIntField(term3989283, term3989283.getClass(), "challengeTrackPhase", -183056251);
        setIntField(term3989283, term3989283.getClass(), "firstPlayBits", 2050290397);
        setField(term3989283, term3989283.getClass(), "lastPlayDate", "ocXElyYsHO");
        setIntField(term3989283, term3989283.getClass(), "lastPlaceId", 1077134053);
        setField(term3989283, term3989283.getClass(), "lastPlaceName", "OurCwmEEOt");
        setIntField(term3989283, term3989283.getClass(), "lastRegionId", 1707650148);
        setField(term3989283, term3989283.getClass(), "lastRegionName", "PziWHAdjVO");
        setField(term3989283, term3989283.getClass(), "lastClientId", "ovNTQlfPfw");
        setField(term3989283, term3989283.getClass(), "lastCountryCode", "gUKOcriYFB");
        setIntField(term3989283, term3989283.getClass(), "eventPoint", -1493170582);
        setIntField(term3989283, term3989283.getClass(), "totalLv", -471963650);
        setIntField(term3989283, term3989283.getClass(), "lastLoginBonusDay", 2042226898);
        setIntField(term3989283, term3989283.getClass(), "lastSurvivalBonusDay", 280555575);
        setIntField(term3989283, term3989283.getClass(), "loginBonusLv", -417370692);
        setField(term3989281, term3989281.getClass(), "user", term3989283);
        setIntField(term3989281, term3989281.getClass(), "orderId", 1632464580);
        setLongField(term3989281, term3989281.getClass(), "sortNumber", -385174425290418555L);
        setIntField(term3989281, term3989281.getClass(), "placeId", 2103257216);
        setField(term3989281, term3989281.getClass(), "placeName", "LYryzGEQiZ");
        setField(term3989281, term3989281.getClass(), "country", "SefFIIJyuO");
        setIntField(term3989281, term3989281.getClass(), "regionId", -771141832);
        setField(term3989281, term3989281.getClass(), "playDate", "ExajbPTXCc");
        setField(term3989281, term3989281.getClass(), "userPlayDate", "HmQZKWwFPx");
        setIntField(term3989281, term3989281.getClass(), "musicId", 873954803);
        setIntField(term3989281, term3989281.getClass(), "level", -1453122945);
        setIntField(term3989281, term3989281.getClass(), "gameMode", -496762005);
        setIntField(term3989281, term3989281.getClass(), "rivalNum", 927162479);
        setIntField(term3989281, term3989281.getClass(), "track", -1430013259);
        setIntField(term3989281, term3989281.getClass(), "eventId", -981976580);
        setBooleanField(term3989281, term3989281.getClass(), "isFreeToPlay", true);
        setIntField(term3989281, term3989281.getClass(), "playerRating", -1535551770);
        setLongField(term3989281, term3989281.getClass(), "playedUserId1", -9023794290255188525L);
        setField(term3989281, term3989281.getClass(), "playedUserName1", "uOAruUiKYs");
        setIntField(term3989281, term3989281.getClass(), "playedMusicLevel1", -1369995834);
        setLongField(term3989281, term3989281.getClass(), "playedUserId2", -34087747903398304L);
        setField(term3989281, term3989281.getClass(), "playedUserName2", "GnGraezGpi");
        setIntField(term3989281, term3989281.getClass(), "playedMusicLevel2", 760716336);
        setLongField(term3989281, term3989281.getClass(), "playedUserId3", -5815530529382183480L);
        setField(term3989281, term3989281.getClass(), "playedUserName3", "JWqLLFAldH");
        setIntField(term3989281, term3989281.getClass(), "playedMusicLevel3", -642545123);
        setIntField(term3989281, term3989281.getClass(), "achievement", -633283302);
        setIntField(term3989281, term3989281.getClass(), "score", 376533688);
        setIntField(term3989281, term3989281.getClass(), "tapScore", 1154589130);
        setIntField(term3989281, term3989281.getClass(), "holdScore", -319291994);
        setIntField(term3989281, term3989281.getClass(), "slideScore", -104580530);
        setIntField(term3989281, term3989281.getClass(), "breakScore", 251783751);
        setIntField(term3989281, term3989281.getClass(), "syncRate", 1035627260);
        setIntField(term3989281, term3989281.getClass(), "vsWin", -2133905836);
        setBooleanField(term3989281, term3989281.getClass(), "isAllPerfect", true);
        setIntField(term3989281, term3989281.getClass(), "fullCombo", -1085466008);
        setIntField(term3989281, term3989281.getClass(), "maxFever", -422451149);
        setIntField(term3989281, term3989281.getClass(), "maxCombo", 1044511355);
        setIntField(term3989281, term3989281.getClass(), "tapPerfect", 1667320627);
        setIntField(term3989281, term3989281.getClass(), "tapGreat", -511368526);
        setIntField(term3989281, term3989281.getClass(), "tapGood", -645748376);
        setIntField(term3989281, term3989281.getClass(), "tapBad", -531921000);
        setIntField(term3989281, term3989281.getClass(), "holdPerfect", -1530062799);
        setIntField(term3989281, term3989281.getClass(), "holdGreat", -1946371103);
        setIntField(term3989281, term3989281.getClass(), "holdGood", 136398775);
        setIntField(term3989281, term3989281.getClass(), "holdBad", 1209696744);
        setIntField(term3989281, term3989281.getClass(), "slidePerfect", 1128780525);
        setIntField(term3989281, term3989281.getClass(), "slideGreat", 465958995);
        setIntField(term3989281, term3989281.getClass(), "slideGood", 816569545);
        setIntField(term3989281, term3989281.getClass(), "slideBad", -1235637465);
        setIntField(term3989281, term3989281.getClass(), "breakPerfect", 1335234772);
        setIntField(term3989281, term3989281.getClass(), "breakGreat", 1356929688);
        setIntField(term3989281, term3989281.getClass(), "breakGood", -1278123952);
        setIntField(term3989281, term3989281.getClass(), "breakBad", 1281321817);
        setBooleanField(term3989281, term3989281.getClass(), "isTrackSkip", false);
        setBooleanField(term3989281, term3989281.getClass(), "isHighScore", true);
        setBooleanField(term3989281, term3989281.getClass(), "isChallengeTrack", false);
        setIntField(term3989281, term3989281.getClass(), "challengeLife", -1427379601);
        setIntField(term3989281, term3989281.getClass(), "challengeRemain", 1460437044);
        setIntField(term3989281, term3989281.getClass(), "isAllPerfectPlus", -2028685954);
        term3989593 = new Integer(-1574911183);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3989593;
        callMethod(klass, "setHoldGood", argTypes, term3989281, args);
    }

};


