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

public class UserPlaylog_setTrack_78822128675 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148161;
     Object term148473;

    public UserPlaylog_setTrack_78822128675() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term148167 = new Long(-1084263688306617320L);
        term148161 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term148163 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term148165 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term148181 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term148182 = newInstance(Class.forName("java.time.LocalDate"));
        Object term148186 = newInstance(Class.forName("java.time.LocalTime"));
        Object term148191 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term148192 = newInstance(Class.forName("java.time.LocalDate"));
        Object term148196 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term148161, term148161.getClass(), "id", 6127011005231905639L);
        setLongField(term148163, term148163.getClass(), "id", -8925131548818125405L);
        setLongField(term148165, term148165.getClass(), "id", 5793505030039838427L);
        setField(term148165, term148165.getClass(), "extId", term148167);
        setField(term148165, term148165.getClass(), "luid", "ONkDXTThKL");
        setIntField(term148182, term148182.getClass(), "year", 2025);
        setShortField(term148182, term148182.getClass(), "month", (short) 5);
        setShortField(term148182, term148182.getClass(), "day", (short) 29);
        setField(term148181, term148181.getClass(), "date", term148182);
        setByteField(term148186, term148186.getClass(), "hour", (byte) 14);
        setByteField(term148186, term148186.getClass(), "minute", (byte) 31);
        setByteField(term148186, term148186.getClass(), "second", (byte) 17);
        setIntField(term148186, term148186.getClass(), "nano", 808113660);
        setField(term148181, term148181.getClass(), "time", term148186);
        setField(term148165, term148165.getClass(), "registerTime", term148181);
        setIntField(term148192, term148192.getClass(), "year", 2029);
        setShortField(term148192, term148192.getClass(), "month", (short) 9);
        setShortField(term148192, term148192.getClass(), "day", (short) 22);
        setField(term148191, term148191.getClass(), "date", term148192);
        setByteField(term148196, term148196.getClass(), "hour", (byte) 9);
        setByteField(term148196, term148196.getClass(), "minute", (byte) 11);
        setByteField(term148196, term148196.getClass(), "second", (byte) 48);
        setIntField(term148196, term148196.getClass(), "nano", 904292704);
        setField(term148191, term148191.getClass(), "time", term148196);
        setField(term148165, term148165.getClass(), "accessTime", term148191);
        setField(term148163, term148163.getClass(), "card", term148165);
        setIntField(term148163, term148163.getClass(), "lastDataVersion", 1604342486);
        setField(term148163, term148163.getClass(), "userName", "AKbzAaAcmX");
        setIntField(term148163, term148163.getClass(), "point", -301302512);
        setIntField(term148163, term148163.getClass(), "totalPoint", -928036798);
        setIntField(term148163, term148163.getClass(), "iconId", 1106525831);
        setIntField(term148163, term148163.getClass(), "nameplateId", 2136483916);
        setIntField(term148163, term148163.getClass(), "frameId", 1306099530);
        setIntField(term148163, term148163.getClass(), "trophyId", 2123746183);
        setIntField(term148163, term148163.getClass(), "playCount", 1905262181);
        setIntField(term148163, term148163.getClass(), "playVsCount", -1489308604);
        setIntField(term148163, term148163.getClass(), "playSyncCount", 2002775337);
        setIntField(term148163, term148163.getClass(), "winCount", -1102174349);
        setIntField(term148163, term148163.getClass(), "helpCount", -1426676868);
        setIntField(term148163, term148163.getClass(), "comboCount", -946170394);
        setIntField(term148163, term148163.getClass(), "feverCount", -1543920037);
        setIntField(term148163, term148163.getClass(), "totalHiScore", 680004189);
        setIntField(term148163, term148163.getClass(), "totalEasyHighScore", 1190219377);
        setIntField(term148163, term148163.getClass(), "totalBasicHighScore", -316377012);
        setIntField(term148163, term148163.getClass(), "totalAdvancedHighScore", 432345840);
        setIntField(term148163, term148163.getClass(), "totalExpertHighScore", 1169088573);
        setIntField(term148163, term148163.getClass(), "totalMasterHighScore", -608256748);
        setIntField(term148163, term148163.getClass(), "totalReMasterHighScore", 57088563);
        setIntField(term148163, term148163.getClass(), "totalHighSync", 676963064);
        setIntField(term148163, term148163.getClass(), "totalEasySync", -109345918);
        setIntField(term148163, term148163.getClass(), "totalBasicSync", 845810848);
        setIntField(term148163, term148163.getClass(), "totalAdvancedSync", 1274797295);
        setIntField(term148163, term148163.getClass(), "totalExpertSync", -697031574);
        setIntField(term148163, term148163.getClass(), "totalMasterSync", 816817953);
        setIntField(term148163, term148163.getClass(), "totalReMasterSync", -1017848768);
        setIntField(term148163, term148163.getClass(), "playerRating", -905294177);
        setIntField(term148163, term148163.getClass(), "highestRating", 494408519);
        setIntField(term148163, term148163.getClass(), "rankAuthTailId", 2119519729);
        setField(term148163, term148163.getClass(), "eventWatchedDate", "xiloHjgKux");
        setField(term148163, term148163.getClass(), "webLimitDate", "Pmajvqueiq");
        setIntField(term148163, term148163.getClass(), "challengeTrackPhase", -1998416939);
        setIntField(term148163, term148163.getClass(), "firstPlayBits", 192504738);
        setField(term148163, term148163.getClass(), "lastPlayDate", "VjCLvZgmuN");
        setIntField(term148163, term148163.getClass(), "lastPlaceId", 1542670334);
        setField(term148163, term148163.getClass(), "lastPlaceName", "tQCalivCMp");
        setIntField(term148163, term148163.getClass(), "lastRegionId", -1464999115);
        setField(term148163, term148163.getClass(), "lastRegionName", "fEiosUzVPM");
        setField(term148163, term148163.getClass(), "lastClientId", "USPyxkJGgn");
        setField(term148163, term148163.getClass(), "lastCountryCode", "VniuLGKjLe");
        setIntField(term148163, term148163.getClass(), "eventPoint", -775236874);
        setIntField(term148163, term148163.getClass(), "totalLv", -1787407543);
        setIntField(term148163, term148163.getClass(), "lastLoginBonusDay", 1128507410);
        setIntField(term148163, term148163.getClass(), "lastSurvivalBonusDay", -996030342);
        setIntField(term148163, term148163.getClass(), "loginBonusLv", -1066054600);
        setField(term148161, term148161.getClass(), "user", term148163);
        setIntField(term148161, term148161.getClass(), "orderId", -1069544499);
        setLongField(term148161, term148161.getClass(), "sortNumber", 104869345921695905L);
        setIntField(term148161, term148161.getClass(), "placeId", -1269515015);
        setField(term148161, term148161.getClass(), "placeName", "nuzwgdczLX");
        setField(term148161, term148161.getClass(), "country", "FdFPAsGWZj");
        setIntField(term148161, term148161.getClass(), "regionId", 1513778339);
        setField(term148161, term148161.getClass(), "playDate", "sqctDxfcQV");
        setField(term148161, term148161.getClass(), "userPlayDate", "KHXlwfHOLE");
        setIntField(term148161, term148161.getClass(), "musicId", 572625070);
        setIntField(term148161, term148161.getClass(), "level", 698446211);
        setIntField(term148161, term148161.getClass(), "gameMode", -1369090745);
        setIntField(term148161, term148161.getClass(), "rivalNum", 1656635458);
        setIntField(term148161, term148161.getClass(), "track", -742289485);
        setIntField(term148161, term148161.getClass(), "eventId", -1250697907);
        setBooleanField(term148161, term148161.getClass(), "isFreeToPlay", true);
        setIntField(term148161, term148161.getClass(), "playerRating", -282881013);
        setLongField(term148161, term148161.getClass(), "playedUserId1", -5803631481953709495L);
        setField(term148161, term148161.getClass(), "playedUserName1", "oxoYdAYVkI");
        setIntField(term148161, term148161.getClass(), "playedMusicLevel1", -1834542296);
        setLongField(term148161, term148161.getClass(), "playedUserId2", -4983190578576857758L);
        setField(term148161, term148161.getClass(), "playedUserName2", "jUYVgbuaNi");
        setIntField(term148161, term148161.getClass(), "playedMusicLevel2", -1684680986);
        setLongField(term148161, term148161.getClass(), "playedUserId3", 1551212309300619628L);
        setField(term148161, term148161.getClass(), "playedUserName3", "IVqaVowLVl");
        setIntField(term148161, term148161.getClass(), "playedMusicLevel3", -1423536556);
        setIntField(term148161, term148161.getClass(), "achievement", 527438457);
        setIntField(term148161, term148161.getClass(), "score", -199170242);
        setIntField(term148161, term148161.getClass(), "tapScore", 302423670);
        setIntField(term148161, term148161.getClass(), "holdScore", 635372275);
        setIntField(term148161, term148161.getClass(), "slideScore", 973010888);
        setIntField(term148161, term148161.getClass(), "breakScore", 323462294);
        setIntField(term148161, term148161.getClass(), "syncRate", 1243991455);
        setIntField(term148161, term148161.getClass(), "vsWin", 1032940790);
        setBooleanField(term148161, term148161.getClass(), "isAllPerfect", true);
        setIntField(term148161, term148161.getClass(), "fullCombo", 991439709);
        setIntField(term148161, term148161.getClass(), "maxFever", -247915844);
        setIntField(term148161, term148161.getClass(), "maxCombo", -2030525581);
        setIntField(term148161, term148161.getClass(), "tapPerfect", -105925373);
        setIntField(term148161, term148161.getClass(), "tapGreat", 2032534825);
        setIntField(term148161, term148161.getClass(), "tapGood", 1065339730);
        setIntField(term148161, term148161.getClass(), "tapBad", -1771954211);
        setIntField(term148161, term148161.getClass(), "holdPerfect", -452935336);
        setIntField(term148161, term148161.getClass(), "holdGreat", 1188307022);
        setIntField(term148161, term148161.getClass(), "holdGood", 2141321691);
        setIntField(term148161, term148161.getClass(), "holdBad", -780023582);
        setIntField(term148161, term148161.getClass(), "slidePerfect", -1793526858);
        setIntField(term148161, term148161.getClass(), "slideGreat", -1753861112);
        setIntField(term148161, term148161.getClass(), "slideGood", 335076566);
        setIntField(term148161, term148161.getClass(), "slideBad", 886802474);
        setIntField(term148161, term148161.getClass(), "breakPerfect", 1913131676);
        setIntField(term148161, term148161.getClass(), "breakGreat", 1468602058);
        setIntField(term148161, term148161.getClass(), "breakGood", -190755825);
        setIntField(term148161, term148161.getClass(), "breakBad", 887184575);
        setBooleanField(term148161, term148161.getClass(), "isTrackSkip", false);
        setBooleanField(term148161, term148161.getClass(), "isHighScore", false);
        setBooleanField(term148161, term148161.getClass(), "isChallengeTrack", true);
        setIntField(term148161, term148161.getClass(), "challengeLife", -1017114184);
        setIntField(term148161, term148161.getClass(), "challengeRemain", 1939754919);
        setIntField(term148161, term148161.getClass(), "isAllPerfectPlus", 110657584);
        term148473 = new Integer(-1648368365);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term148473;
        callMethod(klass, "setTrack", argTypes, term148161, args);
    }

};


