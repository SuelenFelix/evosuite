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

public class UserPlaylog_toString_1288668204125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3998283;

    public UserPlaylog_toString_1288668204125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3998289 = new Long(7278749259716792201L);
        term3998283 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term3998285 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term3998287 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term3998303 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3998304 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3998308 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3998313 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3998314 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3998318 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term3998283, term3998283.getClass(), "id", 2497473749477262785L);
        setLongField(term3998285, term3998285.getClass(), "id", 4376242976550330345L);
        setLongField(term3998287, term3998287.getClass(), "id", -2645384571828111360L);
        setField(term3998287, term3998287.getClass(), "extId", term3998289);
        setField(term3998287, term3998287.getClass(), "luid", "cleVxmQUIg");
        setIntField(term3998304, term3998304.getClass(), "year", 2016);
        setShortField(term3998304, term3998304.getClass(), "month", (short) 6);
        setShortField(term3998304, term3998304.getClass(), "day", (short) 25);
        setField(term3998303, term3998303.getClass(), "date", term3998304);
        setByteField(term3998308, term3998308.getClass(), "hour", (byte) 0);
        setByteField(term3998308, term3998308.getClass(), "minute", (byte) 32);
        setByteField(term3998308, term3998308.getClass(), "second", (byte) 11);
        setIntField(term3998308, term3998308.getClass(), "nano", 525859777);
        setField(term3998303, term3998303.getClass(), "time", term3998308);
        setField(term3998287, term3998287.getClass(), "registerTime", term3998303);
        setIntField(term3998314, term3998314.getClass(), "year", 2010);
        setShortField(term3998314, term3998314.getClass(), "month", (short) 9);
        setShortField(term3998314, term3998314.getClass(), "day", (short) 24);
        setField(term3998313, term3998313.getClass(), "date", term3998314);
        setByteField(term3998318, term3998318.getClass(), "hour", (byte) 9);
        setByteField(term3998318, term3998318.getClass(), "minute", (byte) 10);
        setByteField(term3998318, term3998318.getClass(), "second", (byte) 32);
        setIntField(term3998318, term3998318.getClass(), "nano", 47267335);
        setField(term3998313, term3998313.getClass(), "time", term3998318);
        setField(term3998287, term3998287.getClass(), "accessTime", term3998313);
        setField(term3998285, term3998285.getClass(), "card", term3998287);
        setIntField(term3998285, term3998285.getClass(), "lastDataVersion", 208548005);
        setField(term3998285, term3998285.getClass(), "userName", "VhVRAZoGov");
        setIntField(term3998285, term3998285.getClass(), "point", -1807349987);
        setIntField(term3998285, term3998285.getClass(), "totalPoint", -1498125574);
        setIntField(term3998285, term3998285.getClass(), "iconId", -131251280);
        setIntField(term3998285, term3998285.getClass(), "nameplateId", -475442993);
        setIntField(term3998285, term3998285.getClass(), "frameId", -311600877);
        setIntField(term3998285, term3998285.getClass(), "trophyId", -1537948282);
        setIntField(term3998285, term3998285.getClass(), "playCount", 98035733);
        setIntField(term3998285, term3998285.getClass(), "playVsCount", -84796654);
        setIntField(term3998285, term3998285.getClass(), "playSyncCount", 1899846972);
        setIntField(term3998285, term3998285.getClass(), "winCount", -1310580432);
        setIntField(term3998285, term3998285.getClass(), "helpCount", 1622831617);
        setIntField(term3998285, term3998285.getClass(), "comboCount", -1867019715);
        setIntField(term3998285, term3998285.getClass(), "feverCount", 239756106);
        setIntField(term3998285, term3998285.getClass(), "totalHiScore", -1018633530);
        setIntField(term3998285, term3998285.getClass(), "totalEasyHighScore", 2147223944);
        setIntField(term3998285, term3998285.getClass(), "totalBasicHighScore", 296121344);
        setIntField(term3998285, term3998285.getClass(), "totalAdvancedHighScore", 287709488);
        setIntField(term3998285, term3998285.getClass(), "totalExpertHighScore", 211359433);
        setIntField(term3998285, term3998285.getClass(), "totalMasterHighScore", 993400423);
        setIntField(term3998285, term3998285.getClass(), "totalReMasterHighScore", -225408028);
        setIntField(term3998285, term3998285.getClass(), "totalHighSync", -917306101);
        setIntField(term3998285, term3998285.getClass(), "totalEasySync", 325332869);
        setIntField(term3998285, term3998285.getClass(), "totalBasicSync", -90954097);
        setIntField(term3998285, term3998285.getClass(), "totalAdvancedSync", -791928454);
        setIntField(term3998285, term3998285.getClass(), "totalExpertSync", -958711488);
        setIntField(term3998285, term3998285.getClass(), "totalMasterSync", -1762652062);
        setIntField(term3998285, term3998285.getClass(), "totalReMasterSync", -1171441436);
        setIntField(term3998285, term3998285.getClass(), "playerRating", -48951849);
        setIntField(term3998285, term3998285.getClass(), "highestRating", -1873041695);
        setIntField(term3998285, term3998285.getClass(), "rankAuthTailId", -348194182);
        setField(term3998285, term3998285.getClass(), "eventWatchedDate", "XFotHfcuFV");
        setField(term3998285, term3998285.getClass(), "webLimitDate", "PGPCRydiNE");
        setIntField(term3998285, term3998285.getClass(), "challengeTrackPhase", 1533046849);
        setIntField(term3998285, term3998285.getClass(), "firstPlayBits", -393575361);
        setField(term3998285, term3998285.getClass(), "lastPlayDate", "iXcDAxMBxO");
        setIntField(term3998285, term3998285.getClass(), "lastPlaceId", -1836600748);
        setField(term3998285, term3998285.getClass(), "lastPlaceName", "vCXDExTEyK");
        setIntField(term3998285, term3998285.getClass(), "lastRegionId", 1792093803);
        setField(term3998285, term3998285.getClass(), "lastRegionName", "tvdnYcSIGT");
        setField(term3998285, term3998285.getClass(), "lastClientId", "lxrICmzPlf");
        setField(term3998285, term3998285.getClass(), "lastCountryCode", "ivLnlwigGx");
        setIntField(term3998285, term3998285.getClass(), "eventPoint", 320565951);
        setIntField(term3998285, term3998285.getClass(), "totalLv", 485276191);
        setIntField(term3998285, term3998285.getClass(), "lastLoginBonusDay", -1539379658);
        setIntField(term3998285, term3998285.getClass(), "lastSurvivalBonusDay", 1006524269);
        setIntField(term3998285, term3998285.getClass(), "loginBonusLv", -711919305);
        setField(term3998283, term3998283.getClass(), "user", term3998285);
        setIntField(term3998283, term3998283.getClass(), "orderId", -470246848);
        setLongField(term3998283, term3998283.getClass(), "sortNumber", -6785888605478742537L);
        setIntField(term3998283, term3998283.getClass(), "placeId", -142008196);
        setField(term3998283, term3998283.getClass(), "placeName", "BRlOWqqbZR");
        setField(term3998283, term3998283.getClass(), "country", "eCeubaKSgj");
        setIntField(term3998283, term3998283.getClass(), "regionId", 1309807526);
        setField(term3998283, term3998283.getClass(), "playDate", "PlecqGVYPU");
        setField(term3998283, term3998283.getClass(), "userPlayDate", "rmEycgPtiu");
        setIntField(term3998283, term3998283.getClass(), "musicId", 1128944388);
        setIntField(term3998283, term3998283.getClass(), "level", 1693382458);
        setIntField(term3998283, term3998283.getClass(), "gameMode", 1047197147);
        setIntField(term3998283, term3998283.getClass(), "rivalNum", 959983036);
        setIntField(term3998283, term3998283.getClass(), "track", -1461263859);
        setIntField(term3998283, term3998283.getClass(), "eventId", 1580724518);
        setBooleanField(term3998283, term3998283.getClass(), "isFreeToPlay", true);
        setIntField(term3998283, term3998283.getClass(), "playerRating", 1556612969);
        setLongField(term3998283, term3998283.getClass(), "playedUserId1", 2813958369699665553L);
        setField(term3998283, term3998283.getClass(), "playedUserName1", "eufxILdOmW");
        setIntField(term3998283, term3998283.getClass(), "playedMusicLevel1", 2012896172);
        setLongField(term3998283, term3998283.getClass(), "playedUserId2", -3498788591500831189L);
        setField(term3998283, term3998283.getClass(), "playedUserName2", "exjZfaquLX");
        setIntField(term3998283, term3998283.getClass(), "playedMusicLevel2", 914936578);
        setLongField(term3998283, term3998283.getClass(), "playedUserId3", -7888300659011371406L);
        setField(term3998283, term3998283.getClass(), "playedUserName3", "TfICdPirff");
        setIntField(term3998283, term3998283.getClass(), "playedMusicLevel3", 1122665110);
        setIntField(term3998283, term3998283.getClass(), "achievement", 1286411908);
        setIntField(term3998283, term3998283.getClass(), "score", 987403994);
        setIntField(term3998283, term3998283.getClass(), "tapScore", 1310627300);
        setIntField(term3998283, term3998283.getClass(), "holdScore", 604727497);
        setIntField(term3998283, term3998283.getClass(), "slideScore", 447193842);
        setIntField(term3998283, term3998283.getClass(), "breakScore", 733110632);
        setIntField(term3998283, term3998283.getClass(), "syncRate", 212654795);
        setIntField(term3998283, term3998283.getClass(), "vsWin", -1697260773);
        setBooleanField(term3998283, term3998283.getClass(), "isAllPerfect", false);
        setIntField(term3998283, term3998283.getClass(), "fullCombo", -1300349111);
        setIntField(term3998283, term3998283.getClass(), "maxFever", -1204777782);
        setIntField(term3998283, term3998283.getClass(), "maxCombo", 1790252771);
        setIntField(term3998283, term3998283.getClass(), "tapPerfect", -946616902);
        setIntField(term3998283, term3998283.getClass(), "tapGreat", -605075567);
        setIntField(term3998283, term3998283.getClass(), "tapGood", -1638640230);
        setIntField(term3998283, term3998283.getClass(), "tapBad", 655414711);
        setIntField(term3998283, term3998283.getClass(), "holdPerfect", 1051884446);
        setIntField(term3998283, term3998283.getClass(), "holdGreat", 1766972967);
        setIntField(term3998283, term3998283.getClass(), "holdGood", 1147005096);
        setIntField(term3998283, term3998283.getClass(), "holdBad", 1448762033);
        setIntField(term3998283, term3998283.getClass(), "slidePerfect", 1998328762);
        setIntField(term3998283, term3998283.getClass(), "slideGreat", -2125507868);
        setIntField(term3998283, term3998283.getClass(), "slideGood", -57039531);
        setIntField(term3998283, term3998283.getClass(), "slideBad", -612411679);
        setIntField(term3998283, term3998283.getClass(), "breakPerfect", 2024596847);
        setIntField(term3998283, term3998283.getClass(), "breakGreat", -945203075);
        setIntField(term3998283, term3998283.getClass(), "breakGood", 1710010656);
        setIntField(term3998283, term3998283.getClass(), "breakBad", 883078909);
        setBooleanField(term3998283, term3998283.getClass(), "isTrackSkip", false);
        setBooleanField(term3998283, term3998283.getClass(), "isHighScore", true);
        setBooleanField(term3998283, term3998283.getClass(), "isChallengeTrack", false);
        setIntField(term3998283, term3998283.getClass(), "challengeLife", 1528813633);
        setIntField(term3998283, term3998283.getClass(), "challengeRemain", 1231268908);
        setIntField(term3998283, term3998283.getClass(), "isAllPerfectPlus", 694071425);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term3998283, args);
    }

};


