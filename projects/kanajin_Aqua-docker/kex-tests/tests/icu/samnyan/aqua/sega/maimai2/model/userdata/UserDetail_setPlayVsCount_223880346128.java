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

public class UserDetail_setPlayVsCount_223880346128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term268022;
     Object term268361;

    public UserDetail_setPlayVsCount_223880346128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term268026 = new Long(-6423955170741487890L);
        ArrayList term268087 = new ArrayList();
        ArrayList term268091 = new ArrayList();
        term268022 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term268024 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term268040 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term268041 = newInstance(Class.forName("java.time.LocalDate"));
        Object term268045 = newInstance(Class.forName("java.time.LocalTime"));
        Object term268050 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term268051 = newInstance(Class.forName("java.time.LocalDate"));
        Object term268055 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term268022, term268022.getClass(), "id", 2301086556640849823L);
        setLongField(term268024, term268024.getClass(), "id", -4159390987334569031L);
        setField(term268024, term268024.getClass(), "extId", term268026);
        setField(term268024, term268024.getClass(), "luid", "fWkuqvVcuK");
        setIntField(term268041, term268041.getClass(), "year", 2025);
        setShortField(term268041, term268041.getClass(), "month", (short) 11);
        setShortField(term268041, term268041.getClass(), "day", (short) 28);
        setField(term268040, term268040.getClass(), "date", term268041);
        setByteField(term268045, term268045.getClass(), "hour", (byte) 0);
        setByteField(term268045, term268045.getClass(), "minute", (byte) 44);
        setByteField(term268045, term268045.getClass(), "second", (byte) 24);
        setIntField(term268045, term268045.getClass(), "nano", 379204030);
        setField(term268040, term268040.getClass(), "time", term268045);
        setField(term268024, term268024.getClass(), "registerTime", term268040);
        setIntField(term268051, term268051.getClass(), "year", 2019);
        setShortField(term268051, term268051.getClass(), "month", (short) 11);
        setShortField(term268051, term268051.getClass(), "day", (short) 16);
        setField(term268050, term268050.getClass(), "date", term268051);
        setByteField(term268055, term268055.getClass(), "hour", (byte) 6);
        setByteField(term268055, term268055.getClass(), "minute", (byte) 19);
        setByteField(term268055, term268055.getClass(), "second", (byte) 5);
        setIntField(term268055, term268055.getClass(), "nano", 858000554);
        setField(term268050, term268050.getClass(), "time", term268055);
        setField(term268024, term268024.getClass(), "accessTime", term268050);
        setField(term268022, term268022.getClass(), "card", term268024);
        setField(term268022, term268022.getClass(), "userName", "iCVAQxiyxL");
        setIntField(term268022, term268022.getClass(), "isNetMember", 2145469243);
        setIntField(term268022, term268022.getClass(), "iconId", -1085203878);
        setIntField(term268022, term268022.getClass(), "plateId", 2102804997);
        setIntField(term268022, term268022.getClass(), "titleId", -2061337332);
        setIntField(term268022, term268022.getClass(), "partnerId", -1750544367);
        setIntField(term268022, term268022.getClass(), "frameId", -986896155);
        setIntField(term268022, term268022.getClass(), "selectMapId", -1913247263);
        setIntField(term268022, term268022.getClass(), "totalAwake", 841131601);
        setIntField(term268022, term268022.getClass(), "gradeRating", 1026894609);
        setIntField(term268022, term268022.getClass(), "musicRating", -752007950);
        setIntField(term268022, term268022.getClass(), "playerRating", 529489313);
        setIntField(term268022, term268022.getClass(), "highestRating", -1966822843);
        setIntField(term268022, term268022.getClass(), "gradeRank", -1126343197);
        setIntField(term268022, term268022.getClass(), "classRank", -1298474124);
        setIntField(term268022, term268022.getClass(), "courseRank", -1320228060);
        setField(term268022, term268022.getClass(), "charaSlot", term268087);
        setField(term268022, term268022.getClass(), "charaLockSlot", term268091);
        setLongField(term268022, term268022.getClass(), "contentBit", 7147649316189106179L);
        setIntField(term268022, term268022.getClass(), "playCount", -2059191478);
        setField(term268022, term268022.getClass(), "eventWatchedDate", "qacQEntxMw");
        setField(term268022, term268022.getClass(), "lastGameId", "serkapmqZh");
        setField(term268022, term268022.getClass(), "lastRomVersion", "gcqWfMAFPK");
        setField(term268022, term268022.getClass(), "lastDataVersion", "ScxLRRGgyT");
        setField(term268022, term268022.getClass(), "lastLoginDate", "CkxvejcJwL");
        setField(term268022, term268022.getClass(), "lastPlayDate", "xbTYhfucaY");
        setIntField(term268022, term268022.getClass(), "lastPlayCredit", 2099010938);
        setIntField(term268022, term268022.getClass(), "lastPlayMode", 1636331683);
        setIntField(term268022, term268022.getClass(), "lastPlaceId", -362400915);
        setField(term268022, term268022.getClass(), "lastPlaceName", "oOhYSsilyF");
        setIntField(term268022, term268022.getClass(), "lastAllNetId", -1686882600);
        setIntField(term268022, term268022.getClass(), "lastRegionId", -1152741806);
        setField(term268022, term268022.getClass(), "lastRegionName", "ptFtBxcggt");
        setField(term268022, term268022.getClass(), "lastClientId", "CNPbNDYCYT");
        setField(term268022, term268022.getClass(), "lastCountryCode", "CmSBEaXuvA");
        setIntField(term268022, term268022.getClass(), "lastSelectEMoney", 22284525);
        setIntField(term268022, term268022.getClass(), "lastSelectTicket", -1429417338);
        setIntField(term268022, term268022.getClass(), "lastSelectCourse", -1579206256);
        setIntField(term268022, term268022.getClass(), "lastCountCourse", 1135921400);
        setField(term268022, term268022.getClass(), "firstGameId", "MzZzTPvXwn");
        setField(term268022, term268022.getClass(), "firstRomVersion", "XzOajjTxbc");
        setField(term268022, term268022.getClass(), "firstDataVersion", "EJFxVoQvCT");
        setField(term268022, term268022.getClass(), "firstPlayDate", "mrXdIpiGAF");
        setField(term268022, term268022.getClass(), "compatibleCmVersion", "uTxhnRMNZt");
        setField(term268022, term268022.getClass(), "dailyBonusDate", "qaqujvBPtP");
        setField(term268022, term268022.getClass(), "dailyCourseBonusDate", "ZIFZsMkyty");
        setField(term268022, term268022.getClass(), "lastPairLoginDate", "OQwMSrFmSo");
        setField(term268022, term268022.getClass(), "lastTrialPlayDate", "iIxzLmizFZ");
        setIntField(term268022, term268022.getClass(), "playVsCount", -2009944790);
        setIntField(term268022, term268022.getClass(), "playSyncCount", -195124832);
        setIntField(term268022, term268022.getClass(), "winCount", 815849616);
        setIntField(term268022, term268022.getClass(), "helpCount", 1484825295);
        setIntField(term268022, term268022.getClass(), "comboCount", 913538580);
        setLongField(term268022, term268022.getClass(), "totalDeluxscore", -2498855682980509687L);
        setLongField(term268022, term268022.getClass(), "totalBasicDeluxscore", -3872197144112566849L);
        setLongField(term268022, term268022.getClass(), "totalAdvancedDeluxscore", -1112171450410086447L);
        setLongField(term268022, term268022.getClass(), "totalExpertDeluxscore", 3301639601104158453L);
        setLongField(term268022, term268022.getClass(), "totalMasterDeluxscore", -895594136808346456L);
        setLongField(term268022, term268022.getClass(), "totalReMasterDeluxscore", 891342061053341688L);
        setIntField(term268022, term268022.getClass(), "totalSync", -1563084929);
        setIntField(term268022, term268022.getClass(), "totalBasicSync", 909134856);
        setIntField(term268022, term268022.getClass(), "totalAdvancedSync", 1535508240);
        setIntField(term268022, term268022.getClass(), "totalExpertSync", -2011428106);
        setIntField(term268022, term268022.getClass(), "totalMasterSync", -953251052);
        setIntField(term268022, term268022.getClass(), "totalReMasterSync", 1063368461);
        setLongField(term268022, term268022.getClass(), "totalAchievement", 7063734079041089862L);
        setLongField(term268022, term268022.getClass(), "totalBasicAchievement", -8457109861801685966L);
        setLongField(term268022, term268022.getClass(), "totalAdvancedAchievement", 1609431479232720642L);
        setLongField(term268022, term268022.getClass(), "totalExpertAchievement", -5628384992815132345L);
        setLongField(term268022, term268022.getClass(), "totalMasterAchievement", 5592242767625017237L);
        setLongField(term268022, term268022.getClass(), "totalReMasterAchievement", -5883519326783754118L);
        setLongField(term268022, term268022.getClass(), "playerOldRating", -5357355977627732189L);
        setLongField(term268022, term268022.getClass(), "playerNewRating", 1794084023885234767L);
        setIntField(term268022, term268022.getClass(), "banState", -1690162158);
        setLongField(term268022, term268022.getClass(), "dateTime", 1042450368129878652L);
        term268361 = new Integer(-681123934);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term268361;
        callMethod(klass, "setPlayVsCount", argTypes, term268022, args);
    }

};


