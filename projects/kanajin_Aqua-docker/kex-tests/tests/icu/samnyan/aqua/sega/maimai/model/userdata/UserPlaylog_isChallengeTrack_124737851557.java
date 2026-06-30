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

public class UserPlaylog_isChallengeTrack_124737851557 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139295;

    public UserPlaylog_isChallengeTrack_124737851557() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term139301 = new Long(8010417010297313651L);
        term139295 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term139297 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term139299 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term139315 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term139316 = newInstance(Class.forName("java.time.LocalDate"));
        Object term139320 = newInstance(Class.forName("java.time.LocalTime"));
        Object term139325 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term139326 = newInstance(Class.forName("java.time.LocalDate"));
        Object term139330 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term139295, term139295.getClass(), "id", -7518786238963096989L);
        setLongField(term139297, term139297.getClass(), "id", 4080207137910567677L);
        setLongField(term139299, term139299.getClass(), "id", -4510075168255947133L);
        setField(term139299, term139299.getClass(), "extId", term139301);
        setField(term139299, term139299.getClass(), "luid", "hDGENUWiHc");
        setIntField(term139316, term139316.getClass(), "year", 2025);
        setShortField(term139316, term139316.getClass(), "month", (short) 7);
        setShortField(term139316, term139316.getClass(), "day", (short) 22);
        setField(term139315, term139315.getClass(), "date", term139316);
        setByteField(term139320, term139320.getClass(), "hour", (byte) 19);
        setByteField(term139320, term139320.getClass(), "minute", (byte) 18);
        setByteField(term139320, term139320.getClass(), "second", (byte) 28);
        setIntField(term139320, term139320.getClass(), "nano", 975087142);
        setField(term139315, term139315.getClass(), "time", term139320);
        setField(term139299, term139299.getClass(), "registerTime", term139315);
        setIntField(term139326, term139326.getClass(), "year", 2018);
        setShortField(term139326, term139326.getClass(), "month", (short) 6);
        setShortField(term139326, term139326.getClass(), "day", (short) 29);
        setField(term139325, term139325.getClass(), "date", term139326);
        setByteField(term139330, term139330.getClass(), "hour", (byte) 0);
        setByteField(term139330, term139330.getClass(), "minute", (byte) 24);
        setByteField(term139330, term139330.getClass(), "second", (byte) 5);
        setIntField(term139330, term139330.getClass(), "nano", 130907665);
        setField(term139325, term139325.getClass(), "time", term139330);
        setField(term139299, term139299.getClass(), "accessTime", term139325);
        setField(term139297, term139297.getClass(), "card", term139299);
        setIntField(term139297, term139297.getClass(), "lastDataVersion", -677194022);
        setField(term139297, term139297.getClass(), "userName", "PLPXyBztQB");
        setIntField(term139297, term139297.getClass(), "point", 2097521115);
        setIntField(term139297, term139297.getClass(), "totalPoint", 1336945294);
        setIntField(term139297, term139297.getClass(), "iconId", 2060487362);
        setIntField(term139297, term139297.getClass(), "nameplateId", -1694934458);
        setIntField(term139297, term139297.getClass(), "frameId", 92989858);
        setIntField(term139297, term139297.getClass(), "trophyId", -2117162462);
        setIntField(term139297, term139297.getClass(), "playCount", -2124947990);
        setIntField(term139297, term139297.getClass(), "playVsCount", 614149136);
        setIntField(term139297, term139297.getClass(), "playSyncCount", 1955650621);
        setIntField(term139297, term139297.getClass(), "winCount", -1524889218);
        setIntField(term139297, term139297.getClass(), "helpCount", 527941185);
        setIntField(term139297, term139297.getClass(), "comboCount", 63598329);
        setIntField(term139297, term139297.getClass(), "feverCount", 176783226);
        setIntField(term139297, term139297.getClass(), "totalHiScore", 834511096);
        setIntField(term139297, term139297.getClass(), "totalEasyHighScore", 1767514928);
        setIntField(term139297, term139297.getClass(), "totalBasicHighScore", -103728860);
        setIntField(term139297, term139297.getClass(), "totalAdvancedHighScore", -1909656924);
        setIntField(term139297, term139297.getClass(), "totalExpertHighScore", 1706384864);
        setIntField(term139297, term139297.getClass(), "totalMasterHighScore", 2048935983);
        setIntField(term139297, term139297.getClass(), "totalReMasterHighScore", 1612480984);
        setIntField(term139297, term139297.getClass(), "totalHighSync", 540984053);
        setIntField(term139297, term139297.getClass(), "totalEasySync", 750186468);
        setIntField(term139297, term139297.getClass(), "totalBasicSync", 1084151894);
        setIntField(term139297, term139297.getClass(), "totalAdvancedSync", -403593340);
        setIntField(term139297, term139297.getClass(), "totalExpertSync", -168848568);
        setIntField(term139297, term139297.getClass(), "totalMasterSync", -363337546);
        setIntField(term139297, term139297.getClass(), "totalReMasterSync", 897105715);
        setIntField(term139297, term139297.getClass(), "playerRating", -1763192318);
        setIntField(term139297, term139297.getClass(), "highestRating", 1971653394);
        setIntField(term139297, term139297.getClass(), "rankAuthTailId", 1865396715);
        setField(term139297, term139297.getClass(), "eventWatchedDate", "hESiinBBOz");
        setField(term139297, term139297.getClass(), "webLimitDate", "llUdMgKbEf");
        setIntField(term139297, term139297.getClass(), "challengeTrackPhase", -690638114);
        setIntField(term139297, term139297.getClass(), "firstPlayBits", 371111200);
        setField(term139297, term139297.getClass(), "lastPlayDate", "BqtmlODLQw");
        setIntField(term139297, term139297.getClass(), "lastPlaceId", -316850029);
        setField(term139297, term139297.getClass(), "lastPlaceName", "MYesfpduIU");
        setIntField(term139297, term139297.getClass(), "lastRegionId", 1533443366);
        setField(term139297, term139297.getClass(), "lastRegionName", "KHmFMOciUu");
        setField(term139297, term139297.getClass(), "lastClientId", "kUHQbcpRuo");
        setField(term139297, term139297.getClass(), "lastCountryCode", "ChlXqeeQJI");
        setIntField(term139297, term139297.getClass(), "eventPoint", -1540437173);
        setIntField(term139297, term139297.getClass(), "totalLv", 297826139);
        setIntField(term139297, term139297.getClass(), "lastLoginBonusDay", -1493036473);
        setIntField(term139297, term139297.getClass(), "lastSurvivalBonusDay", -1216310667);
        setIntField(term139297, term139297.getClass(), "loginBonusLv", -780354849);
        setField(term139295, term139295.getClass(), "user", term139297);
        setIntField(term139295, term139295.getClass(), "orderId", -1963671315);
        setLongField(term139295, term139295.getClass(), "sortNumber", -8013089718329780345L);
        setIntField(term139295, term139295.getClass(), "placeId", 2102666147);
        setField(term139295, term139295.getClass(), "placeName", "RAiPMSzjOv");
        setField(term139295, term139295.getClass(), "country", "HVRnXyYuKh");
        setIntField(term139295, term139295.getClass(), "regionId", -2128240390);
        setField(term139295, term139295.getClass(), "playDate", "SKvGKyhOVM");
        setField(term139295, term139295.getClass(), "userPlayDate", "rfjheENdEG");
        setIntField(term139295, term139295.getClass(), "musicId", -642220987);
        setIntField(term139295, term139295.getClass(), "level", -330877175);
        setIntField(term139295, term139295.getClass(), "gameMode", 924610813);
        setIntField(term139295, term139295.getClass(), "rivalNum", 326759885);
        setIntField(term139295, term139295.getClass(), "track", 1717078401);
        setIntField(term139295, term139295.getClass(), "eventId", 937682788);
        setBooleanField(term139295, term139295.getClass(), "isFreeToPlay", false);
        setIntField(term139295, term139295.getClass(), "playerRating", 374255307);
        setLongField(term139295, term139295.getClass(), "playedUserId1", -3786581600529665600L);
        setField(term139295, term139295.getClass(), "playedUserName1", "DqnOOFfIgX");
        setIntField(term139295, term139295.getClass(), "playedMusicLevel1", -1684423391);
        setLongField(term139295, term139295.getClass(), "playedUserId2", -8600923187723020360L);
        setField(term139295, term139295.getClass(), "playedUserName2", "ENRTZxfyCj");
        setIntField(term139295, term139295.getClass(), "playedMusicLevel2", -377360316);
        setLongField(term139295, term139295.getClass(), "playedUserId3", 5010786103545221543L);
        setField(term139295, term139295.getClass(), "playedUserName3", "CRCgbTFQSa");
        setIntField(term139295, term139295.getClass(), "playedMusicLevel3", 1546676215);
        setIntField(term139295, term139295.getClass(), "achievement", -1338644465);
        setIntField(term139295, term139295.getClass(), "score", -2145078875);
        setIntField(term139295, term139295.getClass(), "tapScore", -1673144446);
        setIntField(term139295, term139295.getClass(), "holdScore", 913354499);
        setIntField(term139295, term139295.getClass(), "slideScore", -1016590318);
        setIntField(term139295, term139295.getClass(), "breakScore", -1194664404);
        setIntField(term139295, term139295.getClass(), "syncRate", -155628991);
        setIntField(term139295, term139295.getClass(), "vsWin", -393025707);
        setBooleanField(term139295, term139295.getClass(), "isAllPerfect", true);
        setIntField(term139295, term139295.getClass(), "fullCombo", -2030798001);
        setIntField(term139295, term139295.getClass(), "maxFever", 1588680079);
        setIntField(term139295, term139295.getClass(), "maxCombo", -432120908);
        setIntField(term139295, term139295.getClass(), "tapPerfect", 1194181835);
        setIntField(term139295, term139295.getClass(), "tapGreat", 1632400306);
        setIntField(term139295, term139295.getClass(), "tapGood", 982516945);
        setIntField(term139295, term139295.getClass(), "tapBad", 204667016);
        setIntField(term139295, term139295.getClass(), "holdPerfect", 1802575126);
        setIntField(term139295, term139295.getClass(), "holdGreat", 27548674);
        setIntField(term139295, term139295.getClass(), "holdGood", 534250372);
        setIntField(term139295, term139295.getClass(), "holdBad", -844433028);
        setIntField(term139295, term139295.getClass(), "slidePerfect", 176212160);
        setIntField(term139295, term139295.getClass(), "slideGreat", 528422554);
        setIntField(term139295, term139295.getClass(), "slideGood", 2135164524);
        setIntField(term139295, term139295.getClass(), "slideBad", 1763724087);
        setIntField(term139295, term139295.getClass(), "breakPerfect", -2068967312);
        setIntField(term139295, term139295.getClass(), "breakGreat", 1090298719);
        setIntField(term139295, term139295.getClass(), "breakGood", -1389701023);
        setIntField(term139295, term139295.getClass(), "breakBad", 710754133);
        setBooleanField(term139295, term139295.getClass(), "isTrackSkip", true);
        setBooleanField(term139295, term139295.getClass(), "isHighScore", false);
        setBooleanField(term139295, term139295.getClass(), "isChallengeTrack", true);
        setIntField(term139295, term139295.getClass(), "challengeLife", -1685837203);
        setIntField(term139295, term139295.getClass(), "challengeRemain", -1533007635);
        setIntField(term139295, term139295.getClass(), "isAllPerfectPlus", -351928967);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isChallengeTrack", argTypes, term139295, args);
    }

};


