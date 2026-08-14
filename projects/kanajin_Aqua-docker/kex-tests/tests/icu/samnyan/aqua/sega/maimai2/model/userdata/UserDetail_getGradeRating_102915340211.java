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

public class UserDetail_getGradeRating_102915340211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term201811;

    public UserDetail_getGradeRating_102915340211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term201815 = new Long(-6001151456088965547L);
        Integer term201878 = new Integer(-937521678);
        Integer term201880 = new Integer(194707851);
        Integer term201882 = new Integer(806877632);
        Integer term201884 = new Integer(-1198681384);
        Integer term201886 = new Integer(1224777627);
        Integer term201888 = new Integer(-1771549367);
        Integer term201890 = new Integer(-83563931);
        ArrayList term201876 = new ArrayList();
        ((ArrayList) term201876).add(term201878);
        ((ArrayList) term201876).add(term201880);
        ((ArrayList) term201876).add(term201882);
        ((ArrayList) term201876).add(term201884);
        ((ArrayList) term201876).add(term201886);
        ((ArrayList) term201876).add(term201888);
        ((ArrayList) term201876).add(term201890);
        Integer term201896 = new Integer(1175147923);
        Integer term201898 = new Integer(-1424244263);
        Integer term201900 = new Integer(808665285);
        Integer term201902 = new Integer(2003642877);
        Integer term201904 = new Integer(-1574456346);
        Integer term201906 = new Integer(638598511);
        Integer term201908 = new Integer(-946663870);
        Integer term201910 = new Integer(1997126409);
        Integer term201912 = new Integer(1794793561);
        ArrayList term201894 = new ArrayList();
        ((ArrayList) term201894).add(term201896);
        ((ArrayList) term201894).add(term201898);
        ((ArrayList) term201894).add(term201900);
        ((ArrayList) term201894).add(term201902);
        ((ArrayList) term201894).add(term201904);
        ((ArrayList) term201894).add(term201906);
        ((ArrayList) term201894).add(term201908);
        ((ArrayList) term201894).add(term201910);
        ((ArrayList) term201894).add(term201912);
        term201811 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term201813 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term201829 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term201830 = newInstance(Class.forName("java.time.LocalDate"));
        Object term201834 = newInstance(Class.forName("java.time.LocalTime"));
        Object term201839 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term201840 = newInstance(Class.forName("java.time.LocalDate"));
        Object term201844 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term201811, term201811.getClass(), "id", -4259484540511871567L);
        setLongField(term201813, term201813.getClass(), "id", 4055534988877935884L);
        setField(term201813, term201813.getClass(), "extId", term201815);
        setField(term201813, term201813.getClass(), "luid", "qAFqArCVTm");
        setIntField(term201830, term201830.getClass(), "year", 2014);
        setShortField(term201830, term201830.getClass(), "month", (short) 11);
        setShortField(term201830, term201830.getClass(), "day", (short) 28);
        setField(term201829, term201829.getClass(), "date", term201830);
        setByteField(term201834, term201834.getClass(), "hour", (byte) 8);
        setByteField(term201834, term201834.getClass(), "minute", (byte) 59);
        setByteField(term201834, term201834.getClass(), "second", (byte) 49);
        setIntField(term201834, term201834.getClass(), "nano", 282127919);
        setField(term201829, term201829.getClass(), "time", term201834);
        setField(term201813, term201813.getClass(), "registerTime", term201829);
        setIntField(term201840, term201840.getClass(), "year", 2024);
        setShortField(term201840, term201840.getClass(), "month", (short) 5);
        setShortField(term201840, term201840.getClass(), "day", (short) 26);
        setField(term201839, term201839.getClass(), "date", term201840);
        setByteField(term201844, term201844.getClass(), "hour", (byte) 8);
        setByteField(term201844, term201844.getClass(), "minute", (byte) 3);
        setByteField(term201844, term201844.getClass(), "second", (byte) 32);
        setIntField(term201844, term201844.getClass(), "nano", 10833029);
        setField(term201839, term201839.getClass(), "time", term201844);
        setField(term201813, term201813.getClass(), "accessTime", term201839);
        setField(term201811, term201811.getClass(), "card", term201813);
        setField(term201811, term201811.getClass(), "userName", "vBBSdxtETg");
        setIntField(term201811, term201811.getClass(), "isNetMember", 729310767);
        setIntField(term201811, term201811.getClass(), "iconId", -517546330);
        setIntField(term201811, term201811.getClass(), "plateId", -1850791590);
        setIntField(term201811, term201811.getClass(), "titleId", -1853602802);
        setIntField(term201811, term201811.getClass(), "partnerId", 1418314493);
        setIntField(term201811, term201811.getClass(), "frameId", -232598231);
        setIntField(term201811, term201811.getClass(), "selectMapId", -1780188367);
        setIntField(term201811, term201811.getClass(), "totalAwake", -1733286958);
        setIntField(term201811, term201811.getClass(), "gradeRating", 1883405940);
        setIntField(term201811, term201811.getClass(), "musicRating", 821199094);
        setIntField(term201811, term201811.getClass(), "playerRating", 2054042505);
        setIntField(term201811, term201811.getClass(), "highestRating", 1071566861);
        setIntField(term201811, term201811.getClass(), "gradeRank", 10685441);
        setIntField(term201811, term201811.getClass(), "classRank", -739572674);
        setIntField(term201811, term201811.getClass(), "courseRank", -1228576844);
        setField(term201811, term201811.getClass(), "charaSlot", term201876);
        setField(term201811, term201811.getClass(), "charaLockSlot", term201894);
        setLongField(term201811, term201811.getClass(), "contentBit", -3448651599140085712L);
        setIntField(term201811, term201811.getClass(), "playCount", 1430441426);
        setField(term201811, term201811.getClass(), "eventWatchedDate", "rOhevcRSqk");
        setField(term201811, term201811.getClass(), "lastGameId", "VRGJcIAafu");
        setField(term201811, term201811.getClass(), "lastRomVersion", "HHcpKjrLHx");
        setField(term201811, term201811.getClass(), "lastDataVersion", "qgwIbxktYJ");
        setField(term201811, term201811.getClass(), "lastLoginDate", "UcOGCbHRXo");
        setField(term201811, term201811.getClass(), "lastPlayDate", "vyRqitFOxo");
        setIntField(term201811, term201811.getClass(), "lastPlayCredit", -33697595);
        setIntField(term201811, term201811.getClass(), "lastPlayMode", 1376076514);
        setIntField(term201811, term201811.getClass(), "lastPlaceId", -1838652199);
        setField(term201811, term201811.getClass(), "lastPlaceName", "jRmmbipqZr");
        setIntField(term201811, term201811.getClass(), "lastAllNetId", 1298254943);
        setIntField(term201811, term201811.getClass(), "lastRegionId", 816808363);
        setField(term201811, term201811.getClass(), "lastRegionName", "BOwIpRsWNk");
        setField(term201811, term201811.getClass(), "lastClientId", "CnRIdcAMwJ");
        setField(term201811, term201811.getClass(), "lastCountryCode", "hVsgDLbwcE");
        setIntField(term201811, term201811.getClass(), "lastSelectEMoney", 1297344752);
        setIntField(term201811, term201811.getClass(), "lastSelectTicket", 2091257387);
        setIntField(term201811, term201811.getClass(), "lastSelectCourse", 1262385462);
        setIntField(term201811, term201811.getClass(), "lastCountCourse", 146198205);
        setField(term201811, term201811.getClass(), "firstGameId", "CBdRPBQREL");
        setField(term201811, term201811.getClass(), "firstRomVersion", "vJNoxagfjT");
        setField(term201811, term201811.getClass(), "firstDataVersion", "MuVCvbGeeV");
        setField(term201811, term201811.getClass(), "firstPlayDate", "CDDzgttHhg");
        setField(term201811, term201811.getClass(), "compatibleCmVersion", "hpkNAPnbKp");
        setField(term201811, term201811.getClass(), "dailyBonusDate", "XBJGMkPtvJ");
        setField(term201811, term201811.getClass(), "dailyCourseBonusDate", "uLhzGSJLKu");
        setField(term201811, term201811.getClass(), "lastPairLoginDate", "vtnAaEncDf");
        setField(term201811, term201811.getClass(), "lastTrialPlayDate", "BhnXbJKpVL");
        setIntField(term201811, term201811.getClass(), "playVsCount", 1811207533);
        setIntField(term201811, term201811.getClass(), "playSyncCount", -1241224611);
        setIntField(term201811, term201811.getClass(), "winCount", 1661530764);
        setIntField(term201811, term201811.getClass(), "helpCount", -1244991565);
        setIntField(term201811, term201811.getClass(), "comboCount", -865604268);
        setLongField(term201811, term201811.getClass(), "totalDeluxscore", -3609260099774913750L);
        setLongField(term201811, term201811.getClass(), "totalBasicDeluxscore", 4303732152768858405L);
        setLongField(term201811, term201811.getClass(), "totalAdvancedDeluxscore", 2871414186316219488L);
        setLongField(term201811, term201811.getClass(), "totalExpertDeluxscore", -3990638584040447441L);
        setLongField(term201811, term201811.getClass(), "totalMasterDeluxscore", 122679439739867306L);
        setLongField(term201811, term201811.getClass(), "totalReMasterDeluxscore", -2461790613276258316L);
        setIntField(term201811, term201811.getClass(), "totalSync", -629271467);
        setIntField(term201811, term201811.getClass(), "totalBasicSync", -1485210649);
        setIntField(term201811, term201811.getClass(), "totalAdvancedSync", 343270861);
        setIntField(term201811, term201811.getClass(), "totalExpertSync", 408001246);
        setIntField(term201811, term201811.getClass(), "totalMasterSync", -413564129);
        setIntField(term201811, term201811.getClass(), "totalReMasterSync", -32548606);
        setLongField(term201811, term201811.getClass(), "totalAchievement", -108156486325010619L);
        setLongField(term201811, term201811.getClass(), "totalBasicAchievement", -7872624721231178208L);
        setLongField(term201811, term201811.getClass(), "totalAdvancedAchievement", -7527069582035495855L);
        setLongField(term201811, term201811.getClass(), "totalExpertAchievement", -1286075784303241299L);
        setLongField(term201811, term201811.getClass(), "totalMasterAchievement", 8755645356008809649L);
        setLongField(term201811, term201811.getClass(), "totalReMasterAchievement", -8674690599315417243L);
        setLongField(term201811, term201811.getClass(), "playerOldRating", -951836718289537995L);
        setLongField(term201811, term201811.getClass(), "playerNewRating", -5472272690082825051L);
        setIntField(term201811, term201811.getClass(), "banState", 129009378);
        setLongField(term201811, term201811.getClass(), "dateTime", 7927237568181703163L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGradeRating", argTypes, term201811, args);
    }

};


