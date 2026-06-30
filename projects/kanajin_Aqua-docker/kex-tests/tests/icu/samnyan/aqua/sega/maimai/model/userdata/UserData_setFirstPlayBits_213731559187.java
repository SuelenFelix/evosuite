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

public class UserData_setFirstPlayBits_213731559187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23147;
     Object term23321;

    public UserData_setFirstPlayBits_213731559187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term23151 = new Long(-8876856890348836498L);
        term23147 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term23149 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term23165 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23166 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23170 = newInstance(Class.forName("java.time.LocalTime"));
        Object term23175 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23176 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23180 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term23147, term23147.getClass(), "id", -6100012593724108983L);
        setLongField(term23149, term23149.getClass(), "id", 5465527210299101732L);
        setField(term23149, term23149.getClass(), "extId", term23151);
        setField(term23149, term23149.getClass(), "luid", "nJnRIRiLZK");
        setIntField(term23166, term23166.getClass(), "year", 2029);
        setShortField(term23166, term23166.getClass(), "month", (short) 7);
        setShortField(term23166, term23166.getClass(), "day", (short) 14);
        setField(term23165, term23165.getClass(), "date", term23166);
        setByteField(term23170, term23170.getClass(), "hour", (byte) 17);
        setByteField(term23170, term23170.getClass(), "minute", (byte) 37);
        setByteField(term23170, term23170.getClass(), "second", (byte) 39);
        setIntField(term23170, term23170.getClass(), "nano", 333402299);
        setField(term23165, term23165.getClass(), "time", term23170);
        setField(term23149, term23149.getClass(), "registerTime", term23165);
        setIntField(term23176, term23176.getClass(), "year", 2025);
        setShortField(term23176, term23176.getClass(), "month", (short) 10);
        setShortField(term23176, term23176.getClass(), "day", (short) 30);
        setField(term23175, term23175.getClass(), "date", term23176);
        setByteField(term23180, term23180.getClass(), "hour", (byte) 1);
        setByteField(term23180, term23180.getClass(), "minute", (byte) 4);
        setByteField(term23180, term23180.getClass(), "second", (byte) 18);
        setIntField(term23180, term23180.getClass(), "nano", 717716253);
        setField(term23175, term23175.getClass(), "time", term23180);
        setField(term23149, term23149.getClass(), "accessTime", term23175);
        setField(term23147, term23147.getClass(), "card", term23149);
        setIntField(term23147, term23147.getClass(), "lastDataVersion", -1214249196);
        setField(term23147, term23147.getClass(), "userName", "eWnrMSbYbT");
        setIntField(term23147, term23147.getClass(), "point", -500814419);
        setIntField(term23147, term23147.getClass(), "totalPoint", -584375380);
        setIntField(term23147, term23147.getClass(), "iconId", 1906067765);
        setIntField(term23147, term23147.getClass(), "nameplateId", -1141978353);
        setIntField(term23147, term23147.getClass(), "frameId", 1877297875);
        setIntField(term23147, term23147.getClass(), "trophyId", -614739795);
        setIntField(term23147, term23147.getClass(), "playCount", 1805124024);
        setIntField(term23147, term23147.getClass(), "playVsCount", -1415507503);
        setIntField(term23147, term23147.getClass(), "playSyncCount", 424884647);
        setIntField(term23147, term23147.getClass(), "winCount", -881760055);
        setIntField(term23147, term23147.getClass(), "helpCount", 873700519);
        setIntField(term23147, term23147.getClass(), "comboCount", 805310057);
        setIntField(term23147, term23147.getClass(), "feverCount", -107339699);
        setIntField(term23147, term23147.getClass(), "totalHiScore", -58728001);
        setIntField(term23147, term23147.getClass(), "totalEasyHighScore", 1013952192);
        setIntField(term23147, term23147.getClass(), "totalBasicHighScore", -986675483);
        setIntField(term23147, term23147.getClass(), "totalAdvancedHighScore", 337370099);
        setIntField(term23147, term23147.getClass(), "totalExpertHighScore", -824145581);
        setIntField(term23147, term23147.getClass(), "totalMasterHighScore", -769314399);
        setIntField(term23147, term23147.getClass(), "totalReMasterHighScore", -59737304);
        setIntField(term23147, term23147.getClass(), "totalHighSync", -1878753007);
        setIntField(term23147, term23147.getClass(), "totalEasySync", -411059650);
        setIntField(term23147, term23147.getClass(), "totalBasicSync", 811517871);
        setIntField(term23147, term23147.getClass(), "totalAdvancedSync", -74980095);
        setIntField(term23147, term23147.getClass(), "totalExpertSync", -1303503886);
        setIntField(term23147, term23147.getClass(), "totalMasterSync", -199463835);
        setIntField(term23147, term23147.getClass(), "totalReMasterSync", 847764025);
        setIntField(term23147, term23147.getClass(), "playerRating", 436004216);
        setIntField(term23147, term23147.getClass(), "highestRating", 1327592820);
        setIntField(term23147, term23147.getClass(), "rankAuthTailId", 1056183374);
        setField(term23147, term23147.getClass(), "eventWatchedDate", "AjoFvDFyCY");
        setField(term23147, term23147.getClass(), "webLimitDate", "OFTJwdPiTG");
        setIntField(term23147, term23147.getClass(), "challengeTrackPhase", 908916188);
        setIntField(term23147, term23147.getClass(), "firstPlayBits", -2066943126);
        setField(term23147, term23147.getClass(), "lastPlayDate", "QiUprSEluR");
        setIntField(term23147, term23147.getClass(), "lastPlaceId", 670556171);
        setField(term23147, term23147.getClass(), "lastPlaceName", "cDOXXottZh");
        setIntField(term23147, term23147.getClass(), "lastRegionId", -1727494705);
        setField(term23147, term23147.getClass(), "lastRegionName", "rfqJDkDppz");
        setField(term23147, term23147.getClass(), "lastClientId", "MGorMVGauT");
        setField(term23147, term23147.getClass(), "lastCountryCode", "jXKxUGTuEF");
        setIntField(term23147, term23147.getClass(), "eventPoint", -1168439000);
        setIntField(term23147, term23147.getClass(), "totalLv", -1552818345);
        setIntField(term23147, term23147.getClass(), "lastLoginBonusDay", -811708149);
        setIntField(term23147, term23147.getClass(), "lastSurvivalBonusDay", 2060766727);
        setIntField(term23147, term23147.getClass(), "loginBonusLv", 1298229635);
        term23321 = new Integer(-569196422);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term23321;
        callMethod(klass, "setFirstPlayBits", argTypes, term23147, args);
    }

};


