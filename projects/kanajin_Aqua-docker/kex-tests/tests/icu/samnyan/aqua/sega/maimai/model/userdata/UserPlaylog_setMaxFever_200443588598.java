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

public class UserPlaylog_setMaxFever_200443588598 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159123;
     Object term159435;

    public UserPlaylog_setMaxFever_200443588598() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term159129 = new Long(-1647156882669215876L);
        term159123 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term159125 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term159127 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term159143 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term159144 = newInstance(Class.forName("java.time.LocalDate"));
        Object term159148 = newInstance(Class.forName("java.time.LocalTime"));
        Object term159153 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term159154 = newInstance(Class.forName("java.time.LocalDate"));
        Object term159158 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term159123, term159123.getClass(), "id", 3881903610132068684L);
        setLongField(term159125, term159125.getClass(), "id", -1517313114689915067L);
        setLongField(term159127, term159127.getClass(), "id", -8963879630647796485L);
        setField(term159127, term159127.getClass(), "extId", term159129);
        setField(term159127, term159127.getClass(), "luid", "zEsjjlIKrF");
        setIntField(term159144, term159144.getClass(), "year", 2028);
        setShortField(term159144, term159144.getClass(), "month", (short) 10);
        setShortField(term159144, term159144.getClass(), "day", (short) 11);
        setField(term159143, term159143.getClass(), "date", term159144);
        setByteField(term159148, term159148.getClass(), "hour", (byte) 1);
        setByteField(term159148, term159148.getClass(), "minute", (byte) 5);
        setByteField(term159148, term159148.getClass(), "second", (byte) 29);
        setIntField(term159148, term159148.getClass(), "nano", 688086203);
        setField(term159143, term159143.getClass(), "time", term159148);
        setField(term159127, term159127.getClass(), "registerTime", term159143);
        setIntField(term159154, term159154.getClass(), "year", 2029);
        setShortField(term159154, term159154.getClass(), "month", (short) 4);
        setShortField(term159154, term159154.getClass(), "day", (short) 26);
        setField(term159153, term159153.getClass(), "date", term159154);
        setByteField(term159158, term159158.getClass(), "hour", (byte) 19);
        setByteField(term159158, term159158.getClass(), "minute", (byte) 30);
        setByteField(term159158, term159158.getClass(), "second", (byte) 13);
        setIntField(term159158, term159158.getClass(), "nano", 883683186);
        setField(term159153, term159153.getClass(), "time", term159158);
        setField(term159127, term159127.getClass(), "accessTime", term159153);
        setField(term159125, term159125.getClass(), "card", term159127);
        setIntField(term159125, term159125.getClass(), "lastDataVersion", 989278096);
        setField(term159125, term159125.getClass(), "userName", "XeoSSCwSfl");
        setIntField(term159125, term159125.getClass(), "point", -247741903);
        setIntField(term159125, term159125.getClass(), "totalPoint", 1246330116);
        setIntField(term159125, term159125.getClass(), "iconId", -1044496905);
        setIntField(term159125, term159125.getClass(), "nameplateId", 1084043512);
        setIntField(term159125, term159125.getClass(), "frameId", 1355022325);
        setIntField(term159125, term159125.getClass(), "trophyId", 657074036);
        setIntField(term159125, term159125.getClass(), "playCount", -2106646820);
        setIntField(term159125, term159125.getClass(), "playVsCount", -1140904008);
        setIntField(term159125, term159125.getClass(), "playSyncCount", 1306218220);
        setIntField(term159125, term159125.getClass(), "winCount", -468687349);
        setIntField(term159125, term159125.getClass(), "helpCount", 839051595);
        setIntField(term159125, term159125.getClass(), "comboCount", -171412415);
        setIntField(term159125, term159125.getClass(), "feverCount", 733242781);
        setIntField(term159125, term159125.getClass(), "totalHiScore", 1881988571);
        setIntField(term159125, term159125.getClass(), "totalEasyHighScore", -870499765);
        setIntField(term159125, term159125.getClass(), "totalBasicHighScore", -39397335);
        setIntField(term159125, term159125.getClass(), "totalAdvancedHighScore", -704744943);
        setIntField(term159125, term159125.getClass(), "totalExpertHighScore", -1432282136);
        setIntField(term159125, term159125.getClass(), "totalMasterHighScore", -1443771952);
        setIntField(term159125, term159125.getClass(), "totalReMasterHighScore", 589229340);
        setIntField(term159125, term159125.getClass(), "totalHighSync", 1864951734);
        setIntField(term159125, term159125.getClass(), "totalEasySync", 1720260418);
        setIntField(term159125, term159125.getClass(), "totalBasicSync", 127845692);
        setIntField(term159125, term159125.getClass(), "totalAdvancedSync", -737730800);
        setIntField(term159125, term159125.getClass(), "totalExpertSync", 1266403206);
        setIntField(term159125, term159125.getClass(), "totalMasterSync", -565034923);
        setIntField(term159125, term159125.getClass(), "totalReMasterSync", 1366543913);
        setIntField(term159125, term159125.getClass(), "playerRating", 559302076);
        setIntField(term159125, term159125.getClass(), "highestRating", -1029061016);
        setIntField(term159125, term159125.getClass(), "rankAuthTailId", 1503900030);
        setField(term159125, term159125.getClass(), "eventWatchedDate", "adcoGovSer");
        setField(term159125, term159125.getClass(), "webLimitDate", "DZqXfiKqtE");
        setIntField(term159125, term159125.getClass(), "challengeTrackPhase", -2082234011);
        setIntField(term159125, term159125.getClass(), "firstPlayBits", 616913226);
        setField(term159125, term159125.getClass(), "lastPlayDate", "YOsqpIMuey");
        setIntField(term159125, term159125.getClass(), "lastPlaceId", 1811150294);
        setField(term159125, term159125.getClass(), "lastPlaceName", "dfJffzsKZe");
        setIntField(term159125, term159125.getClass(), "lastRegionId", -2126490398);
        setField(term159125, term159125.getClass(), "lastRegionName", "dTgyMBkwWX");
        setField(term159125, term159125.getClass(), "lastClientId", "mhIqZywfDK");
        setField(term159125, term159125.getClass(), "lastCountryCode", "MXPBuilyzu");
        setIntField(term159125, term159125.getClass(), "eventPoint", -935679427);
        setIntField(term159125, term159125.getClass(), "totalLv", 2106277450);
        setIntField(term159125, term159125.getClass(), "lastLoginBonusDay", -1874013505);
        setIntField(term159125, term159125.getClass(), "lastSurvivalBonusDay", -377154693);
        setIntField(term159125, term159125.getClass(), "loginBonusLv", -1995110914);
        setField(term159123, term159123.getClass(), "user", term159125);
        setIntField(term159123, term159123.getClass(), "orderId", -1015751446);
        setLongField(term159123, term159123.getClass(), "sortNumber", -4359906070460003487L);
        setIntField(term159123, term159123.getClass(), "placeId", 1281547949);
        setField(term159123, term159123.getClass(), "placeName", "CHVVqdbuYH");
        setField(term159123, term159123.getClass(), "country", "rLNYIbBxpb");
        setIntField(term159123, term159123.getClass(), "regionId", 2075287923);
        setField(term159123, term159123.getClass(), "playDate", "kdvVBzzgOS");
        setField(term159123, term159123.getClass(), "userPlayDate", "cwXRILYula");
        setIntField(term159123, term159123.getClass(), "musicId", -1875723336);
        setIntField(term159123, term159123.getClass(), "level", 1158346596);
        setIntField(term159123, term159123.getClass(), "gameMode", -799463638);
        setIntField(term159123, term159123.getClass(), "rivalNum", -380519500);
        setIntField(term159123, term159123.getClass(), "track", 1945185349);
        setIntField(term159123, term159123.getClass(), "eventId", 2056942519);
        setBooleanField(term159123, term159123.getClass(), "isFreeToPlay", false);
        setIntField(term159123, term159123.getClass(), "playerRating", -696885408);
        setLongField(term159123, term159123.getClass(), "playedUserId1", 3290224539925725962L);
        setField(term159123, term159123.getClass(), "playedUserName1", "GRIytmuHxn");
        setIntField(term159123, term159123.getClass(), "playedMusicLevel1", 1627187903);
        setLongField(term159123, term159123.getClass(), "playedUserId2", -4048501682703538382L);
        setField(term159123, term159123.getClass(), "playedUserName2", "kTzFRQAqyW");
        setIntField(term159123, term159123.getClass(), "playedMusicLevel2", 161283721);
        setLongField(term159123, term159123.getClass(), "playedUserId3", -8292962776344200146L);
        setField(term159123, term159123.getClass(), "playedUserName3", "VHZcekDeFJ");
        setIntField(term159123, term159123.getClass(), "playedMusicLevel3", 336268441);
        setIntField(term159123, term159123.getClass(), "achievement", 595161087);
        setIntField(term159123, term159123.getClass(), "score", -1982456131);
        setIntField(term159123, term159123.getClass(), "tapScore", -1690301446);
        setIntField(term159123, term159123.getClass(), "holdScore", 1706794411);
        setIntField(term159123, term159123.getClass(), "slideScore", 617390435);
        setIntField(term159123, term159123.getClass(), "breakScore", -396543789);
        setIntField(term159123, term159123.getClass(), "syncRate", -406646430);
        setIntField(term159123, term159123.getClass(), "vsWin", -1470464274);
        setBooleanField(term159123, term159123.getClass(), "isAllPerfect", true);
        setIntField(term159123, term159123.getClass(), "fullCombo", 1757332469);
        setIntField(term159123, term159123.getClass(), "maxFever", 1564464570);
        setIntField(term159123, term159123.getClass(), "maxCombo", 594749411);
        setIntField(term159123, term159123.getClass(), "tapPerfect", 606315381);
        setIntField(term159123, term159123.getClass(), "tapGreat", 1031535312);
        setIntField(term159123, term159123.getClass(), "tapGood", 1653009806);
        setIntField(term159123, term159123.getClass(), "tapBad", 829901371);
        setIntField(term159123, term159123.getClass(), "holdPerfect", 274034524);
        setIntField(term159123, term159123.getClass(), "holdGreat", -1560933208);
        setIntField(term159123, term159123.getClass(), "holdGood", 241048805);
        setIntField(term159123, term159123.getClass(), "holdBad", -1799198135);
        setIntField(term159123, term159123.getClass(), "slidePerfect", -146245384);
        setIntField(term159123, term159123.getClass(), "slideGreat", 1954963175);
        setIntField(term159123, term159123.getClass(), "slideGood", 299756323);
        setIntField(term159123, term159123.getClass(), "slideBad", 1423104720);
        setIntField(term159123, term159123.getClass(), "breakPerfect", -1918523057);
        setIntField(term159123, term159123.getClass(), "breakGreat", 789708568);
        setIntField(term159123, term159123.getClass(), "breakGood", -687627765);
        setIntField(term159123, term159123.getClass(), "breakBad", -2141712007);
        setBooleanField(term159123, term159123.getClass(), "isTrackSkip", true);
        setBooleanField(term159123, term159123.getClass(), "isHighScore", false);
        setBooleanField(term159123, term159123.getClass(), "isChallengeTrack", false);
        setIntField(term159123, term159123.getClass(), "challengeLife", -1829146678);
        setIntField(term159123, term159123.getClass(), "challengeRemain", -1843765624);
        setIntField(term159123, term159123.getClass(), "isAllPerfectPlus", 1352043161);
        term159435 = new Integer(-1847327458);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term159435;
        callMethod(klass, "setMaxFever", argTypes, term159123, args);
    }

};


