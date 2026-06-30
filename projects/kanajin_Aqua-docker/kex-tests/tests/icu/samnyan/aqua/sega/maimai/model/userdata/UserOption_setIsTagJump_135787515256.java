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

public class UserOption_setIsTagJump_135787515256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68261;
     Object term68479;

    public UserOption_setIsTagJump_135787515256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term68267 = new Long(-2955854401507097864L);
        term68261 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term68263 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term68265 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term68281 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term68282 = newInstance(Class.forName("java.time.LocalDate"));
        Object term68286 = newInstance(Class.forName("java.time.LocalTime"));
        Object term68291 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term68292 = newInstance(Class.forName("java.time.LocalDate"));
        Object term68296 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term68261, term68261.getClass(), "id", 5498944509671266637L);
        setLongField(term68263, term68263.getClass(), "id", -6838909359433858599L);
        setLongField(term68265, term68265.getClass(), "id", 4947643967691976731L);
        setField(term68265, term68265.getClass(), "extId", term68267);
        setField(term68265, term68265.getClass(), "luid", "xHLlctEoGh");
        setIntField(term68282, term68282.getClass(), "year", 2021);
        setShortField(term68282, term68282.getClass(), "month", (short) 5);
        setShortField(term68282, term68282.getClass(), "day", (short) 7);
        setField(term68281, term68281.getClass(), "date", term68282);
        setByteField(term68286, term68286.getClass(), "hour", (byte) 16);
        setByteField(term68286, term68286.getClass(), "minute", (byte) 55);
        setByteField(term68286, term68286.getClass(), "second", (byte) 11);
        setIntField(term68286, term68286.getClass(), "nano", 243196047);
        setField(term68281, term68281.getClass(), "time", term68286);
        setField(term68265, term68265.getClass(), "registerTime", term68281);
        setIntField(term68292, term68292.getClass(), "year", 2023);
        setShortField(term68292, term68292.getClass(), "month", (short) 8);
        setShortField(term68292, term68292.getClass(), "day", (short) 23);
        setField(term68291, term68291.getClass(), "date", term68292);
        setByteField(term68296, term68296.getClass(), "hour", (byte) 12);
        setByteField(term68296, term68296.getClass(), "minute", (byte) 18);
        setByteField(term68296, term68296.getClass(), "second", (byte) 57);
        setIntField(term68296, term68296.getClass(), "nano", 764903264);
        setField(term68291, term68291.getClass(), "time", term68296);
        setField(term68265, term68265.getClass(), "accessTime", term68291);
        setField(term68263, term68263.getClass(), "card", term68265);
        setIntField(term68263, term68263.getClass(), "lastDataVersion", 60632310);
        setField(term68263, term68263.getClass(), "userName", "aqgUzcnqpE");
        setIntField(term68263, term68263.getClass(), "point", -630247452);
        setIntField(term68263, term68263.getClass(), "totalPoint", 1613548595);
        setIntField(term68263, term68263.getClass(), "iconId", -277642697);
        setIntField(term68263, term68263.getClass(), "nameplateId", 1749853603);
        setIntField(term68263, term68263.getClass(), "frameId", 318642073);
        setIntField(term68263, term68263.getClass(), "trophyId", 402336735);
        setIntField(term68263, term68263.getClass(), "playCount", 1534581521);
        setIntField(term68263, term68263.getClass(), "playVsCount", 683825505);
        setIntField(term68263, term68263.getClass(), "playSyncCount", -874006328);
        setIntField(term68263, term68263.getClass(), "winCount", 331812569);
        setIntField(term68263, term68263.getClass(), "helpCount", -694038544);
        setIntField(term68263, term68263.getClass(), "comboCount", -371046864);
        setIntField(term68263, term68263.getClass(), "feverCount", 1895958176);
        setIntField(term68263, term68263.getClass(), "totalHiScore", -344909600);
        setIntField(term68263, term68263.getClass(), "totalEasyHighScore", 377838898);
        setIntField(term68263, term68263.getClass(), "totalBasicHighScore", 415407227);
        setIntField(term68263, term68263.getClass(), "totalAdvancedHighScore", 1612361187);
        setIntField(term68263, term68263.getClass(), "totalExpertHighScore", 1325455005);
        setIntField(term68263, term68263.getClass(), "totalMasterHighScore", -1370913089);
        setIntField(term68263, term68263.getClass(), "totalReMasterHighScore", -891285090);
        setIntField(term68263, term68263.getClass(), "totalHighSync", -351219934);
        setIntField(term68263, term68263.getClass(), "totalEasySync", -925647425);
        setIntField(term68263, term68263.getClass(), "totalBasicSync", 1341898586);
        setIntField(term68263, term68263.getClass(), "totalAdvancedSync", -1763289432);
        setIntField(term68263, term68263.getClass(), "totalExpertSync", 882092074);
        setIntField(term68263, term68263.getClass(), "totalMasterSync", -705066137);
        setIntField(term68263, term68263.getClass(), "totalReMasterSync", -454954694);
        setIntField(term68263, term68263.getClass(), "playerRating", -473778335);
        setIntField(term68263, term68263.getClass(), "highestRating", -1516379970);
        setIntField(term68263, term68263.getClass(), "rankAuthTailId", -2138200889);
        setField(term68263, term68263.getClass(), "eventWatchedDate", "yZDlWLIKEp");
        setField(term68263, term68263.getClass(), "webLimitDate", "dAEiXUxDrI");
        setIntField(term68263, term68263.getClass(), "challengeTrackPhase", -510919719);
        setIntField(term68263, term68263.getClass(), "firstPlayBits", 1116939662);
        setField(term68263, term68263.getClass(), "lastPlayDate", "AgQWngzXPH");
        setIntField(term68263, term68263.getClass(), "lastPlaceId", 1460432517);
        setField(term68263, term68263.getClass(), "lastPlaceName", "EZJmAIzdHM");
        setIntField(term68263, term68263.getClass(), "lastRegionId", -1565303291);
        setField(term68263, term68263.getClass(), "lastRegionName", "LAOkeXXkDr");
        setField(term68263, term68263.getClass(), "lastClientId", "YkZqFgrgVM");
        setField(term68263, term68263.getClass(), "lastCountryCode", "QEJBgSNviH");
        setIntField(term68263, term68263.getClass(), "eventPoint", -2061583605);
        setIntField(term68263, term68263.getClass(), "totalLv", -1469827981);
        setIntField(term68263, term68263.getClass(), "lastLoginBonusDay", -1389673403);
        setIntField(term68263, term68263.getClass(), "lastSurvivalBonusDay", 584403812);
        setIntField(term68263, term68263.getClass(), "loginBonusLv", 1751116625);
        setField(term68261, term68261.getClass(), "user", term68263);
        setIntField(term68261, term68261.getClass(), "soudEffect", 1523894424);
        setIntField(term68261, term68261.getClass(), "mirrorMode", 704725073);
        setIntField(term68261, term68261.getClass(), "guideSpeed", 556138661);
        setIntField(term68261, term68261.getClass(), "bgInfo", -1314160786);
        setIntField(term68261, term68261.getClass(), "brightness", -1226932272);
        setIntField(term68261, term68261.getClass(), "isStarRot", 2043153984);
        setIntField(term68261, term68261.getClass(), "breakSe", 627237547);
        setIntField(term68261, term68261.getClass(), "slideSe", 342899515);
        setIntField(term68261, term68261.getClass(), "hardJudge", 2137920886);
        setIntField(term68261, term68261.getClass(), "isTagJump", 982773727);
        setIntField(term68261, term68261.getClass(), "breakSeVol", -1195380899);
        setIntField(term68261, term68261.getClass(), "slideSeVol", 777693111);
        setIntField(term68261, term68261.getClass(), "isUpperDisp", 2053588730);
        setIntField(term68261, term68261.getClass(), "trackSkip", 2012914024);
        setIntField(term68261, term68261.getClass(), "optionMode", 1961729999);
        setIntField(term68261, term68261.getClass(), "simpleOptionParam", -416107422);
        setIntField(term68261, term68261.getClass(), "adjustTiming", -228328293);
        setIntField(term68261, term68261.getClass(), "dispTiming", 885509363);
        setIntField(term68261, term68261.getClass(), "timingPos", -862435164);
        setIntField(term68261, term68261.getClass(), "ansVol", -740189750);
        setIntField(term68261, term68261.getClass(), "noteVol", 1647753845);
        setIntField(term68261, term68261.getClass(), "dmgVol", 1254146348);
        setIntField(term68261, term68261.getClass(), "appealFlame", -1378706259);
        setIntField(term68261, term68261.getClass(), "isFeverDisp", -1235562139);
        setIntField(term68261, term68261.getClass(), "dispJudge", -1993040450);
        setIntField(term68261, term68261.getClass(), "judgePos", -94347451);
        setIntField(term68261, term68261.getClass(), "ratingGuard", -2116864554);
        setIntField(term68261, term68261.getClass(), "selectChara", -1803798879);
        setIntField(term68261, term68261.getClass(), "sortType", 1556834892);
        setIntField(term68261, term68261.getClass(), "filterGenre", -2054196178);
        setIntField(term68261, term68261.getClass(), "filterLevel", 25643073);
        setIntField(term68261, term68261.getClass(), "filterRank", 1688642873);
        setIntField(term68261, term68261.getClass(), "filterVersion", 1898736730);
        setIntField(term68261, term68261.getClass(), "filterRec", 1609363715);
        setIntField(term68261, term68261.getClass(), "filterFullCombo", 1241179059);
        setIntField(term68261, term68261.getClass(), "filterAllPerfect", 1762765002);
        setIntField(term68261, term68261.getClass(), "filterDifficulty", 1075655306);
        setIntField(term68261, term68261.getClass(), "filterFullSync", -797133114);
        setIntField(term68261, term68261.getClass(), "filterReMaster", -1598462161);
        setIntField(term68261, term68261.getClass(), "filterMaxFever", 1207046565);
        setIntField(term68261, term68261.getClass(), "finalSelectId", 646669357);
        setIntField(term68261, term68261.getClass(), "finalSelectCategory", 986376526);
        term68479 = new Integer(1699678944);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term68479;
        callMethod(klass, "setIsTagJump", argTypes, term68261, args);
    }

};


