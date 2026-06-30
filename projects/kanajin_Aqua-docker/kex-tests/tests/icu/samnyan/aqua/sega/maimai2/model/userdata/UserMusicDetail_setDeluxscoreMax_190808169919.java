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

public class UserMusicDetail_setDeluxscoreMax_190808169919 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66523;
     Object term66900;

    public UserMusicDetail_setDeluxscoreMax_190808169919() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term66529 = new Long(2354625302846375590L);
        Integer term66592 = new Integer(1689228897);
        Integer term66594 = new Integer(892205855);
        Integer term66596 = new Integer(1955560079);
        Integer term66598 = new Integer(-1330529019);
        Integer term66600 = new Integer(237134844);
        Integer term66602 = new Integer(2076413861);
        Integer term66604 = new Integer(66817373);
        Integer term66606 = new Integer(1459628013);
        Integer term66608 = new Integer(-1641507499);
        ArrayList term66590 = new ArrayList();
        ((ArrayList) term66590).add(term66592);
        ((ArrayList) term66590).add(term66594);
        ((ArrayList) term66590).add(term66596);
        ((ArrayList) term66590).add(term66598);
        ((ArrayList) term66590).add(term66600);
        ((ArrayList) term66590).add(term66602);
        ((ArrayList) term66590).add(term66604);
        ((ArrayList) term66590).add(term66606);
        ((ArrayList) term66590).add(term66608);
        Integer term66614 = new Integer(-33436796);
        Integer term66616 = new Integer(-1527326823);
        Integer term66618 = new Integer(469871899);
        Integer term66620 = new Integer(-1348703436);
        Integer term66622 = new Integer(-2027012650);
        ArrayList term66612 = new ArrayList();
        ((ArrayList) term66612).add(term66614);
        ((ArrayList) term66612).add(term66616);
        ((ArrayList) term66612).add(term66618);
        ((ArrayList) term66612).add(term66620);
        ((ArrayList) term66612).add(term66622);
        term66523 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMusicDetail"));
        Object term66525 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term66527 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term66543 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term66544 = newInstance(Class.forName("java.time.LocalDate"));
        Object term66548 = newInstance(Class.forName("java.time.LocalTime"));
        Object term66553 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term66554 = newInstance(Class.forName("java.time.LocalDate"));
        Object term66558 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term66523, term66523.getClass(), "id", 7937367749233415214L);
        setLongField(term66525, term66525.getClass(), "id", -356179638846982179L);
        setLongField(term66527, term66527.getClass(), "id", 1394860434350482902L);
        setField(term66527, term66527.getClass(), "extId", term66529);
        setField(term66527, term66527.getClass(), "luid", "HHAcgDPghN");
        setIntField(term66544, term66544.getClass(), "year", 2028);
        setShortField(term66544, term66544.getClass(), "month", (short) 5);
        setShortField(term66544, term66544.getClass(), "day", (short) 6);
        setField(term66543, term66543.getClass(), "date", term66544);
        setByteField(term66548, term66548.getClass(), "hour", (byte) 19);
        setByteField(term66548, term66548.getClass(), "minute", (byte) 33);
        setByteField(term66548, term66548.getClass(), "second", (byte) 32);
        setIntField(term66548, term66548.getClass(), "nano", 917257563);
        setField(term66543, term66543.getClass(), "time", term66548);
        setField(term66527, term66527.getClass(), "registerTime", term66543);
        setIntField(term66554, term66554.getClass(), "year", 2029);
        setShortField(term66554, term66554.getClass(), "month", (short) 7);
        setShortField(term66554, term66554.getClass(), "day", (short) 22);
        setField(term66553, term66553.getClass(), "date", term66554);
        setByteField(term66558, term66558.getClass(), "hour", (byte) 17);
        setByteField(term66558, term66558.getClass(), "minute", (byte) 59);
        setByteField(term66558, term66558.getClass(), "second", (byte) 58);
        setIntField(term66558, term66558.getClass(), "nano", 921418702);
        setField(term66553, term66553.getClass(), "time", term66558);
        setField(term66527, term66527.getClass(), "accessTime", term66553);
        setField(term66525, term66525.getClass(), "card", term66527);
        setField(term66525, term66525.getClass(), "userName", "GzmFcFoYft");
        setIntField(term66525, term66525.getClass(), "isNetMember", 2051356935);
        setIntField(term66525, term66525.getClass(), "iconId", -383329501);
        setIntField(term66525, term66525.getClass(), "plateId", 617819961);
        setIntField(term66525, term66525.getClass(), "titleId", -1030437854);
        setIntField(term66525, term66525.getClass(), "partnerId", 131035705);
        setIntField(term66525, term66525.getClass(), "frameId", 1345091994);
        setIntField(term66525, term66525.getClass(), "selectMapId", -657987818);
        setIntField(term66525, term66525.getClass(), "totalAwake", -211167283);
        setIntField(term66525, term66525.getClass(), "gradeRating", -1037774699);
        setIntField(term66525, term66525.getClass(), "musicRating", -851853041);
        setIntField(term66525, term66525.getClass(), "playerRating", 1501524873);
        setIntField(term66525, term66525.getClass(), "highestRating", 92455948);
        setIntField(term66525, term66525.getClass(), "gradeRank", -1557991371);
        setIntField(term66525, term66525.getClass(), "classRank", -951318891);
        setIntField(term66525, term66525.getClass(), "courseRank", 718233611);
        setField(term66525, term66525.getClass(), "charaSlot", term66590);
        setField(term66525, term66525.getClass(), "charaLockSlot", term66612);
        setLongField(term66525, term66525.getClass(), "contentBit", 828765974823196503L);
        setIntField(term66525, term66525.getClass(), "playCount", -2015648096);
        setField(term66525, term66525.getClass(), "eventWatchedDate", "LYRdIFgbgt");
        setField(term66525, term66525.getClass(), "lastGameId", "NiKeRXajei");
        setField(term66525, term66525.getClass(), "lastRomVersion", "fDNtdfDzQh");
        setField(term66525, term66525.getClass(), "lastDataVersion", "VbIydgisyZ");
        setField(term66525, term66525.getClass(), "lastLoginDate", "vigaMWRpCA");
        setField(term66525, term66525.getClass(), "lastPlayDate", "sgVVVUpnau");
        setIntField(term66525, term66525.getClass(), "lastPlayCredit", -818525120);
        setIntField(term66525, term66525.getClass(), "lastPlayMode", 2119335779);
        setIntField(term66525, term66525.getClass(), "lastPlaceId", -808109817);
        setField(term66525, term66525.getClass(), "lastPlaceName", "xwVTgDhNdW");
        setIntField(term66525, term66525.getClass(), "lastAllNetId", 33486504);
        setIntField(term66525, term66525.getClass(), "lastRegionId", -2112546178);
        setField(term66525, term66525.getClass(), "lastRegionName", "ruqGjVRVlD");
        setField(term66525, term66525.getClass(), "lastClientId", "oeoFYkQLVk");
        setField(term66525, term66525.getClass(), "lastCountryCode", "fibZqjUmdU");
        setIntField(term66525, term66525.getClass(), "lastSelectEMoney", 2088023767);
        setIntField(term66525, term66525.getClass(), "lastSelectTicket", -1750178936);
        setIntField(term66525, term66525.getClass(), "lastSelectCourse", 1007162436);
        setIntField(term66525, term66525.getClass(), "lastCountCourse", -1475097555);
        setField(term66525, term66525.getClass(), "firstGameId", "DvLIPKnbCV");
        setField(term66525, term66525.getClass(), "firstRomVersion", "QwAMZyCIhS");
        setField(term66525, term66525.getClass(), "firstDataVersion", "TnLDXZoBoo");
        setField(term66525, term66525.getClass(), "firstPlayDate", "RQTElJrtwb");
        setField(term66525, term66525.getClass(), "compatibleCmVersion", "hFvoVHxToy");
        setField(term66525, term66525.getClass(), "dailyBonusDate", "ZybsWgYCUR");
        setField(term66525, term66525.getClass(), "dailyCourseBonusDate", "YZNLZnNFNI");
        setField(term66525, term66525.getClass(), "lastPairLoginDate", "uHcUlIseio");
        setField(term66525, term66525.getClass(), "lastTrialPlayDate", "bsmWXOcLZJ");
        setIntField(term66525, term66525.getClass(), "playVsCount", 1715200190);
        setIntField(term66525, term66525.getClass(), "playSyncCount", 766065716);
        setIntField(term66525, term66525.getClass(), "winCount", -431182213);
        setIntField(term66525, term66525.getClass(), "helpCount", 419448852);
        setIntField(term66525, term66525.getClass(), "comboCount", -494367790);
        setLongField(term66525, term66525.getClass(), "totalDeluxscore", 2517346858311378765L);
        setLongField(term66525, term66525.getClass(), "totalBasicDeluxscore", 8227165037887933407L);
        setLongField(term66525, term66525.getClass(), "totalAdvancedDeluxscore", -689231427687092388L);
        setLongField(term66525, term66525.getClass(), "totalExpertDeluxscore", 8373979822629220849L);
        setLongField(term66525, term66525.getClass(), "totalMasterDeluxscore", 1118204947601768403L);
        setLongField(term66525, term66525.getClass(), "totalReMasterDeluxscore", -59812931280292932L);
        setIntField(term66525, term66525.getClass(), "totalSync", 620015992);
        setIntField(term66525, term66525.getClass(), "totalBasicSync", 396108638);
        setIntField(term66525, term66525.getClass(), "totalAdvancedSync", 581841369);
        setIntField(term66525, term66525.getClass(), "totalExpertSync", 970094723);
        setIntField(term66525, term66525.getClass(), "totalMasterSync", 376622340);
        setIntField(term66525, term66525.getClass(), "totalReMasterSync", 1985101421);
        setLongField(term66525, term66525.getClass(), "totalAchievement", 2152337427888260081L);
        setLongField(term66525, term66525.getClass(), "totalBasicAchievement", 5626125546253518889L);
        setLongField(term66525, term66525.getClass(), "totalAdvancedAchievement", -9087544875525123832L);
        setLongField(term66525, term66525.getClass(), "totalExpertAchievement", -5307421637859729894L);
        setLongField(term66525, term66525.getClass(), "totalMasterAchievement", -7052314256530764447L);
        setLongField(term66525, term66525.getClass(), "totalReMasterAchievement", -5504583784484702218L);
        setLongField(term66525, term66525.getClass(), "playerOldRating", -717218840624209572L);
        setLongField(term66525, term66525.getClass(), "playerNewRating", -2831937652710360219L);
        setIntField(term66525, term66525.getClass(), "banState", 422564495);
        setLongField(term66525, term66525.getClass(), "dateTime", 5283775914828093148L);
        setField(term66523, term66523.getClass(), "user", term66525);
        setIntField(term66523, term66523.getClass(), "musicId", -1614243846);
        setIntField(term66523, term66523.getClass(), "level", 1218830458);
        setIntField(term66523, term66523.getClass(), "playCount", 476903736);
        setIntField(term66523, term66523.getClass(), "achievement", -832801133);
        setIntField(term66523, term66523.getClass(), "comboStatus", 658732890);
        setIntField(term66523, term66523.getClass(), "syncStatus", 888621409);
        setIntField(term66523, term66523.getClass(), "deluxscoreMax", 665526857);
        setIntField(term66523, term66523.getClass(), "scoreRank", 184439959);
        term66900 = new Integer(-153314488);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term66900;
        callMethod(klass, "setDeluxscoreMax", argTypes, term66523, args);
    }

};


