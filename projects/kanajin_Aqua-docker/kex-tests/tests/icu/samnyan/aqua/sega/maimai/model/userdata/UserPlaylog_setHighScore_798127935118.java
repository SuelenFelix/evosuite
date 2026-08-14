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

public class UserPlaylog_setHighScore_798127935118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term168185;
     Object term168497;

    public UserPlaylog_setHighScore_798127935118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term168191 = new Long(8680715663951713735L);
        term168185 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term168187 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term168189 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term168205 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term168206 = newInstance(Class.forName("java.time.LocalDate"));
        Object term168210 = newInstance(Class.forName("java.time.LocalTime"));
        Object term168215 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term168216 = newInstance(Class.forName("java.time.LocalDate"));
        Object term168220 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term168185, term168185.getClass(), "id", 8227165037887933407L);
        setLongField(term168187, term168187.getClass(), "id", -689231427687092388L);
        setLongField(term168189, term168189.getClass(), "id", 8373979822629220849L);
        setField(term168189, term168189.getClass(), "extId", term168191);
        setField(term168189, term168189.getClass(), "luid", "BVIBVYApBG");
        setIntField(term168206, term168206.getClass(), "year", 2027);
        setShortField(term168206, term168206.getClass(), "month", (short) 12);
        setShortField(term168206, term168206.getClass(), "day", (short) 16);
        setField(term168205, term168205.getClass(), "date", term168206);
        setByteField(term168210, term168210.getClass(), "hour", (byte) 10);
        setByteField(term168210, term168210.getClass(), "minute", (byte) 23);
        setByteField(term168210, term168210.getClass(), "second", (byte) 56);
        setIntField(term168210, term168210.getClass(), "nano", 246046035);
        setField(term168205, term168205.getClass(), "time", term168210);
        setField(term168189, term168189.getClass(), "registerTime", term168205);
        setIntField(term168216, term168216.getClass(), "year", 2019);
        setShortField(term168216, term168216.getClass(), "month", (short) 5);
        setShortField(term168216, term168216.getClass(), "day", (short) 20);
        setField(term168215, term168215.getClass(), "date", term168216);
        setByteField(term168220, term168220.getClass(), "hour", (byte) 15);
        setByteField(term168220, term168220.getClass(), "minute", (byte) 28);
        setByteField(term168220, term168220.getClass(), "second", (byte) 36);
        setIntField(term168220, term168220.getClass(), "nano", 872266428);
        setField(term168215, term168215.getClass(), "time", term168220);
        setField(term168189, term168189.getClass(), "accessTime", term168215);
        setField(term168187, term168187.getClass(), "card", term168189);
        setIntField(term168187, term168187.getClass(), "lastDataVersion", 1275652227);
        setField(term168187, term168187.getClass(), "userName", "rDMARKSlyU");
        setIntField(term168187, term168187.getClass(), "point", 44979043);
        setIntField(term168187, term168187.getClass(), "totalPoint", 549686781);
        setIntField(term168187, term168187.getClass(), "iconId", -819867100);
        setIntField(term168187, term168187.getClass(), "nameplateId", 564172804);
        setIntField(term168187, term168187.getClass(), "frameId", 2050329830);
        setIntField(term168187, term168187.getClass(), "trophyId", 280788823);
        setIntField(term168187, term168187.getClass(), "playCount", 2049268742);
        setIntField(term168187, term168187.getClass(), "playVsCount", 2068916209);
        setIntField(term168187, term168187.getClass(), "playSyncCount", -130370137);
        setIntField(term168187, term168187.getClass(), "winCount", 1539004723);
        setIntField(term168187, term168187.getClass(), "helpCount", 981607290);
        setIntField(term168187, term168187.getClass(), "comboCount", 1191607691);
        setIntField(term168187, term168187.getClass(), "feverCount", -633453605);
        setIntField(term168187, term168187.getClass(), "totalHiScore", 985076572);
        setIntField(term168187, term168187.getClass(), "totalEasyHighScore", 1600799427);
        setIntField(term168187, term168187.getClass(), "totalBasicHighScore", 2107094258);
        setIntField(term168187, term168187.getClass(), "totalAdvancedHighScore", 1092820584);
        setIntField(term168187, term168187.getClass(), "totalExpertHighScore", -1545792578);
        setIntField(term168187, term168187.getClass(), "totalMasterHighScore", -1366367099);
        setIntField(term168187, term168187.getClass(), "totalReMasterHighScore", 1674855220);
        setIntField(term168187, term168187.getClass(), "totalHighSync", 1678094487);
        setIntField(term168187, term168187.getClass(), "totalEasySync", 231229956);
        setIntField(term168187, term168187.getClass(), "totalBasicSync", -1197711206);
        setIntField(term168187, term168187.getClass(), "totalAdvancedSync", 1890759814);
        setIntField(term168187, term168187.getClass(), "totalExpertSync", -272366329);
        setIntField(term168187, term168187.getClass(), "totalMasterSync", -711204478);
        setIntField(term168187, term168187.getClass(), "totalReMasterSync", 77255205);
        setIntField(term168187, term168187.getClass(), "playerRating", 1052150480);
        setIntField(term168187, term168187.getClass(), "highestRating", -285729820);
        setIntField(term168187, term168187.getClass(), "rankAuthTailId", 2113711445);
        setField(term168187, term168187.getClass(), "eventWatchedDate", "pdwBEXDsZz");
        setField(term168187, term168187.getClass(), "webLimitDate", "ODCEExTkfn");
        setIntField(term168187, term168187.getClass(), "challengeTrackPhase", -528909594);
        setIntField(term168187, term168187.getClass(), "firstPlayBits", -67698578);
        setField(term168187, term168187.getClass(), "lastPlayDate", "WGInnBoBXb");
        setIntField(term168187, term168187.getClass(), "lastPlaceId", 344256601);
        setField(term168187, term168187.getClass(), "lastPlaceName", "zRdVDyYqUh");
        setIntField(term168187, term168187.getClass(), "lastRegionId", -1091390775);
        setField(term168187, term168187.getClass(), "lastRegionName", "hsHZkWJHpU");
        setField(term168187, term168187.getClass(), "lastClientId", "jACNZKsTgs");
        setField(term168187, term168187.getClass(), "lastCountryCode", "gdXejOZMlf");
        setIntField(term168187, term168187.getClass(), "eventPoint", 312248271);
        setIntField(term168187, term168187.getClass(), "totalLv", -225922252);
        setIntField(term168187, term168187.getClass(), "lastLoginBonusDay", -538320573);
        setIntField(term168187, term168187.getClass(), "lastSurvivalBonusDay", -1955695110);
        setIntField(term168187, term168187.getClass(), "loginBonusLv", -710276392);
        setField(term168185, term168185.getClass(), "user", term168187);
        setIntField(term168185, term168185.getClass(), "orderId", 245922739);
        setLongField(term168185, term168185.getClass(), "sortNumber", 1118204947601768403L);
        setIntField(term168185, term168185.getClass(), "placeId", -1516801754);
        setField(term168185, term168185.getClass(), "placeName", "FfDXECFXSk");
        setField(term168185, term168185.getClass(), "country", "YfMHlokFKp");
        setIntField(term168185, term168185.getClass(), "regionId", 1321462973);
        setField(term168185, term168185.getClass(), "playDate", "mvxWIPkluG");
        setField(term168185, term168185.getClass(), "userPlayDate", "wOkHioNorr");
        setIntField(term168185, term168185.getClass(), "musicId", 508313103);
        setIntField(term168185, term168185.getClass(), "level", 1227224250);
        setIntField(term168185, term168185.getClass(), "gameMode", -105148060);
        setIntField(term168185, term168185.getClass(), "rivalNum", 1562852288);
        setIntField(term168185, term168185.getClass(), "track", 661414898);
        setIntField(term168185, term168185.getClass(), "eventId", -412059873);
        setBooleanField(term168185, term168185.getClass(), "isFreeToPlay", true);
        setIntField(term168185, term168185.getClass(), "playerRating", -1330975573);
        setLongField(term168185, term168185.getClass(), "playedUserId1", -59812931280292932L);
        setField(term168185, term168185.getClass(), "playedUserName1", "UrMOWCrQMH");
        setIntField(term168185, term168185.getClass(), "playedMusicLevel1", -195714577);
        setLongField(term168185, term168185.getClass(), "playedUserId2", 2152337427888260081L);
        setField(term168185, term168185.getClass(), "playedUserName2", "WvuyCTtUTF");
        setIntField(term168185, term168185.getClass(), "playedMusicLevel2", 902486272);
        setLongField(term168185, term168185.getClass(), "playedUserId3", 5626125546253518889L);
        setField(term168185, term168185.getClass(), "playedUserName3", "mSDLNUwhJE");
        setIntField(term168185, term168185.getClass(), "playedMusicLevel3", -275673665);
        setIntField(term168185, term168185.getClass(), "achievement", -1334844241);
        setIntField(term168185, term168185.getClass(), "score", -413714919);
        setIntField(term168185, term168185.getClass(), "tapScore", -720491891);
        setIntField(term168185, term168185.getClass(), "holdScore", -1718868542);
        setIntField(term168185, term168185.getClass(), "slideScore", 845100825);
        setIntField(term168185, term168185.getClass(), "breakScore", -1075029293);
        setIntField(term168185, term168185.getClass(), "syncRate", -139704619);
        setIntField(term168185, term168185.getClass(), "vsWin", 289931043);
        setBooleanField(term168185, term168185.getClass(), "isAllPerfect", false);
        setIntField(term168185, term168185.getClass(), "fullCombo", 220036542);
        setIntField(term168185, term168185.getClass(), "maxFever", 2080640156);
        setIntField(term168185, term168185.getClass(), "maxCombo", 766384724);
        setIntField(term168185, term168185.getClass(), "tapPerfect", 1755652463);
        setIntField(term168185, term168185.getClass(), "tapGreat", -562037229);
        setIntField(term168185, term168185.getClass(), "tapGood", 868642369);
        setIntField(term168185, term168185.getClass(), "tapBad", -176214444);
        setIntField(term168185, term168185.getClass(), "holdPerfect", 281761996);
        setIntField(term168185, term168185.getClass(), "holdGreat", -731481120);
        setIntField(term168185, term168185.getClass(), "holdGood", -1483655293);
        setIntField(term168185, term168185.getClass(), "holdBad", 855645383);
        setIntField(term168185, term168185.getClass(), "slidePerfect", -1064960196);
        setIntField(term168185, term168185.getClass(), "slideGreat", -1152187596);
        setIntField(term168185, term168185.getClass(), "slideGood", -1694897674);
        setIntField(term168185, term168185.getClass(), "slideBad", 1697377622);
        setIntField(term168185, term168185.getClass(), "breakPerfect", 62690851);
        setIntField(term168185, term168185.getClass(), "breakGreat", 1818221976);
        setIntField(term168185, term168185.getClass(), "breakGood", -993791957);
        setIntField(term168185, term168185.getClass(), "breakBad", -552751175);
        setBooleanField(term168185, term168185.getClass(), "isTrackSkip", true);
        setBooleanField(term168185, term168185.getClass(), "isHighScore", false);
        setBooleanField(term168185, term168185.getClass(), "isChallengeTrack", false);
        setIntField(term168185, term168185.getClass(), "challengeLife", 1109193734);
        setIntField(term168185, term168185.getClass(), "challengeRemain", -1316804985);
        setIntField(term168185, term168185.getClass(), "isAllPerfectPlus", 704056081);
        term168497 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term168497;
        callMethod(klass, "setHighScore", argTypes, term168185, args);
    }

};


