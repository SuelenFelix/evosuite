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

public class UserPlaylog_setMaxFever_200443588598 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3985489;
     Object term3985801;

    public UserPlaylog_setMaxFever_200443588598() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3985495 = new Long(3539218699832186677L);
        term3985489 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term3985491 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term3985493 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term3985509 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3985510 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3985514 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3985519 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3985520 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3985524 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term3985489, term3985489.getClass(), "id", -2449804657849553640L);
        setLongField(term3985491, term3985491.getClass(), "id", 5699145612233691336L);
        setLongField(term3985493, term3985493.getClass(), "id", 7711212798572842488L);
        setField(term3985493, term3985493.getClass(), "extId", term3985495);
        setField(term3985493, term3985493.getClass(), "luid", "LeXravJoZk");
        setIntField(term3985510, term3985510.getClass(), "year", 2019);
        setShortField(term3985510, term3985510.getClass(), "month", (short) 4);
        setShortField(term3985510, term3985510.getClass(), "day", (short) 2);
        setField(term3985509, term3985509.getClass(), "date", term3985510);
        setByteField(term3985514, term3985514.getClass(), "hour", (byte) 13);
        setByteField(term3985514, term3985514.getClass(), "minute", (byte) 53);
        setByteField(term3985514, term3985514.getClass(), "second", (byte) 11);
        setIntField(term3985514, term3985514.getClass(), "nano", 739955594);
        setField(term3985509, term3985509.getClass(), "time", term3985514);
        setField(term3985493, term3985493.getClass(), "registerTime", term3985509);
        setIntField(term3985520, term3985520.getClass(), "year", 2025);
        setShortField(term3985520, term3985520.getClass(), "month", (short) 8);
        setShortField(term3985520, term3985520.getClass(), "day", (short) 10);
        setField(term3985519, term3985519.getClass(), "date", term3985520);
        setByteField(term3985524, term3985524.getClass(), "hour", (byte) 15);
        setByteField(term3985524, term3985524.getClass(), "minute", (byte) 2);
        setByteField(term3985524, term3985524.getClass(), "second", (byte) 59);
        setIntField(term3985524, term3985524.getClass(), "nano", 9952131);
        setField(term3985519, term3985519.getClass(), "time", term3985524);
        setField(term3985493, term3985493.getClass(), "accessTime", term3985519);
        setField(term3985491, term3985491.getClass(), "card", term3985493);
        setIntField(term3985491, term3985491.getClass(), "lastDataVersion", -1938627197);
        setField(term3985491, term3985491.getClass(), "userName", "VCammHslYK");
        setIntField(term3985491, term3985491.getClass(), "point", 328466127);
        setIntField(term3985491, term3985491.getClass(), "totalPoint", 530959197);
        setIntField(term3985491, term3985491.getClass(), "iconId", -1042547538);
        setIntField(term3985491, term3985491.getClass(), "nameplateId", 273266348);
        setIntField(term3985491, term3985491.getClass(), "frameId", -1430025491);
        setIntField(term3985491, term3985491.getClass(), "trophyId", 1800574676);
        setIntField(term3985491, term3985491.getClass(), "playCount", -1811960525);
        setIntField(term3985491, term3985491.getClass(), "playVsCount", -1111606231);
        setIntField(term3985491, term3985491.getClass(), "playSyncCount", -1707323562);
        setIntField(term3985491, term3985491.getClass(), "winCount", 595106370);
        setIntField(term3985491, term3985491.getClass(), "helpCount", -646054341);
        setIntField(term3985491, term3985491.getClass(), "comboCount", -2111955952);
        setIntField(term3985491, term3985491.getClass(), "feverCount", 1980457723);
        setIntField(term3985491, term3985491.getClass(), "totalHiScore", 1063601941);
        setIntField(term3985491, term3985491.getClass(), "totalEasyHighScore", -1174648834);
        setIntField(term3985491, term3985491.getClass(), "totalBasicHighScore", -1541496783);
        setIntField(term3985491, term3985491.getClass(), "totalAdvancedHighScore", 1349622756);
        setIntField(term3985491, term3985491.getClass(), "totalExpertHighScore", -431645735);
        setIntField(term3985491, term3985491.getClass(), "totalMasterHighScore", 174591104);
        setIntField(term3985491, term3985491.getClass(), "totalReMasterHighScore", -1386140493);
        setIntField(term3985491, term3985491.getClass(), "totalHighSync", -767359955);
        setIntField(term3985491, term3985491.getClass(), "totalEasySync", -358838545);
        setIntField(term3985491, term3985491.getClass(), "totalBasicSync", -1204806086);
        setIntField(term3985491, term3985491.getClass(), "totalAdvancedSync", 1102056412);
        setIntField(term3985491, term3985491.getClass(), "totalExpertSync", 1046092625);
        setIntField(term3985491, term3985491.getClass(), "totalMasterSync", -240586628);
        setIntField(term3985491, term3985491.getClass(), "totalReMasterSync", -40432390);
        setIntField(term3985491, term3985491.getClass(), "playerRating", -1910791377);
        setIntField(term3985491, term3985491.getClass(), "highestRating", 1160210346);
        setIntField(term3985491, term3985491.getClass(), "rankAuthTailId", 569571236);
        setField(term3985491, term3985491.getClass(), "eventWatchedDate", "AStepBZbFG");
        setField(term3985491, term3985491.getClass(), "webLimitDate", "jpaYdCFoDP");
        setIntField(term3985491, term3985491.getClass(), "challengeTrackPhase", 616889606);
        setIntField(term3985491, term3985491.getClass(), "firstPlayBits", -334666309);
        setField(term3985491, term3985491.getClass(), "lastPlayDate", "dQbHwoIaEn");
        setIntField(term3985491, term3985491.getClass(), "lastPlaceId", -1226171336);
        setField(term3985491, term3985491.getClass(), "lastPlaceName", "cMduoOTeZI");
        setIntField(term3985491, term3985491.getClass(), "lastRegionId", -1291260168);
        setField(term3985491, term3985491.getClass(), "lastRegionName", "TAtObKpJsa");
        setField(term3985491, term3985491.getClass(), "lastClientId", "VVjnsccDzi");
        setField(term3985491, term3985491.getClass(), "lastCountryCode", "PTBBQWOkCm");
        setIntField(term3985491, term3985491.getClass(), "eventPoint", -788706169);
        setIntField(term3985491, term3985491.getClass(), "totalLv", 1877415857);
        setIntField(term3985491, term3985491.getClass(), "lastLoginBonusDay", -123283807);
        setIntField(term3985491, term3985491.getClass(), "lastSurvivalBonusDay", 217429036);
        setIntField(term3985491, term3985491.getClass(), "loginBonusLv", -1396790491);
        setField(term3985489, term3985489.getClass(), "user", term3985491);
        setIntField(term3985489, term3985489.getClass(), "orderId", -451266760);
        setLongField(term3985489, term3985489.getClass(), "sortNumber", -4482579534531703188L);
        setIntField(term3985489, term3985489.getClass(), "placeId", -574768776);
        setField(term3985489, term3985489.getClass(), "placeName", "JXpiPHCtqQ");
        setField(term3985489, term3985489.getClass(), "country", "cFLYIiZqkp");
        setIntField(term3985489, term3985489.getClass(), "regionId", 2004025101);
        setField(term3985489, term3985489.getClass(), "playDate", "LYKKxbthih");
        setField(term3985489, term3985489.getClass(), "userPlayDate", "OSSWJAjSyd");
        setIntField(term3985489, term3985489.getClass(), "musicId", 786073582);
        setIntField(term3985489, term3985489.getClass(), "level", -871588227);
        setIntField(term3985489, term3985489.getClass(), "gameMode", -296655167);
        setIntField(term3985489, term3985489.getClass(), "rivalNum", 42247089);
        setIntField(term3985489, term3985489.getClass(), "track", 1106966907);
        setIntField(term3985489, term3985489.getClass(), "eventId", 903656205);
        setBooleanField(term3985489, term3985489.getClass(), "isFreeToPlay", false);
        setIntField(term3985489, term3985489.getClass(), "playerRating", -1245405516);
        setLongField(term3985489, term3985489.getClass(), "playedUserId1", -5134750391807993357L);
        setField(term3985489, term3985489.getClass(), "playedUserName1", "CerpyLIjkO");
        setIntField(term3985489, term3985489.getClass(), "playedMusicLevel1", 592004079);
        setLongField(term3985489, term3985489.getClass(), "playedUserId2", -5954235540150606793L);
        setField(term3985489, term3985489.getClass(), "playedUserName2", "GhpbBfRPov");
        setIntField(term3985489, term3985489.getClass(), "playedMusicLevel2", -1210284971);
        setLongField(term3985489, term3985489.getClass(), "playedUserId3", 5313062152012195828L);
        setField(term3985489, term3985489.getClass(), "playedUserName3", "gAzxMLRjjF");
        setIntField(term3985489, term3985489.getClass(), "playedMusicLevel3", 1483257446);
        setIntField(term3985489, term3985489.getClass(), "achievement", -55802175);
        setIntField(term3985489, term3985489.getClass(), "score", -73391087);
        setIntField(term3985489, term3985489.getClass(), "tapScore", -168598636);
        setIntField(term3985489, term3985489.getClass(), "holdScore", -1088287798);
        setIntField(term3985489, term3985489.getClass(), "slideScore", -1695425324);
        setIntField(term3985489, term3985489.getClass(), "breakScore", -519366968);
        setIntField(term3985489, term3985489.getClass(), "syncRate", 2055878601);
        setIntField(term3985489, term3985489.getClass(), "vsWin", 2087618390);
        setBooleanField(term3985489, term3985489.getClass(), "isAllPerfect", false);
        setIntField(term3985489, term3985489.getClass(), "fullCombo", 700160730);
        setIntField(term3985489, term3985489.getClass(), "maxFever", 573486176);
        setIntField(term3985489, term3985489.getClass(), "maxCombo", 568475677);
        setIntField(term3985489, term3985489.getClass(), "tapPerfect", 1894193747);
        setIntField(term3985489, term3985489.getClass(), "tapGreat", 1566690946);
        setIntField(term3985489, term3985489.getClass(), "tapGood", 1640124724);
        setIntField(term3985489, term3985489.getClass(), "tapBad", 1086030266);
        setIntField(term3985489, term3985489.getClass(), "holdPerfect", -219909940);
        setIntField(term3985489, term3985489.getClass(), "holdGreat", 1313843527);
        setIntField(term3985489, term3985489.getClass(), "holdGood", -186357917);
        setIntField(term3985489, term3985489.getClass(), "holdBad", 791511401);
        setIntField(term3985489, term3985489.getClass(), "slidePerfect", -21015456);
        setIntField(term3985489, term3985489.getClass(), "slideGreat", -794293074);
        setIntField(term3985489, term3985489.getClass(), "slideGood", 1356818371);
        setIntField(term3985489, term3985489.getClass(), "slideBad", 304051067);
        setIntField(term3985489, term3985489.getClass(), "breakPerfect", -667686823);
        setIntField(term3985489, term3985489.getClass(), "breakGreat", 233838284);
        setIntField(term3985489, term3985489.getClass(), "breakGood", -1263131115);
        setIntField(term3985489, term3985489.getClass(), "breakBad", 221840877);
        setBooleanField(term3985489, term3985489.getClass(), "isTrackSkip", true);
        setBooleanField(term3985489, term3985489.getClass(), "isHighScore", true);
        setBooleanField(term3985489, term3985489.getClass(), "isChallengeTrack", true);
        setIntField(term3985489, term3985489.getClass(), "challengeLife", 884216572);
        setIntField(term3985489, term3985489.getClass(), "challengeRemain", -2043186421);
        setIntField(term3985489, term3985489.getClass(), "isAllPerfectPlus", 1284396154);
        term3985801 = new Integer(1762863302);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3985801;
        callMethod(klass, "setMaxFever", argTypes, term3985489, args);
    }

};


