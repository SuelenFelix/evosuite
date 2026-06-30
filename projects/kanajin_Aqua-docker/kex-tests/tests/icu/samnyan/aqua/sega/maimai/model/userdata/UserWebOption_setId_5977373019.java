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

public class UserWebOption_setId_5977373019 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39701;
     Object term39883;

    public UserWebOption_setId_5977373019() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term39707 = new Long(7489064039921396098L);
        term39701 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserWebOption"));
        Object term39703 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term39705 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term39721 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term39722 = newInstance(Class.forName("java.time.LocalDate"));
        Object term39726 = newInstance(Class.forName("java.time.LocalTime"));
        Object term39731 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term39732 = newInstance(Class.forName("java.time.LocalDate"));
        Object term39736 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term39701, term39701.getClass(), "id", -6078481855513028760L);
        setLongField(term39703, term39703.getClass(), "id", -6985556670871089725L);
        setLongField(term39705, term39705.getClass(), "id", -8469818909085103606L);
        setField(term39705, term39705.getClass(), "extId", term39707);
        setField(term39705, term39705.getClass(), "luid", "VsFWNMdyRt");
        setIntField(term39722, term39722.getClass(), "year", 2029);
        setShortField(term39722, term39722.getClass(), "month", (short) 1);
        setShortField(term39722, term39722.getClass(), "day", (short) 21);
        setField(term39721, term39721.getClass(), "date", term39722);
        setByteField(term39726, term39726.getClass(), "hour", (byte) 9);
        setByteField(term39726, term39726.getClass(), "minute", (byte) 46);
        setByteField(term39726, term39726.getClass(), "second", (byte) 1);
        setIntField(term39726, term39726.getClass(), "nano", 276350652);
        setField(term39721, term39721.getClass(), "time", term39726);
        setField(term39705, term39705.getClass(), "registerTime", term39721);
        setIntField(term39732, term39732.getClass(), "year", 2019);
        setShortField(term39732, term39732.getClass(), "month", (short) 12);
        setShortField(term39732, term39732.getClass(), "day", (short) 20);
        setField(term39731, term39731.getClass(), "date", term39732);
        setByteField(term39736, term39736.getClass(), "hour", (byte) 22);
        setByteField(term39736, term39736.getClass(), "minute", (byte) 20);
        setByteField(term39736, term39736.getClass(), "second", (byte) 29);
        setIntField(term39736, term39736.getClass(), "nano", 582302461);
        setField(term39731, term39731.getClass(), "time", term39736);
        setField(term39705, term39705.getClass(), "accessTime", term39731);
        setField(term39703, term39703.getClass(), "card", term39705);
        setIntField(term39703, term39703.getClass(), "lastDataVersion", 298459181);
        setField(term39703, term39703.getClass(), "userName", "QaoYFZhScg");
        setIntField(term39703, term39703.getClass(), "point", -2122946984);
        setIntField(term39703, term39703.getClass(), "totalPoint", -163004363);
        setIntField(term39703, term39703.getClass(), "iconId", 1165339838);
        setIntField(term39703, term39703.getClass(), "nameplateId", 1943234848);
        setIntField(term39703, term39703.getClass(), "frameId", -226052940);
        setIntField(term39703, term39703.getClass(), "trophyId", -541512295);
        setIntField(term39703, term39703.getClass(), "playCount", 1961504413);
        setIntField(term39703, term39703.getClass(), "playVsCount", -818349758);
        setIntField(term39703, term39703.getClass(), "playSyncCount", -328707642);
        setIntField(term39703, term39703.getClass(), "winCount", -1189408120);
        setIntField(term39703, term39703.getClass(), "helpCount", -211929036);
        setIntField(term39703, term39703.getClass(), "comboCount", 117783491);
        setIntField(term39703, term39703.getClass(), "feverCount", -1289051383);
        setIntField(term39703, term39703.getClass(), "totalHiScore", 1802752902);
        setIntField(term39703, term39703.getClass(), "totalEasyHighScore", -1137533005);
        setIntField(term39703, term39703.getClass(), "totalBasicHighScore", -2093544170);
        setIntField(term39703, term39703.getClass(), "totalAdvancedHighScore", 39380540);
        setIntField(term39703, term39703.getClass(), "totalExpertHighScore", 1307563354);
        setIntField(term39703, term39703.getClass(), "totalMasterHighScore", -1960918162);
        setIntField(term39703, term39703.getClass(), "totalReMasterHighScore", -1039727165);
        setIntField(term39703, term39703.getClass(), "totalHighSync", -64649810);
        setIntField(term39703, term39703.getClass(), "totalEasySync", -1883605503);
        setIntField(term39703, term39703.getClass(), "totalBasicSync", 264290749);
        setIntField(term39703, term39703.getClass(), "totalAdvancedSync", 481697403);
        setIntField(term39703, term39703.getClass(), "totalExpertSync", 926936251);
        setIntField(term39703, term39703.getClass(), "totalMasterSync", -1700257563);
        setIntField(term39703, term39703.getClass(), "totalReMasterSync", 1981729571);
        setIntField(term39703, term39703.getClass(), "playerRating", 127533420);
        setIntField(term39703, term39703.getClass(), "highestRating", -426467178);
        setIntField(term39703, term39703.getClass(), "rankAuthTailId", 1659957838);
        setField(term39703, term39703.getClass(), "eventWatchedDate", "UTvXIenLCR");
        setField(term39703, term39703.getClass(), "webLimitDate", "PLeKpWaxhQ");
        setIntField(term39703, term39703.getClass(), "challengeTrackPhase", 1323889329);
        setIntField(term39703, term39703.getClass(), "firstPlayBits", -343106345);
        setField(term39703, term39703.getClass(), "lastPlayDate", "EBSKhqDdUW");
        setIntField(term39703, term39703.getClass(), "lastPlaceId", 602906952);
        setField(term39703, term39703.getClass(), "lastPlaceName", "LvLbdICdfA");
        setIntField(term39703, term39703.getClass(), "lastRegionId", -114450920);
        setField(term39703, term39703.getClass(), "lastRegionName", "rtifrlITwl");
        setField(term39703, term39703.getClass(), "lastClientId", "yGWXZDjnPS");
        setField(term39703, term39703.getClass(), "lastCountryCode", "vZucxbGVyo");
        setIntField(term39703, term39703.getClass(), "eventPoint", -1252187988);
        setIntField(term39703, term39703.getClass(), "totalLv", -81147170);
        setIntField(term39703, term39703.getClass(), "lastLoginBonusDay", -1351264521);
        setIntField(term39703, term39703.getClass(), "lastSurvivalBonusDay", 1756335526);
        setIntField(term39703, term39703.getClass(), "loginBonusLv", 1520765805);
        setField(term39701, term39701.getClass(), "user", term39703);
        setBooleanField(term39701, term39701.getClass(), "isNetMember", true);
        setIntField(term39701, term39701.getClass(), "dispRate", -1583406430);
        setIntField(term39701, term39701.getClass(), "dispJudgeStyle", -362377365);
        setIntField(term39701, term39701.getClass(), "dispRank", -1066899178);
        setIntField(term39701, term39701.getClass(), "dispHomeRanker", -375367032);
        setIntField(term39701, term39701.getClass(), "dispTotalLv", 947865229);
        term39883 = new Long(11315815278355083L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserWebOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term39883;
        callMethod(klass, "setId", argTypes, term39701, args);
    }

};


