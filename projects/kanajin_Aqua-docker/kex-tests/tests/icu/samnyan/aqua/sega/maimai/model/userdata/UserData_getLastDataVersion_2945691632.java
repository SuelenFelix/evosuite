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

public class UserData_getLastDataVersion_2945691632 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term529;

    public UserData_getLastDataVersion_2945691632() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term533 = new Long(-8257434502486459194L);
        term529 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term531 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term547 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term548 = newInstance(Class.forName("java.time.LocalDate"));
        Object term552 = newInstance(Class.forName("java.time.LocalTime"));
        Object term557 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term558 = newInstance(Class.forName("java.time.LocalDate"));
        Object term562 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term529, term529.getClass(), "id", 5270370404989704783L);
        setLongField(term531, term531.getClass(), "id", 7411271909051562686L);
        setField(term531, term531.getClass(), "extId", term533);
        setField(term531, term531.getClass(), "luid", "HyxfbSQYBe");
        setIntField(term548, term548.getClass(), "year", 2022);
        setShortField(term548, term548.getClass(), "month", (short) 2);
        setShortField(term548, term548.getClass(), "day", (short) 26);
        setField(term547, term547.getClass(), "date", term548);
        setByteField(term552, term552.getClass(), "hour", (byte) 11);
        setByteField(term552, term552.getClass(), "minute", (byte) 42);
        setByteField(term552, term552.getClass(), "second", (byte) 15);
        setIntField(term552, term552.getClass(), "nano", 377731937);
        setField(term547, term547.getClass(), "time", term552);
        setField(term531, term531.getClass(), "registerTime", term547);
        setIntField(term558, term558.getClass(), "year", 2026);
        setShortField(term558, term558.getClass(), "month", (short) 12);
        setShortField(term558, term558.getClass(), "day", (short) 14);
        setField(term557, term557.getClass(), "date", term558);
        setByteField(term562, term562.getClass(), "hour", (byte) 16);
        setByteField(term562, term562.getClass(), "minute", (byte) 34);
        setByteField(term562, term562.getClass(), "second", (byte) 9);
        setIntField(term562, term562.getClass(), "nano", 518326996);
        setField(term557, term557.getClass(), "time", term562);
        setField(term531, term531.getClass(), "accessTime", term557);
        setField(term529, term529.getClass(), "card", term531);
        setIntField(term529, term529.getClass(), "lastDataVersion", 972867650);
        setField(term529, term529.getClass(), "userName", "pCTimMblYc");
        setIntField(term529, term529.getClass(), "point", 1655935355);
        setIntField(term529, term529.getClass(), "totalPoint", -481533957);
        setIntField(term529, term529.getClass(), "iconId", 1240914516);
        setIntField(term529, term529.getClass(), "nameplateId", -1465035361);
        setIntField(term529, term529.getClass(), "frameId", 1090617576);
        setIntField(term529, term529.getClass(), "trophyId", -1547384488);
        setIntField(term529, term529.getClass(), "playCount", 1442160736);
        setIntField(term529, term529.getClass(), "playVsCount", 1114000454);
        setIntField(term529, term529.getClass(), "playSyncCount", -556405712);
        setIntField(term529, term529.getClass(), "winCount", -1772434990);
        setIntField(term529, term529.getClass(), "helpCount", -1845499264);
        setIntField(term529, term529.getClass(), "comboCount", -505439934);
        setIntField(term529, term529.getClass(), "feverCount", -344842608);
        setIntField(term529, term529.getClass(), "totalHiScore", 941650513);
        setIntField(term529, term529.getClass(), "totalEasyHighScore", 444029505);
        setIntField(term529, term529.getClass(), "totalBasicHighScore", -1034506028);
        setIntField(term529, term529.getClass(), "totalAdvancedHighScore", -1263114719);
        setIntField(term529, term529.getClass(), "totalExpertHighScore", -894662986);
        setIntField(term529, term529.getClass(), "totalMasterHighScore", 304775596);
        setIntField(term529, term529.getClass(), "totalReMasterHighScore", -1347665717);
        setIntField(term529, term529.getClass(), "totalHighSync", -1888585309);
        setIntField(term529, term529.getClass(), "totalEasySync", 683666002);
        setIntField(term529, term529.getClass(), "totalBasicSync", 1596213415);
        setIntField(term529, term529.getClass(), "totalAdvancedSync", -268815336);
        setIntField(term529, term529.getClass(), "totalExpertSync", -1210583429);
        setIntField(term529, term529.getClass(), "totalMasterSync", -663691365);
        setIntField(term529, term529.getClass(), "totalReMasterSync", 339854490);
        setIntField(term529, term529.getClass(), "playerRating", -615654495);
        setIntField(term529, term529.getClass(), "highestRating", -1476117762);
        setIntField(term529, term529.getClass(), "rankAuthTailId", -341962980);
        setField(term529, term529.getClass(), "eventWatchedDate", "hNxWaHcfhY");
        setField(term529, term529.getClass(), "webLimitDate", "RkybSrpybU");
        setIntField(term529, term529.getClass(), "challengeTrackPhase", 1532716628);
        setIntField(term529, term529.getClass(), "firstPlayBits", -1801760683);
        setField(term529, term529.getClass(), "lastPlayDate", "xOEqzGAmDU");
        setIntField(term529, term529.getClass(), "lastPlaceId", 1141317871);
        setField(term529, term529.getClass(), "lastPlaceName", "eZFUvlxvGV");
        setIntField(term529, term529.getClass(), "lastRegionId", 890669485);
        setField(term529, term529.getClass(), "lastRegionName", "BYqFIqCKAV");
        setField(term529, term529.getClass(), "lastClientId", "vrQLuWIDJX");
        setField(term529, term529.getClass(), "lastCountryCode", "flxyYxBRtu");
        setIntField(term529, term529.getClass(), "eventPoint", 691577392);
        setIntField(term529, term529.getClass(), "totalLv", -893623680);
        setIntField(term529, term529.getClass(), "lastLoginBonusDay", -1963434938);
        setIntField(term529, term529.getClass(), "lastSurvivalBonusDay", 906181092);
        setIntField(term529, term529.getClass(), "loginBonusLv", 1045657203);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastDataVersion", argTypes, term529, args);
    }

};


