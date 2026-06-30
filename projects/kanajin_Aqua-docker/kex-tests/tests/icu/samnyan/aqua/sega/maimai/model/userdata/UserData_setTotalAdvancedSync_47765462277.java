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

public class UserData_setTotalAdvancedSync_47765462277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20447;
     Object term20621;

    public UserData_setTotalAdvancedSync_47765462277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term20451 = new Long(7862575738391801707L);
        term20447 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term20449 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term20465 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term20466 = newInstance(Class.forName("java.time.LocalDate"));
        Object term20470 = newInstance(Class.forName("java.time.LocalTime"));
        Object term20475 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term20476 = newInstance(Class.forName("java.time.LocalDate"));
        Object term20480 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term20447, term20447.getClass(), "id", -8649738738252714180L);
        setLongField(term20449, term20449.getClass(), "id", -7278883608542636188L);
        setField(term20449, term20449.getClass(), "extId", term20451);
        setField(term20449, term20449.getClass(), "luid", "pxokrVaeMd");
        setIntField(term20466, term20466.getClass(), "year", 2020);
        setShortField(term20466, term20466.getClass(), "month", (short) 5);
        setShortField(term20466, term20466.getClass(), "day", (short) 12);
        setField(term20465, term20465.getClass(), "date", term20466);
        setByteField(term20470, term20470.getClass(), "hour", (byte) 22);
        setByteField(term20470, term20470.getClass(), "minute", (byte) 7);
        setByteField(term20470, term20470.getClass(), "second", (byte) 49);
        setIntField(term20470, term20470.getClass(), "nano", 677355362);
        setField(term20465, term20465.getClass(), "time", term20470);
        setField(term20449, term20449.getClass(), "registerTime", term20465);
        setIntField(term20476, term20476.getClass(), "year", 2010);
        setShortField(term20476, term20476.getClass(), "month", (short) 11);
        setShortField(term20476, term20476.getClass(), "day", (short) 1);
        setField(term20475, term20475.getClass(), "date", term20476);
        setByteField(term20480, term20480.getClass(), "hour", (byte) 5);
        setByteField(term20480, term20480.getClass(), "minute", (byte) 32);
        setByteField(term20480, term20480.getClass(), "second", (byte) 8);
        setIntField(term20480, term20480.getClass(), "nano", 918832231);
        setField(term20475, term20475.getClass(), "time", term20480);
        setField(term20449, term20449.getClass(), "accessTime", term20475);
        setField(term20447, term20447.getClass(), "card", term20449);
        setIntField(term20447, term20447.getClass(), "lastDataVersion", 467573222);
        setField(term20447, term20447.getClass(), "userName", "ujxmmZZcbT");
        setIntField(term20447, term20447.getClass(), "point", -197212451);
        setIntField(term20447, term20447.getClass(), "totalPoint", 213194885);
        setIntField(term20447, term20447.getClass(), "iconId", 364063308);
        setIntField(term20447, term20447.getClass(), "nameplateId", -787041664);
        setIntField(term20447, term20447.getClass(), "frameId", 2141179437);
        setIntField(term20447, term20447.getClass(), "trophyId", -826972140);
        setIntField(term20447, term20447.getClass(), "playCount", 737250028);
        setIntField(term20447, term20447.getClass(), "playVsCount", -1870044711);
        setIntField(term20447, term20447.getClass(), "playSyncCount", -719110417);
        setIntField(term20447, term20447.getClass(), "winCount", -1866172730);
        setIntField(term20447, term20447.getClass(), "helpCount", 1129688211);
        setIntField(term20447, term20447.getClass(), "comboCount", 2126253731);
        setIntField(term20447, term20447.getClass(), "feverCount", 1637943121);
        setIntField(term20447, term20447.getClass(), "totalHiScore", -1889806893);
        setIntField(term20447, term20447.getClass(), "totalEasyHighScore", 2101844302);
        setIntField(term20447, term20447.getClass(), "totalBasicHighScore", 1975711832);
        setIntField(term20447, term20447.getClass(), "totalAdvancedHighScore", -712035661);
        setIntField(term20447, term20447.getClass(), "totalExpertHighScore", -545530498);
        setIntField(term20447, term20447.getClass(), "totalMasterHighScore", -1018874255);
        setIntField(term20447, term20447.getClass(), "totalReMasterHighScore", -268930414);
        setIntField(term20447, term20447.getClass(), "totalHighSync", 1036231784);
        setIntField(term20447, term20447.getClass(), "totalEasySync", 732187274);
        setIntField(term20447, term20447.getClass(), "totalBasicSync", 1495500544);
        setIntField(term20447, term20447.getClass(), "totalAdvancedSync", -610532968);
        setIntField(term20447, term20447.getClass(), "totalExpertSync", -1034929475);
        setIntField(term20447, term20447.getClass(), "totalMasterSync", 2125774573);
        setIntField(term20447, term20447.getClass(), "totalReMasterSync", -1338560431);
        setIntField(term20447, term20447.getClass(), "playerRating", 1768827963);
        setIntField(term20447, term20447.getClass(), "highestRating", -456155591);
        setIntField(term20447, term20447.getClass(), "rankAuthTailId", -678946365);
        setField(term20447, term20447.getClass(), "eventWatchedDate", "BOvgwHfoHQ");
        setField(term20447, term20447.getClass(), "webLimitDate", "hPpFNeDBIb");
        setIntField(term20447, term20447.getClass(), "challengeTrackPhase", 2121147631);
        setIntField(term20447, term20447.getClass(), "firstPlayBits", 878122723);
        setField(term20447, term20447.getClass(), "lastPlayDate", "DNOtiLPAIY");
        setIntField(term20447, term20447.getClass(), "lastPlaceId", 1612267814);
        setField(term20447, term20447.getClass(), "lastPlaceName", "FnEkAHBfyV");
        setIntField(term20447, term20447.getClass(), "lastRegionId", 634968709);
        setField(term20447, term20447.getClass(), "lastRegionName", "VfmNFpEuax");
        setField(term20447, term20447.getClass(), "lastClientId", "ANHjlWPmZG");
        setField(term20447, term20447.getClass(), "lastCountryCode", "SibzENsyyy");
        setIntField(term20447, term20447.getClass(), "eventPoint", 681482688);
        setIntField(term20447, term20447.getClass(), "totalLv", -1435288604);
        setIntField(term20447, term20447.getClass(), "lastLoginBonusDay", 364335952);
        setIntField(term20447, term20447.getClass(), "lastSurvivalBonusDay", 254542714);
        setIntField(term20447, term20447.getClass(), "loginBonusLv", -51533463);
        term20621 = new Integer(2042811670);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term20621;
        callMethod(klass, "setTotalAdvancedSync", argTypes, term20447, args);
    }

};


