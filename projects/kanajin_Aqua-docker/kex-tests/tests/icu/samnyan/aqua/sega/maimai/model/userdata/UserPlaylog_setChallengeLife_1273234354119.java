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

public class UserPlaylog_setChallengeLife_1273234354119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3995443;
     Object term3995755;

    public UserPlaylog_setChallengeLife_1273234354119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3995449 = new Long(317697620496323748L);
        term3995443 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term3995445 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term3995447 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term3995463 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3995464 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3995468 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3995473 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3995474 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3995478 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term3995443, term3995443.getClass(), "id", -6361649951892347576L);
        setLongField(term3995445, term3995445.getClass(), "id", 7586238482609356368L);
        setLongField(term3995447, term3995447.getClass(), "id", 3122025361334384508L);
        setField(term3995447, term3995447.getClass(), "extId", term3995449);
        setField(term3995447, term3995447.getClass(), "luid", "cNNDOUwQmc");
        setIntField(term3995464, term3995464.getClass(), "year", 2029);
        setShortField(term3995464, term3995464.getClass(), "month", (short) 11);
        setShortField(term3995464, term3995464.getClass(), "day", (short) 11);
        setField(term3995463, term3995463.getClass(), "date", term3995464);
        setByteField(term3995468, term3995468.getClass(), "hour", (byte) 3);
        setByteField(term3995468, term3995468.getClass(), "minute", (byte) 25);
        setByteField(term3995468, term3995468.getClass(), "second", (byte) 50);
        setIntField(term3995468, term3995468.getClass(), "nano", 983388771);
        setField(term3995463, term3995463.getClass(), "time", term3995468);
        setField(term3995447, term3995447.getClass(), "registerTime", term3995463);
        setIntField(term3995474, term3995474.getClass(), "year", 2015);
        setShortField(term3995474, term3995474.getClass(), "month", (short) 9);
        setShortField(term3995474, term3995474.getClass(), "day", (short) 2);
        setField(term3995473, term3995473.getClass(), "date", term3995474);
        setByteField(term3995478, term3995478.getClass(), "hour", (byte) 22);
        setByteField(term3995478, term3995478.getClass(), "minute", (byte) 50);
        setByteField(term3995478, term3995478.getClass(), "second", (byte) 59);
        setIntField(term3995478, term3995478.getClass(), "nano", 946776483);
        setField(term3995473, term3995473.getClass(), "time", term3995478);
        setField(term3995447, term3995447.getClass(), "accessTime", term3995473);
        setField(term3995445, term3995445.getClass(), "card", term3995447);
        setIntField(term3995445, term3995445.getClass(), "lastDataVersion", 119435308);
        setField(term3995445, term3995445.getClass(), "userName", "OvbMNDgTwm");
        setIntField(term3995445, term3995445.getClass(), "point", 729438502);
        setIntField(term3995445, term3995445.getClass(), "totalPoint", -1959227010);
        setIntField(term3995445, term3995445.getClass(), "iconId", -40298001);
        setIntField(term3995445, term3995445.getClass(), "nameplateId", 886721685);
        setIntField(term3995445, term3995445.getClass(), "frameId", 1338174659);
        setIntField(term3995445, term3995445.getClass(), "trophyId", -1619040973);
        setIntField(term3995445, term3995445.getClass(), "playCount", 1347843547);
        setIntField(term3995445, term3995445.getClass(), "playVsCount", 853646758);
        setIntField(term3995445, term3995445.getClass(), "playSyncCount", -1398442315);
        setIntField(term3995445, term3995445.getClass(), "winCount", -1302646310);
        setIntField(term3995445, term3995445.getClass(), "helpCount", 2042687653);
        setIntField(term3995445, term3995445.getClass(), "comboCount", -1632249811);
        setIntField(term3995445, term3995445.getClass(), "feverCount", -654781455);
        setIntField(term3995445, term3995445.getClass(), "totalHiScore", -1558807624);
        setIntField(term3995445, term3995445.getClass(), "totalEasyHighScore", 408824342);
        setIntField(term3995445, term3995445.getClass(), "totalBasicHighScore", -1370525713);
        setIntField(term3995445, term3995445.getClass(), "totalAdvancedHighScore", 1475928297);
        setIntField(term3995445, term3995445.getClass(), "totalExpertHighScore", -665328703);
        setIntField(term3995445, term3995445.getClass(), "totalMasterHighScore", -86800984);
        setIntField(term3995445, term3995445.getClass(), "totalReMasterHighScore", -68851033);
        setIntField(term3995445, term3995445.getClass(), "totalHighSync", -1425692093);
        setIntField(term3995445, term3995445.getClass(), "totalEasySync", -1841587142);
        setIntField(term3995445, term3995445.getClass(), "totalBasicSync", -1296552870);
        setIntField(term3995445, term3995445.getClass(), "totalAdvancedSync", 1047306062);
        setIntField(term3995445, term3995445.getClass(), "totalExpertSync", 2102949066);
        setIntField(term3995445, term3995445.getClass(), "totalMasterSync", 410846112);
        setIntField(term3995445, term3995445.getClass(), "totalReMasterSync", 530896834);
        setIntField(term3995445, term3995445.getClass(), "playerRating", 1043670428);
        setIntField(term3995445, term3995445.getClass(), "highestRating", -2098409303);
        setIntField(term3995445, term3995445.getClass(), "rankAuthTailId", -689665592);
        setField(term3995445, term3995445.getClass(), "eventWatchedDate", "PhbqTNTdCS");
        setField(term3995445, term3995445.getClass(), "webLimitDate", "HWNCLzKKEc");
        setIntField(term3995445, term3995445.getClass(), "challengeTrackPhase", -1156793752);
        setIntField(term3995445, term3995445.getClass(), "firstPlayBits", 108050894);
        setField(term3995445, term3995445.getClass(), "lastPlayDate", "xdZJmbSRnC");
        setIntField(term3995445, term3995445.getClass(), "lastPlaceId", 1024142294);
        setField(term3995445, term3995445.getClass(), "lastPlaceName", "GjioXRWEJB");
        setIntField(term3995445, term3995445.getClass(), "lastRegionId", 650920775);
        setField(term3995445, term3995445.getClass(), "lastRegionName", "rbLwIMvPNI");
        setField(term3995445, term3995445.getClass(), "lastClientId", "xMKosdDoZA");
        setField(term3995445, term3995445.getClass(), "lastCountryCode", "KEVbXSBXno");
        setIntField(term3995445, term3995445.getClass(), "eventPoint", 441194832);
        setIntField(term3995445, term3995445.getClass(), "totalLv", 1339365546);
        setIntField(term3995445, term3995445.getClass(), "lastLoginBonusDay", -1949984821);
        setIntField(term3995445, term3995445.getClass(), "lastSurvivalBonusDay", -1261449453);
        setIntField(term3995445, term3995445.getClass(), "loginBonusLv", 772696792);
        setField(term3995443, term3995443.getClass(), "user", term3995445);
        setIntField(term3995443, term3995443.getClass(), "orderId", -2110154817);
        setLongField(term3995443, term3995443.getClass(), "sortNumber", -601572748021404131L);
        setIntField(term3995443, term3995443.getClass(), "placeId", 1267644027);
        setField(term3995443, term3995443.getClass(), "placeName", "VlsNSpAvpr");
        setField(term3995443, term3995443.getClass(), "country", "BnSoaEBFpT");
        setIntField(term3995443, term3995443.getClass(), "regionId", 1004696170);
        setField(term3995443, term3995443.getClass(), "playDate", "FYVgTsLfyb");
        setField(term3995443, term3995443.getClass(), "userPlayDate", "UepvhboZnK");
        setIntField(term3995443, term3995443.getClass(), "musicId", 905383620);
        setIntField(term3995443, term3995443.getClass(), "level", 322928113);
        setIntField(term3995443, term3995443.getClass(), "gameMode", -199359869);
        setIntField(term3995443, term3995443.getClass(), "rivalNum", -313487630);
        setIntField(term3995443, term3995443.getClass(), "track", 2056582039);
        setIntField(term3995443, term3995443.getClass(), "eventId", -620175308);
        setBooleanField(term3995443, term3995443.getClass(), "isFreeToPlay", false);
        setIntField(term3995443, term3995443.getClass(), "playerRating", 1901323936);
        setLongField(term3995443, term3995443.getClass(), "playedUserId1", 3902150510545045561L);
        setField(term3995443, term3995443.getClass(), "playedUserName1", "pGxjnJFyOK");
        setIntField(term3995443, term3995443.getClass(), "playedMusicLevel1", -304097503);
        setLongField(term3995443, term3995443.getClass(), "playedUserId2", -936687577903416806L);
        setField(term3995443, term3995443.getClass(), "playedUserName2", "JMuFsjxLwD");
        setIntField(term3995443, term3995443.getClass(), "playedMusicLevel2", -2024096476);
        setLongField(term3995443, term3995443.getClass(), "playedUserId3", -2805876971292107125L);
        setField(term3995443, term3995443.getClass(), "playedUserName3", "puVcuMMICd");
        setIntField(term3995443, term3995443.getClass(), "playedMusicLevel3", -1644558697);
        setIntField(term3995443, term3995443.getClass(), "achievement", 587421793);
        setIntField(term3995443, term3995443.getClass(), "score", 362013918);
        setIntField(term3995443, term3995443.getClass(), "tapScore", -2015739805);
        setIntField(term3995443, term3995443.getClass(), "holdScore", 800955780);
        setIntField(term3995443, term3995443.getClass(), "slideScore", -324146659);
        setIntField(term3995443, term3995443.getClass(), "breakScore", -1076685208);
        setIntField(term3995443, term3995443.getClass(), "syncRate", 1612408968);
        setIntField(term3995443, term3995443.getClass(), "vsWin", 1753495366);
        setBooleanField(term3995443, term3995443.getClass(), "isAllPerfect", false);
        setIntField(term3995443, term3995443.getClass(), "fullCombo", -1919252442);
        setIntField(term3995443, term3995443.getClass(), "maxFever", 1057084790);
        setIntField(term3995443, term3995443.getClass(), "maxCombo", 886298961);
        setIntField(term3995443, term3995443.getClass(), "tapPerfect", -1644437046);
        setIntField(term3995443, term3995443.getClass(), "tapGreat", -1686219458);
        setIntField(term3995443, term3995443.getClass(), "tapGood", 526953632);
        setIntField(term3995443, term3995443.getClass(), "tapBad", 247849631);
        setIntField(term3995443, term3995443.getClass(), "holdPerfect", 1711592617);
        setIntField(term3995443, term3995443.getClass(), "holdGreat", -1586341303);
        setIntField(term3995443, term3995443.getClass(), "holdGood", 597413629);
        setIntField(term3995443, term3995443.getClass(), "holdBad", -1713202872);
        setIntField(term3995443, term3995443.getClass(), "slidePerfect", 1442085733);
        setIntField(term3995443, term3995443.getClass(), "slideGreat", 963116356);
        setIntField(term3995443, term3995443.getClass(), "slideGood", -18811380);
        setIntField(term3995443, term3995443.getClass(), "slideBad", 1312041259);
        setIntField(term3995443, term3995443.getClass(), "breakPerfect", -158834702);
        setIntField(term3995443, term3995443.getClass(), "breakGreat", -755403915);
        setIntField(term3995443, term3995443.getClass(), "breakGood", -1569015337);
        setIntField(term3995443, term3995443.getClass(), "breakBad", -2091731836);
        setBooleanField(term3995443, term3995443.getClass(), "isTrackSkip", true);
        setBooleanField(term3995443, term3995443.getClass(), "isHighScore", true);
        setBooleanField(term3995443, term3995443.getClass(), "isChallengeTrack", false);
        setIntField(term3995443, term3995443.getClass(), "challengeLife", -960579208);
        setIntField(term3995443, term3995443.getClass(), "challengeRemain", 244490980);
        setIntField(term3995443, term3995443.getClass(), "isAllPerfectPlus", 932104021);
        term3995755 = new Integer(-2005445504);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3995755;
        callMethod(klass, "setChallengeLife", argTypes, term3995443, args);
    }

};


