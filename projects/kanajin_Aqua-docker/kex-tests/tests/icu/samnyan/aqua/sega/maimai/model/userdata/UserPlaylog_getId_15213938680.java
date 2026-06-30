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

public class UserPlaylog_getId_15213938680 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112391;

    public UserPlaylog_getId_15213938680() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term112397 = new Long(-278716491237139968L);
        term112391 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term112393 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term112395 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term112411 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term112412 = newInstance(Class.forName("java.time.LocalDate"));
        Object term112416 = newInstance(Class.forName("java.time.LocalTime"));
        Object term112421 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term112422 = newInstance(Class.forName("java.time.LocalDate"));
        Object term112426 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term112391, term112391.getClass(), "id", -6320896470659278539L);
        setLongField(term112393, term112393.getClass(), "id", 1357834364621364655L);
        setLongField(term112395, term112395.getClass(), "id", 5242528388479853404L);
        setField(term112395, term112395.getClass(), "extId", term112397);
        setField(term112395, term112395.getClass(), "luid", "FcuzXnxIut");
        setIntField(term112412, term112412.getClass(), "year", 2021);
        setShortField(term112412, term112412.getClass(), "month", (short) 9);
        setShortField(term112412, term112412.getClass(), "day", (short) 27);
        setField(term112411, term112411.getClass(), "date", term112412);
        setByteField(term112416, term112416.getClass(), "hour", (byte) 20);
        setByteField(term112416, term112416.getClass(), "minute", (byte) 43);
        setByteField(term112416, term112416.getClass(), "second", (byte) 41);
        setIntField(term112416, term112416.getClass(), "nano", 5544728);
        setField(term112411, term112411.getClass(), "time", term112416);
        setField(term112395, term112395.getClass(), "registerTime", term112411);
        setIntField(term112422, term112422.getClass(), "year", 2028);
        setShortField(term112422, term112422.getClass(), "month", (short) 1);
        setShortField(term112422, term112422.getClass(), "day", (short) 21);
        setField(term112421, term112421.getClass(), "date", term112422);
        setByteField(term112426, term112426.getClass(), "hour", (byte) 22);
        setByteField(term112426, term112426.getClass(), "minute", (byte) 51);
        setByteField(term112426, term112426.getClass(), "second", (byte) 58);
        setIntField(term112426, term112426.getClass(), "nano", 921867240);
        setField(term112421, term112421.getClass(), "time", term112426);
        setField(term112395, term112395.getClass(), "accessTime", term112421);
        setField(term112393, term112393.getClass(), "card", term112395);
        setIntField(term112393, term112393.getClass(), "lastDataVersion", -374210090);
        setField(term112393, term112393.getClass(), "userName", "fyepabvKPu");
        setIntField(term112393, term112393.getClass(), "point", 1118760300);
        setIntField(term112393, term112393.getClass(), "totalPoint", 843719523);
        setIntField(term112393, term112393.getClass(), "iconId", -815481212);
        setIntField(term112393, term112393.getClass(), "nameplateId", -1439310082);
        setIntField(term112393, term112393.getClass(), "frameId", 312293379);
        setIntField(term112393, term112393.getClass(), "trophyId", 241022625);
        setIntField(term112393, term112393.getClass(), "playCount", 25543628);
        setIntField(term112393, term112393.getClass(), "playVsCount", 88927707);
        setIntField(term112393, term112393.getClass(), "playSyncCount", 573060356);
        setIntField(term112393, term112393.getClass(), "winCount", 1701020279);
        setIntField(term112393, term112393.getClass(), "helpCount", 1578074399);
        setIntField(term112393, term112393.getClass(), "comboCount", 1266129777);
        setIntField(term112393, term112393.getClass(), "feverCount", -2062665446);
        setIntField(term112393, term112393.getClass(), "totalHiScore", 766366420);
        setIntField(term112393, term112393.getClass(), "totalEasyHighScore", -440483620);
        setIntField(term112393, term112393.getClass(), "totalBasicHighScore", -63052239);
        setIntField(term112393, term112393.getClass(), "totalAdvancedHighScore", -302024503);
        setIntField(term112393, term112393.getClass(), "totalExpertHighScore", -1240468791);
        setIntField(term112393, term112393.getClass(), "totalMasterHighScore", 1973145098);
        setIntField(term112393, term112393.getClass(), "totalReMasterHighScore", -75514449);
        setIntField(term112393, term112393.getClass(), "totalHighSync", -373129189);
        setIntField(term112393, term112393.getClass(), "totalEasySync", 454194524);
        setIntField(term112393, term112393.getClass(), "totalBasicSync", -1558450532);
        setIntField(term112393, term112393.getClass(), "totalAdvancedSync", 239020439);
        setIntField(term112393, term112393.getClass(), "totalExpertSync", 557187198);
        setIntField(term112393, term112393.getClass(), "totalMasterSync", -2031962212);
        setIntField(term112393, term112393.getClass(), "totalReMasterSync", 1718205943);
        setIntField(term112393, term112393.getClass(), "playerRating", 1181838305);
        setIntField(term112393, term112393.getClass(), "highestRating", -972613396);
        setIntField(term112393, term112393.getClass(), "rankAuthTailId", -118493195);
        setField(term112393, term112393.getClass(), "eventWatchedDate", "igjhLhfUDg");
        setField(term112393, term112393.getClass(), "webLimitDate", "aphCSNJgJZ");
        setIntField(term112393, term112393.getClass(), "challengeTrackPhase", 762981298);
        setIntField(term112393, term112393.getClass(), "firstPlayBits", -729574845);
        setField(term112393, term112393.getClass(), "lastPlayDate", "JtamsBczow");
        setIntField(term112393, term112393.getClass(), "lastPlaceId", -1849590708);
        setField(term112393, term112393.getClass(), "lastPlaceName", "ckScPlFqWx");
        setIntField(term112393, term112393.getClass(), "lastRegionId", 2121883333);
        setField(term112393, term112393.getClass(), "lastRegionName", "KIGJgoclUB");
        setField(term112393, term112393.getClass(), "lastClientId", "LxnOVCDRzb");
        setField(term112393, term112393.getClass(), "lastCountryCode", "MPsfpSOhwQ");
        setIntField(term112393, term112393.getClass(), "eventPoint", -794025316);
        setIntField(term112393, term112393.getClass(), "totalLv", 252848871);
        setIntField(term112393, term112393.getClass(), "lastLoginBonusDay", -917431784);
        setIntField(term112393, term112393.getClass(), "lastSurvivalBonusDay", -579439570);
        setIntField(term112393, term112393.getClass(), "loginBonusLv", -1592976382);
        setField(term112391, term112391.getClass(), "user", term112393);
        setIntField(term112391, term112391.getClass(), "orderId", -585428898);
        setLongField(term112391, term112391.getClass(), "sortNumber", -9094760859641883612L);
        setIntField(term112391, term112391.getClass(), "placeId", -832361153);
        setField(term112391, term112391.getClass(), "placeName", "GkTxuqMoMw");
        setField(term112391, term112391.getClass(), "country", "MdlLUfrIYx");
        setIntField(term112391, term112391.getClass(), "regionId", 544931629);
        setField(term112391, term112391.getClass(), "playDate", "trNmqmTVhn");
        setField(term112391, term112391.getClass(), "userPlayDate", "oRcEdheGqg");
        setIntField(term112391, term112391.getClass(), "musicId", -1187175631);
        setIntField(term112391, term112391.getClass(), "level", -1209302829);
        setIntField(term112391, term112391.getClass(), "gameMode", 1452201291);
        setIntField(term112391, term112391.getClass(), "rivalNum", -238634517);
        setIntField(term112391, term112391.getClass(), "track", -258929351);
        setIntField(term112391, term112391.getClass(), "eventId", 1333523587);
        setBooleanField(term112391, term112391.getClass(), "isFreeToPlay", true);
        setIntField(term112391, term112391.getClass(), "playerRating", 873176518);
        setLongField(term112391, term112391.getClass(), "playedUserId1", 1789068809283154146L);
        setField(term112391, term112391.getClass(), "playedUserName1", "vwQAcJEANy");
        setIntField(term112391, term112391.getClass(), "playedMusicLevel1", -1764702381);
        setLongField(term112391, term112391.getClass(), "playedUserId2", -6776970214701629330L);
        setField(term112391, term112391.getClass(), "playedUserName2", "bakvKrXWXm");
        setIntField(term112391, term112391.getClass(), "playedMusicLevel2", 1689905396);
        setLongField(term112391, term112391.getClass(), "playedUserId3", 6187687406539061577L);
        setField(term112391, term112391.getClass(), "playedUserName3", "ixpDCFiQaP");
        setIntField(term112391, term112391.getClass(), "playedMusicLevel3", 1359898476);
        setIntField(term112391, term112391.getClass(), "achievement", 658413530);
        setIntField(term112391, term112391.getClass(), "score", -912984604);
        setIntField(term112391, term112391.getClass(), "tapScore", -584783034);
        setIntField(term112391, term112391.getClass(), "holdScore", -1409611196);
        setIntField(term112391, term112391.getClass(), "slideScore", -909317577);
        setIntField(term112391, term112391.getClass(), "breakScore", -621683769);
        setIntField(term112391, term112391.getClass(), "syncRate", 884431781);
        setIntField(term112391, term112391.getClass(), "vsWin", -287142228);
        setBooleanField(term112391, term112391.getClass(), "isAllPerfect", true);
        setIntField(term112391, term112391.getClass(), "fullCombo", -982713543);
        setIntField(term112391, term112391.getClass(), "maxFever", 113516580);
        setIntField(term112391, term112391.getClass(), "maxCombo", 515785947);
        setIntField(term112391, term112391.getClass(), "tapPerfect", 1732018853);
        setIntField(term112391, term112391.getClass(), "tapGreat", 278763848);
        setIntField(term112391, term112391.getClass(), "tapGood", -799242832);
        setIntField(term112391, term112391.getClass(), "tapBad", -1423839734);
        setIntField(term112391, term112391.getClass(), "holdPerfect", -1314164926);
        setIntField(term112391, term112391.getClass(), "holdGreat", 1543292290);
        setIntField(term112391, term112391.getClass(), "holdGood", -1850504566);
        setIntField(term112391, term112391.getClass(), "holdBad", -798400528);
        setIntField(term112391, term112391.getClass(), "slidePerfect", 2045226655);
        setIntField(term112391, term112391.getClass(), "slideGreat", -1704065897);
        setIntField(term112391, term112391.getClass(), "slideGood", 714518855);
        setIntField(term112391, term112391.getClass(), "slideBad", 1746565740);
        setIntField(term112391, term112391.getClass(), "breakPerfect", -1867698927);
        setIntField(term112391, term112391.getClass(), "breakGreat", 651844085);
        setIntField(term112391, term112391.getClass(), "breakGood", 1278789451);
        setIntField(term112391, term112391.getClass(), "breakBad", -1480106431);
        setBooleanField(term112391, term112391.getClass(), "isTrackSkip", false);
        setBooleanField(term112391, term112391.getClass(), "isHighScore", true);
        setBooleanField(term112391, term112391.getClass(), "isChallengeTrack", true);
        setIntField(term112391, term112391.getClass(), "challengeLife", -64517730);
        setIntField(term112391, term112391.getClass(), "challengeRemain", 1783779620);
        setIntField(term112391, term112391.getClass(), "isAllPerfectPlus", 709868634);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term112391, args);
    }

};


