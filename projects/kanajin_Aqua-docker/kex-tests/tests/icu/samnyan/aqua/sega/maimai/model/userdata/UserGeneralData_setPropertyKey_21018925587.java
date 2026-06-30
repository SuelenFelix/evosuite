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

public class UserGeneralData_setPropertyKey_21018925587 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110147;

    public UserGeneralData_setPropertyKey_21018925587() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term110153 = new Long(-6001151456088965547L);
        term110147 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserGeneralData"));
        Object term110149 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term110151 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term110167 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term110168 = newInstance(Class.forName("java.time.LocalDate"));
        Object term110172 = newInstance(Class.forName("java.time.LocalTime"));
        Object term110177 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term110178 = newInstance(Class.forName("java.time.LocalDate"));
        Object term110182 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term110147, term110147.getClass(), "id", -590628922285125667L);
        setLongField(term110149, term110149.getClass(), "id", 6167026289140715860L);
        setLongField(term110151, term110151.getClass(), "id", -5583016716246948935L);
        setField(term110151, term110151.getClass(), "extId", term110153);
        setField(term110151, term110151.getClass(), "luid", "FBpdKznMSt");
        setIntField(term110168, term110168.getClass(), "year", 2014);
        setShortField(term110168, term110168.getClass(), "month", (short) 11);
        setShortField(term110168, term110168.getClass(), "day", (short) 28);
        setField(term110167, term110167.getClass(), "date", term110168);
        setByteField(term110172, term110172.getClass(), "hour", (byte) 8);
        setByteField(term110172, term110172.getClass(), "minute", (byte) 59);
        setByteField(term110172, term110172.getClass(), "second", (byte) 49);
        setIntField(term110172, term110172.getClass(), "nano", 282127919);
        setField(term110167, term110167.getClass(), "time", term110172);
        setField(term110151, term110151.getClass(), "registerTime", term110167);
        setIntField(term110178, term110178.getClass(), "year", 2024);
        setShortField(term110178, term110178.getClass(), "month", (short) 5);
        setShortField(term110178, term110178.getClass(), "day", (short) 26);
        setField(term110177, term110177.getClass(), "date", term110178);
        setByteField(term110182, term110182.getClass(), "hour", (byte) 8);
        setByteField(term110182, term110182.getClass(), "minute", (byte) 3);
        setByteField(term110182, term110182.getClass(), "second", (byte) 32);
        setIntField(term110182, term110182.getClass(), "nano", 10833029);
        setField(term110177, term110177.getClass(), "time", term110182);
        setField(term110151, term110151.getClass(), "accessTime", term110177);
        setField(term110149, term110149.getClass(), "card", term110151);
        setIntField(term110149, term110149.getClass(), "lastDataVersion", -720649081);
        setField(term110149, term110149.getClass(), "userName", "LCjhPHXcwj");
        setIntField(term110149, term110149.getClass(), "point", -2090357328);
        setIntField(term110149, term110149.getClass(), "totalPoint", 1501440504);
        setIntField(term110149, term110149.getClass(), "iconId", -249248566);
        setIntField(term110149, term110149.getClass(), "nameplateId", -259006503);
        setIntField(term110149, term110149.getClass(), "frameId", 1786896440);
        setIntField(term110149, term110149.getClass(), "trophyId", 1014633648);
        setIntField(term110149, term110149.getClass(), "playCount", 1926810383);
        setIntField(term110149, term110149.getClass(), "playVsCount", -1055243697);
        setIntField(term110149, term110149.getClass(), "playSyncCount", -1915150284);
        setIntField(term110149, term110149.getClass(), "winCount", 1498762865);
        setIntField(term110149, term110149.getClass(), "helpCount", -1057997237);
        setIntField(term110149, term110149.getClass(), "comboCount", 535946436);
        setIntField(term110149, term110149.getClass(), "feverCount", -907030403);
        setIntField(term110149, term110149.getClass(), "totalHiScore", 746058743);
        setIntField(term110149, term110149.getClass(), "totalEasyHighScore", -527463696);
        setIntField(term110149, term110149.getClass(), "totalBasicHighScore", 2087282313);
        setIntField(term110149, term110149.getClass(), "totalAdvancedHighScore", 1966889005);
        setIntField(term110149, term110149.getClass(), "totalExpertHighScore", 2001342823);
        setIntField(term110149, term110149.getClass(), "totalMasterHighScore", 1668521151);
        setIntField(term110149, term110149.getClass(), "totalReMasterHighScore", 1520350621);
        setIntField(term110149, term110149.getClass(), "totalHighSync", -1328383795);
        setIntField(term110149, term110149.getClass(), "totalEasySync", 1558292388);
        setIntField(term110149, term110149.getClass(), "totalBasicSync", -1203528819);
        setIntField(term110149, term110149.getClass(), "totalAdvancedSync", -225409509);
        setIntField(term110149, term110149.getClass(), "totalExpertSync", 617177778);
        setIntField(term110149, term110149.getClass(), "totalMasterSync", -738512159);
        setIntField(term110149, term110149.getClass(), "totalReMasterSync", 1656434761);
        setIntField(term110149, term110149.getClass(), "playerRating", 735005939);
        setIntField(term110149, term110149.getClass(), "highestRating", 1640246179);
        setIntField(term110149, term110149.getClass(), "rankAuthTailId", 1608222328);
        setField(term110149, term110149.getClass(), "eventWatchedDate", "inoNzxBFDa");
        setField(term110149, term110149.getClass(), "webLimitDate", "dFDHlXwhMk");
        setIntField(term110149, term110149.getClass(), "challengeTrackPhase", 516265532);
        setIntField(term110149, term110149.getClass(), "firstPlayBits", -1003048484);
        setField(term110149, term110149.getClass(), "lastPlayDate", "AUMXeSohOi");
        setIntField(term110149, term110149.getClass(), "lastPlaceId", -1623684161);
        setField(term110149, term110149.getClass(), "lastPlaceName", "HjZSMjBIEl");
        setIntField(term110149, term110149.getClass(), "lastRegionId", 2085818873);
        setField(term110149, term110149.getClass(), "lastRegionName", "SQQNAxPlwz");
        setField(term110149, term110149.getClass(), "lastClientId", "AoOgJDNbaF");
        setField(term110149, term110149.getClass(), "lastCountryCode", "PoxurfXwit");
        setIntField(term110149, term110149.getClass(), "eventPoint", -731775853);
        setIntField(term110149, term110149.getClass(), "totalLv", -1250448247);
        setIntField(term110149, term110149.getClass(), "lastLoginBonusDay", 292160669);
        setIntField(term110149, term110149.getClass(), "lastSurvivalBonusDay", 738714500);
        setIntField(term110149, term110149.getClass(), "loginBonusLv", -1464992742);
        setField(term110147, term110147.getClass(), "user", term110149);
        setField(term110147, term110147.getClass(), "propertyKey", "fhKxidKBbV");
        setField(term110147, term110147.getClass(), "propertyValue", "SIJmlwIkel");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserGeneralData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "lqucbHOiHE";
        callMethod(klass, "setPropertyKey", argTypes, term110147, args);
    }

};


