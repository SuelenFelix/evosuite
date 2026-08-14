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

public class UserPlaylog_setBreakBad_941985319115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3993547;
     Object term3993859;

    public UserPlaylog_setBreakBad_941985319115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3993553 = new Long(-6366920650507521486L);
        term3993547 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term3993549 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term3993551 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term3993567 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3993568 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3993572 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3993577 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3993578 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3993582 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term3993547, term3993547.getClass(), "id", 5607796356426014201L);
        setLongField(term3993549, term3993549.getClass(), "id", 3060571900751744180L);
        setLongField(term3993551, term3993551.getClass(), "id", 630634027273382605L);
        setField(term3993551, term3993551.getClass(), "extId", term3993553);
        setField(term3993551, term3993551.getClass(), "luid", "ASytsTDMlQ");
        setIntField(term3993568, term3993568.getClass(), "year", 2027);
        setShortField(term3993568, term3993568.getClass(), "month", (short) 4);
        setShortField(term3993568, term3993568.getClass(), "day", (short) 3);
        setField(term3993567, term3993567.getClass(), "date", term3993568);
        setByteField(term3993572, term3993572.getClass(), "hour", (byte) 14);
        setByteField(term3993572, term3993572.getClass(), "minute", (byte) 42);
        setByteField(term3993572, term3993572.getClass(), "second", (byte) 26);
        setIntField(term3993572, term3993572.getClass(), "nano", 247592941);
        setField(term3993567, term3993567.getClass(), "time", term3993572);
        setField(term3993551, term3993551.getClass(), "registerTime", term3993567);
        setIntField(term3993578, term3993578.getClass(), "year", 2023);
        setShortField(term3993578, term3993578.getClass(), "month", (short) 6);
        setShortField(term3993578, term3993578.getClass(), "day", (short) 9);
        setField(term3993577, term3993577.getClass(), "date", term3993578);
        setByteField(term3993582, term3993582.getClass(), "hour", (byte) 21);
        setByteField(term3993582, term3993582.getClass(), "minute", (byte) 8);
        setByteField(term3993582, term3993582.getClass(), "second", (byte) 15);
        setIntField(term3993582, term3993582.getClass(), "nano", 527671227);
        setField(term3993577, term3993577.getClass(), "time", term3993582);
        setField(term3993551, term3993551.getClass(), "accessTime", term3993577);
        setField(term3993549, term3993549.getClass(), "card", term3993551);
        setIntField(term3993549, term3993549.getClass(), "lastDataVersion", -2073198525);
        setField(term3993549, term3993549.getClass(), "userName", "VEXDxwxpcU");
        setIntField(term3993549, term3993549.getClass(), "point", 900856129);
        setIntField(term3993549, term3993549.getClass(), "totalPoint", 368266190);
        setIntField(term3993549, term3993549.getClass(), "iconId", -1221460289);
        setIntField(term3993549, term3993549.getClass(), "nameplateId", 2042466463);
        setIntField(term3993549, term3993549.getClass(), "frameId", 1737190889);
        setIntField(term3993549, term3993549.getClass(), "trophyId", 1004919028);
        setIntField(term3993549, term3993549.getClass(), "playCount", 1227975783);
        setIntField(term3993549, term3993549.getClass(), "playVsCount", 1988752989);
        setIntField(term3993549, term3993549.getClass(), "playSyncCount", 2000348519);
        setIntField(term3993549, term3993549.getClass(), "winCount", -801000841);
        setIntField(term3993549, term3993549.getClass(), "helpCount", 765165979);
        setIntField(term3993549, term3993549.getClass(), "comboCount", -1751674749);
        setIntField(term3993549, term3993549.getClass(), "feverCount", 512580435);
        setIntField(term3993549, term3993549.getClass(), "totalHiScore", -1706288223);
        setIntField(term3993549, term3993549.getClass(), "totalEasyHighScore", 1974522584);
        setIntField(term3993549, term3993549.getClass(), "totalBasicHighScore", -1374988613);
        setIntField(term3993549, term3993549.getClass(), "totalAdvancedHighScore", 75638636);
        setIntField(term3993549, term3993549.getClass(), "totalExpertHighScore", -1155350944);
        setIntField(term3993549, term3993549.getClass(), "totalMasterHighScore", 1342919584);
        setIntField(term3993549, term3993549.getClass(), "totalReMasterHighScore", 520534562);
        setIntField(term3993549, term3993549.getClass(), "totalHighSync", -1924223011);
        setIntField(term3993549, term3993549.getClass(), "totalEasySync", -534271434);
        setIntField(term3993549, term3993549.getClass(), "totalBasicSync", 681122904);
        setIntField(term3993549, term3993549.getClass(), "totalAdvancedSync", -177684640);
        setIntField(term3993549, term3993549.getClass(), "totalExpertSync", 1232370626);
        setIntField(term3993549, term3993549.getClass(), "totalMasterSync", -306590093);
        setIntField(term3993549, term3993549.getClass(), "totalReMasterSync", -689755534);
        setIntField(term3993549, term3993549.getClass(), "playerRating", 2143167992);
        setIntField(term3993549, term3993549.getClass(), "highestRating", 298281449);
        setIntField(term3993549, term3993549.getClass(), "rankAuthTailId", -138517594);
        setField(term3993549, term3993549.getClass(), "eventWatchedDate", "NLIqlUeQYa");
        setField(term3993549, term3993549.getClass(), "webLimitDate", "kgcBGyQnrq");
        setIntField(term3993549, term3993549.getClass(), "challengeTrackPhase", -1271038258);
        setIntField(term3993549, term3993549.getClass(), "firstPlayBits", -1170460448);
        setField(term3993549, term3993549.getClass(), "lastPlayDate", "bjqbkBSQPm");
        setIntField(term3993549, term3993549.getClass(), "lastPlaceId", -1210445860);
        setField(term3993549, term3993549.getClass(), "lastPlaceName", "oKlBonEJfB");
        setIntField(term3993549, term3993549.getClass(), "lastRegionId", -858589103);
        setField(term3993549, term3993549.getClass(), "lastRegionName", "jfXEqgAaNZ");
        setField(term3993549, term3993549.getClass(), "lastClientId", "cFnfvHhNNt");
        setField(term3993549, term3993549.getClass(), "lastCountryCode", "pNYSnbqQLp");
        setIntField(term3993549, term3993549.getClass(), "eventPoint", -1519370659);
        setIntField(term3993549, term3993549.getClass(), "totalLv", -1371085741);
        setIntField(term3993549, term3993549.getClass(), "lastLoginBonusDay", 623019295);
        setIntField(term3993549, term3993549.getClass(), "lastSurvivalBonusDay", -1572399909);
        setIntField(term3993549, term3993549.getClass(), "loginBonusLv", 1514125575);
        setField(term3993547, term3993547.getClass(), "user", term3993549);
        setIntField(term3993547, term3993547.getClass(), "orderId", -943928090);
        setLongField(term3993547, term3993547.getClass(), "sortNumber", 7942949405706126342L);
        setIntField(term3993547, term3993547.getClass(), "placeId", -1618338123);
        setField(term3993547, term3993547.getClass(), "placeName", "sVxIKjFIAS");
        setField(term3993547, term3993547.getClass(), "country", "RHsQegiAss");
        setIntField(term3993547, term3993547.getClass(), "regionId", -1116230966);
        setField(term3993547, term3993547.getClass(), "playDate", "BAnLQUfHmO");
        setField(term3993547, term3993547.getClass(), "userPlayDate", "HZGXmFgauN");
        setIntField(term3993547, term3993547.getClass(), "musicId", 724794062);
        setIntField(term3993547, term3993547.getClass(), "level", 558867417);
        setIntField(term3993547, term3993547.getClass(), "gameMode", 1144970985);
        setIntField(term3993547, term3993547.getClass(), "rivalNum", -367672527);
        setIntField(term3993547, term3993547.getClass(), "track", 1633340211);
        setIntField(term3993547, term3993547.getClass(), "eventId", -976067409);
        setBooleanField(term3993547, term3993547.getClass(), "isFreeToPlay", false);
        setIntField(term3993547, term3993547.getClass(), "playerRating", 969252170);
        setLongField(term3993547, term3993547.getClass(), "playedUserId1", 4008492702161760969L);
        setField(term3993547, term3993547.getClass(), "playedUserName1", "tySbKzYIEN");
        setIntField(term3993547, term3993547.getClass(), "playedMusicLevel1", 2005213286);
        setLongField(term3993547, term3993547.getClass(), "playedUserId2", 7670203570004205071L);
        setField(term3993547, term3993547.getClass(), "playedUserName2", "YsavAXojeL");
        setIntField(term3993547, term3993547.getClass(), "playedMusicLevel2", 1187987160);
        setLongField(term3993547, term3993547.getClass(), "playedUserId3", 5249733699101225996L);
        setField(term3993547, term3993547.getClass(), "playedUserName3", "pvTNyRaSGY");
        setIntField(term3993547, term3993547.getClass(), "playedMusicLevel3", -2116376575);
        setIntField(term3993547, term3993547.getClass(), "achievement", 2092444406);
        setIntField(term3993547, term3993547.getClass(), "score", -1592342792);
        setIntField(term3993547, term3993547.getClass(), "tapScore", -140755098);
        setIntField(term3993547, term3993547.getClass(), "holdScore", -660842610);
        setIntField(term3993547, term3993547.getClass(), "slideScore", -544540901);
        setIntField(term3993547, term3993547.getClass(), "breakScore", 682533343);
        setIntField(term3993547, term3993547.getClass(), "syncRate", -2084786768);
        setIntField(term3993547, term3993547.getClass(), "vsWin", 230952853);
        setBooleanField(term3993547, term3993547.getClass(), "isAllPerfect", false);
        setIntField(term3993547, term3993547.getClass(), "fullCombo", 23721915);
        setIntField(term3993547, term3993547.getClass(), "maxFever", 2023929333);
        setIntField(term3993547, term3993547.getClass(), "maxCombo", -363986408);
        setIntField(term3993547, term3993547.getClass(), "tapPerfect", -1652178586);
        setIntField(term3993547, term3993547.getClass(), "tapGreat", -889922898);
        setIntField(term3993547, term3993547.getClass(), "tapGood", 2073401509);
        setIntField(term3993547, term3993547.getClass(), "tapBad", -836071631);
        setIntField(term3993547, term3993547.getClass(), "holdPerfect", 1633315638);
        setIntField(term3993547, term3993547.getClass(), "holdGreat", -711015699);
        setIntField(term3993547, term3993547.getClass(), "holdGood", 385162721);
        setIntField(term3993547, term3993547.getClass(), "holdBad", 1662175910);
        setIntField(term3993547, term3993547.getClass(), "slidePerfect", -1941898957);
        setIntField(term3993547, term3993547.getClass(), "slideGreat", -201976308);
        setIntField(term3993547, term3993547.getClass(), "slideGood", -1579060903);
        setIntField(term3993547, term3993547.getClass(), "slideBad", 44548185);
        setIntField(term3993547, term3993547.getClass(), "breakPerfect", 2047058904);
        setIntField(term3993547, term3993547.getClass(), "breakGreat", -1839391224);
        setIntField(term3993547, term3993547.getClass(), "breakGood", 231739113);
        setIntField(term3993547, term3993547.getClass(), "breakBad", -2013850673);
        setBooleanField(term3993547, term3993547.getClass(), "isTrackSkip", true);
        setBooleanField(term3993547, term3993547.getClass(), "isHighScore", true);
        setBooleanField(term3993547, term3993547.getClass(), "isChallengeTrack", true);
        setIntField(term3993547, term3993547.getClass(), "challengeLife", 1933860737);
        setIntField(term3993547, term3993547.getClass(), "challengeRemain", -1861975230);
        setIntField(term3993547, term3993547.getClass(), "isAllPerfectPlus", -1283371438);
        term3993859 = new Integer(293286858);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3993859;
        callMethod(klass, "setBreakBad", argTypes, term3993547, args);
    }

};


