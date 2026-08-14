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

public class UserPlaylog_setChallengeLife_1273234354120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term169133;
     Object term169445;

    public UserPlaylog_setChallengeLife_1273234354120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term169139 = new Long(4354242424632479389L);
        term169133 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term169135 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term169137 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term169153 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term169154 = newInstance(Class.forName("java.time.LocalDate"));
        Object term169158 = newInstance(Class.forName("java.time.LocalTime"));
        Object term169163 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term169164 = newInstance(Class.forName("java.time.LocalDate"));
        Object term169168 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term169133, term169133.getClass(), "id", -5297448090819479208L);
        setLongField(term169135, term169135.getClass(), "id", -2018377284090852639L);
        setLongField(term169137, term169137.getClass(), "id", -5415594352357248437L);
        setField(term169137, term169137.getClass(), "extId", term169139);
        setField(term169137, term169137.getClass(), "luid", "wyOXHOMKYx");
        setIntField(term169154, term169154.getClass(), "year", 2020);
        setShortField(term169154, term169154.getClass(), "month", (short) 12);
        setShortField(term169154, term169154.getClass(), "day", (short) 16);
        setField(term169153, term169153.getClass(), "date", term169154);
        setByteField(term169158, term169158.getClass(), "hour", (byte) 16);
        setByteField(term169158, term169158.getClass(), "minute", (byte) 53);
        setByteField(term169158, term169158.getClass(), "second", (byte) 36);
        setIntField(term169158, term169158.getClass(), "nano", 274961864);
        setField(term169153, term169153.getClass(), "time", term169158);
        setField(term169137, term169137.getClass(), "registerTime", term169153);
        setIntField(term169164, term169164.getClass(), "year", 2012);
        setShortField(term169164, term169164.getClass(), "month", (short) 6);
        setShortField(term169164, term169164.getClass(), "day", (short) 10);
        setField(term169163, term169163.getClass(), "date", term169164);
        setByteField(term169168, term169168.getClass(), "hour", (byte) 8);
        setByteField(term169168, term169168.getClass(), "minute", (byte) 28);
        setByteField(term169168, term169168.getClass(), "second", (byte) 42);
        setIntField(term169168, term169168.getClass(), "nano", 746576384);
        setField(term169163, term169163.getClass(), "time", term169168);
        setField(term169137, term169137.getClass(), "accessTime", term169163);
        setField(term169135, term169135.getClass(), "card", term169137);
        setIntField(term169135, term169135.getClass(), "lastDataVersion", 621372878);
        setField(term169135, term169135.getClass(), "userName", "rvkJHBxSuS");
        setIntField(term169135, term169135.getClass(), "point", 864202587);
        setIntField(term169135, term169135.getClass(), "totalPoint", -1496690343);
        setIntField(term169135, term169135.getClass(), "iconId", 1216315719);
        setIntField(term169135, term169135.getClass(), "nameplateId", -545277688);
        setIntField(term169135, term169135.getClass(), "frameId", -639561103);
        setIntField(term169135, term169135.getClass(), "trophyId", -459154046);
        setIntField(term169135, term169135.getClass(), "playCount", -1120341043);
        setIntField(term169135, term169135.getClass(), "playVsCount", 437204970);
        setIntField(term169135, term169135.getClass(), "playSyncCount", 114675377);
        setIntField(term169135, term169135.getClass(), "winCount", 2052963814);
        setIntField(term169135, term169135.getClass(), "helpCount", 707828800);
        setIntField(term169135, term169135.getClass(), "comboCount", 9707370);
        setIntField(term169135, term169135.getClass(), "feverCount", 1508809219);
        setIntField(term169135, term169135.getClass(), "totalHiScore", 833224361);
        setIntField(term169135, term169135.getClass(), "totalEasyHighScore", 1613273081);
        setIntField(term169135, term169135.getClass(), "totalBasicHighScore", 399138012);
        setIntField(term169135, term169135.getClass(), "totalAdvancedHighScore", 1350732193);
        setIntField(term169135, term169135.getClass(), "totalExpertHighScore", 1051581116);
        setIntField(term169135, term169135.getClass(), "totalMasterHighScore", -1238601013);
        setIntField(term169135, term169135.getClass(), "totalReMasterHighScore", -1973417505);
        setIntField(term169135, term169135.getClass(), "totalHighSync", -1609586126);
        setIntField(term169135, term169135.getClass(), "totalEasySync", 1526166625);
        setIntField(term169135, term169135.getClass(), "totalBasicSync", -647672013);
        setIntField(term169135, term169135.getClass(), "totalAdvancedSync", 1784234618);
        setIntField(term169135, term169135.getClass(), "totalExpertSync", 1632732440);
        setIntField(term169135, term169135.getClass(), "totalMasterSync", 457970158);
        setIntField(term169135, term169135.getClass(), "totalReMasterSync", 1779162574);
        setIntField(term169135, term169135.getClass(), "playerRating", -1621575295);
        setIntField(term169135, term169135.getClass(), "highestRating", 1051338501);
        setIntField(term169135, term169135.getClass(), "rankAuthTailId", 1991828176);
        setField(term169135, term169135.getClass(), "eventWatchedDate", "XChVAzyqqj");
        setField(term169135, term169135.getClass(), "webLimitDate", "niqsKibyMX");
        setIntField(term169135, term169135.getClass(), "challengeTrackPhase", -1505896438);
        setIntField(term169135, term169135.getClass(), "firstPlayBits", -1515016387);
        setField(term169135, term169135.getClass(), "lastPlayDate", "EEigYHpeLr");
        setIntField(term169135, term169135.getClass(), "lastPlaceId", 1878817748);
        setField(term169135, term169135.getClass(), "lastPlaceName", "iOZRBGDCUA");
        setIntField(term169135, term169135.getClass(), "lastRegionId", -1334013742);
        setField(term169135, term169135.getClass(), "lastRegionName", "SNLGmwYLAV");
        setField(term169135, term169135.getClass(), "lastClientId", "FskwpQdCkf");
        setField(term169135, term169135.getClass(), "lastCountryCode", "GQONGOQPIz");
        setIntField(term169135, term169135.getClass(), "eventPoint", -1113329120);
        setIntField(term169135, term169135.getClass(), "totalLv", -395956661);
        setIntField(term169135, term169135.getClass(), "lastLoginBonusDay", -793767018);
        setIntField(term169135, term169135.getClass(), "lastSurvivalBonusDay", 555884959);
        setIntField(term169135, term169135.getClass(), "loginBonusLv", -164595647);
        setField(term169133, term169133.getClass(), "user", term169135);
        setIntField(term169133, term169133.getClass(), "orderId", -1418546492);
        setLongField(term169133, term169133.getClass(), "sortNumber", -9020854345282284171L);
        setIntField(term169133, term169133.getClass(), "placeId", -410802966);
        setField(term169133, term169133.getClass(), "placeName", "IjWJbokDwC");
        setField(term169133, term169133.getClass(), "country", "CgjnSgLArx");
        setIntField(term169133, term169133.getClass(), "regionId", -1448481659);
        setField(term169133, term169133.getClass(), "playDate", "VDsGrlxIKZ");
        setField(term169133, term169133.getClass(), "userPlayDate", "WWdkxUzoEC");
        setIntField(term169133, term169133.getClass(), "musicId", 168692495);
        setIntField(term169133, term169133.getClass(), "level", -625041506);
        setIntField(term169133, term169133.getClass(), "gameMode", -61546351);
        setIntField(term169133, term169133.getClass(), "rivalNum", -433739653);
        setIntField(term169133, term169133.getClass(), "track", 1280913230);
        setIntField(term169133, term169133.getClass(), "eventId", -165337519);
        setBooleanField(term169133, term169133.getClass(), "isFreeToPlay", false);
        setIntField(term169133, term169133.getClass(), "playerRating", -614897088);
        setLongField(term169133, term169133.getClass(), "playedUserId1", -31489852380702002L);
        setField(term169133, term169133.getClass(), "playedUserName1", "rnkaCxMcIX");
        setIntField(term169133, term169133.getClass(), "playedMusicLevel1", -1208428955);
        setLongField(term169133, term169133.getClass(), "playedUserId2", -1329952027265266740L);
        setField(term169133, term169133.getClass(), "playedUserName2", "EFZQPeNhLf");
        setIntField(term169133, term169133.getClass(), "playedMusicLevel2", 1421255899);
        setLongField(term169133, term169133.getClass(), "playedUserId3", 1567925232344622144L);
        setField(term169133, term169133.getClass(), "playedUserName3", "XEJckhziWa");
        setIntField(term169133, term169133.getClass(), "playedMusicLevel3", -209156931);
        setIntField(term169133, term169133.getClass(), "achievement", 1085147832);
        setIntField(term169133, term169133.getClass(), "score", 993987477);
        setIntField(term169133, term169133.getClass(), "tapScore", -1937524516);
        setIntField(term169133, term169133.getClass(), "holdScore", -1506820790);
        setIntField(term169133, term169133.getClass(), "slideScore", 132017940);
        setIntField(term169133, term169133.getClass(), "breakScore", 854450325);
        setIntField(term169133, term169133.getClass(), "syncRate", -897775816);
        setIntField(term169133, term169133.getClass(), "vsWin", -981127856);
        setBooleanField(term169133, term169133.getClass(), "isAllPerfect", true);
        setIntField(term169133, term169133.getClass(), "fullCombo", -1571223199);
        setIntField(term169133, term169133.getClass(), "maxFever", -195000285);
        setIntField(term169133, term169133.getClass(), "maxCombo", -1232380087);
        setIntField(term169133, term169133.getClass(), "tapPerfect", 1857922489);
        setIntField(term169133, term169133.getClass(), "tapGreat", 1525147251);
        setIntField(term169133, term169133.getClass(), "tapGood", -1453895044);
        setIntField(term169133, term169133.getClass(), "tapBad", 1848491984);
        setIntField(term169133, term169133.getClass(), "holdPerfect", 994437605);
        setIntField(term169133, term169133.getClass(), "holdGreat", -192901898);
        setIntField(term169133, term169133.getClass(), "holdGood", -1353342755);
        setIntField(term169133, term169133.getClass(), "holdBad", 2113052201);
        setIntField(term169133, term169133.getClass(), "slidePerfect", 726579405);
        setIntField(term169133, term169133.getClass(), "slideGreat", -45467197);
        setIntField(term169133, term169133.getClass(), "slideGood", 15535430);
        setIntField(term169133, term169133.getClass(), "slideBad", -589173569);
        setIntField(term169133, term169133.getClass(), "breakPerfect", 2125317226);
        setIntField(term169133, term169133.getClass(), "breakGreat", 215682420);
        setIntField(term169133, term169133.getClass(), "breakGood", 153930368);
        setIntField(term169133, term169133.getClass(), "breakBad", -19098431);
        setBooleanField(term169133, term169133.getClass(), "isTrackSkip", true);
        setBooleanField(term169133, term169133.getClass(), "isHighScore", false);
        setBooleanField(term169133, term169133.getClass(), "isChallengeTrack", false);
        setIntField(term169133, term169133.getClass(), "challengeLife", -1731445929);
        setIntField(term169133, term169133.getClass(), "challengeRemain", 1000472377);
        setIntField(term169133, term169133.getClass(), "isAllPerfectPlus", 1599635553);
        term169445 = new Integer(302864149);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term169445;
        callMethod(klass, "setChallengeLife", argTypes, term169133, args);
    }

};


