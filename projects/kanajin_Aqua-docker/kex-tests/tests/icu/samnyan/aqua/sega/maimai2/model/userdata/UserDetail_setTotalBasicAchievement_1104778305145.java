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

public class UserDetail_setTotalBasicAchievement_1104778305145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4312320;
     Object term4312679;

    public UserDetail_setTotalBasicAchievement_1104778305145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4312324 = new Long(-1443149616140457580L);
        Integer term4312387 = new Integer(-1426549826);
        Integer term4312389 = new Integer(1932134326);
        Integer term4312391 = new Integer(-909738839);
        Integer term4312393 = new Integer(271645048);
        Integer term4312395 = new Integer(1234306330);
        Integer term4312397 = new Integer(146827683);
        ArrayList term4312385 = new ArrayList();
        ((ArrayList) term4312385).add(term4312387);
        ((ArrayList) term4312385).add(term4312389);
        ((ArrayList) term4312385).add(term4312391);
        ((ArrayList) term4312385).add(term4312393);
        ((ArrayList) term4312385).add(term4312395);
        ((ArrayList) term4312385).add(term4312397);
        Integer term4312403 = new Integer(347724024);
        Integer term4312405 = new Integer(1273746652);
        Integer term4312407 = new Integer(1282163721);
        Integer term4312409 = new Integer(603248870);
        ArrayList term4312401 = new ArrayList();
        ((ArrayList) term4312401).add(term4312403);
        ((ArrayList) term4312401).add(term4312405);
        ((ArrayList) term4312401).add(term4312407);
        ((ArrayList) term4312401).add(term4312409);
        term4312320 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4312322 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4312338 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4312339 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4312343 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4312348 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4312349 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4312353 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4312320, term4312320.getClass(), "id", -8855138807315915210L);
        setLongField(term4312322, term4312322.getClass(), "id", 4003026833425121012L);
        setField(term4312322, term4312322.getClass(), "extId", term4312324);
        setField(term4312322, term4312322.getClass(), "luid", "UuEoObiiRR");
        setIntField(term4312339, term4312339.getClass(), "year", 2014);
        setShortField(term4312339, term4312339.getClass(), "month", (short) 1);
        setShortField(term4312339, term4312339.getClass(), "day", (short) 30);
        setField(term4312338, term4312338.getClass(), "date", term4312339);
        setByteField(term4312343, term4312343.getClass(), "hour", (byte) 13);
        setByteField(term4312343, term4312343.getClass(), "minute", (byte) 9);
        setByteField(term4312343, term4312343.getClass(), "second", (byte) 2);
        setIntField(term4312343, term4312343.getClass(), "nano", 863060702);
        setField(term4312338, term4312338.getClass(), "time", term4312343);
        setField(term4312322, term4312322.getClass(), "registerTime", term4312338);
        setIntField(term4312349, term4312349.getClass(), "year", 2027);
        setShortField(term4312349, term4312349.getClass(), "month", (short) 4);
        setShortField(term4312349, term4312349.getClass(), "day", (short) 23);
        setField(term4312348, term4312348.getClass(), "date", term4312349);
        setByteField(term4312353, term4312353.getClass(), "hour", (byte) 5);
        setByteField(term4312353, term4312353.getClass(), "minute", (byte) 43);
        setByteField(term4312353, term4312353.getClass(), "second", (byte) 47);
        setIntField(term4312353, term4312353.getClass(), "nano", 661272123);
        setField(term4312348, term4312348.getClass(), "time", term4312353);
        setField(term4312322, term4312322.getClass(), "accessTime", term4312348);
        setField(term4312320, term4312320.getClass(), "card", term4312322);
        setField(term4312320, term4312320.getClass(), "userName", "AVAhUlewQp");
        setIntField(term4312320, term4312320.getClass(), "isNetMember", 1345327840);
        setIntField(term4312320, term4312320.getClass(), "iconId", -119537517);
        setIntField(term4312320, term4312320.getClass(), "plateId", -1226175500);
        setIntField(term4312320, term4312320.getClass(), "titleId", -185237707);
        setIntField(term4312320, term4312320.getClass(), "partnerId", 79766082);
        setIntField(term4312320, term4312320.getClass(), "frameId", -964828849);
        setIntField(term4312320, term4312320.getClass(), "selectMapId", -1967921758);
        setIntField(term4312320, term4312320.getClass(), "totalAwake", 1419321120);
        setIntField(term4312320, term4312320.getClass(), "gradeRating", 95584243);
        setIntField(term4312320, term4312320.getClass(), "musicRating", -2042008730);
        setIntField(term4312320, term4312320.getClass(), "playerRating", -1372526002);
        setIntField(term4312320, term4312320.getClass(), "highestRating", 380986035);
        setIntField(term4312320, term4312320.getClass(), "gradeRank", -1908466693);
        setIntField(term4312320, term4312320.getClass(), "classRank", 4388728);
        setIntField(term4312320, term4312320.getClass(), "courseRank", 1161126724);
        setField(term4312320, term4312320.getClass(), "charaSlot", term4312385);
        setField(term4312320, term4312320.getClass(), "charaLockSlot", term4312401);
        setLongField(term4312320, term4312320.getClass(), "contentBit", 2869739254574409570L);
        setIntField(term4312320, term4312320.getClass(), "playCount", -782870193);
        setField(term4312320, term4312320.getClass(), "eventWatchedDate", "nveVMDUyGK");
        setField(term4312320, term4312320.getClass(), "lastGameId", "GwksxVYtgI");
        setField(term4312320, term4312320.getClass(), "lastRomVersion", "xDRRqMpkyT");
        setField(term4312320, term4312320.getClass(), "lastDataVersion", "ddPAGHVrcC");
        setField(term4312320, term4312320.getClass(), "lastLoginDate", "exjgwGKDrG");
        setField(term4312320, term4312320.getClass(), "lastPlayDate", "ODgmYOzAPW");
        setIntField(term4312320, term4312320.getClass(), "lastPlayCredit", -2035710504);
        setIntField(term4312320, term4312320.getClass(), "lastPlayMode", 1870928527);
        setIntField(term4312320, term4312320.getClass(), "lastPlaceId", -186083992);
        setField(term4312320, term4312320.getClass(), "lastPlaceName", "XgtRrfsUdm");
        setIntField(term4312320, term4312320.getClass(), "lastAllNetId", 299242809);
        setIntField(term4312320, term4312320.getClass(), "lastRegionId", -775330158);
        setField(term4312320, term4312320.getClass(), "lastRegionName", "wlqXUHPKWh");
        setField(term4312320, term4312320.getClass(), "lastClientId", "BbBjxuixPB");
        setField(term4312320, term4312320.getClass(), "lastCountryCode", "HVROpbzPgt");
        setIntField(term4312320, term4312320.getClass(), "lastSelectEMoney", -2053465943);
        setIntField(term4312320, term4312320.getClass(), "lastSelectTicket", 286301032);
        setIntField(term4312320, term4312320.getClass(), "lastSelectCourse", 203639747);
        setIntField(term4312320, term4312320.getClass(), "lastCountCourse", 992872461);
        setField(term4312320, term4312320.getClass(), "firstGameId", "vfFNTzznan");
        setField(term4312320, term4312320.getClass(), "firstRomVersion", "rLQUnxJJTx");
        setField(term4312320, term4312320.getClass(), "firstDataVersion", "iKvCBNkXHZ");
        setField(term4312320, term4312320.getClass(), "firstPlayDate", "SMTOKjtDCT");
        setField(term4312320, term4312320.getClass(), "compatibleCmVersion", "EmenxJmrqx");
        setField(term4312320, term4312320.getClass(), "dailyBonusDate", "yjswNRWOfK");
        setField(term4312320, term4312320.getClass(), "dailyCourseBonusDate", "jiSilEAOkt");
        setField(term4312320, term4312320.getClass(), "lastPairLoginDate", "IWRZGORtRu");
        setField(term4312320, term4312320.getClass(), "lastTrialPlayDate", "vRMLFvwyAg");
        setIntField(term4312320, term4312320.getClass(), "playVsCount", 1849785203);
        setIntField(term4312320, term4312320.getClass(), "playSyncCount", 1896165173);
        setIntField(term4312320, term4312320.getClass(), "winCount", -1240509523);
        setIntField(term4312320, term4312320.getClass(), "helpCount", 1712422301);
        setIntField(term4312320, term4312320.getClass(), "comboCount", -1009888937);
        setLongField(term4312320, term4312320.getClass(), "totalDeluxscore", -1535075897010531635L);
        setLongField(term4312320, term4312320.getClass(), "totalBasicDeluxscore", 8845284259135960728L);
        setLongField(term4312320, term4312320.getClass(), "totalAdvancedDeluxscore", -671353235827828434L);
        setLongField(term4312320, term4312320.getClass(), "totalExpertDeluxscore", -12484034271236895L);
        setLongField(term4312320, term4312320.getClass(), "totalMasterDeluxscore", -202165321669589515L);
        setLongField(term4312320, term4312320.getClass(), "totalReMasterDeluxscore", -1688738844518843607L);
        setIntField(term4312320, term4312320.getClass(), "totalSync", 947984046);
        setIntField(term4312320, term4312320.getClass(), "totalBasicSync", -1106041400);
        setIntField(term4312320, term4312320.getClass(), "totalAdvancedSync", -1392688673);
        setIntField(term4312320, term4312320.getClass(), "totalExpertSync", 92592312);
        setIntField(term4312320, term4312320.getClass(), "totalMasterSync", 1070671774);
        setIntField(term4312320, term4312320.getClass(), "totalReMasterSync", 1641104348);
        setLongField(term4312320, term4312320.getClass(), "totalAchievement", -3593535156236266885L);
        setLongField(term4312320, term4312320.getClass(), "totalBasicAchievement", -5771561454219454466L);
        setLongField(term4312320, term4312320.getClass(), "totalAdvancedAchievement", -3186265962040380682L);
        setLongField(term4312320, term4312320.getClass(), "totalExpertAchievement", 8504100392224558488L);
        setLongField(term4312320, term4312320.getClass(), "totalMasterAchievement", 4859936222119542303L);
        setLongField(term4312320, term4312320.getClass(), "totalReMasterAchievement", 8779179630835278873L);
        setLongField(term4312320, term4312320.getClass(), "playerOldRating", -8590801343056975084L);
        setLongField(term4312320, term4312320.getClass(), "playerNewRating", -1483573501067334635L);
        setIntField(term4312320, term4312320.getClass(), "banState", -1095082554);
        setLongField(term4312320, term4312320.getClass(), "dateTime", 2371294449893329278L);
        term4312679 = new Long(3965864580717473107L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term4312679;
        callMethod(klass, "setTotalBasicAchievement", argTypes, term4312320, args);
    }

};


