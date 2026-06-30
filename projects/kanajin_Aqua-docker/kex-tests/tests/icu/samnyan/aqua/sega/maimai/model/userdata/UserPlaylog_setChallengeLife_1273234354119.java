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
     Object term169077;
     Object term169389;

    public UserPlaylog_setChallengeLife_1273234354119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term169083 = new Long(4354242424632479389L);
        term169077 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term169079 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term169081 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term169097 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term169098 = newInstance(Class.forName("java.time.LocalDate"));
        Object term169102 = newInstance(Class.forName("java.time.LocalTime"));
        Object term169107 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term169108 = newInstance(Class.forName("java.time.LocalDate"));
        Object term169112 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term169077, term169077.getClass(), "id", -5297448090819479208L);
        setLongField(term169079, term169079.getClass(), "id", -2018377284090852639L);
        setLongField(term169081, term169081.getClass(), "id", -5415594352357248437L);
        setField(term169081, term169081.getClass(), "extId", term169083);
        setField(term169081, term169081.getClass(), "luid", "wyOXHOMKYx");
        setIntField(term169098, term169098.getClass(), "year", 2020);
        setShortField(term169098, term169098.getClass(), "month", (short) 12);
        setShortField(term169098, term169098.getClass(), "day", (short) 16);
        setField(term169097, term169097.getClass(), "date", term169098);
        setByteField(term169102, term169102.getClass(), "hour", (byte) 16);
        setByteField(term169102, term169102.getClass(), "minute", (byte) 53);
        setByteField(term169102, term169102.getClass(), "second", (byte) 36);
        setIntField(term169102, term169102.getClass(), "nano", 274961864);
        setField(term169097, term169097.getClass(), "time", term169102);
        setField(term169081, term169081.getClass(), "registerTime", term169097);
        setIntField(term169108, term169108.getClass(), "year", 2012);
        setShortField(term169108, term169108.getClass(), "month", (short) 6);
        setShortField(term169108, term169108.getClass(), "day", (short) 10);
        setField(term169107, term169107.getClass(), "date", term169108);
        setByteField(term169112, term169112.getClass(), "hour", (byte) 8);
        setByteField(term169112, term169112.getClass(), "minute", (byte) 28);
        setByteField(term169112, term169112.getClass(), "second", (byte) 42);
        setIntField(term169112, term169112.getClass(), "nano", 746576384);
        setField(term169107, term169107.getClass(), "time", term169112);
        setField(term169081, term169081.getClass(), "accessTime", term169107);
        setField(term169079, term169079.getClass(), "card", term169081);
        setIntField(term169079, term169079.getClass(), "lastDataVersion", 621372878);
        setField(term169079, term169079.getClass(), "userName", "rvkJHBxSuS");
        setIntField(term169079, term169079.getClass(), "point", 864202587);
        setIntField(term169079, term169079.getClass(), "totalPoint", -1496690343);
        setIntField(term169079, term169079.getClass(), "iconId", 1216315719);
        setIntField(term169079, term169079.getClass(), "nameplateId", -545277688);
        setIntField(term169079, term169079.getClass(), "frameId", -639561103);
        setIntField(term169079, term169079.getClass(), "trophyId", -459154046);
        setIntField(term169079, term169079.getClass(), "playCount", -1120341043);
        setIntField(term169079, term169079.getClass(), "playVsCount", 437204970);
        setIntField(term169079, term169079.getClass(), "playSyncCount", 114675377);
        setIntField(term169079, term169079.getClass(), "winCount", 2052963814);
        setIntField(term169079, term169079.getClass(), "helpCount", 707828800);
        setIntField(term169079, term169079.getClass(), "comboCount", 9707370);
        setIntField(term169079, term169079.getClass(), "feverCount", 1508809219);
        setIntField(term169079, term169079.getClass(), "totalHiScore", 833224361);
        setIntField(term169079, term169079.getClass(), "totalEasyHighScore", 1613273081);
        setIntField(term169079, term169079.getClass(), "totalBasicHighScore", 399138012);
        setIntField(term169079, term169079.getClass(), "totalAdvancedHighScore", 1350732193);
        setIntField(term169079, term169079.getClass(), "totalExpertHighScore", 1051581116);
        setIntField(term169079, term169079.getClass(), "totalMasterHighScore", -1238601013);
        setIntField(term169079, term169079.getClass(), "totalReMasterHighScore", -1973417505);
        setIntField(term169079, term169079.getClass(), "totalHighSync", -1609586126);
        setIntField(term169079, term169079.getClass(), "totalEasySync", 1526166625);
        setIntField(term169079, term169079.getClass(), "totalBasicSync", -647672013);
        setIntField(term169079, term169079.getClass(), "totalAdvancedSync", 1784234618);
        setIntField(term169079, term169079.getClass(), "totalExpertSync", 1632732440);
        setIntField(term169079, term169079.getClass(), "totalMasterSync", 457970158);
        setIntField(term169079, term169079.getClass(), "totalReMasterSync", 1779162574);
        setIntField(term169079, term169079.getClass(), "playerRating", -1621575295);
        setIntField(term169079, term169079.getClass(), "highestRating", 1051338501);
        setIntField(term169079, term169079.getClass(), "rankAuthTailId", 1991828176);
        setField(term169079, term169079.getClass(), "eventWatchedDate", "XChVAzyqqj");
        setField(term169079, term169079.getClass(), "webLimitDate", "niqsKibyMX");
        setIntField(term169079, term169079.getClass(), "challengeTrackPhase", -1505896438);
        setIntField(term169079, term169079.getClass(), "firstPlayBits", -1515016387);
        setField(term169079, term169079.getClass(), "lastPlayDate", "EEigYHpeLr");
        setIntField(term169079, term169079.getClass(), "lastPlaceId", 1878817748);
        setField(term169079, term169079.getClass(), "lastPlaceName", "iOZRBGDCUA");
        setIntField(term169079, term169079.getClass(), "lastRegionId", -1334013742);
        setField(term169079, term169079.getClass(), "lastRegionName", "SNLGmwYLAV");
        setField(term169079, term169079.getClass(), "lastClientId", "FskwpQdCkf");
        setField(term169079, term169079.getClass(), "lastCountryCode", "GQONGOQPIz");
        setIntField(term169079, term169079.getClass(), "eventPoint", -1113329120);
        setIntField(term169079, term169079.getClass(), "totalLv", -395956661);
        setIntField(term169079, term169079.getClass(), "lastLoginBonusDay", -793767018);
        setIntField(term169079, term169079.getClass(), "lastSurvivalBonusDay", 555884959);
        setIntField(term169079, term169079.getClass(), "loginBonusLv", -164595647);
        setField(term169077, term169077.getClass(), "user", term169079);
        setIntField(term169077, term169077.getClass(), "orderId", -1418546492);
        setLongField(term169077, term169077.getClass(), "sortNumber", -9020854345282284171L);
        setIntField(term169077, term169077.getClass(), "placeId", -410802966);
        setField(term169077, term169077.getClass(), "placeName", "IjWJbokDwC");
        setField(term169077, term169077.getClass(), "country", "CgjnSgLArx");
        setIntField(term169077, term169077.getClass(), "regionId", -1448481659);
        setField(term169077, term169077.getClass(), "playDate", "VDsGrlxIKZ");
        setField(term169077, term169077.getClass(), "userPlayDate", "WWdkxUzoEC");
        setIntField(term169077, term169077.getClass(), "musicId", 168692495);
        setIntField(term169077, term169077.getClass(), "level", -625041506);
        setIntField(term169077, term169077.getClass(), "gameMode", -61546351);
        setIntField(term169077, term169077.getClass(), "rivalNum", -433739653);
        setIntField(term169077, term169077.getClass(), "track", 1280913230);
        setIntField(term169077, term169077.getClass(), "eventId", -165337519);
        setBooleanField(term169077, term169077.getClass(), "isFreeToPlay", false);
        setIntField(term169077, term169077.getClass(), "playerRating", -614897088);
        setLongField(term169077, term169077.getClass(), "playedUserId1", -31489852380702002L);
        setField(term169077, term169077.getClass(), "playedUserName1", "rnkaCxMcIX");
        setIntField(term169077, term169077.getClass(), "playedMusicLevel1", -1208428955);
        setLongField(term169077, term169077.getClass(), "playedUserId2", -1329952027265266740L);
        setField(term169077, term169077.getClass(), "playedUserName2", "EFZQPeNhLf");
        setIntField(term169077, term169077.getClass(), "playedMusicLevel2", 1421255899);
        setLongField(term169077, term169077.getClass(), "playedUserId3", 1567925232344622144L);
        setField(term169077, term169077.getClass(), "playedUserName3", "XEJckhziWa");
        setIntField(term169077, term169077.getClass(), "playedMusicLevel3", -209156931);
        setIntField(term169077, term169077.getClass(), "achievement", 1085147832);
        setIntField(term169077, term169077.getClass(), "score", 993987477);
        setIntField(term169077, term169077.getClass(), "tapScore", -1937524516);
        setIntField(term169077, term169077.getClass(), "holdScore", -1506820790);
        setIntField(term169077, term169077.getClass(), "slideScore", 132017940);
        setIntField(term169077, term169077.getClass(), "breakScore", 854450325);
        setIntField(term169077, term169077.getClass(), "syncRate", -897775816);
        setIntField(term169077, term169077.getClass(), "vsWin", -981127856);
        setBooleanField(term169077, term169077.getClass(), "isAllPerfect", true);
        setIntField(term169077, term169077.getClass(), "fullCombo", -1571223199);
        setIntField(term169077, term169077.getClass(), "maxFever", -195000285);
        setIntField(term169077, term169077.getClass(), "maxCombo", -1232380087);
        setIntField(term169077, term169077.getClass(), "tapPerfect", 1857922489);
        setIntField(term169077, term169077.getClass(), "tapGreat", 1525147251);
        setIntField(term169077, term169077.getClass(), "tapGood", -1453895044);
        setIntField(term169077, term169077.getClass(), "tapBad", 1848491984);
        setIntField(term169077, term169077.getClass(), "holdPerfect", 994437605);
        setIntField(term169077, term169077.getClass(), "holdGreat", -192901898);
        setIntField(term169077, term169077.getClass(), "holdGood", -1353342755);
        setIntField(term169077, term169077.getClass(), "holdBad", 2113052201);
        setIntField(term169077, term169077.getClass(), "slidePerfect", 726579405);
        setIntField(term169077, term169077.getClass(), "slideGreat", -45467197);
        setIntField(term169077, term169077.getClass(), "slideGood", 15535430);
        setIntField(term169077, term169077.getClass(), "slideBad", -589173569);
        setIntField(term169077, term169077.getClass(), "breakPerfect", 2125317226);
        setIntField(term169077, term169077.getClass(), "breakGreat", 215682420);
        setIntField(term169077, term169077.getClass(), "breakGood", 153930368);
        setIntField(term169077, term169077.getClass(), "breakBad", -19098431);
        setBooleanField(term169077, term169077.getClass(), "isTrackSkip", true);
        setBooleanField(term169077, term169077.getClass(), "isHighScore", false);
        setBooleanField(term169077, term169077.getClass(), "isChallengeTrack", false);
        setIntField(term169077, term169077.getClass(), "challengeLife", -1731445929);
        setIntField(term169077, term169077.getClass(), "challengeRemain", 1000472377);
        setIntField(term169077, term169077.getClass(), "isAllPerfectPlus", 1599635553);
        term169389 = new Integer(302864149);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term169389;
        callMethod(klass, "setChallengeLife", argTypes, term169077, args);
    }

};


