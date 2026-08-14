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

public class UserPlaylog_canEqual_1242690098123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3997338;
     Object term3997650;

    public UserPlaylog_canEqual_1242690098123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3997344 = new Long(-7620000718026172257L);
        term3997338 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term3997340 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term3997342 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term3997358 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3997359 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3997363 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3997368 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3997369 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3997373 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term3997338, term3997338.getClass(), "id", -3644518821640644732L);
        setLongField(term3997340, term3997340.getClass(), "id", -4986286037615173176L);
        setLongField(term3997342, term3997342.getClass(), "id", -5653726258680203956L);
        setField(term3997342, term3997342.getClass(), "extId", term3997344);
        setField(term3997342, term3997342.getClass(), "luid", "HgDBHfQIWA");
        setIntField(term3997359, term3997359.getClass(), "year", 2021);
        setShortField(term3997359, term3997359.getClass(), "month", (short) 8);
        setShortField(term3997359, term3997359.getClass(), "day", (short) 16);
        setField(term3997358, term3997358.getClass(), "date", term3997359);
        setByteField(term3997363, term3997363.getClass(), "hour", (byte) 4);
        setByteField(term3997363, term3997363.getClass(), "minute", (byte) 10);
        setByteField(term3997363, term3997363.getClass(), "second", (byte) 15);
        setIntField(term3997363, term3997363.getClass(), "nano", 366025793);
        setField(term3997358, term3997358.getClass(), "time", term3997363);
        setField(term3997342, term3997342.getClass(), "registerTime", term3997358);
        setIntField(term3997369, term3997369.getClass(), "year", 2026);
        setShortField(term3997369, term3997369.getClass(), "month", (short) 2);
        setShortField(term3997369, term3997369.getClass(), "day", (short) 27);
        setField(term3997368, term3997368.getClass(), "date", term3997369);
        setByteField(term3997373, term3997373.getClass(), "hour", (byte) 13);
        setByteField(term3997373, term3997373.getClass(), "minute", (byte) 18);
        setByteField(term3997373, term3997373.getClass(), "second", (byte) 51);
        setIntField(term3997373, term3997373.getClass(), "nano", 751273032);
        setField(term3997368, term3997368.getClass(), "time", term3997373);
        setField(term3997342, term3997342.getClass(), "accessTime", term3997368);
        setField(term3997340, term3997340.getClass(), "card", term3997342);
        setIntField(term3997340, term3997340.getClass(), "lastDataVersion", -207568923);
        setField(term3997340, term3997340.getClass(), "userName", "tuxKjHVZKD");
        setIntField(term3997340, term3997340.getClass(), "point", 1073869074);
        setIntField(term3997340, term3997340.getClass(), "totalPoint", 1095366541);
        setIntField(term3997340, term3997340.getClass(), "iconId", -1543113060);
        setIntField(term3997340, term3997340.getClass(), "nameplateId", 1025871828);
        setIntField(term3997340, term3997340.getClass(), "frameId", 1147546675);
        setIntField(term3997340, term3997340.getClass(), "trophyId", 1478140522);
        setIntField(term3997340, term3997340.getClass(), "playCount", 118076996);
        setIntField(term3997340, term3997340.getClass(), "playVsCount", 766399671);
        setIntField(term3997340, term3997340.getClass(), "playSyncCount", -372792797);
        setIntField(term3997340, term3997340.getClass(), "winCount", -1620754173);
        setIntField(term3997340, term3997340.getClass(), "helpCount", -1944569623);
        setIntField(term3997340, term3997340.getClass(), "comboCount", -2090915542);
        setIntField(term3997340, term3997340.getClass(), "feverCount", -626503347);
        setIntField(term3997340, term3997340.getClass(), "totalHiScore", -1248176603);
        setIntField(term3997340, term3997340.getClass(), "totalEasyHighScore", 1811191350);
        setIntField(term3997340, term3997340.getClass(), "totalBasicHighScore", -1063441163);
        setIntField(term3997340, term3997340.getClass(), "totalAdvancedHighScore", -15264798);
        setIntField(term3997340, term3997340.getClass(), "totalExpertHighScore", 67193004);
        setIntField(term3997340, term3997340.getClass(), "totalMasterHighScore", 89502675);
        setIntField(term3997340, term3997340.getClass(), "totalReMasterHighScore", 1032954533);
        setIntField(term3997340, term3997340.getClass(), "totalHighSync", 1518743516);
        setIntField(term3997340, term3997340.getClass(), "totalEasySync", 874990901);
        setIntField(term3997340, term3997340.getClass(), "totalBasicSync", 218595082);
        setIntField(term3997340, term3997340.getClass(), "totalAdvancedSync", -615984553);
        setIntField(term3997340, term3997340.getClass(), "totalExpertSync", 53240639);
        setIntField(term3997340, term3997340.getClass(), "totalMasterSync", -68765928);
        setIntField(term3997340, term3997340.getClass(), "totalReMasterSync", 951295149);
        setIntField(term3997340, term3997340.getClass(), "playerRating", -413415978);
        setIntField(term3997340, term3997340.getClass(), "highestRating", 1253306529);
        setIntField(term3997340, term3997340.getClass(), "rankAuthTailId", -1226972011);
        setField(term3997340, term3997340.getClass(), "eventWatchedDate", "XbonvHJOtS");
        setField(term3997340, term3997340.getClass(), "webLimitDate", "tZJUnFqEcZ");
        setIntField(term3997340, term3997340.getClass(), "challengeTrackPhase", 1185592119);
        setIntField(term3997340, term3997340.getClass(), "firstPlayBits", -697224728);
        setField(term3997340, term3997340.getClass(), "lastPlayDate", "FsDMUNQKhD");
        setIntField(term3997340, term3997340.getClass(), "lastPlaceId", -365989907);
        setField(term3997340, term3997340.getClass(), "lastPlaceName", "vVNPUsQlCi");
        setIntField(term3997340, term3997340.getClass(), "lastRegionId", 2112633420);
        setField(term3997340, term3997340.getClass(), "lastRegionName", "KUVgxkZEtX");
        setField(term3997340, term3997340.getClass(), "lastClientId", "cvARYQcHvn");
        setField(term3997340, term3997340.getClass(), "lastCountryCode", "qAjYeuDLNW");
        setIntField(term3997340, term3997340.getClass(), "eventPoint", -1359629519);
        setIntField(term3997340, term3997340.getClass(), "totalLv", -1546444572);
        setIntField(term3997340, term3997340.getClass(), "lastLoginBonusDay", -997955741);
        setIntField(term3997340, term3997340.getClass(), "lastSurvivalBonusDay", 1002365426);
        setIntField(term3997340, term3997340.getClass(), "loginBonusLv", -1131888169);
        setField(term3997338, term3997338.getClass(), "user", term3997340);
        setIntField(term3997338, term3997338.getClass(), "orderId", -769903992);
        setLongField(term3997338, term3997338.getClass(), "sortNumber", 6947740426901679529L);
        setIntField(term3997338, term3997338.getClass(), "placeId", -2030571294);
        setField(term3997338, term3997338.getClass(), "placeName", "DBOyYjyeVf");
        setField(term3997338, term3997338.getClass(), "country", "kjVhpsTTFn");
        setIntField(term3997338, term3997338.getClass(), "regionId", -1210171327);
        setField(term3997338, term3997338.getClass(), "playDate", "TdObsQAjbB");
        setField(term3997338, term3997338.getClass(), "userPlayDate", "TcizmxzJmj");
        setIntField(term3997338, term3997338.getClass(), "musicId", -1360549381);
        setIntField(term3997338, term3997338.getClass(), "level", 1171817737);
        setIntField(term3997338, term3997338.getClass(), "gameMode", -2021003415);
        setIntField(term3997338, term3997338.getClass(), "rivalNum", 55072304);
        setIntField(term3997338, term3997338.getClass(), "track", 1596323624);
        setIntField(term3997338, term3997338.getClass(), "eventId", -601646230);
        setBooleanField(term3997338, term3997338.getClass(), "isFreeToPlay", true);
        setIntField(term3997338, term3997338.getClass(), "playerRating", -259024677);
        setLongField(term3997338, term3997338.getClass(), "playedUserId1", -436353439443986232L);
        setField(term3997338, term3997338.getClass(), "playedUserName1", "TXDgDYVFCU");
        setIntField(term3997338, term3997338.getClass(), "playedMusicLevel1", -642547356);
        setLongField(term3997338, term3997338.getClass(), "playedUserId2", -6298241818859194717L);
        setField(term3997338, term3997338.getClass(), "playedUserName2", "rMtktksTZw");
        setIntField(term3997338, term3997338.getClass(), "playedMusicLevel2", -1523900663);
        setLongField(term3997338, term3997338.getClass(), "playedUserId3", -3224738871849638527L);
        setField(term3997338, term3997338.getClass(), "playedUserName3", "bFyUlMkPQO");
        setIntField(term3997338, term3997338.getClass(), "playedMusicLevel3", -1509042927);
        setIntField(term3997338, term3997338.getClass(), "achievement", -926525438);
        setIntField(term3997338, term3997338.getClass(), "score", -598192155);
        setIntField(term3997338, term3997338.getClass(), "tapScore", -171614965);
        setIntField(term3997338, term3997338.getClass(), "holdScore", -618050922);
        setIntField(term3997338, term3997338.getClass(), "slideScore", 858016469);
        setIntField(term3997338, term3997338.getClass(), "breakScore", 1842895637);
        setIntField(term3997338, term3997338.getClass(), "syncRate", -576969663);
        setIntField(term3997338, term3997338.getClass(), "vsWin", -1152965666);
        setBooleanField(term3997338, term3997338.getClass(), "isAllPerfect", true);
        setIntField(term3997338, term3997338.getClass(), "fullCombo", 1513873661);
        setIntField(term3997338, term3997338.getClass(), "maxFever", 96689629);
        setIntField(term3997338, term3997338.getClass(), "maxCombo", -1296217208);
        setIntField(term3997338, term3997338.getClass(), "tapPerfect", -429147288);
        setIntField(term3997338, term3997338.getClass(), "tapGreat", -1537450347);
        setIntField(term3997338, term3997338.getClass(), "tapGood", 479918632);
        setIntField(term3997338, term3997338.getClass(), "tapBad", 344872939);
        setIntField(term3997338, term3997338.getClass(), "holdPerfect", -342809882);
        setIntField(term3997338, term3997338.getClass(), "holdGreat", -806271183);
        setIntField(term3997338, term3997338.getClass(), "holdGood", 440983956);
        setIntField(term3997338, term3997338.getClass(), "holdBad", 983402824);
        setIntField(term3997338, term3997338.getClass(), "slidePerfect", -2009801457);
        setIntField(term3997338, term3997338.getClass(), "slideGreat", 2134832417);
        setIntField(term3997338, term3997338.getClass(), "slideGood", -1342024345);
        setIntField(term3997338, term3997338.getClass(), "slideBad", 744787251);
        setIntField(term3997338, term3997338.getClass(), "breakPerfect", -182001485);
        setIntField(term3997338, term3997338.getClass(), "breakGreat", 398123255);
        setIntField(term3997338, term3997338.getClass(), "breakGood", -1496370753);
        setIntField(term3997338, term3997338.getClass(), "breakBad", 1892219930);
        setBooleanField(term3997338, term3997338.getClass(), "isTrackSkip", false);
        setBooleanField(term3997338, term3997338.getClass(), "isHighScore", false);
        setBooleanField(term3997338, term3997338.getClass(), "isChallengeTrack", false);
        setIntField(term3997338, term3997338.getClass(), "challengeLife", -1512228593);
        setIntField(term3997338, term3997338.getClass(), "challengeRemain", 2252101);
        setIntField(term3997338, term3997338.getClass(), "isAllPerfectPlus", -862324723);
        term3997650 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term3997650;
        callMethod(klass, "canEqual", argTypes, term3997338, args);
    }

};


