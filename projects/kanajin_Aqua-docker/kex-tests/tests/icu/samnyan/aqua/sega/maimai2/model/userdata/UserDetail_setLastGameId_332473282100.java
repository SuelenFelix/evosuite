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

public class UserDetail_setLastGameId_332473282100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4286355;

    public UserDetail_setLastGameId_332473282100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4286359 = new Long(3839192148499886301L);
        Integer term4286422 = new Integer(152298427);
        Integer term4286424 = new Integer(450778931);
        Integer term4286426 = new Integer(-1482855200);
        Integer term4286428 = new Integer(1147113614);
        ArrayList term4286420 = new ArrayList();
        ((ArrayList) term4286420).add(term4286422);
        ((ArrayList) term4286420).add(term4286424);
        ((ArrayList) term4286420).add(term4286426);
        ((ArrayList) term4286420).add(term4286428);
        Integer term4286434 = new Integer(-243254772);
        Integer term4286436 = new Integer(-1721895188);
        Integer term4286438 = new Integer(1090061150);
        Integer term4286440 = new Integer(-1849804262);
        ArrayList term4286432 = new ArrayList();
        ((ArrayList) term4286432).add(term4286434);
        ((ArrayList) term4286432).add(term4286436);
        ((ArrayList) term4286432).add(term4286438);
        ((ArrayList) term4286432).add(term4286440);
        term4286355 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4286357 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4286373 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4286374 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4286378 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4286383 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4286384 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4286388 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4286355, term4286355.getClass(), "id", -1013222441356898985L);
        setLongField(term4286357, term4286357.getClass(), "id", -3251199541884950375L);
        setField(term4286357, term4286357.getClass(), "extId", term4286359);
        setField(term4286357, term4286357.getClass(), "luid", "QJwTFSURwr");
        setIntField(term4286374, term4286374.getClass(), "year", 2017);
        setShortField(term4286374, term4286374.getClass(), "month", (short) 2);
        setShortField(term4286374, term4286374.getClass(), "day", (short) 9);
        setField(term4286373, term4286373.getClass(), "date", term4286374);
        setByteField(term4286378, term4286378.getClass(), "hour", (byte) 4);
        setByteField(term4286378, term4286378.getClass(), "minute", (byte) 40);
        setByteField(term4286378, term4286378.getClass(), "second", (byte) 59);
        setIntField(term4286378, term4286378.getClass(), "nano", 314095952);
        setField(term4286373, term4286373.getClass(), "time", term4286378);
        setField(term4286357, term4286357.getClass(), "registerTime", term4286373);
        setIntField(term4286384, term4286384.getClass(), "year", 2023);
        setShortField(term4286384, term4286384.getClass(), "month", (short) 4);
        setShortField(term4286384, term4286384.getClass(), "day", (short) 6);
        setField(term4286383, term4286383.getClass(), "date", term4286384);
        setByteField(term4286388, term4286388.getClass(), "hour", (byte) 15);
        setByteField(term4286388, term4286388.getClass(), "minute", (byte) 19);
        setByteField(term4286388, term4286388.getClass(), "second", (byte) 19);
        setIntField(term4286388, term4286388.getClass(), "nano", 749316782);
        setField(term4286383, term4286383.getClass(), "time", term4286388);
        setField(term4286357, term4286357.getClass(), "accessTime", term4286383);
        setField(term4286355, term4286355.getClass(), "card", term4286357);
        setField(term4286355, term4286355.getClass(), "userName", "IUhXziXPId");
        setIntField(term4286355, term4286355.getClass(), "isNetMember", 529280542);
        setIntField(term4286355, term4286355.getClass(), "iconId", -497247063);
        setIntField(term4286355, term4286355.getClass(), "plateId", -505867842);
        setIntField(term4286355, term4286355.getClass(), "titleId", 1659382454);
        setIntField(term4286355, term4286355.getClass(), "partnerId", -68812667);
        setIntField(term4286355, term4286355.getClass(), "frameId", -2000218472);
        setIntField(term4286355, term4286355.getClass(), "selectMapId", 1311152206);
        setIntField(term4286355, term4286355.getClass(), "totalAwake", 196209345);
        setIntField(term4286355, term4286355.getClass(), "gradeRating", 926645453);
        setIntField(term4286355, term4286355.getClass(), "musicRating", -1881967222);
        setIntField(term4286355, term4286355.getClass(), "playerRating", 2098521920);
        setIntField(term4286355, term4286355.getClass(), "highestRating", 48965362);
        setIntField(term4286355, term4286355.getClass(), "gradeRank", 1287132157);
        setIntField(term4286355, term4286355.getClass(), "classRank", -2007338015);
        setIntField(term4286355, term4286355.getClass(), "courseRank", -1914887702);
        setField(term4286355, term4286355.getClass(), "charaSlot", term4286420);
        setField(term4286355, term4286355.getClass(), "charaLockSlot", term4286432);
        setLongField(term4286355, term4286355.getClass(), "contentBit", -6708850843062691735L);
        setIntField(term4286355, term4286355.getClass(), "playCount", -1330665243);
        setField(term4286355, term4286355.getClass(), "eventWatchedDate", "onUDjqBrlh");
        setField(term4286355, term4286355.getClass(), "lastGameId", "aHufYrMSBf");
        setField(term4286355, term4286355.getClass(), "lastRomVersion", "GizgezbzPm");
        setField(term4286355, term4286355.getClass(), "lastDataVersion", "lxmdRFpfQB");
        setField(term4286355, term4286355.getClass(), "lastLoginDate", "NzplpkRiHX");
        setField(term4286355, term4286355.getClass(), "lastPlayDate", "yFJfRIkVdG");
        setIntField(term4286355, term4286355.getClass(), "lastPlayCredit", 1411784169);
        setIntField(term4286355, term4286355.getClass(), "lastPlayMode", 1474125648);
        setIntField(term4286355, term4286355.getClass(), "lastPlaceId", -1539234631);
        setField(term4286355, term4286355.getClass(), "lastPlaceName", "vvJIPOIpIE");
        setIntField(term4286355, term4286355.getClass(), "lastAllNetId", 729338635);
        setIntField(term4286355, term4286355.getClass(), "lastRegionId", 246861786);
        setField(term4286355, term4286355.getClass(), "lastRegionName", "XCbtHniPZJ");
        setField(term4286355, term4286355.getClass(), "lastClientId", "ChQAgpXSMp");
        setField(term4286355, term4286355.getClass(), "lastCountryCode", "ATeXNQmNVH");
        setIntField(term4286355, term4286355.getClass(), "lastSelectEMoney", -395217745);
        setIntField(term4286355, term4286355.getClass(), "lastSelectTicket", -1011739016);
        setIntField(term4286355, term4286355.getClass(), "lastSelectCourse", 280793754);
        setIntField(term4286355, term4286355.getClass(), "lastCountCourse", -1795131027);
        setField(term4286355, term4286355.getClass(), "firstGameId", "nBztBHEnxJ");
        setField(term4286355, term4286355.getClass(), "firstRomVersion", "fzyAqDdoPA");
        setField(term4286355, term4286355.getClass(), "firstDataVersion", "MKtYdGJOHg");
        setField(term4286355, term4286355.getClass(), "firstPlayDate", "VgTQgbtqhX");
        setField(term4286355, term4286355.getClass(), "compatibleCmVersion", "tVaadwFqRB");
        setField(term4286355, term4286355.getClass(), "dailyBonusDate", "OnaiffoTJe");
        setField(term4286355, term4286355.getClass(), "dailyCourseBonusDate", "yGoTUAzMpY");
        setField(term4286355, term4286355.getClass(), "lastPairLoginDate", "hmnlYQVJEu");
        setField(term4286355, term4286355.getClass(), "lastTrialPlayDate", "rYcvFQuMyi");
        setIntField(term4286355, term4286355.getClass(), "playVsCount", -2098944750);
        setIntField(term4286355, term4286355.getClass(), "playSyncCount", 1081625042);
        setIntField(term4286355, term4286355.getClass(), "winCount", -449512252);
        setIntField(term4286355, term4286355.getClass(), "helpCount", -1331090501);
        setIntField(term4286355, term4286355.getClass(), "comboCount", -1681844201);
        setLongField(term4286355, term4286355.getClass(), "totalDeluxscore", -8784658720924267591L);
        setLongField(term4286355, term4286355.getClass(), "totalBasicDeluxscore", -7222843922907635981L);
        setLongField(term4286355, term4286355.getClass(), "totalAdvancedDeluxscore", 2929659193046158178L);
        setLongField(term4286355, term4286355.getClass(), "totalExpertDeluxscore", 6630685869977486388L);
        setLongField(term4286355, term4286355.getClass(), "totalMasterDeluxscore", 5292699069614829032L);
        setLongField(term4286355, term4286355.getClass(), "totalReMasterDeluxscore", -2793403264710399131L);
        setIntField(term4286355, term4286355.getClass(), "totalSync", 783889173);
        setIntField(term4286355, term4286355.getClass(), "totalBasicSync", 1038617386);
        setIntField(term4286355, term4286355.getClass(), "totalAdvancedSync", -1695404358);
        setIntField(term4286355, term4286355.getClass(), "totalExpertSync", 810942335);
        setIntField(term4286355, term4286355.getClass(), "totalMasterSync", 1371567672);
        setIntField(term4286355, term4286355.getClass(), "totalReMasterSync", -1467339885);
        setLongField(term4286355, term4286355.getClass(), "totalAchievement", 8791134030260704286L);
        setLongField(term4286355, term4286355.getClass(), "totalBasicAchievement", 1247322698731722969L);
        setLongField(term4286355, term4286355.getClass(), "totalAdvancedAchievement", 274966982514538782L);
        setLongField(term4286355, term4286355.getClass(), "totalExpertAchievement", 3048910414310736223L);
        setLongField(term4286355, term4286355.getClass(), "totalMasterAchievement", 3599948304915458633L);
        setLongField(term4286355, term4286355.getClass(), "totalReMasterAchievement", -7234199506576528406L);
        setLongField(term4286355, term4286355.getClass(), "playerOldRating", -3578280144902751348L);
        setLongField(term4286355, term4286355.getClass(), "playerNewRating", -8168295485159470732L);
        setIntField(term4286355, term4286355.getClass(), "banState", 230353122);
        setLongField(term4286355, term4286355.getClass(), "dateTime", -7301401964131533851L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ZIsDFYVfaE";
        callMethod(klass, "setLastGameId", argTypes, term4286355, args);
    }

};


