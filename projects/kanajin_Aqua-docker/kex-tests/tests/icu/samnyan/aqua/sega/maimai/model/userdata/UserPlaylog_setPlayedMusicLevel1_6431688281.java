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

public class UserPlaylog_setPlayedMusicLevel1_6431688281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term151025;
     Object term151337;

    public UserPlaylog_setPlayedMusicLevel1_6431688281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term151031 = new Long(-4231979631084175364L);
        term151025 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term151027 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term151029 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term151045 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term151046 = newInstance(Class.forName("java.time.LocalDate"));
        Object term151050 = newInstance(Class.forName("java.time.LocalTime"));
        Object term151055 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term151056 = newInstance(Class.forName("java.time.LocalDate"));
        Object term151060 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term151025, term151025.getClass(), "id", 6721721782435142809L);
        setLongField(term151027, term151027.getClass(), "id", -8413391289081836699L);
        setLongField(term151029, term151029.getClass(), "id", -4569299590968645007L);
        setField(term151029, term151029.getClass(), "extId", term151031);
        setField(term151029, term151029.getClass(), "luid", "AkiPuZHqLZ");
        setIntField(term151046, term151046.getClass(), "year", 2013);
        setShortField(term151046, term151046.getClass(), "month", (short) 10);
        setShortField(term151046, term151046.getClass(), "day", (short) 4);
        setField(term151045, term151045.getClass(), "date", term151046);
        setByteField(term151050, term151050.getClass(), "hour", (byte) 13);
        setByteField(term151050, term151050.getClass(), "minute", (byte) 8);
        setByteField(term151050, term151050.getClass(), "second", (byte) 57);
        setIntField(term151050, term151050.getClass(), "nano", 285165765);
        setField(term151045, term151045.getClass(), "time", term151050);
        setField(term151029, term151029.getClass(), "registerTime", term151045);
        setIntField(term151056, term151056.getClass(), "year", 2029);
        setShortField(term151056, term151056.getClass(), "month", (short) 8);
        setShortField(term151056, term151056.getClass(), "day", (short) 12);
        setField(term151055, term151055.getClass(), "date", term151056);
        setByteField(term151060, term151060.getClass(), "hour", (byte) 20);
        setByteField(term151060, term151060.getClass(), "minute", (byte) 27);
        setByteField(term151060, term151060.getClass(), "second", (byte) 47);
        setIntField(term151060, term151060.getClass(), "nano", 668392287);
        setField(term151055, term151055.getClass(), "time", term151060);
        setField(term151029, term151029.getClass(), "accessTime", term151055);
        setField(term151027, term151027.getClass(), "card", term151029);
        setIntField(term151027, term151027.getClass(), "lastDataVersion", -628074725);
        setField(term151027, term151027.getClass(), "userName", "TtnjCbAnFU");
        setIntField(term151027, term151027.getClass(), "point", 598913023);
        setIntField(term151027, term151027.getClass(), "totalPoint", -1434959747);
        setIntField(term151027, term151027.getClass(), "iconId", 1392370461);
        setIntField(term151027, term151027.getClass(), "nameplateId", -856810052);
        setIntField(term151027, term151027.getClass(), "frameId", -1931313347);
        setIntField(term151027, term151027.getClass(), "trophyId", -611743177);
        setIntField(term151027, term151027.getClass(), "playCount", 299118403);
        setIntField(term151027, term151027.getClass(), "playVsCount", -974364512);
        setIntField(term151027, term151027.getClass(), "playSyncCount", 2114819798);
        setIntField(term151027, term151027.getClass(), "winCount", -1034206928);
        setIntField(term151027, term151027.getClass(), "helpCount", 1118086364);
        setIntField(term151027, term151027.getClass(), "comboCount", 1950777813);
        setIntField(term151027, term151027.getClass(), "feverCount", -1406865835);
        setIntField(term151027, term151027.getClass(), "totalHiScore", 183673550);
        setIntField(term151027, term151027.getClass(), "totalEasyHighScore", -27803663);
        setIntField(term151027, term151027.getClass(), "totalBasicHighScore", -610653095);
        setIntField(term151027, term151027.getClass(), "totalAdvancedHighScore", -791727638);
        setIntField(term151027, term151027.getClass(), "totalExpertHighScore", -1193914796);
        setIntField(term151027, term151027.getClass(), "totalMasterHighScore", 1415809233);
        setIntField(term151027, term151027.getClass(), "totalReMasterHighScore", -2130654972);
        setIntField(term151027, term151027.getClass(), "totalHighSync", 16015231);
        setIntField(term151027, term151027.getClass(), "totalEasySync", -1777328540);
        setIntField(term151027, term151027.getClass(), "totalBasicSync", 900843846);
        setIntField(term151027, term151027.getClass(), "totalAdvancedSync", 1724964260);
        setIntField(term151027, term151027.getClass(), "totalExpertSync", -2034392820);
        setIntField(term151027, term151027.getClass(), "totalMasterSync", 11835076);
        setIntField(term151027, term151027.getClass(), "totalReMasterSync", -862461687);
        setIntField(term151027, term151027.getClass(), "playerRating", -1661748631);
        setIntField(term151027, term151027.getClass(), "highestRating", -536348630);
        setIntField(term151027, term151027.getClass(), "rankAuthTailId", -867374492);
        setField(term151027, term151027.getClass(), "eventWatchedDate", "SDOcDCgFQu");
        setField(term151027, term151027.getClass(), "webLimitDate", "EcAlwSDsSg");
        setIntField(term151027, term151027.getClass(), "challengeTrackPhase", -1139610249);
        setIntField(term151027, term151027.getClass(), "firstPlayBits", -350348925);
        setField(term151027, term151027.getClass(), "lastPlayDate", "GTUBaGksNm");
        setIntField(term151027, term151027.getClass(), "lastPlaceId", 2065534694);
        setField(term151027, term151027.getClass(), "lastPlaceName", "ToitdBqCUa");
        setIntField(term151027, term151027.getClass(), "lastRegionId", 1993137567);
        setField(term151027, term151027.getClass(), "lastRegionName", "hQkaYinNHN");
        setField(term151027, term151027.getClass(), "lastClientId", "tinrcZBfby");
        setField(term151027, term151027.getClass(), "lastCountryCode", "fHZvVFVpCX");
        setIntField(term151027, term151027.getClass(), "eventPoint", 611465347);
        setIntField(term151027, term151027.getClass(), "totalLv", -838822647);
        setIntField(term151027, term151027.getClass(), "lastLoginBonusDay", 1953677784);
        setIntField(term151027, term151027.getClass(), "lastSurvivalBonusDay", 1804470465);
        setIntField(term151027, term151027.getClass(), "loginBonusLv", -1346034962);
        setField(term151025, term151025.getClass(), "user", term151027);
        setIntField(term151025, term151025.getClass(), "orderId", -2106648804);
        setLongField(term151025, term151025.getClass(), "sortNumber", -4026624946106334837L);
        setIntField(term151025, term151025.getClass(), "placeId", 1583429491);
        setField(term151025, term151025.getClass(), "placeName", "laRdIPzkwz");
        setField(term151025, term151025.getClass(), "country", "siIcTJzSGr");
        setIntField(term151025, term151025.getClass(), "regionId", 2120105673);
        setField(term151025, term151025.getClass(), "playDate", "IyfKbexwMT");
        setField(term151025, term151025.getClass(), "userPlayDate", "rqqFczqbjO");
        setIntField(term151025, term151025.getClass(), "musicId", -1677656650);
        setIntField(term151025, term151025.getClass(), "level", 1741465676);
        setIntField(term151025, term151025.getClass(), "gameMode", 11311261);
        setIntField(term151025, term151025.getClass(), "rivalNum", 893852783);
        setIntField(term151025, term151025.getClass(), "track", -1087994165);
        setIntField(term151025, term151025.getClass(), "eventId", 2147172410);
        setBooleanField(term151025, term151025.getClass(), "isFreeToPlay", true);
        setIntField(term151025, term151025.getClass(), "playerRating", -700334463);
        setLongField(term151025, term151025.getClass(), "playedUserId1", 3465513040115241688L);
        setField(term151025, term151025.getClass(), "playedUserName1", "fhhYQGiExU");
        setIntField(term151025, term151025.getClass(), "playedMusicLevel1", 764478311);
        setLongField(term151025, term151025.getClass(), "playedUserId2", 5260379851065937225L);
        setField(term151025, term151025.getClass(), "playedUserName2", "poqEkIMUQX");
        setIntField(term151025, term151025.getClass(), "playedMusicLevel2", -772408056);
        setLongField(term151025, term151025.getClass(), "playedUserId3", -358904349595052653L);
        setField(term151025, term151025.getClass(), "playedUserName3", "SLVaFTiZJu");
        setIntField(term151025, term151025.getClass(), "playedMusicLevel3", 82148477);
        setIntField(term151025, term151025.getClass(), "achievement", -983930460);
        setIntField(term151025, term151025.getClass(), "score", -1209793049);
        setIntField(term151025, term151025.getClass(), "tapScore", 322699104);
        setIntField(term151025, term151025.getClass(), "holdScore", -592289335);
        setIntField(term151025, term151025.getClass(), "slideScore", 1581045302);
        setIntField(term151025, term151025.getClass(), "breakScore", 1150125671);
        setIntField(term151025, term151025.getClass(), "syncRate", 800107352);
        setIntField(term151025, term151025.getClass(), "vsWin", 1947306830);
        setBooleanField(term151025, term151025.getClass(), "isAllPerfect", false);
        setIntField(term151025, term151025.getClass(), "fullCombo", -1469070934);
        setIntField(term151025, term151025.getClass(), "maxFever", -65433689);
        setIntField(term151025, term151025.getClass(), "maxCombo", -1677349196);
        setIntField(term151025, term151025.getClass(), "tapPerfect", 605056093);
        setIntField(term151025, term151025.getClass(), "tapGreat", -760171128);
        setIntField(term151025, term151025.getClass(), "tapGood", -975492874);
        setIntField(term151025, term151025.getClass(), "tapBad", 2136424565);
        setIntField(term151025, term151025.getClass(), "holdPerfect", -1664120751);
        setIntField(term151025, term151025.getClass(), "holdGreat", -1333548159);
        setIntField(term151025, term151025.getClass(), "holdGood", 1710172848);
        setIntField(term151025, term151025.getClass(), "holdBad", 1728001282);
        setIntField(term151025, term151025.getClass(), "slidePerfect", -763837268);
        setIntField(term151025, term151025.getClass(), "slideGreat", -569352509);
        setIntField(term151025, term151025.getClass(), "slideGood", 1794725639);
        setIntField(term151025, term151025.getClass(), "slideBad", 822649252);
        setIntField(term151025, term151025.getClass(), "breakPerfect", -62506625);
        setIntField(term151025, term151025.getClass(), "breakGreat", 1232264847);
        setIntField(term151025, term151025.getClass(), "breakGood", -2121024762);
        setIntField(term151025, term151025.getClass(), "breakBad", -1955216585);
        setBooleanField(term151025, term151025.getClass(), "isTrackSkip", false);
        setBooleanField(term151025, term151025.getClass(), "isHighScore", false);
        setBooleanField(term151025, term151025.getClass(), "isChallengeTrack", true);
        setIntField(term151025, term151025.getClass(), "challengeLife", 1484465167);
        setIntField(term151025, term151025.getClass(), "challengeRemain", 887764488);
        setIntField(term151025, term151025.getClass(), "isAllPerfectPlus", -597386285);
        term151337 = new Integer(-1418650594);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term151337;
        callMethod(klass, "setPlayedMusicLevel1", argTypes, term151025, args);
    }

};


