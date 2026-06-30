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

public class UserPlaylog_setPlayedUserId2_86996172082 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term151499;
     Object term151811;

    public UserPlaylog_setPlayedUserId2_86996172082() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term151505 = new Long(1634166935474035772L);
        term151499 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term151501 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term151503 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term151519 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term151520 = newInstance(Class.forName("java.time.LocalDate"));
        Object term151524 = newInstance(Class.forName("java.time.LocalTime"));
        Object term151529 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term151530 = newInstance(Class.forName("java.time.LocalDate"));
        Object term151534 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term151499, term151499.getClass(), "id", -6117082530291957563L);
        setLongField(term151501, term151501.getClass(), "id", 8605580628003894246L);
        setLongField(term151503, term151503.getClass(), "id", 2742759719072632386L);
        setField(term151503, term151503.getClass(), "extId", term151505);
        setField(term151503, term151503.getClass(), "luid", "BFwLWMcFzQ");
        setIntField(term151520, term151520.getClass(), "year", 2019);
        setShortField(term151520, term151520.getClass(), "month", (short) 5);
        setShortField(term151520, term151520.getClass(), "day", (short) 2);
        setField(term151519, term151519.getClass(), "date", term151520);
        setByteField(term151524, term151524.getClass(), "hour", (byte) 7);
        setByteField(term151524, term151524.getClass(), "minute", (byte) 38);
        setByteField(term151524, term151524.getClass(), "second", (byte) 2);
        setIntField(term151524, term151524.getClass(), "nano", 148685302);
        setField(term151519, term151519.getClass(), "time", term151524);
        setField(term151503, term151503.getClass(), "registerTime", term151519);
        setIntField(term151530, term151530.getClass(), "year", 2019);
        setShortField(term151530, term151530.getClass(), "month", (short) 4);
        setShortField(term151530, term151530.getClass(), "day", (short) 21);
        setField(term151529, term151529.getClass(), "date", term151530);
        setByteField(term151534, term151534.getClass(), "hour", (byte) 5);
        setByteField(term151534, term151534.getClass(), "minute", (byte) 35);
        setByteField(term151534, term151534.getClass(), "second", (byte) 51);
        setIntField(term151534, term151534.getClass(), "nano", 345346848);
        setField(term151529, term151529.getClass(), "time", term151534);
        setField(term151503, term151503.getClass(), "accessTime", term151529);
        setField(term151501, term151501.getClass(), "card", term151503);
        setIntField(term151501, term151501.getClass(), "lastDataVersion", -2111381579);
        setField(term151501, term151501.getClass(), "userName", "ueMjdaYJqr");
        setIntField(term151501, term151501.getClass(), "point", 279526732);
        setIntField(term151501, term151501.getClass(), "totalPoint", -1538296780);
        setIntField(term151501, term151501.getClass(), "iconId", 1134427511);
        setIntField(term151501, term151501.getClass(), "nameplateId", 1084492038);
        setIntField(term151501, term151501.getClass(), "frameId", -1430591544);
        setIntField(term151501, term151501.getClass(), "trophyId", -2005285292);
        setIntField(term151501, term151501.getClass(), "playCount", -2092175473);
        setIntField(term151501, term151501.getClass(), "playVsCount", 1128542002);
        setIntField(term151501, term151501.getClass(), "playSyncCount", -1733516345);
        setIntField(term151501, term151501.getClass(), "winCount", 1109706181);
        setIntField(term151501, term151501.getClass(), "helpCount", -57430632);
        setIntField(term151501, term151501.getClass(), "comboCount", 1203419057);
        setIntField(term151501, term151501.getClass(), "feverCount", -1362714804);
        setIntField(term151501, term151501.getClass(), "totalHiScore", 820583880);
        setIntField(term151501, term151501.getClass(), "totalEasyHighScore", -1667520359);
        setIntField(term151501, term151501.getClass(), "totalBasicHighScore", -1377839077);
        setIntField(term151501, term151501.getClass(), "totalAdvancedHighScore", 750978594);
        setIntField(term151501, term151501.getClass(), "totalExpertHighScore", -1728948276);
        setIntField(term151501, term151501.getClass(), "totalMasterHighScore", -2102573659);
        setIntField(term151501, term151501.getClass(), "totalReMasterHighScore", -1852913065);
        setIntField(term151501, term151501.getClass(), "totalHighSync", -1385001679);
        setIntField(term151501, term151501.getClass(), "totalEasySync", -894720460);
        setIntField(term151501, term151501.getClass(), "totalBasicSync", 128142159);
        setIntField(term151501, term151501.getClass(), "totalAdvancedSync", -1443848456);
        setIntField(term151501, term151501.getClass(), "totalExpertSync", 516808466);
        setIntField(term151501, term151501.getClass(), "totalMasterSync", -634906787);
        setIntField(term151501, term151501.getClass(), "totalReMasterSync", -221433252);
        setIntField(term151501, term151501.getClass(), "playerRating", -2034806301);
        setIntField(term151501, term151501.getClass(), "highestRating", 668515812);
        setIntField(term151501, term151501.getClass(), "rankAuthTailId", 413955295);
        setField(term151501, term151501.getClass(), "eventWatchedDate", "IkmVfYlXcX");
        setField(term151501, term151501.getClass(), "webLimitDate", "WIAcrtkMRk");
        setIntField(term151501, term151501.getClass(), "challengeTrackPhase", -487961158);
        setIntField(term151501, term151501.getClass(), "firstPlayBits", 1440941364);
        setField(term151501, term151501.getClass(), "lastPlayDate", "HulasQmWEg");
        setIntField(term151501, term151501.getClass(), "lastPlaceId", -1833636256);
        setField(term151501, term151501.getClass(), "lastPlaceName", "DYfBwepDla");
        setIntField(term151501, term151501.getClass(), "lastRegionId", 1281446673);
        setField(term151501, term151501.getClass(), "lastRegionName", "cxjGlUIOFS");
        setField(term151501, term151501.getClass(), "lastClientId", "uXFGrCmsoj");
        setField(term151501, term151501.getClass(), "lastCountryCode", "neFbgoRFth");
        setIntField(term151501, term151501.getClass(), "eventPoint", -996475471);
        setIntField(term151501, term151501.getClass(), "totalLv", 1373996642);
        setIntField(term151501, term151501.getClass(), "lastLoginBonusDay", 277889066);
        setIntField(term151501, term151501.getClass(), "lastSurvivalBonusDay", 2107118802);
        setIntField(term151501, term151501.getClass(), "loginBonusLv", -1428856233);
        setField(term151499, term151499.getClass(), "user", term151501);
        setIntField(term151499, term151499.getClass(), "orderId", -560561760);
        setLongField(term151499, term151499.getClass(), "sortNumber", 8577592614427713625L);
        setIntField(term151499, term151499.getClass(), "placeId", 200951658);
        setField(term151499, term151499.getClass(), "placeName", "rMAeMXcVLg");
        setField(term151499, term151499.getClass(), "country", "rwfffztPZR");
        setIntField(term151499, term151499.getClass(), "regionId", -160045178);
        setField(term151499, term151499.getClass(), "playDate", "gdOOqYLTIa");
        setField(term151499, term151499.getClass(), "userPlayDate", "laVtzInYkB");
        setIntField(term151499, term151499.getClass(), "musicId", 349061449);
        setIntField(term151499, term151499.getClass(), "level", 1705838470);
        setIntField(term151499, term151499.getClass(), "gameMode", 568564635);
        setIntField(term151499, term151499.getClass(), "rivalNum", -578552993);
        setIntField(term151499, term151499.getClass(), "track", 647893655);
        setIntField(term151499, term151499.getClass(), "eventId", 1201228016);
        setBooleanField(term151499, term151499.getClass(), "isFreeToPlay", false);
        setIntField(term151499, term151499.getClass(), "playerRating", 995209122);
        setLongField(term151499, term151499.getClass(), "playedUserId1", 6370524950953117569L);
        setField(term151499, term151499.getClass(), "playedUserName1", "QlMgZrPWFc");
        setIntField(term151499, term151499.getClass(), "playedMusicLevel1", 1171553245);
        setLongField(term151499, term151499.getClass(), "playedUserId2", 3987997174812419775L);
        setField(term151499, term151499.getClass(), "playedUserName2", "RBFdhcXDVw");
        setIntField(term151499, term151499.getClass(), "playedMusicLevel2", 1375037696);
        setLongField(term151499, term151499.getClass(), "playedUserId3", -313071413817626779L);
        setField(term151499, term151499.getClass(), "playedUserName3", "xVeXohNyns");
        setIntField(term151499, term151499.getClass(), "playedMusicLevel3", -303846106);
        setIntField(term151499, term151499.getClass(), "achievement", 1861195554);
        setIntField(term151499, term151499.getClass(), "score", 207621271);
        setIntField(term151499, term151499.getClass(), "tapScore", -1850529442);
        setIntField(term151499, term151499.getClass(), "holdScore", -689658308);
        setIntField(term151499, term151499.getClass(), "slideScore", -1420473074);
        setIntField(term151499, term151499.getClass(), "breakScore", -902312389);
        setIntField(term151499, term151499.getClass(), "syncRate", -1855830685);
        setIntField(term151499, term151499.getClass(), "vsWin", -1845827652);
        setBooleanField(term151499, term151499.getClass(), "isAllPerfect", false);
        setIntField(term151499, term151499.getClass(), "fullCombo", 1717849983);
        setIntField(term151499, term151499.getClass(), "maxFever", 845426642);
        setIntField(term151499, term151499.getClass(), "maxCombo", -1211372155);
        setIntField(term151499, term151499.getClass(), "tapPerfect", 1033626497);
        setIntField(term151499, term151499.getClass(), "tapGreat", -189684537);
        setIntField(term151499, term151499.getClass(), "tapGood", -1861676984);
        setIntField(term151499, term151499.getClass(), "tapBad", 489057847);
        setIntField(term151499, term151499.getClass(), "holdPerfect", 2012524773);
        setIntField(term151499, term151499.getClass(), "holdGreat", -622682683);
        setIntField(term151499, term151499.getClass(), "holdGood", -1007946709);
        setIntField(term151499, term151499.getClass(), "holdBad", 2033724505);
        setIntField(term151499, term151499.getClass(), "slidePerfect", -2054176226);
        setIntField(term151499, term151499.getClass(), "slideGreat", 325249402);
        setIntField(term151499, term151499.getClass(), "slideGood", -486452301);
        setIntField(term151499, term151499.getClass(), "slideBad", 1061778672);
        setIntField(term151499, term151499.getClass(), "breakPerfect", 165022693);
        setIntField(term151499, term151499.getClass(), "breakGreat", 1781517788);
        setIntField(term151499, term151499.getClass(), "breakGood", 645022978);
        setIntField(term151499, term151499.getClass(), "breakBad", -1808329703);
        setBooleanField(term151499, term151499.getClass(), "isTrackSkip", true);
        setBooleanField(term151499, term151499.getClass(), "isHighScore", true);
        setBooleanField(term151499, term151499.getClass(), "isChallengeTrack", false);
        setIntField(term151499, term151499.getClass(), "challengeLife", 1099465560);
        setIntField(term151499, term151499.getClass(), "challengeRemain", 1339922922);
        setIntField(term151499, term151499.getClass(), "isAllPerfectPlus", 651953835);
        term151811 = new Long(-460099854831988621L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term151811;
        callMethod(klass, "setPlayedUserId2", argTypes, term151499, args);
    }

};


