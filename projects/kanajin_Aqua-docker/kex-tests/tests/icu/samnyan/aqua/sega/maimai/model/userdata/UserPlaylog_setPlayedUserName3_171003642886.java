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

public class UserPlaylog_setPlayedUserName3_171003642886 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term153415;

    public UserPlaylog_setPlayedUserName3_171003642886() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term153421 = new Long(-2195794659127490022L);
        term153415 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term153417 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term153419 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term153435 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term153436 = newInstance(Class.forName("java.time.LocalDate"));
        Object term153440 = newInstance(Class.forName("java.time.LocalTime"));
        Object term153445 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term153446 = newInstance(Class.forName("java.time.LocalDate"));
        Object term153450 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term153415, term153415.getClass(), "id", -5620682754269520333L);
        setLongField(term153417, term153417.getClass(), "id", 9215348305313170099L);
        setLongField(term153419, term153419.getClass(), "id", -785087035950801971L);
        setField(term153419, term153419.getClass(), "extId", term153421);
        setField(term153419, term153419.getClass(), "luid", "ImAEcQhwQN");
        setIntField(term153436, term153436.getClass(), "year", 2010);
        setShortField(term153436, term153436.getClass(), "month", (short) 5);
        setShortField(term153436, term153436.getClass(), "day", (short) 18);
        setField(term153435, term153435.getClass(), "date", term153436);
        setByteField(term153440, term153440.getClass(), "hour", (byte) 8);
        setByteField(term153440, term153440.getClass(), "minute", (byte) 4);
        setByteField(term153440, term153440.getClass(), "second", (byte) 37);
        setIntField(term153440, term153440.getClass(), "nano", 896333553);
        setField(term153435, term153435.getClass(), "time", term153440);
        setField(term153419, term153419.getClass(), "registerTime", term153435);
        setIntField(term153446, term153446.getClass(), "year", 2011);
        setShortField(term153446, term153446.getClass(), "month", (short) 9);
        setShortField(term153446, term153446.getClass(), "day", (short) 17);
        setField(term153445, term153445.getClass(), "date", term153446);
        setByteField(term153450, term153450.getClass(), "hour", (byte) 16);
        setByteField(term153450, term153450.getClass(), "minute", (byte) 37);
        setByteField(term153450, term153450.getClass(), "second", (byte) 45);
        setIntField(term153450, term153450.getClass(), "nano", 117475194);
        setField(term153445, term153445.getClass(), "time", term153450);
        setField(term153419, term153419.getClass(), "accessTime", term153445);
        setField(term153417, term153417.getClass(), "card", term153419);
        setIntField(term153417, term153417.getClass(), "lastDataVersion", -1062938954);
        setField(term153417, term153417.getClass(), "userName", "bBtEXrbQOO");
        setIntField(term153417, term153417.getClass(), "point", 1932457353);
        setIntField(term153417, term153417.getClass(), "totalPoint", 399973707);
        setIntField(term153417, term153417.getClass(), "iconId", -1002465553);
        setIntField(term153417, term153417.getClass(), "nameplateId", -508611347);
        setIntField(term153417, term153417.getClass(), "frameId", 391339380);
        setIntField(term153417, term153417.getClass(), "trophyId", -444695734);
        setIntField(term153417, term153417.getClass(), "playCount", 1274208211);
        setIntField(term153417, term153417.getClass(), "playVsCount", -1365124631);
        setIntField(term153417, term153417.getClass(), "playSyncCount", -1170848518);
        setIntField(term153417, term153417.getClass(), "winCount", -571438099);
        setIntField(term153417, term153417.getClass(), "helpCount", 1764437317);
        setIntField(term153417, term153417.getClass(), "comboCount", -202316601);
        setIntField(term153417, term153417.getClass(), "feverCount", -153489748);
        setIntField(term153417, term153417.getClass(), "totalHiScore", 1563212317);
        setIntField(term153417, term153417.getClass(), "totalEasyHighScore", 2134961278);
        setIntField(term153417, term153417.getClass(), "totalBasicHighScore", 1371525227);
        setIntField(term153417, term153417.getClass(), "totalAdvancedHighScore", -38475882);
        setIntField(term153417, term153417.getClass(), "totalExpertHighScore", -2035496659);
        setIntField(term153417, term153417.getClass(), "totalMasterHighScore", 348123695);
        setIntField(term153417, term153417.getClass(), "totalReMasterHighScore", -1064541551);
        setIntField(term153417, term153417.getClass(), "totalHighSync", 1656081092);
        setIntField(term153417, term153417.getClass(), "totalEasySync", 341289991);
        setIntField(term153417, term153417.getClass(), "totalBasicSync", -1709845599);
        setIntField(term153417, term153417.getClass(), "totalAdvancedSync", 850458658);
        setIntField(term153417, term153417.getClass(), "totalExpertSync", 666974472);
        setIntField(term153417, term153417.getClass(), "totalMasterSync", 1533942696);
        setIntField(term153417, term153417.getClass(), "totalReMasterSync", 1550462494);
        setIntField(term153417, term153417.getClass(), "playerRating", -758201656);
        setIntField(term153417, term153417.getClass(), "highestRating", -542045958);
        setIntField(term153417, term153417.getClass(), "rankAuthTailId", 872784077);
        setField(term153417, term153417.getClass(), "eventWatchedDate", "WZsnWyKyyP");
        setField(term153417, term153417.getClass(), "webLimitDate", "UmOVAGRRWa");
        setIntField(term153417, term153417.getClass(), "challengeTrackPhase", -1448509297);
        setIntField(term153417, term153417.getClass(), "firstPlayBits", -148517948);
        setField(term153417, term153417.getClass(), "lastPlayDate", "TmxjPyLcFT");
        setIntField(term153417, term153417.getClass(), "lastPlaceId", -792202432);
        setField(term153417, term153417.getClass(), "lastPlaceName", "BgvFipVgjI");
        setIntField(term153417, term153417.getClass(), "lastRegionId", 1472070894);
        setField(term153417, term153417.getClass(), "lastRegionName", "jwrtzwtiwQ");
        setField(term153417, term153417.getClass(), "lastClientId", "HyjgdbYLEd");
        setField(term153417, term153417.getClass(), "lastCountryCode", "ZNYPPLOMix");
        setIntField(term153417, term153417.getClass(), "eventPoint", -533628058);
        setIntField(term153417, term153417.getClass(), "totalLv", -68562946);
        setIntField(term153417, term153417.getClass(), "lastLoginBonusDay", 1660763919);
        setIntField(term153417, term153417.getClass(), "lastSurvivalBonusDay", -693608853);
        setIntField(term153417, term153417.getClass(), "loginBonusLv", 571992765);
        setField(term153415, term153415.getClass(), "user", term153417);
        setIntField(term153415, term153415.getClass(), "orderId", 1610631517);
        setLongField(term153415, term153415.getClass(), "sortNumber", 3850790119182839369L);
        setIntField(term153415, term153415.getClass(), "placeId", -1967639823);
        setField(term153415, term153415.getClass(), "placeName", "HnUeaoqlvY");
        setField(term153415, term153415.getClass(), "country", "QoDtuFsSzS");
        setIntField(term153415, term153415.getClass(), "regionId", -585749499);
        setField(term153415, term153415.getClass(), "playDate", "hlFZKpXZIY");
        setField(term153415, term153415.getClass(), "userPlayDate", "tRkHyXXipG");
        setIntField(term153415, term153415.getClass(), "musicId", -2014077249);
        setIntField(term153415, term153415.getClass(), "level", -645580455);
        setIntField(term153415, term153415.getClass(), "gameMode", -338997816);
        setIntField(term153415, term153415.getClass(), "rivalNum", 1434071951);
        setIntField(term153415, term153415.getClass(), "track", 2074146374);
        setIntField(term153415, term153415.getClass(), "eventId", -1757837107);
        setBooleanField(term153415, term153415.getClass(), "isFreeToPlay", false);
        setIntField(term153415, term153415.getClass(), "playerRating", 251366418);
        setLongField(term153415, term153415.getClass(), "playedUserId1", -405127137367295684L);
        setField(term153415, term153415.getClass(), "playedUserName1", "OAJdjKRfIM");
        setIntField(term153415, term153415.getClass(), "playedMusicLevel1", 233576420);
        setLongField(term153415, term153415.getClass(), "playedUserId2", 3093905091334313614L);
        setField(term153415, term153415.getClass(), "playedUserName2", "BvzAbMTwzf");
        setIntField(term153415, term153415.getClass(), "playedMusicLevel2", -1091440698);
        setLongField(term153415, term153415.getClass(), "playedUserId3", 6031696788173482309L);
        setField(term153415, term153415.getClass(), "playedUserName3", "fcmWxpNhDp");
        setIntField(term153415, term153415.getClass(), "playedMusicLevel3", -1831399151);
        setIntField(term153415, term153415.getClass(), "achievement", -1503642258);
        setIntField(term153415, term153415.getClass(), "score", 1014684187);
        setIntField(term153415, term153415.getClass(), "tapScore", 382985320);
        setIntField(term153415, term153415.getClass(), "holdScore", 326345288);
        setIntField(term153415, term153415.getClass(), "slideScore", -1230229922);
        setIntField(term153415, term153415.getClass(), "breakScore", 1200208377);
        setIntField(term153415, term153415.getClass(), "syncRate", -1888267911);
        setIntField(term153415, term153415.getClass(), "vsWin", 937270005);
        setBooleanField(term153415, term153415.getClass(), "isAllPerfect", false);
        setIntField(term153415, term153415.getClass(), "fullCombo", -986109363);
        setIntField(term153415, term153415.getClass(), "maxFever", 188098982);
        setIntField(term153415, term153415.getClass(), "maxCombo", 1669878789);
        setIntField(term153415, term153415.getClass(), "tapPerfect", 1550968020);
        setIntField(term153415, term153415.getClass(), "tapGreat", 1622874580);
        setIntField(term153415, term153415.getClass(), "tapGood", -646133596);
        setIntField(term153415, term153415.getClass(), "tapBad", 914143935);
        setIntField(term153415, term153415.getClass(), "holdPerfect", 1200909031);
        setIntField(term153415, term153415.getClass(), "holdGreat", 2098217272);
        setIntField(term153415, term153415.getClass(), "holdGood", -1010918916);
        setIntField(term153415, term153415.getClass(), "holdBad", 549900835);
        setIntField(term153415, term153415.getClass(), "slidePerfect", 1760648398);
        setIntField(term153415, term153415.getClass(), "slideGreat", -302488777);
        setIntField(term153415, term153415.getClass(), "slideGood", 1755769273);
        setIntField(term153415, term153415.getClass(), "slideBad", 98717406);
        setIntField(term153415, term153415.getClass(), "breakPerfect", -482421925);
        setIntField(term153415, term153415.getClass(), "breakGreat", -1730884605);
        setIntField(term153415, term153415.getClass(), "breakGood", 1283823002);
        setIntField(term153415, term153415.getClass(), "breakBad", 1845688941);
        setBooleanField(term153415, term153415.getClass(), "isTrackSkip", true);
        setBooleanField(term153415, term153415.getClass(), "isHighScore", true);
        setBooleanField(term153415, term153415.getClass(), "isChallengeTrack", true);
        setIntField(term153415, term153415.getClass(), "challengeLife", 597404261);
        setIntField(term153415, term153415.getClass(), "challengeRemain", -953186162);
        setIntField(term153415, term153415.getClass(), "isAllPerfectPlus", 1664658690);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "eAuqPLqmIz";
        callMethod(klass, "setPlayedUserName3", argTypes, term153415, args);
    }

};


