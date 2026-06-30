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

public class UserPlaylog_setSlideGreat_927265617109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term164337;
     Object term164649;

    public UserPlaylog_setSlideGreat_927265617109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term164343 = new Long(-6423955170741487890L);
        term164337 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term164339 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term164341 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term164357 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term164358 = newInstance(Class.forName("java.time.LocalDate"));
        Object term164362 = newInstance(Class.forName("java.time.LocalTime"));
        Object term164367 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term164368 = newInstance(Class.forName("java.time.LocalDate"));
        Object term164372 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term164337, term164337.getClass(), "id", -872902981503394121L);
        setLongField(term164339, term164339.getClass(), "id", 560784718707260252L);
        setLongField(term164341, term164341.getClass(), "id", -3516575907450439911L);
        setField(term164341, term164341.getClass(), "extId", term164343);
        setField(term164341, term164341.getClass(), "luid", "JpqRemAQer");
        setIntField(term164358, term164358.getClass(), "year", 2025);
        setShortField(term164358, term164358.getClass(), "month", (short) 11);
        setShortField(term164358, term164358.getClass(), "day", (short) 28);
        setField(term164357, term164357.getClass(), "date", term164358);
        setByteField(term164362, term164362.getClass(), "hour", (byte) 0);
        setByteField(term164362, term164362.getClass(), "minute", (byte) 44);
        setByteField(term164362, term164362.getClass(), "second", (byte) 24);
        setIntField(term164362, term164362.getClass(), "nano", 379204030);
        setField(term164357, term164357.getClass(), "time", term164362);
        setField(term164341, term164341.getClass(), "registerTime", term164357);
        setIntField(term164368, term164368.getClass(), "year", 2019);
        setShortField(term164368, term164368.getClass(), "month", (short) 11);
        setShortField(term164368, term164368.getClass(), "day", (short) 16);
        setField(term164367, term164367.getClass(), "date", term164368);
        setByteField(term164372, term164372.getClass(), "hour", (byte) 6);
        setByteField(term164372, term164372.getClass(), "minute", (byte) 19);
        setByteField(term164372, term164372.getClass(), "second", (byte) 5);
        setIntField(term164372, term164372.getClass(), "nano", 858000554);
        setField(term164367, term164367.getClass(), "time", term164372);
        setField(term164341, term164341.getClass(), "accessTime", term164367);
        setField(term164339, term164339.getClass(), "card", term164341);
        setIntField(term164339, term164339.getClass(), "lastDataVersion", -1753461605);
        setField(term164339, term164339.getClass(), "userName", "AiWObYbsEu");
        setIntField(term164339, term164339.getClass(), "point", 78401312);
        setIntField(term164339, term164339.getClass(), "totalPoint", -667824083);
        setIntField(term164339, term164339.getClass(), "iconId", -120442765);
        setIntField(term164339, term164339.getClass(), "nameplateId", 877515523);
        setIntField(term164339, term164339.getClass(), "frameId", -92732477);
        setIntField(term164339, term164339.getClass(), "trophyId", -769323328);
        setIntField(term164339, term164339.getClass(), "playCount", 1902835076);
        setIntField(term164339, term164339.getClass(), "playVsCount", -1337313313);
        setIntField(term164339, term164339.getClass(), "playSyncCount", 1756317829);
        setIntField(term164339, term164339.getClass(), "winCount", -875836122);
        setIntField(term164339, term164339.getClass(), "helpCount", -789027443);
        setIntField(term164339, term164339.getClass(), "comboCount", 1611973107);
        setIntField(term164339, term164339.getClass(), "feverCount", 1885369769);
        setIntField(term164339, term164339.getClass(), "totalHiScore", -620413984);
        setIntField(term164339, term164339.getClass(), "totalEasyHighScore", 1864878359);
        setIntField(term164339, term164339.getClass(), "totalBasicHighScore", -1817386093);
        setIntField(term164339, term164339.getClass(), "totalAdvancedHighScore", -1450302738);
        setIntField(term164339, term164339.getClass(), "totalExpertHighScore", -689307214);
        setIntField(term164339, term164339.getClass(), "totalMasterHighScore", 1661166066);
        setIntField(term164339, term164339.getClass(), "totalReMasterHighScore", 1404705877);
        setIntField(term164339, term164339.getClass(), "totalHighSync", 321976631);
        setIntField(term164339, term164339.getClass(), "totalEasySync", 641521266);
        setIntField(term164339, term164339.getClass(), "totalBasicSync", 661573501);
        setIntField(term164339, term164339.getClass(), "totalAdvancedSync", -1824013816);
        setIntField(term164339, term164339.getClass(), "totalExpertSync", -811042195);
        setIntField(term164339, term164339.getClass(), "totalMasterSync", 1724479266);
        setIntField(term164339, term164339.getClass(), "totalReMasterSync", -2008091868);
        setIntField(term164339, term164339.getClass(), "playerRating", 583001317);
        setIntField(term164339, term164339.getClass(), "highestRating", 2055529380);
        setIntField(term164339, term164339.getClass(), "rankAuthTailId", 112609089);
        setField(term164339, term164339.getClass(), "eventWatchedDate", "ZgWEffEuOS");
        setField(term164339, term164339.getClass(), "webLimitDate", "ytfTCVidbO");
        setIntField(term164339, term164339.getClass(), "challengeTrackPhase", -760407767);
        setIntField(term164339, term164339.getClass(), "firstPlayBits", 1379123972);
        setField(term164339, term164339.getClass(), "lastPlayDate", "ZNBXGdVsZF");
        setIntField(term164339, term164339.getClass(), "lastPlaceId", 1611304316);
        setField(term164339, term164339.getClass(), "lastPlaceName", "grGHJeQdYI");
        setIntField(term164339, term164339.getClass(), "lastRegionId", -2076298403);
        setField(term164339, term164339.getClass(), "lastRegionName", "jtnUMbjYGn");
        setField(term164339, term164339.getClass(), "lastClientId", "SoDnZfByBc");
        setField(term164339, term164339.getClass(), "lastCountryCode", "IzEVeLWAzF");
        setIntField(term164339, term164339.getClass(), "eventPoint", 819816871);
        setIntField(term164339, term164339.getClass(), "totalLv", 1593016081);
        setIntField(term164339, term164339.getClass(), "lastLoginBonusDay", -85954871);
        setIntField(term164339, term164339.getClass(), "lastSurvivalBonusDay", 1636673773);
        setIntField(term164339, term164339.getClass(), "loginBonusLv", 1437394388);
        setField(term164337, term164337.getClass(), "user", term164339);
        setIntField(term164337, term164337.getClass(), "orderId", 442371647);
        setLongField(term164337, term164337.getClass(), "sortNumber", -888272683506995872L);
        setIntField(term164337, term164337.getClass(), "placeId", -1085168266);
        setField(term164337, term164337.getClass(), "placeName", "eLHzvuaXzN");
        setField(term164337, term164337.getClass(), "country", "uRfUkNdrxy");
        setIntField(term164337, term164337.getClass(), "regionId", 2060891997);
        setField(term164337, term164337.getClass(), "playDate", "zjPpxnBoXA");
        setField(term164337, term164337.getClass(), "userPlayDate", "DmZnQgsFaG");
        setIntField(term164337, term164337.getClass(), "musicId", 253457798);
        setIntField(term164337, term164337.getClass(), "level", 2028835195);
        setIntField(term164337, term164337.getClass(), "gameMode", 1873029542);
        setIntField(term164337, term164337.getClass(), "rivalNum", 828223081);
        setIntField(term164337, term164337.getClass(), "track", -1100297992);
        setIntField(term164337, term164337.getClass(), "eventId", 672370149);
        setBooleanField(term164337, term164337.getClass(), "isFreeToPlay", false);
        setIntField(term164337, term164337.getClass(), "playerRating", 1753550619);
        setLongField(term164337, term164337.getClass(), "playedUserId1", -4435966730765688655L);
        setField(term164337, term164337.getClass(), "playedUserName1", "FtsrtvMwwt");
        setIntField(term164337, term164337.getClass(), "playedMusicLevel1", 947965357);
        setLongField(term164337, term164337.getClass(), "playedUserId2", -6124911442117089800L);
        setField(term164337, term164337.getClass(), "playedUserName2", "CnzmKRmFKz");
        setIntField(term164337, term164337.getClass(), "playedMusicLevel2", -1064103219);
        setLongField(term164337, term164337.getClass(), "playedUserId3", 6546757320645808936L);
        setField(term164337, term164337.getClass(), "playedUserName3", "mwselRsbwp");
        setIntField(term164337, term164337.getClass(), "playedMusicLevel3", -625231749);
        setIntField(term164337, term164337.getClass(), "achievement", -1716717349);
        setIntField(term164337, term164337.getClass(), "score", 114481533);
        setIntField(term164337, term164337.getClass(), "tapScore", -2084905388);
        setIntField(term164337, term164337.getClass(), "holdScore", -1769780969);
        setIntField(term164337, term164337.getClass(), "slideScore", 736469776);
        setIntField(term164337, term164337.getClass(), "breakScore", 1451862258);
        setIntField(term164337, term164337.getClass(), "syncRate", -597719540);
        setIntField(term164337, term164337.getClass(), "vsWin", 169740443);
        setBooleanField(term164337, term164337.getClass(), "isAllPerfect", false);
        setIntField(term164337, term164337.getClass(), "fullCombo", 1153673007);
        setIntField(term164337, term164337.getClass(), "maxFever", 1795096900);
        setIntField(term164337, term164337.getClass(), "maxCombo", 1806700139);
        setIntField(term164337, term164337.getClass(), "tapPerfect", 1732349546);
        setIntField(term164337, term164337.getClass(), "tapGreat", 1744166493);
        setIntField(term164337, term164337.getClass(), "tapGood", 1041453663);
        setIntField(term164337, term164337.getClass(), "tapBad", -663459621);
        setIntField(term164337, term164337.getClass(), "holdPerfect", -1560125159);
        setIntField(term164337, term164337.getClass(), "holdGreat", -935459315);
        setIntField(term164337, term164337.getClass(), "holdGood", 1562847407);
        setIntField(term164337, term164337.getClass(), "holdBad", -923311356);
        setIntField(term164337, term164337.getClass(), "slidePerfect", -1776947610);
        setIntField(term164337, term164337.getClass(), "slideGreat", 1966901997);
        setIntField(term164337, term164337.getClass(), "slideGood", 1129932863);
        setIntField(term164337, term164337.getClass(), "slideBad", 118081104);
        setIntField(term164337, term164337.getClass(), "breakPerfect", -1507357080);
        setIntField(term164337, term164337.getClass(), "breakGreat", -512516606);
        setIntField(term164337, term164337.getClass(), "breakGood", -486169343);
        setIntField(term164337, term164337.getClass(), "breakBad", -744920149);
        setBooleanField(term164337, term164337.getClass(), "isTrackSkip", false);
        setBooleanField(term164337, term164337.getClass(), "isHighScore", false);
        setBooleanField(term164337, term164337.getClass(), "isChallengeTrack", false);
        setIntField(term164337, term164337.getClass(), "challengeLife", 1235093000);
        setIntField(term164337, term164337.getClass(), "challengeRemain", 1266939921);
        setIntField(term164337, term164337.getClass(), "isAllPerfectPlus", -463524753);
        term164649 = new Integer(96421770);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term164649;
        callMethod(klass, "setSlideGreat", argTypes, term164337, args);
    }

};


