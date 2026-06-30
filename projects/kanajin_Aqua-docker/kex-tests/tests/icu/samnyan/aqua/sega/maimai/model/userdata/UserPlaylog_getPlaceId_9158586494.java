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

public class UserPlaylog_getPlaceId_9158586494 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114279;

    public UserPlaylog_getPlaceId_9158586494() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term114285 = new Long(7950532649535587877L);
        term114279 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term114281 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term114283 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term114299 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term114300 = newInstance(Class.forName("java.time.LocalDate"));
        Object term114304 = newInstance(Class.forName("java.time.LocalTime"));
        Object term114309 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term114310 = newInstance(Class.forName("java.time.LocalDate"));
        Object term114314 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term114279, term114279.getClass(), "id", -1348078265481224468L);
        setLongField(term114281, term114281.getClass(), "id", 7007517375697316368L);
        setLongField(term114283, term114283.getClass(), "id", 8485924987529500210L);
        setField(term114283, term114283.getClass(), "extId", term114285);
        setField(term114283, term114283.getClass(), "luid", "fmFvklptLM");
        setIntField(term114300, term114300.getClass(), "year", 2016);
        setShortField(term114300, term114300.getClass(), "month", (short) 12);
        setShortField(term114300, term114300.getClass(), "day", (short) 23);
        setField(term114299, term114299.getClass(), "date", term114300);
        setByteField(term114304, term114304.getClass(), "hour", (byte) 13);
        setByteField(term114304, term114304.getClass(), "minute", (byte) 59);
        setByteField(term114304, term114304.getClass(), "second", (byte) 38);
        setIntField(term114304, term114304.getClass(), "nano", 70840095);
        setField(term114299, term114299.getClass(), "time", term114304);
        setField(term114283, term114283.getClass(), "registerTime", term114299);
        setIntField(term114310, term114310.getClass(), "year", 2029);
        setShortField(term114310, term114310.getClass(), "month", (short) 7);
        setShortField(term114310, term114310.getClass(), "day", (short) 14);
        setField(term114309, term114309.getClass(), "date", term114310);
        setByteField(term114314, term114314.getClass(), "hour", (byte) 23);
        setByteField(term114314, term114314.getClass(), "minute", (byte) 7);
        setByteField(term114314, term114314.getClass(), "second", (byte) 5);
        setIntField(term114314, term114314.getClass(), "nano", 909102915);
        setField(term114309, term114309.getClass(), "time", term114314);
        setField(term114283, term114283.getClass(), "accessTime", term114309);
        setField(term114281, term114281.getClass(), "card", term114283);
        setIntField(term114281, term114281.getClass(), "lastDataVersion", 1613820074);
        setField(term114281, term114281.getClass(), "userName", "CYfPHswxIT");
        setIntField(term114281, term114281.getClass(), "point", 434316238);
        setIntField(term114281, term114281.getClass(), "totalPoint", 1100995892);
        setIntField(term114281, term114281.getClass(), "iconId", 2043611175);
        setIntField(term114281, term114281.getClass(), "nameplateId", 645234038);
        setIntField(term114281, term114281.getClass(), "frameId", -1080336027);
        setIntField(term114281, term114281.getClass(), "trophyId", 707070705);
        setIntField(term114281, term114281.getClass(), "playCount", -1572025779);
        setIntField(term114281, term114281.getClass(), "playVsCount", -1700572838);
        setIntField(term114281, term114281.getClass(), "playSyncCount", 2113787021);
        setIntField(term114281, term114281.getClass(), "winCount", -1284796207);
        setIntField(term114281, term114281.getClass(), "helpCount", -864683352);
        setIntField(term114281, term114281.getClass(), "comboCount", -335374489);
        setIntField(term114281, term114281.getClass(), "feverCount", -1715333049);
        setIntField(term114281, term114281.getClass(), "totalHiScore", -246990874);
        setIntField(term114281, term114281.getClass(), "totalEasyHighScore", -49493427);
        setIntField(term114281, term114281.getClass(), "totalBasicHighScore", -746387656);
        setIntField(term114281, term114281.getClass(), "totalAdvancedHighScore", 236632672);
        setIntField(term114281, term114281.getClass(), "totalExpertHighScore", -1778786592);
        setIntField(term114281, term114281.getClass(), "totalMasterHighScore", 529851849);
        setIntField(term114281, term114281.getClass(), "totalReMasterHighScore", -32810393);
        setIntField(term114281, term114281.getClass(), "totalHighSync", 318797269);
        setIntField(term114281, term114281.getClass(), "totalEasySync", 1122053794);
        setIntField(term114281, term114281.getClass(), "totalBasicSync", 1089884193);
        setIntField(term114281, term114281.getClass(), "totalAdvancedSync", -1270471358);
        setIntField(term114281, term114281.getClass(), "totalExpertSync", 2014064499);
        setIntField(term114281, term114281.getClass(), "totalMasterSync", 796034065);
        setIntField(term114281, term114281.getClass(), "totalReMasterSync", 1682205203);
        setIntField(term114281, term114281.getClass(), "playerRating", -292092227);
        setIntField(term114281, term114281.getClass(), "highestRating", 971086014);
        setIntField(term114281, term114281.getClass(), "rankAuthTailId", 2016092974);
        setField(term114281, term114281.getClass(), "eventWatchedDate", "IDibKvfdDt");
        setField(term114281, term114281.getClass(), "webLimitDate", "sKLtBTAssF");
        setIntField(term114281, term114281.getClass(), "challengeTrackPhase", 1532471714);
        setIntField(term114281, term114281.getClass(), "firstPlayBits", 1327391659);
        setField(term114281, term114281.getClass(), "lastPlayDate", "ROGqSdboUf");
        setIntField(term114281, term114281.getClass(), "lastPlaceId", -68772589);
        setField(term114281, term114281.getClass(), "lastPlaceName", "NfGNgrTcyY");
        setIntField(term114281, term114281.getClass(), "lastRegionId", -1830287514);
        setField(term114281, term114281.getClass(), "lastRegionName", "uPuFIjvpsv");
        setField(term114281, term114281.getClass(), "lastClientId", "zNKHFvTvNQ");
        setField(term114281, term114281.getClass(), "lastCountryCode", "cyqgSKerVH");
        setIntField(term114281, term114281.getClass(), "eventPoint", 449627601);
        setIntField(term114281, term114281.getClass(), "totalLv", 2002854184);
        setIntField(term114281, term114281.getClass(), "lastLoginBonusDay", -1390281456);
        setIntField(term114281, term114281.getClass(), "lastSurvivalBonusDay", 2038031656);
        setIntField(term114281, term114281.getClass(), "loginBonusLv", -1595647314);
        setField(term114279, term114279.getClass(), "user", term114281);
        setIntField(term114279, term114279.getClass(), "orderId", -292744614);
        setLongField(term114279, term114279.getClass(), "sortNumber", 1397546230296552361L);
        setIntField(term114279, term114279.getClass(), "placeId", 1205713971);
        setField(term114279, term114279.getClass(), "placeName", "KMFbAPDgQN");
        setField(term114279, term114279.getClass(), "country", "pOXTylvole");
        setIntField(term114279, term114279.getClass(), "regionId", 2071933112);
        setField(term114279, term114279.getClass(), "playDate", "kfguTpQAqI");
        setField(term114279, term114279.getClass(), "userPlayDate", "YcPukufpJs");
        setIntField(term114279, term114279.getClass(), "musicId", 1424640401);
        setIntField(term114279, term114279.getClass(), "level", 1470762328);
        setIntField(term114279, term114279.getClass(), "gameMode", -430947135);
        setIntField(term114279, term114279.getClass(), "rivalNum", -824754622);
        setIntField(term114279, term114279.getClass(), "track", -511944283);
        setIntField(term114279, term114279.getClass(), "eventId", 1200806761);
        setBooleanField(term114279, term114279.getClass(), "isFreeToPlay", true);
        setIntField(term114279, term114279.getClass(), "playerRating", 223962600);
        setLongField(term114279, term114279.getClass(), "playedUserId1", 4531694455151993856L);
        setField(term114279, term114279.getClass(), "playedUserName1", "vvGshYKSpj");
        setIntField(term114279, term114279.getClass(), "playedMusicLevel1", -1348546766);
        setLongField(term114279, term114279.getClass(), "playedUserId2", 4543928187003669961L);
        setField(term114279, term114279.getClass(), "playedUserName2", "haqqYHJKqP");
        setIntField(term114279, term114279.getClass(), "playedMusicLevel2", -612639577);
        setLongField(term114279, term114279.getClass(), "playedUserId3", -1536013261126093321L);
        setField(term114279, term114279.getClass(), "playedUserName3", "pehbaguHxu");
        setIntField(term114279, term114279.getClass(), "playedMusicLevel3", 1351645297);
        setIntField(term114279, term114279.getClass(), "achievement", 797872167);
        setIntField(term114279, term114279.getClass(), "score", -1898471230);
        setIntField(term114279, term114279.getClass(), "tapScore", -236037138);
        setIntField(term114279, term114279.getClass(), "holdScore", 941970855);
        setIntField(term114279, term114279.getClass(), "slideScore", -928779283);
        setIntField(term114279, term114279.getClass(), "breakScore", -1495150636);
        setIntField(term114279, term114279.getClass(), "syncRate", 349016490);
        setIntField(term114279, term114279.getClass(), "vsWin", 440243083);
        setBooleanField(term114279, term114279.getClass(), "isAllPerfect", true);
        setIntField(term114279, term114279.getClass(), "fullCombo", -1309251968);
        setIntField(term114279, term114279.getClass(), "maxFever", -1744361983);
        setIntField(term114279, term114279.getClass(), "maxCombo", -1442368912);
        setIntField(term114279, term114279.getClass(), "tapPerfect", 114583319);
        setIntField(term114279, term114279.getClass(), "tapGreat", 1054093600);
        setIntField(term114279, term114279.getClass(), "tapGood", 180724721);
        setIntField(term114279, term114279.getClass(), "tapBad", -51295499);
        setIntField(term114279, term114279.getClass(), "holdPerfect", 1802378804);
        setIntField(term114279, term114279.getClass(), "holdGreat", 2019634795);
        setIntField(term114279, term114279.getClass(), "holdGood", -225977108);
        setIntField(term114279, term114279.getClass(), "holdBad", 226506265);
        setIntField(term114279, term114279.getClass(), "slidePerfect", 197752687);
        setIntField(term114279, term114279.getClass(), "slideGreat", 1205131779);
        setIntField(term114279, term114279.getClass(), "slideGood", -280037455);
        setIntField(term114279, term114279.getClass(), "slideBad", 2111270695);
        setIntField(term114279, term114279.getClass(), "breakPerfect", 337789164);
        setIntField(term114279, term114279.getClass(), "breakGreat", 949433965);
        setIntField(term114279, term114279.getClass(), "breakGood", -1866766202);
        setIntField(term114279, term114279.getClass(), "breakBad", -694238117);
        setBooleanField(term114279, term114279.getClass(), "isTrackSkip", false);
        setBooleanField(term114279, term114279.getClass(), "isHighScore", false);
        setBooleanField(term114279, term114279.getClass(), "isChallengeTrack", true);
        setIntField(term114279, term114279.getClass(), "challengeLife", -964005222);
        setIntField(term114279, term114279.getClass(), "challengeRemain", -1800688324);
        setIntField(term114279, term114279.getClass(), "isAllPerfectPlus", 1310636176);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlaceId", argTypes, term114279, args);
    }

};


