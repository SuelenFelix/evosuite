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

public class UserPlaylog_setHoldBad_19618261108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term163445;
     Object term163757;

    public UserPlaylog_setHoldBad_19618261108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term163451 = new Long(-3058119213533262883L);
        term163445 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term163447 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term163449 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term163465 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term163466 = newInstance(Class.forName("java.time.LocalDate"));
        Object term163470 = newInstance(Class.forName("java.time.LocalTime"));
        Object term163475 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term163476 = newInstance(Class.forName("java.time.LocalDate"));
        Object term163480 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term163445, term163445.getClass(), "id", 3856313132425831260L);
        setLongField(term163447, term163447.getClass(), "id", 4915114639652309312L);
        setLongField(term163449, term163449.getClass(), "id", 8639233526934323841L);
        setField(term163449, term163449.getClass(), "extId", term163451);
        setField(term163449, term163449.getClass(), "luid", "FXngdpZyuo");
        setIntField(term163466, term163466.getClass(), "year", 2020);
        setShortField(term163466, term163466.getClass(), "month", (short) 5);
        setShortField(term163466, term163466.getClass(), "day", (short) 12);
        setField(term163465, term163465.getClass(), "date", term163466);
        setByteField(term163470, term163470.getClass(), "hour", (byte) 13);
        setByteField(term163470, term163470.getClass(), "minute", (byte) 11);
        setByteField(term163470, term163470.getClass(), "second", (byte) 59);
        setIntField(term163470, term163470.getClass(), "nano", 36534511);
        setField(term163465, term163465.getClass(), "time", term163470);
        setField(term163449, term163449.getClass(), "registerTime", term163465);
        setIntField(term163476, term163476.getClass(), "year", 2012);
        setShortField(term163476, term163476.getClass(), "month", (short) 8);
        setShortField(term163476, term163476.getClass(), "day", (short) 29);
        setField(term163475, term163475.getClass(), "date", term163476);
        setByteField(term163480, term163480.getClass(), "hour", (byte) 18);
        setByteField(term163480, term163480.getClass(), "minute", (byte) 51);
        setByteField(term163480, term163480.getClass(), "second", (byte) 22);
        setIntField(term163480, term163480.getClass(), "nano", 659205197);
        setField(term163475, term163475.getClass(), "time", term163480);
        setField(term163449, term163449.getClass(), "accessTime", term163475);
        setField(term163447, term163447.getClass(), "card", term163449);
        setIntField(term163447, term163447.getClass(), "lastDataVersion", 630125092);
        setField(term163447, term163447.getClass(), "userName", "DTerqIWqcp");
        setIntField(term163447, term163447.getClass(), "point", -2083378694);
        setIntField(term163447, term163447.getClass(), "totalPoint", 1239933976);
        setIntField(term163447, term163447.getClass(), "iconId", -1554633398);
        setIntField(term163447, term163447.getClass(), "nameplateId", 1690600247);
        setIntField(term163447, term163447.getClass(), "frameId", -1197557816);
        setIntField(term163447, term163447.getClass(), "trophyId", 870745222);
        setIntField(term163447, term163447.getClass(), "playCount", -971717999);
        setIntField(term163447, term163447.getClass(), "playVsCount", 1154969193);
        setIntField(term163447, term163447.getClass(), "playSyncCount", -278262913);
        setIntField(term163447, term163447.getClass(), "winCount", -1747516472);
        setIntField(term163447, term163447.getClass(), "helpCount", 698742025);
        setIntField(term163447, term163447.getClass(), "comboCount", 985694184);
        setIntField(term163447, term163447.getClass(), "feverCount", -1683496665);
        setIntField(term163447, term163447.getClass(), "totalHiScore", -1003323784);
        setIntField(term163447, term163447.getClass(), "totalEasyHighScore", 268939325);
        setIntField(term163447, term163447.getClass(), "totalBasicHighScore", -542512468);
        setIntField(term163447, term163447.getClass(), "totalAdvancedHighScore", -983909603);
        setIntField(term163447, term163447.getClass(), "totalExpertHighScore", 1903231334);
        setIntField(term163447, term163447.getClass(), "totalMasterHighScore", 1121884055);
        setIntField(term163447, term163447.getClass(), "totalReMasterHighScore", -1842829912);
        setIntField(term163447, term163447.getClass(), "totalHighSync", 1009600826);
        setIntField(term163447, term163447.getClass(), "totalEasySync", -1548432397);
        setIntField(term163447, term163447.getClass(), "totalBasicSync", 73972775);
        setIntField(term163447, term163447.getClass(), "totalAdvancedSync", -1517164483);
        setIntField(term163447, term163447.getClass(), "totalExpertSync", -543646157);
        setIntField(term163447, term163447.getClass(), "totalMasterSync", -1489575010);
        setIntField(term163447, term163447.getClass(), "totalReMasterSync", 2059365027);
        setIntField(term163447, term163447.getClass(), "playerRating", -1882752529);
        setIntField(term163447, term163447.getClass(), "highestRating", 1080940354);
        setIntField(term163447, term163447.getClass(), "rankAuthTailId", 1202769119);
        setField(term163447, term163447.getClass(), "eventWatchedDate", "fpCIxbJMhb");
        setField(term163447, term163447.getClass(), "webLimitDate", "CpdmHeeJjh");
        setIntField(term163447, term163447.getClass(), "challengeTrackPhase", 2136561070);
        setIntField(term163447, term163447.getClass(), "firstPlayBits", 609012058);
        setField(term163447, term163447.getClass(), "lastPlayDate", "hKmPOZlKjI");
        setIntField(term163447, term163447.getClass(), "lastPlaceId", 2086672902);
        setField(term163447, term163447.getClass(), "lastPlaceName", "cTCkotLNPq");
        setIntField(term163447, term163447.getClass(), "lastRegionId", 174619955);
        setField(term163447, term163447.getClass(), "lastRegionName", "VhQqTFwKnM");
        setField(term163447, term163447.getClass(), "lastClientId", "WCbIcScYSo");
        setField(term163447, term163447.getClass(), "lastCountryCode", "sAQCrZMYTg");
        setIntField(term163447, term163447.getClass(), "eventPoint", -1810980771);
        setIntField(term163447, term163447.getClass(), "totalLv", -1306395034);
        setIntField(term163447, term163447.getClass(), "lastLoginBonusDay", -1500115801);
        setIntField(term163447, term163447.getClass(), "lastSurvivalBonusDay", 1598085752);
        setIntField(term163447, term163447.getClass(), "loginBonusLv", -755725066);
        setField(term163445, term163445.getClass(), "user", term163447);
        setIntField(term163445, term163445.getClass(), "orderId", -1744733255);
        setLongField(term163445, term163445.getClass(), "sortNumber", 1837377990745487524L);
        setIntField(term163445, term163445.getClass(), "placeId", 387460157);
        setField(term163445, term163445.getClass(), "placeName", "mAdGuGUmMs");
        setField(term163445, term163445.getClass(), "country", "ZrdXdCxwDU");
        setIntField(term163445, term163445.getClass(), "regionId", -259892358);
        setField(term163445, term163445.getClass(), "playDate", "FhewVVfjkr");
        setField(term163445, term163445.getClass(), "userPlayDate", "jpTElJfbPa");
        setIntField(term163445, term163445.getClass(), "musicId", -2021731334);
        setIntField(term163445, term163445.getClass(), "level", 460292973);
        setIntField(term163445, term163445.getClass(), "gameMode", -127687310);
        setIntField(term163445, term163445.getClass(), "rivalNum", -936075827);
        setIntField(term163445, term163445.getClass(), "track", -1984895131);
        setIntField(term163445, term163445.getClass(), "eventId", 2043867906);
        setBooleanField(term163445, term163445.getClass(), "isFreeToPlay", false);
        setIntField(term163445, term163445.getClass(), "playerRating", -1530948763);
        setLongField(term163445, term163445.getClass(), "playedUserId1", 7253514194157710276L);
        setField(term163445, term163445.getClass(), "playedUserName1", "iJIxuKpvyK");
        setIntField(term163445, term163445.getClass(), "playedMusicLevel1", 1444611292);
        setLongField(term163445, term163445.getClass(), "playedUserId2", -4401374981717945185L);
        setField(term163445, term163445.getClass(), "playedUserName2", "lbevHCeIaq");
        setIntField(term163445, term163445.getClass(), "playedMusicLevel2", -1073109453);
        setLongField(term163445, term163445.getClass(), "playedUserId3", -5673034399804562712L);
        setField(term163445, term163445.getClass(), "playedUserName3", "SfNhJpAvgC");
        setIntField(term163445, term163445.getClass(), "playedMusicLevel3", -221689194);
        setIntField(term163445, term163445.getClass(), "achievement", 1181534417);
        setIntField(term163445, term163445.getClass(), "score", 938718786);
        setIntField(term163445, term163445.getClass(), "tapScore", 1853375526);
        setIntField(term163445, term163445.getClass(), "holdScore", 257389395);
        setIntField(term163445, term163445.getClass(), "slideScore", -2069461138);
        setIntField(term163445, term163445.getClass(), "breakScore", 1337558872);
        setIntField(term163445, term163445.getClass(), "syncRate", 1213295046);
        setIntField(term163445, term163445.getClass(), "vsWin", 2109471016);
        setBooleanField(term163445, term163445.getClass(), "isAllPerfect", true);
        setIntField(term163445, term163445.getClass(), "fullCombo", 1173146006);
        setIntField(term163445, term163445.getClass(), "maxFever", 1453240334);
        setIntField(term163445, term163445.getClass(), "maxCombo", -181940055);
        setIntField(term163445, term163445.getClass(), "tapPerfect", 1153346490);
        setIntField(term163445, term163445.getClass(), "tapGreat", 209125932);
        setIntField(term163445, term163445.getClass(), "tapGood", -260090114);
        setIntField(term163445, term163445.getClass(), "tapBad", -1126440972);
        setIntField(term163445, term163445.getClass(), "holdPerfect", -828056931);
        setIntField(term163445, term163445.getClass(), "holdGreat", -1506249031);
        setIntField(term163445, term163445.getClass(), "holdGood", -672642370);
        setIntField(term163445, term163445.getClass(), "holdBad", 40504609);
        setIntField(term163445, term163445.getClass(), "slidePerfect", -894394178);
        setIntField(term163445, term163445.getClass(), "slideGreat", -1261594665);
        setIntField(term163445, term163445.getClass(), "slideGood", 801078389);
        setIntField(term163445, term163445.getClass(), "slideBad", -1086847742);
        setIntField(term163445, term163445.getClass(), "breakPerfect", 1199895332);
        setIntField(term163445, term163445.getClass(), "breakGreat", 1966865362);
        setIntField(term163445, term163445.getClass(), "breakGood", 1382092720);
        setIntField(term163445, term163445.getClass(), "breakBad", 1042080004);
        setBooleanField(term163445, term163445.getClass(), "isTrackSkip", true);
        setBooleanField(term163445, term163445.getClass(), "isHighScore", false);
        setBooleanField(term163445, term163445.getClass(), "isChallengeTrack", true);
        setIntField(term163445, term163445.getClass(), "challengeLife", -936417577);
        setIntField(term163445, term163445.getClass(), "challengeRemain", -1847271541);
        setIntField(term163445, term163445.getClass(), "isAllPerfectPlus", -1612901514);
        term163757 = new Integer(1449192632);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term163757;
        callMethod(klass, "setHoldBad", argTypes, term163445, args);
    }

};


