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

public class UserPlaylog_setMaxCombo_94092067100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159653;
     Object term159965;

    public UserPlaylog_setMaxCombo_94092067100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term159659 = new Long(4115148503664117517L);
        term159653 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term159655 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term159657 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term159673 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term159674 = newInstance(Class.forName("java.time.LocalDate"));
        Object term159678 = newInstance(Class.forName("java.time.LocalTime"));
        Object term159683 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term159684 = newInstance(Class.forName("java.time.LocalDate"));
        Object term159688 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term159653, term159653.getClass(), "id", 3705697676400134819L);
        setLongField(term159655, term159655.getClass(), "id", -413020147234344150L);
        setLongField(term159657, term159657.getClass(), "id", 472883245502777941L);
        setField(term159657, term159657.getClass(), "extId", term159659);
        setField(term159657, term159657.getClass(), "luid", "JpemqlOPQk");
        setIntField(term159674, term159674.getClass(), "year", 2014);
        setShortField(term159674, term159674.getClass(), "month", (short) 9);
        setShortField(term159674, term159674.getClass(), "day", (short) 25);
        setField(term159673, term159673.getClass(), "date", term159674);
        setByteField(term159678, term159678.getClass(), "hour", (byte) 11);
        setByteField(term159678, term159678.getClass(), "minute", (byte) 31);
        setByteField(term159678, term159678.getClass(), "second", (byte) 8);
        setIntField(term159678, term159678.getClass(), "nano", 872565929);
        setField(term159673, term159673.getClass(), "time", term159678);
        setField(term159657, term159657.getClass(), "registerTime", term159673);
        setIntField(term159684, term159684.getClass(), "year", 2016);
        setShortField(term159684, term159684.getClass(), "month", (short) 7);
        setShortField(term159684, term159684.getClass(), "day", (short) 13);
        setField(term159683, term159683.getClass(), "date", term159684);
        setByteField(term159688, term159688.getClass(), "hour", (byte) 22);
        setByteField(term159688, term159688.getClass(), "minute", (byte) 34);
        setByteField(term159688, term159688.getClass(), "second", (byte) 48);
        setIntField(term159688, term159688.getClass(), "nano", 138454110);
        setField(term159683, term159683.getClass(), "time", term159688);
        setField(term159657, term159657.getClass(), "accessTime", term159683);
        setField(term159655, term159655.getClass(), "card", term159657);
        setIntField(term159655, term159655.getClass(), "lastDataVersion", -359006936);
        setField(term159655, term159655.getClass(), "userName", "wZMPsUUQHd");
        setIntField(term159655, term159655.getClass(), "point", 61580330);
        setIntField(term159655, term159655.getClass(), "totalPoint", -631004400);
        setIntField(term159655, term159655.getClass(), "iconId", -1050825659);
        setIntField(term159655, term159655.getClass(), "nameplateId", 1086437814);
        setIntField(term159655, term159655.getClass(), "frameId", -1295796037);
        setIntField(term159655, term159655.getClass(), "trophyId", -583654834);
        setIntField(term159655, term159655.getClass(), "playCount", 71196650);
        setIntField(term159655, term159655.getClass(), "playVsCount", 1344170684);
        setIntField(term159655, term159655.getClass(), "playSyncCount", -270831323);
        setIntField(term159655, term159655.getClass(), "winCount", -1987814298);
        setIntField(term159655, term159655.getClass(), "helpCount", -285464959);
        setIntField(term159655, term159655.getClass(), "comboCount", -81216710);
        setIntField(term159655, term159655.getClass(), "feverCount", -1175618776);
        setIntField(term159655, term159655.getClass(), "totalHiScore", 2066603120);
        setIntField(term159655, term159655.getClass(), "totalEasyHighScore", -543216838);
        setIntField(term159655, term159655.getClass(), "totalBasicHighScore", -1583408172);
        setIntField(term159655, term159655.getClass(), "totalAdvancedHighScore", -1779634121);
        setIntField(term159655, term159655.getClass(), "totalExpertHighScore", 555796378);
        setIntField(term159655, term159655.getClass(), "totalMasterHighScore", 1688266118);
        setIntField(term159655, term159655.getClass(), "totalReMasterHighScore", 1354378762);
        setIntField(term159655, term159655.getClass(), "totalHighSync", 425177759);
        setIntField(term159655, term159655.getClass(), "totalEasySync", 1384766851);
        setIntField(term159655, term159655.getClass(), "totalBasicSync", 135771353);
        setIntField(term159655, term159655.getClass(), "totalAdvancedSync", 56635051);
        setIntField(term159655, term159655.getClass(), "totalExpertSync", 749664494);
        setIntField(term159655, term159655.getClass(), "totalMasterSync", 563325384);
        setIntField(term159655, term159655.getClass(), "totalReMasterSync", -568724303);
        setIntField(term159655, term159655.getClass(), "playerRating", 838865803);
        setIntField(term159655, term159655.getClass(), "highestRating", -1570591854);
        setIntField(term159655, term159655.getClass(), "rankAuthTailId", 518961886);
        setField(term159655, term159655.getClass(), "eventWatchedDate", "kfQRMGKNWd");
        setField(term159655, term159655.getClass(), "webLimitDate", "DmPsloRwDO");
        setIntField(term159655, term159655.getClass(), "challengeTrackPhase", 175099095);
        setIntField(term159655, term159655.getClass(), "firstPlayBits", 1997820019);
        setField(term159655, term159655.getClass(), "lastPlayDate", "VELROAvnmN");
        setIntField(term159655, term159655.getClass(), "lastPlaceId", -396199744);
        setField(term159655, term159655.getClass(), "lastPlaceName", "aYIchgguwD");
        setIntField(term159655, term159655.getClass(), "lastRegionId", 1520824865);
        setField(term159655, term159655.getClass(), "lastRegionName", "YeMojFOdIm");
        setField(term159655, term159655.getClass(), "lastClientId", "SlRtNRtKAG");
        setField(term159655, term159655.getClass(), "lastCountryCode", "tjWInMuXpE");
        setIntField(term159655, term159655.getClass(), "eventPoint", 89866725);
        setIntField(term159655, term159655.getClass(), "totalLv", 1222145880);
        setIntField(term159655, term159655.getClass(), "lastLoginBonusDay", 273793686);
        setIntField(term159655, term159655.getClass(), "lastSurvivalBonusDay", 1264533805);
        setIntField(term159655, term159655.getClass(), "loginBonusLv", -1649260025);
        setField(term159653, term159653.getClass(), "user", term159655);
        setIntField(term159653, term159653.getClass(), "orderId", 1773938640);
        setLongField(term159653, term159653.getClass(), "sortNumber", -6142480959588164820L);
        setIntField(term159653, term159653.getClass(), "placeId", 1250544515);
        setField(term159653, term159653.getClass(), "placeName", "rWuFJIaxKU");
        setField(term159653, term159653.getClass(), "country", "YfhWIhudfM");
        setIntField(term159653, term159653.getClass(), "regionId", -967153556);
        setField(term159653, term159653.getClass(), "playDate", "GMoKHTpxln");
        setField(term159653, term159653.getClass(), "userPlayDate", "XkAqnfOCnI");
        setIntField(term159653, term159653.getClass(), "musicId", 2013194757);
        setIntField(term159653, term159653.getClass(), "level", 449905089);
        setIntField(term159653, term159653.getClass(), "gameMode", -51919642);
        setIntField(term159653, term159653.getClass(), "rivalNum", -1920693520);
        setIntField(term159653, term159653.getClass(), "track", 1125490304);
        setIntField(term159653, term159653.getClass(), "eventId", -1525117093);
        setBooleanField(term159653, term159653.getClass(), "isFreeToPlay", true);
        setIntField(term159653, term159653.getClass(), "playerRating", 2115675125);
        setLongField(term159653, term159653.getClass(), "playedUserId1", -464053943216947554L);
        setField(term159653, term159653.getClass(), "playedUserName1", "gmQYVeuejX");
        setIntField(term159653, term159653.getClass(), "playedMusicLevel1", -149902461);
        setLongField(term159653, term159653.getClass(), "playedUserId2", -6411942115020054409L);
        setField(term159653, term159653.getClass(), "playedUserName2", "lKfOnfrbRD");
        setIntField(term159653, term159653.getClass(), "playedMusicLevel2", -1160604293);
        setLongField(term159653, term159653.getClass(), "playedUserId3", 6501798712124759765L);
        setField(term159653, term159653.getClass(), "playedUserName3", "nYzGCEYbnO");
        setIntField(term159653, term159653.getClass(), "playedMusicLevel3", 57825863);
        setIntField(term159653, term159653.getClass(), "achievement", -83959584);
        setIntField(term159653, term159653.getClass(), "score", 1886545659);
        setIntField(term159653, term159653.getClass(), "tapScore", 1303542813);
        setIntField(term159653, term159653.getClass(), "holdScore", 1446617120);
        setIntField(term159653, term159653.getClass(), "slideScore", 1406436405);
        setIntField(term159653, term159653.getClass(), "breakScore", 1318682577);
        setIntField(term159653, term159653.getClass(), "syncRate", 1241769140);
        setIntField(term159653, term159653.getClass(), "vsWin", 111499810);
        setBooleanField(term159653, term159653.getClass(), "isAllPerfect", true);
        setIntField(term159653, term159653.getClass(), "fullCombo", -1526847867);
        setIntField(term159653, term159653.getClass(), "maxFever", -2078142732);
        setIntField(term159653, term159653.getClass(), "maxCombo", -1749382915);
        setIntField(term159653, term159653.getClass(), "tapPerfect", -1040937952);
        setIntField(term159653, term159653.getClass(), "tapGreat", 1757267528);
        setIntField(term159653, term159653.getClass(), "tapGood", -1927909925);
        setIntField(term159653, term159653.getClass(), "tapBad", 1958603938);
        setIntField(term159653, term159653.getClass(), "holdPerfect", -1768157509);
        setIntField(term159653, term159653.getClass(), "holdGreat", -2024892419);
        setIntField(term159653, term159653.getClass(), "holdGood", -1810027047);
        setIntField(term159653, term159653.getClass(), "holdBad", 1864442883);
        setIntField(term159653, term159653.getClass(), "slidePerfect", -817215280);
        setIntField(term159653, term159653.getClass(), "slideGreat", 2131309717);
        setIntField(term159653, term159653.getClass(), "slideGood", -2017546060);
        setIntField(term159653, term159653.getClass(), "slideBad", -79051975);
        setIntField(term159653, term159653.getClass(), "breakPerfect", -1410823118);
        setIntField(term159653, term159653.getClass(), "breakGreat", -248395247);
        setIntField(term159653, term159653.getClass(), "breakGood", 1561540215);
        setIntField(term159653, term159653.getClass(), "breakBad", -806864553);
        setBooleanField(term159653, term159653.getClass(), "isTrackSkip", false);
        setBooleanField(term159653, term159653.getClass(), "isHighScore", true);
        setBooleanField(term159653, term159653.getClass(), "isChallengeTrack", false);
        setIntField(term159653, term159653.getClass(), "challengeLife", -955709032);
        setIntField(term159653, term159653.getClass(), "challengeRemain", 400962153);
        setIntField(term159653, term159653.getClass(), "isAllPerfectPlus", 14906503);
        term159965 = new Integer(1996758002);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term159965;
        callMethod(klass, "setMaxCombo", argTypes, term159653, args);
    }

};


