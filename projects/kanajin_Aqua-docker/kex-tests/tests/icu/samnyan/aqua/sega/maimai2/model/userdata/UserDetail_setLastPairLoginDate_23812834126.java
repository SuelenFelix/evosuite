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

public class UserDetail_setLastPairLoginDate_23812834126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term266828;

    public UserDetail_setLastPairLoginDate_23812834126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term266832 = new Long(-3058119213533262883L);
        Integer term266895 = new Integer(-132156499);
        Integer term266897 = new Integer(-1222668512);
        Integer term266899 = new Integer(1109294828);
        Integer term266901 = new Integer(-596850824);
        Integer term266903 = new Integer(1619317687);
        Integer term266905 = new Integer(-1335475299);
        Integer term266907 = new Integer(1764067908);
        Integer term266909 = new Integer(1906236006);
        Integer term266911 = new Integer(-279175941);
        ArrayList term266893 = new ArrayList();
        ((ArrayList) term266893).add(term266895);
        ((ArrayList) term266893).add(term266897);
        ((ArrayList) term266893).add(term266899);
        ((ArrayList) term266893).add(term266901);
        ((ArrayList) term266893).add(term266903);
        ((ArrayList) term266893).add(term266905);
        ((ArrayList) term266893).add(term266907);
        ((ArrayList) term266893).add(term266909);
        ((ArrayList) term266893).add(term266911);
        Integer term266917 = new Integer(-574044161);
        Integer term266919 = new Integer(-101199395);
        Integer term266921 = new Integer(894150826);
        Integer term266923 = new Integer(-261894603);
        Integer term266925 = new Integer(1163902450);
        Integer term266927 = new Integer(548941697);
        Integer term266929 = new Integer(647865140);
        ArrayList term266915 = new ArrayList();
        ((ArrayList) term266915).add(term266917);
        ((ArrayList) term266915).add(term266919);
        ((ArrayList) term266915).add(term266921);
        ((ArrayList) term266915).add(term266923);
        ((ArrayList) term266915).add(term266925);
        ((ArrayList) term266915).add(term266927);
        ((ArrayList) term266915).add(term266929);
        term266828 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term266830 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term266846 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term266847 = newInstance(Class.forName("java.time.LocalDate"));
        Object term266851 = newInstance(Class.forName("java.time.LocalTime"));
        Object term266856 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term266857 = newInstance(Class.forName("java.time.LocalDate"));
        Object term266861 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term266828, term266828.getClass(), "id", 4152090055699589035L);
        setLongField(term266830, term266830.getClass(), "id", 956722791214746115L);
        setField(term266830, term266830.getClass(), "extId", term266832);
        setField(term266830, term266830.getClass(), "luid", "IkxYpScZwm");
        setIntField(term266847, term266847.getClass(), "year", 2020);
        setShortField(term266847, term266847.getClass(), "month", (short) 5);
        setShortField(term266847, term266847.getClass(), "day", (short) 12);
        setField(term266846, term266846.getClass(), "date", term266847);
        setByteField(term266851, term266851.getClass(), "hour", (byte) 13);
        setByteField(term266851, term266851.getClass(), "minute", (byte) 11);
        setByteField(term266851, term266851.getClass(), "second", (byte) 59);
        setIntField(term266851, term266851.getClass(), "nano", 36534511);
        setField(term266846, term266846.getClass(), "time", term266851);
        setField(term266830, term266830.getClass(), "registerTime", term266846);
        setIntField(term266857, term266857.getClass(), "year", 2012);
        setShortField(term266857, term266857.getClass(), "month", (short) 8);
        setShortField(term266857, term266857.getClass(), "day", (short) 29);
        setField(term266856, term266856.getClass(), "date", term266857);
        setByteField(term266861, term266861.getClass(), "hour", (byte) 18);
        setByteField(term266861, term266861.getClass(), "minute", (byte) 51);
        setByteField(term266861, term266861.getClass(), "second", (byte) 22);
        setIntField(term266861, term266861.getClass(), "nano", 659205197);
        setField(term266856, term266856.getClass(), "time", term266861);
        setField(term266830, term266830.getClass(), "accessTime", term266856);
        setField(term266828, term266828.getClass(), "card", term266830);
        setField(term266828, term266828.getClass(), "userName", "soyBRfWJGI");
        setIntField(term266828, term266828.getClass(), "isNetMember", 1148281986);
        setIntField(term266828, term266828.getClass(), "iconId", -1538825569);
        setIntField(term266828, term266828.getClass(), "plateId", 1826544810);
        setIntField(term266828, term266828.getClass(), "titleId", -1542241279);
        setIntField(term266828, term266828.getClass(), "partnerId", -1509334840);
        setIntField(term266828, term266828.getClass(), "frameId", -129880080);
        setIntField(term266828, term266828.getClass(), "selectMapId", 1166061260);
        setIntField(term266828, term266828.getClass(), "totalAwake", 1047181690);
        setIntField(term266828, term266828.getClass(), "gradeRating", -1074428691);
        setIntField(term266828, term266828.getClass(), "musicRating", -185766851);
        setIntField(term266828, term266828.getClass(), "playerRating", 1974594542);
        setIntField(term266828, term266828.getClass(), "highestRating", -260638222);
        setIntField(term266828, term266828.getClass(), "gradeRank", -1756194305);
        setIntField(term266828, term266828.getClass(), "classRank", 83370923);
        setIntField(term266828, term266828.getClass(), "courseRank", -1299639537);
        setField(term266828, term266828.getClass(), "charaSlot", term266893);
        setField(term266828, term266828.getClass(), "charaLockSlot", term266915);
        setLongField(term266828, term266828.getClass(), "contentBit", -4934550737686713529L);
        setIntField(term266828, term266828.getClass(), "playCount", -1373829729);
        setField(term266828, term266828.getClass(), "eventWatchedDate", "fboIWAsrJZ");
        setField(term266828, term266828.getClass(), "lastGameId", "vqgXCbtNCu");
        setField(term266828, term266828.getClass(), "lastRomVersion", "kpkWNprGhK");
        setField(term266828, term266828.getClass(), "lastDataVersion", "AJmMrhkCkE");
        setField(term266828, term266828.getClass(), "lastLoginDate", "aaAOXoTImC");
        setField(term266828, term266828.getClass(), "lastPlayDate", "utpjeiiGQI");
        setIntField(term266828, term266828.getClass(), "lastPlayCredit", -1556465214);
        setIntField(term266828, term266828.getClass(), "lastPlayMode", -222495364);
        setIntField(term266828, term266828.getClass(), "lastPlaceId", -1152557968);
        setField(term266828, term266828.getClass(), "lastPlaceName", "pssWvXujgp");
        setIntField(term266828, term266828.getClass(), "lastAllNetId", 1194030737);
        setIntField(term266828, term266828.getClass(), "lastRegionId", 353795028);
        setField(term266828, term266828.getClass(), "lastRegionName", "EdNwugyvnG");
        setField(term266828, term266828.getClass(), "lastClientId", "SzBvOdpmGj");
        setField(term266828, term266828.getClass(), "lastCountryCode", "hyIqGTzCGV");
        setIntField(term266828, term266828.getClass(), "lastSelectEMoney", -1230943141);
        setIntField(term266828, term266828.getClass(), "lastSelectTicket", -2046024363);
        setIntField(term266828, term266828.getClass(), "lastSelectCourse", -226788568);
        setIntField(term266828, term266828.getClass(), "lastCountCourse", 832622865);
        setField(term266828, term266828.getClass(), "firstGameId", "neTMUkKvtF");
        setField(term266828, term266828.getClass(), "firstRomVersion", "gOcGTGkmIA");
        setField(term266828, term266828.getClass(), "firstDataVersion", "aIdjgZqQLf");
        setField(term266828, term266828.getClass(), "firstPlayDate", "SzZxkTtjzT");
        setField(term266828, term266828.getClass(), "compatibleCmVersion", "bqUMcVqQmH");
        setField(term266828, term266828.getClass(), "dailyBonusDate", "xhUxsrKBUI");
        setField(term266828, term266828.getClass(), "dailyCourseBonusDate", "QcmKptYrXb");
        setField(term266828, term266828.getClass(), "lastPairLoginDate", "KMNJwsKaEB");
        setField(term266828, term266828.getClass(), "lastTrialPlayDate", "lUahSCHKNx");
        setIntField(term266828, term266828.getClass(), "playVsCount", 1290031096);
        setIntField(term266828, term266828.getClass(), "playSyncCount", 1244845068);
        setIntField(term266828, term266828.getClass(), "winCount", -1073577017);
        setIntField(term266828, term266828.getClass(), "helpCount", -26693320);
        setIntField(term266828, term266828.getClass(), "comboCount", -483886121);
        setLongField(term266828, term266828.getClass(), "totalDeluxscore", 452375128318130073L);
        setLongField(term266828, term266828.getClass(), "totalBasicDeluxscore", -7463366395906243484L);
        setLongField(term266828, term266828.getClass(), "totalAdvancedDeluxscore", 4785507127925362207L);
        setLongField(term266828, term266828.getClass(), "totalExpertDeluxscore", 5203279116253817061L);
        setLongField(term266828, term266828.getClass(), "totalMasterDeluxscore", 8642371841085561183L);
        setLongField(term266828, term266828.getClass(), "totalReMasterDeluxscore", -8315023034050916966L);
        setIntField(term266828, term266828.getClass(), "totalSync", 1561622574);
        setIntField(term266828, term266828.getClass(), "totalBasicSync", 1113888710);
        setIntField(term266828, term266828.getClass(), "totalAdvancedSync", -698024242);
        setIntField(term266828, term266828.getClass(), "totalExpertSync", -2008426651);
        setIntField(term266828, term266828.getClass(), "totalMasterSync", -1796035804);
        setIntField(term266828, term266828.getClass(), "totalReMasterSync", 623019437);
        setLongField(term266828, term266828.getClass(), "totalAchievement", -7225619458241095240L);
        setLongField(term266828, term266828.getClass(), "totalBasicAchievement", -4259937659725184351L);
        setLongField(term266828, term266828.getClass(), "totalAdvancedAchievement", 6096101148737818911L);
        setLongField(term266828, term266828.getClass(), "totalExpertAchievement", 2789764597813817865L);
        setLongField(term266828, term266828.getClass(), "totalMasterAchievement", -7182453791883994010L);
        setLongField(term266828, term266828.getClass(), "totalReMasterAchievement", 979798767811372215L);
        setLongField(term266828, term266828.getClass(), "playerOldRating", -7236158680711488320L);
        setLongField(term266828, term266828.getClass(), "playerNewRating", 2157434632305127821L);
        setIntField(term266828, term266828.getClass(), "banState", 1658668354);
        setLongField(term266828, term266828.getClass(), "dateTime", -4915295766638004860L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "LElfnxAXwr";
        callMethod(klass, "setLastPairLoginDate", argTypes, term266828, args);
    }

};


