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

public class UserPlaylog_setMaxFever_200443588599 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159179;
     Object term159491;

    public UserPlaylog_setMaxFever_200443588599() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term159185 = new Long(-1647156882669215876L);
        term159179 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term159181 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term159183 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term159199 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term159200 = newInstance(Class.forName("java.time.LocalDate"));
        Object term159204 = newInstance(Class.forName("java.time.LocalTime"));
        Object term159209 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term159210 = newInstance(Class.forName("java.time.LocalDate"));
        Object term159214 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term159179, term159179.getClass(), "id", 3881903610132068684L);
        setLongField(term159181, term159181.getClass(), "id", -1517313114689915067L);
        setLongField(term159183, term159183.getClass(), "id", -8963879630647796485L);
        setField(term159183, term159183.getClass(), "extId", term159185);
        setField(term159183, term159183.getClass(), "luid", "zEsjjlIKrF");
        setIntField(term159200, term159200.getClass(), "year", 2028);
        setShortField(term159200, term159200.getClass(), "month", (short) 10);
        setShortField(term159200, term159200.getClass(), "day", (short) 11);
        setField(term159199, term159199.getClass(), "date", term159200);
        setByteField(term159204, term159204.getClass(), "hour", (byte) 1);
        setByteField(term159204, term159204.getClass(), "minute", (byte) 5);
        setByteField(term159204, term159204.getClass(), "second", (byte) 29);
        setIntField(term159204, term159204.getClass(), "nano", 688086203);
        setField(term159199, term159199.getClass(), "time", term159204);
        setField(term159183, term159183.getClass(), "registerTime", term159199);
        setIntField(term159210, term159210.getClass(), "year", 2029);
        setShortField(term159210, term159210.getClass(), "month", (short) 4);
        setShortField(term159210, term159210.getClass(), "day", (short) 26);
        setField(term159209, term159209.getClass(), "date", term159210);
        setByteField(term159214, term159214.getClass(), "hour", (byte) 19);
        setByteField(term159214, term159214.getClass(), "minute", (byte) 30);
        setByteField(term159214, term159214.getClass(), "second", (byte) 13);
        setIntField(term159214, term159214.getClass(), "nano", 883683186);
        setField(term159209, term159209.getClass(), "time", term159214);
        setField(term159183, term159183.getClass(), "accessTime", term159209);
        setField(term159181, term159181.getClass(), "card", term159183);
        setIntField(term159181, term159181.getClass(), "lastDataVersion", 989278096);
        setField(term159181, term159181.getClass(), "userName", "XeoSSCwSfl");
        setIntField(term159181, term159181.getClass(), "point", -247741903);
        setIntField(term159181, term159181.getClass(), "totalPoint", 1246330116);
        setIntField(term159181, term159181.getClass(), "iconId", -1044496905);
        setIntField(term159181, term159181.getClass(), "nameplateId", 1084043512);
        setIntField(term159181, term159181.getClass(), "frameId", 1355022325);
        setIntField(term159181, term159181.getClass(), "trophyId", 657074036);
        setIntField(term159181, term159181.getClass(), "playCount", -2106646820);
        setIntField(term159181, term159181.getClass(), "playVsCount", -1140904008);
        setIntField(term159181, term159181.getClass(), "playSyncCount", 1306218220);
        setIntField(term159181, term159181.getClass(), "winCount", -468687349);
        setIntField(term159181, term159181.getClass(), "helpCount", 839051595);
        setIntField(term159181, term159181.getClass(), "comboCount", -171412415);
        setIntField(term159181, term159181.getClass(), "feverCount", 733242781);
        setIntField(term159181, term159181.getClass(), "totalHiScore", 1881988571);
        setIntField(term159181, term159181.getClass(), "totalEasyHighScore", -870499765);
        setIntField(term159181, term159181.getClass(), "totalBasicHighScore", -39397335);
        setIntField(term159181, term159181.getClass(), "totalAdvancedHighScore", -704744943);
        setIntField(term159181, term159181.getClass(), "totalExpertHighScore", -1432282136);
        setIntField(term159181, term159181.getClass(), "totalMasterHighScore", -1443771952);
        setIntField(term159181, term159181.getClass(), "totalReMasterHighScore", 589229340);
        setIntField(term159181, term159181.getClass(), "totalHighSync", 1864951734);
        setIntField(term159181, term159181.getClass(), "totalEasySync", 1720260418);
        setIntField(term159181, term159181.getClass(), "totalBasicSync", 127845692);
        setIntField(term159181, term159181.getClass(), "totalAdvancedSync", -737730800);
        setIntField(term159181, term159181.getClass(), "totalExpertSync", 1266403206);
        setIntField(term159181, term159181.getClass(), "totalMasterSync", -565034923);
        setIntField(term159181, term159181.getClass(), "totalReMasterSync", 1366543913);
        setIntField(term159181, term159181.getClass(), "playerRating", 559302076);
        setIntField(term159181, term159181.getClass(), "highestRating", -1029061016);
        setIntField(term159181, term159181.getClass(), "rankAuthTailId", 1503900030);
        setField(term159181, term159181.getClass(), "eventWatchedDate", "adcoGovSer");
        setField(term159181, term159181.getClass(), "webLimitDate", "DZqXfiKqtE");
        setIntField(term159181, term159181.getClass(), "challengeTrackPhase", -2082234011);
        setIntField(term159181, term159181.getClass(), "firstPlayBits", 616913226);
        setField(term159181, term159181.getClass(), "lastPlayDate", "YOsqpIMuey");
        setIntField(term159181, term159181.getClass(), "lastPlaceId", 1811150294);
        setField(term159181, term159181.getClass(), "lastPlaceName", "dfJffzsKZe");
        setIntField(term159181, term159181.getClass(), "lastRegionId", -2126490398);
        setField(term159181, term159181.getClass(), "lastRegionName", "dTgyMBkwWX");
        setField(term159181, term159181.getClass(), "lastClientId", "mhIqZywfDK");
        setField(term159181, term159181.getClass(), "lastCountryCode", "MXPBuilyzu");
        setIntField(term159181, term159181.getClass(), "eventPoint", -935679427);
        setIntField(term159181, term159181.getClass(), "totalLv", 2106277450);
        setIntField(term159181, term159181.getClass(), "lastLoginBonusDay", -1874013505);
        setIntField(term159181, term159181.getClass(), "lastSurvivalBonusDay", -377154693);
        setIntField(term159181, term159181.getClass(), "loginBonusLv", -1995110914);
        setField(term159179, term159179.getClass(), "user", term159181);
        setIntField(term159179, term159179.getClass(), "orderId", -1015751446);
        setLongField(term159179, term159179.getClass(), "sortNumber", -4359906070460003487L);
        setIntField(term159179, term159179.getClass(), "placeId", 1281547949);
        setField(term159179, term159179.getClass(), "placeName", "CHVVqdbuYH");
        setField(term159179, term159179.getClass(), "country", "rLNYIbBxpb");
        setIntField(term159179, term159179.getClass(), "regionId", 2075287923);
        setField(term159179, term159179.getClass(), "playDate", "kdvVBzzgOS");
        setField(term159179, term159179.getClass(), "userPlayDate", "cwXRILYula");
        setIntField(term159179, term159179.getClass(), "musicId", -1875723336);
        setIntField(term159179, term159179.getClass(), "level", 1158346596);
        setIntField(term159179, term159179.getClass(), "gameMode", -799463638);
        setIntField(term159179, term159179.getClass(), "rivalNum", -380519500);
        setIntField(term159179, term159179.getClass(), "track", 1945185349);
        setIntField(term159179, term159179.getClass(), "eventId", 2056942519);
        setBooleanField(term159179, term159179.getClass(), "isFreeToPlay", false);
        setIntField(term159179, term159179.getClass(), "playerRating", -696885408);
        setLongField(term159179, term159179.getClass(), "playedUserId1", 3290224539925725962L);
        setField(term159179, term159179.getClass(), "playedUserName1", "GRIytmuHxn");
        setIntField(term159179, term159179.getClass(), "playedMusicLevel1", 1627187903);
        setLongField(term159179, term159179.getClass(), "playedUserId2", -4048501682703538382L);
        setField(term159179, term159179.getClass(), "playedUserName2", "kTzFRQAqyW");
        setIntField(term159179, term159179.getClass(), "playedMusicLevel2", 161283721);
        setLongField(term159179, term159179.getClass(), "playedUserId3", -8292962776344200146L);
        setField(term159179, term159179.getClass(), "playedUserName3", "VHZcekDeFJ");
        setIntField(term159179, term159179.getClass(), "playedMusicLevel3", 336268441);
        setIntField(term159179, term159179.getClass(), "achievement", 595161087);
        setIntField(term159179, term159179.getClass(), "score", -1982456131);
        setIntField(term159179, term159179.getClass(), "tapScore", -1690301446);
        setIntField(term159179, term159179.getClass(), "holdScore", 1706794411);
        setIntField(term159179, term159179.getClass(), "slideScore", 617390435);
        setIntField(term159179, term159179.getClass(), "breakScore", -396543789);
        setIntField(term159179, term159179.getClass(), "syncRate", -406646430);
        setIntField(term159179, term159179.getClass(), "vsWin", -1470464274);
        setBooleanField(term159179, term159179.getClass(), "isAllPerfect", true);
        setIntField(term159179, term159179.getClass(), "fullCombo", 1757332469);
        setIntField(term159179, term159179.getClass(), "maxFever", 1564464570);
        setIntField(term159179, term159179.getClass(), "maxCombo", 594749411);
        setIntField(term159179, term159179.getClass(), "tapPerfect", 606315381);
        setIntField(term159179, term159179.getClass(), "tapGreat", 1031535312);
        setIntField(term159179, term159179.getClass(), "tapGood", 1653009806);
        setIntField(term159179, term159179.getClass(), "tapBad", 829901371);
        setIntField(term159179, term159179.getClass(), "holdPerfect", 274034524);
        setIntField(term159179, term159179.getClass(), "holdGreat", -1560933208);
        setIntField(term159179, term159179.getClass(), "holdGood", 241048805);
        setIntField(term159179, term159179.getClass(), "holdBad", -1799198135);
        setIntField(term159179, term159179.getClass(), "slidePerfect", -146245384);
        setIntField(term159179, term159179.getClass(), "slideGreat", 1954963175);
        setIntField(term159179, term159179.getClass(), "slideGood", 299756323);
        setIntField(term159179, term159179.getClass(), "slideBad", 1423104720);
        setIntField(term159179, term159179.getClass(), "breakPerfect", -1918523057);
        setIntField(term159179, term159179.getClass(), "breakGreat", 789708568);
        setIntField(term159179, term159179.getClass(), "breakGood", -687627765);
        setIntField(term159179, term159179.getClass(), "breakBad", -2141712007);
        setBooleanField(term159179, term159179.getClass(), "isTrackSkip", true);
        setBooleanField(term159179, term159179.getClass(), "isHighScore", false);
        setBooleanField(term159179, term159179.getClass(), "isChallengeTrack", false);
        setIntField(term159179, term159179.getClass(), "challengeLife", -1829146678);
        setIntField(term159179, term159179.getClass(), "challengeRemain", -1843765624);
        setIntField(term159179, term159179.getClass(), "isAllPerfectPlus", 1352043161);
        term159491 = new Integer(-1847327458);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term159491;
        callMethod(klass, "setMaxFever", argTypes, term159179, args);
    }

};


