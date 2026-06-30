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

public class UserData_setTotalMasterSync_141126889479 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20979;
     Object term21153;

    public UserData_setTotalMasterSync_141126889479() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term20983 = new Long(5510783420697225605L);
        term20979 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term20981 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term20997 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term20998 = newInstance(Class.forName("java.time.LocalDate"));
        Object term21002 = newInstance(Class.forName("java.time.LocalTime"));
        Object term21007 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term21008 = newInstance(Class.forName("java.time.LocalDate"));
        Object term21012 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term20979, term20979.getClass(), "id", 1195529027276497124L);
        setLongField(term20981, term20981.getClass(), "id", -2783999800714825789L);
        setField(term20981, term20981.getClass(), "extId", term20983);
        setField(term20981, term20981.getClass(), "luid", "ZEXFoMSKeG");
        setIntField(term20998, term20998.getClass(), "year", 2027);
        setShortField(term20998, term20998.getClass(), "month", (short) 5);
        setShortField(term20998, term20998.getClass(), "day", (short) 2);
        setField(term20997, term20997.getClass(), "date", term20998);
        setByteField(term21002, term21002.getClass(), "hour", (byte) 6);
        setByteField(term21002, term21002.getClass(), "minute", (byte) 10);
        setByteField(term21002, term21002.getClass(), "second", (byte) 19);
        setIntField(term21002, term21002.getClass(), "nano", 422884120);
        setField(term20997, term20997.getClass(), "time", term21002);
        setField(term20981, term20981.getClass(), "registerTime", term20997);
        setIntField(term21008, term21008.getClass(), "year", 2029);
        setShortField(term21008, term21008.getClass(), "month", (short) 10);
        setShortField(term21008, term21008.getClass(), "day", (short) 19);
        setField(term21007, term21007.getClass(), "date", term21008);
        setByteField(term21012, term21012.getClass(), "hour", (byte) 15);
        setByteField(term21012, term21012.getClass(), "minute", (byte) 8);
        setByteField(term21012, term21012.getClass(), "second", (byte) 15);
        setIntField(term21012, term21012.getClass(), "nano", 25396748);
        setField(term21007, term21007.getClass(), "time", term21012);
        setField(term20981, term20981.getClass(), "accessTime", term21007);
        setField(term20979, term20979.getClass(), "card", term20981);
        setIntField(term20979, term20979.getClass(), "lastDataVersion", -619414497);
        setField(term20979, term20979.getClass(), "userName", "HvxahUfZcJ");
        setIntField(term20979, term20979.getClass(), "point", 1414603242);
        setIntField(term20979, term20979.getClass(), "totalPoint", 18596324);
        setIntField(term20979, term20979.getClass(), "iconId", 907968883);
        setIntField(term20979, term20979.getClass(), "nameplateId", -1191329679);
        setIntField(term20979, term20979.getClass(), "frameId", -937626498);
        setIntField(term20979, term20979.getClass(), "trophyId", 398974629);
        setIntField(term20979, term20979.getClass(), "playCount", -790946306);
        setIntField(term20979, term20979.getClass(), "playVsCount", -189980304);
        setIntField(term20979, term20979.getClass(), "playSyncCount", 1492044959);
        setIntField(term20979, term20979.getClass(), "winCount", 260483962);
        setIntField(term20979, term20979.getClass(), "helpCount", 1115251191);
        setIntField(term20979, term20979.getClass(), "comboCount", 1882224203);
        setIntField(term20979, term20979.getClass(), "feverCount", 1320826206);
        setIntField(term20979, term20979.getClass(), "totalHiScore", -933702401);
        setIntField(term20979, term20979.getClass(), "totalEasyHighScore", 1670477259);
        setIntField(term20979, term20979.getClass(), "totalBasicHighScore", 186917839);
        setIntField(term20979, term20979.getClass(), "totalAdvancedHighScore", 1727889509);
        setIntField(term20979, term20979.getClass(), "totalExpertHighScore", -159961860);
        setIntField(term20979, term20979.getClass(), "totalMasterHighScore", -1656685141);
        setIntField(term20979, term20979.getClass(), "totalReMasterHighScore", -1550347560);
        setIntField(term20979, term20979.getClass(), "totalHighSync", 1130655068);
        setIntField(term20979, term20979.getClass(), "totalEasySync", 1747437566);
        setIntField(term20979, term20979.getClass(), "totalBasicSync", -1175737970);
        setIntField(term20979, term20979.getClass(), "totalAdvancedSync", 891165187);
        setIntField(term20979, term20979.getClass(), "totalExpertSync", 1608737678);
        setIntField(term20979, term20979.getClass(), "totalMasterSync", -1605443550);
        setIntField(term20979, term20979.getClass(), "totalReMasterSync", -735690372);
        setIntField(term20979, term20979.getClass(), "playerRating", 110644904);
        setIntField(term20979, term20979.getClass(), "highestRating", -1457905205);
        setIntField(term20979, term20979.getClass(), "rankAuthTailId", 1722454323);
        setField(term20979, term20979.getClass(), "eventWatchedDate", "WkLpmqoQxy");
        setField(term20979, term20979.getClass(), "webLimitDate", "XiNoscmYhd");
        setIntField(term20979, term20979.getClass(), "challengeTrackPhase", 630174216);
        setIntField(term20979, term20979.getClass(), "firstPlayBits", -1081282297);
        setField(term20979, term20979.getClass(), "lastPlayDate", "asMqnMNrZp");
        setIntField(term20979, term20979.getClass(), "lastPlaceId", 1331103887);
        setField(term20979, term20979.getClass(), "lastPlaceName", "pqFUMTCKJd");
        setIntField(term20979, term20979.getClass(), "lastRegionId", 637911543);
        setField(term20979, term20979.getClass(), "lastRegionName", "PTEndmPMzk");
        setField(term20979, term20979.getClass(), "lastClientId", "aJQuCOCvZs");
        setField(term20979, term20979.getClass(), "lastCountryCode", "lHYNCJRiOv");
        setIntField(term20979, term20979.getClass(), "eventPoint", -779100899);
        setIntField(term20979, term20979.getClass(), "totalLv", -1750603840);
        setIntField(term20979, term20979.getClass(), "lastLoginBonusDay", 2088919651);
        setIntField(term20979, term20979.getClass(), "lastSurvivalBonusDay", 949997254);
        setIntField(term20979, term20979.getClass(), "loginBonusLv", 690762493);
        term21153 = new Integer(-1050083704);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term21153;
        callMethod(klass, "setTotalMasterSync", argTypes, term20979, args);
    }

};


