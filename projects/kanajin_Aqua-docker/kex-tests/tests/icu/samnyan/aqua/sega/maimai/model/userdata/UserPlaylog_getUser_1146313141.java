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

public class UserPlaylog_getUser_1146313141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112863;

    public UserPlaylog_getUser_1146313141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term112869 = new Long(-629491722907628764L);
        term112863 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term112865 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term112867 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term112883 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term112884 = newInstance(Class.forName("java.time.LocalDate"));
        Object term112888 = newInstance(Class.forName("java.time.LocalTime"));
        Object term112893 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term112894 = newInstance(Class.forName("java.time.LocalDate"));
        Object term112898 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term112863, term112863.getClass(), "id", -4281700567835283963L);
        setLongField(term112865, term112865.getClass(), "id", 8779425347424216281L);
        setLongField(term112867, term112867.getClass(), "id", 3878526639209086211L);
        setField(term112867, term112867.getClass(), "extId", term112869);
        setField(term112867, term112867.getClass(), "luid", "vrRPhHcJDp");
        setIntField(term112884, term112884.getClass(), "year", 2024);
        setShortField(term112884, term112884.getClass(), "month", (short) 12);
        setShortField(term112884, term112884.getClass(), "day", (short) 29);
        setField(term112883, term112883.getClass(), "date", term112884);
        setByteField(term112888, term112888.getClass(), "hour", (byte) 22);
        setByteField(term112888, term112888.getClass(), "minute", (byte) 7);
        setByteField(term112888, term112888.getClass(), "second", (byte) 1);
        setIntField(term112888, term112888.getClass(), "nano", 924286363);
        setField(term112883, term112883.getClass(), "time", term112888);
        setField(term112867, term112867.getClass(), "registerTime", term112883);
        setIntField(term112894, term112894.getClass(), "year", 2011);
        setShortField(term112894, term112894.getClass(), "month", (short) 12);
        setShortField(term112894, term112894.getClass(), "day", (short) 13);
        setField(term112893, term112893.getClass(), "date", term112894);
        setByteField(term112898, term112898.getClass(), "hour", (byte) 4);
        setByteField(term112898, term112898.getClass(), "minute", (byte) 19);
        setByteField(term112898, term112898.getClass(), "second", (byte) 3);
        setIntField(term112898, term112898.getClass(), "nano", 325415099);
        setField(term112893, term112893.getClass(), "time", term112898);
        setField(term112867, term112867.getClass(), "accessTime", term112893);
        setField(term112865, term112865.getClass(), "card", term112867);
        setIntField(term112865, term112865.getClass(), "lastDataVersion", 1860316952);
        setField(term112865, term112865.getClass(), "userName", "GAfAmizshG");
        setIntField(term112865, term112865.getClass(), "point", -1357166161);
        setIntField(term112865, term112865.getClass(), "totalPoint", -1627604622);
        setIntField(term112865, term112865.getClass(), "iconId", 713023342);
        setIntField(term112865, term112865.getClass(), "nameplateId", 998011339);
        setIntField(term112865, term112865.getClass(), "frameId", -1950215164);
        setIntField(term112865, term112865.getClass(), "trophyId", -708642862);
        setIntField(term112865, term112865.getClass(), "playCount", 1451070666);
        setIntField(term112865, term112865.getClass(), "playVsCount", 1051167456);
        setIntField(term112865, term112865.getClass(), "playSyncCount", -600103193);
        setIntField(term112865, term112865.getClass(), "winCount", 1482035968);
        setIntField(term112865, term112865.getClass(), "helpCount", 172742990);
        setIntField(term112865, term112865.getClass(), "comboCount", -1602215597);
        setIntField(term112865, term112865.getClass(), "feverCount", -1966047836);
        setIntField(term112865, term112865.getClass(), "totalHiScore", -583672343);
        setIntField(term112865, term112865.getClass(), "totalEasyHighScore", 1468999437);
        setIntField(term112865, term112865.getClass(), "totalBasicHighScore", 1413900695);
        setIntField(term112865, term112865.getClass(), "totalAdvancedHighScore", -479962825);
        setIntField(term112865, term112865.getClass(), "totalExpertHighScore", 1779819594);
        setIntField(term112865, term112865.getClass(), "totalMasterHighScore", 1985056540);
        setIntField(term112865, term112865.getClass(), "totalReMasterHighScore", -226386721);
        setIntField(term112865, term112865.getClass(), "totalHighSync", 1013063751);
        setIntField(term112865, term112865.getClass(), "totalEasySync", -1198391913);
        setIntField(term112865, term112865.getClass(), "totalBasicSync", 68033708);
        setIntField(term112865, term112865.getClass(), "totalAdvancedSync", 2051874969);
        setIntField(term112865, term112865.getClass(), "totalExpertSync", 2076756563);
        setIntField(term112865, term112865.getClass(), "totalMasterSync", 601795101);
        setIntField(term112865, term112865.getClass(), "totalReMasterSync", -1062808229);
        setIntField(term112865, term112865.getClass(), "playerRating", -271441350);
        setIntField(term112865, term112865.getClass(), "highestRating", 1670662698);
        setIntField(term112865, term112865.getClass(), "rankAuthTailId", -1572888982);
        setField(term112865, term112865.getClass(), "eventWatchedDate", "mouoQUznmq");
        setField(term112865, term112865.getClass(), "webLimitDate", "WaacgRHGZQ");
        setIntField(term112865, term112865.getClass(), "challengeTrackPhase", 2135550662);
        setIntField(term112865, term112865.getClass(), "firstPlayBits", -455562432);
        setField(term112865, term112865.getClass(), "lastPlayDate", "GiqQhSRhZD");
        setIntField(term112865, term112865.getClass(), "lastPlaceId", -80827488);
        setField(term112865, term112865.getClass(), "lastPlaceName", "oycMVEbykz");
        setIntField(term112865, term112865.getClass(), "lastRegionId", -992927508);
        setField(term112865, term112865.getClass(), "lastRegionName", "DdxinlKAiI");
        setField(term112865, term112865.getClass(), "lastClientId", "DZPXiwRtmo");
        setField(term112865, term112865.getClass(), "lastCountryCode", "abnCcSSxwb");
        setIntField(term112865, term112865.getClass(), "eventPoint", -2071989918);
        setIntField(term112865, term112865.getClass(), "totalLv", -1383632524);
        setIntField(term112865, term112865.getClass(), "lastLoginBonusDay", 1357437054);
        setIntField(term112865, term112865.getClass(), "lastSurvivalBonusDay", -1042866729);
        setIntField(term112865, term112865.getClass(), "loginBonusLv", 65417356);
        setField(term112863, term112863.getClass(), "user", term112865);
        setIntField(term112863, term112863.getClass(), "orderId", 1998186352);
        setLongField(term112863, term112863.getClass(), "sortNumber", -2061888799893149465L);
        setIntField(term112863, term112863.getClass(), "placeId", 1778792634);
        setField(term112863, term112863.getClass(), "placeName", "PMbUpRmZHC");
        setField(term112863, term112863.getClass(), "country", "VGeGoUWPCQ");
        setIntField(term112863, term112863.getClass(), "regionId", -477162164);
        setField(term112863, term112863.getClass(), "playDate", "ZjkLeKLILi");
        setField(term112863, term112863.getClass(), "userPlayDate", "CZAqWlBJTT");
        setIntField(term112863, term112863.getClass(), "musicId", -1397399586);
        setIntField(term112863, term112863.getClass(), "level", -1933029024);
        setIntField(term112863, term112863.getClass(), "gameMode", 954573287);
        setIntField(term112863, term112863.getClass(), "rivalNum", 1974486967);
        setIntField(term112863, term112863.getClass(), "track", -1788451389);
        setIntField(term112863, term112863.getClass(), "eventId", -1198136820);
        setBooleanField(term112863, term112863.getClass(), "isFreeToPlay", true);
        setIntField(term112863, term112863.getClass(), "playerRating", 981813742);
        setLongField(term112863, term112863.getClass(), "playedUserId1", 8562037929535808010L);
        setField(term112863, term112863.getClass(), "playedUserName1", "WPMnhxMKAm");
        setIntField(term112863, term112863.getClass(), "playedMusicLevel1", 949470328);
        setLongField(term112863, term112863.getClass(), "playedUserId2", 3881743260573639770L);
        setField(term112863, term112863.getClass(), "playedUserName2", "tTGimFVzYt");
        setIntField(term112863, term112863.getClass(), "playedMusicLevel2", -1848906931);
        setLongField(term112863, term112863.getClass(), "playedUserId3", 4805317099230920805L);
        setField(term112863, term112863.getClass(), "playedUserName3", "bkFWSyioMj");
        setIntField(term112863, term112863.getClass(), "playedMusicLevel3", 108340245);
        setIntField(term112863, term112863.getClass(), "achievement", 1179037950);
        setIntField(term112863, term112863.getClass(), "score", 550780613);
        setIntField(term112863, term112863.getClass(), "tapScore", 1561385285);
        setIntField(term112863, term112863.getClass(), "holdScore", -260885634);
        setIntField(term112863, term112863.getClass(), "slideScore", -1347242303);
        setIntField(term112863, term112863.getClass(), "breakScore", -2036347698);
        setIntField(term112863, term112863.getClass(), "syncRate", -1619455357);
        setIntField(term112863, term112863.getClass(), "vsWin", -1767994514);
        setBooleanField(term112863, term112863.getClass(), "isAllPerfect", false);
        setIntField(term112863, term112863.getClass(), "fullCombo", 424496847);
        setIntField(term112863, term112863.getClass(), "maxFever", 286520609);
        setIntField(term112863, term112863.getClass(), "maxCombo", -406651008);
        setIntField(term112863, term112863.getClass(), "tapPerfect", -1788449741);
        setIntField(term112863, term112863.getClass(), "tapGreat", -192182169);
        setIntField(term112863, term112863.getClass(), "tapGood", 1858514511);
        setIntField(term112863, term112863.getClass(), "tapBad", 920502057);
        setIntField(term112863, term112863.getClass(), "holdPerfect", 226237834);
        setIntField(term112863, term112863.getClass(), "holdGreat", 1291181404);
        setIntField(term112863, term112863.getClass(), "holdGood", 121976016);
        setIntField(term112863, term112863.getClass(), "holdBad", -745467659);
        setIntField(term112863, term112863.getClass(), "slidePerfect", -1055944419);
        setIntField(term112863, term112863.getClass(), "slideGreat", -22283188);
        setIntField(term112863, term112863.getClass(), "slideGood", 416013091);
        setIntField(term112863, term112863.getClass(), "slideBad", 804342841);
        setIntField(term112863, term112863.getClass(), "breakPerfect", -808113844);
        setIntField(term112863, term112863.getClass(), "breakGreat", 706642456);
        setIntField(term112863, term112863.getClass(), "breakGood", 1776826425);
        setIntField(term112863, term112863.getClass(), "breakBad", -1119160134);
        setBooleanField(term112863, term112863.getClass(), "isTrackSkip", true);
        setBooleanField(term112863, term112863.getClass(), "isHighScore", false);
        setBooleanField(term112863, term112863.getClass(), "isChallengeTrack", false);
        setIntField(term112863, term112863.getClass(), "challengeLife", -1646614481);
        setIntField(term112863, term112863.getClass(), "challengeRemain", -1691986289);
        setIntField(term112863, term112863.getClass(), "isAllPerfectPlus", -1180346349);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term112863, args);
    }

};


