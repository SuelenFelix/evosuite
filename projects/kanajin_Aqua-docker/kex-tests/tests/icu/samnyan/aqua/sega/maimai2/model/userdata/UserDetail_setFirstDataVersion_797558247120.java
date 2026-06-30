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

public class UserDetail_setFirstDataVersion_797558247120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4297957;

    public UserDetail_setFirstDataVersion_797558247120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4297961 = new Long(7628536876459883328L);
        Integer term4298024 = new Integer(-1051157170);
        Integer term4298026 = new Integer(1267890763);
        Integer term4298028 = new Integer(-354908388);
        Integer term4298030 = new Integer(-1823173740);
        Integer term4298032 = new Integer(711565551);
        Integer term4298034 = new Integer(1808622233);
        Integer term4298036 = new Integer(-1854319585);
        Integer term4298038 = new Integer(548084080);
        ArrayList term4298022 = new ArrayList();
        ((ArrayList) term4298022).add(term4298024);
        ((ArrayList) term4298022).add(term4298026);
        ((ArrayList) term4298022).add(term4298028);
        ((ArrayList) term4298022).add(term4298030);
        ((ArrayList) term4298022).add(term4298032);
        ((ArrayList) term4298022).add(term4298034);
        ((ArrayList) term4298022).add(term4298036);
        ((ArrayList) term4298022).add(term4298038);
        Integer term4298044 = new Integer(1744825642);
        Integer term4298046 = new Integer(-1372443184);
        ArrayList term4298042 = new ArrayList();
        ((ArrayList) term4298042).add(term4298044);
        ((ArrayList) term4298042).add(term4298046);
        term4297957 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4297959 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4297975 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4297976 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4297980 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4297985 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4297986 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4297990 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4297957, term4297957.getClass(), "id", -1518627390714094256L);
        setLongField(term4297959, term4297959.getClass(), "id", 6767355474085068726L);
        setField(term4297959, term4297959.getClass(), "extId", term4297961);
        setField(term4297959, term4297959.getClass(), "luid", "LXsJqUplMk");
        setIntField(term4297976, term4297976.getClass(), "year", 2019);
        setShortField(term4297976, term4297976.getClass(), "month", (short) 10);
        setShortField(term4297976, term4297976.getClass(), "day", (short) 19);
        setField(term4297975, term4297975.getClass(), "date", term4297976);
        setByteField(term4297980, term4297980.getClass(), "hour", (byte) 21);
        setByteField(term4297980, term4297980.getClass(), "minute", (byte) 54);
        setByteField(term4297980, term4297980.getClass(), "second", (byte) 40);
        setIntField(term4297980, term4297980.getClass(), "nano", 327827991);
        setField(term4297975, term4297975.getClass(), "time", term4297980);
        setField(term4297959, term4297959.getClass(), "registerTime", term4297975);
        setIntField(term4297986, term4297986.getClass(), "year", 2010);
        setShortField(term4297986, term4297986.getClass(), "month", (short) 5);
        setShortField(term4297986, term4297986.getClass(), "day", (short) 12);
        setField(term4297985, term4297985.getClass(), "date", term4297986);
        setByteField(term4297990, term4297990.getClass(), "hour", (byte) 15);
        setByteField(term4297990, term4297990.getClass(), "minute", (byte) 59);
        setByteField(term4297990, term4297990.getClass(), "second", (byte) 49);
        setIntField(term4297990, term4297990.getClass(), "nano", 635457088);
        setField(term4297985, term4297985.getClass(), "time", term4297990);
        setField(term4297959, term4297959.getClass(), "accessTime", term4297985);
        setField(term4297957, term4297957.getClass(), "card", term4297959);
        setField(term4297957, term4297957.getClass(), "userName", "uUVbbWYHlQ");
        setIntField(term4297957, term4297957.getClass(), "isNetMember", -606316479);
        setIntField(term4297957, term4297957.getClass(), "iconId", -510423977);
        setIntField(term4297957, term4297957.getClass(), "plateId", -1729667558);
        setIntField(term4297957, term4297957.getClass(), "titleId", -1468662348);
        setIntField(term4297957, term4297957.getClass(), "partnerId", -1751407762);
        setIntField(term4297957, term4297957.getClass(), "frameId", 1686826915);
        setIntField(term4297957, term4297957.getClass(), "selectMapId", 1220637918);
        setIntField(term4297957, term4297957.getClass(), "totalAwake", 1747542920);
        setIntField(term4297957, term4297957.getClass(), "gradeRating", -2029439218);
        setIntField(term4297957, term4297957.getClass(), "musicRating", -717502449);
        setIntField(term4297957, term4297957.getClass(), "playerRating", 1501349550);
        setIntField(term4297957, term4297957.getClass(), "highestRating", 1997187425);
        setIntField(term4297957, term4297957.getClass(), "gradeRank", -615764725);
        setIntField(term4297957, term4297957.getClass(), "classRank", -908259485);
        setIntField(term4297957, term4297957.getClass(), "courseRank", -532839295);
        setField(term4297957, term4297957.getClass(), "charaSlot", term4298022);
        setField(term4297957, term4297957.getClass(), "charaLockSlot", term4298042);
        setLongField(term4297957, term4297957.getClass(), "contentBit", -3426134983468272429L);
        setIntField(term4297957, term4297957.getClass(), "playCount", -1083598938);
        setField(term4297957, term4297957.getClass(), "eventWatchedDate", "MVQBkDtSYi");
        setField(term4297957, term4297957.getClass(), "lastGameId", "vNiiqHmSPc");
        setField(term4297957, term4297957.getClass(), "lastRomVersion", "qOzlKxzZof");
        setField(term4297957, term4297957.getClass(), "lastDataVersion", "lOUPxuimHX");
        setField(term4297957, term4297957.getClass(), "lastLoginDate", "oTxEbwYtjP");
        setField(term4297957, term4297957.getClass(), "lastPlayDate", "lCBbenJqDS");
        setIntField(term4297957, term4297957.getClass(), "lastPlayCredit", 197774650);
        setIntField(term4297957, term4297957.getClass(), "lastPlayMode", -224824083);
        setIntField(term4297957, term4297957.getClass(), "lastPlaceId", 963377695);
        setField(term4297957, term4297957.getClass(), "lastPlaceName", "wXXhGFkKNu");
        setIntField(term4297957, term4297957.getClass(), "lastAllNetId", 1681560698);
        setIntField(term4297957, term4297957.getClass(), "lastRegionId", 983201521);
        setField(term4297957, term4297957.getClass(), "lastRegionName", "YSYqFebcwf");
        setField(term4297957, term4297957.getClass(), "lastClientId", "pLdomvjVeY");
        setField(term4297957, term4297957.getClass(), "lastCountryCode", "EzRggeIULo");
        setIntField(term4297957, term4297957.getClass(), "lastSelectEMoney", -1784559232);
        setIntField(term4297957, term4297957.getClass(), "lastSelectTicket", 1967662036);
        setIntField(term4297957, term4297957.getClass(), "lastSelectCourse", -1369630363);
        setIntField(term4297957, term4297957.getClass(), "lastCountCourse", 879431644);
        setField(term4297957, term4297957.getClass(), "firstGameId", "OfFHbzHfCO");
        setField(term4297957, term4297957.getClass(), "firstRomVersion", "jgfehTcTdb");
        setField(term4297957, term4297957.getClass(), "firstDataVersion", "NlYdGBMghX");
        setField(term4297957, term4297957.getClass(), "firstPlayDate", "wodqpEzifb");
        setField(term4297957, term4297957.getClass(), "compatibleCmVersion", "zHcoLAMxQp");
        setField(term4297957, term4297957.getClass(), "dailyBonusDate", "BqGeVQTOqQ");
        setField(term4297957, term4297957.getClass(), "dailyCourseBonusDate", "sYCusOGfCi");
        setField(term4297957, term4297957.getClass(), "lastPairLoginDate", "ZDuutQvYuA");
        setField(term4297957, term4297957.getClass(), "lastTrialPlayDate", "cIaOdyqABr");
        setIntField(term4297957, term4297957.getClass(), "playVsCount", 254519231);
        setIntField(term4297957, term4297957.getClass(), "playSyncCount", -1187746976);
        setIntField(term4297957, term4297957.getClass(), "winCount", 1747017523);
        setIntField(term4297957, term4297957.getClass(), "helpCount", -1358558192);
        setIntField(term4297957, term4297957.getClass(), "comboCount", 1501289627);
        setLongField(term4297957, term4297957.getClass(), "totalDeluxscore", 8916437579199102786L);
        setLongField(term4297957, term4297957.getClass(), "totalBasicDeluxscore", 2510042611901428083L);
        setLongField(term4297957, term4297957.getClass(), "totalAdvancedDeluxscore", 4774699953606636769L);
        setLongField(term4297957, term4297957.getClass(), "totalExpertDeluxscore", -3337522838922168305L);
        setLongField(term4297957, term4297957.getClass(), "totalMasterDeluxscore", -4159519778539425203L);
        setLongField(term4297957, term4297957.getClass(), "totalReMasterDeluxscore", -3280610676529673652L);
        setIntField(term4297957, term4297957.getClass(), "totalSync", 1471856689);
        setIntField(term4297957, term4297957.getClass(), "totalBasicSync", 321020956);
        setIntField(term4297957, term4297957.getClass(), "totalAdvancedSync", -102997152);
        setIntField(term4297957, term4297957.getClass(), "totalExpertSync", 1158698009);
        setIntField(term4297957, term4297957.getClass(), "totalMasterSync", -1580302637);
        setIntField(term4297957, term4297957.getClass(), "totalReMasterSync", 775401508);
        setLongField(term4297957, term4297957.getClass(), "totalAchievement", 5736715399422694671L);
        setLongField(term4297957, term4297957.getClass(), "totalBasicAchievement", -6192209208905177927L);
        setLongField(term4297957, term4297957.getClass(), "totalAdvancedAchievement", -5513267979798164667L);
        setLongField(term4297957, term4297957.getClass(), "totalExpertAchievement", -1590031126082856140L);
        setLongField(term4297957, term4297957.getClass(), "totalMasterAchievement", 4412699786584613030L);
        setLongField(term4297957, term4297957.getClass(), "totalReMasterAchievement", -6305589450662586485L);
        setLongField(term4297957, term4297957.getClass(), "playerOldRating", -395384055052576829L);
        setLongField(term4297957, term4297957.getClass(), "playerNewRating", 1775322030205918821L);
        setIntField(term4297957, term4297957.getClass(), "banState", -1063778321);
        setLongField(term4297957, term4297957.getClass(), "dateTime", -8573612217696906353L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "zNeVFquHdY";
        callMethod(klass, "setFirstDataVersion", argTypes, term4297957, args);
    }

};


