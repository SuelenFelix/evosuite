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

public class UserDetail_setTotalAdvancedSync_840314397140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term275326;
     Object term275669;

    public UserDetail_setTotalAdvancedSync_840314397140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term275330 = new Long(-4562564710769146498L);
        ArrayList term275391 = new ArrayList();
        Integer term275397 = new Integer(-1839071263);
        Integer term275399 = new Integer(1247519674);
        ArrayList term275395 = new ArrayList();
        ((ArrayList) term275395).add(term275397);
        ((ArrayList) term275395).add(term275399);
        term275326 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term275328 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term275344 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term275345 = newInstance(Class.forName("java.time.LocalDate"));
        Object term275349 = newInstance(Class.forName("java.time.LocalTime"));
        Object term275354 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term275355 = newInstance(Class.forName("java.time.LocalDate"));
        Object term275359 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term275326, term275326.getClass(), "id", -2751426663165831796L);
        setLongField(term275328, term275328.getClass(), "id", -3631822113112000823L);
        setField(term275328, term275328.getClass(), "extId", term275330);
        setField(term275328, term275328.getClass(), "luid", "tEBKFtmwsy");
        setIntField(term275345, term275345.getClass(), "year", 2013);
        setShortField(term275345, term275345.getClass(), "month", (short) 3);
        setShortField(term275345, term275345.getClass(), "day", (short) 23);
        setField(term275344, term275344.getClass(), "date", term275345);
        setByteField(term275349, term275349.getClass(), "hour", (byte) 15);
        setByteField(term275349, term275349.getClass(), "minute", (byte) 5);
        setByteField(term275349, term275349.getClass(), "second", (byte) 38);
        setIntField(term275349, term275349.getClass(), "nano", 214541172);
        setField(term275344, term275344.getClass(), "time", term275349);
        setField(term275328, term275328.getClass(), "registerTime", term275344);
        setIntField(term275355, term275355.getClass(), "year", 2019);
        setShortField(term275355, term275355.getClass(), "month", (short) 4);
        setShortField(term275355, term275355.getClass(), "day", (short) 27);
        setField(term275354, term275354.getClass(), "date", term275355);
        setByteField(term275359, term275359.getClass(), "hour", (byte) 14);
        setByteField(term275359, term275359.getClass(), "minute", (byte) 36);
        setByteField(term275359, term275359.getClass(), "second", (byte) 3);
        setIntField(term275359, term275359.getClass(), "nano", 745093939);
        setField(term275354, term275354.getClass(), "time", term275359);
        setField(term275328, term275328.getClass(), "accessTime", term275354);
        setField(term275326, term275326.getClass(), "card", term275328);
        setField(term275326, term275326.getClass(), "userName", "dPenXKHvpD");
        setIntField(term275326, term275326.getClass(), "isNetMember", 1827213743);
        setIntField(term275326, term275326.getClass(), "iconId", 342376736);
        setIntField(term275326, term275326.getClass(), "plateId", 385187012);
        setIntField(term275326, term275326.getClass(), "titleId", 1711124007);
        setIntField(term275326, term275326.getClass(), "partnerId", -259263754);
        setIntField(term275326, term275326.getClass(), "frameId", -544100653);
        setIntField(term275326, term275326.getClass(), "selectMapId", -1003987169);
        setIntField(term275326, term275326.getClass(), "totalAwake", -712530596);
        setIntField(term275326, term275326.getClass(), "gradeRating", 1421637009);
        setIntField(term275326, term275326.getClass(), "musicRating", 1360807458);
        setIntField(term275326, term275326.getClass(), "playerRating", -317598611);
        setIntField(term275326, term275326.getClass(), "highestRating", -1206911737);
        setIntField(term275326, term275326.getClass(), "gradeRank", -265778643);
        setIntField(term275326, term275326.getClass(), "classRank", 1311510289);
        setIntField(term275326, term275326.getClass(), "courseRank", 377078676);
        setField(term275326, term275326.getClass(), "charaSlot", term275391);
        setField(term275326, term275326.getClass(), "charaLockSlot", term275395);
        setLongField(term275326, term275326.getClass(), "contentBit", -9111904770777241650L);
        setIntField(term275326, term275326.getClass(), "playCount", -1162238383);
        setField(term275326, term275326.getClass(), "eventWatchedDate", "FdDLKyiSTJ");
        setField(term275326, term275326.getClass(), "lastGameId", "kicHqYxIOg");
        setField(term275326, term275326.getClass(), "lastRomVersion", "XYrfZHToau");
        setField(term275326, term275326.getClass(), "lastDataVersion", "BXQOPEyMOL");
        setField(term275326, term275326.getClass(), "lastLoginDate", "fwFmEEZWcB");
        setField(term275326, term275326.getClass(), "lastPlayDate", "AICUpHDOzG");
        setIntField(term275326, term275326.getClass(), "lastPlayCredit", 1991797348);
        setIntField(term275326, term275326.getClass(), "lastPlayMode", -1606878866);
        setIntField(term275326, term275326.getClass(), "lastPlaceId", -1878957947);
        setField(term275326, term275326.getClass(), "lastPlaceName", "DmkTfwDLZj");
        setIntField(term275326, term275326.getClass(), "lastAllNetId", 1297585470);
        setIntField(term275326, term275326.getClass(), "lastRegionId", 1699696518);
        setField(term275326, term275326.getClass(), "lastRegionName", "bHRIWgbDGz");
        setField(term275326, term275326.getClass(), "lastClientId", "twivmCinJk");
        setField(term275326, term275326.getClass(), "lastCountryCode", "eJyhQVneUo");
        setIntField(term275326, term275326.getClass(), "lastSelectEMoney", 1862321738);
        setIntField(term275326, term275326.getClass(), "lastSelectTicket", -2033071457);
        setIntField(term275326, term275326.getClass(), "lastSelectCourse", 893651267);
        setIntField(term275326, term275326.getClass(), "lastCountCourse", 857362843);
        setField(term275326, term275326.getClass(), "firstGameId", "oPFkgizJGX");
        setField(term275326, term275326.getClass(), "firstRomVersion", "ZyJFJOIYqn");
        setField(term275326, term275326.getClass(), "firstDataVersion", "KuaRCYIXDE");
        setField(term275326, term275326.getClass(), "firstPlayDate", "FidXoPwlYA");
        setField(term275326, term275326.getClass(), "compatibleCmVersion", "ZOXdaxYVyA");
        setField(term275326, term275326.getClass(), "dailyBonusDate", "hfzTDZlagT");
        setField(term275326, term275326.getClass(), "dailyCourseBonusDate", "QiQadgoFeJ");
        setField(term275326, term275326.getClass(), "lastPairLoginDate", "MiQeaqHnsr");
        setField(term275326, term275326.getClass(), "lastTrialPlayDate", "VPvnDPrxpV");
        setIntField(term275326, term275326.getClass(), "playVsCount", 724145317);
        setIntField(term275326, term275326.getClass(), "playSyncCount", -986993323);
        setIntField(term275326, term275326.getClass(), "winCount", 1997228827);
        setIntField(term275326, term275326.getClass(), "helpCount", 222278312);
        setIntField(term275326, term275326.getClass(), "comboCount", 1345586536);
        setLongField(term275326, term275326.getClass(), "totalDeluxscore", -4077972931583635718L);
        setLongField(term275326, term275326.getClass(), "totalBasicDeluxscore", -4087661954094562767L);
        setLongField(term275326, term275326.getClass(), "totalAdvancedDeluxscore", -2069802410884393635L);
        setLongField(term275326, term275326.getClass(), "totalExpertDeluxscore", -7318489446287633550L);
        setLongField(term275326, term275326.getClass(), "totalMasterDeluxscore", -6328940984239181735L);
        setLongField(term275326, term275326.getClass(), "totalReMasterDeluxscore", -2035236351195435931L);
        setIntField(term275326, term275326.getClass(), "totalSync", -1883388147);
        setIntField(term275326, term275326.getClass(), "totalBasicSync", 1671689178);
        setIntField(term275326, term275326.getClass(), "totalAdvancedSync", -434038223);
        setIntField(term275326, term275326.getClass(), "totalExpertSync", -1160303977);
        setIntField(term275326, term275326.getClass(), "totalMasterSync", -1616741813);
        setIntField(term275326, term275326.getClass(), "totalReMasterSync", -553905854);
        setLongField(term275326, term275326.getClass(), "totalAchievement", 2353997147592668754L);
        setLongField(term275326, term275326.getClass(), "totalBasicAchievement", 2891569319809230545L);
        setLongField(term275326, term275326.getClass(), "totalAdvancedAchievement", -4799973750933173971L);
        setLongField(term275326, term275326.getClass(), "totalExpertAchievement", 3341675853327783576L);
        setLongField(term275326, term275326.getClass(), "totalMasterAchievement", 563408943435752980L);
        setLongField(term275326, term275326.getClass(), "totalReMasterAchievement", -7440779687942559461L);
        setLongField(term275326, term275326.getClass(), "playerOldRating", -7787321607419384458L);
        setLongField(term275326, term275326.getClass(), "playerNewRating", 265930224867104476L);
        setIntField(term275326, term275326.getClass(), "banState", -1551399681);
        setLongField(term275326, term275326.getClass(), "dateTime", -2146197557018073263L);
        term275669 = new Integer(-875579962);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term275669;
        callMethod(klass, "setTotalAdvancedSync", argTypes, term275326, args);
    }

};


