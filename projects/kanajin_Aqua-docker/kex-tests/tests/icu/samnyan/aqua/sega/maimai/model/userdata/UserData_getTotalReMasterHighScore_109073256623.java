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

public class UserData_getTotalReMasterHighScore_109073256623 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6073;

    public UserData_getTotalReMasterHighScore_109073256623() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6077 = new Long(-4365849114644724155L);
        term6073 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term6075 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term6091 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6092 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6096 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6101 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6102 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6106 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term6073, term6073.getClass(), "id", -2170847986967241072L);
        setLongField(term6075, term6075.getClass(), "id", 4044358158040652353L);
        setField(term6075, term6075.getClass(), "extId", term6077);
        setField(term6075, term6075.getClass(), "luid", "AZdLeSugwv");
        setIntField(term6092, term6092.getClass(), "year", 2027);
        setShortField(term6092, term6092.getClass(), "month", (short) 8);
        setShortField(term6092, term6092.getClass(), "day", (short) 23);
        setField(term6091, term6091.getClass(), "date", term6092);
        setByteField(term6096, term6096.getClass(), "hour", (byte) 15);
        setByteField(term6096, term6096.getClass(), "minute", (byte) 12);
        setByteField(term6096, term6096.getClass(), "second", (byte) 6);
        setIntField(term6096, term6096.getClass(), "nano", 541218258);
        setField(term6091, term6091.getClass(), "time", term6096);
        setField(term6075, term6075.getClass(), "registerTime", term6091);
        setIntField(term6102, term6102.getClass(), "year", 2013);
        setShortField(term6102, term6102.getClass(), "month", (short) 5);
        setShortField(term6102, term6102.getClass(), "day", (short) 26);
        setField(term6101, term6101.getClass(), "date", term6102);
        setByteField(term6106, term6106.getClass(), "hour", (byte) 4);
        setByteField(term6106, term6106.getClass(), "minute", (byte) 39);
        setByteField(term6106, term6106.getClass(), "second", (byte) 5);
        setIntField(term6106, term6106.getClass(), "nano", 392869354);
        setField(term6101, term6101.getClass(), "time", term6106);
        setField(term6075, term6075.getClass(), "accessTime", term6101);
        setField(term6073, term6073.getClass(), "card", term6075);
        setIntField(term6073, term6073.getClass(), "lastDataVersion", -2134711835);
        setField(term6073, term6073.getClass(), "userName", "RMsXuyzKJV");
        setIntField(term6073, term6073.getClass(), "point", -1641244494);
        setIntField(term6073, term6073.getClass(), "totalPoint", 1124282188);
        setIntField(term6073, term6073.getClass(), "iconId", -489441521);
        setIntField(term6073, term6073.getClass(), "nameplateId", 225873732);
        setIntField(term6073, term6073.getClass(), "frameId", 529879356);
        setIntField(term6073, term6073.getClass(), "trophyId", 18072182);
        setIntField(term6073, term6073.getClass(), "playCount", 1544768934);
        setIntField(term6073, term6073.getClass(), "playVsCount", -383508597);
        setIntField(term6073, term6073.getClass(), "playSyncCount", -819372164);
        setIntField(term6073, term6073.getClass(), "winCount", 958132675);
        setIntField(term6073, term6073.getClass(), "helpCount", -689879283);
        setIntField(term6073, term6073.getClass(), "comboCount", 1985432430);
        setIntField(term6073, term6073.getClass(), "feverCount", -1769933499);
        setIntField(term6073, term6073.getClass(), "totalHiScore", -1510932472);
        setIntField(term6073, term6073.getClass(), "totalEasyHighScore", 1970654816);
        setIntField(term6073, term6073.getClass(), "totalBasicHighScore", 1354781442);
        setIntField(term6073, term6073.getClass(), "totalAdvancedHighScore", -393590701);
        setIntField(term6073, term6073.getClass(), "totalExpertHighScore", 86344574);
        setIntField(term6073, term6073.getClass(), "totalMasterHighScore", -829441157);
        setIntField(term6073, term6073.getClass(), "totalReMasterHighScore", -1489991025);
        setIntField(term6073, term6073.getClass(), "totalHighSync", -1542979444);
        setIntField(term6073, term6073.getClass(), "totalEasySync", -1130401612);
        setIntField(term6073, term6073.getClass(), "totalBasicSync", -316771104);
        setIntField(term6073, term6073.getClass(), "totalAdvancedSync", -1374527319);
        setIntField(term6073, term6073.getClass(), "totalExpertSync", -1735276919);
        setIntField(term6073, term6073.getClass(), "totalMasterSync", -712023865);
        setIntField(term6073, term6073.getClass(), "totalReMasterSync", 613256157);
        setIntField(term6073, term6073.getClass(), "playerRating", 454242689);
        setIntField(term6073, term6073.getClass(), "highestRating", 1798354517);
        setIntField(term6073, term6073.getClass(), "rankAuthTailId", -1495693617);
        setField(term6073, term6073.getClass(), "eventWatchedDate", "FwPbDZcHmB");
        setField(term6073, term6073.getClass(), "webLimitDate", "hOncybyCAH");
        setIntField(term6073, term6073.getClass(), "challengeTrackPhase", -890538258);
        setIntField(term6073, term6073.getClass(), "firstPlayBits", -1085899912);
        setField(term6073, term6073.getClass(), "lastPlayDate", "QduALnDSVo");
        setIntField(term6073, term6073.getClass(), "lastPlaceId", -1458980236);
        setField(term6073, term6073.getClass(), "lastPlaceName", "izPpKDErnQ");
        setIntField(term6073, term6073.getClass(), "lastRegionId", 890505372);
        setField(term6073, term6073.getClass(), "lastRegionName", "NnpwZBUTvx");
        setField(term6073, term6073.getClass(), "lastClientId", "tlQSNgTkQX");
        setField(term6073, term6073.getClass(), "lastCountryCode", "PCipZnmBOF");
        setIntField(term6073, term6073.getClass(), "eventPoint", 2044137055);
        setIntField(term6073, term6073.getClass(), "totalLv", -1452324619);
        setIntField(term6073, term6073.getClass(), "lastLoginBonusDay", -1121709274);
        setIntField(term6073, term6073.getClass(), "lastSurvivalBonusDay", -532304223);
        setIntField(term6073, term6073.getClass(), "loginBonusLv", 666218293);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalReMasterHighScore", argTypes, term6073, args);
    }

};


