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

public class UserDetail_getTotalReMasterSync_41876423066 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4266920;

    public UserDetail_getTotalReMasterSync_41876423066() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4266924 = new Long(-3309188536440842983L);
        Integer term4266987 = new Integer(-403619714);
        ArrayList term4266985 = new ArrayList();
        ((ArrayList) term4266985).add(term4266987);
        Integer term4266993 = new Integer(1083157942);
        Integer term4266995 = new Integer(1032329767);
        Integer term4266997 = new Integer(1878032322);
        Integer term4266999 = new Integer(1027562263);
        Integer term4267001 = new Integer(-1444808827);
        Integer term4267003 = new Integer(-1120740211);
        Integer term4267005 = new Integer(654951288);
        ArrayList term4266991 = new ArrayList();
        ((ArrayList) term4266991).add(term4266993);
        ((ArrayList) term4266991).add(term4266995);
        ((ArrayList) term4266991).add(term4266997);
        ((ArrayList) term4266991).add(term4266999);
        ((ArrayList) term4266991).add(term4267001);
        ((ArrayList) term4266991).add(term4267003);
        ((ArrayList) term4266991).add(term4267005);
        term4266920 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4266922 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4266938 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4266939 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4266943 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4266948 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4266949 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4266953 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4266920, term4266920.getClass(), "id", -809024143229778843L);
        setLongField(term4266922, term4266922.getClass(), "id", 2223439482169522252L);
        setField(term4266922, term4266922.getClass(), "extId", term4266924);
        setField(term4266922, term4266922.getClass(), "luid", "hSfJndukeq");
        setIntField(term4266939, term4266939.getClass(), "year", 2024);
        setShortField(term4266939, term4266939.getClass(), "month", (short) 6);
        setShortField(term4266939, term4266939.getClass(), "day", (short) 7);
        setField(term4266938, term4266938.getClass(), "date", term4266939);
        setByteField(term4266943, term4266943.getClass(), "hour", (byte) 5);
        setByteField(term4266943, term4266943.getClass(), "minute", (byte) 23);
        setByteField(term4266943, term4266943.getClass(), "second", (byte) 49);
        setIntField(term4266943, term4266943.getClass(), "nano", 845547545);
        setField(term4266938, term4266938.getClass(), "time", term4266943);
        setField(term4266922, term4266922.getClass(), "registerTime", term4266938);
        setIntField(term4266949, term4266949.getClass(), "year", 2012);
        setShortField(term4266949, term4266949.getClass(), "month", (short) 1);
        setShortField(term4266949, term4266949.getClass(), "day", (short) 7);
        setField(term4266948, term4266948.getClass(), "date", term4266949);
        setByteField(term4266953, term4266953.getClass(), "hour", (byte) 10);
        setByteField(term4266953, term4266953.getClass(), "minute", (byte) 33);
        setByteField(term4266953, term4266953.getClass(), "second", (byte) 38);
        setIntField(term4266953, term4266953.getClass(), "nano", 712965116);
        setField(term4266948, term4266948.getClass(), "time", term4266953);
        setField(term4266922, term4266922.getClass(), "accessTime", term4266948);
        setField(term4266920, term4266920.getClass(), "card", term4266922);
        setField(term4266920, term4266920.getClass(), "userName", "nVYiazrjxW");
        setIntField(term4266920, term4266920.getClass(), "isNetMember", 2035388470);
        setIntField(term4266920, term4266920.getClass(), "iconId", -1028971918);
        setIntField(term4266920, term4266920.getClass(), "plateId", 1826054217);
        setIntField(term4266920, term4266920.getClass(), "titleId", 449765179);
        setIntField(term4266920, term4266920.getClass(), "partnerId", 1053436494);
        setIntField(term4266920, term4266920.getClass(), "frameId", -2009987431);
        setIntField(term4266920, term4266920.getClass(), "selectMapId", -72467047);
        setIntField(term4266920, term4266920.getClass(), "totalAwake", 1216960412);
        setIntField(term4266920, term4266920.getClass(), "gradeRating", -463966401);
        setIntField(term4266920, term4266920.getClass(), "musicRating", 2142372969);
        setIntField(term4266920, term4266920.getClass(), "playerRating", 1636782337);
        setIntField(term4266920, term4266920.getClass(), "highestRating", 439528661);
        setIntField(term4266920, term4266920.getClass(), "gradeRank", -1133761878);
        setIntField(term4266920, term4266920.getClass(), "classRank", 81294786);
        setIntField(term4266920, term4266920.getClass(), "courseRank", -1034237319);
        setField(term4266920, term4266920.getClass(), "charaSlot", term4266985);
        setField(term4266920, term4266920.getClass(), "charaLockSlot", term4266991);
        setLongField(term4266920, term4266920.getClass(), "contentBit", 7113882792402128729L);
        setIntField(term4266920, term4266920.getClass(), "playCount", 1843067054);
        setField(term4266920, term4266920.getClass(), "eventWatchedDate", "GToZpxQsYK");
        setField(term4266920, term4266920.getClass(), "lastGameId", "xxRdCLsSmV");
        setField(term4266920, term4266920.getClass(), "lastRomVersion", "lplpUvMIYa");
        setField(term4266920, term4266920.getClass(), "lastDataVersion", "auTRMIbMbu");
        setField(term4266920, term4266920.getClass(), "lastLoginDate", "fVVkoUKOTO");
        setField(term4266920, term4266920.getClass(), "lastPlayDate", "SWXoyawdna");
        setIntField(term4266920, term4266920.getClass(), "lastPlayCredit", -603572857);
        setIntField(term4266920, term4266920.getClass(), "lastPlayMode", 765544011);
        setIntField(term4266920, term4266920.getClass(), "lastPlaceId", -1718816946);
        setField(term4266920, term4266920.getClass(), "lastPlaceName", "HeutEZtJXV");
        setIntField(term4266920, term4266920.getClass(), "lastAllNetId", 1630922792);
        setIntField(term4266920, term4266920.getClass(), "lastRegionId", 89753522);
        setField(term4266920, term4266920.getClass(), "lastRegionName", "PMwHBDjTwV");
        setField(term4266920, term4266920.getClass(), "lastClientId", "TSnJycBhyX");
        setField(term4266920, term4266920.getClass(), "lastCountryCode", "cHvfrueWNm");
        setIntField(term4266920, term4266920.getClass(), "lastSelectEMoney", 72876199);
        setIntField(term4266920, term4266920.getClass(), "lastSelectTicket", -1568837304);
        setIntField(term4266920, term4266920.getClass(), "lastSelectCourse", -1441976876);
        setIntField(term4266920, term4266920.getClass(), "lastCountCourse", 1621974441);
        setField(term4266920, term4266920.getClass(), "firstGameId", "OAXSJjXvKE");
        setField(term4266920, term4266920.getClass(), "firstRomVersion", "sxuNXtdUPW");
        setField(term4266920, term4266920.getClass(), "firstDataVersion", "rShepCTFjF");
        setField(term4266920, term4266920.getClass(), "firstPlayDate", "vWXlQKDCpK");
        setField(term4266920, term4266920.getClass(), "compatibleCmVersion", "PBBNWpsOdQ");
        setField(term4266920, term4266920.getClass(), "dailyBonusDate", "QsvnQnYiCE");
        setField(term4266920, term4266920.getClass(), "dailyCourseBonusDate", "UevFaNSXKY");
        setField(term4266920, term4266920.getClass(), "lastPairLoginDate", "SRcJMehYRA");
        setField(term4266920, term4266920.getClass(), "lastTrialPlayDate", "pJcnXvoqob");
        setIntField(term4266920, term4266920.getClass(), "playVsCount", 914356966);
        setIntField(term4266920, term4266920.getClass(), "playSyncCount", 2082116623);
        setIntField(term4266920, term4266920.getClass(), "winCount", -1598601886);
        setIntField(term4266920, term4266920.getClass(), "helpCount", 1226143380);
        setIntField(term4266920, term4266920.getClass(), "comboCount", 1789810237);
        setLongField(term4266920, term4266920.getClass(), "totalDeluxscore", -6531532263186252317L);
        setLongField(term4266920, term4266920.getClass(), "totalBasicDeluxscore", 3911816545097289245L);
        setLongField(term4266920, term4266920.getClass(), "totalAdvancedDeluxscore", 6258185717438394639L);
        setLongField(term4266920, term4266920.getClass(), "totalExpertDeluxscore", -6290591858559682881L);
        setLongField(term4266920, term4266920.getClass(), "totalMasterDeluxscore", -1895584157424724291L);
        setLongField(term4266920, term4266920.getClass(), "totalReMasterDeluxscore", 2796650054035405438L);
        setIntField(term4266920, term4266920.getClass(), "totalSync", -463026998);
        setIntField(term4266920, term4266920.getClass(), "totalBasicSync", 1845386360);
        setIntField(term4266920, term4266920.getClass(), "totalAdvancedSync", -933122427);
        setIntField(term4266920, term4266920.getClass(), "totalExpertSync", 2027406841);
        setIntField(term4266920, term4266920.getClass(), "totalMasterSync", -1824159736);
        setIntField(term4266920, term4266920.getClass(), "totalReMasterSync", 1481405636);
        setLongField(term4266920, term4266920.getClass(), "totalAchievement", 5418119679360097569L);
        setLongField(term4266920, term4266920.getClass(), "totalBasicAchievement", 8681047272486215823L);
        setLongField(term4266920, term4266920.getClass(), "totalAdvancedAchievement", 4773475370893393439L);
        setLongField(term4266920, term4266920.getClass(), "totalExpertAchievement", 3490555775951882526L);
        setLongField(term4266920, term4266920.getClass(), "totalMasterAchievement", -2274457630003387412L);
        setLongField(term4266920, term4266920.getClass(), "totalReMasterAchievement", 1888432159322627218L);
        setLongField(term4266920, term4266920.getClass(), "playerOldRating", -3838338511356038155L);
        setLongField(term4266920, term4266920.getClass(), "playerNewRating", 9023361476480117525L);
        setIntField(term4266920, term4266920.getClass(), "banState", -604604161);
        setLongField(term4266920, term4266920.getClass(), "dateTime", 3369662605219701759L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalReMasterSync", argTypes, term4266920, args);
    }

};


