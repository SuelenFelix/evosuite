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

public class UserBoss_setPandoraFlagList6_177200810919 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94431;
     Object term94615;

    public UserBoss_setPandoraFlagList6_177200810919() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term94437 = new Long(6315101499811179240L);
        term94431 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserBoss"));
        Object term94433 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term94435 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term94451 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term94452 = newInstance(Class.forName("java.time.LocalDate"));
        Object term94456 = newInstance(Class.forName("java.time.LocalTime"));
        Object term94461 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term94462 = newInstance(Class.forName("java.time.LocalDate"));
        Object term94466 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term94431, term94431.getClass(), "id", -2217438327452869934L);
        setLongField(term94433, term94433.getClass(), "id", 6427987239762071453L);
        setLongField(term94435, term94435.getClass(), "id", 9216691136820489449L);
        setField(term94435, term94435.getClass(), "extId", term94437);
        setField(term94435, term94435.getClass(), "luid", "CFGOXMbAUn");
        setIntField(term94452, term94452.getClass(), "year", 2023);
        setShortField(term94452, term94452.getClass(), "month", (short) 2);
        setShortField(term94452, term94452.getClass(), "day", (short) 24);
        setField(term94451, term94451.getClass(), "date", term94452);
        setByteField(term94456, term94456.getClass(), "hour", (byte) 13);
        setByteField(term94456, term94456.getClass(), "minute", (byte) 14);
        setByteField(term94456, term94456.getClass(), "second", (byte) 25);
        setIntField(term94456, term94456.getClass(), "nano", 73608340);
        setField(term94451, term94451.getClass(), "time", term94456);
        setField(term94435, term94435.getClass(), "registerTime", term94451);
        setIntField(term94462, term94462.getClass(), "year", 2015);
        setShortField(term94462, term94462.getClass(), "month", (short) 9);
        setShortField(term94462, term94462.getClass(), "day", (short) 8);
        setField(term94461, term94461.getClass(), "date", term94462);
        setByteField(term94466, term94466.getClass(), "hour", (byte) 8);
        setByteField(term94466, term94466.getClass(), "minute", (byte) 25);
        setByteField(term94466, term94466.getClass(), "second", (byte) 10);
        setIntField(term94466, term94466.getClass(), "nano", 506972016);
        setField(term94461, term94461.getClass(), "time", term94466);
        setField(term94435, term94435.getClass(), "accessTime", term94461);
        setField(term94433, term94433.getClass(), "card", term94435);
        setIntField(term94433, term94433.getClass(), "lastDataVersion", 1221611988);
        setField(term94433, term94433.getClass(), "userName", "OxlZVhvedR");
        setIntField(term94433, term94433.getClass(), "point", 425460974);
        setIntField(term94433, term94433.getClass(), "totalPoint", -405289097);
        setIntField(term94433, term94433.getClass(), "iconId", -1702410002);
        setIntField(term94433, term94433.getClass(), "nameplateId", 1231954187);
        setIntField(term94433, term94433.getClass(), "frameId", 804645296);
        setIntField(term94433, term94433.getClass(), "trophyId", -1460116142);
        setIntField(term94433, term94433.getClass(), "playCount", -17478491);
        setIntField(term94433, term94433.getClass(), "playVsCount", -1929569879);
        setIntField(term94433, term94433.getClass(), "playSyncCount", 474343023);
        setIntField(term94433, term94433.getClass(), "winCount", -1990377854);
        setIntField(term94433, term94433.getClass(), "helpCount", -1737041392);
        setIntField(term94433, term94433.getClass(), "comboCount", 1664920870);
        setIntField(term94433, term94433.getClass(), "feverCount", 921567349);
        setIntField(term94433, term94433.getClass(), "totalHiScore", 495324354);
        setIntField(term94433, term94433.getClass(), "totalEasyHighScore", 974817743);
        setIntField(term94433, term94433.getClass(), "totalBasicHighScore", 1644746758);
        setIntField(term94433, term94433.getClass(), "totalAdvancedHighScore", -2021487528);
        setIntField(term94433, term94433.getClass(), "totalExpertHighScore", -431095319);
        setIntField(term94433, term94433.getClass(), "totalMasterHighScore", -532520843);
        setIntField(term94433, term94433.getClass(), "totalReMasterHighScore", 1063976778);
        setIntField(term94433, term94433.getClass(), "totalHighSync", -2086752166);
        setIntField(term94433, term94433.getClass(), "totalEasySync", 100476034);
        setIntField(term94433, term94433.getClass(), "totalBasicSync", 312816015);
        setIntField(term94433, term94433.getClass(), "totalAdvancedSync", -1965641431);
        setIntField(term94433, term94433.getClass(), "totalExpertSync", 1087645970);
        setIntField(term94433, term94433.getClass(), "totalMasterSync", 1832542619);
        setIntField(term94433, term94433.getClass(), "totalReMasterSync", -892031259);
        setIntField(term94433, term94433.getClass(), "playerRating", 1353006335);
        setIntField(term94433, term94433.getClass(), "highestRating", -943705013);
        setIntField(term94433, term94433.getClass(), "rankAuthTailId", 1210869725);
        setField(term94433, term94433.getClass(), "eventWatchedDate", "eoDtSQyUsr");
        setField(term94433, term94433.getClass(), "webLimitDate", "RMTgBohsAX");
        setIntField(term94433, term94433.getClass(), "challengeTrackPhase", -1098995713);
        setIntField(term94433, term94433.getClass(), "firstPlayBits", 1553880710);
        setField(term94433, term94433.getClass(), "lastPlayDate", "kdYeXJnJGG");
        setIntField(term94433, term94433.getClass(), "lastPlaceId", -1228290517);
        setField(term94433, term94433.getClass(), "lastPlaceName", "XEdoshuvxD");
        setIntField(term94433, term94433.getClass(), "lastRegionId", 1650761692);
        setField(term94433, term94433.getClass(), "lastRegionName", "ljtopXMcRl");
        setField(term94433, term94433.getClass(), "lastClientId", "HHtcAGkfuz");
        setField(term94433, term94433.getClass(), "lastCountryCode", "QZCuYHcIBC");
        setIntField(term94433, term94433.getClass(), "eventPoint", -888914454);
        setIntField(term94433, term94433.getClass(), "totalLv", -1836369853);
        setIntField(term94433, term94433.getClass(), "lastLoginBonusDay", -2069140329);
        setIntField(term94433, term94433.getClass(), "lastSurvivalBonusDay", -1240410704);
        setIntField(term94433, term94433.getClass(), "loginBonusLv", 946474812);
        setField(term94431, term94431.getClass(), "user", term94433);
        setLongField(term94431, term94431.getClass(), "pandoraFlagList0", 6460434640369527093L);
        setLongField(term94431, term94431.getClass(), "pandoraFlagList1", -5745335841303453480L);
        setLongField(term94431, term94431.getClass(), "pandoraFlagList2", 7068447368781427495L);
        setLongField(term94431, term94431.getClass(), "pandoraFlagList3", 7899092949241236700L);
        setLongField(term94431, term94431.getClass(), "pandoraFlagList4", 3369965039136843143L);
        setLongField(term94431, term94431.getClass(), "pandoraFlagList5", -383809899410674609L);
        setLongField(term94431, term94431.getClass(), "pandoraFlagList6", 4633443327989555279L);
        setLongField(term94431, term94431.getClass(), "emblemFlagList", -7883918174480028850L);
        term94615 = new Long(3512582740653676967L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserBoss");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term94615;
        callMethod(klass, "setPandoraFlagList6", argTypes, term94431, args);
    }

};


