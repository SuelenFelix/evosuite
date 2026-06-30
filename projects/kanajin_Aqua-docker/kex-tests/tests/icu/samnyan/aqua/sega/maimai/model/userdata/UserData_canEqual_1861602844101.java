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

public class UserData_canEqual_1861602844101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26970;
     Object term27144;

    public UserData_canEqual_1861602844101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term26974 = new Long(-8033714905181142681L);
        term26970 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term26972 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term26988 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26989 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26993 = newInstance(Class.forName("java.time.LocalTime"));
        Object term26998 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26999 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27003 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term26970, term26970.getClass(), "id", 3580984732036213717L);
        setLongField(term26972, term26972.getClass(), "id", 5330761990446327930L);
        setField(term26972, term26972.getClass(), "extId", term26974);
        setField(term26972, term26972.getClass(), "luid", "fufeuGfwpN");
        setIntField(term26989, term26989.getClass(), "year", 2024);
        setShortField(term26989, term26989.getClass(), "month", (short) 7);
        setShortField(term26989, term26989.getClass(), "day", (short) 29);
        setField(term26988, term26988.getClass(), "date", term26989);
        setByteField(term26993, term26993.getClass(), "hour", (byte) 19);
        setByteField(term26993, term26993.getClass(), "minute", (byte) 15);
        setByteField(term26993, term26993.getClass(), "second", (byte) 16);
        setIntField(term26993, term26993.getClass(), "nano", 554834199);
        setField(term26988, term26988.getClass(), "time", term26993);
        setField(term26972, term26972.getClass(), "registerTime", term26988);
        setIntField(term26999, term26999.getClass(), "year", 2018);
        setShortField(term26999, term26999.getClass(), "month", (short) 2);
        setShortField(term26999, term26999.getClass(), "day", (short) 13);
        setField(term26998, term26998.getClass(), "date", term26999);
        setByteField(term27003, term27003.getClass(), "hour", (byte) 15);
        setByteField(term27003, term27003.getClass(), "minute", (byte) 1);
        setByteField(term27003, term27003.getClass(), "second", (byte) 45);
        setIntField(term27003, term27003.getClass(), "nano", 380020898);
        setField(term26998, term26998.getClass(), "time", term27003);
        setField(term26972, term26972.getClass(), "accessTime", term26998);
        setField(term26970, term26970.getClass(), "card", term26972);
        setIntField(term26970, term26970.getClass(), "lastDataVersion", 1949719112);
        setField(term26970, term26970.getClass(), "userName", "XJbkXbljvz");
        setIntField(term26970, term26970.getClass(), "point", 203059697);
        setIntField(term26970, term26970.getClass(), "totalPoint", 260352378);
        setIntField(term26970, term26970.getClass(), "iconId", -1344061485);
        setIntField(term26970, term26970.getClass(), "nameplateId", -13926283);
        setIntField(term26970, term26970.getClass(), "frameId", -1240452164);
        setIntField(term26970, term26970.getClass(), "trophyId", 501130109);
        setIntField(term26970, term26970.getClass(), "playCount", -1307655183);
        setIntField(term26970, term26970.getClass(), "playVsCount", 1309934432);
        setIntField(term26970, term26970.getClass(), "playSyncCount", 909183017);
        setIntField(term26970, term26970.getClass(), "winCount", -2115858923);
        setIntField(term26970, term26970.getClass(), "helpCount", 1709658376);
        setIntField(term26970, term26970.getClass(), "comboCount", -1235730396);
        setIntField(term26970, term26970.getClass(), "feverCount", -366600678);
        setIntField(term26970, term26970.getClass(), "totalHiScore", -1641994868);
        setIntField(term26970, term26970.getClass(), "totalEasyHighScore", 1729072481);
        setIntField(term26970, term26970.getClass(), "totalBasicHighScore", -1281635786);
        setIntField(term26970, term26970.getClass(), "totalAdvancedHighScore", 1768552438);
        setIntField(term26970, term26970.getClass(), "totalExpertHighScore", -166990524);
        setIntField(term26970, term26970.getClass(), "totalMasterHighScore", -1302306468);
        setIntField(term26970, term26970.getClass(), "totalReMasterHighScore", -659361866);
        setIntField(term26970, term26970.getClass(), "totalHighSync", -2010825883);
        setIntField(term26970, term26970.getClass(), "totalEasySync", 1230224947);
        setIntField(term26970, term26970.getClass(), "totalBasicSync", 739759836);
        setIntField(term26970, term26970.getClass(), "totalAdvancedSync", -1233408249);
        setIntField(term26970, term26970.getClass(), "totalExpertSync", 1252145496);
        setIntField(term26970, term26970.getClass(), "totalMasterSync", -469940082);
        setIntField(term26970, term26970.getClass(), "totalReMasterSync", -821294367);
        setIntField(term26970, term26970.getClass(), "playerRating", -1260916319);
        setIntField(term26970, term26970.getClass(), "highestRating", 740454987);
        setIntField(term26970, term26970.getClass(), "rankAuthTailId", -2100331324);
        setField(term26970, term26970.getClass(), "eventWatchedDate", "fuvdkDwBeH");
        setField(term26970, term26970.getClass(), "webLimitDate", "NTefzwLPhx");
        setIntField(term26970, term26970.getClass(), "challengeTrackPhase", 2062095733);
        setIntField(term26970, term26970.getClass(), "firstPlayBits", -7331803);
        setField(term26970, term26970.getClass(), "lastPlayDate", "dirFuhqyNu");
        setIntField(term26970, term26970.getClass(), "lastPlaceId", 1725012686);
        setField(term26970, term26970.getClass(), "lastPlaceName", "YVLRenzuoR");
        setIntField(term26970, term26970.getClass(), "lastRegionId", -309653587);
        setField(term26970, term26970.getClass(), "lastRegionName", "JukEMhPWql");
        setField(term26970, term26970.getClass(), "lastClientId", "ZdNcodHERG");
        setField(term26970, term26970.getClass(), "lastCountryCode", "CLHomjAqIM");
        setIntField(term26970, term26970.getClass(), "eventPoint", 1988824012);
        setIntField(term26970, term26970.getClass(), "totalLv", 365061041);
        setIntField(term26970, term26970.getClass(), "lastLoginBonusDay", 205907008);
        setIntField(term26970, term26970.getClass(), "lastSurvivalBonusDay", -1281782269);
        setIntField(term26970, term26970.getClass(), "loginBonusLv", -1728872282);
        term27144 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term27144;
        callMethod(klass, "canEqual", argTypes, term26970, args);
    }

};


