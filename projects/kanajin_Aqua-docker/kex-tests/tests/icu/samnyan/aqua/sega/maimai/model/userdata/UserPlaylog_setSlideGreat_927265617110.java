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

public class UserPlaylog_setSlideGreat_927265617110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term164393;
     Object term164705;

    public UserPlaylog_setSlideGreat_927265617110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term164399 = new Long(-6423955170741487890L);
        term164393 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term164395 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term164397 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term164413 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term164414 = newInstance(Class.forName("java.time.LocalDate"));
        Object term164418 = newInstance(Class.forName("java.time.LocalTime"));
        Object term164423 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term164424 = newInstance(Class.forName("java.time.LocalDate"));
        Object term164428 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term164393, term164393.getClass(), "id", -872902981503394121L);
        setLongField(term164395, term164395.getClass(), "id", 560784718707260252L);
        setLongField(term164397, term164397.getClass(), "id", -3516575907450439911L);
        setField(term164397, term164397.getClass(), "extId", term164399);
        setField(term164397, term164397.getClass(), "luid", "JpqRemAQer");
        setIntField(term164414, term164414.getClass(), "year", 2025);
        setShortField(term164414, term164414.getClass(), "month", (short) 11);
        setShortField(term164414, term164414.getClass(), "day", (short) 28);
        setField(term164413, term164413.getClass(), "date", term164414);
        setByteField(term164418, term164418.getClass(), "hour", (byte) 0);
        setByteField(term164418, term164418.getClass(), "minute", (byte) 44);
        setByteField(term164418, term164418.getClass(), "second", (byte) 24);
        setIntField(term164418, term164418.getClass(), "nano", 379204030);
        setField(term164413, term164413.getClass(), "time", term164418);
        setField(term164397, term164397.getClass(), "registerTime", term164413);
        setIntField(term164424, term164424.getClass(), "year", 2019);
        setShortField(term164424, term164424.getClass(), "month", (short) 11);
        setShortField(term164424, term164424.getClass(), "day", (short) 16);
        setField(term164423, term164423.getClass(), "date", term164424);
        setByteField(term164428, term164428.getClass(), "hour", (byte) 6);
        setByteField(term164428, term164428.getClass(), "minute", (byte) 19);
        setByteField(term164428, term164428.getClass(), "second", (byte) 5);
        setIntField(term164428, term164428.getClass(), "nano", 858000554);
        setField(term164423, term164423.getClass(), "time", term164428);
        setField(term164397, term164397.getClass(), "accessTime", term164423);
        setField(term164395, term164395.getClass(), "card", term164397);
        setIntField(term164395, term164395.getClass(), "lastDataVersion", -1753461605);
        setField(term164395, term164395.getClass(), "userName", "AiWObYbsEu");
        setIntField(term164395, term164395.getClass(), "point", 78401312);
        setIntField(term164395, term164395.getClass(), "totalPoint", -667824083);
        setIntField(term164395, term164395.getClass(), "iconId", -120442765);
        setIntField(term164395, term164395.getClass(), "nameplateId", 877515523);
        setIntField(term164395, term164395.getClass(), "frameId", -92732477);
        setIntField(term164395, term164395.getClass(), "trophyId", -769323328);
        setIntField(term164395, term164395.getClass(), "playCount", 1902835076);
        setIntField(term164395, term164395.getClass(), "playVsCount", -1337313313);
        setIntField(term164395, term164395.getClass(), "playSyncCount", 1756317829);
        setIntField(term164395, term164395.getClass(), "winCount", -875836122);
        setIntField(term164395, term164395.getClass(), "helpCount", -789027443);
        setIntField(term164395, term164395.getClass(), "comboCount", 1611973107);
        setIntField(term164395, term164395.getClass(), "feverCount", 1885369769);
        setIntField(term164395, term164395.getClass(), "totalHiScore", -620413984);
        setIntField(term164395, term164395.getClass(), "totalEasyHighScore", 1864878359);
        setIntField(term164395, term164395.getClass(), "totalBasicHighScore", -1817386093);
        setIntField(term164395, term164395.getClass(), "totalAdvancedHighScore", -1450302738);
        setIntField(term164395, term164395.getClass(), "totalExpertHighScore", -689307214);
        setIntField(term164395, term164395.getClass(), "totalMasterHighScore", 1661166066);
        setIntField(term164395, term164395.getClass(), "totalReMasterHighScore", 1404705877);
        setIntField(term164395, term164395.getClass(), "totalHighSync", 321976631);
        setIntField(term164395, term164395.getClass(), "totalEasySync", 641521266);
        setIntField(term164395, term164395.getClass(), "totalBasicSync", 661573501);
        setIntField(term164395, term164395.getClass(), "totalAdvancedSync", -1824013816);
        setIntField(term164395, term164395.getClass(), "totalExpertSync", -811042195);
        setIntField(term164395, term164395.getClass(), "totalMasterSync", 1724479266);
        setIntField(term164395, term164395.getClass(), "totalReMasterSync", -2008091868);
        setIntField(term164395, term164395.getClass(), "playerRating", 583001317);
        setIntField(term164395, term164395.getClass(), "highestRating", 2055529380);
        setIntField(term164395, term164395.getClass(), "rankAuthTailId", 112609089);
        setField(term164395, term164395.getClass(), "eventWatchedDate", "ZgWEffEuOS");
        setField(term164395, term164395.getClass(), "webLimitDate", "ytfTCVidbO");
        setIntField(term164395, term164395.getClass(), "challengeTrackPhase", -760407767);
        setIntField(term164395, term164395.getClass(), "firstPlayBits", 1379123972);
        setField(term164395, term164395.getClass(), "lastPlayDate", "ZNBXGdVsZF");
        setIntField(term164395, term164395.getClass(), "lastPlaceId", 1611304316);
        setField(term164395, term164395.getClass(), "lastPlaceName", "grGHJeQdYI");
        setIntField(term164395, term164395.getClass(), "lastRegionId", -2076298403);
        setField(term164395, term164395.getClass(), "lastRegionName", "jtnUMbjYGn");
        setField(term164395, term164395.getClass(), "lastClientId", "SoDnZfByBc");
        setField(term164395, term164395.getClass(), "lastCountryCode", "IzEVeLWAzF");
        setIntField(term164395, term164395.getClass(), "eventPoint", 819816871);
        setIntField(term164395, term164395.getClass(), "totalLv", 1593016081);
        setIntField(term164395, term164395.getClass(), "lastLoginBonusDay", -85954871);
        setIntField(term164395, term164395.getClass(), "lastSurvivalBonusDay", 1636673773);
        setIntField(term164395, term164395.getClass(), "loginBonusLv", 1437394388);
        setField(term164393, term164393.getClass(), "user", term164395);
        setIntField(term164393, term164393.getClass(), "orderId", 442371647);
        setLongField(term164393, term164393.getClass(), "sortNumber", -888272683506995872L);
        setIntField(term164393, term164393.getClass(), "placeId", -1085168266);
        setField(term164393, term164393.getClass(), "placeName", "eLHzvuaXzN");
        setField(term164393, term164393.getClass(), "country", "uRfUkNdrxy");
        setIntField(term164393, term164393.getClass(), "regionId", 2060891997);
        setField(term164393, term164393.getClass(), "playDate", "zjPpxnBoXA");
        setField(term164393, term164393.getClass(), "userPlayDate", "DmZnQgsFaG");
        setIntField(term164393, term164393.getClass(), "musicId", 253457798);
        setIntField(term164393, term164393.getClass(), "level", 2028835195);
        setIntField(term164393, term164393.getClass(), "gameMode", 1873029542);
        setIntField(term164393, term164393.getClass(), "rivalNum", 828223081);
        setIntField(term164393, term164393.getClass(), "track", -1100297992);
        setIntField(term164393, term164393.getClass(), "eventId", 672370149);
        setBooleanField(term164393, term164393.getClass(), "isFreeToPlay", false);
        setIntField(term164393, term164393.getClass(), "playerRating", 1753550619);
        setLongField(term164393, term164393.getClass(), "playedUserId1", -4435966730765688655L);
        setField(term164393, term164393.getClass(), "playedUserName1", "FtsrtvMwwt");
        setIntField(term164393, term164393.getClass(), "playedMusicLevel1", 947965357);
        setLongField(term164393, term164393.getClass(), "playedUserId2", -6124911442117089800L);
        setField(term164393, term164393.getClass(), "playedUserName2", "CnzmKRmFKz");
        setIntField(term164393, term164393.getClass(), "playedMusicLevel2", -1064103219);
        setLongField(term164393, term164393.getClass(), "playedUserId3", 6546757320645808936L);
        setField(term164393, term164393.getClass(), "playedUserName3", "mwselRsbwp");
        setIntField(term164393, term164393.getClass(), "playedMusicLevel3", -625231749);
        setIntField(term164393, term164393.getClass(), "achievement", -1716717349);
        setIntField(term164393, term164393.getClass(), "score", 114481533);
        setIntField(term164393, term164393.getClass(), "tapScore", -2084905388);
        setIntField(term164393, term164393.getClass(), "holdScore", -1769780969);
        setIntField(term164393, term164393.getClass(), "slideScore", 736469776);
        setIntField(term164393, term164393.getClass(), "breakScore", 1451862258);
        setIntField(term164393, term164393.getClass(), "syncRate", -597719540);
        setIntField(term164393, term164393.getClass(), "vsWin", 169740443);
        setBooleanField(term164393, term164393.getClass(), "isAllPerfect", false);
        setIntField(term164393, term164393.getClass(), "fullCombo", 1153673007);
        setIntField(term164393, term164393.getClass(), "maxFever", 1795096900);
        setIntField(term164393, term164393.getClass(), "maxCombo", 1806700139);
        setIntField(term164393, term164393.getClass(), "tapPerfect", 1732349546);
        setIntField(term164393, term164393.getClass(), "tapGreat", 1744166493);
        setIntField(term164393, term164393.getClass(), "tapGood", 1041453663);
        setIntField(term164393, term164393.getClass(), "tapBad", -663459621);
        setIntField(term164393, term164393.getClass(), "holdPerfect", -1560125159);
        setIntField(term164393, term164393.getClass(), "holdGreat", -935459315);
        setIntField(term164393, term164393.getClass(), "holdGood", 1562847407);
        setIntField(term164393, term164393.getClass(), "holdBad", -923311356);
        setIntField(term164393, term164393.getClass(), "slidePerfect", -1776947610);
        setIntField(term164393, term164393.getClass(), "slideGreat", 1966901997);
        setIntField(term164393, term164393.getClass(), "slideGood", 1129932863);
        setIntField(term164393, term164393.getClass(), "slideBad", 118081104);
        setIntField(term164393, term164393.getClass(), "breakPerfect", -1507357080);
        setIntField(term164393, term164393.getClass(), "breakGreat", -512516606);
        setIntField(term164393, term164393.getClass(), "breakGood", -486169343);
        setIntField(term164393, term164393.getClass(), "breakBad", -744920149);
        setBooleanField(term164393, term164393.getClass(), "isTrackSkip", false);
        setBooleanField(term164393, term164393.getClass(), "isHighScore", false);
        setBooleanField(term164393, term164393.getClass(), "isChallengeTrack", false);
        setIntField(term164393, term164393.getClass(), "challengeLife", 1235093000);
        setIntField(term164393, term164393.getClass(), "challengeRemain", 1266939921);
        setIntField(term164393, term164393.getClass(), "isAllPerfectPlus", -463524753);
        term164705 = new Integer(96421770);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term164705;
        callMethod(klass, "setSlideGreat", argTypes, term164393, args);
    }

};


