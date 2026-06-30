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

public class UserPlaylog_setHighScore_798127935117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term168129;
     Object term168441;

    public UserPlaylog_setHighScore_798127935117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term168135 = new Long(8680715663951713735L);
        term168129 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term168131 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term168133 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term168149 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term168150 = newInstance(Class.forName("java.time.LocalDate"));
        Object term168154 = newInstance(Class.forName("java.time.LocalTime"));
        Object term168159 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term168160 = newInstance(Class.forName("java.time.LocalDate"));
        Object term168164 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term168129, term168129.getClass(), "id", 8227165037887933407L);
        setLongField(term168131, term168131.getClass(), "id", -689231427687092388L);
        setLongField(term168133, term168133.getClass(), "id", 8373979822629220849L);
        setField(term168133, term168133.getClass(), "extId", term168135);
        setField(term168133, term168133.getClass(), "luid", "BVIBVYApBG");
        setIntField(term168150, term168150.getClass(), "year", 2027);
        setShortField(term168150, term168150.getClass(), "month", (short) 12);
        setShortField(term168150, term168150.getClass(), "day", (short) 16);
        setField(term168149, term168149.getClass(), "date", term168150);
        setByteField(term168154, term168154.getClass(), "hour", (byte) 10);
        setByteField(term168154, term168154.getClass(), "minute", (byte) 23);
        setByteField(term168154, term168154.getClass(), "second", (byte) 56);
        setIntField(term168154, term168154.getClass(), "nano", 246046035);
        setField(term168149, term168149.getClass(), "time", term168154);
        setField(term168133, term168133.getClass(), "registerTime", term168149);
        setIntField(term168160, term168160.getClass(), "year", 2019);
        setShortField(term168160, term168160.getClass(), "month", (short) 5);
        setShortField(term168160, term168160.getClass(), "day", (short) 20);
        setField(term168159, term168159.getClass(), "date", term168160);
        setByteField(term168164, term168164.getClass(), "hour", (byte) 15);
        setByteField(term168164, term168164.getClass(), "minute", (byte) 28);
        setByteField(term168164, term168164.getClass(), "second", (byte) 36);
        setIntField(term168164, term168164.getClass(), "nano", 872266428);
        setField(term168159, term168159.getClass(), "time", term168164);
        setField(term168133, term168133.getClass(), "accessTime", term168159);
        setField(term168131, term168131.getClass(), "card", term168133);
        setIntField(term168131, term168131.getClass(), "lastDataVersion", 1275652227);
        setField(term168131, term168131.getClass(), "userName", "rDMARKSlyU");
        setIntField(term168131, term168131.getClass(), "point", 44979043);
        setIntField(term168131, term168131.getClass(), "totalPoint", 549686781);
        setIntField(term168131, term168131.getClass(), "iconId", -819867100);
        setIntField(term168131, term168131.getClass(), "nameplateId", 564172804);
        setIntField(term168131, term168131.getClass(), "frameId", 2050329830);
        setIntField(term168131, term168131.getClass(), "trophyId", 280788823);
        setIntField(term168131, term168131.getClass(), "playCount", 2049268742);
        setIntField(term168131, term168131.getClass(), "playVsCount", 2068916209);
        setIntField(term168131, term168131.getClass(), "playSyncCount", -130370137);
        setIntField(term168131, term168131.getClass(), "winCount", 1539004723);
        setIntField(term168131, term168131.getClass(), "helpCount", 981607290);
        setIntField(term168131, term168131.getClass(), "comboCount", 1191607691);
        setIntField(term168131, term168131.getClass(), "feverCount", -633453605);
        setIntField(term168131, term168131.getClass(), "totalHiScore", 985076572);
        setIntField(term168131, term168131.getClass(), "totalEasyHighScore", 1600799427);
        setIntField(term168131, term168131.getClass(), "totalBasicHighScore", 2107094258);
        setIntField(term168131, term168131.getClass(), "totalAdvancedHighScore", 1092820584);
        setIntField(term168131, term168131.getClass(), "totalExpertHighScore", -1545792578);
        setIntField(term168131, term168131.getClass(), "totalMasterHighScore", -1366367099);
        setIntField(term168131, term168131.getClass(), "totalReMasterHighScore", 1674855220);
        setIntField(term168131, term168131.getClass(), "totalHighSync", 1678094487);
        setIntField(term168131, term168131.getClass(), "totalEasySync", 231229956);
        setIntField(term168131, term168131.getClass(), "totalBasicSync", -1197711206);
        setIntField(term168131, term168131.getClass(), "totalAdvancedSync", 1890759814);
        setIntField(term168131, term168131.getClass(), "totalExpertSync", -272366329);
        setIntField(term168131, term168131.getClass(), "totalMasterSync", -711204478);
        setIntField(term168131, term168131.getClass(), "totalReMasterSync", 77255205);
        setIntField(term168131, term168131.getClass(), "playerRating", 1052150480);
        setIntField(term168131, term168131.getClass(), "highestRating", -285729820);
        setIntField(term168131, term168131.getClass(), "rankAuthTailId", 2113711445);
        setField(term168131, term168131.getClass(), "eventWatchedDate", "pdwBEXDsZz");
        setField(term168131, term168131.getClass(), "webLimitDate", "ODCEExTkfn");
        setIntField(term168131, term168131.getClass(), "challengeTrackPhase", -528909594);
        setIntField(term168131, term168131.getClass(), "firstPlayBits", -67698578);
        setField(term168131, term168131.getClass(), "lastPlayDate", "WGInnBoBXb");
        setIntField(term168131, term168131.getClass(), "lastPlaceId", 344256601);
        setField(term168131, term168131.getClass(), "lastPlaceName", "zRdVDyYqUh");
        setIntField(term168131, term168131.getClass(), "lastRegionId", -1091390775);
        setField(term168131, term168131.getClass(), "lastRegionName", "hsHZkWJHpU");
        setField(term168131, term168131.getClass(), "lastClientId", "jACNZKsTgs");
        setField(term168131, term168131.getClass(), "lastCountryCode", "gdXejOZMlf");
        setIntField(term168131, term168131.getClass(), "eventPoint", 312248271);
        setIntField(term168131, term168131.getClass(), "totalLv", -225922252);
        setIntField(term168131, term168131.getClass(), "lastLoginBonusDay", -538320573);
        setIntField(term168131, term168131.getClass(), "lastSurvivalBonusDay", -1955695110);
        setIntField(term168131, term168131.getClass(), "loginBonusLv", -710276392);
        setField(term168129, term168129.getClass(), "user", term168131);
        setIntField(term168129, term168129.getClass(), "orderId", 245922739);
        setLongField(term168129, term168129.getClass(), "sortNumber", 1118204947601768403L);
        setIntField(term168129, term168129.getClass(), "placeId", -1516801754);
        setField(term168129, term168129.getClass(), "placeName", "FfDXECFXSk");
        setField(term168129, term168129.getClass(), "country", "YfMHlokFKp");
        setIntField(term168129, term168129.getClass(), "regionId", 1321462973);
        setField(term168129, term168129.getClass(), "playDate", "mvxWIPkluG");
        setField(term168129, term168129.getClass(), "userPlayDate", "wOkHioNorr");
        setIntField(term168129, term168129.getClass(), "musicId", 508313103);
        setIntField(term168129, term168129.getClass(), "level", 1227224250);
        setIntField(term168129, term168129.getClass(), "gameMode", -105148060);
        setIntField(term168129, term168129.getClass(), "rivalNum", 1562852288);
        setIntField(term168129, term168129.getClass(), "track", 661414898);
        setIntField(term168129, term168129.getClass(), "eventId", -412059873);
        setBooleanField(term168129, term168129.getClass(), "isFreeToPlay", true);
        setIntField(term168129, term168129.getClass(), "playerRating", -1330975573);
        setLongField(term168129, term168129.getClass(), "playedUserId1", -59812931280292932L);
        setField(term168129, term168129.getClass(), "playedUserName1", "UrMOWCrQMH");
        setIntField(term168129, term168129.getClass(), "playedMusicLevel1", -195714577);
        setLongField(term168129, term168129.getClass(), "playedUserId2", 2152337427888260081L);
        setField(term168129, term168129.getClass(), "playedUserName2", "WvuyCTtUTF");
        setIntField(term168129, term168129.getClass(), "playedMusicLevel2", 902486272);
        setLongField(term168129, term168129.getClass(), "playedUserId3", 5626125546253518889L);
        setField(term168129, term168129.getClass(), "playedUserName3", "mSDLNUwhJE");
        setIntField(term168129, term168129.getClass(), "playedMusicLevel3", -275673665);
        setIntField(term168129, term168129.getClass(), "achievement", -1334844241);
        setIntField(term168129, term168129.getClass(), "score", -413714919);
        setIntField(term168129, term168129.getClass(), "tapScore", -720491891);
        setIntField(term168129, term168129.getClass(), "holdScore", -1718868542);
        setIntField(term168129, term168129.getClass(), "slideScore", 845100825);
        setIntField(term168129, term168129.getClass(), "breakScore", -1075029293);
        setIntField(term168129, term168129.getClass(), "syncRate", -139704619);
        setIntField(term168129, term168129.getClass(), "vsWin", 289931043);
        setBooleanField(term168129, term168129.getClass(), "isAllPerfect", false);
        setIntField(term168129, term168129.getClass(), "fullCombo", 220036542);
        setIntField(term168129, term168129.getClass(), "maxFever", 2080640156);
        setIntField(term168129, term168129.getClass(), "maxCombo", 766384724);
        setIntField(term168129, term168129.getClass(), "tapPerfect", 1755652463);
        setIntField(term168129, term168129.getClass(), "tapGreat", -562037229);
        setIntField(term168129, term168129.getClass(), "tapGood", 868642369);
        setIntField(term168129, term168129.getClass(), "tapBad", -176214444);
        setIntField(term168129, term168129.getClass(), "holdPerfect", 281761996);
        setIntField(term168129, term168129.getClass(), "holdGreat", -731481120);
        setIntField(term168129, term168129.getClass(), "holdGood", -1483655293);
        setIntField(term168129, term168129.getClass(), "holdBad", 855645383);
        setIntField(term168129, term168129.getClass(), "slidePerfect", -1064960196);
        setIntField(term168129, term168129.getClass(), "slideGreat", -1152187596);
        setIntField(term168129, term168129.getClass(), "slideGood", -1694897674);
        setIntField(term168129, term168129.getClass(), "slideBad", 1697377622);
        setIntField(term168129, term168129.getClass(), "breakPerfect", 62690851);
        setIntField(term168129, term168129.getClass(), "breakGreat", 1818221976);
        setIntField(term168129, term168129.getClass(), "breakGood", -993791957);
        setIntField(term168129, term168129.getClass(), "breakBad", -552751175);
        setBooleanField(term168129, term168129.getClass(), "isTrackSkip", true);
        setBooleanField(term168129, term168129.getClass(), "isHighScore", false);
        setBooleanField(term168129, term168129.getClass(), "isChallengeTrack", false);
        setIntField(term168129, term168129.getClass(), "challengeLife", 1109193734);
        setIntField(term168129, term168129.getClass(), "challengeRemain", -1316804985);
        setIntField(term168129, term168129.getClass(), "isAllPerfectPlus", 704056081);
        term168441 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term168441;
        callMethod(klass, "setHighScore", argTypes, term168129, args);
    }

};


