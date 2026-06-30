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

public class UserDetail_getGradeRating_102915340212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term201866;

    public UserDetail_getGradeRating_102915340212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term201870 = new Long(-6001151456088965547L);
        Integer term201933 = new Integer(-937521678);
        Integer term201935 = new Integer(194707851);
        Integer term201937 = new Integer(806877632);
        Integer term201939 = new Integer(-1198681384);
        Integer term201941 = new Integer(1224777627);
        Integer term201943 = new Integer(-1771549367);
        Integer term201945 = new Integer(-83563931);
        ArrayList term201931 = new ArrayList();
        ((ArrayList) term201931).add(term201933);
        ((ArrayList) term201931).add(term201935);
        ((ArrayList) term201931).add(term201937);
        ((ArrayList) term201931).add(term201939);
        ((ArrayList) term201931).add(term201941);
        ((ArrayList) term201931).add(term201943);
        ((ArrayList) term201931).add(term201945);
        Integer term201951 = new Integer(1175147923);
        Integer term201953 = new Integer(-1424244263);
        Integer term201955 = new Integer(808665285);
        Integer term201957 = new Integer(2003642877);
        Integer term201959 = new Integer(-1574456346);
        Integer term201961 = new Integer(638598511);
        Integer term201963 = new Integer(-946663870);
        Integer term201965 = new Integer(1997126409);
        Integer term201967 = new Integer(1794793561);
        ArrayList term201949 = new ArrayList();
        ((ArrayList) term201949).add(term201951);
        ((ArrayList) term201949).add(term201953);
        ((ArrayList) term201949).add(term201955);
        ((ArrayList) term201949).add(term201957);
        ((ArrayList) term201949).add(term201959);
        ((ArrayList) term201949).add(term201961);
        ((ArrayList) term201949).add(term201963);
        ((ArrayList) term201949).add(term201965);
        ((ArrayList) term201949).add(term201967);
        term201866 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term201868 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term201884 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term201885 = newInstance(Class.forName("java.time.LocalDate"));
        Object term201889 = newInstance(Class.forName("java.time.LocalTime"));
        Object term201894 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term201895 = newInstance(Class.forName("java.time.LocalDate"));
        Object term201899 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term201866, term201866.getClass(), "id", -4259484540511871567L);
        setLongField(term201868, term201868.getClass(), "id", 4055534988877935884L);
        setField(term201868, term201868.getClass(), "extId", term201870);
        setField(term201868, term201868.getClass(), "luid", "qAFqArCVTm");
        setIntField(term201885, term201885.getClass(), "year", 2014);
        setShortField(term201885, term201885.getClass(), "month", (short) 11);
        setShortField(term201885, term201885.getClass(), "day", (short) 28);
        setField(term201884, term201884.getClass(), "date", term201885);
        setByteField(term201889, term201889.getClass(), "hour", (byte) 8);
        setByteField(term201889, term201889.getClass(), "minute", (byte) 59);
        setByteField(term201889, term201889.getClass(), "second", (byte) 49);
        setIntField(term201889, term201889.getClass(), "nano", 282127919);
        setField(term201884, term201884.getClass(), "time", term201889);
        setField(term201868, term201868.getClass(), "registerTime", term201884);
        setIntField(term201895, term201895.getClass(), "year", 2024);
        setShortField(term201895, term201895.getClass(), "month", (short) 5);
        setShortField(term201895, term201895.getClass(), "day", (short) 26);
        setField(term201894, term201894.getClass(), "date", term201895);
        setByteField(term201899, term201899.getClass(), "hour", (byte) 8);
        setByteField(term201899, term201899.getClass(), "minute", (byte) 3);
        setByteField(term201899, term201899.getClass(), "second", (byte) 32);
        setIntField(term201899, term201899.getClass(), "nano", 10833029);
        setField(term201894, term201894.getClass(), "time", term201899);
        setField(term201868, term201868.getClass(), "accessTime", term201894);
        setField(term201866, term201866.getClass(), "card", term201868);
        setField(term201866, term201866.getClass(), "userName", "vBBSdxtETg");
        setIntField(term201866, term201866.getClass(), "isNetMember", 729310767);
        setIntField(term201866, term201866.getClass(), "iconId", -517546330);
        setIntField(term201866, term201866.getClass(), "plateId", -1850791590);
        setIntField(term201866, term201866.getClass(), "titleId", -1853602802);
        setIntField(term201866, term201866.getClass(), "partnerId", 1418314493);
        setIntField(term201866, term201866.getClass(), "frameId", -232598231);
        setIntField(term201866, term201866.getClass(), "selectMapId", -1780188367);
        setIntField(term201866, term201866.getClass(), "totalAwake", -1733286958);
        setIntField(term201866, term201866.getClass(), "gradeRating", 1883405940);
        setIntField(term201866, term201866.getClass(), "musicRating", 821199094);
        setIntField(term201866, term201866.getClass(), "playerRating", 2054042505);
        setIntField(term201866, term201866.getClass(), "highestRating", 1071566861);
        setIntField(term201866, term201866.getClass(), "gradeRank", 10685441);
        setIntField(term201866, term201866.getClass(), "classRank", -739572674);
        setIntField(term201866, term201866.getClass(), "courseRank", -1228576844);
        setField(term201866, term201866.getClass(), "charaSlot", term201931);
        setField(term201866, term201866.getClass(), "charaLockSlot", term201949);
        setLongField(term201866, term201866.getClass(), "contentBit", -3448651599140085712L);
        setIntField(term201866, term201866.getClass(), "playCount", 1430441426);
        setField(term201866, term201866.getClass(), "eventWatchedDate", "rOhevcRSqk");
        setField(term201866, term201866.getClass(), "lastGameId", "VRGJcIAafu");
        setField(term201866, term201866.getClass(), "lastRomVersion", "HHcpKjrLHx");
        setField(term201866, term201866.getClass(), "lastDataVersion", "qgwIbxktYJ");
        setField(term201866, term201866.getClass(), "lastLoginDate", "UcOGCbHRXo");
        setField(term201866, term201866.getClass(), "lastPlayDate", "vyRqitFOxo");
        setIntField(term201866, term201866.getClass(), "lastPlayCredit", -33697595);
        setIntField(term201866, term201866.getClass(), "lastPlayMode", 1376076514);
        setIntField(term201866, term201866.getClass(), "lastPlaceId", -1838652199);
        setField(term201866, term201866.getClass(), "lastPlaceName", "jRmmbipqZr");
        setIntField(term201866, term201866.getClass(), "lastAllNetId", 1298254943);
        setIntField(term201866, term201866.getClass(), "lastRegionId", 816808363);
        setField(term201866, term201866.getClass(), "lastRegionName", "BOwIpRsWNk");
        setField(term201866, term201866.getClass(), "lastClientId", "CnRIdcAMwJ");
        setField(term201866, term201866.getClass(), "lastCountryCode", "hVsgDLbwcE");
        setIntField(term201866, term201866.getClass(), "lastSelectEMoney", 1297344752);
        setIntField(term201866, term201866.getClass(), "lastSelectTicket", 2091257387);
        setIntField(term201866, term201866.getClass(), "lastSelectCourse", 1262385462);
        setIntField(term201866, term201866.getClass(), "lastCountCourse", 146198205);
        setField(term201866, term201866.getClass(), "firstGameId", "CBdRPBQREL");
        setField(term201866, term201866.getClass(), "firstRomVersion", "vJNoxagfjT");
        setField(term201866, term201866.getClass(), "firstDataVersion", "MuVCvbGeeV");
        setField(term201866, term201866.getClass(), "firstPlayDate", "CDDzgttHhg");
        setField(term201866, term201866.getClass(), "compatibleCmVersion", "hpkNAPnbKp");
        setField(term201866, term201866.getClass(), "dailyBonusDate", "XBJGMkPtvJ");
        setField(term201866, term201866.getClass(), "dailyCourseBonusDate", "uLhzGSJLKu");
        setField(term201866, term201866.getClass(), "lastPairLoginDate", "vtnAaEncDf");
        setField(term201866, term201866.getClass(), "lastTrialPlayDate", "BhnXbJKpVL");
        setIntField(term201866, term201866.getClass(), "playVsCount", 1811207533);
        setIntField(term201866, term201866.getClass(), "playSyncCount", -1241224611);
        setIntField(term201866, term201866.getClass(), "winCount", 1661530764);
        setIntField(term201866, term201866.getClass(), "helpCount", -1244991565);
        setIntField(term201866, term201866.getClass(), "comboCount", -865604268);
        setLongField(term201866, term201866.getClass(), "totalDeluxscore", -3609260099774913750L);
        setLongField(term201866, term201866.getClass(), "totalBasicDeluxscore", 4303732152768858405L);
        setLongField(term201866, term201866.getClass(), "totalAdvancedDeluxscore", 2871414186316219488L);
        setLongField(term201866, term201866.getClass(), "totalExpertDeluxscore", -3990638584040447441L);
        setLongField(term201866, term201866.getClass(), "totalMasterDeluxscore", 122679439739867306L);
        setLongField(term201866, term201866.getClass(), "totalReMasterDeluxscore", -2461790613276258316L);
        setIntField(term201866, term201866.getClass(), "totalSync", -629271467);
        setIntField(term201866, term201866.getClass(), "totalBasicSync", -1485210649);
        setIntField(term201866, term201866.getClass(), "totalAdvancedSync", 343270861);
        setIntField(term201866, term201866.getClass(), "totalExpertSync", 408001246);
        setIntField(term201866, term201866.getClass(), "totalMasterSync", -413564129);
        setIntField(term201866, term201866.getClass(), "totalReMasterSync", -32548606);
        setLongField(term201866, term201866.getClass(), "totalAchievement", -108156486325010619L);
        setLongField(term201866, term201866.getClass(), "totalBasicAchievement", -7872624721231178208L);
        setLongField(term201866, term201866.getClass(), "totalAdvancedAchievement", -7527069582035495855L);
        setLongField(term201866, term201866.getClass(), "totalExpertAchievement", -1286075784303241299L);
        setLongField(term201866, term201866.getClass(), "totalMasterAchievement", 8755645356008809649L);
        setLongField(term201866, term201866.getClass(), "totalReMasterAchievement", -8674690599315417243L);
        setLongField(term201866, term201866.getClass(), "playerOldRating", -951836718289537995L);
        setLongField(term201866, term201866.getClass(), "playerNewRating", -5472272690082825051L);
        setIntField(term201866, term201866.getClass(), "banState", 129009378);
        setLongField(term201866, term201866.getClass(), "dateTime", 7927237568181703163L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGradeRating", argTypes, term201866, args);
    }

};


