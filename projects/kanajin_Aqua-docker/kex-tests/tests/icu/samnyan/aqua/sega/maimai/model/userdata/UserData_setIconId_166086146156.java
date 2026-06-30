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

public class UserData_setIconId_166086146156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14861;
     Object term15035;

    public UserData_setIconId_166086146156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term14865 = new Long(3825396310311739952L);
        term14861 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term14863 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term14879 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14880 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14884 = newInstance(Class.forName("java.time.LocalTime"));
        Object term14889 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14890 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14894 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term14861, term14861.getClass(), "id", -6342139649364011743L);
        setLongField(term14863, term14863.getClass(), "id", -4924950707540628022L);
        setField(term14863, term14863.getClass(), "extId", term14865);
        setField(term14863, term14863.getClass(), "luid", "oNLcCYDAsO");
        setIntField(term14880, term14880.getClass(), "year", 2026);
        setShortField(term14880, term14880.getClass(), "month", (short) 10);
        setShortField(term14880, term14880.getClass(), "day", (short) 19);
        setField(term14879, term14879.getClass(), "date", term14880);
        setByteField(term14884, term14884.getClass(), "hour", (byte) 7);
        setByteField(term14884, term14884.getClass(), "minute", (byte) 22);
        setByteField(term14884, term14884.getClass(), "second", (byte) 11);
        setIntField(term14884, term14884.getClass(), "nano", 17846677);
        setField(term14879, term14879.getClass(), "time", term14884);
        setField(term14863, term14863.getClass(), "registerTime", term14879);
        setIntField(term14890, term14890.getClass(), "year", 2018);
        setShortField(term14890, term14890.getClass(), "month", (short) 10);
        setShortField(term14890, term14890.getClass(), "day", (short) 17);
        setField(term14889, term14889.getClass(), "date", term14890);
        setByteField(term14894, term14894.getClass(), "hour", (byte) 5);
        setByteField(term14894, term14894.getClass(), "minute", (byte) 10);
        setByteField(term14894, term14894.getClass(), "second", (byte) 23);
        setIntField(term14894, term14894.getClass(), "nano", 571520422);
        setField(term14889, term14889.getClass(), "time", term14894);
        setField(term14863, term14863.getClass(), "accessTime", term14889);
        setField(term14861, term14861.getClass(), "card", term14863);
        setIntField(term14861, term14861.getClass(), "lastDataVersion", -1074402599);
        setField(term14861, term14861.getClass(), "userName", "CNqMxLvtcJ");
        setIntField(term14861, term14861.getClass(), "point", -1867539151);
        setIntField(term14861, term14861.getClass(), "totalPoint", -816430246);
        setIntField(term14861, term14861.getClass(), "iconId", 1754193865);
        setIntField(term14861, term14861.getClass(), "nameplateId", 25277058);
        setIntField(term14861, term14861.getClass(), "frameId", -949634053);
        setIntField(term14861, term14861.getClass(), "trophyId", 1495471055);
        setIntField(term14861, term14861.getClass(), "playCount", -583415628);
        setIntField(term14861, term14861.getClass(), "playVsCount", -1488660931);
        setIntField(term14861, term14861.getClass(), "playSyncCount", 1899095931);
        setIntField(term14861, term14861.getClass(), "winCount", 145571200);
        setIntField(term14861, term14861.getClass(), "helpCount", -81919234);
        setIntField(term14861, term14861.getClass(), "comboCount", 41779745);
        setIntField(term14861, term14861.getClass(), "feverCount", 908188015);
        setIntField(term14861, term14861.getClass(), "totalHiScore", 1448289766);
        setIntField(term14861, term14861.getClass(), "totalEasyHighScore", 1377148923);
        setIntField(term14861, term14861.getClass(), "totalBasicHighScore", 540775467);
        setIntField(term14861, term14861.getClass(), "totalAdvancedHighScore", -2083028527);
        setIntField(term14861, term14861.getClass(), "totalExpertHighScore", 1631605263);
        setIntField(term14861, term14861.getClass(), "totalMasterHighScore", -1378134881);
        setIntField(term14861, term14861.getClass(), "totalReMasterHighScore", -1887131478);
        setIntField(term14861, term14861.getClass(), "totalHighSync", 1916020077);
        setIntField(term14861, term14861.getClass(), "totalEasySync", -1842191454);
        setIntField(term14861, term14861.getClass(), "totalBasicSync", 384551988);
        setIntField(term14861, term14861.getClass(), "totalAdvancedSync", -2021521187);
        setIntField(term14861, term14861.getClass(), "totalExpertSync", -2139205197);
        setIntField(term14861, term14861.getClass(), "totalMasterSync", -584949216);
        setIntField(term14861, term14861.getClass(), "totalReMasterSync", 1646064199);
        setIntField(term14861, term14861.getClass(), "playerRating", -1135845415);
        setIntField(term14861, term14861.getClass(), "highestRating", -1361921586);
        setIntField(term14861, term14861.getClass(), "rankAuthTailId", 593679468);
        setField(term14861, term14861.getClass(), "eventWatchedDate", "ktbqerIaKW");
        setField(term14861, term14861.getClass(), "webLimitDate", "VoghngXfsK");
        setIntField(term14861, term14861.getClass(), "challengeTrackPhase", 747491);
        setIntField(term14861, term14861.getClass(), "firstPlayBits", 734222768);
        setField(term14861, term14861.getClass(), "lastPlayDate", "GbahCBMvct");
        setIntField(term14861, term14861.getClass(), "lastPlaceId", 1545425140);
        setField(term14861, term14861.getClass(), "lastPlaceName", "iiHBhsNFgk");
        setIntField(term14861, term14861.getClass(), "lastRegionId", -1580765555);
        setField(term14861, term14861.getClass(), "lastRegionName", "HknsTajwxJ");
        setField(term14861, term14861.getClass(), "lastClientId", "XtiurrVYKw");
        setField(term14861, term14861.getClass(), "lastCountryCode", "rsumfoDNHa");
        setIntField(term14861, term14861.getClass(), "eventPoint", -1295149055);
        setIntField(term14861, term14861.getClass(), "totalLv", -769814321);
        setIntField(term14861, term14861.getClass(), "lastLoginBonusDay", 114898432);
        setIntField(term14861, term14861.getClass(), "lastSurvivalBonusDay", -193767503);
        setIntField(term14861, term14861.getClass(), "loginBonusLv", -2090918082);
        term15035 = new Integer(1505717672);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term15035;
        callMethod(klass, "setIconId", argTypes, term14861, args);
    }

};


