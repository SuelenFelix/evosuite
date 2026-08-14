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
     Object term266773;

    public UserDetail_setLastPairLoginDate_23812834125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term266777 = new Long(-3058119213533262883L);
        Integer term266840 = new Integer(-132156499);
        Integer term266842 = new Integer(-1222668512);
        Integer term266844 = new Integer(1109294828);
        Integer term266846 = new Integer(-596850824);
        Integer term266848 = new Integer(1619317687);
        Integer term266850 = new Integer(-1335475299);
        Integer term266852 = new Integer(1764067908);
        Integer term266854 = new Integer(1906236006);
        Integer term266856 = new Integer(-279175941);
        ArrayList term266838 = new ArrayList();
        ((ArrayList) term266838).add(term266840);
        ((ArrayList) term266838).add(term266842);
        ((ArrayList) term266838).add(term266844);
        ((ArrayList) term266838).add(term266846);
        ((ArrayList) term266838).add(term266848);
        ((ArrayList) term266838).add(term266850);
        ((ArrayList) term266838).add(term266852);
        ((ArrayList) term266838).add(term266854);
        ((ArrayList) term266838).add(term266856);
        Integer term266862 = new Integer(-574044161);
        Integer term266864 = new Integer(-101199395);
        Integer term266866 = new Integer(894150826);
        Integer term266868 = new Integer(-261894603);
        Integer term266870 = new Integer(1163902450);
        Integer term266872 = new Integer(548941697);
        Integer term266874 = new Integer(647865140);
        ArrayList term266860 = new ArrayList();
        ((ArrayList) term266860).add(term266862);
        ((ArrayList) term266860).add(term266864);
        ((ArrayList) term266860).add(term266866);
        ((ArrayList) term266860).add(term266868);
        ((ArrayList) term266860).add(term266870);
        ((ArrayList) term266860).add(term266872);
        ((ArrayList) term266860).add(term266874);
        term266773 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term266775 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term266791 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term266792 = newInstance(Class.forName("java.time.LocalDate"));
        Object term266796 = newInstance(Class.forName("java.time.LocalTime"));
        Object term266801 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term266802 = newInstance(Class.forName("java.time.LocalDate"));
        Object term266806 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term266773, term266773.getClass(), "id", 4152090055699589035L);
        setLongField(term266775, term266775.getClass(), "id", 956722791214746115L);
        setField(term266775, term266775.getClass(), "extId", term266777);
        setField(term266775, term266775.getClass(), "luid", "IkxYpScZwm");
        setIntField(term266792, term266792.getClass(), "year", 2020);
        setShortField(term266792, term266792.getClass(), "month", (short) 5);
        setShortField(term266792, term266792.getClass(), "day", (short) 12);
        setField(term266791, term266791.getClass(), "date", term266792);
        setByteField(term266796, term266796.getClass(), "hour", (byte) 13);
        setByteField(term266796, term266796.getClass(), "minute", (byte) 11);
        setByteField(term266796, term266796.getClass(), "second", (byte) 59);
        setIntField(term266796, term266796.getClass(), "nano", 36534511);
        setField(term266791, term266791.getClass(), "time", term266796);
        setField(term266775, term266775.getClass(), "registerTime", term266791);
        setIntField(term266802, term266802.getClass(), "year", 2012);
        setShortField(term266802, term266802.getClass(), "month", (short) 8);
        setShortField(term266802, term266802.getClass(), "day", (short) 29);
        setField(term266801, term266801.getClass(), "date", term266802);
        setByteField(term266806, term266806.getClass(), "hour", (byte) 18);
        setByteField(term266806, term266806.getClass(), "minute", (byte) 51);
        setByteField(term266806, term266806.getClass(), "second", (byte) 22);
        setIntField(term266806, term266806.getClass(), "nano", 659205197);
        setField(term266801, term266801.getClass(), "time", term266806);
        setField(term266775, term266775.getClass(), "accessTime", term266801);
        setField(term266773, term266773.getClass(), "card", term266775);
        setField(term266773, term266773.getClass(), "userName", "soyBRfWJGI");
        setIntField(term266773, term266773.getClass(), "isNetMember", 1148281986);
        setIntField(term266773, term266773.getClass(), "iconId", -1538825569);
        setIntField(term266773, term266773.getClass(), "plateId", 1826544810);
        setIntField(term266773, term266773.getClass(), "titleId", -1542241279);
        setIntField(term266773, term266773.getClass(), "partnerId", -1509334840);
        setIntField(term266773, term266773.getClass(), "frameId", -129880080);
        setIntField(term266773, term266773.getClass(), "selectMapId", 1166061260);
        setIntField(term266773, term266773.getClass(), "totalAwake", 1047181690);
        setIntField(term266773, term266773.getClass(), "gradeRating", -1074428691);
        setIntField(term266773, term266773.getClass(), "musicRating", -185766851);
        setIntField(term266773, term266773.getClass(), "playerRating", 1974594542);
        setIntField(term266773, term266773.getClass(), "highestRating", -260638222);
        setIntField(term266773, term266773.getClass(), "gradeRank", -1756194305);
        setIntField(term266773, term266773.getClass(), "classRank", 83370923);
        setIntField(term266773, term266773.getClass(), "courseRank", -1299639537);
        setField(term266773, term266773.getClass(), "charaSlot", term266838);
        setField(term266773, term266773.getClass(), "charaLockSlot", term266860);
        setLongField(term266773, term266773.getClass(), "contentBit", -4934550737686713529L);
        setIntField(term266773, term266773.getClass(), "playCount", -1373829729);
        setField(term266773, term266773.getClass(), "eventWatchedDate", "fboIWAsrJZ");
        setField(term266773, term266773.getClass(), "lastGameId", "vqgXCbtNCu");
        setField(term266773, term266773.getClass(), "lastRomVersion", "kpkWNprGhK");
        setField(term266773, term266773.getClass(), "lastDataVersion", "AJmMrhkCkE");
        setField(term266773, term266773.getClass(), "lastLoginDate", "aaAOXoTImC");
        setField(term266773, term266773.getClass(), "lastPlayDate", "utpjeiiGQI");
        setIntField(term266773, term266773.getClass(), "lastPlayCredit", -1556465214);
        setIntField(term266773, term266773.getClass(), "lastPlayMode", -222495364);
        setIntField(term266773, term266773.getClass(), "lastPlaceId", -1152557968);
        setField(term266773, term266773.getClass(), "lastPlaceName", "pssWvXujgp");
        setIntField(term266773, term266773.getClass(), "lastAllNetId", 1194030737);
        setIntField(term266773, term266773.getClass(), "lastRegionId", 353795028);
        setField(term266773, term266773.getClass(), "lastRegionName", "EdNwugyvnG");
        setField(term266773, term266773.getClass(), "lastClientId", "SzBvOdpmGj");
        setField(term266773, term266773.getClass(), "lastCountryCode", "hyIqGTzCGV");
        setIntField(term266773, term266773.getClass(), "lastSelectEMoney", -1230943141);
        setIntField(term266773, term266773.getClass(), "lastSelectTicket", -2046024363);
        setIntField(term266773, term266773.getClass(), "lastSelectCourse", -226788568);
        setIntField(term266773, term266773.getClass(), "lastCountCourse", 832622865);
        setField(term266773, term266773.getClass(), "firstGameId", "neTMUkKvtF");
        setField(term266773, term266773.getClass(), "firstRomVersion", "gOcGTGkmIA");
        setField(term266773, term266773.getClass(), "firstDataVersion", "aIdjgZqQLf");
        setField(term266773, term266773.getClass(), "firstPlayDate", "SzZxkTtjzT");
        setField(term266773, term266773.getClass(), "compatibleCmVersion", "bqUMcVqQmH");
        setField(term266773, term266773.getClass(), "dailyBonusDate", "xhUxsrKBUI");
        setField(term266773, term266773.getClass(), "dailyCourseBonusDate", "QcmKptYrXb");
        setField(term266773, term266773.getClass(), "lastPairLoginDate", "KMNJwsKaEB");
        setField(term266773, term266773.getClass(), "lastTrialPlayDate", "lUahSCHKNx");
        setIntField(term266773, term266773.getClass(), "playVsCount", 1290031096);
        setIntField(term266773, term266773.getClass(), "playSyncCount", 1244845068);
        setIntField(term266773, term266773.getClass(), "winCount", -1073577017);
        setIntField(term266773, term266773.getClass(), "helpCount", -26693320);
        setIntField(term266773, term266773.getClass(), "comboCount", -483886121);
        setLongField(term266773, term266773.getClass(), "totalDeluxscore", 452375128318130073L);
        setLongField(term266773, term266773.getClass(), "totalBasicDeluxscore", -7463366395906243484L);
        setLongField(term266773, term266773.getClass(), "totalAdvancedDeluxscore", 4785507127925362207L);
        setLongField(term266773, term266773.getClass(), "totalExpertDeluxscore", 5203279116253817061L);
        setLongField(term266773, term266773.getClass(), "totalMasterDeluxscore", 8642371841085561183L);
        setLongField(term266773, term266773.getClass(), "totalReMasterDeluxscore", -8315023034050916966L);
        setIntField(term266773, term266773.getClass(), "totalSync", 1561622574);
        setIntField(term266773, term266773.getClass(), "totalBasicSync", 1113888710);
        setIntField(term266773, term266773.getClass(), "totalAdvancedSync", -698024242);
        setIntField(term266773, term266773.getClass(), "totalExpertSync", -2008426651);
        setIntField(term266773, term266773.getClass(), "totalMasterSync", -1796035804);
        setIntField(term266773, term266773.getClass(), "totalReMasterSync", 623019437);
        setLongField(term266773, term266773.getClass(), "totalAchievement", -7225619458241095240L);
        setLongField(term266773, term266773.getClass(), "totalBasicAchievement", -4259937659725184351L);
        setLongField(term266773, term266773.getClass(), "totalAdvancedAchievement", 6096101148737818911L);
        setLongField(term266773, term266773.getClass(), "totalExpertAchievement", 2789764597813817865L);
        setLongField(term266773, term266773.getClass(), "totalMasterAchievement", -7182453791883994010L);
        setLongField(term266773, term266773.getClass(), "totalReMasterAchievement", 979798767811372215L);
        setLongField(term266773, term266773.getClass(), "playerOldRating", -7236158680711488320L);
        setLongField(term266773, term266773.getClass(), "playerNewRating", 2157434632305127821L);
        setIntField(term266773, term266773.getClass(), "banState", 1658668354);
        setLongField(term266773, term266773.getClass(), "dateTime", -4915295766638004860L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "LElfnxAXwr";
        callMethod(klass, "setLastPairLoginDate", argTypes, term266773, args);
    }

};


