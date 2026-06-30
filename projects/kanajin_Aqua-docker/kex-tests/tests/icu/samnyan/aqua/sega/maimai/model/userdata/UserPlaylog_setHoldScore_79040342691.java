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

public class UserPlaylog_setHoldScore_79040342691 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155805;
     Object term156117;

    public UserPlaylog_setHoldScore_79040342691() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term155811 = new Long(-599981502351912419L);
        term155805 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term155807 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term155809 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term155825 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term155826 = newInstance(Class.forName("java.time.LocalDate"));
        Object term155830 = newInstance(Class.forName("java.time.LocalTime"));
        Object term155835 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term155836 = newInstance(Class.forName("java.time.LocalDate"));
        Object term155840 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term155805, term155805.getClass(), "id", -1131029419147589872L);
        setLongField(term155807, term155807.getClass(), "id", -5753794060274661933L);
        setLongField(term155809, term155809.getClass(), "id", -631692052300282581L);
        setField(term155809, term155809.getClass(), "extId", term155811);
        setField(term155809, term155809.getClass(), "luid", "MiDxSLYCkN");
        setIntField(term155826, term155826.getClass(), "year", 2028);
        setShortField(term155826, term155826.getClass(), "month", (short) 12);
        setShortField(term155826, term155826.getClass(), "day", (short) 5);
        setField(term155825, term155825.getClass(), "date", term155826);
        setByteField(term155830, term155830.getClass(), "hour", (byte) 0);
        setByteField(term155830, term155830.getClass(), "minute", (byte) 4);
        setByteField(term155830, term155830.getClass(), "second", (byte) 24);
        setIntField(term155830, term155830.getClass(), "nano", 25841507);
        setField(term155825, term155825.getClass(), "time", term155830);
        setField(term155809, term155809.getClass(), "registerTime", term155825);
        setIntField(term155836, term155836.getClass(), "year", 2012);
        setShortField(term155836, term155836.getClass(), "month", (short) 2);
        setShortField(term155836, term155836.getClass(), "day", (short) 25);
        setField(term155835, term155835.getClass(), "date", term155836);
        setByteField(term155840, term155840.getClass(), "hour", (byte) 23);
        setByteField(term155840, term155840.getClass(), "minute", (byte) 35);
        setByteField(term155840, term155840.getClass(), "second", (byte) 51);
        setIntField(term155840, term155840.getClass(), "nano", 181227985);
        setField(term155835, term155835.getClass(), "time", term155840);
        setField(term155809, term155809.getClass(), "accessTime", term155835);
        setField(term155807, term155807.getClass(), "card", term155809);
        setIntField(term155807, term155807.getClass(), "lastDataVersion", 1469505004);
        setField(term155807, term155807.getClass(), "userName", "olwpoCLMLH");
        setIntField(term155807, term155807.getClass(), "point", 1024585112);
        setIntField(term155807, term155807.getClass(), "totalPoint", 372142792);
        setIntField(term155807, term155807.getClass(), "iconId", 1971050169);
        setIntField(term155807, term155807.getClass(), "nameplateId", -625449392);
        setIntField(term155807, term155807.getClass(), "frameId", 2067759588);
        setIntField(term155807, term155807.getClass(), "trophyId", -1917179196);
        setIntField(term155807, term155807.getClass(), "playCount", 1620438682);
        setIntField(term155807, term155807.getClass(), "playVsCount", 882806928);
        setIntField(term155807, term155807.getClass(), "playSyncCount", -1786596384);
        setIntField(term155807, term155807.getClass(), "winCount", 1876898307);
        setIntField(term155807, term155807.getClass(), "helpCount", 487328364);
        setIntField(term155807, term155807.getClass(), "comboCount", 1991437599);
        setIntField(term155807, term155807.getClass(), "feverCount", 1953045024);
        setIntField(term155807, term155807.getClass(), "totalHiScore", -79967142);
        setIntField(term155807, term155807.getClass(), "totalEasyHighScore", 833764735);
        setIntField(term155807, term155807.getClass(), "totalBasicHighScore", 380579207);
        setIntField(term155807, term155807.getClass(), "totalAdvancedHighScore", -1067753677);
        setIntField(term155807, term155807.getClass(), "totalExpertHighScore", -1041322431);
        setIntField(term155807, term155807.getClass(), "totalMasterHighScore", 595036388);
        setIntField(term155807, term155807.getClass(), "totalReMasterHighScore", -1216776308);
        setIntField(term155807, term155807.getClass(), "totalHighSync", 927924212);
        setIntField(term155807, term155807.getClass(), "totalEasySync", 615808657);
        setIntField(term155807, term155807.getClass(), "totalBasicSync", -63163432);
        setIntField(term155807, term155807.getClass(), "totalAdvancedSync", 1221609105);
        setIntField(term155807, term155807.getClass(), "totalExpertSync", 363141920);
        setIntField(term155807, term155807.getClass(), "totalMasterSync", -592105330);
        setIntField(term155807, term155807.getClass(), "totalReMasterSync", -372197510);
        setIntField(term155807, term155807.getClass(), "playerRating", 596148027);
        setIntField(term155807, term155807.getClass(), "highestRating", 896411177);
        setIntField(term155807, term155807.getClass(), "rankAuthTailId", -1421968856);
        setField(term155807, term155807.getClass(), "eventWatchedDate", "aigtpfubEk");
        setField(term155807, term155807.getClass(), "webLimitDate", "VkDDJVqlRm");
        setIntField(term155807, term155807.getClass(), "challengeTrackPhase", -1790234172);
        setIntField(term155807, term155807.getClass(), "firstPlayBits", -1893295788);
        setField(term155807, term155807.getClass(), "lastPlayDate", "SUGqIJvCrc");
        setIntField(term155807, term155807.getClass(), "lastPlaceId", -495740087);
        setField(term155807, term155807.getClass(), "lastPlaceName", "TrQnxgLKzu");
        setIntField(term155807, term155807.getClass(), "lastRegionId", 649652861);
        setField(term155807, term155807.getClass(), "lastRegionName", "MsenaDqyDy");
        setField(term155807, term155807.getClass(), "lastClientId", "rKQXUHZdfd");
        setField(term155807, term155807.getClass(), "lastCountryCode", "gBuTBlOYRS");
        setIntField(term155807, term155807.getClass(), "eventPoint", -749956168);
        setIntField(term155807, term155807.getClass(), "totalLv", -1496972303);
        setIntField(term155807, term155807.getClass(), "lastLoginBonusDay", -1109003047);
        setIntField(term155807, term155807.getClass(), "lastSurvivalBonusDay", -2064030558);
        setIntField(term155807, term155807.getClass(), "loginBonusLv", 565051097);
        setField(term155805, term155805.getClass(), "user", term155807);
        setIntField(term155805, term155805.getClass(), "orderId", 1557145557);
        setLongField(term155805, term155805.getClass(), "sortNumber", -2145666439433256886L);
        setIntField(term155805, term155805.getClass(), "placeId", -1415673374);
        setField(term155805, term155805.getClass(), "placeName", "mywuLwqGWK");
        setField(term155805, term155805.getClass(), "country", "ZySPRbJHwO");
        setIntField(term155805, term155805.getClass(), "regionId", 2095645347);
        setField(term155805, term155805.getClass(), "playDate", "qVZzWMIpdZ");
        setField(term155805, term155805.getClass(), "userPlayDate", "RVyPHqsjIQ");
        setIntField(term155805, term155805.getClass(), "musicId", 1369572828);
        setIntField(term155805, term155805.getClass(), "level", -1992905705);
        setIntField(term155805, term155805.getClass(), "gameMode", -1177935884);
        setIntField(term155805, term155805.getClass(), "rivalNum", 1889117383);
        setIntField(term155805, term155805.getClass(), "track", -170081121);
        setIntField(term155805, term155805.getClass(), "eventId", -2097487613);
        setBooleanField(term155805, term155805.getClass(), "isFreeToPlay", false);
        setIntField(term155805, term155805.getClass(), "playerRating", 1808418358);
        setLongField(term155805, term155805.getClass(), "playedUserId1", 4364197754861747163L);
        setField(term155805, term155805.getClass(), "playedUserName1", "HInKycRClK");
        setIntField(term155805, term155805.getClass(), "playedMusicLevel1", 360558872);
        setLongField(term155805, term155805.getClass(), "playedUserId2", -2350743764086921250L);
        setField(term155805, term155805.getClass(), "playedUserName2", "ovWYiKLJPi");
        setIntField(term155805, term155805.getClass(), "playedMusicLevel2", 504431450);
        setLongField(term155805, term155805.getClass(), "playedUserId3", 6024204865305504328L);
        setField(term155805, term155805.getClass(), "playedUserName3", "KqOycFiFAf");
        setIntField(term155805, term155805.getClass(), "playedMusicLevel3", -301566658);
        setIntField(term155805, term155805.getClass(), "achievement", 1198050750);
        setIntField(term155805, term155805.getClass(), "score", -1763850463);
        setIntField(term155805, term155805.getClass(), "tapScore", 1933564179);
        setIntField(term155805, term155805.getClass(), "holdScore", -1342711508);
        setIntField(term155805, term155805.getClass(), "slideScore", 156889890);
        setIntField(term155805, term155805.getClass(), "breakScore", -1894814727);
        setIntField(term155805, term155805.getClass(), "syncRate", 2117828951);
        setIntField(term155805, term155805.getClass(), "vsWin", -1681460075);
        setBooleanField(term155805, term155805.getClass(), "isAllPerfect", false);
        setIntField(term155805, term155805.getClass(), "fullCombo", 1623133519);
        setIntField(term155805, term155805.getClass(), "maxFever", 1251734144);
        setIntField(term155805, term155805.getClass(), "maxCombo", 1251301670);
        setIntField(term155805, term155805.getClass(), "tapPerfect", 1800213126);
        setIntField(term155805, term155805.getClass(), "tapGreat", 2049234328);
        setIntField(term155805, term155805.getClass(), "tapGood", 901194728);
        setIntField(term155805, term155805.getClass(), "tapBad", 1866086190);
        setIntField(term155805, term155805.getClass(), "holdPerfect", 1225074549);
        setIntField(term155805, term155805.getClass(), "holdGreat", 1184210193);
        setIntField(term155805, term155805.getClass(), "holdGood", 2086235255);
        setIntField(term155805, term155805.getClass(), "holdBad", -92302532);
        setIntField(term155805, term155805.getClass(), "slidePerfect", 436721064);
        setIntField(term155805, term155805.getClass(), "slideGreat", 738788126);
        setIntField(term155805, term155805.getClass(), "slideGood", 810127498);
        setIntField(term155805, term155805.getClass(), "slideBad", -1265159953);
        setIntField(term155805, term155805.getClass(), "breakPerfect", 714658774);
        setIntField(term155805, term155805.getClass(), "breakGreat", 1593835846);
        setIntField(term155805, term155805.getClass(), "breakGood", 1654533596);
        setIntField(term155805, term155805.getClass(), "breakBad", 2022064558);
        setBooleanField(term155805, term155805.getClass(), "isTrackSkip", true);
        setBooleanField(term155805, term155805.getClass(), "isHighScore", false);
        setBooleanField(term155805, term155805.getClass(), "isChallengeTrack", true);
        setIntField(term155805, term155805.getClass(), "challengeLife", -53372402);
        setIntField(term155805, term155805.getClass(), "challengeRemain", 1387618380);
        setIntField(term155805, term155805.getClass(), "isAllPerfectPlus", -1207988984);
        term156117 = new Integer(337129947);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term156117;
        callMethod(klass, "setHoldScore", argTypes, term155805, args);
    }

};


