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

public class UserPlaylog_getBreakGood_201810636953 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137407;

    public UserPlaylog_getBreakGood_201810636953() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term137413 = new Long(753095050088595263L);
        term137407 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term137409 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term137411 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term137427 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term137428 = newInstance(Class.forName("java.time.LocalDate"));
        Object term137432 = newInstance(Class.forName("java.time.LocalTime"));
        Object term137437 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term137438 = newInstance(Class.forName("java.time.LocalDate"));
        Object term137442 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term137407, term137407.getClass(), "id", -3992275333926350693L);
        setLongField(term137409, term137409.getClass(), "id", -1639226758680988280L);
        setLongField(term137411, term137411.getClass(), "id", 7775145417632389147L);
        setField(term137411, term137411.getClass(), "extId", term137413);
        setField(term137411, term137411.getClass(), "luid", "HnyxpTbQyj");
        setIntField(term137428, term137428.getClass(), "year", 2014);
        setShortField(term137428, term137428.getClass(), "month", (short) 12);
        setShortField(term137428, term137428.getClass(), "day", (short) 12);
        setField(term137427, term137427.getClass(), "date", term137428);
        setByteField(term137432, term137432.getClass(), "hour", (byte) 8);
        setByteField(term137432, term137432.getClass(), "minute", (byte) 44);
        setByteField(term137432, term137432.getClass(), "second", (byte) 19);
        setIntField(term137432, term137432.getClass(), "nano", 16834354);
        setField(term137427, term137427.getClass(), "time", term137432);
        setField(term137411, term137411.getClass(), "registerTime", term137427);
        setIntField(term137438, term137438.getClass(), "year", 2012);
        setShortField(term137438, term137438.getClass(), "month", (short) 11);
        setShortField(term137438, term137438.getClass(), "day", (short) 5);
        setField(term137437, term137437.getClass(), "date", term137438);
        setByteField(term137442, term137442.getClass(), "hour", (byte) 16);
        setByteField(term137442, term137442.getClass(), "minute", (byte) 51);
        setByteField(term137442, term137442.getClass(), "second", (byte) 52);
        setIntField(term137442, term137442.getClass(), "nano", 794474514);
        setField(term137437, term137437.getClass(), "time", term137442);
        setField(term137411, term137411.getClass(), "accessTime", term137437);
        setField(term137409, term137409.getClass(), "card", term137411);
        setIntField(term137409, term137409.getClass(), "lastDataVersion", 1936424239);
        setField(term137409, term137409.getClass(), "userName", "jCoeBTGJOl");
        setIntField(term137409, term137409.getClass(), "point", 389842212);
        setIntField(term137409, term137409.getClass(), "totalPoint", 678068437);
        setIntField(term137409, term137409.getClass(), "iconId", 1454786257);
        setIntField(term137409, term137409.getClass(), "nameplateId", 1219101209);
        setIntField(term137409, term137409.getClass(), "frameId", -339641170);
        setIntField(term137409, term137409.getClass(), "trophyId", -1456358645);
        setIntField(term137409, term137409.getClass(), "playCount", -58778046);
        setIntField(term137409, term137409.getClass(), "playVsCount", -1653954813);
        setIntField(term137409, term137409.getClass(), "playSyncCount", 146680795);
        setIntField(term137409, term137409.getClass(), "winCount", 1102033819);
        setIntField(term137409, term137409.getClass(), "helpCount", -483760060);
        setIntField(term137409, term137409.getClass(), "comboCount", 1798062324);
        setIntField(term137409, term137409.getClass(), "feverCount", 1512303261);
        setIntField(term137409, term137409.getClass(), "totalHiScore", 2115862769);
        setIntField(term137409, term137409.getClass(), "totalEasyHighScore", 1361584843);
        setIntField(term137409, term137409.getClass(), "totalBasicHighScore", -1380535995);
        setIntField(term137409, term137409.getClass(), "totalAdvancedHighScore", 322765382);
        setIntField(term137409, term137409.getClass(), "totalExpertHighScore", -1849847162);
        setIntField(term137409, term137409.getClass(), "totalMasterHighScore", -964098977);
        setIntField(term137409, term137409.getClass(), "totalReMasterHighScore", -1418072409);
        setIntField(term137409, term137409.getClass(), "totalHighSync", -1460855753);
        setIntField(term137409, term137409.getClass(), "totalEasySync", -307197050);
        setIntField(term137409, term137409.getClass(), "totalBasicSync", 960424942);
        setIntField(term137409, term137409.getClass(), "totalAdvancedSync", 1894128234);
        setIntField(term137409, term137409.getClass(), "totalExpertSync", 201156573);
        setIntField(term137409, term137409.getClass(), "totalMasterSync", 308978610);
        setIntField(term137409, term137409.getClass(), "totalReMasterSync", -1017906723);
        setIntField(term137409, term137409.getClass(), "playerRating", -187095556);
        setIntField(term137409, term137409.getClass(), "highestRating", -1137660962);
        setIntField(term137409, term137409.getClass(), "rankAuthTailId", -1432112505);
        setField(term137409, term137409.getClass(), "eventWatchedDate", "RpcnPMoqQP");
        setField(term137409, term137409.getClass(), "webLimitDate", "rcSNzDRILu");
        setIntField(term137409, term137409.getClass(), "challengeTrackPhase", 1112647263);
        setIntField(term137409, term137409.getClass(), "firstPlayBits", 50515119);
        setField(term137409, term137409.getClass(), "lastPlayDate", "VAFzJeEFAQ");
        setIntField(term137409, term137409.getClass(), "lastPlaceId", -1612007794);
        setField(term137409, term137409.getClass(), "lastPlaceName", "yqhryWPaPb");
        setIntField(term137409, term137409.getClass(), "lastRegionId", 261769376);
        setField(term137409, term137409.getClass(), "lastRegionName", "TBvkESDYGc");
        setField(term137409, term137409.getClass(), "lastClientId", "xPXaeMXfJb");
        setField(term137409, term137409.getClass(), "lastCountryCode", "ujCcQbAWoz");
        setIntField(term137409, term137409.getClass(), "eventPoint", 282224906);
        setIntField(term137409, term137409.getClass(), "totalLv", -270015042);
        setIntField(term137409, term137409.getClass(), "lastLoginBonusDay", -1191583321);
        setIntField(term137409, term137409.getClass(), "lastSurvivalBonusDay", -786138280);
        setIntField(term137409, term137409.getClass(), "loginBonusLv", -3291737);
        setField(term137407, term137407.getClass(), "user", term137409);
        setIntField(term137407, term137407.getClass(), "orderId", -1120251247);
        setLongField(term137407, term137407.getClass(), "sortNumber", -3955029913626345204L);
        setIntField(term137407, term137407.getClass(), "placeId", 1019780409);
        setField(term137407, term137407.getClass(), "placeName", "gJKBShUpxP");
        setField(term137407, term137407.getClass(), "country", "AgLTAjLwXk");
        setIntField(term137407, term137407.getClass(), "regionId", 915359411);
        setField(term137407, term137407.getClass(), "playDate", "INoAjOhMEq");
        setField(term137407, term137407.getClass(), "userPlayDate", "HGacYAJJio");
        setIntField(term137407, term137407.getClass(), "musicId", -573058487);
        setIntField(term137407, term137407.getClass(), "level", -1261761217);
        setIntField(term137407, term137407.getClass(), "gameMode", -534235681);
        setIntField(term137407, term137407.getClass(), "rivalNum", -2114475651);
        setIntField(term137407, term137407.getClass(), "track", 1552583328);
        setIntField(term137407, term137407.getClass(), "eventId", 1622154069);
        setBooleanField(term137407, term137407.getClass(), "isFreeToPlay", false);
        setIntField(term137407, term137407.getClass(), "playerRating", 1548044851);
        setLongField(term137407, term137407.getClass(), "playedUserId1", -3095078124589583434L);
        setField(term137407, term137407.getClass(), "playedUserName1", "iUabaxtEPQ");
        setIntField(term137407, term137407.getClass(), "playedMusicLevel1", 215408563);
        setLongField(term137407, term137407.getClass(), "playedUserId2", -6245769757887186092L);
        setField(term137407, term137407.getClass(), "playedUserName2", "BeULrSYHKm");
        setIntField(term137407, term137407.getClass(), "playedMusicLevel2", -1059027826);
        setLongField(term137407, term137407.getClass(), "playedUserId3", -180231083568368234L);
        setField(term137407, term137407.getClass(), "playedUserName3", "nseWRZaaYe");
        setIntField(term137407, term137407.getClass(), "playedMusicLevel3", -258971435);
        setIntField(term137407, term137407.getClass(), "achievement", 376021891);
        setIntField(term137407, term137407.getClass(), "score", -1137877214);
        setIntField(term137407, term137407.getClass(), "tapScore", 397269499);
        setIntField(term137407, term137407.getClass(), "holdScore", -1700540543);
        setIntField(term137407, term137407.getClass(), "slideScore", 506881476);
        setIntField(term137407, term137407.getClass(), "breakScore", 1397652046);
        setIntField(term137407, term137407.getClass(), "syncRate", 1289575397);
        setIntField(term137407, term137407.getClass(), "vsWin", -350892455);
        setBooleanField(term137407, term137407.getClass(), "isAllPerfect", true);
        setIntField(term137407, term137407.getClass(), "fullCombo", 1362938566);
        setIntField(term137407, term137407.getClass(), "maxFever", -2146906732);
        setIntField(term137407, term137407.getClass(), "maxCombo", 2145739450);
        setIntField(term137407, term137407.getClass(), "tapPerfect", -1839352479);
        setIntField(term137407, term137407.getClass(), "tapGreat", -1098195799);
        setIntField(term137407, term137407.getClass(), "tapGood", 671472274);
        setIntField(term137407, term137407.getClass(), "tapBad", -750202903);
        setIntField(term137407, term137407.getClass(), "holdPerfect", 1929857446);
        setIntField(term137407, term137407.getClass(), "holdGreat", 1948574607);
        setIntField(term137407, term137407.getClass(), "holdGood", 939357638);
        setIntField(term137407, term137407.getClass(), "holdBad", 623776950);
        setIntField(term137407, term137407.getClass(), "slidePerfect", 227747203);
        setIntField(term137407, term137407.getClass(), "slideGreat", -1162118510);
        setIntField(term137407, term137407.getClass(), "slideGood", -1879053707);
        setIntField(term137407, term137407.getClass(), "slideBad", 358568525);
        setIntField(term137407, term137407.getClass(), "breakPerfect", 365320480);
        setIntField(term137407, term137407.getClass(), "breakGreat", -1535541256);
        setIntField(term137407, term137407.getClass(), "breakGood", 1591998669);
        setIntField(term137407, term137407.getClass(), "breakBad", 1185146650);
        setBooleanField(term137407, term137407.getClass(), "isTrackSkip", true);
        setBooleanField(term137407, term137407.getClass(), "isHighScore", true);
        setBooleanField(term137407, term137407.getClass(), "isChallengeTrack", true);
        setIntField(term137407, term137407.getClass(), "challengeLife", -600502469);
        setIntField(term137407, term137407.getClass(), "challengeRemain", 1774474405);
        setIntField(term137407, term137407.getClass(), "isAllPerfectPlus", 1880363597);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBreakGood", argTypes, term137407, args);
    }

};


