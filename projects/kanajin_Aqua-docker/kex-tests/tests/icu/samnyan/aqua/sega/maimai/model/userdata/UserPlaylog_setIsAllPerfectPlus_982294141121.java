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

public class UserPlaylog_setIsAllPerfectPlus_982294141121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3996391;
     Object term3996703;

    public UserPlaylog_setIsAllPerfectPlus_982294141121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3996397 = new Long(-4716800369751248906L);
        term3996391 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term3996393 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term3996395 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term3996411 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3996412 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3996416 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3996421 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3996422 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3996426 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term3996391, term3996391.getClass(), "id", -6424565700740582943L);
        setLongField(term3996393, term3996393.getClass(), "id", -420471565071561365L);
        setLongField(term3996395, term3996395.getClass(), "id", 4434910003484183058L);
        setField(term3996395, term3996395.getClass(), "extId", term3996397);
        setField(term3996395, term3996395.getClass(), "luid", "GMjLhSYwlp");
        setIntField(term3996412, term3996412.getClass(), "year", 2029);
        setShortField(term3996412, term3996412.getClass(), "month", (short) 5);
        setShortField(term3996412, term3996412.getClass(), "day", (short) 5);
        setField(term3996411, term3996411.getClass(), "date", term3996412);
        setByteField(term3996416, term3996416.getClass(), "hour", (byte) 12);
        setByteField(term3996416, term3996416.getClass(), "minute", (byte) 48);
        setByteField(term3996416, term3996416.getClass(), "second", (byte) 11);
        setIntField(term3996416, term3996416.getClass(), "nano", 229182908);
        setField(term3996411, term3996411.getClass(), "time", term3996416);
        setField(term3996395, term3996395.getClass(), "registerTime", term3996411);
        setIntField(term3996422, term3996422.getClass(), "year", 2020);
        setShortField(term3996422, term3996422.getClass(), "month", (short) 12);
        setShortField(term3996422, term3996422.getClass(), "day", (short) 26);
        setField(term3996421, term3996421.getClass(), "date", term3996422);
        setByteField(term3996426, term3996426.getClass(), "hour", (byte) 15);
        setByteField(term3996426, term3996426.getClass(), "minute", (byte) 17);
        setByteField(term3996426, term3996426.getClass(), "second", (byte) 38);
        setIntField(term3996426, term3996426.getClass(), "nano", 487223452);
        setField(term3996421, term3996421.getClass(), "time", term3996426);
        setField(term3996395, term3996395.getClass(), "accessTime", term3996421);
        setField(term3996393, term3996393.getClass(), "card", term3996395);
        setIntField(term3996393, term3996393.getClass(), "lastDataVersion", -624149394);
        setField(term3996393, term3996393.getClass(), "userName", "gRwFVxPiQV");
        setIntField(term3996393, term3996393.getClass(), "point", -1632985026);
        setIntField(term3996393, term3996393.getClass(), "totalPoint", 820348083);
        setIntField(term3996393, term3996393.getClass(), "iconId", 852263194);
        setIntField(term3996393, term3996393.getClass(), "nameplateId", -2038494924);
        setIntField(term3996393, term3996393.getClass(), "frameId", -1994149351);
        setIntField(term3996393, term3996393.getClass(), "trophyId", 1316683484);
        setIntField(term3996393, term3996393.getClass(), "playCount", -282737692);
        setIntField(term3996393, term3996393.getClass(), "playVsCount", -464969207);
        setIntField(term3996393, term3996393.getClass(), "playSyncCount", 1268106635);
        setIntField(term3996393, term3996393.getClass(), "winCount", 526503997);
        setIntField(term3996393, term3996393.getClass(), "helpCount", 1535331054);
        setIntField(term3996393, term3996393.getClass(), "comboCount", 652247617);
        setIntField(term3996393, term3996393.getClass(), "feverCount", 1544541644);
        setIntField(term3996393, term3996393.getClass(), "totalHiScore", -954143931);
        setIntField(term3996393, term3996393.getClass(), "totalEasyHighScore", 1498271001);
        setIntField(term3996393, term3996393.getClass(), "totalBasicHighScore", 256144911);
        setIntField(term3996393, term3996393.getClass(), "totalAdvancedHighScore", 1862872410);
        setIntField(term3996393, term3996393.getClass(), "totalExpertHighScore", -770570438);
        setIntField(term3996393, term3996393.getClass(), "totalMasterHighScore", 1233604097);
        setIntField(term3996393, term3996393.getClass(), "totalReMasterHighScore", 233792519);
        setIntField(term3996393, term3996393.getClass(), "totalHighSync", -1840198865);
        setIntField(term3996393, term3996393.getClass(), "totalEasySync", 640446300);
        setIntField(term3996393, term3996393.getClass(), "totalBasicSync", -160454581);
        setIntField(term3996393, term3996393.getClass(), "totalAdvancedSync", -274912546);
        setIntField(term3996393, term3996393.getClass(), "totalExpertSync", 1584490294);
        setIntField(term3996393, term3996393.getClass(), "totalMasterSync", -1718935478);
        setIntField(term3996393, term3996393.getClass(), "totalReMasterSync", -113841856);
        setIntField(term3996393, term3996393.getClass(), "playerRating", 754128756);
        setIntField(term3996393, term3996393.getClass(), "highestRating", 200067579);
        setIntField(term3996393, term3996393.getClass(), "rankAuthTailId", 1064097699);
        setField(term3996393, term3996393.getClass(), "eventWatchedDate", "fExsQPBcaW");
        setField(term3996393, term3996393.getClass(), "webLimitDate", "kTYmMZatQu");
        setIntField(term3996393, term3996393.getClass(), "challengeTrackPhase", 876695967);
        setIntField(term3996393, term3996393.getClass(), "firstPlayBits", -1381845228);
        setField(term3996393, term3996393.getClass(), "lastPlayDate", "SSVonplvvS");
        setIntField(term3996393, term3996393.getClass(), "lastPlaceId", -1599575134);
        setField(term3996393, term3996393.getClass(), "lastPlaceName", "ldkulXqiIp");
        setIntField(term3996393, term3996393.getClass(), "lastRegionId", 1999829487);
        setField(term3996393, term3996393.getClass(), "lastRegionName", "LEqaoijKHy");
        setField(term3996393, term3996393.getClass(), "lastClientId", "QtKAxHgWFv");
        setField(term3996393, term3996393.getClass(), "lastCountryCode", "DBrCTaoXpU");
        setIntField(term3996393, term3996393.getClass(), "eventPoint", -563474514);
        setIntField(term3996393, term3996393.getClass(), "totalLv", 1769015802);
        setIntField(term3996393, term3996393.getClass(), "lastLoginBonusDay", 17862170);
        setIntField(term3996393, term3996393.getClass(), "lastSurvivalBonusDay", 30307008);
        setIntField(term3996393, term3996393.getClass(), "loginBonusLv", 1290733202);
        setField(term3996391, term3996391.getClass(), "user", term3996393);
        setIntField(term3996391, term3996391.getClass(), "orderId", -803218923);
        setLongField(term3996391, term3996391.getClass(), "sortNumber", -8097592269688453158L);
        setIntField(term3996391, term3996391.getClass(), "placeId", -954841454);
        setField(term3996391, term3996391.getClass(), "placeName", "RwsOnwhiwQ");
        setField(term3996391, term3996391.getClass(), "country", "hrxNpUjHVN");
        setIntField(term3996391, term3996391.getClass(), "regionId", 391639828);
        setField(term3996391, term3996391.getClass(), "playDate", "kMPfkhcCsy");
        setField(term3996391, term3996391.getClass(), "userPlayDate", "wOqKnYDtbu");
        setIntField(term3996391, term3996391.getClass(), "musicId", 696334048);
        setIntField(term3996391, term3996391.getClass(), "level", 1288649229);
        setIntField(term3996391, term3996391.getClass(), "gameMode", 1518348843);
        setIntField(term3996391, term3996391.getClass(), "rivalNum", -1971113475);
        setIntField(term3996391, term3996391.getClass(), "track", -442852237);
        setIntField(term3996391, term3996391.getClass(), "eventId", -565612410);
        setBooleanField(term3996391, term3996391.getClass(), "isFreeToPlay", true);
        setIntField(term3996391, term3996391.getClass(), "playerRating", -649293330);
        setLongField(term3996391, term3996391.getClass(), "playedUserId1", -6542467575679601420L);
        setField(term3996391, term3996391.getClass(), "playedUserName1", "ipmmHYCNgs");
        setIntField(term3996391, term3996391.getClass(), "playedMusicLevel1", 1081283459);
        setLongField(term3996391, term3996391.getClass(), "playedUserId2", 2811037470467891994L);
        setField(term3996391, term3996391.getClass(), "playedUserName2", "obLOCjNafs");
        setIntField(term3996391, term3996391.getClass(), "playedMusicLevel2", -319580801);
        setLongField(term3996391, term3996391.getClass(), "playedUserId3", 4825691281987867645L);
        setField(term3996391, term3996391.getClass(), "playedUserName3", "HnVMYLqqrp");
        setIntField(term3996391, term3996391.getClass(), "playedMusicLevel3", 1812714406);
        setIntField(term3996391, term3996391.getClass(), "achievement", 392145407);
        setIntField(term3996391, term3996391.getClass(), "score", -1955669559);
        setIntField(term3996391, term3996391.getClass(), "tapScore", -1811994906);
        setIntField(term3996391, term3996391.getClass(), "holdScore", -872195883);
        setIntField(term3996391, term3996391.getClass(), "slideScore", -106512365);
        setIntField(term3996391, term3996391.getClass(), "breakScore", -1672035219);
        setIntField(term3996391, term3996391.getClass(), "syncRate", -705252918);
        setIntField(term3996391, term3996391.getClass(), "vsWin", -283386685);
        setBooleanField(term3996391, term3996391.getClass(), "isAllPerfect", false);
        setIntField(term3996391, term3996391.getClass(), "fullCombo", 92112159);
        setIntField(term3996391, term3996391.getClass(), "maxFever", 867746357);
        setIntField(term3996391, term3996391.getClass(), "maxCombo", 1299377762);
        setIntField(term3996391, term3996391.getClass(), "tapPerfect", 1059940270);
        setIntField(term3996391, term3996391.getClass(), "tapGreat", 1891186257);
        setIntField(term3996391, term3996391.getClass(), "tapGood", -699655961);
        setIntField(term3996391, term3996391.getClass(), "tapBad", 605634577);
        setIntField(term3996391, term3996391.getClass(), "holdPerfect", 1069740516);
        setIntField(term3996391, term3996391.getClass(), "holdGreat", -863444669);
        setIntField(term3996391, term3996391.getClass(), "holdGood", 61155191);
        setIntField(term3996391, term3996391.getClass(), "holdBad", 247576244);
        setIntField(term3996391, term3996391.getClass(), "slidePerfect", 552234119);
        setIntField(term3996391, term3996391.getClass(), "slideGreat", 2090415982);
        setIntField(term3996391, term3996391.getClass(), "slideGood", -1486838169);
        setIntField(term3996391, term3996391.getClass(), "slideBad", 1827361083);
        setIntField(term3996391, term3996391.getClass(), "breakPerfect", 1341526672);
        setIntField(term3996391, term3996391.getClass(), "breakGreat", 803054812);
        setIntField(term3996391, term3996391.getClass(), "breakGood", 924322410);
        setIntField(term3996391, term3996391.getClass(), "breakBad", -1046915718);
        setBooleanField(term3996391, term3996391.getClass(), "isTrackSkip", false);
        setBooleanField(term3996391, term3996391.getClass(), "isHighScore", true);
        setBooleanField(term3996391, term3996391.getClass(), "isChallengeTrack", false);
        setIntField(term3996391, term3996391.getClass(), "challengeLife", -1710012907);
        setIntField(term3996391, term3996391.getClass(), "challengeRemain", 407346721);
        setIntField(term3996391, term3996391.getClass(), "isAllPerfectPlus", -1872302773);
        term3996703 = new Integer(-2113023679);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3996703;
        callMethod(klass, "setIsAllPerfectPlus", argTypes, term3996391, args);
    }

};


