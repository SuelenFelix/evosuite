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
import java.lang.Boolean;

public class UserPlaylog_setTrackSkip_434835481116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term167655;
     Object term167967;

    public UserPlaylog_setTrackSkip_434835481116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term167661 = new Long(206360660645917003L);
        term167655 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term167657 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term167659 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term167675 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term167676 = newInstance(Class.forName("java.time.LocalDate"));
        Object term167680 = newInstance(Class.forName("java.time.LocalTime"));
        Object term167685 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term167686 = newInstance(Class.forName("java.time.LocalDate"));
        Object term167690 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term167655, term167655.getClass(), "id", -1294722164117772682L);
        setLongField(term167657, term167657.getClass(), "id", -7742919499730303003L);
        setLongField(term167659, term167659.getClass(), "id", 7937367749233415214L);
        setField(term167659, term167659.getClass(), "extId", term167661);
        setField(term167659, term167659.getClass(), "luid", "JwcYvvKRwe");
        setIntField(term167676, term167676.getClass(), "year", 2022);
        setShortField(term167676, term167676.getClass(), "month", (short) 3);
        setShortField(term167676, term167676.getClass(), "day", (short) 7);
        setField(term167675, term167675.getClass(), "date", term167676);
        setByteField(term167680, term167680.getClass(), "hour", (byte) 12);
        setByteField(term167680, term167680.getClass(), "minute", (byte) 16);
        setByteField(term167680, term167680.getClass(), "second", (byte) 2);
        setIntField(term167680, term167680.getClass(), "nano", 451612574);
        setField(term167675, term167675.getClass(), "time", term167680);
        setField(term167659, term167659.getClass(), "registerTime", term167675);
        setIntField(term167686, term167686.getClass(), "year", 2024);
        setShortField(term167686, term167686.getClass(), "month", (short) 11);
        setShortField(term167686, term167686.getClass(), "day", (short) 20);
        setField(term167685, term167685.getClass(), "date", term167686);
        setByteField(term167690, term167690.getClass(), "hour", (byte) 8);
        setByteField(term167690, term167690.getClass(), "minute", (byte) 8);
        setByteField(term167690, term167690.getClass(), "second", (byte) 34);
        setIntField(term167690, term167690.getClass(), "nano", 291120784);
        setField(term167685, term167685.getClass(), "time", term167690);
        setField(term167659, term167659.getClass(), "accessTime", term167685);
        setField(term167657, term167657.getClass(), "card", term167659);
        setIntField(term167657, term167657.getClass(), "lastDataVersion", -1852167753);
        setField(term167657, term167657.getClass(), "userName", "okLcKGoawO");
        setIntField(term167657, term167657.getClass(), "point", 904581134);
        setIntField(term167657, term167657.getClass(), "totalPoint", 1130902200);
        setIntField(term167657, term167657.getClass(), "iconId", -1394201607);
        setIntField(term167657, term167657.getClass(), "nameplateId", 1573455524);
        setIntField(term167657, term167657.getClass(), "frameId", -1763400835);
        setIntField(term167657, term167657.getClass(), "trophyId", 160711891);
        setIntField(term167657, term167657.getClass(), "playCount", 1578668421);
        setIntField(term167657, term167657.getClass(), "playVsCount", -2002852158);
        setIntField(term167657, term167657.getClass(), "playSyncCount", -1724262929);
        setIntField(term167657, term167657.getClass(), "winCount", -1952919394);
        setIntField(term167657, term167657.getClass(), "helpCount", 817553289);
        setIntField(term167657, term167657.getClass(), "comboCount", 406751635);
        setIntField(term167657, term167657.getClass(), "feverCount", 321495792);
        setIntField(term167657, term167657.getClass(), "totalHiScore", 1501361646);
        setIntField(term167657, term167657.getClass(), "totalEasyHighScore", 1647674293);
        setIntField(term167657, term167657.getClass(), "totalBasicHighScore", -1463168954);
        setIntField(term167657, term167657.getClass(), "totalAdvancedHighScore", -1137477769);
        setIntField(term167657, term167657.getClass(), "totalExpertHighScore", -1988799403);
        setIntField(term167657, term167657.getClass(), "totalMasterHighScore", 1376474833);
        setIntField(term167657, term167657.getClass(), "totalReMasterHighScore", -1644075738);
        setIntField(term167657, term167657.getClass(), "totalHighSync", -1250724277);
        setIntField(term167657, term167657.getClass(), "totalEasySync", -1435876936);
        setIntField(term167657, term167657.getClass(), "totalBasicSync", 41406904);
        setIntField(term167657, term167657.getClass(), "totalAdvancedSync", 1643308628);
        setIntField(term167657, term167657.getClass(), "totalExpertSync", 706240161);
        setIntField(term167657, term167657.getClass(), "totalMasterSync", -627943905);
        setIntField(term167657, term167657.getClass(), "totalReMasterSync", 1364004519);
        setIntField(term167657, term167657.getClass(), "playerRating", 861046709);
        setIntField(term167657, term167657.getClass(), "highestRating", -1744914166);
        setIntField(term167657, term167657.getClass(), "rankAuthTailId", 906584268);
        setField(term167657, term167657.getClass(), "eventWatchedDate", "wuJRunvJUq");
        setField(term167657, term167657.getClass(), "webLimitDate", "lkSPvxhaVR");
        setIntField(term167657, term167657.getClass(), "challengeTrackPhase", -187032905);
        setIntField(term167657, term167657.getClass(), "firstPlayBits", 1584947245);
        setField(term167657, term167657.getClass(), "lastPlayDate", "hVlTtmyLIH");
        setIntField(term167657, term167657.getClass(), "lastPlaceId", -354980213);
        setField(term167657, term167657.getClass(), "lastPlaceName", "utKaBGMcsA");
        setIntField(term167657, term167657.getClass(), "lastRegionId", -1623647602);
        setField(term167657, term167657.getClass(), "lastRegionName", "lmuWGCZjgE");
        setField(term167657, term167657.getClass(), "lastClientId", "cEZMciSNtX");
        setField(term167657, term167657.getClass(), "lastCountryCode", "xRVYXsEcrn");
        setIntField(term167657, term167657.getClass(), "eventPoint", 505830311);
        setIntField(term167657, term167657.getClass(), "totalLv", 1992873484);
        setIntField(term167657, term167657.getClass(), "lastLoginBonusDay", 1375612429);
        setIntField(term167657, term167657.getClass(), "lastSurvivalBonusDay", -1704318634);
        setIntField(term167657, term167657.getClass(), "loginBonusLv", -480834081);
        setField(term167655, term167655.getClass(), "user", term167657);
        setIntField(term167655, term167655.getClass(), "orderId", 1993531080);
        setLongField(term167655, term167655.getClass(), "sortNumber", -356179638846982179L);
        setIntField(term167655, term167655.getClass(), "placeId", -326745097);
        setField(term167655, term167655.getClass(), "placeName", "PwyEzyzkFI");
        setField(term167655, term167655.getClass(), "country", "QyBqhwjZjI");
        setIntField(term167655, term167655.getClass(), "regionId", 472467722);
        setField(term167655, term167655.getClass(), "playDate", "WTJsUQWrPu");
        setField(term167655, term167655.getClass(), "userPlayDate", "IwDJSFYrvd");
        setIntField(term167655, term167655.getClass(), "musicId", 2128617137);
        setIntField(term167655, term167655.getClass(), "level", -1159330323);
        setIntField(term167655, term167655.getClass(), "gameMode", 1179306009);
        setIntField(term167655, term167655.getClass(), "rivalNum", 1486204313);
        setIntField(term167655, term167655.getClass(), "track", -1032722719);
        setIntField(term167655, term167655.getClass(), "eventId", -275943600);
        setBooleanField(term167655, term167655.getClass(), "isFreeToPlay", true);
        setIntField(term167655, term167655.getClass(), "playerRating", -2043066933);
        setLongField(term167655, term167655.getClass(), "playedUserId1", 1394860434350482902L);
        setField(term167655, term167655.getClass(), "playedUserName1", "zIcvqyfLta");
        setIntField(term167655, term167655.getClass(), "playedMusicLevel1", -982846897);
        setLongField(term167655, term167655.getClass(), "playedUserId2", 828765974823196503L);
        setField(term167655, term167655.getClass(), "playedUserName2", "HAReZkXopn");
        setIntField(term167655, term167655.getClass(), "playedMusicLevel2", 1537837415);
        setLongField(term167655, term167655.getClass(), "playedUserId3", 2517346858311378765L);
        setField(term167655, term167655.getClass(), "playedUserName3", "clSasMmBlm");
        setIntField(term167655, term167655.getClass(), "playedMusicLevel3", 444352650);
        setIntField(term167655, term167655.getClass(), "achievement", -673430955);
        setIntField(term167655, term167655.getClass(), "score", 451553897);
        setIntField(term167655, term167655.getClass(), "tapScore", 1017248371);
        setIntField(term167655, term167655.getClass(), "holdScore", 1548443044);
        setIntField(term167655, term167655.getClass(), "slideScore", 1788691857);
        setIntField(term167655, term167655.getClass(), "breakScore", -2048203029);
        setIntField(term167655, term167655.getClass(), "syncRate", 1876947632);
        setIntField(term167655, term167655.getClass(), "vsWin", 1664009487);
        setBooleanField(term167655, term167655.getClass(), "isAllPerfect", false);
        setIntField(term167655, term167655.getClass(), "fullCombo", -1634973489);
        setIntField(term167655, term167655.getClass(), "maxFever", -661240399);
        setIntField(term167655, term167655.getClass(), "maxCombo", 636703436);
        setIntField(term167655, term167655.getClass(), "tapPerfect", 1841682134);
        setIntField(term167655, term167655.getClass(), "tapGreat", 183807992);
        setIntField(term167655, term167655.getClass(), "tapGood", 349920708);
        setIntField(term167655, term167655.getClass(), "tapBad", -137577672);
        setIntField(term167655, term167655.getClass(), "holdPerfect", 1352065814);
        setIntField(term167655, term167655.getClass(), "holdGreat", -991547147);
        setIntField(term167655, term167655.getClass(), "holdGood", 2093849839);
        setIntField(term167655, term167655.getClass(), "holdBad", 1131306028);
        setIntField(term167655, term167655.getClass(), "slidePerfect", 65756077);
        setIntField(term167655, term167655.getClass(), "slideGreat", 492457297);
        setIntField(term167655, term167655.getClass(), "slideGood", -1894585711);
        setIntField(term167655, term167655.getClass(), "slideBad", -1920253459);
        setIntField(term167655, term167655.getClass(), "breakPerfect", -1713871568);
        setIntField(term167655, term167655.getClass(), "breakGreat", 1308967452);
        setIntField(term167655, term167655.getClass(), "breakGood", 831562675);
        setIntField(term167655, term167655.getClass(), "breakBad", -770137774);
        setBooleanField(term167655, term167655.getClass(), "isTrackSkip", true);
        setBooleanField(term167655, term167655.getClass(), "isHighScore", true);
        setBooleanField(term167655, term167655.getClass(), "isChallengeTrack", false);
        setIntField(term167655, term167655.getClass(), "challengeLife", 411763491);
        setIntField(term167655, term167655.getClass(), "challengeRemain", -1284795885);
        setIntField(term167655, term167655.getClass(), "isAllPerfectPlus", 1474544732);
        term167967 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term167967;
        callMethod(klass, "setTrackSkip", argTypes, term167655, args);
    }

};


