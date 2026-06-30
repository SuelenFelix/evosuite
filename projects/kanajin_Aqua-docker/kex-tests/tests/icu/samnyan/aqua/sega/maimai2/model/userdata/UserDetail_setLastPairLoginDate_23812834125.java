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

public class UserDetail_setLastPairLoginDate_23812834125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4300870;

    public UserDetail_setLastPairLoginDate_23812834125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4300874 = new Long(8598124661374154993L);
        Integer term4300937 = new Integer(-1041405094);
        Integer term4300939 = new Integer(-2004362129);
        Integer term4300941 = new Integer(1709267900);
        Integer term4300943 = new Integer(-2036597343);
        Integer term4300945 = new Integer(-988488193);
        Integer term4300947 = new Integer(-910318730);
        Integer term4300949 = new Integer(-1198085025);
        Integer term4300951 = new Integer(-1420655161);
        Integer term4300953 = new Integer(559777465);
        ArrayList term4300935 = new ArrayList();
        ((ArrayList) term4300935).add(term4300937);
        ((ArrayList) term4300935).add(term4300939);
        ((ArrayList) term4300935).add(term4300941);
        ((ArrayList) term4300935).add(term4300943);
        ((ArrayList) term4300935).add(term4300945);
        ((ArrayList) term4300935).add(term4300947);
        ((ArrayList) term4300935).add(term4300949);
        ((ArrayList) term4300935).add(term4300951);
        ((ArrayList) term4300935).add(term4300953);
        ArrayList term4300957 = new ArrayList();
        term4300870 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4300872 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4300888 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4300889 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4300893 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4300898 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4300899 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4300903 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4300870, term4300870.getClass(), "id", 4284449121514517566L);
        setLongField(term4300872, term4300872.getClass(), "id", 327598459666944358L);
        setField(term4300872, term4300872.getClass(), "extId", term4300874);
        setField(term4300872, term4300872.getClass(), "luid", "RSGHsTLMxj");
        setIntField(term4300889, term4300889.getClass(), "year", 2019);
        setShortField(term4300889, term4300889.getClass(), "month", (short) 5);
        setShortField(term4300889, term4300889.getClass(), "day", (short) 25);
        setField(term4300888, term4300888.getClass(), "date", term4300889);
        setByteField(term4300893, term4300893.getClass(), "hour", (byte) 9);
        setByteField(term4300893, term4300893.getClass(), "minute", (byte) 58);
        setByteField(term4300893, term4300893.getClass(), "second", (byte) 18);
        setIntField(term4300893, term4300893.getClass(), "nano", 189268038);
        setField(term4300888, term4300888.getClass(), "time", term4300893);
        setField(term4300872, term4300872.getClass(), "registerTime", term4300888);
        setIntField(term4300899, term4300899.getClass(), "year", 2012);
        setShortField(term4300899, term4300899.getClass(), "month", (short) 6);
        setShortField(term4300899, term4300899.getClass(), "day", (short) 13);
        setField(term4300898, term4300898.getClass(), "date", term4300899);
        setByteField(term4300903, term4300903.getClass(), "hour", (byte) 0);
        setByteField(term4300903, term4300903.getClass(), "minute", (byte) 6);
        setByteField(term4300903, term4300903.getClass(), "second", (byte) 18);
        setIntField(term4300903, term4300903.getClass(), "nano", 838480902);
        setField(term4300898, term4300898.getClass(), "time", term4300903);
        setField(term4300872, term4300872.getClass(), "accessTime", term4300898);
        setField(term4300870, term4300870.getClass(), "card", term4300872);
        setField(term4300870, term4300870.getClass(), "userName", "QhpctxWTuN");
        setIntField(term4300870, term4300870.getClass(), "isNetMember", -1428858125);
        setIntField(term4300870, term4300870.getClass(), "iconId", -1564148413);
        setIntField(term4300870, term4300870.getClass(), "plateId", 421871100);
        setIntField(term4300870, term4300870.getClass(), "titleId", 831058762);
        setIntField(term4300870, term4300870.getClass(), "partnerId", 1922354154);
        setIntField(term4300870, term4300870.getClass(), "frameId", 1818355660);
        setIntField(term4300870, term4300870.getClass(), "selectMapId", -287784747);
        setIntField(term4300870, term4300870.getClass(), "totalAwake", -1357733580);
        setIntField(term4300870, term4300870.getClass(), "gradeRating", 1593446184);
        setIntField(term4300870, term4300870.getClass(), "musicRating", -390404463);
        setIntField(term4300870, term4300870.getClass(), "playerRating", -786638550);
        setIntField(term4300870, term4300870.getClass(), "highestRating", -1476808308);
        setIntField(term4300870, term4300870.getClass(), "gradeRank", 938989412);
        setIntField(term4300870, term4300870.getClass(), "classRank", -1345120891);
        setIntField(term4300870, term4300870.getClass(), "courseRank", 625575070);
        setField(term4300870, term4300870.getClass(), "charaSlot", term4300935);
        setField(term4300870, term4300870.getClass(), "charaLockSlot", term4300957);
        setLongField(term4300870, term4300870.getClass(), "contentBit", -3252755712294354943L);
        setIntField(term4300870, term4300870.getClass(), "playCount", -2117104770);
        setField(term4300870, term4300870.getClass(), "eventWatchedDate", "OFCiOevrUe");
        setField(term4300870, term4300870.getClass(), "lastGameId", "HcXRraGRxa");
        setField(term4300870, term4300870.getClass(), "lastRomVersion", "kXsAPnfYSh");
        setField(term4300870, term4300870.getClass(), "lastDataVersion", "RHxUfMhSEX");
        setField(term4300870, term4300870.getClass(), "lastLoginDate", "OLCkDzdloD");
        setField(term4300870, term4300870.getClass(), "lastPlayDate", "mlZouJCSFp");
        setIntField(term4300870, term4300870.getClass(), "lastPlayCredit", 1115356243);
        setIntField(term4300870, term4300870.getClass(), "lastPlayMode", 1702162816);
        setIntField(term4300870, term4300870.getClass(), "lastPlaceId", -1806055736);
        setField(term4300870, term4300870.getClass(), "lastPlaceName", "fUWgvadSaJ");
        setIntField(term4300870, term4300870.getClass(), "lastAllNetId", 812473743);
        setIntField(term4300870, term4300870.getClass(), "lastRegionId", 1088513577);
        setField(term4300870, term4300870.getClass(), "lastRegionName", "gSYqTcQNmh");
        setField(term4300870, term4300870.getClass(), "lastClientId", "SdNGihFoDX");
        setField(term4300870, term4300870.getClass(), "lastCountryCode", "CpnFNsvaDD");
        setIntField(term4300870, term4300870.getClass(), "lastSelectEMoney", 1495086966);
        setIntField(term4300870, term4300870.getClass(), "lastSelectTicket", 40200794);
        setIntField(term4300870, term4300870.getClass(), "lastSelectCourse", 1031909871);
        setIntField(term4300870, term4300870.getClass(), "lastCountCourse", 1928703326);
        setField(term4300870, term4300870.getClass(), "firstGameId", "naHWhipwgj");
        setField(term4300870, term4300870.getClass(), "firstRomVersion", "waRQPMtAZZ");
        setField(term4300870, term4300870.getClass(), "firstDataVersion", "RmjDLhCPiI");
        setField(term4300870, term4300870.getClass(), "firstPlayDate", "ujSOhpdMxO");
        setField(term4300870, term4300870.getClass(), "compatibleCmVersion", "iUWwZmQwXr");
        setField(term4300870, term4300870.getClass(), "dailyBonusDate", "iUohvsrKWZ");
        setField(term4300870, term4300870.getClass(), "dailyCourseBonusDate", "DgdYBRyNZR");
        setField(term4300870, term4300870.getClass(), "lastPairLoginDate", "fneRkrUhXm");
        setField(term4300870, term4300870.getClass(), "lastTrialPlayDate", "NXsltKXsLc");
        setIntField(term4300870, term4300870.getClass(), "playVsCount", -698875157);
        setIntField(term4300870, term4300870.getClass(), "playSyncCount", 445853828);
        setIntField(term4300870, term4300870.getClass(), "winCount", 1567781905);
        setIntField(term4300870, term4300870.getClass(), "helpCount", -2019659083);
        setIntField(term4300870, term4300870.getClass(), "comboCount", 825024422);
        setLongField(term4300870, term4300870.getClass(), "totalDeluxscore", 6875979849310190624L);
        setLongField(term4300870, term4300870.getClass(), "totalBasicDeluxscore", 8510880700394649832L);
        setLongField(term4300870, term4300870.getClass(), "totalAdvancedDeluxscore", 3850498915132106445L);
        setLongField(term4300870, term4300870.getClass(), "totalExpertDeluxscore", -3007605412379013789L);
        setLongField(term4300870, term4300870.getClass(), "totalMasterDeluxscore", -8992324062550639556L);
        setLongField(term4300870, term4300870.getClass(), "totalReMasterDeluxscore", 3672726516790724731L);
        setIntField(term4300870, term4300870.getClass(), "totalSync", 452203162);
        setIntField(term4300870, term4300870.getClass(), "totalBasicSync", -203342979);
        setIntField(term4300870, term4300870.getClass(), "totalAdvancedSync", -1210272903);
        setIntField(term4300870, term4300870.getClass(), "totalExpertSync", 1791869604);
        setIntField(term4300870, term4300870.getClass(), "totalMasterSync", 1067350515);
        setIntField(term4300870, term4300870.getClass(), "totalReMasterSync", 1621684196);
        setLongField(term4300870, term4300870.getClass(), "totalAchievement", 9051114352773163259L);
        setLongField(term4300870, term4300870.getClass(), "totalBasicAchievement", 7873099326128544057L);
        setLongField(term4300870, term4300870.getClass(), "totalAdvancedAchievement", -6750970942822528155L);
        setLongField(term4300870, term4300870.getClass(), "totalExpertAchievement", 5844923288195066952L);
        setLongField(term4300870, term4300870.getClass(), "totalMasterAchievement", 605595988812128223L);
        setLongField(term4300870, term4300870.getClass(), "totalReMasterAchievement", 2545714029460372441L);
        setLongField(term4300870, term4300870.getClass(), "playerOldRating", 3022896291404557662L);
        setLongField(term4300870, term4300870.getClass(), "playerNewRating", 6296640573682530758L);
        setIntField(term4300870, term4300870.getClass(), "banState", 178560521);
        setLongField(term4300870, term4300870.getClass(), "dateTime", 3791245609360815659L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "oHXnhjNjLc";
        callMethod(klass, "setLastPairLoginDate", argTypes, term4300870, args);
    }

};


