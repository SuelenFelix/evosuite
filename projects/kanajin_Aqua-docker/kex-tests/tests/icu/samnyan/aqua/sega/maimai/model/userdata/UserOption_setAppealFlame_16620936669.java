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

public class UserOption_setAppealFlame_16620936669 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72291;
     Object term72509;

    public UserOption_setAppealFlame_16620936669() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term72297 = new Long(1253549421411622358L);
        term72291 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term72293 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term72295 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term72311 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term72312 = newInstance(Class.forName("java.time.LocalDate"));
        Object term72316 = newInstance(Class.forName("java.time.LocalTime"));
        Object term72321 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term72322 = newInstance(Class.forName("java.time.LocalDate"));
        Object term72326 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term72291, term72291.getClass(), "id", 3288572082902580031L);
        setLongField(term72293, term72293.getClass(), "id", -8698230272673009418L);
        setLongField(term72295, term72295.getClass(), "id", -8792567429538693571L);
        setField(term72295, term72295.getClass(), "extId", term72297);
        setField(term72295, term72295.getClass(), "luid", "IcbBNUXJqX");
        setIntField(term72312, term72312.getClass(), "year", 2026);
        setShortField(term72312, term72312.getClass(), "month", (short) 2);
        setShortField(term72312, term72312.getClass(), "day", (short) 5);
        setField(term72311, term72311.getClass(), "date", term72312);
        setByteField(term72316, term72316.getClass(), "hour", (byte) 8);
        setByteField(term72316, term72316.getClass(), "minute", (byte) 6);
        setByteField(term72316, term72316.getClass(), "second", (byte) 3);
        setIntField(term72316, term72316.getClass(), "nano", 107243113);
        setField(term72311, term72311.getClass(), "time", term72316);
        setField(term72295, term72295.getClass(), "registerTime", term72311);
        setIntField(term72322, term72322.getClass(), "year", 2013);
        setShortField(term72322, term72322.getClass(), "month", (short) 3);
        setShortField(term72322, term72322.getClass(), "day", (short) 17);
        setField(term72321, term72321.getClass(), "date", term72322);
        setByteField(term72326, term72326.getClass(), "hour", (byte) 6);
        setByteField(term72326, term72326.getClass(), "minute", (byte) 13);
        setByteField(term72326, term72326.getClass(), "second", (byte) 20);
        setIntField(term72326, term72326.getClass(), "nano", 748150546);
        setField(term72321, term72321.getClass(), "time", term72326);
        setField(term72295, term72295.getClass(), "accessTime", term72321);
        setField(term72293, term72293.getClass(), "card", term72295);
        setIntField(term72293, term72293.getClass(), "lastDataVersion", -241689552);
        setField(term72293, term72293.getClass(), "userName", "LONFjqAsUp");
        setIntField(term72293, term72293.getClass(), "point", -1974916988);
        setIntField(term72293, term72293.getClass(), "totalPoint", -1422332940);
        setIntField(term72293, term72293.getClass(), "iconId", -990649327);
        setIntField(term72293, term72293.getClass(), "nameplateId", -1242244093);
        setIntField(term72293, term72293.getClass(), "frameId", -1648541304);
        setIntField(term72293, term72293.getClass(), "trophyId", 1396745898);
        setIntField(term72293, term72293.getClass(), "playCount", -171687185);
        setIntField(term72293, term72293.getClass(), "playVsCount", -1808375426);
        setIntField(term72293, term72293.getClass(), "playSyncCount", -1840652193);
        setIntField(term72293, term72293.getClass(), "winCount", 1204481493);
        setIntField(term72293, term72293.getClass(), "helpCount", 117135344);
        setIntField(term72293, term72293.getClass(), "comboCount", 1755958093);
        setIntField(term72293, term72293.getClass(), "feverCount", 539487007);
        setIntField(term72293, term72293.getClass(), "totalHiScore", 1325638563);
        setIntField(term72293, term72293.getClass(), "totalEasyHighScore", 1580065656);
        setIntField(term72293, term72293.getClass(), "totalBasicHighScore", 535660);
        setIntField(term72293, term72293.getClass(), "totalAdvancedHighScore", -809782205);
        setIntField(term72293, term72293.getClass(), "totalExpertHighScore", -253697422);
        setIntField(term72293, term72293.getClass(), "totalMasterHighScore", -1751906935);
        setIntField(term72293, term72293.getClass(), "totalReMasterHighScore", -739935304);
        setIntField(term72293, term72293.getClass(), "totalHighSync", 343930030);
        setIntField(term72293, term72293.getClass(), "totalEasySync", -42006399);
        setIntField(term72293, term72293.getClass(), "totalBasicSync", 1336799594);
        setIntField(term72293, term72293.getClass(), "totalAdvancedSync", -1301911357);
        setIntField(term72293, term72293.getClass(), "totalExpertSync", 504881648);
        setIntField(term72293, term72293.getClass(), "totalMasterSync", 1350912746);
        setIntField(term72293, term72293.getClass(), "totalReMasterSync", -1039288445);
        setIntField(term72293, term72293.getClass(), "playerRating", 2076060135);
        setIntField(term72293, term72293.getClass(), "highestRating", -529144633);
        setIntField(term72293, term72293.getClass(), "rankAuthTailId", -884210737);
        setField(term72293, term72293.getClass(), "eventWatchedDate", "tAhydlbSMf");
        setField(term72293, term72293.getClass(), "webLimitDate", "wNYtcPFyIe");
        setIntField(term72293, term72293.getClass(), "challengeTrackPhase", -438744694);
        setIntField(term72293, term72293.getClass(), "firstPlayBits", 510826397);
        setField(term72293, term72293.getClass(), "lastPlayDate", "tlIqgTUSQw");
        setIntField(term72293, term72293.getClass(), "lastPlaceId", -1227312153);
        setField(term72293, term72293.getClass(), "lastPlaceName", "UvweyXjDhG");
        setIntField(term72293, term72293.getClass(), "lastRegionId", -983748653);
        setField(term72293, term72293.getClass(), "lastRegionName", "wnoVhNwdJy");
        setField(term72293, term72293.getClass(), "lastClientId", "uQGMBLrmAj");
        setField(term72293, term72293.getClass(), "lastCountryCode", "vNFaheDeBv");
        setIntField(term72293, term72293.getClass(), "eventPoint", 69606628);
        setIntField(term72293, term72293.getClass(), "totalLv", 1551247631);
        setIntField(term72293, term72293.getClass(), "lastLoginBonusDay", -650586371);
        setIntField(term72293, term72293.getClass(), "lastSurvivalBonusDay", -1350906164);
        setIntField(term72293, term72293.getClass(), "loginBonusLv", 444731205);
        setField(term72291, term72291.getClass(), "user", term72293);
        setIntField(term72291, term72291.getClass(), "soudEffect", -1140021781);
        setIntField(term72291, term72291.getClass(), "mirrorMode", 752670193);
        setIntField(term72291, term72291.getClass(), "guideSpeed", -1881269322);
        setIntField(term72291, term72291.getClass(), "bgInfo", -1156353639);
        setIntField(term72291, term72291.getClass(), "brightness", -2123849351);
        setIntField(term72291, term72291.getClass(), "isStarRot", -680880020);
        setIntField(term72291, term72291.getClass(), "breakSe", -1038233622);
        setIntField(term72291, term72291.getClass(), "slideSe", -1376494298);
        setIntField(term72291, term72291.getClass(), "hardJudge", 641536751);
        setIntField(term72291, term72291.getClass(), "isTagJump", 1009826201);
        setIntField(term72291, term72291.getClass(), "breakSeVol", -514267762);
        setIntField(term72291, term72291.getClass(), "slideSeVol", -351553807);
        setIntField(term72291, term72291.getClass(), "isUpperDisp", -1939890429);
        setIntField(term72291, term72291.getClass(), "trackSkip", -2050304978);
        setIntField(term72291, term72291.getClass(), "optionMode", -1960407729);
        setIntField(term72291, term72291.getClass(), "simpleOptionParam", -890731167);
        setIntField(term72291, term72291.getClass(), "adjustTiming", 88958658);
        setIntField(term72291, term72291.getClass(), "dispTiming", -1360000339);
        setIntField(term72291, term72291.getClass(), "timingPos", 1151552333);
        setIntField(term72291, term72291.getClass(), "ansVol", -1639285726);
        setIntField(term72291, term72291.getClass(), "noteVol", 858615712);
        setIntField(term72291, term72291.getClass(), "dmgVol", -999600154);
        setIntField(term72291, term72291.getClass(), "appealFlame", -201429161);
        setIntField(term72291, term72291.getClass(), "isFeverDisp", 1900864076);
        setIntField(term72291, term72291.getClass(), "dispJudge", 235469007);
        setIntField(term72291, term72291.getClass(), "judgePos", 1009857473);
        setIntField(term72291, term72291.getClass(), "ratingGuard", 1198152792);
        setIntField(term72291, term72291.getClass(), "selectChara", 920073923);
        setIntField(term72291, term72291.getClass(), "sortType", -626830892);
        setIntField(term72291, term72291.getClass(), "filterGenre", 578762810);
        setIntField(term72291, term72291.getClass(), "filterLevel", -377138416);
        setIntField(term72291, term72291.getClass(), "filterRank", 893990624);
        setIntField(term72291, term72291.getClass(), "filterVersion", 1423967830);
        setIntField(term72291, term72291.getClass(), "filterRec", 841806507);
        setIntField(term72291, term72291.getClass(), "filterFullCombo", 1652012038);
        setIntField(term72291, term72291.getClass(), "filterAllPerfect", 1955474256);
        setIntField(term72291, term72291.getClass(), "filterDifficulty", 2134864696);
        setIntField(term72291, term72291.getClass(), "filterFullSync", -518554287);
        setIntField(term72291, term72291.getClass(), "filterReMaster", 123727036);
        setIntField(term72291, term72291.getClass(), "filterMaxFever", 1780326204);
        setIntField(term72291, term72291.getClass(), "finalSelectId", -1863902998);
        setIntField(term72291, term72291.getClass(), "finalSelectCategory", -250348280);
        term72509 = new Integer(-562854876);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term72509;
        callMethod(klass, "setAppealFlame", argTypes, term72291, args);
    }

};


