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

public class UserDetail_getPlayCount_50959978922 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term207514;

    public UserDetail_getPlayCount_50959978922() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term207518 = new Long(-5587528177305224828L);
        Integer term207581 = new Integer(-775874930);
        Integer term207583 = new Integer(1404363846);
        Integer term207585 = new Integer(-2081298107);
        Integer term207587 = new Integer(-231030486);
        ArrayList term207579 = new ArrayList();
        ((ArrayList) term207579).add(term207581);
        ((ArrayList) term207579).add(term207583);
        ((ArrayList) term207579).add(term207585);
        ((ArrayList) term207579).add(term207587);
        Integer term207593 = new Integer(908016119);
        Integer term207595 = new Integer(110988463);
        Integer term207597 = new Integer(955685902);
        Integer term207599 = new Integer(462054815);
        Integer term207601 = new Integer(406100677);
        ArrayList term207591 = new ArrayList();
        ((ArrayList) term207591).add(term207593);
        ((ArrayList) term207591).add(term207595);
        ((ArrayList) term207591).add(term207597);
        ((ArrayList) term207591).add(term207599);
        ((ArrayList) term207591).add(term207601);
        term207514 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term207516 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term207532 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term207533 = newInstance(Class.forName("java.time.LocalDate"));
        Object term207537 = newInstance(Class.forName("java.time.LocalTime"));
        Object term207542 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term207543 = newInstance(Class.forName("java.time.LocalDate"));
        Object term207547 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term207514, term207514.getClass(), "id", -5016135743410612221L);
        setLongField(term207516, term207516.getClass(), "id", 5876553591384977274L);
        setField(term207516, term207516.getClass(), "extId", term207518);
        setField(term207516, term207516.getClass(), "luid", "pOmruQmOzy");
        setIntField(term207533, term207533.getClass(), "year", 2021);
        setShortField(term207533, term207533.getClass(), "month", (short) 3);
        setShortField(term207533, term207533.getClass(), "day", (short) 30);
        setField(term207532, term207532.getClass(), "date", term207533);
        setByteField(term207537, term207537.getClass(), "hour", (byte) 4);
        setByteField(term207537, term207537.getClass(), "minute", (byte) 19);
        setByteField(term207537, term207537.getClass(), "second", (byte) 24);
        setIntField(term207537, term207537.getClass(), "nano", 421494175);
        setField(term207532, term207532.getClass(), "time", term207537);
        setField(term207516, term207516.getClass(), "registerTime", term207532);
        setIntField(term207543, term207543.getClass(), "year", 2028);
        setShortField(term207543, term207543.getClass(), "month", (short) 1);
        setShortField(term207543, term207543.getClass(), "day", (short) 9);
        setField(term207542, term207542.getClass(), "date", term207543);
        setByteField(term207547, term207547.getClass(), "hour", (byte) 10);
        setByteField(term207547, term207547.getClass(), "minute", (byte) 17);
        setByteField(term207547, term207547.getClass(), "second", (byte) 24);
        setIntField(term207547, term207547.getClass(), "nano", 95983008);
        setField(term207542, term207542.getClass(), "time", term207547);
        setField(term207516, term207516.getClass(), "accessTime", term207542);
        setField(term207514, term207514.getClass(), "card", term207516);
        setField(term207514, term207514.getClass(), "userName", "AIPiHpNPLg");
        setIntField(term207514, term207514.getClass(), "isNetMember", -1162599119);
        setIntField(term207514, term207514.getClass(), "iconId", -151931152);
        setIntField(term207514, term207514.getClass(), "plateId", 14184131);
        setIntField(term207514, term207514.getClass(), "titleId", 357749330);
        setIntField(term207514, term207514.getClass(), "partnerId", 33679397);
        setIntField(term207514, term207514.getClass(), "frameId", 613527123);
        setIntField(term207514, term207514.getClass(), "selectMapId", 312461013);
        setIntField(term207514, term207514.getClass(), "totalAwake", 1548945209);
        setIntField(term207514, term207514.getClass(), "gradeRating", -1537602442);
        setIntField(term207514, term207514.getClass(), "musicRating", -1264895109);
        setIntField(term207514, term207514.getClass(), "playerRating", -1573815915);
        setIntField(term207514, term207514.getClass(), "highestRating", -1219777858);
        setIntField(term207514, term207514.getClass(), "gradeRank", 1275177499);
        setIntField(term207514, term207514.getClass(), "classRank", 683701474);
        setIntField(term207514, term207514.getClass(), "courseRank", 247947009);
        setField(term207514, term207514.getClass(), "charaSlot", term207579);
        setField(term207514, term207514.getClass(), "charaLockSlot", term207591);
        setLongField(term207514, term207514.getClass(), "contentBit", 3496095984619985954L);
        setIntField(term207514, term207514.getClass(), "playCount", 718686721);
        setField(term207514, term207514.getClass(), "eventWatchedDate", "smZatOvzxp");
        setField(term207514, term207514.getClass(), "lastGameId", "TDSaeGpDVB");
        setField(term207514, term207514.getClass(), "lastRomVersion", "NFkxHXwyKV");
        setField(term207514, term207514.getClass(), "lastDataVersion", "fNqRlTynay");
        setField(term207514, term207514.getClass(), "lastLoginDate", "XaPzkGjOcH");
        setField(term207514, term207514.getClass(), "lastPlayDate", "rhLYaokWAi");
        setIntField(term207514, term207514.getClass(), "lastPlayCredit", -1912489972);
        setIntField(term207514, term207514.getClass(), "lastPlayMode", 380168858);
        setIntField(term207514, term207514.getClass(), "lastPlaceId", 1684017550);
        setField(term207514, term207514.getClass(), "lastPlaceName", "TYlVXrWAhy");
        setIntField(term207514, term207514.getClass(), "lastAllNetId", -1085067457);
        setIntField(term207514, term207514.getClass(), "lastRegionId", -1171804799);
        setField(term207514, term207514.getClass(), "lastRegionName", "DWRLcLFCrv");
        setField(term207514, term207514.getClass(), "lastClientId", "EQEbvodpPG");
        setField(term207514, term207514.getClass(), "lastCountryCode", "HcUVBcDfgI");
        setIntField(term207514, term207514.getClass(), "lastSelectEMoney", -50658959);
        setIntField(term207514, term207514.getClass(), "lastSelectTicket", -1244851072);
        setIntField(term207514, term207514.getClass(), "lastSelectCourse", -1127273572);
        setIntField(term207514, term207514.getClass(), "lastCountCourse", -942505377);
        setField(term207514, term207514.getClass(), "firstGameId", "ccMBGzXMXR");
        setField(term207514, term207514.getClass(), "firstRomVersion", "IdEEUvapZX");
        setField(term207514, term207514.getClass(), "firstDataVersion", "ETWNNzHKFl");
        setField(term207514, term207514.getClass(), "firstPlayDate", "ikMoEQrHku");
        setField(term207514, term207514.getClass(), "compatibleCmVersion", "kcFMgFSQMr");
        setField(term207514, term207514.getClass(), "dailyBonusDate", "esFilkKIEL");
        setField(term207514, term207514.getClass(), "dailyCourseBonusDate", "ZJpjRoroDt");
        setField(term207514, term207514.getClass(), "lastPairLoginDate", "qkWnSQFqjf");
        setField(term207514, term207514.getClass(), "lastTrialPlayDate", "RZAntRcdme");
        setIntField(term207514, term207514.getClass(), "playVsCount", 1207786576);
        setIntField(term207514, term207514.getClass(), "playSyncCount", -95646854);
        setIntField(term207514, term207514.getClass(), "winCount", -1261061854);
        setIntField(term207514, term207514.getClass(), "helpCount", 581616367);
        setIntField(term207514, term207514.getClass(), "comboCount", 530249699);
        setLongField(term207514, term207514.getClass(), "totalDeluxscore", -3275163220898580731L);
        setLongField(term207514, term207514.getClass(), "totalBasicDeluxscore", 674072293379122114L);
        setLongField(term207514, term207514.getClass(), "totalAdvancedDeluxscore", 1655388202346680320L);
        setLongField(term207514, term207514.getClass(), "totalExpertDeluxscore", -8061670638141457258L);
        setLongField(term207514, term207514.getClass(), "totalMasterDeluxscore", -1558715660728740099L);
        setLongField(term207514, term207514.getClass(), "totalReMasterDeluxscore", -984459098685985283L);
        setIntField(term207514, term207514.getClass(), "totalSync", 693000024);
        setIntField(term207514, term207514.getClass(), "totalBasicSync", -659244791);
        setIntField(term207514, term207514.getClass(), "totalAdvancedSync", -1592022320);
        setIntField(term207514, term207514.getClass(), "totalExpertSync", -1743070082);
        setIntField(term207514, term207514.getClass(), "totalMasterSync", -1196577732);
        setIntField(term207514, term207514.getClass(), "totalReMasterSync", 658985528);
        setLongField(term207514, term207514.getClass(), "totalAchievement", -1412419717013452103L);
        setLongField(term207514, term207514.getClass(), "totalBasicAchievement", -1656688279009509497L);
        setLongField(term207514, term207514.getClass(), "totalAdvancedAchievement", 4646436806504898616L);
        setLongField(term207514, term207514.getClass(), "totalExpertAchievement", -1312205360267418697L);
        setLongField(term207514, term207514.getClass(), "totalMasterAchievement", 5106675463767553325L);
        setLongField(term207514, term207514.getClass(), "totalReMasterAchievement", -8630078807258379510L);
        setLongField(term207514, term207514.getClass(), "playerOldRating", -7789153659686320993L);
        setLongField(term207514, term207514.getClass(), "playerNewRating", 2965330256979714872L);
        setIntField(term207514, term207514.getClass(), "banState", -514950354);
        setLongField(term207514, term207514.getClass(), "dateTime", 4448036272888742346L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayCount", argTypes, term207514, args);
    }

};


