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

public class UserDetail_setTotalAwake_103691859187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4278903;
     Object term4279258;

    public UserDetail_setTotalAwake_103691859187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4278907 = new Long(-8061662383472277177L);
        Integer term4278970 = new Integer(1392982418);
        ArrayList term4278968 = new ArrayList();
        ((ArrayList) term4278968).add(term4278970);
        Integer term4278976 = new Integer(-1572413221);
        Integer term4278978 = new Integer(-774130445);
        Integer term4278980 = new Integer(1186959709);
        Integer term4278982 = new Integer(627006138);
        Integer term4278984 = new Integer(473286732);
        Integer term4278986 = new Integer(1705432758);
        Integer term4278988 = new Integer(1869760927);
        ArrayList term4278974 = new ArrayList();
        ((ArrayList) term4278974).add(term4278976);
        ((ArrayList) term4278974).add(term4278978);
        ((ArrayList) term4278974).add(term4278980);
        ((ArrayList) term4278974).add(term4278982);
        ((ArrayList) term4278974).add(term4278984);
        ((ArrayList) term4278974).add(term4278986);
        ((ArrayList) term4278974).add(term4278988);
        term4278903 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4278905 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4278921 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4278922 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4278926 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4278931 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4278932 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4278936 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4278903, term4278903.getClass(), "id", -6982737790075987203L);
        setLongField(term4278905, term4278905.getClass(), "id", -1258609445841525570L);
        setField(term4278905, term4278905.getClass(), "extId", term4278907);
        setField(term4278905, term4278905.getClass(), "luid", "mWQnwFjYxD");
        setIntField(term4278922, term4278922.getClass(), "year", 2010);
        setShortField(term4278922, term4278922.getClass(), "month", (short) 3);
        setShortField(term4278922, term4278922.getClass(), "day", (short) 18);
        setField(term4278921, term4278921.getClass(), "date", term4278922);
        setByteField(term4278926, term4278926.getClass(), "hour", (byte) 3);
        setByteField(term4278926, term4278926.getClass(), "minute", (byte) 31);
        setByteField(term4278926, term4278926.getClass(), "second", (byte) 24);
        setIntField(term4278926, term4278926.getClass(), "nano", 599533292);
        setField(term4278921, term4278921.getClass(), "time", term4278926);
        setField(term4278905, term4278905.getClass(), "registerTime", term4278921);
        setIntField(term4278932, term4278932.getClass(), "year", 2017);
        setShortField(term4278932, term4278932.getClass(), "month", (short) 5);
        setShortField(term4278932, term4278932.getClass(), "day", (short) 16);
        setField(term4278931, term4278931.getClass(), "date", term4278932);
        setByteField(term4278936, term4278936.getClass(), "hour", (byte) 9);
        setByteField(term4278936, term4278936.getClass(), "minute", (byte) 23);
        setByteField(term4278936, term4278936.getClass(), "second", (byte) 8);
        setIntField(term4278936, term4278936.getClass(), "nano", 996317936);
        setField(term4278931, term4278931.getClass(), "time", term4278936);
        setField(term4278905, term4278905.getClass(), "accessTime", term4278931);
        setField(term4278903, term4278903.getClass(), "card", term4278905);
        setField(term4278903, term4278903.getClass(), "userName", "dGaEEHiVQj");
        setIntField(term4278903, term4278903.getClass(), "isNetMember", -1017611355);
        setIntField(term4278903, term4278903.getClass(), "iconId", 2128888568);
        setIntField(term4278903, term4278903.getClass(), "plateId", 2080964110);
        setIntField(term4278903, term4278903.getClass(), "titleId", 1599859154);
        setIntField(term4278903, term4278903.getClass(), "partnerId", 119290310);
        setIntField(term4278903, term4278903.getClass(), "frameId", -1651117809);
        setIntField(term4278903, term4278903.getClass(), "selectMapId", -47226706);
        setIntField(term4278903, term4278903.getClass(), "totalAwake", -2032107789);
        setIntField(term4278903, term4278903.getClass(), "gradeRating", 788637534);
        setIntField(term4278903, term4278903.getClass(), "musicRating", 1220024537);
        setIntField(term4278903, term4278903.getClass(), "playerRating", 1181875005);
        setIntField(term4278903, term4278903.getClass(), "highestRating", -1496796706);
        setIntField(term4278903, term4278903.getClass(), "gradeRank", 96973636);
        setIntField(term4278903, term4278903.getClass(), "classRank", 366692731);
        setIntField(term4278903, term4278903.getClass(), "courseRank", 887532051);
        setField(term4278903, term4278903.getClass(), "charaSlot", term4278968);
        setField(term4278903, term4278903.getClass(), "charaLockSlot", term4278974);
        setLongField(term4278903, term4278903.getClass(), "contentBit", -1923462628809919137L);
        setIntField(term4278903, term4278903.getClass(), "playCount", -1186322521);
        setField(term4278903, term4278903.getClass(), "eventWatchedDate", "jZnCNlbNdB");
        setField(term4278903, term4278903.getClass(), "lastGameId", "sBAHIeCHXf");
        setField(term4278903, term4278903.getClass(), "lastRomVersion", "KwDEYRpiKU");
        setField(term4278903, term4278903.getClass(), "lastDataVersion", "CSoVBoaxSb");
        setField(term4278903, term4278903.getClass(), "lastLoginDate", "dewmXWoPfe");
        setField(term4278903, term4278903.getClass(), "lastPlayDate", "sMdILvyySb");
        setIntField(term4278903, term4278903.getClass(), "lastPlayCredit", -2003913669);
        setIntField(term4278903, term4278903.getClass(), "lastPlayMode", 2125632304);
        setIntField(term4278903, term4278903.getClass(), "lastPlaceId", 859710447);
        setField(term4278903, term4278903.getClass(), "lastPlaceName", "tEXhaWdesC");
        setIntField(term4278903, term4278903.getClass(), "lastAllNetId", 1703174254);
        setIntField(term4278903, term4278903.getClass(), "lastRegionId", -1596288136);
        setField(term4278903, term4278903.getClass(), "lastRegionName", "FpDsEpbDHR");
        setField(term4278903, term4278903.getClass(), "lastClientId", "kJwoDsKKlb");
        setField(term4278903, term4278903.getClass(), "lastCountryCode", "kfrUvAmPTb");
        setIntField(term4278903, term4278903.getClass(), "lastSelectEMoney", -1344128640);
        setIntField(term4278903, term4278903.getClass(), "lastSelectTicket", 1540395548);
        setIntField(term4278903, term4278903.getClass(), "lastSelectCourse", 1220400815);
        setIntField(term4278903, term4278903.getClass(), "lastCountCourse", -147940511);
        setField(term4278903, term4278903.getClass(), "firstGameId", "WhogjoaMAq");
        setField(term4278903, term4278903.getClass(), "firstRomVersion", "WdYegsauLy");
        setField(term4278903, term4278903.getClass(), "firstDataVersion", "QLUecHXFsF");
        setField(term4278903, term4278903.getClass(), "firstPlayDate", "qsVYkzXJXU");
        setField(term4278903, term4278903.getClass(), "compatibleCmVersion", "KnLyFNAPwf");
        setField(term4278903, term4278903.getClass(), "dailyBonusDate", "GVBHMoxDSq");
        setField(term4278903, term4278903.getClass(), "dailyCourseBonusDate", "UnMhbggbtY");
        setField(term4278903, term4278903.getClass(), "lastPairLoginDate", "zACKpskHww");
        setField(term4278903, term4278903.getClass(), "lastTrialPlayDate", "ozsKViNpsO");
        setIntField(term4278903, term4278903.getClass(), "playVsCount", -976563024);
        setIntField(term4278903, term4278903.getClass(), "playSyncCount", 1243154127);
        setIntField(term4278903, term4278903.getClass(), "winCount", -259833897);
        setIntField(term4278903, term4278903.getClass(), "helpCount", 1724968599);
        setIntField(term4278903, term4278903.getClass(), "comboCount", -480209284);
        setLongField(term4278903, term4278903.getClass(), "totalDeluxscore", -4666798010759326283L);
        setLongField(term4278903, term4278903.getClass(), "totalBasicDeluxscore", 6111719933533117230L);
        setLongField(term4278903, term4278903.getClass(), "totalAdvancedDeluxscore", -8018116082365397009L);
        setLongField(term4278903, term4278903.getClass(), "totalExpertDeluxscore", -337224826939575277L);
        setLongField(term4278903, term4278903.getClass(), "totalMasterDeluxscore", 9156789012835494942L);
        setLongField(term4278903, term4278903.getClass(), "totalReMasterDeluxscore", -1138870359465529054L);
        setIntField(term4278903, term4278903.getClass(), "totalSync", -1442351661);
        setIntField(term4278903, term4278903.getClass(), "totalBasicSync", -182336997);
        setIntField(term4278903, term4278903.getClass(), "totalAdvancedSync", -2019562698);
        setIntField(term4278903, term4278903.getClass(), "totalExpertSync", 333817347);
        setIntField(term4278903, term4278903.getClass(), "totalMasterSync", 535237479);
        setIntField(term4278903, term4278903.getClass(), "totalReMasterSync", -500288635);
        setLongField(term4278903, term4278903.getClass(), "totalAchievement", -1017903468795911883L);
        setLongField(term4278903, term4278903.getClass(), "totalBasicAchievement", 6221104209268413211L);
        setLongField(term4278903, term4278903.getClass(), "totalAdvancedAchievement", -9131409192247218607L);
        setLongField(term4278903, term4278903.getClass(), "totalExpertAchievement", 8192176065746751724L);
        setLongField(term4278903, term4278903.getClass(), "totalMasterAchievement", -8154167055371421993L);
        setLongField(term4278903, term4278903.getClass(), "totalReMasterAchievement", -8542481784554675590L);
        setLongField(term4278903, term4278903.getClass(), "playerOldRating", 4262975791853128921L);
        setLongField(term4278903, term4278903.getClass(), "playerNewRating", -4620196816224472160L);
        setIntField(term4278903, term4278903.getClass(), "banState", -1329332645);
        setLongField(term4278903, term4278903.getClass(), "dateTime", 357729277867132349L);
        term4279258 = new Integer(-1436956926);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4279258;
        callMethod(klass, "setTotalAwake", argTypes, term4278903, args);
    }

};


