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

public class UserGeneralData_setPropertyValue_20351084848 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110479;

    public UserGeneralData_setPropertyValue_20351084848() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term110485 = new Long(1740732617708040141L);
        term110479 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserGeneralData"));
        Object term110481 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term110483 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term110499 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term110500 = newInstance(Class.forName("java.time.LocalDate"));
        Object term110504 = newInstance(Class.forName("java.time.LocalTime"));
        Object term110509 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term110510 = newInstance(Class.forName("java.time.LocalDate"));
        Object term110514 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term110479, term110479.getClass(), "id", -5567719604161729601L);
        setLongField(term110481, term110481.getClass(), "id", -8754542710304507750L);
        setLongField(term110483, term110483.getClass(), "id", -5957491491329394218L);
        setField(term110483, term110483.getClass(), "extId", term110485);
        setField(term110483, term110483.getClass(), "luid", "AtnEadrVWF");
        setIntField(term110500, term110500.getClass(), "year", 2013);
        setShortField(term110500, term110500.getClass(), "month", (short) 6);
        setShortField(term110500, term110500.getClass(), "day", (short) 2);
        setField(term110499, term110499.getClass(), "date", term110500);
        setByteField(term110504, term110504.getClass(), "hour", (byte) 6);
        setByteField(term110504, term110504.getClass(), "minute", (byte) 13);
        setByteField(term110504, term110504.getClass(), "second", (byte) 6);
        setIntField(term110504, term110504.getClass(), "nano", 466304404);
        setField(term110499, term110499.getClass(), "time", term110504);
        setField(term110483, term110483.getClass(), "registerTime", term110499);
        setIntField(term110510, term110510.getClass(), "year", 2022);
        setShortField(term110510, term110510.getClass(), "month", (short) 4);
        setShortField(term110510, term110510.getClass(), "day", (short) 10);
        setField(term110509, term110509.getClass(), "date", term110510);
        setByteField(term110514, term110514.getClass(), "hour", (byte) 5);
        setByteField(term110514, term110514.getClass(), "minute", (byte) 55);
        setByteField(term110514, term110514.getClass(), "second", (byte) 27);
        setIntField(term110514, term110514.getClass(), "nano", 974485423);
        setField(term110509, term110509.getClass(), "time", term110514);
        setField(term110483, term110483.getClass(), "accessTime", term110509);
        setField(term110481, term110481.getClass(), "card", term110483);
        setIntField(term110481, term110481.getClass(), "lastDataVersion", 1695203610);
        setField(term110481, term110481.getClass(), "userName", "YghxvBBBOW");
        setIntField(term110481, term110481.getClass(), "point", 1221449396);
        setIntField(term110481, term110481.getClass(), "totalPoint", 1420622683);
        setIntField(term110481, term110481.getClass(), "iconId", 1526408522);
        setIntField(term110481, term110481.getClass(), "nameplateId", 128258005);
        setIntField(term110481, term110481.getClass(), "frameId", 1223583997);
        setIntField(term110481, term110481.getClass(), "trophyId", -1876769614);
        setIntField(term110481, term110481.getClass(), "playCount", -1214190971);
        setIntField(term110481, term110481.getClass(), "playVsCount", 197274645);
        setIntField(term110481, term110481.getClass(), "playSyncCount", 2099971798);
        setIntField(term110481, term110481.getClass(), "winCount", 1826998217);
        setIntField(term110481, term110481.getClass(), "helpCount", -41129313);
        setIntField(term110481, term110481.getClass(), "comboCount", -1317015934);
        setIntField(term110481, term110481.getClass(), "feverCount", -1071966167);
        setIntField(term110481, term110481.getClass(), "totalHiScore", -1326585540);
        setIntField(term110481, term110481.getClass(), "totalEasyHighScore", 597942176);
        setIntField(term110481, term110481.getClass(), "totalBasicHighScore", 2668161);
        setIntField(term110481, term110481.getClass(), "totalAdvancedHighScore", 220870605);
        setIntField(term110481, term110481.getClass(), "totalExpertHighScore", -1854813543);
        setIntField(term110481, term110481.getClass(), "totalMasterHighScore", -2144619065);
        setIntField(term110481, term110481.getClass(), "totalReMasterHighScore", -1902391570);
        setIntField(term110481, term110481.getClass(), "totalHighSync", -1921725396);
        setIntField(term110481, term110481.getClass(), "totalEasySync", 1294409779);
        setIntField(term110481, term110481.getClass(), "totalBasicSync", 985108178);
        setIntField(term110481, term110481.getClass(), "totalAdvancedSync", -1970607608);
        setIntField(term110481, term110481.getClass(), "totalExpertSync", -951908827);
        setIntField(term110481, term110481.getClass(), "totalMasterSync", -1764618187);
        setIntField(term110481, term110481.getClass(), "totalReMasterSync", 2031203708);
        setIntField(term110481, term110481.getClass(), "playerRating", -1098979156);
        setIntField(term110481, term110481.getClass(), "highestRating", 888826418);
        setIntField(term110481, term110481.getClass(), "rankAuthTailId", -2138902791);
        setField(term110481, term110481.getClass(), "eventWatchedDate", "LHuytJdqwq");
        setField(term110481, term110481.getClass(), "webLimitDate", "SqSvcPPMTC");
        setIntField(term110481, term110481.getClass(), "challengeTrackPhase", 1965540679);
        setIntField(term110481, term110481.getClass(), "firstPlayBits", 654663878);
        setField(term110481, term110481.getClass(), "lastPlayDate", "SsLBbqIZdp");
        setIntField(term110481, term110481.getClass(), "lastPlaceId", 993806285);
        setField(term110481, term110481.getClass(), "lastPlaceName", "SCyDnkiMeE");
        setIntField(term110481, term110481.getClass(), "lastRegionId", 1845685402);
        setField(term110481, term110481.getClass(), "lastRegionName", "WtfwBvpVGp");
        setField(term110481, term110481.getClass(), "lastClientId", "nqNHstnjtW");
        setField(term110481, term110481.getClass(), "lastCountryCode", "xWqIkjeUFn");
        setIntField(term110481, term110481.getClass(), "eventPoint", -1246524805);
        setIntField(term110481, term110481.getClass(), "totalLv", -947153148);
        setIntField(term110481, term110481.getClass(), "lastLoginBonusDay", -798375153);
        setIntField(term110481, term110481.getClass(), "lastSurvivalBonusDay", 602245063);
        setIntField(term110481, term110481.getClass(), "loginBonusLv", -649896338);
        setField(term110479, term110479.getClass(), "user", term110481);
        setField(term110479, term110479.getClass(), "propertyKey", "vBcZiZnuXD");
        setField(term110479, term110479.getClass(), "propertyValue", "NRKOkpSTQr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserGeneralData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "XwevHLOcph";
        callMethod(klass, "setPropertyValue", argTypes, term110479, args);
    }

};


