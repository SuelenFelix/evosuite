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

public class UserDetail_setPlaySyncCount_538431612128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term268518;
     Object term268887;

    public UserDetail_setPlaySyncCount_538431612128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term268522 = new Long(-4663904610228258188L);
        Integer term268585 = new Integer(-1360145510);
        Integer term268587 = new Integer(-1122695171);
        Integer term268589 = new Integer(-1304945951);
        Integer term268591 = new Integer(1324880713);
        Integer term268593 = new Integer(-331841554);
        Integer term268595 = new Integer(913848623);
        Integer term268597 = new Integer(1449221084);
        ArrayList term268583 = new ArrayList();
        ((ArrayList) term268583).add(term268585);
        ((ArrayList) term268583).add(term268587);
        ((ArrayList) term268583).add(term268589);
        ((ArrayList) term268583).add(term268591);
        ((ArrayList) term268583).add(term268593);
        ((ArrayList) term268583).add(term268595);
        ((ArrayList) term268583).add(term268597);
        Integer term268603 = new Integer(-217809217);
        Integer term268605 = new Integer(-473949548);
        Integer term268607 = new Integer(1898831696);
        Integer term268609 = new Integer(1811064455);
        Integer term268611 = new Integer(1183674366);
        Integer term268613 = new Integer(2120314865);
        Integer term268615 = new Integer(-1783088801);
        Integer term268617 = new Integer(353452001);
        ArrayList term268601 = new ArrayList();
        ((ArrayList) term268601).add(term268603);
        ((ArrayList) term268601).add(term268605);
        ((ArrayList) term268601).add(term268607);
        ((ArrayList) term268601).add(term268609);
        ((ArrayList) term268601).add(term268611);
        ((ArrayList) term268601).add(term268613);
        ((ArrayList) term268601).add(term268615);
        ((ArrayList) term268601).add(term268617);
        term268518 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term268520 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term268536 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term268537 = newInstance(Class.forName("java.time.LocalDate"));
        Object term268541 = newInstance(Class.forName("java.time.LocalTime"));
        Object term268546 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term268547 = newInstance(Class.forName("java.time.LocalDate"));
        Object term268551 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term268518, term268518.getClass(), "id", 3009385010476388466L);
        setLongField(term268520, term268520.getClass(), "id", 5336136273200788894L);
        setField(term268520, term268520.getClass(), "extId", term268522);
        setField(term268520, term268520.getClass(), "luid", "nirCEPCEzD");
        setIntField(term268537, term268537.getClass(), "year", 2022);
        setShortField(term268537, term268537.getClass(), "month", (short) 6);
        setShortField(term268537, term268537.getClass(), "day", (short) 15);
        setField(term268536, term268536.getClass(), "date", term268537);
        setByteField(term268541, term268541.getClass(), "hour", (byte) 22);
        setByteField(term268541, term268541.getClass(), "minute", (byte) 45);
        setByteField(term268541, term268541.getClass(), "second", (byte) 15);
        setIntField(term268541, term268541.getClass(), "nano", 210438417);
        setField(term268536, term268536.getClass(), "time", term268541);
        setField(term268520, term268520.getClass(), "registerTime", term268536);
        setIntField(term268547, term268547.getClass(), "year", 2028);
        setShortField(term268547, term268547.getClass(), "month", (short) 5);
        setShortField(term268547, term268547.getClass(), "day", (short) 11);
        setField(term268546, term268546.getClass(), "date", term268547);
        setByteField(term268551, term268551.getClass(), "hour", (byte) 1);
        setByteField(term268551, term268551.getClass(), "minute", (byte) 18);
        setByteField(term268551, term268551.getClass(), "second", (byte) 27);
        setIntField(term268551, term268551.getClass(), "nano", 514067112);
        setField(term268546, term268546.getClass(), "time", term268551);
        setField(term268520, term268520.getClass(), "accessTime", term268546);
        setField(term268518, term268518.getClass(), "card", term268520);
        setField(term268518, term268518.getClass(), "userName", "wPRvAQKTop");
        setIntField(term268518, term268518.getClass(), "isNetMember", 564331);
        setIntField(term268518, term268518.getClass(), "iconId", -631621459);
        setIntField(term268518, term268518.getClass(), "plateId", -896986933);
        setIntField(term268518, term268518.getClass(), "titleId", -272073305);
        setIntField(term268518, term268518.getClass(), "partnerId", 1586776007);
        setIntField(term268518, term268518.getClass(), "frameId", 416678466);
        setIntField(term268518, term268518.getClass(), "selectMapId", -505598314);
        setIntField(term268518, term268518.getClass(), "totalAwake", -1431423805);
        setIntField(term268518, term268518.getClass(), "gradeRating", -1119901942);
        setIntField(term268518, term268518.getClass(), "musicRating", 174305035);
        setIntField(term268518, term268518.getClass(), "playerRating", 681540406);
        setIntField(term268518, term268518.getClass(), "highestRating", 1248693910);
        setIntField(term268518, term268518.getClass(), "gradeRank", -195386022);
        setIntField(term268518, term268518.getClass(), "classRank", 1447852280);
        setIntField(term268518, term268518.getClass(), "courseRank", -405514470);
        setField(term268518, term268518.getClass(), "charaSlot", term268583);
        setField(term268518, term268518.getClass(), "charaLockSlot", term268601);
        setLongField(term268518, term268518.getClass(), "contentBit", 2888276482356009431L);
        setIntField(term268518, term268518.getClass(), "playCount", -1944960616);
        setField(term268518, term268518.getClass(), "eventWatchedDate", "OhnhYqFRhK");
        setField(term268518, term268518.getClass(), "lastGameId", "muqzcvKPzU");
        setField(term268518, term268518.getClass(), "lastRomVersion", "LIfRcijYBP");
        setField(term268518, term268518.getClass(), "lastDataVersion", "UWfjAouyWX");
        setField(term268518, term268518.getClass(), "lastLoginDate", "lXEruUZEjX");
        setField(term268518, term268518.getClass(), "lastPlayDate", "BMZYmMvpIa");
        setIntField(term268518, term268518.getClass(), "lastPlayCredit", 134129921);
        setIntField(term268518, term268518.getClass(), "lastPlayMode", 1074423492);
        setIntField(term268518, term268518.getClass(), "lastPlaceId", 1347101666);
        setField(term268518, term268518.getClass(), "lastPlaceName", "vpVENawnlE");
        setIntField(term268518, term268518.getClass(), "lastAllNetId", 1898176333);
        setIntField(term268518, term268518.getClass(), "lastRegionId", 1538029461);
        setField(term268518, term268518.getClass(), "lastRegionName", "dgciCbbLcm");
        setField(term268518, term268518.getClass(), "lastClientId", "MaoZhZpQjB");
        setField(term268518, term268518.getClass(), "lastCountryCode", "geQbYhZCon");
        setIntField(term268518, term268518.getClass(), "lastSelectEMoney", 95078217);
        setIntField(term268518, term268518.getClass(), "lastSelectTicket", -1362477279);
        setIntField(term268518, term268518.getClass(), "lastSelectCourse", 509325750);
        setIntField(term268518, term268518.getClass(), "lastCountCourse", -1449019304);
        setField(term268518, term268518.getClass(), "firstGameId", "csWAyLZbkB");
        setField(term268518, term268518.getClass(), "firstRomVersion", "LLoBZeTRNx");
        setField(term268518, term268518.getClass(), "firstDataVersion", "LZXzTxEMXE");
        setField(term268518, term268518.getClass(), "firstPlayDate", "DTixVvtuBb");
        setField(term268518, term268518.getClass(), "compatibleCmVersion", "HZRpEXkRHd");
        setField(term268518, term268518.getClass(), "dailyBonusDate", "xbjtwqetFF");
        setField(term268518, term268518.getClass(), "dailyCourseBonusDate", "lPeJoACpkg");
        setField(term268518, term268518.getClass(), "lastPairLoginDate", "NOaxSWPYxb");
        setField(term268518, term268518.getClass(), "lastTrialPlayDate", "tJAeYhYvPl");
        setIntField(term268518, term268518.getClass(), "playVsCount", -292778481);
        setIntField(term268518, term268518.getClass(), "playSyncCount", 1790535012);
        setIntField(term268518, term268518.getClass(), "winCount", 517372938);
        setIntField(term268518, term268518.getClass(), "helpCount", 270121185);
        setIntField(term268518, term268518.getClass(), "comboCount", -1613798107);
        setLongField(term268518, term268518.getClass(), "totalDeluxscore", -2899742477235888514L);
        setLongField(term268518, term268518.getClass(), "totalBasicDeluxscore", 1456050377961927969L);
        setLongField(term268518, term268518.getClass(), "totalAdvancedDeluxscore", 3276226064209080327L);
        setLongField(term268518, term268518.getClass(), "totalExpertDeluxscore", -6112475796213844665L);
        setLongField(term268518, term268518.getClass(), "totalMasterDeluxscore", -4765706057786455710L);
        setLongField(term268518, term268518.getClass(), "totalReMasterDeluxscore", -5743938879529454475L);
        setIntField(term268518, term268518.getClass(), "totalSync", 182501747);
        setIntField(term268518, term268518.getClass(), "totalBasicSync", 466948774);
        setIntField(term268518, term268518.getClass(), "totalAdvancedSync", 63133691);
        setIntField(term268518, term268518.getClass(), "totalExpertSync", -1950250956);
        setIntField(term268518, term268518.getClass(), "totalMasterSync", -1468847146);
        setIntField(term268518, term268518.getClass(), "totalReMasterSync", 316276289);
        setLongField(term268518, term268518.getClass(), "totalAchievement", -8581042680392065672L);
        setLongField(term268518, term268518.getClass(), "totalBasicAchievement", 5873007084205222191L);
        setLongField(term268518, term268518.getClass(), "totalAdvancedAchievement", -3452496885728491852L);
        setLongField(term268518, term268518.getClass(), "totalExpertAchievement", 6590477605408975292L);
        setLongField(term268518, term268518.getClass(), "totalMasterAchievement", 4873581149688877837L);
        setLongField(term268518, term268518.getClass(), "totalReMasterAchievement", 6767810565797855681L);
        setLongField(term268518, term268518.getClass(), "playerOldRating", 2236639777814973507L);
        setLongField(term268518, term268518.getClass(), "playerNewRating", 6934172739843259947L);
        setIntField(term268518, term268518.getClass(), "banState", -2031076660);
        setLongField(term268518, term268518.getClass(), "dateTime", 1834765450238984296L);
        term268887 = new Integer(266845392);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term268887;
        callMethod(klass, "setPlaySyncCount", argTypes, term268518, args);
    }

};


