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

public class UserPlaylog_getPlayedUserName2_126135966722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122775;

    public UserPlaylog_getPlayedUserName2_126135966722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term122781 = new Long(9062006526792682783L);
        term122775 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term122777 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term122779 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term122795 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term122796 = newInstance(Class.forName("java.time.LocalDate"));
        Object term122800 = newInstance(Class.forName("java.time.LocalTime"));
        Object term122805 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term122806 = newInstance(Class.forName("java.time.LocalDate"));
        Object term122810 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term122775, term122775.getClass(), "id", -391398551284253915L);
        setLongField(term122777, term122777.getClass(), "id", -2791473406557466846L);
        setLongField(term122779, term122779.getClass(), "id", -3895780534600959979L);
        setField(term122779, term122779.getClass(), "extId", term122781);
        setField(term122779, term122779.getClass(), "luid", "uPhRdRCFnR");
        setIntField(term122796, term122796.getClass(), "year", 2017);
        setShortField(term122796, term122796.getClass(), "month", (short) 8);
        setShortField(term122796, term122796.getClass(), "day", (short) 13);
        setField(term122795, term122795.getClass(), "date", term122796);
        setByteField(term122800, term122800.getClass(), "hour", (byte) 3);
        setByteField(term122800, term122800.getClass(), "minute", (byte) 9);
        setByteField(term122800, term122800.getClass(), "second", (byte) 24);
        setIntField(term122800, term122800.getClass(), "nano", 692710591);
        setField(term122795, term122795.getClass(), "time", term122800);
        setField(term122779, term122779.getClass(), "registerTime", term122795);
        setIntField(term122806, term122806.getClass(), "year", 2019);
        setShortField(term122806, term122806.getClass(), "month", (short) 6);
        setShortField(term122806, term122806.getClass(), "day", (short) 13);
        setField(term122805, term122805.getClass(), "date", term122806);
        setByteField(term122810, term122810.getClass(), "hour", (byte) 22);
        setByteField(term122810, term122810.getClass(), "minute", (byte) 53);
        setByteField(term122810, term122810.getClass(), "second", (byte) 1);
        setIntField(term122810, term122810.getClass(), "nano", 411931015);
        setField(term122805, term122805.getClass(), "time", term122810);
        setField(term122779, term122779.getClass(), "accessTime", term122805);
        setField(term122777, term122777.getClass(), "card", term122779);
        setIntField(term122777, term122777.getClass(), "lastDataVersion", 1447275815);
        setField(term122777, term122777.getClass(), "userName", "HdiCCAVvaY");
        setIntField(term122777, term122777.getClass(), "point", 1082981850);
        setIntField(term122777, term122777.getClass(), "totalPoint", -1844294809);
        setIntField(term122777, term122777.getClass(), "iconId", 598151803);
        setIntField(term122777, term122777.getClass(), "nameplateId", -587471809);
        setIntField(term122777, term122777.getClass(), "frameId", 361267393);
        setIntField(term122777, term122777.getClass(), "trophyId", 1886311523);
        setIntField(term122777, term122777.getClass(), "playCount", 1318360293);
        setIntField(term122777, term122777.getClass(), "playVsCount", -1027358936);
        setIntField(term122777, term122777.getClass(), "playSyncCount", -1229208944);
        setIntField(term122777, term122777.getClass(), "winCount", -170120046);
        setIntField(term122777, term122777.getClass(), "helpCount", -1709733909);
        setIntField(term122777, term122777.getClass(), "comboCount", -894844741);
        setIntField(term122777, term122777.getClass(), "feverCount", -166384825);
        setIntField(term122777, term122777.getClass(), "totalHiScore", 351927390);
        setIntField(term122777, term122777.getClass(), "totalEasyHighScore", 2065832838);
        setIntField(term122777, term122777.getClass(), "totalBasicHighScore", -359026798);
        setIntField(term122777, term122777.getClass(), "totalAdvancedHighScore", 1681890223);
        setIntField(term122777, term122777.getClass(), "totalExpertHighScore", -1958329610);
        setIntField(term122777, term122777.getClass(), "totalMasterHighScore", 381934673);
        setIntField(term122777, term122777.getClass(), "totalReMasterHighScore", -817067810);
        setIntField(term122777, term122777.getClass(), "totalHighSync", -983086690);
        setIntField(term122777, term122777.getClass(), "totalEasySync", 2105816896);
        setIntField(term122777, term122777.getClass(), "totalBasicSync", 1090696044);
        setIntField(term122777, term122777.getClass(), "totalAdvancedSync", -222016393);
        setIntField(term122777, term122777.getClass(), "totalExpertSync", 1471782009);
        setIntField(term122777, term122777.getClass(), "totalMasterSync", 503038990);
        setIntField(term122777, term122777.getClass(), "totalReMasterSync", -412516188);
        setIntField(term122777, term122777.getClass(), "playerRating", 1789916724);
        setIntField(term122777, term122777.getClass(), "highestRating", 929549819);
        setIntField(term122777, term122777.getClass(), "rankAuthTailId", -893906033);
        setField(term122777, term122777.getClass(), "eventWatchedDate", "UrAeseWSFd");
        setField(term122777, term122777.getClass(), "webLimitDate", "udLLyuUbuM");
        setIntField(term122777, term122777.getClass(), "challengeTrackPhase", 1239659216);
        setIntField(term122777, term122777.getClass(), "firstPlayBits", -1660602244);
        setField(term122777, term122777.getClass(), "lastPlayDate", "sNNylQpAva");
        setIntField(term122777, term122777.getClass(), "lastPlaceId", -1171500236);
        setField(term122777, term122777.getClass(), "lastPlaceName", "fiwockBanw");
        setIntField(term122777, term122777.getClass(), "lastRegionId", 694083079);
        setField(term122777, term122777.getClass(), "lastRegionName", "VbcximgVTz");
        setField(term122777, term122777.getClass(), "lastClientId", "TGJZvuTmTU");
        setField(term122777, term122777.getClass(), "lastCountryCode", "BSkkjeLezA");
        setIntField(term122777, term122777.getClass(), "eventPoint", -334527875);
        setIntField(term122777, term122777.getClass(), "totalLv", 669174813);
        setIntField(term122777, term122777.getClass(), "lastLoginBonusDay", -305180205);
        setIntField(term122777, term122777.getClass(), "lastSurvivalBonusDay", 430010306);
        setIntField(term122777, term122777.getClass(), "loginBonusLv", 1873195725);
        setField(term122775, term122775.getClass(), "user", term122777);
        setIntField(term122775, term122775.getClass(), "orderId", -2019071652);
        setLongField(term122775, term122775.getClass(), "sortNumber", 789661870469773196L);
        setIntField(term122775, term122775.getClass(), "placeId", -366565977);
        setField(term122775, term122775.getClass(), "placeName", "uAlTVusgen");
        setField(term122775, term122775.getClass(), "country", "PAUaymMOSJ");
        setIntField(term122775, term122775.getClass(), "regionId", 836999750);
        setField(term122775, term122775.getClass(), "playDate", "OcTjqWhWJS");
        setField(term122775, term122775.getClass(), "userPlayDate", "XkidVezikV");
        setIntField(term122775, term122775.getClass(), "musicId", 406322331);
        setIntField(term122775, term122775.getClass(), "level", -1068057012);
        setIntField(term122775, term122775.getClass(), "gameMode", -1814939038);
        setIntField(term122775, term122775.getClass(), "rivalNum", -1698429753);
        setIntField(term122775, term122775.getClass(), "track", 2137622499);
        setIntField(term122775, term122775.getClass(), "eventId", 1999042147);
        setBooleanField(term122775, term122775.getClass(), "isFreeToPlay", true);
        setIntField(term122775, term122775.getClass(), "playerRating", -105005664);
        setLongField(term122775, term122775.getClass(), "playedUserId1", -3484599398786804700L);
        setField(term122775, term122775.getClass(), "playedUserName1", "xSsMPNRSUV");
        setIntField(term122775, term122775.getClass(), "playedMusicLevel1", -118190113);
        setLongField(term122775, term122775.getClass(), "playedUserId2", -5259338558309636239L);
        setField(term122775, term122775.getClass(), "playedUserName2", "DRbcFFNcSr");
        setIntField(term122775, term122775.getClass(), "playedMusicLevel2", -1851844767);
        setLongField(term122775, term122775.getClass(), "playedUserId3", -94386090490716219L);
        setField(term122775, term122775.getClass(), "playedUserName3", "WGDSInQrVz");
        setIntField(term122775, term122775.getClass(), "playedMusicLevel3", 1134995273);
        setIntField(term122775, term122775.getClass(), "achievement", 545058087);
        setIntField(term122775, term122775.getClass(), "score", 277397630);
        setIntField(term122775, term122775.getClass(), "tapScore", -1151022473);
        setIntField(term122775, term122775.getClass(), "holdScore", 1720989427);
        setIntField(term122775, term122775.getClass(), "slideScore", -735574672);
        setIntField(term122775, term122775.getClass(), "breakScore", -2067044834);
        setIntField(term122775, term122775.getClass(), "syncRate", -626419373);
        setIntField(term122775, term122775.getClass(), "vsWin", -1266872592);
        setBooleanField(term122775, term122775.getClass(), "isAllPerfect", true);
        setIntField(term122775, term122775.getClass(), "fullCombo", -1078848410);
        setIntField(term122775, term122775.getClass(), "maxFever", -1693716421);
        setIntField(term122775, term122775.getClass(), "maxCombo", 165867345);
        setIntField(term122775, term122775.getClass(), "tapPerfect", 483143938);
        setIntField(term122775, term122775.getClass(), "tapGreat", 1477129324);
        setIntField(term122775, term122775.getClass(), "tapGood", -119068926);
        setIntField(term122775, term122775.getClass(), "tapBad", 1491404701);
        setIntField(term122775, term122775.getClass(), "holdPerfect", 1616183536);
        setIntField(term122775, term122775.getClass(), "holdGreat", 771552165);
        setIntField(term122775, term122775.getClass(), "holdGood", -1365886136);
        setIntField(term122775, term122775.getClass(), "holdBad", -2049839076);
        setIntField(term122775, term122775.getClass(), "slidePerfect", -304064614);
        setIntField(term122775, term122775.getClass(), "slideGreat", -2083558546);
        setIntField(term122775, term122775.getClass(), "slideGood", 1728733629);
        setIntField(term122775, term122775.getClass(), "slideBad", 1916491404);
        setIntField(term122775, term122775.getClass(), "breakPerfect", 1963930446);
        setIntField(term122775, term122775.getClass(), "breakGreat", -408302545);
        setIntField(term122775, term122775.getClass(), "breakGood", -1320522399);
        setIntField(term122775, term122775.getClass(), "breakBad", 1941013481);
        setBooleanField(term122775, term122775.getClass(), "isTrackSkip", false);
        setBooleanField(term122775, term122775.getClass(), "isHighScore", false);
        setBooleanField(term122775, term122775.getClass(), "isChallengeTrack", false);
        setIntField(term122775, term122775.getClass(), "challengeLife", 558340441);
        setIntField(term122775, term122775.getClass(), "challengeRemain", 1770611027);
        setIntField(term122775, term122775.getClass(), "isAllPerfectPlus", 334175541);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayedUserName2", argTypes, term122775, args);
    }

};


