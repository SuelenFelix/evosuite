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

public class UserPlaylog_getBreakGreat_184751964752 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136935;

    public UserPlaylog_getBreakGreat_184751964752() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term136941 = new Long(3103198349031409063L);
        term136935 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term136937 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term136939 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term136955 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term136956 = newInstance(Class.forName("java.time.LocalDate"));
        Object term136960 = newInstance(Class.forName("java.time.LocalTime"));
        Object term136965 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term136966 = newInstance(Class.forName("java.time.LocalDate"));
        Object term136970 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term136935, term136935.getClass(), "id", -8838530728518114289L);
        setLongField(term136937, term136937.getClass(), "id", 8907204162812035128L);
        setLongField(term136939, term136939.getClass(), "id", -2749182704506228402L);
        setField(term136939, term136939.getClass(), "extId", term136941);
        setField(term136939, term136939.getClass(), "luid", "iUUqZhloeC");
        setIntField(term136956, term136956.getClass(), "year", 2010);
        setShortField(term136956, term136956.getClass(), "month", (short) 5);
        setShortField(term136956, term136956.getClass(), "day", (short) 14);
        setField(term136955, term136955.getClass(), "date", term136956);
        setByteField(term136960, term136960.getClass(), "hour", (byte) 17);
        setByteField(term136960, term136960.getClass(), "minute", (byte) 11);
        setByteField(term136960, term136960.getClass(), "second", (byte) 30);
        setIntField(term136960, term136960.getClass(), "nano", 641019384);
        setField(term136955, term136955.getClass(), "time", term136960);
        setField(term136939, term136939.getClass(), "registerTime", term136955);
        setIntField(term136966, term136966.getClass(), "year", 2022);
        setShortField(term136966, term136966.getClass(), "month", (short) 9);
        setShortField(term136966, term136966.getClass(), "day", (short) 6);
        setField(term136965, term136965.getClass(), "date", term136966);
        setByteField(term136970, term136970.getClass(), "hour", (byte) 0);
        setByteField(term136970, term136970.getClass(), "minute", (byte) 36);
        setByteField(term136970, term136970.getClass(), "second", (byte) 57);
        setIntField(term136970, term136970.getClass(), "nano", 623892951);
        setField(term136965, term136965.getClass(), "time", term136970);
        setField(term136939, term136939.getClass(), "accessTime", term136965);
        setField(term136937, term136937.getClass(), "card", term136939);
        setIntField(term136937, term136937.getClass(), "lastDataVersion", 1397267544);
        setField(term136937, term136937.getClass(), "userName", "HGSlDwqOUA");
        setIntField(term136937, term136937.getClass(), "point", -1603972719);
        setIntField(term136937, term136937.getClass(), "totalPoint", -1154654443);
        setIntField(term136937, term136937.getClass(), "iconId", 1645846345);
        setIntField(term136937, term136937.getClass(), "nameplateId", -803632373);
        setIntField(term136937, term136937.getClass(), "frameId", -725034951);
        setIntField(term136937, term136937.getClass(), "trophyId", 54566490);
        setIntField(term136937, term136937.getClass(), "playCount", -243245256);
        setIntField(term136937, term136937.getClass(), "playVsCount", 988657359);
        setIntField(term136937, term136937.getClass(), "playSyncCount", 1436654145);
        setIntField(term136937, term136937.getClass(), "winCount", 1776603374);
        setIntField(term136937, term136937.getClass(), "helpCount", -2105010810);
        setIntField(term136937, term136937.getClass(), "comboCount", 1181204338);
        setIntField(term136937, term136937.getClass(), "feverCount", 508081446);
        setIntField(term136937, term136937.getClass(), "totalHiScore", 376898409);
        setIntField(term136937, term136937.getClass(), "totalEasyHighScore", 1386885355);
        setIntField(term136937, term136937.getClass(), "totalBasicHighScore", -515424228);
        setIntField(term136937, term136937.getClass(), "totalAdvancedHighScore", -438220867);
        setIntField(term136937, term136937.getClass(), "totalExpertHighScore", 1698753362);
        setIntField(term136937, term136937.getClass(), "totalMasterHighScore", -2145373019);
        setIntField(term136937, term136937.getClass(), "totalReMasterHighScore", 401498563);
        setIntField(term136937, term136937.getClass(), "totalHighSync", -1044642405);
        setIntField(term136937, term136937.getClass(), "totalEasySync", 444235950);
        setIntField(term136937, term136937.getClass(), "totalBasicSync", 503125111);
        setIntField(term136937, term136937.getClass(), "totalAdvancedSync", -1215717148);
        setIntField(term136937, term136937.getClass(), "totalExpertSync", -1294590794);
        setIntField(term136937, term136937.getClass(), "totalMasterSync", -1898767144);
        setIntField(term136937, term136937.getClass(), "totalReMasterSync", -1615737612);
        setIntField(term136937, term136937.getClass(), "playerRating", -1929266577);
        setIntField(term136937, term136937.getClass(), "highestRating", -693218996);
        setIntField(term136937, term136937.getClass(), "rankAuthTailId", 1600991895);
        setField(term136937, term136937.getClass(), "eventWatchedDate", "snPorJFlwz");
        setField(term136937, term136937.getClass(), "webLimitDate", "xEnedKycxs");
        setIntField(term136937, term136937.getClass(), "challengeTrackPhase", -116605955);
        setIntField(term136937, term136937.getClass(), "firstPlayBits", 2146104322);
        setField(term136937, term136937.getClass(), "lastPlayDate", "prYsWiRHjA");
        setIntField(term136937, term136937.getClass(), "lastPlaceId", -2114620413);
        setField(term136937, term136937.getClass(), "lastPlaceName", "aQbBLDuBpT");
        setIntField(term136937, term136937.getClass(), "lastRegionId", 1985278829);
        setField(term136937, term136937.getClass(), "lastRegionName", "lUpbmUdjAa");
        setField(term136937, term136937.getClass(), "lastClientId", "KPnQVYAkIf");
        setField(term136937, term136937.getClass(), "lastCountryCode", "BrYcEZSDFU");
        setIntField(term136937, term136937.getClass(), "eventPoint", 314015111);
        setIntField(term136937, term136937.getClass(), "totalLv", -1121701030);
        setIntField(term136937, term136937.getClass(), "lastLoginBonusDay", -1941072303);
        setIntField(term136937, term136937.getClass(), "lastSurvivalBonusDay", 405501485);
        setIntField(term136937, term136937.getClass(), "loginBonusLv", 1227837601);
        setField(term136935, term136935.getClass(), "user", term136937);
        setIntField(term136935, term136935.getClass(), "orderId", -1995728635);
        setLongField(term136935, term136935.getClass(), "sortNumber", 6600785663926369589L);
        setIntField(term136935, term136935.getClass(), "placeId", -912416483);
        setField(term136935, term136935.getClass(), "placeName", "fXhQVbntXX");
        setField(term136935, term136935.getClass(), "country", "GdsYFhpAsv");
        setIntField(term136935, term136935.getClass(), "regionId", -1119538480);
        setField(term136935, term136935.getClass(), "playDate", "JyeOfYxCgA");
        setField(term136935, term136935.getClass(), "userPlayDate", "yICoZygmis");
        setIntField(term136935, term136935.getClass(), "musicId", 1097877685);
        setIntField(term136935, term136935.getClass(), "level", -44723620);
        setIntField(term136935, term136935.getClass(), "gameMode", 1035284902);
        setIntField(term136935, term136935.getClass(), "rivalNum", -1592531065);
        setIntField(term136935, term136935.getClass(), "track", -1555312883);
        setIntField(term136935, term136935.getClass(), "eventId", -168913232);
        setBooleanField(term136935, term136935.getClass(), "isFreeToPlay", true);
        setIntField(term136935, term136935.getClass(), "playerRating", 1280762019);
        setLongField(term136935, term136935.getClass(), "playedUserId1", -3301041159581643562L);
        setField(term136935, term136935.getClass(), "playedUserName1", "jkpqjRyuQn");
        setIntField(term136935, term136935.getClass(), "playedMusicLevel1", 1067531027);
        setLongField(term136935, term136935.getClass(), "playedUserId2", -1639557341378935663L);
        setField(term136935, term136935.getClass(), "playedUserName2", "VyUAUXqMnJ");
        setIntField(term136935, term136935.getClass(), "playedMusicLevel2", 837236889);
        setLongField(term136935, term136935.getClass(), "playedUserId3", 192472706552396960L);
        setField(term136935, term136935.getClass(), "playedUserName3", "kpIzuOxHoi");
        setIntField(term136935, term136935.getClass(), "playedMusicLevel3", 1109328835);
        setIntField(term136935, term136935.getClass(), "achievement", -1333962836);
        setIntField(term136935, term136935.getClass(), "score", 526430292);
        setIntField(term136935, term136935.getClass(), "tapScore", 1063744494);
        setIntField(term136935, term136935.getClass(), "holdScore", 111922554);
        setIntField(term136935, term136935.getClass(), "slideScore", -1273898792);
        setIntField(term136935, term136935.getClass(), "breakScore", -889929952);
        setIntField(term136935, term136935.getClass(), "syncRate", -711257198);
        setIntField(term136935, term136935.getClass(), "vsWin", 1109783759);
        setBooleanField(term136935, term136935.getClass(), "isAllPerfect", true);
        setIntField(term136935, term136935.getClass(), "fullCombo", 730930342);
        setIntField(term136935, term136935.getClass(), "maxFever", 1542202966);
        setIntField(term136935, term136935.getClass(), "maxCombo", -490456970);
        setIntField(term136935, term136935.getClass(), "tapPerfect", -247072244);
        setIntField(term136935, term136935.getClass(), "tapGreat", 2038802976);
        setIntField(term136935, term136935.getClass(), "tapGood", 1513737010);
        setIntField(term136935, term136935.getClass(), "tapBad", -877125437);
        setIntField(term136935, term136935.getClass(), "holdPerfect", 894418485);
        setIntField(term136935, term136935.getClass(), "holdGreat", 311233853);
        setIntField(term136935, term136935.getClass(), "holdGood", 2105194977);
        setIntField(term136935, term136935.getClass(), "holdBad", 2074238681);
        setIntField(term136935, term136935.getClass(), "slidePerfect", -1655797819);
        setIntField(term136935, term136935.getClass(), "slideGreat", 101683079);
        setIntField(term136935, term136935.getClass(), "slideGood", 1648565080);
        setIntField(term136935, term136935.getClass(), "slideBad", 840301715);
        setIntField(term136935, term136935.getClass(), "breakPerfect", -1010819427);
        setIntField(term136935, term136935.getClass(), "breakGreat", 942167805);
        setIntField(term136935, term136935.getClass(), "breakGood", -270257056);
        setIntField(term136935, term136935.getClass(), "breakBad", 972492496);
        setBooleanField(term136935, term136935.getClass(), "isTrackSkip", false);
        setBooleanField(term136935, term136935.getClass(), "isHighScore", true);
        setBooleanField(term136935, term136935.getClass(), "isChallengeTrack", false);
        setIntField(term136935, term136935.getClass(), "challengeLife", -2143210695);
        setIntField(term136935, term136935.getClass(), "challengeRemain", -1464463559);
        setIntField(term136935, term136935.getClass(), "isAllPerfectPlus", -1213545995);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBreakGreat", argTypes, term136935, args);
    }

};


