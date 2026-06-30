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

public class UserCharge_setChargeId_18479488129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126444;
     Object term126835;

    public UserCharge_setChargeId_18479488129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term126450 = new Long(-1885698929232124806L);
        Integer term126513 = new Integer(-21429773);
        Integer term126515 = new Integer(1774728742);
        Integer term126517 = new Integer(-1822211508);
        Integer term126519 = new Integer(-177243872);
        Integer term126521 = new Integer(1485047282);
        Integer term126523 = new Integer(1624190794);
        Integer term126525 = new Integer(-773608881);
        ArrayList term126511 = new ArrayList();
        ((ArrayList) term126511).add(term126513);
        ((ArrayList) term126511).add(term126515);
        ((ArrayList) term126511).add(term126517);
        ((ArrayList) term126511).add(term126519);
        ((ArrayList) term126511).add(term126521);
        ((ArrayList) term126511).add(term126523);
        ((ArrayList) term126511).add(term126525);
        Integer term126531 = new Integer(-1642688455);
        Integer term126533 = new Integer(-1184558215);
        Integer term126535 = new Integer(2123688338);
        Integer term126537 = new Integer(-1051941387);
        Integer term126539 = new Integer(-640763660);
        ArrayList term126529 = new ArrayList();
        ((ArrayList) term126529).add(term126531);
        ((ArrayList) term126529).add(term126533);
        ((ArrayList) term126529).add(term126535);
        ((ArrayList) term126529).add(term126537);
        ((ArrayList) term126529).add(term126539);
        term126444 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCharge"));
        Object term126446 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term126448 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term126464 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term126465 = newInstance(Class.forName("java.time.LocalDate"));
        Object term126469 = newInstance(Class.forName("java.time.LocalTime"));
        Object term126474 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term126475 = newInstance(Class.forName("java.time.LocalDate"));
        Object term126479 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term126444, term126444.getClass(), "id", 2264889560960513145L);
        setLongField(term126446, term126446.getClass(), "id", 3620836361287844637L);
        setLongField(term126448, term126448.getClass(), "id", 2491904753526916872L);
        setField(term126448, term126448.getClass(), "extId", term126450);
        setField(term126448, term126448.getClass(), "luid", "RzzlJFJcij");
        setIntField(term126465, term126465.getClass(), "year", 2026);
        setShortField(term126465, term126465.getClass(), "month", (short) 9);
        setShortField(term126465, term126465.getClass(), "day", (short) 22);
        setField(term126464, term126464.getClass(), "date", term126465);
        setByteField(term126469, term126469.getClass(), "hour", (byte) 22);
        setByteField(term126469, term126469.getClass(), "minute", (byte) 25);
        setByteField(term126469, term126469.getClass(), "second", (byte) 25);
        setIntField(term126469, term126469.getClass(), "nano", 526433618);
        setField(term126464, term126464.getClass(), "time", term126469);
        setField(term126448, term126448.getClass(), "registerTime", term126464);
        setIntField(term126475, term126475.getClass(), "year", 2017);
        setShortField(term126475, term126475.getClass(), "month", (short) 8);
        setShortField(term126475, term126475.getClass(), "day", (short) 11);
        setField(term126474, term126474.getClass(), "date", term126475);
        setByteField(term126479, term126479.getClass(), "hour", (byte) 0);
        setByteField(term126479, term126479.getClass(), "minute", (byte) 12);
        setByteField(term126479, term126479.getClass(), "second", (byte) 8);
        setIntField(term126479, term126479.getClass(), "nano", 421599135);
        setField(term126474, term126474.getClass(), "time", term126479);
        setField(term126448, term126448.getClass(), "accessTime", term126474);
        setField(term126446, term126446.getClass(), "card", term126448);
        setField(term126446, term126446.getClass(), "userName", "eADknKlQVd");
        setIntField(term126446, term126446.getClass(), "isNetMember", -1482676874);
        setIntField(term126446, term126446.getClass(), "iconId", -1157428137);
        setIntField(term126446, term126446.getClass(), "plateId", 1937997872);
        setIntField(term126446, term126446.getClass(), "titleId", -1961074437);
        setIntField(term126446, term126446.getClass(), "partnerId", 2132751608);
        setIntField(term126446, term126446.getClass(), "frameId", -739046971);
        setIntField(term126446, term126446.getClass(), "selectMapId", 1735844763);
        setIntField(term126446, term126446.getClass(), "totalAwake", -1276527088);
        setIntField(term126446, term126446.getClass(), "gradeRating", -1354264089);
        setIntField(term126446, term126446.getClass(), "musicRating", -2041515106);
        setIntField(term126446, term126446.getClass(), "playerRating", 699571489);
        setIntField(term126446, term126446.getClass(), "highestRating", 2067513821);
        setIntField(term126446, term126446.getClass(), "gradeRank", 1556440556);
        setIntField(term126446, term126446.getClass(), "classRank", -436359872);
        setIntField(term126446, term126446.getClass(), "courseRank", -1959666038);
        setField(term126446, term126446.getClass(), "charaSlot", term126511);
        setField(term126446, term126446.getClass(), "charaLockSlot", term126529);
        setLongField(term126446, term126446.getClass(), "contentBit", -6367340974615807088L);
        setIntField(term126446, term126446.getClass(), "playCount", 2128660618);
        setField(term126446, term126446.getClass(), "eventWatchedDate", "hfwLnDHizJ");
        setField(term126446, term126446.getClass(), "lastGameId", "eZGPUdohTF");
        setField(term126446, term126446.getClass(), "lastRomVersion", "NyINyLwoLC");
        setField(term126446, term126446.getClass(), "lastDataVersion", "VdHJiosxsv");
        setField(term126446, term126446.getClass(), "lastLoginDate", "wOuPdBQeOx");
        setField(term126446, term126446.getClass(), "lastPlayDate", "qKKlbLWTDU");
        setIntField(term126446, term126446.getClass(), "lastPlayCredit", -1354012258);
        setIntField(term126446, term126446.getClass(), "lastPlayMode", -734919944);
        setIntField(term126446, term126446.getClass(), "lastPlaceId", -91371563);
        setField(term126446, term126446.getClass(), "lastPlaceName", "vtiTWIgEVa");
        setIntField(term126446, term126446.getClass(), "lastAllNetId", 4662703);
        setIntField(term126446, term126446.getClass(), "lastRegionId", -2118566618);
        setField(term126446, term126446.getClass(), "lastRegionName", "eLERRBMHza");
        setField(term126446, term126446.getClass(), "lastClientId", "nNDwdMSbzC");
        setField(term126446, term126446.getClass(), "lastCountryCode", "cIeVoTDYCV");
        setIntField(term126446, term126446.getClass(), "lastSelectEMoney", 1655029720);
        setIntField(term126446, term126446.getClass(), "lastSelectTicket", -793892224);
        setIntField(term126446, term126446.getClass(), "lastSelectCourse", 1440702542);
        setIntField(term126446, term126446.getClass(), "lastCountCourse", -943970524);
        setField(term126446, term126446.getClass(), "firstGameId", "zHjWGfGucL");
        setField(term126446, term126446.getClass(), "firstRomVersion", "BrQDOXlSKX");
        setField(term126446, term126446.getClass(), "firstDataVersion", "rqZXFCcyZu");
        setField(term126446, term126446.getClass(), "firstPlayDate", "rGcDZdOanr");
        setField(term126446, term126446.getClass(), "compatibleCmVersion", "qlnQoljKQM");
        setField(term126446, term126446.getClass(), "dailyBonusDate", "RMEDwLGQoG");
        setField(term126446, term126446.getClass(), "dailyCourseBonusDate", "wZEFxRSqVY");
        setField(term126446, term126446.getClass(), "lastPairLoginDate", "tHcDbcviFO");
        setField(term126446, term126446.getClass(), "lastTrialPlayDate", "cmEWCrpoCO");
        setIntField(term126446, term126446.getClass(), "playVsCount", 917621965);
        setIntField(term126446, term126446.getClass(), "playSyncCount", 749518086);
        setIntField(term126446, term126446.getClass(), "winCount", -1596868093);
        setIntField(term126446, term126446.getClass(), "helpCount", -1081975340);
        setIntField(term126446, term126446.getClass(), "comboCount", 1804381424);
        setLongField(term126446, term126446.getClass(), "totalDeluxscore", -3661358124870959771L);
        setLongField(term126446, term126446.getClass(), "totalBasicDeluxscore", -8120684450443636180L);
        setLongField(term126446, term126446.getClass(), "totalAdvancedDeluxscore", -1038564761233966381L);
        setLongField(term126446, term126446.getClass(), "totalExpertDeluxscore", 3017351470610010745L);
        setLongField(term126446, term126446.getClass(), "totalMasterDeluxscore", -8471313227858030061L);
        setLongField(term126446, term126446.getClass(), "totalReMasterDeluxscore", -8456017519174078137L);
        setIntField(term126446, term126446.getClass(), "totalSync", 347701928);
        setIntField(term126446, term126446.getClass(), "totalBasicSync", -1540852359);
        setIntField(term126446, term126446.getClass(), "totalAdvancedSync", 351747692);
        setIntField(term126446, term126446.getClass(), "totalExpertSync", 1960962844);
        setIntField(term126446, term126446.getClass(), "totalMasterSync", 1500998512);
        setIntField(term126446, term126446.getClass(), "totalReMasterSync", -961310688);
        setLongField(term126446, term126446.getClass(), "totalAchievement", -361646163347941624L);
        setLongField(term126446, term126446.getClass(), "totalBasicAchievement", -4370032684615634699L);
        setLongField(term126446, term126446.getClass(), "totalAdvancedAchievement", -7192603380963907943L);
        setLongField(term126446, term126446.getClass(), "totalExpertAchievement", 1063278168782243311L);
        setLongField(term126446, term126446.getClass(), "totalMasterAchievement", -393164980593030950L);
        setLongField(term126446, term126446.getClass(), "totalReMasterAchievement", -9067010856580120712L);
        setLongField(term126446, term126446.getClass(), "playerOldRating", 4155363879463850350L);
        setLongField(term126446, term126446.getClass(), "playerNewRating", 6434875741131536553L);
        setIntField(term126446, term126446.getClass(), "banState", -1837033783);
        setLongField(term126446, term126446.getClass(), "dateTime", -5724018285837180378L);
        setField(term126444, term126444.getClass(), "user", term126446);
        setIntField(term126444, term126444.getClass(), "chargeId", -33928000);
        setIntField(term126444, term126444.getClass(), "stock", 1798598770);
        setField(term126444, term126444.getClass(), "purchaseDate", "OApdoCtolu");
        setField(term126444, term126444.getClass(), "validDate", "ONkDXTThKL");
        term126835 = new Integer(1275192092);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCharge");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term126835;
        callMethod(klass, "setChargeId", argTypes, term126444, args);
    }

};


