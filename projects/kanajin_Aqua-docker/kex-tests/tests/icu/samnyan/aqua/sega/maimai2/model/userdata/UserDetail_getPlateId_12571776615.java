package icu.samnyan.aqua.sega.maimai2.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai2.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Integer;

public class UserDetail_getPlateId_12571776615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term198409;

    public UserDetail_getPlateId_12571776615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term198413 = new Long(-432424084523104253L);
        Integer term198476 = new Integer(-1415507503);
        ArrayList term198474 = new ArrayList();
        ((ArrayList) term198474).add(term198476);
        Integer term198482 = new Integer(424884647);
        Integer term198484 = new Integer(-881760055);
        Integer term198486 = new Integer(873700519);
        ArrayList term198480 = new ArrayList();
        ((ArrayList) term198480).add(term198482);
        ((ArrayList) term198480).add(term198484);
        ((ArrayList) term198480).add(term198486);
        term198409 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term198411 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term198427 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term198428 = newInstance(Class.forName("java.time.LocalDate"));
        Object term198432 = newInstance(Class.forName("java.time.LocalTime"));
        Object term198437 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term198438 = newInstance(Class.forName("java.time.LocalDate"));
        Object term198442 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term198409, term198409.getClass(), "id", 1387221881631678771L);
        setLongField(term198411, term198411.getClass(), "id", 5916238721449000892L);
        setField(term198411, term198411.getClass(), "extId", term198413);
        setField(term198411, term198411.getClass(), "luid", "ShXGmqyilA");
        setIntField(term198428, term198428.getClass(), "year", 2029);
        setShortField(term198428, term198428.getClass(), "month", (short) 11);
        setShortField(term198428, term198428.getClass(), "day", (short) 6);
        setField(term198427, term198427.getClass(), "date", term198428);
        setByteField(term198432, term198432.getClass(), "hour", (byte) 10);
        setByteField(term198432, term198432.getClass(), "minute", (byte) 49);
        setByteField(term198432, term198432.getClass(), "second", (byte) 58);
        setIntField(term198432, term198432.getClass(), "nano", 611097210);
        setField(term198427, term198427.getClass(), "time", term198432);
        setField(term198411, term198411.getClass(), "registerTime", term198427);
        setIntField(term198438, term198438.getClass(), "year", 2024);
        setShortField(term198438, term198438.getClass(), "month", (short) 1);
        setShortField(term198438, term198438.getClass(), "day", (short) 6);
        setField(term198437, term198437.getClass(), "date", term198438);
        setByteField(term198442, term198442.getClass(), "hour", (byte) 6);
        setByteField(term198442, term198442.getClass(), "minute", (byte) 55);
        setByteField(term198442, term198442.getClass(), "second", (byte) 13);
        setIntField(term198442, term198442.getClass(), "nano", 533001418);
        setField(term198437, term198437.getClass(), "time", term198442);
        setField(term198411, term198411.getClass(), "accessTime", term198437);
        setField(term198409, term198409.getClass(), "card", term198411);
        setField(term198409, term198409.getClass(), "userName", "MeUcNMgaea");
        setIntField(term198409, term198409.getClass(), "isNetMember", -774130445);
        setIntField(term198409, term198409.getClass(), "iconId", 1186959709);
        setIntField(term198409, term198409.getClass(), "plateId", 627006138);
        setIntField(term198409, term198409.getClass(), "titleId", 473286732);
        setIntField(term198409, term198409.getClass(), "partnerId", 1705432758);
        setIntField(term198409, term198409.getClass(), "frameId", 1869760927);
        setIntField(term198409, term198409.getClass(), "selectMapId", 1737709990);
        setIntField(term198409, term198409.getClass(), "totalAwake", -1596985572);
        setIntField(term198409, term198409.getClass(), "gradeRating", -1547597017);
        setIntField(term198409, term198409.getClass(), "musicRating", -1899999573);
        setIntField(term198409, term198409.getClass(), "playerRating", 50986188);
        setIntField(term198409, term198409.getClass(), "highestRating", -1798385983);
        setIntField(term198409, term198409.getClass(), "gradeRank", -1751426385);
        setIntField(term198409, term198409.getClass(), "classRank", -2043903065);
        setIntField(term198409, term198409.getClass(), "courseRank", -1301683464);
        setField(term198409, term198409.getClass(), "charaSlot", term198474);
        setField(term198409, term198409.getClass(), "charaLockSlot", term198480);
        setLongField(term198409, term198409.getClass(), "contentBit", -6635895019836817944L);
        setIntField(term198409, term198409.getClass(), "playCount", 1838060666);
        setField(term198409, term198409.getClass(), "eventWatchedDate", "VgoGzzzTIS");
        setField(term198409, term198409.getClass(), "lastGameId", "KejYXFChCQ");
        setField(term198409, term198409.getClass(), "lastRomVersion", "KovioHqXLs");
        setField(term198409, term198409.getClass(), "lastDataVersion", "rAnoDZpUvP");
        setField(term198409, term198409.getClass(), "lastLoginDate", "tPIaNOLEjH");
        setField(term198409, term198409.getClass(), "lastPlayDate", "hImewbCvKZ");
        setIntField(term198409, term198409.getClass(), "lastPlayCredit", -1354834639);
        setIntField(term198409, term198409.getClass(), "lastPlayMode", 1855161601);
        setIntField(term198409, term198409.getClass(), "lastPlaceId", 1447406432);
        setField(term198409, term198409.getClass(), "lastPlaceName", "eAvCoinDEL");
        setIntField(term198409, term198409.getClass(), "lastAllNetId", -1261622822);
        setIntField(term198409, term198409.getClass(), "lastRegionId", 1191113274);
        setField(term198409, term198409.getClass(), "lastRegionName", "VTFTvSdVnp");
        setField(term198409, term198409.getClass(), "lastClientId", "MiXdRkhjVA");
        setField(term198409, term198409.getClass(), "lastCountryCode", "VFNmRuSuAA");
        setIntField(term198409, term198409.getClass(), "lastSelectEMoney", -1722069360);
        setIntField(term198409, term198409.getClass(), "lastSelectTicket", -1495659787);
        setIntField(term198409, term198409.getClass(), "lastSelectCourse", -13450873);
        setIntField(term198409, term198409.getClass(), "lastCountCourse", 214091895);
        setField(term198409, term198409.getClass(), "firstGameId", "kZarUDgTET");
        setField(term198409, term198409.getClass(), "firstRomVersion", "znhFQgvSYU");
        setField(term198409, term198409.getClass(), "firstDataVersion", "mDNkQJxmYt");
        setField(term198409, term198409.getClass(), "firstPlayDate", "xZNZPvTRXV");
        setField(term198409, term198409.getClass(), "compatibleCmVersion", "ARslLYbNsq");
        setField(term198409, term198409.getClass(), "dailyBonusDate", "zUcrEiuHPJ");
        setField(term198409, term198409.getClass(), "dailyCourseBonusDate", "rKTibRPvGg");
        setField(term198409, term198409.getClass(), "lastPairLoginDate", "vjqbRhtwdP");
        setField(term198409, term198409.getClass(), "lastTrialPlayDate", "UqkCPMSVRK");
        setIntField(term198409, term198409.getClass(), "playVsCount", -1653301256);
        setIntField(term198409, term198409.getClass(), "playSyncCount", 1107780347);
        setIntField(term198409, term198409.getClass(), "winCount", 1162865727);
        setIntField(term198409, term198409.getClass(), "helpCount", 46557287);
        setIntField(term198409, term198409.getClass(), "comboCount", 1977860945);
        setLongField(term198409, term198409.getClass(), "totalDeluxscore", 313937491655292425L);
        setLongField(term198409, term198409.getClass(), "totalBasicDeluxscore", 2395306803372361789L);
        setLongField(term198409, term198409.getClass(), "totalAdvancedDeluxscore", 3404140293557584459L);
        setLongField(term198409, term198409.getClass(), "totalExpertDeluxscore", 4367141646424029218L);
        setLongField(term198409, term198409.getClass(), "totalMasterDeluxscore", -2295495097049715790L);
        setLongField(term198409, term198409.getClass(), "totalReMasterDeluxscore", 6561564014211458803L);
        setIntField(term198409, term198409.getClass(), "totalSync", -449467173);
        setIntField(term198409, term198409.getClass(), "totalBasicSync", -1896252900);
        setIntField(term198409, term198409.getClass(), "totalAdvancedSync", -1530087856);
        setIntField(term198409, term198409.getClass(), "totalExpertSync", -1430480374);
        setIntField(term198409, term198409.getClass(), "totalMasterSync", -294990025);
        setIntField(term198409, term198409.getClass(), "totalReMasterSync", -1062556648);
        setLongField(term198409, term198409.getClass(), "totalAchievement", 8887091749598931285L);
        setLongField(term198409, term198409.getClass(), "totalBasicAchievement", 8571127439910031865L);
        setLongField(term198409, term198409.getClass(), "totalAdvancedAchievement", -691540277685530027L);
        setLongField(term198409, term198409.getClass(), "totalExpertAchievement", -3455464316097576650L);
        setLongField(term198409, term198409.getClass(), "totalMasterAchievement", 5727167095354223682L);
        setLongField(term198409, term198409.getClass(), "totalReMasterAchievement", 1228393249690916449L);
        setLongField(term198409, term198409.getClass(), "playerOldRating", 2198010427584003004L);
        setLongField(term198409, term198409.getClass(), "playerNewRating", -443151478836115409L);
        setIntField(term198409, term198409.getClass(), "banState", -1323622538);
        setLongField(term198409, term198409.getClass(), "dateTime", 9087586494678498141L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlateId", argTypes, term198409, args);
    }

};


