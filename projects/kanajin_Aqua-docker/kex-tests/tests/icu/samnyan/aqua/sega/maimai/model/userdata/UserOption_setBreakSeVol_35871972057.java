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

public class UserOption_setBreakSeVol_35871972057 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68571;
     Object term68789;

    public UserOption_setBreakSeVol_35871972057() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term68577 = new Long(329213208496958131L);
        term68571 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term68573 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term68575 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term68591 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term68592 = newInstance(Class.forName("java.time.LocalDate"));
        Object term68596 = newInstance(Class.forName("java.time.LocalTime"));
        Object term68601 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term68602 = newInstance(Class.forName("java.time.LocalDate"));
        Object term68606 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term68571, term68571.getClass(), "id", 4548576710115075073L);
        setLongField(term68573, term68573.getClass(), "id", -1486519351300660432L);
        setLongField(term68575, term68575.getClass(), "id", 4777103307547199454L);
        setField(term68575, term68575.getClass(), "extId", term68577);
        setField(term68575, term68575.getClass(), "luid", "bjigisSVNp");
        setIntField(term68592, term68592.getClass(), "year", 2026);
        setShortField(term68592, term68592.getClass(), "month", (short) 4);
        setShortField(term68592, term68592.getClass(), "day", (short) 10);
        setField(term68591, term68591.getClass(), "date", term68592);
        setByteField(term68596, term68596.getClass(), "hour", (byte) 3);
        setByteField(term68596, term68596.getClass(), "minute", (byte) 39);
        setByteField(term68596, term68596.getClass(), "second", (byte) 42);
        setIntField(term68596, term68596.getClass(), "nano", 840728841);
        setField(term68591, term68591.getClass(), "time", term68596);
        setField(term68575, term68575.getClass(), "registerTime", term68591);
        setIntField(term68602, term68602.getClass(), "year", 2029);
        setShortField(term68602, term68602.getClass(), "month", (short) 3);
        setShortField(term68602, term68602.getClass(), "day", (short) 7);
        setField(term68601, term68601.getClass(), "date", term68602);
        setByteField(term68606, term68606.getClass(), "hour", (byte) 11);
        setByteField(term68606, term68606.getClass(), "minute", (byte) 6);
        setByteField(term68606, term68606.getClass(), "second", (byte) 29);
        setIntField(term68606, term68606.getClass(), "nano", 899404417);
        setField(term68601, term68601.getClass(), "time", term68606);
        setField(term68575, term68575.getClass(), "accessTime", term68601);
        setField(term68573, term68573.getClass(), "card", term68575);
        setIntField(term68573, term68573.getClass(), "lastDataVersion", 397705958);
        setField(term68573, term68573.getClass(), "userName", "yJCCaWqQuK");
        setIntField(term68573, term68573.getClass(), "point", -2020526142);
        setIntField(term68573, term68573.getClass(), "totalPoint", -1006830210);
        setIntField(term68573, term68573.getClass(), "iconId", -599874501);
        setIntField(term68573, term68573.getClass(), "nameplateId", -1593160251);
        setIntField(term68573, term68573.getClass(), "frameId", -2106831428);
        setIntField(term68573, term68573.getClass(), "trophyId", 975763128);
        setIntField(term68573, term68573.getClass(), "playCount", 1330448484);
        setIntField(term68573, term68573.getClass(), "playVsCount", 1167601196);
        setIntField(term68573, term68573.getClass(), "playSyncCount", 1489040264);
        setIntField(term68573, term68573.getClass(), "winCount", 1289652116);
        setIntField(term68573, term68573.getClass(), "helpCount", -1858752303);
        setIntField(term68573, term68573.getClass(), "comboCount", 1593556104);
        setIntField(term68573, term68573.getClass(), "feverCount", -1885334834);
        setIntField(term68573, term68573.getClass(), "totalHiScore", 2085947852);
        setIntField(term68573, term68573.getClass(), "totalEasyHighScore", 1307739693);
        setIntField(term68573, term68573.getClass(), "totalBasicHighScore", -1344952093);
        setIntField(term68573, term68573.getClass(), "totalAdvancedHighScore", 275140854);
        setIntField(term68573, term68573.getClass(), "totalExpertHighScore", 342655355);
        setIntField(term68573, term68573.getClass(), "totalMasterHighScore", -553978498);
        setIntField(term68573, term68573.getClass(), "totalReMasterHighScore", 617878322);
        setIntField(term68573, term68573.getClass(), "totalHighSync", -353426707);
        setIntField(term68573, term68573.getClass(), "totalEasySync", -253812858);
        setIntField(term68573, term68573.getClass(), "totalBasicSync", 712815497);
        setIntField(term68573, term68573.getClass(), "totalAdvancedSync", -1214671637);
        setIntField(term68573, term68573.getClass(), "totalExpertSync", -1325475544);
        setIntField(term68573, term68573.getClass(), "totalMasterSync", 1004795738);
        setIntField(term68573, term68573.getClass(), "totalReMasterSync", -1747791244);
        setIntField(term68573, term68573.getClass(), "playerRating", -1374498853);
        setIntField(term68573, term68573.getClass(), "highestRating", -814553112);
        setIntField(term68573, term68573.getClass(), "rankAuthTailId", 1599790039);
        setField(term68573, term68573.getClass(), "eventWatchedDate", "tgBNqkdndl");
        setField(term68573, term68573.getClass(), "webLimitDate", "GXKhRJLVFZ");
        setIntField(term68573, term68573.getClass(), "challengeTrackPhase", 1889930669);
        setIntField(term68573, term68573.getClass(), "firstPlayBits", -1483368907);
        setField(term68573, term68573.getClass(), "lastPlayDate", "qDflhZTJjR");
        setIntField(term68573, term68573.getClass(), "lastPlaceId", 1828188096);
        setField(term68573, term68573.getClass(), "lastPlaceName", "bzQSjpIauE");
        setIntField(term68573, term68573.getClass(), "lastRegionId", -1247504501);
        setField(term68573, term68573.getClass(), "lastRegionName", "ESQqarFUtp");
        setField(term68573, term68573.getClass(), "lastClientId", "TiCRQbKtcf");
        setField(term68573, term68573.getClass(), "lastCountryCode", "shGEZulpDG");
        setIntField(term68573, term68573.getClass(), "eventPoint", 1466658826);
        setIntField(term68573, term68573.getClass(), "totalLv", 994181101);
        setIntField(term68573, term68573.getClass(), "lastLoginBonusDay", -1812379052);
        setIntField(term68573, term68573.getClass(), "lastSurvivalBonusDay", 1506407459);
        setIntField(term68573, term68573.getClass(), "loginBonusLv", 1873066034);
        setField(term68571, term68571.getClass(), "user", term68573);
        setIntField(term68571, term68571.getClass(), "soudEffect", 969867590);
        setIntField(term68571, term68571.getClass(), "mirrorMode", 779493218);
        setIntField(term68571, term68571.getClass(), "guideSpeed", -1446558435);
        setIntField(term68571, term68571.getClass(), "bgInfo", -1399316678);
        setIntField(term68571, term68571.getClass(), "brightness", -1519298903);
        setIntField(term68571, term68571.getClass(), "isStarRot", 1252279814);
        setIntField(term68571, term68571.getClass(), "breakSe", 2029611458);
        setIntField(term68571, term68571.getClass(), "slideSe", -1637128814);
        setIntField(term68571, term68571.getClass(), "hardJudge", -299574855);
        setIntField(term68571, term68571.getClass(), "isTagJump", 1862891065);
        setIntField(term68571, term68571.getClass(), "breakSeVol", -1627096493);
        setIntField(term68571, term68571.getClass(), "slideSeVol", 1307068962);
        setIntField(term68571, term68571.getClass(), "isUpperDisp", 344822691);
        setIntField(term68571, term68571.getClass(), "trackSkip", 1748471450);
        setIntField(term68571, term68571.getClass(), "optionMode", 6001794);
        setIntField(term68571, term68571.getClass(), "simpleOptionParam", -219230289);
        setIntField(term68571, term68571.getClass(), "adjustTiming", -1289281350);
        setIntField(term68571, term68571.getClass(), "dispTiming", -371133839);
        setIntField(term68571, term68571.getClass(), "timingPos", -1810597085);
        setIntField(term68571, term68571.getClass(), "ansVol", -486804348);
        setIntField(term68571, term68571.getClass(), "noteVol", 432945474);
        setIntField(term68571, term68571.getClass(), "dmgVol", -725203984);
        setIntField(term68571, term68571.getClass(), "appealFlame", 1848180003);
        setIntField(term68571, term68571.getClass(), "isFeverDisp", 846315597);
        setIntField(term68571, term68571.getClass(), "dispJudge", 1008300939);
        setIntField(term68571, term68571.getClass(), "judgePos", -1286668613);
        setIntField(term68571, term68571.getClass(), "ratingGuard", -789358664);
        setIntField(term68571, term68571.getClass(), "selectChara", -2034774971);
        setIntField(term68571, term68571.getClass(), "sortType", 481530689);
        setIntField(term68571, term68571.getClass(), "filterGenre", -1951222103);
        setIntField(term68571, term68571.getClass(), "filterLevel", -1949169702);
        setIntField(term68571, term68571.getClass(), "filterRank", 1058646419);
        setIntField(term68571, term68571.getClass(), "filterVersion", 540736002);
        setIntField(term68571, term68571.getClass(), "filterRec", 145817292);
        setIntField(term68571, term68571.getClass(), "filterFullCombo", -88949007);
        setIntField(term68571, term68571.getClass(), "filterAllPerfect", -927282703);
        setIntField(term68571, term68571.getClass(), "filterDifficulty", -1638986447);
        setIntField(term68571, term68571.getClass(), "filterFullSync", -47039314);
        setIntField(term68571, term68571.getClass(), "filterReMaster", 1242263247);
        setIntField(term68571, term68571.getClass(), "filterMaxFever", -313667953);
        setIntField(term68571, term68571.getClass(), "finalSelectId", -2001885943);
        setIntField(term68571, term68571.getClass(), "finalSelectCategory", -1140069411);
        term68789 = new Integer(-540827425);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term68789;
        callMethod(klass, "setBreakSeVol", argTypes, term68571, args);
    }

};


