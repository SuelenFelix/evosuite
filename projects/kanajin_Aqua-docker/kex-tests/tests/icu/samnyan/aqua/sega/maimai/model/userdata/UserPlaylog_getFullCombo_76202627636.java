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

public class UserPlaylog_getFullCombo_76202627636 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129383;

    public UserPlaylog_getFullCombo_76202627636() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term129389 = new Long(-4003544865306793676L);
        term129383 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term129385 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term129387 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term129403 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term129404 = newInstance(Class.forName("java.time.LocalDate"));
        Object term129408 = newInstance(Class.forName("java.time.LocalTime"));
        Object term129413 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term129414 = newInstance(Class.forName("java.time.LocalDate"));
        Object term129418 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term129383, term129383.getClass(), "id", -4618196261828717815L);
        setLongField(term129385, term129385.getClass(), "id", -1396670214756396961L);
        setLongField(term129387, term129387.getClass(), "id", 1795641040165405529L);
        setField(term129387, term129387.getClass(), "extId", term129389);
        setField(term129387, term129387.getClass(), "luid", "VnHgyPgIAn");
        setIntField(term129404, term129404.getClass(), "year", 2018);
        setShortField(term129404, term129404.getClass(), "month", (short) 2);
        setShortField(term129404, term129404.getClass(), "day", (short) 20);
        setField(term129403, term129403.getClass(), "date", term129404);
        setByteField(term129408, term129408.getClass(), "hour", (byte) 11);
        setByteField(term129408, term129408.getClass(), "minute", (byte) 56);
        setByteField(term129408, term129408.getClass(), "second", (byte) 7);
        setIntField(term129408, term129408.getClass(), "nano", 207490568);
        setField(term129403, term129403.getClass(), "time", term129408);
        setField(term129387, term129387.getClass(), "registerTime", term129403);
        setIntField(term129414, term129414.getClass(), "year", 2022);
        setShortField(term129414, term129414.getClass(), "month", (short) 7);
        setShortField(term129414, term129414.getClass(), "day", (short) 12);
        setField(term129413, term129413.getClass(), "date", term129414);
        setByteField(term129418, term129418.getClass(), "hour", (byte) 1);
        setByteField(term129418, term129418.getClass(), "minute", (byte) 2);
        setByteField(term129418, term129418.getClass(), "second", (byte) 5);
        setIntField(term129418, term129418.getClass(), "nano", 25761524);
        setField(term129413, term129413.getClass(), "time", term129418);
        setField(term129387, term129387.getClass(), "accessTime", term129413);
        setField(term129385, term129385.getClass(), "card", term129387);
        setIntField(term129385, term129385.getClass(), "lastDataVersion", 1563502930);
        setField(term129385, term129385.getClass(), "userName", "EIkLuLTIDO");
        setIntField(term129385, term129385.getClass(), "point", -1763493297);
        setIntField(term129385, term129385.getClass(), "totalPoint", 1559779370);
        setIntField(term129385, term129385.getClass(), "iconId", 369095015);
        setIntField(term129385, term129385.getClass(), "nameplateId", 905536730);
        setIntField(term129385, term129385.getClass(), "frameId", 1579733651);
        setIntField(term129385, term129385.getClass(), "trophyId", 734712664);
        setIntField(term129385, term129385.getClass(), "playCount", 1380507045);
        setIntField(term129385, term129385.getClass(), "playVsCount", -817128051);
        setIntField(term129385, term129385.getClass(), "playSyncCount", 1221899586);
        setIntField(term129385, term129385.getClass(), "winCount", 1587152573);
        setIntField(term129385, term129385.getClass(), "helpCount", 374759994);
        setIntField(term129385, term129385.getClass(), "comboCount", 1614709177);
        setIntField(term129385, term129385.getClass(), "feverCount", 966660807);
        setIntField(term129385, term129385.getClass(), "totalHiScore", 491650010);
        setIntField(term129385, term129385.getClass(), "totalEasyHighScore", -288034028);
        setIntField(term129385, term129385.getClass(), "totalBasicHighScore", 701792790);
        setIntField(term129385, term129385.getClass(), "totalAdvancedHighScore", -1716961612);
        setIntField(term129385, term129385.getClass(), "totalExpertHighScore", 676440749);
        setIntField(term129385, term129385.getClass(), "totalMasterHighScore", -1284761868);
        setIntField(term129385, term129385.getClass(), "totalReMasterHighScore", -1743993538);
        setIntField(term129385, term129385.getClass(), "totalHighSync", -1368813525);
        setIntField(term129385, term129385.getClass(), "totalEasySync", -309765050);
        setIntField(term129385, term129385.getClass(), "totalBasicSync", 145184885);
        setIntField(term129385, term129385.getClass(), "totalAdvancedSync", -2108989861);
        setIntField(term129385, term129385.getClass(), "totalExpertSync", 756442239);
        setIntField(term129385, term129385.getClass(), "totalMasterSync", 414458522);
        setIntField(term129385, term129385.getClass(), "totalReMasterSync", -1165049012);
        setIntField(term129385, term129385.getClass(), "playerRating", 830585633);
        setIntField(term129385, term129385.getClass(), "highestRating", 563816474);
        setIntField(term129385, term129385.getClass(), "rankAuthTailId", 2043443606);
        setField(term129385, term129385.getClass(), "eventWatchedDate", "rQFJbYZksA");
        setField(term129385, term129385.getClass(), "webLimitDate", "jndrnlnwbO");
        setIntField(term129385, term129385.getClass(), "challengeTrackPhase", 2062774736);
        setIntField(term129385, term129385.getClass(), "firstPlayBits", 463174911);
        setField(term129385, term129385.getClass(), "lastPlayDate", "qdFzHeHbQc");
        setIntField(term129385, term129385.getClass(), "lastPlaceId", -620459616);
        setField(term129385, term129385.getClass(), "lastPlaceName", "EcxYliBmNQ");
        setIntField(term129385, term129385.getClass(), "lastRegionId", 682190199);
        setField(term129385, term129385.getClass(), "lastRegionName", "MGbwgunHMQ");
        setField(term129385, term129385.getClass(), "lastClientId", "wCgQVdppSI");
        setField(term129385, term129385.getClass(), "lastCountryCode", "oQWxaFnrYq");
        setIntField(term129385, term129385.getClass(), "eventPoint", -1682379076);
        setIntField(term129385, term129385.getClass(), "totalLv", 994259344);
        setIntField(term129385, term129385.getClass(), "lastLoginBonusDay", -1427424428);
        setIntField(term129385, term129385.getClass(), "lastSurvivalBonusDay", -278748584);
        setIntField(term129385, term129385.getClass(), "loginBonusLv", -1834193100);
        setField(term129383, term129383.getClass(), "user", term129385);
        setIntField(term129383, term129383.getClass(), "orderId", -2074763689);
        setLongField(term129383, term129383.getClass(), "sortNumber", 6002848910891080375L);
        setIntField(term129383, term129383.getClass(), "placeId", -226564422);
        setField(term129383, term129383.getClass(), "placeName", "uZcUOSgoMp");
        setField(term129383, term129383.getClass(), "country", "eMxNpewLIS");
        setIntField(term129383, term129383.getClass(), "regionId", -2112898804);
        setField(term129383, term129383.getClass(), "playDate", "GxNdoXawUZ");
        setField(term129383, term129383.getClass(), "userPlayDate", "YAFTYAtere");
        setIntField(term129383, term129383.getClass(), "musicId", 1845963013);
        setIntField(term129383, term129383.getClass(), "level", 395416491);
        setIntField(term129383, term129383.getClass(), "gameMode", 752498302);
        setIntField(term129383, term129383.getClass(), "rivalNum", 1000541485);
        setIntField(term129383, term129383.getClass(), "track", 1590249777);
        setIntField(term129383, term129383.getClass(), "eventId", -1635943696);
        setBooleanField(term129383, term129383.getClass(), "isFreeToPlay", true);
        setIntField(term129383, term129383.getClass(), "playerRating", 2104695444);
        setLongField(term129383, term129383.getClass(), "playedUserId1", 1959851788493022882L);
        setField(term129383, term129383.getClass(), "playedUserName1", "EYQnrjiZfX");
        setIntField(term129383, term129383.getClass(), "playedMusicLevel1", -1440794507);
        setLongField(term129383, term129383.getClass(), "playedUserId2", -8272873308287230741L);
        setField(term129383, term129383.getClass(), "playedUserName2", "xydFPTvtMs");
        setIntField(term129383, term129383.getClass(), "playedMusicLevel2", 1693404841);
        setLongField(term129383, term129383.getClass(), "playedUserId3", -1471967517386315328L);
        setField(term129383, term129383.getClass(), "playedUserName3", "lopARHjeMT");
        setIntField(term129383, term129383.getClass(), "playedMusicLevel3", 844829703);
        setIntField(term129383, term129383.getClass(), "achievement", 1091087007);
        setIntField(term129383, term129383.getClass(), "score", 1769359180);
        setIntField(term129383, term129383.getClass(), "tapScore", 1096535388);
        setIntField(term129383, term129383.getClass(), "holdScore", -1584065017);
        setIntField(term129383, term129383.getClass(), "slideScore", 1503808151);
        setIntField(term129383, term129383.getClass(), "breakScore", -1186485599);
        setIntField(term129383, term129383.getClass(), "syncRate", -1502880400);
        setIntField(term129383, term129383.getClass(), "vsWin", 93955884);
        setBooleanField(term129383, term129383.getClass(), "isAllPerfect", true);
        setIntField(term129383, term129383.getClass(), "fullCombo", 1900672421);
        setIntField(term129383, term129383.getClass(), "maxFever", 128643836);
        setIntField(term129383, term129383.getClass(), "maxCombo", 1120713422);
        setIntField(term129383, term129383.getClass(), "tapPerfect", -758128625);
        setIntField(term129383, term129383.getClass(), "tapGreat", 1701172049);
        setIntField(term129383, term129383.getClass(), "tapGood", -679302956);
        setIntField(term129383, term129383.getClass(), "tapBad", -2037557020);
        setIntField(term129383, term129383.getClass(), "holdPerfect", -1132081641);
        setIntField(term129383, term129383.getClass(), "holdGreat", 70482654);
        setIntField(term129383, term129383.getClass(), "holdGood", 78894621);
        setIntField(term129383, term129383.getClass(), "holdBad", -1060180315);
        setIntField(term129383, term129383.getClass(), "slidePerfect", -2103989969);
        setIntField(term129383, term129383.getClass(), "slideGreat", 1898547444);
        setIntField(term129383, term129383.getClass(), "slideGood", 1498682661);
        setIntField(term129383, term129383.getClass(), "slideBad", -1994146092);
        setIntField(term129383, term129383.getClass(), "breakPerfect", -1922551623);
        setIntField(term129383, term129383.getClass(), "breakGreat", -97883265);
        setIntField(term129383, term129383.getClass(), "breakGood", -1515636576);
        setIntField(term129383, term129383.getClass(), "breakBad", -220487550);
        setBooleanField(term129383, term129383.getClass(), "isTrackSkip", true);
        setBooleanField(term129383, term129383.getClass(), "isHighScore", true);
        setBooleanField(term129383, term129383.getClass(), "isChallengeTrack", false);
        setIntField(term129383, term129383.getClass(), "challengeLife", -640851007);
        setIntField(term129383, term129383.getClass(), "challengeRemain", 549291991);
        setIntField(term129383, term129383.getClass(), "isAllPerfectPlus", 1727193345);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFullCombo", argTypes, term129383, args);
    }

};


