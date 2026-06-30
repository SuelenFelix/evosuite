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

public class UserPlaylog_setPlayedUserId3_86996075985 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term152941;
     Object term153253;

    public UserPlaylog_setPlayedUserId3_86996075985() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term152947 = new Long(2990264647913003810L);
        term152941 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term152943 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term152945 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term152961 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term152962 = newInstance(Class.forName("java.time.LocalDate"));
        Object term152966 = newInstance(Class.forName("java.time.LocalTime"));
        Object term152971 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term152972 = newInstance(Class.forName("java.time.LocalDate"));
        Object term152976 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term152941, term152941.getClass(), "id", 7850317217678882393L);
        setLongField(term152943, term152943.getClass(), "id", -166310229318189286L);
        setLongField(term152945, term152945.getClass(), "id", 1735840139746449096L);
        setField(term152945, term152945.getClass(), "extId", term152947);
        setField(term152945, term152945.getClass(), "luid", "guEINAQxpo");
        setIntField(term152962, term152962.getClass(), "year", 2012);
        setShortField(term152962, term152962.getClass(), "month", (short) 6);
        setShortField(term152962, term152962.getClass(), "day", (short) 1);
        setField(term152961, term152961.getClass(), "date", term152962);
        setByteField(term152966, term152966.getClass(), "hour", (byte) 14);
        setByteField(term152966, term152966.getClass(), "minute", (byte) 57);
        setByteField(term152966, term152966.getClass(), "second", (byte) 0);
        setIntField(term152966, term152966.getClass(), "nano", 965303069);
        setField(term152961, term152961.getClass(), "time", term152966);
        setField(term152945, term152945.getClass(), "registerTime", term152961);
        setIntField(term152972, term152972.getClass(), "year", 2027);
        setShortField(term152972, term152972.getClass(), "month", (short) 1);
        setShortField(term152972, term152972.getClass(), "day", (short) 31);
        setField(term152971, term152971.getClass(), "date", term152972);
        setByteField(term152976, term152976.getClass(), "hour", (byte) 16);
        setByteField(term152976, term152976.getClass(), "minute", (byte) 7);
        setByteField(term152976, term152976.getClass(), "second", (byte) 38);
        setIntField(term152976, term152976.getClass(), "nano", 713069905);
        setField(term152971, term152971.getClass(), "time", term152976);
        setField(term152945, term152945.getClass(), "accessTime", term152971);
        setField(term152943, term152943.getClass(), "card", term152945);
        setIntField(term152943, term152943.getClass(), "lastDataVersion", -437204927);
        setField(term152943, term152943.getClass(), "userName", "SxRLZbHkvS");
        setIntField(term152943, term152943.getClass(), "point", -92896812);
        setIntField(term152943, term152943.getClass(), "totalPoint", -1870054138);
        setIntField(term152943, term152943.getClass(), "iconId", -1417253764);
        setIntField(term152943, term152943.getClass(), "nameplateId", 721738065);
        setIntField(term152943, term152943.getClass(), "frameId", 462609120);
        setIntField(term152943, term152943.getClass(), "trophyId", 171730946);
        setIntField(term152943, term152943.getClass(), "playCount", -575803963);
        setIntField(term152943, term152943.getClass(), "playVsCount", 1406908575);
        setIntField(term152943, term152943.getClass(), "playSyncCount", 1567357010);
        setIntField(term152943, term152943.getClass(), "winCount", -1346132487);
        setIntField(term152943, term152943.getClass(), "helpCount", 528169923);
        setIntField(term152943, term152943.getClass(), "comboCount", -1780676124);
        setIntField(term152943, term152943.getClass(), "feverCount", 1415646409);
        setIntField(term152943, term152943.getClass(), "totalHiScore", -1394611666);
        setIntField(term152943, term152943.getClass(), "totalEasyHighScore", 881835921);
        setIntField(term152943, term152943.getClass(), "totalBasicHighScore", -740119740);
        setIntField(term152943, term152943.getClass(), "totalAdvancedHighScore", -1903635771);
        setIntField(term152943, term152943.getClass(), "totalExpertHighScore", -74698971);
        setIntField(term152943, term152943.getClass(), "totalMasterHighScore", 911900418);
        setIntField(term152943, term152943.getClass(), "totalReMasterHighScore", 414452623);
        setIntField(term152943, term152943.getClass(), "totalHighSync", 140926878);
        setIntField(term152943, term152943.getClass(), "totalEasySync", -1686994806);
        setIntField(term152943, term152943.getClass(), "totalBasicSync", 771762864);
        setIntField(term152943, term152943.getClass(), "totalAdvancedSync", -303423293);
        setIntField(term152943, term152943.getClass(), "totalExpertSync", -1255951945);
        setIntField(term152943, term152943.getClass(), "totalMasterSync", 1586315089);
        setIntField(term152943, term152943.getClass(), "totalReMasterSync", 560822613);
        setIntField(term152943, term152943.getClass(), "playerRating", 1950204629);
        setIntField(term152943, term152943.getClass(), "highestRating", -500535821);
        setIntField(term152943, term152943.getClass(), "rankAuthTailId", -900332514);
        setField(term152943, term152943.getClass(), "eventWatchedDate", "HtiqQJqDeX");
        setField(term152943, term152943.getClass(), "webLimitDate", "tqDmiYDfPG");
        setIntField(term152943, term152943.getClass(), "challengeTrackPhase", 2145608792);
        setIntField(term152943, term152943.getClass(), "firstPlayBits", -904237392);
        setField(term152943, term152943.getClass(), "lastPlayDate", "NIFTrWKaFV");
        setIntField(term152943, term152943.getClass(), "lastPlaceId", -24739736);
        setField(term152943, term152943.getClass(), "lastPlaceName", "fczMoiWIlg");
        setIntField(term152943, term152943.getClass(), "lastRegionId", -686439450);
        setField(term152943, term152943.getClass(), "lastRegionName", "FLDFVNZCaf");
        setField(term152943, term152943.getClass(), "lastClientId", "RatdSkwnHJ");
        setField(term152943, term152943.getClass(), "lastCountryCode", "oseqzeIHdW");
        setIntField(term152943, term152943.getClass(), "eventPoint", -1758324309);
        setIntField(term152943, term152943.getClass(), "totalLv", -1301564035);
        setIntField(term152943, term152943.getClass(), "lastLoginBonusDay", -1123707822);
        setIntField(term152943, term152943.getClass(), "lastSurvivalBonusDay", -369091883);
        setIntField(term152943, term152943.getClass(), "loginBonusLv", 1490073299);
        setField(term152941, term152941.getClass(), "user", term152943);
        setIntField(term152941, term152941.getClass(), "orderId", -1606689755);
        setLongField(term152941, term152941.getClass(), "sortNumber", 2159730973728155805L);
        setIntField(term152941, term152941.getClass(), "placeId", 264345418);
        setField(term152941, term152941.getClass(), "placeName", "ByJOYpCmFi");
        setField(term152941, term152941.getClass(), "country", "PdnAkNWoHq");
        setIntField(term152941, term152941.getClass(), "regionId", 1828577650);
        setField(term152941, term152941.getClass(), "playDate", "lQITAtdMxP");
        setField(term152941, term152941.getClass(), "userPlayDate", "OXJdVKkuub");
        setIntField(term152941, term152941.getClass(), "musicId", -1303568057);
        setIntField(term152941, term152941.getClass(), "level", 538865427);
        setIntField(term152941, term152941.getClass(), "gameMode", -67912777);
        setIntField(term152941, term152941.getClass(), "rivalNum", 1856598016);
        setIntField(term152941, term152941.getClass(), "track", 678465534);
        setIntField(term152941, term152941.getClass(), "eventId", -422982082);
        setBooleanField(term152941, term152941.getClass(), "isFreeToPlay", true);
        setIntField(term152941, term152941.getClass(), "playerRating", 1355853444);
        setLongField(term152941, term152941.getClass(), "playedUserId1", -1486135171566437695L);
        setField(term152941, term152941.getClass(), "playedUserName1", "uMRcoxIazP");
        setIntField(term152941, term152941.getClass(), "playedMusicLevel1", -264162265);
        setLongField(term152941, term152941.getClass(), "playedUserId2", 5383609177501042021L);
        setField(term152941, term152941.getClass(), "playedUserName2", "JskWlUhLMp");
        setIntField(term152941, term152941.getClass(), "playedMusicLevel2", 623548995);
        setLongField(term152941, term152941.getClass(), "playedUserId3", 2779814845687231848L);
        setField(term152941, term152941.getClass(), "playedUserName3", "IxZRiNpvbq");
        setIntField(term152941, term152941.getClass(), "playedMusicLevel3", -1326516890);
        setIntField(term152941, term152941.getClass(), "achievement", 1795552275);
        setIntField(term152941, term152941.getClass(), "score", 209419475);
        setIntField(term152941, term152941.getClass(), "tapScore", 1998446539);
        setIntField(term152941, term152941.getClass(), "holdScore", 999228573);
        setIntField(term152941, term152941.getClass(), "slideScore", 461086833);
        setIntField(term152941, term152941.getClass(), "breakScore", 728801372);
        setIntField(term152941, term152941.getClass(), "syncRate", 734436872);
        setIntField(term152941, term152941.getClass(), "vsWin", 1375882504);
        setBooleanField(term152941, term152941.getClass(), "isAllPerfect", false);
        setIntField(term152941, term152941.getClass(), "fullCombo", -1300439350);
        setIntField(term152941, term152941.getClass(), "maxFever", -1551965977);
        setIntField(term152941, term152941.getClass(), "maxCombo", 333760191);
        setIntField(term152941, term152941.getClass(), "tapPerfect", -1478695450);
        setIntField(term152941, term152941.getClass(), "tapGreat", -73597922);
        setIntField(term152941, term152941.getClass(), "tapGood", -1218596085);
        setIntField(term152941, term152941.getClass(), "tapBad", -1705481256);
        setIntField(term152941, term152941.getClass(), "holdPerfect", -1659302446);
        setIntField(term152941, term152941.getClass(), "holdGreat", 2044062004);
        setIntField(term152941, term152941.getClass(), "holdGood", -53720393);
        setIntField(term152941, term152941.getClass(), "holdBad", -382167948);
        setIntField(term152941, term152941.getClass(), "slidePerfect", 1387256900);
        setIntField(term152941, term152941.getClass(), "slideGreat", 2042128335);
        setIntField(term152941, term152941.getClass(), "slideGood", 664900178);
        setIntField(term152941, term152941.getClass(), "slideBad", -992358587);
        setIntField(term152941, term152941.getClass(), "breakPerfect", -1857222819);
        setIntField(term152941, term152941.getClass(), "breakGreat", 408246047);
        setIntField(term152941, term152941.getClass(), "breakGood", -1463685085);
        setIntField(term152941, term152941.getClass(), "breakBad", -1174727143);
        setBooleanField(term152941, term152941.getClass(), "isTrackSkip", true);
        setBooleanField(term152941, term152941.getClass(), "isHighScore", false);
        setBooleanField(term152941, term152941.getClass(), "isChallengeTrack", true);
        setIntField(term152941, term152941.getClass(), "challengeLife", -346897949);
        setIntField(term152941, term152941.getClass(), "challengeRemain", 1544213370);
        setIntField(term152941, term152941.getClass(), "isAllPerfectPlus", -639533582);
        term153253 = new Long(-6273351477363617569L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term153253;
        callMethod(klass, "setPlayedUserId3", argTypes, term152941, args);
    }

};


