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

public class UserPlaylog_setChallengeRemain_142841726120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term169551;
     Object term169863;

    public UserPlaylog_setChallengeRemain_142841726120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term169557 = new Long(-4146453776626172590L);
        term169551 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term169553 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term169555 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term169571 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term169572 = newInstance(Class.forName("java.time.LocalDate"));
        Object term169576 = newInstance(Class.forName("java.time.LocalTime"));
        Object term169581 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term169582 = newInstance(Class.forName("java.time.LocalDate"));
        Object term169586 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term169551, term169551.getClass(), "id", -5505212927676546906L);
        setLongField(term169553, term169553.getClass(), "id", -2309176226516464162L);
        setLongField(term169555, term169555.getClass(), "id", -1164828048757086472L);
        setField(term169555, term169555.getClass(), "extId", term169557);
        setField(term169555, term169555.getClass(), "luid", "rnwvPkpKVX");
        setIntField(term169572, term169572.getClass(), "year", 2014);
        setShortField(term169572, term169572.getClass(), "month", (short) 4);
        setShortField(term169572, term169572.getClass(), "day", (short) 15);
        setField(term169571, term169571.getClass(), "date", term169572);
        setByteField(term169576, term169576.getClass(), "hour", (byte) 8);
        setByteField(term169576, term169576.getClass(), "minute", (byte) 15);
        setByteField(term169576, term169576.getClass(), "second", (byte) 19);
        setIntField(term169576, term169576.getClass(), "nano", 362225421);
        setField(term169571, term169571.getClass(), "time", term169576);
        setField(term169555, term169555.getClass(), "registerTime", term169571);
        setIntField(term169582, term169582.getClass(), "year", 2015);
        setShortField(term169582, term169582.getClass(), "month", (short) 12);
        setShortField(term169582, term169582.getClass(), "day", (short) 2);
        setField(term169581, term169581.getClass(), "date", term169582);
        setByteField(term169586, term169586.getClass(), "hour", (byte) 16);
        setByteField(term169586, term169586.getClass(), "minute", (byte) 26);
        setByteField(term169586, term169586.getClass(), "second", (byte) 42);
        setIntField(term169586, term169586.getClass(), "nano", 766720106);
        setField(term169581, term169581.getClass(), "time", term169586);
        setField(term169555, term169555.getClass(), "accessTime", term169581);
        setField(term169553, term169553.getClass(), "card", term169555);
        setIntField(term169553, term169553.getClass(), "lastDataVersion", -1933457227);
        setField(term169553, term169553.getClass(), "userName", "BxSVyceqSm");
        setIntField(term169553, term169553.getClass(), "point", -1434670867);
        setIntField(term169553, term169553.getClass(), "totalPoint", -1854265265);
        setIntField(term169553, term169553.getClass(), "iconId", 215107724);
        setIntField(term169553, term169553.getClass(), "nameplateId", 1732587086);
        setIntField(term169553, term169553.getClass(), "frameId", 2044018788);
        setIntField(term169553, term169553.getClass(), "trophyId", -74011134);
        setIntField(term169553, term169553.getClass(), "playCount", -1002087080);
        setIntField(term169553, term169553.getClass(), "playVsCount", -1693852420);
        setIntField(term169553, term169553.getClass(), "playSyncCount", 949375494);
        setIntField(term169553, term169553.getClass(), "winCount", 1468356749);
        setIntField(term169553, term169553.getClass(), "helpCount", -84035654);
        setIntField(term169553, term169553.getClass(), "comboCount", -1682690229);
        setIntField(term169553, term169553.getClass(), "feverCount", -1845030752);
        setIntField(term169553, term169553.getClass(), "totalHiScore", 585514910);
        setIntField(term169553, term169553.getClass(), "totalEasyHighScore", 1258991103);
        setIntField(term169553, term169553.getClass(), "totalBasicHighScore", 436480605);
        setIntField(term169553, term169553.getClass(), "totalAdvancedHighScore", -545501575);
        setIntField(term169553, term169553.getClass(), "totalExpertHighScore", -1649127164);
        setIntField(term169553, term169553.getClass(), "totalMasterHighScore", 1220852652);
        setIntField(term169553, term169553.getClass(), "totalReMasterHighScore", 57731342);
        setIntField(term169553, term169553.getClass(), "totalHighSync", -1661504604);
        setIntField(term169553, term169553.getClass(), "totalEasySync", 817080945);
        setIntField(term169553, term169553.getClass(), "totalBasicSync", -48246280);
        setIntField(term169553, term169553.getClass(), "totalAdvancedSync", 1315771735);
        setIntField(term169553, term169553.getClass(), "totalExpertSync", -2020735596);
        setIntField(term169553, term169553.getClass(), "totalMasterSync", -1211806847);
        setIntField(term169553, term169553.getClass(), "totalReMasterSync", 1357757306);
        setIntField(term169553, term169553.getClass(), "playerRating", 1294930935);
        setIntField(term169553, term169553.getClass(), "highestRating", 654939125);
        setIntField(term169553, term169553.getClass(), "rankAuthTailId", -181050374);
        setField(term169553, term169553.getClass(), "eventWatchedDate", "wMPExrcpuS");
        setField(term169553, term169553.getClass(), "webLimitDate", "OarbTBiJae");
        setIntField(term169553, term169553.getClass(), "challengeTrackPhase", -1640593630);
        setIntField(term169553, term169553.getClass(), "firstPlayBits", 828229199);
        setField(term169553, term169553.getClass(), "lastPlayDate", "mXZKaytExY");
        setIntField(term169553, term169553.getClass(), "lastPlaceId", -1965482311);
        setField(term169553, term169553.getClass(), "lastPlaceName", "YePrhNqEVB");
        setIntField(term169553, term169553.getClass(), "lastRegionId", 1487520341);
        setField(term169553, term169553.getClass(), "lastRegionName", "ItBnSfBOeK");
        setField(term169553, term169553.getClass(), "lastClientId", "UgJLdCLLek");
        setField(term169553, term169553.getClass(), "lastCountryCode", "lWjrRjjSxQ");
        setIntField(term169553, term169553.getClass(), "eventPoint", -189256083);
        setIntField(term169553, term169553.getClass(), "totalLv", 900531853);
        setIntField(term169553, term169553.getClass(), "lastLoginBonusDay", 1114261872);
        setIntField(term169553, term169553.getClass(), "lastSurvivalBonusDay", 178923133);
        setIntField(term169553, term169553.getClass(), "loginBonusLv", -1040323884);
        setField(term169551, term169551.getClass(), "user", term169553);
        setIntField(term169551, term169551.getClass(), "orderId", -2054995443);
        setLongField(term169551, term169551.getClass(), "sortNumber", -2008405844948549125L);
        setIntField(term169551, term169551.getClass(), "placeId", -745410596);
        setField(term169551, term169551.getClass(), "placeName", "YTiiBmPBxA");
        setField(term169551, term169551.getClass(), "country", "DeKKQvsCKV");
        setIntField(term169551, term169551.getClass(), "regionId", -1659601706);
        setField(term169551, term169551.getClass(), "playDate", "djcluFSRjM");
        setField(term169551, term169551.getClass(), "userPlayDate", "MBcybJsfOP");
        setIntField(term169551, term169551.getClass(), "musicId", 1066593925);
        setIntField(term169551, term169551.getClass(), "level", 410244603);
        setIntField(term169551, term169551.getClass(), "gameMode", -1139740732);
        setIntField(term169551, term169551.getClass(), "rivalNum", -445954688);
        setIntField(term169551, term169551.getClass(), "track", 31159380);
        setIntField(term169551, term169551.getClass(), "eventId", -705686980);
        setBooleanField(term169551, term169551.getClass(), "isFreeToPlay", true);
        setIntField(term169551, term169551.getClass(), "playerRating", 247151624);
        setLongField(term169551, term169551.getClass(), "playedUserId1", 3744169870072117962L);
        setField(term169551, term169551.getClass(), "playedUserName1", "spZaeqpTCZ");
        setIntField(term169551, term169551.getClass(), "playedMusicLevel1", -267605028);
        setLongField(term169551, term169551.getClass(), "playedUserId2", -3929129052663118960L);
        setField(term169551, term169551.getClass(), "playedUserName2", "vXFjQWxORA");
        setIntField(term169551, term169551.getClass(), "playedMusicLevel2", 727341812);
        setLongField(term169551, term169551.getClass(), "playedUserId3", -8701651184835718046L);
        setField(term169551, term169551.getClass(), "playedUserName3", "jzhkCKcgje");
        setIntField(term169551, term169551.getClass(), "playedMusicLevel3", 525010574);
        setIntField(term169551, term169551.getClass(), "achievement", -158036747);
        setIntField(term169551, term169551.getClass(), "score", -12250546);
        setIntField(term169551, term169551.getClass(), "tapScore", -2116501663);
        setIntField(term169551, term169551.getClass(), "holdScore", 1632271853);
        setIntField(term169551, term169551.getClass(), "slideScore", 1805074906);
        setIntField(term169551, term169551.getClass(), "breakScore", 2132284996);
        setIntField(term169551, term169551.getClass(), "syncRate", 4737696);
        setIntField(term169551, term169551.getClass(), "vsWin", 1027722296);
        setBooleanField(term169551, term169551.getClass(), "isAllPerfect", false);
        setIntField(term169551, term169551.getClass(), "fullCombo", -1827715109);
        setIntField(term169551, term169551.getClass(), "maxFever", 1523011703);
        setIntField(term169551, term169551.getClass(), "maxCombo", -2003818838);
        setIntField(term169551, term169551.getClass(), "tapPerfect", -900115948);
        setIntField(term169551, term169551.getClass(), "tapGreat", 431757828);
        setIntField(term169551, term169551.getClass(), "tapGood", 1406031216);
        setIntField(term169551, term169551.getClass(), "tapBad", 1191169701);
        setIntField(term169551, term169551.getClass(), "holdPerfect", 477092624);
        setIntField(term169551, term169551.getClass(), "holdGreat", 495595169);
        setIntField(term169551, term169551.getClass(), "holdGood", -1082148274);
        setIntField(term169551, term169551.getClass(), "holdBad", -584962475);
        setIntField(term169551, term169551.getClass(), "slidePerfect", -986629622);
        setIntField(term169551, term169551.getClass(), "slideGreat", 1491428812);
        setIntField(term169551, term169551.getClass(), "slideGood", 1357324741);
        setIntField(term169551, term169551.getClass(), "slideBad", -429996847);
        setIntField(term169551, term169551.getClass(), "breakPerfect", 667928528);
        setIntField(term169551, term169551.getClass(), "breakGreat", 1739279686);
        setIntField(term169551, term169551.getClass(), "breakGood", 2085655914);
        setIntField(term169551, term169551.getClass(), "breakBad", 897433209);
        setBooleanField(term169551, term169551.getClass(), "isTrackSkip", true);
        setBooleanField(term169551, term169551.getClass(), "isHighScore", false);
        setBooleanField(term169551, term169551.getClass(), "isChallengeTrack", false);
        setIntField(term169551, term169551.getClass(), "challengeLife", -561731575);
        setIntField(term169551, term169551.getClass(), "challengeRemain", 1994214794);
        setIntField(term169551, term169551.getClass(), "isAllPerfectPlus", 1091940141);
        term169863 = new Integer(-771802585);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term169863;
        callMethod(klass, "setChallengeRemain", argTypes, term169551, args);
    }

};


