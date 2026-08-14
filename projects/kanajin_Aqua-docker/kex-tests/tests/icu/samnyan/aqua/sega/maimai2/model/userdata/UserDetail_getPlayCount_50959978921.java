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

public class UserDetail_getPlayCount_50959978921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term207459;

    public UserDetail_getPlayCount_50959978921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term207463 = new Long(-5587528177305224828L);
        Integer term207526 = new Integer(-775874930);
        Integer term207528 = new Integer(1404363846);
        Integer term207530 = new Integer(-2081298107);
        Integer term207532 = new Integer(-231030486);
        ArrayList term207524 = new ArrayList();
        ((ArrayList) term207524).add(term207526);
        ((ArrayList) term207524).add(term207528);
        ((ArrayList) term207524).add(term207530);
        ((ArrayList) term207524).add(term207532);
        Integer term207538 = new Integer(908016119);
        Integer term207540 = new Integer(110988463);
        Integer term207542 = new Integer(955685902);
        Integer term207544 = new Integer(462054815);
        Integer term207546 = new Integer(406100677);
        ArrayList term207536 = new ArrayList();
        ((ArrayList) term207536).add(term207538);
        ((ArrayList) term207536).add(term207540);
        ((ArrayList) term207536).add(term207542);
        ((ArrayList) term207536).add(term207544);
        ((ArrayList) term207536).add(term207546);
        term207459 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term207461 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term207477 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term207478 = newInstance(Class.forName("java.time.LocalDate"));
        Object term207482 = newInstance(Class.forName("java.time.LocalTime"));
        Object term207487 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term207488 = newInstance(Class.forName("java.time.LocalDate"));
        Object term207492 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term207459, term207459.getClass(), "id", -5016135743410612221L);
        setLongField(term207461, term207461.getClass(), "id", 5876553591384977274L);
        setField(term207461, term207461.getClass(), "extId", term207463);
        setField(term207461, term207461.getClass(), "luid", "pOmruQmOzy");
        setIntField(term207478, term207478.getClass(), "year", 2021);
        setShortField(term207478, term207478.getClass(), "month", (short) 3);
        setShortField(term207478, term207478.getClass(), "day", (short) 30);
        setField(term207477, term207477.getClass(), "date", term207478);
        setByteField(term207482, term207482.getClass(), "hour", (byte) 4);
        setByteField(term207482, term207482.getClass(), "minute", (byte) 19);
        setByteField(term207482, term207482.getClass(), "second", (byte) 24);
        setIntField(term207482, term207482.getClass(), "nano", 421494175);
        setField(term207477, term207477.getClass(), "time", term207482);
        setField(term207461, term207461.getClass(), "registerTime", term207477);
        setIntField(term207488, term207488.getClass(), "year", 2028);
        setShortField(term207488, term207488.getClass(), "month", (short) 1);
        setShortField(term207488, term207488.getClass(), "day", (short) 9);
        setField(term207487, term207487.getClass(), "date", term207488);
        setByteField(term207492, term207492.getClass(), "hour", (byte) 10);
        setByteField(term207492, term207492.getClass(), "minute", (byte) 17);
        setByteField(term207492, term207492.getClass(), "second", (byte) 24);
        setIntField(term207492, term207492.getClass(), "nano", 95983008);
        setField(term207487, term207487.getClass(), "time", term207492);
        setField(term207461, term207461.getClass(), "accessTime", term207487);
        setField(term207459, term207459.getClass(), "card", term207461);
        setField(term207459, term207459.getClass(), "userName", "AIPiHpNPLg");
        setIntField(term207459, term207459.getClass(), "isNetMember", -1162599119);
        setIntField(term207459, term207459.getClass(), "iconId", -151931152);
        setIntField(term207459, term207459.getClass(), "plateId", 14184131);
        setIntField(term207459, term207459.getClass(), "titleId", 357749330);
        setIntField(term207459, term207459.getClass(), "partnerId", 33679397);
        setIntField(term207459, term207459.getClass(), "frameId", 613527123);
        setIntField(term207459, term207459.getClass(), "selectMapId", 312461013);
        setIntField(term207459, term207459.getClass(), "totalAwake", 1548945209);
        setIntField(term207459, term207459.getClass(), "gradeRating", -1537602442);
        setIntField(term207459, term207459.getClass(), "musicRating", -1264895109);
        setIntField(term207459, term207459.getClass(), "playerRating", -1573815915);
        setIntField(term207459, term207459.getClass(), "highestRating", -1219777858);
        setIntField(term207459, term207459.getClass(), "gradeRank", 1275177499);
        setIntField(term207459, term207459.getClass(), "classRank", 683701474);
        setIntField(term207459, term207459.getClass(), "courseRank", 247947009);
        setField(term207459, term207459.getClass(), "charaSlot", term207524);
        setField(term207459, term207459.getClass(), "charaLockSlot", term207536);
        setLongField(term207459, term207459.getClass(), "contentBit", 3496095984619985954L);
        setIntField(term207459, term207459.getClass(), "playCount", 718686721);
        setField(term207459, term207459.getClass(), "eventWatchedDate", "smZatOvzxp");
        setField(term207459, term207459.getClass(), "lastGameId", "TDSaeGpDVB");
        setField(term207459, term207459.getClass(), "lastRomVersion", "NFkxHXwyKV");
        setField(term207459, term207459.getClass(), "lastDataVersion", "fNqRlTynay");
        setField(term207459, term207459.getClass(), "lastLoginDate", "XaPzkGjOcH");
        setField(term207459, term207459.getClass(), "lastPlayDate", "rhLYaokWAi");
        setIntField(term207459, term207459.getClass(), "lastPlayCredit", -1912489972);
        setIntField(term207459, term207459.getClass(), "lastPlayMode", 380168858);
        setIntField(term207459, term207459.getClass(), "lastPlaceId", 1684017550);
        setField(term207459, term207459.getClass(), "lastPlaceName", "TYlVXrWAhy");
        setIntField(term207459, term207459.getClass(), "lastAllNetId", -1085067457);
        setIntField(term207459, term207459.getClass(), "lastRegionId", -1171804799);
        setField(term207459, term207459.getClass(), "lastRegionName", "DWRLcLFCrv");
        setField(term207459, term207459.getClass(), "lastClientId", "EQEbvodpPG");
        setField(term207459, term207459.getClass(), "lastCountryCode", "HcUVBcDfgI");
        setIntField(term207459, term207459.getClass(), "lastSelectEMoney", -50658959);
        setIntField(term207459, term207459.getClass(), "lastSelectTicket", -1244851072);
        setIntField(term207459, term207459.getClass(), "lastSelectCourse", -1127273572);
        setIntField(term207459, term207459.getClass(), "lastCountCourse", -942505377);
        setField(term207459, term207459.getClass(), "firstGameId", "ccMBGzXMXR");
        setField(term207459, term207459.getClass(), "firstRomVersion", "IdEEUvapZX");
        setField(term207459, term207459.getClass(), "firstDataVersion", "ETWNNzHKFl");
        setField(term207459, term207459.getClass(), "firstPlayDate", "ikMoEQrHku");
        setField(term207459, term207459.getClass(), "compatibleCmVersion", "kcFMgFSQMr");
        setField(term207459, term207459.getClass(), "dailyBonusDate", "esFilkKIEL");
        setField(term207459, term207459.getClass(), "dailyCourseBonusDate", "ZJpjRoroDt");
        setField(term207459, term207459.getClass(), "lastPairLoginDate", "qkWnSQFqjf");
        setField(term207459, term207459.getClass(), "lastTrialPlayDate", "RZAntRcdme");
        setIntField(term207459, term207459.getClass(), "playVsCount", 1207786576);
        setIntField(term207459, term207459.getClass(), "playSyncCount", -95646854);
        setIntField(term207459, term207459.getClass(), "winCount", -1261061854);
        setIntField(term207459, term207459.getClass(), "helpCount", 581616367);
        setIntField(term207459, term207459.getClass(), "comboCount", 530249699);
        setLongField(term207459, term207459.getClass(), "totalDeluxscore", -3275163220898580731L);
        setLongField(term207459, term207459.getClass(), "totalBasicDeluxscore", 674072293379122114L);
        setLongField(term207459, term207459.getClass(), "totalAdvancedDeluxscore", 1655388202346680320L);
        setLongField(term207459, term207459.getClass(), "totalExpertDeluxscore", -8061670638141457258L);
        setLongField(term207459, term207459.getClass(), "totalMasterDeluxscore", -1558715660728740099L);
        setLongField(term207459, term207459.getClass(), "totalReMasterDeluxscore", -984459098685985283L);
        setIntField(term207459, term207459.getClass(), "totalSync", 693000024);
        setIntField(term207459, term207459.getClass(), "totalBasicSync", -659244791);
        setIntField(term207459, term207459.getClass(), "totalAdvancedSync", -1592022320);
        setIntField(term207459, term207459.getClass(), "totalExpertSync", -1743070082);
        setIntField(term207459, term207459.getClass(), "totalMasterSync", -1196577732);
        setIntField(term207459, term207459.getClass(), "totalReMasterSync", 658985528);
        setLongField(term207459, term207459.getClass(), "totalAchievement", -1412419717013452103L);
        setLongField(term207459, term207459.getClass(), "totalBasicAchievement", -1656688279009509497L);
        setLongField(term207459, term207459.getClass(), "totalAdvancedAchievement", 4646436806504898616L);
        setLongField(term207459, term207459.getClass(), "totalExpertAchievement", -1312205360267418697L);
        setLongField(term207459, term207459.getClass(), "totalMasterAchievement", 5106675463767553325L);
        setLongField(term207459, term207459.getClass(), "totalReMasterAchievement", -8630078807258379510L);
        setLongField(term207459, term207459.getClass(), "playerOldRating", -7789153659686320993L);
        setLongField(term207459, term207459.getClass(), "playerNewRating", 2965330256979714872L);
        setIntField(term207459, term207459.getClass(), "banState", -514950354);
        setLongField(term207459, term207459.getClass(), "dateTime", 4448036272888742346L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayCount", argTypes, term207459, args);
    }

};


