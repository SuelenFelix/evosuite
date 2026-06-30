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

public class UserDetail_canEqual_2070704677155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4318007;
     Object term4318378;

    public UserDetail_canEqual_2070704677155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4318011 = new Long(-1234944805975284573L);
        Integer term4318074 = new Integer(-659244791);
        Integer term4318076 = new Integer(-1592022320);
        Integer term4318078 = new Integer(-1743070082);
        Integer term4318080 = new Integer(-1196577732);
        Integer term4318082 = new Integer(658985528);
        Integer term4318084 = new Integer(-514950354);
        Integer term4318086 = new Integer(-1467577794);
        Integer term4318088 = new Integer(1957000422);
        ArrayList term4318072 = new ArrayList();
        ((ArrayList) term4318072).add(term4318074);
        ((ArrayList) term4318072).add(term4318076);
        ((ArrayList) term4318072).add(term4318078);
        ((ArrayList) term4318072).add(term4318080);
        ((ArrayList) term4318072).add(term4318082);
        ((ArrayList) term4318072).add(term4318084);
        ((ArrayList) term4318072).add(term4318086);
        ((ArrayList) term4318072).add(term4318088);
        Integer term4318094 = new Integer(1521595403);
        Integer term4318096 = new Integer(-1211596748);
        Integer term4318098 = new Integer(-607616145);
        Integer term4318100 = new Integer(-1504241847);
        Integer term4318102 = new Integer(-187711145);
        Integer term4318104 = new Integer(132086207);
        Integer term4318106 = new Integer(-1371629267);
        Integer term4318108 = new Integer(991981146);
        ArrayList term4318092 = new ArrayList();
        ((ArrayList) term4318092).add(term4318094);
        ((ArrayList) term4318092).add(term4318096);
        ((ArrayList) term4318092).add(term4318098);
        ((ArrayList) term4318092).add(term4318100);
        ((ArrayList) term4318092).add(term4318102);
        ((ArrayList) term4318092).add(term4318104);
        ((ArrayList) term4318092).add(term4318106);
        ((ArrayList) term4318092).add(term4318108);
        term4318007 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4318009 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4318025 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4318026 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4318030 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4318035 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4318036 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4318040 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4318007, term4318007.getClass(), "id", 9179810195835295288L);
        setLongField(term4318009, term4318009.getClass(), "id", 624716584533209543L);
        setField(term4318009, term4318009.getClass(), "extId", term4318011);
        setField(term4318009, term4318009.getClass(), "luid", "xbOawLjfCt");
        setIntField(term4318026, term4318026.getClass(), "year", 2024);
        setShortField(term4318026, term4318026.getClass(), "month", (short) 1);
        setShortField(term4318026, term4318026.getClass(), "day", (short) 1);
        setField(term4318025, term4318025.getClass(), "date", term4318026);
        setByteField(term4318030, term4318030.getClass(), "hour", (byte) 20);
        setByteField(term4318030, term4318030.getClass(), "minute", (byte) 21);
        setByteField(term4318030, term4318030.getClass(), "second", (byte) 30);
        setIntField(term4318030, term4318030.getClass(), "nano", 872987528);
        setField(term4318025, term4318025.getClass(), "time", term4318030);
        setField(term4318009, term4318009.getClass(), "registerTime", term4318025);
        setIntField(term4318036, term4318036.getClass(), "year", 2025);
        setShortField(term4318036, term4318036.getClass(), "month", (short) 3);
        setShortField(term4318036, term4318036.getClass(), "day", (short) 16);
        setField(term4318035, term4318035.getClass(), "date", term4318036);
        setByteField(term4318040, term4318040.getClass(), "hour", (byte) 7);
        setByteField(term4318040, term4318040.getClass(), "minute", (byte) 14);
        setByteField(term4318040, term4318040.getClass(), "second", (byte) 41);
        setIntField(term4318040, term4318040.getClass(), "nano", 163063195);
        setField(term4318035, term4318035.getClass(), "time", term4318040);
        setField(term4318009, term4318009.getClass(), "accessTime", term4318035);
        setField(term4318007, term4318007.getClass(), "card", term4318009);
        setField(term4318007, term4318007.getClass(), "userName", "yPqiUASGbb");
        setIntField(term4318007, term4318007.getClass(), "isNetMember", -1579354792);
        setIntField(term4318007, term4318007.getClass(), "iconId", 51325824);
        setIntField(term4318007, term4318007.getClass(), "plateId", -915948499);
        setIntField(term4318007, term4318007.getClass(), "titleId", 1688952489);
        setIntField(term4318007, term4318007.getClass(), "partnerId", -2036486625);
        setIntField(term4318007, term4318007.getClass(), "frameId", 693992133);
        setIntField(term4318007, term4318007.getClass(), "selectMapId", 1503769443);
        setIntField(term4318007, term4318007.getClass(), "totalAwake", -1379310737);
        setIntField(term4318007, term4318007.getClass(), "gradeRating", -1010857300);
        setIntField(term4318007, term4318007.getClass(), "musicRating", 1084442506);
        setIntField(term4318007, term4318007.getClass(), "playerRating", 1395744519);
        setIntField(term4318007, term4318007.getClass(), "highestRating", -2034345201);
        setIntField(term4318007, term4318007.getClass(), "gradeRank", 427870406);
        setIntField(term4318007, term4318007.getClass(), "classRank", 1462070568);
        setIntField(term4318007, term4318007.getClass(), "courseRank", 137716323);
        setField(term4318007, term4318007.getClass(), "charaSlot", term4318072);
        setField(term4318007, term4318007.getClass(), "charaLockSlot", term4318092);
        setLongField(term4318007, term4318007.getClass(), "contentBit", -7294388570350031278L);
        setIntField(term4318007, term4318007.getClass(), "playCount", -1330039487);
        setField(term4318007, term4318007.getClass(), "eventWatchedDate", "xDkEhFTaRd");
        setField(term4318007, term4318007.getClass(), "lastGameId", "nPPgShCDBJ");
        setField(term4318007, term4318007.getClass(), "lastRomVersion", "wQoVTQCsml");
        setField(term4318007, term4318007.getClass(), "lastDataVersion", "ARnYEtXYIH");
        setField(term4318007, term4318007.getClass(), "lastLoginDate", "FlFzBuQkei");
        setField(term4318007, term4318007.getClass(), "lastPlayDate", "MqjHaybvJl");
        setIntField(term4318007, term4318007.getClass(), "lastPlayCredit", 1551681673);
        setIntField(term4318007, term4318007.getClass(), "lastPlayMode", -2035489999);
        setIntField(term4318007, term4318007.getClass(), "lastPlaceId", 1303303329);
        setField(term4318007, term4318007.getClass(), "lastPlaceName", "PMsJtmzvwP");
        setIntField(term4318007, term4318007.getClass(), "lastAllNetId", -1515540043);
        setIntField(term4318007, term4318007.getClass(), "lastRegionId", 164574096);
        setField(term4318007, term4318007.getClass(), "lastRegionName", "PajSXaTzsJ");
        setField(term4318007, term4318007.getClass(), "lastClientId", "QIbzjsmYnU");
        setField(term4318007, term4318007.getClass(), "lastCountryCode", "uKqLxtUcYj");
        setIntField(term4318007, term4318007.getClass(), "lastSelectEMoney", -371671099);
        setIntField(term4318007, term4318007.getClass(), "lastSelectTicket", -1695304047);
        setIntField(term4318007, term4318007.getClass(), "lastSelectCourse", 1518312591);
        setIntField(term4318007, term4318007.getClass(), "lastCountCourse", -1625296305);
        setField(term4318007, term4318007.getClass(), "firstGameId", "sLDAqFwnwl");
        setField(term4318007, term4318007.getClass(), "firstRomVersion", "iRBfALwwim");
        setField(term4318007, term4318007.getClass(), "firstDataVersion", "fVkMLxGWgi");
        setField(term4318007, term4318007.getClass(), "firstPlayDate", "AdaEUPnpBC");
        setField(term4318007, term4318007.getClass(), "compatibleCmVersion", "WlWJcJIHOL");
        setField(term4318007, term4318007.getClass(), "dailyBonusDate", "lHWhoePbTd");
        setField(term4318007, term4318007.getClass(), "dailyCourseBonusDate", "HcHUcWCsBy");
        setField(term4318007, term4318007.getClass(), "lastPairLoginDate", "hgoqRTtVqm");
        setField(term4318007, term4318007.getClass(), "lastTrialPlayDate", "glIVQMypMJ");
        setIntField(term4318007, term4318007.getClass(), "playVsCount", -941782237);
        setIntField(term4318007, term4318007.getClass(), "playSyncCount", -206798680);
        setIntField(term4318007, term4318007.getClass(), "winCount", 291364369);
        setIntField(term4318007, term4318007.getClass(), "helpCount", -1934715968);
        setIntField(term4318007, term4318007.getClass(), "comboCount", -1515341694);
        setLongField(term4318007, term4318007.getClass(), "totalDeluxscore", -4253044443641053329L);
        setLongField(term4318007, term4318007.getClass(), "totalBasicDeluxscore", -6305903867979344177L);
        setLongField(term4318007, term4318007.getClass(), "totalAdvancedDeluxscore", 2189693447133921179L);
        setLongField(term4318007, term4318007.getClass(), "totalExpertDeluxscore", 3257063397651448222L);
        setLongField(term4318007, term4318007.getClass(), "totalMasterDeluxscore", -6491766586616744326L);
        setLongField(term4318007, term4318007.getClass(), "totalReMasterDeluxscore", -5518154651192513725L);
        setIntField(term4318007, term4318007.getClass(), "totalSync", -837939893);
        setIntField(term4318007, term4318007.getClass(), "totalBasicSync", 1467371929);
        setIntField(term4318007, term4318007.getClass(), "totalAdvancedSync", -1883632831);
        setIntField(term4318007, term4318007.getClass(), "totalExpertSync", -1091545055);
        setIntField(term4318007, term4318007.getClass(), "totalMasterSync", -1169071283);
        setIntField(term4318007, term4318007.getClass(), "totalReMasterSync", 480810958);
        setLongField(term4318007, term4318007.getClass(), "totalAchievement", 2135772257449308970L);
        setLongField(term4318007, term4318007.getClass(), "totalBasicAchievement", 275555976603255842L);
        setLongField(term4318007, term4318007.getClass(), "totalAdvancedAchievement", 2282678634348242083L);
        setLongField(term4318007, term4318007.getClass(), "totalExpertAchievement", -1729115296238999043L);
        setLongField(term4318007, term4318007.getClass(), "totalMasterAchievement", 7958136316172245204L);
        setLongField(term4318007, term4318007.getClass(), "totalReMasterAchievement", -2574896287541267014L);
        setLongField(term4318007, term4318007.getClass(), "playerOldRating", -2866404850931889653L);
        setLongField(term4318007, term4318007.getClass(), "playerNewRating", 3538903438386405737L);
        setIntField(term4318007, term4318007.getClass(), "banState", -770971460);
        setLongField(term4318007, term4318007.getClass(), "dateTime", 2363296446305705625L);
        term4318378 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term4318378;
        callMethod(klass, "canEqual", argTypes, term4318007, args);
    }

};


