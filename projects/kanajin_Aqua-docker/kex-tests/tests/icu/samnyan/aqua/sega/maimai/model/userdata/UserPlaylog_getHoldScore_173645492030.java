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

public class UserPlaylog_getHoldScore_173645492030 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126551;

    public UserPlaylog_getHoldScore_173645492030() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term126557 = new Long(-7273680182770718108L);
        term126551 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term126553 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term126555 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term126571 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term126572 = newInstance(Class.forName("java.time.LocalDate"));
        Object term126576 = newInstance(Class.forName("java.time.LocalTime"));
        Object term126581 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term126582 = newInstance(Class.forName("java.time.LocalDate"));
        Object term126586 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term126551, term126551.getClass(), "id", -259683062954031772L);
        setLongField(term126553, term126553.getClass(), "id", 5446921500259357484L);
        setLongField(term126555, term126555.getClass(), "id", -2887572667974552998L);
        setField(term126555, term126555.getClass(), "extId", term126557);
        setField(term126555, term126555.getClass(), "luid", "kpNIadQEnq");
        setIntField(term126572, term126572.getClass(), "year", 2026);
        setShortField(term126572, term126572.getClass(), "month", (short) 6);
        setShortField(term126572, term126572.getClass(), "day", (short) 4);
        setField(term126571, term126571.getClass(), "date", term126572);
        setByteField(term126576, term126576.getClass(), "hour", (byte) 14);
        setByteField(term126576, term126576.getClass(), "minute", (byte) 13);
        setByteField(term126576, term126576.getClass(), "second", (byte) 32);
        setIntField(term126576, term126576.getClass(), "nano", 911119428);
        setField(term126571, term126571.getClass(), "time", term126576);
        setField(term126555, term126555.getClass(), "registerTime", term126571);
        setIntField(term126582, term126582.getClass(), "year", 2010);
        setShortField(term126582, term126582.getClass(), "month", (short) 3);
        setShortField(term126582, term126582.getClass(), "day", (short) 18);
        setField(term126581, term126581.getClass(), "date", term126582);
        setByteField(term126586, term126586.getClass(), "hour", (byte) 5);
        setByteField(term126586, term126586.getClass(), "minute", (byte) 31);
        setByteField(term126586, term126586.getClass(), "second", (byte) 55);
        setIntField(term126586, term126586.getClass(), "nano", 783578310);
        setField(term126581, term126581.getClass(), "time", term126586);
        setField(term126555, term126555.getClass(), "accessTime", term126581);
        setField(term126553, term126553.getClass(), "card", term126555);
        setIntField(term126553, term126553.getClass(), "lastDataVersion", 1053590471);
        setField(term126553, term126553.getClass(), "userName", "sLWXiUGWKR");
        setIntField(term126553, term126553.getClass(), "point", -1544521733);
        setIntField(term126553, term126553.getClass(), "totalPoint", -176176990);
        setIntField(term126553, term126553.getClass(), "iconId", -1107491810);
        setIntField(term126553, term126553.getClass(), "nameplateId", 369101566);
        setIntField(term126553, term126553.getClass(), "frameId", -1122407208);
        setIntField(term126553, term126553.getClass(), "trophyId", -1158696779);
        setIntField(term126553, term126553.getClass(), "playCount", 1628040716);
        setIntField(term126553, term126553.getClass(), "playVsCount", 630381282);
        setIntField(term126553, term126553.getClass(), "playSyncCount", -467147197);
        setIntField(term126553, term126553.getClass(), "winCount", 1528864276);
        setIntField(term126553, term126553.getClass(), "helpCount", 1293672054);
        setIntField(term126553, term126553.getClass(), "comboCount", -126829114);
        setIntField(term126553, term126553.getClass(), "feverCount", 1364504787);
        setIntField(term126553, term126553.getClass(), "totalHiScore", 193942993);
        setIntField(term126553, term126553.getClass(), "totalEasyHighScore", -1448731227);
        setIntField(term126553, term126553.getClass(), "totalBasicHighScore", 427298296);
        setIntField(term126553, term126553.getClass(), "totalAdvancedHighScore", 1136711102);
        setIntField(term126553, term126553.getClass(), "totalExpertHighScore", -1269993796);
        setIntField(term126553, term126553.getClass(), "totalMasterHighScore", -288156643);
        setIntField(term126553, term126553.getClass(), "totalReMasterHighScore", 1906783253);
        setIntField(term126553, term126553.getClass(), "totalHighSync", 1204018336);
        setIntField(term126553, term126553.getClass(), "totalEasySync", -954637871);
        setIntField(term126553, term126553.getClass(), "totalBasicSync", 1135537153);
        setIntField(term126553, term126553.getClass(), "totalAdvancedSync", 762525337);
        setIntField(term126553, term126553.getClass(), "totalExpertSync", 1446372730);
        setIntField(term126553, term126553.getClass(), "totalMasterSync", -1728367118);
        setIntField(term126553, term126553.getClass(), "totalReMasterSync", -904895307);
        setIntField(term126553, term126553.getClass(), "playerRating", -1874907467);
        setIntField(term126553, term126553.getClass(), "highestRating", -1129128196);
        setIntField(term126553, term126553.getClass(), "rankAuthTailId", -1470909739);
        setField(term126553, term126553.getClass(), "eventWatchedDate", "aSBloErOPY");
        setField(term126553, term126553.getClass(), "webLimitDate", "ItfmeAXEYy");
        setIntField(term126553, term126553.getClass(), "challengeTrackPhase", -1412907836);
        setIntField(term126553, term126553.getClass(), "firstPlayBits", -199903643);
        setField(term126553, term126553.getClass(), "lastPlayDate", "zkqcwCycKC");
        setIntField(term126553, term126553.getClass(), "lastPlaceId", 1793350918);
        setField(term126553, term126553.getClass(), "lastPlaceName", "jSBwpGbJJI");
        setIntField(term126553, term126553.getClass(), "lastRegionId", 364334911);
        setField(term126553, term126553.getClass(), "lastRegionName", "xnmcxyNSBe");
        setField(term126553, term126553.getClass(), "lastClientId", "FXflwvEdHL");
        setField(term126553, term126553.getClass(), "lastCountryCode", "aTdLOvYsQE");
        setIntField(term126553, term126553.getClass(), "eventPoint", -238168572);
        setIntField(term126553, term126553.getClass(), "totalLv", -868047935);
        setIntField(term126553, term126553.getClass(), "lastLoginBonusDay", -1246506132);
        setIntField(term126553, term126553.getClass(), "lastSurvivalBonusDay", 97341042);
        setIntField(term126553, term126553.getClass(), "loginBonusLv", 1671428088);
        setField(term126551, term126551.getClass(), "user", term126553);
        setIntField(term126551, term126551.getClass(), "orderId", 477930898);
        setLongField(term126551, term126551.getClass(), "sortNumber", 38900113635378049L);
        setIntField(term126551, term126551.getClass(), "placeId", 656357625);
        setField(term126551, term126551.getClass(), "placeName", "AavZwxppSr");
        setField(term126551, term126551.getClass(), "country", "bozHpjFCmy");
        setIntField(term126551, term126551.getClass(), "regionId", -385957661);
        setField(term126551, term126551.getClass(), "playDate", "fufOvYOUme");
        setField(term126551, term126551.getClass(), "userPlayDate", "hFUzxlerfo");
        setIntField(term126551, term126551.getClass(), "musicId", 90100853);
        setIntField(term126551, term126551.getClass(), "level", -1993108184);
        setIntField(term126551, term126551.getClass(), "gameMode", 344348342);
        setIntField(term126551, term126551.getClass(), "rivalNum", -95921105);
        setIntField(term126551, term126551.getClass(), "track", 1276621447);
        setIntField(term126551, term126551.getClass(), "eventId", 428970345);
        setBooleanField(term126551, term126551.getClass(), "isFreeToPlay", false);
        setIntField(term126551, term126551.getClass(), "playerRating", -2048440469);
        setLongField(term126551, term126551.getClass(), "playedUserId1", 2167389818358075653L);
        setField(term126551, term126551.getClass(), "playedUserName1", "SSClrWPMGg");
        setIntField(term126551, term126551.getClass(), "playedMusicLevel1", 339566160);
        setLongField(term126551, term126551.getClass(), "playedUserId2", 2371696206810185880L);
        setField(term126551, term126551.getClass(), "playedUserName2", "pWwlfpmeFT");
        setIntField(term126551, term126551.getClass(), "playedMusicLevel2", -200219756);
        setLongField(term126551, term126551.getClass(), "playedUserId3", -3926033211239834024L);
        setField(term126551, term126551.getClass(), "playedUserName3", "PKwVSkPPMv");
        setIntField(term126551, term126551.getClass(), "playedMusicLevel3", 1980380973);
        setIntField(term126551, term126551.getClass(), "achievement", 1256516454);
        setIntField(term126551, term126551.getClass(), "score", 561573899);
        setIntField(term126551, term126551.getClass(), "tapScore", 443868866);
        setIntField(term126551, term126551.getClass(), "holdScore", -264992055);
        setIntField(term126551, term126551.getClass(), "slideScore", -958770054);
        setIntField(term126551, term126551.getClass(), "breakScore", 2141108908);
        setIntField(term126551, term126551.getClass(), "syncRate", 84008598);
        setIntField(term126551, term126551.getClass(), "vsWin", -681482519);
        setBooleanField(term126551, term126551.getClass(), "isAllPerfect", true);
        setIntField(term126551, term126551.getClass(), "fullCombo", 535457354);
        setIntField(term126551, term126551.getClass(), "maxFever", 820159733);
        setIntField(term126551, term126551.getClass(), "maxCombo", -175620899);
        setIntField(term126551, term126551.getClass(), "tapPerfect", -2111208285);
        setIntField(term126551, term126551.getClass(), "tapGreat", -1238669625);
        setIntField(term126551, term126551.getClass(), "tapGood", 1796926291);
        setIntField(term126551, term126551.getClass(), "tapBad", -1102198578);
        setIntField(term126551, term126551.getClass(), "holdPerfect", 1431007432);
        setIntField(term126551, term126551.getClass(), "holdGreat", 2080479990);
        setIntField(term126551, term126551.getClass(), "holdGood", 601818963);
        setIntField(term126551, term126551.getClass(), "holdBad", 639132528);
        setIntField(term126551, term126551.getClass(), "slidePerfect", -857537924);
        setIntField(term126551, term126551.getClass(), "slideGreat", 1605766134);
        setIntField(term126551, term126551.getClass(), "slideGood", -1972823469);
        setIntField(term126551, term126551.getClass(), "slideBad", -923390407);
        setIntField(term126551, term126551.getClass(), "breakPerfect", -611768568);
        setIntField(term126551, term126551.getClass(), "breakGreat", 479240257);
        setIntField(term126551, term126551.getClass(), "breakGood", -921251972);
        setIntField(term126551, term126551.getClass(), "breakBad", 739178487);
        setBooleanField(term126551, term126551.getClass(), "isTrackSkip", true);
        setBooleanField(term126551, term126551.getClass(), "isHighScore", true);
        setBooleanField(term126551, term126551.getClass(), "isChallengeTrack", false);
        setIntField(term126551, term126551.getClass(), "challengeLife", -1669064978);
        setIntField(term126551, term126551.getClass(), "challengeRemain", -1350650574);
        setIntField(term126551, term126551.getClass(), "isAllPerfectPlus", -188618513);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHoldScore", argTypes, term126551, args);
    }

};


