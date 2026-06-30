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

public class UserGeneralData_init_7349892000 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107735;

    public UserGeneralData_init_7349892000() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term107739 = new Long(3077284143733577490L);
        term107735 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term107737 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term107753 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term107754 = newInstance(Class.forName("java.time.LocalDate"));
        Object term107758 = newInstance(Class.forName("java.time.LocalTime"));
        Object term107763 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term107764 = newInstance(Class.forName("java.time.LocalDate"));
        Object term107768 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term107735, term107735.getClass(), "id", 4057255693458933280L);
        setLongField(term107737, term107737.getClass(), "id", 3365899934091025813L);
        setField(term107737, term107737.getClass(), "extId", term107739);
        setField(term107737, term107737.getClass(), "luid", "NQVfrHmuUQ");
        setIntField(term107754, term107754.getClass(), "year", 2017);
        setShortField(term107754, term107754.getClass(), "month", (short) 10);
        setShortField(term107754, term107754.getClass(), "day", (short) 2);
        setField(term107753, term107753.getClass(), "date", term107754);
        setByteField(term107758, term107758.getClass(), "hour", (byte) 4);
        setByteField(term107758, term107758.getClass(), "minute", (byte) 40);
        setByteField(term107758, term107758.getClass(), "second", (byte) 56);
        setIntField(term107758, term107758.getClass(), "nano", 701221907);
        setField(term107753, term107753.getClass(), "time", term107758);
        setField(term107737, term107737.getClass(), "registerTime", term107753);
        setIntField(term107764, term107764.getClass(), "year", 2017);
        setShortField(term107764, term107764.getClass(), "month", (short) 8);
        setShortField(term107764, term107764.getClass(), "day", (short) 6);
        setField(term107763, term107763.getClass(), "date", term107764);
        setByteField(term107768, term107768.getClass(), "hour", (byte) 8);
        setByteField(term107768, term107768.getClass(), "minute", (byte) 40);
        setByteField(term107768, term107768.getClass(), "second", (byte) 43);
        setIntField(term107768, term107768.getClass(), "nano", 384847912);
        setField(term107763, term107763.getClass(), "time", term107768);
        setField(term107737, term107737.getClass(), "accessTime", term107763);
        setField(term107735, term107735.getClass(), "card", term107737);
        setIntField(term107735, term107735.getClass(), "lastDataVersion", 673245946);
        setField(term107735, term107735.getClass(), "userName", "BxUEPMTBxW");
        setIntField(term107735, term107735.getClass(), "point", -425351471);
        setIntField(term107735, term107735.getClass(), "totalPoint", -1117580978);
        setIntField(term107735, term107735.getClass(), "iconId", 208521517);
        setIntField(term107735, term107735.getClass(), "nameplateId", 778044540);
        setIntField(term107735, term107735.getClass(), "frameId", -803580264);
        setIntField(term107735, term107735.getClass(), "trophyId", 131178867);
        setIntField(term107735, term107735.getClass(), "playCount", -255580652);
        setIntField(term107735, term107735.getClass(), "playVsCount", -1732441524);
        setIntField(term107735, term107735.getClass(), "playSyncCount", -130160357);
        setIntField(term107735, term107735.getClass(), "winCount", -1813127102);
        setIntField(term107735, term107735.getClass(), "helpCount", -838128266);
        setIntField(term107735, term107735.getClass(), "comboCount", 61916705);
        setIntField(term107735, term107735.getClass(), "feverCount", 1816024796);
        setIntField(term107735, term107735.getClass(), "totalHiScore", -499700559);
        setIntField(term107735, term107735.getClass(), "totalEasyHighScore", 1679845201);
        setIntField(term107735, term107735.getClass(), "totalBasicHighScore", 2066635240);
        setIntField(term107735, term107735.getClass(), "totalAdvancedHighScore", 403819364);
        setIntField(term107735, term107735.getClass(), "totalExpertHighScore", -511361821);
        setIntField(term107735, term107735.getClass(), "totalMasterHighScore", 743737267);
        setIntField(term107735, term107735.getClass(), "totalReMasterHighScore", 1900299259);
        setIntField(term107735, term107735.getClass(), "totalHighSync", 1790715750);
        setIntField(term107735, term107735.getClass(), "totalEasySync", -2067996812);
        setIntField(term107735, term107735.getClass(), "totalBasicSync", -1904003203);
        setIntField(term107735, term107735.getClass(), "totalAdvancedSync", -1001590126);
        setIntField(term107735, term107735.getClass(), "totalExpertSync", 610795811);
        setIntField(term107735, term107735.getClass(), "totalMasterSync", 234814998);
        setIntField(term107735, term107735.getClass(), "totalReMasterSync", -656923286);
        setIntField(term107735, term107735.getClass(), "playerRating", 1926273657);
        setIntField(term107735, term107735.getClass(), "highestRating", -630929648);
        setIntField(term107735, term107735.getClass(), "rankAuthTailId", -1137920676);
        setField(term107735, term107735.getClass(), "eventWatchedDate", "OkwcYhqTPO");
        setField(term107735, term107735.getClass(), "webLimitDate", "XeHaPiTvPt");
        setIntField(term107735, term107735.getClass(), "challengeTrackPhase", -1645894833);
        setIntField(term107735, term107735.getClass(), "firstPlayBits", -283032317);
        setField(term107735, term107735.getClass(), "lastPlayDate", "GsyGZIlHgo");
        setIntField(term107735, term107735.getClass(), "lastPlaceId", 974252215);
        setField(term107735, term107735.getClass(), "lastPlaceName", "DPTUtDUuOf");
        setIntField(term107735, term107735.getClass(), "lastRegionId", -101411371);
        setField(term107735, term107735.getClass(), "lastRegionName", "TwTeGrJqeV");
        setField(term107735, term107735.getClass(), "lastClientId", "EmqjtKbtwp");
        setField(term107735, term107735.getClass(), "lastCountryCode", "BIcjuljzhc");
        setIntField(term107735, term107735.getClass(), "eventPoint", -63876189);
        setIntField(term107735, term107735.getClass(), "totalLv", 1742031166);
        setIntField(term107735, term107735.getClass(), "lastLoginBonusDay", -1042732582);
        setIntField(term107735, term107735.getClass(), "lastSurvivalBonusDay", -464887203);
        setIntField(term107735, term107735.getClass(), "loginBonusLv", -1046500542);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserGeneralData");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term107735;
        args[1] = "SQDHGXSyaX";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


