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

public class UserAct_setActivityId_13844603713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8021;
     Object term8387;

    public UserAct_setActivityId_13844603713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term8027 = new Long(-5476826692763582090L);
        Integer term8090 = new Integer(1532716628);
        Integer term8092 = new Integer(-1801760683);
        Integer term8094 = new Integer(1141317871);
        Integer term8096 = new Integer(890669485);
        Integer term8098 = new Integer(691577392);
        Integer term8100 = new Integer(-893623680);
        Integer term8102 = new Integer(-1963434938);
        ArrayList term8088 = new ArrayList();
        ((ArrayList) term8088).add(term8090);
        ((ArrayList) term8088).add(term8092);
        ((ArrayList) term8088).add(term8094);
        ((ArrayList) term8088).add(term8096);
        ((ArrayList) term8088).add(term8098);
        ((ArrayList) term8088).add(term8100);
        ((ArrayList) term8088).add(term8102);
        Integer term8108 = new Integer(906181092);
        Integer term8110 = new Integer(1045657203);
        ArrayList term8106 = new ArrayList();
        ((ArrayList) term8106).add(term8108);
        ((ArrayList) term8106).add(term8110);
        term8021 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserAct"));
        Object term8023 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term8025 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term8041 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8042 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8046 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8051 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8052 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8056 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term8021, term8021.getClass(), "id", 3713624957161771816L);
        setLongField(term8023, term8023.getClass(), "id", 6130232388739280211L);
        setLongField(term8025, term8025.getClass(), "id", 3423965054378869855L);
        setField(term8025, term8025.getClass(), "extId", term8027);
        setField(term8025, term8025.getClass(), "luid", "DIbeDHICho");
        setIntField(term8042, term8042.getClass(), "year", 2021);
        setShortField(term8042, term8042.getClass(), "month", (short) 8);
        setShortField(term8042, term8042.getClass(), "day", (short) 12);
        setField(term8041, term8041.getClass(), "date", term8042);
        setByteField(term8046, term8046.getClass(), "hour", (byte) 2);
        setByteField(term8046, term8046.getClass(), "minute", (byte) 17);
        setByteField(term8046, term8046.getClass(), "second", (byte) 51);
        setIntField(term8046, term8046.getClass(), "nano", 207375141);
        setField(term8041, term8041.getClass(), "time", term8046);
        setField(term8025, term8025.getClass(), "registerTime", term8041);
        setIntField(term8052, term8052.getClass(), "year", 2025);
        setShortField(term8052, term8052.getClass(), "month", (short) 11);
        setShortField(term8052, term8052.getClass(), "day", (short) 3);
        setField(term8051, term8051.getClass(), "date", term8052);
        setByteField(term8056, term8056.getClass(), "hour", (byte) 21);
        setByteField(term8056, term8056.getClass(), "minute", (byte) 24);
        setByteField(term8056, term8056.getClass(), "second", (byte) 23);
        setIntField(term8056, term8056.getClass(), "nano", 210986721);
        setField(term8051, term8051.getClass(), "time", term8056);
        setField(term8025, term8025.getClass(), "accessTime", term8051);
        setField(term8023, term8023.getClass(), "card", term8025);
        setField(term8023, term8023.getClass(), "userName", "dJGPlmSRnz");
        setIntField(term8023, term8023.getClass(), "isNetMember", 299791142);
        setIntField(term8023, term8023.getClass(), "iconId", 1862191391);
        setIntField(term8023, term8023.getClass(), "plateId", 1131398807);
        setIntField(term8023, term8023.getClass(), "titleId", -344907703);
        setIntField(term8023, term8023.getClass(), "partnerId", 824341437);
        setIntField(term8023, term8023.getClass(), "frameId", -1794965320);
        setIntField(term8023, term8023.getClass(), "selectMapId", 520504102);
        setIntField(term8023, term8023.getClass(), "totalAwake", -457396133);
        setIntField(term8023, term8023.getClass(), "gradeRating", -1793950607);
        setIntField(term8023, term8023.getClass(), "musicRating", 1091954101);
        setIntField(term8023, term8023.getClass(), "playerRating", 1895143076);
        setIntField(term8023, term8023.getClass(), "highestRating", 1981860404);
        setIntField(term8023, term8023.getClass(), "gradeRank", 732174235);
        setIntField(term8023, term8023.getClass(), "classRank", 470895808);
        setIntField(term8023, term8023.getClass(), "courseRank", 1787325291);
        setField(term8023, term8023.getClass(), "charaSlot", term8088);
        setField(term8023, term8023.getClass(), "charaLockSlot", term8106);
        setLongField(term8023, term8023.getClass(), "contentBit", -593735869267672817L);
        setIntField(term8023, term8023.getClass(), "playCount", 1470349147);
        setField(term8023, term8023.getClass(), "eventWatchedDate", "DPskuFUobI");
        setField(term8023, term8023.getClass(), "lastGameId", "wBGfLpNNiZ");
        setField(term8023, term8023.getClass(), "lastRomVersion", "yUGCjlqgJE");
        setField(term8023, term8023.getClass(), "lastDataVersion", "PXdVZyoJyC");
        setField(term8023, term8023.getClass(), "lastLoginDate", "vLerpqavFM");
        setField(term8023, term8023.getClass(), "lastPlayDate", "qnvxzwuGKX");
        setIntField(term8023, term8023.getClass(), "lastPlayCredit", -255317272);
        setIntField(term8023, term8023.getClass(), "lastPlayMode", -706253892);
        setIntField(term8023, term8023.getClass(), "lastPlaceId", -1341439819);
        setField(term8023, term8023.getClass(), "lastPlaceName", "EdPAvpluZg");
        setIntField(term8023, term8023.getClass(), "lastAllNetId", -728760750);
        setIntField(term8023, term8023.getClass(), "lastRegionId", -1617383807);
        setField(term8023, term8023.getClass(), "lastRegionName", "DzHVBMqWtE");
        setField(term8023, term8023.getClass(), "lastClientId", "THZSpzBRYP");
        setField(term8023, term8023.getClass(), "lastCountryCode", "ZfBIVGBQOE");
        setIntField(term8023, term8023.getClass(), "lastSelectEMoney", -1244386281);
        setIntField(term8023, term8023.getClass(), "lastSelectTicket", -885788574);
        setIntField(term8023, term8023.getClass(), "lastSelectCourse", -865722613);
        setIntField(term8023, term8023.getClass(), "lastCountCourse", -1551355284);
        setField(term8023, term8023.getClass(), "firstGameId", "QSrDQfEsTR");
        setField(term8023, term8023.getClass(), "firstRomVersion", "PsqusYmejD");
        setField(term8023, term8023.getClass(), "firstDataVersion", "NTWMiBEaDF");
        setField(term8023, term8023.getClass(), "firstPlayDate", "SPBstwKFVr");
        setField(term8023, term8023.getClass(), "compatibleCmVersion", "WxYUTuqmIq");
        setField(term8023, term8023.getClass(), "dailyBonusDate", "OeQLvhVERT");
        setField(term8023, term8023.getClass(), "dailyCourseBonusDate", "IlvgFINwIa");
        setField(term8023, term8023.getClass(), "lastPairLoginDate", "GEJABPlHSI");
        setField(term8023, term8023.getClass(), "lastTrialPlayDate", "aQFUvuaYxd");
        setIntField(term8023, term8023.getClass(), "playVsCount", -1381970335);
        setIntField(term8023, term8023.getClass(), "playSyncCount", 1213549815);
        setIntField(term8023, term8023.getClass(), "winCount", -1518419301);
        setIntField(term8023, term8023.getClass(), "helpCount", 674879025);
        setIntField(term8023, term8023.getClass(), "comboCount", -1538936030);
        setLongField(term8023, term8023.getClass(), "totalDeluxscore", 6041374912351843923L);
        setLongField(term8023, term8023.getClass(), "totalBasicDeluxscore", 2535970782317488741L);
        setLongField(term8023, term8023.getClass(), "totalAdvancedDeluxscore", -5258945362776941718L);
        setLongField(term8023, term8023.getClass(), "totalExpertDeluxscore", 24067105862153728L);
        setLongField(term8023, term8023.getClass(), "totalMasterDeluxscore", -8477368071089201577L);
        setLongField(term8023, term8023.getClass(), "totalReMasterDeluxscore", -1526729287349763895L);
        setIntField(term8023, term8023.getClass(), "totalSync", -752870423);
        setIntField(term8023, term8023.getClass(), "totalBasicSync", -1698809299);
        setIntField(term8023, term8023.getClass(), "totalAdvancedSync", 401512128);
        setIntField(term8023, term8023.getClass(), "totalExpertSync", -2069930777);
        setIntField(term8023, term8023.getClass(), "totalMasterSync", 1543696412);
        setIntField(term8023, term8023.getClass(), "totalReMasterSync", -1385748168);
        setLongField(term8023, term8023.getClass(), "totalAchievement", 7017605765544766728L);
        setLongField(term8023, term8023.getClass(), "totalBasicAchievement", -6078481855513028760L);
        setLongField(term8023, term8023.getClass(), "totalAdvancedAchievement", -6985556670871089725L);
        setLongField(term8023, term8023.getClass(), "totalExpertAchievement", -8469818909085103606L);
        setLongField(term8023, term8023.getClass(), "totalMasterAchievement", 11315815278355083L);
        setLongField(term8023, term8023.getClass(), "totalReMasterAchievement", 7735460540091431012L);
        setLongField(term8023, term8023.getClass(), "playerOldRating", 1346299551708610248L);
        setLongField(term8023, term8023.getClass(), "playerNewRating", -7191625829563442696L);
        setIntField(term8023, term8023.getClass(), "banState", -270592367);
        setLongField(term8023, term8023.getClass(), "dateTime", 1463379874413441830L);
        setField(term8021, term8021.getClass(), "user", term8023);
        setIntField(term8021, term8021.getClass(), "kind", 178847646);
        setIntField(term8021, term8021.getClass(), "activityId", 273590437);
        setLongField(term8021, term8021.getClass(), "sortNumber", 7998051124369147543L);
        setIntField(term8021, term8021.getClass(), "param1", -348612876);
        setIntField(term8021, term8021.getClass(), "param2", 1302807565);
        setIntField(term8021, term8021.getClass(), "param3", -838848221);
        setIntField(term8021, term8021.getClass(), "param4", 1163761623);
        term8387 = new Integer(718742281);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserAct");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term8387;
        callMethod(klass, "setActivityId", argTypes, term8021, args);
    }

};


