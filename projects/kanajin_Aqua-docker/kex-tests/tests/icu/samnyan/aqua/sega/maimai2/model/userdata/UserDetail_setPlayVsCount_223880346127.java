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

public class UserDetail_setPlayVsCount_223880346127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term267967;
     Object term268306;

    public UserDetail_setPlayVsCount_223880346127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term267971 = new Long(-6423955170741487890L);
        ArrayList term268032 = new ArrayList();
        ArrayList term268036 = new ArrayList();
        term267967 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term267969 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term267985 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term267986 = newInstance(Class.forName("java.time.LocalDate"));
        Object term267990 = newInstance(Class.forName("java.time.LocalTime"));
        Object term267995 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term267996 = newInstance(Class.forName("java.time.LocalDate"));
        Object term268000 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term267967, term267967.getClass(), "id", 2301086556640849823L);
        setLongField(term267969, term267969.getClass(), "id", -4159390987334569031L);
        setField(term267969, term267969.getClass(), "extId", term267971);
        setField(term267969, term267969.getClass(), "luid", "fWkuqvVcuK");
        setIntField(term267986, term267986.getClass(), "year", 2025);
        setShortField(term267986, term267986.getClass(), "month", (short) 11);
        setShortField(term267986, term267986.getClass(), "day", (short) 28);
        setField(term267985, term267985.getClass(), "date", term267986);
        setByteField(term267990, term267990.getClass(), "hour", (byte) 0);
        setByteField(term267990, term267990.getClass(), "minute", (byte) 44);
        setByteField(term267990, term267990.getClass(), "second", (byte) 24);
        setIntField(term267990, term267990.getClass(), "nano", 379204030);
        setField(term267985, term267985.getClass(), "time", term267990);
        setField(term267969, term267969.getClass(), "registerTime", term267985);
        setIntField(term267996, term267996.getClass(), "year", 2019);
        setShortField(term267996, term267996.getClass(), "month", (short) 11);
        setShortField(term267996, term267996.getClass(), "day", (short) 16);
        setField(term267995, term267995.getClass(), "date", term267996);
        setByteField(term268000, term268000.getClass(), "hour", (byte) 6);
        setByteField(term268000, term268000.getClass(), "minute", (byte) 19);
        setByteField(term268000, term268000.getClass(), "second", (byte) 5);
        setIntField(term268000, term268000.getClass(), "nano", 858000554);
        setField(term267995, term267995.getClass(), "time", term268000);
        setField(term267969, term267969.getClass(), "accessTime", term267995);
        setField(term267967, term267967.getClass(), "card", term267969);
        setField(term267967, term267967.getClass(), "userName", "iCVAQxiyxL");
        setIntField(term267967, term267967.getClass(), "isNetMember", 2145469243);
        setIntField(term267967, term267967.getClass(), "iconId", -1085203878);
        setIntField(term267967, term267967.getClass(), "plateId", 2102804997);
        setIntField(term267967, term267967.getClass(), "titleId", -2061337332);
        setIntField(term267967, term267967.getClass(), "partnerId", -1750544367);
        setIntField(term267967, term267967.getClass(), "frameId", -986896155);
        setIntField(term267967, term267967.getClass(), "selectMapId", -1913247263);
        setIntField(term267967, term267967.getClass(), "totalAwake", 841131601);
        setIntField(term267967, term267967.getClass(), "gradeRating", 1026894609);
        setIntField(term267967, term267967.getClass(), "musicRating", -752007950);
        setIntField(term267967, term267967.getClass(), "playerRating", 529489313);
        setIntField(term267967, term267967.getClass(), "highestRating", -1966822843);
        setIntField(term267967, term267967.getClass(), "gradeRank", -1126343197);
        setIntField(term267967, term267967.getClass(), "classRank", -1298474124);
        setIntField(term267967, term267967.getClass(), "courseRank", -1320228060);
        setField(term267967, term267967.getClass(), "charaSlot", term268032);
        setField(term267967, term267967.getClass(), "charaLockSlot", term268036);
        setLongField(term267967, term267967.getClass(), "contentBit", 7147649316189106179L);
        setIntField(term267967, term267967.getClass(), "playCount", -2059191478);
        setField(term267967, term267967.getClass(), "eventWatchedDate", "qacQEntxMw");
        setField(term267967, term267967.getClass(), "lastGameId", "serkapmqZh");
        setField(term267967, term267967.getClass(), "lastRomVersion", "gcqWfMAFPK");
        setField(term267967, term267967.getClass(), "lastDataVersion", "ScxLRRGgyT");
        setField(term267967, term267967.getClass(), "lastLoginDate", "CkxvejcJwL");
        setField(term267967, term267967.getClass(), "lastPlayDate", "xbTYhfucaY");
        setIntField(term267967, term267967.getClass(), "lastPlayCredit", 2099010938);
        setIntField(term267967, term267967.getClass(), "lastPlayMode", 1636331683);
        setIntField(term267967, term267967.getClass(), "lastPlaceId", -362400915);
        setField(term267967, term267967.getClass(), "lastPlaceName", "oOhYSsilyF");
        setIntField(term267967, term267967.getClass(), "lastAllNetId", -1686882600);
        setIntField(term267967, term267967.getClass(), "lastRegionId", -1152741806);
        setField(term267967, term267967.getClass(), "lastRegionName", "ptFtBxcggt");
        setField(term267967, term267967.getClass(), "lastClientId", "CNPbNDYCYT");
        setField(term267967, term267967.getClass(), "lastCountryCode", "CmSBEaXuvA");
        setIntField(term267967, term267967.getClass(), "lastSelectEMoney", 22284525);
        setIntField(term267967, term267967.getClass(), "lastSelectTicket", -1429417338);
        setIntField(term267967, term267967.getClass(), "lastSelectCourse", -1579206256);
        setIntField(term267967, term267967.getClass(), "lastCountCourse", 1135921400);
        setField(term267967, term267967.getClass(), "firstGameId", "MzZzTPvXwn");
        setField(term267967, term267967.getClass(), "firstRomVersion", "XzOajjTxbc");
        setField(term267967, term267967.getClass(), "firstDataVersion", "EJFxVoQvCT");
        setField(term267967, term267967.getClass(), "firstPlayDate", "mrXdIpiGAF");
        setField(term267967, term267967.getClass(), "compatibleCmVersion", "uTxhnRMNZt");
        setField(term267967, term267967.getClass(), "dailyBonusDate", "qaqujvBPtP");
        setField(term267967, term267967.getClass(), "dailyCourseBonusDate", "ZIFZsMkyty");
        setField(term267967, term267967.getClass(), "lastPairLoginDate", "OQwMSrFmSo");
        setField(term267967, term267967.getClass(), "lastTrialPlayDate", "iIxzLmizFZ");
        setIntField(term267967, term267967.getClass(), "playVsCount", -2009944790);
        setIntField(term267967, term267967.getClass(), "playSyncCount", -195124832);
        setIntField(term267967, term267967.getClass(), "winCount", 815849616);
        setIntField(term267967, term267967.getClass(), "helpCount", 1484825295);
        setIntField(term267967, term267967.getClass(), "comboCount", 913538580);
        setLongField(term267967, term267967.getClass(), "totalDeluxscore", -2498855682980509687L);
        setLongField(term267967, term267967.getClass(), "totalBasicDeluxscore", -3872197144112566849L);
        setLongField(term267967, term267967.getClass(), "totalAdvancedDeluxscore", -1112171450410086447L);
        setLongField(term267967, term267967.getClass(), "totalExpertDeluxscore", 3301639601104158453L);
        setLongField(term267967, term267967.getClass(), "totalMasterDeluxscore", -895594136808346456L);
        setLongField(term267967, term267967.getClass(), "totalReMasterDeluxscore", 891342061053341688L);
        setIntField(term267967, term267967.getClass(), "totalSync", -1563084929);
        setIntField(term267967, term267967.getClass(), "totalBasicSync", 909134856);
        setIntField(term267967, term267967.getClass(), "totalAdvancedSync", 1535508240);
        setIntField(term267967, term267967.getClass(), "totalExpertSync", -2011428106);
        setIntField(term267967, term267967.getClass(), "totalMasterSync", -953251052);
        setIntField(term267967, term267967.getClass(), "totalReMasterSync", 1063368461);
        setLongField(term267967, term267967.getClass(), "totalAchievement", 7063734079041089862L);
        setLongField(term267967, term267967.getClass(), "totalBasicAchievement", -8457109861801685966L);
        setLongField(term267967, term267967.getClass(), "totalAdvancedAchievement", 1609431479232720642L);
        setLongField(term267967, term267967.getClass(), "totalExpertAchievement", -5628384992815132345L);
        setLongField(term267967, term267967.getClass(), "totalMasterAchievement", 5592242767625017237L);
        setLongField(term267967, term267967.getClass(), "totalReMasterAchievement", -5883519326783754118L);
        setLongField(term267967, term267967.getClass(), "playerOldRating", -5357355977627732189L);
        setLongField(term267967, term267967.getClass(), "playerNewRating", 1794084023885234767L);
        setIntField(term267967, term267967.getClass(), "banState", -1690162158);
        setLongField(term267967, term267967.getClass(), "dateTime", 1042450368129878652L);
        term268306 = new Integer(-681123934);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term268306;
        callMethod(klass, "setPlayVsCount", argTypes, term267967, args);
    }

};


