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

public class UserDetail_setPlayCount_125850916198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4285193;
     Object term4285562;

    public UserDetail_setPlayCount_125850916198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4285197 = new Long(-6649862739070461398L);
        Integer term4285260 = new Integer(238928554);
        Integer term4285262 = new Integer(1223346141);
        Integer term4285264 = new Integer(-2030508372);
        Integer term4285266 = new Integer(1541228086);
        Integer term4285268 = new Integer(297742417);
        Integer term4285270 = new Integer(1816437264);
        Integer term4285272 = new Integer(-1501877126);
        ArrayList term4285258 = new ArrayList();
        ((ArrayList) term4285258).add(term4285260);
        ((ArrayList) term4285258).add(term4285262);
        ((ArrayList) term4285258).add(term4285264);
        ((ArrayList) term4285258).add(term4285266);
        ((ArrayList) term4285258).add(term4285268);
        ((ArrayList) term4285258).add(term4285270);
        ((ArrayList) term4285258).add(term4285272);
        Integer term4285278 = new Integer(803853178);
        Integer term4285280 = new Integer(-1572151301);
        Integer term4285282 = new Integer(1802492559);
        Integer term4285284 = new Integer(-800228870);
        Integer term4285286 = new Integer(-604044709);
        Integer term4285288 = new Integer(-474659885);
        Integer term4285290 = new Integer(992754091);
        Integer term4285292 = new Integer(-711076640);
        ArrayList term4285276 = new ArrayList();
        ((ArrayList) term4285276).add(term4285278);
        ((ArrayList) term4285276).add(term4285280);
        ((ArrayList) term4285276).add(term4285282);
        ((ArrayList) term4285276).add(term4285284);
        ((ArrayList) term4285276).add(term4285286);
        ((ArrayList) term4285276).add(term4285288);
        ((ArrayList) term4285276).add(term4285290);
        ((ArrayList) term4285276).add(term4285292);
        term4285193 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4285195 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4285211 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4285212 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4285216 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4285221 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4285222 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4285226 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4285193, term4285193.getClass(), "id", -2716518499923795083L);
        setLongField(term4285195, term4285195.getClass(), "id", 5772904908974053690L);
        setField(term4285195, term4285195.getClass(), "extId", term4285197);
        setField(term4285195, term4285195.getClass(), "luid", "RZGcaiAoyG");
        setIntField(term4285212, term4285212.getClass(), "year", 2020);
        setShortField(term4285212, term4285212.getClass(), "month", (short) 1);
        setShortField(term4285212, term4285212.getClass(), "day", (short) 2);
        setField(term4285211, term4285211.getClass(), "date", term4285212);
        setByteField(term4285216, term4285216.getClass(), "hour", (byte) 22);
        setByteField(term4285216, term4285216.getClass(), "minute", (byte) 28);
        setByteField(term4285216, term4285216.getClass(), "second", (byte) 28);
        setIntField(term4285216, term4285216.getClass(), "nano", 232686209);
        setField(term4285211, term4285211.getClass(), "time", term4285216);
        setField(term4285195, term4285195.getClass(), "registerTime", term4285211);
        setIntField(term4285222, term4285222.getClass(), "year", 2013);
        setShortField(term4285222, term4285222.getClass(), "month", (short) 9);
        setShortField(term4285222, term4285222.getClass(), "day", (short) 7);
        setField(term4285221, term4285221.getClass(), "date", term4285222);
        setByteField(term4285226, term4285226.getClass(), "hour", (byte) 8);
        setByteField(term4285226, term4285226.getClass(), "minute", (byte) 14);
        setByteField(term4285226, term4285226.getClass(), "second", (byte) 33);
        setIntField(term4285226, term4285226.getClass(), "nano", 699362247);
        setField(term4285221, term4285221.getClass(), "time", term4285226);
        setField(term4285195, term4285195.getClass(), "accessTime", term4285221);
        setField(term4285193, term4285193.getClass(), "card", term4285195);
        setField(term4285193, term4285193.getClass(), "userName", "oRxBqKGwMr");
        setIntField(term4285193, term4285193.getClass(), "isNetMember", -578515008);
        setIntField(term4285193, term4285193.getClass(), "iconId", 1882570755);
        setIntField(term4285193, term4285193.getClass(), "plateId", 1138933722);
        setIntField(term4285193, term4285193.getClass(), "titleId", -1316786096);
        setIntField(term4285193, term4285193.getClass(), "partnerId", 727648477);
        setIntField(term4285193, term4285193.getClass(), "frameId", -2017083705);
        setIntField(term4285193, term4285193.getClass(), "selectMapId", -2118514293);
        setIntField(term4285193, term4285193.getClass(), "totalAwake", 362181349);
        setIntField(term4285193, term4285193.getClass(), "gradeRating", 820588630);
        setIntField(term4285193, term4285193.getClass(), "musicRating", 821961734);
        setIntField(term4285193, term4285193.getClass(), "playerRating", 298803623);
        setIntField(term4285193, term4285193.getClass(), "highestRating", -1821840241);
        setIntField(term4285193, term4285193.getClass(), "gradeRank", -1820055971);
        setIntField(term4285193, term4285193.getClass(), "classRank", -2011199934);
        setIntField(term4285193, term4285193.getClass(), "courseRank", -1220381003);
        setField(term4285193, term4285193.getClass(), "charaSlot", term4285258);
        setField(term4285193, term4285193.getClass(), "charaLockSlot", term4285276);
        setLongField(term4285193, term4285193.getClass(), "contentBit", -8865179126330403942L);
        setIntField(term4285193, term4285193.getClass(), "playCount", -292871583);
        setField(term4285193, term4285193.getClass(), "eventWatchedDate", "DvPsuUvMEz");
        setField(term4285193, term4285193.getClass(), "lastGameId", "sufFDDZchs");
        setField(term4285193, term4285193.getClass(), "lastRomVersion", "wJjzAFuIyK");
        setField(term4285193, term4285193.getClass(), "lastDataVersion", "hJPBGfUlFG");
        setField(term4285193, term4285193.getClass(), "lastLoginDate", "egJZBHxaXQ");
        setField(term4285193, term4285193.getClass(), "lastPlayDate", "bviudpWQwL");
        setIntField(term4285193, term4285193.getClass(), "lastPlayCredit", 1091781434);
        setIntField(term4285193, term4285193.getClass(), "lastPlayMode", -396987255);
        setIntField(term4285193, term4285193.getClass(), "lastPlaceId", 29674610);
        setField(term4285193, term4285193.getClass(), "lastPlaceName", "TgqRXIrAhk");
        setIntField(term4285193, term4285193.getClass(), "lastAllNetId", -1029454478);
        setIntField(term4285193, term4285193.getClass(), "lastRegionId", -1890157731);
        setField(term4285193, term4285193.getClass(), "lastRegionName", "EZdSJlSyej");
        setField(term4285193, term4285193.getClass(), "lastClientId", "TadqyrGjMf");
        setField(term4285193, term4285193.getClass(), "lastCountryCode", "DXSGvBcTXW");
        setIntField(term4285193, term4285193.getClass(), "lastSelectEMoney", 361892599);
        setIntField(term4285193, term4285193.getClass(), "lastSelectTicket", 1226149896);
        setIntField(term4285193, term4285193.getClass(), "lastSelectCourse", -1883241209);
        setIntField(term4285193, term4285193.getClass(), "lastCountCourse", 1535013046);
        setField(term4285193, term4285193.getClass(), "firstGameId", "UjJmeulEor");
        setField(term4285193, term4285193.getClass(), "firstRomVersion", "hwdXYcGebp");
        setField(term4285193, term4285193.getClass(), "firstDataVersion", "hkwzKLRXdu");
        setField(term4285193, term4285193.getClass(), "firstPlayDate", "BmDjiyczgm");
        setField(term4285193, term4285193.getClass(), "compatibleCmVersion", "RCmTFOHOcc");
        setField(term4285193, term4285193.getClass(), "dailyBonusDate", "GSxWbvVUKV");
        setField(term4285193, term4285193.getClass(), "dailyCourseBonusDate", "OSnHksZfMN");
        setField(term4285193, term4285193.getClass(), "lastPairLoginDate", "LmyHZOdjHE");
        setField(term4285193, term4285193.getClass(), "lastTrialPlayDate", "iRxoRyLUOS");
        setIntField(term4285193, term4285193.getClass(), "playVsCount", -2020553858);
        setIntField(term4285193, term4285193.getClass(), "playSyncCount", -118883458);
        setIntField(term4285193, term4285193.getClass(), "winCount", 479207152);
        setIntField(term4285193, term4285193.getClass(), "helpCount", 467649860);
        setIntField(term4285193, term4285193.getClass(), "comboCount", -2015641879);
        setLongField(term4285193, term4285193.getClass(), "totalDeluxscore", -2991701145177179210L);
        setLongField(term4285193, term4285193.getClass(), "totalBasicDeluxscore", -1801948845320636411L);
        setLongField(term4285193, term4285193.getClass(), "totalAdvancedDeluxscore", 7631801806044471272L);
        setLongField(term4285193, term4285193.getClass(), "totalExpertDeluxscore", -7275416855391762765L);
        setLongField(term4285193, term4285193.getClass(), "totalMasterDeluxscore", 8755525998143966732L);
        setLongField(term4285193, term4285193.getClass(), "totalReMasterDeluxscore", -7361428670411295281L);
        setIntField(term4285193, term4285193.getClass(), "totalSync", -600572814);
        setIntField(term4285193, term4285193.getClass(), "totalBasicSync", -1020128718);
        setIntField(term4285193, term4285193.getClass(), "totalAdvancedSync", -1779399956);
        setIntField(term4285193, term4285193.getClass(), "totalExpertSync", -379313635);
        setIntField(term4285193, term4285193.getClass(), "totalMasterSync", -1482681850);
        setIntField(term4285193, term4285193.getClass(), "totalReMasterSync", -1289594906);
        setLongField(term4285193, term4285193.getClass(), "totalAchievement", -5538614371464712234L);
        setLongField(term4285193, term4285193.getClass(), "totalBasicAchievement", 7045710572853979223L);
        setLongField(term4285193, term4285193.getClass(), "totalAdvancedAchievement", 8091521403389888439L);
        setLongField(term4285193, term4285193.getClass(), "totalExpertAchievement", -2060554882519138049L);
        setLongField(term4285193, term4285193.getClass(), "totalMasterAchievement", -838480134440609698L);
        setLongField(term4285193, term4285193.getClass(), "totalReMasterAchievement", -296390056644083883L);
        setLongField(term4285193, term4285193.getClass(), "playerOldRating", -5028726177738571647L);
        setLongField(term4285193, term4285193.getClass(), "playerNewRating", 4671929560095738661L);
        setIntField(term4285193, term4285193.getClass(), "banState", 1645456523);
        setLongField(term4285193, term4285193.getClass(), "dateTime", -5092405708592165156L);
        term4285562 = new Integer(553132962);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4285562;
        callMethod(klass, "setPlayCount", argTypes, term4285193, args);
    }

};


