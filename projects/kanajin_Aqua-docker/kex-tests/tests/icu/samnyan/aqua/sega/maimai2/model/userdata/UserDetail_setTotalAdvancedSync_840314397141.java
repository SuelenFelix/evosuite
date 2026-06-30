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

public class UserDetail_setTotalAdvancedSync_840314397141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term275381;
     Object term275724;

    public UserDetail_setTotalAdvancedSync_840314397141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term275385 = new Long(-4562564710769146498L);
        ArrayList term275446 = new ArrayList();
        Integer term275452 = new Integer(-1839071263);
        Integer term275454 = new Integer(1247519674);
        ArrayList term275450 = new ArrayList();
        ((ArrayList) term275450).add(term275452);
        ((ArrayList) term275450).add(term275454);
        term275381 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term275383 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term275399 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term275400 = newInstance(Class.forName("java.time.LocalDate"));
        Object term275404 = newInstance(Class.forName("java.time.LocalTime"));
        Object term275409 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term275410 = newInstance(Class.forName("java.time.LocalDate"));
        Object term275414 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term275381, term275381.getClass(), "id", -2751426663165831796L);
        setLongField(term275383, term275383.getClass(), "id", -3631822113112000823L);
        setField(term275383, term275383.getClass(), "extId", term275385);
        setField(term275383, term275383.getClass(), "luid", "tEBKFtmwsy");
        setIntField(term275400, term275400.getClass(), "year", 2013);
        setShortField(term275400, term275400.getClass(), "month", (short) 3);
        setShortField(term275400, term275400.getClass(), "day", (short) 23);
        setField(term275399, term275399.getClass(), "date", term275400);
        setByteField(term275404, term275404.getClass(), "hour", (byte) 15);
        setByteField(term275404, term275404.getClass(), "minute", (byte) 5);
        setByteField(term275404, term275404.getClass(), "second", (byte) 38);
        setIntField(term275404, term275404.getClass(), "nano", 214541172);
        setField(term275399, term275399.getClass(), "time", term275404);
        setField(term275383, term275383.getClass(), "registerTime", term275399);
        setIntField(term275410, term275410.getClass(), "year", 2019);
        setShortField(term275410, term275410.getClass(), "month", (short) 4);
        setShortField(term275410, term275410.getClass(), "day", (short) 27);
        setField(term275409, term275409.getClass(), "date", term275410);
        setByteField(term275414, term275414.getClass(), "hour", (byte) 14);
        setByteField(term275414, term275414.getClass(), "minute", (byte) 36);
        setByteField(term275414, term275414.getClass(), "second", (byte) 3);
        setIntField(term275414, term275414.getClass(), "nano", 745093939);
        setField(term275409, term275409.getClass(), "time", term275414);
        setField(term275383, term275383.getClass(), "accessTime", term275409);
        setField(term275381, term275381.getClass(), "card", term275383);
        setField(term275381, term275381.getClass(), "userName", "dPenXKHvpD");
        setIntField(term275381, term275381.getClass(), "isNetMember", 1827213743);
        setIntField(term275381, term275381.getClass(), "iconId", 342376736);
        setIntField(term275381, term275381.getClass(), "plateId", 385187012);
        setIntField(term275381, term275381.getClass(), "titleId", 1711124007);
        setIntField(term275381, term275381.getClass(), "partnerId", -259263754);
        setIntField(term275381, term275381.getClass(), "frameId", -544100653);
        setIntField(term275381, term275381.getClass(), "selectMapId", -1003987169);
        setIntField(term275381, term275381.getClass(), "totalAwake", -712530596);
        setIntField(term275381, term275381.getClass(), "gradeRating", 1421637009);
        setIntField(term275381, term275381.getClass(), "musicRating", 1360807458);
        setIntField(term275381, term275381.getClass(), "playerRating", -317598611);
        setIntField(term275381, term275381.getClass(), "highestRating", -1206911737);
        setIntField(term275381, term275381.getClass(), "gradeRank", -265778643);
        setIntField(term275381, term275381.getClass(), "classRank", 1311510289);
        setIntField(term275381, term275381.getClass(), "courseRank", 377078676);
        setField(term275381, term275381.getClass(), "charaSlot", term275446);
        setField(term275381, term275381.getClass(), "charaLockSlot", term275450);
        setLongField(term275381, term275381.getClass(), "contentBit", -9111904770777241650L);
        setIntField(term275381, term275381.getClass(), "playCount", -1162238383);
        setField(term275381, term275381.getClass(), "eventWatchedDate", "FdDLKyiSTJ");
        setField(term275381, term275381.getClass(), "lastGameId", "kicHqYxIOg");
        setField(term275381, term275381.getClass(), "lastRomVersion", "XYrfZHToau");
        setField(term275381, term275381.getClass(), "lastDataVersion", "BXQOPEyMOL");
        setField(term275381, term275381.getClass(), "lastLoginDate", "fwFmEEZWcB");
        setField(term275381, term275381.getClass(), "lastPlayDate", "AICUpHDOzG");
        setIntField(term275381, term275381.getClass(), "lastPlayCredit", 1991797348);
        setIntField(term275381, term275381.getClass(), "lastPlayMode", -1606878866);
        setIntField(term275381, term275381.getClass(), "lastPlaceId", -1878957947);
        setField(term275381, term275381.getClass(), "lastPlaceName", "DmkTfwDLZj");
        setIntField(term275381, term275381.getClass(), "lastAllNetId", 1297585470);
        setIntField(term275381, term275381.getClass(), "lastRegionId", 1699696518);
        setField(term275381, term275381.getClass(), "lastRegionName", "bHRIWgbDGz");
        setField(term275381, term275381.getClass(), "lastClientId", "twivmCinJk");
        setField(term275381, term275381.getClass(), "lastCountryCode", "eJyhQVneUo");
        setIntField(term275381, term275381.getClass(), "lastSelectEMoney", 1862321738);
        setIntField(term275381, term275381.getClass(), "lastSelectTicket", -2033071457);
        setIntField(term275381, term275381.getClass(), "lastSelectCourse", 893651267);
        setIntField(term275381, term275381.getClass(), "lastCountCourse", 857362843);
        setField(term275381, term275381.getClass(), "firstGameId", "oPFkgizJGX");
        setField(term275381, term275381.getClass(), "firstRomVersion", "ZyJFJOIYqn");
        setField(term275381, term275381.getClass(), "firstDataVersion", "KuaRCYIXDE");
        setField(term275381, term275381.getClass(), "firstPlayDate", "FidXoPwlYA");
        setField(term275381, term275381.getClass(), "compatibleCmVersion", "ZOXdaxYVyA");
        setField(term275381, term275381.getClass(), "dailyBonusDate", "hfzTDZlagT");
        setField(term275381, term275381.getClass(), "dailyCourseBonusDate", "QiQadgoFeJ");
        setField(term275381, term275381.getClass(), "lastPairLoginDate", "MiQeaqHnsr");
        setField(term275381, term275381.getClass(), "lastTrialPlayDate", "VPvnDPrxpV");
        setIntField(term275381, term275381.getClass(), "playVsCount", 724145317);
        setIntField(term275381, term275381.getClass(), "playSyncCount", -986993323);
        setIntField(term275381, term275381.getClass(), "winCount", 1997228827);
        setIntField(term275381, term275381.getClass(), "helpCount", 222278312);
        setIntField(term275381, term275381.getClass(), "comboCount", 1345586536);
        setLongField(term275381, term275381.getClass(), "totalDeluxscore", -4077972931583635718L);
        setLongField(term275381, term275381.getClass(), "totalBasicDeluxscore", -4087661954094562767L);
        setLongField(term275381, term275381.getClass(), "totalAdvancedDeluxscore", -2069802410884393635L);
        setLongField(term275381, term275381.getClass(), "totalExpertDeluxscore", -7318489446287633550L);
        setLongField(term275381, term275381.getClass(), "totalMasterDeluxscore", -6328940984239181735L);
        setLongField(term275381, term275381.getClass(), "totalReMasterDeluxscore", -2035236351195435931L);
        setIntField(term275381, term275381.getClass(), "totalSync", -1883388147);
        setIntField(term275381, term275381.getClass(), "totalBasicSync", 1671689178);
        setIntField(term275381, term275381.getClass(), "totalAdvancedSync", -434038223);
        setIntField(term275381, term275381.getClass(), "totalExpertSync", -1160303977);
        setIntField(term275381, term275381.getClass(), "totalMasterSync", -1616741813);
        setIntField(term275381, term275381.getClass(), "totalReMasterSync", -553905854);
        setLongField(term275381, term275381.getClass(), "totalAchievement", 2353997147592668754L);
        setLongField(term275381, term275381.getClass(), "totalBasicAchievement", 2891569319809230545L);
        setLongField(term275381, term275381.getClass(), "totalAdvancedAchievement", -4799973750933173971L);
        setLongField(term275381, term275381.getClass(), "totalExpertAchievement", 3341675853327783576L);
        setLongField(term275381, term275381.getClass(), "totalMasterAchievement", 563408943435752980L);
        setLongField(term275381, term275381.getClass(), "totalReMasterAchievement", -7440779687942559461L);
        setLongField(term275381, term275381.getClass(), "playerOldRating", -7787321607419384458L);
        setLongField(term275381, term275381.getClass(), "playerNewRating", 265930224867104476L);
        setIntField(term275381, term275381.getClass(), "banState", -1551399681);
        setLongField(term275381, term275381.getClass(), "dateTime", -2146197557018073263L);
        term275724 = new Integer(-875579962);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term275724;
        callMethod(klass, "setTotalAdvancedSync", argTypes, term275381, args);
    }

};


