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

public class UserPlaylog_setMaxCombo_9409206799 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159597;
     Object term159909;

    public UserPlaylog_setMaxCombo_9409206799() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term159603 = new Long(4115148503664117517L);
        term159597 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term159599 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term159601 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term159617 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term159618 = newInstance(Class.forName("java.time.LocalDate"));
        Object term159622 = newInstance(Class.forName("java.time.LocalTime"));
        Object term159627 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term159628 = newInstance(Class.forName("java.time.LocalDate"));
        Object term159632 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term159597, term159597.getClass(), "id", 3705697676400134819L);
        setLongField(term159599, term159599.getClass(), "id", -413020147234344150L);
        setLongField(term159601, term159601.getClass(), "id", 472883245502777941L);
        setField(term159601, term159601.getClass(), "extId", term159603);
        setField(term159601, term159601.getClass(), "luid", "JpemqlOPQk");
        setIntField(term159618, term159618.getClass(), "year", 2014);
        setShortField(term159618, term159618.getClass(), "month", (short) 9);
        setShortField(term159618, term159618.getClass(), "day", (short) 25);
        setField(term159617, term159617.getClass(), "date", term159618);
        setByteField(term159622, term159622.getClass(), "hour", (byte) 11);
        setByteField(term159622, term159622.getClass(), "minute", (byte) 31);
        setByteField(term159622, term159622.getClass(), "second", (byte) 8);
        setIntField(term159622, term159622.getClass(), "nano", 872565929);
        setField(term159617, term159617.getClass(), "time", term159622);
        setField(term159601, term159601.getClass(), "registerTime", term159617);
        setIntField(term159628, term159628.getClass(), "year", 2016);
        setShortField(term159628, term159628.getClass(), "month", (short) 7);
        setShortField(term159628, term159628.getClass(), "day", (short) 13);
        setField(term159627, term159627.getClass(), "date", term159628);
        setByteField(term159632, term159632.getClass(), "hour", (byte) 22);
        setByteField(term159632, term159632.getClass(), "minute", (byte) 34);
        setByteField(term159632, term159632.getClass(), "second", (byte) 48);
        setIntField(term159632, term159632.getClass(), "nano", 138454110);
        setField(term159627, term159627.getClass(), "time", term159632);
        setField(term159601, term159601.getClass(), "accessTime", term159627);
        setField(term159599, term159599.getClass(), "card", term159601);
        setIntField(term159599, term159599.getClass(), "lastDataVersion", -359006936);
        setField(term159599, term159599.getClass(), "userName", "wZMPsUUQHd");
        setIntField(term159599, term159599.getClass(), "point", 61580330);
        setIntField(term159599, term159599.getClass(), "totalPoint", -631004400);
        setIntField(term159599, term159599.getClass(), "iconId", -1050825659);
        setIntField(term159599, term159599.getClass(), "nameplateId", 1086437814);
        setIntField(term159599, term159599.getClass(), "frameId", -1295796037);
        setIntField(term159599, term159599.getClass(), "trophyId", -583654834);
        setIntField(term159599, term159599.getClass(), "playCount", 71196650);
        setIntField(term159599, term159599.getClass(), "playVsCount", 1344170684);
        setIntField(term159599, term159599.getClass(), "playSyncCount", -270831323);
        setIntField(term159599, term159599.getClass(), "winCount", -1987814298);
        setIntField(term159599, term159599.getClass(), "helpCount", -285464959);
        setIntField(term159599, term159599.getClass(), "comboCount", -81216710);
        setIntField(term159599, term159599.getClass(), "feverCount", -1175618776);
        setIntField(term159599, term159599.getClass(), "totalHiScore", 2066603120);
        setIntField(term159599, term159599.getClass(), "totalEasyHighScore", -543216838);
        setIntField(term159599, term159599.getClass(), "totalBasicHighScore", -1583408172);
        setIntField(term159599, term159599.getClass(), "totalAdvancedHighScore", -1779634121);
        setIntField(term159599, term159599.getClass(), "totalExpertHighScore", 555796378);
        setIntField(term159599, term159599.getClass(), "totalMasterHighScore", 1688266118);
        setIntField(term159599, term159599.getClass(), "totalReMasterHighScore", 1354378762);
        setIntField(term159599, term159599.getClass(), "totalHighSync", 425177759);
        setIntField(term159599, term159599.getClass(), "totalEasySync", 1384766851);
        setIntField(term159599, term159599.getClass(), "totalBasicSync", 135771353);
        setIntField(term159599, term159599.getClass(), "totalAdvancedSync", 56635051);
        setIntField(term159599, term159599.getClass(), "totalExpertSync", 749664494);
        setIntField(term159599, term159599.getClass(), "totalMasterSync", 563325384);
        setIntField(term159599, term159599.getClass(), "totalReMasterSync", -568724303);
        setIntField(term159599, term159599.getClass(), "playerRating", 838865803);
        setIntField(term159599, term159599.getClass(), "highestRating", -1570591854);
        setIntField(term159599, term159599.getClass(), "rankAuthTailId", 518961886);
        setField(term159599, term159599.getClass(), "eventWatchedDate", "kfQRMGKNWd");
        setField(term159599, term159599.getClass(), "webLimitDate", "DmPsloRwDO");
        setIntField(term159599, term159599.getClass(), "challengeTrackPhase", 175099095);
        setIntField(term159599, term159599.getClass(), "firstPlayBits", 1997820019);
        setField(term159599, term159599.getClass(), "lastPlayDate", "VELROAvnmN");
        setIntField(term159599, term159599.getClass(), "lastPlaceId", -396199744);
        setField(term159599, term159599.getClass(), "lastPlaceName", "aYIchgguwD");
        setIntField(term159599, term159599.getClass(), "lastRegionId", 1520824865);
        setField(term159599, term159599.getClass(), "lastRegionName", "YeMojFOdIm");
        setField(term159599, term159599.getClass(), "lastClientId", "SlRtNRtKAG");
        setField(term159599, term159599.getClass(), "lastCountryCode", "tjWInMuXpE");
        setIntField(term159599, term159599.getClass(), "eventPoint", 89866725);
        setIntField(term159599, term159599.getClass(), "totalLv", 1222145880);
        setIntField(term159599, term159599.getClass(), "lastLoginBonusDay", 273793686);
        setIntField(term159599, term159599.getClass(), "lastSurvivalBonusDay", 1264533805);
        setIntField(term159599, term159599.getClass(), "loginBonusLv", -1649260025);
        setField(term159597, term159597.getClass(), "user", term159599);
        setIntField(term159597, term159597.getClass(), "orderId", 1773938640);
        setLongField(term159597, term159597.getClass(), "sortNumber", -6142480959588164820L);
        setIntField(term159597, term159597.getClass(), "placeId", 1250544515);
        setField(term159597, term159597.getClass(), "placeName", "rWuFJIaxKU");
        setField(term159597, term159597.getClass(), "country", "YfhWIhudfM");
        setIntField(term159597, term159597.getClass(), "regionId", -967153556);
        setField(term159597, term159597.getClass(), "playDate", "GMoKHTpxln");
        setField(term159597, term159597.getClass(), "userPlayDate", "XkAqnfOCnI");
        setIntField(term159597, term159597.getClass(), "musicId", 2013194757);
        setIntField(term159597, term159597.getClass(), "level", 449905089);
        setIntField(term159597, term159597.getClass(), "gameMode", -51919642);
        setIntField(term159597, term159597.getClass(), "rivalNum", -1920693520);
        setIntField(term159597, term159597.getClass(), "track", 1125490304);
        setIntField(term159597, term159597.getClass(), "eventId", -1525117093);
        setBooleanField(term159597, term159597.getClass(), "isFreeToPlay", true);
        setIntField(term159597, term159597.getClass(), "playerRating", 2115675125);
        setLongField(term159597, term159597.getClass(), "playedUserId1", -464053943216947554L);
        setField(term159597, term159597.getClass(), "playedUserName1", "gmQYVeuejX");
        setIntField(term159597, term159597.getClass(), "playedMusicLevel1", -149902461);
        setLongField(term159597, term159597.getClass(), "playedUserId2", -6411942115020054409L);
        setField(term159597, term159597.getClass(), "playedUserName2", "lKfOnfrbRD");
        setIntField(term159597, term159597.getClass(), "playedMusicLevel2", -1160604293);
        setLongField(term159597, term159597.getClass(), "playedUserId3", 6501798712124759765L);
        setField(term159597, term159597.getClass(), "playedUserName3", "nYzGCEYbnO");
        setIntField(term159597, term159597.getClass(), "playedMusicLevel3", 57825863);
        setIntField(term159597, term159597.getClass(), "achievement", -83959584);
        setIntField(term159597, term159597.getClass(), "score", 1886545659);
        setIntField(term159597, term159597.getClass(), "tapScore", 1303542813);
        setIntField(term159597, term159597.getClass(), "holdScore", 1446617120);
        setIntField(term159597, term159597.getClass(), "slideScore", 1406436405);
        setIntField(term159597, term159597.getClass(), "breakScore", 1318682577);
        setIntField(term159597, term159597.getClass(), "syncRate", 1241769140);
        setIntField(term159597, term159597.getClass(), "vsWin", 111499810);
        setBooleanField(term159597, term159597.getClass(), "isAllPerfect", true);
        setIntField(term159597, term159597.getClass(), "fullCombo", -1526847867);
        setIntField(term159597, term159597.getClass(), "maxFever", -2078142732);
        setIntField(term159597, term159597.getClass(), "maxCombo", -1749382915);
        setIntField(term159597, term159597.getClass(), "tapPerfect", -1040937952);
        setIntField(term159597, term159597.getClass(), "tapGreat", 1757267528);
        setIntField(term159597, term159597.getClass(), "tapGood", -1927909925);
        setIntField(term159597, term159597.getClass(), "tapBad", 1958603938);
        setIntField(term159597, term159597.getClass(), "holdPerfect", -1768157509);
        setIntField(term159597, term159597.getClass(), "holdGreat", -2024892419);
        setIntField(term159597, term159597.getClass(), "holdGood", -1810027047);
        setIntField(term159597, term159597.getClass(), "holdBad", 1864442883);
        setIntField(term159597, term159597.getClass(), "slidePerfect", -817215280);
        setIntField(term159597, term159597.getClass(), "slideGreat", 2131309717);
        setIntField(term159597, term159597.getClass(), "slideGood", -2017546060);
        setIntField(term159597, term159597.getClass(), "slideBad", -79051975);
        setIntField(term159597, term159597.getClass(), "breakPerfect", -1410823118);
        setIntField(term159597, term159597.getClass(), "breakGreat", -248395247);
        setIntField(term159597, term159597.getClass(), "breakGood", 1561540215);
        setIntField(term159597, term159597.getClass(), "breakBad", -806864553);
        setBooleanField(term159597, term159597.getClass(), "isTrackSkip", false);
        setBooleanField(term159597, term159597.getClass(), "isHighScore", true);
        setBooleanField(term159597, term159597.getClass(), "isChallengeTrack", false);
        setIntField(term159597, term159597.getClass(), "challengeLife", -955709032);
        setIntField(term159597, term159597.getClass(), "challengeRemain", 400962153);
        setIntField(term159597, term159597.getClass(), "isAllPerfectPlus", 14906503);
        term159909 = new Integer(1996758002);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term159909;
        callMethod(klass, "setMaxCombo", argTypes, term159597, args);
    }

};


