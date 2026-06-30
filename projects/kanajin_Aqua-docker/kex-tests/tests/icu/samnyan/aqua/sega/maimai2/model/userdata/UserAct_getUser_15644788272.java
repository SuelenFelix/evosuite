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

public class UserAct_getUser_15644788272 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1140;

    public UserAct_getUser_15644788272() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1146 = new Long(-8257434502486459194L);
        Integer term1209 = new Integer(-1685132342);
        ArrayList term1207 = new ArrayList();
        ((ArrayList) term1207).add(term1209);
        Integer term1215 = new Integer(-1456670397);
        Integer term1217 = new Integer(1622346318);
        Integer term1219 = new Integer(1048535127);
        Integer term1221 = new Integer(-655067527);
        Integer term1223 = new Integer(-6029667);
        Integer term1225 = new Integer(-2068769794);
        ArrayList term1213 = new ArrayList();
        ((ArrayList) term1213).add(term1215);
        ((ArrayList) term1213).add(term1217);
        ((ArrayList) term1213).add(term1219);
        ((ArrayList) term1213).add(term1221);
        ((ArrayList) term1213).add(term1223);
        ((ArrayList) term1213).add(term1225);
        term1140 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserAct"));
        Object term1142 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term1144 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term1160 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1161 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1165 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1170 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1171 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1175 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term1140, term1140.getClass(), "id", -8708192233349544946L);
        setLongField(term1142, term1142.getClass(), "id", 5907001541142728739L);
        setLongField(term1144, term1144.getClass(), "id", 4178434741742309755L);
        setField(term1144, term1144.getClass(), "extId", term1146);
        setField(term1144, term1144.getClass(), "luid", "gGSMzuGICf");
        setIntField(term1161, term1161.getClass(), "year", 2022);
        setShortField(term1161, term1161.getClass(), "month", (short) 2);
        setShortField(term1161, term1161.getClass(), "day", (short) 26);
        setField(term1160, term1160.getClass(), "date", term1161);
        setByteField(term1165, term1165.getClass(), "hour", (byte) 11);
        setByteField(term1165, term1165.getClass(), "minute", (byte) 42);
        setByteField(term1165, term1165.getClass(), "second", (byte) 15);
        setIntField(term1165, term1165.getClass(), "nano", 377731937);
        setField(term1160, term1160.getClass(), "time", term1165);
        setField(term1144, term1144.getClass(), "registerTime", term1160);
        setIntField(term1171, term1171.getClass(), "year", 2026);
        setShortField(term1171, term1171.getClass(), "month", (short) 12);
        setShortField(term1171, term1171.getClass(), "day", (short) 14);
        setField(term1170, term1170.getClass(), "date", term1171);
        setByteField(term1175, term1175.getClass(), "hour", (byte) 16);
        setByteField(term1175, term1175.getClass(), "minute", (byte) 34);
        setByteField(term1175, term1175.getClass(), "second", (byte) 9);
        setIntField(term1175, term1175.getClass(), "nano", 518326996);
        setField(term1170, term1170.getClass(), "time", term1175);
        setField(term1144, term1144.getClass(), "accessTime", term1170);
        setField(term1142, term1142.getClass(), "card", term1144);
        setField(term1142, term1142.getClass(), "userName", "hxCBltsObl");
        setIntField(term1142, term1142.getClass(), "isNetMember", 972867650);
        setIntField(term1142, term1142.getClass(), "iconId", 1655935355);
        setIntField(term1142, term1142.getClass(), "plateId", -481533957);
        setIntField(term1142, term1142.getClass(), "titleId", 1240914516);
        setIntField(term1142, term1142.getClass(), "partnerId", -1465035361);
        setIntField(term1142, term1142.getClass(), "frameId", 1090617576);
        setIntField(term1142, term1142.getClass(), "selectMapId", -1547384488);
        setIntField(term1142, term1142.getClass(), "totalAwake", 1442160736);
        setIntField(term1142, term1142.getClass(), "gradeRating", 1114000454);
        setIntField(term1142, term1142.getClass(), "musicRating", -556405712);
        setIntField(term1142, term1142.getClass(), "playerRating", -1772434990);
        setIntField(term1142, term1142.getClass(), "highestRating", -1845499264);
        setIntField(term1142, term1142.getClass(), "gradeRank", -505439934);
        setIntField(term1142, term1142.getClass(), "classRank", -344842608);
        setIntField(term1142, term1142.getClass(), "courseRank", 941650513);
        setField(term1142, term1142.getClass(), "charaSlot", term1207);
        setField(term1142, term1142.getClass(), "charaLockSlot", term1213);
        setLongField(term1142, term1142.getClass(), "contentBit", -2068172595987555756L);
        setIntField(term1142, term1142.getClass(), "playCount", 444029505);
        setField(term1142, term1142.getClass(), "eventWatchedDate", "BndsHwAFMv");
        setField(term1142, term1142.getClass(), "lastGameId", "GzFkzHGYFt");
        setField(term1142, term1142.getClass(), "lastRomVersion", "tShwQLRGNe");
        setField(term1142, term1142.getClass(), "lastDataVersion", "LvtrsXUliU");
        setField(term1142, term1142.getClass(), "lastLoginDate", "xLbjWUgOIL");
        setField(term1142, term1142.getClass(), "lastPlayDate", "jDtqGUpnZN");
        setIntField(term1142, term1142.getClass(), "lastPlayCredit", -1034506028);
        setIntField(term1142, term1142.getClass(), "lastPlayMode", -1263114719);
        setIntField(term1142, term1142.getClass(), "lastPlaceId", -894662986);
        setField(term1142, term1142.getClass(), "lastPlaceName", "nGKItKLYNC");
        setIntField(term1142, term1142.getClass(), "lastAllNetId", 304775596);
        setIntField(term1142, term1142.getClass(), "lastRegionId", -1347665717);
        setField(term1142, term1142.getClass(), "lastRegionName", "UiUYnPrcCi");
        setField(term1142, term1142.getClass(), "lastClientId", "UoYtihxVaS");
        setField(term1142, term1142.getClass(), "lastCountryCode", "JDswTTCZHV");
        setIntField(term1142, term1142.getClass(), "lastSelectEMoney", -1888585309);
        setIntField(term1142, term1142.getClass(), "lastSelectTicket", 683666002);
        setIntField(term1142, term1142.getClass(), "lastSelectCourse", 1596213415);
        setIntField(term1142, term1142.getClass(), "lastCountCourse", -268815336);
        setField(term1142, term1142.getClass(), "firstGameId", "onpbIeEKoi");
        setField(term1142, term1142.getClass(), "firstRomVersion", "YRHGsAkhxb");
        setField(term1142, term1142.getClass(), "firstDataVersion", "ffYhPOzlUs");
        setField(term1142, term1142.getClass(), "firstPlayDate", "MLqYREekMl");
        setField(term1142, term1142.getClass(), "compatibleCmVersion", "ytSBIKXogI");
        setField(term1142, term1142.getClass(), "dailyBonusDate", "nHXjMycHlU");
        setField(term1142, term1142.getClass(), "dailyCourseBonusDate", "ieCtQFdkii");
        setField(term1142, term1142.getClass(), "lastPairLoginDate", "dEnhdmILtU");
        setField(term1142, term1142.getClass(), "lastTrialPlayDate", "hoicvmsovO");
        setIntField(term1142, term1142.getClass(), "playVsCount", -1210583429);
        setIntField(term1142, term1142.getClass(), "playSyncCount", -663691365);
        setIntField(term1142, term1142.getClass(), "winCount", 339854490);
        setIntField(term1142, term1142.getClass(), "helpCount", -615654495);
        setIntField(term1142, term1142.getClass(), "comboCount", -1476117762);
        setLongField(term1142, term1142.getClass(), "totalDeluxscore", -6292278961887936280L);
        setLongField(term1142, term1142.getClass(), "totalBasicDeluxscore", -6645965768855543712L);
        setLongField(term1142, term1142.getClass(), "totalAdvancedDeluxscore", 4784595517102746672L);
        setLongField(term1142, term1142.getClass(), "totalExpertDeluxscore", -7612550318181586304L);
        setLongField(term1142, term1142.getClass(), "totalMasterDeluxscore", -2170847986967241072L);
        setLongField(term1142, term1142.getClass(), "totalReMasterDeluxscore", 4044358158040652353L);
        setIntField(term1142, term1142.getClass(), "totalSync", -341962980);
        setIntField(term1142, term1142.getClass(), "totalBasicSync", 1532716628);
        setIntField(term1142, term1142.getClass(), "totalAdvancedSync", -1801760683);
        setIntField(term1142, term1142.getClass(), "totalExpertSync", 1141317871);
        setIntField(term1142, term1142.getClass(), "totalMasterSync", 890669485);
        setIntField(term1142, term1142.getClass(), "totalReMasterSync", 691577392);
        setLongField(term1142, term1142.getClass(), "totalAchievement", -4443169559037975007L);
        setLongField(term1142, term1142.getClass(), "totalBasicAchievement", -3842548265506930260L);
        setLongField(term1142, term1142.getClass(), "totalAdvancedAchievement", -5788180182343976541L);
        setLongField(term1142, term1142.getClass(), "totalExpertAchievement", 2936323121573284007L);
        setLongField(term1142, term1142.getClass(), "totalMasterAchievement", -1154553077993834885L);
        setLongField(term1142, term1142.getClass(), "totalReMasterAchievement", -2850532706972744550L);
        setLongField(term1142, term1142.getClass(), "playerOldRating", -2644215923136513282L);
        setLongField(term1142, term1142.getClass(), "playerNewRating", -1468719814009985452L);
        setIntField(term1142, term1142.getClass(), "banState", -893623680);
        setLongField(term1142, term1142.getClass(), "dateTime", -7738503207562305297L);
        setField(term1140, term1140.getClass(), "user", term1142);
        setIntField(term1140, term1140.getClass(), "kind", -1963434938);
        setIntField(term1140, term1140.getClass(), "activityId", 906181092);
        setLongField(term1140, term1140.getClass(), "sortNumber", 3825396310311739952L);
        setIntField(term1140, term1140.getClass(), "param1", 1045657203);
        setIntField(term1140, term1140.getClass(), "param2", 1386130016);
        setIntField(term1140, term1140.getClass(), "param3", 1072005683);
        setIntField(term1140, term1140.getClass(), "param4", 1861318859);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserAct");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term1140, args);
    }

};


